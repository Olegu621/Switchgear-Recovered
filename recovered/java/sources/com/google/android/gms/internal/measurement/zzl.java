            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzl extends zzal {
                private final zzab zzb;

                public zzl(zzab zzabVar) {
/* 4 */             this.zzb = zzabVar;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzao
                public final zzao zzcA(String str, zzg zzgVar, List list) {
                    switch (str.hashCode()) {
                        case 21624207:
/* 266 */                   if (str.equals("getEventName")) {
/* 268 */                       zzh.zza("getEventName", 0, list);
/* 283 */                       return new zzas(this.zzb.zzc().zzb());
                            }
                            break;
                        case 45521504:
/* 234 */                   if (str.equals("getTimestamp")) {
/* 236 */                       zzh.zza("getTimestamp", 0, list);
/* 256 */                       return new zzah(Double.valueOf(this.zzb.zzc().zza()));
                            }
                            break;
                        case 146575578:
/* 194 */                   if (str.equals("getParamValue")) {
/* 196 */                       zzh.zza("getParamValue", 1, list);
/* 223 */                       return zzi.zza(this.zzb.zzc().zze(zzgVar.zza((zzao) list.get(0)).zzc()));
                            }
                            break;
                        case 700587132:
/* 135 */                   if (str.equals("getParams")) {
/* 137 */                       zzh.zza("getParams", 0, list);
/* 146 */                       Map mapZzf = this.zzb.zzc().zzf();
/* 152 */                       zzal zzalVar = new zzal();
/* 167 */                       for (String str2 : mapZzf.keySet()) {
/* 183 */                           zzalVar.zzm(str2, zzi.zza(mapZzf.get(str2)));
                                }
/* 187 */                       return zzalVar;
                            }
                            break;
                        case 920706790:
/* 85 */                    if (str.equals("setParamValue")) {
/* 88 */                        zzh.zza("setParamValue", 2, list);
/* 101 */                       String strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
/* 111 */                       zzao zzaoVarZza = zzgVar.zza((zzao) list.get(1));
/* 125 */                       this.zzb.zzc().zzd(strZzc, zzh.zzj(zzaoVarZza));
/* 128 */                       return zzaoVarZza;
                            }
                            break;
                        case 1570616835:
/* 18 */                    if (str.equals("setEventName")) {
/* 20 */                        zzh.zza("setEventName", 1, list);
/* 29 */                        zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
/* 39 */                        if (zzao.zzf.equals(zzaoVarZza2) || zzao.zzg.equals(zzaoVarZza2)) {
/* 74 */                            C1951n4.m6859j("Illegal event name");
/* 77 */                            return null;
                                }
/* 59 */                        this.zzb.zzc().zzc(zzaoVarZza2.zzc());
/* 68 */                        return new zzas(zzaoVarZza2.zzc());
                            }
                            break;
                    }
/* 287 */           return super.zzcA(str, zzgVar, list);
                }
            }
