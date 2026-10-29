            package p000;

            import android.R;
            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.animation.FloatEvaluator;
            import android.animation.ObjectAnimator;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Build;
            import android.util.Property;
            import android.util.TypedValue;
            import android.view.View;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$integer;
            import com.google.android.material.bottomappbar.BottomAppBar;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class bk0 {

                /* JADX INFO: renamed from: A */
                public static final xg0 f2460A = AbstractC2246u8.f17412c;

                /* JADX INFO: renamed from: B */
                public static final int[] f2461B = {R.attr.state_pressed, R.attr.state_enabled};

                /* JADX INFO: renamed from: C */
                public static final int[] f2462C = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

                /* JADX INFO: renamed from: D */
                public static final int[] f2463D = {R.attr.state_focused, R.attr.state_enabled};

                /* JADX INFO: renamed from: E */
                public static final int[] f2464E = {R.attr.state_hovered, R.attr.state_enabled};

                /* JADX INFO: renamed from: F */
                public static final int[] f2465F = {R.attr.state_enabled};

                /* JADX INFO: renamed from: G */
                public static final int[] f2466G = new int[0];

                /* JADX INFO: renamed from: a */
                public tc2 f2467a;

                /* JADX INFO: renamed from: b */
                public ck0 f2468b;

                /* JADX INFO: renamed from: c */
                public RippleDrawable f2469c;

                /* JADX INFO: renamed from: d */
                public C0994hk f2470d;

                /* JADX INFO: renamed from: e */
                public RippleDrawable f2471e;

                /* JADX INFO: renamed from: f */
                public boolean f2472f;

                /* JADX INFO: renamed from: h */
                public float f2474h;

                /* JADX INFO: renamed from: i */
                public float f2475i;

                /* JADX INFO: renamed from: j */
                public float f2476j;

                /* JADX INFO: renamed from: k */
                public int f2477k;

                /* JADX INFO: renamed from: l */
                public Animator f2478l;

                /* JADX INFO: renamed from: m */
                public mk1 f2479m;

                /* JADX INFO: renamed from: n */
                public mk1 f2480n;

                /* JADX INFO: renamed from: p */
                public int f2482p;

                /* JADX INFO: renamed from: r */
                public ArrayList f2484r;

                /* JADX INFO: renamed from: s */
                public ArrayList f2485s;

                /* JADX INFO: renamed from: t */
                public ArrayList f2486t;

                /* JADX INFO: renamed from: u */
                public final FloatingActionButton f2487u;

                /* JADX INFO: renamed from: v */
                public final gr0 f2488v;

                /* JADX INFO: renamed from: g */
                public boolean f2473g = true;

                /* JADX INFO: renamed from: o */
                public float f2481o = 1.0f;

                /* JADX INFO: renamed from: q */
                public int f2483q = 0;

                /* JADX INFO: renamed from: w */
                public final Rect f2489w = new Rect();

                /* JADX INFO: renamed from: x */
                public final RectF f2490x = new RectF();

                /* JADX INFO: renamed from: y */
                public final RectF f2491y = new RectF();

                /* JADX INFO: renamed from: z */
                public final Matrix f2492z = new Matrix();

                public bk0(FloatingActionButton floatingActionButton, gr0 gr0Var) {
/* 11 */            int i = 0;
/* 42 */            this.f2487u = floatingActionButton;
/* 44 */            this.f2488v = gr0Var;
/* 48 */            we2 we2Var = new we2(1);
/* 53 */            dk0 dk0Var = (dk0) this;
/* 62 */            we2Var.m9557a(m1381d(new zj0(dk0Var, 1)));
/* 74 */            we2Var.m9557a(m1381d(new zj0(dk0Var, i)));
/* 86 */            we2Var.m9557a(m1381d(new zj0(dk0Var, i)));
/* 98 */            we2Var.m9557a(m1381d(new zj0(dk0Var, i)));
/* 111 */           we2Var.m9557a(m1381d(new zj0(dk0Var, 2)));
/* 123 */           we2Var.m9557a(m1381d(new yj0(dk0Var)));
/* 126 */           floatingActionButton.getRotation();
                }

                /* JADX INFO: renamed from: d */
                public static ValueAnimator m1381d(ak0 ak0Var) {
/* 3 */             ValueAnimator valueAnimator = new ValueAnimator();
/* 8 */             valueAnimator.setInterpolator(f2460A);
/* 13 */            valueAnimator.setDuration(100L);
/* 16 */            valueAnimator.addListener(ak0Var);
/* 19 */            valueAnimator.addUpdateListener(ak0Var);
/* 28 */            valueAnimator.setFloatValues(0.0f, 1.0f);
/* 31 */            return valueAnimator;
                }

                /* JADX INFO: renamed from: a */
                public final void m1382a(float f, Matrix matrix) {
/* 1 */             matrix.reset();
/* 6 */             Drawable drawable = this.f2487u.getDrawable();
/* 10 */            if (drawable == null || this.f2482p == 0) {
/* 54 */                return;
                    }
/* 16 */            float intrinsicWidth = drawable.getIntrinsicWidth();
/* 21 */            float intrinsicHeight = drawable.getIntrinsicHeight();
/* 26 */            RectF rectF = this.f2490x;
/* 29 */            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
/* 32 */            float f2 = this.f2482p;
/* 35 */            RectF rectF2 = this.f2491y;
/* 37 */            rectF2.set(0.0f, 0.0f, f2, f2);
/* 42 */            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
/* 50 */            float f3 = this.f2482p / 2.0f;
/* 51 */            matrix.postScale(f, f, f3, f3);
                }

                /* JADX INFO: renamed from: b */
                public final AnimatorSet m1383b(mk1 mk1Var, float f, float f2, float f3) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Property property = View.ALPHA;
/* 9 */             float[] fArr = {f};
/* 14 */            FloatingActionButton floatingActionButton = this.f2487u;
/* 16 */            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
/* 26 */            mk1Var.m6672f("opacity").m6995a(objectAnimatorOfFloat);
/* 29 */            arrayList.add(objectAnimatorOfFloat);
/* 38 */            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
/* 48 */            mk1Var.m6672f("scale").m6995a(objectAnimatorOfFloat2);
/* 51 */            int i = Build.VERSION.SDK_INT;
/* 55 */            if (i == 26) {
/* 60 */                pj0 pj0Var = new pj0(1);
/* 68 */                pj0Var.f15141b = new FloatEvaluator();
/* 70 */                objectAnimatorOfFloat2.setEvaluator(pj0Var);
                    }
/* 73 */            arrayList.add(objectAnimatorOfFloat2);
/* 82 */            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
/* 90 */            mk1Var.m6672f("scale").m6995a(objectAnimatorOfFloat3);
/* 93 */            if (i == 26) {
/* 98 */                pj0 pj0Var2 = new pj0(1);
/* 106 */               pj0Var2.f15141b = new FloatEvaluator();
/* 108 */               objectAnimatorOfFloat3.setEvaluator(pj0Var2);
                    }
/* 111 */           arrayList.add(objectAnimatorOfFloat3);
/* 114 */           Matrix matrix = this.f2492z;
/* 116 */           m1382a(f3, matrix);
/* 138 */           ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new C1794ji(), new wj0(this), new Matrix(matrix));
/* 148 */           mk1Var.m6672f("iconScale").m6995a(objectAnimatorOfObject);
/* 151 */           arrayList.add(objectAnimatorOfObject);
/* 156 */           AnimatorSet animatorSet = new AnimatorSet();
/* 159 */           w11.m9455y(animatorSet, arrayList);
/* 162 */           return animatorSet;
                }

                /* JADX INFO: renamed from: c */
                public final AnimatorSet m1384c(float f, float f2, float f3) {
/* 3 */             AnimatorSet animatorSet = new AnimatorSet();
/* 8 */             ArrayList arrayList = new ArrayList();
/* 17 */            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
/* 21 */            FloatingActionButton floatingActionButton = this.f2487u;
/* 55 */            valueAnimatorOfFloat.addUpdateListener(new xj0(this, floatingActionButton.getAlpha(), f, floatingActionButton.getScaleX(), f2, floatingActionButton.getScaleY(), this.f2481o, f3, new Matrix(this.f2492z)));
/* 58 */            arrayList.add(valueAnimatorOfFloat);
/* 61 */            w11.m9455y(animatorSet, arrayList);
/* 64 */            Context context = floatingActionButton.getContext();
/* 68 */            int i = R$attr.motionDurationLong1;
/* 80 */            int integer = floatingActionButton.getContext().getResources().getInteger(R$integer.material_motion_duration_long_1);
/* 84 */            TypedValue typedValueM10197C = yy1.m10197C(context, i);
/* 88 */            if (typedValueM10197C != null && typedValueM10197C.type == 16) {
/* 96 */                integer = typedValueM10197C.data;
                    }
/* 99 */            animatorSet.setDuration(integer);
/* 114 */           animatorSet.setInterpolator(hu0.m4348y0(floatingActionButton.getContext(), R$attr.motionEasingStandard, AbstractC2246u8.f17411b));
/* 117 */           return animatorSet;
                }

                /* JADX INFO: renamed from: e */
                public abstract void mo1385e(float f, float f2, float f3);

                /* JADX INFO: renamed from: f */
                public final void m1386f() {
/* 1 */             ArrayList<uj0> arrayList = this.f2486t;
/* 3 */             if (arrayList != null) {
/* 13 */                for (uj0 uj0Var : arrayList) {
/* 21 */                    d52 d52Var = uj0Var.f17554a;
/* 23 */                    FloatingActionButton floatingActionButton = uj0Var.f17555b;
/* 25 */                    d52Var.getClass();
/* 46 */                    ((BottomAppBar) d52Var.f7001a).f4452K0.m3743o(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m1387g() {
/* 1 */             ArrayList<uj0> arrayList = this.f2486t;
/* 3 */             if (arrayList != null) {
/* 13 */                for (uj0 uj0Var : arrayList) {
/* 21 */                    d52 d52Var = uj0Var.f17554a;
/* 23 */                    FloatingActionButton floatingActionButton = uj0Var.f17555b;
/* 25 */                    d52Var.getClass();
/* 28 */                    float translationX = floatingActionButton.getTranslationX();
/* 34 */                    BottomAppBar bottomAppBar = (BottomAppBar) d52Var.f7001a;
/* 1 */                     C1967nk topEdgeTreatment = bottomAppBar.getTopEdgeTreatment();
/* 40 */                    fd1 fd1Var = bottomAppBar.f4452K0;
/* 46 */                    if (topEdgeTreatment.f14325e0 != translationX) {
/* 52 */                        bottomAppBar.getTopEdgeTreatment().f14325e0 = translationX;
/* 54 */                        fd1Var.invalidateSelf();
                            }
/* 62 */                    float scaleY = 0.0f;
/* 63 */                    float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
/* 75 */                    if (bottomAppBar.getTopEdgeTreatment().f14324d0 != fMax) {
/* 81 */                        bottomAppBar.getTopEdgeTreatment().m6994m(fMax);
/* 84 */                        fd1Var.invalidateSelf();
                            }
/* 91 */                    if (floatingActionButton.getVisibility() == 0) {
/* 93 */                        scaleY = floatingActionButton.getScaleY();
                            }
/* 97 */                    fd1Var.m3743o(scaleY);
                        }
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m1388h(tc2 tc2Var) {
/* 1 */             this.f2467a = tc2Var;
/* 3 */             ck0 ck0Var = this.f2468b;
/* 5 */             if (ck0Var != null) {
/* 7 */                 ck0Var.setShapeAppearanceModel(tc2Var);
                    }
/* 10 */            Drawable.Callback callback = this.f2469c;
/* 14 */            if (callback instanceof ed2) {
/* 18 */                ((ed2) callback).setShapeAppearanceModel(tc2Var);
                    }
/* 21 */            C0994hk c0994hk = this.f2470d;
/* 23 */            if (c0994hk != null) {
/* 25 */                c0994hk.f9117o = tc2Var;
/* 27 */                c0994hk.invalidateSelf();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:16:0x005d  */
                /* JADX INFO: renamed from: i */
                public final void m1389i() {
/* 2 */             dk0 dk0Var = (dk0) this;
/* 4 */             gr0 gr0Var = dk0Var.f2488v;
/* 10 */            boolean z = ((FloatingActionButton) gr0Var.f8789a).f4744V;
/* 12 */            boolean z2 = dk0Var.f2472f;
/* 14 */            Rect rect = this.f2489w;
/* 16 */            FloatingActionButton floatingActionButton = dk0Var.f2487u;
/* 19 */            if (z) {
/* 30 */                int sizeDimension = z2 ? (dk0Var.f2477k - floatingActionButton.getSizeDimension()) / 2 : 0;
/* 44 */                float elevation = dk0Var.f2473g ? floatingActionButton.getElevation() + dk0Var.f2476j : 0.0f;
/* 51 */                int iMax = Math.max(sizeDimension, (int) Math.ceil(elevation));
/* 64 */                int iMax2 = Math.max(sizeDimension, (int) Math.ceil(elevation * 1.5f));
/* 68 */                rect.set(iMax, iMax2, iMax, iMax2);
                    } else if (z2) {
/* 74 */                int sizeDimension2 = floatingActionButton.getSizeDimension();
/* 78 */                int i = dk0Var.f2477k;
/* 80 */                if (sizeDimension2 >= i) {
/* 94 */                    rect.set(0, 0, 0, 0);
                        } else {
/* 88 */                    int sizeDimension3 = (i - floatingActionButton.getSizeDimension()) / 2;
/* 90 */                    rect.set(sizeDimension3, sizeDimension3, sizeDimension3, sizeDimension3);
                        }
                    } else {
/* 94 */                rect.set(0, 0, 0, 0);
                    }
/* 101 */           de3.m3027i(this.f2471e, "Didn't initialize content background");
/* 108 */           boolean z3 = ((FloatingActionButton) gr0Var.f8789a).f4744V;
/* 110 */           gr0 gr0Var2 = this.f2488v;
/* 112 */           if (z3 || (dk0Var.f2472f && floatingActionButton.getSizeDimension() < dk0Var.f2477k)) {
/* 1 */                 super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2471e, rect.left, rect.top, rect.right, rect.bottom));
                    } else {
/* 126 */               RippleDrawable rippleDrawable = this.f2471e;
/* 128 */               if (rippleDrawable != null) {
/* 1 */                     super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
                        } else {
/* 138 */                   gr0Var2.getClass();
                        }
                    }
/* 164 */           int i2 = rect.left;
/* 166 */           int i3 = rect.top;
/* 168 */           int i4 = rect.right;
/* 170 */           int i5 = rect.bottom;
/* 174 */           FloatingActionButton floatingActionButton2 = (FloatingActionButton) gr0Var2.f8789a;
/* 178 */           floatingActionButton2.f4745W.set(i2, i3, i4, i5);
/* 181 */           int i6 = floatingActionButton2.f4757w;
/* 187 */           floatingActionButton2.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
                }
            }
