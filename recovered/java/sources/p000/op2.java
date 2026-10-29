            package p000;

            import android.view.GestureDetector;
            import android.view.MotionEvent;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.TitanWebView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class op2 extends GestureDetector.SimpleOnGestureListener {

                /* JADX INFO: renamed from: a */
                public final TitanWebView f14861a;

                public op2(TitanWebView titanWebView) {
/* 4 */             this.f14861a = titanWebView;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
/* 14 */            if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0f) {
/* 39 */                return false;
                    }
/* 36 */            GameApp.getInstance().runOnView(new f72(this, 6));
/* 39 */            return false;
                }
            }
