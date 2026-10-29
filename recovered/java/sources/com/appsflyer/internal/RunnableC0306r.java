            package com.appsflyer.internal;
            
            /* JADX INFO: renamed from: com.appsflyer.internal.r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0306r implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f3118a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AFj1pSDK f3119b;

                public /* synthetic */ RunnableC0306r(AFj1pSDK aFj1pSDK, int i) {
/* 1 */             this.f3118a = i;
/* 3 */             this.f3119b = aFj1pSDK;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f3118a;
/* 3 */             AFj1pSDK aFj1pSDK = this.f3119b;
                    switch (i) {
                        case 0:
/* 1 */                     aFj1pSDK.component4();
                            break;
                        case 1:
/* 1 */                     aFj1pSDK.component3();
                            break;
                        default:
/* 1 */                     aFj1pSDK.component2();
                            break;
                    }
                }
            }
