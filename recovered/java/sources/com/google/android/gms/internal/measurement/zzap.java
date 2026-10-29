            package com.google.android.gms.internal.measurement;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzap implements zzao {
                private final String zza;
                private final ArrayList zzb;

                public zzap(String str, List list) {
/* 4 */             this.zza = str;
/* 8 */             ArrayList arrayList = new ArrayList();
/* 11 */            this.zzb = arrayList;
/* 13 */            arrayList.addAll(list);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzap)) {
/* 7 */                 return false;
                    }
/* 11 */            zzap zzapVar = (zzap) obj;
/* 13 */            String str = this.zza;
/* 15 */            String str2 = zzapVar.zza;
/* 17 */            if (str == null ? str2 == null : str.equals(str2)) {
/* 33 */                return this.zzb.equals(zzapVar.zzb);
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.zza;
/* 19 */            return this.zzb.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
                }

                public final String zzb() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final String zzc() {
/* 8 */             throw new IllegalStateException("Statement cannot be cast as String");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzcA(String str, zzg zzgVar, List list) {
/* 8 */             throw new IllegalStateException("Statement is not an evaluated entity");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Double zzd() {
/* 8 */             throw new IllegalStateException("Statement cannot be cast as Double");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Boolean zze() {
/* 8 */             throw new IllegalStateException("Statement cannot be cast as Boolean");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Iterator zzf() {
/* 1 */             return null;
                }

                public final ArrayList zzg() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzt() {
/* 1 */             return this;
                }
            }
