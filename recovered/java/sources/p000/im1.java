            package p000;

            import android.content.Context;
            import android.view.View;
            import android.widget.FrameLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class im1 extends tl1 {

                /* JADX INFO: renamed from: s0 */
                public int f9716s0;

                /* JADX INFO: renamed from: t0 */
                public final FrameLayout.LayoutParams f9717t0;

                public im1(Context context) {
/* 1 */             super(context);
/* 5 */             this.f9716s0 = -1;
/* 10 */            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
/* 13 */            this.f9717t0 = layoutParams;
/* 17 */            layoutParams.gravity = 49;
/* 19 */            setLayoutParams(layoutParams);
/* 23 */            setItemActiveIndicatorResizeable(true);
                }

                @Override // p000.tl1
                /* JADX INFO: renamed from: e */
                public final rl1 mo4579e(Context context) {
/* 3 */             return new hm1(context);
                }

                /* JADX INFO: renamed from: g */
                public final int m4580g(int i, int i2, int i3) {
/* 6 */             int iMax = i2 / Math.max(1, i3);
/* 7 */             int size = this.f9716s0;
/* 10 */            if (size == -1) {
/* 13 */                size = View.MeasureSpec.getSize(i);
                    }
/* 22 */            return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
                }

                public int getItemMinimumHeight() {
/* 1 */             return this.f9716s0;
                }

                public int getMenuGravity() {
/* 3 */             return this.f9717t0.gravity;
                }

                /* JADX INFO: renamed from: h */
                public final int m4581h(int i, int i2, int i3, View view) {
                    int measuredHeight;
/* 1 */             m4580g(i, i2, i3);
/* 16 */            int iM4580g = view == null ? m4580g(i, i2, i3) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
/* 20 */            int childCount = getChildCount();
/* 25 */            int i4 = 0;
/* 26 */            for (int i5 = 0; i5 < childCount; i5++) {
/* 28 */                View childAt = getChildAt(i5);
/* 32 */                if (childAt != view) {
/* 40 */                    if (childAt.getVisibility() != 8) {
/* 42 */                        childAt.measure(i, iM4580g);
/* 45 */                        measuredHeight = childAt.getMeasuredHeight();
                            } else {
/* 50 */                        measuredHeight = 0;
                            }
/* 51 */                    i4 += measuredHeight;
                        }
                    }
/* 55 */            return i4;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             int childCount = getChildCount();
/* 5 */             int i5 = i3 - i;
/* 8 */             int i6 = 0;
/* 9 */             for (int i7 = 0; i7 < childCount; i7++) {
/* 11 */                View childAt = getChildAt(i7);
/* 21 */                if (childAt.getVisibility() != 8) {
/* 27 */                    int measuredHeight = childAt.getMeasuredHeight() + i6;
/* 28 */                    childAt.layout(0, i6, i5, measuredHeight);
/* 31 */                    i6 = measuredHeight;
                        }
                    }
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    int iM4581h;
                    int measuredHeight;
/* 1 */             int size = View.MeasureSpec.getSize(i2);
/* 13 */            int size2 = getMenu().m5807l().size();
/* 19 */            if (size2 <= 1 || !tl1.m8808f(getLabelVisibilityMode(), size2)) {
/* 74 */                iM4581h = m4581h(i, size, size2, null);
                    } else {
/* 35 */                View childAt = getChildAt(getSelectedItemPosition());
/* 39 */                if (childAt != null) {
/* 41 */                    int iM4580g = m4580g(i, size, size2);
/* 51 */                    if (childAt.getVisibility() != 8) {
/* 53 */                        childAt.measure(i, iM4580g);
/* 56 */                        measuredHeight = childAt.getMeasuredHeight();
                            } else {
/* 61 */                        measuredHeight = 0;
                            }
/* 62 */                    size -= measuredHeight;
/* 63 */                    size2--;
                        } else {
/* 66 */                    measuredHeight = 0;
                        }
/* 71 */                iM4581h = m4581h(i, size, size2, childAt) + measuredHeight;
                    }
/* 90 */            setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(iM4581h, i2, 0));
                }

                public void setItemMinimumHeight(int i) {
/* 3 */             if (this.f9716s0 != i) {
/* 5 */                 this.f9716s0 = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setMenuGravity(int i) {
/* 1 */             FrameLayout.LayoutParams layoutParams = this.f9717t0;
/* 5 */             if (layoutParams.gravity != i) {
/* 7 */                 layoutParams.gravity = i;
/* 9 */                 setLayoutParams(layoutParams);
                    }
                }
            }
