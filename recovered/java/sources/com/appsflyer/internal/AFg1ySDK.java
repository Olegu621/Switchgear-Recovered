            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.preference.PreferenceManager;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1ySDK implements AFg1xSDK {
                private final AppsFlyerProperties getMonetizationNetwork;
                private final Context getRevenue;

                public AFg1ySDK(Context context, AppsFlyerProperties appsFlyerProperties) {
/* 1 */             context.getClass();
/* 4 */             appsFlyerProperties.getClass();
/* 10 */            this.getRevenue = context;
/* 12 */            this.getMonetizationNetwork = appsFlyerProperties;
                }

                @Override // com.appsflyer.internal.AFg1xSDK
                public final AFf1bSDK getMediationNetwork() {
                    String string;
/* 14 */            if (!Boolean.parseBoolean(this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
/* 13 */                return null;
                    }
                    try {
/* 19 */                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getRevenue);
/* 26 */                int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
/* 32 */                int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
/* 38 */                int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
/* 44 */                int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
/* 49 */                String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 51 */                if (i == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", HttpUrl.FRAGMENT_ENCODE_SET)) != null) {
/* 62 */                    str = string;
                        }
/* 71 */                return new AFf1bSDK(i3, i, i2, i4, str);
                    } catch (Exception e) {
/* 88 */                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e, false, false, false, false, 120, null);
/* 13 */                return null;
                    }
                }
            }
