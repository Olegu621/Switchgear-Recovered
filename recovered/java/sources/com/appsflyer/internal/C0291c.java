            package com.appsflyer.internal;
            
            /* JADX INFO: renamed from: com.appsflyer.internal.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C0291c implements AFd1xSDK.AFa1vSDK, AFf1mSDK {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AFa1ySDK f3100a;

                public /* synthetic */ C0291c(AFa1ySDK aFa1ySDK) {
/* 1 */             this.f3100a = aFa1ySDK;
                }

                @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
                public void onConfigurationChanged(boolean z) {
/* 1 */             this.f3100a.getMediationNetwork(z);
                }

                @Override // com.appsflyer.internal.AFf1mSDK
                public void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
/* 215 */           this.f3100a.AFAdRevenueData(aFf1pSDK);
                }
            }
