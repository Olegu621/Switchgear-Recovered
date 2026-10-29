            package p000;

            import android.graphics.Matrix;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o53 extends n53 {
                @Override // p000.yy1
                /* JADX INFO: renamed from: F */
                public final void mo7103F(View view, float f) {
/* 1 */             view.setTransitionAlpha(f);
                }

                @Override // p000.n53
                /* JADX INFO: renamed from: P */
                public final void mo6890P(View view, Matrix matrix) {
/* 1 */             view.setAnimationMatrix(matrix);
                }

                @Override // p000.n53
                /* JADX INFO: renamed from: Q */
                public final void mo6891Q(View view, int i, int i2, int i3, int i4) {
/* 1 */             view.setLeftTopRightBottom(i, i2, i3, i4);
                }

                @Override // p000.n53
                /* JADX INFO: renamed from: R */
                public final void mo6892R(int i, View view) {
/* 1 */             view.setTransitionVisibility(i);
                }

                @Override // p000.n53
                /* JADX INFO: renamed from: S */
                public final void mo6893S(View view, Matrix matrix) {
/* 1 */             view.transformMatrixToGlobal(matrix);
                }

                @Override // p000.n53
                /* JADX INFO: renamed from: T */
                public final void mo6894T(View view, Matrix matrix) {
/* 1 */             view.transformMatrixToLocal(matrix);
                }

                @Override // p000.yy1
                /* JADX INFO: renamed from: u */
                public final float mo7104u(View view) {
/* 1 */             return view.getTransitionAlpha();
                }
            }
