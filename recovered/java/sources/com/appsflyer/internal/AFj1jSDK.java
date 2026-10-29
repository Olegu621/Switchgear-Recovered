            package com.appsflyer.internal;

            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Locale;
            import java.util.TimeZone;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1jSDK {
                public static Date getMonetizationNetwork(String str, String str2) {
                    try {
/* 5 */                 SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
/* 14 */                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 17 */                return simpleDateFormat.parse(str);
                    } catch (Throwable unused) {
/* 22 */                return null;
                    }
                }
            }
