            package p000;

            import java.util.LinkedHashSet;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class dk2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7289a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ gk2 f7290b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ gk2 f7291c;

                public /* synthetic */ dk2(gk2 gk2Var, gk2 gk2Var2, int i) {
/* 1 */             this.f7289a = i;
/* 3 */             this.f7290b = gk2Var;
/* 5 */             this.f7291c = gk2Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f7289a) {
                        case 0:
/* 21 */                    gk2 gk2Var = this.f7290b;
/* 23 */                    gk2 gk2Var2 = this.f7291c;
/* 25 */                    qi1 qi1Var = gk2Var.f8665b;
                            synchronized (qi1Var.f15573b) {
/* 34 */                        ((LinkedHashSet) qi1Var.f15574c).remove(gk2Var);
/* 41 */                        ((LinkedHashSet) qi1Var.f15575d).remove(gk2Var);
                                break;
                            }
/* 45 */                    gk2Var.mo1719g(gk2Var2);
/* 50 */                    if (gk2Var.f8670g != null) {
/* 54 */                        Objects.requireNonNull(gk2Var.f8669f);
/* 59 */                        gk2Var.f8669f.mo1715c(gk2Var2);
/* 87 */                        return;
                            } else {
/* 84 */                        hu0.m4315H0("SyncCaptureSessionBase", "[" + gk2Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
/* 87 */                        return;
                            }
                        default:
/* 6 */                     gk2 gk2Var3 = this.f7290b;
/* 8 */                     gk2 gk2Var4 = this.f7291c;
/* 12 */                    Objects.requireNonNull(gk2Var3.f8669f);
/* 17 */                    gk2Var3.f8669f.mo1719g(gk2Var4);
/* 20 */                    return;
                    }
                }
            }
