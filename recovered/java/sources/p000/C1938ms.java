            package p000;

            import android.graphics.Matrix;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.util.Property;
            import android.view.View;
            import android.widget.ImageView;
            import androidx.appcompat.widget.SwitchCompat;
            import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.Arrays;
            import java.util.WeakHashMap;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: ms */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1938ms extends Property {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13990a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1938ms(String str, Class cls, int i) {
/* 3 */             super(cls, str);
/* 1 */             this.f13990a = i;
                }

                @Override // android.util.Property
                public final Object get(Object obj) {
                    switch (this.f13990a) {
                        case 0:
/* 3 */                     return null;
                        case 1:
/* 3 */                     return null;
                        case 2:
/* 3 */                     return null;
                        case 3:
/* 3 */                     return null;
                        case 4:
/* 3 */                     return null;
                        case 5:
/* 3 */                     return null;
                        case 6:
/* 3 */                     return null;
                        case 7:
/* 3 */                     return null;
                        case 8:
/* 136 */                   return Float.valueOf(((C2120qu) obj).f15748i);
                        case 9:
/* 127 */                   return Float.valueOf(((C2120qu) obj).f15749j);
                        case 10:
/* 118 */                   return Float.valueOf(((y90) obj).m10127b());
                        case 11:
/* 107 */                   return Float.valueOf(((View) obj).getLayoutParams().width);
                        case 12:
/* 93 */                    return Float.valueOf(((View) obj).getLayoutParams().height);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 72 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 79 */                    return Float.valueOf(((View) obj).getPaddingStart());
                        case 14:
/* 58 */                    WeakHashMap weakHashMap2 = e33.f7494a;
/* 65 */                    return Float.valueOf(((View) obj).getPaddingEnd());
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 51 */                    return Float.valueOf(((p71) obj).f15009i);
                        case 16:
/* 42 */                    return Float.valueOf(((r71) obj).f15907j);
                        case 17:
/* 33 */                    return Float.valueOf(((SwitchCompat) obj).f670n0);
                        case 18:
/* 24 */                    return Float.valueOf(l53.f13119a.mo7104u((View) obj));
                        default:
/* 9 */                     WeakHashMap weakHashMap3 = e33.f7494a;
/* 11 */                    return ((View) obj).getClipBounds();
                    }
                }

                @Override // android.util.Property
                public final void set(Object obj, Object obj2) {
                    switch (this.f13990a) {
                        case 0:
/* 788 */                   C2118qs c2118qs = (C2118qs) obj;
/* 790 */                   PointF pointF = (PointF) obj2;
/* 792 */                   c2118qs.getClass();
/* 801 */                   c2118qs.f15719a = Math.round(pointF.x);
/* 805 */                   int iRound = Math.round(pointF.y);
/* 809 */                   c2118qs.f15720b = iRound;
/* 813 */                   int i = c2118qs.f15724f + 1;
/* 814 */                   c2118qs.f15724f = i;
/* 818 */                   if (i == c2118qs.f15725g) {
/* 828 */                       l53.m6342a(c2118qs.f15723e, c2118qs.f15719a, iRound, c2118qs.f15721c, c2118qs.f15722d);
/* 831 */                       c2118qs.f15724f = 0;
/* 833 */                       c2118qs.f15725g = 0;
                            }
                            break;
                        case 1:
/* 740 */                   C2118qs c2118qs2 = (C2118qs) obj;
/* 742 */                   PointF pointF2 = (PointF) obj2;
/* 744 */                   c2118qs2.getClass();
/* 753 */                   c2118qs2.f15721c = Math.round(pointF2.x);
/* 757 */                   int iRound2 = Math.round(pointF2.y);
/* 761 */                   c2118qs2.f15722d = iRound2;
/* 765 */                   int i2 = c2118qs2.f15725g + 1;
/* 766 */                   c2118qs2.f15725g = i2;
/* 770 */                   if (c2118qs2.f15724f == i2) {
/* 780 */                       l53.m6342a(c2118qs2.f15723e, c2118qs2.f15719a, c2118qs2.f15720b, c2118qs2.f15721c, iRound2);
/* 783 */                       c2118qs2.f15724f = 0;
/* 785 */                       c2118qs2.f15725g = 0;
                            }
                            break;
                        case 2:
/* 712 */                   View view = (View) obj;
/* 714 */                   PointF pointF3 = (PointF) obj2;
/* 736 */                   l53.m6342a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                            break;
                        case 3:
/* 684 */                   View view2 = (View) obj;
/* 686 */                   PointF pointF4 = (PointF) obj2;
/* 708 */                   l53.m6342a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                            break;
                        case 4:
/* 654 */                   View view3 = (View) obj;
/* 656 */                   PointF pointF5 = (PointF) obj2;
/* 660 */                   int iRound3 = Math.round(pointF5.x);
/* 666 */                   int iRound4 = Math.round(pointF5.y);
/* 680 */                   l53.m6342a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                            break;
                        case 5:
/* 586 */                   ImageView imageView = (ImageView) obj;
/* 588 */                   Matrix matrix = (Matrix) obj2;
/* 594 */                   if (Build.VERSION.SDK_INT >= 29) {
/* 1 */                         imageView.animateTransform(matrix);
                            } else if (matrix == null) {
/* 602 */                       Drawable drawable = imageView.getDrawable();
/* 606 */                       if (drawable != null) {
/* 636 */                           drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
/* 639 */                           imageView.invalidate();
                                }
                            } else if (j13.f12010t) {
                                try {
/* 1 */                             imageView.animateTransform(matrix);
                                } catch (NoSuchMethodError unused) {
/* 651 */                           j13.f12010t = false;
/* 653 */                           return;
                                }
                            }
                            break;
                        case 6:
/* 572 */                   C2305vs c2305vs = (C2305vs) obj;
/* 574 */                   float[] fArr = (float[]) obj2;
/* 579 */                   System.arraycopy(fArr, 0, c2305vs.f18334c, 0, fArr.length);
/* 582 */                   c2305vs.m9340a();
                            break;
                        case 7:
/* 553 */                   C2305vs c2305vs2 = (C2305vs) obj;
/* 555 */                   PointF pointF6 = (PointF) obj2;
/* 557 */                   c2305vs2.getClass();
/* 562 */                   c2305vs2.f18335d = pointF6.x;
/* 566 */                   c2305vs2.f18336e = pointF6.y;
/* 568 */                   c2305vs2.m9340a();
                            break;
                        case 8:
/* 362 */                   C2120qu c2120qu = (C2120qu) obj;
/* 366 */                   float fFloatValue = ((Float) obj2).floatValue();
/* 370 */                   c2120qu.f15748i = fFloatValue;
/* 376 */                   int i3 = (int) (5400.0f * fFloatValue);
/* 377 */                   xg0 xg0Var = c2120qu.f15745f;
/* 381 */                   float[] fArr2 = (float[]) c2120qu.f13034b;
/* 385 */                   float f = fFloatValue * 1520.0f;
/* 389 */                   fArr2[0] = (-20.0f) + f;
/* 391 */                   fArr2[1] = f;
/* 394 */                   for (int i4 = 0; i4 < 4; i4++) {
/* 414 */                       fArr2[1] = (xg0Var.getInterpolation((i3 - C2120qu.f15738l[i4]) / 667.0f) * 250.0f) + fArr2[1];
/* 432 */                       fArr2[0] = (xg0Var.getInterpolation((i3 - C2120qu.f15739m[i4]) / 667.0f) * 250.0f) + fArr2[0];
                            }
/* 437 */                   float f2 = fArr2[0];
/* 439 */                   float f3 = fArr2[1];
/* 446 */                   float f4 = ((f3 - f2) * c2120qu.f15749j) + f2;
/* 447 */                   fArr2[0] = f4;
/* 452 */                   fArr2[0] = f4 / 360.0f;
/* 455 */                   fArr2[1] = f3 / 360.0f;
/* 457 */                   CircularProgressIndicatorSpec circularProgressIndicatorSpec = c2120qu.f15746g;
/* 460 */                   for (int i5 = 0; i5 < 4; i5++) {
/* 469 */                       float f5 = (i3 - C2120qu.f15740n[i5]) / 333.0f;
/* 472 */                       if (f5 >= 0.0f && f5 <= 1.0f) {
/* 480 */                           int i6 = i5 + c2120qu.f15747h;
/* 481 */                           int[] iArr = circularProgressIndicatorSpec.f14764c;
/* 484 */                           int length = i6 % iArr.length;
/* 488 */                           int length2 = (length + 1) % iArr.length;
/* 539 */                           ((int[]) c2120qu.f13035c)[0] = C2493yc.m10142a(xg0Var.getInterpolation(f5), Integer.valueOf(xe2.m9772j(iArr[length], ((lx0) c2120qu.f13033a).f19528U)), Integer.valueOf(xe2.m9772j(circularProgressIndicatorSpec.f14764c[length2], ((lx0) c2120qu.f13033a).f19528U))).intValue();
/* 549 */                           ((lx0) c2120qu.f13033a).invalidateSelf();
                                }
                                break;
                            }
/* 549 */                   ((lx0) c2120qu.f13033a).invalidateSelf();
                            break;
                        case 9:
/* 359 */                   ((C2120qu) obj).f15749j = ((Float) obj2).floatValue();
                            break;
                        case 10:
/* 331 */                   y90 y90Var = (y90) obj;
/* 335 */                   float fFloatValue2 = ((Float) obj2).floatValue();
/* 343 */                   if (y90Var.f19536v != fFloatValue2) {
/* 345 */                       y90Var.f19536v = fFloatValue2;
/* 347 */                       y90Var.invalidateSelf();
                            }
                            break;
                        case 11:
/* 313 */                   View view4 = (View) obj;
/* 325 */                   view4.getLayoutParams().width = ((Float) obj2).intValue();
/* 327 */                   view4.requestLayout();
                            break;
                        case 12:
/* 295 */                   View view5 = (View) obj;
/* 307 */                   view5.getLayoutParams().height = ((Float) obj2).intValue();
/* 309 */                   view5.requestLayout();
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 269 */                   View view6 = (View) obj;
/* 273 */                   int iIntValue = ((Float) obj2).intValue();
/* 277 */                   int paddingTop = view6.getPaddingTop();
/* 281 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 291 */                   view6.setPaddingRelative(iIntValue, paddingTop, view6.getPaddingEnd(), view6.getPaddingBottom());
                            break;
                        case 14:
/* 243 */                   View view7 = (View) obj;
/* 247 */                   WeakHashMap weakHashMap2 = e33.f7494a;
/* 265 */                   view7.setPaddingRelative(view7.getPaddingStart(), view7.getPaddingTop(), ((Float) obj2).intValue(), view7.getPaddingBottom());
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 146 */                   p71 p71Var = (p71) obj;
/* 150 */                   float fFloatValue3 = ((Float) obj2).floatValue();
/* 154 */                   p71Var.f15009i = fFloatValue3;
/* 160 */                   float[] fArr3 = (float[]) p71Var.f13034b;
/* 162 */                   fArr3[0] = 0.0f;
/* 165 */                   float f6 = ((int) (fFloatValue3 * 333.0f)) / 667.0f;
/* 166 */                   xg0 xg0Var2 = p71Var.f15005e;
/* 168 */                   float interpolation = xg0Var2.getInterpolation(f6);
/* 173 */                   fArr3[2] = interpolation;
/* 175 */                   fArr3[1] = interpolation;
/* 181 */                   float interpolation2 = xg0Var2.getInterpolation(f6 + 0.49925038f);
/* 185 */                   fArr3[4] = interpolation2;
/* 188 */                   fArr3[3] = interpolation2;
/* 191 */                   fArr3[5] = 1.0f;
/* 195 */                   if (p71Var.f15008h && interpolation2 < 1.0f) {
/* 203 */                       int[] iArr2 = (int[]) p71Var.f13035c;
/* 207 */                       iArr2[2] = iArr2[1];
/* 211 */                       iArr2[1] = iArr2[0];
/* 231 */                       iArr2[0] = xe2.m9772j(p71Var.f15006f.f14764c[p71Var.f15007g], ((lx0) p71Var.f13033a).f19528U);
/* 233 */                       p71Var.f15008h = false;
                            }
/* 239 */                   ((lx0) p71Var.f13033a).invalidateSelf();
                            break;
                        case 16:
/* 52 */                    r71 r71Var = (r71) obj;
/* 56 */                    float fFloatValue4 = ((Float) obj2).floatValue();
/* 60 */                    r71Var.f15907j = fFloatValue4;
/* 65 */                    int i7 = (int) (fFloatValue4 * 1800.0f);
/* 67 */                    for (int i8 = 0; i8 < 4; i8++) {
/* 102 */                       ((float[]) r71Var.f13034b)[i8] = Math.max(0.0f, Math.min(1.0f, r71Var.f15903f[i8].getInterpolation((i7 - r71.f15899m[i8]) / r71.f15898l[i8])));
                            }
/* 109 */                   if (r71Var.f15906i) {
/* 133 */                       Arrays.fill((int[]) r71Var.f13035c, xe2.m9772j(r71Var.f15904g.f14764c[r71Var.f15905h], ((lx0) r71Var.f13033a).f19528U));
/* 136 */                       r71Var.f15906i = false;
                            }
/* 142 */                   ((lx0) r71Var.f13033a).invalidateSelf();
                            break;
                        case 17:
/* 48 */                    ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                            break;
                        case 18:
/* 36 */                    l53.m6343b((View) obj, ((Float) obj2).floatValue());
                            break;
                        default:
/* 22 */                    WeakHashMap weakHashMap3 = e33.f7494a;
/* 24 */                    ((View) obj).setClipBounds((Rect) obj2);
                            break;
                    }
                }
            }
