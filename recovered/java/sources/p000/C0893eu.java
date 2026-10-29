            package p000;

            import android.graphics.Typeface;
            import com.google.android.material.chip.Chip;
            
            /* JADX INFO: renamed from: eu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0893eu extends kb1 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f7875e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f7876f;

                public /* synthetic */ C0893eu(Object obj, int i) {
/* 1 */             this.f7875e = i;
/* 3 */             this.f7876f = obj;
                }

                /* JADX INFO: renamed from: b0 */
                private final void m3599b0(int i) {
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: M */
                public final void mo1411M(int i) {
                    switch (this.f7875e) {
                        case 0:
                            break;
                        default:
/* 8 */                     gn2 gn2Var = (gn2) this.f7876f;
/* 11 */                    gn2Var.f8750d = true;
/* 19 */                    fn2 fn2Var = (fn2) gn2Var.f8751e.get();
/* 21 */                    if (fn2Var != null) {
/* 23 */                        fn2Var.mo3729a();
                            }
                            break;
                    }
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: N */
                public final void mo1412N(Typeface typeface, boolean z) {
/* 1 */             int i = this.f7875e;
/* 3 */             Object obj = this.f7876f;
                    switch (i) {
                        case 0:
/* 30 */                    Chip chip = (Chip) obj;
/* 32 */                    C1004hu c1004hu = chip.f4587e;
/* 45 */                    chip.setText(c1004hu.f9278n1 ? c1004hu.f9281p0 : chip.getText());
/* 48 */                    chip.requestLayout();
/* 51 */                    chip.invalidate();
                            break;
                        default:
/* 8 */                     if (!z) {
/* 11 */                        gn2 gn2Var = (gn2) obj;
/* 14 */                        gn2Var.f8750d = true;
/* 22 */                        fn2 fn2Var = (fn2) gn2Var.f8751e.get();
/* 24 */                        if (fn2Var != null) {
/* 26 */                            fn2Var.mo3729a();
                                }
                                break;
                            }
                            break;
                    }
                }
            }
