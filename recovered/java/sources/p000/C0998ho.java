            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            
            /* JADX INFO: renamed from: ho */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0998ho extends d52 {

                /* JADX INFO: renamed from: i */
                public static final C1888lf f9165i = new C1888lf("camera2.captureRequest.templateType", Integer.TYPE, null);

                /* JADX INFO: renamed from: v */
                public static final C1888lf f9166v = new C1888lf("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

                /* JADX INFO: renamed from: w */
                public static final C1888lf f9167w = new C1888lf("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

                /* JADX INFO: renamed from: U */
                public static final C1888lf f9162U = new C1888lf("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

                /* JADX INFO: renamed from: V */
                public static final C1888lf f9163V = new C1888lf("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

                /* JADX INFO: renamed from: W */
                public static final C1888lf f9164W = new C1888lf("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

                /* JADX INFO: renamed from: L */
                public static C1888lf m4249L(CaptureRequest.Key key) {
/* 23 */            return new C1888lf("camera2.captureRequest.option." + key.getName(), Object.class, key);
                }
            }
