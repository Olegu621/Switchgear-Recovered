            package p000;

            import android.graphics.Rect;
            import android.view.DisplayCutout;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class a90 {
                /* JADX INFO: renamed from: a */
                public static DisplayCutout m109a(Rect rect, List<Rect> list) {
/* 3 */             return new DisplayCutout(rect, list);
                }

                /* JADX INFO: renamed from: b */
                public static List<Rect> m110b(DisplayCutout displayCutout) {
/* 1 */             return displayCutout.getBoundingRects();
                }

                /* JADX INFO: renamed from: c */
                public static int m111c(DisplayCutout displayCutout) {
/* 1 */             return displayCutout.getSafeInsetBottom();
                }

                /* JADX INFO: renamed from: d */
                public static int m112d(DisplayCutout displayCutout) {
/* 1 */             return displayCutout.getSafeInsetLeft();
                }

                /* JADX INFO: renamed from: e */
                public static int m113e(DisplayCutout displayCutout) {
/* 1 */             return displayCutout.getSafeInsetRight();
                }

                /* JADX INFO: renamed from: f */
                public static int m114f(DisplayCutout displayCutout) {
/* 1 */             return displayCutout.getSafeInsetTop();
                }
            }
