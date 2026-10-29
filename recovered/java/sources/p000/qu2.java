            package p000;

            import android.R;
            import android.content.Context;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.text.TextUtils;
            import android.text.method.LinkMovementMethod;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.View;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import androidx.appcompat.widget.LinearLayoutCompat;
            import androidx.core.widget.NestedScrollView;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import com.usercentrics.sdk.p008ui.R$drawable;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCButton;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p008ui.components.UCSectionTitle;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.components.UCToggle;
            import com.usercentrics.sdk.p008ui.components.cards.UCCard;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qu2 extends LinearLayoutCompat {

                /* JADX INFO: renamed from: d0 */
                public final hk2 f15760d0;

                /* JADX INFO: renamed from: e0 */
                public final hk2 f15761e0;

                /* JADX INFO: renamed from: f0 */
                public final hk2 f15762f0;

                /* JADX INFO: renamed from: g0 */
                public final View f15763g0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Code duplicated, block: B:101:0x052d  */
                /* JADX WARN: Code duplicated, block: B:103:0x0535  */
                /* JADX WARN: Code duplicated, block: B:104:0x0538  */
                /* JADX WARN: Code duplicated, block: B:107:0x0569  */
                /* JADX WARN: Code duplicated, block: B:108:0x056b  */
                /* JADX WARN: Code duplicated, block: B:115:0x059b  */
                /* JADX WARN: Code duplicated, block: B:116:0x05b1  */
                /* JADX WARN: Code duplicated, block: B:120:0x05e9  */
                /* JADX WARN: Code duplicated, block: B:124:0x06a5  */
                /* JADX WARN: Code duplicated, block: B:126:0x06ad  */
                /* JADX WARN: Code duplicated, block: B:128:0x06b1  */
                /* JADX WARN: Code duplicated, block: B:129:0x06b4  */
                /* JADX WARN: Code duplicated, block: B:132:0x06c1  */
                /* JADX WARN: Code duplicated, block: B:133:0x06c4  */
                /* JADX WARN: Code duplicated, block: B:137:0x06de  */
                /* JADX WARN: Code duplicated, block: B:139:0x06e6  */
                /* JADX WARN: Code duplicated, block: B:141:0x0717  */
                /* JADX WARN: Code duplicated, block: B:142:0x0719  */
                /* JADX WARN: Code duplicated, block: B:148:0x0748  */
                /* JADX WARN: Code duplicated, block: B:149:0x074b  */
                /* JADX WARN: Code duplicated, block: B:153:0x0754 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:154:0x0756  */
                /* JADX WARN: Code duplicated, block: B:156:0x075a  */
                /* JADX WARN: Code duplicated, block: B:159:0x0765  */
                /* JADX WARN: Code duplicated, block: B:160:0x0768  */
                /* JADX WARN: Code duplicated, block: B:162:0x076b  */
                /* JADX WARN: Code duplicated, block: B:163:0x076e  */
                /* JADX WARN: Code duplicated, block: B:167:0x077e A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:168:0x0780  */
                /* JADX WARN: Code duplicated, block: B:169:0x078b  */
                /* JADX WARN: Code duplicated, block: B:175:0x07b6  */
                /* JADX WARN: Code duplicated, block: B:176:0x07b9  */
                /* JADX WARN: Code duplicated, block: B:183:0x072d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:185:0x07a6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:193:0x0581 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:36:0x021f  */
                /* JADX WARN: Code duplicated, block: B:69:0x02e8  */
                /* JADX WARN: Code duplicated, block: B:70:0x02ec  */
                /* JADX WARN: Code duplicated, block: B:72:0x032c  */
                /* JADX WARN: Code duplicated, block: B:73:0x0330  */
                /* JADX WARN: Code duplicated, block: B:78:0x03ac  */
                /* JADX WARN: Code duplicated, block: B:81:0x03f5  */
                /* JADX WARN: Code duplicated, block: B:82:0x03f9  */
                /* JADX WARN: Code duplicated, block: B:85:0x0422 A[LOOP:3: B:83:0x041c->B:85:0x0422, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:90:0x04de  */
                /* JADX WARN: Code duplicated, block: B:93:0x04f2  */
                /* JADX WARN: Code duplicated, block: B:95:0x04fa  */
                /* JADX WARN: Code duplicated, block: B:97:0x0500  */
                /* JADX WARN: Code duplicated, block: B:99:0x0528  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v12, types: [android.view.View, android.view.ViewGroup, androidx.appcompat.widget.LinearLayoutCompat, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r27v0, types: [android.view.View, android.view.ViewGroup, androidx.appcompat.widget.LinearLayoutCompat, java.lang.Object, qu2] */
                public qu2(z00 z00Var, ew2 ew2Var, final su2 su2Var) {
                    boolean z;
                    LinearLayoutCompat scrollableContainer;
                    pu2 pu2Var;
                    UCTextView uCTextView;
                    int i;
                    int i2;
                    boolean z2;
                    final LinearLayoutCompat scrollableContainer2;
                    final UCTextView uCTextView2;
                    int i3;
                    int i4;
                    jw2 jw2Var;
                    String str;
                    LinearLayoutCompat scrollableContainer3;
                    List<ev1> list;
                    int dimensionPixelOffset;
                    ArrayList arrayList;
                    boolean z3;
                    int i5;
                    LinearLayoutCompat scrollableContainer4;
                    int cardsVerticalMargin;
                    d92 d92Var;
                    boolean z4;
                    AttributeSet attributeSet;
                    int dimensionPixelOffset2;
                    List list2;
                    ArrayList arrayListM7552a;
                    int i6;
                    int i7;
                    qt2 qt2Var;
                    byte b;
                    boolean z5;
                    int i8;
                    ew2 ew2Var2;
                    int i9;
                    ew2 ew2Var3;
                    AttributeSet attributeSet2;
                    LinearLayoutCompat scrollableContainer5;
                    ju2 ju2Var;
                    int dimensionPixelOffset3;
                    int dimensionPixelOffset4;
                    int i10;
                    C2131r4 c2131r4;
                    String str2;
                    int i11;
                    boolean z6;
                    boolean z7;
                    LinearLayoutCompat linearLayoutCompat;
                    int i12;
                    int i13;
                    boolean z8;
                    boolean z9;
                    int i14;
                    C2131r4 c2131r5;
                    String str3;
                    boolean z10;
                    int dimensionPixelOffset5;
                    int i15;
                    int i16;
                    int i17;
                    ImageView.ScaleType scaleType;
/* 24 */            super(z00Var, null);
/* 5 */             ew2 ew2Var4 = ew2Var;
/* 9 */             hk2 hk2Var = su2Var.f16816n;
/* 11 */            hk2 hk2Var2 = su2Var.f16824v;
/* 13 */            au1 au1Var = su2Var.f16812j;
/* 15 */            z00Var.getClass();
/* 18 */            ew2Var4.getClass();
/* 21 */            wt2 wt2Var = ew2Var4.f7907a;
/* 38 */            this.f15760d0 = r51.m8065b(new C0908f8((Object) this, 15));
/* 50 */            this.f15761e0 = r51.m8065b(new C1908lz(5, z00Var, (Object) this));
/* 62 */            this.f15762f0 = r51.m8065b(new cb1(z00Var, 3));
/* 64 */            final int i18 = 1;
/* 65 */            setOrientation(1);
/* 81 */            addView(getScrollView(), new LinearLayoutCompat.LayoutParams(-1, -2, 1.0f));
/* 97 */            getScrollView().addView(getScrollableContainer(), new FrameLayout.LayoutParams(-1, -2));
/* 100 */           hk2 hk2Var3 = su2Var.f16815m;
/* 108 */           jw2 jw2Var2 = su2Var.f16804b;
/* 110 */           f31 f31Var = jw2Var2.f12529b;
/* 120 */           final int i19 = 0;
/* 121 */           if (((String) f31Var.f7989g) != null) {
/* 123 */               ?? scrollableContainer6 = getScrollableContainer();
/* 127 */               scrollableContainer6.getClass();
/* 136 */               LinearLayoutCompat linearLayoutCompat2 = new LinearLayoutCompat(scrollableContainer6.getContext(), null);
/* 139 */               linearLayoutCompat2.setOrientation(0);
/* 144 */               TypedValue typedValue = new TypedValue();
/* 158 */               linearLayoutCompat2.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
/* 163 */               linearLayoutCompat2.setBackgroundResource(typedValue.resourceId);
/* 172 */               int dimensionPixelOffset6 = linearLayoutCompat2.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 176 */               linearLayoutCompat2.setPaddingRelative(dimensionPixelOffset6, dimensionPixelOffset6, dimensionPixelOffset6, dimensionPixelOffset6);
/* 184 */               linearLayoutCompat2.setOnClickListener(new View.OnClickListener() { // from class: ku2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
/* 1 */                         int i20 = i19;
/* 3 */                         su2 su2Var2 = su2Var;
                                switch (i20) {
                                    case 0:
/* 16 */                                su2Var2.m8641b(yu1.DENY_ALL_LINK);
                                        break;
                                    default:
/* 10 */                                su2Var2.m8641b(yu1.DENY_ALL_LINK);
                                        break;
                                }
                            }
                        });
/* 189 */               Context context = scrollableContainer6.getContext();
/* 193 */               context.getClass();
/* 196 */               UCTextView uCTextView3 = new UCTextView(context, null);
/* 203 */               uCTextView3.setText((String) f31Var.f7989g);
/* 208 */               UCTextView.m2795i(uCTextView3, ew2Var4, 14);
/* 211 */               uCTextView3.setIncludeFontPadding(false);
/* 218 */               su2Var.m8640a().getClass();
/* 225 */               su2Var.m8640a().getClass();
/* 232 */               su2Var.m8640a().getClass();
/* 241 */               linearLayoutCompat2.addView(uCTextView3, new LinearLayoutCompat.LayoutParams(-2, -2));
/* 244 */               Context context2 = scrollableContainer6.getContext();
/* 248 */               context2.getClass();
/* 253 */               Drawable drawableM6700p = mn0.m6700p(context2, R$drawable.uc_ic_arrow_back);
/* 257 */               if (drawableM6700p != null) {
/* 259 */                   Integer num = wt2Var.f18806b;
/* 261 */                   if (num != null) {
/* 274 */                       drawableM6700p.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
                            }
                        } else {
/* 278 */                   drawableM6700p = null;
                        }
/* 283 */               su2Var.m8640a().getClass();
/* 288 */               Context context3 = scrollableContainer6.getContext();
/* 292 */               context3.getClass();
/* 295 */               UCImageView uCImageView = new UCImageView(context3, null);
/* 298 */               uCImageView.setImageDrawable(drawableM6700p);
/* 315 */               uCImageView.setRotationY(TextUtils.getLayoutDirectionFromLocale(uCTextView3.getTextLocale()) == 1 ? 0.0f : 180.0f);
/* 325 */               linearLayoutCompat2.addView(uCImageView, new LinearLayoutCompat.LayoutParams(-2, -1));
/* 330 */               LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
/* 336 */               ((LinearLayout.LayoutParams) layoutParams).gravity = 8388613;
/* 338 */               scrollableContainer6.addView(linearLayoutCompat2, layoutParams);
                    } else {
/* 345 */               Boolean bool = (Boolean) f31Var.f7990h;
/* 355 */               if (bool != null ? bool.booleanValue() : false) {
/* 357 */                   LinearLayoutCompat scrollableContainer7 = getScrollableContainer();
/* 361 */                   scrollableContainer7.getClass();
/* 364 */                   Context context4 = scrollableContainer7.getContext();
/* 368 */                   context4.getClass();
/* 373 */                   Drawable drawableM6700p2 = mn0.m6700p(context4, R$drawable.uc_ic_close);
/* 377 */                   if (drawableM6700p2 != null) {
/* 379 */                       Integer num2 = wt2Var.f18806b;
/* 381 */                       if (num2 != null) {
/* 394 */                           drawableM6700p2.setColorFilter(new PorterDuffColorFilter(num2.intValue(), PorterDuff.Mode.SRC_IN));
                                }
                            } else {
/* 398 */                       drawableM6700p2 = null;
                            }
/* 403 */                   su2Var.m8640a().getClass();
/* 408 */                   Context context5 = scrollableContainer7.getContext();
/* 412 */                   context5.getClass();
/* 415 */                   UCImageView uCImageView2 = new UCImageView(context5, null);
/* 418 */                   Context context6 = uCImageView2.getContext();
/* 422 */                   context6.getClass();
/* 431 */                   int iM10219n = (int) yy1.m10219n(13.0f, context6);
/* 432 */                   uCImageView2.setPaddingRelative(iM10219n, iM10219n, iM10219n, iM10219n);
/* 440 */                   uCImageView2.setOnClickListener(new View.OnClickListener() { // from class: ku2
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
/* 1 */                             int i20 = i18;
/* 3 */                             su2 su2Var2 = su2Var;
                                    switch (i20) {
                                        case 0:
/* 16 */                                    su2Var2.m8641b(yu1.DENY_ALL_LINK);
                                            break;
                                        default:
/* 10 */                                    su2Var2.m8641b(yu1.DENY_ALL_LINK);
                                            break;
                                    }
                                }
                            });
/* 443 */                   uCImageView2.setImageDrawable(drawableM6700p2);
/* 448 */                   TypedValue typedValue2 = new TypedValue();
/* 462 */                   uCImageView2.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue2, true);
/* 467 */                   uCImageView2.setBackgroundResource(typedValue2.resourceId);
/* 472 */                   uCImageView2.setContentDescription(au1Var.f2094a);
/* 478 */                   LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-2, -2);
/* 484 */                   ((LinearLayout.LayoutParams) layoutParams2).gravity = 8388613;
/* 487 */                   layoutParams2.setMarginStart(0);
/* 490 */                   Context context7 = scrollableContainer7.getContext();
/* 494 */                   context7.getClass();
/* 504 */                   layoutParams2.setMarginEnd((int) yy1.m10219n(4.0f, context7));
/* 507 */                   scrollableContainer7.addView(uCImageView2, layoutParams2);
                        }
                    }
/* 510 */           LinearLayoutCompat scrollableContainer8 = getScrollableContainer();
/* 514 */           q82 q82Var = lu2.f13497a;
/* 516 */           scrollableContainer8.getClass();
/* 519 */           f31 f31Var2 = jw2Var2.f12529b;
/* 525 */           if (((String) f31Var2.f7989g) != null) {
/* 544 */               z = true;
                    } else {
/* 529 */               Boolean bool2 = (Boolean) f31Var2.f7990h;
/* 539 */               if (bool2 != null ? bool2.booleanValue() : false) {
/* 544 */                   z = true;
                        } else {
/* 542 */                   z = false;
                        }
                    }
/* 545 */           String str4 = au1Var.f2101h;
/* 551 */           vt0 vt0Var = (vt0) hk2Var3.getValue();
/* 555 */           if (!(vt0Var instanceof ut0)) {
/* 671 */               if (Intrinsics.m6216a(vt0Var, tt0.f17258a) || vt0Var == null) {
/* 683 */                   LinearLayoutCompat.LayoutParams layoutParams3 = new LinearLayoutCompat.LayoutParams(-1, scrollableContainer8.getHeight());
/* 692 */                   int dimensionPixelOffset7 = scrollableContainer8.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 697 */                   layoutParams3.setMarginStart(0);
/* 700 */                   ((LinearLayout.LayoutParams) layoutParams3).topMargin = 0;
/* 702 */                   layoutParams3.setMarginEnd(0);
/* 710 */                   ((LinearLayout.LayoutParams) layoutParams3).bottomMargin = z ? 0 : dimensionPixelOffset7;
/* 718 */                   View view = new View(scrollableContainer8.getContext());
/* 722 */                   view.setVisibility(4);
/* 725 */                   scrollableContainer8.addView(view, layoutParams3);
                        }
/* 728 */               scrollableContainer = getScrollableContainer();
/* 738 */               pu2Var = (pu2) su2Var.f16818p.getValue();
/* 740 */               scrollableContainer.getClass();
/* 743 */               if (pu2Var == null) {
/* 745 */                   i = -1;
/* 746 */                   i2 = -2;
/* 747 */                   z2 = false;
                        } else {
/* 751 */                   Context context8 = scrollableContainer.getContext();
/* 755 */                   context8.getClass();
/* 758 */                   uCTextView = new UCTextView(context8, null);
/* 763 */                   uCTextView.setText(pu2Var.f15287a);
/* 766 */                   uCTextView.m2798k(ew2Var4);
/* 771 */                   i = -1;
/* 772 */                   i2 = -2;
/* 773 */                   LinearLayoutCompat.LayoutParams layoutParams4 = new LinearLayoutCompat.LayoutParams(-1, -2);
/* 782 */                   int dimensionPixelOffset8 = scrollableContainer.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 786 */                   layoutParams4.setMarginStart(dimensionPixelOffset8);
/* 789 */                   z2 = false;
/* 790 */                   ((LinearLayout.LayoutParams) layoutParams4).topMargin = 0;
/* 792 */                   layoutParams4.setMarginEnd(dimensionPixelOffset8);
/* 805 */                   ((LinearLayout.LayoutParams) layoutParams4).bottomMargin = scrollableContainer.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerTitleBottomMargin);
/* 811 */                   if (Build.VERSION.SDK_INT >= 28) {
/* 2 */                         uCTextView.setAccessibilityHeading(true);
                            } else {
/* 817 */                       uCTextView.setImportantForAccessibility(1);
                            }
/* 820 */                   scrollableContainer.addView(uCTextView, layoutParams4);
                        }
/* 823 */               scrollableContainer2 = getScrollableContainer();
/* 827 */               scrollableContainer2.getClass();
/* 832 */               Context context9 = scrollableContainer2.getContext();
/* 836 */               context9.getClass();
/* 839 */               uCTextView2 = new UCTextView(context9, null);
/* 846 */               String str5 = su2Var.m8640a().f14029a;
/* 852 */               su2Var.m8640a().getClass();
/* 871 */               i3 = i;
/* 875 */               i4 = i2;
/* 879 */               jw2Var = jw2Var2;
/* 888 */               uCTextView2.m2796g(str5, new n01(1, su2Var, su2.class, "onHtmlLinkClick", "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V", 0, 2));
/* 893 */               UCTextView.m2794h(uCTextView2, ew2Var4, 14);
/* 900 */               uCTextView2.setMovementMethod(LinkMovementMethod.getInstance());
/* 903 */               ou2.m7241a(su2Var);
/* 908 */               LinearLayoutCompat.LayoutParams layoutParams5 = new LinearLayoutCompat.LayoutParams(i3, i4);
/* 917 */               int dimensionPixelOffset9 = scrollableContainer2.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 921 */               layoutParams5.setMarginStart(dimensionPixelOffset9);
/* 924 */               layoutParams5.setMarginEnd(dimensionPixelOffset9);
/* 927 */               scrollableContainer2.addView(uCTextView2, layoutParams5);
/* 936 */               str = (String) su2Var.f16814l.getValue();
/* 938 */               if (str != null) {
/* 943 */                   LinearLayoutCompat.LayoutParams layoutParams6 = new LinearLayoutCompat.LayoutParams(i3, i4);
/* 952 */                   int dimensionPixelOffset10 = scrollableContainer2.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 956 */                   layoutParams6.setMarginStart(dimensionPixelOffset10);
/* 959 */                   layoutParams6.setMarginEnd(dimensionPixelOffset10);
/* 964 */                   Context context10 = scrollableContainer2.getContext();
/* 968 */                   context10.getClass();
/* 972 */                   final UCTextView uCTextView4 = new UCTextView(context10, null);
/* 975 */                   scrollableContainer2.addView(uCTextView4, layoutParams6);
/* 978 */                   uCTextView4.setText(str);
/* 983 */                   UCTextView.m2795i(uCTextView4, ew2Var4, 12);
/* 986 */                   xe2.m9773k(uCTextView4);
/* 994 */                   uCTextView4.setOnClickListener(new View.OnClickListener() { // from class: nu2
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
/* 2 */                             su2 su2Var2 = su2Var;
/* 4 */                             su2Var2.f16822t = true;
/* 10 */                            scrollableContainer2.removeView(uCTextView4);
/* 17 */                            String str6 = su2Var2.m8640a().f14029a;
/* 23 */                            su2Var2.m8640a().getClass();
/* 42 */                            uCTextView2.m2796g(str6, new n01(1, su2Var2, su2.class, "onHtmlLinkClick", "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V", 0, 3));
/* 45 */                            ou2.m7241a(su2Var2);
                                }
                            });
                        }
/* 997 */               scrollableContainer3 = getScrollableContainer();
/* 1001 */              scrollableContainer3.getClass();
/* 1010 */              list = (List) su2Var.f16823u.getValue();
/* 1012 */              if (list == null) {
/* 1014 */                  i5 = i3;
/* 1015 */                  z3 = true;
                        } else {
/* 1024 */                  dimensionPixelOffset = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksVerticalPadding);
/* 1034 */                  int dimensionPixelOffset11 = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksHorizontalSpacing);
/* 1046 */                  arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 1057 */                  for (ev1 ev1Var : list) {
/* 1067 */                      Context context11 = scrollableContainer3.getContext();
/* 1071 */                      context11.getClass();
/* 1075 */                      UCTextView uCTextView5 = new UCTextView(context11, null);
/* 1080 */                      uCTextView5.setText(ev1Var.f7892a);
/* 1091 */                      uCTextView5.setPaddingRelative(uCTextView5.getPaddingLeft(), dimensionPixelOffset, uCTextView5.getPaddingRight(), dimensionPixelOffset);
/* 1094 */                      UCTextView.m2795i(uCTextView5, ew2Var4, 10);
/* 1103 */                      uCTextView5.setOnClickListener(new rp2(1, su2Var, ev1Var));
/* 1110 */                      su2Var.m8640a().getClass();
/* 1113 */                      xe2.m9773k(uCTextView5);
/* 1116 */                      arrayList.add(uCTextView5);
                            }
/* 1123 */                  z3 = true;
/* 1124 */                  Context context12 = scrollableContainer3.getContext();
/* 1128 */                  context12.getClass();
/* 1131 */                  LinearLayout linearLayoutM6691g = mn0.m6691g(context12, arrayList, dimensionPixelOffset11);
/* 1137 */                  i5 = -1;
/* 1138 */                  LinearLayoutCompat.LayoutParams layoutParams7 = new LinearLayoutCompat.LayoutParams(-1, i4);
/* 1147 */                  int dimensionPixelOffset12 = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 1151 */                  layoutParams7.setMarginStart(dimensionPixelOffset12);
/* 1164 */                  ((LinearLayout.LayoutParams) layoutParams7).topMargin = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksTopMargin);
/* 1166 */                  layoutParams7.setMarginEnd(dimensionPixelOffset12);
/* 1179 */                  ((LinearLayout.LayoutParams) layoutParams7).bottomMargin = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksBottomMargin);
/* 1181 */                  scrollableContainer3.addView(linearLayoutM6691g, layoutParams7);
                        }
/* 1184 */              scrollableContainer4 = getScrollableContainer();
/* 1188 */              cardsVerticalMargin = getCardsVerticalMargin();
/* 1208 */              z4 = z3;
/* 1212 */              attributeSet = null;
/* 1213 */              d92Var = new d92(2, this, qu2.class, "onExpandedCardListener", "onExpandedCardListener(II)V", 0, 2);
/* 1218 */              scrollableContainer4.getClass();
/* 1227 */              dimensionPixelOffset2 = scrollableContainer4.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 1237 */              list2 = (List) su2Var.f16825w.getValue();
/* 1239 */              if (list2 != null) {
/* 1249 */                  qt2.Companion.getClass();
/* 1252 */                  arrayListM7552a = pt2.m7552a(list2);
/* 1260 */                  i6 = 0;
/* 1265 */                  for (Object obj : arrayListM7552a) {
/* 1271 */                      i7 = i6 + 1;
/* 1273 */                      if (i6 >= 0) {
/* 1410 */                          ?? r21 = attributeSet;
/* 1412 */                          C2085pw.m7568g();
/* 1415 */                          throw r21;
                                }
/* 1275 */                      qt2Var = (qt2) obj;
/* 1279 */                      if (qt2Var instanceof zv2) {
/* 1285 */                          Context context13 = scrollableContainer4.getContext();
/* 1289 */                          context13.getClass();
/* 1292 */                          UCSectionTitle uCSectionTitle = new UCSectionTitle(context13, attributeSet);
/* 1295 */                          uCSectionTitle.setPaddingRelative(dimensionPixelOffset2, cardsVerticalMargin, dimensionPixelOffset2, cardsVerticalMargin);
/* 1298 */                          uCSectionTitle.m2793l(ew2Var4);
/* 1303 */                          uCSectionTitle.setText(((zv2) qt2Var).f20356a);
/* 1308 */                          b = -2;
/* 1312 */                          scrollableContainer4.addView(uCSectionTitle, new LinearLayoutCompat.LayoutParams(i5, -2));
                                } else {
/* 1321 */                          b = -2;
/* 1324 */                          if (qt2Var instanceof st2) {
/* 1332 */                              if (i6 == arrayListM7552a.size() - 1) {
/* 1334 */                                  z5 = z4;
                                        } else {
/* 1337 */                                  z5 = false;
                                        }
/* 1341 */                              int i20 = dimensionPixelOffset2;
/* 1344 */                              Context context14 = scrollableContainer4.getContext();
/* 1348 */                              context14.getClass();
/* 1351 */                              UCCard uCCard = new UCCard(context14, attributeSet);
/* 1354 */                              uCCard.m2803c(ew2Var4);
/* 1362 */                              ew2 ew2Var5 = ew2Var4;
/* 1364 */                              i8 = i20;
/* 1365 */                              ew2Var2 = ew2Var5;
/* 1373 */                              uCCard.m2802b(ew2Var2, (st2) qt2Var, false, null, null);
/* 1376 */                              uCCard.setOnExpandedListener(d92Var);
/* 1381 */                              LinearLayoutCompat.LayoutParams layoutParams8 = new LinearLayoutCompat.LayoutParams(i5, -2);
/* 1384 */                              if (z5) {
/* 1386 */                                  i9 = i8;
                                        } else {
/* 1388 */                                  i9 = cardsVerticalMargin;
                                        }
/* 1389 */                              layoutParams8.setMarginStart(i8);
/* 1392 */                              layoutParams8.setMarginEnd(i8);
/* 1395 */                              ((LinearLayout.LayoutParams) layoutParams8).topMargin = cardsVerticalMargin;
/* 1397 */                              ((LinearLayout.LayoutParams) layoutParams8).bottomMargin = i9;
/* 1399 */                              scrollableContainer4.addView(uCCard, layoutParams8);
                                    }
/* 1402 */                          dimensionPixelOffset2 = i8;
/* 1403 */                          attributeSet = attributeSet;
/* 1405 */                          ew2Var4 = ew2Var2;
/* 1406 */                          i6 = i7;
                                }
/* 1315 */                      ew2Var2 = ew2Var4;
/* 1318 */                      i8 = dimensionPixelOffset2;
/* 1402 */                      dimensionPixelOffset2 = i8;
/* 1403 */                      attributeSet = attributeSet;
/* 1405 */                      ew2Var4 = ew2Var2;
/* 1406 */                      i6 = i7;
                            }
                        }
/* 1241 */              ew2Var3 = ew2Var4;
/* 1242 */              attributeSet2 = attributeSet;
/* 1416 */              scrollableContainer5 = getScrollableContainer();
/* 1434 */              if (((Boolean) su2Var.f16819q.getValue()).booleanValue()) {
/* 1442 */                  View view2 = new View(scrollableContainer5.getContext());
/* 1446 */                  view2.setVisibility(4);
/* 1454 */                  scrollableContainer5.addView(view2, new LinearLayoutCompat.LayoutParams(i5, i5, 100.0f));
                        }
/* 1465 */              View view3 = new View(getContext());
/* 1470 */              view3.setVisibility(8);
/* 1475 */              view3.setBackgroundColor(wt2Var.f18814j);
/* 1480 */              Context context15 = getContext();
/* 1484 */              context15.getClass();
/* 1497 */              addView(view3, new LinearLayoutCompat.LayoutParams(i5, (int) yy1.m10219n(1.0f, context15)));
/* 1500 */              this.f15763g0 = view3;
/* 1506 */              ju2Var = (ju2) hk2Var2.getValue();
/* 1510 */              if (ju2Var != null) {
/* 1522 */                  LinearLayoutCompat linearLayoutCompat3 = new LinearLayoutCompat(getContext(), attributeSet2);
/* 1526 */                  linearLayoutCompat3.setOrientation(0);
/* 1529 */                  linearLayoutCompat3.setGravity(17);
/* 1534 */                  Context context16 = getContext();
/* 1538 */                  context16.getClass();
/* 1541 */                  UCToggle uCToggle = new UCToggle(context16, attributeSet2);
/* 1544 */                  uCToggle.m2800f(ew2Var3);
/* 1549 */                  uCToggle.setCurrentState(ju2Var.f12501b);
/* 1559 */                  uCToggle.setListener(new C1983o(su2Var, 23));
/* 1564 */                  Context context17 = getContext();
/* 1568 */                  context17.getClass();
/* 1571 */                  UCTextView uCTextView6 = new UCTextView(context17, attributeSet2);
/* 1576 */                  UCTextView.m2794h(uCTextView6, ew2Var3, 14);
/* 1581 */                  uCTextView6.setText(ju2Var.f12500a);
/* 1590 */                  uCTextView6.setOnClickListener(new h51(uCToggle, 2));
/* 1593 */                  linearLayoutCompat3.addView(uCToggle);
/* 1598 */                  LinearLayoutCompat.LayoutParams layoutParams9 = new LinearLayoutCompat.LayoutParams(i5, -2, 100.0f);
/* 1611 */                  layoutParams9.setMarginStart(getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerToggleTextSpacing));
/* 1615 */                  layoutParams9.setMarginEnd(0);
/* 1618 */                  linearLayoutCompat3.addView(uCTextView6, layoutParams9);
/* 1621 */                  xe2.m9765c(uCToggle);
/* 1624 */                  xe2.m9765c(uCTextView6);
/* 1629 */                  LinearLayoutCompat.LayoutParams layoutParams10 = new LinearLayoutCompat.LayoutParams(i5, -2);
/* 1638 */                  int dimensionPixelOffset13 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 1648 */                  int dimensionPixelOffset14 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerToggleVerticalMargin);
/* 1652 */                  layoutParams10.setMarginStart(dimensionPixelOffset13);
/* 1655 */                  layoutParams10.setMarginEnd(dimensionPixelOffset13);
/* 1658 */                  ((LinearLayout.LayoutParams) layoutParams10).topMargin = dimensionPixelOffset14;
/* 1660 */                  ((LinearLayout.LayoutParams) layoutParams10).bottomMargin = dimensionPixelOffset14;
/* 1662 */                  addView(linearLayoutCompat3, layoutParams10);
                        }
/* 1671 */              dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 1681 */              dimensionPixelOffset4 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerButtonsSpacing);
/* 1695 */              i10 = 0;
/* 1700 */              for (Object obj2 : (List) hk2Var.getValue()) {
/* 1706 */                  i11 = i10 + 1;
/* 1708 */                  if (i10 >= 0) {
/* 1959 */                      C2085pw.m7568g();
/* 1964 */                      throw null;
                            }
/* 1710 */                  List list3 = (List) obj2;
/* 1712 */                  if (i10 == 0) {
/* 1714 */                      z6 = z4;
                            } else {
/* 1717 */                      z6 = false;
                            }
/* 1728 */                  if (i10 == C2085pw.m7565d((List) hk2Var.getValue())) {
/* 1730 */                      z7 = z4;
                            } else {
/* 1733 */                      z7 = false;
                            }
/* 1741 */                  linearLayoutCompat = new LinearLayoutCompat(getContext(), null);
/* 1745 */                  linearLayoutCompat.setOrientation(0);
/* 1752 */                  i12 = 0;
/* 1757 */                  for (Object obj3 : list3) {
/* 1763 */                      i15 = i12 + 1;
/* 1765 */                      if (i12 >= 0) {
/* 1838 */                          C2085pw.m7568g();
/* 1843 */                          throw null;
                                }
/* 1767 */                      gt2 gt2Var = (gt2) obj3;
/* 1769 */                      Context context18 = getContext();
/* 1773 */                      context18.getClass();
/* 1778 */                      i16 = dimensionPixelOffset4;
/* 1781 */                      UCButton uCButton = new UCButton(context18, null);
/* 1786 */                      boolean z11 = z7;
/* 1792 */                      uCButton.m2784k(gt2Var, new C1908lz(4, su2Var, gt2Var));
/* 1802 */                      uCButton.setMinimumHeight((int) yy1.m10219n(50.0f, context18));
/* 1811 */                      LinearLayoutCompat.LayoutParams layoutParams11 = new LinearLayoutCompat.LayoutParams(0, -1, 1.0f);
/* 1814 */                      if (i12 == 0) {
/* 1816 */                          i17 = 0;
                                } else {
/* 1818 */                          i17 = i16;
                                }
/* 1820 */                      layoutParams11.setMarginStart(i17);
/* 1823 */                      layoutParams11.setMarginEnd(0);
/* 1826 */                      linearLayoutCompat.addView(uCButton, layoutParams11);
/* 1829 */                      i5 = -1;
/* 1830 */                      i12 = i15;
/* 1832 */                      dimensionPixelOffset4 = i16;
/* 1834 */                      z7 = z11;
                            }
/* 1844 */                  i13 = dimensionPixelOffset4;
/* 1846 */                  z8 = z7;
/* 1854 */                  LinearLayoutCompat.LayoutParams layoutParams12 = new LinearLayoutCompat.LayoutParams(i5, -2);
/* 1863 */                  if (((ju2) hk2Var2.getValue()) != null) {
/* 1865 */                      z9 = z4;
                            } else {
/* 1868 */                      z9 = false;
                            }
/* 1869 */                  if (!z6 && z9) {
/* 1875 */                      i14 = 0;
                            } else if (z6) {
/* 1879 */                      i14 = dimensionPixelOffset3;
                            } else {
/* 1883 */                      i14 = i13;
                            }
/* 1890 */                  c2131r5 = (C2131r4) jw2Var.f12530c.f9630c;
/* 1892 */                  if (c2131r5 != null) {
/* 1894 */                      str3 = c2131r5.f15867b;
                            } else {
/* 1897 */                      str3 = null;
                            }
/* 1898 */                  if (str3 != null) {
/* 1900 */                      z10 = z4;
                            } else {
/* 1903 */                      z10 = false;
                            }
/* 1904 */                  if (!z8 && z10) {
/* 1914 */                      dimensionPixelOffset5 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerPoweredByVerticalMargin);
                            } else if (z8) {
/* 1927 */                      dimensionPixelOffset5 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
                            } else {
/* 1932 */                      dimensionPixelOffset5 = 0;
                            }
/* 1933 */                  layoutParams12.setMarginStart(dimensionPixelOffset3);
/* 1936 */                  layoutParams12.setMarginEnd(dimensionPixelOffset3);
/* 1939 */                  ((LinearLayout.LayoutParams) layoutParams12).topMargin = i14;
/* 1941 */                  ((LinearLayout.LayoutParams) layoutParams12).bottomMargin = dimensionPixelOffset5;
/* 1943 */                  addView(linearLayoutCompat, layoutParams12);
/* 1947 */                  i10 = i11;
/* 1948 */                  jw2Var = jw2Var;
/* 1950 */                  dimensionPixelOffset4 = i13;
/* 1955 */                  i5 = -1;
                        }
/* 1971 */              c2131r4 = (C2131r4) jw2Var.f12530c.f9630c;
/* 1973 */              if (c2131r4 != null) {
/* 1975 */                  str2 = c2131r4.f15867b;
                        } else {
/* 1978 */                  str2 = null;
                        }
/* 1979 */              if (str2 != null || StringsKt.m6228D(str2)) {
                        }
/* 1990 */              Context context19 = getContext();
/* 1994 */              context19.getClass();
/* 1998 */              UCTextView uCTextView7 = new UCTextView(context19, null);
/* 2001 */              uCTextView7.setText(str2);
/* 2006 */              uCTextView7.setGravity(17);
/* 2009 */              uCTextView7.m2797j(ew2Var3);
/* 2016 */              LinearLayoutCompat.LayoutParams layoutParams13 = new LinearLayoutCompat.LayoutParams(-1, -2);
/* 2025 */              int dimensionPixelOffset15 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 2029 */              layoutParams13.setMarginStart(dimensionPixelOffset15);
/* 2033 */              ((LinearLayout.LayoutParams) layoutParams13).topMargin = 0;
/* 2035 */              layoutParams13.setMarginEnd(dimensionPixelOffset15);
/* 2048 */              ((LinearLayout.LayoutParams) layoutParams13).bottomMargin = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerPoweredByVerticalMargin);
/* 2050 */              addView(uCTextView7, layoutParams13);
/* 2053 */              return;
                    }
/* 557 */           ut0 ut0Var = (ut0) vt0Var;
/* 559 */           q82 q82Var2 = ut0Var.f17718b;
/* 563 */           q82Var2 = q82Var2 == null ? lu2.f13497a : q82Var2;
/* 578 */           LinearLayoutCompat.LayoutParams layoutParams14 = new LinearLayoutCompat.LayoutParams(-1, scrollableContainer8.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerDefaultLogoHeight));
/* 587 */           int dimensionPixelOffset16 = scrollableContainer8.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 591 */           layoutParams14.setMarginStart(dimensionPixelOffset16);
/* 594 */           layoutParams14.setMarginEnd(dimensionPixelOffset16);
/* 602 */           ((LinearLayout.LayoutParams) layoutParams14).topMargin = z ? 0 : dimensionPixelOffset16;
/* 604 */           ((LinearLayout.LayoutParams) layoutParams14).bottomMargin = dimensionPixelOffset16;
/* 608 */           Context context20 = scrollableContainer8.getContext();
/* 612 */           context20.getClass();
/* 615 */           UCImageView uCImageView3 = new UCImageView(context20, null);
/* 620 */           uCImageView3.setId(R$id.ucFirstLayerHeaderLogo);
/* 625 */           uCImageView3.setImage(ut0Var.f17717a);
/* 628 */           int iOrdinal = q82Var2.ordinal();
/* 632 */           if (iOrdinal == 0) {
/* 651 */               scaleType = ImageView.ScaleType.FIT_START;
                    } else if (iOrdinal == 1) {
/* 647 */               scaleType = ImageView.ScaleType.FIT_CENTER;
                    } else {
/* 637 */               if (iOrdinal != 2) {
/* 642 */                   ds0.m3187b();
/* 645 */                   throw null;
                        }
/* 639 */               scaleType = ImageView.ScaleType.FIT_END;
                    }
/* 653 */           uCImageView3.setScaleType(scaleType);
/* 656 */           uCImageView3.setContentDescription(str4);
/* 659 */           scrollableContainer8.addView(uCImageView3, layoutParams14);
/* 728 */           scrollableContainer = getScrollableContainer();
/* 738 */           pu2Var = (pu2) su2Var.f16818p.getValue();
/* 740 */           scrollableContainer.getClass();
/* 743 */           if (pu2Var == null) {
/* 745 */               i = -1;
/* 746 */               i2 = -2;
/* 747 */               z2 = false;
                    } else {
/* 751 */               Context context21 = scrollableContainer.getContext();
/* 755 */               context21.getClass();
/* 758 */               uCTextView = new UCTextView(context21, null);
/* 763 */               uCTextView.setText(pu2Var.f15287a);
/* 766 */               uCTextView.m2798k(ew2Var4);
/* 771 */               i = -1;
/* 772 */               i2 = -2;
/* 773 */               LinearLayoutCompat.LayoutParams layoutParams15 = new LinearLayoutCompat.LayoutParams(-1, -2);
/* 782 */               int dimensionPixelOffset17 = scrollableContainer.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 786 */               layoutParams15.setMarginStart(dimensionPixelOffset17);
/* 789 */               z2 = false;
/* 790 */               ((LinearLayout.LayoutParams) layoutParams15).topMargin = 0;
/* 792 */               layoutParams15.setMarginEnd(dimensionPixelOffset17);
/* 805 */               ((LinearLayout.LayoutParams) layoutParams15).bottomMargin = scrollableContainer.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerTitleBottomMargin);
/* 811 */               if (Build.VERSION.SDK_INT >= 28) {
/* 2 */                     uCTextView.setAccessibilityHeading(true);
                        } else {
/* 817 */                   uCTextView.setImportantForAccessibility(1);
                        }
/* 820 */               scrollableContainer.addView(uCTextView, layoutParams15);
                    }
/* 823 */           scrollableContainer2 = getScrollableContainer();
/* 827 */           scrollableContainer2.getClass();
/* 832 */           Context context22 = scrollableContainer2.getContext();
/* 836 */           context22.getClass();
/* 839 */           uCTextView2 = new UCTextView(context22, null);
/* 846 */           String str6 = su2Var.m8640a().f14029a;
/* 852 */           su2Var.m8640a().getClass();
/* 871 */           i3 = i;
/* 875 */           i4 = i2;
/* 879 */           jw2Var = jw2Var2;
/* 888 */           uCTextView2.m2796g(str6, new n01(1, su2Var, su2.class, "onHtmlLinkClick", "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V", 0, 2));
/* 893 */           UCTextView.m2794h(uCTextView2, ew2Var4, 14);
/* 900 */           uCTextView2.setMovementMethod(LinkMovementMethod.getInstance());
/* 903 */           ou2.m7241a(su2Var);
/* 908 */           LinearLayoutCompat.LayoutParams layoutParams16 = new LinearLayoutCompat.LayoutParams(i3, i4);
/* 917 */           int dimensionPixelOffset18 = scrollableContainer2.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 921 */           layoutParams16.setMarginStart(dimensionPixelOffset18);
/* 924 */           layoutParams16.setMarginEnd(dimensionPixelOffset18);
/* 927 */           scrollableContainer2.addView(uCTextView2, layoutParams16);
/* 936 */           str = (String) su2Var.f16814l.getValue();
/* 938 */           if (str != null) {
/* 943 */               LinearLayoutCompat.LayoutParams layoutParams17 = new LinearLayoutCompat.LayoutParams(i3, i4);
/* 952 */               int dimensionPixelOffset19 = scrollableContainer2.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 956 */               layoutParams17.setMarginStart(dimensionPixelOffset19);
/* 959 */               layoutParams17.setMarginEnd(dimensionPixelOffset19);
/* 964 */               Context context110 = scrollableContainer2.getContext();
/* 968 */               context110.getClass();
/* 972 */               final UCTextView uCTextView8 = new UCTextView(context110, null);
/* 975 */               scrollableContainer2.addView(uCTextView8, layoutParams17);
/* 978 */               uCTextView8.setText(str);
/* 983 */               UCTextView.m2795i(uCTextView8, ew2Var4, 12);
/* 986 */               xe2.m9773k(uCTextView8);
/* 994 */               uCTextView8.setOnClickListener(new View.OnClickListener() { // from class: nu2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
/* 2 */                         su2 su2Var2 = su2Var;
/* 4 */                         su2Var2.f16822t = true;
/* 10 */                        scrollableContainer2.removeView(uCTextView8);
/* 17 */                        String str7 = su2Var2.m8640a().f14029a;
/* 23 */                        su2Var2.m8640a().getClass();
/* 42 */                        uCTextView2.m2796g(str7, new n01(1, su2Var2, su2.class, "onHtmlLinkClick", "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V", 0, 3));
/* 45 */                        ou2.m7241a(su2Var2);
                            }
                        });
                    }
/* 997 */           scrollableContainer3 = getScrollableContainer();
/* 1001 */          scrollableContainer3.getClass();
/* 1010 */          list = (List) su2Var.f16823u.getValue();
/* 1012 */          if (list == null) {
/* 1014 */              i5 = i3;
/* 1015 */              z3 = true;
                    } else {
/* 1024 */              dimensionPixelOffset = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksVerticalPadding);
/* 1034 */              int dimensionPixelOffset110 = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksHorizontalSpacing);
/* 1046 */              arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 1057 */              while (r4.hasNext()) {
/* 1067 */                  Context context111 = scrollableContainer3.getContext();
/* 1071 */                  context111.getClass();
/* 1075 */                  UCTextView uCTextView9 = new UCTextView(context111, null);
/* 1080 */                  uCTextView9.setText(ev1Var.f7892a);
/* 1091 */                  uCTextView9.setPaddingRelative(uCTextView9.getPaddingLeft(), dimensionPixelOffset, uCTextView9.getPaddingRight(), dimensionPixelOffset);
/* 1094 */                  UCTextView.m2795i(uCTextView9, ew2Var4, 10);
/* 1103 */                  uCTextView9.setOnClickListener(new rp2(1, su2Var, ev1Var));
/* 1110 */                  su2Var.m8640a().getClass();
/* 1113 */                  xe2.m9773k(uCTextView9);
/* 1116 */                  arrayList.add(uCTextView9);
                        }
/* 1123 */              z3 = true;
/* 1124 */              Context context112 = scrollableContainer3.getContext();
/* 1128 */              context112.getClass();
/* 1131 */              LinearLayout linearLayoutM6691g2 = mn0.m6691g(context112, arrayList, dimensionPixelOffset110);
/* 1137 */              i5 = -1;
/* 1138 */              LinearLayoutCompat.LayoutParams layoutParams18 = new LinearLayoutCompat.LayoutParams(-1, i4);
/* 1147 */              int dimensionPixelOffset111 = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 1151 */              layoutParams18.setMarginStart(dimensionPixelOffset111);
/* 1164 */              ((LinearLayout.LayoutParams) layoutParams18).topMargin = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksTopMargin);
/* 1166 */              layoutParams18.setMarginEnd(dimensionPixelOffset111);
/* 1179 */              ((LinearLayout.LayoutParams) layoutParams18).bottomMargin = scrollableContainer3.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLinksBottomMargin);
/* 1181 */              scrollableContainer3.addView(linearLayoutM6691g2, layoutParams18);
                    }
/* 1184 */          scrollableContainer4 = getScrollableContainer();
/* 1188 */          cardsVerticalMargin = getCardsVerticalMargin();
/* 1208 */          z4 = z3;
/* 1212 */          attributeSet = null;
/* 1213 */          d92Var = new d92(2, this, qu2.class, "onExpandedCardListener", "onExpandedCardListener(II)V", 0, 2);
/* 1218 */          scrollableContainer4.getClass();
/* 1227 */          dimensionPixelOffset2 = scrollableContainer4.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 1237 */          list2 = (List) su2Var.f16825w.getValue();
/* 1239 */          if (list2 != null) {
/* 1249 */              qt2.Companion.getClass();
/* 1252 */              arrayListM7552a = pt2.m7552a(list2);
/* 1260 */              i6 = 0;
/* 1265 */              while (r18.hasNext()) {
/* 1271 */                  i7 = i6 + 1;
/* 1273 */                  if (i6 >= 0) {
/* 1410 */                      ?? r22 = attributeSet;
/* 1412 */                      C2085pw.m7568g();
/* 1415 */                      throw r22;
                            }
/* 1275 */                  qt2Var = (qt2) obj;
/* 1279 */                  if (qt2Var instanceof zv2) {
/* 1285 */                      Context context113 = scrollableContainer4.getContext();
/* 1289 */                      context113.getClass();
/* 1292 */                      UCSectionTitle uCSectionTitle2 = new UCSectionTitle(context113, attributeSet);
/* 1295 */                      uCSectionTitle2.setPaddingRelative(dimensionPixelOffset2, cardsVerticalMargin, dimensionPixelOffset2, cardsVerticalMargin);
/* 1298 */                      uCSectionTitle2.m2793l(ew2Var4);
/* 1303 */                      uCSectionTitle2.setText(((zv2) qt2Var).f20356a);
/* 1308 */                      b = -2;
/* 1312 */                      scrollableContainer4.addView(uCSectionTitle2, new LinearLayoutCompat.LayoutParams(i5, -2));
                            } else {
/* 1321 */                      b = -2;
/* 1324 */                      if (qt2Var instanceof st2) {
/* 1332 */                          if (i6 == arrayListM7552a.size() - 1) {
/* 1334 */                              z5 = z4;
                                    } else {
/* 1337 */                              z5 = false;
                                    }
/* 1341 */                          int i21 = dimensionPixelOffset2;
/* 1344 */                          Context context114 = scrollableContainer4.getContext();
/* 1348 */                          context114.getClass();
/* 1351 */                          UCCard uCCard2 = new UCCard(context114, attributeSet);
/* 1354 */                          uCCard2.m2803c(ew2Var4);
/* 1362 */                          ew2 ew2Var6 = ew2Var4;
/* 1364 */                          i8 = i21;
/* 1365 */                          ew2Var2 = ew2Var6;
/* 1373 */                          uCCard2.m2802b(ew2Var2, (st2) qt2Var, false, null, null);
/* 1376 */                          uCCard2.setOnExpandedListener(d92Var);
/* 1381 */                          LinearLayoutCompat.LayoutParams layoutParams19 = new LinearLayoutCompat.LayoutParams(i5, -2);
/* 1384 */                          if (z5) {
/* 1386 */                              i9 = i8;
                                    } else {
/* 1388 */                              i9 = cardsVerticalMargin;
                                    }
/* 1389 */                          layoutParams19.setMarginStart(i8);
/* 1392 */                          layoutParams19.setMarginEnd(i8);
/* 1395 */                          ((LinearLayout.LayoutParams) layoutParams19).topMargin = cardsVerticalMargin;
/* 1397 */                          ((LinearLayout.LayoutParams) layoutParams19).bottomMargin = i9;
/* 1399 */                          scrollableContainer4.addView(uCCard2, layoutParams19);
                                }
/* 1402 */                      dimensionPixelOffset2 = i8;
/* 1403 */                      attributeSet = attributeSet;
/* 1405 */                      ew2Var4 = ew2Var2;
/* 1406 */                      i6 = i7;
                            }
/* 1315 */                  ew2Var2 = ew2Var4;
/* 1318 */                  i8 = dimensionPixelOffset2;
/* 1402 */                  dimensionPixelOffset2 = i8;
/* 1403 */                  attributeSet = attributeSet;
/* 1405 */                  ew2Var4 = ew2Var2;
/* 1406 */                  i6 = i7;
                        }
                    }
/* 1241 */          ew2Var3 = ew2Var4;
/* 1242 */          attributeSet2 = attributeSet;
/* 1416 */          scrollableContainer5 = getScrollableContainer();
/* 1434 */          if (((Boolean) su2Var.f16819q.getValue()).booleanValue()) {
/* 1442 */              View view4 = new View(scrollableContainer5.getContext());
/* 1446 */              view4.setVisibility(4);
/* 1454 */              scrollableContainer5.addView(view4, new LinearLayoutCompat.LayoutParams(i5, i5, 100.0f));
                    }
/* 1465 */          View view5 = new View(getContext());
/* 1470 */          view5.setVisibility(8);
/* 1475 */          view5.setBackgroundColor(wt2Var.f18814j);
/* 1480 */          Context context115 = getContext();
/* 1484 */          context115.getClass();
/* 1497 */          addView(view5, new LinearLayoutCompat.LayoutParams(i5, (int) yy1.m10219n(1.0f, context115)));
/* 1500 */          this.f15763g0 = view5;
/* 1506 */          ju2Var = (ju2) hk2Var2.getValue();
/* 1510 */          if (ju2Var != null) {
/* 1522 */              LinearLayoutCompat linearLayoutCompat4 = new LinearLayoutCompat(getContext(), attributeSet2);
/* 1526 */              linearLayoutCompat4.setOrientation(0);
/* 1529 */              linearLayoutCompat4.setGravity(17);
/* 1534 */              Context context116 = getContext();
/* 1538 */              context116.getClass();
/* 1541 */              UCToggle uCToggle2 = new UCToggle(context116, attributeSet2);
/* 1544 */              uCToggle2.m2800f(ew2Var3);
/* 1549 */              uCToggle2.setCurrentState(ju2Var.f12501b);
/* 1559 */              uCToggle2.setListener(new C1983o(su2Var, 23));
/* 1564 */              Context context117 = getContext();
/* 1568 */              context117.getClass();
/* 1571 */              UCTextView uCTextView10 = new UCTextView(context117, attributeSet2);
/* 1576 */              UCTextView.m2794h(uCTextView10, ew2Var3, 14);
/* 1581 */              uCTextView10.setText(ju2Var.f12500a);
/* 1590 */              uCTextView10.setOnClickListener(new h51(uCToggle2, 2));
/* 1593 */              linearLayoutCompat4.addView(uCToggle2);
/* 1598 */              LinearLayoutCompat.LayoutParams layoutParams20 = new LinearLayoutCompat.LayoutParams(i5, -2, 100.0f);
/* 1611 */              layoutParams20.setMarginStart(getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerToggleTextSpacing));
/* 1615 */              layoutParams20.setMarginEnd(0);
/* 1618 */              linearLayoutCompat4.addView(uCTextView10, layoutParams20);
/* 1621 */              xe2.m9765c(uCToggle2);
/* 1624 */              xe2.m9765c(uCTextView10);
/* 1629 */              LinearLayoutCompat.LayoutParams layoutParams110 = new LinearLayoutCompat.LayoutParams(i5, -2);
/* 1638 */              int dimensionPixelOffset112 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 1648 */              int dimensionPixelOffset113 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerToggleVerticalMargin);
/* 1652 */              layoutParams110.setMarginStart(dimensionPixelOffset112);
/* 1655 */              layoutParams110.setMarginEnd(dimensionPixelOffset112);
/* 1658 */              ((LinearLayout.LayoutParams) layoutParams110).topMargin = dimensionPixelOffset113;
/* 1660 */              ((LinearLayout.LayoutParams) layoutParams110).bottomMargin = dimensionPixelOffset113;
/* 1662 */              addView(linearLayoutCompat4, layoutParams110);
                    }
/* 1671 */          dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
/* 1681 */          dimensionPixelOffset4 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerButtonsSpacing);
/* 1695 */          i10 = 0;
/* 1700 */          while (r3.hasNext()) {
/* 1706 */              i11 = i10 + 1;
/* 1708 */              if (i10 >= 0) {
/* 1959 */                  C2085pw.m7568g();
/* 1964 */                  throw null;
                        }
/* 1710 */              List list4 = (List) obj2;
/* 1712 */              if (i10 == 0) {
/* 1714 */                  z6 = z4;
                        } else {
/* 1717 */                  z6 = false;
                        }
/* 1728 */              if (i10 == C2085pw.m7565d((List) hk2Var.getValue())) {
/* 1730 */                  z7 = z4;
                        } else {
/* 1733 */                  z7 = false;
                        }
/* 1741 */              linearLayoutCompat = new LinearLayoutCompat(getContext(), null);
/* 1745 */              linearLayoutCompat.setOrientation(0);
/* 1752 */              i12 = 0;
/* 1757 */              while (r5.hasNext()) {
/* 1763 */                  i15 = i12 + 1;
/* 1765 */                  if (i12 >= 0) {
/* 1838 */                      C2085pw.m7568g();
/* 1843 */                      throw null;
                            }
/* 1767 */                  gt2 gt2Var2 = (gt2) obj3;
/* 1769 */                  Context context118 = getContext();
/* 1773 */                  context118.getClass();
/* 1778 */                  i16 = dimensionPixelOffset4;
/* 1781 */                  UCButton uCButton2 = new UCButton(context118, null);
/* 1786 */                  boolean z12 = z7;
/* 1792 */                  uCButton2.m2784k(gt2Var2, new C1908lz(4, su2Var, gt2Var2));
/* 1802 */                  uCButton2.setMinimumHeight((int) yy1.m10219n(50.0f, context118));
/* 1811 */                  LinearLayoutCompat.LayoutParams layoutParams111 = new LinearLayoutCompat.LayoutParams(0, -1, 1.0f);
/* 1814 */                  if (i12 == 0) {
/* 1816 */                      i17 = 0;
                            } else {
/* 1818 */                      i17 = i16;
                            }
/* 1820 */                  layoutParams111.setMarginStart(i17);
/* 1823 */                  layoutParams111.setMarginEnd(0);
/* 1826 */                  linearLayoutCompat.addView(uCButton2, layoutParams111);
/* 1829 */                  i5 = -1;
/* 1830 */                  i12 = i15;
/* 1832 */                  dimensionPixelOffset4 = i16;
/* 1834 */                  z7 = z12;
                        }
/* 1844 */              i13 = dimensionPixelOffset4;
/* 1846 */              z8 = z7;
/* 1854 */              LinearLayoutCompat.LayoutParams layoutParams112 = new LinearLayoutCompat.LayoutParams(i5, -2);
/* 1863 */              if (((ju2) hk2Var2.getValue()) != null) {
/* 1865 */                  z9 = z4;
                        } else {
/* 1868 */                  z9 = false;
                        }
/* 1869 */              if (!z6) {
/* 1877 */                  if (z6) {
/* 1879 */                      i14 = dimensionPixelOffset3;
                            } else {
/* 1883 */                      i14 = i13;
                            }
                        } else if (z6) {
/* 1879 */                  i14 = dimensionPixelOffset3;
                        } else {
/* 1883 */                  i14 = i13;
                        }
/* 1890 */              c2131r5 = (C2131r4) jw2Var.f12530c.f9630c;
/* 1892 */              if (c2131r5 != null) {
/* 1894 */                  str3 = c2131r5.f15867b;
                        } else {
/* 1897 */                  str3 = null;
                        }
/* 1898 */              if (str3 != null) {
/* 1900 */                  z10 = z4;
                        } else {
/* 1903 */                  z10 = false;
                        }
/* 1904 */              if (!z8) {
/* 1919 */                  if (z8) {
/* 1927 */                      dimensionPixelOffset5 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
                            } else {
/* 1932 */                      dimensionPixelOffset5 = 0;
                            }
                        } else if (z8) {
/* 1927 */                  dimensionPixelOffset5 = getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerInnerPadding);
                        } else {
/* 1932 */                  dimensionPixelOffset5 = 0;
                        }
/* 1933 */              layoutParams112.setMarginStart(dimensionPixelOffset3);
/* 1936 */              layoutParams112.setMarginEnd(dimensionPixelOffset3);
/* 1939 */              ((LinearLayout.LayoutParams) layoutParams112).topMargin = i14;
/* 1941 */              ((LinearLayout.LayoutParams) layoutParams112).bottomMargin = dimensionPixelOffset5;
/* 1943 */              addView(linearLayoutCompat, layoutParams112);
/* 1947 */              i10 = i11;
/* 1948 */              jw2Var = jw2Var;
/* 1950 */              dimensionPixelOffset4 = i13;
/* 1955 */              i5 = -1;
                    }
/* 1971 */          c2131r4 = (C2131r4) jw2Var.f12530c.f9630c;
/* 1973 */          if (c2131r4 != null) {
/* 1975 */              str2 = c2131r4.f15867b;
                    } else {
/* 1978 */              str2 = null;
                    }
/* 1979 */          if (str2 != null) {
                    }
                }

                private final int getCardsVerticalMargin() {
/* 9 */             return ((Number) this.f15760d0.getValue()).intValue();
                }

                private final NestedScrollView getScrollView() {
/* 7 */             return (NestedScrollView) this.f15761e0.getValue();
                }

                private final LinearLayoutCompat getScrollableContainer() {
/* 7 */             return (LinearLayoutCompat) this.f15762f0.getValue();
                }

                /* JADX INFO: renamed from: j */
                public static final void m8017j(qu2 qu2Var, int i, int i2) {
/* 2 */             int[] iArr = {0, 0};
/* 10 */            qu2Var.getScrollView().getLocationOnScreen(iArr);
/* 16 */            int i3 = i + i2;
/* 25 */            int height = qu2Var.getScrollView().getHeight() + iArr[1];
/* 26 */            if (i3 > height) {
/* 38 */                qu2Var.getScrollView().m603o(0, (i3 - height) + qu2Var.getCardsVerticalMargin(), false);
                    }
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 33 */            this.f15763g0.setVisibility(getScrollView().getHeight() < getScrollableContainer().getHeight() ? 0 : 8);
                }
            }
