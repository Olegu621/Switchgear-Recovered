            package com.appsflyer.internal;

            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: renamed from: com.appsflyer.internal.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C0292d implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f3101a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f3102b;

                public /* synthetic */ C0292d(Object obj, int i) {
/* 1 */             this.f3101a = i;
/* 3 */             this.f3102b = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f3101a;
/* 3 */             Object obj = this.f3102b;
                    switch (i) {
                        case 0:
/* 1 */                     return ((AFa1ySDK.AFa1zSDK) obj).getMediationNetwork();
                        default:
/* 1 */                     return ((AFc1bSDK) obj).m1778o_();
                    }
                }
            }
