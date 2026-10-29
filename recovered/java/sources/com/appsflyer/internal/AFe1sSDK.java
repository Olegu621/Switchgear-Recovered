            package com.appsflyer.internal;

            import com.appsflyer.internal.AFe1oSDK.RunnableC02601;
            import java.util.concurrent.ExecutorService;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.b51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFe1sSDK {
                public final AFc1hSDK AFAdRevenueData;
                private final AFe1oSDK component3;
                private final AFf1eSDK component4;
                private final AFc1oSDK getCurrencyIso4217Code;
                private final AFg1nSDK getMediationNetwork;
                public final AFc1qSDK getMonetizationNetwork;
                private final ExecutorService getRevenue;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1sSDK$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1uSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "getRevenue", "(Lcom/appsflyer/internal/AFe1uSDK;)V"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02641 extends b51 implements Function1<AFe1uSDK, Unit> {
                    public C02641() {
/* 4 */                 super(1);
                    }

                    public final void getRevenue(AFe1uSDK aFe1uSDK) {
/* 1 */                 aFe1uSDK.getClass();
/* 6 */                 if (aFe1uSDK == AFe1uSDK.SUCCESS) {
/* 15 */                    AFe1sSDK.this.getMonetizationNetwork.AFAdRevenueData("didSendRevenueTriggerOnLastBackground", true);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj) {
/* 3 */                 getRevenue((AFe1uSDK) obj);
/* 6 */                 return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1sSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1uSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "(Lcom/appsflyer/internal/AFe1uSDK;)V"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02654 extends b51 implements Function1<AFe1uSDK, Unit> {
                    public static final C02654 getCurrencyIso4217Code = new C02654();

                    public C02654() {
/* 2 */                 super(1);
                    }

                    public final void AFAdRevenueData(AFe1uSDK aFe1uSDK) {
/* 1 */                 aFe1uSDK.getClass();
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj) {
/* 3 */                 AFAdRevenueData((AFe1uSDK) obj);
/* 6 */                 return Unit.f12910a;
                    }
                }

                public AFe1sSDK(AFc1qSDK aFc1qSDK, AFc1hSDK aFc1hSDK, AFc1oSDK aFc1oSDK, ExecutorService executorService, AFg1nSDK aFg1nSDK, AFf1eSDK aFf1eSDK, AFe1oSDK aFe1oSDK) {
/* 1 */             aFc1qSDK.getClass();
/* 4 */             aFc1hSDK.getClass();
/* 7 */             aFc1oSDK.getClass();
/* 10 */            executorService.getClass();
/* 13 */            aFg1nSDK.getClass();
/* 16 */            aFf1eSDK.getClass();
/* 19 */            aFe1oSDK.getClass();
/* 25 */            this.getMonetizationNetwork = aFc1qSDK;
/* 27 */            this.AFAdRevenueData = aFc1hSDK;
/* 29 */            this.getCurrencyIso4217Code = aFc1oSDK;
/* 31 */            this.getRevenue = executorService;
/* 33 */            this.getMediationNetwork = aFg1nSDK;
/* 35 */            this.component4 = aFf1eSDK;
/* 37 */            this.component3 = aFe1oSDK;
                }

                public final void AFAdRevenueData(AFe1rSDK aFe1rSDK, Function1<? super AFe1uSDK, Unit> function1) {
/* 1 */             aFe1rSDK.getClass();
/* 4 */             function1.getClass();
/* 21 */            AFf1wSDK aFf1wSDK = new AFf1wSDK(aFe1rSDK, this.getRevenue, this.getCurrencyIso4217Code, this.AFAdRevenueData, this.getMediationNetwork, this.component4, function1);
/* 24 */            AFe1oSDK aFe1oSDK = this.component3;
/* 33 */            aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new RunnableC02601(aFf1wSDK));
                }

                public final void getMediationNetwork() {
/* 10 */            if (this.getMonetizationNetwork.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1kSDK.getRevenue(this.AFAdRevenueData.getMonetizationNetwork)) {
/* 32 */                return;
                    }
/* 29 */            AFAdRevenueData(AFe1rSDK.AFa1uSDK.INSTANCE, new C02641());
                }
            }
