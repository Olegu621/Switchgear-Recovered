            package com.usercentrics.sdk.p008ui.components.cards;

            import android.content.Context;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCButton;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.components.UCToggle;
            import com.usercentrics.sdk.p008ui.components.cards.UCCard;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C2498yh;
            import p000.RunnableC1012i1;
            import p000.au1;
            import p000.ew2;
            import p000.fw2;
            import p000.hk2;
            import p000.jv2;
            import p000.kb1;
            import p000.ma2;
            import p000.mt2;
            import p000.n01;
            import p000.nk2;
            import p000.nt2;
            import p000.ot2;
            import p000.r51;
            import p000.st2;
            import p000.wt2;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001e\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR#\u0010#\u001a\n \u001a*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"R#\u0010(\u001a\n \u001a*\u0004\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010'R#\u0010+\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u001dR#\u00100\u001a\n \u001a*\u0004\u0018\u00010,0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010/R#\u00105\u001a\n \u001a*\u0004\u0018\u000101018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b3\u00104R#\u00108\u001a\n \u001a*\u0004\u0018\u000101018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0015\u001a\u0004\b7\u00104R#\u0010;\u001a\n \u001a*\u0004\u0018\u00010,0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0015\u001a\u0004\b:\u0010/R#\u0010>\u001a\n \u001a*\u0004\u0018\u000101018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0015\u001a\u0004\b=\u00104R#\u0010A\u001a\n \u001a*\u0004\u0018\u000101018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0015\u001a\u0004\b@\u00104R\u001d\u0010F\u001a\u0004\u0018\u00010B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0015\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u0015\u001a\u0004\bI\u0010JR8\u0010T\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0Lj\u0002`M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006U"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/cards/UCCard;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lst2;", "model", HttpUrl.FRAGMENT_ENCODE_SET, "setExpandableInteraction", "(Lst2;)V", HttpUrl.FRAGMENT_ENCODE_SET, "isClickable", "setCardClickable", "(Z)V", "a", "Lp51;", "getCardDefaultMargin", "()I", "cardDefaultMargin", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "kotlin.jvm.PlatformType", "b", "getUcCardTitle", "()Lcom/usercentrics/sdk/ui/components/UCTextView;", "ucCardTitle", "Lcom/usercentrics/sdk/ui/components/UCToggle;", "c", "getUcCardSwitch", "()Lcom/usercentrics/sdk/ui/components/UCToggle;", "ucCardSwitch", "Lcom/usercentrics/sdk/ui/components/UCButton;", "d", "getUcCardIcon", "()Lcom/usercentrics/sdk/ui/components/UCButton;", "ucCardIcon", "e", "getUcCardDescription", "ucCardDescription", "Landroid/view/ViewGroup;", "f", "getUcCardExpandableContent", "()Landroid/view/ViewGroup;", "ucCardExpandableContent", "Landroid/view/View;", "i", "getUcCardHeader", "()Landroid/view/View;", "ucCardHeader", "v", "getUcCardSwitchListDivider", "ucCardSwitchListDivider", "w", "getUcCardSwitchList", "ucCardSwitchList", "U", "getUcCardBottomSpacing", "ucCardBottomSpacing", "V", "getUcCardDividerExpandedContent", "ucCardDividerExpandedContent", "Landroid/graphics/drawable/Drawable;", "W", "getExpandIconDrawable", "()Landroid/graphics/drawable/Drawable;", "expandIconDrawable", "Lau1;", "a0", "getAriaLabels", "()Lau1;", "ariaLabels", "Lkotlin/Function2;", "Lcom/usercentrics/sdk/ui/components/cards/UCCardExpandedListener;", "d0", "Lkotlin/jvm/functions/Function2;", "getOnExpandedListener", "()Lkotlin/jvm/functions/Function2;", "setOnExpandedListener", "(Lkotlin/jvm/functions/Function2;)V", "onExpandedListener", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 189 */   public final class UCCard extends LinearLayout {

                /* JADX INFO: renamed from: e0 */
                public static final /* synthetic */ int f6254e0 = 0;

                /* JADX INFO: renamed from: U */
                public final hk2 f6255U;

                /* JADX INFO: renamed from: V */
                public final hk2 f6256V;

                /* JADX INFO: renamed from: W */
                public final hk2 f6257W;

                /* JADX INFO: renamed from: a */
                public final hk2 f6258a;

                /* JADX INFO: renamed from: a0 */
                public final hk2 f6259a0;

                /* JADX INFO: renamed from: b */
                public final hk2 f6260b;

                /* JADX INFO: renamed from: b0 */
                public boolean f6261b0;

                /* JADX INFO: renamed from: c */
                public final hk2 f6262c;

                /* JADX INFO: renamed from: c0 */
                public Function1 f6263c0;

                /* JADX INFO: renamed from: d */
                public final hk2 f6264d;

                /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
                public Function2 onExpandedListener;

                /* JADX INFO: renamed from: e */
                public final hk2 f6266e;

                /* JADX INFO: renamed from: f */
                public final hk2 f6267f;

                /* JADX INFO: renamed from: i */
                public final hk2 f6268i;

                /* JADX INFO: renamed from: v */
                public final hk2 f6269v;

                /* JADX INFO: renamed from: w */
                public final hk2 f6270w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCCard(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 17 */            this.f6258a = r51.m8065b(new ot2(this, 0));
/* 30 */            this.f6260b = r51.m8065b(new ot2(this, 11));
/* 43 */            this.f6262c = r51.m8065b(new ot2(this, 8));
/* 55 */            this.f6264d = r51.m8065b(new ot2(this, 7));
/* 67 */            this.f6266e = r51.m8065b(new ot2(this, 3));
/* 79 */            this.f6267f = r51.m8065b(new ot2(this, 5));
/* 91 */            this.f6268i = r51.m8065b(new ot2(this, 6));
/* 104 */           this.f6269v = r51.m8065b(new ot2(this, 10));
/* 117 */           this.f6270w = r51.m8065b(new ot2(this, 9));
/* 129 */           this.f6255U = r51.m8065b(new ot2(this, 2));
/* 141 */           this.f6256V = r51.m8065b(new ot2(this, 4));
/* 153 */           this.f6257W = r51.m8065b(new ot2(this, 1));
/* 161 */           this.f6259a0 = r51.m8065b(C2498yh.f19624f0);
/* 165 */           this.f6263c0 = nk2.f14342e;
/* 169 */           this.onExpandedListener = ma2.f13668d;
/* 173 */           View.inflate(context, R$layout.uc_card, this);
/* 184 */           getUcCardIcon().setBackground(getExpandIconDrawable());
/* 187 */           setOrientation(1);
                }

                /* JADX INFO: renamed from: a */
                public static void m2801a(UCCard uCCard) {
/* 1 */             View ucCardHeader = uCCard.getUcCardHeader();
/* 5 */             ucCardHeader.getClass();
/* 8 */             xe2.m9765c(ucCardHeader);
/* 11 */            UCButton ucCardIcon = uCCard.getUcCardIcon();
/* 15 */            ucCardIcon.getClass();
/* 18 */            xe2.m9765c(ucCardIcon);
                }

                private final au1 getAriaLabels() {
/* 7 */             return (au1) this.f6259a0.getValue();
                }

                private final int getCardDefaultMargin() {
/* 9 */             return ((Number) this.f6258a.getValue()).intValue();
                }

                private final Drawable getExpandIconDrawable() {
/* 7 */             return (Drawable) this.f6257W.getValue();
                }

                private final View getUcCardBottomSpacing() {
/* 7 */             return (View) this.f6255U.getValue();
                }

                private final UCTextView getUcCardDescription() {
/* 7 */             return (UCTextView) this.f6266e.getValue();
                }

                private final View getUcCardDividerExpandedContent() {
/* 7 */             return (View) this.f6256V.getValue();
                }

                private final ViewGroup getUcCardExpandableContent() {
/* 7 */             return (ViewGroup) this.f6267f.getValue();
                }

                private final View getUcCardHeader() {
/* 7 */             return (View) this.f6268i.getValue();
                }

                private final UCButton getUcCardIcon() {
/* 7 */             return (UCButton) this.f6264d.getValue();
                }

                private final UCToggle getUcCardSwitch() {
/* 7 */             return (UCToggle) this.f6262c.getValue();
                }

                private final ViewGroup getUcCardSwitchList() {
/* 7 */             return (ViewGroup) this.f6270w.getValue();
                }

                private final View getUcCardSwitchListDivider() {
/* 7 */             return (View) this.f6269v.getValue();
                }

                private final UCTextView getUcCardTitle() {
/* 7 */             return (UCTextView) this.f6260b.getValue();
                }

                private final void setCardClickable(boolean isClickable) {
/* 1 */             View ucCardHeader = getUcCardHeader();
/* 5 */             ucCardHeader.setClickable(isClickable);
/* 8 */             ucCardHeader.setFocusable(isClickable);
/* 11 */            UCButton ucCardIcon = getUcCardIcon();
/* 15 */            ucCardIcon.setClickable(isClickable);
/* 18 */            ucCardIcon.setFocusable(isClickable);
                }

                private final void setExpandableInteraction(st2 model) {
/* 3 */             boolean zIsEmpty = model.f16778e.isEmpty();
/* 9 */             setCardClickable(!zIsEmpty);
/* 12 */            if (zIsEmpty) {
/* 20 */                getUcCardIcon().setVisibility(8);
/* 23 */                return;
                    }
/* 29 */            getUcCardIcon().setVisibility(0);
/* 38 */            final int i = 0;
/* 42 */            getUcCardHeader().setOnClickListener(new View.OnClickListener(this) { // from class: lt2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ UCCard f13495b;

                        {
/* 3 */                     this.f13495b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
/* 1 */                     int i2 = i;
/* 3 */                     UCCard uCCard = this.f13495b;
                            switch (i2) {
                                case 0:
/* 26 */                            int i3 = UCCard.f6254e0;
/* 30 */                            boolean z = !uCCard.f6261b0;
/* 32 */                            uCCard.f6261b0 = z;
/* 40 */                            uCCard.f6263c0.invoke(Boolean.valueOf(z));
                                    break;
                                default:
/* 8 */                             int i4 = UCCard.f6254e0;
/* 12 */                            boolean z2 = !uCCard.f6261b0;
/* 14 */                            uCCard.f6261b0 = z2;
/* 22 */                            uCCard.f6263c0.invoke(Boolean.valueOf(z2));
                                    break;
                            }
                        }
                    });
/* 51 */            final int i2 = 1;
/* 55 */            getUcCardIcon().setOnClickListener(new View.OnClickListener(this) { // from class: lt2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ UCCard f13495b;

                        {
/* 3 */                     this.f13495b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
/* 1 */                     int i3 = i2;
/* 3 */                     UCCard uCCard = this.f13495b;
                            switch (i3) {
                                case 0:
/* 26 */                            int i4 = UCCard.f6254e0;
/* 30 */                            boolean z = !uCCard.f6261b0;
/* 32 */                            uCCard.f6261b0 = z;
/* 40 */                            uCCard.f6263c0.invoke(Boolean.valueOf(z));
                                    break;
                                default:
/* 8 */                             int i5 = UCCard.f6254e0;
/* 12 */                            boolean z2 = !uCCard.f6261b0;
/* 14 */                            uCCard.f6261b0 = z2;
/* 22 */                            uCCard.f6263c0.invoke(Boolean.valueOf(z2));
                                    break;
                            }
                        }
                    });
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v0, types: [jv2] */
                /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.functions.Function1] */
                /* JADX WARN: Type inference failed for: r10v2, types: [nt2] */
                /* JADX INFO: renamed from: b */
                public final void m2802b(ew2 ew2Var, st2 st2Var, boolean z, jv2 jv2Var, n01 n01Var) {
                    String string;
/* 1 */             ew2Var.getClass();
/* 18 */            getUcCardTitle().setText(StringsKt.m6239O(st2Var.f16775b).toString());
/* 33 */            getUcCardTitle().setLabelFor(getUcCardSwitch().getId());
/* 36 */            String str = st2Var.f16776c;
/* 38 */            if (str == null || (string = StringsKt.m6239O(str).toString()) == null) {
/* 50 */                string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 56 */            getUcCardDescription().setText(string);
/* 59 */            boolean zM6228D = StringsKt.m6228D(string);
/* 75 */            getUcCardDescription().setVisibility(!zM6228D ? 0 : 8);
/* 87 */            getUcCardBottomSpacing().setVisibility(zM6228D ? 0 : 8);
/* 90 */            fw2 fw2Var = st2Var.f16777d;
/* 92 */            if (fw2Var != null) {
/* 98 */                getUcCardSwitch().m2799e(fw2Var);
/* 105 */               getUcCardSwitch().setVisibility(0);
                    } else {
/* 113 */               getUcCardSwitch().setVisibility(8);
                    }
/* 116 */           List<fw2> list = st2Var.f16779f;
/* 118 */           if (list == null || list.isEmpty()) {
/* 234 */               getUcCardSwitchList().removeAllViews();
/* 237 */               m2805e(false);
                    } else {
/* 131 */               getUcCardSwitchList().removeAllViews();
/* 135 */               m2805e(true);
/* 146 */               for (fw2 fw2Var2 : list) {
/* 165 */                   View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.uc_card_extra_switch, (ViewGroup) null);
/* 175 */                   UCTextView uCTextView = (UCTextView) viewInflate.findViewById(R$id.ucCardSwitchText);
/* 179 */                   uCTextView.setText(fw2Var2.f8388d);
/* 184 */                   Integer num = ew2Var.f7907a.f18805a;
/* 186 */                   if (num != null) {
/* 192 */                       uCTextView.setTextColor(num.intValue());
                            }
/* 201 */                   UCToggle uCToggle = (UCToggle) viewInflate.findViewById(R$id.ucCardSwitchInside);
/* 205 */                   uCToggle.setContentDescription(fw2Var2.f8388d);
/* 208 */                   uCToggle.m2800f(ew2Var);
/* 211 */                   uCToggle.m2799e(fw2Var2);
/* 218 */                   getUcCardSwitchList().addView(viewInflate);
/* 226 */                   post(new RunnableC1012i1(viewInflate, 1));
                        }
                    }
/* 240 */           if (jv2Var == 0) {
/* 244 */               jv2Var = new nt2(this, ew2Var, st2Var, n01Var);
                    }
/* 247 */           this.f6263c0 = jv2Var;
/* 249 */           this.f6261b0 = z;
/* 255 */           getUcCardExpandableContent().removeAllViews();
/* 258 */           m2806f(ew2Var, st2Var, n01Var);
/* 261 */           setExpandableInteraction(st2Var);
                }

                /* JADX INFO: renamed from: c */
                public final void m2803c(ew2 ew2Var) {
                    Integer num;
/* 1 */             ew2Var.getClass();
/* 4 */             wt2 wt2Var = ew2Var.f7907a;
/* 6 */             Context context = getContext();
/* 10 */            context.getClass();
/* 17 */            setBackground(kb1.m6033F(wt2Var, context));
/* 20 */            UCTextView ucCardTitle = getUcCardTitle();
/* 24 */            ucCardTitle.getClass();
/* 29 */            UCTextView.m2794h(ucCardTitle, ew2Var, 12);
/* 32 */            UCTextView ucCardDescription = getUcCardDescription();
/* 36 */            ucCardDescription.getClass();
/* 41 */            UCTextView.m2794h(ucCardDescription, ew2Var, 14);
/* 48 */            getUcCardSwitch().m2800f(ew2Var);
/* 51 */            View ucCardSwitchListDivider = getUcCardSwitchListDivider();
/* 55 */            int i = wt2Var.f18814j;
/* 57 */            ucCardSwitchListDivider.setBackgroundColor(i);
/* 64 */            getUcCardDividerExpandedContent().setBackgroundColor(i);
/* 67 */            Drawable expandIconDrawable = getExpandIconDrawable();
/* 71 */            if (expandIconDrawable == null || (num = wt2Var.f18806b) == null) {
/* 91 */                return;
                    }
/* 88 */            expandIconDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
                }

                /* JADX INFO: renamed from: d */
                public final void m2804d(boolean z) {
/* 8 */             int cardDefaultMargin = z ? getCardDefaultMargin() : 0;
/* 9 */             UCTextView ucCardDescription = getUcCardDescription();
/* 13 */            ucCardDescription.getClass();
/* 28 */            ucCardDescription.setPaddingRelative(ucCardDescription.getPaddingLeft(), ucCardDescription.getPaddingTop(), ucCardDescription.getPaddingRight(), cardDefaultMargin);
                }

                /* JADX INFO: renamed from: e */
                public final void m2805e(boolean z) {
/* 6 */             int i = z ? 0 : 8;
/* 12 */            getUcCardSwitchList().setVisibility(i);
/* 19 */            getUcCardSwitchListDivider().setVisibility(i);
/* 22 */            View ucCardDividerExpandedContent = getUcCardDividerExpandedContent();
/* 26 */            ucCardDividerExpandedContent.getClass();
/* 33 */            int cardDefaultMargin = z ? 0 : getCardDefaultMargin();
/* 37 */            ViewGroup.LayoutParams layoutParams = ucCardDividerExpandedContent.getLayoutParams();
/* 41 */            layoutParams.getClass();
/* 46 */            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = cardDefaultMargin;
/* 55 */            View ucCardSwitchList = z ? getUcCardSwitchList() : getUcCardTitle();
/* 63 */            ViewGroup.LayoutParams layoutParams2 = getUcCardIcon().getLayoutParams();
/* 67 */            layoutParams2.getClass();
/* 70 */            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
/* 76 */            layoutParams3.f1118l = ucCardSwitchList.getId();
/* 82 */            layoutParams3.f1112i = ucCardSwitchList.getId();
/* 84 */            layoutParams3.f1134v = 0;
                }

                /* JADX INFO: renamed from: f */
                public final void m2806f(ew2 ew2Var, st2 st2Var, Function1 function1) {
                    String str;
/* 1 */             String str2 = st2Var.f16775b;
/* 3 */             List list = st2Var.f16778e;
/* 8 */             if (this.f6261b0) {
/* 16 */                getUcCardIcon().setRotation(180.0f);
/* 19 */                View ucCardHeader = getUcCardHeader();
/* 23 */                ucCardHeader.getClass();
/* 26 */                int cardDefaultMargin = getCardDefaultMargin();
/* 30 */                ViewGroup.LayoutParams layoutParams = ucCardHeader.getLayoutParams();
/* 34 */                layoutParams.getClass();
/* 39 */                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = cardDefaultMargin;
/* 45 */                if (!list.isEmpty()) {
/* 50 */                    Context context = getContext();
/* 54 */                    context.getClass();
/* 58 */                    UCCardSections uCCardSections = new UCCardSections(context, null);
/* 61 */                    uCCardSections.m2807a(ew2Var, list, function1);
/* 68 */                    getUcCardExpandableContent().addView(uCCardSections);
                        }
/* 71 */                m2804d(false);
/* 78 */                getUcCardDividerExpandedContent().setVisibility(0);
/* 85 */                str = getAriaLabels().f2095b;
                    } else {
/* 92 */                getUcCardExpandableContent().removeAllViews();
/* 100 */               getUcCardIcon().setRotation(0.0f);
/* 103 */               View ucCardHeader2 = getUcCardHeader();
/* 107 */               ucCardHeader2.getClass();
/* 110 */               ViewGroup.LayoutParams layoutParams2 = ucCardHeader2.getLayoutParams();
/* 114 */               layoutParams2.getClass();
/* 119 */               ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
/* 122 */               m2804d(true);
/* 131 */               getUcCardDividerExpandedContent().setVisibility(8);
/* 138 */               str = getAriaLabels().f2097d;
                    }
/* 168 */           String str3 = str + " " + str2 + " " + getAriaLabels().f2100g;
/* 180 */           String strM3508l = AbstractC0886en.m3508l(str, " ", StringsKt.m6239O(str2).toString());
/* 188 */           getUcCardHeader().setContentDescription(str3);
/* 195 */           getUcCardIcon().setContentDescription(strM3508l);
/* 203 */           post(new mt2(this, 0));
                }

                public final Function2<Integer, Integer, Unit> getOnExpandedListener() {
/* 1 */             return this.onExpandedListener;
                }

                public final void setOnExpandedListener(Function2<? super Integer, ? super Integer, Unit> function2) {
/* 1 */             function2.getClass();
/* 4 */             this.onExpandedListener = function2;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 190 */       public UCCard(Context context, AttributeSet attributeSet) {
/* 191 */           this(context, attributeSet, 0);
                    context.getClass();
                }
            }
