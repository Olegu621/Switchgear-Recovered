            package androidx.constraintlayout.motion.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.os.Bundle;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.util.SparseIntArray;
            import android.view.Display;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.AccelerateDecelerateInterpolator;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.AnimationUtils;
            import android.view.animation.AnticipateInterpolator;
            import android.view.animation.BounceInterpolator;
            import android.view.animation.DecelerateInterpolator;
            import android.view.animation.Interpolator;
            import android.view.animation.OvershootInterpolator;
            import androidx.constraintlayout.helper.widget.MotionEffect;
            import androidx.constraintlayout.widget.C0076c;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$id;
            import androidx.constraintlayout.widget.R$styleable;
            import androidx.core.widget.NestedScrollView;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C0168b5;
            import p000.C1954n7;
            import p000.C2125qz;
            import p000.C2131r4;
            import p000.C2162rz;
            import p000.C2199sz;
            import p000.C2236tz;
            import p000.C2326wc;
            import p000.C2569zz;
            import p000.RunnableC2495ye;
            import p000.ViewOnTouchListenerC2145ri;
            import p000.a00;
            import p000.a31;
            import p000.a43;
            import p000.ak1;
            import p000.cg2;
            import p000.ch2;
            import p000.ck1;
            import p000.d31;
            import p000.d53;
            import p000.de3;
            import p000.dk1;
            import p000.e53;
            import p000.ek1;
            import p000.fk1;
            import p000.fm0;
            import p000.gk1;
            import p000.gr0;
            import p000.hk1;
            import p000.ik1;
            import p000.ji1;
            import p000.jk1;
            import p000.kk1;
            import p000.lk1;
            import p000.m31;
            import p000.mq2;
            import p000.q62;
            import p000.qm1;
            import p000.w43;
            import p000.wg2;
            import p000.x70;
            import p000.xg2;
            import p000.xj1;
            import p000.yj1;
            import p000.zj1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public class MotionLayout extends ConstraintLayout implements qm1 {

                /* JADX INFO: renamed from: s1 */
                public static boolean f875s1;

                /* JADX INFO: renamed from: A0 */
                public int f876A0;

                /* JADX INFO: renamed from: B0 */
                public dk1 f877B0;

                /* JADX INFO: renamed from: C0 */
                public boolean f878C0;

                /* JADX INFO: renamed from: D0 */
                public final ch2 f879D0;

                /* JADX INFO: renamed from: E0 */
                public final ck1 f880E0;

                /* JADX INFO: renamed from: F0 */
                public x70 f881F0;

                /* JADX INFO: renamed from: G0 */
                public int f882G0;

                /* JADX INFO: renamed from: H0 */
                public int f883H0;

                /* JADX INFO: renamed from: I0 */
                public boolean f884I0;

                /* JADX INFO: renamed from: J0 */
                public float f885J0;

                /* JADX INFO: renamed from: K0 */
                public float f886K0;

                /* JADX INFO: renamed from: L0 */
                public long f887L0;

                /* JADX INFO: renamed from: M0 */
                public float f888M0;

                /* JADX INFO: renamed from: N0 */
                public boolean f889N0;

                /* JADX INFO: renamed from: O0 */
                public ArrayList f890O0;

                /* JADX INFO: renamed from: P0 */
                public ArrayList f891P0;

                /* JADX INFO: renamed from: Q0 */
                public ArrayList f892Q0;

                /* JADX INFO: renamed from: R0 */
                public CopyOnWriteArrayList f893R0;

                /* JADX INFO: renamed from: S0 */
                public int f894S0;

                /* JADX INFO: renamed from: T0 */
                public long f895T0;

                /* JADX INFO: renamed from: U0 */
                public float f896U0;

                /* JADX INFO: renamed from: V0 */
                public int f897V0;

                /* JADX INFO: renamed from: W0 */
                public float f898W0;

                /* JADX INFO: renamed from: X0 */
                public boolean f899X0;

                /* JADX INFO: renamed from: Y0 */
                public int f900Y0;

                /* JADX INFO: renamed from: Z0 */
                public int f901Z0;

                /* JADX INFO: renamed from: a1 */
                public int f902a1;

                /* JADX INFO: renamed from: b1 */
                public int f903b1;

                /* JADX INFO: renamed from: c1 */
                public int f904c1;

                /* JADX INFO: renamed from: d1 */
                public int f905d1;

                /* JADX INFO: renamed from: e1 */
                public float f906e1;

                /* JADX INFO: renamed from: f1 */
                public final d31 f907f1;

                /* JADX INFO: renamed from: g0 */
                public lk1 f908g0;

                /* JADX INFO: renamed from: g1 */
                public boolean f909g1;

                /* JADX INFO: renamed from: h0 */
                public ak1 f910h0;

                /* JADX INFO: renamed from: h1 */
                public fk1 f911h1;

                /* JADX INFO: renamed from: i0 */
                public Interpolator f912i0;

                /* JADX INFO: renamed from: i1 */
                public ji1 f913i1;

                /* JADX INFO: renamed from: j0 */
                public float f914j0;

                /* JADX INFO: renamed from: j1 */
                public final Rect f915j1;

                /* JADX INFO: renamed from: k0 */
                public int f916k0;

                /* JADX INFO: renamed from: k1 */
                public boolean f917k1;

                /* JADX INFO: renamed from: l0 */
                public int f918l0;

                /* JADX INFO: renamed from: l1 */
                public hk1 f919l1;

                /* JADX INFO: renamed from: m0 */
                public int f920m0;

                /* JADX INFO: renamed from: m1 */
                public final ek1 f921m1;

                /* JADX INFO: renamed from: n0 */
                public int f922n0;

                /* JADX INFO: renamed from: n1 */
                public boolean f923n1;

                /* JADX INFO: renamed from: o0 */
                public int f924o0;

                /* JADX INFO: renamed from: o1 */
                public final RectF f925o1;

                /* JADX INFO: renamed from: p0 */
                public boolean f926p0;

                /* JADX INFO: renamed from: p1 */
                public View f927p1;

                /* JADX INFO: renamed from: q0 */
                public final HashMap f928q0;

                /* JADX INFO: renamed from: q1 */
                public Matrix f929q1;

                /* JADX INFO: renamed from: r0 */
                public long f930r0;

                /* JADX INFO: renamed from: r1 */
                public final ArrayList f931r1;

                /* JADX INFO: renamed from: s0 */
                public float f932s0;

                /* JADX INFO: renamed from: t0 */
                public float f933t0;

                /* JADX INFO: renamed from: u0 */
                public float f934u0;

                /* JADX INFO: renamed from: v0 */
                public long f935v0;

                /* JADX INFO: renamed from: w0 */
                public float f936w0;

                /* JADX INFO: renamed from: x0 */
                public boolean f937x0;

                /* JADX INFO: renamed from: y0 */
                public boolean f938y0;

                /* JADX INFO: renamed from: z0 */
                public gk1 f939z0;

                public MotionLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f912i0 = null;
/* 8 */             this.f914j0 = 0.0f;
/* 11 */            this.f916k0 = -1;
/* 13 */            this.f918l0 = -1;
/* 15 */            this.f920m0 = -1;
/* 18 */            this.f922n0 = 0;
/* 20 */            this.f924o0 = 0;
/* 23 */            this.f926p0 = true;
/* 30 */            this.f928q0 = new HashMap();
/* 34 */            this.f930r0 = 0L;
/* 38 */            this.f932s0 = 1.0f;
/* 40 */            this.f933t0 = 0.0f;
/* 42 */            this.f934u0 = 0.0f;
/* 44 */            this.f936w0 = 0.0f;
/* 46 */            this.f938y0 = false;
/* 48 */            this.f876A0 = 0;
/* 50 */            this.f878C0 = false;
/* 57 */            this.f879D0 = new ch2();
/* 64 */            this.f880E0 = new ck1(this);
/* 66 */            this.f884I0 = false;
/* 68 */            this.f889N0 = false;
/* 70 */            this.f890O0 = null;
/* 72 */            this.f891P0 = null;
/* 74 */            this.f892Q0 = null;
/* 76 */            this.f893R0 = null;
/* 78 */            this.f894S0 = 0;
/* 82 */            this.f895T0 = -1L;
/* 84 */            this.f896U0 = 0.0f;
/* 86 */            this.f897V0 = 0;
/* 88 */            this.f898W0 = 0.0f;
/* 90 */            this.f899X0 = false;
/* 97 */            this.f907f1 = new d31();
/* 99 */            this.f909g1 = false;
/* 101 */           this.f913i1 = null;
/* 105 */           new HashMap();
/* 113 */           this.f915j1 = new Rect();
/* 115 */           this.f917k1 = false;
/* 119 */           this.f919l1 = hk1.f9119a;
/* 126 */           this.f921m1 = new ek1(this);
/* 128 */           this.f923n1 = false;
/* 135 */           this.f925o1 = new RectF();
/* 137 */           this.f927p1 = null;
/* 139 */           this.f929q1 = null;
/* 146 */           this.f931r1 = new ArrayList();
/* 148 */           m481s(attributeSet);
                }

                /* JADX INFO: renamed from: j */
                public static Rect m469j(MotionLayout motionLayout, C2569zz c2569zz) {
/* 1 */             Rect rect = motionLayout.f915j1;
/* 7 */             rect.top = c2569zz.m10477t();
/* 13 */            rect.left = c2569zz.m10476s();
/* 22 */            rect.right = c2569zz.m10475r() + rect.left;
/* 31 */            rect.bottom = c2569zz.m10472l() + rect.top;
/* 33 */            return rect;
                }

                /* JADX INFO: renamed from: A */
                public final void m470A(int i) {
                    C1954n7 c1954n7;
/* 5 */             if (!super.isAttachedToWindow()) {
/* 9 */                 if (this.f911h1 == null) {
/* 16 */                    this.f911h1 = new fk1(this);
                        }
/* 20 */                this.f911h1.f8251d = i;
/* 22 */                return;
                    }
/* 23 */            lk1 lk1Var = this.f908g0;
/* 26 */            if (lk1Var != null && (c1954n7 = lk1Var.f13342b) != null) {
/* 32 */                int i2 = this.f918l0;
/* 42 */                wg2 wg2Var = (wg2) ((SparseArray) c1954n7.f14152c).get(i);
/* 44 */                if (wg2Var != null) {
/* 48 */                    ArrayList arrayList = wg2Var.f18618b;
/* 50 */                    int i3 = wg2Var.f18619c;
/* 52 */                    if (i3 != i2) {
/* 55 */                        Iterator it = arrayList.iterator();
/* 73 */                        do {
/* 63 */                            if (!it.hasNext()) {
/* 76 */                                i2 = i3;
                                        break;
                                    }
/* 73 */                        } while (i2 != ((xg2) it.next()).f19087e);
                            }
                        } else {
/* 46 */                    i2 = i;
                        }
/* 77 */                if (i2 != -1) {
/* 79 */                    i = i2;
                        }
                    }
/* 80 */            int i4 = this.f918l0;
/* 82 */            if (i4 == i) {
/* 84 */                return;
                    }
/* 88 */            if (this.f916k0 == i) {
/* 90 */                m473k(0.0f);
/* 93 */                return;
                    }
/* 98 */            if (this.f920m0 == i) {
/* 100 */               m473k(1.0f);
/* 103 */               return;
                    }
/* 104 */           this.f920m0 = i;
/* 107 */           if (i4 != -1) {
/* 109 */               m487y(i4, i);
/* 112 */               m473k(1.0f);
/* 115 */               this.f934u0 = 0.0f;
/* 117 */               m473k(1.0f);
/* 120 */               this.f913i1 = null;
/* 122 */               return;
                    }
/* 124 */           this.f878C0 = false;
/* 126 */           this.f936w0 = 1.0f;
/* 128 */           this.f933t0 = 0.0f;
/* 130 */           this.f934u0 = 0.0f;
/* 136 */           this.f935v0 = getNanoTime();
/* 142 */           this.f930r0 = getNanoTime();
/* 144 */           this.f937x0 = false;
/* 146 */           this.f910h0 = null;
/* 158 */           this.f932s0 = this.f908g0.m6468c() / 1000.0f;
/* 160 */           this.f916k0 = -1;
/* 166 */           this.f908g0.m6479n(-1, this.f920m0);
/* 171 */           SparseArray sparseArray = new SparseArray();
/* 174 */           int childCount = getChildCount();
/* 178 */           HashMap map = this.f928q0;
/* 180 */           map.clear();
/* 184 */           for (int i5 = 0; i5 < childCount; i5++) {
/* 186 */               View childAt = getChildAt(i5);
/* 195 */               map.put(childAt, new zj1(childAt));
/* 208 */               sparseArray.put(childAt.getId(), (zj1) map.get(childAt));
                    }
/* 215 */           this.f938y0 = true;
/* 219 */           C0077d c0077dM6467b = this.f908g0.m6467b(i);
/* 223 */           ek1 ek1Var = this.f921m1;
/* 225 */           ek1Var.m3483e(null, c0077dM6467b);
/* 228 */           m484v();
/* 231 */           ek1Var.m3481a();
/* 234 */           int childCount2 = getChildCount();
/* 239 */           for (int i6 = 0; i6 < childCount2; i6++) {
/* 241 */               View childAt2 = getChildAt(i6);
/* 249 */               zj1 zj1Var = (zj1) map.get(childAt2);
/* 251 */               if (zj1Var != null) {
/* 255 */                   ik1 ik1Var = zj1Var.f20181f;
/* 257 */                   ik1Var.f9688c = 0.0f;
/* 259 */                   ik1Var.f9689d = 0.0f;
/* 279 */                   ik1Var.m4574d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
/* 282 */                   xj1 xj1Var = zj1Var.f20183h;
/* 284 */                   xj1Var.getClass();
/* 287 */                   childAt2.getX();
/* 290 */                   childAt2.getY();
/* 293 */                   childAt2.getWidth();
/* 296 */                   childAt2.getHeight();
/* 303 */                   xj1Var.f19222c = childAt2.getVisibility();
/* 317 */                   xj1Var.f19218a = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
/* 323 */                   xj1Var.f19223d = childAt2.getElevation();
/* 329 */                   xj1Var.f19224e = childAt2.getRotation();
/* 335 */                   xj1Var.f19225f = childAt2.getRotationX();
/* 341 */                   xj1Var.f19226i = childAt2.getRotationY();
/* 347 */                   xj1Var.f19227v = childAt2.getScaleX();
/* 353 */                   xj1Var.f19228w = childAt2.getScaleY();
/* 359 */                   xj1Var.f19212U = childAt2.getPivotX();
/* 365 */                   xj1Var.f19213V = childAt2.getPivotY();
/* 371 */                   xj1Var.f19214W = childAt2.getTranslationX();
/* 377 */                   xj1Var.f19215X = childAt2.getTranslationY();
/* 383 */                   xj1Var.f19216Y = childAt2.getTranslationZ();
                        }
                    }
/* 389 */           int width = getWidth();
/* 393 */           int height = getHeight();
/* 399 */           if (this.f892Q0 != null) {
/* 402 */               for (int i7 = 0; i7 < childCount; i7++) {
/* 412 */                   zj1 zj1Var2 = (zj1) map.get(getChildAt(i7));
/* 414 */                   if (zj1Var2 != null) {
/* 419 */                       this.f908g0.m6471f(zj1Var2);
                            }
                        }
/* 427 */               Iterator it2 = this.f892Q0.iterator();
/* 435 */               while (it2.hasNext()) {
/* 443 */                   ((MotionHelper) it2.next()).mo466r(this, map);
                        }
/* 448 */               for (int i8 = 0; i8 < childCount; i8++) {
/* 458 */                   zj1 zj1Var3 = (zj1) map.get(getChildAt(i8));
/* 460 */                   if (zj1Var3 != null) {
/* 467 */                       zj1Var3.m10364h(getNanoTime(), width, height);
                            }
                        }
                    } else {
/* 474 */               for (int i9 = 0; i9 < childCount; i9++) {
/* 484 */                   zj1 zj1Var4 = (zj1) map.get(getChildAt(i9));
/* 486 */                   if (zj1Var4 != null) {
/* 491 */                       this.f908g0.m6471f(zj1Var4);
/* 498 */                       zj1Var4.m10364h(getNanoTime(), width, height);
                            }
                        }
                    }
/* 506 */           kk1 kk1Var = this.f908g0.f13343c;
/* 513 */           float f = kk1Var != null ? kk1Var.f12847i : 0.0f;
/* 516 */           if (f != 0.0f) {
/* 518 */               float fMin = Float.MAX_VALUE;
/* 521 */               float fMax = -3.4028235E38f;
/* 525 */               for (int i10 = 0; i10 < childCount; i10++) {
/* 537 */                   ik1 ik1Var2 = ((zj1) map.get(getChildAt(i10))).f20182g;
/* 543 */                   float f2 = ik1Var2.f9691f + ik1Var2.f9690e;
/* 544 */                   fMin = Math.min(fMin, f2);
/* 548 */                   fMax = Math.max(fMax, f2);
                        }
/* 555 */               for (int i11 = 0; i11 < childCount; i11++) {
/* 565 */                   zj1 zj1Var5 = (zj1) map.get(getChildAt(i11));
/* 567 */                   ik1 ik1Var3 = zj1Var5.f20182g;
/* 569 */                   float f3 = ik1Var3.f9690e;
/* 571 */                   float f4 = ik1Var3.f9691f;
/* 577 */                   zj1Var5.f20189n = 1.0f / (1.0f - f);
/* 587 */                   zj1Var5.f20188m = f - ((((f3 + f4) - fMin) * f) / (fMax - fMin));
                        }
                    }
/* 592 */           this.f933t0 = 0.0f;
/* 594 */           this.f934u0 = 0.0f;
/* 596 */           this.f938y0 = true;
/* 598 */           invalidate();
                }

                /* JADX INFO: renamed from: B */
                public final void m471B(int i, C0077d c0077d) {
/* 1 */             lk1 lk1Var = this.f908g0;
/* 3 */             if (lk1Var != null) {
/* 7 */                 lk1Var.f13347g.put(i, c0077d);
                    }
/* 28 */            this.f921m1.m3483e(this.f908g0.m6467b(this.f916k0), this.f908g0.m6467b(this.f920m0));
/* 31 */            m484v();
/* 36 */            if (this.f918l0 == i) {
/* 38 */                c0077d.m537b(this);
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
                public final void dispatchDraw(Canvas canvas) {
                    ArrayList arrayList;
                    int i;
                    int i2;
                    int i3;
                    Paint paint;
                    Paint paint2;
                    int i4;
                    zj1 zj1Var;
                    int i5;
                    Paint paint3;
                    float fMin;
                    double dMo288a;
                    Paint paint4;
                    String resourceEntryName;
                    C0168b5 c0168b5;
/* 5 */             ArrayList arrayList2 = this.f892Q0;
/* 7 */             if (arrayList2 != null) {
/* 9 */                 Iterator it = arrayList2.iterator();
/* 17 */                while (it.hasNext()) {
/* 25 */                    ((MotionHelper) it.next()).getClass();
                        }
                    }
/* 30 */            m475m(false);
/* 33 */            lk1 lk1Var = this.f908g0;
/* 36 */            if (lk1Var != null && (c0168b5 = lk1Var.f13357q) != null) {
/* 44 */                ArrayList arrayList3 = (ArrayList) c0168b5.f2215f;
/* 48 */                ArrayList arrayList4 = (ArrayList) c0168b5.f2214e;
/* 50 */                if (arrayList4 != null) {
/* 53 */                    Iterator it2 = arrayList4.iterator();
/* 61 */                    while (it2.hasNext()) {
/* 69 */                        ((d53) it2.next()).m2943a();
                            }
/* 77 */                    ((ArrayList) c0168b5.f2214e).removeAll(arrayList3);
/* 80 */                    arrayList3.clear();
/* 91 */                    if (((ArrayList) c0168b5.f2214e).isEmpty()) {
/* 93 */                        c0168b5.f2214e = null;
                            }
                        }
                    }
/* 95 */            super.dispatchDraw(canvas);
/* 100 */           if (this.f908g0 == null) {
/* 1443 */              return;
                    }
/* 112 */           if ((this.f876A0 & 1) == 1 && !isInEditMode()) {
/* 123 */               this.f894S0++;
/* 125 */               long nanoTime = getNanoTime();
/* 129 */               long j = this.f895T0;
/* 135 */               if (j != -1) {
/* 137 */                   long j2 = nanoTime - j;
/* 144 */                   if (j2 > 200000000) {
/* 161 */                       this.f896U0 = ((int) ((this.f894S0 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
/* 163 */                       this.f894S0 = 0;
/* 165 */                       this.f895T0 = nanoTime;
                            }
                        } else {
/* 168 */                   this.f895T0 = nanoTime;
                        }
/* 172 */               Paint paint5 = new Paint();
/* 177 */               paint5.setTextSize(42.0f);
/* 189 */               float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
/* 192 */               StringBuilder sb = new StringBuilder();
/* 197 */               sb.append(this.f896U0);
/* 202 */               sb.append(" fps ");
/* 205 */               int i6 = this.f916k0;
/* 232 */               StringBuilder sbM3512p = AbstractC0886en.m3512p(fm0.m3789o(sb, i6 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i6), " -> "));
/* 236 */               int i7 = this.f920m0;
/* 254 */               sbM3512p.append(i7 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i7));
/* 259 */               sbM3512p.append(" (progress: ");
/* 262 */               sbM3512p.append(progress);
/* 267 */               sbM3512p.append(" ) state=");
/* 270 */               int i8 = this.f918l0;
/* 272 */               if (i8 == -1) {
/* 274 */                   resourceEntryName = "undefined";
                        } else {
/* 288 */                   resourceEntryName = i8 != -1 ? getContext().getResources().getResourceEntryName(i8) : "UNDEFINED";
                        }
/* 293 */               sbM3512p.append(resourceEntryName);
/* 296 */               String string = sbM3512p.toString();
/* 302 */               paint5.setColor(-16777216);
/* 312 */               canvas.drawText(string, 11.0f, getHeight() - 29, paint5);
/* 318 */               paint5.setColor(-7864184);
/* 328 */               canvas.drawText(string, 10.0f, getHeight() - 30, paint5);
                    }
/* 333 */           if (this.f876A0 > 1) {
/* 337 */               if (this.f877B0 == null) {
/* 344 */                   this.f877B0 = new dk1(this);
                        }
/* 346 */               dk1 dk1Var = this.f877B0;
/* 350 */               int iM6468c = this.f908g0.m6468c();
/* 354 */               int i9 = this.f876A0;
/* 356 */               Paint paint6 = dk1Var.f7281g;
/* 358 */               Paint paint7 = dk1Var.f7280f;
/* 360 */               Paint paint8 = dk1Var.f7283i;
/* 362 */               int i10 = dk1Var.f7287m;
/* 364 */               Paint paint9 = dk1Var.f7279e;
/* 366 */               MotionLayout motionLayout = dk1Var.f7288n;
/* 370 */               HashMap map = this.f928q0;
/* 372 */               if (map != null && map.size() != 0) {
/* 382 */                   canvas.save();
/* 390 */                   if (!motionLayout.isInEditMode() && (i9 & 1) == 2) {
/* 430 */                       String str = motionLayout.getContext().getResources().getResourceName(motionLayout.f920m0) + ":" + motionLayout.getProgress();
/* 443 */                       canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, dk1Var.f7282h);
/* 455 */                       canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint9);
                            }
/* 462 */                   Iterator it3 = map.values().iterator();
/* 470 */                   while (it3.hasNext()) {
/* 476 */                       zj1 zj1Var2 = (zj1) it3.next();
/* 478 */                       ik1 ik1Var = zj1Var2.f20181f;
/* 480 */                       ArrayList arrayList5 = zj1Var2.f20196u;
/* 482 */                       int iMax = ik1Var.f9686b;
/* 484 */                       Iterator it4 = arrayList5.iterator();
/* 492 */                       while (it4.hasNext()) {
/* 506 */                           iMax = Math.max(iMax, ((ik1) it4.next()).f9686b);
/* 510 */                           it3 = it3;
                                }
/* 513 */                       it3 = it3;
/* 519 */                       int iMax2 = Math.max(iMax, zj1Var2.f20182g.f9686b);
/* 523 */                       if (i9 > 0 && iMax2 == 0) {
/* 527 */                           iMax2 = 1;
                                }
/* 528 */                       if (iMax2 != 0) {
/* 533 */                           float[] fArr = dk1Var.f7277c;
/* 535 */                           int[] iArr = dk1Var.f7276b;
/* 537 */                           if (fArr != null) {
/* 539 */                               arrayList = arrayList5;
/* 545 */                               double[] dArrMo6916n0 = zj1Var2.f20185j[0].mo6916n0();
/* 549 */                               if (iArr != null) {
/* 551 */                                   Iterator it5 = arrayList.iterator();
/* 555 */                                   int i11 = 0;
/* 561 */                                   while (it5.hasNext()) {
/* 577 */                                       iArr[i11] = ((ik1) it5.next()).f9683Z;
/* 573 */                                       i11++;
/* 581 */                                       fArr = fArr;
                                            }
                                        }
/* 584 */                               float[] fArr2 = fArr;
/* 586 */                               int i12 = 0;
/* 588 */                               int i13 = 0;
/* 591 */                               while (i12 < dArrMo6916n0.length) {
/* 597 */                                   int i14 = i12;
/* 603 */                                   double[] dArr = dArrMo6916n0;
/* 607 */                                   zj1Var2.f20185j[0].mo6912g0(dArrMo6916n0[i14], zj1Var2.f20191p);
/* 624 */                                   zj1Var2.f20181f.m4573c(dArr[i14], zj1Var2.f20190o, zj1Var2.f20191p, fArr2, i13);
/* 627 */                                   i13 += 2;
/* 629 */                                   i12 = i14 + 1;
/* 631 */                                   iM6468c = iM6468c;
/* 633 */                                   dArrMo6916n0 = dArr;
                                        }
/* 636 */                               i = iM6468c;
/* 638 */                               i2 = i13 / 2;
                                    } else {
/* 643 */                               arrayList = arrayList5;
/* 645 */                               i = iM6468c;
/* 647 */                               i2 = 0;
                                    }
/* 649 */                           dk1Var.f7285k = i2;
/* 652 */                           if (iMax2 >= 1) {
/* 654 */                               int i15 = i / 16;
/* 656 */                               float[] fArr3 = dk1Var.f7275a;
/* 658 */                               if (fArr3 == null || fArr3.length != i15 * 2) {
/* 669 */                                   dk1Var.f7275a = new float[i15 * 2];
/* 676 */                                   dk1Var.f7278d = new Path();
                                        }
                                        float f = i10;
/* 679 */                               canvas.translate(f, f);
/* 684 */                               paint9.setColor(1996488704);
/* 687 */                               paint8.setColor(1996488704);
/* 690 */                               paint7.setColor(1996488704);
/* 693 */                               paint6.setColor(1996488704);
/* 696 */                               float[] fArr4 = dk1Var.f7275a;
/* 703 */                               float f2 = 1.0f / (i15 - 1);
/* 705 */                               float f3 = 1.0f;
/* 707 */                               HashMap map2 = zj1Var2.f20200y;
/* 723 */                               w43 w43Var = map2 == null ? null : (w43) map2.get("translationX");
/* 726 */                               HashMap map3 = zj1Var2.f20200y;
/* 728 */                               i3 = i9;
/* 740 */                               w43 w43Var2 = map3 == null ? null : (w43) map3.get("translationY");
/* 742 */                               HashMap map4 = zj1Var2.f20201z;
/* 752 */                               a43 a43Var = map4 == null ? null : (a43) map4.get("translationX");
/* 754 */                               HashMap map5 = zj1Var2.f20201z;
/* 764 */                               a43 a43Var2 = map5 == null ? null : (a43) map5.get("translationY");
/* 766 */                               int i16 = 0;
                                        while (true) {
/* 768 */                                   float f4 = Float.NaN;
/* 770 */                                   float f5 = 0.0f;
/* 772 */                                   if (i16 >= i15) {
                                                break;
                                            }
/* 774 */                                   int i17 = i15;
/* 777 */                                   float f6 = i16 * f2;
/* 781 */                                   float f7 = zj1Var2.f20189n;
/* 785 */                                   if (f7 != f3) {
/* 789 */                                       float f8 = zj1Var2.f20188m;
/* 802 */                                       fMin = f6 < f8 ? 0.0f : f6;
/* 806 */                                       i5 = i16;
/* 808 */                                       paint3 = paint6;
/* 810 */                                       if (fMin > f8 && fMin < 1.0d) {
/* 825 */                                           fMin = Math.min((fMin - f8) * f7, f3);
                                                }
                                            } else {
/* 833 */                                       i5 = i16;
/* 835 */                                       paint3 = paint6;
/* 837 */                                       fMin = f6;
                                            }
                                            double d = fMin;
/* 842 */                                   C2131r4 c2131r4 = ik1Var.f9684a;
/* 844 */                                   Iterator it6 = arrayList.iterator();
/* 852 */                                   while (it6.hasNext()) {
/* 858 */                                       Iterator it7 = it6;
/* 862 */                                       ik1 ik1Var2 = (ik1) it6.next();
/* 864 */                                       ik1 ik1Var3 = ik1Var;
/* 866 */                                       C2131r4 c2131r5 = ik1Var2.f9684a;
/* 868 */                                       if (c2131r5 != null) {
/* 872 */                                           float f9 = ik1Var2.f9688c;
/* 876 */                                           if (f9 < fMin) {
/* 878 */                                               f5 = f9;
/* 880 */                                               c2131r4 = c2131r5;
                                                    } else if (Float.isNaN(f4)) {
/* 889 */                                               f4 = ik1Var2.f9688c;
                                                    }
                                                }
/* 893 */                                       it6 = it7;
/* 895 */                                       ik1Var = ik1Var3;
                                            }
/* 898 */                                   ik1 ik1Var4 = ik1Var;
/* 900 */                                   if (c2131r4 != null) {
/* 906 */                                       if (Float.isNaN(f4)) {
/* 908 */                                           f4 = 1.0f;
                                                }
/* 912 */                                       float f10 = f4 - f5;
/* 927 */                                       dMo288a = (((float) c2131r4.mo288a((fMin - f5) / f10)) * f10) + f5;
                                            } else {
/* 934 */                                       dMo288a = d;
                                            }
/* 942 */                                   zj1Var2.f20185j[0].mo6912g0(dMo288a, zj1Var2.f20191p);
/* 945 */                                   C2326wc c2326wc = zj1Var2.f20186k;
/* 947 */                                   if (c2326wc != null) {
/* 949 */                                       double[] dArr2 = zj1Var2.f20191p;
/* 951 */                                       paint4 = paint8;
/* 954 */                                       if (dArr2.length > 0) {
/* 956 */                                           c2326wc.mo6912g0(dMo288a, dArr2);
                                                }
                                            } else {
/* 960 */                                       paint4 = paint8;
                                            }
/* 968 */                                   int i18 = i5 * 2;
/* 978 */                                   zj1Var2.f20181f.m4573c(dMo288a, zj1Var2.f20190o, zj1Var2.f20191p, fArr4, i18);
/* 981 */                                   if (a43Var != null) {
/* 990 */                                       fArr4[i18] = a43Var.m56a(fMin) + fArr4[i18];
                                            } else if (w43Var != null) {
/* 1002 */                                      fArr4[i18] = w43Var.m9466a(fMin) + fArr4[i18];
                                            }
/* 1004 */                                  if (a43Var2 != null) {
/* 1006 */                                      int i19 = i18 + 1;
/* 1015 */                                      fArr4[i19] = a43Var2.m56a(fMin) + fArr4[i19];
                                            } else if (w43Var2 != null) {
/* 1020 */                                      int i20 = i18 + 1;
/* 1029 */                                      fArr4[i20] = w43Var2.m9466a(fMin) + fArr4[i20];
                                            }
/* 1031 */                                  i16 = i5 + 1;
/* 1033 */                                  i15 = i17;
/* 1035 */                                  paint6 = paint3;
/* 1037 */                                  ik1Var = ik1Var4;
/* 1039 */                                  i10 = i10;
/* 1041 */                                  paint8 = paint4;
/* 1043 */                                  f3 = 1.0f;
                                        }
/* 1047 */                              ik1 ik1Var5 = ik1Var;
/* 1049 */                              Paint paint10 = paint6;
/* 1057 */                              dk1Var.m3144a(canvas, iMax2, dk1Var.f7285k, zj1Var2);
/* 1062 */                              paint9.setColor(-21965);
/* 1068 */                              paint7.setColor(-2067046);
/* 1071 */                              paint2 = paint8;
/* 1073 */                              paint2.setColor(-2067046);
/* 1079 */                              Paint paint11 = paint10;
/* 1081 */                              paint11.setColor(-13391360);
/* 1084 */                              int i21 = i10;
/* 1086 */                              float f11 = -i21;
/* 1088 */                              canvas.translate(f11, f11);
/* 1093 */                              dk1Var.m3144a(canvas, iMax2, dk1Var.f7285k, zj1Var2);
/* 1096 */                              char c = 5;
/* 1097 */                              if (iMax2 == 5) {
/* 1099 */                                  float[] fArr5 = dk1Var.f7284j;
/* 1103 */                                  dk1Var.f7278d.reset();
/* 1106 */                                  int i22 = 0;
/* 1110 */                                  while (i22 <= 50) {
/* 1125 */                                      char c2 = c;
/* 1126 */                                      int i23 = i22;
/* 1131 */                                      zj1Var2.f20185j[0].mo6912g0(zj1Var2.m10359b(i22 / 50.0f, null), zj1Var2.f20191p);
/* 1134 */                                      int[] iArr2 = zj1Var2.f20190o;
/* 1136 */                                      double[] dArr3 = zj1Var2.f20191p;
/* 1138 */                                      ik1 ik1Var6 = ik1Var5;
/* 1140 */                                      float fSin = ik1Var6.f9690e;
/* 1142 */                                      float fCos = ik1Var6.f9691f;
/* 1146 */                                      float f12 = ik1Var6.f9692i;
/* 1150 */                                      float f13 = ik1Var6.f9693v;
/* 1152 */                                      int i24 = i21;
/* 1154 */                                      float[] fArr6 = fArr5;
/* 1156 */                                      int i25 = 0;
                                                while (true) {
/* 1159 */                                          zj1Var = zj1Var2;
/* 1161 */                                          if (i25 >= iArr2.length) {
                                                        break;
                                                    }
/* 1163 */                                          Paint paint12 = paint11;
/* 1167 */                                          float f14 = (float) dArr3[i25];
/* 1168 */                                          int i26 = iArr2[i25];
/* 1171 */                                          if (i26 == 1) {
/* 1189 */                                              fSin = f14;
                                                    } else if (i26 == 2) {
/* 1187 */                                              fCos = f14;
                                                    } else if (i26 == 3) {
/* 1185 */                                              f12 = f14;
                                                    } else if (i26 == 4) {
/* 1183 */                                              f13 = f14;
                                                    }
/* 1190 */                                          i25++;
/* 1192 */                                          zj1Var2 = zj1Var;
/* 1194 */                                          paint11 = paint12;
                                                }
/* 1197 */                                      Paint paint13 = paint11;
/* 1201 */                                      if (ik1Var6.f9681X != null) {
                                                    double d2 = fSin;
                                                    double d3 = fCos;
/* 1220 */                                          fSin = (float) (((Math.sin(d3) * d2) + 0.0d) - ((double) (f12 / 2.0f)));
/* 1233 */                                          fCos = (float) ((0.0d - (Math.cos(d3) * d2)) - ((double) (f13 / 2.0f)));
                                                }
/* 1237 */                                      float f15 = f12 + fSin;
/* 1238 */                                      float f16 = f13 + fCos;
/* 1239 */                                      Float.isNaN(Float.NaN);
/* 1242 */                                      Float.isNaN(Float.NaN);
/* 1245 */                                      float f17 = fSin + 0.0f;
/* 1247 */                                      float f18 = fCos + 0.0f;
/* 1249 */                                      float f19 = f15 + 0.0f;
/* 1251 */                                      float f20 = f16 + 0.0f;
/* 1253 */                                      fArr6[0] = f17;
/* 1257 */                                      fArr6[1] = f18;
/* 1261 */                                      fArr6[2] = f19;
/* 1265 */                                      fArr6[3] = f18;
/* 1268 */                                      fArr6[4] = f19;
/* 1270 */                                      fArr6[c2] = f20;
/* 1273 */                                      fArr6[6] = f17;
/* 1276 */                                      fArr6[7] = f20;
/* 1278 */                                      dk1 dk1Var2 = dk1Var;
/* 1282 */                                      dk1Var2.f7278d.moveTo(f17, f18);
/* 1291 */                                      dk1Var2.f7278d.lineTo(fArr6[2], fArr6[3]);
/* 1301 */                                      dk1Var2.f7278d.lineTo(fArr6[4], fArr6[c2]);
/* 1310 */                                      dk1Var2.f7278d.lineTo(fArr6[6], fArr6[7]);
/* 1315 */                                      dk1Var2.f7278d.close();
/* 1318 */                                      i22 = i23 + 1;
/* 1320 */                                      dk1Var = dk1Var2;
/* 1321 */                                      ik1Var5 = ik1Var6;
/* 1323 */                                      c = c2;
/* 1325 */                                      fArr5 = fArr6;
/* 1327 */                                      zj1Var2 = zj1Var;
/* 1329 */                                      paint11 = paint13;
/* 1331 */                                      i21 = i24;
                                            }
/* 1335 */                                  i4 = i21;
/* 1337 */                                  dk1Var = dk1Var;
/* 1338 */                                  paint = paint11;
/* 1348 */                                  paint9.setColor(1140850688);
/* 1353 */                                  canvas.translate(2.0f, 2.0f);
/* 1358 */                                  canvas.drawPath(dk1Var.f7278d, paint9);
/* 1363 */                                  canvas.translate(-2.0f, -2.0f);
/* 1368 */                                  paint9.setColor(-65536);
/* 1373 */                                  canvas.drawPath(dk1Var.f7278d, paint9);
                                        } else {
/* 1377 */                                  i4 = i21;
/* 1380 */                                  paint = paint11;
                                        }
/* 1400 */                              dk1Var = dk1Var;
/* 1401 */                              paint8 = paint2;
/* 1404 */                              iM6468c = i;
/* 1406 */                              i9 = i3;
/* 1408 */                              paint6 = paint;
/* 1410 */                              i10 = i4;
                                    } else {
/* 1390 */                              i3 = i9;
/* 1392 */                              paint = paint6;
/* 1394 */                              paint2 = paint8;
/* 1395 */                              i4 = i10;
                                    }
/* 1400 */                          dk1Var = dk1Var;
/* 1401 */                          paint8 = paint2;
/* 1404 */                          iM6468c = i;
/* 1406 */                          i9 = i3;
/* 1408 */                          paint6 = paint;
/* 1410 */                          i10 = i4;
                                }
                            }
/* 1414 */                  canvas.restore();
                        }
                    }
/* 1419 */          ArrayList arrayList6 = this.f892Q0;
/* 1421 */          if (arrayList6 != null) {
/* 1423 */              Iterator it8 = arrayList6.iterator();
/* 1431 */              while (it8.hasNext()) {
/* 1439 */                  ((MotionHelper) it8.next()).getClass();
                        }
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout
                /* JADX INFO: renamed from: f */
                public final void mo472f(int i) {
/* 2 */             this.f1054V = null;
                }

                public int[] getConstraintSetIds() {
/* 1 */             lk1 lk1Var = this.f908g0;
/* 3 */             if (lk1Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             SparseArray sparseArray = lk1Var.f13347g;
/* 9 */             int size = sparseArray.size();
/* 13 */            int[] iArr = new int[size];
/* 16 */            for (int i = 0; i < size; i++) {
/* 22 */                iArr[i] = sparseArray.keyAt(i);
                    }
/* 27 */            return iArr;
                }

                public int getCurrentState() {
/* 1 */             return this.f918l0;
                }

                public ArrayList<kk1> getDefinedTransitions() {
/* 1 */             lk1 lk1Var = this.f908g0;
/* 3 */             if (lk1Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             return lk1Var.f13344d;
                }

                public x70 getDesignTool() {
/* 3 */             if (this.f881F0 == null) {
/* 10 */                this.f881F0 = new x70();
                    }
/* 12 */            return this.f881F0;
                }

                public int getEndState() {
/* 1 */             return this.f920m0;
                }

                public long getNanoTime() {
/* 1 */             return System.nanoTime();
                }

                public float getProgress() {
/* 1 */             return this.f934u0;
                }

                public lk1 getScene() {
/* 1 */             return this.f908g0;
                }

                public int getStartState() {
/* 1 */             return this.f916k0;
                }

                public float getTargetPosition() {
/* 1 */             return this.f936w0;
                }

                public Bundle getTransitionState() {
/* 3 */             if (this.f911h1 == null) {
/* 10 */                this.f911h1 = new fk1(this);
                    }
/* 12 */            fk1 fk1Var = this.f911h1;
/* 14 */            MotionLayout motionLayout = fk1Var.f8252e;
/* 18 */            fk1Var.f8251d = motionLayout.f920m0;
/* 22 */            fk1Var.f8250c = motionLayout.f916k0;
/* 28 */            fk1Var.f8249b = motionLayout.getVelocity();
/* 34 */            fk1Var.f8248a = motionLayout.getProgress();
/* 36 */            fk1 fk1Var2 = this.f911h1;
/* 38 */            fk1Var2.getClass();
/* 43 */            Bundle bundle = new Bundle();
/* 50 */            bundle.putFloat("motion.progress", fk1Var2.f8248a);
/* 57 */            bundle.putFloat("motion.velocity", fk1Var2.f8249b);
/* 64 */            bundle.putInt("motion.StartState", fk1Var2.f8250c);
/* 71 */            bundle.putInt("motion.EndState", fk1Var2.f8251d);
/* 74 */            return bundle;
                }

                public long getTransitionTimeMs() {
/* 1 */             lk1 lk1Var = this.f908g0;
/* 5 */             if (lk1Var != null) {
/* 13 */                this.f932s0 = lk1Var.m6468c() / 1000.0f;
                    }
/* 18 */            return (long) (this.f932s0 * 1000.0f);
                }

                public float getVelocity() {
/* 1 */             return this.f914j0;
                }

                /* JADX INFO: renamed from: k */
                public final void m473k(float f) {
/* 1 */             lk1 lk1Var = this.f908g0;
/* 3 */             if (lk1Var == null) {
/* 26 */                return;
                    }
/* 6 */             float f2 = this.f934u0;
/* 8 */             float f3 = this.f933t0;
/* 12 */            if (f2 != f3 && this.f937x0) {
/* 18 */                this.f934u0 = f3;
                    }
/* 20 */            float f4 = this.f934u0;
/* 24 */            if (f4 == f) {
/* 26 */                return;
                    }
/* 28 */            this.f878C0 = false;
/* 30 */            this.f936w0 = f;
/* 40 */            this.f932s0 = lk1Var.m6468c() / 1000.0f;
/* 44 */            setProgress(this.f936w0);
/* 48 */            this.f910h0 = null;
/* 56 */            this.f912i0 = this.f908g0.m6470e();
/* 58 */            this.f937x0 = false;
/* 64 */            this.f930r0 = getNanoTime();
/* 67 */            this.f938y0 = true;
/* 69 */            this.f933t0 = f4;
/* 71 */            this.f934u0 = f4;
/* 73 */            invalidate();
                }

                /* JADX INFO: renamed from: l */
                public final void m474l() {
/* 1 */             int childCount = getChildCount();
/* 6 */             for (int i = 0; i < childCount; i++) {
/* 18 */                zj1 zj1Var = (zj1) this.f928q0.get(getChildAt(i));
/* 20 */                if (zj1Var != null) {
/* 30 */                    "button".equals(de3.m3040v(zj1Var.f20177b));
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:101:0x0178  */
                /* JADX WARN: Code duplicated, block: B:102:0x018a  */
                /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
                /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
                /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
                /* JADX WARN: Code duplicated, block: B:148:0x0214  */
                /* JADX WARN: Code duplicated, block: B:64:0x00e0 A[PHI: r3
  0x00e0: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:49:0x00ae, B:60:0x00d4, B:62:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:74:0x010b  */
                /* JADX WARN: Code duplicated, block: B:77:0x0114  */
                /* JADX WARN: Code duplicated, block: B:89:0x0132  */
                /* JADX WARN: Code duplicated, block: B:92:0x0147  */
                /* JADX WARN: Code duplicated, block: B:93:0x0149  */
                /* JADX WARN: Code duplicated, block: B:96:0x0152  */
                /* JADX WARN: Code duplicated, block: B:99:0x0169  */
                /* JADX INFO: renamed from: m */
                public final void m475m(boolean z) {
                    boolean z2;
                    char c;
                    hk1 hk1Var;
                    int childCount;
                    long nanoTime;
                    Interpolator interpolator;
                    float interpolation;
                    Interpolator interpolator2;
                    int i;
                    float f;
                    int i2;
                    int i3;
                    int i4;
                    View childAt;
                    zj1 zj1Var;
                    boolean z3;
/* 9 */             if (this.f935v0 == -1) {
/* 15 */                this.f935v0 = getNanoTime();
                    }
/* 17 */            float f2 = this.f934u0;
/* 19 */            float f3 = 0.0f;
/* 25 */            if (f2 > 0.0f && f2 < 1.0f) {
/* 31 */                this.f918l0 = -1;
                    }
/* 36 */            boolean z4 = false;
/* 37 */            if (this.f889N0 || (this.f938y0 && (z || this.f936w0 != f2))) {
/* 59 */                float fSignum = Math.signum(this.f936w0 - f2);
/* 63 */                long nanoTime2 = getNanoTime();
/* 67 */                ak1 ak1Var = this.f910h0;
/* 85 */                float f4 = ak1Var == null ? (((nanoTime2 - this.f935v0) * fSignum) * 1.0E-9f) / this.f932s0 : 0.0f;
/* 88 */                float f5 = this.f934u0 + f4;
/* 91 */                if (this.f937x0) {
/* 93 */                    f5 = this.f936w0;
                        }
/* 97 */                if ((fSignum <= 0.0f || f5 < this.f936w0) && (fSignum > 0.0f || f5 > this.f936w0)) {
/* 121 */                   z2 = false;
                        } else {
/* 115 */                   f5 = this.f936w0;
/* 117 */                   this.f938y0 = false;
/* 119 */                   z2 = true;
                        }
/* 122 */               this.f934u0 = f5;
/* 124 */               this.f933t0 = f5;
/* 126 */               this.f935v0 = nanoTime2;
/* 131 */               if (ak1Var == null || z2) {
/* 255 */                   this.f914j0 = f4;
                        } else {
/* 137 */                   if (this.f878C0) {
/* 145 */                       float interpolation2 = ak1Var.getInterpolation((nanoTime2 - this.f930r0) * 1.0E-9f);
/* 149 */                       ak1 ak1Var2 = this.f910h0;
/* 152 */                       ch2 ch2Var = this.f879D0;
/* 154 */                       if (ak1Var2 == ch2Var) {
/* 166 */                           c = ch2Var.f2927c.mo1357a() ? (char) 2 : (char) 1;
                                } else {
/* 168 */                           c = 0;
                                }
/* 169 */                       this.f934u0 = interpolation2;
/* 171 */                       this.f935v0 = nanoTime2;
/* 173 */                       ak1 ak1Var3 = this.f910h0;
/* 175 */                       if (ak1Var3 != null) {
/* 177 */                           float fMo299a = ak1Var3.mo299a();
/* 181 */                           this.f914j0 = fMo299a;
/* 192 */                           if (Math.abs(fMo299a) * this.f932s0 <= 1.0E-5f && c == 2) {
/* 196 */                               this.f938y0 = false;
                                    }
/* 200 */                           if (fMo299a > 0.0f && interpolation2 >= 1.0f) {
/* 206 */                               this.f934u0 = 1.0f;
/* 208 */                               this.f938y0 = false;
/* 210 */                               interpolation2 = 1.0f;
                                    }
/* 213 */                           if (fMo299a >= 0.0f || interpolation2 > 0.0f) {
/* 225 */                               f5 = interpolation2;
                                    } else {
/* 219 */                               this.f934u0 = 0.0f;
/* 221 */                               this.f938y0 = false;
/* 223 */                               f5 = 0.0f;
                                    }
                                } else {
/* 225 */                           f5 = interpolation2;
                                }
                            } else {
/* 227 */                       float interpolation3 = ak1Var.getInterpolation(f5);
/* 231 */                       ak1 ak1Var4 = this.f910h0;
/* 233 */                       if (ak1Var4 != null) {
/* 239 */                           this.f914j0 = ak1Var4.mo299a();
                                } else {
/* 250 */                           this.f914j0 = ((ak1Var4.getInterpolation(f5 + f4) - interpolation3) * fSignum) / f4;
                                }
/* 252 */                       f5 = interpolation3;
                            }
/* 266 */                   if (Math.abs(this.f914j0) > 1.0E-5f) {
/* 270 */                       setState(hk1.f9121c);
                            }
/* 273 */                   hk1Var = hk1.f9122d;
/* 275 */                   if (c != 1) {
/* 277 */                       if ((fSignum <= 0.0f && f5 >= this.f936w0) || (fSignum <= 0.0f && f5 <= this.f936w0)) {
/* 295 */                           f5 = this.f936w0;
/* 297 */                           this.f938y0 = false;
                                }
/* 301 */                       if (f5 < 1.0f || f5 <= 0.0f) {
/* 307 */                           this.f938y0 = false;
/* 309 */                           setState(hk1Var);
                                }
                            }
/* 312 */                   childCount = getChildCount();
/* 316 */                   this.f889N0 = false;
/* 318 */                   nanoTime = getNanoTime();
/* 322 */                   this.f906e1 = f5;
/* 324 */                   interpolator = this.f912i0;
/* 326 */                   if (interpolator == null) {
/* 328 */                       interpolation = f5;
                            } else {
/* 330 */                       interpolation = interpolator.getInterpolation(f5);
                            }
/* 335 */                   interpolator2 = this.f912i0;
/* 337 */                   if (interpolator2 != null) {
/* 344 */                       float interpolation4 = interpolator2.getInterpolation((fSignum / this.f932s0) + f5);
/* 348 */                       this.f914j0 = interpolation4;
/* 357 */                       this.f914j0 = interpolation4 - this.f912i0.getInterpolation(f5);
                            }
/* 359 */                   i = 0;
/* 360 */                   while (i < childCount) {
/* 362 */                       childAt = getChildAt(i);
/* 373 */                       zj1Var = (zj1) this.f928q0.get(childAt);
/* 375 */                       if (zj1Var != null) {
/* 392 */                           this.f889N0 = zj1Var.m10362e(interpolation, nanoTime, this.f907f1, childAt) | this.f889N0;
                                }
/* 397 */                       i++;
/* 399 */                       f3 = f3;
                            }
/* 402 */                   f = f3;
/* 424 */                   boolean z5 = (fSignum <= 0.0f && f5 >= this.f936w0) || (fSignum <= f && f5 <= this.f936w0);
/* 427 */                   if (!this.f889N0 && !this.f938y0 && z5) {
/* 435 */                       setState(hk1Var);
                            }
/* 440 */                   if (this.f899X0) {
/* 442 */                       requestLayout();
                            }
/* 449 */                   this.f889N0 = (!z5) | this.f889N0;
/* 453 */                   if (f5 <= f && (i4 = this.f916k0) != -1 && this.f918l0 != i4) {
/* 463 */                       this.f918l0 = i4;
/* 471 */                       this.f908g0.m6467b(i4).m536a(this);
/* 474 */                       setState(hk1Var);
/* 477 */                       z4 = true;
                            }
/* 483 */                   if (f5 >= 1.0d) {
/* 485 */                       i2 = this.f918l0;
/* 487 */                       i3 = this.f920m0;
/* 489 */                       if (i2 != i3) {
/* 491 */                           this.f918l0 = i3;
/* 499 */                           this.f908g0.m6467b(i3).m536a(this);
/* 502 */                           setState(hk1Var);
/* 505 */                           z4 = true;
                                }
                            }
/* 508 */                   if (!this.f889N0 || this.f938y0) {
/* 533 */                       invalidate();
                            } else if ((fSignum > 0.0f && f5 == 1.0f) || (fSignum < f && f5 == f)) {
/* 529 */                       setState(hk1Var);
                            }
/* 538 */                   if (!this.f889N0 && !this.f938y0 && ((fSignum > 0.0f && f5 == 1.0f) || (fSignum < f && f5 == f))) {
/* 558 */                       m482t();
                            }
                        }
/* 253 */               c = 0;
/* 266 */               if (Math.abs(this.f914j0) > 1.0E-5f) {
/* 270 */                   setState(hk1.f9121c);
                        }
/* 273 */               hk1Var = hk1.f9122d;
/* 275 */               if (c != 1) {
/* 277 */                   if (fSignum <= 0.0f) {
/* 295 */                       f5 = this.f936w0;
/* 297 */                       this.f938y0 = false;
                            } else {
/* 295 */                       f5 = this.f936w0;
/* 297 */                       this.f938y0 = false;
                            }
/* 301 */                   if (f5 < 1.0f) {
/* 307 */                       this.f938y0 = false;
/* 309 */                       setState(hk1Var);
                            } else {
/* 307 */                       this.f938y0 = false;
/* 309 */                       setState(hk1Var);
                            }
                        }
/* 312 */               childCount = getChildCount();
/* 316 */               this.f889N0 = false;
/* 318 */               nanoTime = getNanoTime();
/* 322 */               this.f906e1 = f5;
/* 324 */               interpolator = this.f912i0;
/* 326 */               if (interpolator == null) {
/* 328 */                   interpolation = f5;
                        } else {
/* 330 */                   interpolation = interpolator.getInterpolation(f5);
                        }
/* 335 */               interpolator2 = this.f912i0;
/* 337 */               if (interpolator2 != null) {
/* 344 */                   float interpolation5 = interpolator2.getInterpolation((fSignum / this.f932s0) + f5);
/* 348 */                   this.f914j0 = interpolation5;
/* 357 */                   this.f914j0 = interpolation5 - this.f912i0.getInterpolation(f5);
                        }
/* 359 */               i = 0;
/* 360 */               while (i < childCount) {
/* 362 */                   childAt = getChildAt(i);
/* 373 */                   zj1Var = (zj1) this.f928q0.get(childAt);
/* 375 */                   if (zj1Var != null) {
/* 392 */                       this.f889N0 = zj1Var.m10362e(interpolation, nanoTime, this.f907f1, childAt) | this.f889N0;
                            }
/* 397 */                   i++;
/* 399 */                   f3 = f3;
                        }
/* 402 */               f = f3;
/* 424 */               if (fSignum <= 0.0f) {
                        }
/* 427 */               if (!this.f889N0) {
/* 435 */                   setState(hk1Var);
                        }
/* 440 */               if (this.f899X0) {
/* 442 */                   requestLayout();
                        }
/* 449 */               this.f889N0 = (!z5) | this.f889N0;
/* 453 */               if (f5 <= f) {
/* 463 */                   this.f918l0 = i4;
/* 471 */                   this.f908g0.m6467b(i4).m536a(this);
/* 474 */                   setState(hk1Var);
/* 477 */                   z4 = true;
                        }
/* 483 */               if (f5 >= 1.0d) {
/* 485 */                   i2 = this.f918l0;
/* 487 */                   i3 = this.f920m0;
/* 489 */                   if (i2 != i3) {
/* 491 */                       this.f918l0 = i3;
/* 499 */                       this.f908g0.m6467b(i3).m536a(this);
/* 502 */                       setState(hk1Var);
/* 505 */                       z4 = true;
                            }
                        }
/* 508 */               if (this.f889N0) {
/* 533 */                   invalidate();
                        } else {
/* 533 */                   invalidate();
                        }
/* 538 */               if (!this.f889N0) {
/* 558 */                   m482t();
                        }
                    } else {
/* 52 */                f = 0.0f;
                    }
/* 561 */           float f6 = this.f934u0;
/* 565 */           if (f6 < 1.0f) {
/* 581 */               if (f6 <= f) {
/* 583 */                   int i5 = this.f918l0;
/* 585 */                   int i6 = this.f916k0;
/* 587 */                   z3 = i5 == i6 ? z4 : true;
/* 591 */                   this.f918l0 = i6;
                        }
/* 597 */               this.f923n1 |= z4;
/* 599 */               if (z4 && !this.f909g1) {
/* 605 */                   requestLayout();
                        }
/* 610 */               this.f933t0 = this.f934u0;
                    }
/* 567 */           int i7 = this.f918l0;
/* 569 */           int i8 = this.f920m0;
/* 571 */           z3 = i7 == i8 ? z4 : true;
/* 575 */           this.f918l0 = i8;
/* 577 */           z4 = z3;
/* 597 */           this.f923n1 |= z4;
/* 599 */           if (z4) {
/* 605 */               requestLayout();
                    }
/* 610 */           this.f933t0 = this.f934u0;
                }

                /* JADX INFO: renamed from: n */
                public final void m476n() {
                    CopyOnWriteArrayList copyOnWriteArrayList;
                    CopyOnWriteArrayList copyOnWriteArrayList2;
/* 3 */             if ((this.f939z0 == null && ((copyOnWriteArrayList2 = this.f893R0) == null || copyOnWriteArrayList2.isEmpty())) || this.f898W0 == this.f933t0) {
/* 82 */                return;
                    }
/* 26 */            if (this.f897V0 != -1 && (copyOnWriteArrayList = this.f893R0) != null) {
/* 32 */                Iterator it = copyOnWriteArrayList.iterator();
/* 40 */                while (it.hasNext()) {
/* 48 */                    ((gk1) it.next()).getClass();
                        }
                    }
/* 52 */            this.f897V0 = -1;
/* 56 */            this.f898W0 = this.f933t0;
/* 58 */            CopyOnWriteArrayList copyOnWriteArrayList3 = this.f893R0;
/* 60 */            if (copyOnWriteArrayList3 != null) {
/* 62 */                Iterator it2 = copyOnWriteArrayList3.iterator();
/* 70 */                while (it2.hasNext()) {
/* 78 */                    ((gk1) it2.next()).getClass();
                        }
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m477o() {
                    CopyOnWriteArrayList copyOnWriteArrayList;
/* 3 */             if ((this.f939z0 != null || ((copyOnWriteArrayList = this.f893R0) != null && !copyOnWriteArrayList.isEmpty())) && this.f897V0 == -1) {
/* 22 */                this.f897V0 = this.f918l0;
/* 24 */                ArrayList arrayList = this.f931r1;
/* 49 */                int iIntValue = !arrayList.isEmpty() ? ((Integer) arrayList.get(arrayList.size() - 1)).intValue() : -1;
/* 50 */                int i = this.f918l0;
/* 52 */                if (iIntValue != i && i != -1) {
/* 60 */                    arrayList.add(Integer.valueOf(i));
                        }
                    }
/* 63 */            m483u();
/* 66 */            ji1 ji1Var = this.f913i1;
/* 68 */            if (ji1Var != null) {
/* 70 */                ji1Var.run();
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
                    kk1 kk1Var;
                    int i;
/* 1 */             super.onAttachedToWindow();
/* 4 */             Display display = getDisplay();
/* 8 */             if (display != null) {
/* 10 */                display.getRotation();
                    }
/* 13 */            lk1 lk1Var = this.f908g0;
/* 15 */            if (lk1Var != null && (i = this.f918l0) != -1) {
/* 22 */                C0077d c0077dM6467b = lk1Var.m6467b(i);
/* 26 */                lk1 lk1Var2 = this.f908g0;
/* 28 */                SparseArray sparseArray = lk1Var2.f13347g;
/* 35 */                loop0: for (int i2 = 0; i2 < sparseArray.size(); i2++) {
/* 37 */                    int iKeyAt = sparseArray.keyAt(i2);
/* 41 */                    SparseIntArray sparseIntArray = lk1Var2.f13349i;
/* 43 */                    int i3 = sparseIntArray.get(iKeyAt);
/* 47 */                    int size = sparseIntArray.size();
                            while (true) {
/* 51 */                        if (i3 > 0) {
/* 53 */                            if (i3 != iKeyAt) {
/* 56 */                                int i4 = size - 1;
/* 58 */                                if (size >= 0) {
/* 68 */                                    i3 = sparseIntArray.get(i3);
/* 72 */                                    size = i4;
                                        }
                                    }
/* 64 */                            AbstractC1245n0.m4876d("MotionScene", "Cannot be derived from yourself");
                                    break loop0;
                                }
/* 74 */                        lk1Var2.m6478m(iKeyAt, this);
                            }
                        }
/* 80 */                ArrayList arrayList = this.f892Q0;
/* 82 */                if (arrayList != null) {
/* 84 */                    Iterator it = arrayList.iterator();
/* 92 */                    while (it.hasNext()) {
/* 100 */                       ((MotionHelper) it.next()).getClass();
                            }
                        }
/* 104 */               if (c0077dM6467b != null) {
/* 106 */                   c0077dM6467b.m537b(this);
                        }
/* 111 */               this.f916k0 = this.f918l0;
                    }
/* 113 */           m482t();
/* 116 */           fk1 fk1Var = this.f911h1;
/* 118 */           if (fk1Var != null) {
/* 122 */               if (this.f917k1) {
/* 131 */                   post(new RunnableC2495ye(this, 18));
/* 134 */                   return;
                        } else {
/* 135 */                   fk1Var.m3770a();
/* 138 */                   return;
                        }
                    }
/* 139 */           lk1 lk1Var3 = this.f908g0;
/* 141 */           if (lk1Var3 == null || (kk1Var = lk1Var3.f13343c) == null || kk1Var.f12852n != 4) {
/* 170 */               return;
                    }
/* 154 */           m473k(1.0f);
/* 158 */           this.f913i1 = null;
/* 162 */           setState(hk1.f9120b);
/* 167 */           setState(hk1.f9121c);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x028c  */
                /* JADX WARN: Code duplicated, block: B:102:0x028f  */
                /* JADX WARN: Code duplicated, block: B:104:0x0292  */
                /* JADX WARN: Code duplicated, block: B:105:0x0295  */
                /* JADX WARN: Code duplicated, block: B:107:0x029c  */
                /* JADX WARN: Code duplicated, block: B:108:0x02a2  */
                /* JADX WARN: Code duplicated, block: B:109:0x02a8  */
                /* JADX WARN: Code duplicated, block: B:110:0x02ae  */
                /* JADX WARN: Code duplicated, block: B:111:0x02b4  */
                /* JADX WARN: Code duplicated, block: B:112:0x02bb  */
                /* JADX WARN: Code duplicated, block: B:113:0x02ca  */
                /* JADX WARN: Code duplicated, block: B:115:0x02e9  */
                /* JADX WARN: Code duplicated, block: B:117:0x02f6  */
                /* JADX WARN: Code duplicated, block: B:120:0x02ff  */
                /* JADX WARN: Code duplicated, block: B:123:0x0304  */
                /* JADX WARN: Code duplicated, block: B:125:0x0308  */
                /* JADX WARN: Code duplicated, block: B:126:0x030a  */
                /* JADX WARN: Code duplicated, block: B:129:0x031a  */
                /* JADX WARN: Code duplicated, block: B:131:0x031e  */
                /* JADX WARN: Code duplicated, block: B:137:0x0345  */
                /* JADX WARN: Code duplicated, block: B:143:0x036a  */
                /* JADX WARN: Code duplicated, block: B:145:0x036e  */
                /* JADX WARN: Code duplicated, block: B:149:0x0395  */
                /* JADX WARN: Code duplicated, block: B:152:0x03b3  */
                /* JADX WARN: Code duplicated, block: B:155:0x03d1 A[LOOP:7: B:153:0x03cb->B:155:0x03d1, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:158:0x03f8  */
                /* JADX WARN: Code duplicated, block: B:162:0x042c  */
                /* JADX WARN: Code duplicated, block: B:209:0x010e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:211:0x00fb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:215:0x0328 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:216:0x0328 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:218:0x0356 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:220:0x033f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
                /* JADX WARN: Code duplicated, block: B:68:0x0101  */
                /* JADX WARN: Code duplicated, block: B:73:0x0119  */
                /* JADX WARN: Code duplicated, block: B:75:0x0125  */
                /* JADX WARN: Code duplicated, block: B:76:0x0132  */
                /* JADX WARN: Code duplicated, block: B:78:0x0139  */
                /* JADX WARN: Code duplicated, block: B:80:0x019a  */
                /* JADX WARN: Code duplicated, block: B:81:0x019c  */
                /* JADX WARN: Code duplicated, block: B:84:0x0201  */
                /* JADX WARN: Code duplicated, block: B:85:0x0203  */
                /* JADX WARN: Code duplicated, block: B:88:0x0255  */
                /* JADX WARN: Code duplicated, block: B:91:0x027e  */
                /* JADX WARN: Code duplicated, block: B:93:0x0281 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:94:0x0283  */
                /* JADX WARN: Code duplicated, block: B:96:0x0286  */
                /* JADX WARN: Code duplicated, block: B:98:0x0289  */
                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean z;
                    mq2 mq2Var;
                    int i;
                    RectF rectFM6787b;
                    int i2;
                    View[] viewArr;
                    m31 m31Var;
                    C0076c c0076c;
                    int i3;
                    HashMap map;
                    C0076c c0076cM541i;
                    kk1 kk1Var;
                    int i4;
                    int id;
                    m31 m31Var2;
                    Iterator it;
                    C2236tz c2236tz;
                    C0076c c0076c2;
                    int i5;
                    lk1 lk1Var;
                    C0077d c0077dM6467b;
                    C0076c c0076cM541i2;
                    C2236tz c2236tz2;
                    View view;
                    zj1 zj1Var;
                    float alpha;
                    float alpha2;
                    ArrayList arrayList;
                    Context context;
                    int i6;
                    char c;
                    Interpolator interpolatorLoadInterpolator;
/* 8 */             lk1 lk1Var2 = this.f908g0;
/* 10 */            if (lk1Var2 == null || !this.f926p0) {
/* 16 */                return false;
                    }
/* 20 */            C0168b5 c0168b5 = lk1Var2.f13357q;
/* 22 */            if (c0168b5 != null) {
/* 26 */                ArrayList<e53> arrayList2 = (ArrayList) c0168b5.f2212c;
/* 30 */                MotionLayout motionLayout = (MotionLayout) c0168b5.f2211b;
/* 32 */                int currentState = motionLayout.getCurrentState();
/* 36 */                if (currentState == -1) {
/* 1069 */                  z = false;
                        } else {
/* 44 */                    if (((HashSet) c0168b5.f2213d) == null) {
/* 51 */                        c0168b5.f2213d = new HashSet();
/* 61 */                        for (e53 e53Var : arrayList2) {
/* 69 */                            int childCount = motionLayout.getChildCount();
/* 74 */                            for (int i7 = 0; i7 < childCount; i7++) {
/* 76 */                                View childAt = motionLayout.getChildAt(i7);
/* 84 */                                if (e53Var.m3323a(childAt)) {
/* 86 */                                    childAt.getId();
/* 93 */                                    ((HashSet) c0168b5.f2213d).add(childAt);
                                        }
                                    }
                                }
                            }
/* 99 */                    float x = motionEvent.getX();
/* 103 */                   float y = motionEvent.getY();
/* 109 */                   Rect rect = new Rect();
/* 112 */                   int action = motionEvent.getAction();
/* 118 */                   ArrayList arrayList3 = (ArrayList) c0168b5.f2214e;
/* 120 */                   int i8 = 2;
/* 121 */                   int i9 = 1;
/* 122 */                   if (arrayList3 != null && !arrayList3.isEmpty()) {
/* 142 */                       for (d53 d53Var : (ArrayList) c0168b5.f2214e) {
/* 152 */                           Rect rect2 = d53Var.f7013l;
/* 154 */                           if (action != 1) {
/* 156 */                               if (action == i8) {
/* 163 */                                   d53Var.f7004c.f20177b.getHitRect(rect2);
/* 172 */                                   if (!rect2.contains((int) x, (int) y) && !d53Var.f7009h) {
/* 178 */                                       d53Var.m2944b();
                                            }
                                        }
                                    } else if (!d53Var.f7009h) {
/* 186 */                               d53Var.m2944b();
                                    }
/* 190 */                           i8 = 2;
                                }
                            }
/* 192 */                   z = false;
/* 194 */                   if (action == 0 || action == 1) {
/* 200 */                       lk1 lk1Var3 = motionLayout.f908g0;
/* 206 */                       C0077d c0077dM6467b2 = lk1Var3 == null ? null : lk1Var3.m6467b(currentState);
/* 210 */                       Iterator it2 = arrayList2.iterator();
/* 218 */                       while (it2.hasNext()) {
/* 224 */                           e53 e53Var2 = (e53) it2.next();
/* 226 */                           int i10 = e53Var2.f7527b;
/* 228 */                           if (i10 == i9) {
/* 230 */                               if (action == 0) {
/* 256 */                                   for (View view2 : (HashSet) c0168b5.f2213d) {
/* 268 */                                       if (e53Var2.m3323a(view2)) {
/* 271 */                                           view2.getHitRect(rect);
/* 280 */                                           if (rect.contains((int) x, (int) y)) {
/* 282 */                                               viewArr = new View[]{view2};
/* 286 */                                               m31Var = e53Var2.f7531f;
/* 288 */                                               c0076c = e53Var2.f7532g;
/* 292 */                                               if (e53Var2.f7528c) {
/* 304 */                                                   i2 = 1;
                                                        } else {
/* 307 */                                                   i3 = e53Var2.f7530e;
/* 309 */                                                   it2 = it2;
/* 312 */                                                   if (i3 == 2) {
/* 314 */                                                       view = viewArr[0];
/* 316 */                                                       float f = y;
/* 319 */                                                       zj1Var = new zj1(view);
/* 322 */                                                       ik1 ik1Var = zj1Var.f20181f;
/* 325 */                                                       ik1Var.f9688c = 0.0f;
/* 327 */                                                       ik1Var.f9689d = 0.0f;
/* 330 */                                                       zj1Var.f20175G = true;
/* 342 */                                                       y = f;
/* 349 */                                                       x = x;
/* 356 */                                                       ik1Var.m4574d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
/* 379 */                                                       zj1Var.f20182g.m4574d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
/* 382 */                                                       xj1 xj1Var = zj1Var.f20183h;
/* 384 */                                                       xj1Var.getClass();
/* 387 */                                                       view.getX();
/* 390 */                                                       view.getY();
/* 393 */                                                       view.getWidth();
/* 396 */                                                       view.getHeight();
/* 403 */                                                       xj1Var.f19222c = view.getVisibility();
/* 409 */                                                       if (view.getVisibility() != 0) {
/* 411 */                                                           alpha = 0.0f;
                                                                } else {
/* 413 */                                                           alpha = view.getAlpha();
                                                                }
/* 417 */                                                       xj1Var.f19218a = alpha;
/* 423 */                                                       xj1Var.f19223d = view.getElevation();
/* 429 */                                                       xj1Var.f19224e = view.getRotation();
/* 435 */                                                       xj1Var.f19225f = view.getRotationX();
/* 441 */                                                       xj1Var.f19226i = view.getRotationY();
/* 447 */                                                       xj1Var.f19227v = view.getScaleX();
/* 453 */                                                       xj1Var.f19228w = view.getScaleY();
/* 459 */                                                       xj1Var.f19212U = view.getPivotX();
/* 465 */                                                       xj1Var.f19213V = view.getPivotY();
/* 471 */                                                       xj1Var.f19214W = view.getTranslationX();
/* 477 */                                                       xj1Var.f19215X = view.getTranslationY();
/* 483 */                                                       xj1Var.f19216Y = view.getTranslationZ();
/* 485 */                                                       xj1 xj1Var2 = zj1Var.f20184i;
/* 487 */                                                       xj1Var2.getClass();
/* 490 */                                                       view.getX();
/* 493 */                                                       view.getY();
/* 496 */                                                       view.getWidth();
/* 499 */                                                       view.getHeight();
/* 506 */                                                       xj1Var2.f19222c = view.getVisibility();
/* 512 */                                                       if (view.getVisibility() != 0) {
/* 514 */                                                           alpha2 = 0.0f;
                                                                } else {
/* 516 */                                                           alpha2 = view.getAlpha();
                                                                }
/* 520 */                                                       xj1Var2.f19218a = alpha2;
/* 526 */                                                       xj1Var2.f19223d = view.getElevation();
/* 532 */                                                       xj1Var2.f19224e = view.getRotation();
/* 538 */                                                       xj1Var2.f19225f = view.getRotationX();
/* 544 */                                                       xj1Var2.f19226i = view.getRotationY();
/* 550 */                                                       xj1Var2.f19227v = view.getScaleX();
/* 556 */                                                       xj1Var2.f19228w = view.getScaleY();
/* 562 */                                                       xj1Var2.f19212U = view.getPivotX();
/* 568 */                                                       xj1Var2.f19213V = view.getPivotY();
/* 574 */                                                       xj1Var2.f19214W = view.getTranslationX();
/* 580 */                                                       xj1Var2.f19215X = view.getTranslationY();
/* 586 */                                                       xj1Var2.f19216Y = view.getTranslationZ();
/* 594 */                                                       arrayList = (ArrayList) m31Var.f13555a.get(-1);
/* 596 */                                                       if (arrayList != null) {
/* 600 */                                                           zj1Var.f20198w.addAll(arrayList);
                                                                }
/* 615 */                                                       zj1Var.m10364h(System.nanoTime(), motionLayout.getWidth(), motionLayout.getHeight());
/* 620 */                                                       Rect rect3 = rect;
/* 621 */                                                       int i11 = e53Var2.f7533h;
/* 623 */                                                       int i12 = action;
/* 624 */                                                       int i13 = e53Var2.f7534i;
/* 626 */                                                       int i14 = e53Var2.f7527b;
/* 628 */                                                       context = motionLayout.getContext();
/* 632 */                                                       i6 = e53Var2.f7537l;
/* 634 */                                                       rect = rect3;
/* 637 */                                                       if (i6 == -2) {
/* 715 */                                                           c = 2;
/* 718 */                                                           interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, e53Var2.f7539n);
                                                                } else if (i6 != -1) {
/* 642 */                                                           if (i6 == 0) {
/* 696 */                                                               interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                                                                    } else if (i6 == 1) {
/* 689 */                                                               interpolatorLoadInterpolator = new AccelerateInterpolator();
                                                                    } else if (i6 == 2) {
/* 683 */                                                               interpolatorLoadInterpolator = new DecelerateInterpolator();
                                                                    } else if (i6 == 4) {
/* 677 */                                                               interpolatorLoadInterpolator = new BounceInterpolator();
                                                                    } else if (i6 == 5) {
/* 671 */                                                               interpolatorLoadInterpolator = new OvershootInterpolator();
                                                                    } else if (i6 != 6) {
/* 659 */                                                               c = 2;
/* 660 */                                                               interpolatorLoadInterpolator = null;
                                                                    } else {
/* 664 */                                                               interpolatorLoadInterpolator = new AnticipateInterpolator();
                                                                    }
/* 667 */                                                           c = 2;
                                                                } else {
/* 709 */                                                           c = 2;
/* 710 */                                                           interpolatorLoadInterpolator = new yj1(C2131r4.m8062c(e53Var2.f7538m), 2);
                                                                }
/* 732 */                                                       action = i12;
/* 739 */                                                       i2 = 1;
/* 740 */                                                       new d53(c0168b5, zj1Var, i11, i13, i14, interpolatorLoadInterpolator, e53Var2.f7541p, e53Var2.f7542q);
/* 743 */                                                       e53Var2 = e53Var2;
                                                            } else {
/* 748 */                                                       x = x;
/* 750 */                                                       y = y;
/* 752 */                                                       rect = rect;
/* 754 */                                                       action = action;
/* 756 */                                                       i2 = 1;
/* 757 */                                                       if (i3 == 1) {
/* 766 */                                                           for (int i15 : motionLayout.getConstraintSetIds()) {
/* 770 */                                                               if (i15 != currentState) {
/* 773 */                                                                   lk1Var = motionLayout.f908g0;
/* 775 */                                                                   if (lk1Var == null) {
/* 777 */                                                                       c0077dM6467b = null;
                                                                            } else {
/* 779 */                                                                       c0077dM6467b = lk1Var.m6467b(i15);
                                                                            }
/* 789 */                                                                   c0076cM541i2 = c0077dM6467b.m541i(viewArr[0].getId());
/* 793 */                                                                   if (c0076c != null) {
/* 795 */                                                                       c2236tz2 = c0076c.f1183h;
/* 797 */                                                                       if (c2236tz2 != null) {
/* 799 */                                                                           c2236tz2.m8930e(c0076cM541i2);
                                                                                }
/* 806 */                                                                       c0076cM541i2.f1182g.putAll(c0076c.f1182g);
                                                                            }
                                                                        }
                                                                    }
                                                                }
/* 814 */                                                       C0077d c0077d = new C0077d();
/* 817 */                                                       map = c0077d.f1192f;
/* 819 */                                                       map.clear();
/* 836 */                                                       for (Integer num : c0077dM6467b2.f1192f.keySet()) {
/* 850 */                                                           c0076c2 = (C0076c) c0077dM6467b2.f1192f.get(num);
/* 852 */                                                           if (c0076c2 != null) {
/* 859 */                                                               map.put(num, c0076c2.clone());
                                                                    }
                                                                }
/* 869 */                                                       c0076cM541i = c0077d.m541i(viewArr[0].getId());
/* 873 */                                                       if (c0076c != null) {
/* 875 */                                                           c2236tz = c0076c.f1183h;
/* 877 */                                                           if (c2236tz != null) {
/* 879 */                                                               c2236tz.m8930e(c0076cM541i);
                                                                    }
/* 886 */                                                           c0076cM541i.f1182g.putAll(c0076c.f1182g);
                                                                }
/* 889 */                                                       motionLayout.m471B(currentState, c0077d);
/* 894 */                                                       motionLayout.m471B(R$id.view_transition, c0077dM6467b2);
/* 899 */                                                       motionLayout.m486x(R$id.view_transition);
/* 908 */                                                       kk1Var = new kk1(motionLayout.f908g0, R$id.view_transition, currentState);
/* 911 */                                                       View view3 = viewArr[0];
/* 913 */                                                       i4 = e53Var2.f7533h;
/* 916 */                                                       if (i4 != -1) {
/* 924 */                                                           kk1Var.f12846h = Math.max(i4, 8);
                                                                }
/* 928 */                                                       kk1Var.f12854p = e53Var2.f7529d;
/* 930 */                                                       int i16 = e53Var2.f7537l;
/* 932 */                                                       String str = e53Var2.f7538m;
/* 934 */                                                       int i17 = e53Var2.f7539n;
/* 936 */                                                       kk1Var.f12843e = i16;
/* 938 */                                                       kk1Var.f12844f = str;
/* 940 */                                                       kk1Var.f12845g = i17;
/* 942 */                                                       id = view3.getId();
/* 946 */                                                       if (m31Var != null) {
/* 954 */                                                           ArrayList arrayList4 = (ArrayList) m31Var.f13555a.get(-1);
/* 958 */                                                           m31Var2 = new m31();
/* 966 */                                                           m31Var2.f13555a = new HashMap();
/* 968 */                                                           it = arrayList4.iterator();
/* 976 */                                                           while (it.hasNext()) {
/* 984 */                                                               a31 a31VarMo43a = ((a31) it.next()).clone();
/* 988 */                                                               a31VarMo43a.f73b = id;
/* 990 */                                                               m31Var2.m6595b(a31VarMo43a);
                                                                    }
/* 996 */                                                           kk1Var.f12849k.add(m31Var2);
                                                                }
/* 999 */                                                       motionLayout.setTransition(kk1Var);
/* 1006 */                                                      ji1 ji1Var = new ji1(17, e53Var2, viewArr);
/* 1011 */                                                      motionLayout.m473k(1.0f);
/* 1014 */                                                      motionLayout.f913i1 = ji1Var;
                                                            }
                                                        }
/* 1030 */                                              i9 = i2;
/* 1031 */                                              action = action;
/* 1033 */                                              it2 = it2;
/* 1035 */                                              rect = rect;
/* 1037 */                                              y = y;
/* 1039 */                                              x = x;
                                                    } else {
/* 1027 */                                              i2 = i9;
                                                    }
/* 1030 */                                          i9 = i2;
/* 1031 */                                          action = action;
/* 1033 */                                          it2 = it2;
/* 1035 */                                          rect = rect;
/* 1037 */                                          y = y;
/* 1039 */                                          x = x;
                                                }
                                            }
                                        }
                                    } else if (i10 == 2) {
/* 236 */                               if (action == i9) {
/* 256 */                                   while (r18.hasNext()) {
/* 268 */                                       if (e53Var2.m3323a(view2)) {
/* 271 */                                           view2.getHitRect(rect);
/* 280 */                                           if (rect.contains((int) x, (int) y)) {
/* 282 */                                               viewArr = new View[]{view2};
/* 286 */                                               m31Var = e53Var2.f7531f;
/* 288 */                                               c0076c = e53Var2.f7532g;
/* 292 */                                               if (e53Var2.f7528c) {
/* 304 */                                                   i2 = 1;
                                                        } else {
/* 307 */                                                   i3 = e53Var2.f7530e;
/* 309 */                                                   it2 = it2;
/* 312 */                                                   if (i3 == 2) {
/* 314 */                                                       view = viewArr[0];
/* 316 */                                                       float f2 = y;
/* 319 */                                                       zj1Var = new zj1(view);
/* 322 */                                                       ik1 ik1Var2 = zj1Var.f20181f;
/* 325 */                                                       ik1Var2.f9688c = 0.0f;
/* 327 */                                                       ik1Var2.f9689d = 0.0f;
/* 330 */                                                       zj1Var.f20175G = true;
/* 342 */                                                       y = f2;
/* 349 */                                                       x = x;
/* 356 */                                                       ik1Var2.m4574d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
/* 379 */                                                       zj1Var.f20182g.m4574d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
/* 382 */                                                       xj1 xj1Var3 = zj1Var.f20183h;
/* 384 */                                                       xj1Var3.getClass();
/* 387 */                                                       view.getX();
/* 390 */                                                       view.getY();
/* 393 */                                                       view.getWidth();
/* 396 */                                                       view.getHeight();
/* 403 */                                                       xj1Var3.f19222c = view.getVisibility();
/* 409 */                                                       if (view.getVisibility() != 0) {
/* 411 */                                                           alpha = 0.0f;
                                                                } else {
/* 413 */                                                           alpha = view.getAlpha();
                                                                }
/* 417 */                                                       xj1Var3.f19218a = alpha;
/* 423 */                                                       xj1Var3.f19223d = view.getElevation();
/* 429 */                                                       xj1Var3.f19224e = view.getRotation();
/* 435 */                                                       xj1Var3.f19225f = view.getRotationX();
/* 441 */                                                       xj1Var3.f19226i = view.getRotationY();
/* 447 */                                                       xj1Var3.f19227v = view.getScaleX();
/* 453 */                                                       xj1Var3.f19228w = view.getScaleY();
/* 459 */                                                       xj1Var3.f19212U = view.getPivotX();
/* 465 */                                                       xj1Var3.f19213V = view.getPivotY();
/* 471 */                                                       xj1Var3.f19214W = view.getTranslationX();
/* 477 */                                                       xj1Var3.f19215X = view.getTranslationY();
/* 483 */                                                       xj1Var3.f19216Y = view.getTranslationZ();
/* 485 */                                                       xj1 xj1Var4 = zj1Var.f20184i;
/* 487 */                                                       xj1Var4.getClass();
/* 490 */                                                       view.getX();
/* 493 */                                                       view.getY();
/* 496 */                                                       view.getWidth();
/* 499 */                                                       view.getHeight();
/* 506 */                                                       xj1Var4.f19222c = view.getVisibility();
/* 512 */                                                       if (view.getVisibility() != 0) {
/* 514 */                                                           alpha2 = 0.0f;
                                                                } else {
/* 516 */                                                           alpha2 = view.getAlpha();
                                                                }
/* 520 */                                                       xj1Var4.f19218a = alpha2;
/* 526 */                                                       xj1Var4.f19223d = view.getElevation();
/* 532 */                                                       xj1Var4.f19224e = view.getRotation();
/* 538 */                                                       xj1Var4.f19225f = view.getRotationX();
/* 544 */                                                       xj1Var4.f19226i = view.getRotationY();
/* 550 */                                                       xj1Var4.f19227v = view.getScaleX();
/* 556 */                                                       xj1Var4.f19228w = view.getScaleY();
/* 562 */                                                       xj1Var4.f19212U = view.getPivotX();
/* 568 */                                                       xj1Var4.f19213V = view.getPivotY();
/* 574 */                                                       xj1Var4.f19214W = view.getTranslationX();
/* 580 */                                                       xj1Var4.f19215X = view.getTranslationY();
/* 586 */                                                       xj1Var4.f19216Y = view.getTranslationZ();
/* 594 */                                                       arrayList = (ArrayList) m31Var.f13555a.get(-1);
/* 596 */                                                       if (arrayList != null) {
/* 600 */                                                           zj1Var.f20198w.addAll(arrayList);
                                                                }
/* 615 */                                                       zj1Var.m10364h(System.nanoTime(), motionLayout.getWidth(), motionLayout.getHeight());
/* 620 */                                                       Rect rect4 = rect;
/* 621 */                                                       int i18 = e53Var2.f7533h;
/* 623 */                                                       int i19 = action;
/* 624 */                                                       int i110 = e53Var2.f7534i;
/* 626 */                                                       int i111 = e53Var2.f7527b;
/* 628 */                                                       context = motionLayout.getContext();
/* 632 */                                                       i6 = e53Var2.f7537l;
/* 634 */                                                       rect = rect4;
/* 637 */                                                       if (i6 == -2) {
/* 715 */                                                           c = 2;
/* 718 */                                                           interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, e53Var2.f7539n);
                                                                } else if (i6 != -1) {
/* 642 */                                                           if (i6 == 0) {
/* 696 */                                                               interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                                                                    } else if (i6 == 1) {
/* 689 */                                                               interpolatorLoadInterpolator = new AccelerateInterpolator();
                                                                    } else if (i6 == 2) {
/* 683 */                                                               interpolatorLoadInterpolator = new DecelerateInterpolator();
                                                                    } else if (i6 == 4) {
/* 677 */                                                               interpolatorLoadInterpolator = new BounceInterpolator();
                                                                    } else if (i6 == 5) {
/* 671 */                                                               interpolatorLoadInterpolator = new OvershootInterpolator();
                                                                    } else if (i6 != 6) {
/* 659 */                                                               c = 2;
/* 660 */                                                               interpolatorLoadInterpolator = null;
                                                                    } else {
/* 664 */                                                               interpolatorLoadInterpolator = new AnticipateInterpolator();
                                                                    }
/* 667 */                                                           c = 2;
                                                                } else {
/* 709 */                                                           c = 2;
/* 710 */                                                           interpolatorLoadInterpolator = new yj1(C2131r4.m8062c(e53Var2.f7538m), 2);
                                                                }
/* 732 */                                                       action = i19;
/* 739 */                                                       i2 = 1;
/* 740 */                                                       new d53(c0168b5, zj1Var, i18, i110, i111, interpolatorLoadInterpolator, e53Var2.f7541p, e53Var2.f7542q);
/* 743 */                                                       e53Var2 = e53Var2;
                                                            } else {
/* 748 */                                                       x = x;
/* 750 */                                                       y = y;
/* 752 */                                                       rect = rect;
/* 754 */                                                       action = action;
/* 756 */                                                       i2 = 1;
/* 757 */                                                       if (i3 == 1) {
/* 766 */                                                           while (i5 < r6.length) {
/* 770 */                                                               if (i15 != currentState) {
/* 773 */                                                                   lk1Var = motionLayout.f908g0;
/* 775 */                                                                   if (lk1Var == null) {
/* 777 */                                                                       c0077dM6467b = null;
                                                                            } else {
/* 779 */                                                                       c0077dM6467b = lk1Var.m6467b(i15);
                                                                            }
/* 789 */                                                                   c0076cM541i2 = c0077dM6467b.m541i(viewArr[0].getId());
/* 793 */                                                                   if (c0076c != null) {
/* 795 */                                                                       c2236tz2 = c0076c.f1183h;
/* 797 */                                                                       if (c2236tz2 != null) {
/* 799 */                                                                           c2236tz2.m8930e(c0076cM541i2);
                                                                                }
/* 806 */                                                                       c0076cM541i2.f1182g.putAll(c0076c.f1182g);
                                                                            }
                                                                        }
                                                                    }
                                                                }
/* 814 */                                                       C0077d c0077d2 = new C0077d();
/* 817 */                                                       map = c0077d2.f1192f;
/* 819 */                                                       map.clear();
/* 836 */                                                       while (r9.hasNext()) {
/* 850 */                                                           c0076c2 = (C0076c) c0077dM6467b2.f1192f.get(num);
/* 852 */                                                           if (c0076c2 != null) {
/* 859 */                                                               map.put(num, c0076c2.clone());
                                                                    }
                                                                }
/* 869 */                                                       c0076cM541i = c0077d2.m541i(viewArr[0].getId());
/* 873 */                                                       if (c0076c != null) {
/* 875 */                                                           c2236tz = c0076c.f1183h;
/* 877 */                                                           if (c2236tz != null) {
/* 879 */                                                               c2236tz.m8930e(c0076cM541i);
                                                                    }
/* 886 */                                                           c0076cM541i.f1182g.putAll(c0076c.f1182g);
                                                                }
/* 889 */                                                       motionLayout.m471B(currentState, c0077d2);
/* 894 */                                                       motionLayout.m471B(R$id.view_transition, c0077dM6467b2);
/* 899 */                                                       motionLayout.m486x(R$id.view_transition);
/* 908 */                                                       kk1Var = new kk1(motionLayout.f908g0, R$id.view_transition, currentState);
/* 911 */                                                       View view4 = viewArr[0];
/* 913 */                                                       i4 = e53Var2.f7533h;
/* 916 */                                                       if (i4 != -1) {
/* 924 */                                                           kk1Var.f12846h = Math.max(i4, 8);
                                                                }
/* 928 */                                                       kk1Var.f12854p = e53Var2.f7529d;
/* 930 */                                                       int i112 = e53Var2.f7537l;
/* 932 */                                                       String str2 = e53Var2.f7538m;
/* 934 */                                                       int i113 = e53Var2.f7539n;
/* 936 */                                                       kk1Var.f12843e = i112;
/* 938 */                                                       kk1Var.f12844f = str2;
/* 940 */                                                       kk1Var.f12845g = i113;
/* 942 */                                                       id = view4.getId();
/* 946 */                                                       if (m31Var != null) {
/* 954 */                                                           ArrayList arrayList5 = (ArrayList) m31Var.f13555a.get(-1);
/* 958 */                                                           m31Var2 = new m31();
/* 966 */                                                           m31Var2.f13555a = new HashMap();
/* 968 */                                                           it = arrayList5.iterator();
/* 976 */                                                           while (it.hasNext()) {
/* 984 */                                                               a31 a31VarMo43a2 = ((a31) it.next()).clone();
/* 988 */                                                               a31VarMo43a2.f73b = id;
/* 990 */                                                               m31Var2.m6595b(a31VarMo43a2);
                                                                    }
/* 996 */                                                           kk1Var.f12849k.add(m31Var2);
                                                                }
/* 999 */                                                       motionLayout.setTransition(kk1Var);
/* 1006 */                                                      ji1 ji1Var2 = new ji1(17, e53Var2, viewArr);
/* 1011 */                                                      motionLayout.m473k(1.0f);
/* 1014 */                                                      motionLayout.f913i1 = ji1Var2;
                                                            }
                                                        }
/* 1030 */                                              i9 = i2;
/* 1031 */                                              action = action;
/* 1033 */                                              it2 = it2;
/* 1035 */                                              rect = rect;
/* 1037 */                                              y = y;
/* 1039 */                                              x = x;
                                                    } else {
/* 1027 */                                              i2 = i9;
                                                    }
/* 1030 */                                          i9 = i2;
/* 1031 */                                          action = action;
/* 1033 */                                          it2 = it2;
/* 1035 */                                          rect = rect;
/* 1037 */                                          y = y;
/* 1039 */                                          x = x;
                                                }
                                            }
                                        }
                                    } else if (i10 == 3 && action == 0) {
/* 256 */                               while (r18.hasNext()) {
/* 268 */                                   if (e53Var2.m3323a(view2)) {
/* 271 */                                       view2.getHitRect(rect);
/* 280 */                                       if (rect.contains((int) x, (int) y)) {
/* 282 */                                           viewArr = new View[]{view2};
/* 286 */                                           m31Var = e53Var2.f7531f;
/* 288 */                                           c0076c = e53Var2.f7532g;
/* 292 */                                           if (e53Var2.f7528c) {
/* 304 */                                               i2 = 1;
                                                    } else {
/* 307 */                                               i3 = e53Var2.f7530e;
/* 309 */                                               it2 = it2;
/* 312 */                                               if (i3 == 2) {
/* 314 */                                                   view = viewArr[0];
/* 316 */                                                   float f3 = y;
/* 319 */                                                   zj1Var = new zj1(view);
/* 322 */                                                   ik1 ik1Var3 = zj1Var.f20181f;
/* 325 */                                                   ik1Var3.f9688c = 0.0f;
/* 327 */                                                   ik1Var3.f9689d = 0.0f;
/* 330 */                                                   zj1Var.f20175G = true;
/* 342 */                                                   y = f3;
/* 349 */                                                   x = x;
/* 356 */                                                   ik1Var3.m4574d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
/* 379 */                                                   zj1Var.f20182g.m4574d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
/* 382 */                                                   xj1 xj1Var5 = zj1Var.f20183h;
/* 384 */                                                   xj1Var5.getClass();
/* 387 */                                                   view.getX();
/* 390 */                                                   view.getY();
/* 393 */                                                   view.getWidth();
/* 396 */                                                   view.getHeight();
/* 403 */                                                   xj1Var5.f19222c = view.getVisibility();
/* 409 */                                                   if (view.getVisibility() != 0) {
/* 411 */                                                       alpha = 0.0f;
                                                            } else {
/* 413 */                                                       alpha = view.getAlpha();
                                                            }
/* 417 */                                                   xj1Var5.f19218a = alpha;
/* 423 */                                                   xj1Var5.f19223d = view.getElevation();
/* 429 */                                                   xj1Var5.f19224e = view.getRotation();
/* 435 */                                                   xj1Var5.f19225f = view.getRotationX();
/* 441 */                                                   xj1Var5.f19226i = view.getRotationY();
/* 447 */                                                   xj1Var5.f19227v = view.getScaleX();
/* 453 */                                                   xj1Var5.f19228w = view.getScaleY();
/* 459 */                                                   xj1Var5.f19212U = view.getPivotX();
/* 465 */                                                   xj1Var5.f19213V = view.getPivotY();
/* 471 */                                                   xj1Var5.f19214W = view.getTranslationX();
/* 477 */                                                   xj1Var5.f19215X = view.getTranslationY();
/* 483 */                                                   xj1Var5.f19216Y = view.getTranslationZ();
/* 485 */                                                   xj1 xj1Var6 = zj1Var.f20184i;
/* 487 */                                                   xj1Var6.getClass();
/* 490 */                                                   view.getX();
/* 493 */                                                   view.getY();
/* 496 */                                                   view.getWidth();
/* 499 */                                                   view.getHeight();
/* 506 */                                                   xj1Var6.f19222c = view.getVisibility();
/* 512 */                                                   if (view.getVisibility() != 0) {
/* 514 */                                                       alpha2 = 0.0f;
                                                            } else {
/* 516 */                                                       alpha2 = view.getAlpha();
                                                            }
/* 520 */                                                   xj1Var6.f19218a = alpha2;
/* 526 */                                                   xj1Var6.f19223d = view.getElevation();
/* 532 */                                                   xj1Var6.f19224e = view.getRotation();
/* 538 */                                                   xj1Var6.f19225f = view.getRotationX();
/* 544 */                                                   xj1Var6.f19226i = view.getRotationY();
/* 550 */                                                   xj1Var6.f19227v = view.getScaleX();
/* 556 */                                                   xj1Var6.f19228w = view.getScaleY();
/* 562 */                                                   xj1Var6.f19212U = view.getPivotX();
/* 568 */                                                   xj1Var6.f19213V = view.getPivotY();
/* 574 */                                                   xj1Var6.f19214W = view.getTranslationX();
/* 580 */                                                   xj1Var6.f19215X = view.getTranslationY();
/* 586 */                                                   xj1Var6.f19216Y = view.getTranslationZ();
/* 594 */                                                   arrayList = (ArrayList) m31Var.f13555a.get(-1);
/* 596 */                                                   if (arrayList != null) {
/* 600 */                                                       zj1Var.f20198w.addAll(arrayList);
                                                            }
/* 615 */                                                   zj1Var.m10364h(System.nanoTime(), motionLayout.getWidth(), motionLayout.getHeight());
/* 620 */                                                   Rect rect5 = rect;
/* 621 */                                                   int i114 = e53Var2.f7533h;
/* 623 */                                                   int i115 = action;
/* 624 */                                                   int i116 = e53Var2.f7534i;
/* 626 */                                                   int i117 = e53Var2.f7527b;
/* 628 */                                                   context = motionLayout.getContext();
/* 632 */                                                   i6 = e53Var2.f7537l;
/* 634 */                                                   rect = rect5;
/* 637 */                                                   if (i6 == -2) {
/* 715 */                                                       c = 2;
/* 718 */                                                       interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, e53Var2.f7539n);
                                                            } else if (i6 != -1) {
/* 642 */                                                       if (i6 == 0) {
/* 696 */                                                           interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                                                                } else if (i6 == 1) {
/* 689 */                                                           interpolatorLoadInterpolator = new AccelerateInterpolator();
                                                                } else if (i6 == 2) {
/* 683 */                                                           interpolatorLoadInterpolator = new DecelerateInterpolator();
                                                                } else if (i6 == 4) {
/* 677 */                                                           interpolatorLoadInterpolator = new BounceInterpolator();
                                                                } else if (i6 == 5) {
/* 671 */                                                           interpolatorLoadInterpolator = new OvershootInterpolator();
                                                                } else if (i6 != 6) {
/* 659 */                                                           c = 2;
/* 660 */                                                           interpolatorLoadInterpolator = null;
                                                                } else {
/* 664 */                                                           interpolatorLoadInterpolator = new AnticipateInterpolator();
                                                                }
/* 667 */                                                       c = 2;
                                                            } else {
/* 709 */                                                       c = 2;
/* 710 */                                                       interpolatorLoadInterpolator = new yj1(C2131r4.m8062c(e53Var2.f7538m), 2);
                                                            }
/* 732 */                                                   action = i115;
/* 739 */                                                   i2 = 1;
/* 740 */                                                   new d53(c0168b5, zj1Var, i114, i116, i117, interpolatorLoadInterpolator, e53Var2.f7541p, e53Var2.f7542q);
/* 743 */                                                   e53Var2 = e53Var2;
                                                        } else {
/* 748 */                                                   x = x;
/* 750 */                                                   y = y;
/* 752 */                                                   rect = rect;
/* 754 */                                                   action = action;
/* 756 */                                                   i2 = 1;
/* 757 */                                                   if (i3 == 1) {
/* 766 */                                                       while (i5 < r6.length) {
/* 770 */                                                           if (i15 != currentState) {
/* 773 */                                                               lk1Var = motionLayout.f908g0;
/* 775 */                                                               if (lk1Var == null) {
/* 777 */                                                                   c0077dM6467b = null;
                                                                        } else {
/* 779 */                                                                   c0077dM6467b = lk1Var.m6467b(i15);
                                                                        }
/* 789 */                                                               c0076cM541i2 = c0077dM6467b.m541i(viewArr[0].getId());
/* 793 */                                                               if (c0076c != null) {
/* 795 */                                                                   c2236tz2 = c0076c.f1183h;
/* 797 */                                                                   if (c2236tz2 != null) {
/* 799 */                                                                       c2236tz2.m8930e(c0076cM541i2);
                                                                            }
/* 806 */                                                                   c0076cM541i2.f1182g.putAll(c0076c.f1182g);
                                                                        }
                                                                    }
                                                                }
                                                            }
/* 814 */                                                   C0077d c0077d3 = new C0077d();
/* 817 */                                                   map = c0077d3.f1192f;
/* 819 */                                                   map.clear();
/* 836 */                                                   while (r9.hasNext()) {
/* 850 */                                                       c0076c2 = (C0076c) c0077dM6467b2.f1192f.get(num);
/* 852 */                                                       if (c0076c2 != null) {
/* 859 */                                                           map.put(num, c0076c2.clone());
                                                                }
                                                            }
/* 869 */                                                   c0076cM541i = c0077d3.m541i(viewArr[0].getId());
/* 873 */                                                   if (c0076c != null) {
/* 875 */                                                       c2236tz = c0076c.f1183h;
/* 877 */                                                       if (c2236tz != null) {
/* 879 */                                                           c2236tz.m8930e(c0076cM541i);
                                                                }
/* 886 */                                                       c0076cM541i.f1182g.putAll(c0076c.f1182g);
                                                            }
/* 889 */                                                   motionLayout.m471B(currentState, c0077d3);
/* 894 */                                                   motionLayout.m471B(R$id.view_transition, c0077dM6467b2);
/* 899 */                                                   motionLayout.m486x(R$id.view_transition);
/* 908 */                                                   kk1Var = new kk1(motionLayout.f908g0, R$id.view_transition, currentState);
/* 911 */                                                   View view5 = viewArr[0];
/* 913 */                                                   i4 = e53Var2.f7533h;
/* 916 */                                                   if (i4 != -1) {
/* 924 */                                                       kk1Var.f12846h = Math.max(i4, 8);
                                                            }
/* 928 */                                                   kk1Var.f12854p = e53Var2.f7529d;
/* 930 */                                                   int i118 = e53Var2.f7537l;
/* 932 */                                                   String str3 = e53Var2.f7538m;
/* 934 */                                                   int i119 = e53Var2.f7539n;
/* 936 */                                                   kk1Var.f12843e = i118;
/* 938 */                                                   kk1Var.f12844f = str3;
/* 940 */                                                   kk1Var.f12845g = i119;
/* 942 */                                                   id = view5.getId();
/* 946 */                                                   if (m31Var != null) {
/* 954 */                                                       ArrayList arrayList6 = (ArrayList) m31Var.f13555a.get(-1);
/* 958 */                                                       m31Var2 = new m31();
/* 966 */                                                       m31Var2.f13555a = new HashMap();
/* 968 */                                                       it = arrayList6.iterator();
/* 976 */                                                       while (it.hasNext()) {
/* 984 */                                                           a31 a31VarMo43a3 = ((a31) it.next()).clone();
/* 988 */                                                           a31VarMo43a3.f73b = id;
/* 990 */                                                           m31Var2.m6595b(a31VarMo43a3);
                                                                }
/* 996 */                                                       kk1Var.f12849k.add(m31Var2);
                                                            }
/* 999 */                                                   motionLayout.setTransition(kk1Var);
/* 1006 */                                                  ji1 ji1Var3 = new ji1(17, e53Var2, viewArr);
/* 1011 */                                                  motionLayout.m473k(1.0f);
/* 1014 */                                                  motionLayout.f913i1 = ji1Var3;
                                                        }
                                                    }
/* 1030 */                                          i9 = i2;
/* 1031 */                                          action = action;
/* 1033 */                                          it2 = it2;
/* 1035 */                                          rect = rect;
/* 1037 */                                          y = y;
/* 1039 */                                          x = x;
                                                } else {
/* 1027 */                                          i2 = i9;
                                                }
/* 1030 */                                      i9 = i2;
/* 1031 */                                      action = action;
/* 1033 */                                      it2 = it2;
/* 1035 */                                      rect = rect;
/* 1037 */                                      y = y;
/* 1039 */                                      x = x;
                                            }
                                        }
                                    }
/* 1056 */                          i9 = i9;
/* 1057 */                          action = action;
/* 1059 */                          it2 = it2;
/* 1061 */                          rect = rect;
/* 1063 */                          y = y;
/* 1065 */                          x = x;
                                }
                            }
                        }
                    } else {
/* 1069 */              z = false;
                    }
/* 1073 */          kk1 kk1Var2 = this.f908g0.f13343c;
/* 1075 */          if (kk1Var2 == null || kk1Var2.f12853o || (mq2Var = kk1Var2.f12850l) == null) {
/* 1216 */              return z;
                    }
/* 1089 */          if ((motionEvent.getAction() == 0 && (rectFM6787b = mq2Var.m6787b(this, new RectF())) != null && !rectFM6787b.contains(motionEvent.getX(), motionEvent.getY())) || (i = mq2Var.f13955e) == -1) {
/* 1216 */              return z;
                    }
/* 1122 */          View view6 = this.f927p1;
/* 1124 */          if (view6 == null || view6.getId() != i) {
/* 1136 */              this.f927p1 = findViewById(i);
                    }
/* 1138 */          View view7 = this.f927p1;
/* 1140 */          if (view7 == null) {
/* 1216 */              return z;
                    }
/* 1142 */          float left = view7.getLeft();
/* 1149 */          float top = this.f927p1.getTop();
/* 1156 */          float right = this.f927p1.getRight();
/* 1163 */          float bottom = this.f927p1.getBottom();
/* 1168 */          RectF rectF = this.f925o1;
/* 1170 */          rectF.set(left, top, right, bottom);
                    return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m480r((float) this.f927p1.getLeft(), (float) this.f927p1.getTop(), this.f927p1, motionEvent)) ? z : onTouchEvent(motionEvent);
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 2 */             this.f909g1 = true;
                    try {
/* 7 */                 if (this.f908g0 == null) {
/* 9 */                     super.onLayout(z, i, i2, i3, i4);
/* 14 */                    return;
                        }
/* 18 */                int i5 = i3 - i;
/* 19 */                int i6 = i4 - i2;
/* 22 */                if (this.f882G0 != i5 || this.f883H0 != i6) {
/* 28 */                    m484v();
/* 31 */                    m475m(true);
                        }
/* 34 */                this.f882G0 = i5;
/* 36 */                this.f883H0 = i6;
                    } finally {
/* 41 */                this.f909g1 = false;
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    boolean z;
/* 7 */             a00 a00Var = this.f1060c;
/* 11 */            if (this.f908g0 == null) {
/* 13 */                super.onMeasure(i, i2);
/* 16 */                return;
                    }
/* 20 */            boolean z2 = true;
/* 30 */            boolean z3 = (this.f922n0 == i && this.f924o0 == i2) ? false : true;
/* 33 */            if (this.f923n1) {
/* 35 */                this.f923n1 = false;
/* 37 */                m482t();
/* 40 */                m483u();
/* 43 */                z3 = true;
                    }
/* 46 */            if (this.f1068v) {
/* 48 */                z3 = true;
                    }
/* 49 */            this.f922n0 = i;
/* 51 */            this.f924o0 = i2;
/* 55 */            int iM6473h = this.f908g0.m6473h();
/* 61 */            kk1 kk1Var = this.f908g0.f13343c;
/* 68 */            int i3 = kk1Var == null ? -1 : kk1Var.f12841c;
/* 70 */            ek1 ek1Var = this.f921m1;
/* 72 */            if ((!z3 && iM6473h == ek1Var.f7766e && i3 == ek1Var.f7767f) || this.f916k0 == -1) {
/* 113 */               if (z3) {
/* 115 */                   super.onMeasure(i, i2);
                        }
/* 118 */               z = true;
                    } else {
/* 86 */                super.onMeasure(i, i2);
/* 101 */               ek1Var.m3483e(this.f908g0.m6467b(iM6473h), this.f908g0.m6467b(i3));
/* 104 */               ek1Var.m3484f();
/* 107 */               ek1Var.f7766e = iM6473h;
/* 109 */               ek1Var.f7767f = i3;
/* 111 */               z = false;
                    }
/* 121 */           if (this.f899X0 || z) {
/* 133 */               int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 147 */               int iM10475r = a00Var.m10475r() + getPaddingRight() + getPaddingLeft();
/* 152 */               int iM10472l = a00Var.m10472l() + paddingBottom;
/* 153 */               int i4 = this.f904c1;
/* 157 */               if (i4 == Integer.MIN_VALUE || i4 == 0) {
/* 161 */                   int i5 = this.f900Y0;
/* 172 */                   iM10475r = (int) ((this.f906e1 * (this.f902a1 - i5)) + i5);
/* 173 */                   requestLayout();
                        }
/* 176 */               int i6 = this.f905d1;
/* 178 */               if (i6 == Integer.MIN_VALUE || i6 == 0) {
/* 182 */                   int i7 = this.f901Z0;
/* 193 */                   iM10472l = (int) ((this.f906e1 * (this.f903b1 - i7)) + i7);
/* 194 */                   requestLayout();
                        }
/* 197 */               setMeasuredDimension(iM10475r, iM10472l);
                    }
/* 205 */           float fSignum = Math.signum(this.f936w0 - this.f934u0);
/* 209 */           long nanoTime = getNanoTime();
/* 213 */           ak1 ak1Var = this.f910h0;
/* 237 */           float interpolation = this.f934u0 + (!(ak1Var instanceof ch2) ? (((nanoTime - this.f935v0) * fSignum) * 1.0E-9f) / this.f932s0 : 0.0f);
/* 240 */           if (this.f937x0) {
/* 242 */               interpolation = this.f936w0;
                    }
/* 246 */           if ((fSignum <= 0.0f || interpolation < this.f936w0) && (fSignum > 0.0f || interpolation > this.f936w0)) {
/* 267 */               z2 = false;
                    } else {
/* 264 */               interpolation = this.f936w0;
                    }
/* 268 */           if (ak1Var != null && !z2) {
/* 286 */               interpolation = this.f878C0 ? ak1Var.getInterpolation((nanoTime - this.f930r0) * 1.0E-9f) : ak1Var.getInterpolation(interpolation);
                    }
/* 290 */           if ((fSignum > 0.0f && interpolation >= this.f936w0) || (fSignum <= 0.0f && interpolation <= this.f936w0)) {
/* 308 */               interpolation = this.f936w0;
                    }
/* 310 */           this.f906e1 = interpolation;
/* 312 */           int childCount = getChildCount();
/* 316 */           long nanoTime2 = getNanoTime();
/* 320 */           Interpolator interpolator = this.f912i0;
/* 322 */           if (interpolator != null) {
/* 326 */               interpolation = interpolator.getInterpolation(interpolation);
                    }
/* 324 */           float f = interpolation;
/* 331 */           for (int i8 = 0; i8 < childCount; i8++) {
/* 333 */               View childAt = getChildAt(i8);
/* 344 */               zj1 zj1Var = (zj1) this.f928q0.get(childAt);
/* 346 */               if (zj1Var != null) {
/* 352 */                   zj1Var.m10362e(f, nanoTime2, this.f907f1, childAt);
                        }
                    }
/* 360 */           if (this.f899X0) {
/* 362 */               requestLayout();
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onNestedFling(View view, float f, float f2, boolean z) {
/* 1 */             return false;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onNestedPreFling(View view, float f, float f2) {
/* 1 */             return false;
                }

                @Override // p000.pm1
                public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
                    kk1 kk1Var;
                    boolean z;
                    float f;
                    mq2 mq2Var;
                    float f2;
                    mq2 mq2Var2;
                    mq2 mq2Var3;
                    mq2 mq2Var4;
                    int i4;
/* 9 */             lk1 lk1Var = this.f908g0;
/* 11 */            if (lk1Var == null || (kk1Var = lk1Var.f13343c) == null || (z = kk1Var.f12853o)) {
/* 383 */               return;
                    }
/* 25 */            int i5 = -1;
/* 26 */            if (z || (mq2Var4 = kk1Var.f12850l) == null || (i4 = mq2Var4.f13955e) == -1 || view.getId() == i4) {
/* 44 */                kk1 kk1Var2 = lk1Var.f13343c;
/* 60 */                if ((kk1Var2 == null || (mq2Var3 = kk1Var2.f12850l) == null) ? false : mq2Var3.f13971u) {
/* 62 */                    mq2 mq2Var5 = kk1Var.f12850l;
/* 64 */                    if (mq2Var5 != null && (mq2Var5.f13973w & 4) != 0) {
/* 72 */                        i5 = i2;
                            }
/* 73 */                    float f3 = this.f933t0;
/* 77 */                    if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
/* 383 */                       return;
                            }
                        }
/* 91 */                mq2 mq2Var6 = kk1Var.f12850l;
/* 94 */                if (mq2Var6 == null || (mq2Var6.f13973w & 1) == 0) {
/* 213 */                   f = 0.0f;
                        } else {
                            float f4 = i;
                            float f5 = i2;
/* 103 */                   kk1 kk1Var3 = lk1Var.f13343c;
/* 105 */                   if (kk1Var3 == null || (mq2Var2 = kk1Var3.f12850l) == null) {
/* 174 */                       f = 0.0f;
/* 176 */                       f2 = 0.0f;
                            } else {
/* 111 */                       float[] fArr = mq2Var2.f13964n;
/* 127 */                       f = 0.0f;
/* 133 */                       mq2Var2.f13968r.m478p(mq2Var2.f13954d, mq2Var2.f13968r.getProgress(), mq2Var2.f13958h, mq2Var2.f13957g, fArr);
/* 136 */                       float f6 = mq2Var2.f13961k;
/* 143 */                       if (f6 != 0.0f) {
/* 149 */                           if (fArr[0] == 0.0f) {
/* 151 */                               fArr[0] = 1.0E-7f;
                                    }
/* 156 */                           f2 = (f4 * f6) / fArr[0];
                                } else {
/* 162 */                           if (fArr[1] == 0.0f) {
/* 164 */                               fArr[1] = 1.0E-7f;
                                    }
/* 171 */                           f2 = (f5 * mq2Var2.f13962l) / fArr[1];
                                }
                            }
/* 178 */                   float f7 = this.f934u0;
/* 182 */                   if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
/* 196 */                       view.setNestedScrollingEnabled(false);
/* 209 */                       view.post(new RunnableC2495ye((ViewGroup) view, 17));
/* 212 */                       return;
                            }
                        }
/* 215 */               float f8 = this.f933t0;
/* 217 */               long nanoTime = getNanoTime();
                        float f9 = i;
/* 222 */               this.f885J0 = f9;
                        float f10 = i2;
/* 225 */               this.f886K0 = f10;
/* 239 */               this.f888M0 = (float) ((nanoTime - this.f887L0) * 1.0E-9d);
/* 241 */               this.f887L0 = nanoTime;
/* 243 */               kk1 kk1Var4 = lk1Var.f13343c;
/* 245 */               if (kk1Var4 != null && (mq2Var = kk1Var4.f12850l) != null) {
/* 251 */                   float[] fArr2 = mq2Var.f13964n;
/* 253 */                   MotionLayout motionLayout = mq2Var.f13968r;
/* 255 */                   float progress = motionLayout.getProgress();
/* 261 */                   if (!mq2Var.f13963m) {
/* 263 */                       mq2Var.f13963m = true;
/* 265 */                       motionLayout.setProgress(progress);
                            }
/* 283 */                   mq2Var.f13968r.m478p(mq2Var.f13954d, progress, mq2Var.f13958h, mq2Var.f13957g, fArr2);
/* 309 */                   if (Math.abs((mq2Var.f13962l * fArr2[1]) + (mq2Var.f13961k * fArr2[0])) < 0.01d) {
/* 314 */                       fArr2[0] = 0.01f;
/* 316 */                       fArr2[1] = 0.01f;
                            }
/* 318 */                   float f11 = mq2Var.f13961k;
/* 343 */                   float fMax = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * mq2Var.f13962l) / fArr2[1]), 1.0f), f);
/* 353 */                   if (fMax != motionLayout.getProgress()) {
/* 357 */                       motionLayout.setProgress(fMax);
                            }
                        }
/* 364 */               if (f8 != this.f933t0) {
/* 366 */                   iArr[0] = i;
/* 368 */                   iArr[1] = i2;
                        }
/* 370 */               m475m(false);
/* 375 */               if (iArr[0] == 0 && iArr[1] == 0) {
/* 383 */                   return;
                        }
/* 381 */               this.f884I0 = true;
                    }
                }

                @Override // p000.qm1
                public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
/* 4 */             if (this.f884I0 || i != 0 || i2 != 0) {
/* 13 */                iArr[0] = iArr[0] + i3;
/* 19 */                iArr[1] = iArr[1] + i4;
                    }
/* 21 */            this.f884I0 = false;
                }

                @Override // p000.pm1
                public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
/* 5 */             this.f887L0 = getNanoTime();
/* 8 */             this.f888M0 = 0.0f;
/* 10 */            this.f885J0 = 0.0f;
/* 12 */            this.f886K0 = 0.0f;
                }

                @Override // android.view.View
                public final void onRtlPropertiesChanged(int i) {
                    mq2 mq2Var;
/* 1 */             lk1 lk1Var = this.f908g0;
/* 3 */             if (lk1Var != null) {
/* 5 */                 boolean zM516e = m516e();
/* 9 */                 lk1Var.f13356p = zM516e;
/* 11 */                kk1 kk1Var = lk1Var.f13343c;
/* 13 */                if (kk1Var == null || (mq2Var = kk1Var.f12850l) == null) {
/* 22 */                    return;
                        }
/* 19 */                mq2Var.m6788c(zM516e);
                    }
                }

                @Override // p000.pm1
                public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
                    kk1 kk1Var;
                    mq2 mq2Var;
/* 1 */             lk1 lk1Var = this.f908g0;
                    return (lk1Var == null || (kk1Var = lk1Var.f13343c) == null || (mq2Var = kk1Var.f12850l) == null || (mq2Var.f13973w & 2) != 0) ? false : true;
                }

                @Override // p000.pm1
                public final void onStopNestedScroll(View view, int i) {
                    mq2 mq2Var;
/* 1 */             lk1 lk1Var = this.f908g0;
/* 3 */             if (lk1Var != null) {
/* 5 */                 float f = this.f888M0;
/* 10 */                if (f == 0.0f) {
/* 113 */                   return;
                        }
/* 15 */                float f2 = this.f885J0 / f;
/* 18 */                float f3 = this.f886K0 / f;
/* 19 */                kk1 kk1Var = lk1Var.f13343c;
/* 21 */                if (kk1Var == null || (mq2Var = kk1Var.f12850l) == null) {
/* 113 */                   return;
                        }
/* 27 */                float[] fArr = mq2Var.f13964n;
/* 30 */                mq2Var.f13963m = false;
/* 32 */                MotionLayout motionLayout = mq2Var.f13968r;
/* 34 */                float progress = motionLayout.getProgress();
/* 46 */                mq2Var.f13968r.m478p(mq2Var.f13954d, progress, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 49 */                float f4 = mq2Var.f13961k;
/* 66 */                float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * mq2Var.f13962l) / fArr[1];
/* 72 */                if (!Float.isNaN(f5)) {
/* 78 */                    progress += f5 / 3.0f;
                        }
/* 81 */                if (progress != 0.0f) {
/* 91 */                    boolean z = progress != 1.0f;
/* 92 */                    int i2 = mq2Var.f13953c;
/* 99 */                    if ((i2 != 3) && z) {
/* 110 */                       motionLayout.m488z(((double) progress) >= 0.5d ? 1.0f : 0.0f, f5, i2);
                            }
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:110:0x021f  */
                /* JADX WARN: Code duplicated, block: B:113:0x0225  */
                /* JADX WARN: Code duplicated, block: B:115:0x0229  */
                /* JADX WARN: Code duplicated, block: B:119:0x0233  */
                /* JADX WARN: Code duplicated, block: B:121:0x0246  */
                /* JADX WARN: Code duplicated, block: B:123:0x024e  */
                /* JADX WARN: Code duplicated, block: B:126:0x0257  */
                /* JADX WARN: Code duplicated, block: B:128:0x025e  */
                /* JADX WARN: Code duplicated, block: B:131:0x0263  */
                /* JADX WARN: Code duplicated, block: B:133:0x027c  */
                /* JADX WARN: Code duplicated, block: B:134:0x02aa  */
                /* JADX WARN: Code duplicated, block: B:136:0x02af  */
                /* JADX WARN: Code duplicated, block: B:138:0x02c5  */
                /* JADX WARN: Code duplicated, block: B:139:0x02cd  */
                /* JADX WARN: Code duplicated, block: B:142:0x0332  */
                /* JADX WARN: Code duplicated, block: B:144:0x0337  */
                /* JADX WARN: Code duplicated, block: B:146:0x033d  */
                /* JADX WARN: Code duplicated, block: B:149:0x0349  */
                /* JADX WARN: Code duplicated, block: B:151:0x034d  */
                /* JADX WARN: Code duplicated, block: B:153:0x0355  */
                /* JADX WARN: Code duplicated, block: B:154:0x035c  */
                /* JADX WARN: Code duplicated, block: B:157:0x0362  */
                /* JADX WARN: Code duplicated, block: B:158:0x037c  */
                /* JADX WARN: Code duplicated, block: B:161:0x03a1  */
                /* JADX WARN: Code duplicated, block: B:163:0x03a5  */
                /* JADX WARN: Code duplicated, block: B:165:0x03a9  */
                /* JADX WARN: Code duplicated, block: B:168:0x03b5  */
                /* JADX WARN: Code duplicated, block: B:171:0x03be  */
                /* JADX WARN: Code duplicated, block: B:172:0x03c3  */
                /* JADX WARN: Code duplicated, block: B:175:0x03ca  */
                /* JADX WARN: Code duplicated, block: B:176:0x03cf  */
                /* JADX WARN: Code duplicated, block: B:178:0x03f2  */
                /* JADX WARN: Code duplicated, block: B:180:0x0402  */
                /* JADX WARN: Code duplicated, block: B:182:0x040b  */
                /* JADX WARN: Code duplicated, block: B:185:0x0416  */
                /* JADX WARN: Code duplicated, block: B:186:0x041c  */
                /* JADX WARN: Code duplicated, block: B:189:0x0423  */
                /* JADX WARN: Code duplicated, block: B:191:0x042a  */
                /* JADX WARN: Code duplicated, block: B:194:0x0445  */
                /* JADX WARN: Code duplicated, block: B:196:0x0472  */
                /* JADX WARN: Code duplicated, block: B:198:0x0477  */
                /* JADX WARN: Code duplicated, block: B:199:0x04ae A[PHI: r7 r13
  0x04ae: PHI (r7v20 float) = (r7v15 float), (r7v26 float) binds: [B:197:0x0475, B:195:0x046b] A[DONT_GENERATE, DONT_INLINE]
  0x04ae: PHI (r13v12 float) = (r13v7 float), (r13v17 float) binds: [B:197:0x0475, B:195:0x046b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:201:0x04cb  */
                /* JADX WARN: Code duplicated, block: B:202:0x04e9  */
                /* JADX WARN: Code duplicated, block: B:205:0x050b  */
                /* JADX WARN: Code duplicated, block: B:207:0x051a  */
                /* JADX WARN: Code duplicated, block: B:210:0x0521  */
                /* JADX WARN: Code duplicated, block: B:234:0x0579  */
                /* JADX WARN: Code duplicated, block: B:236:0x0581  */
                /* JADX WARN: Code duplicated, block: B:238:0x0587  */
                /* JADX WARN: Code duplicated, block: B:239:0x058c  */
                /* JADX WARN: Code duplicated, block: B:240:0x059d  */
                /* JADX WARN: Code duplicated, block: B:242:0x05a9  */
                /* JADX WARN: Code duplicated, block: B:245:0x05b2  */
                /* JADX WARN: Code duplicated, block: B:247:0x05b5  */
                /* JADX WARN: Code duplicated, block: B:250:0x05ba  */
                /* JADX WARN: Code duplicated, block: B:252:0x05db  */
                /* JADX WARN: Code duplicated, block: B:254:0x05df  */
                /* JADX WARN: Code duplicated, block: B:256:0x05e7  */
                /* JADX WARN: Code duplicated, block: B:259:0x05f4  */
                /* JADX WARN: Code duplicated, block: B:260:0x0600  */
                /* JADX WARN: Code duplicated, block: B:263:0x0637  */
                /* JADX WARN: Code duplicated, block: B:266:0x0642  */
                /* JADX WARN: Code duplicated, block: B:267:0x0646  */
                /* JADX WARN: Code duplicated, block: B:270:0x0659  */
                /* JADX WARN: Code duplicated, block: B:273:0x0662  */
                /* JADX WARN: Code duplicated, block: B:276:0x0671  */
                /* JADX WARN: Code duplicated, block: B:278:0x0677  */
                /* JADX WARN: Code duplicated, block: B:280:0x067d  */
                /* JADX WARN: Code duplicated, block: B:283:0x0689  */
                /* JADX WARN: Code duplicated, block: B:286:0x0692  */
                /* JADX WARN: Code duplicated, block: B:287:0x0697  */
                /* JADX WARN: Code duplicated, block: B:290:0x069e  */
                /* JADX WARN: Code duplicated, block: B:291:0x06a3  */
                /* JADX WARN: Code duplicated, block: B:294:0x06ab  */
                /* JADX WARN: Code duplicated, block: B:295:0x06b1  */
                /* JADX WARN: Code duplicated, block: B:297:0x06ba  */
                /* JADX WARN: Code duplicated, block: B:299:0x06cb  */
                /* JADX WARN: Code duplicated, block: B:301:0x06d4  */
                /* JADX WARN: Code duplicated, block: B:304:0x06dd  */
                /* JADX WARN: Code duplicated, block: B:305:0x06e3  */
                /* JADX WARN: Code duplicated, block: B:308:0x06ea  */
                /* JADX WARN: Code duplicated, block: B:309:0x06f0  */
                /* JADX WARN: Code duplicated, block: B:312:0x06fc  */
                /* JADX WARN: Code duplicated, block: B:313:0x0708  */
                /* JADX WARN: Code duplicated, block: B:316:0x072f  */
                /* JADX WARN: Code duplicated, block: B:317:0x0731  */
                /* JADX WARN: Code duplicated, block: B:320:0x0739  */
                /* JADX WARN: Code duplicated, block: B:322:0x073f  */
                /* JADX WARN: Code duplicated, block: B:325:0x0745  */
                /* JADX WARN: Code duplicated, block: B:349:0x0790  */
                /* JADX WARN: Code duplicated, block: B:351:0x0796  */
                /* JADX WARN: Code duplicated, block: B:353:0x079c  */
                /* JADX WARN: Code duplicated, block: B:354:0x07a0  */
                /* JADX WARN: Code duplicated, block: B:357:0x07c2  */
                /* JADX WARN: Code duplicated, block: B:361:0x07cc  */
                /* JADX WARN: Code duplicated, block: B:362:0x07d3  */
                /* JADX WARN: Code duplicated, block: B:365:0x07db  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r18v15 */
                /* JADX WARN: Type inference failed for: r18v24 */
                /* JADX WARN: Type inference failed for: r18v25 */
                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    kk1 kk1Var;
                    gr0 gr0Var;
                    VelocityTracker velocityTracker;
                    gr0 gr0Var2;
                    int i;
                    mq2 mq2Var;
                    float[] fArr;
                    gr0 gr0Var3;
                    MotionLayout motionLayout;
                    boolean z;
                    hk1 hk1Var;
                    VelocityTracker velocityTracker2;
                    int action;
                    VelocityTracker velocityTracker3;
                    VelocityTracker velocityTracker4;
                    float xVelocity;
                    VelocityTracker velocityTracker5;
                    float yVelocity;
                    float progress;
                    int i2;
                    MotionLayout motionLayout2;
                    char c;
                    char c2;
                    float f;
                    float f2;
                    float f3;
                    float fAbs;
                    float f4;
                    int i3;
                    float rawY;
                    float rawX;
                    float progress2;
                    int i4;
                    MotionLayout motionLayout3;
                    char c3;
                    char c4;
                    float f5;
                    float fMax;
                    float progress3;
                    VelocityTracker velocityTracker6;
                    VelocityTracker velocityTracker7;
                    float xVelocity2;
                    VelocityTracker velocityTracker8;
                    float yVelocity2;
                    float f6;
                    int[] iArr;
                    VelocityTracker velocityTracker9;
                    int action2;
                    VelocityTracker velocityTracker10;
                    VelocityTracker velocityTracker11;
                    float xVelocity3;
                    VelocityTracker velocityTracker12;
                    float yVelocity3;
                    float progress4;
                    float width;
                    int i5;
                    int i6;
                    float f7;
                    int top;
                    int bottom;
                    int i7;
                    hk1 hk1Var2;
                    int i8;
                    float degrees;
                    float f8;
                    hk1 hk1Var3;
                    int i9;
                    float width2;
                    float height;
                    int i10;
                    int i11;
                    View viewFindViewById;
                    float rawX2;
                    float rawY2;
                    double dAtan2;
                    float fAtan2;
                    float f9;
                    float progress5;
                    boolean z2;
                    int i12;
                    int i13;
                    ?? r18;
                    float fMax2;
                    float progress6;
                    VelocityTracker velocityTracker13;
                    VelocityTracker velocityTracker14;
                    float xVelocity4;
                    VelocityTracker velocityTracker15;
                    float yVelocity4;
                    MotionEvent motionEvent2;
                    kk1 kk1Var2;
                    int iM6909o;
                    Iterator it;
/* 5 */             lk1 lk1Var = this.f908g0;
/* 7 */             if (lk1Var == null || !this.f926p0 || !lk1Var.m6480o()) {
/* 2033 */              return super.onTouchEvent(motionEvent);
                    }
/* 19 */            lk1 lk1Var2 = this.f908g0;
/* 21 */            kk1 kk1Var3 = lk1Var2.f13343c;
/* 23 */            if (kk1Var3 != null && kk1Var3.f12853o) {
/* 29 */                return super.onTouchEvent(motionEvent);
                    }
/* 34 */            int currentState = getCurrentState();
/* 38 */            MotionLayout motionLayout4 = lk1Var2.f13341a;
/* 42 */            RectF rectF = new RectF();
/* 47 */            if (lk1Var2.f13355o == null) {
/* 49 */                motionLayout4.getClass();
/* 52 */                gr0 gr0Var4 = gr0.f8787c;
/* 58 */                gr0Var4.f8789a = VelocityTracker.obtain();
/* 60 */                lk1Var2.f13355o = gr0Var4;
                    }
/* 66 */            VelocityTracker velocityTracker16 = (VelocityTracker) lk1Var2.f13355o.f8789a;
/* 68 */            if (velocityTracker16 != null) {
/* 70 */                velocityTracker16.addMovement(motionEvent);
                    }
/* 75 */            if (currentState != -1) {
/* 77 */                int action3 = motionEvent.getAction();
/* 81 */                if (action3 == 0) {
/* 445 */                   lk1Var2.f13358r = motionEvent.getRawX();
/* 451 */                   lk1Var2.f13359s = motionEvent.getRawY();
/* 453 */                   lk1Var2.f13352l = motionEvent;
/* 455 */                   lk1Var2.f13353m = false;
/* 459 */                   mq2 mq2Var2 = lk1Var2.f13343c.f12850l;
/* 461 */                   if (mq2Var2 != null) {
/* 463 */                       RectF rectFM6786a = mq2Var2.m6786a(motionLayout4, rectF);
/* 467 */                       if (rectFM6786a == null || rectFM6786a.contains(lk1Var2.f13352l.getX(), lk1Var2.f13352l.getY())) {
/* 499 */                           RectF rectFM6787b = lk1Var2.f13343c.f12850l.m6787b(motionLayout4, rectF);
/* 503 */                           if (rectFM6787b == null || rectFM6787b.contains(lk1Var2.f13352l.getX(), lk1Var2.f13352l.getY())) {
/* 528 */                               lk1Var2.f13354n = false;
                                    } else {
/* 524 */                               lk1Var2.f13354n = true;
                                    }
/* 532 */                           mq2 mq2Var3 = lk1Var2.f13343c.f12850l;
/* 534 */                           float f10 = lk1Var2.f13358r;
/* 536 */                           float f11 = lk1Var2.f13359s;
/* 538 */                           mq2Var3.f13966p = f10;
/* 540 */                           mq2Var3.f13967q = f11;
                                } else {
/* 488 */                           lk1Var2.f13352l = null;
/* 491 */                           lk1Var2.f13353m = true;
                                }
                            }
                        } else if (action3 == 2 && !lk1Var2.f13353m) {
/* 99 */                    float rawY3 = motionEvent.getRawY() - lk1Var2.f13359s;
/* 106 */                   float rawX3 = motionEvent.getRawX() - lk1Var2.f13358r;
/* 112 */                   if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = lk1Var2.f13352l) != null) {
/* 125 */                       if (currentState != -1) {
/* 127 */                           C1954n7 c1954n7 = lk1Var2.f13342b;
/* 129 */                           if (c1954n7 == null || (iM6909o = c1954n7.m6909o(currentState)) == -1) {
/* 138 */                               iM6909o = currentState;
                                    }
/* 141 */                           ArrayList arrayList = new ArrayList();
/* 154 */                           for (kk1 kk1Var4 : lk1Var2.f13344d) {
/* 166 */                               if (kk1Var4.f12842d == iM6909o || kk1Var4.f12841c == iM6909o) {
/* 172 */                                   arrayList.add(kk1Var4);
                                        }
                                    }
/* 179 */                           RectF rectF2 = new RectF();
/* 182 */                           Iterator it2 = arrayList.iterator();
/* 186 */                           float f12 = 0.0f;
/* 187 */                           kk1Var2 = null;
/* 192 */                           while (it2.hasNext()) {
/* 198 */                               kk1 kk1Var5 = (kk1) it2.next();
/* 202 */                               if (kk1Var5.f12853o) {
/* 204 */                                   it = it2;
                                        } else {
/* 207 */                                   mq2 mq2Var4 = kk1Var5.f12850l;
/* 209 */                                   if (mq2Var4 != null) {
/* 213 */                                       mq2Var4.m6788c(lk1Var2.f13356p);
/* 218 */                                       RectF rectFM6787b2 = kk1Var5.f12850l.m6787b(motionLayout4, rectF2);
/* 222 */                                       if (rectFM6787b2 != null) {
/* 228 */                                           it = it2;
/* 238 */                                           if (!rectFM6787b2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                                    }
                                                } else {
/* 241 */                                           it = it2;
                                                }
/* 245 */                                       RectF rectFM6786a2 = kk1Var5.f12850l.m6786a(motionLayout4, rectF2);
/* 249 */                                       if (rectFM6786a2 == null || rectFM6786a2.contains(motionEvent2.getX(), motionEvent2.getY())) {
/* 268 */                                           mq2 mq2Var5 = kk1Var5.f12850l;
/* 276 */                                           float fAtan3 = (mq2Var5.f13962l * rawY3) + (mq2Var5.f13961k * rawX3);
/* 279 */                                           if (mq2Var5.f13960j) {
/* 281 */                                               float x = motionEvent2.getX();
/* 287 */                                               kk1Var5.f12850l.getClass();
/* 292 */                                               float f13 = x - 0.5f;
/* 293 */                                               float y = motionEvent2.getY();
/* 301 */                                               kk1Var5.f12850l.getClass();
/* 304 */                                               float f14 = y - 0.5f;
/* 335 */                                               fAtan3 = ((float) (Math.atan2(rawY3 + f14, rawX3 + f13) - Math.atan2(f13, f14))) * 10.0f;
                                                    }
/* 350 */                                           float f15 = fAtan3 * (kk1Var5.f12841c == currentState ? -1.0f : 1.1f);
/* 358 */                                           if (f15 > f12) {
/* 360 */                                               f12 = f15;
/* 361 */                                               kk1Var2 = kk1Var5;
                                                    }
/* 375 */                                           it2 = it;
/* 377 */                                           rectF2 = rectF2;
                                                }
                                            } else {
/* 363 */                                       it = it2;
/* 365 */                                       rectF2 = rectF2;
/* 367 */                                       f12 = f12;
/* 369 */                                       kk1Var2 = kk1Var2;
                                            }
/* 371 */                                   f12 = f12;
/* 373 */                                   kk1Var2 = kk1Var2;
/* 375 */                                   it2 = it;
/* 377 */                                   rectF2 = rectF2;
                                        }
/* 265 */                               it2 = it;
                                    }
                                } else {
/* 384 */                           kk1Var2 = lk1Var2.f13343c;
                                }
/* 386 */                       if (kk1Var2 != null) {
/* 388 */                           setTransition(kk1Var2);
/* 395 */                           RectF rectFM6787b3 = lk1Var2.f13343c.f12850l.m6787b(motionLayout4, rectF);
/* 422 */                           lk1Var2.f13354n = (rectFM6787b3 == null || rectFM6787b3.contains(lk1Var2.f13352l.getX(), lk1Var2.f13352l.getY())) ? false : true;
/* 426 */                           mq2 mq2Var6 = lk1Var2.f13343c.f12850l;
/* 428 */                           float f16 = lk1Var2.f13358r;
/* 430 */                           float f17 = lk1Var2.f13359s;
/* 432 */                           mq2Var6.f13966p = f16;
/* 434 */                           mq2Var6.f13967q = f17;
/* 437 */                           mq2Var6.f13963m = false;
                                }
/* 546 */                       if (!lk1Var2.f13353m) {
/* 550 */                           kk1Var = lk1Var2.f13343c;
/* 552 */                           if (kk1Var != null) {
/* 558 */                               fArr = mq2Var.f13964n;
/* 562 */                               if (!lk1Var2.f13354n) {
/* 564 */                                   gr0Var3 = lk1Var2.f13355o;
/* 566 */                                   motionLayout = mq2Var.f13968r;
/* 568 */                                   z = mq2Var.f13960j;
/* 577 */                                   hk1Var = hk1.f9122d;
/* 581 */                                   if (z) {
/* 583 */                                       iArr = mq2Var.f13965o;
/* 587 */                                       velocityTracker9 = (VelocityTracker) gr0Var3.f8789a;
/* 589 */                                       if (velocityTracker9 != null) {
/* 591 */                                           velocityTracker9.addMovement(motionEvent);
                                                }
/* 594 */                                       action2 = motionEvent.getAction();
/* 598 */                                       if (action2 == 0) {
/* 1425 */                                          mq2Var.f13966p = motionEvent.getRawX();
/* 1431 */                                          mq2Var.f13967q = motionEvent.getRawY();
/* 1434 */                                          mq2Var.f13963m = false;
                                                } else if (action2 == 1) {
/* 1028 */                                          mq2Var.f13963m = false;
/* 1032 */                                          velocityTracker10 = (VelocityTracker) gr0Var3.f8789a;
/* 1034 */                                          if (velocityTracker10 != null) {
/* 1038 */                                              velocityTracker10.computeCurrentVelocity(16);
                                                    }
/* 1043 */                                          velocityTracker11 = (VelocityTracker) gr0Var3.f8789a;
/* 1045 */                                          if (velocityTracker11 != null) {
/* 1047 */                                              xVelocity3 = velocityTracker11.getXVelocity();
                                                    } else {
/* 1053 */                                              xVelocity3 = 0.0f;
                                                    }
/* 1056 */                                          velocityTracker12 = (VelocityTracker) gr0Var3.f8789a;
/* 1058 */                                          if (velocityTracker12 != null) {
/* 1060 */                                              yVelocity3 = velocityTracker12.getYVelocity();
                                                    } else {
/* 1067 */                                              yVelocity3 = 0.0f;
                                                    }
/* 1069 */                                          progress4 = motionLayout.getProgress();
/* 1078 */                                          width = motionLayout.getWidth() / 2.0f;
/* 1085 */                                          float height2 = motionLayout.getHeight() / 2.0f;
/* 1087 */                                          i5 = mq2Var.f13959i;
/* 1092 */                                          if (i5 != -1) {
/* 1094 */                                              View viewFindViewById2 = motionLayout.findViewById(i5);
/* 1098 */                                              motionLayout.getLocationOnScreen(iArr);
/* 1118 */                                              width = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
/* 1121 */                                              f7 = iArr[1];
/* 1124 */                                              top = viewFindViewById2.getTop();
/* 1128 */                                              bottom = viewFindViewById2.getBottom();
                                                    } else {
/* 1139 */                                              i6 = mq2Var.f13954d;
/* 1142 */                                              if (i6 != -1) {
/* 1160 */                                                  View viewFindViewById3 = motionLayout.findViewById(((zj1) motionLayout.f928q0.get(motionLayout.findViewById(i6))).f20181f.f9679V);
/* 1164 */                                                  motionLayout.getLocationOnScreen(iArr);
/* 1184 */                                                  width = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
/* 1187 */                                                  f7 = iArr[1];
/* 1190 */                                                  top = viewFindViewById3.getTop();
/* 1194 */                                                  bottom = viewFindViewById3.getBottom();
                                                        } else {
/* 1203 */                                                  float rawX4 = motionEvent.getRawX() - width;
/* 1209 */                                                  float rawY4 = motionEvent.getRawY() - height2;
/* 1219 */                                                  double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
/* 1223 */                                                  i7 = mq2Var.f13954d;
/* 1226 */                                                  if (i7 != -1) {
/* 1235 */                                                      hk1Var2 = hk1Var;
/* 1241 */                                                      i8 = 6;
/* 1242 */                                                      mq2Var.f13968r.m478p(i7, progress4, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1255 */                                                      fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                            } else {
/* 1258 */                                                      hk1Var2 = hk1Var;
/* 1262 */                                                      i8 = 6;
/* 1265 */                                                      fArr[1] = 360.0f;
                                                            }
/* 1285 */                                                  degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY4, xVelocity3 + rawX4)) - degrees2)) * 62.5f;
/* 1290 */                                                  if (Float.isNaN(degrees)) {
/* 1307 */                                                      f8 = progress4;
                                                            } else {
/* 1302 */                                                      f8 = (((degrees * 3.0f) * mq2Var.f13972v) / fArr[1]) + progress4;
                                                            }
/* 1312 */                                                  if (f8 != 0.0f) {
/* 1402 */                                                      hk1Var3 = hk1Var2;
/* 1408 */                                                      if (0.0f < f8) {
/* 1416 */                                                          motionLayout.setState(hk1Var3);
                                                                } else {
/* 1416 */                                                          motionLayout.setState(hk1Var3);
                                                                }
                                                            } else {
/* 1402 */                                                      hk1Var3 = hk1Var2;
/* 1408 */                                                      if (0.0f < f8) {
/* 1416 */                                                          motionLayout.setState(hk1Var3);
                                                                } else {
/* 1416 */                                                          motionLayout.setState(hk1Var3);
                                                                }
                                                            }
                                                        }
                                                    }
/* 1136 */                                          height2 = ((bottom + top) / 2.0f) + f7;
/* 1203 */                                          float rawX5 = motionEvent.getRawX() - width;
/* 1209 */                                          float rawY5 = motionEvent.getRawY() - height2;
/* 1219 */                                          double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
/* 1223 */                                          i7 = mq2Var.f13954d;
/* 1226 */                                          if (i7 != -1) {
/* 1235 */                                              hk1Var2 = hk1Var;
/* 1241 */                                              i8 = 6;
/* 1242 */                                              mq2Var.f13968r.m478p(i7, progress4, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1255 */                                              fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                    } else {
/* 1258 */                                              hk1Var2 = hk1Var;
/* 1262 */                                              i8 = 6;
/* 1265 */                                              fArr[1] = 360.0f;
                                                    }
/* 1285 */                                          degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY5, xVelocity3 + rawX5)) - degrees3)) * 62.5f;
/* 1290 */                                          if (Float.isNaN(degrees)) {
/* 1302 */                                              f8 = (((degrees * 3.0f) * mq2Var.f13972v) / fArr[1]) + progress4;
                                                    } else {
/* 1307 */                                              f8 = progress4;
                                                    }
/* 1312 */                                          if (f8 != 0.0f) {
/* 1402 */                                              hk1Var3 = hk1Var2;
/* 1408 */                                              if (0.0f < f8) {
/* 1416 */                                                  motionLayout.setState(hk1Var3);
                                                        } else {
/* 1416 */                                                  motionLayout.setState(hk1Var3);
                                                        }
                                                    } else {
/* 1402 */                                              hk1Var3 = hk1Var2;
/* 1408 */                                              if (0.0f < f8) {
/* 1416 */                                                  motionLayout.setState(hk1Var3);
                                                        } else {
/* 1416 */                                                  motionLayout.setState(hk1Var3);
                                                        }
                                                    }
                                                } else if (action2 == 2) {
/* 612 */                                           motionEvent.getRawY();
/* 615 */                                           motionEvent.getRawX();
/* 623 */                                           width2 = motionLayout.getWidth() / 2.0f;
/* 630 */                                           height = motionLayout.getHeight() / 2.0f;
/* 632 */                                           i10 = mq2Var.f13959i;
/* 635 */                                           if (i10 != -1) {
/* 637 */                                               View viewFindViewById4 = motionLayout.findViewById(i10);
/* 641 */                                               motionLayout.getLocationOnScreen(iArr);
/* 661 */                                               float right = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
/* 679 */                                               float bottom2 = iArr[1] + ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f);
/* 680 */                                               width2 = right;
/* 681 */                                               height = bottom2;
                                                    } else {
/* 683 */                                               i11 = mq2Var.f13954d;
/* 686 */                                               if (i11 != -1) {
/* 704 */                                                   viewFindViewById = motionLayout.findViewById(((zj1) motionLayout.f928q0.get(motionLayout.findViewById(i11))).f20181f.f9679V);
/* 708 */                                                   if (viewFindViewById == null) {
/* 714 */                                                       AbstractC1245n0.m4876d("TouchResponse", "could not find view to animate to");
                                                            } else {
/* 718 */                                                       motionLayout.getLocationOnScreen(iArr);
/* 738 */                                                       width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
/* 756 */                                                       height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                                            }
                                                        }
                                                    }
/* 761 */                                           rawX2 = motionEvent.getRawX() - width2;
/* 767 */                                           rawY2 = motionEvent.getRawY() - height;
/* 782 */                                           dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
/* 812 */                                           fAtan2 = (float) (((dAtan2 - Math.atan2(mq2Var.f13967q - height, mq2Var.f13966p - width2)) * 180.0d) / 3.141592653589793d);
/* 817 */                                           if (fAtan2 > 330.0f) {
/* 819 */                                               fAtan2 -= 360.0f;
                                                    } else if (fAtan2 < -330.0f) {
/* 830 */                                               fAtan2 += 360.0f;
                                                    }
/* 821 */                                           f9 = fAtan2;
/* 840 */                                           if (Math.abs(f9) <= 0.01d) {
/* 846 */                                               progress5 = motionLayout.getProgress();
/* 852 */                                               if (mq2Var.f13963m) {
/* 861 */                                                   z2 = true;
                                                        } else {
/* 854 */                                                   z2 = true;
/* 855 */                                                   mq2Var.f13963m = true;
/* 857 */                                                   motionLayout.setProgress(progress5);
                                                        }
/* 862 */                                               i12 = mq2Var.f13954d;
/* 865 */                                               if (i12 != -1) {
/* 867 */                                                   boolean z3 = z2;
/* 877 */                                                   i13 = 1000;
/* 879 */                                                   mq2Var.f13968r.m478p(i12, progress5, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 890 */                                                   fArr[z3 ? 1 : 0] = (float) Math.toDegrees(fArr[z3 ? 1 : 0]);
                                                            r18 = z3;
                                                        } else {
/* 893 */                                                   boolean z4 = z2;
/* 897 */                                                   i13 = 1000;
/* 899 */                                                   fArr[z4 ? 1 : 0] = 360.0f;
                                                            r18 = z4;
                                                        }
/* 918 */                                               fMax2 = Math.max(Math.min(((f9 * mq2Var.f13972v) / fArr[r18]) + progress5, 1.0f), 0.0f);
/* 922 */                                               progress6 = motionLayout.getProgress();
/* 928 */                                               if (fMax2 != progress6) {
/* 932 */                                                   if (progress6 != 0.0f) {
/* 938 */                                                       motionLayout.m474l();
                                                            } else {
/* 938 */                                                       motionLayout.m474l();
                                                            }
/* 941 */                                                   motionLayout.setProgress(fMax2);
/* 946 */                                                   velocityTracker13 = (VelocityTracker) gr0Var3.f8789a;
/* 948 */                                                   if (velocityTracker13 != null) {
/* 950 */                                                       velocityTracker13.computeCurrentVelocity(i13);
                                                            }
/* 955 */                                                   velocityTracker14 = (VelocityTracker) gr0Var3.f8789a;
/* 957 */                                                   if (velocityTracker14 != null) {
/* 959 */                                                       xVelocity4 = velocityTracker14.getXVelocity();
                                                            } else {
/* 964 */                                                       xVelocity4 = 0.0f;
                                                            }
/* 967 */                                                   velocityTracker15 = (VelocityTracker) gr0Var3.f8789a;
/* 969 */                                                   if (velocityTracker15 != null) {
/* 971 */                                                       yVelocity4 = velocityTracker15.getYVelocity();
                                                            } else {
/* 976 */                                                       yVelocity4 = 0.0f;
                                                            }
                                                            double d = yVelocity4;
                                                            double d2 = xVelocity4;
/* 1008 */                                                  motionLayout.f914j0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d, d2) - dAtan2) * Math.hypot(d, d2)) / Math.hypot(rawX2, rawY2)));
                                                        } else {
/* 1011 */                                                  motionLayout.f914j0 = 0.0f;
                                                        }
/* 1017 */                                              mq2Var.f13966p = motionEvent.getRawX();
/* 1023 */                                              mq2Var.f13967q = motionEvent.getRawY();
                                                    } else {
/* 846 */                                               progress5 = motionLayout.getProgress();
/* 852 */                                               if (mq2Var.f13963m) {
/* 854 */                                                   z2 = true;
/* 855 */                                                   mq2Var.f13963m = true;
/* 857 */                                                   motionLayout.setProgress(progress5);
                                                        } else {
/* 861 */                                                   z2 = true;
                                                        }
/* 862 */                                               i12 = mq2Var.f13954d;
/* 865 */                                               if (i12 != -1) {
/* 867 */                                                   boolean z5 = z2;
/* 877 */                                                   i13 = 1000;
/* 879 */                                                   mq2Var.f13968r.m478p(i12, progress5, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 890 */                                                   fArr[z5 ? 1 : 0] = (float) Math.toDegrees(fArr[z5 ? 1 : 0]);
                                                            r18 = z5;
                                                        } else {
/* 893 */                                                   boolean z6 = z2;
/* 897 */                                                   i13 = 1000;
/* 899 */                                                   fArr[z6 ? 1 : 0] = 360.0f;
                                                            r18 = z6;
                                                        }
/* 918 */                                               fMax2 = Math.max(Math.min(((f9 * mq2Var.f13972v) / fArr[r18]) + progress5, 1.0f), 0.0f);
/* 922 */                                               progress6 = motionLayout.getProgress();
/* 928 */                                               if (fMax2 != progress6) {
/* 932 */                                                   if (progress6 != 0.0f) {
/* 938 */                                                       motionLayout.m474l();
                                                            } else {
/* 938 */                                                       motionLayout.m474l();
                                                            }
/* 941 */                                                   motionLayout.setProgress(fMax2);
/* 946 */                                                   velocityTracker13 = (VelocityTracker) gr0Var3.f8789a;
/* 948 */                                                   if (velocityTracker13 != null) {
/* 950 */                                                       velocityTracker13.computeCurrentVelocity(i13);
                                                            }
/* 955 */                                                   velocityTracker14 = (VelocityTracker) gr0Var3.f8789a;
/* 957 */                                                   if (velocityTracker14 != null) {
/* 959 */                                                       xVelocity4 = velocityTracker14.getXVelocity();
                                                            } else {
/* 964 */                                                       xVelocity4 = 0.0f;
                                                            }
/* 967 */                                                   velocityTracker15 = (VelocityTracker) gr0Var3.f8789a;
/* 969 */                                                   if (velocityTracker15 != null) {
/* 971 */                                                       yVelocity4 = velocityTracker15.getYVelocity();
                                                            } else {
/* 976 */                                                       yVelocity4 = 0.0f;
                                                            }
                                                            double d3 = yVelocity4;
                                                            double d4 = xVelocity4;
/* 1008 */                                                  motionLayout.f914j0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d3, d4) - dAtan2) * Math.hypot(d3, d4)) / Math.hypot(rawX2, rawY2)));
                                                        } else {
/* 1011 */                                                  motionLayout.f914j0 = 0.0f;
                                                        }
/* 1017 */                                              mq2Var.f13966p = motionEvent.getRawX();
/* 1023 */                                              mq2Var.f13967q = motionEvent.getRawY();
                                                    }
                                                }
                                            } else {
/* 1446 */                                      velocityTracker2 = (VelocityTracker) gr0Var3.f8789a;
/* 1448 */                                      if (velocityTracker2 != null) {
/* 1450 */                                          velocityTracker2.addMovement(motionEvent);
                                                }
/* 1453 */                                      action = motionEvent.getAction();
/* 1457 */                                      if (action == 0) {
/* 1957 */                                          mq2Var.f13966p = motionEvent.getRawX();
/* 1963 */                                          mq2Var.f13967q = motionEvent.getRawY();
/* 1966 */                                          mq2Var.f13963m = false;
                                                } else if (action == 1) {
/* 1741 */                                          mq2Var.f13963m = false;
/* 1745 */                                          velocityTracker3 = (VelocityTracker) gr0Var3.f8789a;
/* 1747 */                                          if (velocityTracker3 != null) {
/* 1749 */                                              velocityTracker3.computeCurrentVelocity(1000);
                                                    }
/* 1754 */                                          velocityTracker4 = (VelocityTracker) gr0Var3.f8789a;
/* 1756 */                                          if (velocityTracker4 != null) {
/* 1758 */                                              xVelocity = velocityTracker4.getXVelocity();
                                                    } else {
/* 1764 */                                              xVelocity = 0.0f;
                                                    }
/* 1767 */                                          velocityTracker5 = (VelocityTracker) gr0Var3.f8789a;
/* 1769 */                                          if (velocityTracker5 != null) {
/* 1771 */                                              yVelocity = velocityTracker5.getYVelocity();
                                                    } else {
/* 1777 */                                              yVelocity = 0.0f;
                                                    }
/* 1778 */                                          progress = motionLayout.getProgress();
/* 1782 */                                          i2 = mq2Var.f13954d;
/* 1784 */                                          motionLayout2 = mq2Var.f13968r;
/* 1787 */                                          if (i2 != -1) {
/* 1793 */                                              motionLayout2.m478p(i2, progress, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1796 */                                              c = 1;
/* 1798 */                                              c2 = 0;
                                                    } else {
/* 1809 */                                              float fMin = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
/* 1817 */                                              c = 1;
/* 1819 */                                              fArr[1] = mq2Var.f13962l * fMin;
/* 1824 */                                              c2 = 0;
/* 1826 */                                              fArr[0] = fMin * mq2Var.f13961k;
                                                    }
/* 1828 */                                          f = mq2Var.f13961k;
/* 1830 */                                          f2 = fArr[c2];
/* 1832 */                                          f3 = fArr[c];
/* 1838 */                                          if (f != 0.0f) {
/* 1840 */                                              fAbs = xVelocity / f2;
                                                    } else {
/* 1842 */                                              fAbs = yVelocity / f3;
                                                    }
/* 1848 */                                          if (Float.isNaN(fAbs)) {
/* 1856 */                                              f4 = progress;
                                                    } else {
/* 1852 */                                              f4 = (fAbs / 3.0f) + progress;
                                                    }
/* 1860 */                                          if (f4 == 0.0f) {
/* 1941 */                                              if (0.0f < f4) {
/* 1949 */                                                  motionLayout.setState(hk1Var);
                                                        } else {
/* 1949 */                                                  motionLayout.setState(hk1Var);
                                                        }
                                                    } else if (0.0f < f4) {
/* 1949 */                                              motionLayout.setState(hk1Var);
                                                    } else {
/* 1949 */                                              motionLayout.setState(hk1Var);
                                                    }
                                                } else if (action == 2) {
/* 1473 */                                          rawY = motionEvent.getRawY() - mq2Var.f13967q;
/* 1481 */                                          rawX = motionEvent.getRawX() - mq2Var.f13966p;
/* 1498 */                                          if (Math.abs((mq2Var.f13962l * rawY) + (mq2Var.f13961k * rawX)) <= mq2Var.f13974x) {
/* 1504 */                                              progress2 = motionLayout.getProgress();
/* 1510 */                                              if (!mq2Var.f13963m) {
/* 1513 */                                                  mq2Var.f13963m = true;
/* 1515 */                                                  motionLayout.setProgress(progress2);
                                                        }
/* 1518 */                                              i4 = mq2Var.f13954d;
/* 1520 */                                              motionLayout3 = mq2Var.f13968r;
/* 1523 */                                              if (i4 != -1) {
/* 1529 */                                                  motionLayout3.m478p(i4, progress2, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1532 */                                                  c3 = 1;
/* 1534 */                                                  c4 = 0;
                                                        } else {
/* 1545 */                                                  float fMin2 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
/* 1553 */                                                  c3 = 1;
/* 1555 */                                                  fArr[1] = mq2Var.f13962l * fMin2;
/* 1560 */                                                  c4 = 0;
/* 1562 */                                                  fArr[0] = fMin2 * mq2Var.f13961k;
                                                        }
/* 1590 */                                              if (Math.abs(((mq2Var.f13962l * fArr[c3]) + (mq2Var.f13961k * fArr[c4])) * mq2Var.f13972v) < 0.01d) {
/* 1592 */                                                  fArr[0] = 0.01f;
/* 1594 */                                                  fArr[c3] = 0.01f;
                                                        }
/* 1601 */                                              if (mq2Var.f13961k != 0.0f) {
/* 1605 */                                                  f5 = rawX / fArr[0];
                                                        } else {
/* 1609 */                                                  f5 = rawY / fArr[c3];
                                                        }
/* 1618 */                                              fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
/* 1624 */                                              if (mq2Var.f13953c == 6) {
/* 1626 */                                                  fMax = Math.max(fMax, 0.01f);
                                                        }
/* 1633 */                                              if (mq2Var.f13953c == 7) {
/* 1638 */                                                  fMax = Math.min(fMax, 0.99f);
                                                        }
/* 1642 */                                              progress3 = motionLayout.getProgress();
/* 1648 */                                              if (fMax != progress3) {
/* 1654 */                                                  if (progress3 != 0.0f) {
/* 1662 */                                                      motionLayout.m474l();
                                                            } else {
/* 1662 */                                                      motionLayout.m474l();
                                                            }
/* 1665 */                                                  motionLayout.setProgress(fMax);
/* 1670 */                                                  velocityTracker6 = (VelocityTracker) gr0Var3.f8789a;
/* 1672 */                                                  if (velocityTracker6 != null) {
/* 1674 */                                                      velocityTracker6.computeCurrentVelocity(1000);
                                                            }
/* 1679 */                                                  velocityTracker7 = (VelocityTracker) gr0Var3.f8789a;
/* 1681 */                                                  if (velocityTracker7 != null) {
/* 1683 */                                                      xVelocity2 = velocityTracker7.getXVelocity();
                                                            } else {
/* 1688 */                                                      xVelocity2 = 0.0f;
                                                            }
/* 1691 */                                                  velocityTracker8 = (VelocityTracker) gr0Var3.f8789a;
/* 1693 */                                                  if (velocityTracker8 != null) {
/* 1695 */                                                      yVelocity2 = velocityTracker8.getYVelocity();
                                                            } else {
/* 1700 */                                                      yVelocity2 = 0.0f;
                                                            }
/* 1706 */                                                  if (mq2Var.f13961k != 0.0f) {
/* 1712 */                                                      f6 = xVelocity2 / fArr[0];
                                                            } else {
/* 1718 */                                                      f6 = yVelocity2 / fArr[1];
                                                            }
/* 1720 */                                                  motionLayout.f914j0 = f6;
                                                        } else {
/* 1724 */                                                  motionLayout.f914j0 = 0.0f;
                                                        }
/* 1730 */                                              mq2Var.f13966p = motionEvent.getRawX();
/* 1736 */                                              mq2Var.f13967q = motionEvent.getRawY();
                                                    } else {
/* 1504 */                                              progress2 = motionLayout.getProgress();
/* 1510 */                                              if (!mq2Var.f13963m) {
/* 1513 */                                                  mq2Var.f13963m = true;
/* 1515 */                                                  motionLayout.setProgress(progress2);
                                                        }
/* 1518 */                                              i4 = mq2Var.f13954d;
/* 1520 */                                              motionLayout3 = mq2Var.f13968r;
/* 1523 */                                              if (i4 != -1) {
/* 1529 */                                                  motionLayout3.m478p(i4, progress2, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1532 */                                                  c3 = 1;
/* 1534 */                                                  c4 = 0;
                                                        } else {
/* 1545 */                                                  float fMin3 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
/* 1553 */                                                  c3 = 1;
/* 1555 */                                                  fArr[1] = mq2Var.f13962l * fMin3;
/* 1560 */                                                  c4 = 0;
/* 1562 */                                                  fArr[0] = fMin3 * mq2Var.f13961k;
                                                        }
/* 1590 */                                              if (Math.abs(((mq2Var.f13962l * fArr[c3]) + (mq2Var.f13961k * fArr[c4])) * mq2Var.f13972v) < 0.01d) {
/* 1592 */                                                  fArr[0] = 0.01f;
/* 1594 */                                                  fArr[c3] = 0.01f;
                                                        }
/* 1601 */                                              if (mq2Var.f13961k != 0.0f) {
/* 1605 */                                                  f5 = rawX / fArr[0];
                                                        } else {
/* 1609 */                                                  f5 = rawY / fArr[c3];
                                                        }
/* 1618 */                                              fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
/* 1624 */                                              if (mq2Var.f13953c == 6) {
/* 1626 */                                                  fMax = Math.max(fMax, 0.01f);
                                                        }
/* 1633 */                                              if (mq2Var.f13953c == 7) {
/* 1638 */                                                  fMax = Math.min(fMax, 0.99f);
                                                        }
/* 1642 */                                              progress3 = motionLayout.getProgress();
/* 1648 */                                              if (fMax != progress3) {
/* 1654 */                                                  if (progress3 != 0.0f) {
/* 1662 */                                                      motionLayout.m474l();
                                                            } else {
/* 1662 */                                                      motionLayout.m474l();
                                                            }
/* 1665 */                                                  motionLayout.setProgress(fMax);
/* 1670 */                                                  velocityTracker6 = (VelocityTracker) gr0Var3.f8789a;
/* 1672 */                                                  if (velocityTracker6 != null) {
/* 1674 */                                                      velocityTracker6.computeCurrentVelocity(1000);
                                                            }
/* 1679 */                                                  velocityTracker7 = (VelocityTracker) gr0Var3.f8789a;
/* 1681 */                                                  if (velocityTracker7 != null) {
/* 1683 */                                                      xVelocity2 = velocityTracker7.getXVelocity();
                                                            } else {
/* 1688 */                                                      xVelocity2 = 0.0f;
                                                            }
/* 1691 */                                                  velocityTracker8 = (VelocityTracker) gr0Var3.f8789a;
/* 1693 */                                                  if (velocityTracker8 != null) {
/* 1695 */                                                      yVelocity2 = velocityTracker8.getYVelocity();
                                                            } else {
/* 1700 */                                                      yVelocity2 = 0.0f;
                                                            }
/* 1706 */                                                  if (mq2Var.f13961k != 0.0f) {
/* 1712 */                                                      f6 = xVelocity2 / fArr[0];
                                                            } else {
/* 1718 */                                                      f6 = yVelocity2 / fArr[1];
                                                            }
/* 1720 */                                                  motionLayout.f914j0 = f6;
                                                        } else {
/* 1724 */                                                  motionLayout.f914j0 = 0.0f;
                                                        }
/* 1730 */                                              mq2Var.f13966p = motionEvent.getRawX();
/* 1736 */                                              mq2Var.f13967q = motionEvent.getRawY();
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 1972 */                          lk1Var2.f13358r = motionEvent.getRawX();
/* 1978 */                          lk1Var2.f13359s = motionEvent.getRawY();
/* 1985 */                          if (motionEvent.getAction() == 1) {
/* 1993 */                              velocityTracker = (VelocityTracker) gr0Var.f8789a;
/* 1995 */                              if (velocityTracker != null) {
/* 1997 */                                  velocityTracker.recycle();
/* 2000 */                                  gr0Var2 = null;
/* 2001 */                                  gr0Var.f8789a = null;
                                        } else {
/* 2004 */                                  gr0Var2 = null;
                                        }
/* 2005 */                              lk1Var2.f13355o = gr0Var2;
/* 2007 */                              i = this.f918l0;
/* 2010 */                              if (i != -1) {
/* 2012 */                                  lk1Var2.m6466a(i, this);
                                        }
                                    }
                                }
                            }
                        } else if (!lk1Var2.f13353m) {
/* 550 */                   kk1Var = lk1Var2.f13343c;
/* 552 */                   if (kk1Var != null) {
/* 558 */                       fArr = mq2Var.f13964n;
/* 562 */                       if (!lk1Var2.f13354n) {
/* 564 */                           gr0Var3 = lk1Var2.f13355o;
/* 566 */                           motionLayout = mq2Var.f13968r;
/* 568 */                           z = mq2Var.f13960j;
/* 577 */                           hk1Var = hk1.f9122d;
/* 581 */                           if (z) {
/* 583 */                               iArr = mq2Var.f13965o;
/* 587 */                               velocityTracker9 = (VelocityTracker) gr0Var3.f8789a;
/* 589 */                               if (velocityTracker9 != null) {
/* 591 */                                   velocityTracker9.addMovement(motionEvent);
                                        }
/* 594 */                               action2 = motionEvent.getAction();
/* 598 */                               if (action2 == 0) {
/* 1425 */                                  mq2Var.f13966p = motionEvent.getRawX();
/* 1431 */                                  mq2Var.f13967q = motionEvent.getRawY();
/* 1434 */                                  mq2Var.f13963m = false;
                                        } else if (action2 == 1) {
/* 1028 */                                  mq2Var.f13963m = false;
/* 1032 */                                  velocityTracker10 = (VelocityTracker) gr0Var3.f8789a;
/* 1034 */                                  if (velocityTracker10 != null) {
/* 1038 */                                      velocityTracker10.computeCurrentVelocity(16);
                                            }
/* 1043 */                                  velocityTracker11 = (VelocityTracker) gr0Var3.f8789a;
/* 1045 */                                  if (velocityTracker11 != null) {
/* 1047 */                                      xVelocity3 = velocityTracker11.getXVelocity();
                                            } else {
/* 1053 */                                      xVelocity3 = 0.0f;
                                            }
/* 1056 */                                  velocityTracker12 = (VelocityTracker) gr0Var3.f8789a;
/* 1058 */                                  if (velocityTracker12 != null) {
/* 1060 */                                      yVelocity3 = velocityTracker12.getYVelocity();
                                            } else {
/* 1067 */                                      yVelocity3 = 0.0f;
                                            }
/* 1069 */                                  progress4 = motionLayout.getProgress();
/* 1078 */                                  width = motionLayout.getWidth() / 2.0f;
/* 1085 */                                  float height3 = motionLayout.getHeight() / 2.0f;
/* 1087 */                                  i5 = mq2Var.f13959i;
/* 1092 */                                  if (i5 != -1) {
/* 1094 */                                      View viewFindViewById5 = motionLayout.findViewById(i5);
/* 1098 */                                      motionLayout.getLocationOnScreen(iArr);
/* 1118 */                                      width = iArr[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
/* 1121 */                                      f7 = iArr[1];
/* 1124 */                                      top = viewFindViewById5.getTop();
/* 1128 */                                      bottom = viewFindViewById5.getBottom();
                                            } else {
/* 1139 */                                      i6 = mq2Var.f13954d;
/* 1142 */                                      if (i6 != -1) {
/* 1160 */                                          View viewFindViewById6 = motionLayout.findViewById(((zj1) motionLayout.f928q0.get(motionLayout.findViewById(i6))).f20181f.f9679V);
/* 1164 */                                          motionLayout.getLocationOnScreen(iArr);
/* 1184 */                                          width = iArr[0] + ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f);
/* 1187 */                                          f7 = iArr[1];
/* 1190 */                                          top = viewFindViewById6.getTop();
/* 1194 */                                          bottom = viewFindViewById6.getBottom();
                                                } else {
/* 1203 */                                          float rawX6 = motionEvent.getRawX() - width;
/* 1209 */                                          float rawY6 = motionEvent.getRawY() - height3;
/* 1219 */                                          double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
/* 1223 */                                          i7 = mq2Var.f13954d;
/* 1226 */                                          if (i7 != -1) {
/* 1235 */                                              hk1Var2 = hk1Var;
/* 1241 */                                              i8 = 6;
/* 1242 */                                              mq2Var.f13968r.m478p(i7, progress4, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1255 */                                              fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                    } else {
/* 1258 */                                              hk1Var2 = hk1Var;
/* 1262 */                                              i8 = 6;
/* 1265 */                                              fArr[1] = 360.0f;
                                                    }
/* 1285 */                                          degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY6, xVelocity3 + rawX6)) - degrees4)) * 62.5f;
/* 1290 */                                          if (Float.isNaN(degrees)) {
/* 1302 */                                              f8 = (((degrees * 3.0f) * mq2Var.f13972v) / fArr[1]) + progress4;
                                                    } else {
/* 1307 */                                              f8 = progress4;
                                                    }
/* 1312 */                                          if (f8 != 0.0f) {
/* 1402 */                                              hk1Var3 = hk1Var2;
/* 1408 */                                              if (0.0f < f8) {
/* 1416 */                                                  motionLayout.setState(hk1Var3);
                                                        } else {
/* 1416 */                                                  motionLayout.setState(hk1Var3);
                                                        }
                                                    } else {
/* 1402 */                                              hk1Var3 = hk1Var2;
/* 1408 */                                              if (0.0f < f8) {
/* 1416 */                                                  motionLayout.setState(hk1Var3);
                                                        } else {
/* 1416 */                                                  motionLayout.setState(hk1Var3);
                                                        }
                                                    }
                                                }
                                            }
/* 1136 */                                  height3 = ((bottom + top) / 2.0f) + f7;
/* 1203 */                                  float rawX7 = motionEvent.getRawX() - width;
/* 1209 */                                  float rawY7 = motionEvent.getRawY() - height3;
/* 1219 */                                  double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
/* 1223 */                                  i7 = mq2Var.f13954d;
/* 1226 */                                  if (i7 != -1) {
/* 1235 */                                      hk1Var2 = hk1Var;
/* 1241 */                                      i8 = 6;
/* 1242 */                                      mq2Var.f13968r.m478p(i7, progress4, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1255 */                                      fArr[1] = (float) Math.toDegrees(fArr[1]);
                                            } else {
/* 1258 */                                      hk1Var2 = hk1Var;
/* 1262 */                                      i8 = 6;
/* 1265 */                                      fArr[1] = 360.0f;
                                            }
/* 1285 */                                  degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY7, xVelocity3 + rawX7)) - degrees5)) * 62.5f;
/* 1290 */                                  if (Float.isNaN(degrees)) {
/* 1302 */                                      f8 = (((degrees * 3.0f) * mq2Var.f13972v) / fArr[1]) + progress4;
                                            } else {
/* 1307 */                                      f8 = progress4;
                                            }
/* 1312 */                                  if (f8 != 0.0f) {
/* 1402 */                                      hk1Var3 = hk1Var2;
/* 1408 */                                      if (0.0f < f8) {
/* 1416 */                                          motionLayout.setState(hk1Var3);
                                                } else {
/* 1416 */                                          motionLayout.setState(hk1Var3);
                                                }
                                            } else {
/* 1402 */                                      hk1Var3 = hk1Var2;
/* 1408 */                                      if (0.0f < f8) {
/* 1416 */                                          motionLayout.setState(hk1Var3);
                                                } else {
/* 1416 */                                          motionLayout.setState(hk1Var3);
                                                }
                                            }
                                        } else if (action2 == 2) {
/* 612 */                                   motionEvent.getRawY();
/* 615 */                                   motionEvent.getRawX();
/* 623 */                                   width2 = motionLayout.getWidth() / 2.0f;
/* 630 */                                   height = motionLayout.getHeight() / 2.0f;
/* 632 */                                   i10 = mq2Var.f13959i;
/* 635 */                                   if (i10 != -1) {
/* 637 */                                       View viewFindViewById7 = motionLayout.findViewById(i10);
/* 641 */                                       motionLayout.getLocationOnScreen(iArr);
/* 661 */                                       float right2 = iArr[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
/* 679 */                                       float bottom3 = iArr[1] + ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f);
/* 680 */                                       width2 = right2;
/* 681 */                                       height = bottom3;
                                            } else {
/* 683 */                                       i11 = mq2Var.f13954d;
/* 686 */                                       if (i11 != -1) {
/* 704 */                                           viewFindViewById = motionLayout.findViewById(((zj1) motionLayout.f928q0.get(motionLayout.findViewById(i11))).f20181f.f9679V);
/* 708 */                                           if (viewFindViewById == null) {
/* 714 */                                               AbstractC1245n0.m4876d("TouchResponse", "could not find view to animate to");
                                                    } else {
/* 718 */                                               motionLayout.getLocationOnScreen(iArr);
/* 738 */                                               width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
/* 756 */                                               height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                                    }
                                                }
                                            }
/* 761 */                                   rawX2 = motionEvent.getRawX() - width2;
/* 767 */                                   rawY2 = motionEvent.getRawY() - height;
/* 782 */                                   dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
/* 812 */                                   fAtan2 = (float) (((dAtan2 - Math.atan2(mq2Var.f13967q - height, mq2Var.f13966p - width2)) * 180.0d) / 3.141592653589793d);
/* 817 */                                   if (fAtan2 > 330.0f) {
/* 819 */                                       fAtan2 -= 360.0f;
                                            } else if (fAtan2 < -330.0f) {
/* 830 */                                       fAtan2 += 360.0f;
                                            }
/* 821 */                                   f9 = fAtan2;
/* 840 */                                   if (Math.abs(f9) <= 0.01d) {
/* 846 */                                       progress5 = motionLayout.getProgress();
/* 852 */                                       if (mq2Var.f13963m) {
/* 854 */                                           z2 = true;
/* 855 */                                           mq2Var.f13963m = true;
/* 857 */                                           motionLayout.setProgress(progress5);
                                                } else {
/* 861 */                                           z2 = true;
                                                }
/* 862 */                                       i12 = mq2Var.f13954d;
/* 865 */                                       if (i12 != -1) {
/* 867 */                                           boolean z7 = z2;
/* 877 */                                           i13 = 1000;
/* 879 */                                           mq2Var.f13968r.m478p(i12, progress5, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 890 */                                           fArr[z7 ? 1 : 0] = (float) Math.toDegrees(fArr[z7 ? 1 : 0]);
                                                    r18 = z7;
                                                } else {
/* 893 */                                           boolean z8 = z2;
/* 897 */                                           i13 = 1000;
/* 899 */                                           fArr[z8 ? 1 : 0] = 360.0f;
                                                    r18 = z8;
                                                }
/* 918 */                                       fMax2 = Math.max(Math.min(((f9 * mq2Var.f13972v) / fArr[r18]) + progress5, 1.0f), 0.0f);
/* 922 */                                       progress6 = motionLayout.getProgress();
/* 928 */                                       if (fMax2 != progress6) {
/* 932 */                                           if (progress6 != 0.0f) {
/* 938 */                                               motionLayout.m474l();
                                                    } else {
/* 938 */                                               motionLayout.m474l();
                                                    }
/* 941 */                                           motionLayout.setProgress(fMax2);
/* 946 */                                           velocityTracker13 = (VelocityTracker) gr0Var3.f8789a;
/* 948 */                                           if (velocityTracker13 != null) {
/* 950 */                                               velocityTracker13.computeCurrentVelocity(i13);
                                                    }
/* 955 */                                           velocityTracker14 = (VelocityTracker) gr0Var3.f8789a;
/* 957 */                                           if (velocityTracker14 != null) {
/* 959 */                                               xVelocity4 = velocityTracker14.getXVelocity();
                                                    } else {
/* 964 */                                               xVelocity4 = 0.0f;
                                                    }
/* 967 */                                           velocityTracker15 = (VelocityTracker) gr0Var3.f8789a;
/* 969 */                                           if (velocityTracker15 != null) {
/* 971 */                                               yVelocity4 = velocityTracker15.getYVelocity();
                                                    } else {
/* 976 */                                               yVelocity4 = 0.0f;
                                                    }
                                                    double d5 = yVelocity4;
                                                    double d6 = xVelocity4;
/* 1008 */                                          motionLayout.f914j0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d5, d6) - dAtan2) * Math.hypot(d5, d6)) / Math.hypot(rawX2, rawY2)));
                                                } else {
/* 1011 */                                          motionLayout.f914j0 = 0.0f;
                                                }
/* 1017 */                                      mq2Var.f13966p = motionEvent.getRawX();
/* 1023 */                                      mq2Var.f13967q = motionEvent.getRawY();
                                            } else {
/* 846 */                                       progress5 = motionLayout.getProgress();
/* 852 */                                       if (mq2Var.f13963m) {
/* 854 */                                           z2 = true;
/* 855 */                                           mq2Var.f13963m = true;
/* 857 */                                           motionLayout.setProgress(progress5);
                                                } else {
/* 861 */                                           z2 = true;
                                                }
/* 862 */                                       i12 = mq2Var.f13954d;
/* 865 */                                       if (i12 != -1) {
/* 867 */                                           boolean z9 = z2;
/* 877 */                                           i13 = 1000;
/* 879 */                                           mq2Var.f13968r.m478p(i12, progress5, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 890 */                                           fArr[z9 ? 1 : 0] = (float) Math.toDegrees(fArr[z9 ? 1 : 0]);
                                                    r18 = z9;
                                                } else {
/* 893 */                                           boolean z10 = z2;
/* 897 */                                           i13 = 1000;
/* 899 */                                           fArr[z10 ? 1 : 0] = 360.0f;
                                                    r18 = z10;
                                                }
/* 918 */                                       fMax2 = Math.max(Math.min(((f9 * mq2Var.f13972v) / fArr[r18]) + progress5, 1.0f), 0.0f);
/* 922 */                                       progress6 = motionLayout.getProgress();
/* 928 */                                       if (fMax2 != progress6) {
/* 932 */                                           if (progress6 != 0.0f) {
/* 938 */                                               motionLayout.m474l();
                                                    } else {
/* 938 */                                               motionLayout.m474l();
                                                    }
/* 941 */                                           motionLayout.setProgress(fMax2);
/* 946 */                                           velocityTracker13 = (VelocityTracker) gr0Var3.f8789a;
/* 948 */                                           if (velocityTracker13 != null) {
/* 950 */                                               velocityTracker13.computeCurrentVelocity(i13);
                                                    }
/* 955 */                                           velocityTracker14 = (VelocityTracker) gr0Var3.f8789a;
/* 957 */                                           if (velocityTracker14 != null) {
/* 959 */                                               xVelocity4 = velocityTracker14.getXVelocity();
                                                    } else {
/* 964 */                                               xVelocity4 = 0.0f;
                                                    }
/* 967 */                                           velocityTracker15 = (VelocityTracker) gr0Var3.f8789a;
/* 969 */                                           if (velocityTracker15 != null) {
/* 971 */                                               yVelocity4 = velocityTracker15.getYVelocity();
                                                    } else {
/* 976 */                                               yVelocity4 = 0.0f;
                                                    }
                                                    double d7 = yVelocity4;
                                                    double d8 = xVelocity4;
/* 1008 */                                          motionLayout.f914j0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d7, d8) - dAtan2) * Math.hypot(d7, d8)) / Math.hypot(rawX2, rawY2)));
                                                } else {
/* 1011 */                                          motionLayout.f914j0 = 0.0f;
                                                }
/* 1017 */                                      mq2Var.f13966p = motionEvent.getRawX();
/* 1023 */                                      mq2Var.f13967q = motionEvent.getRawY();
                                            }
                                        }
                                    } else {
/* 1446 */                              velocityTracker2 = (VelocityTracker) gr0Var3.f8789a;
/* 1448 */                              if (velocityTracker2 != null) {
/* 1450 */                                  velocityTracker2.addMovement(motionEvent);
                                        }
/* 1453 */                              action = motionEvent.getAction();
/* 1457 */                              if (action == 0) {
/* 1957 */                                  mq2Var.f13966p = motionEvent.getRawX();
/* 1963 */                                  mq2Var.f13967q = motionEvent.getRawY();
/* 1966 */                                  mq2Var.f13963m = false;
                                        } else if (action == 1) {
/* 1741 */                                  mq2Var.f13963m = false;
/* 1745 */                                  velocityTracker3 = (VelocityTracker) gr0Var3.f8789a;
/* 1747 */                                  if (velocityTracker3 != null) {
/* 1749 */                                      velocityTracker3.computeCurrentVelocity(1000);
                                            }
/* 1754 */                                  velocityTracker4 = (VelocityTracker) gr0Var3.f8789a;
/* 1756 */                                  if (velocityTracker4 != null) {
/* 1758 */                                      xVelocity = velocityTracker4.getXVelocity();
                                            } else {
/* 1764 */                                      xVelocity = 0.0f;
                                            }
/* 1767 */                                  velocityTracker5 = (VelocityTracker) gr0Var3.f8789a;
/* 1769 */                                  if (velocityTracker5 != null) {
/* 1771 */                                      yVelocity = velocityTracker5.getYVelocity();
                                            } else {
/* 1777 */                                      yVelocity = 0.0f;
                                            }
/* 1778 */                                  progress = motionLayout.getProgress();
/* 1782 */                                  i2 = mq2Var.f13954d;
/* 1784 */                                  motionLayout2 = mq2Var.f13968r;
/* 1787 */                                  if (i2 != -1) {
/* 1793 */                                      motionLayout2.m478p(i2, progress, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1796 */                                      c = 1;
/* 1798 */                                      c2 = 0;
                                            } else {
/* 1809 */                                      float fMin4 = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
/* 1817 */                                      c = 1;
/* 1819 */                                      fArr[1] = mq2Var.f13962l * fMin4;
/* 1824 */                                      c2 = 0;
/* 1826 */                                      fArr[0] = fMin4 * mq2Var.f13961k;
                                            }
/* 1828 */                                  f = mq2Var.f13961k;
/* 1830 */                                  f2 = fArr[c2];
/* 1832 */                                  f3 = fArr[c];
/* 1838 */                                  if (f != 0.0f) {
/* 1840 */                                      fAbs = xVelocity / f2;
                                            } else {
/* 1842 */                                      fAbs = yVelocity / f3;
                                            }
/* 1848 */                                  if (Float.isNaN(fAbs)) {
/* 1852 */                                      f4 = (fAbs / 3.0f) + progress;
                                            } else {
/* 1856 */                                      f4 = progress;
                                            }
/* 1860 */                                  if (f4 == 0.0f) {
/* 1941 */                                      if (0.0f < f4) {
/* 1949 */                                          motionLayout.setState(hk1Var);
                                                } else {
/* 1949 */                                          motionLayout.setState(hk1Var);
                                                }
                                            } else if (0.0f < f4) {
/* 1949 */                                      motionLayout.setState(hk1Var);
                                            } else {
/* 1949 */                                      motionLayout.setState(hk1Var);
                                            }
                                        } else if (action == 2) {
/* 1473 */                                  rawY = motionEvent.getRawY() - mq2Var.f13967q;
/* 1481 */                                  rawX = motionEvent.getRawX() - mq2Var.f13966p;
/* 1498 */                                  if (Math.abs((mq2Var.f13962l * rawY) + (mq2Var.f13961k * rawX)) <= mq2Var.f13974x) {
/* 1504 */                                      progress2 = motionLayout.getProgress();
/* 1510 */                                      if (!mq2Var.f13963m) {
/* 1513 */                                          mq2Var.f13963m = true;
/* 1515 */                                          motionLayout.setProgress(progress2);
                                                }
/* 1518 */                                      i4 = mq2Var.f13954d;
/* 1520 */                                      motionLayout3 = mq2Var.f13968r;
/* 1523 */                                      if (i4 != -1) {
/* 1529 */                                          motionLayout3.m478p(i4, progress2, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1532 */                                          c3 = 1;
/* 1534 */                                          c4 = 0;
                                                } else {
/* 1545 */                                          float fMin5 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
/* 1553 */                                          c3 = 1;
/* 1555 */                                          fArr[1] = mq2Var.f13962l * fMin5;
/* 1560 */                                          c4 = 0;
/* 1562 */                                          fArr[0] = fMin5 * mq2Var.f13961k;
                                                }
/* 1590 */                                      if (Math.abs(((mq2Var.f13962l * fArr[c3]) + (mq2Var.f13961k * fArr[c4])) * mq2Var.f13972v) < 0.01d) {
/* 1592 */                                          fArr[0] = 0.01f;
/* 1594 */                                          fArr[c3] = 0.01f;
                                                }
/* 1601 */                                      if (mq2Var.f13961k != 0.0f) {
/* 1605 */                                          f5 = rawX / fArr[0];
                                                } else {
/* 1609 */                                          f5 = rawY / fArr[c3];
                                                }
/* 1618 */                                      fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
/* 1624 */                                      if (mq2Var.f13953c == 6) {
/* 1626 */                                          fMax = Math.max(fMax, 0.01f);
                                                }
/* 1633 */                                      if (mq2Var.f13953c == 7) {
/* 1638 */                                          fMax = Math.min(fMax, 0.99f);
                                                }
/* 1642 */                                      progress3 = motionLayout.getProgress();
/* 1648 */                                      if (fMax != progress3) {
/* 1654 */                                          if (progress3 != 0.0f) {
/* 1662 */                                              motionLayout.m474l();
                                                    } else {
/* 1662 */                                              motionLayout.m474l();
                                                    }
/* 1665 */                                          motionLayout.setProgress(fMax);
/* 1670 */                                          velocityTracker6 = (VelocityTracker) gr0Var3.f8789a;
/* 1672 */                                          if (velocityTracker6 != null) {
/* 1674 */                                              velocityTracker6.computeCurrentVelocity(1000);
                                                    }
/* 1679 */                                          velocityTracker7 = (VelocityTracker) gr0Var3.f8789a;
/* 1681 */                                          if (velocityTracker7 != null) {
/* 1683 */                                              xVelocity2 = velocityTracker7.getXVelocity();
                                                    } else {
/* 1688 */                                              xVelocity2 = 0.0f;
                                                    }
/* 1691 */                                          velocityTracker8 = (VelocityTracker) gr0Var3.f8789a;
/* 1693 */                                          if (velocityTracker8 != null) {
/* 1695 */                                              yVelocity2 = velocityTracker8.getYVelocity();
                                                    } else {
/* 1700 */                                              yVelocity2 = 0.0f;
                                                    }
/* 1706 */                                          if (mq2Var.f13961k != 0.0f) {
/* 1712 */                                              f6 = xVelocity2 / fArr[0];
                                                    } else {
/* 1718 */                                              f6 = yVelocity2 / fArr[1];
                                                    }
/* 1720 */                                          motionLayout.f914j0 = f6;
                                                } else {
/* 1724 */                                          motionLayout.f914j0 = 0.0f;
                                                }
/* 1730 */                                      mq2Var.f13966p = motionEvent.getRawX();
/* 1736 */                                      mq2Var.f13967q = motionEvent.getRawY();
                                            } else {
/* 1504 */                                      progress2 = motionLayout.getProgress();
/* 1510 */                                      if (!mq2Var.f13963m) {
/* 1513 */                                          mq2Var.f13963m = true;
/* 1515 */                                          motionLayout.setProgress(progress2);
                                                }
/* 1518 */                                      i4 = mq2Var.f13954d;
/* 1520 */                                      motionLayout3 = mq2Var.f13968r;
/* 1523 */                                      if (i4 != -1) {
/* 1529 */                                          motionLayout3.m478p(i4, progress2, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1532 */                                          c3 = 1;
/* 1534 */                                          c4 = 0;
                                                } else {
/* 1545 */                                          float fMin6 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
/* 1553 */                                          c3 = 1;
/* 1555 */                                          fArr[1] = mq2Var.f13962l * fMin6;
/* 1560 */                                          c4 = 0;
/* 1562 */                                          fArr[0] = fMin6 * mq2Var.f13961k;
                                                }
/* 1590 */                                      if (Math.abs(((mq2Var.f13962l * fArr[c3]) + (mq2Var.f13961k * fArr[c4])) * mq2Var.f13972v) < 0.01d) {
/* 1592 */                                          fArr[0] = 0.01f;
/* 1594 */                                          fArr[c3] = 0.01f;
                                                }
/* 1601 */                                      if (mq2Var.f13961k != 0.0f) {
/* 1605 */                                          f5 = rawX / fArr[0];
                                                } else {
/* 1609 */                                          f5 = rawY / fArr[c3];
                                                }
/* 1618 */                                      fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
/* 1624 */                                      if (mq2Var.f13953c == 6) {
/* 1626 */                                          fMax = Math.max(fMax, 0.01f);
                                                }
/* 1633 */                                      if (mq2Var.f13953c == 7) {
/* 1638 */                                          fMax = Math.min(fMax, 0.99f);
                                                }
/* 1642 */                                      progress3 = motionLayout.getProgress();
/* 1648 */                                      if (fMax != progress3) {
/* 1654 */                                          if (progress3 != 0.0f) {
/* 1662 */                                              motionLayout.m474l();
                                                    } else {
/* 1662 */                                              motionLayout.m474l();
                                                    }
/* 1665 */                                          motionLayout.setProgress(fMax);
/* 1670 */                                          velocityTracker6 = (VelocityTracker) gr0Var3.f8789a;
/* 1672 */                                          if (velocityTracker6 != null) {
/* 1674 */                                              velocityTracker6.computeCurrentVelocity(1000);
                                                    }
/* 1679 */                                          velocityTracker7 = (VelocityTracker) gr0Var3.f8789a;
/* 1681 */                                          if (velocityTracker7 != null) {
/* 1683 */                                              xVelocity2 = velocityTracker7.getXVelocity();
                                                    } else {
/* 1688 */                                              xVelocity2 = 0.0f;
                                                    }
/* 1691 */                                          velocityTracker8 = (VelocityTracker) gr0Var3.f8789a;
/* 1693 */                                          if (velocityTracker8 != null) {
/* 1695 */                                              yVelocity2 = velocityTracker8.getYVelocity();
                                                    } else {
/* 1700 */                                              yVelocity2 = 0.0f;
                                                    }
/* 1706 */                                          if (mq2Var.f13961k != 0.0f) {
/* 1712 */                                              f6 = xVelocity2 / fArr[0];
                                                    } else {
/* 1718 */                                              f6 = yVelocity2 / fArr[1];
                                                    }
/* 1720 */                                          motionLayout.f914j0 = f6;
                                                } else {
/* 1724 */                                          motionLayout.f914j0 = 0.0f;
                                                }
/* 1730 */                                      mq2Var.f13966p = motionEvent.getRawX();
/* 1736 */                                      mq2Var.f13967q = motionEvent.getRawY();
                                            }
                                        }
                                    }
                                }
                            }
/* 1972 */                  lk1Var2.f13358r = motionEvent.getRawX();
/* 1978 */                  lk1Var2.f13359s = motionEvent.getRawY();
/* 1985 */                  if (motionEvent.getAction() == 1) {
/* 1993 */                      velocityTracker = (VelocityTracker) gr0Var.f8789a;
/* 1995 */                      if (velocityTracker != null) {
/* 1997 */                          velocityTracker.recycle();
/* 2000 */                          gr0Var2 = null;
/* 2001 */                          gr0Var.f8789a = null;
                                } else {
/* 2004 */                          gr0Var2 = null;
                                }
/* 2005 */                      lk1Var2.f13355o = gr0Var2;
/* 2007 */                      i = this.f918l0;
/* 2010 */                      if (i != -1) {
/* 2012 */                          lk1Var2.m6466a(i, this);
                                }
                            }
                        }
                    } else if (!lk1Var2.f13353m) {
/* 550 */               kk1Var = lk1Var2.f13343c;
/* 552 */               if (kk1Var != null && (mq2Var = kk1Var.f12850l) != null) {
/* 558 */                   fArr = mq2Var.f13964n;
/* 562 */                   if (!lk1Var2.f13354n) {
/* 564 */                       gr0Var3 = lk1Var2.f13355o;
/* 566 */                       motionLayout = mq2Var.f13968r;
/* 568 */                       z = mq2Var.f13960j;
/* 577 */                       hk1Var = hk1.f9122d;
/* 581 */                       if (z) {
/* 583 */                           iArr = mq2Var.f13965o;
/* 587 */                           velocityTracker9 = (VelocityTracker) gr0Var3.f8789a;
/* 589 */                           if (velocityTracker9 != null) {
/* 591 */                               velocityTracker9.addMovement(motionEvent);
                                    }
/* 594 */                           action2 = motionEvent.getAction();
/* 598 */                           if (action2 == 0) {
/* 1425 */                              mq2Var.f13966p = motionEvent.getRawX();
/* 1431 */                              mq2Var.f13967q = motionEvent.getRawY();
/* 1434 */                              mq2Var.f13963m = false;
                                    } else if (action2 == 1) {
/* 1028 */                              mq2Var.f13963m = false;
/* 1032 */                              velocityTracker10 = (VelocityTracker) gr0Var3.f8789a;
/* 1034 */                              if (velocityTracker10 != null) {
/* 1038 */                                  velocityTracker10.computeCurrentVelocity(16);
                                        }
/* 1043 */                              velocityTracker11 = (VelocityTracker) gr0Var3.f8789a;
/* 1045 */                              if (velocityTracker11 != null) {
/* 1047 */                                  xVelocity3 = velocityTracker11.getXVelocity();
                                        } else {
/* 1053 */                                  xVelocity3 = 0.0f;
                                        }
/* 1056 */                              velocityTracker12 = (VelocityTracker) gr0Var3.f8789a;
/* 1058 */                              if (velocityTracker12 != null) {
/* 1060 */                                  yVelocity3 = velocityTracker12.getYVelocity();
                                        } else {
/* 1067 */                                  yVelocity3 = 0.0f;
                                        }
/* 1069 */                              progress4 = motionLayout.getProgress();
/* 1078 */                              width = motionLayout.getWidth() / 2.0f;
/* 1085 */                              float height4 = motionLayout.getHeight() / 2.0f;
/* 1087 */                              i5 = mq2Var.f13959i;
/* 1092 */                              if (i5 != -1) {
/* 1094 */                                  View viewFindViewById8 = motionLayout.findViewById(i5);
/* 1098 */                                  motionLayout.getLocationOnScreen(iArr);
/* 1118 */                                  width = iArr[0] + ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f);
/* 1121 */                                  f7 = iArr[1];
/* 1124 */                                  top = viewFindViewById8.getTop();
/* 1128 */                                  bottom = viewFindViewById8.getBottom();
                                        } else {
/* 1139 */                                  i6 = mq2Var.f13954d;
/* 1142 */                                  if (i6 != -1) {
/* 1160 */                                      View viewFindViewById9 = motionLayout.findViewById(((zj1) motionLayout.f928q0.get(motionLayout.findViewById(i6))).f20181f.f9679V);
/* 1164 */                                      motionLayout.getLocationOnScreen(iArr);
/* 1184 */                                      width = iArr[0] + ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f);
/* 1187 */                                      f7 = iArr[1];
/* 1190 */                                      top = viewFindViewById9.getTop();
/* 1194 */                                      bottom = viewFindViewById9.getBottom();
                                            } else {
/* 1203 */                                      float rawX8 = motionEvent.getRawX() - width;
/* 1209 */                                      float rawY8 = motionEvent.getRawY() - height4;
/* 1219 */                                      double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
/* 1223 */                                      i7 = mq2Var.f13954d;
/* 1226 */                                      if (i7 != -1) {
/* 1235 */                                          hk1Var2 = hk1Var;
/* 1241 */                                          i8 = 6;
/* 1242 */                                          mq2Var.f13968r.m478p(i7, progress4, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1255 */                                          fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                } else {
/* 1258 */                                          hk1Var2 = hk1Var;
/* 1262 */                                          i8 = 6;
/* 1265 */                                          fArr[1] = 360.0f;
                                                }
/* 1285 */                                      degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY8, xVelocity3 + rawX8)) - degrees6)) * 62.5f;
/* 1290 */                                      if (Float.isNaN(degrees)) {
/* 1302 */                                          f8 = (((degrees * 3.0f) * mq2Var.f13972v) / fArr[1]) + progress4;
                                                } else {
/* 1307 */                                          f8 = progress4;
                                                }
/* 1312 */                                      if (f8 != 0.0f || f8 == 1.0f || (i9 = mq2Var.f13953c) == 3) {
/* 1402 */                                          hk1Var3 = hk1Var2;
/* 1408 */                                          if (0.0f < f8 || 1.0f <= f8) {
/* 1416 */                                              motionLayout.setState(hk1Var3);
                                                    }
                                                } else {
/* 1331 */                                          float fAbs2 = (degrees * mq2Var.f13972v) / fArr[1];
/* 1339 */                                          float f18 = ((double) f8) < 0.5d ? 0.0f : 1.0f;
/* 1341 */                                          if (i9 == i8) {
/* 1349 */                                              if (progress4 + fAbs2 < 0.0f) {
/* 1351 */                                                  fAbs2 = Math.abs(fAbs2);
                                                        }
/* 1355 */                                              f18 = 1.0f;
                                                    }
/* 1360 */                                          if (mq2Var.f13953c == 7) {
/* 1368 */                                              if (progress4 + fAbs2 > 1.0f) {
/* 1374 */                                                  fAbs2 = -Math.abs(fAbs2);
                                                        }
/* 1375 */                                              f18 = 0.0f;
                                                    }
/* 1380 */                                          motionLayout.m488z(f18, fAbs2 * 3.0f, mq2Var.f13953c);
/* 1387 */                                          if (0.0f >= progress4 || 1.0f <= progress4) {
/* 1397 */                                              motionLayout.setState(hk1Var2);
                                                    }
                                                }
                                            }
                                        }
/* 1136 */                              height4 = ((bottom + top) / 2.0f) + f7;
/* 1203 */                              float rawX9 = motionEvent.getRawX() - width;
/* 1209 */                              float rawY9 = motionEvent.getRawY() - height4;
/* 1219 */                              double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
/* 1223 */                              i7 = mq2Var.f13954d;
/* 1226 */                              if (i7 != -1) {
/* 1235 */                                  hk1Var2 = hk1Var;
/* 1241 */                                  i8 = 6;
/* 1242 */                                  mq2Var.f13968r.m478p(i7, progress4, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1255 */                                  fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
/* 1258 */                                  hk1Var2 = hk1Var;
/* 1262 */                                  i8 = 6;
/* 1265 */                                  fArr[1] = 360.0f;
                                        }
/* 1285 */                              degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY9, xVelocity3 + rawX9)) - degrees7)) * 62.5f;
/* 1290 */                              if (Float.isNaN(degrees)) {
/* 1302 */                                  f8 = (((degrees * 3.0f) * mq2Var.f13972v) / fArr[1]) + progress4;
                                        } else {
/* 1307 */                                  f8 = progress4;
                                        }
/* 1312 */                              if (f8 != 0.0f) {
/* 1402 */                                  hk1Var3 = hk1Var2;
/* 1408 */                                  if (0.0f < f8) {
/* 1416 */                                      motionLayout.setState(hk1Var3);
                                            } else {
/* 1416 */                                      motionLayout.setState(hk1Var3);
                                            }
                                        } else {
/* 1402 */                                  hk1Var3 = hk1Var2;
/* 1408 */                                  if (0.0f < f8) {
/* 1416 */                                      motionLayout.setState(hk1Var3);
                                            } else {
/* 1416 */                                      motionLayout.setState(hk1Var3);
                                            }
                                        }
                                    } else if (action2 == 2) {
/* 612 */                               motionEvent.getRawY();
/* 615 */                               motionEvent.getRawX();
/* 623 */                               width2 = motionLayout.getWidth() / 2.0f;
/* 630 */                               height = motionLayout.getHeight() / 2.0f;
/* 632 */                               i10 = mq2Var.f13959i;
/* 635 */                               if (i10 != -1) {
/* 637 */                                   View viewFindViewById10 = motionLayout.findViewById(i10);
/* 641 */                                   motionLayout.getLocationOnScreen(iArr);
/* 661 */                                   float right3 = iArr[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
/* 679 */                                   float bottom4 = iArr[1] + ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f);
/* 680 */                                   width2 = right3;
/* 681 */                                   height = bottom4;
                                        } else {
/* 683 */                                   i11 = mq2Var.f13954d;
/* 686 */                                   if (i11 != -1) {
/* 704 */                                       viewFindViewById = motionLayout.findViewById(((zj1) motionLayout.f928q0.get(motionLayout.findViewById(i11))).f20181f.f9679V);
/* 708 */                                       if (viewFindViewById == null) {
/* 714 */                                           AbstractC1245n0.m4876d("TouchResponse", "could not find view to animate to");
                                                } else {
/* 718 */                                           motionLayout.getLocationOnScreen(iArr);
/* 738 */                                           width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
/* 756 */                                           height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                                }
                                            }
                                        }
/* 761 */                               rawX2 = motionEvent.getRawX() - width2;
/* 767 */                               rawY2 = motionEvent.getRawY() - height;
/* 782 */                               dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
/* 812 */                               fAtan2 = (float) (((dAtan2 - Math.atan2(mq2Var.f13967q - height, mq2Var.f13966p - width2)) * 180.0d) / 3.141592653589793d);
/* 817 */                               if (fAtan2 > 330.0f) {
/* 819 */                                   fAtan2 -= 360.0f;
                                        } else if (fAtan2 < -330.0f) {
/* 830 */                                   fAtan2 += 360.0f;
                                        }
/* 821 */                               f9 = fAtan2;
/* 840 */                               if (Math.abs(f9) <= 0.01d || mq2Var.f13963m) {
/* 846 */                                   progress5 = motionLayout.getProgress();
/* 852 */                                   if (mq2Var.f13963m) {
/* 854 */                                       z2 = true;
/* 855 */                                       mq2Var.f13963m = true;
/* 857 */                                       motionLayout.setProgress(progress5);
                                            } else {
/* 861 */                                       z2 = true;
                                            }
/* 862 */                                   i12 = mq2Var.f13954d;
/* 865 */                                   if (i12 != -1) {
/* 867 */                                       boolean z11 = z2;
/* 877 */                                       i13 = 1000;
/* 879 */                                       mq2Var.f13968r.m478p(i12, progress5, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 890 */                                       fArr[z11 ? 1 : 0] = (float) Math.toDegrees(fArr[z11 ? 1 : 0]);
                                                r18 = z11;
                                            } else {
/* 893 */                                       boolean z12 = z2;
/* 897 */                                       i13 = 1000;
/* 899 */                                       fArr[z12 ? 1 : 0] = 360.0f;
                                                r18 = z12;
                                            }
/* 918 */                                   fMax2 = Math.max(Math.min(((f9 * mq2Var.f13972v) / fArr[r18]) + progress5, 1.0f), 0.0f);
/* 922 */                                   progress6 = motionLayout.getProgress();
/* 928 */                                   if (fMax2 != progress6) {
/* 932 */                                       if (progress6 != 0.0f || progress6 == 1.0f) {
/* 938 */                                           motionLayout.m474l();
                                                }
/* 941 */                                       motionLayout.setProgress(fMax2);
/* 946 */                                       velocityTracker13 = (VelocityTracker) gr0Var3.f8789a;
/* 948 */                                       if (velocityTracker13 != null) {
/* 950 */                                           velocityTracker13.computeCurrentVelocity(i13);
                                                }
/* 955 */                                       velocityTracker14 = (VelocityTracker) gr0Var3.f8789a;
/* 957 */                                       if (velocityTracker14 != null) {
/* 959 */                                           xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
/* 964 */                                           xVelocity4 = 0.0f;
                                                }
/* 967 */                                       velocityTracker15 = (VelocityTracker) gr0Var3.f8789a;
/* 969 */                                       if (velocityTracker15 != null) {
/* 971 */                                           yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
/* 976 */                                           yVelocity4 = 0.0f;
                                                }
                                                double d9 = yVelocity4;
                                                double d10 = xVelocity4;
/* 1008 */                                      motionLayout.f914j0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d9, d10) - dAtan2) * Math.hypot(d9, d10)) / Math.hypot(rawX2, rawY2)));
                                            } else {
/* 1011 */                                      motionLayout.f914j0 = 0.0f;
                                            }
/* 1017 */                                  mq2Var.f13966p = motionEvent.getRawX();
/* 1023 */                                  mq2Var.f13967q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
/* 1446 */                          velocityTracker2 = (VelocityTracker) gr0Var3.f8789a;
/* 1448 */                          if (velocityTracker2 != null) {
/* 1450 */                              velocityTracker2.addMovement(motionEvent);
                                    }
/* 1453 */                          action = motionEvent.getAction();
/* 1457 */                          if (action == 0) {
/* 1957 */                              mq2Var.f13966p = motionEvent.getRawX();
/* 1963 */                              mq2Var.f13967q = motionEvent.getRawY();
/* 1966 */                              mq2Var.f13963m = false;
                                    } else if (action == 1) {
/* 1741 */                              mq2Var.f13963m = false;
/* 1745 */                              velocityTracker3 = (VelocityTracker) gr0Var3.f8789a;
/* 1747 */                              if (velocityTracker3 != null) {
/* 1749 */                                  velocityTracker3.computeCurrentVelocity(1000);
                                        }
/* 1754 */                              velocityTracker4 = (VelocityTracker) gr0Var3.f8789a;
/* 1756 */                              if (velocityTracker4 != null) {
/* 1758 */                                  xVelocity = velocityTracker4.getXVelocity();
                                        } else {
/* 1764 */                                  xVelocity = 0.0f;
                                        }
/* 1767 */                              velocityTracker5 = (VelocityTracker) gr0Var3.f8789a;
/* 1769 */                              if (velocityTracker5 != null) {
/* 1771 */                                  yVelocity = velocityTracker5.getYVelocity();
                                        } else {
/* 1777 */                                  yVelocity = 0.0f;
                                        }
/* 1778 */                              progress = motionLayout.getProgress();
/* 1782 */                              i2 = mq2Var.f13954d;
/* 1784 */                              motionLayout2 = mq2Var.f13968r;
/* 1787 */                              if (i2 != -1) {
/* 1793 */                                  motionLayout2.m478p(i2, progress, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1796 */                                  c = 1;
/* 1798 */                                  c2 = 0;
                                        } else {
/* 1809 */                                  float fMin7 = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
/* 1817 */                                  c = 1;
/* 1819 */                                  fArr[1] = mq2Var.f13962l * fMin7;
/* 1824 */                                  c2 = 0;
/* 1826 */                                  fArr[0] = fMin7 * mq2Var.f13961k;
                                        }
/* 1828 */                              f = mq2Var.f13961k;
/* 1830 */                              f2 = fArr[c2];
/* 1832 */                              f3 = fArr[c];
/* 1838 */                              if (f != 0.0f) {
/* 1840 */                                  fAbs = xVelocity / f2;
                                        } else {
/* 1842 */                                  fAbs = yVelocity / f3;
                                        }
/* 1848 */                              if (Float.isNaN(fAbs)) {
/* 1852 */                                  f4 = (fAbs / 3.0f) + progress;
                                        } else {
/* 1856 */                                  f4 = progress;
                                        }
/* 1860 */                              if (f4 == 0.0f && f4 != 1.0f && (i3 = mq2Var.f13953c) != 3) {
/* 1879 */                                  float f19 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
/* 1881 */                                  if (i3 == 6) {
/* 1889 */                                      if (progress + fAbs < 0.0f) {
/* 1891 */                                          fAbs = Math.abs(fAbs);
                                                }
/* 1895 */                                      f19 = 1.0f;
                                            }
/* 1900 */                                  if (mq2Var.f13953c == 7) {
/* 1908 */                                      if (progress + fAbs > 1.0f) {
/* 1914 */                                          fAbs = -Math.abs(fAbs);
                                                }
/* 1915 */                                      f19 = 0.0f;
                                            }
/* 1918 */                                  motionLayout.m488z(f19, fAbs, mq2Var.f13953c);
/* 1925 */                                  if (0.0f >= progress || 1.0f <= progress) {
/* 1933 */                                      motionLayout.setState(hk1Var);
                                            }
                                        } else if (0.0f < f4 || 1.0f <= f4) {
/* 1949 */                                  motionLayout.setState(hk1Var);
                                        }
                                    } else if (action == 2) {
/* 1473 */                              rawY = motionEvent.getRawY() - mq2Var.f13967q;
/* 1481 */                              rawX = motionEvent.getRawX() - mq2Var.f13966p;
/* 1498 */                              if (Math.abs((mq2Var.f13962l * rawY) + (mq2Var.f13961k * rawX)) <= mq2Var.f13974x || mq2Var.f13963m) {
/* 1504 */                                  progress2 = motionLayout.getProgress();
/* 1510 */                                  if (!mq2Var.f13963m) {
/* 1513 */                                      mq2Var.f13963m = true;
/* 1515 */                                      motionLayout.setProgress(progress2);
                                            }
/* 1518 */                                  i4 = mq2Var.f13954d;
/* 1520 */                                  motionLayout3 = mq2Var.f13968r;
/* 1523 */                                  if (i4 != -1) {
/* 1529 */                                      motionLayout3.m478p(i4, progress2, mq2Var.f13958h, mq2Var.f13957g, fArr);
/* 1532 */                                      c3 = 1;
/* 1534 */                                      c4 = 0;
                                            } else {
/* 1545 */                                      float fMin8 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
/* 1553 */                                      c3 = 1;
/* 1555 */                                      fArr[1] = mq2Var.f13962l * fMin8;
/* 1560 */                                      c4 = 0;
/* 1562 */                                      fArr[0] = fMin8 * mq2Var.f13961k;
                                            }
/* 1590 */                                  if (Math.abs(((mq2Var.f13962l * fArr[c3]) + (mq2Var.f13961k * fArr[c4])) * mq2Var.f13972v) < 0.01d) {
/* 1592 */                                      fArr[0] = 0.01f;
/* 1594 */                                      fArr[c3] = 0.01f;
                                            }
/* 1601 */                                  if (mq2Var.f13961k != 0.0f) {
/* 1605 */                                      f5 = rawX / fArr[0];
                                            } else {
/* 1609 */                                      f5 = rawY / fArr[c3];
                                            }
/* 1618 */                                  fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
/* 1624 */                                  if (mq2Var.f13953c == 6) {
/* 1626 */                                      fMax = Math.max(fMax, 0.01f);
                                            }
/* 1633 */                                  if (mq2Var.f13953c == 7) {
/* 1638 */                                      fMax = Math.min(fMax, 0.99f);
                                            }
/* 1642 */                                  progress3 = motionLayout.getProgress();
/* 1648 */                                  if (fMax != progress3) {
/* 1654 */                                      if (progress3 != 0.0f || progress3 == 1.0f) {
/* 1662 */                                          motionLayout.m474l();
                                                }
/* 1665 */                                      motionLayout.setProgress(fMax);
/* 1670 */                                      velocityTracker6 = (VelocityTracker) gr0Var3.f8789a;
/* 1672 */                                      if (velocityTracker6 != null) {
/* 1674 */                                          velocityTracker6.computeCurrentVelocity(1000);
                                                }
/* 1679 */                                      velocityTracker7 = (VelocityTracker) gr0Var3.f8789a;
/* 1681 */                                      if (velocityTracker7 != null) {
/* 1683 */                                          xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
/* 1688 */                                          xVelocity2 = 0.0f;
                                                }
/* 1691 */                                      velocityTracker8 = (VelocityTracker) gr0Var3.f8789a;
/* 1693 */                                      if (velocityTracker8 != null) {
/* 1695 */                                          yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
/* 1700 */                                          yVelocity2 = 0.0f;
                                                }
/* 1706 */                                      if (mq2Var.f13961k != 0.0f) {
/* 1712 */                                          f6 = xVelocity2 / fArr[0];
                                                } else {
/* 1718 */                                          f6 = yVelocity2 / fArr[1];
                                                }
/* 1720 */                                      motionLayout.f914j0 = f6;
                                            } else {
/* 1724 */                                      motionLayout.f914j0 = 0.0f;
                                            }
/* 1730 */                                  mq2Var.f13966p = motionEvent.getRawX();
/* 1736 */                                  mq2Var.f13967q = motionEvent.getRawY();
                                        }
                                    }
                                }
                            }
                        }
/* 1972 */              lk1Var2.f13358r = motionEvent.getRawX();
/* 1978 */              lk1Var2.f13359s = motionEvent.getRawY();
/* 1985 */              if (motionEvent.getAction() == 1 && (gr0Var = lk1Var2.f13355o) != null) {
/* 1993 */                  velocityTracker = (VelocityTracker) gr0Var.f8789a;
/* 1995 */                  if (velocityTracker != null) {
/* 1997 */                      velocityTracker.recycle();
/* 2000 */                      gr0Var2 = null;
/* 2001 */                      gr0Var.f8789a = null;
                            } else {
/* 2004 */                      gr0Var2 = null;
                            }
/* 2005 */                  lk1Var2.f13355o = gr0Var2;
/* 2007 */                  i = this.f918l0;
/* 2010 */                  if (i != -1) {
/* 2012 */                      lk1Var2.m6466a(i, this);
                            }
                        }
                    }
/* 2017 */          kk1 kk1Var6 = this.f908g0.f13343c;
/* 2023 */          if ((kk1Var6.f12856r & 4) != 0) {
/* 2027 */              return kk1Var6.f12850l.f13963m;
                    }
/* 2030 */          return true;
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
                public final void onViewAdded(View view) {
/* 1 */             super.onViewAdded(view);
/* 6 */             if (view instanceof MotionHelper) {
/* 8 */                 MotionHelper motionHelper = (MotionHelper) view;
/* 12 */                if (this.f893R0 == null) {
/* 19 */                    this.f893R0 = new CopyOnWriteArrayList();
                        }
/* 23 */                this.f893R0.add(motionHelper);
/* 28 */                if (motionHelper.f874w) {
/* 32 */                    if (this.f890O0 == null) {
/* 39 */                        this.f890O0 = new ArrayList();
                            }
/* 43 */                    this.f890O0.add(motionHelper);
                        }
/* 48 */                if (motionHelper.f871U) {
/* 52 */                    if (this.f891P0 == null) {
/* 59 */                        this.f891P0 = new ArrayList();
                            }
/* 63 */                    this.f891P0.add(motionHelper);
                        }
/* 68 */                if (motionHelper instanceof MotionEffect) {
/* 72 */                    if (this.f892Q0 == null) {
/* 79 */                        this.f892Q0 = new ArrayList();
                            }
/* 83 */                    this.f892Q0.add(motionHelper);
                        }
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
                public final void onViewRemoved(View view) {
/* 1 */             super.onViewRemoved(view);
/* 4 */             ArrayList arrayList = this.f890O0;
/* 6 */             if (arrayList != null) {
/* 8 */                 arrayList.remove(view);
                    }
/* 11 */            ArrayList arrayList2 = this.f891P0;
/* 13 */            if (arrayList2 != null) {
/* 15 */                arrayList2.remove(view);
                    }
                }

                /* JADX INFO: renamed from: p */
                public final void m478p(int i, float f, float f2, float f3, float[] fArr) {
/* 1 */             View viewM513b = m513b(i);
/* 11 */            zj1 zj1Var = (zj1) this.f928q0.get(viewM513b);
/* 13 */            if (zj1Var != null) {
/* 15 */                zj1Var.m10361d(f, f2, f3, fArr);
/* 18 */                viewM513b.getY();
                    } else {
/* 59 */                AbstractC1245n0.m4889q("MotionLayout", "WARNING could not find view id " + (viewM513b == null ? fm0.m3781g(i, HttpUrl.FRAGMENT_ENCODE_SET) : viewM513b.getContext().getResources().getResourceName(i)));
                    }
                }

                /* JADX INFO: renamed from: q */
                public final kk1 m479q(int i) {
/* 13 */            for (kk1 kk1Var : this.f908g0.f13344d) {
/* 23 */                if (kk1Var.f12839a == i) {
/* 25 */                    return kk1Var;
                        }
                    }
/* 26 */            return null;
                }

                /* JADX INFO: renamed from: r */
                public final boolean m480r(float f, float f2, View view, MotionEvent motionEvent) {
                    boolean z;
                    boolean zOnTouchEvent;
/* 4 */             if (!(view instanceof ViewGroup)) {
/* 55 */                z = false;
                        break;
                    }
/* 7 */             ViewGroup viewGroup = (ViewGroup) view;
/* 13 */            int childCount = viewGroup.getChildCount() - 1;
                    while (true) {
/* 14 */                if (childCount < 0) {
/* 55 */                    z = false;
                            break;
                        }
/* 16 */                View childAt = viewGroup.getChildAt(childCount);
/* 48 */                if (m480r((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), childAt, motionEvent)) {
/* 50 */                    z = true;
                            break;
                        }
/* 52 */                childCount--;
                    }
/* 56 */            if (!z) {
/* 69 */                float right = (view.getRight() + f) - view.getLeft();
/* 81 */                float bottom = (view.getBottom() + f2) - view.getTop();
/* 82 */                RectF rectF = this.f925o1;
/* 84 */                rectF.set(f, f2, right, bottom);
/* 91 */                if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
/* 107 */                   float f3 = -f;
/* 108 */                   float f4 = -f2;
/* 109 */                   Matrix matrix = view.getMatrix();
/* 117 */                   if (matrix.isIdentity()) {
/* 119 */                       motionEvent.offsetLocation(f3, f4);
/* 122 */                       zOnTouchEvent = view.onTouchEvent(motionEvent);
/* 128 */                       motionEvent.offsetLocation(-f3, -f4);
                            } else {
/* 132 */                       MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
/* 136 */                       motionEventObtain.offsetLocation(f3, f4);
/* 141 */                       if (this.f929q1 == null) {
/* 148 */                           this.f929q1 = new Matrix();
                                }
/* 152 */                       matrix.invert(this.f929q1);
/* 157 */                       motionEventObtain.transform(this.f929q1);
/* 160 */                       zOnTouchEvent = view.onTouchEvent(motionEventObtain);
/* 164 */                       motionEventObtain.recycle();
                            }
/* 167 */                   if (zOnTouchEvent) {
/* 3 */                         return true;
                            }
                        }
                    }
/* 170 */           return z;
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
                public final void requestLayout() {
                    lk1 lk1Var;
                    kk1 kk1Var;
/* 3 */             if (!this.f899X0 && this.f918l0 == -1 && (lk1Var = this.f908g0) != null && (kk1Var = lk1Var.f13343c) != null) {
/* 18 */                int i = kk1Var.f12855q;
/* 20 */                if (i == 0) {
/* 51 */                    return;
                        }
/* 24 */                if (i == 2) {
/* 26 */                    int childCount = getChildCount();
/* 31 */                    for (int i2 = 0; i2 < childCount; i2++) {
/* 46 */                        ((zj1) this.f928q0.get(getChildAt(i2))).f20179d = true;
                            }
/* 51 */                    return;
                        }
                    }
/* 52 */            super.requestLayout();
                }

                /* JADX INFO: renamed from: s */
                public final void m481s(AttributeSet attributeSet) {
                    lk1 lk1Var;
/* 5 */             f875s1 = isInEditMode();
/* 11 */            if (attributeSet != null) {
/* 19 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionLayout);
/* 23 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 29 */                boolean z = true;
/* 30 */                for (int i = 0; i < indexCount; i++) {
/* 32 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 38 */                    if (index == R$styleable.MotionLayout_layoutDescription) {
/* 53 */                        this.f908g0 = new lk1(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                            } else if (index == R$styleable.MotionLayout_currentState) {
/* 64 */                        this.f918l0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            } else if (index == R$styleable.MotionLayout_motionProgress) {
/* 76 */                        this.f936w0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
/* 78 */                        this.f938y0 = true;
                            } else if (index == R$styleable.MotionLayout_applyMotionScene) {
/* 85 */                        z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                            } else if (index == R$styleable.MotionLayout_showPaths) {
/* 96 */                        if (this.f876A0 == 0) {
/* 107 */                           this.f876A0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                                }
                            } else if (index == R$styleable.MotionLayout_motionDebug) {
/* 118 */                       this.f876A0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            }
                        }
/* 123 */               typedArrayObtainStyledAttributes.recycle();
/* 128 */               if (this.f908g0 == null) {
/* 132 */                   AbstractC1245n0.m4876d("MotionLayout", "WARNING NO app:layoutDescription tag");
                        }
/* 135 */               if (!z) {
/* 138 */                   this.f908g0 = null;
                        }
                    }
/* 142 */           if (this.f876A0 != 0) {
/* 144 */               lk1 lk1Var2 = this.f908g0;
/* 146 */               if (lk1Var2 == null) {
/* 150 */                   AbstractC1245n0.m4876d("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
                        } else {
/* 155 */                   int iM6473h = lk1Var2.m6473h();
/* 159 */                   lk1 lk1Var3 = this.f908g0;
/* 165 */                   C0077d c0077dM6467b = lk1Var3.m6467b(lk1Var3.m6473h());
/* 173 */                   String strM3039u = de3.m3039u(getContext(), iM6473h);
/* 177 */                   int childCount = getChildCount();
/* 184 */                   for (int i2 = 0; i2 < childCount; i2++) {
/* 186 */                       View childAt = getChildAt(i2);
/* 190 */                       int id = childAt.getId();
/* 194 */                       if (id == -1) {
/* 198 */                           StringBuilder sbM3513q = AbstractC0886en.m3513q("CHECK: ", strM3039u, " ALL VIEWS SHOULD HAVE ID's ");
/* 210 */                           sbM3513q.append(childAt.getClass().getName());
/* 215 */                           sbM3513q.append(" does not!");
/* 222 */                           AbstractC1245n0.m4889q("MotionLayout", sbM3513q.toString());
                                }
/* 229 */                       if (c0077dM6467b.m541i(id) == null) {
/* 233 */                           StringBuilder sbM3513q2 = AbstractC0886en.m3513q("CHECK: ", strM3039u, " NO CONSTRAINTS for ");
/* 241 */                           sbM3513q2.append(de3.m3040v(childAt));
/* 248 */                           AbstractC1245n0.m4889q("MotionLayout", sbM3513q2.toString());
                                }
                            }
/* 266 */                   Integer[] numArr = (Integer[]) c0077dM6467b.f1192f.keySet().toArray(new Integer[0]);
/* 268 */                   int length = numArr.length;
/* 269 */                   int[] iArr = new int[length];
/* 272 */                   for (int i3 = 0; i3 < length; i3++) {
/* 280 */                       iArr[i3] = numArr[i3].intValue();
                            }
/* 285 */                   for (int i4 = 0; i4 < length; i4++) {
/* 287 */                       int i5 = iArr[i4];
/* 293 */                       String strM3039u2 = de3.m3039u(getContext(), i5);
/* 303 */                       if (findViewById(iArr[i4]) == null) {
/* 325 */                           AbstractC1245n0.m4889q("MotionLayout", "CHECK: " + strM3039u + " NO View matches id " + strM3039u2);
                                }
/* 340 */                       if (c0077dM6467b.m540h(i5).f1180e.f17777d == -1) {
/* 346 */                           AbstractC1245n0.m4889q("MotionLayout", fm0.m3785k("CHECK: ", strM3039u, "(", strM3039u2, ") no LAYOUT_HEIGHT"));
                                }
/* 357 */                       if (c0077dM6467b.m540h(i5).f1180e.f17775c == -1) {
/* 363 */                           AbstractC1245n0.m4889q("MotionLayout", fm0.m3785k("CHECK: ", strM3039u, "(", strM3039u2, ") no LAYOUT_HEIGHT"));
                                }
                            }
/* 371 */                   SparseIntArray sparseIntArray = new SparseIntArray();
/* 376 */                   SparseIntArray sparseIntArray2 = new SparseIntArray();
/* 391 */                   for (kk1 kk1Var : this.f908g0.f13344d) {
/* 401 */                       kk1 kk1Var2 = this.f908g0.f13343c;
/* 407 */                       if (kk1Var.f12842d == kk1Var.f12841c) {
/* 411 */                           AbstractC1245n0.m4876d("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                                }
/* 414 */                       int i6 = kk1Var.f12842d;
/* 416 */                       int i7 = kk1Var.f12841c;
/* 422 */                       String strM3039u3 = de3.m3039u(getContext(), i6);
/* 430 */                       String strM3039u4 = de3.m3039u(getContext(), i7);
/* 440 */                       if (sparseIntArray.get(i6) == i7) {
/* 462 */                           AbstractC1245n0.m4876d("MotionLayout", "CHECK: two transitions with the same start and end " + strM3039u3 + "->" + strM3039u4);
                                }
/* 469 */                       if (sparseIntArray2.get(i7) == i6) {
/* 491 */                           AbstractC1245n0.m4876d("MotionLayout", "CHECK: you can't have reverse transitions" + strM3039u3 + "->" + strM3039u4);
                                }
/* 494 */                       sparseIntArray.put(i6, i7);
/* 497 */                       sparseIntArray2.put(i7, i6);
/* 506 */                       if (this.f908g0.m6467b(i6) == null) {
/* 522 */                           AbstractC1245n0.m4876d("MotionLayout", " no such constraintSetStart " + strM3039u3);
                                }
/* 531 */                       if (this.f908g0.m6467b(i7) == null) {
/* 547 */                           AbstractC1245n0.m4876d("MotionLayout", " no such constraintSetEnd " + strM3039u3);
                                }
                            }
                        }
                    }
/* 554 */           if (this.f918l0 != -1 || (lk1Var = this.f908g0) == null) {
/* 585 */               return;
                    }
/* 564 */           this.f918l0 = lk1Var.m6473h();
/* 572 */           this.f916k0 = this.f908g0.m6473h();
/* 576 */           kk1 kk1Var3 = this.f908g0.f13343c;
/* 583 */           this.f920m0 = kk1Var3 != null ? kk1Var3.f12841c : -1;
                }

                public void setDebugMode(int i) {
/* 1 */             this.f876A0 = i;
/* 3 */             invalidate();
                }

                public void setDelayedApplicationOfInitialState(boolean z) {
/* 1 */             this.f917k1 = z;
                }

                public void setInteractionEnabled(boolean z) {
/* 1 */             this.f926p0 = z;
                }

                public void setInterpolatedProgress(float f) {
/* 3 */             if (this.f908g0 != null) {
/* 7 */                 setState(hk1.f9121c);
/* 12 */                Interpolator interpolatorM6470e = this.f908g0.m6470e();
/* 16 */                if (interpolatorM6470e != null) {
/* 22 */                    setProgress(interpolatorM6470e.getInterpolation(f));
/* 25 */                    return;
                        }
                    }
/* 26 */            setProgress(f);
                }

                public void setOnHide(float f) {
/* 1 */             ArrayList arrayList = this.f891P0;
/* 3 */             if (arrayList != null) {
/* 5 */                 int size = arrayList.size();
/* 10 */                for (int i = 0; i < size; i++) {
/* 20 */                    ((MotionHelper) this.f891P0.get(i)).setProgress(f);
                        }
                    }
                }

                public void setOnShow(float f) {
/* 1 */             ArrayList arrayList = this.f890O0;
/* 3 */             if (arrayList != null) {
/* 5 */                 int size = arrayList.size();
/* 10 */                for (int i = 0; i < size; i++) {
/* 20 */                    ((MotionHelper) this.f890O0.get(i)).setProgress(f);
                        }
                    }
                }

                public void setProgress(float f) {
/* 6 */             if (f < 0.0f || f > 1.0f) {
/* 16 */                AbstractC1245n0.m4889q("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
                    }
/* 23 */            if (!super.isAttachedToWindow()) {
/* 27 */                if (this.f911h1 == null) {
/* 34 */                    this.f911h1 = new fk1(this);
                        }
/* 38 */                this.f911h1.f8248a = f;
/* 40 */                return;
                    }
/* 41 */            hk1 hk1Var = hk1.f9122d;
/* 43 */            hk1 hk1Var2 = hk1.f9121c;
/* 45 */            if (f <= 0.0f) {
/* 51 */                if (this.f934u0 == 1.0f && this.f918l0 == this.f920m0) {
/* 59 */                    setState(hk1Var2);
                        }
/* 64 */                this.f918l0 = this.f916k0;
/* 70 */                if (this.f934u0 == 0.0f) {
/* 72 */                    setState(hk1Var);
                        }
                    } else if (f >= 1.0f) {
/* 84 */                if (this.f934u0 == 0.0f && this.f918l0 == this.f916k0) {
/* 92 */                    setState(hk1Var2);
                        }
/* 97 */                this.f918l0 = this.f920m0;
/* 103 */               if (this.f934u0 == 1.0f) {
/* 105 */                   setState(hk1Var);
                        }
                    } else {
/* 110 */               this.f918l0 = -1;
/* 112 */               setState(hk1Var2);
                    }
/* 117 */           if (this.f908g0 == null) {
/* 119 */               return;
                    }
/* 121 */           this.f937x0 = true;
/* 123 */           this.f936w0 = f;
/* 125 */           this.f933t0 = f;
/* 129 */           this.f935v0 = -1L;
/* 131 */           this.f930r0 = -1L;
/* 134 */           this.f910h0 = null;
/* 136 */           this.f938y0 = true;
/* 138 */           invalidate();
                }

                public void setScene(lk1 lk1Var) {
                    mq2 mq2Var;
/* 1 */             this.f908g0 = lk1Var;
/* 3 */             boolean zM516e = m516e();
/* 7 */             lk1Var.f13356p = zM516e;
/* 9 */             kk1 kk1Var = lk1Var.f13343c;
/* 11 */            if (kk1Var != null && (mq2Var = kk1Var.f12850l) != null) {
/* 17 */                mq2Var.m6788c(zM516e);
                    }
/* 20 */            m484v();
                }

                public void setStartState(int i) {
/* 5 */             if (super.isAttachedToWindow()) {
/* 25 */                this.f918l0 = i;
/* 27 */                return;
                    }
/* 9 */             if (this.f911h1 == null) {
/* 16 */                this.f911h1 = new fk1(this);
                    }
/* 18 */            fk1 fk1Var = this.f911h1;
/* 20 */            fk1Var.f8250c = i;
/* 22 */            fk1Var.f8251d = i;
                }

                public void setState(hk1 hk1Var) {
/* 1 */             hk1 hk1Var2 = hk1.f9122d;
/* 3 */             if (hk1Var == hk1Var2 && this.f918l0 == -1) {
/* 53 */                return;
                    }
/* 11 */            hk1 hk1Var3 = this.f919l1;
/* 13 */            this.f919l1 = hk1Var;
/* 15 */            hk1 hk1Var4 = hk1.f9121c;
/* 17 */            if (hk1Var3 == hk1Var4 && hk1Var == hk1Var4) {
/* 21 */                m476n();
                    }
/* 24 */            int iOrdinal = hk1Var3.ordinal();
/* 28 */            if (iOrdinal != 0 && iOrdinal != 1) {
/* 34 */                if (iOrdinal == 2 && hk1Var == hk1Var2) {
/* 39 */                    m477o();
/* 42 */                    return;
                        }
/* 53 */                return;
                    }
/* 43 */            if (hk1Var == hk1Var4) {
/* 45 */                m476n();
                    }
/* 48 */            if (hk1Var == hk1Var2) {
/* 50 */                m477o();
                    }
                }

                public void setTransition(int i) {
                    float f;
/* 3 */             if (this.f908g0 != null) {
/* 5 */                 kk1 kk1VarM479q = m479q(i);
/* 11 */                this.f916k0 = kk1VarM479q.f12842d;
/* 15 */                this.f920m0 = kk1VarM479q.f12841c;
/* 21 */                if (!super.isAttachedToWindow()) {
/* 25 */                    if (this.f911h1 == null) {
/* 32 */                        this.f911h1 = new fk1(this);
                            }
/* 34 */                    fk1 fk1Var = this.f911h1;
/* 38 */                    fk1Var.f8250c = this.f916k0;
/* 42 */                    fk1Var.f8251d = this.f920m0;
/* 44 */                    return;
                        }
/* 45 */                int i2 = this.f918l0;
/* 52 */                if (i2 == this.f916k0) {
/* 54 */                    f = 0.0f;
                        } else {
/* 62 */                    f = i2 == this.f920m0 ? 1.0f : Float.NaN;
                        }
/* 64 */                lk1 lk1Var = this.f908g0;
/* 66 */                lk1Var.f13343c = kk1VarM479q;
/* 68 */                mq2 mq2Var = kk1VarM479q.f12850l;
/* 70 */                if (mq2Var != null) {
/* 74 */                    mq2Var.m6788c(lk1Var.f13356p);
                        }
/* 95 */                this.f921m1.m3483e(this.f908g0.m6467b(this.f916k0), this.f908g0.m6467b(this.f920m0));
/* 98 */                m484v();
/* 105 */               if (this.f934u0 != f) {
/* 109 */                   if (f == 0.0f) {
/* 111 */                       m474l();
/* 122 */                       this.f908g0.m6467b(this.f916k0).m537b(this);
                            } else if (f == 1.0f) {
/* 130 */                       m474l();
/* 141 */                       this.f908g0.m6467b(this.f920m0).m537b(this);
                            }
                        }
/* 153 */               this.f934u0 = Float.isNaN(f) ? 0.0f : f;
/* 159 */               if (!Float.isNaN(f)) {
/* 168 */                   setProgress(f);
                        } else {
/* 161 */                   de3.m3038t();
/* 164 */                   m473k(0.0f);
                        }
                    }
                }

                public void setTransitionDuration(int i) {
/* 1 */             lk1 lk1Var = this.f908g0;
/* 3 */             if (lk1Var == null) {
/* 9 */                 AbstractC1245n0.m4876d("MotionLayout", "MotionScene not defined");
/* 12 */                return;
                    }
/* 13 */            kk1 kk1Var = lk1Var.f13343c;
/* 15 */            if (kk1Var != null) {
/* 23 */                kk1Var.f12846h = Math.max(i, 8);
                    } else {
/* 26 */                lk1Var.f13350j = i;
                    }
                }

                public void setTransitionListener(gk1 gk1Var) {
/* 1 */             this.f939z0 = gk1Var;
                }

                public void setTransitionState(Bundle bundle) {
/* 3 */             if (this.f911h1 == null) {
/* 10 */                this.f911h1 = new fk1(this);
                    }
/* 12 */            fk1 fk1Var = this.f911h1;
/* 14 */            fk1Var.getClass();
/* 23 */            fk1Var.f8248a = bundle.getFloat("motion.progress");
/* 31 */            fk1Var.f8249b = bundle.getFloat("motion.velocity");
/* 39 */            fk1Var.f8250c = bundle.getInt("motion.StartState");
/* 47 */            fk1Var.f8251d = bundle.getInt("motion.EndState");
/* 53 */            if (super.isAttachedToWindow()) {
/* 57 */                this.f911h1.m3770a();
                    }
                }

                /* JADX INFO: renamed from: t */
                public final void m482t() {
                    kk1 kk1Var;
                    mq2 mq2Var;
                    View viewFindViewById;
/* 1 */             lk1 lk1Var = this.f908g0;
/* 3 */             if (lk1Var == null) {
/* 299 */               return;
                    }
/* 13 */            if (lk1Var.m6466a(this.f918l0, this)) {
/* 15 */                requestLayout();
/* 18 */                return;
                    }
/* 19 */            int i = this.f918l0;
/* 22 */            if (i != -1) {
/* 24 */                lk1 lk1Var2 = this.f908g0;
/* 26 */                ArrayList<kk1> arrayList = lk1Var2.f13346f;
/* 28 */                ArrayList<kk1> arrayList2 = lk1Var2.f13344d;
/* 38 */                for (kk1 kk1Var2 : arrayList2) {
/* 52 */                    if (kk1Var2.f12851m.size() > 0) {
/* 56 */                        Iterator it = kk1Var2.f12851m.iterator();
/* 64 */                        while (it.hasNext()) {
/* 72 */                            ((jk1) it.next()).m5843b(this);
                                }
                            }
                        }
/* 84 */                for (kk1 kk1Var3 : arrayList) {
/* 98 */                    if (kk1Var3.f12851m.size() > 0) {
/* 102 */                       Iterator it2 = kk1Var3.f12851m.iterator();
/* 110 */                       while (it2.hasNext()) {
/* 118 */                           ((jk1) it2.next()).m5843b(this);
                                }
                            }
                        }
/* 130 */               for (kk1 kk1Var4 : arrayList2) {
/* 144 */                   if (kk1Var4.f12851m.size() > 0) {
/* 148 */                       Iterator it3 = kk1Var4.f12851m.iterator();
/* 156 */                       while (it3.hasNext()) {
/* 164 */                           ((jk1) it3.next()).m5842a(this, i, kk1Var4);
                                }
                            }
                        }
/* 176 */               for (kk1 kk1Var5 : arrayList) {
/* 190 */                   if (kk1Var5.f12851m.size() > 0) {
/* 194 */                       Iterator it4 = kk1Var5.f12851m.iterator();
/* 202 */                       while (it4.hasNext()) {
/* 210 */                           ((jk1) it4.next()).m5842a(this, i, kk1Var5);
                                }
                            }
                        }
                    }
/* 220 */           if (!this.f908g0.m6480o() || (kk1Var = this.f908g0.f13343c) == null || (mq2Var = kk1Var.f12850l) == null) {
/* 299 */               return;
                    }
/* 232 */           MotionLayout motionLayout = mq2Var.f13968r;
/* 234 */           int i2 = mq2Var.f13954d;
/* 236 */           if (i2 != -1) {
/* 238 */               viewFindViewById = motionLayout.findViewById(i2);
/* 242 */               if (viewFindViewById == null) {
/* 270 */                   AbstractC1245n0.m4876d("TouchResponse", "cannot find TouchAnchorId @id/" + de3.m3039u(motionLayout.getContext(), mq2Var.f13954d));
                        }
                    } else {
/* 274 */               viewFindViewById = null;
                    }
/* 277 */           if (viewFindViewById instanceof NestedScrollView) {
/* 279 */               NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
/* 287 */               nestedScrollView.setOnTouchListener(new ViewOnTouchListenerC2145ri(1));
/* 296 */               nestedScrollView.setOnScrollChangeListener(new q62(5));
                    }
                }

                @Override // android.view.View
                public final String toString() {
/* 1 */             Context context = getContext();
/* 53 */            return de3.m3039u(context, this.f916k0) + "->" + de3.m3039u(context, this.f920m0) + " (pos:" + this.f934u0 + " Dpos/Dt:" + this.f914j0;
                }

                /* JADX INFO: renamed from: u */
                public final void m483u() {
                    CopyOnWriteArrayList copyOnWriteArrayList;
/* 3 */             if (this.f939z0 == null && ((copyOnWriteArrayList = this.f893R0) == null || copyOnWriteArrayList.isEmpty())) {
/* 15 */                return;
                    }
/* 16 */            ArrayList<Integer> arrayList = this.f931r1;
/* 26 */            for (Integer num : arrayList) {
/* 34 */                gk1 gk1Var = this.f939z0;
/* 36 */                if (gk1Var != null) {
/* 42 */                    gk1Var.mo452a(num.intValue());
                        }
/* 45 */                CopyOnWriteArrayList copyOnWriteArrayList2 = this.f893R0;
/* 47 */                if (copyOnWriteArrayList2 != null) {
/* 49 */                    Iterator it = copyOnWriteArrayList2.iterator();
/* 57 */                    while (it.hasNext()) {
/* 69 */                        ((gk1) it.next()).mo452a(num.intValue());
                            }
                        }
                    }
/* 73 */            arrayList.clear();
                }

                /* JADX INFO: renamed from: v */
                public final void m484v() {
/* 3 */             this.f921m1.m3484f();
/* 6 */             invalidate();
                }

                /* JADX INFO: renamed from: w */
                public final void m485w(float f, float f2) {
/* 5 */             if (!super.isAttachedToWindow()) {
/* 9 */                 if (this.f911h1 == null) {
/* 16 */                    this.f911h1 = new fk1(this);
                        }
/* 18 */                fk1 fk1Var = this.f911h1;
/* 20 */                fk1Var.f8248a = f;
/* 22 */                fk1Var.f8249b = f2;
/* 24 */                return;
                    }
/* 25 */            setProgress(f);
/* 30 */            setState(hk1.f9121c);
/* 33 */            this.f914j0 = f2;
/* 40 */            if (f2 != 0.0f) {
/* 45 */                m473k(f2 > 0.0f ? 1.0f : 0.0f);
                    } else {
/* 51 */                if (f == 0.0f || f == 1.0f) {
/* 67 */                    return;
                        }
/* 64 */                m473k(f > 0.5f ? 1.0f : 0.0f);
                    }
                }

                /* JADX INFO: renamed from: x */
                public final void m486x(int i) {
/* 3 */             setState(hk1.f9120b);
/* 6 */             this.f918l0 = i;
/* 9 */             this.f916k0 = -1;
/* 11 */            this.f920m0 = -1;
/* 13 */            C2199sz c2199sz = this.f1054V;
/* 15 */            if (c2199sz == null) {
/* 200 */               lk1 lk1Var = this.f908g0;
/* 202 */               if (lk1Var != null) {
/* 208 */                   lk1Var.m6467b(i).m537b(this);
/* 211 */                   return;
                        }
/* 211 */               return;
                    }
/* 19 */            ConstraintLayout constraintLayout = (ConstraintLayout) c2199sz.f16875c;
/* 23 */            SparseArray sparseArray = (SparseArray) c2199sz.f16876d;
/* 25 */            int i2 = c2199sz.f16873a;
/* 27 */            int i3 = 0;
/* 30 */            if (i2 != i) {
/* 132 */               c2199sz.f16873a = i;
/* 138 */               C2125qz c2125qz = (C2125qz) sparseArray.get(i);
/* 140 */               ArrayList arrayList = c2125qz.f15806b;
                        while (true) {
/* 146 */                   if (i3 >= arrayList.size()) {
/* 164 */                       i3 = -1;
                                break;
                            } else if (((C2162rz) arrayList.get(i3)).m8336a(-1.0f, -1.0f)) {
                                break;
                            } else {
/* 161 */                       i3++;
                            }
                        }
/* 165 */               ArrayList arrayList2 = c2125qz.f15806b;
/* 178 */               C0077d c0077d = i3 == -1 ? c2125qz.f15808d : ((C2162rz) arrayList2.get(i3)).f16356f;
/* 180 */               if (i3 != -1) {
/* 189 */                   int i4 = ((C2162rz) arrayList2.get(i3)).f16355e;
                        }
/* 191 */               if (c0077d == null) {
/* 211 */                   return;
                        }
/* 194 */               c2199sz.f16874b = i3;
/* 196 */               c0077d.m537b(constraintLayout);
/* 199 */               return;
                    }
/* 45 */            C2125qz c2125qz2 = i == -1 ? (C2125qz) sparseArray.valueAt(0) : (C2125qz) sparseArray.get(i2);
/* 47 */            int i5 = c2199sz.f16874b;
/* 49 */            if (i5 == -1 || !((C2162rz) c2125qz2.f15806b.get(i5)).m8336a(-1.0f, -1.0f)) {
/* 67 */                ArrayList arrayList3 = c2125qz2.f15806b;
                        while (true) {
/* 73 */                    if (i3 >= arrayList3.size()) {
/* 91 */                        i3 = -1;
                                break;
                            } else if (((C2162rz) arrayList3.get(i3)).m8336a(-1.0f, -1.0f)) {
                                break;
                            } else {
/* 88 */                        i3++;
                            }
                        }
/* 92 */                ArrayList arrayList4 = c2125qz2.f15806b;
/* 96 */                if (c2199sz.f16874b == i3) {
/* 211 */                   return;
                        }
/* 110 */               C0077d c0077d2 = i3 == -1 ? null : ((C2162rz) arrayList4.get(i3)).f16356f;
/* 112 */               if (i3 != -1) {
/* 121 */                   int i6 = ((C2162rz) arrayList4.get(i3)).f16355e;
                        }
/* 123 */               if (c0077d2 == null) {
/* 211 */                   return;
                        }
/* 126 */               c2199sz.f16874b = i3;
/* 128 */               c0077d2.m537b(constraintLayout);
                    }
                }

                /* JADX INFO: renamed from: y */
                public final void m487y(int i, int i2) {
/* 5 */             if (!super.isAttachedToWindow()) {
/* 9 */                 if (this.f911h1 == null) {
/* 16 */                    this.f911h1 = new fk1(this);
                        }
/* 18 */                fk1 fk1Var = this.f911h1;
/* 20 */                fk1Var.f8250c = i;
/* 22 */                fk1Var.f8251d = i2;
/* 24 */                return;
                    }
/* 25 */            lk1 lk1Var = this.f908g0;
/* 27 */            if (lk1Var != null) {
/* 29 */                this.f916k0 = i;
/* 31 */                this.f920m0 = i2;
/* 33 */                lk1Var.m6479n(i, i2);
/* 50 */                this.f921m1.m3483e(this.f908g0.m6467b(i), this.f908g0.m6467b(i2));
/* 53 */                m484v();
/* 57 */                this.f934u0 = 0.0f;
/* 59 */                m473k(0.0f);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:26:0x006e  */
                /* JADX WARN: Code duplicated, block: B:27:0x0080  */
                /* JADX WARN: Code duplicated, block: B:32:0x0098  */
                /* JADX WARN: Code duplicated, block: B:35:0x00be  */
                /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
                /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
                /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
                /* JADX WARN: Code duplicated, block: B:62:0x0101  */
                /* JADX WARN: Code duplicated, block: B:67:0x010b  */
                /* JADX WARN: Code duplicated, block: B:72:0x0115  */
                /* JADX WARN: Code duplicated, block: B:77:0x011f  */
                /* JADX WARN: Code duplicated, block: B:82:0x0129  */
                /* JADX WARN: Code duplicated, block: B:85:0x012e  */
                /* JADX INFO: renamed from: z */
                public final void m488z(float f, float f2, int i) {
                    lk1 lk1Var;
                    kk1 kk1Var;
                    int i2;
                    float f3;
                    ch2 ch2Var;
                    float f4;
                    float f5;
                    float f6;
                    float f7;
                    int i3;
                    mq2 mq2Var;
                    mq2 mq2Var2;
                    mq2 mq2Var3;
                    mq2 mq2Var4;
                    mq2 mq2Var5;
                    kk1 kk1Var2;
                    mq2 mq2Var6;
                    mq2 mq2Var7;
                    kk1 kk1Var3;
                    float f8;
                    mq2 mq2Var8;
/* 5 */             if (this.f908g0 == null || this.f934u0 == f) {
/* 14 */                return;
                    }
/* 16 */            this.f878C0 = true;
/* 22 */            this.f930r0 = getNanoTime();
/* 33 */            float fM6468c = this.f908g0.m6468c() / 1000.0f;
/* 35 */            this.f932s0 = fM6468c;
/* 37 */            this.f936w0 = f;
/* 39 */            this.f938y0 = true;
/* 41 */            ch2 ch2Var2 = this.f879D0;
/* 43 */            float f9 = 1.0f;
/* 49 */            float f10 = 0.0f;
/* 50 */            if (i == 0 || i == 1 || i == 2) {
/* 191 */               if (i != 1 || i == 7) {
/* 203 */                   f9 = 0.0f;
                        } else if (i != 2 && i != 6) {
/* 201 */                   f9 = f;
                        }
/* 204 */               lk1Var = this.f908g0;
/* 206 */               kk1Var = lk1Var.f13343c;
/* 208 */               if (kk1Var != null || (mq2Var7 = kk1Var.f12850l) == null) {
/* 217 */                   i2 = 0;
                        } else {
/* 214 */                   i2 = mq2Var7.f13950D;
                        }
/* 218 */               f3 = this.f934u0;
/* 221 */               ch2Var = this.f879D0;
/* 223 */               if (i2 == 0) {
/* 225 */                   float fM6472g = lk1Var.m6472g();
/* 231 */                   kk1Var2 = this.f908g0.f13343c;
/* 233 */                   if (kk1Var2 != null && (mq2Var6 = kk1Var2.f12850l) != null) {
/* 239 */                       f10 = mq2Var6.f13969s;
                            }
/* 244 */                   ch2Var.m1654b(f3, f9, f2, fM6468c, fM6472g, f10);
                        } else {
/* 249 */                   if (kk1Var != null || (mq2Var5 = kk1Var.f12850l) == null) {
/* 258 */                       f4 = 0.0f;
                            } else {
/* 255 */                       f4 = mq2Var5.f13976z;
                            }
/* 259 */                   if (kk1Var != null || (mq2Var4 = kk1Var.f12850l) == null) {
/* 268 */                       f5 = 0.0f;
                            } else {
/* 265 */                       f5 = mq2Var4.f13947A;
                            }
/* 269 */                   if (kk1Var != null || (mq2Var3 = kk1Var.f12850l) == null) {
/* 278 */                       f6 = 0.0f;
                            } else {
/* 275 */                       f6 = mq2Var3.f13975y;
                            }
/* 279 */                   if (kk1Var != null || (mq2Var2 = kk1Var.f12850l) == null) {
/* 288 */                       f7 = 0.0f;
                            } else {
/* 285 */                       f7 = mq2Var2.f13948B;
                            }
/* 289 */                   if (kk1Var != null || (mq2Var = kk1Var.f12850l) == null) {
/* 298 */                       i3 = 0;
                            } else {
/* 295 */                       i3 = mq2Var.f13949C;
                            }
/* 301 */                   if (ch2Var.f2926b == null) {
/* 305 */                       cg2 cg2Var = new cg2();
/* 310 */                       cg2Var.f2894a = 0.5d;
/* 312 */                       cg2Var.f2902i = 0;
/* 314 */                       ch2Var.f2926b = cg2Var;
                            }
/* 316 */                   cg2 cg2Var2 = ch2Var.f2926b;
/* 318 */                   ch2Var.f2927c = cg2Var2;
/* 321 */                   cg2Var2.f2896c = f9;
/* 324 */                   cg2Var2.f2894a = f6;
/* 326 */                   cg2Var2.f2898e = f3;
/* 329 */                   cg2Var2.f2895b = f5;
/* 331 */                   cg2Var2.f2900g = f4;
/* 333 */                   cg2Var2.f2901h = f7;
/* 335 */                   cg2Var2.f2902i = i3;
/* 337 */                   cg2Var2.f2897d = 0.0f;
                        }
/* 339 */               int i4 = this.f918l0;
/* 341 */               this.f936w0 = f9;
/* 343 */               this.f918l0 = i4;
/* 345 */               this.f910h0 = ch2Var2;
                    } else {
/* 57 */                ck1 ck1Var = this.f880E0;
/* 59 */                if (i == 4) {
/* 173 */                   float f11 = this.f934u0;
/* 177 */                   float fM6472g2 = this.f908g0.m6472g();
/* 181 */                   ck1Var.f2970a = f2;
/* 183 */                   ck1Var.f2971b = f11;
/* 185 */                   ck1Var.f2972c = fM6472g2;
/* 187 */                   this.f910h0 = ck1Var;
                        } else if (i == 5) {
/* 70 */                    float f12 = this.f934u0;
/* 74 */                    float fM6472g3 = this.f908g0.m6472g();
/* 82 */                    if (f2 > 0.0f) {
/* 84 */                        float f13 = f2 / fM6472g3;
/* 95 */                        if (((f2 * f13) - (((fM6472g3 * f13) * f13) / 2.0f)) + f12 > 1.0f) {
/* 111 */                           float f14 = this.f934u0;
/* 115 */                           float fM6472g4 = this.f908g0.m6472g();
/* 119 */                           ck1Var.f2970a = f2;
/* 121 */                           ck1Var.f2971b = f14;
/* 123 */                           ck1Var.f2972c = fM6472g4;
/* 125 */                           this.f910h0 = ck1Var;
                                } else {
/* 129 */                           float f15 = this.f934u0;
/* 131 */                           float f16 = this.f932s0;
/* 135 */                           float fM6472g5 = this.f908g0.m6472g();
/* 141 */                           kk1Var3 = this.f908g0.f13343c;
/* 143 */                           if (kk1Var3 != null || (mq2Var8 = kk1Var3.f12850l) == null) {
/* 153 */                               f8 = 0.0f;
                                    } else {
/* 149 */                               f8 = mq2Var8.f13969s;
                                    }
/* 158 */                           this.f879D0.m1654b(f15, f, f2, f16, fM6472g5, f8);
/* 161 */                           this.f914j0 = 0.0f;
/* 163 */                           int i5 = this.f918l0;
/* 165 */                           this.f936w0 = f;
/* 167 */                           this.f918l0 = i5;
/* 169 */                           this.f910h0 = ch2Var2;
                                }
                            } else {
/* 99 */                        float f17 = (-f2) / fM6472g3;
/* 109 */                       if ((((fM6472g3 * f17) * f17) / 2.0f) + (f2 * f17) + f12 < 0.0f) {
/* 111 */                           float f18 = this.f934u0;
/* 115 */                           float fM6472g6 = this.f908g0.m6472g();
/* 119 */                           ck1Var.f2970a = f2;
/* 121 */                           ck1Var.f2971b = f18;
/* 123 */                           ck1Var.f2972c = fM6472g6;
/* 125 */                           this.f910h0 = ck1Var;
                                } else {
/* 129 */                           float f19 = this.f934u0;
/* 131 */                           float f110 = this.f932s0;
/* 135 */                           float fM6472g7 = this.f908g0.m6472g();
/* 141 */                           kk1Var3 = this.f908g0.f13343c;
/* 143 */                           if (kk1Var3 != null) {
/* 153 */                               f8 = 0.0f;
                                    } else {
/* 153 */                               f8 = 0.0f;
                                    }
/* 158 */                           this.f879D0.m1654b(f19, f, f2, f110, fM6472g7, f8);
/* 161 */                           this.f914j0 = 0.0f;
/* 163 */                           int i6 = this.f918l0;
/* 165 */                           this.f936w0 = f;
/* 167 */                           this.f918l0 = i6;
/* 169 */                           this.f910h0 = ch2Var2;
                                }
                            }
                        } else if (i == 6 || i == 7) {
/* 191 */                   if (i != 1) {
/* 203 */                       f9 = 0.0f;
                            } else {
/* 203 */                       f9 = 0.0f;
                            }
/* 204 */                   lk1Var = this.f908g0;
/* 206 */                   kk1Var = lk1Var.f13343c;
/* 208 */                   if (kk1Var != null) {
/* 217 */                       i2 = 0;
                            } else {
/* 217 */                       i2 = 0;
                            }
/* 218 */                   f3 = this.f934u0;
/* 221 */                   ch2Var = this.f879D0;
/* 223 */                   if (i2 == 0) {
/* 225 */                       float fM6472g8 = lk1Var.m6472g();
/* 231 */                       kk1Var2 = this.f908g0.f13343c;
/* 233 */                       if (kk1Var2 != null) {
/* 239 */                           f10 = mq2Var6.f13969s;
                                }
/* 244 */                       ch2Var.m1654b(f3, f9, f2, fM6468c, fM6472g8, f10);
                            } else {
/* 249 */                       if (kk1Var != null) {
/* 258 */                           f4 = 0.0f;
                                } else {
/* 258 */                           f4 = 0.0f;
                                }
/* 259 */                       if (kk1Var != null) {
/* 268 */                           f5 = 0.0f;
                                } else {
/* 268 */                           f5 = 0.0f;
                                }
/* 269 */                       if (kk1Var != null) {
/* 278 */                           f6 = 0.0f;
                                } else {
/* 278 */                           f6 = 0.0f;
                                }
/* 279 */                       if (kk1Var != null) {
/* 288 */                           f7 = 0.0f;
                                } else {
/* 288 */                           f7 = 0.0f;
                                }
/* 289 */                       if (kk1Var != null) {
/* 298 */                           i3 = 0;
                                } else {
/* 298 */                           i3 = 0;
                                }
/* 301 */                       if (ch2Var.f2926b == null) {
/* 305 */                           cg2 cg2Var3 = new cg2();
/* 310 */                           cg2Var3.f2894a = 0.5d;
/* 312 */                           cg2Var3.f2902i = 0;
/* 314 */                           ch2Var.f2926b = cg2Var3;
                                }
/* 316 */                       cg2 cg2Var4 = ch2Var.f2926b;
/* 318 */                       ch2Var.f2927c = cg2Var4;
/* 321 */                       cg2Var4.f2896c = f9;
/* 324 */                       cg2Var4.f2894a = f6;
/* 326 */                       cg2Var4.f2898e = f3;
/* 329 */                       cg2Var4.f2895b = f5;
/* 331 */                       cg2Var4.f2900g = f4;
/* 333 */                       cg2Var4.f2901h = f7;
/* 335 */                       cg2Var4.f2902i = i3;
/* 337 */                       cg2Var4.f2897d = 0.0f;
                            }
/* 339 */                   int i7 = this.f918l0;
/* 341 */                   this.f936w0 = f9;
/* 343 */                   this.f918l0 = i7;
/* 345 */                   this.f910h0 = ch2Var2;
                        }
                    }
/* 347 */           this.f937x0 = false;
/* 353 */           this.f930r0 = getNanoTime();
/* 355 */           invalidate();
                }

                @Override // p000.pm1
/* 23 */        public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
                }

/* 151 */       public MotionLayout(Context context, AttributeSet attributeSet, int i) {
/* 152 */           super(context, attributeSet, i);
/* 153 */           this.f912i0 = null;
/* 154 */           this.f914j0 = 0.0f;
/* 155 */           this.f916k0 = -1;
/* 156 */           this.f918l0 = -1;
/* 157 */           this.f920m0 = -1;
/* 158 */           this.f922n0 = 0;
/* 159 */           this.f924o0 = 0;
/* 160 */           this.f926p0 = true;
/* 161 */           this.f928q0 = new HashMap();
/* 162 */           this.f930r0 = 0L;
/* 163 */           this.f932s0 = 1.0f;
/* 164 */           this.f933t0 = 0.0f;
/* 165 */           this.f934u0 = 0.0f;
/* 166 */           this.f936w0 = 0.0f;
/* 167 */           this.f938y0 = false;
/* 168 */           this.f876A0 = 0;
/* 169 */           this.f878C0 = false;
/* 170 */           this.f879D0 = new ch2();
/* 171 */           this.f880E0 = new ck1(this);
/* 172 */           this.f884I0 = false;
/* 173 */           this.f889N0 = false;
/* 174 */           this.f890O0 = null;
/* 175 */           this.f891P0 = null;
/* 176 */           this.f892Q0 = null;
/* 177 */           this.f893R0 = null;
/* 178 */           this.f894S0 = 0;
/* 179 */           this.f895T0 = -1L;
/* 180 */           this.f896U0 = 0.0f;
/* 181 */           this.f897V0 = 0;
/* 182 */           this.f898W0 = 0.0f;
/* 183 */           this.f899X0 = false;
/* 184 */           this.f907f1 = new d31();
/* 185 */           this.f909g1 = false;
/* 186 */           this.f913i1 = null;
/* 187 */           new HashMap();
/* 188 */           this.f915j1 = new Rect();
/* 189 */           this.f917k1 = false;
/* 190 */           this.f919l1 = hk1.f9119a;
/* 191 */           this.f921m1 = new ek1(this);
/* 192 */           this.f923n1 = false;
/* 193 */           this.f925o1 = new RectF();
/* 194 */           this.f927p1 = null;
/* 195 */           this.f929q1 = null;
/* 196 */           this.f931r1 = new ArrayList();
/* 197 */           m481s(attributeSet);
                }

/* 171 */       public void setTransition(kk1 kk1Var) {
                    mq2 mq2Var;
/* 172 */           lk1 lk1Var = this.f908g0;
/* 173 */           lk1Var.f13343c = kk1Var;
                    if (kk1Var != null && (mq2Var = kk1Var.f12850l) != null) {
/* 175 */               mq2Var.m6788c(lk1Var.f13356p);
                    }
/* 176 */           setState(hk1.f9120b);
/* 177 */           int i = this.f918l0;
/* 178 */           kk1 kk1Var2 = this.f908g0.f13343c;
/* 179 */           if (i == (kk1Var2 == null ? -1 : kk1Var2.f12841c)) {
/* 180 */               this.f934u0 = 1.0f;
/* 181 */               this.f933t0 = 1.0f;
/* 182 */               this.f936w0 = 1.0f;
                    } else {
/* 183 */               this.f934u0 = 0.0f;
/* 184 */               this.f933t0 = 0.0f;
/* 185 */               this.f936w0 = 0.0f;
                    }
/* 187 */           this.f935v0 = (kk1Var.f12856r & 1) != 0 ? -1L : getNanoTime();
/* 188 */           int iM6473h = this.f908g0.m6473h();
/* 189 */           lk1 lk1Var2 = this.f908g0;
/* 190 */           kk1 kk1Var3 = lk1Var2.f13343c;
/* 191 */           int i2 = kk1Var3 != null ? kk1Var3.f12841c : -1;
/* 192 */           if (iM6473h == this.f916k0 && i2 == this.f920m0) {
                        return;
                    }
/* 193 */           this.f916k0 = iM6473h;
/* 194 */           this.f920m0 = i2;
/* 195 */           lk1Var2.m6479n(iM6473h, i2);
/* 196 */           C0077d c0077dM6467b = this.f908g0.m6467b(this.f916k0);
                    C0077d c0077dM6467b2 = this.f908g0.m6467b(this.f920m0);
                    ek1 ek1Var = this.f921m1;
                    ek1Var.m3483e(c0077dM6467b, c0077dM6467b2);
/* 197 */           int i3 = this.f916k0;
                    int i4 = this.f920m0;
/* 198 */           ek1Var.f7766e = i3;
/* 199 */           ek1Var.f7767f = i4;
/* 200 */           ek1Var.m3484f();
/* 201 */           m484v();
                }
            }
