            package androidx.camera.camera2.internal.compat.quirk;

            import android.os.Build;
            import p000.h02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, h02 {
                @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
                /* JADX INFO: renamed from: a */
                public final boolean mo438a() {
/* 1 */             String str = Build.BRAND;
/* 9 */             if ("blu".equalsIgnoreCase(str) && "studio x10".equalsIgnoreCase(Build.MODEL)) {
/* 78 */                return true;
                    }
/* 28 */            if ("itel".equalsIgnoreCase(str) && "itel w6004".equalsIgnoreCase(Build.MODEL)) {
/* 78 */                return true;
                    }
/* 47 */            if ("vivo".equalsIgnoreCase(str) && "vivo 1805".equalsIgnoreCase(Build.MODEL)) {
/* 78 */                return true;
                    }
                    return "positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
                }
            }
