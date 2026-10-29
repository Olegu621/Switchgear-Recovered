            package com.usercentrics.sdk.p008ui.components;

            import android.content.Context;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCControllerId;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.bu2;
            import p000.cu2;
            import p000.du2;
            import p000.ew2;
            import p000.f72;
            import p000.hk2;
            import p000.kb1;
            import p000.r51;
            import p000.wt2;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u001c¨\u0006#"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/UCControllerId;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "g0", "Lp51;", "getUcControllerIdLabel", "()Lcom/usercentrics/sdk/ui/components/UCTextView;", "ucControllerIdLabel", "h0", "getUcControllerIdValue", "ucControllerIdValue", "Lcom/usercentrics/sdk/ui/components/UCImageView;", "i0", "getUcControllerIdCopy", "()Lcom/usercentrics/sdk/ui/components/UCImageView;", "ucControllerIdCopy", "Landroid/graphics/drawable/Drawable;", "j0", "getDefaultIconDrawable", "()Landroid/graphics/drawable/Drawable;", "defaultIconDrawable", "k0", "getCheckedIconDrawable", "checkedIconDrawable", "Companion", "bu2", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 78 */    public final class UCControllerId extends ConstraintLayout {
                public static final bu2 Companion = new bu2();

                /* JADX INFO: renamed from: g0 */
                public final hk2 f6243g0;

                /* JADX INFO: renamed from: h0 */
                public final hk2 f6244h0;

                /* JADX INFO: renamed from: i0 */
                public final hk2 f6245i0;

                /* JADX INFO: renamed from: j0 */
                public final hk2 f6246j0;

                /* JADX INFO: renamed from: k0 */
                public final hk2 f6247k0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCControllerId(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 17 */            this.f6243g0 = r51.m8065b(new cu2(this, 3));
/* 29 */            this.f6244h0 = r51.m8065b(new cu2(this, 4));
/* 41 */            this.f6245i0 = r51.m8065b(new cu2(this, 2));
/* 53 */            this.f6246j0 = r51.m8065b(new cu2(this, 1));
/* 65 */            this.f6247k0 = r51.m8065b(new cu2(this, 0));
/* 73 */            LayoutInflater.from(context).inflate(R$layout.uc_controller_id, this);
/* 76 */            m2787l();
                }

                private final Drawable getCheckedIconDrawable() {
/* 7 */             return (Drawable) this.f6247k0.getValue();
                }

                private final Drawable getDefaultIconDrawable() {
/* 7 */             return (Drawable) this.f6246j0.getValue();
                }

                private final UCImageView getUcControllerIdCopy() {
/* 3 */             Object value = this.f6245i0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCImageView) value;
                }

                private final UCTextView getUcControllerIdLabel() {
/* 3 */             Object value = this.f6243g0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCTextView) value;
                }

                private final UCTextView getUcControllerIdValue() {
/* 3 */             Object value = this.f6244h0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCTextView) value;
                }

                /* JADX INFO: renamed from: j */
                public static void m2785j(du2 du2Var, UCControllerId uCControllerId, UCImageView uCImageView) {
/* 3 */             du2Var.f7416d.invoke();
/* 6 */             UCImageView ucControllerIdCopy = uCControllerId.getUcControllerIdCopy();
/* 11 */            ucControllerIdCopy.setEnabled(false);
/* 18 */            ucControllerIdCopy.setImageDrawable(uCControllerId.getCheckedIconDrawable());
/* 30 */            uCImageView.postDelayed(new f72(uCControllerId, 9), 3500L);
                }

                /* JADX INFO: renamed from: k */
                public final void m2786k(final du2 du2Var) {
/* 7 */             getUcControllerIdLabel().setText(du2Var.f7413a);
/* 10 */            UCTextView ucControllerIdValue = getUcControllerIdValue();
/* 16 */            ucControllerIdValue.setText(du2Var.f7414b);
/* 20 */            ucControllerIdValue.setImportantForAccessibility(2);
/* 43 */            ucControllerIdValue.setEllipsize(ucControllerIdValue.getResources().getConfiguration().getLayoutDirection() == 1 ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.END);
/* 46 */            final UCImageView ucControllerIdCopy = getUcControllerIdCopy();
/* 52 */            ucControllerIdCopy.setContentDescription(du2Var.f7415c);
/* 60 */            ucControllerIdCopy.setOnClickListener(new View.OnClickListener() { // from class: au2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
/* 7 */                     UCControllerId.m2785j(du2Var, this, ucControllerIdCopy);
                        }
                    });
                }

                /* JADX INFO: renamed from: l */
                public final void m2787l() {
/* 1 */             UCImageView ucControllerIdCopy = getUcControllerIdCopy();
/* 6 */             ucControllerIdCopy.setEnabled(true);
/* 13 */            ucControllerIdCopy.setImageDrawable(getDefaultIconDrawable());
/* 16 */            xe2.m9765c(ucControllerIdCopy);
                }

                /* JADX INFO: renamed from: m */
                public final void m2788m(ew2 ew2Var) {
/* 1 */             ew2Var.getClass();
/* 4 */             wt2 wt2Var = ew2Var.f7907a;
/* 6 */             Integer num = wt2Var.f18806b;
/* 8 */             Context context = getContext();
/* 12 */            context.getClass();
/* 19 */            setBackground(kb1.m6033F(wt2Var, context));
/* 28 */            UCTextView.m2795i(getUcControllerIdLabel(), ew2Var, 22);
/* 37 */            UCTextView.m2794h(getUcControllerIdValue(), ew2Var, 14);
/* 40 */            Drawable defaultIconDrawable = getDefaultIconDrawable();
/* 44 */            if (defaultIconDrawable != null && num != null) {
/* 59 */                defaultIconDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
                    }
/* 62 */            Drawable checkedIconDrawable = getCheckedIconDrawable();
/* 66 */            if (checkedIconDrawable == null || num == null) {
/* 84 */                return;
                    }
/* 81 */            checkedIconDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 79 */        public UCControllerId(Context context, AttributeSet attributeSet) {
/* 80 */            this(context, attributeSet, 0);
                    context.getClass();
                }
            }
