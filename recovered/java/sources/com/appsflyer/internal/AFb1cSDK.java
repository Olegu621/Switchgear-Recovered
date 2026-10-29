            package com.appsflyer.internal;

            import android.content.Context;
            import com.appsflyer.AFLogger;
            import com.google.android.gms.appset.AppSet;
            import com.google.android.gms.appset.AppSetIdInfo;
            import com.google.android.gms.tasks.OnSuccessListener;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 46 */    public final class AFb1cSDK implements AFb1hSDK {
                private final AFc1eSDK AFAdRevenueData;
                private final AFf1eSDK getCurrencyIso4217Code;
                private final AFc1hSDK getMonetizationNetwork;

                public AFb1cSDK(AFc1eSDK aFc1eSDK, AFc1hSDK aFc1hSDK, AFf1eSDK aFf1eSDK) {
/* 1 */             aFc1eSDK.getClass();
/* 4 */             aFc1hSDK.getClass();
/* 7 */             aFf1eSDK.getClass();
/* 13 */            this.AFAdRevenueData = aFc1eSDK;
/* 15 */            this.getMonetizationNetwork = aFc1hSDK;
/* 17 */            this.getCurrencyIso4217Code = aFf1eSDK;
                }

                @Override // com.appsflyer.internal.AFb1hSDK
                public final boolean AFAdRevenueData() {
                    return !this.getCurrencyIso4217Code.getCurrencyIso4217Code() && !this.AFAdRevenueData.getMediationNetwork() && AFj1kSDK.getMediationNetwork(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1kSDK.getMonetizationNetwork(this.getMonetizationNetwork.getMonetizationNetwork);
                }

                @Override // com.appsflyer.internal.AFb1hSDK
                public final void getMonetizationNetwork() {
/* 3 */             Context context = this.getMonetizationNetwork.getMonetizationNetwork;
/* 5 */             if (context != null) {
                        try {
/* 24 */                    AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.appsflyer.internal.e
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
/* 1 */                             AFb1cSDK.getMonetizationNetwork(this.f3103a, (AppSetIdInfo) obj);
                                }
                            }).getClass();
                        } catch (Throwable th) {
/* 44 */                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 47 */        public static final void getMonetizationNetwork(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
                    aFb1cSDK.getClass();
/* 48 */            AFc1eSDK aFc1eSDK = aFb1cSDK.AFAdRevenueData;
                    int scope = appSetIdInfo.getScope();
                    String id = appSetIdInfo.getId();
                    id.getClass();
/* 49 */            aFc1eSDK.copydefault = new AFb1gSDK(scope, id);
                }
            }
