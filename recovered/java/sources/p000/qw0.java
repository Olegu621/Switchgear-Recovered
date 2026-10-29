            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.widget.ImageView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class qw0 {
                /* JADX INFO: renamed from: a */
                public static ColorStateList m8022a(ImageView imageView) {
/* 1 */             return imageView.getImageTintList();
                }

                /* JADX INFO: renamed from: b */
                public static PorterDuff.Mode m8023b(ImageView imageView) {
/* 1 */             return imageView.getImageTintMode();
                }

                /* JADX INFO: renamed from: c */
                public static void m8024c(ImageView imageView, ColorStateList colorStateList) {
/* 1 */             imageView.setImageTintList(colorStateList);
                }

                /* JADX INFO: renamed from: d */
                public static void m8025d(ImageView imageView, PorterDuff.Mode mode) {
/* 1 */             imageView.setImageTintMode(mode);
                }
            }
