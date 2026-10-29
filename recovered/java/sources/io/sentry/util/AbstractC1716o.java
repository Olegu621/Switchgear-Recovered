            package io.sentry.util;

            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.text.StringCharacterIterator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.regex.Pattern;
            
            /* JADX INFO: renamed from: io.sentry.util.o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1716o {

                /* JADX INFO: renamed from: a */
                public static final Charset f11743a = StandardCharsets.UTF_8;

                /* JADX INFO: renamed from: b */
                public static final Pattern f11744b = Pattern.compile("[\\W_]+");

                /* JADX INFO: renamed from: a */
                public static String m5483a(long j) {
/* 7 */             if (-1000 < j && j < 1000) {
/* 26 */                return j + " B";
                    }
/* 35 */            StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
                    while (true) {
/* 43 */                if (j > -999950 && j < 999950) {
/* 80 */                    return String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
                        }
/* 85 */                j /= 1000;
/* 86 */                stringCharacterIterator.next();
                    }
                }

                /* JADX INFO: renamed from: b */
                public static String m5484b(String str) {
/* 1 */             if (str == null || str.isEmpty()) {
/* 45 */                return str;
                    }
/* 12 */            StringBuilder sb = new StringBuilder();
/* 17 */            String strSubstring = str.substring(0, 1);
/* 21 */            Locale locale = Locale.ROOT;
/* 27 */            sb.append(strSubstring.toUpperCase(locale));
/* 38 */            sb.append(str.substring(1).toLowerCase(locale));
/* 41 */            return sb.toString();
                }

                /* JADX INFO: renamed from: c */
                public static String m5485c(List list) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             Iterator it = list.iterator();
/* 14 */            if (it.hasNext()) {
/* 22 */                sb.append((CharSequence) it.next());
/* 29 */                while (it.hasNext()) {
/* 33 */                    sb.append((CharSequence) ",");
/* 42 */                    sb.append((CharSequence) it.next());
                        }
                    }
/* 46 */            return sb.toString();
                }

                /* JADX INFO: renamed from: d */
                public static String m5486d(String str) {
                    return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
                }
            }
