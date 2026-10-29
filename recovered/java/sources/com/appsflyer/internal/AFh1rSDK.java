            package com.appsflyer.internal;

            import java.util.HashMap;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, m6176d2 = {"Lcom/appsflyer/internal/AFh1rSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "p1", "p2", "p3", "p4", "p5", "p6", HttpUrl.FRAGMENT_ENCODE_SET, "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMonetizationNetwork", "component3", "getMediationNetwork", "AFAdRevenueData", "Ljava/lang/Boolean;", "getRevenue", "component2", "component1", "Ljava/util/Map;", "areAllFieldsValid"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 48 */    public final /* data */ class AFh1rSDK {
                public Boolean AFAdRevenueData;
                public Map<String, Object> component1;

                /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
                public Boolean areAllFieldsValid;

                /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
                public String getMediationNetwork;

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                public String getMonetizationNetwork;

                /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
                public Boolean getRevenue;

                /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
                public Boolean getCurrencyIso4217Code;

                /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
                public Boolean component2;

                public /* synthetic */ AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 46 */            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? new HashMap() : map);
                }

                public final boolean equals(Object p0) {
/* 2 */             if (this == p0) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(p0 instanceof AFh1rSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFh1rSDK aFh1rSDK = (AFh1rSDK) p0;
                    return Intrinsics.m6216a(this.getMonetizationNetwork, aFh1rSDK.getMonetizationNetwork) && Intrinsics.m6216a(this.component2, aFh1rSDK.component2) && Intrinsics.m6216a(this.AFAdRevenueData, aFh1rSDK.AFAdRevenueData) && Intrinsics.m6216a(this.getRevenue, aFh1rSDK.getRevenue) && Intrinsics.m6216a(this.getCurrencyIso4217Code, aFh1rSDK.getCurrencyIso4217Code) && Intrinsics.m6216a(this.getMediationNetwork, aFh1rSDK.getMediationNetwork) && Intrinsics.m6216a(this.areAllFieldsValid, aFh1rSDK.areAllFieldsValid) && Intrinsics.m6216a(this.component1, aFh1rSDK.component1);
                }

                public final int hashCode() {
/* 1 */             String str = this.getMonetizationNetwork;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            Boolean bool = this.component2;
/* 25 */            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 27 */            Boolean bool2 = this.AFAdRevenueData;
/* 38 */            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 40 */            Boolean bool3 = this.getRevenue;
/* 51 */            int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
/* 53 */            Boolean bool4 = this.getCurrencyIso4217Code;
/* 64 */            int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
/* 66 */            String str2 = this.getMediationNetwork;
/* 77 */            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 79 */            Boolean bool5 = this.areAllFieldsValid;
/* 97 */            return this.component1.hashCode() + ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 88 */            return "AdvertisingIdData(advertisingId=" + this.getMonetizationNetwork + ", isLimited=" + this.component2 + ", isEnabled=" + this.AFAdRevenueData + ", isGaidWithGps=" + this.getRevenue + ", isGaidWithSamsungCloudDev=" + this.getCurrencyIso4217Code + ", gaidError=" + this.getMediationNetwork + ", retry=" + this.areAllFieldsValid + ", metadata=" + this.component1 + ")";
                }

/* 49 */        private AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
                    map.getClass();
/* 51 */            this.getMonetizationNetwork = str;
/* 52 */            this.component2 = bool;
/* 53 */            this.AFAdRevenueData = bool2;
/* 54 */            this.getRevenue = bool3;
/* 55 */            this.getCurrencyIso4217Code = bool4;
/* 56 */            this.getMediationNetwork = str2;
/* 57 */            this.areAllFieldsValid = bool5;
/* 58 */            this.component1 = map;
                }

/* 58 */        public AFh1rSDK() {
/* 59 */            this(null, null, null, null, null, null, null, null, 255, null);
                }
            }
