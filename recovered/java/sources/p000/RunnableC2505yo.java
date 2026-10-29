            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            
            /* JADX INFO: renamed from: yo */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC2505yo implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19727a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0151ap f19728b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ CameraCaptureSession f19729c;

                public /* synthetic */ RunnableC2505yo(C0151ap c0151ap, CameraCaptureSession cameraCaptureSession, int i) {
/* 1 */             this.f19727a = i;
/* 3 */             this.f19728b = c0151ap;
/* 5 */             this.f19729c = cameraCaptureSession;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f19727a;
/* 3 */             CameraCaptureSession cameraCaptureSession = this.f19729c;
/* 5 */             C0151ap c0151ap = this.f19728b;
                    switch (i) {
                        case 0:
/* 42 */                    c0151ap.f2048a.onActive(cameraCaptureSession);
                            break;
                        case 1:
/* 36 */                    c0151ap.f2048a.onClosed(cameraCaptureSession);
                            break;
                        case 2:
/* 1 */                     c0151ap.f2048a.onCaptureQueueEmpty(cameraCaptureSession);
                            break;
                        case 3:
/* 24 */                    c0151ap.f2048a.onConfigured(cameraCaptureSession);
                            break;
                        case 4:
/* 18 */                    c0151ap.f2048a.onReady(cameraCaptureSession);
                            break;
                        default:
/* 12 */                    c0151ap.f2048a.onConfigureFailed(cameraCaptureSession);
                            break;
                    }
                }
            }
