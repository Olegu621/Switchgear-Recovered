            package p000;

            import android.hardware.camera2.CameraAccessException;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            
            /* JADX INFO: renamed from: lo */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 36 */    public final class C1897lo extends Exception {

                /* JADX INFO: renamed from: b */
                public static final Set f13432b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

                /* JADX INFO: renamed from: a */
                public final int f13433a;

                static {
/* 70 */            Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
                }

                public C1897lo(String str, AssertionError assertionError) {
/* 19 */            super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
/* 22 */            this.f13433a = 10002;
/* 30 */            if (f13432b.contains(10002)) {
/* 34 */                new CameraAccessException(10002, str, assertionError);
                    }
                }

/* 37 */        public C1897lo(RuntimeException runtimeException) {
/* 39 */            super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
/* 40 */            this.f13433a = 10001;
/* 41 */            if (f13432b.contains(10001)) {
/* 42 */                new CameraAccessException(10001, null, runtimeException);
                    }
                }

/* 42 */        public C1897lo(CameraAccessException cameraAccessException) {
/* 43 */            super(cameraAccessException.getMessage(), cameraAccessException.getCause());
/* 44 */            this.f13433a = cameraAccessException.getReason();
                }
            }
