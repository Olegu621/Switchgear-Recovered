            package com.appsflyer.internal;

            import java.util.List;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 "}, m6176d2 = {"Lcom/appsflyer/internal/AFi1xSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p2", HttpUrl.FRAGMENT_ENCODE_SET, "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AFAdRevenueData", "()Z", "getMediationNetwork", "getCurrencyIso4217Code", "Ljava/lang/String;", "getRevenue", "getMonetizationNetwork", "I", "F", "component4", "Ljava/util/List;", "component1", "J"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class AFi1xSDK {

                /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
                public List<String> component1;

                /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
                public final String getCurrencyIso4217Code;

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                public final String getRevenue;

                /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
                public final float getMonetizationNetwork;

                /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
                public final int AFAdRevenueData;

                /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
                public long component4;

                public AFi1xSDK(long j, float f, List<String> list, int i, String str, String str2) {
/* 1 */             list.getClass();
/* 4 */             str.getClass();
/* 7 */             str2.getClass();
/* 13 */            this.component4 = j;
/* 15 */            this.getMonetizationNetwork = f;
/* 17 */            this.component1 = list;
/* 19 */            this.AFAdRevenueData = i;
/* 21 */            this.getRevenue = str;
/* 23 */            this.getCurrencyIso4217Code = str2;
                }

                public final boolean AFAdRevenueData() {
                    return TimeUnit.SECONDS.toMillis(this.component4) > AFa1ySDK.getRevenue().getMonetizationNetwork().component3().getCurrencyIso4217Code();
                }

                public final boolean equals(Object p0) {
/* 2 */             if (this == p0) {
/* 1 */                 return true;
                    }
/* 20 */            if (!AFi1xSDK.class.equals(p0 != null ? p0.getClass() : null)) {
/* 19 */                return false;
                    }
/* 23 */            p0.getClass();
/* 26 */            AFi1xSDK aFi1xSDK = (AFi1xSDK) p0;
                    return this.component4 == aFi1xSDK.component4 && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.m6216a(this.component1, aFi1xSDK.component1) && this.AFAdRevenueData == aFi1xSDK.AFAdRevenueData && Intrinsics.m6216a(this.getRevenue, aFi1xSDK.getRevenue) && Intrinsics.m6216a(this.getCurrencyIso4217Code, aFi1xSDK.getCurrencyIso4217Code);
                }

                public final int hashCode() {
/* 42 */            return this.getCurrencyIso4217Code.hashCode() + ((this.getRevenue.hashCode() + ((AbstractC0298j.m1861b((Float.hashCode(this.getMonetizationNetwork) + (Long.hashCode(this.component4) * 31)) * 31, 31, this.component1) + this.AFAdRevenueData) * 31)) * 31);
                }
            }
