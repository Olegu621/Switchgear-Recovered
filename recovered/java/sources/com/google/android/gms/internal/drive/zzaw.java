            package com.google.android.gms.internal.drive;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import android.os.Process;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.events.DriveEventService;
            import io.sentry.C1697u2;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import p000.C2345wv;
            import p000.InterfaceC2192ss;
            import p000.eb3;
            import p000.kb1;
            import p000.kr0;
            import p000.rr0;
            import p000.sr0;
            import p000.sr1;
            import p000.tr0;
            import p000.yy1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaw extends kr0 {
                private final String zzeb;
                protected final boolean zzec;
                private volatile DriveId zzed;
                private volatile DriveId zzee;
                private volatile boolean zzef;
                private final Map<DriveId, Map<InterfaceC2192ss, zzee>> zzeg;
                private final Map<DriveEventService, zzee> zzeh;
                private final Map<DriveId, Map<Object, zzee>> zzei;
                private final Map<DriveId, Map<Object, zzee>> zzej;
                private final Bundle zzz;

                public zzaw(Context context, Looper looper, C2345wv c2345wv, rr0 rr0Var, sr0 sr0Var, Bundle bundle) {
/* 9 */             super(context, looper, 11, c2345wv, rr0Var, sr0Var);
/* 13 */            this.zzef = false;
/* 20 */            this.zzeg = new HashMap();
/* 27 */            this.zzeh = new HashMap();
/* 34 */            this.zzei = new HashMap();
/* 41 */            this.zzej = new HashMap();
/* 45 */            this.zzeb = c2345wv.f18827e;
/* 47 */            this.zzz = bundle;
/* 53 */            Intent intent = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
/* 60 */            intent.setPackage(context.getPackageName());
/* 67 */            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
/* 71 */            int size = listQueryIntentServices.size();
/* 75 */            if (size == 0) {
/* 138 */               this.zzec = false;
/* 140 */               return;
                    }
/* 79 */            if (size != 1) {
/* 116 */               String action = intent.getAction();
/* 134 */               C1697u2.m5434j(String.valueOf(action).length() + 72, "AndroidManifest.xml can only define one service that handles the ", action, " action");
/* 137 */               throw null;
                    }
/* 87 */            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
/* 91 */            if (serviceInfo.exported) {
/* 93 */                this.zzec = true;
                    } else {
/* 96 */                String str = serviceInfo.name;
/* 112 */               C1697u2.m5434j(String.valueOf(str).length() + 60, "Drive event service ", str, " must be exported in AndroidManifest.xml");
/* 115 */               throw null;
                    }
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
                    return iInterfaceQueryLocalInterface instanceof zzeo ? (zzeo) iInterfaceQueryLocalInterface : new zzep(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final void disconnect() {
/* 5 */             if (isConnected()) {
                        try {
/* 18 */                    ((zzeo) getService()).zza(new zzad());
                        } catch (RemoteException unused) {
                        }
                    }
/* 21 */            super.disconnect();
                    synchronized (this.zzeg) {
/* 29 */                this.zzeg.clear();
                    }
                    synchronized (this.zzeh) {
/* 38 */                this.zzeh.clear();
                    }
                    synchronized (this.zzei) {
/* 47 */                this.zzei.clear();
                    }
                    synchronized (this.zzej) {
/* 56 */                this.zzej.clear();
                    }
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getGetServiceRequestExtraArgs() {
/* 5 */             String packageName = getContext().getPackageName();
/* 9 */             kb1.m6061n(packageName);
/* 24 */            kb1.m6065r(!getClientSettings().f18825c.isEmpty());
/* 29 */            Bundle bundle = new Bundle();
/* 38 */            if (!packageName.equals(this.zzeb)) {
/* 44 */                bundle.putString("proxy_package_name", this.zzeb);
                    }
/* 49 */            bundle.putAll(this.zzz);
/* 52 */            return bundle;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 12451000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.drive.internal.IDriveService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.drive.ApiService.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
/* 1 */             if (bundle != null) {
/* 9 */                 bundle.setClassLoader(zzaw.class.getClassLoader());
/* 20 */                this.zzed = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
/* 30 */                this.zzee = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
/* 33 */                this.zzef = true;
                    }
/* 35 */            super.onPostInitHandler(i, iBinder, bundle, i2);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean requiresAccount() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final boolean requiresSignIn() {
                    return (getContext().getPackageName().equals(this.zzeb) && yy1.m10228x(getContext(), Process.myUid())) ? false : true;
                }

                public final sr1 zza(tr0 tr0Var, DriveId driveId, InterfaceC2192ss interfaceC2192ss) {
/* 7 */             kb1.m6054g(driveId != null);
/* 12 */            kb1.m6062o(interfaceC2192ss, "listener");
/* 21 */            kb1.m6063p("Client must be connected", isConnected());
                    synchronized (this.zzeg) {
                        try {
/* 29 */                    Map<InterfaceC2192ss, zzee> map = this.zzeg.get(driveId);
/* 35 */                    if (map == null) {
/* 39 */                        map = new HashMap<>();
/* 44 */                        this.zzeg.put(driveId, map);
                            }
/* 50 */                    zzee zzeeVar = map.get(interfaceC2192ss);
/* 56 */                    if (zzeeVar == null) {
/* 68 */                        zzeeVar = new zzee(getLooper(), getContext(), 1, interfaceC2192ss);
/* 71 */                        map.put(interfaceC2192ss, zzeeVar);
                            } else if (zzeeVar.zzg(1)) {
/* 85 */                        return new zzat(tr0Var, Status.f3440e);
                            }
/* 90 */                    zzeeVar.zzf(1);
/* 107 */                   return ((eb3) tr0Var).f7609b.doWrite(new zzax(this, tr0Var, new zzj(1, driveId), zzeeVar));
                        } catch (Throwable th) {
/* 114 */                   throw th;
                        }
                    }
                }

                public final DriveId zzae() {
/* 1 */             return this.zzed;
                }

                public final DriveId zzaf() {
/* 1 */             return this.zzee;
                }

                public final boolean zzag() {
/* 1 */             return this.zzef;
                }

                public final boolean zzah() {
/* 1 */             return this.zzec;
                }

                public final sr1 zzb(tr0 tr0Var, DriveId driveId, InterfaceC2192ss interfaceC2192ss) {
/* 7 */             kb1.m6054g(driveId != null);
/* 16 */            kb1.m6063p("Client must be connected", isConnected());
/* 21 */            kb1.m6062o(interfaceC2192ss, "listener");
                    synchronized (this.zzeg) {
                        try {
/* 29 */                    Map<InterfaceC2192ss, zzee> map = this.zzeg.get(driveId);
/* 35 */                    if (map == null) {
/* 41 */                        return new zzat(tr0Var, Status.f3440e);
                            }
/* 48 */                    zzee zzeeVarRemove = map.remove(interfaceC2192ss);
/* 54 */                    if (zzeeVarRemove == null) {
/* 60 */                        return new zzat(tr0Var, Status.f3440e);
                            }
/* 69 */                    if (map.isEmpty()) {
/* 73 */                        this.zzeg.remove(driveId);
                            }
/* 90 */                    return ((eb3) tr0Var).f7609b.doWrite(new zzay(this, tr0Var, new zzgs(driveId, 1), zzeeVarRemove));
                        } catch (Throwable th) {
/* 97 */                    throw th;
                        }
                    }
                }
            }
