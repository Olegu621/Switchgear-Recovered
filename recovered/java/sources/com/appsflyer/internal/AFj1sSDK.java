            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ProviderInfo;
            import android.content.pm.ResolveInfo;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CopyOnWriteArrayList;
            import p000.RunnableC0981h7;
            import p000.RunnableC2301vo;
            import p000.RunnableC2558zo;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 42 */    public final class AFj1sSDK {
                public final AFd1zSDK getCurrencyIso4217Code;
                public final CopyOnWriteArrayList<AFj1tSDK> getRevenue = new CopyOnWriteArrayList<>();

                public AFj1sSDK(AFd1zSDK aFd1zSDK) {
/* 11 */            this.getCurrencyIso4217Code = aFd1zSDK;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void AFAdRevenueData(Runnable runnable) {
/* 24 */            AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.FACEBOOK_LITE, runnable, new RunnableC0981h7(4));
/* 29 */            this.getRevenue.add(aFj1ySDK);
/* 40 */            aFj1ySDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void component1(Runnable runnable) {
/* 24 */            AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.INSTAGRAM, runnable, new RunnableC0307s(this, runnable, 0));
/* 29 */            this.getRevenue.add(aFj1ySDK);
/* 40 */            aFj1ySDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void getCurrencyIso4217Code(AFi1aSDK aFi1aSDK, Runnable runnable) {
/* 3 */             AFc1qSDK aFc1qSDKComponent4 = this.getCurrencyIso4217Code.component4();
/* 18 */            int revenue = this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
/* 24 */            boolean mediationNetwork = aFc1qSDKComponent4.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false);
/* 33 */            boolean z = aFi1aSDK.component4 == AFj1tSDK.AFa1tSDK.NOT_STARTED;
/* 36 */            if (revenue == 1) {
/* 38 */                if (z || mediationNetwork) {
/* 42 */                    runnable.run();
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void getMonetizationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
/* 13 */            List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
/* 17 */            if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
/* 137 */               return;
                    }
/* 28 */            ArrayList arrayList = new ArrayList();
/* 31 */            Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
/* 39 */            while (it.hasNext()) {
/* 47 */                ProviderInfo providerInfo = it.next().providerInfo;
/* 49 */                if (providerInfo != null) {
/* 56 */                    arrayList.add(new AFj1uSDK(providerInfo, runnable, aFd1zSDK));
                        } else {
/* 66 */                    AFLogger.INSTANCE.m1817w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                        }
                    }
/* 74 */            if (arrayList.isEmpty()) {
/* 137 */               return;
                    }
/* 78 */            this.getRevenue.addAll(arrayList);
/* 81 */            AFLogger aFLogger = AFLogger.INSTANCE;
/* 83 */            AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
/* 89 */            StringBuilder sb = new StringBuilder("Detected ");
/* 96 */            sb.append(arrayList.size());
/* 101 */           sb.append(" valid preinstall provider(s)");
/* 108 */           aFLogger.m1810d(aFg1cSDK, sb.toString());
/* 111 */           Iterator it2 = arrayList.iterator();
/* 119 */           while (it2.hasNext()) {
/* 133 */               ((AFj1tSDK) it2.next()).getMonetizationNetwork(aFd1zSDK.AFInAppEventParameterName().getMonetizationNetwork);
                    }
                }

                public final boolean getMediationNetwork(AFh1mSDK aFh1mSDK) {
/* 12 */            int revenue = this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
                    return (!this.getCurrencyIso4217Code.component4().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false) && revenue == 1) || (revenue == 1 && !(aFh1mSDK instanceof AFh1kSDK));
                }

                public final void getRevenue(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
/* 14 */            if (aFd1zSDK.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > 0) {
/* 22 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
                    } else {
/* 40 */                aFd1zSDK.getMonetizationNetwork().execute(new RunnableC2301vo(this, context, runnable, aFd1zSDK, 3));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 43 */        public static /* synthetic */ void getRevenue() {
                }

/* 43 */        public final Runnable AFAdRevenueData(AFi1aSDK aFi1aSDK, Runnable runnable) {
/* 44 */            return new RunnableC2558zo(18, this, aFi1aSDK, runnable);
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 44 */        public /* synthetic */ void getRevenue(Runnable runnable) {
/* 46 */            this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new RunnableC0307s(this, runnable, 1));
                }

/* 45 */        public final AFi1aSDK getCurrencyIso4217Code(Runnable runnable) {
/* 46 */            return new AFi1aSDK(new RunnableC0307s(this, runnable, 3), this.getCurrencyIso4217Code.getMonetizationNetwork(), this.getCurrencyIso4217Code.AFAdRevenueData());
                }

/* 46 */        public final void getMediationNetwork(Runnable runnable) {
/* 50 */            this.getRevenue.add(new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.FACEBOOK, runnable, new RunnableC0307s(this, runnable, 2)));
                }

/* 48 */        public final boolean getCurrencyIso4217Code() {
/* 49 */            return this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork("AF_PREINSTALL_DISABLED");
                }

/* 50 */        public final boolean getMediationNetwork() {
/* 51 */            Iterator<AFj1tSDK> it = this.getRevenue.iterator();
                    while (it.hasNext()) {
/* 52 */                if (it.next().component4 == AFj1tSDK.AFa1tSDK.STARTED) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 137 */       public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
                    try {
/* 139 */               if (getMediationNetwork(new AFh1kSDK())) {
/* 140 */                   runnable.run();
                        }
                    } catch (Throwable th) {
/* 141 */               AFLogger.afErrorLog(th.getMessage(), th);
                    }
                }
            }
