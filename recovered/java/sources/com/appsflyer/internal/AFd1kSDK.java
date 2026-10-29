            package com.appsflyer.internal;

            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00168\u0017X\u0097D¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a"}, m6176d2 = {"Lcom/appsflyer/internal/AFd1kSDK;", "Lcom/appsflyer/internal/AFc1dSDK;", "Lcom/appsflyer/internal/AFc1oSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p2", HttpUrl.FRAGMENT_ENCODE_SET, "p3", "<init>", "(Lcom/appsflyer/internal/AFc1oSDK;[BLjava/util/Map;I)V", "AFAdRevenueData", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1jSDK;", "component4", "Lcom/appsflyer/internal/AFd1jSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFd1jSDK;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFc1oSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Z", "getRevenue", "()Z", "()Ljava/lang/String;", "getMonetizationNetwork"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 17 */    public final class AFd1kSDK extends AFc1dSDK {

                /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
                private final AFd1jSDK getCurrencyIso4217Code;

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                private final boolean AFAdRevenueData;
                public AFc1oSDK getMediationNetwork;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr) {
/* 15 */            this(aFc1oSDK, bArr, null, 0, 12, null);
/* 1 */             aFc1oSDK.getClass();
/* 4 */             bArr.getClass();
                }

                @Override // com.appsflyer.internal.AFc1dSDK
                public final String AFAdRevenueData(String str) {
/* 1 */             str.getClass();
/* 14 */            return "[RD]: " + str;
                }

                @Override // com.appsflyer.internal.AFc1dSDK
                public final String getCurrencyIso4217Code() {
/* 7 */             AFj1cSDK aFj1cSDK = new AFj1cSDK(this.getMediationNetwork, null, 2, null);
/* 18 */            return aFj1cSDK.getMediationNetwork(aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component3));
                }

                @Override // com.appsflyer.internal.AFc1dSDK
                /* JADX INFO: renamed from: getMediationNetwork, reason: from getter */
                public final AFd1jSDK getGetCurrencyIso4217Code() {
/* 1 */             return this.getCurrencyIso4217Code;
                }

                @Override // com.appsflyer.internal.AFc1dSDK
                /* JADX INFO: renamed from: getRevenue, reason: from getter */
                public final boolean getAFAdRevenueData() {
/* 1 */             return this.AFAdRevenueData;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        private AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr, Map<String, String> map, int i) {
/* 19 */            super(bArr, map, i);
                    aFc1oSDK.getClass();
                    bArr.getClass();
/* 20 */            this.getMediationNetwork = aFc1oSDK;
/* 21 */            this.getCurrencyIso4217Code = AFd1jSDK.OCTET_STREAM;
                }

/* 21 */        public /* synthetic */ AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 22 */            this(aFc1oSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? 2000 : i);
                }
            }
