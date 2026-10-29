            package com.google.android.gms.internal.measurement;

            import com.appsflyer.attribution.RequestError;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzax extends zzav {
                public zzax() {
/* 8 */             this.zza.add(zzbk.EQUALS);
/* 15 */            this.zza.add(zzbk.GREATER_THAN);
/* 22 */            this.zza.add(zzbk.GREATER_THAN_EQUALS);
/* 29 */            this.zza.add(zzbk.IDENTITY_EQUALS);
/* 36 */            this.zza.add(zzbk.IDENTITY_NOT_EQUALS);
/* 43 */            this.zza.add(zzbk.LESS_THAN);
/* 50 */            this.zza.add(zzbk.LESS_THAN_EQUALS);
/* 57 */            this.zza.add(zzbk.NOT_EQUALS);
                }

                private static boolean zzc(zzao zzaoVar, zzao zzaoVar2) {
/* 3 */             if (zzaoVar instanceof zzak) {
/* 11 */                zzaoVar = new zzas(zzaoVar.zzc());
                    }
/* 17 */            if (zzaoVar2 instanceof zzak) {
/* 25 */                zzaoVar2 = new zzas(zzaoVar2.zzc());
                    }
/* 33 */            if ((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) {
                        return zzaoVar.zzc().compareTo(zzaoVar2.zzc()) < 0;
                    }
/* 60 */            double dDoubleValue = zzaoVar.zzd().doubleValue();
/* 68 */            double dDoubleValue2 = zzaoVar2.zzd().doubleValue();
                    return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
                }

                private static boolean zzd(zzao zzaoVar, zzao zzaoVar2) {
/* 15 */            if (zzaoVar.getClass().equals(zzaoVar2.getClass())) {
/* 19 */                if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
/* 14 */                    return true;
                        }
/* 28 */                if (zzaoVar instanceof zzah) {
                            return (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()) || zzaoVar.zzd().doubleValue() != zzaoVar2.zzd().doubleValue()) ? false : true;
                        }
/* 83 */                if (zzaoVar instanceof zzas) {
/* 93 */                    return zzaoVar.zzc().equals(zzaoVar2.zzc());
                        }
/* 100 */               if (zzaoVar instanceof zzaf) {
/* 110 */                   return zzaoVar.zze().equals(zzaoVar2.zze());
                        }
                        return zzaoVar == zzaoVar2;
                    }
/* 122 */           if (((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) && ((zzaoVar2 instanceof zzat) || (zzaoVar2 instanceof zzam))) {
/* 14 */                return true;
                    }
/* 136 */           boolean z = zzaoVar instanceof zzah;
/* 138 */           if (z && (zzaoVar2 instanceof zzas)) {
/* 154 */               return zzd(zzaoVar, new zzah(zzaoVar2.zzd()));
                    }
/* 159 */           boolean z2 = zzaoVar instanceof zzas;
/* 161 */           if (z2 && (zzaoVar2 instanceof zzah)) {
/* 177 */               return zzd(new zzah(zzaoVar.zzd()), zzaoVar2);
                    }
/* 184 */           if (zzaoVar instanceof zzaf) {
/* 195 */               return zzd(new zzah(zzaoVar.zzd()), zzaoVar2);
                    }
/* 202 */           if (zzaoVar2 instanceof zzaf) {
/* 213 */               return zzd(zzaoVar, new zzah(zzaoVar2.zzd()));
                    }
/* 218 */           if ((z2 || z) && (zzaoVar2 instanceof zzak)) {
/* 262 */               return zzd(zzaoVar, new zzas(zzaoVar2.zzc()));
                    }
/* 228 */           if ((zzaoVar instanceof zzak) && ((zzaoVar2 instanceof zzas) || (zzaoVar2 instanceof zzah))) {
/* 247 */               return zzd(new zzas(zzaoVar.zzc()), zzaoVar2);
                    }
/* 13 */            return false;
                }

                private static boolean zze(zzao zzaoVar, zzao zzaoVar2) {
/* 3 */             if (zzaoVar instanceof zzak) {
/* 11 */                zzaoVar = new zzas(zzaoVar.zzc());
                    }
/* 17 */            if (zzaoVar2 instanceof zzak) {
/* 25 */                zzaoVar2 = new zzas(zzaoVar2.zzc());
                    }
                    return (((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) || !(Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()))) && !zzc(zzaoVar2, zzaoVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzav
                public final zzao zza(String str, zzg zzgVar, List list) {
                    boolean zZzd;
                    boolean zZzd2;
/* 10 */            zzh.zza(zzh.zze(str).name(), 2, list);
/* 20 */            zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
/* 31 */            zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
/* 39 */            int iOrdinal = zzh.zze(str).ordinal();
/* 45 */            if (iOrdinal != 23) {
/* 49 */                if (iOrdinal == 48) {
/* 98 */                    zZzd2 = zzd(zzaoVarZza, zzaoVarZza2);
                        } else if (iOrdinal == 42) {
/* 93 */                    zZzd = zzc(zzaoVarZza, zzaoVarZza2);
                        } else if (iOrdinal != 43) {
                            switch (iOrdinal) {
                                case 37:
/* 83 */                            zZzd = zzc(zzaoVarZza2, zzaoVarZza);
                                    break;
                                case 38:
/* 78 */                            zZzd = zze(zzaoVarZza2, zzaoVarZza);
                                    break;
                                case 39:
/* 73 */                            zZzd = zzh.zzf(zzaoVarZza, zzaoVarZza2);
                                    break;
                                case RequestError.NETWORK_FAILURE /* 40 */:
/* 67 */                            zZzd2 = zzh.zzf(zzaoVarZza, zzaoVarZza2);
                                    break;
                                default:
/* 62 */                            return zzb(str);
                            }
                        } else {
/* 88 */                    zZzd = zze(zzaoVarZza, zzaoVarZza2);
                        }
/* 71 */                zZzd = !zZzd2;
                    } else {
/* 103 */               zZzd = zzd(zzaoVarZza, zzaoVarZza2);
                    }
                    return zZzd ? zzao.zzk : zzao.zzl;
                }
            }
