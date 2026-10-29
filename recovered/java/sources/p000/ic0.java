            package p000;

            import android.content.Context;
            import android.graphics.Color;
            import android.util.TypedValue;
            import com.google.android.material.R$attr;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ic0 {

                /* JADX INFO: renamed from: f */
                public static final int f9538f = (int) Math.round(5.1000000000000005d);

                /* JADX INFO: renamed from: a */
                public final boolean f9539a;

                /* JADX INFO: renamed from: b */
                public final int f9540b;

                /* JADX INFO: renamed from: c */
                public final int f9541c;

                /* JADX INFO: renamed from: d */
                public final int f9542d;

                /* JADX INFO: renamed from: e */
                public final float f9543e;

                public ic0(Context context) {
/* 3 */             TypedValue typedValueM10197C = yy1.m10197C(context, R$attr.elevationOverlayEnabled);
/* 22 */            boolean z = (typedValueM10197C == null || typedValueM10197C.type != 18 || typedValueM10197C.data == 0) ? false : true;
/* 25 */            int iM9780r = xe2.m9780r(context, R$attr.elevationOverlayColor, 0);
/* 31 */            int iM9780r2 = xe2.m9780r(context, R$attr.elevationOverlayAccentColor, 0);
/* 37 */            int iM9780r3 = xe2.m9780r(context, R$attr.colorSurface, 0);
/* 49 */            float f = context.getResources().getDisplayMetrics().density;
/* 54 */            this.f9539a = z;
/* 56 */            this.f9540b = iM9780r;
/* 58 */            this.f9541c = iM9780r2;
/* 60 */            this.f9542d = iM9780r3;
/* 62 */            this.f9543e = f;
                }

                /* JADX INFO: renamed from: a */
                public final int m4516a(float f, int i) {
                    int i2;
/* 3 */             if (!this.f9539a || AbstractC0196bx.m1454f(i, 255) != this.f9542d) {
/* 88 */                return i;
                    }
/* 15 */            float f2 = this.f9543e;
/* 50 */            float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
/* 51 */            int iAlpha = Color.alpha(i);
/* 61 */            int iM9757A = xe2.m9757A(AbstractC0196bx.m1454f(i, 255), fMin, this.f9540b);
/* 67 */            if (fMin > 0.0f && (i2 = this.f9541c) != 0) {
/* 79 */                iM9757A = AbstractC0196bx.m1452d(AbstractC0196bx.m1454f(i2, f9538f), iM9757A);
                    }
/* 83 */            return AbstractC0196bx.m1454f(iM9757A, iAlpha);
                }
            }
