            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.media.ImageWriter;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: renamed from: dp */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 41 */    public final class C0851dp extends CameraCaptureSession.StateCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7355a;

                /* JADX INFO: renamed from: b */
                public final Object f7356b;

                public C0851dp(List list) {
/* 2 */             this.f7355a = 0;
/* 12 */            this.f7356b = new ArrayList();
/* 14 */            Iterator it = list.iterator();
/* 22 */            while (it.hasNext()) {
/* 28 */                CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
/* 32 */                if (!(stateCallback instanceof C0888ep)) {
/* 38 */                    ((ArrayList) this.f7356b).add(stateCallback);
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                private final void m3168a(CameraCaptureSession cameraCaptureSession) {
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onActive(CameraCaptureSession cameraCaptureSession) {
/* 1 */             int i = this.f7355a;
/* 3 */             Object obj = this.f7356b;
                    switch (i) {
                        case 0:
/* 23 */                    Iterator it = ((ArrayList) obj).iterator();
/* 31 */                    while (it.hasNext()) {
/* 39 */                        ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                            }
                            break;
                        case 1:
/* 12 */                    gk2 gk2Var = (gk2) obj;
/* 14 */                    gk2Var.m3958k(cameraCaptureSession);
/* 17 */                    gk2Var.mo1713a(gk2Var);
                            break;
                        default:
/* 8 */                     super.onActive(cameraCaptureSession);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
/* 1 */             int i = this.f7355a;
/* 3 */             Object obj = this.f7356b;
                    switch (i) {
                        case 0:
/* 23 */                    Iterator it = ((ArrayList) obj).iterator();
/* 31 */                    while (it.hasNext()) {
/* 1 */                         ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                            }
                            break;
                        case 1:
/* 12 */                    gk2 gk2Var = (gk2) obj;
/* 14 */                    gk2Var.m3958k(cameraCaptureSession);
/* 17 */                    gk2Var.mo1714b(gk2Var);
                            break;
                        default:
/* 8 */                     super.onCaptureQueueEmpty(cameraCaptureSession);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onClosed(CameraCaptureSession cameraCaptureSession) {
/* 1 */             int i = this.f7355a;
/* 3 */             Object obj = this.f7356b;
                    switch (i) {
                        case 0:
/* 23 */                    Iterator it = ((ArrayList) obj).iterator();
/* 31 */                    while (it.hasNext()) {
/* 39 */                        ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                            }
                            break;
                        case 1:
/* 12 */                    gk2 gk2Var = (gk2) obj;
/* 14 */                    gk2Var.m3958k(cameraCaptureSession);
/* 17 */                    gk2Var.mo1715c(gk2Var);
                            break;
                        default:
/* 8 */                     super.onClosed(cameraCaptureSession);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    C2260um c2260um;
                    switch (this.f7355a) {
                        case 0:
/* 109 */                   Iterator it = ((ArrayList) this.f7356b).iterator();
/* 117 */                   while (it.hasNext()) {
/* 125 */                       ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                            }
/* 129 */                   return;
                        case 1:
                            try {
/* 12 */                        ((gk2) this.f7356b).m3958k(cameraCaptureSession);
/* 17 */                        gk2 gk2Var = (gk2) this.f7356b;
/* 19 */                        gk2Var.mo1716d(gk2Var);
                                synchronized (((gk2) this.f7356b).f8664a) {
/* 37 */                            de3.m3027i(((gk2) this.f7356b).f8672i, "OpenCaptureSession completer should not null");
/* 42 */                            gk2 gk2Var2 = (gk2) this.f7356b;
/* 44 */                            c2260um = gk2Var2.f8672i;
/* 46 */                            gk2Var2.f8672i = null;
                                    break;
                                }
/* 59 */                        return;
                            } finally {
                                synchronized (((gk2) this.f7356b).f8664a) {
/* 79 */                            de3.m3027i(((gk2) this.f7356b).f8672i, "OpenCaptureSession completer should not null");
/* 84 */                            gk2 gk2Var3 = (gk2) this.f7356b;
/* 86 */                            c2260um = gk2Var3.f8672i;
/* 88 */                            gk2Var3.f8672i = null;
/* 98 */                            c2260um.m9041b(new IllegalStateException("onConfigureFailed"));
                                }
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C2260um c2260um;
                    switch (this.f7355a) {
                        case 0:
/* 112 */                   Iterator it = ((ArrayList) this.f7356b).iterator();
/* 120 */                   while (it.hasNext()) {
/* 128 */                       ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                            }
/* 132 */                   return;
                        case 1:
                            try {
/* 29 */                        ((gk2) this.f7356b).m3958k(cameraCaptureSession);
/* 34 */                        gk2 gk2Var = (gk2) this.f7356b;
/* 36 */                        gk2Var.mo1717e(gk2Var);
                                synchronized (((gk2) this.f7356b).f8664a) {
/* 54 */                            de3.m3027i(((gk2) this.f7356b).f8672i, "OpenCaptureSession completer should not null");
/* 59 */                            gk2 gk2Var2 = (gk2) this.f7356b;
/* 61 */                            c2260um = gk2Var2.f8672i;
/* 63 */                            gk2Var2.f8672i = null;
                                    break;
                                }
/* 69 */                        return;
                            } finally {
                                synchronized (((gk2) this.f7356b).f8664a) {
/* 89 */                            de3.m3027i(((gk2) this.f7356b).f8672i, "OpenCaptureSession completer should not null");
/* 94 */                            gk2 gk2Var3 = (gk2) this.f7356b;
/* 96 */                            c2260um = gk2Var3.f8672i;
/* 98 */                            gk2Var3.f8672i = null;
/* 101 */                           c2260um.m9040a(null);
                                }
                            }
                        default:
/* 6 */                     Surface inputSurface = cameraCaptureSession.getInputSurface();
/* 10 */                    if (inputSurface != null) {
/* 21 */                        ((zr0) this.f7356b).f20304i = ImageWriter.newInstance(inputSurface, 1);
/* 23 */                        return;
                            }
/* 23 */                    return;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onReady(CameraCaptureSession cameraCaptureSession) {
/* 1 */             int i = this.f7355a;
/* 3 */             Object obj = this.f7356b;
                    switch (i) {
                        case 0:
/* 23 */                    Iterator it = ((ArrayList) obj).iterator();
/* 31 */                    while (it.hasNext()) {
/* 39 */                        ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                            }
                            break;
                        case 1:
/* 12 */                    gk2 gk2Var = (gk2) obj;
/* 14 */                    gk2Var.m3958k(cameraCaptureSession);
/* 17 */                    gk2Var.mo1718f(gk2Var);
                            break;
                        default:
/* 8 */                     super.onReady(cameraCaptureSession);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
/* 1 */             int i = this.f7355a;
/* 3 */             Object obj = this.f7356b;
                    switch (i) {
                        case 0:
/* 23 */                    Iterator it = ((ArrayList) obj).iterator();
/* 31 */                    while (it.hasNext()) {
/* 39 */                        ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                            }
                            break;
                        case 1:
/* 12 */                    gk2 gk2Var = (gk2) obj;
/* 14 */                    gk2Var.m3958k(cameraCaptureSession);
/* 17 */                    gk2Var.mo1720h(gk2Var, surface);
                            break;
                        default:
/* 8 */                     super.onSurfacePrepared(cameraCaptureSession, surface);
                            break;
                    }
                }

/* 42 */        public /* synthetic */ C0851dp(Object obj, int i) {
/* 43 */            this.f7355a = i;
                    this.f7356b = obj;
                }
            }
