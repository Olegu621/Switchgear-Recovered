            package com.google.gson.internal;

            import java.text.DateFormat;
            import java.text.SimpleDateFormat;
            import java.util.Locale;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PreJava9DateFormatProvider {
                private static String getDateFormatPattern(int i) {
/* 1 */             if (i == 0) {
/* 32 */                return "EEEE, MMMM d, y";
                    }
/* 4 */             if (i == 1) {
/* 29 */                return "MMMM d, y";
                    }
/* 7 */             if (i == 2) {
/* 26 */                return "MMM d, y";
                    }
/* 10 */            if (i == 3) {
/* 12 */                return "M/d/yy";
                    }
/* 21 */            C1951n4.m6859j(fm0.m3781g(i, "Unknown DateFormat style: "));
/* 24 */            return null;
                }

                private static String getDatePartOfDateTimePattern(int i) {
/* 1 */             if (i == 0) {
/* 32 */                return "EEEE, MMMM d, yyyy";
                    }
/* 4 */             if (i == 1) {
/* 29 */                return "MMMM d, yyyy";
                    }
/* 7 */             if (i == 2) {
/* 26 */                return "MMM d, yyyy";
                    }
/* 10 */            if (i == 3) {
/* 12 */                return "M/d/yy";
                    }
/* 21 */            C1951n4.m6859j(fm0.m3781g(i, "Unknown DateFormat style: "));
/* 24 */            return null;
                }

                private static String getTimePartOfDateTimePattern(int i) {
/* 1 */             if (i == 0 || i == 1) {
/* 29 */                return "h:mm:ss a z";
                    }
/* 7 */             if (i == 2) {
/* 26 */                return "h:mm:ss a";
                    }
/* 10 */            if (i == 3) {
/* 12 */                return "h:mm a";
                    }
/* 21 */            C1951n4.m6859j(fm0.m3781g(i, "Unknown DateFormat style: "));
/* 24 */            return null;
                }

                public static DateFormat getUSDateFormat(int i) {
/* 9 */             return new SimpleDateFormat(getDateFormatPattern(i), Locale.US);
                }

                public static DateFormat getUSDateTimeFormat(int i, int i2) {
/* 33 */            return new SimpleDateFormat(getDatePartOfDateTimePattern(i) + " " + getTimePartOfDateTimePattern(i2), Locale.US);
                }
            }
