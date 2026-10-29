            package com.appsflyer.internal;

            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFd1eSDK implements AFe1zSDK<Map<String, String>> {
                @Override // com.appsflyer.internal.AFe1zSDK
                public final /* synthetic */ Map<String, String> getRevenue(String str) throws JSONException {
/* 3 */             HashMap map = new HashMap();
/* 14 */            if (!str.trim().isEmpty()) {
/* 18 */                JSONObject jSONObject = new JSONObject(str);
/* 21 */                Iterator<String> itKeys = jSONObject.keys();
/* 29 */                while (itKeys.hasNext()) {
/* 31 */                    String next = itKeys.next();
/* 41 */                    map.put(next, jSONObject.optString(next));
                        }
                    }
/* 45 */            return map;
                }
            }
