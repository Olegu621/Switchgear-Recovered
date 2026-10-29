            package io.flutter.embedding.engine;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterEngineCache {
                private static FlutterEngineCache instance;
                private final Map<String, FlutterEngine> cachedEngines = new HashMap();

                public static FlutterEngineCache getInstance() {
/* 3 */             if (instance == null) {
/* 10 */                instance = new FlutterEngineCache();
                    }
/* 12 */            return instance;
                }

                public void clear() {
/* 3 */             this.cachedEngines.clear();
                }

                public boolean contains(String str) {
/* 3 */             return this.cachedEngines.containsKey(str);
                }

                public FlutterEngine get(String str) {
/* 3 */             return this.cachedEngines.get(str);
                }

                public void put(String str, FlutterEngine flutterEngine) {
/* 1 */             Map<String, FlutterEngine> map = this.cachedEngines;
/* 3 */             if (flutterEngine != null) {
/* 5 */                 map.put(str, flutterEngine);
                    } else {
/* 9 */                 map.remove(str);
                    }
                }

                public void remove(String str) {
/* 2 */             put(str, null);
                }
            }
