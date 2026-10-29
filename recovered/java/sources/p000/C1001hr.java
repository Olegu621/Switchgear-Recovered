            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            
            /* JADX INFO: renamed from: hr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1001hr extends AbstractC1934mo {

                /* JADX INFO: renamed from: a */
                public final CameraCaptureSession.CaptureCallback f9208a;

                public C1001hr(CameraCaptureSession.CaptureCallback captureCallback) {
/* 4 */             if (captureCallback != null) {
/* 6 */                 this.f9208a = captureCallback;
                    } else {
/* 11 */                C1951n4.m6868s("captureCallback is null");
/* 15 */                throw null;
                    }
                }
            }
