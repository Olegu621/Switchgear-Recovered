            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaf implements zzao {
                private final boolean zza;

                public zzaf(Boolean bool) {
/* 7 */             this.zza = bool == null ? false : bool.booleanValue();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof zzaf) && this.zza == ((zzaf) obj).zza;
                }

                public final int hashCode() {
/* 7 */             return Boolean.valueOf(this.zza).hashCode();
                }

                public final String toString() {
/* 3 */             return String.valueOf(this.zza);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final String zzc() {
/* 3 */             return Boolean.toString(this.zza);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzcA(String str, zzg zzgVar, List list) {
/* 3 */             boolean zEquals = "toString".equals(str);
/* 7 */             boolean z = this.zza;
/* 9 */             if (zEquals) {
/* 17 */                return new zzas(Boolean.toString(z));
                    }
/* 33 */            C1951n4.m6859j(pm2.m7489l(Boolean.toString(z), ".", str, " is not a function."));
/* 36 */            return null;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Double zzd() {
/* 11 */            return Double.valueOf(true != this.zza ? 0.0d : 1.0d);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Boolean zze() {
/* 3 */             return Boolean.valueOf(this.zza);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Iterator zzf() {
/* 1 */             return null;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzt() {
/* 9 */             return new zzaf(Boolean.valueOf(this.zza));
                }
            }
