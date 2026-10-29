            package p000;

            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Set;
            import kotlin.text.StringsKt;
            import kotlin.text.StringsKt__StringsKt;
            
            /* JADX INFO: renamed from: fz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0935fz {

                /* JADX INFO: renamed from: a */
                public static final Set f8400a = C2103qd.m7780o(new String[]{"AR", "BG", "BS", "CA", "CS", "CY", "DA", "DE", "EL", "EN", "ES", "ET", "EU", "FI", "FR", "GL", "HE", "HI", "HR", "HU", "ID", "IT", "JA", "KA", "KO", "LT", "LV", "MK", "MS", "MT", "NL", "NO", "PL", "PT", "PT_BR", "RO", "RU", "SK", "SL", "SQ", "SR", "SR_LATN", "SV", "TH", "TL", "TR", "UK", "VI", "ZH", "ZH-HANT"});

                /* JADX INFO: renamed from: a */
                public static String m3857a(String str) {
                    Object next;
/* 3 */             String upperCase = str.toUpperCase(Locale.ROOT);
/* 7 */             upperCase.getClass();
/* 7 */             List listSplit$default = StringsKt__StringsKt.split$default(upperCase, new String[]{"_"}, false, 0, 6, null);
/* 24 */            Iterator it = f8400a.iterator();
/* 52 */            do {
/* 33 */                if (!it.hasNext()) {
/* 55 */                    next = null;
                            break;
                        }
/* 35 */                next = it.next();
/* 52 */            } while (!StringsKt.m6240z((String) next, (CharSequence) listSplit$default.get(0), false));
/* 56 */            String str2 = (String) next;
/* 58 */            if (str2 == null) {
/* 32 */                return null;
                    }
/* 62 */            String lowerCase = str2.toLowerCase(Locale.ROOT);
/* 66 */            lowerCase.getClass();
/* 69 */            return lowerCase;
                }
            }
