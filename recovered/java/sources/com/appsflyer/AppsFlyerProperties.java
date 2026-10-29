            package com.appsflyer;

            import com.appsflyer.internal.AFc1qSDK;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public class AppsFlyerProperties {
                public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
                public static final String AF_STORE_FROM_API = "api_store_value";
                public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
                public static final String APP_ID = "appid";
                public static final String APP_USER_ID = "AppUserId";
                public static final String CHANNEL = "channel";
                public static final String COLLECT_ANDROID_ID = "collectAndroidId";
                public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
                public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
                public static final String COLLECT_IMEI = "collectIMEI";
                public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
                public static final String COLLECT_OAID = "collectOAID";
                public static final String CURRENCY_CODE = "currencyCode";
                public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
                public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
                public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
                public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
                public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
                public static final String DPM = "disableProxy";
                public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
                public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
                public static final String ENABLE_TCF_DATA_COLLECTION = "enableTCFDataCollection";
                public static final String EXTENSION = "sdkExtension";
                public static final String HTTP_CACHE = "http_cache";
                public static final String IS_UPDATE = "IS_UPDATE";
                public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
                public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
                public static final String ONELINK_DOMAIN = "onelinkDomain";
                public static final String ONELINK_ID = "oneLinkSlug";
                public static final String ONELINK_SCHEME = "onelinkScheme";
                public static final String ONELINK_VERSION = "onelinkVersion";
                public static final String USER_EMAILS = "userEmails";
                public static AppsFlyerProperties instance;
                public boolean getCurrencyIso4217Code;
                private final Map<String, Object> getMediationNetwork = new HashMap();
                private boolean getMonetizationNetwork = false;
                public String getRevenue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum EmailsCryptType {
                    NONE(0),
                    SHA256(3);

                    private final int getMonetizationNetwork;

                    EmailsCryptType(int i) {
/* 4 */                 this.getMonetizationNetwork = i;
                    }

                    public final int getValue() {
/* 1 */                 return this.getMonetizationNetwork;
                    }
                }

                public static AppsFlyerProperties getInstance() {
/* 3 */             if (instance == null) {
/* 10 */                instance = new AppsFlyerProperties();
                    }
/* 12 */            return instance;
                }

                private boolean getMonetizationNetwork() {
/* 1 */             return this.getMonetizationNetwork;
                }

                public boolean getBoolean(String str, boolean z) {
/* 1 */             String string = getString(str);
                    return string == null ? z : Boolean.parseBoolean(string);
                }

                public int getInt(String str, int i) {
/* 1 */             String string = getString(str);
                    return string == null ? i : Integer.parseInt(string);
                }

                public int getLogLevel() {
/* 9 */             return getInt("logLevel", AFLogger.LogLevel.NONE.getLevel());
                }

                public long getLong(String str, long j) {
/* 1 */             String string = getString(str);
                    return string == null ? j : Long.parseLong(string);
                }

                public final boolean getMediationNetwork() {
/* 1 */             return this.getCurrencyIso4217Code;
                }

                public String getReferrer(AFc1qSDK aFc1qSDK) {
/* 1 */             String str = this.getRevenue;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
                    return getString("AF_REFERRER") != null ? getString("AF_REFERRER") : aFc1qSDK.getMonetizationNetwork("referrer", (String) null);
                }

                public synchronized String getString(String str) {
/* 8 */             return (String) this.getMediationNetwork.get(str);
                }

                public boolean isEnableLog() {
                    return getLogLevel() > AFLogger.LogLevel.NONE.getLevel();
                }

                public boolean isLogsDisabledCompletely() {
/* 4 */             return getBoolean(DISABLE_LOGS_COMPLETELY, false);
                }

                public boolean isOtherSdkStringDisabled() {
/* 4 */             return getBoolean(DISABLE_OTHER_SDK, false);
                }

                public synchronized void loadProperties(AFc1qSDK aFc1qSDK) {
                    try {
/* 6 */                 if (getMonetizationNetwork()) {
/* 9 */                     return;
                        }
/* 13 */                String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("savedProperties", (String) null);
/* 17 */                if (monetizationNetwork != null) {
/* 21 */                    AFLogger.afDebugLog("Loading properties..");
                            try {
/* 26 */                        JSONObject jSONObject = new JSONObject(monetizationNetwork);
/* 29 */                        Iterator<String> itKeys = jSONObject.keys();
/* 37 */                        while (itKeys.hasNext()) {
/* 39 */                            String next = itKeys.next();
/* 51 */                            if (this.getMediationNetwork.get(next) == null) {
/* 59 */                                this.getMediationNetwork.put(next, jSONObject.getString(next));
                                    }
                                }
/* 77 */                        String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"};
/* 83 */                        for (int i = 0; i < 5; i++) {
/* 89 */                            this.getMediationNetwork.remove(strArr[i]);
                                }
/* 95 */                        saveProperties(aFc1qSDK);
/* 99 */                        this.getMonetizationNetwork = true;
                            } catch (JSONException e) {
/* 104 */                       AFLogger.afErrorLog("Failed loading properties", e);
                            }
/* 111 */                   StringBuilder sb = new StringBuilder("Done loading properties: ");
/* 116 */                   sb.append(this.getMonetizationNetwork);
/* 123 */                   AFLogger.afDebugLog(sb.toString());
                        }
                    } catch (Throwable th) {
/* 129 */               throw th;
                    }
                }

                public synchronized void remove(String str) {
/* 4 */             this.getMediationNetwork.remove(str);
                }

                public synchronized void saveProperties(AFc1qSDK aFc1qSDK) {
/* 6 */             this.getMediationNetwork.remove("AppsFlyerKey");
/* 22 */            aFc1qSDK.getRevenue("savedProperties", new JSONObject(this.getMediationNetwork).toString());
                }

                public synchronized void set(String str, int i) {
/* 8 */             this.getMediationNetwork.put(str, Integer.toString(i));
                }

                public synchronized void setCustomData(String str) {
/* 6 */             this.getMediationNetwork.put(ADDITIONAL_CUSTOM_DATA, str);
                }

                public synchronized void setUserEmails(String str) {
/* 6 */             this.getMediationNetwork.put(USER_EMAILS, str);
                }

/* 15 */        public synchronized void set(String str, String[] strArr) {
/* 16 */            this.getMediationNetwork.put(str, strArr);
                }

/* 17 */        public synchronized void set(String str, String str2) {
/* 18 */            this.getMediationNetwork.put(str, str2);
                }

/* 19 */        public synchronized void set(String str, long j) {
/* 20 */            this.getMediationNetwork.put(str, Long.toString(j));
                }

/* 21 */        public synchronized void set(String str, boolean z) {
/* 22 */            this.getMediationNetwork.put(str, Boolean.toString(z));
                }
            }
