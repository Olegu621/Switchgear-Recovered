            package p000;

            import android.view.MotionEvent;
            import android.view.View;
            import android.widget.AutoCompleteTextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ya0 implements View.OnTouchListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AutoCompleteTextView f19554a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ za0 f19555b;

                public ya0(za0 za0Var, AutoCompleteTextView autoCompleteTextView) {
/* 4 */             this.f19555b = za0Var;
/* 6 */             this.f19554a = autoCompleteTextView;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
/* 7 */             if (motionEvent.getAction() == 1) {
/* 9 */                 long jCurrentTimeMillis = System.currentTimeMillis();
/* 13 */                za0 za0Var = this.f19555b;
/* 17 */                long j = jCurrentTimeMillis - za0Var.f20028n;
/* 22 */                if (j < 0 || j > 300) {
/* 30 */                    za0Var.f20026l = false;
                        }
/* 34 */                za0.m10293d(za0Var, this.f19554a);
/* 37 */                za0Var.f20026l = true;
/* 43 */                za0Var.f20028n = System.currentTimeMillis();
                    }
/* 5 */             return false;
                }
            }
