            package p000;

            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class f91 {

                /* JADX INFO: renamed from: a */
                public static final Locale[] f8047a = {new Locale("en", "XA"), new Locale("ar", "XB")};

                /* JADX INFO: renamed from: a */
                public static Locale m3680a(String str) {
/* 1 */             return Locale.forLanguageTag(str);
                }

                /* JADX INFO: renamed from: b */
                public static boolean m3681b(Locale locale, Locale locale2) {
/* 5 */             if (locale.equals(locale2)) {
/* 98 */                return true;
                    }
/* 21 */            if (locale.getLanguage().equals(locale2.getLanguage())) {
/* 24 */                Locale[] localeArr = f8047a;
/* 28 */                for (Locale locale3 : localeArr) {
/* 36 */                    if (!locale3.equals(locale)) {
                            }
                        }
/* 44 */                for (Locale locale4 : localeArr) {
/* 52 */                    if (!locale4.equals(locale2)) {
                            }
                        }
/* 66 */                String strM2895c = cv0.m2895c(cv0.m2893a(cv0.m2894b(locale)));
/* 74 */                if (!strM2895c.isEmpty()) {
/* 112 */                   return strM2895c.equals(cv0.m2895c(cv0.m2893a(cv0.m2894b(locale2))));
                        }
/* 76 */                String country = locale.getCountry();
/* 84 */                if (country.isEmpty() || country.equals(locale2.getCountry())) {
/* 98 */                    return true;
                        }
                    }
/* 20 */            return false;
                }
            }
