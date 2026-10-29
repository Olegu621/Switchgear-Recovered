            package io.flutter.plugin.platform;

            import android.content.Context;
            import android.graphics.Rect;
            import android.view.Gravity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowManager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class SingleViewFakeWindowViewGroup extends ViewGroup {
                private final Rect childRect;
                private final Rect viewBounds;

                public SingleViewFakeWindowViewGroup(Context context) {
/* 1 */             super(context);
/* 9 */             this.viewBounds = new Rect();
/* 16 */            this.childRect = new Rect();
                }

                private static int atMost(int i) {
/* 7 */             return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 6 */             for (int i5 = 0; i5 < getChildCount(); i5++) {
/* 8 */                 View childAt = getChildAt(i5);
/* 16 */                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
/* 20 */                this.viewBounds.set(i, i2, i3, i4);
/* 41 */                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.viewBounds, layoutParams.x, layoutParams.y, this.childRect);
/* 44 */                Rect rect = this.childRect;
/* 54 */                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }

                @Override // android.view.View
                public void onMeasure(int i, int i2) {
/* 6 */             for (int i3 = 0; i3 < getChildCount(); i3++) {
/* 20 */                getChildAt(i3).measure(atMost(i), atMost(i2));
                    }
/* 26 */            super.onMeasure(i, i2);
                }
            }
