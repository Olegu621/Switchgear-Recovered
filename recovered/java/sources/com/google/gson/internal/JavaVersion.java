            package com.google.gson.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class JavaVersion {
                private static final int majorJavaVersion = determineMajorJavaVersion();

                private JavaVersion() {
                }

                private static int determineMajorJavaVersion() {
/* 7 */             return getMajorJavaVersion(System.getProperty("java.version"));
                }

                private static int extractBeginningInt(String str) {
                    try {
/* 3 */                 StringBuilder sb = new StringBuilder();
/* 11 */                for (int i = 0; i < str.length(); i++) {
/* 13 */                    char cCharAt = str.charAt(i);
/* 21 */                    if (!Character.isDigit(cCharAt)) {
                                break;
                            }
/* 23 */                    sb.append(cCharAt);
                        }
/* 33 */                return Integer.parseInt(sb.toString());
                    } catch (NumberFormatException unused) {
/* 38 */                return -1;
                    }
                }

                public static int getMajorJavaVersion(String str) {
/* 1 */             int dotted = parseDotted(str);
/* 6 */             if (dotted == -1) {
/* 8 */                 dotted = extractBeginningInt(str);
                    }
/* 12 */            if (dotted == -1) {
/* 14 */                return 6;
                    }
/* 16 */            return dotted;
                }

                public static boolean isJava9OrLater() {
                    return majorJavaVersion >= 9;
                }

                private static int parseDotted(String str) {
                    try {
/* 3 */                 String[] strArrSplit = str.split("[._]");
/* 10 */                int i = Integer.parseInt(strArrSplit[0]);
                        return (i != 1 || strArrSplit.length <= 1) ? i : Integer.parseInt(strArrSplit[1]);
                    } catch (NumberFormatException unused) {
/* 28 */                return -1;
                    }
                }

/* 16 */        public static int getMajorJavaVersion() {
/* 17 */            return majorJavaVersion;
                }
            }
