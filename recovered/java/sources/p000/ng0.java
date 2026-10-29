            package p000;

            import androidx.window.extensions.WindowExtensionsProvider;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ng0 {
                static {
/* 7 */             j22.m5667a(ng0.class).m3242b();
                }

                /* JADX INFO: renamed from: a */
                public static int m6975a() {
                    try {
/* 5 */                 return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
                    } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
/* 10 */                return 0;
                    }
                }
            }
