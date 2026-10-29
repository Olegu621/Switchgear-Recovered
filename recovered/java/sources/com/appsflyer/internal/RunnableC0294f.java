            package com.appsflyer.internal;
            
            /* JADX INFO: renamed from: com.appsflyer.internal.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0294f implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f3104a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f3105b;

                public /* synthetic */ RunnableC0294f(Object obj, int i) {
/* 1 */             this.f3104a = i;
/* 3 */             this.f3105b = obj;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f3104a;
/* 3 */             Object obj = this.f3105b;
                    switch (i) {
                        case 0:
/* 1 */                     AFb1iSDK.getMediationNetwork((AFb1iSDK) obj);
                            break;
                        case 1:
/* 1 */                     AFa1ySDK.getMediationNetwork((AFd1zSDK) obj);
                            break;
                        default:
/* 10 */                    ((AFd1kSDK) obj).AFAdRevenueData();
                            break;
                    }
                }
            }
