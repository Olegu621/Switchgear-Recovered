            package p000;

            import android.view.View;
            import android.view.Window;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class n83 extends pg3 {

                /* JADX INFO: renamed from: i */
                public final Window f14165i;

                public n83(Window window) {
/* 4 */             this.f14165i = window;
                }

                @Override // p000.pg3
                /* JADX INFO: renamed from: y */
                public final void mo6948y(boolean z) {
/* 1 */             Window window = this.f14165i;
/* 3 */             if (!z) {
/* 29 */                View decorView = window.getDecorView();
/* 39 */                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                    } else {
/* 7 */                 window.clearFlags(67108864);
/* 12 */                window.addFlags(Integer.MIN_VALUE);
/* 15 */                View decorView2 = window.getDecorView();
/* 25 */                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | Segment.SIZE);
                    }
                }
            }
