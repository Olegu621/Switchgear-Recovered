            package p000;

            import com.supercell.titan.GL2JNISurfaceView;
            import java.util.Objects;
            
            /* JADX INFO: renamed from: sc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class RunnableC2176sc implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16508a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f16509b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f16510c;

                public RunnableC2176sc(sl3 sl3Var, boolean z) {
/* 7 */             this.f16509b = z;
/* 9 */             Objects.requireNonNull(sl3Var);
/* 12 */            this.f16510c = sl3Var;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0055  */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f16508a) {
                        case 0:
/* 116 */                   ((GL2JNISurfaceView) this.f16510c).setKeepScreenOn(this.f16509b);
                            break;
                        default:
/* 8 */                     sl3 sl3Var = (sl3) this.f16510c;
/* 12 */                    ij3 ij3Var = (ij3) sl3Var.f16749a;
/* 14 */                    boolean zM4560d = ij3Var.m4560d();
/* 20 */                    boolean z = false;
/* 34 */                    boolean z2 = ij3Var.f9661j0 != null && ij3Var.f9661j0.booleanValue();
/* 35 */                    boolean z3 = this.f16509b;
/* 41 */                    ij3Var.f9661j0 = Boolean.valueOf(z3);
/* 43 */                    if (z2 == z3) {
/* 45 */                        uh3 uh3Var = ij3Var.f9655f;
/* 47 */                        ij3.m4555l(uh3Var);
/* 58 */                        uh3Var.f17534Y.m8511b(Boolean.valueOf(z3), "Default data collection state already set to");
                            }
/* 65 */                    if (ij3Var.m4560d() != zM4560d) {
/* 67 */                        boolean zM4560d2 = ij3Var.m4560d();
/* 73 */                        if (ij3Var.f9661j0 != null && ij3Var.f9661j0.booleanValue()) {
/* 83 */                            z = true;
                                }
/* 84 */                        if (zM4560d2 != z) {
/* 86 */                            uh3 uh3Var2 = ij3Var.f9655f;
/* 88 */                            ij3.m4555l(uh3Var2);
/* 103 */                           uh3Var2.f17531V.m8512c(Boolean.valueOf(z3), "Default data collection is different than actual status", Boolean.valueOf(zM4560d));
                                }
                            } else {
/* 86 */                        uh3 uh3Var3 = ij3Var.f9655f;
/* 88 */                        ij3.m4555l(uh3Var3);
/* 103 */                       uh3Var3.f17531V.m8512c(Boolean.valueOf(z3), "Default data collection is different than actual status", Boolean.valueOf(zM4560d));
                            }
/* 106 */                   sl3Var.m8566Q();
                            break;
                    }
                }

/* 14 */        public RunnableC2176sc(GL2JNISurfaceView gL2JNISurfaceView, boolean z) {
                    this.f16510c = gL2JNISurfaceView;
                    this.f16509b = z;
                }
            }
