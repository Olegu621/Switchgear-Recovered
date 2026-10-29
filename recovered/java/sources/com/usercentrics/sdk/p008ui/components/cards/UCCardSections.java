            package com.usercentrics.sdk.p008ui.components.cards;

            import android.content.Context;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.GradientDrawable;
            import android.graphics.drawable.InsetDrawable;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import android.widget.TableLayout;
            import com.google.android.flexbox.FlexboxLayout;
            import com.usercentrics.sdk.p008ui.R$drawable;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.components.UCToggle;
            import com.usercentrics.sdk.p008ui.components.links.UCLink;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.C0908f8;
            import p000.C2498yh;
            import p000.au1;
            import p000.ds0;
            import p000.ew2;
            import p000.fw2;
            import p000.hk2;
            import p000.kw2;
            import p000.mn0;
            import p000.r51;
            import p000.rp2;
            import p000.rt2;
            import p000.we2;
            import p000.wt2;
            import p000.xe2;
            import p000.xt2;
            import p000.yt2;
            import p000.yy1;
            import p000.zt2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nR\u001b\u0010\u000f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "Lp51;", "getCardDefaultMargin", "()I", "cardDefaultMargin", "Lau1;", "b", "getAriaLabels", "()Lau1;", "ariaLabels", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 41 */    public final class UCCardSections extends LinearLayout {

                /* JADX INFO: renamed from: a */
                public final hk2 f6271a;

                /* JADX INFO: renamed from: b */
                public final hk2 f6272b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCCardSections(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 18 */            this.f6271a = r51.m8065b(new C0908f8(this, 12));
/* 26 */            this.f6272b = r51.m8065b(C2498yh.f19625g0);
/* 29 */            setOrientation(1);
/* 39 */            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                }

                private final au1 getAriaLabels() {
/* 7 */             return (au1) this.f6272b.getValue();
                }

                private final int getCardDefaultMargin() {
/* 9 */             return ((Number) this.f6271a.getValue()).intValue();
                }

                /* JADX INFO: renamed from: a */
                public final void m2807a(ew2 ew2Var, List list, Function1 function1) {
                    View viewInflate;
                    View viewInflate2;
                    Drawable drawable;
/* 7 */             ew2Var.getClass();
/* 10 */            wt2 wt2Var = ew2Var.f7907a;
/* 12 */            list.getClass();
/* 15 */            removeAllViews();
/* 18 */            Iterator it = list.iterator();
/* 26 */            while (it.hasNext()) {
/* 32 */                yt2 yt2Var = (yt2) it.next();
/* 36 */                int i = 0;
/* 39 */                if (yt2Var instanceof kw2) {
/* 41 */                    Context context = getContext();
/* 45 */                    context.getClass();
/* 48 */                    kw2 kw2Var = (kw2) yt2Var;
/* 50 */                    au1 ariaLabels = getAriaLabels();
/* 54 */                    ariaLabels.getClass();
/* 57 */                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
/* 61 */                    layoutInflaterFrom.getClass();
/* 66 */                    viewInflate2 = layoutInflaterFrom.inflate(R$layout.uc_card_section_toggle_entry, (ViewGroup) this, false);
/* 76 */                    UCToggle uCToggle = (UCToggle) viewInflate2.findViewById(R$id.ucCardSectionToggleEntrySwitch);
/* 84 */                    UCTextView uCTextView = (UCTextView) viewInflate2.findViewById(R$id.ucCardSectionToggleEntryText);
/* 92 */                    UCImageView uCImageView = (UCImageView) viewInflate2.findViewById(R$id.ucCardSectionToggleEntryInfo);
/* 94 */                    fw2 fw2Var = kw2Var.f13032c;
/* 96 */                    String str = kw2Var.f13031b;
/* 98 */                    if (fw2Var != null) {
/* 100 */                       uCToggle.m2800f(ew2Var);
/* 103 */                       uCToggle.m2799e(fw2Var);
/* 106 */                       uCToggle.setVisibility(0);
/* 109 */                       uCToggle.setContentDescription(str);
                            } else {
/* 113 */                       uCToggle.setVisibility(8);
                            }
/* 116 */                   uCTextView.setText(str);
/* 119 */                   uCTextView.setContentDescription(str);
/* 126 */                   uCTextView.setLabelFor(uCImageView.getId());
/* 131 */                   UCTextView.m2795i(uCTextView, ew2Var, 30);
/* 134 */                   int i2 = function1 != 0 ? 0 : 8;
/* 137 */                   xe2.m9765c(uCImageView);
/* 140 */                   uCImageView.setVisibility(i2);
/* 165 */                   uCImageView.setContentDescription(str + " " + ariaLabels.f2099f);
/* 173 */                   uCImageView.setOnClickListener(new rp2(i, function1, kw2Var));
/* 178 */                   Drawable drawableM6700p = mn0.m6700p(context, R$drawable.uc_ic_info);
/* 182 */                   if (drawableM6700p != null) {
/* 184 */                       Integer num = wt2Var.f18806b;
/* 186 */                       if (num != null) {
/* 199 */                           drawableM6700p.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
                                }
/* 202 */                       drawable = drawableM6700p;
                            } else {
/* 204 */                       drawable = null;
                            }
/* 205 */                   uCImageView.setImageDrawable(drawable);
/* 208 */                   uCToggle.getClass();
/* 211 */                   xe2.m9765c(uCToggle);
                        } else {
/* 220 */                   float f = 1.0f;
/* 224 */                   if (yt2Var instanceof zt2) {
/* 226 */                       Context context2 = getContext();
/* 230 */                       context2.getClass();
/* 233 */                       zt2 zt2Var = (zt2) yt2Var;
/* 235 */                       LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context2);
/* 239 */                       layoutInflaterFrom2.getClass();
/* 244 */                       viewInflate = layoutInflaterFrom2.inflate(R$layout.uc_card_section_entry, (ViewGroup) this, false);
/* 254 */                       UCTextView uCTextView2 = (UCTextView) viewInflate.findViewById(R$id.ucCardSectionEntryTitle);
/* 256 */                       String str2 = zt2Var.f20323a;
/* 258 */                       String str3 = zt2Var.f20324b;
/* 260 */                       if (str2 == null || StringsKt.m6228D(str2)) {
/* 277 */                           uCTextView2.setVisibility(8);
                                } else {
/* 269 */                           uCTextView2.setText(str2);
/* 273 */                           UCTextView.m2794h(uCTextView2, ew2Var, 6);
                                }
/* 286 */                       UCTextView uCTextView3 = (UCTextView) viewInflate.findViewById(R$id.ucCardSectionEntryDescription);
/* 288 */                       if (str3 == null || StringsKt.m6228D(str3)) {
/* 307 */                           uCTextView3.setVisibility(8);
                                } else {
/* 297 */                           uCTextView3.setVisibility(0);
/* 300 */                           uCTextView3.setText(str3);
/* 303 */                           UCTextView.m2794h(uCTextView3, ew2Var, 14);
                                }
/* 316 */                       ViewGroup viewGroup = (FlexboxLayout) viewInflate.findViewById(R$id.ucCardSectionEntryFlexbox);
/* 318 */                       we2 we2Var = zt2Var.f20325c;
/* 320 */                       if (we2Var != null) {
/* 325 */                           UCLink uCLink = new UCLink(context2, null);
/* 328 */                           uCLink.m2809k(ew2Var);
/* 331 */                           uCLink.m2808j(we2Var);
/* 334 */                           viewGroup.addView(uCLink);
/* 337 */                           xe2.m9773k(uCLink);
                                }
/* 350 */                       for (String str4 : zt2Var.f20326d) {
/* 358 */                           LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(context2);
/* 362 */                           layoutInflaterFrom3.getClass();
/* 367 */                           View viewInflate3 = layoutInflaterFrom3.inflate(R$layout.uc_tag, viewGroup, false);
/* 371 */                           viewInflate3.getClass();
/* 374 */                           UCTextView uCTextView4 = (UCTextView) viewInflate3;
/* 376 */                           uCTextView4.setText(str4);
/* 381 */                           GradientDrawable gradientDrawable = new GradientDrawable();
/* 384 */                           gradientDrawable.setShape(0);
/* 393 */                           gradientDrawable.setCornerRadius((int) yy1.m10219n(2.0f, context2));
/* 403 */                           gradientDrawable.setStroke((int) yy1.m10219n(f, context2), wt2Var.f18814j);
/* 406 */                           Integer num2 = wt2Var.f18809e;
/* 408 */                           if (num2 != null) {
/* 414 */                               gradientDrawable.setColor(num2.intValue());
                                    }
/* 417 */                           uCTextView4.setBackground(gradientDrawable);
/* 420 */                           UCTextView.m2794h(uCTextView4, ew2Var, 14);
/* 423 */                           viewGroup.addView(uCTextView4);
/* 426 */                           f = 1.0f;
                                }
                            } else {
/* 434 */                       if (!(yt2Var instanceof xt2)) {
/* 808 */                           ds0.m3187b();
/* 811 */                           return;
                                }
/* 436 */                       Context context3 = getContext();
/* 440 */                       context3.getClass();
/* 443 */                       xt2 xt2Var = (xt2) yt2Var;
/* 445 */                       int i3 = wt2Var.f18814j;
/* 447 */                       LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(context3);
/* 451 */                       layoutInflaterFrom4.getClass();
/* 456 */                       viewInflate = layoutInflaterFrom4.inflate(R$layout.uc_card_section_entry, (ViewGroup) this, false);
/* 466 */                       UCTextView uCTextView5 = (UCTextView) viewInflate.findViewById(R$id.ucCardSectionEntryTitle);
/* 470 */                       uCTextView5.setText(xt2Var.f19374a);
/* 475 */                       UCTextView.m2795i(uCTextView5, ew2Var, 22);
/* 486 */                       ((UCTextView) viewInflate.findViewById(R$id.ucCardSectionEntryDescription)).setVisibility(8);
/* 495 */                       FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate.findViewById(R$id.ucCardSectionEntryFlexbox);
/* 497 */                       LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(context3);
/* 501 */                       layoutInflaterFrom5.getClass();
/* 506 */                       View viewInflate4 = layoutInflaterFrom5.inflate(R$layout.uc_history_table, (ViewGroup) this, false);
/* 510 */                       viewInflate4.getClass();
/* 513 */                       TableLayout tableLayout = (TableLayout) viewInflate4;
/* 517 */                       View viewFindViewById = tableLayout.findViewById(R$id.ucTableHeaderRow);
/* 527 */                       UCTextView uCTextView6 = (UCTextView) tableLayout.findViewById(R$id.ucTableDecisionHeader);
/* 535 */                       UCTextView uCTextView7 = (UCTextView) tableLayout.findViewById(R$id.ucTableDateHeader);
/* 539 */                       GradientDrawable gradientDrawable2 = new GradientDrawable();
/* 542 */                       gradientDrawable2.setShape(0);
/* 553 */                       gradientDrawable2.setCornerRadius((int) yy1.m10219n(2.0f, context3));
/* 563 */                       gradientDrawable2.setStroke((int) yy1.m10219n(1.0f, context3), i3);
/* 566 */                       Integer num3 = wt2Var.f18809e;
/* 568 */                       if (num3 != null) {
/* 574 */                           gradientDrawable2.setColor(num3.intValue());
                                }
/* 577 */                       viewFindViewById.setBackground(gradientDrawable2);
/* 582 */                       uCTextView6.setText(xt2Var.f19376c);
/* 587 */                       uCTextView7.setText(xt2Var.f19377d);
/* 592 */                       UCTextView.m2794h(uCTextView6, ew2Var, 14);
/* 595 */                       UCTextView.m2794h(uCTextView7, ew2Var, 14);
/* 608 */                       for (rt2 rt2Var : xt2Var.f19375b) {
/* 616 */                           LayoutInflater layoutInflaterFrom6 = LayoutInflater.from(context3);
/* 620 */                           layoutInflaterFrom6.getClass();
/* 626 */                           View viewInflate5 = layoutInflaterFrom6.inflate(R$layout.uc_history_table_row, (ViewGroup) tableLayout, false);
/* 632 */                           GradientDrawable gradientDrawable3 = new GradientDrawable();
/* 635 */                           gradientDrawable3.setShape(0);
/* 638 */                           gradientDrawable3.setColor(0);
/* 649 */                           gradientDrawable3.setCornerRadius((int) yy1.m10219n(2.0f, context3));
/* 659 */                           gradientDrawable3.setStroke((int) yy1.m10219n(1.0f, context3), i3);
/* 686 */                           viewInflate5.setBackground(new InsetDrawable((Drawable) gradientDrawable3, 0, (int) yy1.m10219n(-2.0f, context3), 0, 0));
/* 695 */                           UCImageView uCImageView2 = (UCImageView) viewInflate5.findViewById(R$id.ucTableDecisionIcon);
/* 714 */                           uCImageView2.setImageDrawable(rt2Var.f16292a ? mn0.m6700p(context3, R$drawable.uc_ic_yes) : mn0.m6700p(context3, R$drawable.uc_ic_no));
/* 717 */                           Integer num4 = wt2Var.f18806b;
/* 719 */                           if (num4 != null) {
/* 727 */                               uCImageView2.setColorFilter(num4.intValue(), PorterDuff.Mode.SRC_IN);
                                    }
/* 736 */                           UCTextView uCTextView8 = (UCTextView) viewInflate5.findViewById(R$id.ucTableDecisionText);
/* 740 */                           uCTextView8.setText(rt2Var.f16294c);
/* 745 */                           UCTextView.m2794h(uCTextView8, ew2Var, 14);
/* 754 */                           UCTextView uCTextView9 = (UCTextView) viewInflate5.findViewById(R$id.ucTableDate);
/* 758 */                           uCTextView9.setText(rt2Var.f16293b);
/* 761 */                           UCTextView.m2794h(uCTextView9, ew2Var, 14);
/* 764 */                           tableLayout.addView(viewInflate5);
                                }
/* 769 */                       flexboxLayout.addView(tableLayout);
                            }
/* 429 */                   viewInflate2 = viewInflate;
                        }
/* 774 */               ViewGroup.LayoutParams layoutParams = viewInflate2.getLayoutParams();
/* 778 */               layoutParams.getClass();
/* 781 */               LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
/* 787 */               layoutParams2.bottomMargin = getCardDefaultMargin();
/* 793 */               layoutParams2.leftMargin = getCardDefaultMargin();
/* 799 */               layoutParams2.rightMargin = getCardDefaultMargin();
/* 801 */               addView(viewInflate2);
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 42 */        public UCCardSections(Context context, AttributeSet attributeSet) {
/* 43 */            this(context, attributeSet, 0);
                    context.getClass();
                }
            }
