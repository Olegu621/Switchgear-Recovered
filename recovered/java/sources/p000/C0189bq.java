            package p000;

            import android.hardware.camera2.CameraManager;
            
            /* JADX INFO: renamed from: bq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0189bq extends CameraManager.AvailabilityCallback {

                /* JADX INFO: renamed from: a */
                public final y92 f2567a;

                /* JADX INFO: renamed from: b */
                public final C2187sn f2568b;

                /* JADX INFO: renamed from: c */
                public final Object f2569c = new Object();

                /* JADX INFO: renamed from: d */
                public boolean f2570d = false;

                public C0189bq(y92 y92Var, C2187sn c2187sn) {
/* 14 */            this.f2567a = y92Var;
/* 16 */            this.f2568b = c2187sn;
                }

                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraAccessPrioritiesChanged() {
                    synchronized (this.f2569c) {
                        try {
/* 6 */                     if (!this.f2570d) {
/* 16 */                        this.f2567a.execute(new RunnableC2166s2(this, 5));
                            }
                        } catch (Throwable th) {
/* 25 */                    throw th;
                        }
                    }
                }

                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraAvailable(String str) {
                    synchronized (this.f2569c) {
                        try {
/* 6 */                     if (!this.f2570d) {
/* 16 */                        this.f2567a.execute(new RunnableC0152aq(this, str, 0));
                            }
                        } catch (Throwable th) {
/* 25 */                    throw th;
                        }
                    }
                }

                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraUnavailable(String str) {
                    synchronized (this.f2569c) {
                        try {
/* 6 */                     if (!this.f2570d) {
/* 16 */                        this.f2567a.execute(new RunnableC0152aq(this, str, 1));
                            }
                        } catch (Throwable th) {
/* 25 */                    throw th;
                        }
                    }
                }
            }
