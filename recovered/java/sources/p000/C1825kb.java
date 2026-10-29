            package p000;

            import android.view.ViewTreeObserver;
            import android.widget.PopupWindow;
            
            /* JADX INFO: renamed from: kb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1825kb implements PopupWindow.OnDismissListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1986o2 f12667a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1884lb f12668b;

                public C1825kb(C1884lb c1884lb, ViewTreeObserverOnGlobalLayoutListenerC1986o2 viewTreeObserverOnGlobalLayoutListenerC1986o2) {
/* 4 */             this.f12668b = c1884lb;
/* 6 */             this.f12667a = viewTreeObserverOnGlobalLayoutListenerC1986o2;
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
/* 5 */             ViewTreeObserver viewTreeObserver = this.f12668b.f13168q0.getViewTreeObserver();
/* 9 */             if (viewTreeObserver != null) {
/* 13 */                viewTreeObserver.removeGlobalOnLayoutListener(this.f12667a);
                    }
                }
            }
