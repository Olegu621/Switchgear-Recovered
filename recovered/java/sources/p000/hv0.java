            package p000;

            import android.graphics.Bitmap;
            import android.graphics.drawable.AdaptiveIconDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.Icon;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class hv0 {
                /* JADX INFO: renamed from: a */
                public static Drawable m4382a(Drawable drawable, Drawable drawable2) {
/* 3 */             return new AdaptiveIconDrawable(drawable, drawable2);
                }

                /* JADX INFO: renamed from: b */
                public static Icon m4383b(Bitmap bitmap) {
/* 1 */             return Icon.createWithAdaptiveBitmap(bitmap);
                }
            }
