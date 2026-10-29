            package com.usercentrics.sdk.p008ui.secondLayer.component.footer;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCButton;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.components.UCToggle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.C1908lz;
            import p000.C1983o;
            import p000.C2085pw;
            import p000.C2122qw;
            import p000.C2131r4;
            import p000.ew2;
            import p000.gt2;
            import p000.h51;
            import p000.hk2;
            import p000.lv2;
            import p000.nv2;
            import p000.r51;
            import p000.wt2;
            import p000.xe2;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0016\u001a\n \f*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u001b\u001a\n \f*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001e\u001a\n \f*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0015R#\u0010#\u001a\n \f*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\"¨\u0006$"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/usercentrics/sdk/ui/components/UCToggle;", "kotlin.jvm.PlatformType", "g0", "Lp51;", "getUcFooterSwitch", "()Lcom/usercentrics/sdk/ui/components/UCToggle;", "ucFooterSwitch", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "h0", "getUcFooterSwitchText", "()Lcom/usercentrics/sdk/ui/components/UCTextView;", "ucFooterSwitchText", "Landroid/widget/LinearLayout;", "i0", "getUcFooterButtonsContainer", "()Landroid/widget/LinearLayout;", "ucFooterButtonsContainer", "j0", "getUcFooterTextProvider", "ucFooterTextProvider", "Landroid/view/View;", "k0", "getUcFooterDivider", "()Landroid/view/View;", "ucFooterDivider", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 75 */    public final class UCSecondLayerFooter extends ConstraintLayout {

                /* JADX INFO: renamed from: g0 */
                public final hk2 f6275g0;

                /* JADX INFO: renamed from: h0 */
                public final hk2 f6276h0;

                /* JADX INFO: renamed from: i0 */
                public final hk2 f6277i0;

                /* JADX INFO: renamed from: j0 */
                public final hk2 f6278j0;

                /* JADX INFO: renamed from: k0 */
                public final hk2 f6279k0;

                /* JADX INFO: renamed from: l0 */
                public nv2 f6280l0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCSecondLayerFooter(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 17 */            this.f6275g0 = r51.m8065b(new lv2(this, 2));
/* 29 */            this.f6276h0 = r51.m8065b(new lv2(this, 3));
/* 41 */            this.f6277i0 = r51.m8065b(new lv2(this, 0));
/* 53 */            this.f6278j0 = r51.m8065b(new lv2(this, 4));
/* 65 */            this.f6279k0 = r51.m8065b(new lv2(this, 1));
/* 73 */            LayoutInflater.from(context).inflate(R$layout.uc_footer, this);
                }

                private final LinearLayout getUcFooterButtonsContainer() {
/* 7 */             return (LinearLayout) this.f6277i0.getValue();
                }

                private final View getUcFooterDivider() {
/* 7 */             return (View) this.f6279k0.getValue();
                }

                private final UCToggle getUcFooterSwitch() {
/* 7 */             return (UCToggle) this.f6275g0.getValue();
                }

                private final UCTextView getUcFooterSwitchText() {
/* 7 */             return (UCTextView) this.f6276h0.getValue();
                }

                private final UCTextView getUcFooterTextProvider() {
/* 7 */             return (UCTextView) this.f6278j0.getValue();
                }

                /* JADX INFO: renamed from: j */
                public static void m2810j(UCSecondLayerFooter uCSecondLayerFooter) {
/* 5 */             uCSecondLayerFooter.getUcFooterSwitch().toggle();
                }

                /* JADX INFO: renamed from: k */
                public final void m2811k(nv2 nv2Var) {
                    boolean z;
                    float fM10219n;
                    int iM10219n;
                    int iM10219n2;
/* 5 */             nv2Var.getClass();
/* 8 */             this.f6280l0 = nv2Var;
/* 14 */            C2131r4 c2131r4 = (C2131r4) nv2Var.f14476a.f9631d;
/* 22 */            String str = c2131r4 != null ? c2131r4.f15867b : null;
/* 23 */            char c = '\b';
/* 26 */            int i = 1;
/* 29 */            if (str == null || !(!StringsKt.m6228D(str))) {
/* 120 */               getUcFooterSwitch().setVisibility(8);
/* 127 */               getUcFooterSwitchText().setVisibility(8);
                    } else {
/* 42 */                getUcFooterSwitch().setVisibility(0);
/* 49 */                getUcFooterSwitchText().setVisibility(0);
/* 56 */                getUcFooterSwitchText().setText(str);
/* 59 */                UCToggle ucFooterSwitch = getUcFooterSwitch();
/* 63 */                nv2 nv2Var2 = this.f6280l0;
/* 65 */                if (nv2Var2 == null) {
/* 112 */                   Intrinsics.m6220e("viewModel");
/* 115 */                   throw null;
                        }
/* 71 */                ucFooterSwitch.setCurrentState(nv2Var2.f14481f.f19838q);
/* 85 */                getUcFooterSwitch().setListener(new C1983o(this, 24));
/* 98 */                getUcFooterSwitchText().setOnClickListener(new h51(this, 4));
/* 101 */               UCTextView ucFooterSwitchText = getUcFooterSwitchText();
/* 105 */               ucFooterSwitchText.getClass();
/* 108 */               xe2.m9765c(ucFooterSwitchText);
                    }
/* 130 */           nv2 nv2Var3 = this.f6280l0;
/* 132 */           if (nv2Var3 == null) {
/* 517 */               Intrinsics.m6220e("viewModel");
/* 520 */               throw null;
                    }
/* 138 */           C2131r4 c2131r5 = (C2131r4) nv2Var3.f14476a.f9630c;
/* 145 */           String str2 = c2131r5 != null ? c2131r5.f15867b : null;
/* 146 */           if (str2 != null) {
/* 152 */               getUcFooterTextProvider().setVisibility(0);
/* 159 */               getUcFooterTextProvider().setText(str2);
/* 162 */               z = true;
                    } else {
/* 168 */               getUcFooterTextProvider().setVisibility(8);
/* 171 */               z = false;
                    }
/* 172 */           LinearLayout ucFooterButtonsContainer = getUcFooterButtonsContainer();
/* 180 */           ViewGroup.LayoutParams layoutParams = getUcFooterButtonsContainer().getLayoutParams();
/* 184 */           layoutParams.getClass();
/* 188 */           ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
/* 194 */           layoutParams2.setMarginStart(layoutParams2.getMarginStart());
/* 201 */           layoutParams2.setMarginEnd(layoutParams2.getMarginEnd());
/* 206 */           ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
/* 210 */           if (z) {
/* 212 */               Context context = getContext();
/* 216 */               context.getClass();
/* 219 */               fM10219n = yy1.m10219n(8.0f, context);
                    } else {
/* 225 */               Context context2 = getContext();
/* 229 */               context2.getClass();
/* 234 */               fM10219n = yy1.m10219n(16.0f, context2);
                    }
/* 239 */           ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) fM10219n;
/* 241 */           ucFooterButtonsContainer.setLayoutParams(layoutParams);
/* 248 */           getUcFooterButtonsContainer().removeAllViews();
/* 251 */           nv2 nv2Var4 = this.f6280l0;
/* 253 */           if (nv2Var4 == null) {
/* 513 */               Intrinsics.m6220e("viewModel");
/* 516 */               throw null;
                    }
/* 261 */           List list = (List) nv2Var4.f14482g.getValue();
/* 267 */           int i2 = 0;
/* 272 */           for (Object obj : list) {
/* 278 */               int i3 = i2 + 1;
/* 280 */               if (i2 < 0) {
/* 505 */                   C2085pw.m7568g();
/* 508 */                   throw null;
                        }
/* 282 */               List list2 = (List) obj;
/* 293 */               int i4 = i2 == list.size() - i ? i : 0;
/* 302 */               ArrayList arrayList = new ArrayList(C2122qw.m8020h(list2, 10));
/* 309 */               int i5 = 0;
/* 315 */               for (Object obj2 : list2) {
/* 321 */                   int i6 = i5 + 1;
/* 323 */                   if (i5 < 0) {
/* 426 */                       C2085pw.m7568g();
/* 429 */                       throw null;
                            }
/* 325 */                   gt2 gt2Var = (gt2) obj2;
/* 327 */                   int i7 = i;
/* 331 */                   Context context3 = getContext();
/* 335 */                   context3.getClass();
/* 338 */                   UCButton uCButton = new UCButton(context3, null);
/* 343 */                   LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
/* 348 */                   layoutParams3.weight = 1.0f;
/* 361 */                   int i8 = i5 == list2.size() + (-1) ? i7 : 0;
/* 362 */                   layoutParams3.setMarginStart(0);
/* 365 */                   layoutParams3.topMargin = 0;
/* 367 */                   if (i8 == 0) {
/* 369 */                       Context context4 = getContext();
/* 373 */                       context4.getClass();
/* 380 */                       iM10219n = (int) yy1.m10219n(8.0f, context4);
                            } else {
/* 382 */                       iM10219n = 0;
                            }
/* 383 */                   layoutParams3.setMarginEnd(iM10219n);
/* 386 */                   if (i4 == 0) {
/* 388 */                       Context context5 = getContext();
/* 392 */                       context5.getClass();
/* 399 */                       iM10219n2 = (int) yy1.m10219n(8.0f, context5);
                            } else {
/* 401 */                       iM10219n2 = 0;
                            }
/* 402 */                   layoutParams3.bottomMargin = iM10219n2;
/* 404 */                   uCButton.setLayoutParams(layoutParams3);
/* 414 */                   uCButton.m2784k(gt2Var, new C1908lz(8, this, gt2Var));
/* 417 */                   arrayList.add(uCButton);
/* 420 */                   i = i7;
/* 422 */                   c = '\b';
/* 423 */                   i5 = i6;
                        }
/* 430 */               char c2 = c;
/* 437 */               if (arrayList.size() == i) {
/* 449 */                   getUcFooterButtonsContainer().addView((UCButton) arrayList.get(0));
                        } else {
/* 459 */                   LinearLayout linearLayout = new LinearLayout(getContext());
/* 468 */                   linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
/* 471 */                   linearLayout.setOrientation(0);
/* 474 */                   Iterator it = arrayList.iterator();
/* 482 */                   while (it.hasNext()) {
/* 490 */                       linearLayout.addView((UCButton) it.next());
                            }
/* 498 */                   getUcFooterButtonsContainer().addView(linearLayout);
                        }
/* 501 */               i2 = i3;
/* 502 */               c = c2;
                    }
/* 509 */           invalidate();
                }

                /* JADX INFO: renamed from: l */
                public final void m2812l(ew2 ew2Var) {
/* 1 */             ew2Var.getClass();
/* 8 */             getUcFooterSwitch().m2800f(ew2Var);
/* 11 */            UCTextView ucFooterSwitchText = getUcFooterSwitchText();
/* 15 */            ucFooterSwitchText.getClass();
/* 20 */            UCTextView.m2794h(ucFooterSwitchText, ew2Var, 14);
/* 27 */            getUcFooterTextProvider().m2797j(ew2Var);
/* 30 */            View ucFooterDivider = getUcFooterDivider();
/* 34 */            wt2 wt2Var = ew2Var.f7907a;
/* 38 */            ucFooterDivider.setBackgroundColor(wt2Var.f18814j);
/* 41 */            Integer num = wt2Var.f18809e;
/* 43 */            if (num != null) {
/* 49 */                setBackgroundColor(num.intValue());
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 76 */        public UCSecondLayerFooter(Context context, AttributeSet attributeSet) {
/* 77 */            this(context, attributeSet, 0);
                    context.getClass();
                }
            }
