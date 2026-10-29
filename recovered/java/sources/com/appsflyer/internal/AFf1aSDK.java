            package com.appsflyer.internal;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1aSDK {
                public final boolean getMediationNetwork;
                public final long getMonetizationNetwork;
                public final String getRevenue;

                public AFf1aSDK(String str, long j, boolean z) {
/* 1 */             str.getClass();
/* 7 */             this.getRevenue = str;
/* 9 */             this.getMonetizationNetwork = j;
/* 11 */            this.getMediationNetwork = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof AFf1aSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
                    return Intrinsics.m6216a(this.getRevenue, aFf1aSDK.getRevenue) && this.getMonetizationNetwork == aFf1aSDK.getMonetizationNetwork && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v4, types: [int] */
                /* JADX WARN: Type inference failed for: r3v2, types: [int] */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v4 */
                public final int hashCode() {
/* 16 */            int iHashCode = (Long.hashCode(this.getMonetizationNetwork) + (this.getRevenue.hashCode() * 31)) * 31;
/* 18 */            boolean z = this.getMediationNetwork;
                    ?? r3 = z;
/* 20 */            if (z) {
/* 22 */                r3 = 1;
                    }
/* 23 */            return iHashCode + r3;
                }

                public final String toString() {
/* 38 */            return "AFUninstallToken(token=" + this.getRevenue + ", receivedTime=" + this.getMonetizationNetwork + ", isQueued=" + this.getMediationNetwork + ")";
                }
            }
