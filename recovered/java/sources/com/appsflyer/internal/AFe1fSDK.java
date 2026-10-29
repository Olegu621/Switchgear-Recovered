            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.appsflyer.internal.components.network.http.exceptions.HttpException;
            import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
            import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
            import java.io.IOException;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public abstract class AFe1fSDK<Result> extends AFe1mSDK<AFe1wSDK<Result>> {
                public AFe1wSDK<Result> areAllFieldsValid;
                public final AFf1eSDK component1;
                private AFc1tSDK component2;
                protected final AFd1oSDK component3;
                protected final AFd1nSDK component4;
                private String hashCode;

                public AFe1fSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, String str, String str2) {
/* 21 */            this(aFe1pSDK, aFe1pSDKArr, aFd1zSDK.getRevenue(), aFd1zSDK.AFInAppEventType(), aFd1zSDK.copy(), aFd1zSDK.registerClient(), str);
/* 24 */            this.hashCode = str2;
                }

                private void getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) {
/* 1 */             String str = this.hashCode;
/* 26 */            this.hashCode = this.component2.getMediationNetwork(new AFc1uSDK(aFd1bSDK.getMediationNetwork, aFd1bSDK.getRevenue(), "6.17.6", this.getRevenue, aFd1bSDK.AFAdRevenueData));
/* 28 */            if (str != null) {
/* 32 */                this.component2.getRevenue(str);
                    }
                }

                public abstract AFd1hSDK<Result> AFAdRevenueData(String str);

                @Override // com.appsflyer.internal.AFe1mSDK
                public final void AFAdRevenueData(Throwable th) {
                    Throwable th2;
/* 3 */             boolean z = !(th instanceof HttpException);
/* 7 */             if (th instanceof AFe1iSDK) {
/* 17 */                th2 = th;
/* 18 */                AFLogger.INSTANCE.m1813e(AFg1cSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th2, true, false);
                    } else {
/* 22 */                th2 = th;
/* 23 */                AFLogger aFLogger = AFLogger.INSTANCE;
/* 25 */                AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
/* 39 */                aFLogger.m1814e(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th2)), th2, false, false, z);
/* 50 */                aFLogger.m1817w(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th2)));
                    }
/* 53 */            AppsFlyerRequestListener appsFlyerRequestListenerComponent2 = component2();
/* 57 */            if (appsFlyerRequestListenerComponent2 != null) {
/* 59 */                String message = th2.getMessage();
/* 63 */                if (message == null) {
/* 66 */                    message = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 70 */                appsFlyerRequestListenerComponent2.onError(40, message);
                    }
                }

                /* JADX INFO: renamed from: a_ */
                public boolean mo1797a_() {
/* 1 */             return true;
                }

                public abstract AppsFlyerRequestListener component2();

                public abstract boolean copydefault();

                @Override // com.appsflyer.internal.AFe1mSDK
                public final void getMediationNetwork() {
                    String mediationNetwork;
/* 1 */             super.getMediationNetwork();
/* 8 */             if (!copydefault() || (mediationNetwork = this.component1.getMediationNetwork()) == null || mediationNetwork.trim().isEmpty()) {
/* 58 */                return;
                    }
/* 28 */            AFd1hSDK<Result> aFd1hSDKAFAdRevenueData = AFAdRevenueData(mediationNetwork);
/* 32 */            if (aFd1hSDKAFAdRevenueData != null) {
/* 36 */                getCurrencyIso4217Code(aFd1hSDKAFAdRevenueData.getMonetizationNetwork);
                    } else {
/* 55 */                AFLogger.INSTANCE.m1813e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
                    }
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public boolean getMonetizationNetwork() {
/* 8 */             if (component1() instanceof AFe1iSDK) {
/* 7 */                 return false;
                    }
/* 16 */            if (this.getMonetizationNetwork == AFe1uSDK.TIMEOUT) {
/* 15 */                return true;
                    }
/* 19 */            Throwable thComponent1 = component1();
                    return (thComponent1 instanceof IOException) && !(thComponent1 instanceof ParsingException);
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public AFe1uSDK getRevenue() throws Exception {
/* 5 */             if (mo1797a_() && this.component1.getCurrencyIso4217Code()) {
/* 15 */                AppsFlyerRequestListener appsFlyerRequestListenerComponent2 = component2();
/* 19 */                if (appsFlyerRequestListenerComponent2 != null) {
/* 25 */                    appsFlyerRequestListenerComponent2.onError(11, "Skipping event because 'isStopped' is true");
                        }
/* 33 */                throw new AFe1iSDK();
                    }
/* 36 */            String mediationNetwork = this.component1.getMediationNetwork();
/* 40 */            if (mediationNetwork == null || mediationNetwork.trim().isEmpty()) {
/* 169 */               AppsFlyerRequestListener appsFlyerRequestListenerComponent3 = component2();
/* 173 */               if (appsFlyerRequestListenerComponent3 != null) {
/* 179 */                   appsFlyerRequestListenerComponent3.onError(41, "No dev key");
                        }
/* 187 */               throw new AFe1nSDK();
                    }
/* 53 */            AFd1hSDK<Result> aFd1hSDKAFAdRevenueData = AFAdRevenueData(mediationNetwork);
/* 57 */            if (aFd1hSDKAFAdRevenueData == null) {
/* 74 */                AFLogger.INSTANCE.m1813e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
/* 77 */                return AFe1uSDK.FAILURE;
                    }
/* 84 */            if (copydefault()) {
/* 88 */                getCurrencyIso4217Code(aFd1hSDKAFAdRevenueData.getMonetizationNetwork);
                    }
/* 91 */            AFe1wSDK<Result> currencyIso4217Code = aFd1hSDKAFAdRevenueData.getCurrencyIso4217Code();
/* 95 */            this.areAllFieldsValid = currencyIso4217Code;
/* 115 */           this.component3.AFAdRevenueData(aFd1hSDKAFAdRevenueData.getMonetizationNetwork.getMediationNetwork, currencyIso4217Code.getStatusCode(), currencyIso4217Code.getBody().toString());
/* 118 */           AppsFlyerRequestListener appsFlyerRequestListenerComponent4 = component2();
/* 122 */           if (appsFlyerRequestListenerComponent4 != null) {
/* 128 */               if (currencyIso4217Code.isSuccessful()) {
/* 130 */                   appsFlyerRequestListenerComponent4.onSuccess();
                        } else {
/* 138 */                   StringBuilder sb = new StringBuilder("Status code failure ");
/* 145 */                   sb.append(currencyIso4217Code.getStatusCode());
/* 154 */                   appsFlyerRequestListenerComponent4.onError(50, sb.toString());
                        }
                    }
                    return currencyIso4217Code.isSuccessful() ? AFe1uSDK.SUCCESS : AFe1uSDK.FAILURE;
                }

/* 26 */        public AFe1fSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, String str) {
/* 31 */            this(aFe1pSDK, aFe1pSDKArr, aFd1zSDK.getRevenue(), aFd1zSDK.AFInAppEventType(), aFd1zSDK.copy(), aFd1zSDK.registerClient(), str);
                }

/* 31 */        private AFe1fSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1nSDK aFd1nSDK, AFf1eSDK aFf1eSDK, AFd1oSDK aFd1oSDK, AFc1tSDK aFc1tSDK, String str) {
/* 32 */            super(aFe1pSDK, aFe1pSDKArr, str);
/* 33 */            this.component4 = aFd1nSDK;
/* 34 */            this.component1 = aFf1eSDK;
/* 35 */            this.component3 = aFd1oSDK;
/* 36 */            this.component2 = aFc1tSDK;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
/* 35 */        public void getCurrencyIso4217Code() {
                    String str;
/* 37 */            if (this.getMonetizationNetwork == AFe1uSDK.SUCCESS) {
/* 38 */                String str2 = this.hashCode;
                        if (str2 != null) {
/* 39 */                    this.component2.getRevenue(str2);
                            return;
                        }
                        return;
                    }
/* 40 */            if (getMonetizationNetwork() || (str = this.hashCode) == null) {
                        return;
                    }
/* 42 */            this.component2.getRevenue(str);
                }

                @Override // com.appsflyer.internal.AFe1mSDK
/* 73 */        public long AFAdRevenueData() {
/* 74 */            return 60000L;
                }
            }
