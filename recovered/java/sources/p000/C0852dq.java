            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CameraManager;
            import android.os.Build;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: dq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0852dq extends C0210cb {
                /* JADX INFO: renamed from: O */
                public static boolean m3174O(RuntimeException runtimeException) {
                    StackTraceElement[] stackTrace;
/* 6 */             if (Build.VERSION.SDK_INT == 28) {
/* 44 */                if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
/* 46 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override // p000.C0210cb
                /* JADX INFO: renamed from: E */
                public void mo1571E(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C1897lo {
                    try {
                        try {
/* 5 */                     ((CameraManager) this.f2804b).openCamera(str, executor, stateCallback);
                        } catch (SecurityException e) {
/* 29 */                    throw e;
                        }
                    } catch (CameraAccessException e2) {
/* 35 */                throw new C1897lo(e2);
                    } catch (IllegalArgumentException | SecurityException e3) {
                    } catch (RuntimeException e4) {
/* 19 */                if (!m3174O(e4)) {
/* 27 */                    throw e4;
                        }
/* 26 */                throw new C1897lo(e4);
                    }
                }

                @Override // p000.C0210cb
                /* JADX INFO: renamed from: G */
                public final void mo1573G(y92 y92Var, C2187sn c2187sn) {
/* 5 */             ((CameraManager) this.f2804b).registerAvailabilityCallback(y92Var, c2187sn);
                }

                @Override // p000.C0210cb
                /* JADX INFO: renamed from: N */
                public final void mo1579N(CameraManager.AvailabilityCallback availabilityCallback) {
/* 5 */             ((CameraManager) this.f2804b).unregisterAvailabilityCallback(availabilityCallback);
                }

                @Override // p000.C0210cb
                /* JADX INFO: renamed from: s */
                public CameraCharacteristics mo1596s(String str) throws C1897lo {
                    try {
/* 1 */                 return super.mo1596s(str);
                    } catch (RuntimeException e) {
/* 11 */                if (m3174O(e)) {
/* 18 */                    throw new C1897lo(e);
                        }
/* 19 */                throw e;
                    }
                }
            }
