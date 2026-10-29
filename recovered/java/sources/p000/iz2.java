            package p000;

            import android.content.Context;
            import android.graphics.Typeface;
            import android.graphics.drawable.GradientDrawable;
            import android.widget.FrameLayout;
            import com.usercentrics.sdk.p008ui.color.UsercentricsShadedColor;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iz2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ra2 f11973a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Context f11974b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ u03 f11975c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ pg3 f11976d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ tu1 f11977e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iz2(ra2 ra2Var, Context context, u03 u03Var, pg3 pg3Var, tu1 tu1Var) {
/* 12 */            super(0);
/* 1 */             this.f11973a = ra2Var;
/* 3 */             this.f11974b = context;
/* 5 */             this.f11975c = u03Var;
/* 7 */             this.f11976d = pg3Var;
/* 9 */             this.f11977e = tu1Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String strConcat;
                    Object n42Var;
/* 3 */             h03 h03Var = h03.f8862i;
/* 5 */             pg3 pg3Var = this.f11976d;
/* 7 */             boolean zEquals = pg3Var.equals(h03Var);
/* 11 */            ra2 ra2Var = this.f11973a;
/* 15 */            rz2 rz2Var = (rz2) ra2Var.f15956b;
/* 21 */            if (rz2Var == null) {
/* 23 */                tu1 tu1Var = this.f11977e;
/* 25 */                wu1 wu1Var = tu1Var.f17274a;
/* 27 */                zt1 zt1Var = tu1Var.f17275b;
/* 37 */                au1 au1Var = (au1) wu1Var.f18819a.f6925b.f7433b.f15958d;
/* 39 */                if (zt1Var != null) {
/* 42 */                    d13 d13Var = qu1.f15755a;
/* 48 */                    d13 d13Var2 = new d13(zt1Var.f20322b);
/* 51 */                    oz2 oz2Var = zt1Var.f20321a;
/* 57 */                    fs0 fs0Var = new fs0(this.f11975c);
/* 60 */                    oz2Var.getClass();
/* 63 */                    qu1.f15755a = d13Var2;
/* 65 */                    qu1.f15756b = oz2Var;
/* 67 */                    qu1.f15757c = fs0Var;
/* 69 */                    qu1.f15758d = au1Var;
                        }
/* 75 */                ur3 ur3Var = wu1Var.f18819a.f6925b.f7432a;
/* 79 */                ew2.Companion.getClass();
/* 82 */                vt2 vt2Var = wt2.Companion;
/* 86 */                ju1 ju1Var = (ju1) ur3Var.f17704b;
/* 88 */                vt2Var.getClass();
/* 91 */                UsercentricsShadedColor usercentricsShadedColor = ju1Var.f12486a;
/* 97 */                Integer numM9758B = xe2.m9758B(usercentricsShadedColor.f6236a);
/* 103 */               Integer numM9758B2 = xe2.m9758B(usercentricsShadedColor.f6237b);
/* 109 */               Integer numM9758B3 = xe2.m9758B(usercentricsShadedColor.f6238c);
/* 115 */               Integer numM9758B4 = xe2.m9758B(usercentricsShadedColor.f6239d);
/* 121 */               Integer numM9758B5 = xe2.m9758B(ju1Var.f12493h);
/* 127 */               Integer numM9758B6 = xe2.m9758B(ju1Var.f12494i);
/* 133 */               Integer numM9758B7 = xe2.m9758B(ju1Var.f12496k);
/* 139 */               Integer numM9758B8 = xe2.m9758B(ju1Var.f12495j);
/* 143 */               String str = ju1Var.f12497l;
/* 145 */               double d = ju1Var.f12498m;
/* 147 */               str.getClass();
/* 154 */               if (StringsKt.m6228D(str)) {
/* 156 */                   strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
/* 169 */                   String hexString = Long.toHexString(jd1.m5797b(d * 255.0d));
/* 177 */                   if (hexString.length() == 1) {
/* 181 */                       hexString = "0".concat(hexString);
                            }
/* 202 */                   strConcat = str.charAt(0) == '#' ? hexString.concat(str.substring(1)) : hexString.concat(str);
                        }
/* 206 */               Integer numM9758B9 = xe2.m9758B(strConcat);
/* 212 */               Integer numM9758B10 = xe2.m9758B(ju1Var.f12499n);
/* 216 */               numM9758B10.getClass();
/* 223 */               wt2 wt2Var = new wt2(numM9758B, numM9758B2, numM9758B3, numM9758B4, numM9758B5, numM9758B6, numM9758B7, numM9758B8, numM9758B9, numM9758B10.intValue());
/* 226 */               vu2 vu2Var = wu2.Companion;
/* 230 */               lu1 lu1Var = (lu1) ur3Var.f17705c;
/* 232 */               vu2Var.getClass();
/* 239 */               Typeface.DEFAULT.getClass();
/* 244 */               Typeface.DEFAULT_BOLD.getClass();
/* 247 */               tu2 tu2Var = uu2.Companion;
/* 249 */               float f = lu1Var.f13496a;
/* 252 */               tu2Var.getClass();
/* 270 */               wu2 wu2Var = new wu2(new uu2(f + 2.0f, f, f - 2.0f, f - 4.0f));
/* 273 */               gw2 gw2Var = hw2.Companion;
/* 275 */               xy1 xy1Var = ju1Var.f12492g;
/* 277 */               gw2Var.getClass();
                        try {
/* 280 */                   m42 m42Var = o42.f14612b;
/* 288 */                   Integer numM9758B11 = xe2.m9758B((String) xy1Var.f19393a);
/* 292 */                   numM9758B11.getClass();
/* 295 */                   int iIntValue = numM9758B11.intValue();
/* 303 */                   Integer numM9758B12 = xe2.m9758B((String) xy1Var.f19395c);
/* 307 */                   numM9758B12.getClass();
/* 310 */                   int iIntValue2 = numM9758B12.intValue();
/* 318 */                   Integer numM9758B13 = xe2.m9758B((String) xy1Var.f19396d);
/* 322 */                   numM9758B13.getClass();
/* 325 */                   int iIntValue3 = numM9758B13.intValue();
/* 333 */                   Integer numM9758B14 = xe2.m9758B((String) xy1Var.f19397e);
/* 337 */                   numM9758B14.getClass();
/* 340 */                   int iIntValue4 = numM9758B14.intValue();
/* 348 */                   Integer numM9758B15 = xe2.m9758B((String) xy1Var.f19398f);
/* 352 */                   numM9758B15.getClass();
/* 355 */                   int iIntValue5 = numM9758B15.intValue();
/* 363 */                   Integer numM9758B16 = xe2.m9758B((String) xy1Var.f19394b);
/* 367 */                   numM9758B16.getClass();
/* 374 */                   n42Var = new hw2(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, numM9758B16.intValue());
                        } catch (Throwable th) {
/* 381 */                   m42 m42Var2 = o42.f14612b;
/* 385 */                   n42Var = new n42(th);
                        }
/* 390 */               if (n42Var instanceof n42) {
/* 392 */                   n42Var = null;
                        }
/* 396 */               hw2 hw2Var = (hw2) n42Var;
/* 398 */               int i = ur3Var.f17703a;
/* 402 */               it2.Companion.getClass();
/* 407 */               dt2 dt2Var = et2.Companion;
/* 409 */               bx0 bx0Var = ju1Var.f12487b;
/* 411 */               dt2Var.getClass();
/* 473 */               rz2 rz2Var2 = new rz2(this.f11974b, new ew2(wt2Var, wu2Var, hw2Var, new it2(dt2.m3241a(bx0Var), dt2.m3241a(ju1Var.f12488c), dt2.m3241a(ju1Var.f12491f), dt2.m3241a(ju1Var.f12489d), dt2.m3241a(ju1Var.f12490e)), i), (C2001oh) ra2Var.f15955a, null, zEquals, new ts0(ra2Var), wu1Var);
/* 476 */               ra2Var.f15956b = rz2Var2;
/* 478 */               rz2Var = rz2Var2;
                    }
/* 479 */           wu1 wu1Var2 = rz2Var.f16360d;
/* 483 */           dw1 dw1Var = wu1Var2.f18819a.f6925b;
/* 485 */           jw2 jw2Var = dw1Var.f7434c;
/* 488 */           ac1 ac1Var = wu1Var2.f18820b;
/* 494 */           ec0 ec0Var = (ec0) dw1Var.f7433b.f15957c;
/* 496 */           ew2 ew2Var = rz2Var.f16357a;
/* 500 */           gj0 gj0Var = rz2Var.f16358b.f14747b;
/* 502 */           ts0 ts0Var = rz2Var.f16359c;
/* 504 */           ac1 ac1Var2 = rz2Var.f16363g;
/* 506 */           ac1Var2.getClass();
/* 553 */           su2 su2Var = new su2(pg3Var, jw2Var, ac1Var, ec0Var, ew2Var, gj0Var, null, (o61) rz2Var.f16367k.getValue(), ts0Var, ac1Var2, ((Boolean) rz2Var.f16362f.getValue()).booleanValue(), (au1) wu1Var2.f18819a.f6925b.f7433b.f15958d, null);
/* 556 */           ys2 ys2Var = rz2Var.f16365i;
/* 558 */           if (ys2Var != null) {
/* 560 */               FrameLayout frameLayout = ys2Var.f19810d;
/* 562 */               z00 z00Var = ys2Var.f19808b;
/* 564 */               ew2 ew2Var2 = ys2Var.f19807a;
/* 569 */               float fM10219n = yy1.m10219n(ew2Var2.f7911e, z00Var);
/* 575 */               Integer num = ew2Var2.f7907a.f18809e;
/* 581 */               int i2 = 80;
/* 583 */               if (pg3Var instanceof h03) {
/* 589 */                   ys2Var.setTag(80);
/* 594 */                   GradientDrawable gradientDrawable = new GradientDrawable();
/* 597 */                   Float fValueOf = Float.valueOf(fM10219n);
/* 601 */                   Float fValueOf2 = Float.valueOf(fM10219n);
/* 605 */                   Float fValueOf3 = Float.valueOf(fM10219n);
/* 609 */                   Float fValueOf4 = Float.valueOf(fM10219n);
/* 614 */                   Float fValueOf5 = Float.valueOf(0.0f);
/* 628 */                   List listM7566e = C2085pw.m7566e(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf5, fValueOf5, fValueOf5);
/* 632 */                   listM7566e.getClass();
/* 639 */                   float[] fArr = new float[listM7566e.size()];
/* 641 */                   Iterator it = listM7566e.iterator();
/* 645 */                   int i3 = 0;
/* 650 */                   while (it.hasNext()) {
/* 664 */                       fArr[i3] = ((Number) it.next()).floatValue();
/* 662 */                       i3++;
                            }
/* 668 */                   gradientDrawable.setCornerRadii(fArr);
/* 671 */                   if (num != null) {
/* 677 */                       gradientDrawable.setColor(num.intValue());
                            }
/* 680 */                   frameLayout.setBackground(gradientDrawable);
/* 685 */                   FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
/* 688 */                   layoutParams.setMarginStart(0);
/* 691 */                   layoutParams.setMarginEnd(0);
/* 701 */                   layoutParams.topMargin = (int) yy1.m10219n(24.0f, z00Var);
/* 703 */                   frameLayout.setLayoutParams(layoutParams);
                        } else if (pg3Var instanceof g03) {
/* 711 */                   g03 g03Var = (g03) pg3Var;
/* 715 */                   GradientDrawable gradientDrawable2 = new GradientDrawable();
/* 718 */                   gradientDrawable2.setCornerRadius(fM10219n);
/* 721 */                   if (num != null) {
/* 727 */                       gradientDrawable2.setColor(num.intValue());
                            }
/* 730 */                   frameLayout.setBackground(gradientDrawable2);
/* 735 */                   int iOrdinal = g03Var.f8426i.ordinal();
/* 739 */                   if (iOrdinal != 0) {
/* 742 */                       if (iOrdinal != 1) {
/* 747 */                           ds0.m3187b();
/* 19 */                            return null;
                                }
/* 744 */                       i2 = 17;
                            }
/* 755 */                   ys2Var.setTag(Integer.valueOf(i2));
/* 760 */                   FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, i2);
/* 770 */                   hk2 hk2VarM8065b = r51.m8065b(new C0908f8(ys2Var, 11));
/* 780 */                   int iIntValue6 = ((Number) hk2VarM8065b.getValue()).intValue();
/* 790 */                   int iIntValue7 = ((Number) hk2VarM8065b.getValue()).intValue();
/* 794 */                   layoutParams2.setMarginStart(iIntValue6);
/* 797 */                   layoutParams2.setMarginEnd(iIntValue6);
/* 800 */                   layoutParams2.topMargin = iIntValue7;
/* 802 */                   layoutParams2.bottomMargin = iIntValue7;
/* 804 */                   frameLayout.setLayoutParams(layoutParams2);
                        } else if (pg3Var instanceof f03) {
/* 812 */                   ys2Var.m10181a(num);
                        }
/* 815 */               frameLayout.removeAllViews();
/* 823 */               frameLayout.addView(new qu2(z00Var, ew2Var2, su2Var));
                    }
/* 826 */           return Unit.f12910a;
                }
            }
