            package com.google.android.material.timepicker;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.RadialGradient;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Shader;
            import android.util.AttributeSet;
            import android.util.DisplayMetrics;
            import android.util.SparseArray;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.TextView;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$color;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.Arrays;
            import okhttp3.HttpUrl;
            import p000.C0828d1;
            import p000.InterfaceC2565zv;
            import p000.de3;
            import p000.e33;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 285 */   class ClockFaceView extends RadialViewGroup implements InterfaceC2565zv {

                /* JADX INFO: renamed from: j0 */
                public final ClockHandView f5093j0;

                /* JADX INFO: renamed from: k0 */
                public final Rect f5094k0;

                /* JADX INFO: renamed from: l0 */
                public final RectF f5095l0;

                /* JADX INFO: renamed from: m0 */
                public final SparseArray f5096m0;

                /* JADX INFO: renamed from: n0 */
                public final C0381c f5097n0;

                /* JADX INFO: renamed from: o0 */
                public final int[] f5098o0;

                /* JADX INFO: renamed from: p0 */
                public final float[] f5099p0;

                /* JADX INFO: renamed from: q0 */
                public final int f5100q0;

                /* JADX INFO: renamed from: r0 */
                public final int f5101r0;

                /* JADX INFO: renamed from: s0 */
                public final int f5102s0;

                /* JADX INFO: renamed from: t0 */
                public final int f5103t0;

                /* JADX INFO: renamed from: u0 */
                public final String[] f5104u0;

                /* JADX INFO: renamed from: v0 */
                public float f5105v0;

                /* JADX INFO: renamed from: w0 */
                public final ColorStateList f5106w0;

                public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f5094k0 = new Rect();
/* 16 */            this.f5095l0 = new RectF();
/* 20 */            SparseArray sparseArray = new SparseArray();
/* 23 */            this.f5096m0 = sparseArray;
/* 31 */            this.f5099p0 = new float[]{0.0f, 0.9f, 1.0f};
/* 37 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockFaceView, i, R$style.Widget_MaterialComponents_TimePicker_Clock);
/* 41 */            Resources resources = getResources();
/* 47 */            ColorStateList colorStateListM3033o = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.ClockFaceView_clockNumberTextColor);
/* 51 */            this.f5106w0 = colorStateListM3033o;
/* 60 */            LayoutInflater.from(context).inflate(R$layout.material_clockface_view, (ViewGroup) this, true);
/* 69 */            ClockHandView clockHandView = (ClockHandView) findViewById(R$id.material_clock_hand);
/* 71 */            this.f5093j0 = clockHandView;
/* 79 */            this.f5100q0 = resources.getDimensionPixelSize(R$dimen.material_clock_hand_padding);
/* 92 */            int colorForState = colorStateListM3033o.getColorForState(new int[]{R.attr.state_selected}, colorStateListM3033o.getDefaultColor());
/* 104 */           this.f5098o0 = new int[]{colorForState, colorForState, colorStateListM3033o.getDefaultColor()};
/* 108 */           clockHandView.f5108a.add(this);
/* 117 */           int defaultColor = v00.getColorStateList(context, R$color.material_timepicker_clockface).getDefaultColor();
/* 123 */           ColorStateList colorStateListM3033o2 = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.ClockFaceView_clockFaceBackgroundColor);
/* 134 */           setBackgroundColor(colorStateListM3033o2 != null ? colorStateListM3033o2.getDefaultColor() : defaultColor);
/* 146 */           getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0380b(this));
/* 149 */           setFocusable(true);
/* 152 */           typedArrayObtainStyledAttributes.recycle();
/* 160 */           this.f5097n0 = new C0381c(this);
/* 164 */           String[] strArr = new String[12];
/* 168 */           Arrays.fill(strArr, HttpUrl.FRAGMENT_ENCODE_SET);
/* 171 */           this.f5104u0 = strArr;
/* 177 */           LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
/* 181 */           int size = sparseArray.size();
/* 194 */           for (int i2 = 0; i2 < Math.max(this.f5104u0.length, size); i2++) {
/* 200 */               TextView textView = (TextView) sparseArray.get(i2);
/* 205 */               if (i2 >= this.f5104u0.length) {
/* 207 */                   removeView(textView);
/* 210 */                   sparseArray.remove(i2);
                        } else {
/* 214 */                   if (textView == null) {
/* 222 */                       textView = (TextView) layoutInflaterFrom.inflate(R$layout.material_clockface_textview, (ViewGroup) this, false);
/* 224 */                       sparseArray.put(i2, textView);
/* 227 */                       addView(textView);
                            }
/* 230 */                   textView.setVisibility(0);
/* 237 */                   textView.setText(this.f5104u0[i2]);
/* 246 */                   textView.setTag(R$id.material_value_index, Integer.valueOf(i2));
/* 251 */                   e33.m3318n(textView, this.f5097n0);
/* 256 */                   textView.setTextColor(this.f5106w0);
                        }
                    }
/* 268 */           this.f5101r0 = resources.getDimensionPixelSize(R$dimen.material_time_picker_minimum_screen_height);
/* 276 */           this.f5102s0 = resources.getDimensionPixelSize(R$dimen.material_time_picker_minimum_screen_width);
/* 284 */           this.f5103t0 = resources.getDimensionPixelSize(R$dimen.material_clock_size);
                }

                /* JADX INFO: renamed from: k */
                public final void m2426k() {
                    RadialGradient radialGradient;
/* 3 */             RectF rectF = this.f5093j0.f5112e;
/* 5 */             int i = 0;
                    while (true) {
/* 6 */                 SparseArray sparseArray = this.f5096m0;
/* 12 */                if (i >= sparseArray.size()) {
/* 121 */                   return;
                        }
/* 18 */                TextView textView = (TextView) sparseArray.get(i);
/* 20 */                if (textView != null) {
/* 23 */                    Rect rect = this.f5094k0;
/* 25 */                    textView.getDrawingRect(rect);
/* 28 */                    offsetDescendantRectToMyCoords(textView, rect);
/* 45 */                    textView.setSelected(rectF.contains(rect.centerX(), rect.centerY()));
/* 48 */                    RectF rectF2 = this.f5095l0;
/* 50 */                    rectF2.set(rect);
/* 63 */                    rectF2.offset(textView.getPaddingLeft(), textView.getPaddingTop());
/* 70 */                    if (RectF.intersects(rectF, rectF2)) {
/* 104 */                       radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.f5098o0, this.f5099p0, Shader.TileMode.CLAMP);
                            } else {
/* 72 */                        radialGradient = null;
                            }
/* 112 */                   textView.getPaint().setShader(radialGradient);
/* 115 */                   textView.invalidate();
                        }
/* 118 */               i++;
                    }
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 16 */            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0828d1.m2904b(1, this.f5104u0.length, 1).f6954a);
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             m2426k();
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 5 */             DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
/* 37 */            int iMax = (int) (this.f5103t0 / Math.max(Math.max(this.f5101r0 / displayMetrics.heightPixels, this.f5102s0 / displayMetrics.widthPixels), 1.0f));
/* 40 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
/* 44 */            setMeasuredDimension(iMax, iMax);
/* 47 */            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
                }

/* 286 */       public ClockFaceView(Context context, AttributeSet attributeSet) {
/* 287 */           this(context, attributeSet, R$attr.materialClockStyle);
                }
            }
