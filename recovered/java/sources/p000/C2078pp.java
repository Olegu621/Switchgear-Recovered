            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.params.SessionConfiguration;
            
            /* JADX INFO: renamed from: pp */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2078pp extends C0210cb {
                @Override // p000.C0210cb
                /* JADX INFO: renamed from: n */
                public final void mo1591n(kb2 kb2Var) throws C1897lo {
/* 7 */             SessionConfiguration sessionConfiguration = (SessionConfiguration) kb2Var.f12673a.mo4150a();
/* 9 */             sessionConfiguration.getClass();
                    try {
/* 16 */                ((CameraDevice) this.f2804b).createCaptureSession(sessionConfiguration);
                    } catch (CameraAccessException e) {
/* 26 */                throw new C1897lo(e);
                    }
                }
            }
