            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.Intent;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerLib;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.FirebaseMessagingServiceListener;
            import com.google.firebase.messaging.FirebaseMessagingService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1sSDK {
                public final AFc1qSDK getCurrencyIso4217Code;

                public AFg1sSDK(Context context) {
/* 12 */            this.getCurrencyIso4217Code = AFa1ySDK.getRevenue().getMonetizationNetwork(context);
                }

                public static boolean AFAdRevenueData(AFc1qSDK aFc1qSDK) {
/* 4 */             return aFc1qSDK.getMediationNetwork("sentRegisterRequestToAF", false);
                }

                public static boolean getMonetizationNetwork(Context context) {
/* 9 */             if (AppsFlyerLib.getInstance().isStopped()) {
/* 42 */                return false;
                    }
                    try {
/* 12 */                String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
                        return AFj1kSDK.m1829L_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
                    } catch (ClassNotFoundException unused) {
/* 42 */                return false;
                    } catch (Throwable th) {
/* 39 */                AFLogger.INSTANCE.m1811e(AFg1cSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
/* 42 */                return false;
                    }
                }

                public final AFf1aSDK getRevenue() {
                    String string;
                    String string2;
/* 6 */             String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork("afUninstallToken", (String) null);
/* 16 */            long monetizationNetwork2 = this.getCurrencyIso4217Code.getMonetizationNetwork("afUninstallToken_received_time", 0L);
/* 25 */            boolean mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork("afUninstallToken_queued", false);
/* 31 */            this.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_queued", false);
/* 36 */            if (monetizationNetwork == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
/* 48 */                String[] strArrSplit = string2.split(",");
/* 55 */                monetizationNetwork = strArrSplit[strArrSplit.length - 1];
                    }
/* 59 */            if (monetizationNetwork2 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
/* 71 */                String[] strArrSplit2 = string.split(",");
/* 77 */                if (strArrSplit2.length >= 2) {
                            try {
/* 83 */                        monetizationNetwork2 = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
/* 87 */            if (monetizationNetwork != null) {
/* 91 */                return new AFf1aSDK(monetizationNetwork, monetizationNetwork2, mediationNetwork);
                    }
/* 5 */             return null;
                }
            }
