            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Bitmap;
            import android.view.PointerIcon;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class it1 {
                /* JADX INFO: renamed from: a */
                public static PointerIcon m5551a(Bitmap bitmap, float f, float f2) {
/* 1 */             return PointerIcon.create(bitmap, f, f2);
                }

                /* JADX INFO: renamed from: b */
                public static PointerIcon m5552b(Context context, int i) {
/* 1 */             return PointerIcon.getSystemIcon(context, i);
                }

                /* JADX INFO: renamed from: c */
                public static PointerIcon m5553c(Resources resources, int i) {
/* 1 */             return PointerIcon.load(resources, i);
                }
            }
