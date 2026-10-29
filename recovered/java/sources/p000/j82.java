            package p000;

            import android.graphics.Rect;
            import android.view.MotionEvent;
            import android.view.TouchDelegate;
            import android.view.View;
            import android.view.ViewConfiguration;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j82 extends TouchDelegate {

                /* JADX INFO: renamed from: a */
                public final View f12140a;

                /* JADX INFO: renamed from: b */
                public final Rect f12141b;

                /* JADX INFO: renamed from: c */
                public final Rect f12142c;

                /* JADX INFO: renamed from: d */
                public final Rect f12143d;

                /* JADX INFO: renamed from: e */
                public final int f12144e;

                /* JADX INFO: renamed from: f */
                public boolean f12145f;

                public j82(View view, Rect rect, Rect rect2) {
/* 1 */             super(rect, view);
/* 12 */            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
/* 16 */            this.f12144e = scaledTouchSlop;
/* 20 */            Rect rect3 = new Rect();
/* 23 */            this.f12141b = rect3;
/* 27 */            Rect rect4 = new Rect();
/* 30 */            this.f12143d = rect4;
/* 34 */            Rect rect5 = new Rect();
/* 37 */            this.f12142c = rect5;
/* 39 */            rect3.set(rect);
/* 42 */            rect4.set(rect);
/* 45 */            int i = -scaledTouchSlop;
/* 46 */            rect4.inset(i, i);
/* 49 */            rect5.set(rect2);
/* 52 */            this.f12140a = view;
                }

                /* JADX WARN: Code duplicated, block: B:19:0x003e  */
                @Override // android.view.TouchDelegate
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    boolean z;
                    boolean z2;
/* 5 */             int x = (int) motionEvent.getX();
/* 10 */            int y = (int) motionEvent.getY();
/* 11 */            int action = motionEvent.getAction();
/* 17 */            boolean z3 = true;
/* 18 */            if (action != 0) {
/* 20 */                if (action == 1 || action == 2) {
/* 36 */                    z2 = this.f12145f;
/* 38 */                    if (z2 && !this.f12143d.contains(x, y)) {
/* 48 */                        z3 = z2;
/* 49 */                        z = false;
                            }
                        } else if (action != 3) {
/* 63 */                    z = true;
/* 64 */                    z3 = false;
                        } else {
/* 28 */                    z2 = this.f12145f;
/* 30 */                    this.f12145f = false;
                        }
/* 33 */                z3 = z2;
/* 34 */                z = true;
                    } else if (this.f12141b.contains(x, y)) {
/* 59 */                this.f12145f = true;
/* 61 */                z = true;
                    } else {
/* 63 */                z = true;
/* 64 */                z3 = false;
                    }
/* 65 */            if (!z3) {
/* 16 */                return false;
                    }
/* 67 */            Rect rect = this.f12142c;
/* 69 */            View view = this.f12140a;
/* 71 */            if (!z || rect.contains(x, y)) {
/* 103 */               motionEvent.setLocation(x - rect.left, y - rect.top);
                    } else {
/* 91 */                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
                    }
/* 106 */           return view.dispatchTouchEvent(motionEvent);
                }
            }
