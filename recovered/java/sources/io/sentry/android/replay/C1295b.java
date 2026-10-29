            package io.sentry.android.replay;

            import io.sentry.C1443f;
            import io.sentry.C1697u2;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class C1295b extends LinkedHashMap {
                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ boolean containsKey(Object obj) {
/* 3 */             if (obj instanceof C1443f) {
/* 9 */                 return super.containsKey((C1443f) obj);
                    }
/* 5 */             return false;
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ boolean containsValue(Object obj) {
/* 1 */             return false;
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Object get(Object obj) {
/* 4 */             if (!(obj instanceof C1443f) || super.get((C1443f) obj) == null) {
/* 3 */                 return null;
                    }
/* 16 */            C1697u2.m5431g();
/* 3 */             return null;
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
                public final Object getOrDefault(Object obj, Object obj2) {
/* 3 */             if (!(obj instanceof C1443f)) {
/* 5 */                 return obj2;
                    }
/* 6 */             C1443f c1443f = (C1443f) obj;
/* 9 */             if (obj2 != null) {
/* 22 */                C1697u2.m5431g();
/* 8 */                 return null;
                    }
/* 15 */            if (super.getOrDefault(c1443f, null) == null) {
/* 8 */                 return null;
                    }
/* 18 */            C1697u2.m5431g();
/* 8 */             return null;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Object remove(Object obj) {
/* 4 */             if (!(obj instanceof C1443f) || super.remove((C1443f) obj) == null) {
/* 3 */                 return null;
                    }
/* 16 */            C1697u2.m5431g();
/* 3 */             return null;
                }

                @Override // java.util.LinkedHashMap
                public final boolean removeEldestEntry(Map.Entry entry) {
                    return super.size() > 32;
                }

                @Override // java.util.HashMap, java.util.Map
/* 19 */        public final /* bridge */ boolean remove(Object obj, Object obj2) {
/* 20 */            return false;
                }
            }
