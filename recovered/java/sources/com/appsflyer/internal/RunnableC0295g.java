            package com.appsflyer.internal;

            import android.content.Context;
            import android.hardware.SensorEvent;
            
            /* JADX INFO: renamed from: com.appsflyer.internal.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0295g implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f3106a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f3107b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f3108c;

                public /* synthetic */ RunnableC0295g(int i, Object obj, Object obj2) {
/* 1 */             this.f3106a = i;
/* 3 */             this.f3107b = obj;
/* 5 */             this.f3108c = obj2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f3106a;
/* 3 */             Object obj = this.f3108c;
/* 5 */             Object obj2 = this.f3107b;
                    switch (i) {
                        case 0:
/* 1 */                     AFb1iSDK.getMonetizationNetwork((AFb1iSDK) obj2, (AFh1qSDK) obj);
                            break;
                        case 1:
/* 1 */                     ((AFa1ySDK) obj2).getCurrencyIso4217Code((AFh1mSDK) obj);
                            break;
                        case 2:
/* 1 */                     ((AFj1nSDK) obj2).m1836G_((SensorEvent) obj);
                            break;
                        case 3:
/* 1 */                     AFj1rSDK.getRevenue((AFj1rSDK) obj2, (Context) obj);
                            break;
                        case 4:
/* 1 */                     ((AFj1wSDK) obj2).getMediationNetwork((Context) obj);
                            break;
                        default:
/* 1 */                     AFj1ySDK.getRevenue((AFj1ySDK) obj2, (Context) obj);
                            break;
                    }
                }
            }
