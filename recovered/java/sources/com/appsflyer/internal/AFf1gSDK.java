            package com.appsflyer.internal;

            import com.appsflyer.AppsFlyerConsent;
            import com.appsflyer.AppsFlyerProperties;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            import okhttp3.HttpUrl;
            import p000.nc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1gSDK implements AFf1fSDK {
                private final AFc1eSDK getMediationNetwork;
                private final AppsFlyerProperties getMonetizationNetwork;
                private final AFg1xSDK getRevenue;

                public AFf1gSDK(AFg1xSDK aFg1xSDK, AFc1eSDK aFc1eSDK, AppsFlyerProperties appsFlyerProperties) {
/* 1 */             aFg1xSDK.getClass();
/* 4 */             aFc1eSDK.getClass();
/* 7 */             appsFlyerProperties.getClass();
/* 13 */            this.getRevenue = aFg1xSDK;
/* 15 */            this.getMediationNetwork = aFc1eSDK;
/* 17 */            this.getMonetizationNetwork = appsFlyerProperties;
                }

                @Override // com.appsflyer.internal.AFf1fSDK
                public final void getCurrencyIso4217Code(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
/* 1 */             map.getClass();
/* 4 */             aFe1pSDK.getClass();
/* 9 */             AFf1bSDK mediationNetwork = this.getRevenue.getMediationNetwork();
/* 15 */            AppsFlyerConsent appsFlyerConsent = this.getMediationNetwork.component1;
/* 19 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 24 */            if (appsFlyerConsent != null) {
/* 28 */                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 31 */                Boolean boolIsUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
/* 35 */                if (boolIsUserSubjectToGDPR != null) {
/* 37 */                    linkedHashMap2.put("gdpr_applies", boolIsUserSubjectToGDPR);
                        }
/* 40 */                Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
/* 44 */                if (hasConsentForDataUsage != null) {
/* 48 */                    linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
                        }
/* 51 */                Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
/* 55 */                if (hasConsentForAdsPersonalization != null) {
/* 59 */                    linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
                        }
/* 62 */                Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
/* 66 */                if (hasConsentForAdStorage != null) {
/* 70 */                    linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
                        }
/* 75 */                linkedHashMap.put("manual", linkedHashMap2);
                    }
/* 78 */            if (mediationNetwork != null) {
/* 84 */                boolean z = appsFlyerConsent != null;
/* 87 */                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 98 */                linkedHashMap3.put("policy_version", Integer.valueOf(mediationNetwork.getCurrencyIso4217Code));
/* 109 */               linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(mediationNetwork.AFAdRevenueData));
/* 120 */               linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(mediationNetwork.getRevenue));
/* 125 */               if (z) {
/* 132 */                   linkedHashMap3.put("gdpr_applies", -1);
/* 137 */                   linkedHashMap3.put("tcstring", HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
/* 147 */                   linkedHashMap3.put("gdpr_applies", Integer.valueOf(mediationNetwork.getMediationNetwork));
/* 152 */                   linkedHashMap3.put("tcstring", mediationNetwork.getMonetizationNetwork);
                        }
/* 157 */               linkedHashMap.put("tcf", linkedHashMap3);
                    }
/* 164 */           if (!linkedHashMap.isEmpty()) {
/* 168 */               map.put("consent_data", linkedHashMap);
                    }
/* 173 */           if (aFe1pSDK != AFe1pSDK.CONVERSION || this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
/* 212 */               return;
                    }
/* 185 */           Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(map);
/* 189 */           mediationNetwork2.getClass();
/* 209 */           mediationNetwork2.put("api", nc1.m6963d(new Pair(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
                }
            }
