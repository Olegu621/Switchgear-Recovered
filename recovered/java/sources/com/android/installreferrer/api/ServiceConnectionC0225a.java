            package com.android.installreferrer.api;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.IInterface;
            import com.android.installreferrer.commons.InstallReferrerCommons;
            import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
            import p000.f42;
            
            /* JADX INFO: renamed from: com.android.installreferrer.api.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ServiceConnectionC0225a implements ServiceConnection {

                /* JADX INFO: renamed from: a */
                public final InstallReferrerStateListener f3036a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0226b f3037b;

                public ServiceConnectionC0225a(C0226b c0226b, InstallReferrerStateListener installReferrerStateListener) {
/* 4 */             this.f3037b = c0226b;
/* 6 */             if (installReferrerStateListener != null) {
/* 8 */                 this.f3036a = installReferrerStateListener;
                    } else {
/* 13 */                f42.m3663s("Please specify a listener to know when setup is done.");
/* 17 */                throw null;
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IGetInstallReferrerService proxy;
/* 5 */             InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
/* 8 */             int i = IGetInstallReferrerService.Stub.f3126a;
/* 10 */            if (iBinder == null) {
/* 12 */                proxy = null;
                    } else {
/* 16 */                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
/* 29 */                proxy = iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) iInterfaceQueryLocalInterface : new IGetInstallReferrerService.Stub.Proxy(iBinder);
                    }
/* 32 */            C0226b c0226b = this.f3037b;
/* 34 */            c0226b.f3040c = proxy;
/* 37 */            c0226b.f3038a = 2;
/* 42 */            this.f3036a.onInstallReferrerSetupFinished(0);
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 5 */             InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
/* 9 */             C0226b c0226b = this.f3037b;
/* 11 */            c0226b.f3040c = null;
/* 14 */            c0226b.f3038a = 0;
/* 18 */            this.f3036a.onInstallReferrerServiceDisconnected();
                }
            }
