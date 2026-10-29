            package com.google.android.gms.internal.measurement;

            import java.util.HashMap;
            import java.util.Map;
            import p000.fx0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaa {
                private static final fx0 zza = fx0.m3851h(3, "_syn", "_err", "_el");
                private String zzb;
                private final long zzc;
                private final Map zzd;

                public zzaa(String str, long j, Map map) {
/* 4 */             this.zzb = str;
/* 6 */             this.zzc = j;
/* 10 */            HashMap map2 = new HashMap();
/* 13 */            this.zzd = map2;
/* 15 */            if (map != null) {
/* 17 */                map2.putAll(map);
                    }
                }

                public static Object zzh(String str, Object obj, Object obj2) {
/* 7 */             if (zza.contains(str) && (obj2 instanceof Double)) {
/* 24 */                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
                    }
/* 35 */            if (str.startsWith("_")) {
/* 39 */                if (!(obj instanceof String) && obj != null) {
/* 44 */                    return obj;
                        }
                    } else if (!(obj instanceof Double)) {
/* 51 */                if (obj instanceof Long) {
/* 63 */                    return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
                        }
/* 70 */                if (obj instanceof String) {
/* 72 */                    return obj2.toString();
                        }
                    }
/* 77 */            return obj2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzaa)) {
/* 7 */                 return false;
                    }
/* 11 */            zzaa zzaaVar = (zzaa) obj;
/* 19 */            if (this.zzc == zzaaVar.zzc && this.zzb.equals(zzaaVar.zzb)) {
/* 37 */                return this.zzd.equals(zzaaVar.zzd);
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.zzb.hashCode() * 31;
/* 9 */             long j = this.zzc;
/* 26 */            return this.zzd.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
                }

                public final String toString() {
/* 1 */             String str = this.zzb;
/* 5 */             String string = this.zzd.toString();
/* 13 */            int length = String.valueOf(str).length();
/* 17 */            long j = this.zzc;
/* 41 */            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
/* 46 */            sb.append("Event{name='");
/* 49 */            sb.append(str);
/* 54 */            sb.append("', timestamp=");
/* 57 */            sb.append(j);
/* 62 */            sb.append(", params=");
/* 65 */            sb.append(string);
/* 70 */            sb.append("}");
/* 73 */            return sb.toString();
                }

                public final long zza() {
/* 1 */             return this.zzc;
                }

                public final String zzb() {
/* 1 */             return this.zzb;
                }

                public final void zzc(String str) {
/* 1 */             this.zzb = str;
                }

                public final void zzd(String str, Object obj) {
/* 1 */             Map map = this.zzd;
/* 3 */             if (obj == null) {
/* 5 */                 map.remove(str);
                    } else {
/* 17 */                map.put(str, zzh(str, map.get(str), obj));
                    }
                }

                public final Object zze(String str) {
/* 1 */             Map map = this.zzd;
/* 7 */             if (map.containsKey(str)) {
/* 9 */                 return map.get(str);
                    }
/* 14 */            return null;
                }

                public final Map zzf() {
/* 1 */             return this.zzd;
                }

                /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
                public final zzaa clone() {
/* 14 */            return new zzaa(this.zzb, this.zzc, new HashMap(this.zzd));
                }
            }
