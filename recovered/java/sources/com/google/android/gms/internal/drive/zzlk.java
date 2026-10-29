            package com.google.android.gms.internal.drive;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class zzlk<K, V> extends LinkedHashMap<K, V> {
                private static final zzlk zzty;
                private boolean zznh;

                static {
/* 3 */             zzlk zzlkVar = new zzlk();
/* 6 */             zzty = zzlkVar;
/* 9 */             zzlkVar.zznh = false;
                }

                private zzlk() {
/* 5 */             this.zznh = true;
                }

                public static <K, V> zzlk<K, V> zzdw() {
/* 1 */             return zzty;
                }

                private final void zzdy() {
/* 3 */             if (this.zznh) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                private static int zzg(Object obj) {
/* 3 */             if (obj instanceof byte[]) {
/* 7 */                 return zzkm.hashCode((byte[]) obj);
                    }
/* 14 */            if (!(obj instanceof zzkn)) {
/* 16 */                return obj.hashCode();
                    }
/* 21 */            f42.m3660p();
/* 24 */            return 0;
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final void clear() {
/* 1 */             zzdy();
/* 4 */             super.clear();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Set<Map.Entry<K, V>> entrySet() {
                    return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Map)) {
/* 89 */                return false;
                    }
/* 5 */             Map map = (Map) obj;
/* 7 */             if (this == map) {
/* 87 */                return true;
                    }
/* 17 */            if (size() != map.size()) {
/* 89 */                return false;
                    }
/* 32 */            for (Map.Entry<K, V> entry : entrySet()) {
/* 48 */                if (!map.containsKey(entry.getKey())) {
/* 89 */                    return false;
                        }
/* 51 */                V value = entry.getValue();
/* 59 */                Object obj2 = map.get(entry.getKey());
/* 84 */                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
/* 89 */                    return false;
                        }
                    }
/* 87 */            return true;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 9 */             int iZzg = 0;
/* 14 */            for (Map.Entry<K, V> entry : entrySet()) {
/* 39 */                iZzg += zzg(entry.getValue()) ^ zzg(entry.getKey());
                    }
/* 41 */            return iZzg;
                }

                public final boolean isMutable() {
/* 1 */             return this.zznh;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final V put(K k, V v) {
/* 1 */             zzdy();
/* 4 */             zzkm.checkNotNull(k);
/* 7 */             zzkm.checkNotNull(v);
/* 10 */            return (V) super.put(k, v);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final void putAll(Map<? extends K, ? extends V> map) {
/* 1 */             zzdy();
/* 16 */            for (K k : map.keySet()) {
/* 22 */                zzkm.checkNotNull(k);
/* 29 */                zzkm.checkNotNull(map.get(k));
                    }
/* 33 */            super.putAll(map);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final V remove(Object obj) {
/* 1 */             zzdy();
/* 4 */             return (V) super.remove(obj);
                }

                public final void zza(zzlk<K, V> zzlkVar) {
/* 1 */             zzdy();
/* 8 */             if (zzlkVar.isEmpty()) {
/* 13 */                return;
                    }
/* 10 */            putAll(zzlkVar);
                }

                public final void zzbp() {
/* 2 */             this.zznh = false;
                }

                public final zzlk<K, V> zzdx() {
                    return isEmpty() ? new zzlk<>() : new zzlk<>(this);
                }

/* 7 */         private zzlk(Map<K, V> map) {
/* 8 */             super(map);
/* 9 */             this.zznh = true;
                }
            }
