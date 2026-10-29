            package com.google.android.recaptcha.internal;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzot {
                public static Object zza(Object obj, String str) {
/* 1 */             if (obj != null) {
/* 3 */                 return obj;
                    }
/* 10 */            C1951n4.m6868s(str.concat(" must not be null"));
/* 13 */            return null;
                }

                public static String zzb(String str) {
/* 6 */             if (str.isEmpty()) {
/* 75 */                C1951n4.m6859j("identifier must not be empty");
/* 5 */                 return null;
                    }
/* 17 */            if (!zzc(str.charAt(0))) {
/* 69 */                C1951n4.m6859j("identifier must start with an ASCII letter: ".concat(str));
/* 5 */                 return null;
                    }
/* 24 */            for (int i = 1; i < str.length(); i++) {
/* 26 */                char cCharAt = str.charAt(i);
/* 34 */                if (!zzc(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
/* 55 */                    C1951n4.m6859j("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
/* 5 */                     return null;
                        }
                    }
/* 62 */            return str;
                }

                private static boolean zzc(char c) {
/* 4 */             if (c < 'a' || c > 'z') {
                        return c >= 'A' && c <= 'Z';
                    }
/* 3 */             return true;
                }
            }
