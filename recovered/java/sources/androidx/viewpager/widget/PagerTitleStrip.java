            package androidx.viewpager.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.widget.TextView;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import p000.b43;
            import p000.dr1;
            import p000.e43;
            import p000.er1;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @b43
            public class PagerTitleStrip extends ViewGroup {

                /* JADX INFO: renamed from: c0 */
                public static final int[] f1932c0 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

                /* JADX INFO: renamed from: d0 */
                public static final int[] f1933d0 = {R.attr.textAllCaps};

                /* JADX INFO: renamed from: U */
                public boolean f1934U;

                /* JADX INFO: renamed from: V */
                public final dr1 f1935V;

                /* JADX INFO: renamed from: W */
                public WeakReference f1936W;

                /* JADX INFO: renamed from: a */
                public ViewPager f1937a;

                /* JADX INFO: renamed from: a0 */
                public int f1938a0;

                /* JADX INFO: renamed from: b */
                public final TextView f1939b;

                /* JADX INFO: renamed from: b0 */
                public int f1940b0;

                /* JADX INFO: renamed from: c */
                public final TextView f1941c;

                /* JADX INFO: renamed from: d */
                public final TextView f1942d;

                /* JADX INFO: renamed from: e */
                public int f1943e;

                /* JADX INFO: renamed from: f */
                public float f1944f;

                /* JADX INFO: renamed from: i */
                public int f1945i;

                /* JADX INFO: renamed from: v */
                public int f1946v;

                /* JADX INFO: renamed from: w */
                public boolean f1947w;

                public PagerTitleStrip(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f1943e = -1;
/* 9 */             this.f1944f = -1.0f;
/* 16 */            this.f1935V = new dr1(this);
/* 20 */            TextView textView = new TextView(context);
/* 23 */            this.f1939b = textView;
/* 25 */            addView(textView);
/* 30 */            TextView textView2 = new TextView(context);
/* 33 */            this.f1941c = textView2;
/* 35 */            addView(textView2);
/* 40 */            TextView textView3 = new TextView(context);
/* 43 */            this.f1942d = textView3;
/* 45 */            addView(textView3);
/* 50 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1932c0);
/* 54 */            boolean z = false;
/* 55 */            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
/* 59 */            if (resourceId != 0) {
/* 61 */                textView.setTextAppearance(resourceId);
/* 64 */                textView2.setTextAppearance(resourceId);
/* 67 */                textView3.setTextAppearance(resourceId);
                    }
/* 71 */            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
/* 75 */            if (dimensionPixelSize != 0) {
                        float f = dimensionPixelSize;
/* 78 */                textView.setTextSize(0, f);
/* 81 */                textView2.setTextSize(0, f);
/* 84 */                textView3.setTextSize(0, f);
                    }
/* 92 */            if (typedArrayObtainStyledAttributes.hasValue(2)) {
/* 94 */                int color = typedArrayObtainStyledAttributes.getColor(2, 0);
/* 98 */                textView.setTextColor(color);
/* 101 */               textView2.setTextColor(color);
/* 104 */               textView3.setTextColor(color);
                    }
/* 114 */           this.f1946v = typedArrayObtainStyledAttributes.getInteger(3, 80);
/* 116 */           typedArrayObtainStyledAttributes.recycle();
/* 127 */           this.f1940b0 = textView2.getTextColors().getDefaultColor();
/* 132 */           setNonPrimaryAlpha(0.6f);
/* 135 */           TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
/* 137 */           textView.setEllipsize(truncateAt);
/* 140 */           textView2.setEllipsize(truncateAt);
/* 143 */           textView3.setEllipsize(truncateAt);
/* 146 */           if (resourceId != 0) {
/* 150 */               TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f1933d0);
/* 154 */               z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
/* 158 */               typedArrayObtainStyledAttributes2.recycle();
                    }
/* 161 */           if (z) {
/* 163 */               setSingleLineAllCaps(textView);
/* 166 */               setSingleLineAllCaps(textView2);
/* 169 */               setSingleLineAllCaps(textView3);
                    } else {
/* 173 */               textView.setSingleLine();
/* 176 */               textView2.setSingleLine();
/* 179 */               textView3.setSingleLine();
                    }
/* 196 */           this.f1945i = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
                }

                private static void setSingleLineAllCaps(TextView textView) {
/* 3 */             Context context = textView.getContext();
/* 7 */             er1 er1Var = new er1();
/* 20 */            er1Var.f7854a = context.getResources().getConfiguration().locale;
/* 22 */            textView.setTransformationMethod(er1Var);
                }

                /* JADX INFO: renamed from: a */
                public final void m1117a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
/* 1 */             dr1 dr1Var = this.f1935V;
/* 3 */             if (pagerAdapter != null) {
/* 5 */                 pagerAdapter.unregisterDataSetObserver(dr1Var);
/* 9 */                 this.f1936W = null;
                    }
/* 11 */            if (pagerAdapter2 != null) {
/* 13 */                pagerAdapter2.registerDataSetObserver(dr1Var);
/* 21 */                this.f1936W = new WeakReference(pagerAdapter2);
                    }
/* 23 */            ViewPager viewPager = this.f1937a;
/* 25 */            if (viewPager != null) {
/* 28 */                this.f1943e = -1;
/* 32 */                this.f1944f = -1.0f;
/* 38 */                m1118b(viewPager.getCurrentItem(), pagerAdapter2);
/* 41 */                requestLayout();
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m1118b(int i, PagerAdapter pagerAdapter) {
/* 9 */             int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
/* 11 */            this.f1947w = true;
/* 13 */            CharSequence pageTitle = null;
/* 25 */            CharSequence pageTitle2 = (i < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i - 1);
/* 26 */            TextView textView = this.f1939b;
/* 28 */            textView.setText(pageTitle2);
/* 40 */            CharSequence pageTitle3 = (pagerAdapter == null || i >= count) ? null : pagerAdapter.getPageTitle(i);
/* 41 */            TextView textView2 = this.f1941c;
/* 43 */            textView2.setText(pageTitle3);
/* 46 */            int i2 = i + 1;
/* 48 */            if (i2 < count && pagerAdapter != null) {
/* 52 */                pageTitle = pagerAdapter.getPageTitle(i2);
                    }
/* 56 */            TextView textView3 = this.f1942d;
/* 58 */            textView3.setText(pageTitle);
/* 87 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
/* 109 */           int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
/* 113 */           textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 116 */           textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 119 */           textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 122 */           this.f1943e = i;
/* 126 */           if (!this.f1934U) {
/* 130 */               mo1116c(i, this.f1944f, false);
                    }
/* 133 */           this.f1947w = false;
                }

                /* JADX INFO: renamed from: c */
                public void mo1116c(int i, float f, boolean z) {
                    int i2;
                    int i3;
                    int i4;
                    int i5;
/* 9 */             if (i != this.f1943e) {
/* 17 */                m1118b(i, this.f1937a.getAdapter());
                    } else if (!z && f == this.f1944f) {
/* 29 */                return;
                    }
/* 31 */            this.f1934U = true;
/* 33 */            TextView textView = this.f1939b;
/* 35 */            int measuredWidth = textView.getMeasuredWidth();
/* 39 */            TextView textView2 = this.f1941c;
/* 41 */            int measuredWidth2 = textView2.getMeasuredWidth();
/* 45 */            TextView textView3 = this.f1942d;
/* 47 */            int measuredWidth3 = textView3.getMeasuredWidth();
/* 51 */            int i6 = measuredWidth2 / 2;
/* 53 */            int width = getWidth();
/* 57 */            int height = getHeight();
/* 61 */            int paddingLeft = getPaddingLeft();
/* 65 */            int paddingRight = getPaddingRight();
/* 69 */            int paddingTop = getPaddingTop();
/* 73 */            int paddingBottom = getPaddingBottom();
/* 79 */            int i7 = paddingRight + i6;
/* 83 */            int i8 = (width - (paddingLeft + i6)) - i7;
/* 87 */            float f2 = f + 0.5f;
/* 93 */            if (f2 > 1.0f) {
/* 95 */                f2 -= 1.0f;
                    }
/* 105 */           int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
/* 107 */           int i10 = measuredWidth2 + i9;
/* 108 */           int baseline = textView.getBaseline();
/* 114 */           int baseline2 = textView2.getBaseline();
/* 120 */           int baseline3 = textView3.getBaseline();
/* 130 */           int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
/* 134 */           int i11 = iMax - baseline;
/* 136 */           int i12 = iMax - baseline2;
/* 138 */           int i13 = iMax - baseline3;
/* 164 */           int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i11, textView2.getMeasuredHeight() + i12), textView3.getMeasuredHeight() + i13);
/* 170 */           int i14 = this.f1946v & 112;
/* 174 */           if (i14 != 16) {
/* 178 */               if (i14 != 80) {
/* 180 */                   i3 = i11 + paddingTop;
/* 181 */                   i4 = paddingTop + i12;
/* 183 */                   i5 = paddingTop + i13;
                        } else {
/* 187 */                   i2 = (height - paddingBottom) - iMax2;
                        }
/* 205 */               textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
/* 213 */               int iMin = Math.min(paddingLeft, (i9 - this.f1945i) - measuredWidth);
/* 224 */               textView.layout(iMin, i3, iMin + measuredWidth, textView.getMeasuredHeight() + i3);
/* 234 */               int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f1945i);
/* 245 */               textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
/* 248 */               this.f1944f = f;
/* 251 */               this.f1934U = false;
                    }
/* 197 */           i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
/* 188 */           i3 = i11 + i2;
/* 189 */           i4 = i2 + i12;
/* 191 */           i5 = i2 + i13;
/* 205 */           textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
/* 213 */           int iMin2 = Math.min(paddingLeft, (i9 - this.f1945i) - measuredWidth);
/* 224 */           textView.layout(iMin2, i3, iMin2 + measuredWidth, textView.getMeasuredHeight() + i3);
/* 234 */           int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f1945i);
/* 245 */           textView3.layout(iMax4, i5, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i5);
/* 248 */           this.f1944f = f;
/* 251 */           this.f1934U = false;
                }

                public int getMinHeight() {
/* 1 */             Drawable background = getBackground();
/* 5 */             if (background != null) {
/* 7 */                 return background.getIntrinsicHeight();
                    }
/* 12 */            return 0;
                }

                public int getTextSpacing() {
/* 1 */             return this.f1945i;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             ViewParent parent = getParent();
/* 10 */            if (!(parent instanceof ViewPager)) {
/* 58 */                f42.m3656l("PagerTitleStrip must be a direct child of a ViewPager.");
/* 61 */                return;
                    }
/* 12 */            ViewPager viewPager = (ViewPager) parent;
/* 14 */            PagerAdapter adapter = viewPager.getAdapter();
/* 18 */            dr1 dr1Var = this.f1935V;
/* 20 */            viewPager.f1958H0 = dr1Var;
/* 24 */            if (viewPager.f1959I0 == null) {
/* 31 */                viewPager.f1959I0 = new ArrayList();
                    }
/* 35 */            viewPager.f1959I0.add(dr1Var);
/* 38 */            this.f1937a = viewPager;
/* 40 */            WeakReference weakReference = this.f1936W;
/* 52 */            m1117a(weakReference != null ? (PagerAdapter) weakReference.get() : null, adapter);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             ViewPager viewPager = this.f1937a;
/* 6 */             if (viewPager != null) {
/* 13 */                m1117a(viewPager.getAdapter(), null);
/* 16 */                ViewPager viewPager2 = this.f1937a;
/* 18 */                e43 e43Var = viewPager2.f1958H0;
/* 20 */                viewPager2.f1958H0 = null;
/* 22 */                ArrayList arrayList = viewPager2.f1959I0;
/* 24 */                if (arrayList != null) {
/* 28 */                    arrayList.remove(this.f1935V);
                        }
/* 31 */                this.f1937a = null;
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 3 */             if (this.f1937a != null) {
/* 5 */                 float f = this.f1944f;
/* 10 */                if (f < 0.0f) {
/* 13 */                    f = 0.0f;
                        }
/* 17 */                mo1116c(this.f1943e, f, true);
                    }
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    int iMax;
/* 7 */             if (View.MeasureSpec.getMode(i) != 1073741824) {
/* 92 */                f42.m3656l("Must measure with an exact width");
/* 95 */                return;
                    }
/* 17 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 19 */            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
/* 23 */            int size = View.MeasureSpec.getSize(i);
/* 33 */            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
/* 39 */            this.f1939b.measure(childMeasureSpec2, childMeasureSpec);
/* 42 */            TextView textView = this.f1941c;
/* 44 */            textView.measure(childMeasureSpec2, childMeasureSpec);
/* 49 */            this.f1942d.measure(childMeasureSpec2, childMeasureSpec);
/* 56 */            if (View.MeasureSpec.getMode(i2) == 1073741824) {
/* 58 */                iMax = View.MeasureSpec.getSize(i2);
                    } else {
/* 72 */                iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
                    }
/* 86 */            setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, textView.getMeasuredState() << 16));
                }

                @Override // android.view.View, android.view.ViewParent
                public final void requestLayout() {
/* 3 */             if (this.f1947w) {
/* 8 */                 return;
                    }
/* 5 */             super.requestLayout();
                }

                public void setGravity(int i) {
/* 1 */             this.f1946v = i;
/* 3 */             requestLayout();
                }

                public void setNonPrimaryAlpha(float f) {
/* 5 */             int i = ((int) (f * 255.0f)) & 255;
/* 7 */             this.f1938a0 = i;
/* 17 */            int i2 = (i << 24) | (this.f1940b0 & 16777215);
/* 20 */            this.f1939b.setTextColor(i2);
/* 25 */            this.f1942d.setTextColor(i2);
                }

                public void setTextColor(int i) {
/* 1 */             this.f1940b0 = i;
/* 5 */             this.f1941c.setTextColor(i);
/* 18 */            int i2 = (this.f1938a0 << 24) | (this.f1940b0 & 16777215);
/* 21 */            this.f1939b.setTextColor(i2);
/* 26 */            this.f1942d.setTextColor(i2);
                }

                public void setTextSpacing(int i) {
/* 1 */             this.f1945i = i;
/* 3 */             requestLayout();
                }
            }
