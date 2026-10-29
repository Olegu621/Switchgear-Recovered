            package io.flutter.embedding.engine;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterEngineGroupCache {
                private static volatile FlutterEngineGroupCache instance;
                private final Map<String, FlutterEngineGroup> cachedEngineGroups = new HashMap();

                public static FlutterEngineGroupCache getInstance() {
/* 3 */             if (instance == null) {
                        synchronized (FlutterEngineGroupCache.class) {
                            try {
/* 10 */                        if (instance == null) {
/* 17 */                            instance = new FlutterEngineGroupCache();
                                }
                            } catch (Throwable th) {
/* 25 */                        throw th;
                            }
                        }
                    }
/* 26 */            return instance;
                }

                public void clear() {
/* 3 */             this.cachedEngineGroups.clear();
                }

                public boolean contains(String str) {
/* 3 */             return this.cachedEngineGroups.containsKey(str);
                }

                public FlutterEngineGroup get(String str) {
/* 3 */             return this.cachedEngineGroups.get(str);
                }

                public void put(String str, FlutterEngineGroup flutterEngineGroup) {
/* 1 */             Map<String, FlutterEngineGroup> map = this.cachedEngineGroups;
/* 3 */             if (flutterEngineGroup != null) {
/* 5 */                 map.put(str, flutterEngineGroup);
                    } else {
/* 9 */                 map.remove(str);
                    }
                }

                public void remove(String str) {
/* 2 */             put(str, null);
                }
            }
