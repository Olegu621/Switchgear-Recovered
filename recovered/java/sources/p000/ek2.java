            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final /* synthetic */ class ek2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7769a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ gk2 f7770b;

                public /* synthetic */ ek2(gk2 gk2Var, int i) {
/* 1 */             this.f7769a = i;
/* 3 */             this.f7770b = gk2Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7769a;
/* 3 */             gk2 gk2Var = this.f7770b;
                    switch (i) {
                        case 0:
/* 59 */                    gk2Var.mo1719g(gk2Var);
/* 62 */                    return;
                        default:
/* 8 */                     gk2.m3955l();
/* 15 */                    de3.m3027i(gk2Var.f8670g, "Need to call openCaptureSession before using this API.");
/* 18 */                    qi1 qi1Var = gk2Var.f8665b;
                            synchronized (qi1Var.f15573b) {
/* 27 */                        ((LinkedHashSet) qi1Var.f15575d).add(gk2Var);
                                break;
                            }
/* 41 */                    ((CameraCaptureSession) ((C0210cb) gk2Var.f8670g.f8789a).f2804b).close();
/* 52 */                    gk2Var.f8667d.execute(new ek2(gk2Var, 0));
/* 55 */                    return;
                    }
                }
            }
