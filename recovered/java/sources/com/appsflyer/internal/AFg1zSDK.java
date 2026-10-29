            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.pm.InstallSourceInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import com.appsflyer.AFLogger;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1zSDK {
                private final String AFAdRevenueData;
                private final Map<String, Object> getCurrencyIso4217Code;
                private final PackageManager getMediationNetwork;

                public AFg1zSDK(AFc1hSDK aFc1hSDK, AFc1oSDK aFc1oSDK) {
/* 1 */             aFc1hSDK.getClass();
/* 4 */             aFc1oSDK.getClass();
/* 15 */            this.getCurrencyIso4217Code = new LinkedHashMap();
/* 17 */            Context context = aFc1hSDK.getMonetizationNetwork;
/* 27 */            this.getMediationNetwork = context != null ? context.getPackageManager() : null;
/* 33 */            String packageName = aFc1oSDK.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName();
/* 37 */            packageName.getClass();
/* 40 */            this.AFAdRevenueData = packageName;
                }

                private final Map<String, Object> getRevenue() {
                    InstallSourceInfo installSourceInfo;
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
/* 6 */                 String str = this.AFAdRevenueData;
/* 8 */                 PackageManager packageManager = this.getMediationNetwork;
/* 10 */                if (packageManager == null || (installSourceInfo = packageManager.getInstallSourceInfo(str)) == null) {
/* 62 */                    return linkedHashMap;
                        }
/* 20 */                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 1 */                 String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
/* 29 */                if (initiatingPackageName != null) {
/* 31 */                    linkedHashMap2.put("initiating_package", initiatingPackageName);
                        }
/* 1 */                 String installingPackageName = installSourceInfo.getInstallingPackageName();
/* 45 */                if (installingPackageName != null) {
/* 47 */                    linkedHashMap2.put("installing_package", installingPackageName);
                        }
/* 1 */                 String originatingPackageName = installSourceInfo.getOriginatingPackageName();
/* 56 */                if (originatingPackageName != null) {
/* 58 */                    linkedHashMap2.put("originating_package", originatingPackageName);
                        }
/* 61 */                return linkedHashMap2;
                    } catch (Throwable th) {
/* 76 */                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Failed to get the app install source info", th, true, false, true, true, 16, null);
/* 79 */                return linkedHashMap;
                    }
                }

                public final Map<String, Object> AFAdRevenueData() {
                    String installerPackageName;
/* 7 */             if (this.getCurrencyIso4217Code.isEmpty()) {
                        try {
/* 9 */                     PackageManager packageManager = this.getMediationNetwork;
/* 11 */                    if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFAdRevenueData)) != null) {
/* 25 */                        this.getCurrencyIso4217Code.put("installer_package", installerPackageName);
                            }
                        } catch (Exception e) {
/* 32 */                    AFLogger.afErrorLog("Exception while getting the app's installer package. ", e);
                        }
/* 39 */                if (Build.VERSION.SDK_INT >= 30) {
/* 49 */                    this.getCurrencyIso4217Code.put("install_source_info", getRevenue());
                        }
                    }
/* 52 */            return this.getCurrencyIso4217Code;
                }
            }
