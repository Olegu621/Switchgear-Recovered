            package androidx.transition;

            import android.animation.Animator;
            import android.animation.ObjectAnimator;
            import android.animation.PropertyValuesHolder;
            import android.animation.TypeConverter;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Matrix;
            import android.graphics.PointF;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.WeakHashMap;
            import org.xmlpull.v1.XmlPullParser;
            import p000.C1938ms;
            import p000.C1951n4;
            import p000.C2229ts;
            import p000.C2266us;
            import p000.C2305vs;
            import p000.C2342ws;
            import p000.cr0;
            import p000.dr0;
            import p000.ds0;
            import p000.e33;
            import p000.er0;
            import p000.f42;
            import p000.fr0;
            import p000.k50;
            import p000.l53;
            import p000.ld1;
            import p000.or2;
            import p000.pj0;
            import p000.py0;
            import p000.s23;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ChangeTransform extends Transition {

                /* JADX INFO: renamed from: m0 */
                public static final String[] f1862m0 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

                /* JADX INFO: renamed from: n0 */
                public static final C1938ms f1863n0 = new C1938ms("nonTranslations", float[].class, 6);

                /* JADX INFO: renamed from: o0 */
                public static final C1938ms f1864o0 = new C1938ms("translations", PointF.class, 7);

                /* JADX INFO: renamed from: p0 */
                public static final boolean f1865p0 = true;

                /* JADX INFO: renamed from: j0 */
                public final boolean f1866j0;

                /* JADX INFO: renamed from: k0 */
                public final boolean f1867k0;

                /* JADX INFO: renamed from: l0 */
                public final Matrix f1868l0;

                public ChangeTransform(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f1866j0 = true;
/* 7 */             this.f1867k0 = true;
/* 14 */            this.f1868l0 = new Matrix();
/* 18 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12592g);
/* 22 */            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
/* 38 */            this.f1866j0 = !k50.m5988y(xmlPullParser, "reparentWithOverlay") ? true : typedArrayObtainStyledAttributes.getBoolean(1, true);
/* 54 */            this.f1867k0 = k50.m5988y(xmlPullParser, "reparent") ? typedArrayObtainStyledAttributes.getBoolean(0, true) : true;
/* 56 */            typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: H */
                public final void m1072H(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 3 */             HashMap map = or2Var.f14872a;
/* 11 */            if (view.getVisibility() == 8) {
/* 120 */               return;
                    }
/* 20 */            map.put("android:changeTransform:parent", view.getParent());
/* 30 */            map.put("android:changeTransform:transforms", new C2342ws(view));
/* 33 */            Matrix matrix = view.getMatrix();
/* 55 */            map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
/* 60 */            if (this.f1867k0) {
/* 64 */                Matrix matrix2 = new Matrix();
/* 71 */                ViewGroup viewGroup = (ViewGroup) view.getParent();
/* 75 */                l53.f13119a.mo6893S(viewGroup, matrix2);
/* 90 */                matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
/* 95 */                map.put("android:changeTransform:parentMatrix", matrix2);
/* 106 */               map.put("android:changeTransform:intermediateMatrix", view.getTag(R$id.transition_transform));
/* 117 */               map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R$id.parent_matrix));
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             m1072H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             m1072H(or2Var);
/* 4 */             View view = or2Var.f14873b;
/* 8 */             if (f1865p0) {
/* 19 */                return;
                    }
/* 16 */            ((ViewGroup) view.getParent()).startViewTransition(view);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: k */
                public final Animator mo1067k(ViewGroup viewGroup, or2 or2Var, or2 or2Var2) {
                    int i;
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder;
                    Object obj;
                    ObjectAnimator objectAnimator;
                    int i2;
                    fr0 fr0Var;
                    boolean z;
                    fr0 fr0Var2;
                    dr0 dr0Var;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    ObjectAnimator objectAnimator2;
                    int i3;
                    int i4;
                    int i5;
                    int iIntValue;
                    dr0 dr0Var2;
                    cr0 cr0Var;
                    er0 er0Var;
                    or2 or2VarM1099n;
/* 1 */             ChangeTransform changeTransform = this;
/* 9 */             if (or2Var == null) {
/* 35 */                return null;
                    }
/* 11 */            View view = or2Var.f14873b;
/* 13 */            HashMap map = or2Var.f14872a;
/* 15 */            if (or2Var2 == null) {
/* 35 */                return null;
                    }
/* 17 */            View view2 = or2Var2.f14873b;
/* 19 */            HashMap map2 = or2Var2.f14872a;
/* 27 */            if (!map.containsKey("android:changeTransform:parent") || !map2.containsKey("android:changeTransform:parent")) {
/* 35 */                return null;
                    }
/* 44 */            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
/* 50 */            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeTransform:parent");
/* 86 */            boolean z2 = changeTransform.f1867k0 && (!(changeTransform.m1102s(viewGroup2) && changeTransform.m1102s(viewGroup3)) ? viewGroup2 == viewGroup3 : !((or2VarM1099n = changeTransform.m1099n(viewGroup2, true)) == null || viewGroup3 != or2VarM1099n.f14873b));
/* 93 */            Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
/* 97 */            if (matrix != null) {
/* 99 */                map.put("android:changeTransform:matrix", matrix);
                    }
/* 108 */           Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
/* 112 */           if (matrix2 != null) {
/* 114 */               map.put("android:changeTransform:parentMatrix", matrix2);
                    }
/* 117 */           if (z2) {
/* 123 */               Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
/* 127 */               view2.setTag(R$id.parent_matrix, matrix3);
/* 130 */               Matrix matrix4 = changeTransform.f1868l0;
/* 132 */               matrix4.reset();
/* 135 */               matrix3.invert(matrix4);
/* 142 */               Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
/* 144 */               if (matrix5 == null) {
/* 148 */                   matrix5 = new Matrix();
/* 151 */                   map.put("android:changeTransform:matrix", matrix5);
                        }
/* 164 */               matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
/* 167 */               matrix5.postConcat(matrix4);
                    }
/* 177 */           Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
/* 183 */           Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
/* 185 */           if (matrix6 == null) {
/* 187 */               matrix6 = ld1.f13196a;
                    }
/* 189 */           if (matrix7 == null) {
/* 191 */               matrix7 = ld1.f13196a;
                    }
/* 200 */           if (matrix6.equals(matrix7)) {
/* 110 */               obj = "android:changeTransform:parentMatrix";
/* 203 */               objectAnimatorOfPropertyValuesHolder = null;
/* 204 */               i = 2;
                    } else {
/* 214 */               C2342ws c2342ws = (C2342ws) map2.get("android:changeTransform:transforms");
/* 216 */               view2.setTranslationX(0.0f);
/* 219 */               view2.setTranslationY(0.0f);
/* 222 */               WeakHashMap weakHashMap = e33.f7494a;
/* 224 */               s23.m8385w(view2, 0.0f);
/* 227 */               view2.setScaleX(1.0f);
/* 230 */               view2.setScaleY(1.0f);
/* 233 */               view2.setRotationX(0.0f);
/* 236 */               view2.setRotationY(0.0f);
/* 239 */               view2.setRotation(0.0f);
/* 244 */               float[] fArr = new float[9];
/* 246 */               matrix6.getValues(fArr);
/* 249 */               float[] fArr2 = new float[9];
/* 251 */               matrix7.getValues(fArr2);
/* 259 */               C2305vs c2305vs = new C2305vs(view2, fArr);
/* 262 */               i = 2;
/* 271 */               pj0 pj0Var = new pj0(0);
/* 274 */               pj0Var.f15141b = new float[9];
/* 315 */               objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c2305vs, PropertyValuesHolder.ofObject(f1863n0, pj0Var, fArr, fArr2), PropertyValuesHolder.ofObject(f1864o0, (TypeConverter) null, changeTransform.f1904f0.mo1062a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
/* 321 */               changeTransform = this;
/* 110 */               obj = "android:changeTransform:parentMatrix";
/* 325 */               z2 = z2;
/* 327 */               C2229ts c2229ts = new C2229ts(changeTransform, z2, matrix7, view2, c2342ws, c2305vs);
/* 330 */               objectAnimatorOfPropertyValuesHolder.addListener(c2229ts);
/* 333 */               objectAnimatorOfPropertyValuesHolder.addPauseListener(c2229ts);
                    }
/* 336 */           boolean z3 = f1865p0;
/* 338 */           if (z2 && objectAnimatorOfPropertyValuesHolder != null && changeTransform.f1866j0) {
/* 354 */               Matrix matrix8 = new Matrix((Matrix) map2.get(obj));
/* 359 */               l53.f13119a.mo6894T(viewGroup, matrix8);
/* 368 */               if (Build.VERSION.SDK_INT == 28) {
/* 372 */                   if (!er0.f7849f) {
                                try {
/* 376 */                           if (!er0.f7847d) {
                                        try {
/* 384 */                                   er0.f7846c = Class.forName("android.view.GhostView");
                                        } catch (ClassNotFoundException unused) {
                                        }
/* 386 */                               er0.f7847d = r15;
                                    }
/* 400 */                           Method declaredMethod = er0.f7846c.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
/* 404 */                           er0.f7848e = declaredMethod;
/* 408 */                           declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused2) {
                                }
/* 412 */                       er0.f7849f = true;
                            }
/* 414 */                   Method method = er0.f7848e;
/* 416 */                   if (method != null) {
                                try {
/* 432 */                           er0Var = new er0((View) method.invoke(null, view2, viewGroup, matrix8), 0);
                                } catch (IllegalAccessException unused3) {
/* 449 */                           er0Var = null;
                                } catch (InvocationTargetException e) {
/* 443 */                           ds0.m3199p(e.getCause());
/* 446 */                           return null;
                                }
                            } else {
/* 449 */                       er0Var = null;
                            }
/* 451 */                   z = z3;
/* 453 */                   objectAnimator = objectAnimatorOfPropertyValuesHolder;
/* 455 */                   cr0Var = er0Var;
                        } else {
/* 459 */                   int i6 = fr0.f8328i;
/* 467 */                   if (!(view2.getParent() instanceof ViewGroup)) {
/* 1072 */                      C1951n4.m6859j("Ghosted views must be parented by a ViewGroup");
/* 446 */                       return null;
                            }
/* 469 */                   int i7 = dr0.f7389c;
/* 477 */                   dr0 dr0Var3 = (dr0) viewGroup.getTag(R$id.ghost_view_holder);
/* 485 */                   fr0 fr0Var3 = (fr0) view2.getTag(R$id.ghost_view);
/* 487 */                   if (fr0Var3 == null || (dr0Var2 = (dr0) fr0Var3.getParent()) == dr0Var3) {
/* 504 */                       i2 = 0;
                                fr0Var = fr0Var3;
                            } else {
/* 497 */                       i2 = fr0Var3.f8332d;
/* 499 */                       dr0Var2.removeView(fr0Var3);
/* 502 */                       fr0Var = null;
                            }
/* 505 */                   if (fr0Var == null) {
/* 509 */                       fr0 fr0Var4 = new fr0(view2);
/* 512 */                       fr0Var4.f8333e = matrix8;
/* 514 */                       if (dr0Var3 == null) {
/* 522 */                           dr0 dr0Var4 = new dr0(viewGroup.getContext());
/* 526 */                           dr0Var4.setClipChildren(false);
/* 529 */                           dr0Var4.f7390a = viewGroup;
/* 533 */                           viewGroup.setTag(R$id.ghost_view_holder, dr0Var4);
/* 540 */                           viewGroup.getOverlay().add(dr0Var4);
/* 544 */                           dr0Var4.f7391b = true;
                                    dr0Var = dr0Var4;
                                } else {
/* 547 */                           ViewGroup viewGroup4 = dr0Var3.f7390a;
/* 551 */                           if (!dr0Var3.f7391b) {
/* 1007 */                              f42.m3656l("This GhostViewHolder is detached!");
/* 446 */                               return null;
                                    }
/* 557 */                           viewGroup4.getOverlay().remove(dr0Var3);
/* 564 */                           viewGroup4.getOverlay().add(dr0Var3);
                                    dr0Var = dr0Var3;
                                }
/* 594 */                       l53.m6342a(dr0Var, dr0Var.getLeft(), dr0Var.getTop(), viewGroup.getWidth() + dr0Var.getLeft(), viewGroup.getHeight() + dr0Var.getTop());
/* 623 */                       l53.m6342a(fr0Var4, fr0Var4.getLeft(), fr0Var4.getTop(), viewGroup.getWidth() + fr0Var4.getLeft(), viewGroup.getHeight() + fr0Var4.getTop());
/* 628 */                       ArrayList arrayList3 = new ArrayList();
/* 633 */                       dr0.m3181a(fr0Var4.f8331c, arrayList3);
/* 638 */                       ArrayList arrayList4 = new ArrayList();
/* 646 */                       int childCount = dr0Var.getChildCount() - 1;
/* 648 */                       int i8 = 0;
/* 649 */                       while (i8 <= childCount) {
/* 653 */                           int i9 = (i8 + childCount) / 2;
/* 659 */                           boolean z4 = z3;
/* 667 */                           dr0.m3181a(((fr0) dr0Var.getChildAt(i9)).f8331c, arrayList4);
/* 674 */                           if (arrayList3.isEmpty() || arrayList4.isEmpty()) {
/* 951 */                               arrayList = arrayList3;
/* 953 */                               arrayList2 = arrayList4;
/* 955 */                               objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                                    } else {
/* 687 */                               objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
/* 693 */                               if (arrayList3.get(0) != arrayList4.get(0)) {
/* 695 */                                   arrayList = arrayList3;
                                        } else {
/* 706 */                                   int iMin = Math.min(arrayList3.size(), arrayList4.size());
/* 710 */                                   int i10 = 1;
                                            while (true) {
/* 711 */                                       if (i10 < iMin) {
/* 717 */                                           View view3 = (View) arrayList3.get(i10);
/* 723 */                                           int i11 = i10;
/* 727 */                                           View view4 = (View) arrayList4.get(i10);
/* 729 */                                           if (view3 != view4) {
/* 735 */                                               ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
/* 737 */                                               arrayList = arrayList3;
/* 739 */                                               int childCount2 = viewGroup5.getChildCount();
/* 753 */                                               if (view3.getZ() == view4.getZ()) {
/* 785 */                                                   arrayList2 = arrayList4;
/* 787 */                                                   int i12 = 0;
                                                            while (true) {
/* 788 */                                                       if (i12 < childCount2) {
/* 790 */                                                           int i13 = childCount2;
/* 794 */                                                           i5 = childCount;
/* 798 */                                                           if (Build.VERSION.SDK_INT >= 29) {
/* 1 */                                                                 iIntValue = viewGroup5.getChildDrawingOrder(i12);
/* 804 */                                                               i12 = i12;
/* 806 */                                                               i4 = i;
                                                                    } else {
/* 813 */                                                               if (!py0.f15336j) {
                                                                            try {
/* 821 */                                                                       Class[] clsArr = new Class[i];
/* 823 */                                                                       Class cls = Integer.TYPE;
/* 827 */                                                                       clsArr[0] = cls;
/* 832 */                                                                       clsArr[1] = cls;
/* 834 */                                                                       Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", clsArr);
/* 838 */                                                                       py0.f15335i = declaredMethod2;
/* 840 */                                                                       declaredMethod2.setAccessible(true);
                                                                            } catch (NoSuchMethodException unused4) {
                                                                            }
/* 848 */                                                                   py0.f15336j = true;
                                                                        }
/* 853 */                                                               Method method2 = py0.f15335i;
/* 855 */                                                               if (method2 != null) {
/* 857 */                                                                   i4 = 2;
                                                                            try {
/* 858 */                                                                       Object[] objArr = new Object[2];
                                                                                try {
/* 870 */                                                                           objArr[0] = Integer.valueOf(viewGroup5.getChildCount());
/* 878 */                                                                           objArr[1] = Integer.valueOf(i12);
/* 886 */                                                                           iIntValue = ((Integer) method2.invoke(viewGroup5, objArr)).intValue();
                                                                                } catch (IllegalAccessException | InvocationTargetException unused5) {
/* 894 */                                                                           iIntValue = i12;
                                                                                }
                                                                            } catch (IllegalAccessException | InvocationTargetException unused6) {
                                                                            }
                                                                        } else {
/* 891 */                                                                   i4 = 2;
                                                                        }
/* 894 */                                                               iIntValue = i12;
                                                                    }
/* 896 */                                                           View childAt = viewGroup5.getChildAt(iIntValue);
/* 900 */                                                           if (childAt != view3) {
/* 903 */                                                               if (childAt != view4) {
/* 906 */                                                                   i12++;
/* 908 */                                                                   i = i4;
/* 910 */                                                                   childCount2 = i13;
/* 912 */                                                                   childCount = i5;
                                                                        }
                                                                    }
                                                                }
/* 959 */                                                       i8 = i9 + 1;
/* 962 */                                                       i3 = i5;
                                                            }
                                                        } else if (view3.getZ() <= view4.getZ()) {
/* 777 */                                                   arrayList2 = arrayList4;
/* 779 */                                                   i4 = i;
                                                        }
/* 948 */                                               i3 = i9 - 1;
                                                    } else {
/* 925 */                                               i10 = i11 + 1;
/* 927 */                                               childCount = childCount;
                                                    }
                                                } else {
/* 931 */                                           arrayList = arrayList3;
/* 933 */                                           arrayList2 = arrayList4;
/* 935 */                                           i5 = childCount;
/* 937 */                                           i4 = i;
/* 945 */                                           if (arrayList2.size() == iMin) {
/* 959 */                                               i8 = i9 + 1;
/* 962 */                                               i3 = i5;
                                                    } else {
/* 948 */                                               i3 = i9 - 1;
                                                    }
                                                }
/* 964 */                                       arrayList2.clear();
/* 969 */                                       arrayList3 = arrayList;
/* 971 */                                       i = i4;
/* 973 */                                       childCount = i3;
/* 974 */                                       arrayList4 = arrayList2;
/* 976 */                                       z3 = z4;
/* 978 */                                       objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                            }
                                        }
/* 767 */                               arrayList2 = arrayList4;
                                    }
/* 769 */                           i5 = childCount;
/* 771 */                           i4 = i;
/* 959 */                           i8 = i9 + 1;
/* 962 */                           i3 = i5;
/* 964 */                           arrayList2.clear();
/* 969 */                           arrayList3 = arrayList;
/* 971 */                           i = i4;
/* 973 */                           childCount = i3;
/* 974 */                           arrayList4 = arrayList2;
/* 976 */                           z3 = z4;
/* 978 */                           objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                }
/* 982 */                       z = z3;
/* 984 */                       objectAnimator = objectAnimatorOfPropertyValuesHolder;
/* 986 */                       if (i8 < 0 || i8 >= dr0Var.getChildCount()) {
/* 999 */                           dr0Var.addView(fr0Var4);
                                } else {
/* 995 */                           dr0Var.addView(fr0Var4, i8);
                                }
/* 1002 */                      fr0Var4.f8332d = i2;
                                fr0Var2 = fr0Var4;
                            } else {
/* 1012 */                      z = z3;
/* 1014 */                      objectAnimator = objectAnimatorOfPropertyValuesHolder;
/* 1016 */                      fr0Var.f8333e = matrix8;
                                fr0Var2 = fr0Var;
                            }
/* 1022 */                  fr0Var2.f8332d++;
                            cr0Var = fr0Var2;
                        }
/* 1024 */              if (cr0Var != null) {
/* 1033 */                  cr0Var.mo2870a((ViewGroup) map.get("android:changeTransform:parent"), view);
/* 1036 */                  Transition transition = this;
                            while (true) {
/* 1038 */                      TransitionSet transitionSet = transition.f1907w;
/* 1040 */                      if (transitionSet == null) {
                                    break;
                                }
/* 1042 */                      transition = transitionSet;
                            }
/* 1046 */                  C2266us c2266us = new C2266us();
/* 1049 */                  c2266us.f17708b = view2;
/* 1051 */                  c2266us.f17709c = cr0Var;
/* 1053 */                  transition.m1090a(c2266us);
/* 1056 */                  if (z) {
/* 1058 */                      if (view != view2) {
/* 1061 */                          l53.m6343b(view, 0.0f);
                                }
/* 1066 */                      l53.m6343b(view2, 1.0f);
                            }
                        }
                    } else {
/* 1079 */              objectAnimator = objectAnimatorOfPropertyValuesHolder;
/* 1081 */              if (!z3) {
/* 1083 */                  viewGroup2.endViewTransition(view);
                        }
                    }
/* 1086 */          return objectAnimator;
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: p */
                public final String[] mo1068p() {
/* 1 */             return f1862m0;
                }
            }
