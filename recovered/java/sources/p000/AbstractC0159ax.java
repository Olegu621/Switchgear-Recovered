            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.Color;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.util.StateSet;
            import android.util.TypedValue;
            import android.util.Xml;
            import androidx.core.R$attr;
            import androidx.core.R$styleable;
            import java.io.IOException;
            import java.lang.reflect.Array;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: renamed from: ax */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0159ax {

                /* JADX INFO: renamed from: a */
                public static final ThreadLocal f2131a = new ThreadLocal();

                /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
                /* JADX INFO: renamed from: a */
                public static ColorStateList m1176a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
                    int next;
                    boolean z;
                    int i;
                    int depth;
                    int color;
                    float f;
                    int iM5649k;
/* 1 */             resources = resources;
/* 3 */             theme = theme;
/* 5 */             AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
/* 17 */            do {
/* 9 */                 next = xmlResourceParser.next();
/* 13 */                z = true;
/* 14 */                i = 2;
/* 15 */                if (next == 2) {
                            break;
                        }
/* 17 */            } while (next != 1);
/* 20 */            if (next != 2) {
/* 926 */               throw new XmlPullParserException("No start tag found");
                    }
/* 22 */            String name = xmlResourceParser.getName();
/* 32 */            if (!name.equals("selector")) {
/* 918 */               throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
                    }
/* 38 */            int depth2 = xmlResourceParser.getDepth() + 1;
/* 41 */            Object[] objArr = new int[20][];
/* 43 */            int[] iArr = new int[20];
/* 45 */            int i2 = 0;
/* 46 */            int i3 = 0;
                    while (true) {
/* 47 */                int next2 = xmlResourceParser.next();
/* 51 */                if (next2 == z || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                            break;
                        }
/* 62 */                if (next2 == i && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
/* 88 */                    int[] iArr2 = R$styleable.ColorStateListItem;
/* 97 */                    TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, i2, i2);
/* 104 */                   int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.ColorStateListItem_android_color, -1);
/* 113 */                   if (resourceId != -1) {
/* 115 */                       ThreadLocal threadLocal = f2131a;
/* 121 */                       TypedValue typedValue = (TypedValue) threadLocal.get();
/* 123 */                       if (typedValue == null) {
/* 127 */                           typedValue = new TypedValue();
/* 130 */                           threadLocal.set(typedValue);
                                }
/* 133 */                       resources.getValue(resourceId, typedValue, z);
/* 136 */                       int i4 = typedValue.type;
/* 140 */                       if (i4 < 28 || i4 > 31) {
                                    try {
/* 153 */                               color = m1176a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                                    } catch (Exception unused) {
/* 160 */                               color = typedArrayObtainAttributes.getColor(R$styleable.ColorStateListItem_android_color, -65281);
                                    }
                                } else {
/* 167 */                           color = typedArrayObtainAttributes.getColor(R$styleable.ColorStateListItem_android_color, -65281);
                                }
                            } else {
/* 167 */                       color = typedArrayObtainAttributes.getColor(R$styleable.ColorStateListItem_android_color, -65281);
                            }
/* 177 */                   float f2 = 1.0f;
/* 179 */                   if (typedArrayObtainAttributes.hasValue(R$styleable.ColorStateListItem_android_alpha)) {
/* 183 */                       f = typedArrayObtainAttributes.getFloat(R$styleable.ColorStateListItem_android_alpha, 1.0f);
                            } else {
/* 203 */                       f = typedArrayObtainAttributes.hasValue(R$styleable.ColorStateListItem_alpha) ? typedArrayObtainAttributes.getFloat(R$styleable.ColorStateListItem_alpha, 1.0f) : 1.0f;
                            }
/* 206 */                   boolean z2 = z;
/* 229 */                   float f3 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(R$styleable.ColorStateListItem_android_lStar)) ? typedArrayObtainAttributes.getFloat(R$styleable.ColorStateListItem_lStar, -1.0f) : typedArrayObtainAttributes.getFloat(R$styleable.ColorStateListItem_android_lStar, -1.0f);
/* 233 */                   typedArrayObtainAttributes.recycle();
/* 236 */                   int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
/* 240 */                   int[] iArr3 = new int[attributeCount];
/* 242 */                   int i5 = i;
/* 244 */                   int i6 = i2;
/* 245 */                   int i7 = i6;
/* 246 */                   while (i7 < attributeCount) {
/* 248 */                       float f4 = f2;
/* 250 */                       int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i7);
/* 257 */                       if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R$attr.alpha && attributeNameResource != R$attr.lStar) {
/* 272 */                           int i8 = i6 + 1;
/* 279 */                           if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i7, false)) {
/* 282 */                               attributeNameResource = -attributeNameResource;
                                    }
/* 283 */                           iArr3[i6] = attributeNameResource;
/* 285 */                           i6 = i8;
                                }
/* 286 */                       i7++;
/* 290 */                       f2 = f4;
                            }
/* 294 */                   float f5 = f2;
/* 296 */                   int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i6);
/* 303 */                   float f6 = 100.0f;
/* 314 */                   Object[] objArr2 = (f3 < 0.0f || f3 > 100.0f) ? null : z2 ? 1 : 0;
/* 317 */                   if (f == f5 && objArr2 == null) {
/* 321 */                       iArrTrimStateSet = iArrTrimStateSet;
/* 323 */                       attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 325 */                       depth2 = depth2;
                            } else {
/* 342 */                       int iM7892c = qj3.m7892c((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
/* 346 */                       if (objArr2 != null) {
/* 348 */                           C2556zm c2556zmM10402b = C2556zm.m10402b(color);
/* 352 */                           float f7 = c2556zmM10402b.f20244a;
/* 354 */                           float f8 = c2556zmM10402b.f20245b;
/* 356 */                           p53 p53Var = p53.f14967k;
/* 363 */                           if (f8 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
/* 403 */                               float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
/* 407 */                               float f9 = 0.0f;
/* 411 */                               float f10 = f8;
/* 412 */                               Object[] objArr3 = z2 ? 1 : 0;
/* 414 */                               C2556zm c2556zm = null;
                                        while (true) {
/* 426 */                                   if (Math.abs(f9 - f8) < 0.4f) {
/* 750 */                                       iArrTrimStateSet = iArrTrimStateSet;
/* 752 */                                       attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 754 */                                       depth2 = depth2;
/* 756 */                                       if (c2556zm != null) {
/* 763 */                                           iM5649k = c2556zm.m10405d(p53Var);
                                                    break;
                                                }
/* 758 */                                       iM5649k = j13.m5649k(f3);
                                                break;
                                            }
/* 428 */                                   float f11 = 1000.0f;
/* 430 */                                   float f12 = f6;
/* 432 */                                   float f13 = 0.0f;
/* 434 */                                   float f14 = 1000.0f;
/* 436 */                                   C2556zm c2556zm2 = null;
                                            while (true) {
/* 451 */                                       if (Math.abs(f13 - f12) <= 0.01f) {
/* 686 */                                           iArrTrimStateSet = iArrTrimStateSet;
/* 688 */                                           attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 690 */                                           depth2 = depth2;
/* 692 */                                           f6 = f6;
                                                    break;
                                                }
/* 457 */                                       f6 = f6;
/* 459 */                                       float f15 = ((f12 - f13) / 2.0f) + f13;
/* 465 */                                       iArrTrimStateSet = iArrTrimStateSet;
/* 469 */                                       int iM10405d = C2556zm.m10403c(f15, f10, fMin).m10405d(p53.f14967k);
/* 477 */                                       float fM5652n = j13.m5652n(Color.red(iM10405d));
/* 485 */                                       float fM5652n2 = j13.m5652n(Color.green(iM10405d));
/* 493 */                                       float fM5652n3 = j13.m5652n(Color.blue(iM10405d));
/* 499 */                                       float[] fArr = j13.f11995e[z2 ? 1 : 0];
/* 519 */                                       float f16 = ((fM5652n3 * fArr[i5]) + ((fM5652n2 * fArr[z2 ? 1 : 0]) + (fM5652n * fArr[0]))) / f6;
/* 549 */                                       float fCbrt = f16 <= 0.008856452f ? f16 * 903.2963f : (((float) Math.cbrt(f16)) * 116.0f) - 16.0f;
/* 553 */                                       float fAbs = Math.abs(f3 - fCbrt);
/* 562 */                                       if (fAbs < 0.2f) {
/* 564 */                                           C2556zm c2556zmM10402b2 = C2556zm.m10402b(iM10405d);
/* 572 */                                           attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 576 */                                           C2556zm c2556zmM10403c = C2556zm.m10403c(c2556zmM10402b2.f20246c, c2556zmM10402b2.f20245b, fMin);
/* 586 */                                           float f17 = c2556zmM10402b2.f20247d - c2556zmM10403c.f20247d;
/* 596 */                                           float f18 = c2556zmM10402b2.f20248e - c2556zmM10403c.f20248e;
/* 604 */                                           float f19 = c2556zmM10402b2.f20249f - c2556zmM10403c.f20249f;
/* 621 */                                           depth2 = depth2;
/* 638 */                                           float fPow = (float) (Math.pow(Math.sqrt((f19 * f19) + (f18 * f18) + (f17 * f17)), 0.63d) * 1.41d);
/* 641 */                                           if (fPow <= f5) {
/* 643 */                                               f14 = fPow;
/* 645 */                                               f11 = fAbs;
/* 647 */                                               c2556zm2 = c2556zmM10402b2;
                                                    }
                                                } else {
/* 650 */                                           attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 652 */                                           depth2 = depth2;
                                                }
/* 656 */                                       if (f11 == 0.0f && f14 == 0.0f) {
                                                    break;
                                                }
/* 667 */                                       if (fCbrt < f3) {
/* 669 */                                           f13 = f15;
                                                } else {
/* 672 */                                           f12 = f15;
                                                }
/* 676 */                                       f6 = f6;
/* 678 */                                       iArrTrimStateSet = iArrTrimStateSet;
/* 680 */                                       attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 682 */                                       depth2 = depth2;
                                            }
/* 662 */                                   C2556zm c2556zm3 = c2556zm2;
/* 695 */                                   if (objArr3 == null) {
/* 725 */                                       if (c2556zm3 == null) {
/* 727 */                                           f8 = f10;
                                                } else {
/* 729 */                                           c2556zm = c2556zm3;
/* 730 */                                           f9 = f10;
                                                }
/* 736 */                                       f10 = ((f8 - f9) / 2.0f) + f9;
                                            } else {
/* 697 */                                       if (c2556zm3 != null) {
/* 699 */                                           iM5649k = c2556zm3.m10405d(p53Var);
                                                    break;
                                                }
/* 709 */                                       f10 = ((f8 - f9) / 2.0f) + f9;
/* 721 */                                       objArr3 = null;
                                            }
                                        }
                                    } else {
/* 387 */                               iArrTrimStateSet = iArrTrimStateSet;
/* 389 */                               attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 391 */                               depth2 = depth2;
/* 768 */                               iM5649k = j13.m5649k(f3);
                                    }
/* 703 */                           color = iM5649k;
                                } else {
/* 773 */                           iArrTrimStateSet = iArrTrimStateSet;
/* 775 */                           attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 777 */                           depth2 = depth2;
                                }
/* 785 */                       color = (16777215 & color) | (iM7892c << 24);
                            }
/* 787 */                   int i9 = i3 + 1;
/* 793 */                   if (i9 > iArr.length) {
/* 801 */                       int[] iArr4 = new int[i3 <= 4 ? 8 : i3 * 2];
/* 804 */                       System.arraycopy(iArr, 0, iArr4, 0, i3);
/* 807 */                       iArr = iArr4;
                            }
/* 808 */                   iArr[i3] = color;
/* 811 */                   if (i9 > objArr.length) {
/* 830 */                       Object[] objArr4 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3 > 4 ? i3 * 2 : 8);
/* 833 */                       System.arraycopy(objArr, 0, objArr4, 0, i3);
/* 836 */                       objArr = objArr4;
                            }
/* 837 */                   objArr[i3] = iArrTrimStateSet;
/* 839 */                   objArr = (int[][]) objArr;
/* 843 */                   i3 = i9;
/* 844 */                   z = z2 ? 1 : 0;
/* 846 */                   i = i5;
/* 848 */                   attributeSetAsAttributeSet = attributeSetAsAttributeSet;
/* 850 */                   depth2 = depth2;
/* 852 */                   i2 = 0;
                        } else {
/* 78 */                    AttributeSet attributeSet = attributeSetAsAttributeSet;
/* 80 */                    int i10 = depth2;
/* 84 */                    int i11 = i;
/* 861 */                   z = z ? 1 : 0;
/* 863 */                   i = i11;
/* 865 */                   attributeSetAsAttributeSet = attributeSet;
/* 867 */                   depth2 = i10;
/* 869 */                   i2 = 0;
                        }
                    }
/* 872 */           int[] iArr5 = new int[i3];
/* 874 */           int[][] iArr6 = new int[i3][];
/* 877 */           System.arraycopy(iArr, 0, iArr5, 0, i3);
/* 880 */           System.arraycopy(objArr, 0, iArr6, 0, i3);
/* 885 */           return new ColorStateList(iArr6, iArr5);
                }
            }
