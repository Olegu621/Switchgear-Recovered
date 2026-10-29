            package p000;

            import android.graphics.drawable.Drawable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class f52 extends Drawable {

                /* JADX INFO: renamed from: a */
                public static final double f8004a = Math.cos(Math.toRadians(45.0d));

                /* JADX INFO: renamed from: a */
                public static float m3670a(float f, float f2, boolean z) {
/* 1 */             if (!z) {
/* 13 */                return f;
                    }
/* 12 */            return (float) (((1.0d - f8004a) * ((double) f2)) + ((double) f));
                }

                /* JADX INFO: renamed from: b */
                public static float m3671b(float f, float f2, boolean z) {
/* 3 */             if (!z) {
/* 17 */                return f * 1.5f;
                    }
/* 15 */            return (float) (((1.0d - f8004a) * ((double) f2)) + ((double) (f * 1.5f)));
                }
            }
