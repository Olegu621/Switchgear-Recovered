            package androidx.transition;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.animation.TypeConverter;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.HashMap;
            import java.util.WeakHashMap;
            import p000.C1794ji;
            import p000.C1938ms;
            import p000.C1975ns;
            import p000.C2044os;
            import p000.C2081ps;
            import p000.C2118qs;
            import p000.e33;
            import p000.k50;
            import p000.l53;
            import p000.nr2;
            import p000.or2;
            import p000.pj0;
            import p000.py0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    public class ChangeBounds extends Transition {

                /* JADX INFO: renamed from: k0 */
                public static final String[] f1849k0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

                /* JADX INFO: renamed from: l0 */
                public static final C1938ms f1850l0;

                /* JADX INFO: renamed from: m0 */
                public static final C1938ms f1851m0;

                /* JADX INFO: renamed from: n0 */
                public static final C1938ms f1852n0;

                /* JADX INFO: renamed from: o0 */
                public static final C1938ms f1853o0;

                /* JADX INFO: renamed from: p0 */
                public static final C1938ms f1854p0;

                /* JADX INFO: renamed from: q0 */
                public static final pj0 f1855q0;

                /* JADX INFO: renamed from: j0 */
                public final boolean f1856j0;

                static {
/* 21 */            Class<PointF> cls = PointF.class;
/* 31 */            new C1794ji(cls, "boundsOrigin").f12313b = new Rect();
/* 36 */            String str = "topLeft";
/* 41 */            f1850l0 = new C1938ms(str, cls, 0);
/* 46 */            String str2 = "bottomRight";
/* 51 */            f1851m0 = new C1938ms(str2, cls, 1);
/* 59 */            f1852n0 = new C1938ms(str2, cls, 2);
/* 67 */            f1853o0 = new C1938ms(str, cls, 3);
/* 77 */            f1854p0 = new C1938ms("position", cls, 4);
/* 85 */            f1855q0 = new pj0(2);
                }

                public ChangeBounds(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f1856j0 = false;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12589d);
/* 24 */            boolean z = k50.m5988y((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
/* 28 */            typedArrayObtainStyledAttributes.recycle();
/* 31 */            this.f1856j0 = z;
                }

                /* JADX INFO: renamed from: H */
                public final void m1064H(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 3 */             HashMap map = or2Var.f14872a;
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 11 */            if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
/* 73 */                return;
                    }
/* 48 */            map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
/* 57 */            map.put("android:changeBounds:parent", view.getParent());
/* 62 */            if (this.f1856j0) {
/* 70 */                map.put("android:changeBounds:clip", view.getClipBounds());
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             m1064H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             m1064H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: k */
                public final Animator mo1067k(ViewGroup viewGroup, or2 or2Var, or2 or2Var2) {
                    int i;
                    int i2;
                    Rect rect;
                    Rect rect2;
                    ObjectAnimator objectAnimator;
                    Animator animatorOfObject;
/* 7 */             if (or2Var == null) {
/* 13 */                return null;
                    }
/* 9 */             HashMap map = or2Var.f14872a;
/* 11 */            if (or2Var2 == null) {
/* 13 */                return null;
                    }
/* 16 */            HashMap map2 = or2Var2.f14872a;
/* 24 */            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
/* 30 */            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
/* 32 */            if (viewGroup2 == null || viewGroup3 == null) {
/* 13 */                return null;
                    }
/* 37 */            View view = or2Var2.f14873b;
/* 45 */            Rect rect3 = (Rect) map.get("android:changeBounds:bounds");
/* 51 */            Rect rect4 = (Rect) map2.get("android:changeBounds:bounds");
/* 53 */            int i3 = rect3.left;
/* 55 */            int i4 = rect4.left;
/* 57 */            int i5 = rect3.top;
/* 59 */            int i6 = rect4.top;
/* 61 */            int i7 = rect3.right;
/* 63 */            int i8 = rect4.right;
/* 65 */            int i9 = rect3.bottom;
/* 67 */            int i10 = rect4.bottom;
/* 69 */            int i11 = i7 - i3;
/* 71 */            int i12 = i9 - i5;
/* 73 */            int i13 = i8 - i4;
/* 75 */            int i14 = i10 - i6;
/* 85 */            Rect rect5 = (Rect) map.get("android:changeBounds:clip");
/* 91 */            Rect rect6 = (Rect) map2.get("android:changeBounds:clip");
/* 95 */            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
/* 120 */               i = 0;
                    } else {
/* 111 */               i = (i3 == i4 && i5 == i6) ? 0 : 1;
/* 113 */               if (i7 != i8 || i9 != i10) {
/* 117 */                   i++;
                        }
                    }
/* 122 */           if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
/* 134 */               i++;
                    }
/* 136 */           int i15 = i;
/* 140 */           if (i15 <= 0) {
/* 13 */                return null;
                    }
/* 144 */           boolean z = this.f1856j0;
/* 148 */           C1938ms c1938ms = f1854p0;
/* 150 */           if (z) {
/* 302 */               l53.m6342a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
/* 327 */               ObjectAnimator objectAnimatorOfObject = (i3 == i4 && i5 == i6) ? null : ObjectAnimator.ofObject(view, c1938ms, (TypeConverter) null, this.f1904f0.mo1062a(i3, i5, i4, i6));
/* 331 */               if (rect5 == null) {
/* 335 */                   i2 = 0;
/* 337 */                   rect = new Rect(0, 0, i11, i12);
                        } else {
/* 341 */                   i2 = 0;
                        }
/* 345 */               if (rect6 == 0) {
/* 343 */                   rect = rect5;
/* 349 */                   rect2 = new Rect(i2, i2, i13, i14);
                        } else {
/* 343 */                   rect = rect5;
/* 353 */                   rect2 = rect6;
                        }
/* 359 */               if (rect.equals(rect2)) {
/* 389 */                   objectAnimator = null;
                        } else {
/* 361 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 363 */                   view.setClipBounds(rect);
/* 374 */                   ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(view, "clipBounds", f1855q0, rect, rect2);
/* 385 */                   objectAnimatorOfObject2.addListener(new C2044os(view, rect6, i4, i6, i8, i10));
                            objectAnimator = objectAnimatorOfObject2;
                        }
/* 390 */               boolean z2 = nr2.f14417a;
                        animatorOfObject = objectAnimator;
/* 392 */               if (objectAnimatorOfObject != null) {
/* 395 */                   if (objectAnimator == null) {
/* 397 */                       animatorOfObject = objectAnimatorOfObject;
                            } else {
/* 401 */                       AnimatorSet animatorSet = new AnimatorSet();
/* 413 */                       animatorSet.playTogether(objectAnimatorOfObject, objectAnimator);
/* 416 */                       animatorOfObject = animatorSet;
                            }
                        }
                    } else {
/* 152 */               l53.m6342a(view, i3, i5, i7, i9);
/* 156 */               if (i15 != 2) {
/* 284 */                   animatorOfObject = (i3 == i4 && i5 == i6) ? ObjectAnimator.ofObject(view, f1852n0, (TypeConverter) null, this.f1904f0.mo1062a(i7, i9, i8, i10)) : ObjectAnimator.ofObject(view, f1853o0, (TypeConverter) null, this.f1904f0.mo1062a(i3, i5, i4, i6));
                        } else if (i11 == i13 && i12 == i14) {
/* 175 */                   animatorOfObject = ObjectAnimator.ofObject(view, c1938ms, (TypeConverter) null, this.f1904f0.mo1062a(i3, i5, i4, i6));
                        } else {
/* 183 */                   C2118qs c2118qs = new C2118qs();
/* 186 */                   c2118qs.f15723e = view;
/* 201 */                   ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(c2118qs, f1850l0, (TypeConverter) null, this.f1904f0.mo1062a(i3, i5, i4, i6));
/* 217 */                   ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(c2118qs, f1851m0, (TypeConverter) null, this.f1904f0.mo1062a(i7, i9, i8, i10));
/* 223 */                   AnimatorSet animatorSet2 = new AnimatorSet();
/* 233 */                   animatorSet2.playTogether(objectAnimatorOfObject3, objectAnimatorOfObject4);
/* 241 */                   animatorSet2.addListener(new C1975ns(c2118qs));
/* 244 */                   animatorOfObject = animatorSet2;
                        }
                    }
/* 423 */           if (view.getParent() instanceof ViewGroup) {
/* 429 */               ViewGroup viewGroup4 = (ViewGroup) view.getParent();
/* 433 */               py0.m7612u0(viewGroup4, true);
/* 441 */               m1090a(new C2081ps(viewGroup4));
                    }
/* 444 */           return animatorOfObject;
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: p */
                public final String[] mo1068p() {
/* 1 */             return f1849k0;
                }

/* 33 */        public ChangeBounds() {
/* 35 */            this.f1856j0 = false;
                }
            }
