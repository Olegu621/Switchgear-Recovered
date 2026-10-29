            package com.appsflyer.internal.components.network.http.exceptions;

            import com.appsflyer.internal.AFd1aSDK;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HttpException extends IOException {
                private final AFd1aSDK getMonetizationNetwork;

                public HttpException(Throwable th, AFd1aSDK aFd1aSDK) {
/* 5 */             super(th.getMessage(), th);
/* 8 */             this.getMonetizationNetwork = aFd1aSDK;
                }

                public AFd1aSDK getMetrics() {
/* 1 */             return this.getMonetizationNetwork;
                }
            }
