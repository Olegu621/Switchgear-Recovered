            package p000;

            import android.content.Context;
            import android.text.TextUtils;
            import androidx.window.sidecar.SidecarInterface;
            import androidx.window.sidecar.SidecarProvider;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class de2 {
                /* JADX INFO: renamed from: a */
                public static SidecarInterface m3013a(Context context) {
/* 1 */             context.getClass();
/* 8 */             return SidecarProvider.getSidecarImpl(context.getApplicationContext());
                }

                /* JADX INFO: renamed from: b */
                public static g23 m3014b() {
                    try {
/* 1 */                 String apiVersion = SidecarProvider.getApiVersion();
/* 9 */                 if (TextUtils.isEmpty(apiVersion)) {
/* 18 */                    return null;
                        }
/* 11 */                g23 g23Var = g23.f8441f;
/* 13 */                return k50.m5951E(apiVersion);
                    } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
/* 18 */                return null;
                    }
                }
            }
