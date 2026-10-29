            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzqk implements zzqj {
                public static final zzkl zza;
                public static final zzkl zzb;
                public static final zzkl zzc;
                public static final zzkl zzd;
                public static final zzkl zze;
                public static final zzkl zzf;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 27 */            zza = zzkfVarZzb.zzd("measurement.test.boolean_flag", false);
/* 37 */            zzb = zzkfVarZzb.zzc("measurement.test.cached_long_flag", -1L);
/* 47 */            zzc = zzkfVarZzb.zze("measurement.test.double_flag", -3.0d);
/* 57 */            zzd = zzkfVarZzb.zzc("measurement.test.int_flag", -2L);
/* 65 */            zze = zzkfVarZzb.zzc("measurement.test.long_flag", -1L);
/* 75 */            zzf = zzkfVarZzb.zzf("measurement.test.string_flag", "---");
                }

                @Override // com.google.android.gms.internal.measurement.zzqj
                public final boolean zza() {
/* 9 */             return ((Boolean) zza.zzd()).booleanValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzqj
                public final long zzb() {
/* 9 */             return ((Long) zzb.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzqj
                public final double zzc() {
/* 9 */             return ((Double) zzc.zzd()).doubleValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzqj
                public final long zzd() {
/* 9 */             return ((Long) zzd.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzqj
                public final long zze() {
/* 9 */             return ((Long) zze.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzqj
                public final String zzf() {
/* 7 */             return (String) zzf.zzd();
                }
            }
