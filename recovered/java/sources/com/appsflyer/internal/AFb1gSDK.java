            package com.appsflyer.internal;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFb1gSDK {
                public final String getMediationNetwork;
                public final int getMonetizationNetwork;

                public AFb1gSDK(int i, String str) {
/* 1 */             str.getClass();
/* 7 */             this.getMonetizationNetwork = i;
/* 9 */             this.getMediationNetwork = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof AFb1gSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
                    return this.getMonetizationNetwork == aFb1gSDK.getMonetizationNetwork && Intrinsics.m6216a(this.getMediationNetwork, aFb1gSDK.getMediationNetwork);
                }

                public final int hashCode() {
/* 15 */            return this.getMediationNetwork.hashCode() + (Integer.hashCode(this.getMonetizationNetwork) * 31);
                }

                public final String toString() {
/* 28 */            return "AppSetIdModel(scope=" + this.getMonetizationNetwork + ", id=" + this.getMediationNetwork + ")";
                }
            }
