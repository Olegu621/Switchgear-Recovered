            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureFailure;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.TotalCaptureResult;
            import android.view.Surface;
            
            /* JADX INFO: renamed from: bo */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0187bo extends CameraCaptureSession.CaptureCallback {
                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                }
            }
