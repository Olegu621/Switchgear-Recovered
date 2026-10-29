            package com.appsflyer.internal;

            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFc1sSDK {
                final String AFAdRevenueData;
                final List<AFe1pSDK> getMediationNetwork;
                final int getMonetizationNetwork;

                /* JADX WARN: Multi-variable type inference failed */
                public AFc1sSDK(String str, List<? extends AFe1pSDK> list, int i) {
/* 1 */             str.getClass();
/* 4 */             list.getClass();
/* 10 */            this.AFAdRevenueData = str;
/* 12 */            this.getMediationNetwork = list;
/* 14 */            this.getMonetizationNetwork = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof AFc1sSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFc1sSDK aFc1sSDK = (AFc1sSDK) obj;
                    return Intrinsics.m6216a(this.AFAdRevenueData, aFc1sSDK.AFAdRevenueData) && Intrinsics.m6216a(this.getMediationNetwork, aFc1sSDK.getMediationNetwork) && this.getMonetizationNetwork == aFc1sSDK.getMonetizationNetwork;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.getMonetizationNetwork) + AbstractC0298j.m1861b(this.AFAdRevenueData.hashCode() * 31, 31, this.getMediationNetwork);
                }

                public final String toString() {
/* 1 */             String str = this.AFAdRevenueData;
/* 3 */             List<AFe1pSDK> list = this.getMediationNetwork;
/* 5 */             int i = this.getMonetizationNetwork;
/* 11 */            StringBuilder sb = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
/* 14 */            sb.append(str);
/* 19 */            sb.append(", eventTypes=");
/* 22 */            sb.append(list);
/* 27 */            sb.append(", maxCapacity=");
/* 32 */            return fm0.m3786l(sb, i, ")");
                }
            }
