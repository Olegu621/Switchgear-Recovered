            package com.appsflyer.internal;

            import kotlin.jvm.internal.Intrinsics;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFi1jSDK {
                public final String AFAdRevenueData;
                public final long getCurrencyIso4217Code;
                public final long getMediationNetwork;
                public final String getRevenue;

                public AFi1jSDK(long j, long j2, String str, String str2) {
/* 4 */             this.getMediationNetwork = j;
/* 6 */             this.getCurrencyIso4217Code = j2;
/* 8 */             this.getRevenue = str;
/* 10 */            this.AFAdRevenueData = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof AFi1jSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFi1jSDK aFi1jSDK = (AFi1jSDK) obj;
                    return this.getMediationNetwork == aFi1jSDK.getMediationNetwork && this.getCurrencyIso4217Code == aFi1jSDK.getCurrencyIso4217Code && Intrinsics.m6216a(this.getRevenue, aFi1jSDK.getRevenue) && Intrinsics.m6216a(this.AFAdRevenueData, aFi1jSDK.AFAdRevenueData);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (Long.hashCode(this.getCurrencyIso4217Code) + (Long.hashCode(this.getMediationNetwork) * 31)) * 31;
/* 18 */            String str = this.getRevenue;
/* 30 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 32 */            String str2 = this.AFAdRevenueData;
/* 41 */            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             long j = this.getMediationNetwork;
/* 3 */             long j2 = this.getCurrencyIso4217Code;
/* 5 */             String str = this.getRevenue;
/* 7 */             String str2 = this.AFAdRevenueData;
/* 13 */            StringBuilder sb = new StringBuilder("PlayIntegrityApiData(piaTimestamp=");
/* 16 */            sb.append(j);
/* 21 */            sb.append(", ttrMillis=");
/* 24 */            sb.append(j2);
/* 29 */            sb.append(", piaToken=");
/* 32 */            sb.append(str);
/* 39 */            return fm0.m3790p(sb, ", errorCode=", str2, ")");
                }
            }
