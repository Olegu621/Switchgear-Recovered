            package p000;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.common.internal.zzab;
            import com.google.android.gms.common.internal.zzac;
            import com.google.android.gms.common.internal.zzad;
            import com.google.android.gms.common.zzt;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ko3 {

                /* JADX INFO: renamed from: a */
                public static final uf3 f12903a;

                /* JADX INFO: renamed from: b */
                public static final uf3 f12904b;

                /* JADX INFO: renamed from: c */
                public static volatile zzad f12905c;

                /* JADX INFO: renamed from: d */
                public static final Object f12906d;

                /* JADX INFO: renamed from: e */
                public static Context f12907e;

                static {
/* 10 */            new uf3(dk3.m3149b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
/* 22 */            new uf3(dk3.m3149b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
/* 34 */            new uf3(dk3.m3149b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
/* 46 */            new uf3(dk3.m3149b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
/* 61 */            f12903a = new uf3(dk3.m3149b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
/* 75 */            f12904b = new uf3(dk3.m3149b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
/* 82 */            f12906d = new Object();
                }

                /* JADX INFO: renamed from: a */
                public static void m6172a() {
                    zzad zzabVar;
/* 3 */             if (f12905c != null) {
/* 5 */                 return;
                    }
/* 8 */             kb1.m6061n(f12907e);
                    synchronized (f12906d) {
                        try {
/* 16 */                    if (f12905c == null) {
/* 30 */                        IBinder iBinderM9519b = wb0.m9513c(f12907e, wb0.f18550d, "com.google.android.gms.googlecertificates").m9519b("com.google.android.gms.common.GoogleCertificatesImpl");
/* 34 */                        int i = zzac.f3539a;
/* 38 */                        if (iBinderM9519b == null) {
/* 40 */                            zzabVar = null;
                                } else {
/* 42 */                            IInterface iInterfaceQueryLocalInterface = iBinderM9519b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
/* 56 */                            zzabVar = iInterfaceQueryLocalInterface instanceof zzad ? (zzad) iInterfaceQueryLocalInterface : new zzab(iBinderM9519b, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                                }
/* 60 */                        f12905c = zzabVar;
                            }
                        } catch (Throwable th) {
/* 68 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static zr3 m6173b(String str, al3 al3Var, boolean z, boolean z2) {
                    try {
/* 5 */                 m6172a();
/* 10 */                kb1.m6061n(f12907e);
                        try {
                            return f12905c.mo2024i(new zzt(str, al3Var, z, z2), new ObjectWrapper(f12907e.getPackageManager())) ? zr3.f20309d : new xr3(new kl3(z, str, al3Var));
                        } catch (RemoteException e) {
/* 52 */                    AbstractC1245n0.m4877e("GoogleCertificates", "Failed to get Google certificates from remote", e);
/* 57 */                    return zr3.m10428C("module call", e);
                        }
                    } catch (sb0 e2) {
/* 63 */                AbstractC1245n0.m4877e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
/* 80 */                return zr3.m10428C("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                    }
                }
            }
