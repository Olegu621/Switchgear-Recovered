            package p000;

            import android.app.RemoteInput;
            import android.content.Intent;
            import android.net.Uri;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class e32 {
                /* JADX INFO: renamed from: a */
                public static void m3301a(g32 g32Var, Intent intent, Map<String, Uri> map) {
/* 5 */             RemoteInput.addDataResultToIntent(g32.m3868a(g32Var), intent, map);
                }

                /* JADX INFO: renamed from: b */
                public static Set<String> m3302b(Object obj) {
/* 3 */             return ((RemoteInput) obj).getAllowedDataTypes();
                }

                /* JADX INFO: renamed from: c */
                public static Map<String, Uri> m3303c(Intent intent, String str) {
/* 1 */             return RemoteInput.getDataResultsFromIntent(intent, str);
                }

                /* JADX INFO: renamed from: d */
                public static RemoteInput.Builder m3304d(RemoteInput.Builder builder, String str, boolean z) {
/* 1 */             return builder.setAllowDataType(str, z);
                }
            }
