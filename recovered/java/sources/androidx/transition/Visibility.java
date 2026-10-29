            package androidx.transition;

            import android.animation.Animator;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Picture;
            import android.graphics.RectF;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ImageView;
            import java.util.HashMap;
            import p000.C1951n4;
            import p000.a63;
            import p000.b63;
            import p000.k50;
            import p000.l53;
            import p000.n53;
            import p000.nr2;
            import p000.or2;
            import p000.z53;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 36 */    public abstract class Visibility extends Transition {

                /* JADX INFO: renamed from: k0 */
                public static final String[] f1913k0 = {"android:visibility:visibility", "android:visibility:parent"};

                /* JADX INFO: renamed from: j0 */
                public int f1914j0;

                public Visibility(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f1914j0 = 3;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12590e);
/* 25 */            int i = k50.m5988y((XmlResourceParser) attributeSet, "transitionVisibilityMode") ? typedArrayObtainStyledAttributes.getInt(0, 0) : 0;
/* 29 */            typedArrayObtainStyledAttributes.recycle();
/* 32 */            if (i != 0) {
/* 34 */                m1115L(i);
                    }
                }

                /* JADX INFO: renamed from: H */
                public static void m1113H(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 3 */             int visibility = view.getVisibility();
/* 7 */             HashMap map = or2Var.f14872a;
/* 15 */            map.put("android:visibility:visibility", Integer.valueOf(visibility));
/* 24 */            map.put("android:visibility:parent", view.getParent());
/* 28 */            int[] iArr = new int[2];
/* 30 */            view.getLocationOnScreen(iArr);
/* 35 */            map.put("android:visibility:screenLocation", iArr);
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0052  */
                /* JADX WARN: Code duplicated, block: B:7:0x002f  */
                /* JADX INFO: renamed from: I */
                public static b63 m1114I(or2 or2Var, or2 or2Var2) {
/* 3 */             b63 b63Var = new b63();
/* 7 */             b63Var.f2243a = false;
/* 9 */             b63Var.f2244b = false;
/* 17 */            if (or2Var != null) {
/* 19 */                HashMap map = or2Var.f14872a;
/* 25 */                if (map.containsKey("android:visibility:visibility")) {
/* 37 */                    b63Var.f2245c = ((Integer) map.get("android:visibility:visibility")).intValue();
/* 45 */                    b63Var.f2247e = (ViewGroup) map.get("android:visibility:parent");
                        } else {
/* 48 */                    b63Var.f2245c = -1;
/* 50 */                    b63Var.f2247e = null;
                        }
                    } else {
/* 48 */                b63Var.f2245c = -1;
/* 50 */                b63Var.f2247e = null;
                    }
/* 52 */            if (or2Var2 != null) {
/* 54 */                HashMap map2 = or2Var2.f14872a;
/* 60 */                if (map2.containsKey("android:visibility:visibility")) {
/* 72 */                    b63Var.f2246d = ((Integer) map2.get("android:visibility:visibility")).intValue();
/* 80 */                    b63Var.f2248f = (ViewGroup) map2.get("android:visibility:parent");
                        } else {
/* 83 */                    b63Var.f2246d = -1;
/* 85 */                    b63Var.f2248f = null;
                        }
                    } else {
/* 83 */                b63Var.f2246d = -1;
/* 85 */                b63Var.f2248f = null;
                    }
/* 88 */            if (or2Var != null && or2Var2 != null) {
/* 92 */                int i = b63Var.f2245c;
/* 94 */                int i2 = b63Var.f2246d;
/* 96 */                if (i != i2 || b63Var.f2247e != b63Var.f2248f) {
/* 105 */                   if (i != i2) {
/* 107 */                       if (i == 0) {
/* 109 */                           b63Var.f2244b = false;
/* 111 */                           b63Var.f2243a = true;
/* 113 */                           return b63Var;
                                }
/* 114 */                       if (i2 == 0) {
/* 116 */                           b63Var.f2244b = true;
/* 118 */                           b63Var.f2243a = true;
/* 120 */                           return b63Var;
                                }
                            } else {
/* 123 */                       if (b63Var.f2248f == null) {
/* 125 */                           b63Var.f2244b = false;
/* 127 */                           b63Var.f2243a = true;
/* 129 */                           return b63Var;
                                }
/* 132 */                       if (b63Var.f2247e == null) {
/* 134 */                           b63Var.f2244b = true;
/* 136 */                           b63Var.f2243a = true;
/* 138 */                           return b63Var;
                                }
                            }
                        }
                    } else {
/* 139 */               if (or2Var == null && b63Var.f2246d == 0) {
/* 145 */                   b63Var.f2244b = true;
/* 147 */                   b63Var.f2243a = true;
/* 149 */                   return b63Var;
                        }
/* 150 */               if (or2Var2 == null && b63Var.f2245c == 0) {
/* 156 */                   b63Var.f2244b = false;
/* 158 */                   b63Var.f2243a = true;
                        }
                    }
/* 160 */           return b63Var;
                }

                /* JADX INFO: renamed from: J */
                public Animator mo1073J(ViewGroup viewGroup, View view, or2 or2Var, or2 or2Var2) {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: K */
                public Animator mo1074K(ViewGroup viewGroup, View view, or2 or2Var) {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: L */
                public final void m1115L(int i) {
/* 3 */             if ((i & (-4)) == 0) {
/* 5 */                 this.f1914j0 = i;
                    } else {
/* 10 */                C1951n4.m6859j("Only MODE_IN and MODE_OUT flags are allowed");
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public void mo1065d(or2 or2Var) {
/* 1 */             m1113H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public void mo1066g(or2 or2Var) {
/* 1 */             m1113H(or2Var);
                }

                /* JADX WARN: Code duplicated, block: B:49:0x0091  */
                /* JADX WARN: Code duplicated, block: B:51:0x0097  */
                /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
                /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
                /* JADX WARN: Code duplicated, block: B:56:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:58:0x0123  */
                /* JADX WARN: Code duplicated, block: B:59:0x0126  */
                /* JADX WARN: Code duplicated, block: B:61:0x012c A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:62:0x012e  */
                /* JADX WARN: Code duplicated, block: B:63:0x0138  */
                /* JADX WARN: Code duplicated, block: B:64:0x0150  */
                /* JADX WARN: Code duplicated, block: B:67:0x016c A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:72:0x01c2  */
                /* JADX WARN: Code duplicated, block: B:74:0x01c8  */
                /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
                /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
                /* JADX WARN: Code duplicated, block: B:81:0x0205  */
                /* JADX WARN: Code duplicated, block: B:84:0x020c  */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
                
                    if (m1114I(m1099n(r5, false), m1100q(r5, false)).f2243a != false) goto L9;
                 */
                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: k */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Animator mo1067k(ViewGroup viewGroup, or2 or2Var, or2 or2Var2) {
                    boolean z;
                    View view;
                    int i;
                    char c;
                    int i2;
                    View view2;
                    Animator animator;
                    View view3;
                    View view4;
                    int id;
                    ImageView imageView;
                    boolean zIsAttachedToWindow;
                    boolean zIsAttachedToWindow2;
                    ViewGroup viewGroup2;
                    int i3;
                    int iRound;
                    Bitmap bitmapCreateBitmap;
/* 9 */             b63 b63VarM1114I = m1114I(or2Var, or2Var2);
/* 15 */            if (b63VarM1114I.f2243a && (b63VarM1114I.f2247e != null || b63VarM1114I.f2248f != null)) {
/* 32 */                int i4 = 1;
/* 34 */                if (!b63VarM1114I.f2244b) {
/* 76 */                    int i5 = b63VarM1114I.f2246d;
/* 82 */                    if ((this.f1914j0 & 2) == 2 && or2Var != null) {
/* 88 */                        View view5 = or2Var.f14873b;
/* 95 */                        View view6 = or2Var2 != null ? or2Var2.f14873b : null;
/* 102 */                       View view7 = (View) view5.getTag(R$id.save_overlay_view);
/* 104 */                       if (view7 != null) {
/* 106 */                           i = i5;
/* 108 */                           c = 1;
/* 110 */                           i2 = 0;
/* 112 */                           view3 = null;
/* 113 */                           animator = null;
                                } else {
/* 117 */                           if (view6 == null || view6.getParent() == null) {
/* 140 */                               if (view6 != null) {
/* 142 */                                   z = false;
                                        }
/* 138 */                               view = null;
/* 144 */                               if (!z) {
/* 525 */                                   i = i5;
/* 527 */                                   c = 1;
/* 529 */                                   i2 = 0;
/* 531 */                                   view2 = view;
/* 533 */                                   animator = null;
/* 535 */                                   view7 = view6;
/* 493 */                                   i4 = i2;
/* 495 */                                   view3 = view2;
                                        } else if (view5.getParent() == null) {
/* 152 */                                   i = i5;
/* 154 */                                   c = 1;
/* 156 */                                   i4 = 0;
/* 157 */                                   i2 = 0;
/* 159 */                                   view3 = view;
/* 160 */                                   animator = null;
/* 162 */                                   view7 = view5;
                                        } else {
/* 171 */                                   if (view5.getParent() instanceof View) {
/* 177 */                                       view4 = (View) view5.getParent();
/* 193 */                                       if (m1114I(m1100q(view4, true), m1099n(view4, true)).f2243a) {
/* 498 */                                           i = i5;
/* 500 */                                           c = 1;
/* 502 */                                           i2 = 0;
/* 504 */                                           view2 = view;
/* 506 */                                           animator = null;
/* 508 */                                           id = view4.getId();
/* 516 */                                           if (view4.getParent() == null && id != -1) {
/* 521 */                                               viewGroup.findViewById(id);
                                                    }
                                                } else {
/* 195 */                                           boolean z2 = nr2.f14417a;
/* 199 */                                           Matrix matrix = new Matrix();
/* 214 */                                           matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
/* 217 */                                           n53 n53Var = l53.f13119a;
/* 219 */                                           n53Var.mo6893S(view5, matrix);
/* 222 */                                           n53Var.mo6894T(viewGroup, matrix);
/* 238 */                                           RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
/* 241 */                                           matrix.mapRect(rectF);
/* 246 */                                           int iRound2 = Math.round(rectF.left);
/* 252 */                                           int iRound3 = Math.round(rectF.top);
/* 258 */                                           int iRound4 = Math.round(rectF.right);
/* 264 */                                           int iRound5 = Math.round(rectF.bottom);
/* 268 */                                           animator = null;
/* 272 */                                           c = 1;
/* 278 */                                           imageView = new ImageView(view5.getContext());
/* 283 */                                           imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
/* 286 */                                           zIsAttachedToWindow = view5.isAttachedToWindow();
/* 290 */                                           if (viewGroup == null) {
/* 292 */                                               zIsAttachedToWindow2 = false;
                                                    } else {
/* 295 */                                               zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                                    }
/* 299 */                                           if (zIsAttachedToWindow) {
/* 337 */                                               i2 = 0;
/* 339 */                                               viewGroup2 = null;
/* 341 */                                               i3 = 0;
                                                    } else {
/* 301 */                                               if (zIsAttachedToWindow2) {
/* 317 */                                                   i2 = 0;
/* 321 */                                                   viewGroup2 = (ViewGroup) view5.getParent();
/* 323 */                                                   int iIndexOfChild = viewGroup2.indexOfChild(view5);
/* 331 */                                                   viewGroup.getOverlay().add(view5);
/* 334 */                                                   i3 = iIndexOfChild;
                                                        } else {
/* 303 */                                                   i = i5;
/* 305 */                                                   i2 = 0;
/* 307 */                                                   view2 = view;
/* 309 */                                                   bitmapCreateBitmap = null;
                                                        }
/* 467 */                                               if (bitmapCreateBitmap != null) {
/* 469 */                                                   imageView.setImageBitmap(bitmapCreateBitmap);
                                                        }
/* 486 */                                               imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
/* 489 */                                               imageView.layout(iRound2, iRound3, iRound4, iRound5);
/* 492 */                                               view7 = imageView;
                                                    }
/* 349 */                                           iRound = Math.round(rectF.width());
/* 357 */                                           view2 = view;
/* 359 */                                           int iRound6 = Math.round(rectF.height());
/* 363 */                                           if (iRound > 0 || iRound6 <= 0) {
/* 451 */                                               i = i5;
/* 453 */                                               bitmapCreateBitmap = null;
                                                    } else {
/* 367 */                                               i = i5;
/* 378 */                                               float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
/* 384 */                                               int iRound7 = Math.round(iRound * fMin);
/* 390 */                                               int iRound8 = Math.round(iRound6 * fMin);
/* 400 */                                               matrix.postTranslate(-rectF.left, -rectF.top);
/* 403 */                                               matrix.postScale(fMin, fMin);
/* 408 */                                               if (nr2.f14417a) {
/* 412 */                                                   Picture picture = new Picture();
/* 415 */                                                   Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
/* 419 */                                                   canvasBeginRecording.concat(matrix);
/* 422 */                                                   view5.draw(canvasBeginRecording);
/* 425 */                                                   picture.endRecording();
/* 1 */                                                     bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                                        } else {
/* 435 */                                                   bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
/* 441 */                                                   Canvas canvas = new Canvas(bitmapCreateBitmap);
/* 444 */                                                   canvas.concat(matrix);
/* 447 */                                                   view5.draw(canvas);
                                                        }
                                                    }
/* 455 */                                           if (!zIsAttachedToWindow) {
/* 461 */                                               viewGroup.getOverlay().remove(view5);
/* 464 */                                               viewGroup2.addView(view5, i3);
                                                    }
/* 467 */                                           if (bitmapCreateBitmap != null) {
/* 469 */                                               imageView.setImageBitmap(bitmapCreateBitmap);
                                                    }
/* 486 */                                           imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
/* 489 */                                           imageView.layout(iRound2, iRound3, iRound4, iRound5);
/* 492 */                                           view7 = imageView;
                                                }
/* 493 */                                       i4 = i2;
/* 495 */                                       view3 = view2;
                                            } else {
/* 525 */                                       i = i5;
/* 527 */                                       c = 1;
/* 529 */                                       i2 = 0;
/* 531 */                                       view2 = view;
/* 533 */                                       animator = null;
                                            }
/* 535 */                                   view7 = view6;
/* 493 */                                   i4 = i2;
/* 495 */                                   view3 = view2;
                                        }
                                    } else {
/* 127 */                               if (i5 == 4 || view5 == view6) {
/* 132 */                                   view = view6;
/* 133 */                                   z = false;
/* 134 */                                   view6 = null;
                                        }
/* 144 */                               if (!z) {
/* 525 */                                   i = i5;
/* 527 */                                   c = 1;
/* 529 */                                   i2 = 0;
/* 531 */                                   view2 = view;
/* 533 */                                   animator = null;
/* 535 */                                   view7 = view6;
/* 493 */                                   i4 = i2;
/* 495 */                                   view3 = view2;
                                        } else if (view5.getParent() == null) {
/* 152 */                                   i = i5;
/* 154 */                                   c = 1;
/* 156 */                                   i4 = 0;
/* 157 */                                   i2 = 0;
/* 159 */                                   view3 = view;
/* 160 */                                   animator = null;
/* 162 */                                   view7 = view5;
                                        } else {
/* 171 */                                   if (view5.getParent() instanceof View) {
/* 177 */                                       view4 = (View) view5.getParent();
/* 193 */                                       if (m1114I(m1100q(view4, true), m1099n(view4, true)).f2243a) {
/* 195 */                                           boolean z3 = nr2.f14417a;
/* 199 */                                           Matrix matrix2 = new Matrix();
/* 214 */                                           matrix2.setTranslate(-view4.getScrollX(), -view4.getScrollY());
/* 217 */                                           n53 n53Var2 = l53.f13119a;
/* 219 */                                           n53Var2.mo6893S(view5, matrix2);
/* 222 */                                           n53Var2.mo6894T(viewGroup, matrix2);
/* 238 */                                           RectF rectF2 = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
/* 241 */                                           matrix2.mapRect(rectF2);
/* 246 */                                           int iRound9 = Math.round(rectF2.left);
/* 252 */                                           int iRound10 = Math.round(rectF2.top);
/* 258 */                                           int iRound11 = Math.round(rectF2.right);
/* 264 */                                           int iRound12 = Math.round(rectF2.bottom);
/* 268 */                                           animator = null;
/* 272 */                                           c = 1;
/* 278 */                                           imageView = new ImageView(view5.getContext());
/* 283 */                                           imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
/* 286 */                                           zIsAttachedToWindow = view5.isAttachedToWindow();
/* 290 */                                           if (viewGroup == null) {
/* 292 */                                               zIsAttachedToWindow2 = false;
                                                    } else {
/* 295 */                                               zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                                    }
/* 299 */                                           if (zIsAttachedToWindow) {
/* 301 */                                               if (zIsAttachedToWindow2) {
/* 303 */                                                   i = i5;
/* 305 */                                                   i2 = 0;
/* 307 */                                                   view2 = view;
/* 309 */                                                   bitmapCreateBitmap = null;
                                                        } else {
/* 317 */                                                   i2 = 0;
/* 321 */                                                   viewGroup2 = (ViewGroup) view5.getParent();
/* 323 */                                                   int iIndexOfChild2 = viewGroup2.indexOfChild(view5);
/* 331 */                                                   viewGroup.getOverlay().add(view5);
/* 334 */                                                   i3 = iIndexOfChild2;
                                                        }
/* 467 */                                               if (bitmapCreateBitmap != null) {
/* 469 */                                                   imageView.setImageBitmap(bitmapCreateBitmap);
                                                        }
/* 486 */                                               imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
/* 489 */                                               imageView.layout(iRound9, iRound10, iRound11, iRound12);
/* 492 */                                               view7 = imageView;
                                                    } else {
/* 337 */                                               i2 = 0;
/* 339 */                                               viewGroup2 = null;
/* 341 */                                               i3 = 0;
                                                    }
/* 349 */                                           iRound = Math.round(rectF2.width());
/* 357 */                                           view2 = view;
/* 359 */                                           int iRound13 = Math.round(rectF2.height());
/* 363 */                                           if (iRound > 0) {
/* 451 */                                               i = i5;
/* 453 */                                               bitmapCreateBitmap = null;
                                                    } else {
/* 451 */                                               i = i5;
/* 453 */                                               bitmapCreateBitmap = null;
                                                    }
/* 455 */                                           if (!zIsAttachedToWindow) {
/* 461 */                                               viewGroup.getOverlay().remove(view5);
/* 464 */                                               viewGroup2.addView(view5, i3);
                                                    }
/* 467 */                                           if (bitmapCreateBitmap != null) {
/* 469 */                                               imageView.setImageBitmap(bitmapCreateBitmap);
                                                    }
/* 486 */                                           imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
/* 489 */                                           imageView.layout(iRound9, iRound10, iRound11, iRound12);
/* 492 */                                           view7 = imageView;
                                                } else {
/* 498 */                                           i = i5;
/* 500 */                                           c = 1;
/* 502 */                                           i2 = 0;
/* 504 */                                           view2 = view;
/* 506 */                                           animator = null;
/* 508 */                                           id = view4.getId();
/* 516 */                                           if (view4.getParent() == null) {
/* 521 */                                               viewGroup.findViewById(id);
                                                    }
                                                }
/* 493 */                                       i4 = i2;
/* 495 */                                       view3 = view2;
                                            } else {
/* 525 */                                       i = i5;
/* 527 */                                       c = 1;
/* 529 */                                       i2 = 0;
/* 531 */                                       view2 = view;
/* 533 */                                       animator = null;
                                            }
/* 535 */                                   view7 = view6;
/* 493 */                                   i4 = i2;
/* 495 */                                   view3 = view2;
                                        }
                                    }
/* 136 */                           z = true;
/* 137 */                           view6 = null;
/* 138 */                           view = null;
/* 144 */                           if (!z) {
/* 525 */                               i = i5;
/* 527 */                               c = 1;
/* 529 */                               i2 = 0;
/* 531 */                               view2 = view;
/* 533 */                               animator = null;
/* 535 */                               view7 = view6;
/* 493 */                               i4 = i2;
/* 495 */                               view3 = view2;
                                    } else if (view5.getParent() == null) {
/* 152 */                               i = i5;
/* 154 */                               c = 1;
/* 156 */                               i4 = 0;
/* 157 */                               i2 = 0;
/* 159 */                               view3 = view;
/* 160 */                               animator = null;
/* 162 */                               view7 = view5;
                                    } else {
/* 171 */                               if (view5.getParent() instanceof View) {
/* 177 */                                   view4 = (View) view5.getParent();
/* 193 */                                   if (m1114I(m1100q(view4, true), m1099n(view4, true)).f2243a) {
/* 195 */                                       boolean z4 = nr2.f14417a;
/* 199 */                                       Matrix matrix3 = new Matrix();
/* 214 */                                       matrix3.setTranslate(-view4.getScrollX(), -view4.getScrollY());
/* 217 */                                       n53 n53Var3 = l53.f13119a;
/* 219 */                                       n53Var3.mo6893S(view5, matrix3);
/* 222 */                                       n53Var3.mo6894T(viewGroup, matrix3);
/* 238 */                                       RectF rectF3 = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
/* 241 */                                       matrix3.mapRect(rectF3);
/* 246 */                                       int iRound14 = Math.round(rectF3.left);
/* 252 */                                       int iRound15 = Math.round(rectF3.top);
/* 258 */                                       int iRound16 = Math.round(rectF3.right);
/* 264 */                                       int iRound17 = Math.round(rectF3.bottom);
/* 268 */                                       animator = null;
/* 272 */                                       c = 1;
/* 278 */                                       imageView = new ImageView(view5.getContext());
/* 283 */                                       imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
/* 286 */                                       zIsAttachedToWindow = view5.isAttachedToWindow();
/* 290 */                                       if (viewGroup == null) {
/* 292 */                                           zIsAttachedToWindow2 = false;
                                                } else {
/* 295 */                                           zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                                }
/* 299 */                                       if (zIsAttachedToWindow) {
/* 301 */                                           if (zIsAttachedToWindow2) {
/* 303 */                                               i = i5;
/* 305 */                                               i2 = 0;
/* 307 */                                               view2 = view;
/* 309 */                                               bitmapCreateBitmap = null;
                                                    } else {
/* 317 */                                               i2 = 0;
/* 321 */                                               viewGroup2 = (ViewGroup) view5.getParent();
/* 323 */                                               int iIndexOfChild3 = viewGroup2.indexOfChild(view5);
/* 331 */                                               viewGroup.getOverlay().add(view5);
/* 334 */                                               i3 = iIndexOfChild3;
                                                    }
/* 467 */                                           if (bitmapCreateBitmap != null) {
/* 469 */                                               imageView.setImageBitmap(bitmapCreateBitmap);
                                                    }
/* 486 */                                           imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound16 - iRound14, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824));
/* 489 */                                           imageView.layout(iRound14, iRound15, iRound16, iRound17);
/* 492 */                                           view7 = imageView;
                                                } else {
/* 337 */                                           i2 = 0;
/* 339 */                                           viewGroup2 = null;
/* 341 */                                           i3 = 0;
                                                }
/* 349 */                                       iRound = Math.round(rectF3.width());
/* 357 */                                       view2 = view;
/* 359 */                                       int iRound18 = Math.round(rectF3.height());
/* 363 */                                       if (iRound > 0) {
/* 451 */                                           i = i5;
/* 453 */                                           bitmapCreateBitmap = null;
                                                } else {
/* 451 */                                           i = i5;
/* 453 */                                           bitmapCreateBitmap = null;
                                                }
/* 455 */                                       if (!zIsAttachedToWindow) {
/* 461 */                                           viewGroup.getOverlay().remove(view5);
/* 464 */                                           viewGroup2.addView(view5, i3);
                                                }
/* 467 */                                       if (bitmapCreateBitmap != null) {
/* 469 */                                           imageView.setImageBitmap(bitmapCreateBitmap);
                                                }
/* 486 */                                       imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound16 - iRound14, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824));
/* 489 */                                       imageView.layout(iRound14, iRound15, iRound16, iRound17);
/* 492 */                                       view7 = imageView;
                                            } else {
/* 498 */                                       i = i5;
/* 500 */                                       c = 1;
/* 502 */                                       i2 = 0;
/* 504 */                                       view2 = view;
/* 506 */                                       animator = null;
/* 508 */                                       id = view4.getId();
/* 516 */                                       if (view4.getParent() == null) {
/* 521 */                                           viewGroup.findViewById(id);
                                                }
                                            }
/* 493 */                                   i4 = i2;
/* 495 */                                   view3 = view2;
                                        } else {
/* 525 */                                   i = i5;
/* 527 */                                   c = 1;
/* 529 */                                   i2 = 0;
/* 531 */                                   view2 = view;
/* 533 */                                   animator = null;
                                        }
/* 535 */                               view7 = view6;
/* 493 */                               i4 = i2;
/* 495 */                               view3 = view2;
                                    }
                                }
/* 537 */                       if (view7 == null) {
/* 624 */                           if (view3 == null) {
/* 662 */                               return animator;
                                    }
/* 626 */                           int visibility = view3.getVisibility();
/* 632 */                           l53.m6344c(i2, view3);
/* 635 */                           Animator animatorMo1074K = mo1074K(viewGroup, view3, or2Var);
/* 639 */                           if (animatorMo1074K == null) {
/* 658 */                               l53.m6344c(visibility, view3);
/* 661 */                               return animatorMo1074K;
                                    }
/* 645 */                           a63 a63Var = new a63(view3, i);
/* 648 */                           animatorMo1074K.addListener(a63Var);
/* 651 */                           animatorMo1074K.addPauseListener(a63Var);
/* 654 */                           m1090a(a63Var);
/* 657 */                           return animatorMo1074K;
                                }
/* 539 */                       if (i4 == 0) {
/* 549 */                           int[] iArr = (int[]) or2Var.f14872a.get("android:visibility:screenLocation");
/* 551 */                           int i6 = iArr[i2];
/* 553 */                           int i7 = iArr[c];
/* 556 */                           int[] iArr2 = new int[2];
/* 558 */                           viewGroup.getLocationOnScreen(iArr2);
/* 569 */                           view7.offsetLeftAndRight((i6 - iArr2[i2]) - view7.getLeft());
/* 580 */                           view7.offsetTopAndBottom((i7 - iArr2[c]) - view7.getTop());
/* 587 */                           viewGroup.getOverlay().add(view7);
                                }
/* 592 */                       Animator animatorMo1074K2 = mo1074K(viewGroup, view7, or2Var);
/* 596 */                       if (i4 == 0) {
/* 598 */                           if (animatorMo1074K2 == null) {
/* 604 */                               viewGroup.getOverlay().remove(view7);
/* 607 */                               return animatorMo1074K2;
                                    }
/* 610 */                           view5.setTag(R$id.save_overlay_view, view7);
/* 618 */                           m1090a(new z53(this, viewGroup, view7, view5));
                                }
/* 621 */                       return animatorMo1074K2;
                            }
                        } else if ((this.f1914j0 & 1) == 1 && or2Var2 != null) {
/* 44 */                    View view8 = or2Var2.f14873b;
/* 46 */                    if (or2Var == null) {
/* 52 */                        View view9 = (View) view8.getParent();
                            }
/* 71 */                    return mo1073J(viewGroup, view8, or2Var, or2Var2);
                        }
                    }
/* 26 */            return null;
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: p */
                public final String[] mo1068p() {
/* 1 */             return f1913k0;
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: r */
                public final boolean mo1101r(or2 or2Var, or2 or2Var2) {
/* 1 */             if (or2Var == null && or2Var2 == null) {
/* 45 */                return false;
                    }
/* 6 */             if (or2Var != null && or2Var2 != null && or2Var2.f14872a.containsKey("android:visibility:visibility") != or2Var.f14872a.containsKey("android:visibility:visibility")) {
/* 45 */                return false;
                    }
/* 27 */            b63 b63VarM1114I = m1114I(or2Var, or2Var2);
/* 33 */            if (b63VarM1114I.f2243a) {
                        return b63VarM1114I.f2245c == 0 || b63VarM1114I.f2246d == 0;
                    }
/* 45 */            return false;
                }

/* 37 */        public Visibility() {
/* 39 */            this.f1914j0 = 3;
                }
            }
