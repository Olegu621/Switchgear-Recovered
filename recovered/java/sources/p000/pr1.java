            package p000;

            import android.graphics.Path;
            import android.view.animation.Interpolator;
            import android.view.animation.PathInterpolator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class pr1 {
                /* JADX INFO: renamed from: a */
                public static Interpolator m7545a(float f, float f2) {
/* 3 */             return new PathInterpolator(f, f2);
                }

                /* JADX INFO: renamed from: b */
                public static Interpolator m7546b(float f, float f2, float f3, float f4) {
/* 3 */             return new PathInterpolator(f, f2, f3, f4);
                }

                /* JADX INFO: renamed from: c */
                public static Interpolator m7547c(Path path) {
/* 3 */             return new PathInterpolator(path);
                }
            }
