            package p000;

            import java.util.Arrays;
            import java.util.HashSet;
            import okio.Utf8;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ii3 {

                /* JADX INFO: renamed from: c */
                public static final HashSet f9625c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

                /* JADX INFO: renamed from: a */
                public final StringBuilder f9626a;

                /* JADX INFO: renamed from: b */
                public boolean f9627b = false;

                public ii3(StringBuilder sb) {
/* 7 */             this.f9626a = sb;
                }

                /* JADX INFO: renamed from: b */
                public static int m4548b(int i, String str) {
/* 5 */             while (i < str.length()) {
/* 7 */                 char cCharAt = str.charAt(i);
/* 13 */                if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
/* 27 */                    return i;
                        }
/* 24 */                i++;
                    }
/* 28 */            return -1;
                }

                /* JADX INFO: renamed from: a */
                public final void m4549a(String str, Object obj) {
/* 1 */             boolean z = this.f9627b;
/* 9 */             StringBuilder sb = this.f9626a;
/* 11 */            if (z) {
/* 13 */                sb.append(' ');
                    } else {
/* 21 */                if (sb.length() > 0) {
/* 40 */                    sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
                        }
/* 45 */                sb.append("[CONTEXT ");
/* 48 */                this.f9627b = true;
                    }
/* 50 */            sb.append(str);
/* 55 */            sb.append('=');
/* 58 */            if (obj == null) {
/* 60 */                sb.append(true);
/* 63 */                return;
                    }
/* 74 */            if (f9625c.contains(obj.getClass())) {
/* 76 */                sb.append(obj);
/* 79 */                return;
                    }
/* 82 */            sb.append('\"');
/* 85 */            String string = obj.toString();
/* 89 */            int i = 0;
                    while (true) {
/* 90 */                int iM4548b = m4548b(i, string);
/* 94 */                if (iM4548b == -1) {
/* 149 */                   sb.append((CharSequence) string, i, string.length());
/* 152 */                   sb.append('\"');
/* 155 */                   return;
                        }
/* 96 */                sb.append((CharSequence) string, i, iM4548b);
/* 99 */                i = iM4548b + 1;
/* 101 */               char cCharAt = string.charAt(iM4548b);
/* 107 */               if (cCharAt == '\t') {
/* 134 */                   cCharAt = 't';
                        } else if (cCharAt == '\n') {
/* 131 */                   cCharAt = 'n';
                        } else if (cCharAt == '\r') {
/* 128 */                   cCharAt = 'r';
                        } else if (cCharAt != '\"' && cCharAt != '\\') {
/* 124 */                   sb.append(Utf8.REPLACEMENT_CHARACTER);
                        }
/* 138 */               sb.append("\\");
/* 141 */               sb.append(cCharAt);
                    }
                }
            }
