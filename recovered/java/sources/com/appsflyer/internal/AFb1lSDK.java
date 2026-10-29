            package com.appsflyer.internal;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.os.Build;
            import android.provider.Settings;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.oaid.OaidClient;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 92 */    public final class AFb1lSDK {
                public static Boolean AFAdRevenueData;
                public static String getMonetizationNetwork;

                /* JADX WARN: Code duplicated, block: B:25:0x004c  */
                public static AFb1jSDK getMediationNetwork(Context context) {
                    Boolean lat;
/* 1 */             AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
/* 5 */             String str = getMonetizationNetwork;
/* 12 */            boolean z = str != null;
/* 14 */            if (z) {
/* 16 */                lat = null;
                    } else {
/* 18 */                Boolean bool = AFAdRevenueData;
/* 20 */                if ((bool == null || !bool.booleanValue()) && !(AFAdRevenueData == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
/* 77 */                    lat = null;
/* 78 */                    str = null;
                        } else {
                            try {
/* 42 */                        OaidClient oaidClient = new OaidClient(context);
/* 49 */                        oaidClient.setLogging(appsFlyerProperties.isEnableLog());
/* 52 */                        OaidClient.Info infoFetch = oaidClient.fetch();
/* 56 */                        if (infoFetch != null) {
/* 58 */                            String id = infoFetch.getId();
                                    try {
/* 62 */                                lat = infoFetch.getLat();
/* 66 */                                str = id;
                                    } catch (Throwable unused) {
/* 68 */                                str = id;
/* 73 */                                AFLogger.afDebugLog("No OAID library");
/* 16 */                                lat = null;
                                    }
                                } else {
/* 77 */                            lat = null;
/* 78 */                            str = null;
                                }
                            } catch (Throwable unused2) {
/* 70 */                        str = null;
                            }
                        }
                    }
/* 79 */            if (str == null) {
/* 13 */                return null;
                    }
/* 83 */            AFb1jSDK aFb1jSDK = new AFb1jSDK(str, lat);
/* 90 */            aFb1jSDK.getMonetizationNetwork = Boolean.valueOf(z);
/* 92 */            return aFb1jSDK;
                }

                /* JADX INFO: renamed from: l_ */
                public static AFb1jSDK m1774l_(ContentResolver contentResolver) {
                    String string;
/* 6 */             if (!getMediationNetwork() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
/* 5 */                 return null;
                    }
/* 37 */            int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
/* 43 */            if (i == 0) {
/* 53 */                return new AFb1jSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
                    }
/* 57 */            if (i == 2) {
/* 5 */                 return null;
                    }
                    try {
/* 60 */                string = Settings.Secure.getString(contentResolver, "advertising_id");
                    } catch (Throwable th) {
/* 68 */                AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
/* 71 */                string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 77 */            return new AFb1jSDK(string, Boolean.TRUE);
                }

/* 93 */        private static boolean getMediationNetwork() {
/* 94 */            Boolean bool = AFAdRevenueData;
                    return bool == null || bool.booleanValue();
                }
            }
