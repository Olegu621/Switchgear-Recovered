            package p000;

            import android.util.Size;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface jw0 extends x02 {

                /* JADX INFO: renamed from: A */
                public static final C1888lf f12517A;

                /* JADX INFO: renamed from: B */
                public static final C1888lf f12518B;

                /* JADX INFO: renamed from: q */
                public static final C1888lf f12519q = new C1888lf("camerax.core.imageOutput.targetAspectRatio", i13.class, null);

                /* JADX INFO: renamed from: r */
                public static final C1888lf f12520r;

                /* JADX INFO: renamed from: s */
                public static final C1888lf f12521s;

                /* JADX INFO: renamed from: t */
                public static final C1888lf f12522t;

                /* JADX INFO: renamed from: u */
                public static final C1888lf f12523u;

                /* JADX INFO: renamed from: x */
                public static final C1888lf f12524x;

                /* JADX INFO: renamed from: y */
                public static final C1888lf f12525y;

                /* JADX INFO: renamed from: z */
                public static final C1888lf f12526z;

                static {
/* 17 */            Class cls = Integer.TYPE;
/* 22 */            f12520r = new C1888lf("camerax.core.imageOutput.targetRotation", cls, null);
/* 31 */            f12521s = new C1888lf("camerax.core.imageOutput.appTargetRotation", cls, null);
/* 40 */            f12522t = new C1888lf("camerax.core.imageOutput.mirrorMode", cls, null);
/* 51 */            f12523u = new C1888lf("camerax.core.imageOutput.targetResolution", Size.class, null);
/* 60 */            f12524x = new C1888lf("camerax.core.imageOutput.defaultResolution", Size.class, null);
/* 69 */            f12525y = new C1888lf("camerax.core.imageOutput.maxResolution", Size.class, null);
/* 80 */            f12526z = new C1888lf("camerax.core.imageOutput.supportedResolutions", List.class, null);
/* 91 */            f12517A = new C1888lf("camerax.core.imageOutput.resolutionSelector", q32.class, null);
/* 100 */           f12518B = new C1888lf("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
                }

                /* JADX INFO: renamed from: y */
                static void m5922y(jw0 jw0Var) {
/* 3 */             boolean zMo7028h = jw0Var.mo7028h(f12519q);
/* 20 */            boolean z = ((Size) jw0Var.mo7023b(f12523u, null)) != null;
/* 21 */            if (zMo7028h && z) {
/* 28 */                C1951n4.m6859j("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
                    } else if (((q32) jw0Var.mo7023b(f12517A, null)) != null) {
/* 42 */                if (zMo7028h || z) {
/* 49 */                    C1951n4.m6859j("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                default int m5923s() {
/* 14 */            return ((Integer) mo7023b(f12520r, 0)).intValue();
                }
            }
