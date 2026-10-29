            package com.appsflyer.share;

            import android.content.Context;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerLib;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.internal.AFa1ySDK;
            import com.appsflyer.internal.AFd1zSDK;
            import com.appsflyer.internal.AFe1dSDK;
            import com.appsflyer.internal.AFe1oSDK;
            import com.appsflyer.internal.AFe1oSDK.RunnableC02601;
            import com.appsflyer.internal.AFg1cSDK;
            import com.appsflyer.internal.AFk1uSDK;
            import com.appsflyer.internal.AFk1vSDK;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 82 */    public class CrossPromotionHelper {
                private static String AFAdRevenueData = "https://%simpression.%s";

                private static void AFAdRevenueData(String str, Context context, AFk1vSDK aFk1vSDK) {
/* 1 */             AFa1ySDK revenue = AFa1ySDK.getRevenue();
/* 5 */             revenue.AFAdRevenueData(context);
/* 8 */             AFd1zSDK monetizationNetwork = revenue.getMonetizationNetwork();
/* 14 */            AFe1dSDK aFe1dSDK = new AFe1dSDK(monetizationNetwork, str, aFk1vSDK);
/* 17 */            AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
/* 28 */            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(aFe1dSDK));
                }

                private static LinkGenerator getMonetizationNetwork(Context context, String str, String str2, Map<String, String> map, String str3) {
/* 5 */             LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
/* 8 */             linkGenerator.AFAdRevenueData = str3;
/* 10 */            linkGenerator.getMonetizationNetwork = str;
/* 18 */            linkGenerator.addParameter("af_siteid", context.getPackageName());
/* 21 */            if (str2 != null) {
/* 23 */                linkGenerator.setCampaign(str2);
                    }
/* 26 */            if (map != null) {
/* 28 */                linkGenerator.addParameters(map);
                    }
/* 31 */            return linkGenerator;
                }

                public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
/* 27 */            LinkGenerator monetizationNetwork = getMonetizationNetwork(context, str, str2, map, String.format(AFk1uSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()));
/* 43 */            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
/* 51 */                AFLogger.INSTANCE.mo1749i(AFg1cSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
/* 54 */                return;
                    }
/* 63 */            if (AppsFlyerLib.getInstance().isStopped()) {
/* 71 */                AFLogger.INSTANCE.mo1749i(AFg1cSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
/* 74 */                return;
                    }
/* 75 */            if (map == null) {
/* 79 */                map = new HashMap<>();
                    }
/* 84 */            map.put("af_campaign", str2);
/* 93 */            AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
/* 105 */           AFAdRevenueData(monetizationNetwork.generateLink(), context, new AFk1vSDK(context));
                }

                public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
/* 13 */            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
/* 21 */                AFLogger.INSTANCE.mo1749i(AFg1cSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
                    } else if (AppsFlyerLib.getInstance().isStopped()) {
/* 41 */                AFLogger.INSTANCE.mo1749i(AFg1cSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
                    } else {
/* 80 */                AFAdRevenueData(getMonetizationNetwork(context, str, str2, map, String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName())).generateLink(), context, null);
                    }
                }

                public static void setUrl(Map<String, String> map) {
/* 13 */            for (Map.Entry<String, String> entry : map.entrySet()) {
/* 21 */                String value = entry.getValue();
/* 27 */                String key = entry.getKey();
/* 33 */                key.getClass();
/* 42 */                if (key.equals("app")) {
/* 56 */                    AFk1uSDK.getCurrencyIso4217Code = value;
                        } else if (key.equals("impression")) {
/* 53 */                    AFAdRevenueData = value;
                        }
                    }
                }

/* 83 */        public static void logCrossPromoteImpression(Context context, String str, String str2) {
/* 84 */            logCrossPromoteImpression(context, str, str2, null);
                }

/* 108 */       public static void logAndOpenStore(Context context, String str, String str2) {
/* 109 */           logAndOpenStore(context, str, str2, null);
                }
            }
