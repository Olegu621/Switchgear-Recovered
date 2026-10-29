            package p000;

            import android.view.Window;
            import android.view.WindowManager;
            import com.supercell.titan.GameApp;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eq0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7830a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f7831b;

                public /* synthetic */ eq0(int i, int i2) {
/* 1 */             this.f7830a = i2;
/* 3 */             this.f7831b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7830a;
/* 3 */             int i2 = this.f7831b;
                    switch (i) {
                        case 0:
/* 35 */                    GameApp.getInstance().getView().performHapticFeedback(i2, 2);
                            break;
                        default:
/* 12 */                    Window window = GameApp.getInstance().getWindow();
/* 16 */                    WindowManager.LayoutParams attributes = window.getAttributes();
/* 20 */                    attributes.preferredDisplayModeId = i2;
/* 22 */                    window.setAttributes(attributes);
                            break;
                    }
                }
            }
