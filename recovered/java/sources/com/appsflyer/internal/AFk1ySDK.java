            package com.appsflyer.internal;

            import com.appsflyer.AppsFlyerLib;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFk1ySDK implements AFk1zSDK {
                @Override // com.appsflyer.internal.AFk1zSDK
                public final String getMediationNetwork(String str) {
/* 1 */             str.getClass();
/* 24 */            return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName());
                }
            }
