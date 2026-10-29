            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageItemInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.os.Build;
            import android.os.Bundle;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import java.util.UUID;
            import java.util.concurrent.Executor;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class AFc1oSDK {
                private static String getRevenue = "372";
                private PackageInfo areAllFieldsValid;
                private final Executor component3;
                public final AFc1hSDK getCurrencyIso4217Code;
                public final AFc1qSDK getMediationNetwork;
                public final AFc1eSDK getMonetizationNetwork;
                private Bundle component2 = null;
                public String AFAdRevenueData = HttpUrl.FRAGMENT_ENCODE_SET;

                public AFc1oSDK(AFc1hSDK aFc1hSDK, AFc1qSDK aFc1qSDK, AFc1eSDK aFc1eSDK, Executor executor) {
/* 11 */            this.getCurrencyIso4217Code = aFc1hSDK;
/* 13 */            this.getMediationNetwork = aFc1qSDK;
/* 15 */            this.getMonetizationNetwork = aFc1eSDK;
/* 17 */            this.component3 = executor;
                }

                public static String component4() {
/* 5 */             StringBuilder sb = new StringBuilder("version: 6.17.6 (build ");
/* 10 */            sb.append(getRevenue);
/* 15 */            sb.append(")");
/* 18 */            return sb.toString();
                }

                public final String AFAdRevenueData(Context context) {
                    try {
/* 8 */                 return new AFb1mSDK(context, this.component3).getMediationNetwork();
                    } catch (Throwable th) {
/* 25 */                AFLogger.INSTANCE.m1814e(AFg1cSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th, true, false, false);
/* 28 */                return null;
                    }
                }

                public final String areAllFieldsValid() {
/* 3 */             AFh1rSDK aFh1rSDK = this.getMonetizationNetwork.component3;
/* 18 */            AFb1jSDK aFb1jSDK = aFh1rSDK != null ? new AFb1jSDK(aFh1rSDK.getMonetizationNetwork, aFh1rSDK.component2) : null;
/* 19 */            if (aFb1jSDK != null) {
/* 21 */                return aFb1jSDK.getRevenue;
                    }
/* 5 */             return null;
                }

                public final boolean component2() {
                    return !this.getMonetizationNetwork.AFAdRevenueData();
                }

                public final String component3() {
/* 7 */             String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
/* 11 */            if (string == null) {
/* 15 */                string = getCurrencyIso4217Code("CHANNEL");
                    }
/* 19 */            if (string == null || !string.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 31 */                return string;
                    }
/* 29 */            return null;
                }

                public final String getCurrencyIso4217Code(String str) {
                    Object obj;
                    try {
/* 4 */                 if (this.component2 == null) {
/* 30 */                    this.component2 = ((PackageItemInfo) this.getCurrencyIso4217Code.getMonetizationNetwork.getPackageManager().getApplicationInfo(this.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName(), 128)).metaData;
                        }
/* 35 */                Bundle bundle = this.component2;
/* 37 */                if (bundle == null || (obj = bundle.get(str)) == null) {
/* 1 */                     return null;
                        }
/* 45 */                return obj.toString();
                    } catch (Throwable th) {
/* 55 */                StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
/* 62 */                sb.append(th.getMessage());
/* 69 */                AFLogger.afErrorLog(sb.toString(), th);
/* 1 */                 return null;
                    }
                }

                public final boolean getMediationNetwork(String str) {
/* 1 */             String currencyIso4217Code = getCurrencyIso4217Code(str);
/* 5 */             if (currencyIso4217Code != null) {
/* 7 */                 return Boolean.parseBoolean(currencyIso4217Code);
                    }
/* 12 */            return false;
                }

                public final boolean getMonetizationNetwork(Context context) {
                    try {
                        return (this.getCurrencyIso4217Code.getMonetizationNetwork.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
                    } catch (PackageManager.NameNotFoundException e) {
/* 32 */                AFLogger.INSTANCE.m1811e(AFg1cSDK.PUBLIC_API, "Could not check if app is pre installed", e);
                    }
                }

                public final String getRevenue(String str) {
                    try {
/* 19 */                int identifier = this.getCurrencyIso4217Code.getMonetizationNetwork.getResources().getIdentifier(str, "string", this.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
/* 23 */                if (identifier != 0) {
/* 29 */                    return this.getCurrencyIso4217Code.getMonetizationNetwork.getString(identifier);
                        }
/* 56 */                return null;
                    } catch (Resources.NotFoundException e) {
/* 39 */                StringBuilder sb = new StringBuilder("Could not load string resource!");
/* 46 */                sb.append(e.getMessage());
/* 53 */                AFLogger.afErrorLog(sb.toString(), e);
/* 56 */                return null;
                    }
                }

                /* JADX INFO: renamed from: n_ */
                public final PackageInfo m1787n_() {
/* 3 */             if (this.areAllFieldsValid == null) {
                        try {
/* 5 */                     int i = Build.VERSION.SDK_INT;
/* 7 */                     AFc1hSDK aFc1hSDK = this.getCurrencyIso4217Code;
/* 11 */                    if (i >= 33) {
/* 35 */                        this.areAllFieldsValid = aFc1hSDK.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                            } else {
/* 60 */                        this.areAllFieldsValid = aFc1hSDK.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName(), 0);
                            }
                        } catch (PackageManager.NameNotFoundException e) {
/* 73 */                    AFLogger.INSTANCE.mo1748e(AFg1cSDK.GENERAL, "Exception while trying fo get PackageInfo", e, false, false, true, false);
                        }
                    }
/* 76 */            return this.areAllFieldsValid;
                }

/* 13 */        public static String getMediationNetwork() {
/* 14 */            return UUID.randomUUID().toString();
                }

/* 35 */        public static String getMonetizationNetwork() {
/* 36 */            return "6.17.6";
                }

/* 57 */        public static String getRevenue() {
/* 58 */            return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
                }

/* 72 */        public static String getCurrencyIso4217Code() {
/* 73 */            return String.valueOf(Build.VERSION.SDK_INT);
                }
            }
