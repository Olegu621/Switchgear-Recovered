            package p000;

            import androidx.camera.core.ImageProcessingUtil;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class kw0 implements bm0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13027a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ mw0 f13028b;

                public /* synthetic */ kw0(mw0 mw0Var, mw0 mw0Var2, int i) {
/* 1 */             this.f13027a = i;
/* 3 */             this.f13028b = mw0Var2;
                }

                @Override // p000.bm0
                /* JADX INFO: renamed from: b */
                public final void mo1394b(cm0 cm0Var) throws Exception {
/* 1 */             int i = this.f13027a;
/* 3 */             mw0 mw0Var = this.f13028b;
                    switch (i) {
                        case 0:
/* 14 */                    int i2 = ImageProcessingUtil.f808a;
/* 16 */                    if (mw0Var != null) {
/* 18 */                        mw0Var.close();
                            }
                            break;
                        default:
/* 8 */                     int i3 = ImageProcessingUtil.f808a;
/* 10 */                    mw0Var.close();
                            break;
                    }
                }
            }
