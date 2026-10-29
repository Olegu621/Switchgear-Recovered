            package io.flutter.plugin.platform;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlatformViewRegistryImpl implements PlatformViewRegistry {
                private final Map<String, PlatformViewFactory> viewFactories = new HashMap();

                public PlatformViewFactory getFactory(String str) {
/* 3 */             return this.viewFactories.get(str);
                }

                @Override // io.flutter.plugin.platform.PlatformViewRegistry
                public boolean registerViewFactory(String str, PlatformViewFactory platformViewFactory) {
/* 7 */             if (this.viewFactories.containsKey(str)) {
/* 9 */                 return false;
                    }
/* 13 */            this.viewFactories.put(str, platformViewFactory);
/* 16 */            return true;
                }
            }
