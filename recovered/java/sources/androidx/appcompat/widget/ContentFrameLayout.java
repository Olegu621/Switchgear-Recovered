            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.util.DisplayMetrics;
            import android.util.TypedValue;
            import android.view.View;
            import android.widget.FrameLayout;
            import p000.C0829d2;
            import p000.LayoutInflaterFactory2C2324wa;
            import p000.g00;
            import p000.gr0;
            import p000.jg1;
            import p000.m50;
            import p000.p43;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public class ContentFrameLayout extends FrameLayout {

                /* JADX INFO: renamed from: a */
                public TypedValue f544a;

                /* JADX INFO: renamed from: b */
                public TypedValue f545b;

                /* JADX INFO: renamed from: c */
                public TypedValue f546c;

                /* JADX INFO: renamed from: d */
                public TypedValue f547d;

                /* JADX INFO: renamed from: e */
                public TypedValue f548e;

                /* JADX INFO: renamed from: f */
                public TypedValue f549f;

                /* JADX INFO: renamed from: i */
                public final Rect f550i;

                /* JADX INFO: renamed from: v */
                public g00 f551v;

                public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f550i = new Rect();
                }

                public TypedValue getFixedHeightMajor() {
/* 3 */             if (this.f548e == null) {
/* 10 */                this.f548e = new TypedValue();
                    }
/* 12 */            return this.f548e;
                }

                public TypedValue getFixedHeightMinor() {
/* 3 */             if (this.f549f == null) {
/* 10 */                this.f549f = new TypedValue();
                    }
/* 12 */            return this.f549f;
                }

                public TypedValue getFixedWidthMajor() {
/* 3 */             if (this.f546c == null) {
/* 10 */                this.f546c = new TypedValue();
                    }
/* 12 */            return this.f546c;
                }

                public TypedValue getFixedWidthMinor() {
/* 3 */             if (this.f547d == null) {
/* 10 */                this.f547d = new TypedValue();
                    }
/* 12 */            return this.f547d;
                }

                public TypedValue getMinWidthMajor() {
/* 3 */             if (this.f544a == null) {
/* 10 */                this.f544a = new TypedValue();
                    }
/* 12 */            return this.f544a;
                }

                public TypedValue getMinWidthMinor() {
/* 3 */             if (this.f545b == null) {
/* 10 */                this.f545b = new TypedValue();
                    }
/* 12 */            return this.f545b;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             g00 g00Var = this.f551v;
/* 6 */             if (g00Var != null) {
/* 8 */                 g00Var.getClass();
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
                    C0062b c0062b;
/* 1 */             super.onDetachedFromWindow();
/* 4 */             g00 g00Var = this.f551v;
/* 6 */             if (g00Var != null) {
/* 12 */                LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) ((gr0) g00Var).f8789a;
/* 14 */                m50 m50Var = layoutInflaterFactory2C2324wa.f18517c0;
/* 16 */                if (m50Var != null) {
/* 18 */                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) m50Var;
/* 20 */                    actionBarOverlayLayout.m345e();
/* 29 */                    ActionMenuView actionMenuView = ((C0073m) actionBarOverlayLayout.f439e).f762a.f696a;
/* 31 */                    if (actionMenuView != null && (c0062b = actionMenuView.f461h0) != null) {
/* 37 */                        c0062b.m424j();
/* 40 */                        C0829d2 c0829d2 = c0062b.f749f0;
/* 42 */                        if (c0829d2 != null && c0829d2.m10351b()) {
/* 52 */                            c0829d2.f20144i.dismiss();
                                }
                            }
                        }
/* 57 */                if (layoutInflaterFactory2C2324wa.f18522h0 != null) {
/* 67 */                    layoutInflaterFactory2C2324wa.f18511W.getDecorView().removeCallbacks(layoutInflaterFactory2C2324wa.f18523i0);
/* 76 */                    if (layoutInflaterFactory2C2324wa.f18522h0.isShowing()) {
                                try {
/* 80 */                            layoutInflaterFactory2C2324wa.f18522h0.dismiss();
                                } catch (IllegalArgumentException unused) {
                                }
                            }
/* 84 */                    layoutInflaterFactory2C2324wa.f18522h0 = null;
                        }
/* 86 */                p43 p43Var = layoutInflaterFactory2C2324wa.f18524j0;
/* 88 */                if (p43Var != null) {
/* 90 */                    p43Var.m7336b();
                        }
/* 98 */                jg1 jg1Var = layoutInflaterFactory2C2324wa.m9510z(0).f17937h;
/* 100 */               if (jg1Var != null) {
/* 103 */                   jg1Var.m5803c(true);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:21:0x004e  */
                /* JADX WARN: Code duplicated, block: B:22:0x0062  */
                /* JADX WARN: Code duplicated, block: B:37:0x008a  */
                /* JADX WARN: Code duplicated, block: B:38:0x009d  */
                /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:58:0x00de  */
                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    int iMakeMeasureSpec;
                    boolean z;
                    int iMakeMeasureSpec2;
                    int i3;
                    int i4;
                    float fraction;
                    int i5;
                    int i6;
                    float fraction2;
                    int i7;
                    int i8;
                    float fraction3;
/* 11 */            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
/* 19 */            boolean z2 = true;
/* 25 */            boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
/* 26 */            int mode = View.MeasureSpec.getMode(i);
/* 30 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 34 */            Rect rect = this.f550i;
/* 42 */            if (mode != Integer.MIN_VALUE) {
/* 99 */                iMakeMeasureSpec = i;
/* 101 */               z = false;
                    } else {
/* 49 */                TypedValue typedValue = z3 ? this.f547d : this.f546c;
/* 51 */                if (typedValue == null || (i7 = typedValue.type) == 0) {
/* 99 */                    iMakeMeasureSpec = i;
/* 101 */                   z = false;
                        } else {
/* 57 */                    if (i7 == 5) {
/* 59 */                        fraction3 = typedValue.getDimension(displayMetrics);
                            } else {
/* 65 */                        if (i7 == 6) {
/* 67 */                            int i9 = displayMetrics.widthPixels;
/* 71 */                            fraction3 = typedValue.getFraction(i9, i9);
                                } else {
/* 76 */                            i8 = 0;
                                }
/* 77 */                        if (i8 > 0) {
/* 93 */                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
/* 97 */                            z = true;
                                } else {
/* 99 */                            iMakeMeasureSpec = i;
/* 101 */                           z = false;
                                }
                            }
/* 63 */                    i8 = (int) fraction3;
/* 77 */                    if (i8 > 0) {
/* 93 */                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
/* 97 */                        z = true;
                            } else {
/* 99 */                        iMakeMeasureSpec = i;
/* 101 */                       z = false;
                            }
                        }
                    }
/* 102 */           if (mode2 != Integer.MIN_VALUE) {
/* 158 */               iMakeMeasureSpec2 = i2;
                    } else {
/* 109 */               TypedValue typedValue2 = z3 ? this.f548e : this.f549f;
/* 111 */               if (typedValue2 == null || (i5 = typedValue2.type) == 0) {
/* 158 */                   iMakeMeasureSpec2 = i2;
                        } else {
/* 117 */                   if (i5 == 5) {
/* 119 */                       fraction2 = typedValue2.getDimension(displayMetrics);
                            } else {
/* 125 */                       if (i5 == 6) {
/* 127 */                           int i10 = displayMetrics.heightPixels;
/* 131 */                           fraction2 = typedValue2.getFraction(i10, i10);
                                } else {
/* 136 */                           i6 = 0;
                                }
/* 137 */                       if (i6 > 0) {
/* 153 */                           iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                } else {
/* 158 */                           iMakeMeasureSpec2 = i2;
                                }
                            }
/* 123 */                   i6 = (int) fraction2;
/* 137 */                   if (i6 > 0) {
/* 153 */                       iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                            } else {
/* 158 */                       iMakeMeasureSpec2 = i2;
                            }
                        }
                    }
/* 160 */           super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 163 */           int measuredWidth = getMeasuredWidth();
/* 167 */           int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
/* 171 */           if (z || mode != Integer.MIN_VALUE) {
/* 223 */               z2 = false;
                    } else {
/* 180 */               TypedValue typedValue3 = z3 ? this.f545b : this.f544a;
/* 182 */               if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
/* 223 */                   z2 = false;
                        } else {
/* 188 */                   if (i3 == 5) {
/* 190 */                       fraction = typedValue3.getDimension(displayMetrics);
                            } else {
/* 196 */                       if (i3 == 6) {
/* 198 */                           int i11 = displayMetrics.widthPixels;
/* 202 */                           fraction = typedValue3.getFraction(i11, i11);
                                } else {
/* 207 */                           i4 = 0;
                                }
/* 208 */                       if (i4 > 0) {
/* 215 */                           i4 -= rect.left + rect.right;
                                }
/* 216 */                       if (measuredWidth < i4) {
/* 218 */                           iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                } else {
/* 223 */                           z2 = false;
                                }
                            }
/* 194 */                   i4 = (int) fraction;
/* 208 */                   if (i4 > 0) {
/* 215 */                       i4 -= rect.left + rect.right;
                            }
/* 216 */                   if (measuredWidth < i4) {
/* 218 */                       iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                            } else {
/* 223 */                       z2 = false;
                            }
                        }
                    }
/* 224 */           if (z2) {
/* 226 */               super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    }
                }

                public void setAttachListener(g00 g00Var) {
/* 1 */             this.f551v = g00Var;
                }

/* 11 */        public ContentFrameLayout(Context context, AttributeSet attributeSet) {
/* 12 */            this(context, attributeSet, 0);
                }
            }
