            package com.google.android.material.transformation;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.util.Pair;
            import android.util.Property;
            import android.view.View;
            import android.view.ViewAnimationUtils;
            import android.view.ViewGroup;
            import android.widget.ImageView;
            import androidx.coordinatorlayout.widget.C0080c;
            import com.google.android.material.R$id;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import p000.AbstractC2246u8;
            import p000.C0856du;
            import p000.C2184sk;
            import p000.C2307vu;
            import p000.C2493yc;
            import p000.C2511yu;
            import p000.C2564zu;
            import p000.InterfaceC0157av;
            import p000.e33;
            import p000.f42;
            import p000.le2;
            import p000.mk1;
            import p000.nk1;
            import p000.pg0;
            import p000.pg3;
            import p000.py0;
            import p000.qg0;
            import p000.r90;
            import p000.s23;
            import p000.w11;
            import p000.wc0;
            import p000.zb0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 29 */    public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

                /* JADX INFO: renamed from: c */
                public final Rect f5132c;

                /* JADX INFO: renamed from: d */
                public final RectF f5133d;

                /* JADX INFO: renamed from: e */
                public final RectF f5134e;

                /* JADX INFO: renamed from: f */
                public final int[] f5135f;

                /* JADX INFO: renamed from: g */
                public float f5136g;

                /* JADX INFO: renamed from: h */
                public float f5137h;

                public FabTransformationBehavior() {
/* 9 */             this.f5132c = new Rect();
/* 16 */            this.f5133d = new RectF();
/* 23 */            this.f5134e = new RectF();
/* 28 */            this.f5135f = new int[2];
                }

                /* JADX INFO: renamed from: u */
                public static Pair m2433u(float f, float f2, boolean z, wc0 wc0Var) {
                    nk1 nk1VarM6672f;
                    nk1 nk1VarM6672f2;
/* 4 */             if (f == 0.0f || f2 == 0.0f) {
/* 69 */                nk1VarM6672f = ((mk1) wc0Var.f18577b).m6672f("translationXLinear");
/* 79 */                nk1VarM6672f2 = ((mk1) wc0Var.f18577b).m6672f("translationYLinear");
                    } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
/* 48 */                nk1VarM6672f = ((mk1) wc0Var.f18577b).m6672f("translationXCurveDownwards");
/* 58 */                nk1VarM6672f2 = ((mk1) wc0Var.f18577b).m6672f("translationYCurveDownwards");
                    } else {
/* 27 */                nk1VarM6672f = ((mk1) wc0Var.f18577b).m6672f("translationXCurveUpwards");
/* 37 */                nk1VarM6672f2 = ((mk1) wc0Var.f18577b).m6672f("translationYCurveUpwards");
                    }
/* 85 */            return new Pair(nk1VarM6672f, nk1VarM6672f2);
                }

                /* JADX INFO: renamed from: x */
                public static float m2434x(wc0 wc0Var, nk1 nk1Var, float f) {
/* 1 */             long j = nk1Var.f14332a;
/* 3 */             long j2 = nk1Var.f14333b;
/* 11 */            nk1 nk1VarM6672f = ((mk1) wc0Var.f18577b).m6672f("expansion");
/* 36 */            return AbstractC2246u8.m8970a(f, 0.0f, nk1Var.m6996b().getInterpolation((((nk1VarM6672f.f14332a + nk1VarM6672f.f14333b) + 17) - j) / j2));
                }

                @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: b */
                public final boolean mo564b(View view, View view2) {
                    int expandedComponentIdHint;
/* 8 */             if (view.getVisibility() != 8) {
                        return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
                    }
/* 33 */            f42.m3656l("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
/* 7 */             return false;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: c */
                public final void mo565c(C0080c c0080c) {
/* 3 */             if (c0080c.f1225h == 0) {
/* 7 */                 c0080c.f1225h = 80;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:30:0x0152  */
                /* JADX WARN: Code duplicated, block: B:97:0x0359  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
                /* JADX INFO: renamed from: t */
                public final AnimatorSet mo2432t(View view, View view2, boolean z, boolean z2) {
                    ObjectAnimator objectAnimatorOfFloat;
                    float f;
                    ObjectAnimator objectAnimatorOfFloat2;
                    ObjectAnimator objectAnimatorOfFloat3;
                    ArrayList arrayList;
                    AnimatorSet animatorSetM7592O;
                    int i;
                    ObjectAnimator objectAnimatorOfFloat4;
                    ObjectAnimator objectAnimatorOfInt;
                    ObjectAnimator objectAnimatorOfInt2;
/* 13 */            wc0 wc0VarMo2438z = mo2438z(view2.getContext(), z);
/* 17 */            if (z) {
/* 23 */                this.f5136g = view.getTranslationX();
/* 29 */                this.f5137h = view.getTranslationY();
                    }
/* 33 */            ArrayList arrayList2 = new ArrayList();
/* 38 */            ArrayList arrayList3 = new ArrayList();
/* 41 */            WeakHashMap weakHashMap = e33.f7494a;
/* 51 */            float fM8371i = s23.m8371i(view2) - s23.m8371i(view);
/* 55 */            if (z) {
/* 57 */                if (!z2) {
/* 60 */                    view2.setTranslationZ(-fM8371i);
                        }
/* 69 */                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
                    } else {
/* 81 */                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM8371i);
                    }
/* 95 */            ((mk1) wc0VarMo2438z.f18577b).m6672f("elevation").m6995a(objectAnimatorOfFloat);
/* 98 */            arrayList2.add(objectAnimatorOfFloat);
/* 105 */           float fM2435v = m2435v(view, view2, (zb0) wc0VarMo2438z.f18578c);
/* 113 */           float fM2436w = m2436w(view, view2, (zb0) wc0VarMo2438z.f18578c);
/* 117 */           Pair pairM2433u = m2433u(fM2435v, fM2436w, z, wc0VarMo2438z);
/* 123 */           nk1 nk1Var = (nk1) pairM2433u.first;
/* 127 */           nk1 nk1Var2 = (nk1) pairM2433u.second;
/* 129 */           RectF rectF = this.f5134e;
/* 131 */           Rect rect = this.f5132c;
/* 135 */           RectF rectF2 = this.f5133d;
/* 137 */           if (z) {
/* 139 */               f = 0.0f;
/* 141 */               if (!z2) {
/* 144 */                   view2.setTranslationX(-fM2435v);
/* 148 */                   view2.setTranslationY(-fM2436w);
                        }
/* 159 */               ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
/* 171 */               ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
/* 177 */               float fM2434x = m2434x(wc0VarMo2438z, nk1Var, -fM2435v);
/* 181 */               float fM2434x2 = m2434x(wc0VarMo2438z, nk1Var2, -fM2436w);
/* 185 */               view2.getWindowVisibleDisplayFrame(rect);
/* 188 */               rectF2.set(rect);
/* 191 */               m2437y(view2, rectF);
/* 194 */               rectF.offset(fM2434x, fM2434x2);
/* 197 */               rectF.intersect(rectF2);
/* 200 */               rectF2.set(rectF);
/* 203 */               objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
/* 204 */               objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
                    } else {
/* 209 */               f = 0.0f;
/* 218 */               objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM2435v);
/* 229 */               objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM2436w);
                    }
/* 233 */           nk1Var.m6995a(objectAnimatorOfFloat2);
/* 236 */           nk1Var2.m6995a(objectAnimatorOfFloat3);
/* 239 */           arrayList2.add(objectAnimatorOfFloat2);
/* 242 */           arrayList2.add(objectAnimatorOfFloat3);
/* 245 */           float fWidth = rectF2.width();
/* 249 */           float fHeight = rectF2.height();
/* 257 */           float fM2435v2 = m2435v(view, view2, (zb0) wc0VarMo2438z.f18578c);
/* 265 */           float fM2436w2 = m2436w(view, view2, (zb0) wc0VarMo2438z.f18578c);
/* 269 */           Pair pairM2433u2 = m2433u(fM2435v2, fM2436w2, z, wc0VarMo2438z);
/* 275 */           nk1 nk1Var3 = (nk1) pairM2433u2.first;
/* 279 */           nk1 nk1Var4 = (nk1) pairM2433u2.second;
/* 281 */           Property property = View.TRANSLATION_X;
/* 283 */           if (!z) {
/* 291 */               fM2435v2 = this.f5136g;
                    }
/* 287 */           float f2 = fM2436w2;
/* 298 */           ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fM2435v2);
/* 302 */           Property property2 = View.TRANSLATION_Y;
/* 304 */           if (!z) {
/* 307 */               f2 = this.f5137h;
                    }
/* 315 */           ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f2);
/* 319 */           nk1Var3.m6995a(objectAnimatorOfFloat7);
/* 322 */           nk1Var4.m6995a(objectAnimatorOfFloat8);
/* 325 */           arrayList2.add(objectAnimatorOfFloat7);
/* 328 */           arrayList2.add(objectAnimatorOfFloat8);
/* 331 */           boolean z3 = view2 instanceof InterfaceC0157av;
/* 333 */           if (z3 && (view instanceof ImageView)) {
/* 343 */               InterfaceC0157av interfaceC0157av = (InterfaceC0157av) view2;
/* 348 */               Drawable drawable = ((ImageView) view).getDrawable();
/* 352 */               if (drawable == null) {
/* 339 */                   arrayList = arrayList3;
                        } else {
/* 355 */                   drawable.mutate();
/* 360 */                   if (z) {
/* 362 */                       if (!z2) {
/* 364 */                           drawable.setAlpha(255);
                                }
/* 373 */                       objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, r90.f15933a, 0);
                            } else {
/* 384 */                       objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, r90.f15933a, 255);
                            }
/* 394 */                   objectAnimatorOfInt2.addUpdateListener(new C2184sk(view2, 3));
/* 407 */                   ((mk1) wc0VarMo2438z.f18577b).m6672f("iconFade").m6995a(objectAnimatorOfInt2);
/* 410 */                   arrayList2.add(objectAnimatorOfInt2);
/* 415 */                   qg0 qg0Var = new qg0(interfaceC0157av, drawable);
/* 418 */                   arrayList = arrayList3;
/* 420 */                   arrayList.add(qg0Var);
                        }
                    } else {
/* 339 */               arrayList = arrayList3;
                    }
/* 423 */           if (z3) {
/* 430 */               InterfaceC0157av interfaceC0157av2 = (InterfaceC0157av) view2;
/* 434 */               zb0 zb0Var = (zb0) wc0VarMo2438z.f18578c;
/* 436 */               m2437y(view, rectF2);
/* 443 */               rectF2.offset(this.f5136g, this.f5137h);
/* 446 */               m2437y(view2, rectF);
/* 456 */               rectF.offset(-m2435v(view, view2, zb0Var), f);
/* 465 */               float fCenterX = rectF2.centerX() - rectF.left;
/* 468 */               zb0 zb0Var2 = (zb0) wc0VarMo2438z.f18578c;
/* 470 */               m2437y(view, rectF2);
/* 479 */               rectF2.offset(this.f5136g, this.f5137h);
/* 482 */               m2437y(view2, rectF);
/* 491 */               rectF.offset(0.0f, -m2436w(view, view2, zb0Var2));
/* 500 */               float fCenterY = rectF2.centerY() - rectF.top;
/* 502 */               FloatingActionButton floatingActionButton = (FloatingActionButton) view;
/* 508 */               if (floatingActionButton.isLaidOut()) {
/* 520 */                   rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
/* 523 */                   floatingActionButton.m2336j(rect);
                        }
/* 533 */               float fWidth2 = rect.width() / 2.0f;
/* 540 */               nk1 nk1VarM6672f = ((mk1) wc0VarMo2438z.f18577b).m6672f("expansion");
/* 546 */               if (z) {
/* 548 */                   if (!z2) {
/* 555 */                       interfaceC0157av2.setRevealInfo(new C2564zu(fCenterX, fCenterY, fWidth2));
                            }
/* 558 */                   if (z2) {
/* 564 */                       fWidth2 = interfaceC0157av2.getRevealInfo().f20329c;
                            }
/* 570 */                   animatorSetM7592O = py0.m7592O(interfaceC0157av2, fCenterX, fCenterY, pg3.m7429h(fCenterX, fCenterY, fWidth, fHeight));
/* 580 */                   animatorSetM7592O.addListener(new C2307vu(interfaceC0157av2, 1));
/* 583 */                   long j = nk1VarM6672f.f14332a;
/* 585 */                   int i2 = (int) fCenterX;
/* 586 */                   int i3 = (int) fCenterY;
/* 589 */                   if (j > 0) {
/* 591 */                       Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, fWidth2, fWidth2);
/* 595 */                       animatorCreateCircularReveal.setStartDelay(0L);
/* 598 */                       animatorCreateCircularReveal.setDuration(j);
/* 601 */                       arrayList2.add(animatorCreateCircularReveal);
                            }
                        } else {
/* 609 */                   float f3 = interfaceC0157av2.getRevealInfo().f20329c;
/* 611 */                   AnimatorSet animatorSetM7592O2 = py0.m7592O(interfaceC0157av2, fCenterX, fCenterY, fWidth2);
/* 615 */                   long j2 = nk1VarM6672f.f14332a;
/* 617 */                   int i4 = (int) fCenterX;
/* 618 */                   int i5 = (int) fCenterY;
/* 621 */                   if (j2 > 0) {
/* 623 */                       Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, f3, f3);
/* 627 */                       animatorCreateCircularReveal2.setStartDelay(0L);
/* 630 */                       animatorCreateCircularReveal2.setDuration(j2);
/* 633 */                       arrayList2.add(animatorCreateCircularReveal2);
                            }
/* 636 */                   long j3 = nk1VarM6672f.f14332a;
/* 638 */                   long j4 = nk1VarM6672f.f14333b;
/* 644 */                   le2 le2Var = ((mk1) wc0VarMo2438z.f18577b).f13836a;
/* 654 */                   long jMax = 0;
/* 656 */                   int i6 = 0;
/* 657 */                   for (int i7 = le2Var.f13213c; i6 < i7; i7 = i7) {
/* 663 */                       nk1 nk1Var5 = (nk1) le2Var.m6430j(i6);
/* 677 */                       jMax = Math.max(jMax, nk1Var5.f14332a + nk1Var5.f14333b);
/* 681 */                       i6++;
/* 683 */                       le2Var = le2Var;
                            }
/* 688 */                   long j5 = j3 + j4;
/* 692 */                   if (j5 < jMax) {
/* 694 */                       Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, fWidth2, fWidth2);
/* 698 */                       animatorCreateCircularReveal3.setStartDelay(j5);
/* 702 */                       animatorCreateCircularReveal3.setDuration(jMax - j5);
/* 705 */                       arrayList2.add(animatorCreateCircularReveal3);
                            }
/* 708 */                   animatorSetM7592O = animatorSetM7592O2;
                        }
/* 710 */               nk1VarM6672f.m6995a(animatorSetM7592O);
/* 713 */               arrayList2.add(animatorSetM7592O);
/* 722 */               arrayList.add(new C2307vu(interfaceC0157av2, 0));
                    }
/* 725 */           if (z3) {
/* 729 */               InterfaceC0157av interfaceC0157av3 = (InterfaceC0157av) view2;
/* 731 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 733 */               ColorStateList colorStateListM8369g = s23.m8369g(view);
/* 752 */               int colorForState = colorStateListM8369g != null ? colorStateListM8369g.getColorForState(view.getDrawableState(), colorStateListM8369g.getDefaultColor()) : 0;
/* 756 */               int i8 = 16777215 & colorForState;
/* 757 */               if (z) {
/* 759 */                   if (!z2) {
/* 761 */                       interfaceC0157av3.setCircularRevealScrimColor(colorForState);
                            }
/* 770 */                   objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC0157av3, C2511yu.f19812a, i8);
                        } else {
/* 781 */                   objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC0157av3, C2511yu.f19812a, colorForState);
                        }
/* 787 */               objectAnimatorOfInt.setEvaluator(C2493yc.f19574b);
/* 800 */               ((mk1) wc0VarMo2438z.f18577b).m6672f("color").m6995a(objectAnimatorOfInt);
/* 803 */               arrayList2.add(objectAnimatorOfInt);
                    }
/* 808 */           if (view2 instanceof ViewGroup) {
/* 813 */               View viewFindViewById = view2.findViewById(R$id.mtrl_child_content_container);
/* 817 */               ViewGroup viewGroup = null;
/* 818 */               if (viewFindViewById != null) {
/* 822 */                   if (viewFindViewById instanceof ViewGroup) {
/* 825 */                       viewGroup = (ViewGroup) viewFindViewById;
                            }
                        } else if ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) {
/* 845 */                   View childAt = ((ViewGroup) view2).getChildAt(0);
/* 851 */                   if (childAt instanceof ViewGroup) {
/* 854 */                       viewGroup = (ViewGroup) childAt;
                            }
                        } else {
/* 838 */                   viewGroup = (ViewGroup) view2;
                        }
/* 856 */               if (viewGroup == null) {
/* 858 */                   i = 0;
                        } else {
/* 861 */                   if (z) {
/* 863 */                       if (!z2) {
/* 873 */                           C0856du.f7406a.set(viewGroup, Float.valueOf(0.0f));
                                }
/* 883 */                       i = 0;
/* 887 */                       objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, C0856du.f7406a, 1.0f);
                            } else {
/* 893 */                       i = 0;
/* 903 */                       objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, C0856du.f7406a, 0.0f);
                            }
/* 917 */                   ((mk1) wc0VarMo2438z.f18577b).m6672f("contentFade").m6995a(objectAnimatorOfFloat4);
/* 920 */                   arrayList2.add(objectAnimatorOfFloat4);
                        }
                    } else {
/* 858 */               i = 0;
                    }
/* 925 */           AnimatorSet animatorSet = new AnimatorSet();
/* 928 */           w11.m9455y(animatorSet, arrayList2);
/* 938 */           animatorSet.addListener(new pg0(z, view2, view));
/* 941 */           int size = arrayList.size();
/* 947 */           for (int i9 = i; i9 < size; i9++) {
/* 955 */               animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i9));
                    }
/* 961 */           return animatorSet;
                }

                /* JADX INFO: renamed from: v */
                public final float m2435v(View view, View view2, zb0 zb0Var) {
/* 1 */             RectF rectF = this.f5133d;
/* 3 */             m2437y(view, rectF);
/* 10 */            rectF.offset(this.f5136g, this.f5137h);
/* 13 */            RectF rectF2 = this.f5134e;
/* 15 */            m2437y(view2, rectF2);
/* 18 */            zb0Var.getClass();
/* 31 */            return (rectF2.centerX() - rectF.centerX()) + 0.0f;
                }

                /* JADX INFO: renamed from: w */
                public final float m2436w(View view, View view2, zb0 zb0Var) {
/* 1 */             RectF rectF = this.f5133d;
/* 3 */             m2437y(view, rectF);
/* 10 */            rectF.offset(this.f5136g, this.f5137h);
/* 13 */            RectF rectF2 = this.f5134e;
/* 15 */            m2437y(view2, rectF2);
/* 18 */            zb0Var.getClass();
/* 31 */            return (rectF2.centerY() - rectF.centerY()) + 0.0f;
                }

                /* JADX INFO: renamed from: y */
                public final void m2437y(View view, RectF rectF) {
/* 12 */            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
/* 15 */            int[] iArr = this.f5135f;
/* 17 */            view.getLocationInWindow(iArr);
/* 28 */            rectF.offsetTo(iArr[0], iArr[1]);
/* 45 */            rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
                }

                /* JADX INFO: renamed from: z */
                public abstract wc0 mo2438z(Context context, boolean z);

/* 30 */        public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
/* 31 */            super(context, attributeSet);
/* 32 */            this.f5132c = new Rect();
/* 33 */            this.f5133d = new RectF();
/* 34 */            this.f5134e = new RectF();
/* 35 */            this.f5135f = new int[2];
                }
            }
