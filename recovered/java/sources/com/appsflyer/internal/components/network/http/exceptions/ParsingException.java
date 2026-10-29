            package com.appsflyer.internal.components.network.http.exceptions;

            import com.appsflyer.internal.AFe1wSDK;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ParsingException extends IOException {
                private final AFe1wSDK<String> getCurrencyIso4217Code;

                public ParsingException(String str, Throwable th, AFe1wSDK<String> aFe1wSDK) {
/* 1 */             super(str, th);
/* 4 */             this.getCurrencyIso4217Code = aFe1wSDK;
                }

                public AFe1wSDK<String> getRawResponse() {
/* 1 */             return this.getCurrencyIso4217Code;
                }
            }
