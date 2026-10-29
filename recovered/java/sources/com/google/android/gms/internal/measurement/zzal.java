            package com.google.android.gms.internal.measurement;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzal implements zzao, zzak {
                final Map zza = new HashMap();

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzal) {
/* 17 */                return this.zza.equals(((zzal) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("{");
/* 8 */             Map map = this.zza;
/* 14 */            if (!map.isEmpty()) {
/* 28 */                for (String str : map.keySet()) {
/* 50 */                    sb.append(String.format("%s: %s,", str, map.get(str)));
                        }
/* 60 */                sb.deleteCharAt(sb.lastIndexOf(","));
                    }
/* 65 */            sb.append("}");
/* 68 */            return sb.toString();
                }

                public final List zzb() {
/* 9 */             return new ArrayList(this.zza.keySet());
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final String zzc() {
/* 1 */             return "[object Object]";
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public zzao zzcA(String str, zzg zzgVar, List list) {
                    return "toString".equals(str) ? new zzas(toString()) : zzak.zzu(this, new zzas(str), zzgVar, list);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Double zzd() {
/* 3 */             return Double.valueOf(Double.NaN);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Boolean zze() {
/* 1 */             return Boolean.TRUE;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Iterator zzf() {
/* 3 */             return zzak.zzv(this.zza);
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final boolean zzj(String str) {
/* 3 */             return this.zza.containsKey(str);
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final zzao zzk(String str) {
/* 1 */             Map map = this.zza;
                    return map.containsKey(str) ? (zzao) map.get(str) : zzao.zzf;
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final void zzm(String str, zzao zzaoVar) {
/* 1 */             Map map = this.zza;
/* 3 */             if (zzaoVar == null) {
/* 5 */                 map.remove(str);
                    } else {
/* 9 */                 map.put(str, zzaoVar);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzt() {
/* 3 */             zzal zzalVar = new zzal();
/* 20 */            for (Map.Entry entry : this.zza.entrySet()) {
/* 32 */                boolean z = entry.getValue() instanceof zzak;
/* 34 */                Map map = zzalVar.zza;
/* 36 */                if (z) {
/* 50 */                    map.put((String) entry.getKey(), (zzao) entry.getValue());
                        } else {
/* 70 */                    map.put((String) entry.getKey(), ((zzao) entry.getValue()).zzt());
                        }
                    }
/* 74 */            return zzalVar;
                }
            }
