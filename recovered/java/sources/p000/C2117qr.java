            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: renamed from: qr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 57 */    public final class C2117qr extends ck2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15709a;

                /* JADX INFO: renamed from: b */
                public final Object f15710b;

                public C2117qr(List list, int i) {
/* 1 */             this.f15709a = i;
                    switch (i) {
                        case 2:
/* 50 */                    ArrayList arrayList = new ArrayList();
/* 53 */                    this.f15710b = arrayList;
/* 55 */                    arrayList.addAll(list);
                            break;
                        default:
/* 42 */                    this.f15710b = list.isEmpty() ? new C0888ep() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new C0851dp(list);
                            break;
                    }
                }

                /* JADX INFO: renamed from: i */
                private final void m8002i(gk2 gk2Var) {
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: a */
                public void mo1713a(gk2 gk2Var) {
/* 1 */             int i = this.f15709a;
/* 3 */             Object obj = this.f15710b;
                    switch (i) {
                        case 1:
/* 46 */                    ((CameraCaptureSession.StateCallback) obj).onActive((CameraCaptureSession) ((C0210cb) gk2Var.m3964r().f8789a).f2804b);
                            break;
                        case 2:
/* 11 */                    Iterator it = ((ArrayList) obj).iterator();
/* 19 */                    while (it.hasNext()) {
/* 27 */                        ((ck2) it.next()).mo1713a(gk2Var);
                            }
                            break;
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: b */
                public void mo1714b(gk2 gk2Var) {
/* 1 */             int i = this.f15709a;
/* 3 */             Object obj = this.f15710b;
                    switch (i) {
                        case 1:
/* 1 */                     ((CameraCaptureSession.StateCallback) obj).onCaptureQueueEmpty((CameraCaptureSession) ((C0210cb) gk2Var.m3964r().f8789a).f2804b);
                            break;
                        case 2:
/* 11 */                    Iterator it = ((ArrayList) obj).iterator();
/* 19 */                    while (it.hasNext()) {
/* 27 */                        ((ck2) it.next()).mo1714b(gk2Var);
                            }
                            break;
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: c */
                public void mo1715c(gk2 gk2Var) {
/* 1 */             int i = this.f15709a;
/* 3 */             Object obj = this.f15710b;
                    switch (i) {
                        case 1:
/* 46 */                    ((CameraCaptureSession.StateCallback) obj).onClosed((CameraCaptureSession) ((C0210cb) gk2Var.m3964r().f8789a).f2804b);
                            break;
                        case 2:
/* 11 */                    Iterator it = ((ArrayList) obj).iterator();
/* 19 */                    while (it.hasNext()) {
/* 27 */                        ((ck2) it.next()).mo1715c(gk2Var);
                            }
                            break;
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: d */
                public final void mo1716d(gk2 gk2Var) {
                    switch (this.f15709a) {
                        case 0:
                            synchronized (((C2154rr) this.f15710b).f16232a) {
                                try {
                                    switch (AbstractC0886en.m3520y(((C2154rr) this.f15710b).f16240i)) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 4:
/* 131 */                                   throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(AbstractC0886en.m3494C(((C2154rr) this.f15710b).f16240i)));
                                        case 3:
                                        case 5:
                                        case 6:
/* 88 */                                    ((C2154rr) this.f15710b).m8230c();
                                            break;
                                        case 7:
/* 78 */                                    hu0.m4312F0("CaptureSession");
                                            break;
                                    }
/* 107 */                           hu0.m4325T("CaptureSession", "CameraCaptureSession.onConfigureFailed() ".concat(AbstractC0886en.m3494C(((C2154rr) this.f15710b).f16240i)));
                                } catch (Throwable th) {
/* 133 */                           throw th;
                                }
                            }
/* 111 */                   return;
                        case 1:
/* 47 */                    ((CameraCaptureSession.StateCallback) this.f15710b).onConfigureFailed((CameraCaptureSession) ((C0210cb) gk2Var.m3964r().f8789a).f2804b);
/* 50 */                    return;
                        default:
/* 10 */                    Iterator it = ((ArrayList) this.f15710b).iterator();
/* 18 */                    while (it.hasNext()) {
/* 26 */                        ((ck2) it.next()).mo1716d(gk2Var);
                            }
/* 30 */                    return;
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: e */
                public final void mo1717e(gk2 gk2Var) {
                    switch (this.f15709a) {
                        case 0:
                            synchronized (((C2154rr) this.f15710b).f16232a) {
                                try {
                                    switch (AbstractC0886en.m3520y(((C2154rr) this.f15710b).f16240i)) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 4:
                                        case 7:
/* 160 */                                   throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(AbstractC0886en.m3494C(((C2154rr) this.f15710b).f16240i)));
                                        case 3:
/* 89 */                                    C2154rr c2154rr = (C2154rr) this.f15710b;
/* 92 */                                    c2154rr.f16240i = 5;
/* 94 */                                    c2154rr.f16236e = gk2Var;
/* 98 */                                    hu0.m4312F0("CaptureSession");
/* 103 */                                   C2154rr c2154rr2 = (C2154rr) this.f15710b;
/* 107 */                                   c2154rr2.m8235h(c2154rr2.f16237f);
/* 112 */                                   C2154rr c2154rr3 = (C2154rr) this.f15710b;
/* 131 */                                   c2154rr3.f16246o.m10432f().mo3676a(new RunnableC2166s2(c2154rr3, 8), pg3.m7428g());
                                            break;
                                        case 5:
/* 84 */                                    ((C2154rr) this.f15710b).f16236e = gk2Var;
                                            break;
                                        case 6:
/* 74 */                                    gk2Var.m3957j();
                                            break;
                                    }
/* 136 */                           hu0.m4312F0("CaptureSession");
                                } catch (Throwable th) {
/* 162 */                           throw th;
                                }
                            }
/* 140 */                   return;
                        case 1:
/* 47 */                    ((CameraCaptureSession.StateCallback) this.f15710b).onConfigured((CameraCaptureSession) ((C0210cb) gk2Var.m3964r().f8789a).f2804b);
/* 50 */                    return;
                        default:
/* 10 */                    Iterator it = ((ArrayList) this.f15710b).iterator();
/* 18 */                    while (it.hasNext()) {
/* 26 */                        ((ck2) it.next()).mo1717e(gk2Var);
                            }
/* 30 */                    return;
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: f */
                public final void mo1718f(gk2 gk2Var) {
                    switch (this.f15709a) {
                        case 0:
                            synchronized (((C2154rr) this.f15710b).f16232a) {
                                try {
/* 70 */                            if (AbstractC0886en.m3520y(((C2154rr) this.f15710b).f16240i) == 0) {
/* 100 */                               throw new IllegalStateException("onReady() should not be possible in state: ".concat(AbstractC0886en.m3494C(((C2154rr) this.f15710b).f16240i)));
                                    }
/* 74 */                            hu0.m4312F0("CaptureSession");
                                } catch (Throwable th) {
/* 102 */                           throw th;
                                }
                            }
/* 78 */                    return;
                        case 1:
/* 47 */                    ((CameraCaptureSession.StateCallback) this.f15710b).onReady((CameraCaptureSession) ((C0210cb) gk2Var.m3964r().f8789a).f2804b);
/* 50 */                    return;
                        default:
/* 10 */                    Iterator it = ((ArrayList) this.f15710b).iterator();
/* 18 */                    while (it.hasNext()) {
/* 26 */                        ((ck2) it.next()).mo1718f(gk2Var);
                            }
/* 30 */                    return;
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: g */
                public final void mo1719g(gk2 gk2Var) {
                    switch (this.f15709a) {
                        case 0:
                            synchronized (((C2154rr) this.f15710b).f16232a) {
                                try {
/* 44 */                            int i = ((C2154rr) this.f15710b).f16240i;
/* 47 */                            if (i == 1) {
/* 78 */                                throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(AbstractC0886en.m3494C(i)));
                                    }
/* 51 */                            hu0.m4312F0("CaptureSession");
/* 58 */                            ((C2154rr) this.f15710b).m8230c();
                                } catch (Throwable th) {
/* 80 */                            throw th;
                                }
                            }
/* 62 */                    return;
                        case 1:
/* 30 */                    return;
                        default:
/* 10 */                    Iterator it = ((ArrayList) this.f15710b).iterator();
/* 18 */                    while (it.hasNext()) {
/* 26 */                        ((ck2) it.next()).mo1719g(gk2Var);
                            }
/* 30 */                    return;
                    }
                }

                @Override // p000.ck2
                /* JADX INFO: renamed from: h */
                public void mo1720h(gk2 gk2Var, Surface surface) {
/* 1 */             int i = this.f15709a;
/* 3 */             Object obj = this.f15710b;
                    switch (i) {
                        case 1:
/* 46 */                    ((CameraCaptureSession.StateCallback) obj).onSurfacePrepared((CameraCaptureSession) ((C0210cb) gk2Var.m3964r().f8789a).f2804b, surface);
                            break;
                        case 2:
/* 11 */                    Iterator it = ((ArrayList) obj).iterator();
/* 19 */                    while (it.hasNext()) {
/* 27 */                        ((ck2) it.next()).mo1720h(gk2Var, surface);
                            }
                            break;
                    }
                }

/* 58 */        public C2117qr(C2154rr c2154rr) {
                    this.f15709a = 0;
/* 60 */            this.f15710b = c2154rr;
                }
            }
