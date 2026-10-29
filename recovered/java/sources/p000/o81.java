            package p000;

            import androidx.appcompat.widget.ListPopupWindow;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o81 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14673a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListPopupWindow f14674b;

                public /* synthetic */ o81(ListPopupWindow listPopupWindow, int i) {
/* 1 */             this.f14673a = i;
/* 3 */             this.f14674b = listPopupWindow;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f14673a;
/* 3 */             ListPopupWindow listPopupWindow = this.f14674b;
                    switch (i) {
                        case 0:
/* 52 */                    ra0 ra0Var = listPopupWindow.f579c;
/* 54 */                    if (ra0Var != null) {
/* 57 */                        ra0Var.setListSelectionHidden(true);
/* 60 */                        ra0Var.requestLayout();
                            }
                            break;
                        default:
/* 8 */                     ra0 ra0Var2 = listPopupWindow.f579c;
/* 10 */                    if (ra0Var2 != null && ra0Var2.isAttachedToWindow() && listPopupWindow.f579c.getCount() > listPopupWindow.f579c.getChildCount() && listPopupWindow.f579c.getChildCount() <= listPopupWindow.f572X) {
/* 45 */                        listPopupWindow.f591j0.setInputMethodMode(2);
/* 48 */                        listPopupWindow.show();
                                break;
                            }
                            break;
                    }
                }
            }
