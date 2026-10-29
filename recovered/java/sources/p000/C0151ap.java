            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.view.Surface;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: ap */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0151ap extends CameraCaptureSession.StateCallback {

                /* JADX INFO: renamed from: a */
                public final CameraCaptureSession.StateCallback f2048a;

                /* JADX INFO: renamed from: b */
                public final Executor f2049b;

                public C0151ap(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
/* 4 */             this.f2049b = executor;
/* 6 */             this.f2048a = stateCallback;
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onActive(CameraCaptureSession cameraCaptureSession) {
/* 9 */             this.f2049b.execute(new RunnableC2505yo(this, cameraCaptureSession, 0));
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
/* 9 */             this.f2049b.execute(new RunnableC2505yo(this, cameraCaptureSession, 2));
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onClosed(CameraCaptureSession cameraCaptureSession) {
/* 9 */             this.f2049b.execute(new RunnableC2505yo(this, cameraCaptureSession, 1));
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
/* 9 */             this.f2049b.execute(new RunnableC2505yo(this, cameraCaptureSession, 5));
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
/* 9 */             this.f2049b.execute(new RunnableC2505yo(this, cameraCaptureSession, 3));
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onReady(CameraCaptureSession cameraCaptureSession) {
/* 9 */             this.f2049b.execute(new RunnableC2505yo(this, cameraCaptureSession, 4));
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
/* 9 */             this.f2049b.execute(new RunnableC2558zo(0, this, cameraCaptureSession, surface));
                }
            }
