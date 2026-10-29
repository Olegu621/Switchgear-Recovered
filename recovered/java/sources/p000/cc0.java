            package p000;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.widget.EdgeEffect;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class cc0 {
                /* JADX INFO: renamed from: a */
                public static EdgeEffect m1628a(Context context, AttributeSet attributeSet) {
                    try {
/* 3 */                 return new EdgeEffect(context, attributeSet);
                    } catch (Throwable unused) {
/* 9 */                 return new EdgeEffect(context);
                    }
                }

                /* JADX INFO: renamed from: b */
                public static float m1629b(EdgeEffect edgeEffect) {
                    try {
/* 1 */                 return edgeEffect.getDistance();
                    } catch (Throwable unused) {
/* 6 */                 return 0.0f;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static float m1630c(EdgeEffect edgeEffect, float f, float f2) {
                    try {
/* 1 */                 return edgeEffect.onPullDistance(f, f2);
                    } catch (Throwable unused) {
/* 6 */                 edgeEffect.onPull(f, f2);
/* 9 */                 return 0.0f;
                    }
                }
            }
