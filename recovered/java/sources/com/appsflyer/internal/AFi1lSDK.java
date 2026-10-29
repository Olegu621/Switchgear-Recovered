            package com.appsflyer.internal;

            import android.app.Activity;
            import android.net.Uri;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 26 */    public final class AFi1lSDK implements AFi1oSDK {
                private String getCurrencyIso4217Code;

                private static String AFAdRevenueData(Activity activity) {
/* 10 */            Uri uriM1775k_ = AFb1qSDK.m1775k_(activity != null ? activity.getIntent() : null);
/* 21 */            String string = uriM1775k_ != null ? uriM1775k_.toString() : null;
/* 22 */            if (string == null) {
/* 24 */                string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 30 */            if (getMediationNetwork(string)) {
/* 1 */                 return null;
                    }
/* 33 */            return string;
                }

                @Override // com.appsflyer.internal.AFi1oSDK
                public final String getMediationNetwork(Activity activity) {
/* 16 */            Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
/* 19 */            String string = referrer != null ? referrer.toString() : null;
                    return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
                }

                @Override // com.appsflyer.internal.AFi1oSDK
                public final void getMonetizationNetwork(Activity activity) {
/* 1 */             activity.getClass();
/* 4 */             String str = this.getCurrencyIso4217Code;
/* 6 */             if (str == null || str.length() == 0) {
/* 20 */                this.getCurrencyIso4217Code = AFAdRevenueData(activity);
                    }
                }

                @Override // com.appsflyer.internal.AFi1oSDK
                public final String getRevenue(Activity activity) {
/* 1 */             String str = this.getCurrencyIso4217Code;
/* 4 */             this.getCurrencyIso4217Code = null;
                    return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
                }

/* 27 */        private static boolean getMediationNetwork(String str) {
/* 29 */            return C1852e.m6263m(str, "android-app://", false);
                }
            }
