            package com.appsflyer.internal;
            
            /* JADX INFO: renamed from: com.appsflyer.internal.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0299k implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f3110a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AFd1wSDK f3111b;

                public /* synthetic */ RunnableC0299k(AFd1wSDK aFd1wSDK, int i) {
/* 1 */             this.f3110a = i;
/* 3 */             this.f3111b = aFd1wSDK;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f3110a;
/* 3 */             AFd1wSDK aFd1wSDK = this.f3111b;
                    switch (i) {
                        case 0:
/* 1 */                     AFd1wSDK.getMonetizationNetwork(aFd1wSDK);
                            break;
                        case 1:
/* 1 */                     AFd1wSDK.getMediationNetwork(aFd1wSDK);
                            break;
                        default:
/* 168 */                   AFd1wSDK.getRevenue(aFd1wSDK);
                            break;
                    }
                }
            }
