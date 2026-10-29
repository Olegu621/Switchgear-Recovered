            package com.google.android.gms.internal.drive;

            import java.io.IOException;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 183 */   final class zzlw<T> implements zzmf<T> {
                private final zzlq zzuh;
                private final boolean zzui;
                private final zzmx<?, ?> zzur;
                private final zzjy<?> zzus;

                private zzlw(zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzlq zzlqVar) {
/* 4 */             this.zzur = zzmxVar;
/* 10 */            this.zzui = zzjyVar.zze(zzlqVar);
/* 12 */            this.zzus = zzjyVar;
/* 14 */            this.zzuh = zzlqVar;
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final boolean equals(T t, T t2) {
/* 17 */            if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
/* 19 */                return false;
                    }
/* 23 */            if (this.zzui) {
/* 37 */                return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
                    }
/* 42 */            return true;
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final int hashCode(T t) {
/* 7 */             int iHashCode = this.zzur.zzr(t).hashCode();
                    return this.zzui ? (iHashCode * 53) + this.zzus.zzb(t).hashCode() : iHashCode;
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final T newInstance() {
/* 7 */             return (T) this.zzuh.zzcz().zzde();
                }

                /* JADX WARN: Code duplicated, block: B:33:0x009b  */
                /* JADX WARN: Code duplicated, block: B:58:0x00a1 A[EDGE_INSN: B:58:0x00a1->B:35:0x00a1 BREAK  A[LOOP:1: B:18:0x0059->B:63:0x0059], SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.drive.zzmf
                public final void zza(T t, byte[] bArr, int i, int i2, zziz zzizVar) throws IOException {
                    int iZza;
/* 2 */             zzkk zzkkVar = (zzkk) t;
/* 4 */             zzmy zzmyVarZzfb = zzkkVar.zzrq;
/* 10 */            if (zzmyVarZzfb == zzmy.zzfa()) {
/* 12 */                zzmyVarZzfb = zzmy.zzfb();
/* 16 */                zzkkVar.zzrq = zzmyVarZzfb;
                    }
/* 18 */            zzmy zzmyVar = zzmyVarZzfb;
/* 21 */            ((zzkk.zzc) t).zzdg();
/* 25 */            zzkk.zzd zzdVar = null;
/* 26 */            while (i < i2) {
/* 28 */                int iZza2 = zziy.zza(bArr, i, zzizVar);
/* 32 */                int i3 = zzizVar.zznk;
/* 37 */                if (i3 == 11) {
/* 85 */                    byte[] bArr2 = bArr;
/* 86 */                    int i4 = i2;
/* 87 */                    zziz zzizVar2 = zzizVar;
/* 88 */                    int i5 = 0;
/* 89 */                    zzjc zzjcVar = null;
                            while (true) {
/* 90 */                        if (iZza2 >= i4) {
/* 161 */                           iZza = iZza2;
                                    break;
                                }
/* 92 */                        iZza = zziy.zza(bArr2, iZza2, zzizVar2);
/* 96 */                        int i6 = zzizVar2.zznk;
/* 98 */                        int i7 = i6 >>> 3;
/* 100 */                       int i8 = i6 & 7;
/* 102 */                       if (i7 == 2) {
/* 130 */                           if (i8 != 0) {
/* 154 */                               if (i6 != 12) {
                                            break;
                                            break;
                                        }
/* 156 */                               iZza2 = zziy.zza(i6, bArr2, iZza, i4, zzizVar2);
                                    } else {
/* 132 */                               iZza2 = zziy.zza(bArr2, iZza, zzizVar2);
/* 136 */                               i5 = zzizVar2.zznk;
/* 149 */                               zzdVar = (zzkk.zzd) this.zzus.zza(zzizVar2.zznn, this.zzuh, i5);
                                    }
                                } else {
/* 105 */                           if (i7 == 3) {
/* 108 */                               if (zzdVar != null) {
/* 121 */                                   zzmd.zzej();
/* 129 */                                   throw new NoSuchMethodError();
                                        }
/* 110 */                               if (i8 == 2) {
/* 112 */                                   iZza2 = zziy.zze(bArr2, iZza, zzizVar2);
/* 118 */                                   zzjcVar = (zzjc) zzizVar2.zznm;
                                        }
                                    }
/* 154 */                           if (i6 != 12) {
                                        break;
                                    } else {
/* 156 */                               iZza2 = zziy.zza(i6, bArr2, iZza, i4, zzizVar2);
                                    }
                                }
                            }
/* 162 */                   if (zzjcVar != null) {
/* 167 */                       zzmyVar.zzb((i5 << 3) | 2, zzjcVar);
                            }
/* 170 */                   i = iZza;
/* 171 */                   bArr = bArr2;
/* 172 */                   i2 = i4;
/* 173 */                   zzizVar = zzizVar2;
                        } else if ((i3 & 7) == 2) {
/* 56 */                    zzdVar = (zzkk.zzd) this.zzus.zza(zzizVar.zznn, this.zzuh, i3 >>> 3);
/* 58 */                    if (zzdVar != null) {
/* 68 */                        zzmd.zzej();
/* 76 */                        throw new NoSuchMethodError();
                            }
/* 63 */                    i = zziy.zza(i3, bArr, iZza2, i2, zzmyVar, zzizVar);
                        } else {
/* 80 */                    i = zziy.zza(i3, bArr, iZza2, i2, zzizVar);
                        }
                    }
/* 177 */           if (i != i2) {
/* 184 */               throw zzkq.zzdm();
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final void zzc(T t, T t2) {
/* 3 */             zzmh.zza(this.zzur, t, t2);
/* 8 */             if (this.zzui) {
/* 12 */                zzmh.zza(this.zzus, t, t2);
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final void zzd(T t) {
/* 3 */             this.zzur.zzd(t);
/* 8 */             this.zzus.zzd(t);
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final int zzn(T t) {
/* 1 */             zzmx<?, ?> zzmxVar = this.zzur;
/* 7 */             int iZzs = zzmxVar.zzs(zzmxVar.zzr(t));
                    return this.zzui ? iZzs + this.zzus.zzb(t).zzco() : iZzs;
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final boolean zzp(T t) {
/* 7 */             return this.zzus.zzb(t).isInitialized();
                }

                @Override // com.google.android.gms.internal.drive.zzmf
/* 184 */       public final void zza(T t, zzns zznsVar) throws IOException {
/* 187 */           for (T t2 : this.zzus.zzb(t)) {
/* 189 */               zzkd zzkdVar = (zzkd) t2.getKey();
/* 190 */               if (zzkdVar.zzcr() == zznr.MESSAGE && !zzkdVar.zzcs() && !zzkdVar.zzct()) {
/* 191 */                   if (t2 instanceof zzkv) {
/* 193 */                       zznsVar.zza(zzkdVar.zzcp(), (Object) ((zzkv) t2).zzdq().zzbl());
                            } else {
/* 194 */                       zznsVar.zza(zzkdVar.zzcp(), t2.getValue());
                            }
                        } else {
/* 195 */                   f42.m3656l("Found invalid MessageSet item.");
                            return;
                        }
                    }
/* 196 */           zzmx<?, ?> zzmxVar = this.zzur;
/* 197 */           zzmxVar.zzc(zzmxVar.zzr(t), zznsVar);
                }

/* 197 */       public static <T> zzlw<T> zza(zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzlq zzlqVar) {
/* 198 */           return new zzlw<>(zzmxVar, zzjyVar, zzlqVar);
                }
            }
