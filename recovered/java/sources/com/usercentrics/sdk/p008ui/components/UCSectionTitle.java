            package com.usercentrics.sdk.p008ui.components;

            import android.content.Context;
            import android.graphics.Typeface;
            import android.util.AttributeSet;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.ew2;
            import p000.wu2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/UCSectionTitle;", "Lcom/usercentrics/sdk/ui/components/UCTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 32 */    public final class UCSectionTitle extends UCTextView {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCSectionTitle(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 30 */            setPaddingRelative((int) context.getResources().getDimension(R$dimen.ucCardHorizontalMargin), (int) context.getResources().getDimension(R$dimen.ucCardVerticalMargin), 0, 0);
                }

                /* JADX INFO: renamed from: l */
                public final void m2793l(ew2 ew2Var) {
/* 1 */             ew2Var.getClass();
/* 4 */             wu2 wu2Var = ew2Var.f7908b;
/* 9 */             setTypeface(Typeface.DEFAULT, 1);
/* 17 */            setTextSize(2, wu2Var.f18822a.f17726b);
/* 22 */            Integer num = ew2Var.f7907a.f18805a;
/* 24 */            if (num != null) {
/* 30 */                setTextColor(num.intValue());
                    }
/* 33 */            setPaintFlags(1);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 33 */        public UCSectionTitle(Context context, AttributeSet attributeSet) {
/* 34 */            this(context, attributeSet, 0);
                    context.getClass();
                }
            }
