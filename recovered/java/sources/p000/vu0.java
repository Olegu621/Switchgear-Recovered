            package p000;

            import android.text.Html;
            import android.text.Spanned;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class vu0 {
                /* JADX INFO: renamed from: a */
                public static Spanned m9346a(String str, int i) {
/* 1 */             return Html.fromHtml(str, i);
                }

                /* JADX INFO: renamed from: b */
                public static Spanned m9347b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
/* 1 */             return Html.fromHtml(str, i, imageGetter, tagHandler);
                }

                /* JADX INFO: renamed from: c */
                public static String m9348c(Spanned spanned, int i) {
/* 1 */             return Html.toHtml(spanned, i);
                }
            }
