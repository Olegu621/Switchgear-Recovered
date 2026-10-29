            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureFailure;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.TotalCaptureResult;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: renamed from: hn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 75 */    public final class C0997hn extends CameraCaptureSession.CaptureCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9151a;

                /* JADX INFO: renamed from: b */
                public final Object f9152b;

                /* JADX INFO: renamed from: c */
                public Object f9153c;

                public C0997hn(int i) {
/* 1 */             this.f9151a = i;
                    switch (i) {
                        case 3:
/* 25 */                    C2260um c2260um = new C2260um();
/* 33 */                    c2260um.f17592c = new u32();
/* 37 */                    C2466xm c2466xm = new C2466xm(c2260um);
/* 40 */                    c2260um.f17591b = c2466xm;
/* 44 */                    c2260um.f17590a = AbstractC0886en.class;
                            try {
/* 46 */                        this.f9153c = c2260um;
/* 67 */                        c2260um.f17590a = "RequestCompleteListener[" + this + "]";
                            } catch (Exception e) {
/* 71 */                        c2466xm.m9977b(e);
                            }
/* 74 */                    this.f9152b = c2466xm;
                            break;
                        default:
/* 10 */                    this.f9153c = null;
/* 17 */                    this.f9152b = new HashMap();
                            break;
                    }
                }

                /* JADX INFO: renamed from: a */
                public void m4246a(CaptureRequest captureRequest, List list) {
/* 3 */             HashMap map = (HashMap) this.f9152b;
/* 9 */             List list2 = (List) map.get(captureRequest);
/* 11 */            if (list2 == null) {
/* 37 */                map.put(captureRequest, list);
/* 40 */                return;
                    }
/* 24 */            ArrayList arrayList = new ArrayList(list2.size() + list.size());
/* 27 */            arrayList.addAll(list);
/* 30 */            arrayList.addAll(list2);
/* 33 */            map.put(captureRequest, arrayList);
                }

                /* JADX INFO: renamed from: b */
                public void m4247b() {
/* 3 */             C2260um c2260um = (C2260um) this.f9153c;
/* 5 */             if (c2260um != null) {
/* 8 */                 c2260um.m9040a(null);
/* 11 */                this.f9153c = null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public List m4248c(CaptureRequest captureRequest) {
/* 9 */             List list = (List) ((HashMap) this.f9152b).get(captureRequest);
                    return list != null ? list : Collections.EMPTY_LIST;
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
                    switch (this.f9151a) {
                        case 1:
/* 32 */                    Iterator it = m4248c(captureRequest).iterator();
/* 40 */                    while (it.hasNext()) {
/* 48 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                            }
                            break;
                        case 2:
/* 24 */                    ((y92) this.f9153c).execute(new Runnable() { // from class: xo
                                @Override // java.lang.Runnable
                                public final void run() {
/* 16 */                            ((CameraCaptureSession.CaptureCallback) this.f19292a.f9152b).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                                }
                            });
                            break;
                        default:
/* 6 */                     super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    switch (this.f9151a) {
                        case 0:
/* 69 */                    ((y92) this.f9153c).execute(new RunnableC1784j8(5, this, totalCaptureResult));
                            break;
                        case 1:
/* 36 */                    Iterator it = m4248c(captureRequest).iterator();
/* 44 */                    while (it.hasNext()) {
/* 52 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                            }
                            break;
                        case 2:
/* 24 */                    ((y92) this.f9153c).execute(new RunnableC2301vo(this, cameraCaptureSession, captureRequest, totalCaptureResult, 0));
                            break;
                        default:
/* 6 */                     m4247b();
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    switch (this.f9151a) {
                        case 1:
/* 40 */                    Iterator it = m4248c(captureRequest).iterator();
/* 48 */                    while (it.hasNext()) {
/* 56 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                            }
                            break;
                        case 2:
/* 28 */                    ((y92) this.f9153c).execute(new RunnableC2301vo(this, cameraCaptureSession, captureRequest, captureFailure, 2));
                            break;
                        case 3:
/* 10 */                    m4247b();
                            break;
                        default:
/* 6 */                     super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    switch (this.f9151a) {
                        case 1:
/* 36 */                    Iterator it = m4248c(captureRequest).iterator();
/* 44 */                    while (it.hasNext()) {
/* 52 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                            }
                            break;
                        case 2:
/* 24 */                    ((y92) this.f9153c).execute(new RunnableC2301vo(this, cameraCaptureSession, captureRequest, captureResult, 1));
                            break;
                        default:
/* 6 */                     super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                    switch (this.f9151a) {
                        case 1:
/* 36 */                    Iterator it = ((HashMap) this.f9152b).values().iterator();
/* 44 */                    while (it.hasNext()) {
/* 52 */                        Iterator it2 = ((List) it.next()).iterator();
/* 60 */                        while (it2.hasNext()) {
/* 68 */                            ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                                }
                            }
/* 74 */                    C2043or c2043or = (C2043or) this.f9153c;
/* 76 */                    if (c2043or != null) {
/* 78 */                        c2043or.m7235a();
                            }
                            break;
                        case 2:
/* 24 */                    ((y92) this.f9153c).execute(new RunnableC2524z6(this, cameraCaptureSession, i, 3));
                            break;
                        case 3:
/* 10 */                    m4247b();
                            break;
                        default:
/* 6 */                     super.onCaptureSequenceAborted(cameraCaptureSession, i);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
                    switch (this.f9151a) {
                        case 1:
/* 43 */                    Iterator it = ((HashMap) this.f9152b).values().iterator();
/* 51 */                    while (it.hasNext()) {
/* 59 */                        Iterator it2 = ((List) it.next()).iterator();
/* 67 */                        while (it2.hasNext()) {
/* 75 */                            ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                                }
                            }
/* 81 */                    C2043or c2043or = (C2043or) this.f9153c;
/* 83 */                    if (c2043or != null) {
/* 85 */                        c2043or.m7235a();
                            }
                            break;
                        case 2:
/* 27 */                    ((y92) this.f9153c).execute(new Runnable() { // from class: wo
                                @Override // java.lang.Runnable
                                public final void run() {
/* 13 */                            ((CameraCaptureSession.CaptureCallback) this.f18710a.f9152b).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                                }
                            });
                            break;
                        case 3:
/* 10 */                    m4247b();
                            break;
                        default:
/* 6 */                     super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
                    switch (this.f9151a) {
                        case 1:
/* 36 */                    Iterator it = m4248c(captureRequest).iterator();
/* 44 */                    while (it.hasNext()) {
/* 52 */                        ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                            }
                            break;
                        case 2:
/* 28 */                    ((y92) this.f9153c).execute(new Runnable() { // from class: uo
                                @Override // java.lang.Runnable
                                public final void run() {
/* 16 */                            ((CameraCaptureSession.CaptureCallback) this.f17609a.f9152b).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                                }
                            });
                            break;
                        case 3:
/* 10 */                    m4247b();
                            break;
                        default:
/* 6 */                     super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                            break;
                    }
                }

/* 76 */        public C0997hn(y92 y92Var, CameraCaptureSession.CaptureCallback captureCallback) {
                    this.f9151a = 2;
/* 78 */            this.f9153c = y92Var;
/* 79 */            this.f9152b = captureCallback;
                }

/* 79 */        public C0997hn(y92 y92Var) {
                    this.f9151a = 0;
/* 81 */            this.f9152b = new HashSet();
/* 82 */            this.f9153c = y92Var;
                }
            }
