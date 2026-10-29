            package com.android.installreferrer.api;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.os.Bundle;
            import android.os.RemoteException;
            import com.android.installreferrer.commons.InstallReferrerCommons;
            import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
            import java.util.List;
            import p000.f42;
            
            /* JADX INFO: renamed from: com.android.installreferrer.api.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0226b extends InstallReferrerClient {

                /* JADX INFO: renamed from: a */
                public int f3038a = 0;

                /* JADX INFO: renamed from: b */
                public final Context f3039b;

                /* JADX INFO: renamed from: c */
                public IGetInstallReferrerService f3040c;

                /* JADX INFO: renamed from: d */
                public ServiceConnectionC0225a f3041d;

                public C0226b(Context context) {
/* 11 */            this.f3039b = context.getApplicationContext();
                }

                @Override // com.android.installreferrer.api.InstallReferrerClient
                public final void endConnection() {
/* 2 */             this.f3038a = 3;
/* 7 */             if (this.f3041d != null) {
/* 13 */                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
/* 20 */                this.f3039b.unbindService(this.f3041d);
/* 23 */                this.f3041d = null;
                    }
/* 25 */            this.f3040c = null;
                }

                @Override // com.android.installreferrer.api.InstallReferrerClient
                public final ReferrerDetails getInstallReferrer() throws RemoteException {
/* 5 */             if (!isReady()) {
/* 49 */                f42.m3656l("Service not connected. Please start a connection before using the service.");
/* 52 */                return null;
                    }
/* 9 */             Bundle bundle = new Bundle();
/* 20 */            bundle.putString("package_name", this.f3039b.getPackageName());
                    try {
/* 31 */                return new ReferrerDetails(this.f3040c.mo1902c(bundle));
                    } catch (RemoteException e) {
/* 40 */                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
/* 44 */                this.f3038a = 0;
/* 46 */                throw e;
                    }
                }

                @Override // com.android.installreferrer.api.InstallReferrerClient
                public final boolean isReady() {
                    return (this.f3038a != 2 || this.f3040c == null || this.f3041d == null) ? false : true;
                }

                @Override // com.android.installreferrer.api.InstallReferrerClient
                public final void startConnection(InstallReferrerStateListener installReferrerStateListener) {
                    ServiceInfo serviceInfo;
/* 8 */             if (isReady()) {
/* 12 */                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
/* 15 */                installReferrerStateListener.onInstallReferrerSetupFinished(0);
/* 18 */                return;
                    }
/* 19 */            int i = this.f3038a;
/* 23 */            if (i == 1) {
/* 27 */                InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
/* 30 */                installReferrerStateListener.onInstallReferrerSetupFinished(3);
/* 33 */                return;
                    }
/* 34 */            if (i == 3) {
/* 38 */                InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
/* 41 */                installReferrerStateListener.onInstallReferrerSetupFinished(3);
/* 44 */                return;
                    }
/* 47 */            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
/* 54 */            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
/* 66 */            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
/* 69 */            Context context = this.f3039b;
/* 75 */            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
/* 80 */            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
/* 185 */               this.f3038a = 0;
/* 189 */               InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
/* 192 */               installReferrerStateListener.onInstallReferrerSetupFinished(2);
/* 195 */               return;
                    }
/* 98 */            String str = serviceInfo.packageName;
/* 100 */           String str2 = serviceInfo.name;
/* 106 */           if ("com.android.vending".equals(str) && str2 != null) {
                        try {
/* 125 */                   if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
/* 129 */                       Intent intent2 = new Intent(intent);
/* 134 */                       ServiceConnectionC0225a serviceConnectionC0225a = new ServiceConnectionC0225a(this, installReferrerStateListener);
/* 137 */                       this.f3041d = serviceConnectionC0225a;
                                try {
/* 143 */                           if (context.bindService(intent2, serviceConnectionC0225a, 1)) {
/* 147 */                               InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
/* 150 */                               return;
                                    }
/* 153 */                           InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
/* 156 */                           this.f3038a = 0;
/* 158 */                           installReferrerStateListener.onInstallReferrerSetupFinished(1);
/* 161 */                           return;
                                } catch (SecurityException unused) {
/* 164 */                           InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
/* 167 */                           this.f3038a = 0;
/* 170 */                           installReferrerStateListener.onInstallReferrerSetupFinished(4);
/* 173 */                           return;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
/* 176 */           InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
/* 179 */           this.f3038a = 0;
/* 181 */           installReferrerStateListener.onInstallReferrerSetupFinished(2);
                }
            }
