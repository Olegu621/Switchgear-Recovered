            package com.appsflyer.internal;

            import com.appsflyer.deeplink.DeepLink;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFa1pSDK implements AFe1zSDK<AFa1oSDK> {
                @Override // com.appsflyer.internal.AFe1zSDK
                public final /* synthetic */ AFa1oSDK getRevenue(String str) throws JSONException {
                    JSONObject jSONObjectOptJSONObject;
/* 2 */             DeepLink mediationNetwork = null;
/* 3 */             if (str == null || str.length() == 0) {
/* 60 */                return new AFa1oSDK(false, null, 3, null);
                    }
/* 14 */            JSONObject jSONObject = new JSONObject(str);
/* 19 */            boolean zOptBoolean = jSONObject.optBoolean("found", false);
/* 26 */            boolean zOptBoolean2 = jSONObject.optBoolean("is_second_ping", true);
/* 30 */            if (zOptBoolean && (jSONObjectOptJSONObject = jSONObject.optJSONObject("click_event")) != null) {
/* 40 */                mediationNetwork = DeepLink.getMediationNetwork(jSONObjectOptJSONObject);
/* 48 */                mediationNetwork.AFAdRevenueData.put("is_deferred", true);
                    }
/* 53 */            return new AFa1oSDK(zOptBoolean2, mediationNetwork);
                }
            }
