            package io.sentry;

            import io.sentry.util.AbstractC1704c;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import p000.C1951n4;
            
            /* JADX INFO: renamed from: io.sentry.z */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1757z {

                /* JADX INFO: renamed from: e */
                public static final Pattern f11843e = Pattern.compile("^o(\\d+)\\.");

                /* JADX INFO: renamed from: a */
                public final String f11844a;

                /* JADX INFO: renamed from: b */
                public final String f11845b;

                /* JADX INFO: renamed from: c */
                public final URI f11846c;

                /* JADX INFO: renamed from: d */
                public final String f11847d;

                public C1757z(String str) {
                    int i;
/* 10 */            AbstractC1704c.m5462q(str, "The DSN is required.");
/* 13 */            String strTrim = str.trim();
/* 22 */            if (strTrim.isEmpty()) {
/* 449 */               C1951n4.m6859j("The DSN is empty.");
/* 452 */               throw null;
                    }
                    try {
/* 26 */                int iIndexOf = strTrim.indexOf("://");
/* 30 */                if (iIndexOf < 0) {
/* 420 */                   throw new IllegalArgumentException("Invalid DSN: Missing scheme.");
                        }
/* 33 */                String strSubstring = strTrim.substring(0, iIndexOf);
/* 45 */                if (!"http".equalsIgnoreCase(strSubstring) && !"https".equalsIgnoreCase(strSubstring)) {
/* 76 */                    throw new IllegalArgumentException("Invalid DSN: Invalid scheme '" + strSubstring + "'.");
                        }
/* 77 */                int i2 = iIndexOf + 3;
/* 81 */                int iIndexOf2 = strTrim.indexOf(64, i2);
/* 87 */                if (iIndexOf2 < 0) {
/* 412 */                   throw new IllegalArgumentException("Invalid DSN: No public key provided.");
                        }
/* 89 */                String strSubstring2 = strTrim.substring(i2, iIndexOf2);
/* 95 */                int iIndexOf3 = strSubstring2.indexOf(58);
/* 103 */               String strSubstring3 = iIndexOf3 < 0 ? strSubstring2 : strSubstring2.substring(0, iIndexOf3);
/* 107 */               this.f11845b = strSubstring3;
/* 119 */               this.f11844a = iIndexOf3 < 0 ? null : strSubstring2.substring(iIndexOf3 + 1);
/* 125 */               if (strSubstring3.isEmpty()) {
/* 406 */                   throw new IllegalArgumentException("Invalid DSN: No public key provided.");
                        }
/* 127 */               int i3 = iIndexOf2 + 1;
/* 130 */               int iIndexOf4 = strTrim.indexOf(63, i3);
/* 136 */               int iIndexOf5 = strTrim.indexOf(35, i3);
/* 140 */               if (iIndexOf5 >= 0 && (iIndexOf4 < 0 || iIndexOf5 < iIndexOf4)) {
/* 146 */                   iIndexOf4 = iIndexOf5;
                        }
/* 154 */               String strSubstring4 = iIndexOf4 < 0 ? strTrim.substring(i3) : strTrim.substring(i3, iIndexOf4);
/* 160 */               int iIndexOf6 = strSubstring4.indexOf(47);
/* 166 */               if (iIndexOf6 < 0) {
/* 400 */                   throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                        }
/* 168 */               String strSubstring5 = strSubstring4.substring(0, iIndexOf6);
/* 191 */               int iIndexOf7 = strSubstring5.startsWith("[") ? strSubstring5.indexOf(58, strSubstring5.indexOf(93)) : strSubstring5.indexOf(58);
/* 199 */               String strSubstring6 = iIndexOf7 < 0 ? strSubstring5 : strSubstring5.substring(0, iIndexOf7);
/* 203 */               if (iIndexOf7 < 0) {
/* 205 */                   i = -1;
                        } else {
/* 209 */                   String strSubstring7 = strSubstring5.substring(iIndexOf7 + 1);
                            try {
/* 213 */                       i = Integer.parseInt(strSubstring7);
                            } catch (NumberFormatException e) {
/* 394 */                       throw new IllegalArgumentException("Invalid DSN: Invalid port '" + strSubstring7 + "'.", e);
                            }
                        }
/* 206 */               int i4 = i;
/* 218 */               String strSubstring8 = strSubstring4.substring(iIndexOf6);
/* 228 */               if (strSubstring8.contains("//")) {
/* 237 */                   StringBuilder sb = new StringBuilder(strSubstring8.length());
/* 241 */                   char c = 0;
/* 246 */                   for (int i5 = 0; i5 < strSubstring8.length(); i5++) {
/* 248 */                       char cCharAt = strSubstring8.charAt(i5);
/* 252 */                       if (cCharAt != '/' || c != '/') {
/* 257 */                           sb.append(cCharAt);
/* 260 */                           c = cCharAt;
                                }
                            }
/* 264 */                   strSubstring8 = sb.toString();
                        }
/* 279 */               strSubstring8 = strSubstring8.endsWith("/") ? strSubstring8.substring(0, strSubstring8.length() - 1) : strSubstring8;
/* 287 */               int iLastIndexOf = strSubstring8.lastIndexOf(47) + 1;
/* 288 */               String strSubstring9 = strSubstring8.substring(0, iLastIndexOf);
/* 296 */               if (!strSubstring9.endsWith("/")) {
/* 299 */                   strSubstring9 = strSubstring9.concat("/");
                        }
/* 303 */               String strSubstring10 = strSubstring8.substring(iLastIndexOf);
/* 311 */               if (strSubstring10.isEmpty()) {
/* 369 */                   throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                        }
/* 338 */               String str2 = strSubstring6;
/* 343 */               this.f11846c = new URI(strSubstring, null, str2, i4, strSubstring9 + "api/" + strSubstring10, null, null);
/* 347 */               Matcher matcher = f11843e.matcher(str2);
/* 361 */               this.f11847d = matcher.find() ? matcher.group(1) : null;
                    } catch (URISyntaxException e2) {
/* 446 */               throw new IllegalArgumentException("Invalid DSN: " + e2.getMessage(), e2);
                    }
                }
            }
