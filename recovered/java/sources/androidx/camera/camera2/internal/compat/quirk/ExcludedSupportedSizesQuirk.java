            package androidx.camera.camera2.internal.compat.quirk;

            import android.os.Build;
            import p000.h02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ExcludedSupportedSizesQuirk implements h02 {
                /* JADX INFO: renamed from: b */
                public static boolean m439b() {
                    return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m440c() {
                    return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
                }
            }
