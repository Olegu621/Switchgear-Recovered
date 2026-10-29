            package p000;

            import com.google.android.material.datepicker.AbstractC0350g;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class e50 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7509a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f7510b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f7511c;

                public e50(of3 of3Var, long j) {
/* 7 */             this.f7510b = j;
/* 9 */             Objects.requireNonNull(of3Var);
/* 12 */            this.f7511c = of3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7509a;
/* 3 */             long j = this.f7510b;
/* 5 */             Object obj = this.f7511c;
                    switch (i) {
                        case 0:
/* 34 */                    AbstractC0350g abstractC0350g = (AbstractC0350g) obj;
/* 52 */                    abstractC0350g.f4641a.setError(String.format(abstractC0350g.f4644d, xe2.m9781s(j)));
/* 55 */                    abstractC0350g.mo2307a();
                            break;
                        case 1:
/* 30 */                    ((of3) obj).m7166F(j);
                            break;
                        default:
/* 10 */                    lm3 lm3Var = (lm3) obj;
/* 16 */                    of3 of3Var = ((ij3) lm3Var.f16749a).f9643Y;
/* 18 */                    ij3.m4552i(of3Var);
/* 21 */                    of3Var.m7163C(j);
/* 25 */                    lm3Var.f13416e = null;
                            break;
                    }
                }

/* 14 */        public e50(lm3 lm3Var, long j) {
                    this.f7510b = j;
                    Objects.requireNonNull(lm3Var);
                    this.f7511c = lm3Var;
                }

/* 15 */        public e50(AbstractC0350g abstractC0350g, long j) {
                    this.f7511c = abstractC0350g;
                    this.f7510b = j;
                }
            }
