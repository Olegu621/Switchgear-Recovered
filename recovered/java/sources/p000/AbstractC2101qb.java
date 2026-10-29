            package p000;

            import android.os.LocaleList;
            import android.widget.TextView;
            
            /* JADX INFO: renamed from: qb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2101qb {
                /* JADX INFO: renamed from: a */
                public static LocaleList m7758a(String str) {
/* 1 */             return LocaleList.forLanguageTags(str);
                }

                /* JADX INFO: renamed from: b */
                public static void m7759b(TextView textView, LocaleList localeList) {
/* 1 */             textView.setTextLocales(localeList);
                }
            }
