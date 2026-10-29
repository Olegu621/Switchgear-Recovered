            package com.appsflyer;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface AppsFlyerConversionListener {
                void onAppOpenAttribution(Map<String, String> map);

                void onAttributionFailure(String str);

                void onConversionDataFail(String str);

                void onConversionDataSuccess(Map<String, Object> map);
            }
