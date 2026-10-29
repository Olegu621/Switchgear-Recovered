            package p000;

            import android.graphics.Matrix;
            import android.view.GestureDetector;
            import android.view.MotionEvent;
            import android.view.View;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.KeyboardDialog;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class d41 implements View.OnTouchListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f6976a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f6977b;

                public /* synthetic */ d41(Object obj, int i) {
/* 1 */             this.f6976a = i;
/* 3 */             this.f6977b = obj;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
/* 1 */             int i = this.f6976a;
/* 3 */             Object obj = this.f6977b;
                    switch (i) {
                        case 0:
/* 17 */                    String str = KeyboardDialog.f5810i;
/* 19 */                    MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
/* 31 */                    motionEventObtainNoHistory.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
/* 35 */                    int[] iArr = new int[2];
/* 37 */                    GameApp gameApp = ((KeyboardDialog) obj).f5813a;
/* 43 */                    gameApp.getView().getLocationOnScreen(iArr);
/* 48 */                    Matrix matrix = new Matrix();
/* 61 */                    matrix.setTranslate(-iArr[0], -iArr[1]);
/* 64 */                    motionEventObtainNoHistory.transform(matrix);
/* 71 */                    return gameApp.getView().dispatchTouchEvent(motionEventObtainNoHistory);
                        default:
/* 10 */                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                    }
                }
            }
