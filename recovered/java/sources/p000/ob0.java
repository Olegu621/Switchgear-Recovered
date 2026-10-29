            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ob0 {
                /* JADX INFO: renamed from: a */
                public static mb0 m7129a(C0962gp c0962gp) {
/* 7 */             Long l = (Long) c0962gp.m3981a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
/* 9 */             if (l != null) {
/* 17 */                return (mb0) nb0.f14175a.get(l);
                    }
/* 20 */            return null;
                }
            }
