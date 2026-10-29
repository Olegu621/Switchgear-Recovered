            package androidx.constraintlayout.helper.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import androidx.constraintlayout.widget.VirtualLayout;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Arrays;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public class CircularFlow extends VirtualLayout {

                /* JADX INFO: renamed from: i0 */
                public static int f832i0;

                /* JADX INFO: renamed from: j0 */
                public static float f833j0;

                /* JADX INFO: renamed from: V */
                public ConstraintLayout f834V;

                /* JADX INFO: renamed from: W */
                public int f835W;

                /* JADX INFO: renamed from: a0 */
                public float[] f836a0;

                /* JADX INFO: renamed from: b0 */
                public int[] f837b0;

                /* JADX INFO: renamed from: c0 */
                public int f838c0;

                /* JADX INFO: renamed from: d0 */
                public int f839d0;

                /* JADX INFO: renamed from: e0 */
                public String f840e0;

                /* JADX INFO: renamed from: f0 */
                public String f841f0;

                /* JADX INFO: renamed from: g0 */
                public Float f842g0;

                /* JADX INFO: renamed from: h0 */
                public Integer f843h0;

                public CircularFlow(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                private void setAngles(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return;
                    }
/* 4 */             int i = 0;
/* 5 */             this.f839d0 = 0;
                    while (true) {
/* 9 */                 int iIndexOf = str.indexOf(44, i);
/* 14 */                if (iIndexOf == -1) {
/* 24 */                    m455s(str.substring(i).trim());
/* 27 */                    return;
                        } else {
/* 36 */                    m455s(str.substring(i, iIndexOf).trim());
/* 39 */                    i = iIndexOf + 1;
                        }
                    }
                }

                private void setRadius(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return;
                    }
/* 4 */             int i = 0;
/* 5 */             this.f838c0 = 0;
                    while (true) {
/* 9 */                 int iIndexOf = str.indexOf(44, i);
/* 14 */                if (iIndexOf == -1) {
/* 24 */                    m456t(str.substring(i).trim());
/* 27 */                    return;
                        } else {
/* 36 */                    m456t(str.substring(i, iIndexOf).trim());
/* 39 */                    i = iIndexOf + 1;
                        }
                    }
                }

                public float[] getAngles() {
/* 5 */             return Arrays.copyOf(this.f836a0, this.f839d0);
                }

                public int[] getRadius() {
/* 5 */             return Arrays.copyOf(this.f837b0, this.f838c0);
                }

                @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: k */
                public final void mo454k(AttributeSet attributeSet) {
/* 1 */             super.mo454k(attributeSet);
/* 4 */             if (attributeSet != null) {
/* 12 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
/* 16 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 22 */                for (int i = 0; i < indexCount; i++) {
/* 24 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 30 */                    if (index == R$styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
/* 36 */                        this.f835W = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_circularflow_angles) {
/* 43 */                        String string = typedArrayObtainStyledAttributes.getString(index);
/* 47 */                        this.f840e0 = string;
/* 49 */                        setAngles(string);
                            } else if (index == R$styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
/* 57 */                        String string2 = typedArrayObtainStyledAttributes.getString(index);
/* 61 */                        this.f841f0 = string2;
/* 63 */                        setRadius(string2);
                            } else if (index == R$styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
/* 77 */                        Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f833j0));
/* 81 */                        this.f842g0 = fValueOf;
/* 87 */                        setDefaultAngle(fValueOf.floatValue());
                            } else if (index == R$styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
/* 101 */                       Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f832i0));
/* 105 */                       this.f843h0 = numValueOf;
/* 111 */                       setDefaultRadius(numValueOf.intValue());
                            }
                        }
/* 117 */               typedArrayObtainStyledAttributes.recycle();
                    }
                }

                @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             String str = this.f840e0;
/* 7 */             if (str != null) {
/* 11 */                this.f836a0 = new float[1];
/* 13 */                setAngles(str);
                    }
/* 16 */            String str2 = this.f841f0;
/* 18 */            if (str2 != null) {
/* 22 */                this.f837b0 = new int[1];
/* 24 */                setRadius(str2);
                    }
/* 27 */            Float f = this.f842g0;
/* 29 */            if (f != null) {
/* 35 */                setDefaultAngle(f.floatValue());
                    }
/* 38 */            Integer num = this.f843h0;
/* 40 */            if (num != null) {
/* 46 */                setDefaultRadius(num.intValue());
                    }
/* 49 */            HashMap map = this.f1051v;
/* 57 */            this.f834V = (ConstraintLayout) getParent();
/* 62 */            for (int i = 0; i < this.f1045b; i++) {
/* 70 */                View viewM513b = this.f834V.m513b(this.f1044a[i]);
/* 74 */                if (viewM513b != null) {
/* 78 */                    int i2 = f832i0;
/* 80 */                    float f2 = f833j0;
/* 82 */                    int[] iArr = this.f837b0;
/* 86 */                    if (iArr == null || i >= iArr.length) {
/* 94 */                        Integer num2 = this.f843h0;
/* 96 */                        if (num2 == null || num2.intValue() == -1) {
/* 158 */                           AbstractC1245n0.m4876d("CircularFlow", "Added radius to view with id: " + ((String) map.get(Integer.valueOf(viewM513b.getId()))));
                                } else {
/* 108 */                           this.f838c0++;
/* 112 */                           if (this.f837b0 == null) {
/* 116 */                               this.f837b0 = new int[1];
                                    }
/* 118 */                           int[] radius = getRadius();
/* 122 */                           this.f837b0 = radius;
/* 127 */                           radius[this.f838c0 - 1] = i2;
                                }
                            } else {
/* 91 */                        i2 = iArr[i];
                            }
/* 161 */                   float[] fArr = this.f836a0;
/* 163 */                   if (fArr == null || i >= fArr.length) {
/* 171 */                       Float f3 = this.f842g0;
/* 173 */                       if (f3 == null || f3.floatValue() == -1.0f) {
/* 238 */                           AbstractC1245n0.m4876d("CircularFlow", "Added angle to view with id: " + ((String) map.get(Integer.valueOf(viewM513b.getId()))));
                                } else {
/* 188 */                           this.f839d0++;
/* 192 */                           if (this.f836a0 == null) {
/* 196 */                               this.f836a0 = new float[1];
                                    }
/* 198 */                           float[] angles = getAngles();
/* 202 */                           this.f836a0 = angles;
/* 207 */                           angles[this.f839d0 - 1] = f2;
                                }
                            } else {
/* 168 */                       f2 = fArr[i];
                            }
/* 245 */                   ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewM513b.getLayoutParams();
/* 247 */                   layoutParams.f1130r = f2;
/* 251 */                   layoutParams.f1126p = this.f835W;
/* 253 */                   layoutParams.f1128q = i2;
/* 255 */                   viewM513b.setLayoutParams(layoutParams);
                        }
                    }
/* 262 */           m506e();
                }

                /* JADX INFO: renamed from: s */
                public final void m455s(String str) {
                    float[] fArr;
/* 1 */             if (str == null || str.length() == 0 || this.f1046c == null || (fArr = this.f836a0) == null) {
/* 53 */                return;
                    }
/* 25 */            if (this.f839d0 + 1 > fArr.length) {
/* 34 */                this.f836a0 = Arrays.copyOf(fArr, fArr.length + 1);
                    }
/* 45 */            this.f836a0[this.f839d0] = Integer.parseInt(str);
/* 51 */            this.f839d0++;
                }

                public void setDefaultAngle(float f) {
/* 1 */             f833j0 = f;
                }

                public void setDefaultRadius(int i) {
/* 1 */             f832i0 = i;
                }

                /* JADX INFO: renamed from: t */
                public final void m456t(String str) {
                    int[] iArr;
/* 1 */             Context context = this.f1046c;
/* 3 */             if (str == null || str.length() == 0 || context == null || (iArr = this.f837b0) == null) {
/* 65 */                return;
                    }
/* 25 */            if (this.f838c0 + 1 > iArr.length) {
/* 34 */                this.f837b0 = Arrays.copyOf(iArr, iArr.length + 1);
                    }
/* 57 */            this.f837b0[this.f838c0] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
/* 63 */            this.f838c0++;
                }

/* 4 */         public CircularFlow(Context context, AttributeSet attributeSet, int i) {
/* 5 */             super(context, attributeSet, i);
                }
            }
