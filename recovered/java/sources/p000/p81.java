            package p000;

            import android.widget.AbsListView;
            import android.widget.PopupWindow;
            import androidx.appcompat.widget.ListPopupWindow;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p81 implements AbsListView.OnScrollListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ListPopupWindow f15023a;

                public p81(ListPopupWindow listPopupWindow) {
/* 4 */             this.f15023a = listPopupWindow;
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public final void onScrollStateChanged(AbsListView absListView, int i) {
/* 1 */             ListPopupWindow listPopupWindow = this.f15023a;
/* 3 */             o81 o81Var = listPopupWindow.f578b0;
/* 5 */             PopupWindow popupWindow = listPopupWindow.f591j0;
/* 8 */             if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
/* 32 */                return;
                    }
/* 26 */            listPopupWindow.f586f0.removeCallbacks(o81Var);
/* 29 */            o81Var.run();
                }
            }
