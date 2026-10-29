            package p000;

            import android.content.Context;
            import android.view.inputmethod.EditorInfo;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class a10 {
                /* JADX INFO: renamed from: a */
                public static Context m17a(Context context, String str) {
/* 1 */             return context.createAttributionContext(str);
                }

                /* JADX INFO: renamed from: b */
                public static String m18b(Context context) {
/* 1 */             return context.getAttributionTag();
                }

                /* JADX INFO: renamed from: c */
                public static void m19c(EditorInfo editorInfo, CharSequence charSequence) {
/* 2 */             editorInfo.setInitialSurroundingSubText(charSequence, 0);
                }
            }
