            package p000;

            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.view.View;
            import android.widget.LinearLayout;
            import com.google.android.material.tabs.TabLayout;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hm2 extends LinearLayout {

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ int f9142e = 0;

                /* JADX INFO: renamed from: a */
                public ValueAnimator f9143a;

                /* JADX INFO: renamed from: b */
                public int f9144b;

                /* JADX INFO: renamed from: c */
                public float f9145c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ TabLayout f9146d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public hm2(TabLayout tabLayout, Context context) {
/* 3 */             super(context);
/* 1 */             this.f9146d = tabLayout;
/* 7 */             this.f9144b = -1;
/* 10 */            setWillNotDraw(false);
                }

                /* JADX INFO: renamed from: a */
                public final void m4242a() {
/* 3 */             View childAt = getChildAt(this.f9144b);
/* 7 */             TabLayout tabLayout = this.f9146d;
/* 9 */             q62 q62Var = tabLayout.f4987t0;
/* 11 */            Drawable drawable = tabLayout.f4960W;
/* 13 */            q62Var.getClass();
/* 16 */            RectF rectFM7731b = q62.m7731b(tabLayout, childAt);
/* 38 */            drawable.setBounds((int) rectFM7731b.left, drawable.getBounds().top, (int) rectFM7731b.right, drawable.getBounds().bottom);
                }

                /* JADX INFO: renamed from: b */
                public final void m4243b(int i) {
/* 1 */             TabLayout tabLayout = this.f9146d;
/* 5 */             Rect bounds = tabLayout.f4960W.getBounds();
/* 16 */            tabLayout.f4960W.setBounds(bounds.left, 0, bounds.right, i);
/* 19 */            requestLayout();
                }

                /* JADX INFO: renamed from: c */
                public final void m4244c(View view, View view2, float f) {
/* 1 */             TabLayout tabLayout = this.f9146d;
/* 3 */             if (view == null || view.getWidth() <= 0) {
/* 22 */                Drawable drawable = tabLayout.f4960W;
/* 39 */                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f4960W.getBounds().bottom);
                    } else {
/* 18 */                tabLayout.f4987t0.mo3909f(tabLayout, view, view2, f, tabLayout.f4960W);
                    }
/* 42 */            WeakHashMap weakHashMap = e33.f7494a;
/* 44 */            postInvalidateOnAnimation();
                }

                /* JADX INFO: renamed from: d */
                public final void m4245d(int i, int i2, boolean z) {
/* 3 */             View childAt = getChildAt(this.f9144b);
/* 7 */             View childAt2 = getChildAt(i);
/* 11 */            if (childAt2 == null) {
/* 13 */                m4242a();
/* 16 */                return;
                    }
/* 19 */            fm2 fm2Var = new fm2(this, childAt, childAt2);
/* 22 */            if (!z) {
/* 66 */                this.f9143a.removeAllUpdateListeners();
/* 71 */                this.f9143a.addUpdateListener(fm2Var);
/* 74 */                return;
                    }
/* 26 */            ValueAnimator valueAnimator = new ValueAnimator();
/* 29 */            this.f9143a = valueAnimator;
/* 33 */            valueAnimator.setInterpolator(AbstractC2246u8.f17411b);
/* 37 */            valueAnimator.setDuration(i2);
/* 46 */            valueAnimator.setFloatValues(0.0f, 1.0f);
/* 49 */            valueAnimator.addUpdateListener(fm2Var);
/* 57 */            valueAnimator.addListener(new gm2(this, i));
/* 60 */            valueAnimator.start();
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    int height;
/* 1 */             TabLayout tabLayout = this.f9146d;
/* 9 */             int iHeight = tabLayout.f4960W.getBounds().height();
/* 13 */            if (iHeight < 0) {
/* 17 */                iHeight = tabLayout.f4960W.getIntrinsicHeight();
                    }
/* 21 */            int i = tabLayout.f4980m0;
/* 23 */            if (i == 0) {
/* 61 */                height = getHeight() - iHeight;
/* 63 */                iHeight = getHeight();
                    } else if (i != 1) {
/* 29 */                height = 0;
/* 30 */                if (i != 2) {
/* 37 */                    iHeight = i != 3 ? 0 : getHeight();
                        }
                    } else {
/* 47 */                height = (getHeight() - iHeight) / 2;
/* 54 */                iHeight = (getHeight() + iHeight) / 2;
                    }
/* 77 */            if (tabLayout.f4960W.getBounds().width() > 0) {
/* 81 */                Rect bounds = tabLayout.f4960W.getBounds();
/* 91 */                tabLayout.f4960W.setBounds(bounds.left, height, bounds.right, iHeight);
/* 94 */                Drawable drawable = tabLayout.f4960W;
/* 96 */                int i2 = tabLayout.f4962a0;
/* 98 */                if (i2 != 0) {
/* 100 */                   s90.m8447g(drawable, i2);
                        } else {
/* 105 */                   s90.m8448h(drawable, null);
                        }
/* 108 */               drawable.draw(canvas);
                    }
/* 111 */           super.draw(canvas);
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             ValueAnimator valueAnimator = this.f9143a;
/* 6 */             if (valueAnimator == null || !valueAnimator.isRunning()) {
/* 22 */                m4242a();
                    } else {
/* 18 */                m4245d(this.f9144b, -1, false);
                    }
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 10 */            if (View.MeasureSpec.getMode(i) != 1073741824) {
/* 124 */               return;
                    }
/* 14 */            TabLayout tabLayout = this.f9146d;
/* 19 */            boolean z = true;
/* 20 */            if (tabLayout.f4978k0 == 1 || tabLayout.f4981n0 == 2) {
/* 26 */                int childCount = getChildCount();
/* 32 */                int iMax = 0;
/* 33 */                for (int i3 = 0; i3 < childCount; i3++) {
/* 35 */                    View childAt = getChildAt(i3);
/* 43 */                    if (childAt.getVisibility() == 0) {
/* 49 */                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                            }
                        }
/* 56 */                if (iMax <= 0) {
/* 124 */                   return;
                        }
/* 78 */                if (iMax * childCount <= getMeasuredWidth() - (((int) kb1.m6028A(getContext(), 16)) * 2)) {
/* 80 */                    boolean z2 = false;
/* 81 */                    for (int i4 = 0; i4 < childCount; i4++) {
/* 91 */                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
/* 96 */                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
/* 104 */                           layoutParams.width = iMax;
/* 106 */                           layoutParams.weight = 0.0f;
/* 108 */                           z2 = true;
                                }
                            }
/* 112 */                   z = z2;
                        } else {
/* 114 */                   tabLayout.f4978k0 = 0;
/* 116 */                   tabLayout.m2393n(false);
                        }
/* 119 */               if (z) {
/* 121 */                   super.onMeasure(i, i2);
                        }
                    }
                }
            }
