            package p000;

            import android.R;
            import android.app.Dialog;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.os.Build;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jy0 implements View.OnTouchListener {

                /* JADX INFO: renamed from: a */
                public final Dialog f12537a;

                /* JADX INFO: renamed from: b */
                public final int f12538b;

                /* JADX INFO: renamed from: c */
                public final int f12539c;

                /* JADX INFO: renamed from: d */
                public final int f12540d;

                public jy0(Dialog dialog, Rect rect) {
/* 4 */             this.f12537a = dialog;
/* 8 */             this.f12538b = rect.left;
/* 12 */            this.f12539c = rect.top;
/* 26 */            this.f12540d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
/* 4 */             View viewFindViewById = view.findViewById(R.id.content);
/* 14 */            int left = viewFindViewById.getLeft() + this.f12538b;
/* 19 */            int width = viewFindViewById.getWidth() + left;
/* 26 */            int top = viewFindViewById.getTop() + this.f12539c;
/* 54 */            if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
/* 53 */                return false;
                    }
/* 57 */            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
/* 66 */            if (motionEvent.getAction() == 1) {
/* 69 */                motionEventObtain.setAction(4);
                    }
/* 76 */            if (Build.VERSION.SDK_INT < 28) {
/* 78 */                motionEventObtain.setAction(0);
/* 84 */                float f = (-this.f12540d) - 1;
/* 86 */                motionEventObtain.setLocation(f, f);
                    }
/* 89 */            view.performClick();
/* 94 */            return this.f12537a.onTouchEvent(motionEventObtain);
                }
            }
