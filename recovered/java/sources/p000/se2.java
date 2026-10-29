            package p000;

            import com.singular.sdk.Singular;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class se2 extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f16551c;

                /* JADX INFO: renamed from: d */
                public final i03 f16552d;

                public se2(i03 i03Var) {
/* 3 */             super("Singular", i03Var);
/* 6 */             this.f16551c = "Singular";
/* 8 */             this.f16552d = i03Var;
                }

                /* JADX INFO: renamed from: g */
                public static void m8490g(boolean z) {
/* 3 */             Singular.limitDataSharing(!z);
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 6 */                 Class.forName("com.singular.sdk.Singular");
/* 9 */                 m8490g(z);
/* 12 */                if (!z) {
/* 23 */                    Singular.stopAllTracking();
/* 26 */                    return true;
                        }
/* 14 */                Singular.resumeAllTracking();
/* 17 */                Singular.trackingOptIn();
/* 26 */                return true;
                    } catch (Exception e) {
/* 28 */                m3063f(e);
/* 31 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f16552d;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f16551c;
                }
            }
