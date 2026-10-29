            package com.appsflyer.internal;

            import com.appsflyer.deeplink.DeepLink;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, m6176d2 = {"Lcom/appsflyer/internal/AFa1oSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "Lcom/appsflyer/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "getMonetizationNetwork", "Lcom/appsflyer/deeplink/DeepLink;", "getMediationNetwork", "getCurrencyIso4217Code", "Z", "AFAdRevenueData", "()Z"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 13 */    public final /* data */ class AFa1oSDK {

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                private final boolean getMonetizationNetwork;

                /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
                public final DeepLink getMediationNetwork;

                public /* synthetic */ AFa1oSDK(boolean z, DeepLink deepLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 11 */            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : deepLink);
                }

                /* JADX INFO: renamed from: AFAdRevenueData, reason: from getter */
                public final boolean getGetMonetizationNetwork() {
/* 1 */             return this.getMonetizationNetwork;
                }

                public final boolean equals(Object p0) {
/* 2 */             if (this == p0) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(p0 instanceof AFa1oSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFa1oSDK aFa1oSDK = (AFa1oSDK) p0;
                    return this.getMonetizationNetwork == aFa1oSDK.getMonetizationNetwork && Intrinsics.m6216a(this.getMediationNetwork, aFa1oSDK.getMediationNetwork);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [int] */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v5 */
                public final int hashCode() {
/* 1 */             boolean z = this.getMonetizationNetwork;
                    ?? r0 = z;
/* 3 */             if (z) {
/* 5 */                 r0 = 1;
                    }
/* 6 */             int i = r0 * 31;
/* 8 */             DeepLink deepLink = this.getMediationNetwork;
/* 18 */            return i + (deepLink == null ? 0 : deepLink.hashCode());
                }

                public final String toString() {
/* 28 */            return "DdlResponse(secondPing=" + this.getMonetizationNetwork + ", deepLink=" + this.getMediationNetwork + ")";
                }

/* 14 */        public AFa1oSDK(boolean z, DeepLink deepLink) {
                    this.getMonetizationNetwork = z;
                    this.getMediationNetwork = deepLink;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 15 */        public AFa1oSDK() {
/* 16 */            this(false, null, 3, 0 == true ? 1 : 0);
                }
            }
