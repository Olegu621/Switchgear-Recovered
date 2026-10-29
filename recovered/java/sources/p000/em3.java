            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class em3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7801a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ lm3 f7802b;

                public em3(lm3 lm3Var, int i) {
/* 1 */             this.f7801a = i;
                    switch (i) {
                        case 1:
/* 18 */                    Objects.requireNonNull(lm3Var);
/* 21 */                    this.f7802b = lm3Var;
                            break;
                        default:
/* 9 */                     Objects.requireNonNull(lm3Var);
/* 12 */                    this.f7802b = lm3Var;
                            break;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7801a;
/* 3 */             lm3 lm3Var = this.f7802b;
                    switch (i) {
                        case 0:
/* 14 */                    lm3Var.f13416e = lm3Var.f13411U;
                            break;
                        default:
/* 9 */                     lm3Var.f13411U = null;
                            break;
                    }
                }
            }
