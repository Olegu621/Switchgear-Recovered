            package p000;

            import android.hardware.camera2.CaptureRequest;
            import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bw0 extends C0223co {

                /* JADX INFO: renamed from: b */
                public static final bw0 f2622b;

                static {
/* 7 */             new ec0(15);
/* 13 */            f2622b = new bw0();
                }

                @Override // p000.C0223co
                /* JADX INFO: renamed from: a */
                public final void mo1448a(zy2 zy2Var, C1767ir c1767ir) {
/* 1 */             super.mo1448a(zy2Var, c1767ir);
/* 6 */             if (!(zy2Var instanceof aw0)) {
/* 93 */                C1951n4.m6859j("config is not ImageCaptureConfig");
/* 96 */                return;
                    }
/* 8 */             aw0 aw0Var = (aw0) zy2Var;
/* 10 */            uk1 uk1VarM9034j = uk1.m9034j();
/* 14 */            C1888lf c1888lf = aw0.f2117b;
/* 20 */            if (aw0Var.mo7028h(c1888lf)) {
/* 28 */                int iIntValue = ((Integer) aw0Var.mo7025e(c1888lf)).intValue();
/* 42 */                if (((ImageCapturePixelHDRPlusQuirk) f80.f8038a.m3582h(ImageCapturePixelHDRPlusQuirk.class)) != null) {
/* 45 */                    if (iIntValue == 0) {
/* 1 */                         CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
/* 75 */                        uk1VarM9034j.m9037p(C0998ho.m4249L(key), Boolean.TRUE);
                            } else if (iIntValue == 1) {
/* 1 */                         CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
/* 61 */                        uk1VarM9034j.m9037p(C0998ho.m4249L(key2), Boolean.FALSE);
                            }
                        }
                    }
/* 87 */            c1767ir.m5545e(new C0998ho(nq1.m7021d(uk1VarM9034j)));
                }
            }
