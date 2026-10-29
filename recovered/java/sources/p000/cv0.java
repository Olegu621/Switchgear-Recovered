            package p000;

            import android.icu.util.ULocale;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class cv0 {
                /* JADX INFO: renamed from: a */
                public static ULocale m2893a(Object obj) {
/* 3 */             return ULocale.addLikelySubtags((ULocale) obj);
                }

                /* JADX INFO: renamed from: b */
                public static ULocale m2894b(Locale locale) {
/* 1 */             return ULocale.forLocale(locale);
                }

                /* JADX INFO: renamed from: c */
                public static String m2895c(Object obj) {
/* 3 */             return ((ULocale) obj).getScript();
                }
            }
