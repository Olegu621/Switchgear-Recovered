            package p000;

            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import androidx.appcompat.widget.ContentFrameLayout;
            
            /* JADX INFO: renamed from: ua */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2248ua extends ContentFrameLayout {

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ LayoutInflaterFactory2C2324wa f17434w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2248ua(LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa, z00 z00Var) {
/* 4 */             super(z00Var, null);
/* 1 */             this.f17434w = layoutInflaterFactory2C2324wa;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    return this.f17434w.m9505u(keyEvent) || super.dispatchKeyEvent(keyEvent);
                }

                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
/* 5 */             if (motionEvent.getAction() == 0) {
/* 11 */                int x = (int) motionEvent.getX();
/* 16 */                int y = (int) motionEvent.getY();
/* 18 */                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
/* 39 */                    LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f17434w;
/* 46 */                    layoutInflaterFactory2C2324wa.m9504s(layoutInflaterFactory2C2324wa.m9510z(0), true);
/* 45 */                    return true;
                        }
                    }
/* 50 */            return super.onInterceptTouchEvent(motionEvent);
                }

                @Override // android.view.View
                public final void setBackgroundResource(int i) {
/* 9 */             setBackgroundDrawable(mn0.m6700p(getContext(), i));
                }
            }
