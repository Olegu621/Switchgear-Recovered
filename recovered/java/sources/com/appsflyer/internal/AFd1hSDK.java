            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
            import java.io.IOException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.atomic.AtomicBoolean;
            import org.json.JSONException;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFd1hSDK<ResponseBody> {
                private final AFd1gSDK AFAdRevenueData;
                private final ExecutorService getCurrencyIso4217Code;
                private final AtomicBoolean getMediationNetwork = new AtomicBoolean(false);
                public final AFd1bSDK getMonetizationNetwork;
                private final AFe1zSDK<ResponseBody> getRevenue;

                public AFd1hSDK(AFd1bSDK aFd1bSDK, ExecutorService executorService, AFd1gSDK aFd1gSDK, AFe1zSDK<ResponseBody> aFe1zSDK) {
/* 12 */            this.getMonetizationNetwork = aFd1bSDK;
/* 14 */            this.getCurrencyIso4217Code = executorService;
/* 16 */            this.AFAdRevenueData = aFd1gSDK;
/* 18 */            this.getRevenue = aFe1zSDK;
                }

                public final AFe1wSDK<ResponseBody> getCurrencyIso4217Code() throws IOException {
/* 8 */             if (this.getMediationNetwork.getAndSet(true)) {
/* 63 */                f42.m3656l("Http call is already executed");
/* 66 */                return null;
                    }
/* 14 */            AFe1wSDK<String> currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code(this.getMonetizationNetwork);
                    try {
/* 40 */                return new AFe1wSDK<>(this.getRevenue.getRevenue(currencyIso4217Code.getBody()), currencyIso4217Code.getCurrencyIso4217Code, currencyIso4217Code.getRevenue, currencyIso4217Code.AFAdRevenueData, currencyIso4217Code.getMonetizationNetwork);
                    } catch (JSONException e) {
/* 48 */                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
/* 60 */                throw new ParsingException(e.getMessage(), e, currencyIso4217Code);
                    }
                }
            }
