            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.SparseArray;
            import android.util.SparseBooleanArray;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.AccelerateDecelerateInterpolator;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.AnimationUtils;
            import android.view.animation.BounceInterpolator;
            import android.view.animation.DecelerateInterpolator;
            import android.view.animation.Interpolator;
            import android.view.animation.OvershootInterpolator;
            import androidx.constraintlayout.motion.widget.MotionHelper;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.Barrier;
            import androidx.constraintlayout.widget.C0076c;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintHelper;
            import androidx.constraintlayout.widget.Constraints;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ek1 {

                /* JADX INFO: renamed from: a */
                public a00 f7762a = new a00();

                /* JADX INFO: renamed from: b */
                public a00 f7763b = new a00();

                /* JADX INFO: renamed from: c */
                public C0077d f7764c = null;

                /* JADX INFO: renamed from: d */
                public C0077d f7765d = null;

                /* JADX INFO: renamed from: e */
                public int f7766e;

                /* JADX INFO: renamed from: f */
                public int f7767f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ MotionLayout f7768g;

                public ek1(MotionLayout motionLayout) {
/* 4 */             this.f7768g = motionLayout;
                }

                /* JADX INFO: renamed from: c */
                public static void m3479c(a00 a00Var, a00 a00Var2) {
                    C2569zz cu0Var;
/* 1 */             ArrayList<C2569zz> arrayList = a00Var.f17u0;
/* 5 */             HashMap map = new HashMap();
/* 8 */             map.put(a00Var, a00Var2);
/* 13 */            a00Var2.f17u0.clear();
/* 16 */            a00Var2.mo1429g(a00Var, map);
/* 27 */            for (C2569zz c2569zz : arrayList) {
/* 37 */                if (c2569zz instanceof C2294vh) {
/* 41 */                    cu0Var = new C2294vh();
                        } else if (c2569zz instanceof bs0) {
/* 51 */                    cu0Var = new bs0();
                        } else if (c2569zz instanceof gk0) {
/* 61 */                    cu0Var = new gk0();
                        } else if (c2569zz instanceof bs1) {
/* 71 */                    cu0Var = new bs1();
                        } else {
/* 87 */                    cu0Var = c2569zz instanceof cu0 ? new cu0() : new C2569zz();
                        }
/* 92 */                a00Var2.f17u0.add(cu0Var);
/* 95 */                C2569zz c2569zz2 = cu0Var.f20416V;
/* 97 */                if (c2569zz2 != null) {
/* 103 */                   ((a00) c2569zz2).f17u0.remove(cu0Var);
/* 106 */                   cu0Var.mo3D();
                        }
/* 109 */               cu0Var.f20416V = a00Var2;
/* 111 */               map.put(c2569zz, cu0Var);
                    }
/* 123 */           for (C2569zz c2569zz3 : arrayList) {
/* 137 */               ((C2569zz) map.get(c2569zz3)).mo1429g(c2569zz3, map);
                    }
                }

                /* JADX INFO: renamed from: d */
                public static C2569zz m3480d(a00 a00Var, View view) {
/* 3 */             if (a00Var.f20436h0 == view) {
/* 5 */                 return a00Var;
                    }
/* 6 */             ArrayList arrayList = a00Var.f17u0;
/* 8 */             int size = arrayList.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 19 */                C2569zz c2569zz = (C2569zz) arrayList.get(i);
/* 23 */                if (c2569zz.f20436h0 == view) {
/* 25 */                    return c2569zz;
                        }
                    }
/* 29 */            return null;
                }

                /* JADX INFO: renamed from: a */
                public final void m3481a() {
                    int i;
                    HashMap map;
                    SparseArray sparseArray;
                    int[] iArr;
                    int i2;
                    Rect rect;
                    Rect rect2;
                    Interpolator interpolatorLoadInterpolator;
/* 3 */             MotionLayout motionLayout = this.f7768g;
/* 5 */             int childCount = motionLayout.getChildCount();
/* 9 */             HashMap map2 = motionLayout.f928q0;
/* 11 */            map2.clear();
/* 16 */            SparseArray sparseArray2 = new SparseArray();
/* 19 */            int[] iArr2 = new int[childCount];
/* 22 */            for (int i3 = 0; i3 < childCount; i3++) {
/* 24 */                View childAt = motionLayout.getChildAt(i3);
/* 30 */                zj1 zj1Var = new zj1(childAt);
/* 33 */                int id = childAt.getId();
/* 37 */                iArr2[i3] = id;
/* 39 */                sparseArray2.put(id, zj1Var);
/* 42 */                map2.put(childAt, zj1Var);
                    }
/* 48 */            int i4 = 0;
/* 49 */            while (i4 < childCount) {
/* 51 */                View childAt2 = motionLayout.getChildAt(i4);
/* 59 */                zj1 zj1Var2 = (zj1) map2.get(childAt2);
/* 61 */                if (zj1Var2 == null) {
/* 63 */                    i = childCount;
/* 65 */                    map = map2;
/* 67 */                    sparseArray = sparseArray2;
/* 69 */                    iArr = iArr2;
/* 71 */                    i2 = i4;
                        } else {
/* 76 */                    Rect rect3 = zj1Var2.f20176a;
/* 78 */                    ik1 ik1Var = zj1Var2.f20181f;
/* 90 */                    if (this.f7764c != null) {
/* 94 */                        C2569zz c2569zzM3480d = m3480d(this.f7762a, childAt2);
/* 98 */                        if (c2569zzM3480d != null) {
/* 100 */                           Rect rectM469j = MotionLayout.m469j(motionLayout, c2569zzM3480d);
/* 104 */                           map = map2;
/* 106 */                           C0077d c0077d = this.f7764c;
/* 108 */                           iArr = iArr2;
/* 110 */                           int width = motionLayout.getWidth();
/* 114 */                           i2 = i4;
/* 116 */                           int height = motionLayout.getHeight();
/* 120 */                           sparseArray = sparseArray2;
/* 122 */                           int i5 = c0077d.f1189c;
/* 124 */                           if (i5 != 0) {
/* 126 */                               zj1.m10357g(rectM469j, rect3, i5, width, height);
                                    }
/* 130 */                           ik1Var.f9688c = 0.0f;
/* 132 */                           ik1Var.f9689d = 0.0f;
/* 134 */                           zj1Var2.m10363f(ik1Var);
/* 143 */                           i = childCount;
/* 150 */                           rect = rect3;
/* 157 */                           ik1Var.m4574d(rectM469j.left, rectM469j.top, rectM469j.width(), rectM469j.height());
/* 162 */                           C0076c c0076cM540h = c0077d.m540h(zj1Var2.f20178c);
/* 166 */                           ik1Var.m4572a(c0076cM540h);
/* 169 */                           C2312vz c2312vz = c0076cM540h.f1179d;
/* 173 */                           zj1Var2.f20187l = c2312vz.f18395g;
/* 179 */                           zj1Var2.f20183h.m9974c(rectM469j, c0077d, i5, zj1Var2.f20178c);
/* 186 */                           zj1Var2.f20170B = c0076cM540h.f1181f.f19414i;
/* 190 */                           zj1Var2.f20172D = c2312vz.f18398j;
/* 194 */                           zj1Var2.f20173E = c2312vz.f18397i;
/* 198 */                           Context context = zj1Var2.f20177b.getContext();
/* 202 */                           int i6 = c2312vz.f18400l;
/* 204 */                           String str = c2312vz.f18399k;
/* 206 */                           int i7 = c2312vz.f18401m;
/* 209 */                           if (i6 == -2) {
/* 274 */                               interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                                    } else if (i6 == -1) {
/* 268 */                               interpolatorLoadInterpolator = new yj1(C2131r4.m8062c(str), 0);
                                    } else if (i6 == 0) {
/* 257 */                               interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                                    } else if (i6 == 1) {
/* 251 */                               interpolatorLoadInterpolator = new AccelerateInterpolator();
                                    } else if (i6 == 2) {
/* 245 */                               interpolatorLoadInterpolator = new DecelerateInterpolator();
                                    } else if (i6 != 4) {
/* 233 */                               interpolatorLoadInterpolator = i6 != 5 ? null : new OvershootInterpolator();
                                    } else {
/* 239 */                               interpolatorLoadInterpolator = new BounceInterpolator();
                                    }
/* 278 */                           zj1Var2.f20174F = interpolatorLoadInterpolator;
                                } else {
/* 281 */                           i = childCount;
/* 283 */                           map = map2;
/* 285 */                           sparseArray = sparseArray2;
/* 287 */                           iArr = iArr2;
/* 289 */                           i2 = i4;
/* 291 */                           rect = rect3;
/* 296 */                           if (motionLayout.f876A0 != 0) {
/* 341 */                               AbstractC1245n0.m4876d("MotionLayout", de3.m3038t() + "no widget for  " + de3.m3040v(childAt2) + " (" + childAt2.getClass().getName() + ")");
                                    }
                                }
                            } else {
/* 345 */                       i = childCount;
/* 347 */                       map = map2;
/* 349 */                       sparseArray = sparseArray2;
/* 351 */                       iArr = iArr2;
/* 353 */                       i2 = i4;
/* 355 */                       rect = rect3;
                            }
/* 360 */                   if (this.f7765d != null) {
/* 364 */                       C2569zz c2569zzM3480d2 = m3480d(this.f7763b, childAt2);
/* 368 */                       if (c2569zzM3480d2 != null) {
/* 370 */                           Rect rectM469j2 = MotionLayout.m469j(motionLayout, c2569zzM3480d2);
/* 374 */                           C0077d c0077d2 = this.f7765d;
/* 376 */                           int width2 = motionLayout.getWidth();
/* 380 */                           int height2 = motionLayout.getHeight();
/* 384 */                           ik1 ik1Var2 = zj1Var2.f20182g;
/* 386 */                           int i8 = c0077d2.f1189c;
/* 388 */                           if (i8 != 0) {
/* 390 */                               Rect rect4 = rect;
/* 392 */                               zj1.m10357g(rectM469j2, rect4, i8, width2, height2);
/* 395 */                               rect2 = rect4;
                                    } else {
/* 397 */                               rect2 = rectM469j2;
                                    }
/* 400 */                           ik1Var2.f9688c = 1.0f;
/* 402 */                           ik1Var2.f9689d = 1.0f;
/* 404 */                           zj1Var2.m10363f(ik1Var2);
/* 423 */                           ik1Var2.m4574d(rect2.left, rect2.top, rect2.width(), rect2.height());
/* 432 */                           ik1Var2.m4572a(c0077d2.m540h(zj1Var2.f20178c));
/* 439 */                           zj1Var2.f20184i.m9974c(rect2, c0077d2, i8, zj1Var2.f20178c);
                                } else if (motionLayout.f876A0 != 0) {
/* 490 */                           AbstractC1245n0.m4876d("MotionLayout", de3.m3038t() + "no widget for  " + de3.m3040v(childAt2) + " (" + childAt2.getClass().getName() + ")");
                                }
                            }
                        }
/* 493 */               i4 = i2 + 1;
/* 495 */               map2 = map;
/* 497 */               iArr2 = iArr;
/* 499 */               sparseArray2 = sparseArray;
/* 501 */               childCount = i;
                    }
/* 505 */           SparseArray sparseArray3 = sparseArray2;
/* 507 */           int[] iArr3 = iArr2;
/* 510 */           int i9 = childCount;
/* 511 */           int i10 = 0;
/* 512 */           while (i10 < i9) {
/* 516 */               SparseArray sparseArray4 = sparseArray3;
/* 522 */               zj1 zj1Var3 = (zj1) sparseArray4.get(iArr3[i10]);
/* 526 */               int i11 = zj1Var3.f20181f.f9679V;
/* 529 */               if (i11 != -1) {
/* 535 */                   zj1 zj1Var4 = (zj1) sparseArray4.get(i11);
/* 541 */                   zj1Var3.f20181f.m4575f(zj1Var4, zj1Var4.f20181f);
/* 548 */                   zj1Var3.f20182g.m4575f(zj1Var4, zj1Var4.f20182g);
                        }
/* 551 */               i10++;
/* 553 */               sparseArray3 = sparseArray4;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m3482b(int i, int i2) {
/* 1 */             MotionLayout motionLayout = this.f7768g;
/* 3 */             int optimizationLevel = motionLayout.getOptimizationLevel();
/* 13 */            if (motionLayout.f918l0 == motionLayout.getStartState()) {
/* 15 */                a00 a00Var = this.f7763b;
/* 17 */                C0077d c0077d = this.f7765d;
/* 39 */                motionLayout.m518h(a00Var, optimizationLevel, (c0077d == null || c0077d.f1189c == 0) ? i : i2, (c0077d == null || c0077d.f1189c == 0) ? i2 : i);
/* 42 */                C0077d c0077d2 = this.f7764c;
/* 44 */                if (c0077d2 != null) {
/* 46 */                    a00 a00Var2 = this.f7762a;
/* 48 */                    int i3 = c0077d2.f1189c;
/* 54 */                    int i4 = i3 == 0 ? i : i2;
/* 55 */                    if (i3 == 0) {
/* 57 */                        i = i2;
                            }
/* 58 */                    motionLayout.m518h(a00Var2, optimizationLevel, i4, i);
/* 61 */                    return;
                        }
/* 61 */                return;
                    }
/* 62 */            C0077d c0077d3 = this.f7764c;
/* 64 */            if (c0077d3 != null) {
/* 66 */                a00 a00Var3 = this.f7762a;
/* 68 */                int i5 = c0077d3.f1189c;
/* 80 */                motionLayout.m518h(a00Var3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
                    }
/* 83 */            a00 a00Var4 = this.f7763b;
/* 85 */            C0077d c0077d4 = this.f7765d;
/* 96 */            int i6 = (c0077d4 == null || c0077d4.f1189c == 0) ? i : i2;
/* 97 */            if (c0077d4 == null || c0077d4.f1189c == 0) {
/* 103 */               i = i2;
                    }
/* 104 */           motionLayout.m518h(a00Var4, optimizationLevel, i6, i);
                }

                /* JADX INFO: renamed from: e */
                public final void m3483e(C0077d c0077d, C0077d c0077d2) {
/* 1 */             this.f7764c = c0077d;
/* 3 */             this.f7765d = c0077d2;
/* 10 */            this.f7762a = new a00();
/* 14 */            a00 a00Var = new a00();
/* 17 */            this.f7763b = a00Var;
/* 19 */            a00 a00Var2 = this.f7762a;
/* 21 */            boolean z = MotionLayout.f875s1;
/* 23 */            MotionLayout motionLayout = this.f7768g;
/* 25 */            a00 a00Var3 = motionLayout.f1060c;
/* 27 */            InterfaceC2462xi interfaceC2462xi = a00Var3.f21y0;
/* 29 */            a00Var2.f21y0 = interfaceC2462xi;
/* 33 */            a00Var2.f19w0.f17390f = interfaceC2462xi;
/* 35 */            InterfaceC2462xi interfaceC2462xi2 = a00Var3.f21y0;
/* 37 */            a00Var.f21y0 = interfaceC2462xi2;
/* 41 */            a00Var.f19w0.f17390f = interfaceC2462xi2;
/* 45 */            a00Var2.f17u0.clear();
/* 52 */            this.f7763b.f17u0.clear();
/* 57 */            m3479c(a00Var3, this.f7762a);
/* 62 */            m3479c(a00Var3, this.f7763b);
/* 72 */            if (motionLayout.f934u0 > 0.5d) {
/* 74 */                if (c0077d != null) {
/* 78 */                    m3485g(this.f7762a, c0077d);
                        }
/* 83 */                m3485g(this.f7763b, c0077d2);
                    } else {
/* 89 */                m3485g(this.f7763b, c0077d2);
/* 92 */                if (c0077d != null) {
/* 96 */                    m3485g(this.f7762a, c0077d);
                        }
                    }
/* 105 */           this.f7762a.f22z0 = motionLayout.m516e();
/* 107 */           a00 a00Var4 = this.f7762a;
/* 111 */           a00Var4.f18v0.m3377P(a00Var4);
/* 120 */           this.f7763b.f22z0 = motionLayout.m516e();
/* 122 */           a00 a00Var5 = this.f7763b;
/* 126 */           a00Var5.f18v0.m3377P(a00Var5);
/* 129 */           ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
/* 133 */           if (layoutParams != null) {
/* 135 */               int i = layoutParams.width;
/* 137 */               EnumC2516yz enumC2516yz = EnumC2516yz.f19866b;
/* 140 */               if (i == -2) {
/* 144 */                   this.f7762a.m10462N(enumC2516yz);
/* 149 */                   this.f7763b.m10462N(enumC2516yz);
                        }
/* 154 */               if (layoutParams.height == -2) {
/* 158 */                   this.f7762a.m10463O(enumC2516yz);
/* 163 */                   this.f7763b.m10463O(enumC2516yz);
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m3484f() {
/* 1 */             MotionLayout motionLayout = this.f7768g;
/* 3 */             int i = motionLayout.f922n0;
/* 5 */             int i2 = motionLayout.f924o0;
/* 7 */             int mode = View.MeasureSpec.getMode(i);
/* 11 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 15 */            motionLayout.f904c1 = mode;
/* 17 */            motionLayout.f905d1 = mode2;
/* 19 */            motionLayout.getOptimizationLevel();
/* 22 */            m3482b(i, i2);
/* 32 */            int i3 = 0;
/* 33 */            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
/* 42 */                m3482b(i, i2);
/* 51 */                motionLayout.f900Y0 = this.f7762a.m10475r();
/* 59 */                motionLayout.f901Z0 = this.f7762a.m10472l();
/* 67 */                motionLayout.f902a1 = this.f7763b.m10475r();
/* 71 */                int iM10472l = this.f7763b.m10472l();
/* 75 */                motionLayout.f903b1 = iM10472l;
/* 91 */                motionLayout.f899X0 = (motionLayout.f900Y0 == motionLayout.f902a1 && motionLayout.f901Z0 == iM10472l) ? false : true;
                    }
/* 93 */            int i4 = motionLayout.f900Y0;
/* 95 */            int i5 = motionLayout.f901Z0;
/* 97 */            int i6 = motionLayout.f904c1;
/* 101 */           if (i6 == Integer.MIN_VALUE || i6 == 0) {
/* 114 */               i4 = (int) ((motionLayout.f906e1 * (motionLayout.f902a1 - i4)) + i4);
                    }
/* 115 */           int i7 = motionLayout.f905d1;
/* 117 */           if (i7 == Integer.MIN_VALUE || i7 == 0) {
/* 130 */               i5 = (int) ((motionLayout.f906e1 * (motionLayout.f903b1 - i5)) + i5);
                    }
/* 131 */           a00 a00Var = this.f7762a;
/* 163 */           motionLayout.m517g(i, i2, i4, i5, a00Var.f9I0 || this.f7763b.f9I0, a00Var.f10J0 || this.f7763b.f10J0);
/* 166 */           HashMap map = motionLayout.f928q0;
/* 168 */           int childCount = motionLayout.getChildCount();
/* 174 */           motionLayout.f921m1.m3481a();
/* 177 */           motionLayout.f938y0 = true;
/* 181 */           SparseArray sparseArray = new SparseArray();
/* 185 */           for (int i8 = 0; i8 < childCount; i8++) {
/* 187 */               View childAt = motionLayout.getChildAt(i8);
/* 201 */               sparseArray.put(childAt.getId(), (zj1) map.get(childAt));
                    }
/* 207 */           int width = motionLayout.getWidth();
/* 211 */           int height = motionLayout.getHeight();
/* 217 */           kk1 kk1Var = motionLayout.f908g0.f13343c;
/* 225 */           int i9 = kk1Var != null ? kk1Var.f12854p : -1;
/* 226 */           if (i9 != -1) {
/* 229 */               for (int i10 = 0; i10 < childCount; i10++) {
/* 239 */                   zj1 zj1Var = (zj1) map.get(motionLayout.getChildAt(i10));
/* 241 */                   if (zj1Var != null) {
/* 243 */                       zj1Var.f20169A = i9;
                            }
                        }
                    }
/* 250 */           SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
/* 257 */           int[] iArr = new int[map.size()];
/* 260 */           int i11 = 0;
/* 261 */           for (int i12 = 0; i12 < childCount; i12++) {
/* 271 */               zj1 zj1Var2 = (zj1) map.get(motionLayout.getChildAt(i12));
/* 275 */               int i13 = zj1Var2.f20181f.f9679V;
/* 277 */               if (i13 != -1) {
/* 279 */                   sparseBooleanArray.put(i13, true);
/* 288 */                   iArr[i11] = zj1Var2.f20181f.f9679V;
/* 282 */                   i11++;
                        }
                    }
/* 296 */           if (motionLayout.f892Q0 != null) {
/* 299 */               for (int i14 = 0; i14 < i11; i14++) {
/* 311 */                   zj1 zj1Var3 = (zj1) map.get(motionLayout.findViewById(iArr[i14]));
/* 313 */                   if (zj1Var3 != null) {
/* 318 */                       motionLayout.f908g0.m6471f(zj1Var3);
                            }
                        }
/* 326 */               Iterator it = motionLayout.f892Q0.iterator();
/* 334 */               while (it.hasNext()) {
/* 342 */                   ((MotionHelper) it.next()).mo466r(motionLayout, map);
                        }
/* 347 */               for (int i15 = 0; i15 < i11; i15++) {
/* 359 */                   zj1 zj1Var4 = (zj1) map.get(motionLayout.findViewById(iArr[i15]));
/* 361 */                   if (zj1Var4 != null) {
/* 368 */                       zj1Var4.m10364h(motionLayout.getNanoTime(), width, height);
                            }
                        }
                    } else {
/* 375 */               for (int i16 = 0; i16 < i11; i16++) {
/* 387 */                   zj1 zj1Var5 = (zj1) map.get(motionLayout.findViewById(iArr[i16]));
/* 389 */                   if (zj1Var5 != null) {
/* 394 */                       motionLayout.f908g0.m6471f(zj1Var5);
/* 401 */                       zj1Var5.m10364h(motionLayout.getNanoTime(), width, height);
                            }
                        }
                    }
/* 408 */           for (int i17 = 0; i17 < childCount; i17++) {
/* 410 */               View childAt2 = motionLayout.getChildAt(i17);
/* 418 */               zj1 zj1Var6 = (zj1) map.get(childAt2);
/* 428 */               if (!sparseBooleanArray.get(childAt2.getId()) && zj1Var6 != null) {
/* 435 */                   motionLayout.f908g0.m6471f(zj1Var6);
/* 442 */                   zj1Var6.m10364h(motionLayout.getNanoTime(), width, height);
                        }
                    }
/* 450 */           kk1 kk1Var2 = motionLayout.f908g0.f13343c;
/* 458 */           float f = kk1Var2 != null ? kk1Var2.f12847i : 0.0f;
/* 461 */           if (f != 0.0f) {
/* 468 */               boolean z = ((double) f) < 0.0d;
/* 472 */               float fAbs = Math.abs(f);
/* 476 */               float fMax = -3.4028235E38f;
/* 479 */               float fMin = Float.MAX_VALUE;
/* 482 */               float fMax2 = -3.4028235E38f;
/* 483 */               float fMin2 = Float.MAX_VALUE;
/* 487 */               for (int i18 = 0; i18 < childCount; i18++) {
/* 497 */                   zj1 zj1Var7 = (zj1) map.get(motionLayout.getChildAt(i18));
/* 505 */                   if (!Float.isNaN(zj1Var7.f20187l)) {
/* 508 */                       for (int i19 = 0; i19 < childCount; i19++) {
/* 518 */                           zj1 zj1Var8 = (zj1) map.get(motionLayout.getChildAt(i19));
/* 526 */                           if (!Float.isNaN(zj1Var8.f20187l)) {
/* 530 */                               fMin = Math.min(fMin, zj1Var8.f20187l);
/* 536 */                               fMax = Math.max(fMax, zj1Var8.f20187l);
                                    }
                                }
/* 543 */                       while (i3 < childCount) {
/* 553 */                           zj1 zj1Var9 = (zj1) map.get(motionLayout.getChildAt(i3));
/* 561 */                           if (!Float.isNaN(zj1Var9.f20187l)) {
/* 567 */                               zj1Var9.f20189n = 1.0f / (1.0f - fAbs);
/* 569 */                               float f2 = zj1Var9.f20187l;
/* 571 */                               if (z) {
/* 581 */                                   zj1Var9.f20188m = fAbs - (((fMax - f2) / (fMax - fMin)) * fAbs);
                                        } else {
/* 591 */                                   zj1Var9.f20188m = fAbs - (((f2 - fMin) * fAbs) / (fMax - fMin));
                                        }
                                    }
/* 593 */                           i3++;
                                }
/* 660 */                       return;
                            }
/* 596 */                   ik1 ik1Var = zj1Var7.f20182g;
/* 598 */                   float f3 = ik1Var.f9690e;
/* 600 */                   float f4 = ik1Var.f9691f;
/* 606 */                   float f5 = z ? f4 - f3 : f4 + f3;
/* 607 */                   fMin2 = Math.min(fMin2, f5);
/* 611 */                   fMax2 = Math.max(fMax2, f5);
                        }
/* 619 */               while (i3 < childCount) {
/* 629 */                   zj1 zj1Var10 = (zj1) map.get(motionLayout.getChildAt(i3));
/* 631 */                   ik1 ik1Var2 = zj1Var10.f20182g;
/* 633 */                   float f6 = ik1Var2.f9690e;
/* 635 */                   float f7 = ik1Var2.f9691f;
/* 641 */                   float f8 = z ? f7 - f6 : f7 + f6;
/* 646 */                   zj1Var10.f20189n = 1.0f / (1.0f - fAbs);
/* 655 */                   zj1Var10.f20188m = fAbs - (((f8 - fMin2) * fAbs) / (fMax2 - fMin2));
/* 657 */                   i3++;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m3485g(a00 a00Var, C0077d c0077d) {
                    C0076c c0076c;
                    C0076c c0076c2;
/* 3 */             SparseArray sparseArray = new SparseArray();
/* 8 */             Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
/* 11 */            sparseArray.clear();
/* 15 */            sparseArray.put(0, a00Var);
/* 18 */            MotionLayout motionLayout = this.f7768g;
/* 24 */            sparseArray.put(motionLayout.getId(), a00Var);
/* 27 */            if (c0077d != null && c0077d.f1189c != 0) {
/* 33 */                a00 a00Var2 = this.f7763b;
/* 35 */                int optimizationLevel = motionLayout.getOptimizationLevel();
/* 45 */                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
/* 53 */                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
/* 57 */                boolean z = MotionLayout.f875s1;
/* 59 */                motionLayout.m518h(a00Var2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
/* 73 */            for (C2569zz c2569zz : a00Var.f17u0) {
/* 81 */                c2569zz.f20440j0 = true;
/* 89 */                sparseArray.put(c2569zz.f20436h0.getId(), c2569zz);
                    }
/* 103 */           for (C2569zz c2569zz2 : a00Var.f17u0) {
/* 112 */               View view = c2569zz2.f20436h0;
/* 114 */               int id = view.getId();
/* 118 */               HashMap map = c0077d.f1192f;
/* 128 */               if (map.containsKey(Integer.valueOf(id)) && (c0076c2 = (C0076c) map.get(Integer.valueOf(id))) != null) {
/* 142 */                   c0076c2.m525a(layoutParams);
                        }
/* 157 */               c2569zz2.m10464P(c0077d.m540h(view.getId()).f1180e.f17775c);
/* 172 */               c2569zz2.m10461M(c0077d.m540h(view.getId()).f1180e.f17777d);
/* 177 */               if (view instanceof ConstraintHelper) {
/* 180 */                   ConstraintHelper constraintHelper = (ConstraintHelper) view;
/* 182 */                   int id2 = constraintHelper.getId();
/* 186 */                   HashMap map2 = c0077d.f1192f;
/* 196 */                   if (map2.containsKey(Integer.valueOf(id2)) && (c0076c = (C0076c) map2.get(Integer.valueOf(id2))) != null && (c2569zz2 instanceof cu0)) {
/* 217 */                       constraintHelper.mo457l(c0076c, (cu0) c2569zz2, layoutParams, sparseArray);
                            }
/* 222 */                   if (view instanceof Barrier) {
/* 227 */                       ((Barrier) view).m511q();
                            }
                        }
/* 234 */               layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
/* 237 */               boolean z2 = MotionLayout.f875s1;
/* 240 */               motionLayout.m512a(false, view, c2569zz2, layoutParams, sparseArray);
/* 255 */               if (c0077d.m540h(view.getId()).f1178c.f18872c == 1) {
/* 261 */                   c2569zz2.f20438i0 = view.getVisibility();
                        } else {
/* 277 */                   c2569zz2.f20438i0 = c0077d.m540h(view.getId()).f1178c.f18871b;
                        }
                    }
/* 291 */           for (C2569zz c2569zz3 : a00Var.f17u0) {
/* 301 */               if (c2569zz3 instanceof y53) {
/* 305 */                   ConstraintHelper constraintHelper2 = (ConstraintHelper) c2569zz3.f20436h0;
/* 307 */                   cu0 cu0Var = (cu0) c2569zz3;
/* 309 */                   constraintHelper2.mo468p(cu0Var, sparseArray);
/* 312 */                   y53 y53Var = (y53) cu0Var;
/* 317 */                   for (int i = 0; i < y53Var.f6907v0; i++) {
/* 321 */                       C2569zz c2569zz4 = y53Var.f6906u0[i];
/* 323 */                       if (c2569zz4 != null) {
/* 325 */                           c2569zz4.f20401G = true;
                                }
                            }
                        }
                    }
                }
            }
