            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureRequest;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: bp */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0188bp extends C0210cb {
                @Override // p000.C0210cb
                /* JADX INFO: renamed from: J */
                public final int mo1403J(CaptureRequest captureRequest, y92 y92Var, CameraCaptureSession.CaptureCallback captureCallback) {
/* 5 */             return ((CameraCaptureSession) this.f2804b).setSingleRepeatingRequest(captureRequest, y92Var, captureCallback);
                }

                @Override // p000.C0210cb
                /* JADX INFO: renamed from: m */
                public final int mo1404m(ArrayList arrayList, y92 y92Var, CameraCaptureSession.CaptureCallback captureCallback) {
/* 5 */             return ((CameraCaptureSession) this.f2804b).captureBurstRequests(arrayList, y92Var, captureCallback);
                }
            }
