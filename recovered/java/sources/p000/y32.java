            package p000;

            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class y32 {
                /* JADX INFO: renamed from: a */
                public static Drawable m10100a(Resources resources, int i, Resources.Theme theme) {
/* 1 */             return resources.getDrawable(i, theme);
                }

                /* JADX INFO: renamed from: b */
                public static Drawable m10101b(Resources resources, int i, int i2, Resources.Theme theme) {
/* 1 */             return resources.getDrawableForDensity(i, i2, theme);
                }
            }
