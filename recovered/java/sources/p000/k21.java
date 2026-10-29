            package p000;

            import android.text.TextUtils;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class k21 {

                /* JADX INFO: renamed from: a */
                public static final Pattern f12563a;

                static {
/* 3 */             Pattern.compile("\\\\.");
/* 12 */            f12563a = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
                }

                /* JADX INFO: renamed from: a */
                public static String m5934a(String str) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 118 */               return str;
                    }
/* 9 */             Matcher matcher = f12563a.matcher(str);
/* 13 */            StringBuffer stringBuffer = null;
/* 18 */            while (matcher.find()) {
/* 20 */                if (stringBuffer == null) {
/* 24 */                    stringBuffer = new StringBuffer();
                        }
/* 32 */                char cCharAt = matcher.group().charAt(0);
/* 38 */                if (cCharAt == '\f') {
/* 104 */                   matcher.appendReplacement(stringBuffer, "\\\\f");
                        } else if (cCharAt == '\r') {
/* 98 */                    matcher.appendReplacement(stringBuffer, "\\\\r");
                        } else if (cCharAt == '\"') {
/* 92 */                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                        } else if (cCharAt == '/') {
/* 86 */                    matcher.appendReplacement(stringBuffer, "\\\\/");
                        } else if (cCharAt != '\\') {
                            switch (cCharAt) {
                                case '\b':
/* 74 */                            matcher.appendReplacement(stringBuffer, "\\\\b");
                                    break;
                                case '\t':
/* 68 */                            matcher.appendReplacement(stringBuffer, "\\\\t");
                                    break;
                                case '\n':
/* 62 */                            matcher.appendReplacement(stringBuffer, "\\\\n");
                                    break;
                            }
                        } else {
/* 80 */                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                        }
                    }
/* 108 */           if (stringBuffer == null) {
/* 118 */               return str;
                    }
/* 111 */           matcher.appendTail(stringBuffer);
/* 114 */           return stringBuffer.toString();
                }
            }
