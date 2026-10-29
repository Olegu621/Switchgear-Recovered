            package p000;

            import android.view.WindowInsets;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class l83 {
                /* JADX INFO: renamed from: a */
                public static int m6406a(int i) {
                    int iStatusBars;
/* 1 */             int i2 = 0;
/* 6 */             for (int i3 = 1; i3 <= 256; i3 <<= 1) {
/* 10 */                if ((i & i3) != 0) {
/* 12 */                    if (i3 == 1) {
/* 1 */                         iStatusBars = WindowInsets.Type.statusBars();
                            } else if (i3 == 2) {
/* 1 */                         iStatusBars = WindowInsets.Type.navigationBars();
                            } else if (i3 == 4) {
/* 1 */                         iStatusBars = WindowInsets.Type.captionBar();
                            } else if (i3 == 8) {
/* 1 */                         iStatusBars = WindowInsets.Type.ime();
                            } else if (i3 == 16) {
/* 1 */                         iStatusBars = WindowInsets.Type.systemGestures();
                            } else if (i3 == 32) {
/* 1 */                         iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                            } else if (i3 == 64) {
/* 1 */                         iStatusBars = WindowInsets.Type.tappableElement();
                            } else if (i3 == 128) {
/* 1 */                         iStatusBars = WindowInsets.Type.displayCutout();
                            }
/* 45 */                    i2 |= iStatusBars;
                        }
                    }
/* 85 */            return i2;
                }
            }
