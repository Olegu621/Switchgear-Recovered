            package p000;

            import android.hardware.camera2.CameraDevice;
            
            /* JADX INFO: renamed from: op */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC2041op implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14854a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2113qn f14855b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ CameraDevice f14856c;

                public /* synthetic */ RunnableC2041op(C2113qn c2113qn, CameraDevice cameraDevice, int i) {
/* 1 */             this.f14854a = i;
/* 3 */             this.f14855b = c2113qn;
/* 5 */             this.f14856c = cameraDevice;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f14854a;
/* 3 */             CameraDevice cameraDevice = this.f14856c;
/* 5 */             C2113qn c2113qn = this.f14855b;
                    switch (i) {
                        case 0:
/* 30 */                    ((CameraDevice.StateCallback) c2113qn.f15665b).onClosed(cameraDevice);
                            break;
                        case 1:
/* 22 */                    ((CameraDevice.StateCallback) c2113qn.f15665b).onDisconnected(cameraDevice);
                            break;
                        default:
/* 14 */                    ((CameraDevice.StateCallback) c2113qn.f15665b).onOpened(cameraDevice);
                            break;
                    }
                }
            }
