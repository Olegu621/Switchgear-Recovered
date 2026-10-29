            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.io.UnsupportedEncodingException;
            import java.net.URLEncoder;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1fSDK {
                public static Map<String, String> getRevenue(Map<String, String> map) {
/* 5 */             HashMap map2 = new HashMap();
/* 20 */            for (Map.Entry<String, String> entry : map.entrySet()) {
                        try {
/* 48 */                    map2.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
                        } catch (UnsupportedEncodingException e) {
/* 55 */                    AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
                        }
                    }
/* 59 */            return map2;
                }
            }
