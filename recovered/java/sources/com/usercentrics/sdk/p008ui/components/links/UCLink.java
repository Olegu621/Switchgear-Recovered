            package com.usercentrics.sdk.p008ui.components.links;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import androidx.appcompat.widget.LinearLayoutCompat;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import com.usercentrics.sdk.p008ui.R$layout;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C0908f8;
            import p000.ew2;
            import p000.h51;
            import p000.hk2;
            import p000.r51;
            import p000.we2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/links/UCLink;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", HttpUrl.FRAGMENT_ENCODE_SET, "text", HttpUrl.FRAGMENT_ENCODE_SET, "setLinkText", "(Ljava/lang/String;)V", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "d0", "Lp51;", "getUcLinkText", "()Lcom/usercentrics/sdk/ui/components/UCTextView;", "ucLinkText", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 59 */    public final class UCLink extends LinearLayoutCompat {

                /* JADX INFO: renamed from: e0 */
                public static final /* synthetic */ int f6273e0 = 0;

                /* JADX INFO: renamed from: d0 */
                public final hk2 f6274d0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCLink(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 18 */            this.f6274d0 = r51.m8065b(new C0908f8(this, 16));
/* 26 */            LayoutInflater.from(context).inflate(R$layout.uc_link, this);
/* 30 */            setOrientation(0);
/* 35 */            setGravity(17);
/* 48 */            int dimension = (int) getResources().getDimension(R$dimen.ucLinkVerticalPadding);
/* 57 */            setPaddingRelative(getPaddingLeft(), dimension, getPaddingRight(), dimension);
                }

                private final UCTextView getUcLinkText() {
/* 3 */             Object value = this.f6274d0.getValue();
/* 7 */             value.getClass();
/* 10 */            return (UCTextView) value;
                }

                private final void setLinkText(String text) {
/* 5 */             getUcLinkText().setText(text);
                }

                /* JADX INFO: renamed from: j */
                public final void m2808j(we2 we2Var) {
/* 1 */             we2Var.getClass();
/* 8 */             setLinkText((String) we2Var.f18596c);
/* 17 */            setOnClickListener(new h51(we2Var, 3));
                }

                /* JADX INFO: renamed from: k */
                public final void m2809k(ew2 ew2Var) {
/* 1 */             ew2Var.getClass();
/* 10 */            UCTextView.m2794h(getUcLinkText(), ew2Var, 10);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 60 */        public UCLink(Context context, AttributeSet attributeSet) {
/* 61 */            this(context, attributeSet, 0);
                    context.getClass();
                }
            }
