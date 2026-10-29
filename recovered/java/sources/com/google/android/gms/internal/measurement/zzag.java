            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class zzag implements zzao {
                private final zzao zza;
                private final String zzb;

                public zzag() {
/* 6 */             this.zza = zzao.zzf;
/* 10 */            this.zzb = "return";
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzag)) {
/* 7 */                 return false;
                    }
/* 13 */            zzag zzagVar = (zzag) obj;
                    return this.zzb.equals(zzagVar.zzb) && this.zza.equals(zzagVar.zza);
                }

                public final int hashCode() {
/* 15 */            return this.zza.hashCode() + (this.zzb.hashCode() * 31);
                }

                public final zzao zzb() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final String zzc() {
/* 8 */             throw new IllegalStateException("Control is not a String");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzcA(String str, zzg zzgVar, List list) {
/* 8 */             throw new IllegalStateException("Control does not have functions");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Double zzd() {
/* 8 */             throw new IllegalStateException("Control is not a double");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Boolean zze() {
/* 8 */             throw new IllegalStateException("Control is not a boolean");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Iterator zzf() {
/* 1 */             return null;
                }

                public final String zzg() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzt() {
/* 11 */            return new zzag(this.zzb, this.zza.zzt());
                }

/* 12 */        public zzag(String str) {
                    this.zza = zzao.zzf;
                    this.zzb = str;
                }

/* 13 */        public zzag(String str, zzao zzaoVar) {
                    this.zza = zzaoVar;
                    this.zzb = str;
                }
            }
