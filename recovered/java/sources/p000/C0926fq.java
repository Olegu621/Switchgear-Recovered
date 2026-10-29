            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraManager;
            import java.util.Set;
            
            /* JADX INFO: renamed from: fq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0926fq extends C0889eq {
                @Override // p000.C0210cb
                /* JADX INFO: renamed from: u */
                public final Set mo1598u() throws C1897lo {
                    try {
/* 5 */                 return ((CameraManager) this.f2804b).getConcurrentCameraIds();
                    } catch (CameraAccessException e) {
/* 16 */                throw new C1897lo(e);
                    }
                }
            }
