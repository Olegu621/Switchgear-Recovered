            package com.usercentrics.sdk.p008ui.components;

            import android.R;
            import android.content.Context;
            import android.graphics.Color;
            import android.graphics.Typeface;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.GradientDrawable;
            import android.graphics.drawable.StateListDrawable;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.usercentrics.sdk.p008ui.R$layout;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import okhttp3.HttpUrl;
            import p000.AbstractC0196bx;
            import p000.ct2;
            import p000.gt2;
            import p000.h51;
            import p000.hk2;
            import p000.r51;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/UCButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/usercentrics/sdk/ui/components/UCImageView;", "kotlin.jvm.PlatformType", "g0", "Lp51;", "getUcButtonBackground", "()Lcom/usercentrics/sdk/ui/components/UCImageView;", "ucButtonBackground", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "h0", "getUcButtonText", "()Lcom/usercentrics/sdk/ui/components/UCTextView;", "ucButtonText", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 43 */    public final class UCButton extends ConstraintLayout {

                /* JADX INFO: renamed from: i0 */
                public static final /* synthetic */ int f6240i0 = 0;

                /* JADX INFO: renamed from: g0 */
                public final hk2 f6241g0;

                /* JADX INFO: renamed from: h0 */
                public final hk2 f6242h0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCButton(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 17 */            this.f6241g0 = r51.m8065b(new ct2(this, 0));
/* 29 */            this.f6242h0 = r51.m8065b(new ct2(this, 1));
/* 41 */            LayoutInflater.from(getContext()).inflate(R$layout.uc_button, this);
                }

                private final UCImageView getUcButtonBackground() {
/* 7 */             return (UCImageView) this.f6241g0.getValue();
                }

                private final UCTextView getUcButtonText() {
/* 3 */             Object value = this.f6242h0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCTextView) value;
                }

                /* JADX INFO: renamed from: j */
                public static GradientDrawable m2783j(int i, UCButton uCButton, int i2, Integer num, int i3) {
/* 3 */             if ((i3 & 8) != 0) {
/* 5 */                 num = null;
                    }
/* 8 */             GradientDrawable gradientDrawable = new GradientDrawable();
/* 12 */            gradientDrawable.setCornerRadius(i);
/* 15 */            gradientDrawable.setColor(i2);
/* 18 */            if (num != null) {
/* 20 */                int iIntValue = num.intValue();
/* 24 */                Context context = uCButton.getContext();
/* 28 */                context.getClass();
/* 38 */                gradientDrawable.setStroke((int) yy1.m10219n(4.0f, context), iIntValue);
                    }
/* 41 */            return gradientDrawable;
                }

                public final CharSequence getText() {
/* 5 */             CharSequence text = getUcButtonText().getText();
/* 9 */             text.getClass();
/* 12 */            return text;
                }

                /* JADX INFO: renamed from: k */
                public final void m2784k(gt2 gt2Var, Function0 function0) {
                    boolean z;
/* 5 */             gt2Var.getClass();
/* 10 */            setText(gt2Var.f8810a);
/* 21 */            setOnClickListener(new h51(function0, 1));
/* 24 */            Context context = getContext();
/* 28 */            context.getClass();
/* 38 */            setMinimumHeight((int) yy1.m10219n(40.0f, context));
/* 46 */            getUcButtonText().setLetterSpacing(0.0f);
/* 49 */            Integer num = gt2Var.f8811b;
/* 52 */            if (num != null) {
/* 54 */                int iIntValue = num.intValue();
/* 58 */                int i = gt2Var.f8812c;
/* 60 */                Context context2 = getContext();
/* 64 */                context2.getClass();
/* 72 */                int iM10219n = (int) yy1.m10219n(i, context2);
/* 73 */                ViewParent parent = getParent();
/* 85 */                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
/* 93 */                Drawable background = viewGroup != null ? viewGroup.getBackground() : null;
/* 101 */               ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
/* 109 */               int color = colorDrawable != null ? colorDrawable.getColor() : -1;
/* 116 */               if (Color.alpha(iIntValue) < 255) {
/* 118 */                   iIntValue = AbstractC0196bx.m1452d(iIntValue, color);
                        }
/* 123 */               int[] iArr = {-1, -16777216, -65536, -16711936, -256, -16776961};
/* 128 */               int i2 = iArr[0];
/* 130 */               double d = -1.0d;
/* 132 */               int i3 = 0;
/* 133 */               while (i3 < 6) {
/* 135 */                   int i4 = iArr[i3];
/* 141 */                   int i5 = iM10219n;
/* 147 */                   double dMin = Math.min(AbstractC0196bx.m1450b(i4, iIntValue), AbstractC0196bx.m1450b(i4, color));
/* 153 */                   if (dMin > d) {
/* 155 */                       d = dMin;
/* 156 */                       i2 = i4;
                            }
/* 157 */                   i3++;
/* 159 */                   iM10219n = i5;
                        }
/* 167 */               GradientDrawable gradientDrawableM2783j = m2783j(iM10219n, this, iIntValue, null, 24);
/* 177 */               GradientDrawable gradientDrawableM2783j2 = m2783j(iM10219n, this, iIntValue, Integer.valueOf(i2), 16);
/* 183 */               StateListDrawable stateListDrawable = new StateListDrawable();
/* 193 */               stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawableM2783j2);
/* 196 */               z = false;
/* 199 */               stateListDrawable.addState(new int[0], gradientDrawableM2783j);
/* 202 */               setBackground(stateListDrawable);
                    } else {
/* 206 */               z = false;
                    }
/* 207 */           UCTextView ucButtonText = getUcButtonText();
/* 213 */           ucButtonText.setTypeface(Typeface.DEFAULT_BOLD);
/* 219 */           ucButtonText.setTextSize(2, gt2Var.f8814e);
/* 222 */           ucButtonText.setAllCaps(z);
/* 225 */           Integer num2 = gt2Var.f8813d;
/* 227 */           if (num2 != null) {
/* 233 */               ucButtonText.setTextColor(num2.intValue());
                    }
                }

                public final void setText(CharSequence charSequence) {
/* 1 */             charSequence.getClass();
/* 8 */             getUcButtonText().setText(charSequence);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 44 */        public UCButton(Context context, AttributeSet attributeSet) {
/* 45 */            this(context, attributeSet, 0);
                    context.getClass();
                }
            }
