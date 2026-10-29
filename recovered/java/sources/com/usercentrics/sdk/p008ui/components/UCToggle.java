            package com.usercentrics.sdk.p008ui.components;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.util.AttributeSet;
            import android.widget.CompoundButton;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.widget.SwitchCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.ew2;
            import p000.fw2;
            import p000.gw2;
            import p000.hw2;
            import p000.nk2;
            import p000.ut1;
            import p000.yv1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ%\u0010\u0011\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/UCToggle;", "Landroidx/appcompat/widget/SwitchCompat;", "Lut1;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "listener", "setListener", "(Lkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.VALUE, "getCurrentState", "()Z", "setCurrentState", "(Z)V", "currentState", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 13 */    public final class UCToggle extends SwitchCompat implements ut1, CompoundButton.OnCheckedChangeListener {

                /* JADX INFO: renamed from: H0 */
                public Function1 f6252H0;

                /* JADX INFO: renamed from: I0 */
                public yv1 f6253I0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCToggle(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 9 */             this.f6252H0 = nk2.f14345v;
/* 11 */            setOnCheckedChangeListener(this);
                }

                @Override // p000.ut1
                public final void dispose() {
/* 2 */             this.f6253I0 = null;
/* 6 */             this.f6252H0 = nk2.f14344i;
/* 8 */             setOnCheckedChangeListener(null);
                }

                /* JADX INFO: renamed from: e */
                public final void m2799e(fw2 fw2Var) {
/* 1 */             fw2Var.getClass();
/* 4 */             yv1 yv1Var = this.f6253I0;
/* 6 */             yv1 yv1Var2 = null;
/* 7 */             if (yv1Var != null) {
/* 9 */                 setListener(null);
/* 14 */                yv1Var.f19820b.remove(this);
                    }
/* 19 */            setChecked(fw2Var.f8385a);
/* 24 */            setEnabled(fw2Var.f8386b);
/* 27 */            yv1 yv1Var3 = fw2Var.f8387c;
/* 29 */            if (yv1Var3 != null) {
/* 31 */                yv1Var3.m10183a(this);
/* 34 */                yv1Var2 = yv1Var3;
                    }
/* 35 */            this.f6253I0 = yv1Var2;
                }

                /* JADX INFO: renamed from: f */
                public final void m2800f(ew2 ew2Var) {
/* 1 */             ew2Var.getClass();
/* 4 */             hw2 hw2Var = ew2Var.f7909c;
/* 6 */             if (hw2Var == null) {
/* 8 */                 return;
                    }
/* 9 */             gw2 gw2Var = hw2.Companion;
/* 11 */            gw2Var.getClass();
/* 14 */            gw2Var.getClass();
/* 17 */            gw2Var.getClass();
/* 20 */            gw2Var.getClass();
/* 31 */            int[][] iArr = {hw2.f9344g, hw2.f9345h, hw2.f9346i, hw2.f9347j};
/* 35 */            int i = hw2Var.f9350c;
/* 41 */            int[] iArr2 = {i, i, hw2Var.f9348a, hw2Var.f9349b};
/* 45 */            int i2 = hw2Var.f9353f;
/* 51 */            int[] iArr3 = {i2, i2, hw2Var.f9351d, hw2Var.f9352e};
/* 60 */            setTrackTintList(new ColorStateList(iArr, iArr2));
/* 68 */            setThumbTintList(new ColorStateList(iArr, iArr3));
/* 72 */            setBackground(null);
                }

                @Override // p000.ut1
                public boolean getCurrentState() {
/* 1 */             return isChecked();
                }

                @Override // android.widget.TextView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             yv1 yv1Var = this.f6253I0;
/* 6 */             if (yv1Var != null) {
/* 8 */                 yv1Var.m10183a(this);
                    }
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
/* 7 */             this.f6252H0.invoke(Boolean.valueOf(z));
                }

                @Override // android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             yv1 yv1Var = this.f6253I0;
/* 3 */             if (yv1Var != null) {
/* 6 */                 setListener(null);
/* 11 */                yv1Var.f19820b.remove(this);
                    }
/* 14 */            super.onDetachedFromWindow();
                }

                @Override // p000.ut1
                public void setCurrentState(boolean z) {
/* 2 */             setOnCheckedChangeListener(null);
/* 5 */             setChecked(z);
/* 8 */             setOnCheckedChangeListener(this);
/* 21 */            setMinimumHeight(getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLegalLinksOrButtonsMinimumHeight));
                }

                @Override // p000.ut1
                public void setListener(Function1<? super Boolean, Unit> listener) {
/* 1 */             if (listener == null) {
/* 3 */                 listener = nk2.f14346w;
                    }
/* 5 */             this.f6252H0 = listener;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 14 */        public UCToggle(Context context, AttributeSet attributeSet) {
/* 15 */            this(context, attributeSet, R$attr.switchStyle);
                    context.getClass();
                }
            }
