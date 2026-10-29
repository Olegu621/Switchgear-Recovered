            package com.google.android.material.progressindicator;

            import android.content.Context;
            import android.util.AttributeSet;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import java.util.WeakHashMap;
            import p000.AbstractC2002oi;
            import p000.e33;
            import p000.f42;
            import p000.lx0;
            import p000.o71;
            import p000.p71;
            import p000.r71;
            import p000.z70;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 58 */    public final class LinearProgressIndicator extends AbstractC0370a {

                /* JADX INFO: renamed from: a0 */
                public static final int f4847a0 = R$style.Widget_MaterialComponents_LinearProgressIndicator;

                public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
/* 3 */             super(context, attributeSet, i, f4847a0);
/* 6 */             Context context2 = getContext();
/* 12 */            LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f4854a;
/* 39 */            setIndeterminateDrawable(new lx0(context2, linearProgressIndicatorSpec, new o71(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f4848g == 0 ? new p71(linearProgressIndicatorSpec) : new r71(context2, linearProgressIndicatorSpec)));
/* 56 */            setProgressDrawable(new z70(getContext(), linearProgressIndicatorSpec, new o71(linearProgressIndicatorSpec)));
                }

                @Override // com.google.android.material.progressindicator.AbstractC0370a
                /* JADX INFO: renamed from: a */
                public final AbstractC2002oi mo2347a(Context context, AttributeSet attributeSet) {
/* 3 */             return new LinearProgressIndicatorSpec(context, attributeSet);
                }

                @Override // com.google.android.material.progressindicator.AbstractC0370a
                /* JADX INFO: renamed from: b */
                public final void mo2349b(int i) {
/* 1 */             AbstractC2002oi abstractC2002oi = this.f4854a;
/* 3 */             if (abstractC2002oi != null && ((LinearProgressIndicatorSpec) abstractC2002oi).f4848g == 0 && isIndeterminate()) {
/* 17 */                return;
                    }
/* 18 */            super.mo2349b(i);
                }

                public int getIndeterminateAnimationType() {
/* 5 */             return ((LinearProgressIndicatorSpec) this.f4854a).f4848g;
                }

                public int getIndicatorDirection() {
/* 5 */             return ((LinearProgressIndicatorSpec) this.f4854a).f4849h;
                }

                @Override // android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             AbstractC2002oi abstractC2002oi = this.f4854a;
/* 7 */             LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) abstractC2002oi;
/* 14 */            boolean z2 = true;
/* 15 */            if (((LinearProgressIndicatorSpec) abstractC2002oi).f4849h != 1) {
/* 17 */                WeakHashMap weakHashMap = e33.f7494a;
/* 23 */                if ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) abstractC2002oi).f4849h != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) abstractC2002oi).f4849h != 3)) {
/* 47 */                    z2 = false;
                        }
                    }
/* 48 */            linearProgressIndicatorSpec.f4850i = z2;
                }

                @Override // android.widget.ProgressBar, android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 10 */            int paddingRight = i - (getPaddingRight() + getPaddingLeft());
/* 20 */            int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
/* 21 */            lx0 indeterminateDrawable = getIndeterminateDrawable();
/* 26 */            if (indeterminateDrawable != null) {
/* 28 */                indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
                    }
/* 31 */            z70 progressDrawable = getProgressDrawable();
/* 35 */            if (progressDrawable != null) {
/* 37 */                progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
                    }
                }

                public void setIndeterminateAnimationType(int i) {
/* 1 */             AbstractC2002oi abstractC2002oi = this.f4854a;
/* 8 */             if (((LinearProgressIndicatorSpec) abstractC2002oi).f4848g == i) {
/* 10 */                return;
                    }
/* 15 */            if (m2350c() && isIndeterminate()) {
/* 26 */                f42.m3656l("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
/* 29 */                return;
                    }
/* 33 */            ((LinearProgressIndicatorSpec) abstractC2002oi).f4848g = i;
/* 38 */            ((LinearProgressIndicatorSpec) abstractC2002oi).mo2348a();
/* 41 */            if (i == 0) {
/* 43 */                lx0 indeterminateDrawable = getIndeterminateDrawable();
/* 51 */                p71 p71Var = new p71((LinearProgressIndicatorSpec) abstractC2002oi);
/* 54 */                indeterminateDrawable.f13517X = p71Var;
/* 56 */                p71Var.f13033a = indeterminateDrawable;
                    } else {
/* 59 */                lx0 indeterminateDrawable2 = getIndeterminateDrawable();
/* 71 */                r71 r71Var = new r71(getContext(), (LinearProgressIndicatorSpec) abstractC2002oi);
/* 74 */                indeterminateDrawable2.f13517X = r71Var;
/* 76 */                r71Var.f13033a = indeterminateDrawable2;
                    }
/* 78 */            invalidate();
                }

                @Override // com.google.android.material.progressindicator.AbstractC0370a
                public void setIndicatorColor(int... iArr) {
/* 1 */             super.setIndicatorColor(iArr);
/* 8 */             ((LinearProgressIndicatorSpec) this.f4854a).mo2348a();
                }

                public void setIndicatorDirection(int i) {
/* 1 */             AbstractC2002oi abstractC2002oi = this.f4854a;
/* 6 */             ((LinearProgressIndicatorSpec) abstractC2002oi).f4849h = i;
/* 9 */             LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) abstractC2002oi;
/* 11 */            boolean z = true;
/* 12 */            if (i != 1) {
/* 14 */                WeakHashMap weakHashMap = e33.f7494a;
/* 20 */                if ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) abstractC2002oi).f4849h != 2) && (getLayoutDirection() != 0 || i != 3)) {
/* 39 */                    z = false;
                        }
                    }
/* 40 */            linearProgressIndicatorSpec.f4850i = z;
/* 42 */            invalidate();
                }

                @Override // com.google.android.material.progressindicator.AbstractC0370a
                public void setTrackCornerRadius(int i) {
/* 1 */             super.setTrackCornerRadius(i);
/* 8 */             ((LinearProgressIndicatorSpec) this.f4854a).mo2348a();
/* 11 */            invalidate();
                }

/* 59 */        public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
/* 60 */            this(context, attributeSet, R$attr.linearProgressIndicatorStyle);
                }
            }
