            package com.appsflyer.internal;
            
            /* JADX INFO: renamed from: com.appsflyer.internal.s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0307s implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f3120a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AFj1sSDK f3121b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Runnable f3122c;

                public /* synthetic */ RunnableC0307s(AFj1sSDK aFj1sSDK, Runnable runnable, int i) {
/* 1 */             this.f3120a = i;
/* 3 */             this.f3121b = aFj1sSDK;
/* 5 */             this.f3122c = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f3120a;
/* 3 */             Runnable runnable = this.f3122c;
/* 5 */             AFj1sSDK aFj1sSDK = this.f3121b;
                    switch (i) {
                        case 0:
/* 1 */                     aFj1sSDK.AFAdRevenueData(runnable);
                            break;
                        case 1:
/* 1 */                     aFj1sSDK.getMonetizationNetwork(runnable);
                            break;
                        case 2:
/* 1 */                     aFj1sSDK.component1(runnable);
                            break;
                        default:
/* 1 */                     aFj1sSDK.getRevenue(runnable);
                            break;
                    }
                }
            }
