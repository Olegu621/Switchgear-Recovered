            package androidx.viewpager.widget;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import android.view.ViewConfiguration;
            import android.widget.TextView;
            import p000.cr1;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PagerTabStrip extends PagerTitleStrip {

                /* JADX INFO: renamed from: e0 */
                public int f1916e0;

                /* JADX INFO: renamed from: f0 */
                public final int f1917f0;

                /* JADX INFO: renamed from: g0 */
                public final int f1918g0;

                /* JADX INFO: renamed from: h0 */
                public final int f1919h0;

                /* JADX INFO: renamed from: i0 */
                public final int f1920i0;

                /* JADX INFO: renamed from: j0 */
                public final int f1921j0;

                /* JADX INFO: renamed from: k0 */
                public final Paint f1922k0;

                /* JADX INFO: renamed from: l0 */
                public final Rect f1923l0;

                /* JADX INFO: renamed from: m0 */
                public int f1924m0;

                /* JADX INFO: renamed from: n0 */
                public boolean f1925n0;

                /* JADX INFO: renamed from: o0 */
                public boolean f1926o0;

                /* JADX INFO: renamed from: p0 */
                public final int f1927p0;

                /* JADX INFO: renamed from: q0 */
                public boolean f1928q0;

                /* JADX INFO: renamed from: r0 */
                public float f1929r0;

                /* JADX INFO: renamed from: s0 */
                public float f1930s0;

                /* JADX INFO: renamed from: t0 */
                public final int f1931t0;

                public PagerTabStrip(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             Paint paint = new Paint();
/* 9 */             this.f1922k0 = paint;
/* 16 */            this.f1923l0 = new Rect();
/* 20 */            this.f1924m0 = 255;
/* 23 */            this.f1925n0 = false;
/* 25 */            this.f1926o0 = false;
/* 27 */            int i = this.f1940b0;
/* 29 */            this.f1916e0 = i;
/* 31 */            paint.setColor(i);
/* 42 */            float f = context.getResources().getDisplayMetrics().density;
/* 51 */            this.f1917f0 = (int) ((3.0f * f) + 0.5f);
/* 58 */            this.f1918g0 = (int) ((6.0f * f) + 0.5f);
/* 64 */            this.f1919h0 = (int) (64.0f * f);
/* 71 */            this.f1921j0 = (int) ((16.0f * f) + 0.5f);
/* 78 */            this.f1927p0 = (int) ((1.0f * f) + 0.5f);
/* 85 */            this.f1920i0 = (int) ((f * 32.0f) + 0.5f);
/* 95 */            this.f1931t0 = ViewConfiguration.get(context).getScaledTouchSlop();
/* 113 */           setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
/* 120 */           setTextSpacing(getTextSpacing());
/* 123 */           setWillNotDraw(false);
/* 129 */           this.f1939b.setFocusable(true);
/* 139 */           this.f1939b.setOnClickListener(new cr1(this, 0));
/* 144 */           this.f1942d.setFocusable(true);
/* 154 */           this.f1942d.setOnClickListener(new cr1(this, 1));
/* 161 */           if (getBackground() == null) {
/* 163 */               this.f1925n0 = true;
                    }
                }

                @Override // androidx.viewpager.widget.PagerTitleStrip
                /* JADX INFO: renamed from: c */
                public final void mo1116c(int i, float f, boolean z) {
/* 1 */             int height = getHeight();
/* 5 */             TextView textView = this.f1941c;
/* 7 */             int left = textView.getLeft();
/* 11 */            int i2 = this.f1921j0;
/* 18 */            int right = textView.getRight() + i2;
/* 21 */            int i3 = height - this.f1917f0;
/* 23 */            Rect rect = this.f1923l0;
/* 25 */            rect.set(left - i2, i3, right, height);
/* 28 */            super.mo1116c(i, f, z);
/* 45 */            this.f1924m0 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
/* 57 */            rect.union(textView.getLeft() - i2, i3, textView.getRight() + i2, height);
/* 60 */            invalidate(rect);
                }

                public boolean getDrawFullUnderline() {
/* 1 */             return this.f1925n0;
                }

                @Override // androidx.viewpager.widget.PagerTitleStrip
                public int getMinHeight() {
/* 7 */             return Math.max(super.getMinHeight(), this.f1920i0);
                }

                public int getTabIndicatorColor() {
/* 1 */             return this.f1916e0;
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 1 */             super.onDraw(canvas);
/* 4 */             int height = getHeight();
/* 8 */             TextView textView = this.f1941c;
/* 10 */            int left = textView.getLeft();
/* 14 */            int i = this.f1921j0;
/* 16 */            int i2 = left - i;
/* 21 */            int right = textView.getRight() + i;
/* 24 */            int i3 = height - this.f1917f0;
/* 36 */            int i4 = (this.f1924m0 << 24) | (this.f1916e0 & 16777215);
/* 37 */            Paint paint = this.f1922k0;
/* 39 */            paint.setColor(i4);
                    float f = height;
/* 47 */            canvas.drawRect(i2, i3, right, f, paint);
/* 52 */            if (this.f1925n0) {
/* 60 */                paint.setColor((this.f1916e0 & 16777215) | (-16777216));
/* 82 */                canvas.drawRect(getPaddingLeft(), height - this.f1927p0, getWidth() - getPaddingRight(), f, paint);
                    }
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             int action = motionEvent.getAction();
/* 6 */             if (action != 0 && this.f1928q0) {
/* 5 */                 return false;
                    }
/* 13 */            float x = motionEvent.getX();
/* 17 */            float y = motionEvent.getY();
/* 22 */            if (action == 0) {
/* 104 */               this.f1929r0 = x;
/* 106 */               this.f1930s0 = y;
/* 108 */               this.f1928q0 = false;
/* 21 */                return true;
                    }
/* 24 */            if (action == 1) {
/* 58 */                TextView textView = this.f1941c;
/* 60 */                int left = textView.getLeft();
/* 64 */                int i = this.f1921j0;
/* 70 */                if (x < left - i) {
/* 72 */                    ViewPager viewPager = this.f1937a;
/* 79 */                    viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
/* 21 */                    return true;
                        }
/* 91 */                if (x > textView.getRight() + i) {
/* 93 */                    ViewPager viewPager2 = this.f1937a;
/* 100 */                   viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                        }
                    } else if (action == 2) {
/* 33 */                float fAbs = Math.abs(x - this.f1929r0);
/* 37 */                float f = this.f1931t0;
/* 42 */                if (fAbs > f || Math.abs(y - this.f1930s0) > f) {
/* 55 */                    this.f1928q0 = true;
/* 21 */                    return true;
                        }
                    }
/* 21 */            return true;
                }

                @Override // android.view.View
                public void setBackgroundColor(int i) {
/* 1 */             super.setBackgroundColor(i);
/* 6 */             if (this.f1926o0) {
/* 18 */                return;
                    }
/* 16 */            this.f1925n0 = (i & (-16777216)) == 0;
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 6 */             if (this.f1926o0) {
/* 15 */                return;
                    }
/* 13 */            this.f1925n0 = drawable == null;
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 6 */             if (this.f1926o0) {
/* 15 */                return;
                    }
/* 13 */            this.f1925n0 = i == 0;
                }

                public void setDrawFullUnderline(boolean z) {
/* 1 */             this.f1925n0 = z;
/* 4 */             this.f1926o0 = true;
/* 6 */             invalidate();
                }

                @Override // android.view.View
                public final void setPadding(int i, int i2, int i3, int i4) {
/* 1 */             int i5 = this.f1918g0;
/* 3 */             if (i4 < i5) {
/* 5 */                 i4 = i5;
                    }
/* 6 */             super.setPadding(i, i2, i3, i4);
                }

                public void setTabIndicatorColor(int i) {
/* 1 */             this.f1916e0 = i;
/* 5 */             this.f1922k0.setColor(i);
/* 8 */             invalidate();
                }

                public void setTabIndicatorColorResource(int i) {
/* 9 */             setTabIndicatorColor(v00.getColor(getContext(), i));
                }

                @Override // androidx.viewpager.widget.PagerTitleStrip
                public void setTextSpacing(int i) {
/* 1 */             int i2 = this.f1919h0;
/* 3 */             if (i < i2) {
/* 5 */                 i = i2;
                    }
/* 6 */             super.setTextSpacing(i);
                }
            }
