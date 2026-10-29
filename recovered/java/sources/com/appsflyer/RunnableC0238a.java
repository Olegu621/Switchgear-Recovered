            package com.appsflyer;

            import com.appsflyer.internal.AFh1ySDK;
            
            /* JADX INFO: renamed from: com.appsflyer.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0238a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f3070a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AFh1ySDK[] f3071b;

                public /* synthetic */ RunnableC0238a(AFh1ySDK[] aFh1ySDKArr, int i) {
/* 1 */             this.f3070a = i;
/* 3 */             this.f3071b = aFh1ySDKArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f3070a;
/* 3 */             AFh1ySDK[] aFh1ySDKArr = this.f3071b;
                    switch (i) {
                        case 0:
/* 1 */                     AFLogger.getMediationNetwork(aFh1ySDKArr);
                            break;
                        default:
/* 1 */                     AFLogger.getCurrencyIso4217Code(aFh1ySDKArr);
                            break;
                    }
                }
            }
