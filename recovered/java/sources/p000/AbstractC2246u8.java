            package p000;

            import android.view.animation.DecelerateInterpolator;
            import android.view.animation.LinearInterpolator;
            
            /* JADX INFO: renamed from: u8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2246u8 {

                /* JADX INFO: renamed from: a */
                public static final LinearInterpolator f17410a = new LinearInterpolator();

                /* JADX INFO: renamed from: b */
                public static final xg0 f17411b = new xg0();

                /* JADX INFO: renamed from: c */
                public static final xg0 f17412c = new xg0(xg0.f19077c);

                /* JADX INFO: renamed from: d */
                public static final xg0 f17413d = new xg0(xg0.f19079e);

                /* JADX INFO: renamed from: e */
                public static final DecelerateInterpolator f17414e = new DecelerateInterpolator();

                /* JADX INFO: renamed from: a */
                public static float m8970a(float f, float f2, float f3) {
/* 1 */             return AbstractC0886en.m3503g(f2, f, f3, f);
                }

                /* JADX INFO: renamed from: b */
                public static float m8971b(float f, float f2, float f3, float f4, float f5) {
/* 3 */             if (f5 < f3) {
/* 5 */                 return f;
                    }
                    return f5 > f4 ? f2 : m8970a(f, f2, (f5 - f3) / (f4 - f3));
                }

                /* JADX INFO: renamed from: c */
                public static int m8972c(int i, float f, int i2) {
/* 8 */             return Math.round(f * (i2 - i)) + i;
                }
            }
