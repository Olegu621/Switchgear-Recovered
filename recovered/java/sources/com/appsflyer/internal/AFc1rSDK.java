            package com.appsflyer.internal;

            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFc1rSDK {
                final List<AFc1sSDK> getMediationNetwork;

                public AFc1rSDK(List<AFc1sSDK> list) {
/* 1 */             list.getClass();
/* 7 */             this.getMediationNetwork = list;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof AFc1rSDK) && Intrinsics.m6216a(this.getMediationNetwork, ((AFc1rSDK) obj).getMediationNetwork);
                }

                public final int hashCode() {
/* 3 */             return this.getMediationNetwork.hashCode();
                }

                public final String toString() {
/* 18 */            return "StorageConfig(typeEntries=" + this.getMediationNetwork + ")";
                }
            }
