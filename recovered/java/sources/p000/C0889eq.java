            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CameraManager;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: eq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0889eq extends C0852dq {
                @Override // p000.C0852dq, p000.C0210cb
                /* JADX INFO: renamed from: E */
                public final void mo1571E(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C1897lo {
                    try {
/* 5 */                 ((CameraManager) this.f2804b).openCamera(str, executor, stateCallback);
                    } catch (CameraAccessException e) {
/* 15 */                throw new C1897lo(e);
                    }
                }

                @Override // p000.C0852dq, p000.C0210cb
                /* JADX INFO: renamed from: s */
                public final CameraCharacteristics mo1596s(String str) throws C1897lo {
                    try {
/* 5 */                 return ((CameraManager) this.f2804b).getCameraCharacteristics(str);
                    } catch (CameraAccessException e) {
/* 16 */                throw new C1897lo(e);
                    }
                }
            }
