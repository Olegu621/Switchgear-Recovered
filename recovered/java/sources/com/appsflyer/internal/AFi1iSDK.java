            package com.appsflyer.internal;

            import com.appsflyer.internal.platform_extension.Plugin;
            import com.appsflyer.internal.platform_extension.PluginInfo;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFi1iSDK implements AFi1kSDK {
                private PluginInfo getMediationNetwork = new PluginInfo(Plugin.NATIVE, "6.17.6", null, 4, null);

                @Override // com.appsflyer.internal.AFi1kSDK
                public final Map<String, Object> getCurrencyIso4217Code() {
/* 35 */            LinkedHashMap linkedHashMapM7132f = oc1.m7132f(new Pair("platform", this.getMediationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMediationNetwork.getVersion()));
/* 49 */            if (!this.getMediationNetwork.getAdditionalParams().isEmpty()) {
/* 59 */                linkedHashMapM7132f.put("extras", this.getMediationNetwork.getAdditionalParams());
                    }
/* 62 */            return linkedHashMapM7132f;
                }

                @Override // com.appsflyer.internal.AFi1kSDK
                public final void getRevenue(PluginInfo pluginInfo) {
/* 1 */             pluginInfo.getClass();
/* 4 */             this.getMediationNetwork = pluginInfo;
                }
            }
