            package p000;

            import com.ironsource.mediationsdk.IronSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xz0 extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f19420c;

                /* JADX INFO: renamed from: d */
                public final i03 f19421d;

                public xz0(i03 i03Var) {
/* 3 */             super("Iron Source", i03Var);
/* 6 */             this.f19420c = "Iron Source";
/* 8 */             this.f19421d = i03Var;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 6 */                 Class.forName("com.ironsource.mediationsdk.IronSource");
/* 12 */                if (g13Var == g13.f8433b) {
/* 21 */                    IronSource.setMetaData("do_not_sell", String.valueOf(!z));
                        } else {
/* 27 */                    IronSource.setConsent(z);
                        }
/* 11 */                return true;
                    } catch (Exception e) {
/* 31 */                m3063f(e);
/* 34 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f19421d;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f19420c;
                }
            }
