            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import okhttp3.HttpUrl;
            import p000.b51;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\f\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0012\u0010\r"}, m6176d2 = {"Lcom/appsflyer/internal/AFf1jSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFc1oSDK;", "p0", "Lcom/appsflyer/internal/AFf1hSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFf1hSDK;)V", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrencyIso4217Code", "()J", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "()Z", "Lcom/appsflyer/internal/AFc1oSDK;", "getMonetizationNetwork", "getRevenue", "Lcom/appsflyer/internal/AFf1hSDK;", "getMediationNetwork", "Lp51;", "AFa1vSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class AFf1jSDK {
                private static final long getMonetizationNetwork = 86400;

                /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
                private final AFc1oSDK getMonetizationNetwork;

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                private final p51 getRevenue;

                /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
                private final p51 AFAdRevenueData;

                /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
                private final AFf1hSDK getCurrencyIso4217Code;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFf1jSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02714 extends b51 implements Function0<Boolean> {
                    public C02714() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
/* 17 */                return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFf1jSDK$5 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "getRevenue", "()Ljava/lang/Boolean;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02725 extends b51 implements Function0<Boolean> {
                    public C02725() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
/* 17 */                return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
                    }
                }

                public AFf1jSDK(AFc1oSDK aFc1oSDK, AFf1hSDK aFf1hSDK) {
/* 1 */             aFc1oSDK.getClass();
/* 4 */             aFf1hSDK.getClass();
/* 10 */            this.getMonetizationNetwork = aFc1oSDK;
/* 12 */            this.getCurrencyIso4217Code = aFf1hSDK;
/* 23 */            this.AFAdRevenueData = r51.m8065b(new C02714());
/* 34 */            this.getRevenue = r51.m8065b(new C02725());
                }

                public final boolean AFAdRevenueData() {
                    AFi1xSDK aFi1xSDK;
/* 3 */             AFi1vSDK aFi1vSDK = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
/* 6 */             if (aFi1vSDK == null) {
/* 17 */                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
/* 5 */                 return true;
                    }
/* 21 */            AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
/* 35 */            boolean zAFAdRevenueData = (aFi1zSDK == null || (aFi1xSDK = aFi1zSDK.getMediationNetwork) == null) ? false : aFi1xSDK.AFAdRevenueData();
/* 36 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 40 */            AFf1hSDK aFf1hSDK = this.getCurrencyIso4217Code;
                    return zAFAdRevenueData || jCurrentTimeMillis - aFf1hSDK.getRevenue > TimeUnit.SECONDS.toMillis(aFf1hSDK.getMonetizationNetwork);
                }

                public final long getCurrencyIso4217Code() {
                    Object n42Var;
/* 5 */             String currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
/* 9 */             if (currencyIso4217Code == null) {
/* 72 */                return getMonetizationNetwork;
                    }
                    try {
/* 11 */                m42 m42Var = o42.f14612b;
/* 17 */                n42Var = Long.valueOf(Long.parseLong(currencyIso4217Code));
                    } catch (Throwable th) {
/* 23 */                m42 m42Var2 = o42.f14612b;
/* 27 */                n42Var = new n42(th);
                    }
/* 31 */            Throwable thM7099a = o42.m7099a(n42Var);
/* 35 */            if (thM7099a != null) {
/* 56 */                AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thM7099a.getMessage(), thM7099a);
/* 61 */                n42Var = Long.valueOf(getMonetizationNetwork);
                    }
/* 67 */            return ((Number) n42Var).longValue();
                }

                public final boolean getMediationNetwork() {
/* 9 */             return ((Boolean) this.getRevenue.getValue()).booleanValue();
                }

                public final boolean getMonetizationNetwork() {
/* 9 */             return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
                }
            }
