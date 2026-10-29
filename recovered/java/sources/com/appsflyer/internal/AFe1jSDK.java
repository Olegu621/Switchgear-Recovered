            package com.appsflyer.internal;

            import android.os.Build;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 70 */    public abstract class AFe1jSDK extends AFe1fSDK<String> {
                private final AFe1pSDK component2;
                private final AFc1qSDK copy;
                private final Map<String, Object> copydefault;
                private final AFc1oSDK equals;
                private final AFg1nSDK hashCode;
                private final AFf1fSDK toString;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFe1jSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, String str, Map<String, ? extends Object> map) {
/* 14 */            super(aFe1pSDK, aFe1pSDKArr, aFd1zSDK, null);
/* 1 */             aFe1pSDK.getClass();
/* 4 */             aFe1pSDKArr.getClass();
/* 7 */             aFd1zSDK.getClass();
/* 10 */            map.getClass();
/* 17 */            this.component2 = aFe1pSDK;
/* 19 */            this.copydefault = map;
/* 21 */            AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
/* 25 */            aFc1oSDKAFAdRevenueData.getClass();
/* 28 */            this.equals = aFc1oSDKAFAdRevenueData;
/* 30 */            AFc1qSDK aFc1qSDKComponent4 = aFd1zSDK.component4();
/* 34 */            aFc1qSDKComponent4.getClass();
/* 37 */            this.copy = aFc1qSDKComponent4;
/* 39 */            AFg1nSDK aFg1nSDKComponent3 = aFd1zSDK.component3();
/* 43 */            aFg1nSDKComponent3.getClass();
/* 46 */            this.hashCode = aFg1nSDKComponent3;
/* 48 */            AFf1fSDK aFf1fSDKAfDebugLog = aFd1zSDK.afDebugLog();
/* 52 */            aFf1fSDKAfDebugLog.getClass();
/* 55 */            this.toString = aFf1fSDKAfDebugLog;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<String> AFAdRevenueData(String str) {
                    AFd1bSDK aFd1bSDK;
/* 1 */             str.getClass();
/* 4 */             Map<String, Object> map = this.copydefault;
/* 6 */             map.getClass();
/* 11 */            Map<String, Object> linkedHashMap = new LinkedHashMap<>(map);
/* 14 */            String currencyIso4217Code = getCurrencyIso4217Code(linkedHashMap);
/* 18 */            String monetizationNetwork = getMonetizationNetwork(linkedHashMap);
/* 24 */            Map<String, Object> linkedHashMap2 = new LinkedHashMap<>(linkedHashMap);
/* 27 */            getMonetizationNetwork(linkedHashMap2, currencyIso4217Code);
/* 32 */            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 37 */            String strAreAllFieldsValid = this.equals.areAllFieldsValid();
/* 41 */            if (strAreAllFieldsValid != null && !StringsKt.m6228D(strAreAllFieldsValid)) {
/* 52 */                linkedHashMap3.put("advertising_id", strAreAllFieldsValid);
                    }
/* 61 */            AFb1jSDK mediationNetwork = AFb1lSDK.getMediationNetwork(this.equals.getCurrencyIso4217Code.getMonetizationNetwork);
/* 65 */            String str2 = null;
/* 71 */            String str3 = mediationNetwork != null ? mediationNetwork.getRevenue : null;
/* 72 */            if (str3 != null && !StringsKt.m6228D(str3)) {
/* 83 */                linkedHashMap3.put("oaid", str3);
                    }
/* 96 */            AFb1jSDK aFb1jSDKM1774l_ = AFb1lSDK.m1774l_(this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getContentResolver());
/* 105 */           String str4 = aFb1jSDKM1774l_ != null ? aFb1jSDKM1774l_.getRevenue : null;
/* 106 */           if (str4 != null && !StringsKt.m6228D(str4)) {
/* 117 */               linkedHashMap3.put("amazon_aid", str4);
                    }
/* 131 */           if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
/* 158 */               linkedHashMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                    } else {
/* 137 */               String monetizationNetwork2 = ((AFe1fSDK) this).component1.getMonetizationNetwork(this.copy);
/* 141 */               if (monetizationNetwork2 != null && !StringsKt.m6228D(monetizationNetwork2)) {
/* 152 */                   linkedHashMap3.put("imei", monetizationNetwork2);
                        }
                    }
/* 165 */           String currencyIso4217Code2 = AFb1kSDK.getCurrencyIso4217Code(this.equals.getMediationNetwork);
/* 169 */           if (currencyIso4217Code2 == null) {
/* 171 */               currencyIso4217Code2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 175 */           linkedHashMap3.put("appsflyer_id", currencyIso4217Code2);
/* 186 */           linkedHashMap3.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
/* 193 */           linkedHashMap3.put("sdk_version", "6.17.6");
/* 196 */           if (monetizationNetwork != null && !StringsKt.m6228D(monetizationNetwork)) {
/* 207 */               linkedHashMap3.put("sdk_connector_version", monetizationNetwork);
                    }
/* 214 */           this.hashCode.getMediationNetwork(linkedHashMap3, this.component2);
/* 219 */           linkedHashMap2.put("device_data", linkedHashMap3);
/* 226 */           this.toString.getCurrencyIso4217Code(linkedHashMap2, this.component2);
/* 229 */           AFd1hSDK<String> revenue = getRevenue(linkedHashMap2, str, currencyIso4217Code);
/* 233 */           if (revenue != null && (aFd1bSDK = revenue.getMonetizationNetwork) != null) {
/* 239 */               str2 = aFd1bSDK.getMediationNetwork;
                    }
/* 241 */           if (str2 != null) {
/* 245 */               JSONObject jSONObject = new JSONObject(linkedHashMap2);
/* 269 */               AFg1aSDK.getRevenue(toString() + ": preparing data: ", jSONObject);
/* 272 */               AFd1oSDK aFd1oSDK = this.component3;
/* 274 */               String string = jSONObject.toString();
/* 278 */               string.getClass();
/* 281 */               aFd1oSDK.getRevenue(str2, string);
                    }
/* 284 */           return revenue;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AppsFlyerRequestListener component2() {
/* 1 */             return null;
                }

                public boolean component3() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 1 */             return true;
                }

                public String getCurrencyIso4217Code(Map<String, Object> map) {
/* 1 */             map.getClass();
/* 4 */             return null;
                }

                public void getMonetizationNetwork(Map<String, Object> map, String str) {
/* 1 */             map.getClass();
/* 16 */            map.put("app_id", this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
/* 19 */            String revenue = AFc1oSDK.getRevenue();
/* 23 */            if (revenue != null) {
/* 27 */                map.put("cuid", revenue);
                    }
/* 40 */            map.put("app_version_name", this.equals.m1787n_().versionName);
/* 47 */            if (component3()) {
/* 61 */                map.put("event_timestamp", Long.valueOf(this.hashCode.getCurrencyIso4217Code()));
                    }
/* 64 */            if (str != null) {
/* 68 */                map.put("billing_lib_version", str);
                    }
                }

                public abstract AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2);

/* 71 */        public String getMonetizationNetwork(Map<String, Object> map) {
/* 72 */            map.getClass();
                    return null;
                }
            }
