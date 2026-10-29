            package com.google.android.material.progressindicator;

            import android.content.Context;
            import android.util.AttributeSet;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import p000.AbstractC2002oi;
            import p000.C2046ou;
            import p000.C2120qu;
            import p000.lx0;
            import p000.z70;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 48 */    public final class CircularProgressIndicator extends AbstractC0370a {

                /* JADX INFO: renamed from: a0 */
                public static final int f4843a0 = R$style.Widget_MaterialComponents_CircularProgressIndicator;

                public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
/* 3 */             super(context, attributeSet, i, f4843a0);
/* 6 */             Context context2 = getContext();
/* 12 */            CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f4854a;
/* 29 */            setIndeterminateDrawable(new lx0(context2, circularProgressIndicatorSpec, new C2046ou(circularProgressIndicatorSpec), new C2120qu(circularProgressIndicatorSpec)));
/* 46 */            setProgressDrawable(new z70(getContext(), circularProgressIndicatorSpec, new C2046ou(circularProgressIndicatorSpec)));
                }

                @Override // com.google.android.material.progressindicator.AbstractC0370a
                /* JADX INFO: renamed from: a */
                public final AbstractC2002oi mo2347a(Context context, AttributeSet attributeSet) {
/* 3 */             return new CircularProgressIndicatorSpec(context, attributeSet);
                }

                public int getIndicatorDirection() {
/* 5 */             return ((CircularProgressIndicatorSpec) this.f4854a).f4846i;
                }

                public int getIndicatorInset() {
/* 5 */             return ((CircularProgressIndicatorSpec) this.f4854a).f4845h;
                }

                public int getIndicatorSize() {
/* 5 */             return ((CircularProgressIndicatorSpec) this.f4854a).f4844g;
                }

                public void setIndicatorDirection(int i) {
/* 5 */             ((CircularProgressIndicatorSpec) this.f4854a).f4846i = i;
/* 7 */             invalidate();
                }

                public void setIndicatorInset(int i) {
/* 1 */             AbstractC2002oi abstractC2002oi = this.f4854a;
/* 8 */             if (((CircularProgressIndicatorSpec) abstractC2002oi).f4845h != i) {
/* 12 */                ((CircularProgressIndicatorSpec) abstractC2002oi).f4845h = i;
/* 14 */                invalidate();
                    }
                }

                public void setIndicatorSize(int i) {
/* 7 */             int iMax = Math.max(i, getTrackThickness() * 2);
/* 11 */            AbstractC2002oi abstractC2002oi = this.f4854a;
/* 18 */            if (((CircularProgressIndicatorSpec) abstractC2002oi).f4844g != iMax) {
/* 23 */                ((CircularProgressIndicatorSpec) abstractC2002oi).f4844g = iMax;
/* 27 */                ((CircularProgressIndicatorSpec) abstractC2002oi).getClass();
/* 30 */                invalidate();
                    }
                }

                @Override // com.google.android.material.progressindicator.AbstractC0370a
                public void setTrackThickness(int i) {
/* 1 */             super.setTrackThickness(i);
/* 8 */             ((CircularProgressIndicatorSpec) this.f4854a).getClass();
                }

/* 49 */        public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
/* 50 */            this(context, attributeSet, R$attr.circularProgressIndicatorStyle);
                }
            }
