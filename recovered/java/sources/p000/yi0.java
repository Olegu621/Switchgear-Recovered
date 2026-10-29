            package p000;

            import com.google.firebase.installations.FirebaseInstallations;
            import io.sentry.C1533l0;
            import java.net.InetAddress;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class yi0 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19642a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f19643b;

                public /* synthetic */ yi0(Object obj, int i) {
/* 1 */             this.f19642a = i;
/* 3 */             this.f19643b = obj;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
/* 1 */             int i = this.f19642a;
/* 3 */             Object obj = this.f19643b;
                    switch (i) {
                        case 0:
/* 1 */                     return ((FirebaseInstallations) obj).deleteFirebaseInstallationId();
                        default:
/* 8 */                     C1533l0 c1533l0 = (C1533l0) obj;
                            try {
/* 13 */                        c1533l0.f11109e.getClass();
/* 24 */                        c1533l0.f11106b = InetAddress.getLocalHost().getCanonicalHostName();
/* 33 */                        c1533l0.f11107c = System.currentTimeMillis() + c1533l0.f11105a;
/* 40 */                        return null;
                            } finally {
/* 45 */                        c1533l0.f11108d.set(false);
                            }
                    }
                }
            }
