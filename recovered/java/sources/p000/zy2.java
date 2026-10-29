            package p000;

            import android.util.Range;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface zy2 extends rm2, hw0 {

                /* JADX INFO: renamed from: G */
                public static final C1888lf f20384G = new C1888lf("camerax.core.useCase.defaultSessionConfig", fb2.class, null);

                /* JADX INFO: renamed from: H */
                public static final C1888lf f20385H = new C1888lf("camerax.core.useCase.defaultCaptureConfig", C1803jr.class, null);

                /* JADX INFO: renamed from: I */
                public static final C1888lf f20386I = new C1888lf("camerax.core.useCase.sessionConfigUnpacker", C1034io.class, null);

                /* JADX INFO: renamed from: J */
                public static final C1888lf f20387J = new C1888lf("camerax.core.useCase.captureConfigUnpacker", C0223co.class, null);

                /* JADX INFO: renamed from: K */
                public static final C1888lf f20388K;

                /* JADX INFO: renamed from: L */
                public static final C1888lf f20389L;

                /* JADX INFO: renamed from: M */
                public static final C1888lf f20390M;

                /* JADX INFO: renamed from: N */
                public static final C1888lf f20391N;

                /* JADX INFO: renamed from: O */
                public static final C1888lf f20392O;

                /* JADX INFO: renamed from: P */
                public static final C1888lf f20393P;

                /* JADX INFO: renamed from: Q */
                public static final C1888lf f20394Q;

                static {
/* 50 */            Class cls = Integer.TYPE;
/* 55 */            f20388K = new C1888lf("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
/* 66 */            f20389L = new C1888lf("camerax.core.useCase.targetFrameRate", Range.class, null);
/* 72 */            Class cls2 = Boolean.TYPE;
/* 77 */            f20390M = new C1888lf("camerax.core.useCase.zslDisabled", cls2, null);
/* 86 */            f20391N = new C1888lf("camerax.core.useCase.highResolutionDisabled", cls2, null);
/* 97 */            f20392O = new C1888lf("camerax.core.useCase.captureType", bz2.class, null);
/* 106 */           f20393P = new C1888lf("camerax.core.useCase.previewStabilizationMode", cls, null);
/* 115 */           f20394Q = new C1888lf("camerax.core.useCase.videoStabilizationMode", cls, null);
                }

                /* JADX INFO: renamed from: t */
                default bz2 mo7453t() {
/* 7 */             return (bz2) mo7025e(f20392O);
                }

                /* JADX INFO: renamed from: v */
                default int m10450v() {
/* 14 */            return ((Integer) mo7023b(f20393P, 0)).intValue();
                }
            }
