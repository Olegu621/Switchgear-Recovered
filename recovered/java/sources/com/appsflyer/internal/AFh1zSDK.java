            package com.appsflyer.internal;

            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFh1zSDK extends AFh1ySDK {
                private final AFd1zSDK getMonetizationNetwork;

                public AFh1zSDK(AFd1zSDK aFd1zSDK) {
/* 1 */             aFd1zSDK.getClass();
/* 7 */             this.getMonetizationNetwork = aFd1zSDK;
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: e */
                public final void mo1748e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
/* 1 */             aFg1cSDK.getClass();
/* 4 */             str.getClass();
/* 7 */             th.getClass();
/* 10 */            if (z3) {
/* 16 */                if (StringsKt.m6228D(str)) {
/* 18 */                    str = "missing label";
                        }
/* 30 */                this.getMonetizationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork(th, withTag$SDK_prodRelease(str, aFg1cSDK));
                    }
                }
            }
