            package com.appsflyer.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AFd1aSDK {
                public final long getMediationNetwork;

                public AFd1aSDK(long j) {
/* 4 */             this.getMediationNetwork = j;
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.getMediationNetwork == ((AFd1aSDK) obj).getMediationNetwork;
                }

                public int hashCode() {
/* 1 */             long j = this.getMediationNetwork;
/* 8 */             return (int) (j ^ (j >>> 32));
                }
            }
