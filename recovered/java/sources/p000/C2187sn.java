            package p000;

            import android.hardware.camera2.CameraManager;
            
            /* JADX INFO: renamed from: sn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2187sn extends CameraManager.AvailabilityCallback {

                /* JADX INFO: renamed from: a */
                public final String f16711a;

                /* JADX INFO: renamed from: b */
                public boolean f16712b = true;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C2467xn f16713c;

                public C2187sn(C2467xn c2467xn, String str) {
/* 1 */             this.f16713c = c2467xn;
/* 9 */             this.f16711a = str;
                }

                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraAvailable(String str) {
/* 7 */             if (this.f16711a.equals(str)) {
/* 11 */                this.f16712b = true;
/* 18 */                if (this.f16713c.f19284s0 == 4) {
/* 23 */                    this.f16713c.m9989I(false);
                        }
                    }
                }

                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public final void onCameraUnavailable(String str) {
/* 7 */             if (this.f16711a.equals(str)) {
/* 11 */                this.f16712b = false;
                    }
                }
            }
