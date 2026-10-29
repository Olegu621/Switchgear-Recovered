            package p000;

            import android.view.VelocityTracker;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class y13 {
                /* JADX INFO: renamed from: a */
                public static float m10083a(VelocityTracker velocityTracker, int i) {
/* 1 */             return velocityTracker.getAxisVelocity(i);
                }

                /* JADX INFO: renamed from: b */
                public static float m10084b(VelocityTracker velocityTracker, int i, int i2) {
/* 1 */             return velocityTracker.getAxisVelocity(i, i2);
                }

                /* JADX INFO: renamed from: c */
                public static boolean m10085c(VelocityTracker velocityTracker, int i) {
/* 1 */             return velocityTracker.isAxisSupported(i);
                }
            }
