            package com.appsflyer.internal;

            import kotlin.jvm.internal.Intrinsics;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1bSDK {
                final int AFAdRevenueData;
                final int getCurrencyIso4217Code;
                final int getMediationNetwork;
                final String getMonetizationNetwork;
                final int getRevenue;

                public AFf1bSDK(int i, int i2, int i3, int i4, String str) {
/* 1 */             str.getClass();
/* 7 */             this.getCurrencyIso4217Code = i;
/* 9 */             this.getMediationNetwork = i2;
/* 11 */            this.AFAdRevenueData = i3;
/* 13 */            this.getRevenue = i4;
/* 15 */            this.getMonetizationNetwork = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof AFf1bSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFf1bSDK aFf1bSDK = (AFf1bSDK) obj;
                    return this.getCurrencyIso4217Code == aFf1bSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.AFAdRevenueData == aFf1bSDK.AFAdRevenueData && this.getRevenue == aFf1bSDK.getRevenue && Intrinsics.m6216a(this.getMonetizationNetwork, aFf1bSDK.getMonetizationNetwork);
                }

                public final int hashCode() {
/* 34 */            return this.getMonetizationNetwork.hashCode() + AbstractC0298j.m1860a(this.getRevenue, AbstractC0298j.m1860a(this.AFAdRevenueData, AbstractC0298j.m1860a(this.getMediationNetwork, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
                }

                public final String toString() {
/* 1 */             int i = this.getCurrencyIso4217Code;
/* 3 */             int i2 = this.getMediationNetwork;
/* 5 */             int i3 = this.AFAdRevenueData;
/* 7 */             int i4 = this.getRevenue;
/* 9 */             String str = this.getMonetizationNetwork;
/* 15 */            StringBuilder sb = new StringBuilder("CmpTcfData(policyVersion=");
/* 18 */            sb.append(i);
/* 23 */            sb.append(", gdprApplies=");
/* 26 */            sb.append(i2);
/* 31 */            sb.append(", cmpSdkId=");
/* 34 */            sb.append(i3);
/* 39 */            sb.append(", cmpSdkVersion=");
/* 42 */            sb.append(i4);
/* 47 */            sb.append(", tcString=");
/* 52 */            return fm0.m3789o(sb, str, ")");
                }
            }
