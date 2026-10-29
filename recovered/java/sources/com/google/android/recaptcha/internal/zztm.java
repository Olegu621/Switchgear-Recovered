            package com.google.android.recaptcha.internal;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class zztm extends LinkedHashMap {
                private static final zztm zza;
                private boolean zzb;

                static {
/* 3 */             zztm zztmVar = new zztm();
/* 6 */             zza = zztmVar;
/* 9 */             zztmVar.zzb = false;
                }

                private zztm() {
/* 5 */             this.zzb = true;
                }

                public static zztm zza() {
/* 1 */             return zza;
                }

                private static int zzf(Object obj) {
/* 4 */             if (!(obj instanceof byte[])) {
/* 19 */                if (!(obj instanceof zzsp)) {
/* 21 */                    return obj.hashCode();
                        }
/* 26 */                f42.m3660p();
/* 3 */                 return 0;
                    }
/* 6 */             byte[] bArr = (byte[]) obj;
/* 8 */             int length = bArr.length;
/* 9 */             int iZzb = zzsv.zzb(length, bArr, 0, length);
/* 13 */            if (iZzb == 0) {
/* 15 */                return 1;
                    }
/* 16 */            return iZzb;
                }

                private final void zzg() {
/* 3 */             if (this.zzb) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final void clear() {
/* 1 */             zzg();
/* 4 */             super.clear();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
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
/* 18 */            if (size() != map.size()) {
/* 89 */                return false;
                    }
/* 25 */            Iterator it = entrySet().iterator();
/* 33 */            while (it.hasNext()) {
/* 39 */                Map.Entry entry = (Map.Entry) it.next();
/* 49 */                if (!map.containsKey(entry.getKey())) {
/* 89 */                    return false;
                        }
/* 51 */                Object value = entry.getValue();
/* 59 */                Object obj2 = map.get(entry.getKey());
/* 84 */                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
/* 89 */                    return false;
                        }
                    }
/* 87 */            return true;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 5 */             Iterator it = entrySet().iterator();
/* 9 */             int iZzf = 0;
/* 14 */            while (it.hasNext()) {
/* 20 */                Map.Entry entry = (Map.Entry) it.next();
/* 39 */                iZzf += zzf(entry.getValue()) ^ zzf(entry.getKey());
                    }
/* 41 */            return iZzf;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Object put(Object obj, Object obj2) {
/* 1 */             zzg();
/* 4 */             byte[] bArr = zzsv.zzb;
/* 6 */             obj.getClass();
/* 9 */             obj2.getClass();
/* 12 */            return super.put(obj, obj2);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final void putAll(Map map) {
/* 1 */             zzg();
/* 16 */            for (Object obj : map.keySet()) {
/* 22 */                byte[] bArr = zzsv.zzb;
/* 24 */                obj.getClass();
/* 31 */                map.get(obj).getClass();
                    }
/* 35 */            super.putAll(map);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final Object remove(Object obj) {
/* 1 */             zzg();
/* 4 */             return super.remove(obj);
                }

                public final zztm zzb() {
                    return isEmpty() ? new zztm() : new zztm(this);
                }

                public final void zzc() {
/* 2 */             this.zzb = false;
                }

                public final void zzd(zztm zztmVar) {
/* 1 */             zzg();
/* 8 */             if (zztmVar.isEmpty()) {
/* 13 */                return;
                    }
/* 10 */            putAll(zztmVar);
                }

                public final boolean zze() {
/* 1 */             return this.zzb;
                }

/* 7 */         private zztm(Map map) {
/* 8 */             super(map);
                    this.zzb = true;
                }
            }
