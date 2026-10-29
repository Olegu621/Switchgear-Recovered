            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFd1iSDK implements AFe1zSDK<Map<String, Object>> {
                public static Map<String, Object> getMediationNetwork(String str) throws JSONException {
                    try {
/* 3 */                 HashMap map = new HashMap();
/* 8 */                 JSONObject jSONObject = new JSONObject(str);
/* 11 */                Iterator<String> itKeys = jSONObject.keys();
/* 19 */                while (itKeys.hasNext()) {
/* 21 */                    String next = itKeys.next();
/* 39 */                    map.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                        }
/* 47 */                map.remove("is_cache");
/* 50 */                return map;
                    } catch (JSONException e) {
/* 53 */                AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", e);
/* 58 */                HashMap map2 = new HashMap();
/* 63 */                map2.put("string_response", str);
/* 66 */                return map2;
                    }
                }

                @Override // com.appsflyer.internal.AFe1zSDK
                public final /* synthetic */ Map<String, Object> getRevenue(String str) throws JSONException {
/* 1 */             return getMediationNetwork(str);
                }
            }
