            package p000;

            import android.os.Handler;
            import android.view.GestureDetector;
            import android.view.MotionEvent;
            import android.view.View;
            import android.widget.Checkable;
            import android.widget.PopupWindow;
            import androidx.appcompat.widget.ListPopupWindow;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q81 implements View.OnTouchListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15440a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f15441b;

                public /* synthetic */ q81(Object obj, int i) {
/* 1 */             this.f15440a = i;
/* 3 */             this.f15441b = obj;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
/* 1 */             int i = this.f15440a;
/* 4 */             Object obj = this.f15441b;
                    switch (i) {
                        case 0:
/* 24 */                    ListPopupWindow listPopupWindow = (ListPopupWindow) obj;
/* 26 */                    o81 o81Var = listPopupWindow.f578b0;
/* 28 */                    Handler handler = listPopupWindow.f586f0;
/* 30 */                    PopupWindow popupWindow = listPopupWindow.f591j0;
/* 32 */                    int action = motionEvent.getAction();
/* 40 */                    int x = (int) motionEvent.getX();
/* 45 */                    int y = (int) motionEvent.getY();
/* 46 */                    if (action == 0 && popupWindow != null && popupWindow.isShowing() && x >= 0 && x < popupWindow.getWidth() && y >= 0 && y < popupWindow.getHeight()) {
/* 74 */                        handler.postDelayed(o81Var, 250L);
                            } else if (action == 1) {
/* 81 */                        handler.removeCallbacks(o81Var);
                            }
/* 3 */                     return false;
                        default:
/* 15 */                    if (((Checkable) view).isChecked()) {
/* 19 */                        return ((GestureDetector) obj).onTouchEvent(motionEvent);
                            }
/* 3 */                     return false;
                    }
                }
            }
