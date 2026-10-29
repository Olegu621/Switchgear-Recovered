            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.Map;
            import p000.f42;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zztw implements zzug {
                private final zzts zza;
                private final zzuv zzb;
                private final boolean zzc;
                private final zzrz zzd;

                private zztw(zzuv zzuvVar, zzrz zzrzVar, zzts zztsVar) {
/* 4 */             this.zzb = zzuvVar;
/* 8 */             this.zzc = zztsVar instanceof zzsk;
/* 10 */            this.zzd = zzrzVar;
/* 12 */            this.zza = zztsVar;
                }

                public static zztw zzc(zzuv zzuvVar, zzrz zzrzVar, zzts zztsVar) {
/* 3 */             return new zztw(zzuvVar, zzrzVar, zztsVar);
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final int zza(Object obj) {
/* 6 */             int iZzb = ((zzsn) obj).zzc.zzb();
                    return this.zzc ? iZzb + ((zzsk) obj).zzb.zzb() : iZzb;
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final int zzb(Object obj) {
/* 6 */             int iHashCode = ((zzsn) obj).zzc.hashCode();
                    return this.zzc ? (iHashCode * 53) + ((zzsk) obj).zzb.zza.hashCode() : iHashCode;
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final Object zze() {
/* 1 */             zzts zztsVar = this.zza;
                    return zztsVar instanceof zzsn ? ((zzsn) zztsVar).zzv() : zztsVar.zzaf().zzl();
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzf(Object obj) {
/* 3 */             this.zzb.zzi(obj);
/* 8 */             this.zzd.zza(obj);
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzg(Object obj, Object obj2) {
/* 3 */             zzui.zzq(this.zzb, obj, obj2);
/* 8 */             if (this.zzc) {
/* 12 */                zzui.zzp(this.zzd, obj, obj2);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) throws IOException {
                    boolean zZzO;
/* 1 */             zzuv zzuvVar = this.zzb;
/* 3 */             Object objZza = zzuvVar.zza(obj);
/* 10 */            ((zzsk) obj).zzi();
/* 20 */            while (zzufVar.zzc() != Integer.MAX_VALUE) {
                        try {
/* 23 */                    int iZzd = zzufVar.zzd();
/* 29 */                    int iZzj = 0;
/* 31 */                    if (iZzd != 11) {
/* 36 */                        if ((iZzd & 7) != 2) {
/* 56 */                            zZzO = zzufVar.zzO();
                                } else {
/* 46 */                            if (zzryVar.zza(this.zza, iZzd >>> 3) != null) {
/* 55 */                                throw null;
                                    }
/* 48 */                            zZzO = zzuvVar.zzk(objZza, zzufVar, 0);
                                }
/* 60 */                        if (!zZzO) {
                                    break;
                                }
                            } else {
/* 67 */                        zzsm zzsmVarZza = null;
/* 68 */                        zzqm zzqmVarZzp = null;
/* 75 */                        while (zzufVar.zzc() != Integer.MAX_VALUE) {
/* 78 */                            int iZzd2 = zzufVar.zzd();
/* 84 */                            if (iZzd2 == 16) {
/* 86 */                                iZzj = zzufVar.zzj();
/* 92 */                                zzsmVarZza = zzryVar.zza(this.zza, iZzj);
                                    } else if (iZzd2 == 26) {
/* 101 */                               if (zzsmVarZza != null) {
/* 108 */                                   throw null;
                                        }
/* 103 */                               zzqmVarZzp = zzufVar.zzp();
                                    } else if (iZzd2 == 12 || !zzufVar.zzO()) {
                                        break;
                                    }
                                }
/* 121 */                       if (zzufVar.zzd() != 12) {
/* 139 */                           throw new zzsx("Protocol message end-group tag did not match expected tag.");
                                }
/* 123 */                       if (zzqmVarZzp == null) {
                                    continue;
                                } else {
/* 125 */                           if (zzsmVarZza != null) {
/* 131 */                               throw null;
                                    }
/* 127 */                           zzuvVar.zzg(objZza, iZzj, zzqmVarZzp);
                                }
                            }
                        } catch (Throwable th) {
/* 140 */                   zzuvVar.zzj(obj, objZza);
/* 143 */                   throw th;
                        }
                    }
/* 63 */            zzuvVar.zzj(obj, objZza);
                }

                /* JADX WARN: Code duplicated, block: B:33:0x0085  */
                /* JADX WARN: Code duplicated, block: B:58:0x008b A[EDGE_INSN: B:58:0x008b->B:35:0x008b BREAK  A[LOOP:1: B:18:0x004e->B:63:0x004e], SYNTHETIC] */
                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzi(Object obj, byte[] bArr, int i, int i2, zzqb zzqbVar) throws IOException {
                    int iZzi;
/* 2 */             zzsn zzsnVar = (zzsn) obj;
/* 4 */             zzuw zzuwVarZzf = zzsnVar.zzc;
/* 10 */            if (zzuwVarZzf == zzuw.zzc()) {
/* 12 */                zzuwVarZzf = zzuw.zzf();
/* 16 */                zzsnVar.zzc = zzuwVarZzf;
                    }
/* 18 */            zzuw zzuwVar = zzuwVarZzf;
/* 21 */            ((zzsk) obj).zzi();
/* 25 */            zzsm zzsmVarZza = null;
/* 26 */            while (i < i2) {
/* 28 */                int iZzi2 = zzqc.zzi(bArr, i, zzqbVar);
/* 32 */                int i3 = zzqbVar.zza;
/* 37 */                if (i3 == 11) {
/* 74 */                    byte[] bArr2 = bArr;
/* 75 */                    int i4 = i2;
/* 76 */                    zzqb zzqbVar2 = zzqbVar;
/* 77 */                    int i5 = 0;
/* 78 */                    zzqm zzqmVar = null;
                            while (true) {
/* 79 */                        if (iZzi2 >= i4) {
/* 139 */                           iZzi = iZzi2;
                                    break;
                                }
/* 81 */                        iZzi = zzqc.zzi(bArr2, iZzi2, zzqbVar2);
/* 85 */                        int i6 = zzqbVar2.zza;
/* 87 */                        int i7 = i6 >>> 3;
/* 89 */                        int i8 = i6 & 7;
/* 91 */                        if (i7 == 2) {
/* 113 */                           if (i8 != 0) {
/* 132 */                               if (i6 != 12) {
                                            break;
                                            break;
                                        }
/* 134 */                               iZzi2 = zzqc.zzo(i6, bArr2, iZzi, i4, zzqbVar2);
                                    } else {
/* 115 */                               iZzi2 = zzqc.zzi(bArr2, iZzi, zzqbVar2);
/* 119 */                               i5 = zzqbVar2.zza;
/* 125 */                               zzsmVarZza = zzqbVar2.zzd.zza(this.zza, i5);
                                    }
                                } else {
/* 94 */                            if (i7 == 3) {
/* 97 */                                if (zzsmVarZza != null) {
/* 110 */                                   int i9 = zzuc.zza;
/* 112 */                                   throw null;
                                        }
/* 99 */                                if (i8 == 2) {
/* 101 */                                   iZzi2 = zzqc.zza(bArr2, iZzi, zzqbVar2);
/* 107 */                                   zzqmVar = (zzqm) zzqbVar2.zzc;
                                        }
                                    }
/* 132 */                           if (i6 != 12) {
                                        break;
                                    } else {
/* 134 */                               iZzi2 = zzqc.zzo(i6, bArr2, iZzi, i4, zzqbVar2);
                                    }
                                }
                            }
/* 140 */                   if (zzqmVar != null) {
/* 145 */                       zzuwVar.zzj((i5 << 3) | 2, zzqmVar);
                            }
/* 148 */                   i = iZzi;
/* 149 */                   bArr = bArr2;
/* 150 */                   i2 = i4;
/* 151 */                   zzqbVar = zzqbVar2;
                        } else if ((i3 & 7) == 2) {
/* 49 */                    zzsmVarZza = zzqbVar.zzd.zza(this.zza, i3 >>> 3);
/* 53 */                    if (zzsmVarZza != null) {
/* 63 */                        int i10 = zzuc.zza;
/* 65 */                        throw null;
                            }
/* 58 */                    i = zzqc.zzh(i3, bArr, iZzi2, i2, zzuwVar, zzqbVar);
                        } else {
/* 69 */                    i = zzqc.zzo(i3, bArr, iZzi2, i2, zzqbVar);
                        }
                    }
/* 154 */           if (i == i2) {
/* 156 */               return;
                    }
/* 159 */           pk3.m7475k("Failed to parse the message.");
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzj(Object obj, zzvi zzviVar) throws IOException {
/* 6 */             Iterator itZzf = ((zzsk) obj).zzb.zzf();
/* 14 */            while (itZzf.hasNext()) {
/* 20 */                Map.Entry entry = (Map.Entry) itZzf.next();
/* 26 */                zzsc zzscVar = (zzsc) entry.getKey();
/* 34 */                if (zzscVar.zze() != zzvh.MESSAGE) {
/* 78 */                    f42.m3656l("Found invalid MessageSet item.");
/* 81 */                    return;
                        }
/* 36 */                zzscVar.zzg();
/* 39 */                zzscVar.zzf();
/* 44 */                if (entry instanceof zzsz) {
/* 60 */                    zzviVar.zzw(zzscVar.zza(), ((zzsz) entry).zza().zzb());
                        } else {
/* 72 */                    zzviVar.zzw(zzscVar.zza(), entry.getValue());
                        }
                    }
/* 86 */            ((zzsn) obj).zzc.zzk(zzviVar);
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final boolean zzk(Object obj, Object obj2) {
/* 15 */            if (!((zzsn) obj).zzc.equals(((zzsn) obj2).zzc)) {
/* 17 */                return false;
                    }
/* 21 */            if (this.zzc) {
/* 31 */                return ((zzsk) obj).zzb.equals(((zzsk) obj2).zzb);
                    }
/* 36 */            return true;
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final boolean zzl(Object obj) {
/* 5 */             return ((zzsk) obj).zzb.zzk();
                }
            }
