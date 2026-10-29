            package p000;

            import android.hardware.camera2.CameraDevice;
            import android.os.SystemClock;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: wn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2337wn extends CameraDevice.StateCallback {

                /* JADX INFO: renamed from: a */
                public final y92 f18691a;

                /* JADX INFO: renamed from: b */
                public final nt0 f18692b;

                /* JADX INFO: renamed from: c */
                public RunnableC2300vn f18693c;

                /* JADX INFO: renamed from: d */
                public ScheduledFuture f18694d;

                /* JADX INFO: renamed from: e */
                public final C2261un f18695e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C2467xn f18696f;

                public C2337wn(C2467xn c2467xn, y92 y92Var, nt0 nt0Var, long j) {
/* 1 */             this.f18696f = c2467xn;
/* 6 */             this.f18691a = y92Var;
/* 8 */             this.f18692b = nt0Var;
/* 15 */            this.f18695e = new C2261un(this, j);
                }

                /* JADX INFO: renamed from: a */
                public final boolean m9586a() {
/* 4 */             if (this.f18694d == null) {
/* 3 */                 return false;
                    }
/* 24 */            this.f18696f.m10000s("Cancelling scheduled re-open: " + this.f18693c);
/* 30 */            this.f18693c.f18253b = true;
/* 33 */            this.f18693c = null;
/* 37 */            this.f18694d.cancel(false);
/* 40 */            this.f18694d = null;
/* 29 */            return true;
                }

                /* JADX INFO: renamed from: b */
                public final void m9587b() {
/* 11 */            de3.m3028j(null, this.f18693c == null);
/* 20 */            de3.m3028j(null, this.f18694d == null);
/* 23 */            C2261un c2261un = this.f18695e;
/* 25 */            c2261un.getClass();
/* 28 */            long jUptimeMillis = SystemClock.uptimeMillis();
/* 38 */            if (c2261un.f17601b == -1) {
/* 40 */                c2261un.f17601b = jUptimeMillis;
                    }
/* 44 */            long j = jUptimeMillis - c2261un.f17601b;
/* 45 */            long jM9043b = c2261un.m9043b();
/* 52 */            C2467xn c2467xn = this.f18696f;
/* 54 */            if (j >= jM9043b) {
/* 56 */                c2261un.f17601b = -1L;
/* 83 */                hu0.m4325T("Camera2CameraImpl", "Camera reopening attempted for " + c2261un.m9043b() + "ms without success.");
/* 87 */                c2467xn.m9984D(4, null, false);
/* 90 */                return;
                    }
/* 98 */            this.f18693c = new RunnableC2300vn(this, this.f18691a);
/* 138 */           c2467xn.m10000s("Attempting camera re-open in " + c2261un.m9042a() + "ms: " + this.f18693c + " activeResuming = " + c2467xn.f19279n0);
/* 156 */           this.f18694d = this.f18692b.schedule(this.f18693c, (long) c2261un.m9042a(), TimeUnit.MILLISECONDS);
                }

                /* JADX INFO: renamed from: c */
                public final boolean m9588c() {
/* 1 */             C2467xn c2467xn = this.f18696f;
/* 5 */             if (!c2467xn.f19279n0) {
/* 16 */                return false;
                    }
/* 7 */             int i = c2467xn.f19254V;
                    return i == 1 || i == 2;
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onClosed(CameraDevice cameraDevice) {
/* 5 */             this.f18696f.m10000s("CameraDevice.onClosed()");
/* 33 */            de3.m3028j("Unexpected onClose callback on camera device: " + cameraDevice, this.f18696f.f19253U == null);
/* 40 */            int iM3520y = AbstractC0886en.m3520y(this.f18696f.f19284s0);
/* 44 */            if (iM3520y == 1 || iM3520y == 4) {
/* 110 */               de3.m3028j(null, this.f18696f.f19256X.isEmpty());
/* 115 */               this.f18696f.m9998q();
/* 118 */               return;
                    }
/* 50 */            if (iM3520y != 5 && iM3520y != 6) {
/* 70 */                f42.m3656l("Camera closed while in state: ".concat(AbstractC0886en.m3492A(this.f18696f.f19284s0)));
/* 73 */                return;
                    }
/* 74 */            C2467xn c2467xn = this.f18696f;
/* 76 */            int i = c2467xn.f19254V;
/* 78 */            if (i == 0) {
/* 97 */                c2467xn.m9989I(false);
                    } else {
/* 90 */                c2467xn.m10000s("Camera closed due to error: ".concat(C2467xn.m9978u(i)));
/* 93 */                m9587b();
                    }
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onDisconnected(CameraDevice cameraDevice) {
/* 5 */             this.f18696f.m10000s("CameraDevice.onDisconnected()");
/* 9 */             onError(cameraDevice, 1);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onError(CameraDevice cameraDevice, int i) {
/* 1 */             C2467xn c2467xn = this.f18696f;
/* 3 */             c2467xn.f19253U = cameraDevice;
/* 5 */             c2467xn.f19254V = i;
/* 7 */             C0210cb c0210cb = c2467xn.f19283r0;
/* 15 */            ((C2467xn) c0210cb.f2805c).m10000s("Camera receive onErrorCallback");
/* 18 */            c0210cb.m1590l();
/* 25 */            int iM3520y = AbstractC0886en.m3520y(this.f18696f.f19284s0);
/* 32 */            if (iM3520y != 1) {
                        switch (iM3520y) {
                            case 4:
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
/* 55 */                        cameraDevice.getId();
/* 62 */                        AbstractC0886en.m3518v(this.f18696f.f19284s0);
/* 65 */                        hu0.m4312F0("Camera2CameraImpl");
/* 125 */                       de3.m3028j("Attempt to handle open error from non open state: ".concat(AbstractC0886en.m3492A(this.f18696f.f19284s0)), this.f18696f.f19284s0 == 8 || this.f18696f.f19284s0 == 9 || this.f18696f.f19284s0 == 10 || this.f18696f.f19284s0 == 7 || this.f18696f.f19284s0 == 6);
/* 129 */                       int i2 = 3;
/* 131 */                       if (i == 1 || i == 2 || i == 4) {
/* 196 */                           cameraDevice.getId();
/* 199 */                           hu0.m4312F0("Camera2CameraImpl");
/* 202 */                           C2467xn c2467xn2 = this.f18696f;
/* 211 */                           de3.m3028j("Can only reopen camera device after error if the camera device is actually in an error state.", c2467xn2.f19254V != 0);
/* 214 */                           if (i == 1) {
/* 221 */                               i2 = 2;
                                    } else if (i == 2) {
/* 219 */                               i2 = 1;
                                    }
/* 227 */                           c2467xn2.m9984D(7, new C0915ff(i2, null), true);
/* 230 */                           c2467xn2.m9997p();
                                } else {
/* 173 */                           hu0.m4325T("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C2467xn.m9978u(i) + " closing camera.");
/* 187 */                           this.f18696f.m9984D(5, new C0915ff(i == 3 ? 5 : 6, null), true);
/* 192 */                           this.f18696f.m9997p();
                                }
                                break;
                            default:
/* 51 */                        f42.m3656l("onError() should not be possible from state: ".concat(AbstractC0886en.m3492A(this.f18696f.f19284s0)));
                                break;
                        }
/* 54 */                return;
                    }
/* 234 */           String id = cameraDevice.getId();
/* 238 */           String strM9978u = C2467xn.m9978u(i);
/* 246 */           String strM3518v = AbstractC0886en.m3518v(this.f18696f.f19284s0);
/* 256 */           StringBuilder sbM3514r = AbstractC0886en.m3514r("CameraDevice.onError(): ", id, " failed with ", strM9978u, " while in ");
/* 260 */           sbM3514r.append(strM3518v);
/* 265 */           sbM3514r.append(" state. Will finish closing camera.");
/* 272 */           hu0.m4325T("Camera2CameraImpl", sbM3514r.toString());
/* 277 */           this.f18696f.m9997p();
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onOpened(CameraDevice cameraDevice) {
/* 5 */             this.f18696f.m10000s("CameraDevice.onOpened()");
/* 8 */             C2467xn c2467xn = this.f18696f;
/* 10 */            c2467xn.f19253U = cameraDevice;
/* 13 */            c2467xn.f19254V = 0;
/* 19 */            this.f18695e.f17601b = -1L;
/* 23 */            int iM3520y = AbstractC0886en.m3520y(c2467xn.f19284s0);
/* 28 */            if (iM3520y == 1 || iM3520y == 4) {
/* 111 */               de3.m3028j(null, this.f18696f.f19256X.isEmpty());
/* 118 */               this.f18696f.f19253U.close();
/* 123 */               this.f18696f.f19253U = null;
                    } else {
/* 34 */                if (iM3520y != 5 && iM3520y != 6 && iM3520y != 7) {
/* 57 */                    f42.m3656l("onOpened() should not be possible from state: ".concat(AbstractC0886en.m3492A(this.f18696f.f19284s0)));
/* 60 */                    return;
                        }
/* 65 */                this.f18696f.m9985E(9);
/* 70 */                C1899lq c1899lq = this.f18696f.f19262b0;
/* 72 */                String id = cameraDevice.getId();
/* 76 */                C2467xn c2467xn2 = this.f18696f;
/* 94 */                if (c1899lq.m6522e(id, c2467xn2.f19260a0.m6137p(c2467xn2.f19253U.getId()))) {
/* 98 */                    this.f18696f.m9981A();
                        }
                    }
                }
            }
