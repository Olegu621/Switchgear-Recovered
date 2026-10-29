            package com.google.android.gms.internal.measurement;

            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzai implements zzao, zzak {
                protected final String zzd;
                protected final Map zze = new HashMap();

                public zzai(String str) {
/* 11 */            this.zzd = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzai)) {
/* 7 */                 return false;
                    }
/* 11 */            zzai zzaiVar = (zzai) obj;
/* 13 */            String str = this.zzd;
/* 15 */            if (str != null) {
/* 19 */                return str.equals(zzaiVar.zzd);
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.zzd;
/* 3 */             if (str != null) {
/* 5 */                 return str.hashCode();
                    }
/* 10 */            return 0;
                }

                public abstract zzao zza(zzg zzgVar, List list);

                @Override // com.google.android.gms.internal.measurement.zzao
                public final String zzc() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzcA(String str, zzg zzgVar, List list) {
                    return "toString".equals(str) ? new zzas(this.zzd) : zzak.zzu(this, new zzas(str), zzgVar, list);
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
/* 3 */             return zzak.zzv(this.zze);
                }

                public final String zzg() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final boolean zzj(String str) {
/* 3 */             return this.zze.containsKey(str);
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final zzao zzk(String str) {
/* 1 */             Map map = this.zze;
                    return map.containsKey(str) ? (zzao) map.get(str) : zzao.zzf;
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final void zzm(String str, zzao zzaoVar) {
/* 1 */             Map map = this.zze;
/* 3 */             if (zzaoVar == null) {
/* 5 */                 map.remove(str);
                    } else {
/* 9 */                 map.put(str, zzaoVar);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public zzao zzt() {
/* 1 */             return this;
                }
            }
