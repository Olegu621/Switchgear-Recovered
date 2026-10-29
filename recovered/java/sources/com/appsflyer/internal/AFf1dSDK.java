            package com.appsflyer.internal;

            import android.content.Context;
            import com.appsflyer.lvl.AppsFlyerLVL;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1dSDK {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface AFa1tSDK {
                    void getMonetizationNetwork(String str, String str2);

                    void getRevenue(String str, Exception exc);
                }

                public final boolean getRevenue(long j, Context context, final AFa1tSDK aFa1tSDK) {
                    try {
/* 6 */                 AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFf1dSDK.3
                            @Override // com.appsflyer.lvl.AppsFlyerLVL.resultListener
                            public final void onLvlFailure(Exception exc) {
/* 5 */                         aFa1tSDK.getRevenue("onLvlFailure with exception", exc);
                            }

                            @Override // com.appsflyer.lvl.AppsFlyerLVL.resultListener
                            public final void onLvlResult(String str, String str2) {
/* 1 */                         if (str != null && str2 != null) {
/* 7 */                             aFa1tSDK.getMonetizationNetwork(str, str2);
/* 10 */                            return;
                                }
/* 11 */                        AFa1tSDK aFa1tSDK2 = aFa1tSDK;
/* 15 */                        if (str2 == null) {
/* 24 */                            aFa1tSDK2.getRevenue("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                                } else {
/* 35 */                            aFa1tSDK2.getRevenue("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                                }
                            }
                        });
/* 9 */                 return true;
                    } catch (Throwable unused) {
/* 11 */                return false;
                    }
                }
            }
