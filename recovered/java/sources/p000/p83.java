            package p000;

            import android.view.View;
            import android.view.Window;
            import android.view.WindowInsetsController;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p83 extends pg3 {

                /* JADX INFO: renamed from: i */
                public final WindowInsetsController f15024i;

                /* JADX INFO: renamed from: v */
                public final Window f15025v;

                public p83(Window window) {
/* 8 */             this.f15024i = window.getInsetsController();
/* 10 */            this.f15025v = window;
                }

                @Override // p000.pg3
                /* JADX INFO: renamed from: x */
                public final void mo7113x(boolean z) {
/* 1 */             Window window = this.f15025v;
/* 3 */             if (z) {
/* 5 */                 if (window != null) {
/* 7 */                     View decorView = window.getDecorView();
/* 17 */                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                        }
/* 3 */                 this.f15024i.setSystemBarsAppearance(16, 16);
/* 25 */                return;
                    }
/* 26 */            if (window != null) {
/* 28 */                View decorView2 = window.getDecorView();
/* 38 */                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
                    }
/* 4 */             this.f15024i.setSystemBarsAppearance(0, 16);
                }

                @Override // p000.pg3
                /* JADX INFO: renamed from: y */
                public final void mo6948y(boolean z) {
/* 1 */             Window window = this.f15025v;
/* 3 */             if (z) {
/* 5 */                 if (window != null) {
/* 7 */                     View decorView = window.getDecorView();
/* 17 */                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | Segment.SIZE);
                        }
/* 3 */                 this.f15024i.setSystemBarsAppearance(8, 8);
/* 25 */                return;
                    }
/* 26 */            if (window != null) {
/* 28 */                View decorView2 = window.getDecorView();
/* 38 */                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
                    }
/* 4 */             this.f15024i.setSystemBarsAppearance(0, 8);
                }
            }
