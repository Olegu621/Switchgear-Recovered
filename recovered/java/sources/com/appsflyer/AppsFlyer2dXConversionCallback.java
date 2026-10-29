            package com.appsflyer;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.deeplink.DeepLinkListener;
            import com.appsflyer.deeplink.DeepLinkResult;
            import com.appsflyer.internal.AFg1cSDK;
            import com.appsflyer.share.LinkGenerator;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.Map;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
                private void getCurrencyIso4217Code(String str, String str2) {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 10 */                jSONObject.put(NotificationCompat.CATEGORY_STATUS, "failure");
/* 15 */                jSONObject.put(SharedDataContentProvider.BASE_PATH, str2);
/* 18 */                int iHashCode = str.hashCode();
/* 25 */                if (iHashCode == -1390007222) {
/* 51 */                    if (str.equals("onAttributionFailure")) {
/* 53 */                        onAttributionFailureNative(jSONObject);
                            }
                        } else if (iHashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
/* 41 */                    onInstallConversionFailureNative(jSONObject);
                        }
                    } catch (JSONException e) {
/* 68 */                AFLogger.INSTANCE.m1813e(AFg1cSDK.OTHER, "2dx error", e, false, false);
                    }
                }

                @Override // com.appsflyer.AppsFlyerConversionListener
                public void onAppOpenAttribution(Map<String, String> map) {
/* 1 */             onAppOpenAttributionNative(map);
                }

                public native void onAppOpenAttributionNative(Object obj);

                @Override // com.appsflyer.AppsFlyerConversionListener
                public void onAttributionFailure(String str) {
/* 3 */             getCurrencyIso4217Code("onInstallConversionFailure", str);
                }

                public native void onAttributionFailureNative(Object obj);

                @Override // com.appsflyer.AppsFlyerConversionListener
                public void onConversionDataFail(String str) {
/* 3 */             getCurrencyIso4217Code("onAttributionFailure", str);
                }

                @Override // com.appsflyer.AppsFlyerConversionListener
                public void onConversionDataSuccess(Map<String, Object> map) {
/* 1 */             onInstallConversionDataLoadedNative(map);
                }

                @Override // com.appsflyer.deeplink.DeepLinkListener
                public void onDeepLinking(DeepLinkResult deepLinkResult) {
/* 1 */             onDeepLinkingNative(deepLinkResult);
                }

                public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

                public native void onInstallConversionDataLoadedNative(Object obj);

                public native void onInstallConversionFailureNative(Object obj);

                @Override // com.appsflyer.share.LinkGenerator.ResponseListener
                public void onResponse(String str) {
/* 1 */             onResponseNative(str);
                }

                @Override // com.appsflyer.share.LinkGenerator.ResponseListener
                public void onResponseError(String str) {
/* 1 */             onResponseErrorNative(str);
                }

                public native void onResponseErrorNative(String str);

                public native void onResponseNative(String str);
            }
