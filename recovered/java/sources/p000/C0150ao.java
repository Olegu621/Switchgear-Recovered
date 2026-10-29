            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureFailure;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.TotalCaptureResult;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: renamed from: ao */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 41 */    public final class C0150ao extends CameraCaptureSession.CaptureCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2042a;

                /* JADX INFO: renamed from: b */
                public final Object f2043b;

                public C0150ao(List list) {
/* 2 */             this.f2042a = 0;
/* 12 */            this.f2043b = new ArrayList();
/* 14 */            Iterator it = list.iterator();
/* 22 */            while (it.hasNext()) {
/* 28 */                CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
/* 32 */                if (!(captureCallback instanceof C0187bo)) {
/* 38 */                    ((ArrayList) this.f2043b).add(captureCallback);
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public static int m1146a(CaptureRequest captureRequest) {
                    Integer num;
/* 7 */             if ((captureRequest.getTag() instanceof nm2) && (num = (Integer) ((nm2) captureRequest.getTag()).f14383a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
/* 30 */                return num.intValue();
                    }
/* 28 */            return -1;
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                    switch (this.f2042a) {
                        case 0:
/* 14 */                    Iterator it = ((ArrayList) this.f2043b).iterator();
/* 22 */                    while (it.hasNext()) {
/* 30 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                            }
                            break;
                        default:
/* 6 */                     super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    nm2 nm2Var;
                    switch (this.f2042a) {
                        case 0:
/* 100 */                   Iterator it = ((ArrayList) this.f2043b).iterator();
/* 108 */                   while (it.hasNext()) {
/* 116 */                       ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                            }
/* 120 */                   return;
                        case 1:
/* 56 */                    super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
/* 59 */                    Object tag = captureRequest.getTag();
/* 63 */                    if (tag != null) {
/* 69 */                        de3.m3023e("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof nm2);
/* 72 */                        nm2Var = (nm2) tag;
                            } else {
/* 75 */                        nm2Var = nm2.f14382b;
                            }
/* 92 */                    ((AbstractC1934mo) this.f2043b).mo3975b(m1146a(captureRequest), new C0210cb(13, nm2Var, totalCaptureResult));
/* 95 */                    return;
                        default:
                            synchronized (((C2154rr) this.f2043b).f16232a) {
                                try {
/* 17 */                            fb2 fb2Var = ((C2154rr) this.f2043b).f16237f;
/* 19 */                            if (fb2Var == null) {
/* 53 */                                return;
                                    }
/* 25 */                            C1803jr c1803jr = fb2Var.f8120g;
/* 29 */                            hu0.m4312F0("CaptureSession");
/* 34 */                            C2154rr c2154rr = (C2154rr) this.f2043b;
/* 38 */                            c2154rr.f16245n.getClass();
/* 49 */                            c2154rr.m8234g(Collections.singletonList(nb2.m6959a(c1803jr)));
/* 53 */                            return;
                                } catch (Throwable th) {
/* 55 */                            throw th;
                                }
                            }
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
/* 1 */             int i = this.f2042a;
/* 3 */             Object obj = this.f2043b;
                    switch (i) {
                        case 0:
/* 34 */                    Iterator it = ((ArrayList) obj).iterator();
/* 42 */                    while (it.hasNext()) {
/* 50 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                            }
                            break;
                        case 1:
/* 12 */                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
/* 28 */                    ((AbstractC1934mo) obj).mo3976c(m1146a(captureRequest), new xt0(24));
                            break;
                        default:
/* 8 */                     super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    switch (this.f2042a) {
                        case 0:
/* 14 */                    Iterator it = ((ArrayList) this.f2043b).iterator();
/* 22 */                    while (it.hasNext()) {
/* 30 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                            }
                            break;
                        default:
/* 6 */                     super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                    switch (this.f2042a) {
                        case 0:
/* 14 */                    Iterator it = ((ArrayList) this.f2043b).iterator();
/* 22 */                    while (it.hasNext()) {
/* 30 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                            }
                            break;
                        default:
/* 6 */                     super.onCaptureSequenceAborted(cameraCaptureSession, i);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    switch (this.f2042a) {
                        case 0:
/* 14 */                    Iterator it = ((ArrayList) this.f2043b).iterator();
/* 22 */                    while (it.hasNext()) {
/* 30 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                            }
                            break;
                        default:
/* 6 */                     super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
/* 1 */             int i = this.f2042a;
/* 3 */             Object obj = this.f2043b;
                    switch (i) {
                        case 0:
/* 27 */                    Iterator it = ((ArrayList) obj).iterator();
/* 35 */                    while (it.hasNext()) {
/* 43 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                            }
                            break;
                        case 1:
/* 12 */                    super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
/* 21 */                    ((AbstractC1934mo) obj).mo6715d(m1146a(captureRequest));
                            break;
                        default:
/* 8 */                     super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                            break;
                    }
                }

/* 42 */        public C0150ao(AbstractC1934mo abstractC1934mo) {
                    this.f2042a = 1;
                    if (abstractC1934mo != null) {
/* 44 */                this.f2043b = abstractC1934mo;
                    } else {
/* 45 */                C1951n4.m6868s("cameraCaptureCallback is null");
                        throw null;
                    }
                }

/* 45 */        public C0150ao(C2154rr c2154rr) {
                    this.f2042a = 2;
/* 46 */            this.f2043b = c2154rr;
                }
            }
