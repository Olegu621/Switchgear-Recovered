            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.util.List;
            import p000.AbstractC0208c9;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzqr implements zzuf {
                private final zzqq zza;
                private int zzb;
                private int zzc;
                private int zzd = 0;

                private zzqr(zzqq zzqqVar) {
/* 7 */             byte[] bArr = zzsv.zzb;
/* 9 */             this.zza = zzqqVar;
/* 11 */            zzqqVar.zzd = this;
                }

                private final void zzP(Object obj, zzug zzugVar, zzry zzryVar) throws IOException {
/* 1 */             int i = this.zzc;
/* 11 */            this.zzc = ((this.zzb >>> 3) << 3) | 4;
                    try {
/* 13 */                zzugVar.zzh(obj, this, zzryVar);
/* 20 */                if (this.zzb != this.zzc) {
/* 32 */                    throw new zzsx("Failed to parse the message.");
                        }
/* 22 */                this.zzc = i;
                    } catch (Throwable th) {
/* 34 */                this.zzc = i;
/* 36 */                throw th;
                    }
                }

                private final void zzQ(Object obj, zzug zzugVar, zzry zzryVar) throws IOException {
/* 1 */             zzqq zzqqVar = this.zza;
/* 3 */             int iZzn = zzqqVar.zzn();
/* 7 */             zzqqVar.zzI();
/* 10 */            int iZze = zzqqVar.zze(iZzn);
/* 18 */            zzqqVar.zza++;
/* 20 */            zzugVar.zzh(obj, this, zzryVar);
/* 24 */            zzqqVar.zzz(0);
/* 31 */            zzqqVar.zza--;
/* 33 */            zzqqVar.zzA(iZze);
                }

                private final void zzR(int i) throws IOException {
/* 7 */             if (this.zza.zzd() == i) {
/* 9 */                 return;
                    }
/* 12 */            pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }

                private final void zzS(int i) throws IOException {
/* 5 */             if ((this.zzb & 7) == i) {
/* 7 */                 return;
                    }
/* 8 */             pk3.m7465a();
                }

                private static final void zzT(int i) throws IOException {
/* 3 */             if ((i & 3) == 0) {
/* 5 */                 return;
                    }
/* 8 */             pk3.m7475k("Failed to parse the message.");
                }

                private static final void zzU(int i) throws IOException {
/* 3 */             if ((i & 7) == 0) {
/* 5 */                 return;
                    }
/* 8 */             pk3.m7475k("Failed to parse the message.");
                }

                public static zzqr zzq(zzqq zzqqVar) {
/* 1 */             zzqr zzqrVar = zzqqVar.zzd;
                    return zzqrVar != null ? zzqrVar : new zzqr(zzqqVar);
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzA(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzth;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzth zzthVar = (zzth) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 != 1) {
/* 16 */                    if (i2 != 2) {
/* 46 */                        pk3.m7465a();
/* 49 */                        return;
                            }
/* 18 */                    zzqq zzqqVar = this.zza;
/* 20 */                    int iZzn = zzqqVar.zzn();
/* 24 */                    zzU(iZzn);
/* 31 */                    int iZzd = zzqqVar.zzd() + iZzn;
/* 43 */                    do {
/* 36 */                        zzthVar.zzg(zzqqVar.zzo());
/* 43 */                    } while (zzqqVar.zzd() < iZzd);
/* 147 */                   return;
                        }
/* 72 */                do {
/* 50 */                    zzqq zzqqVar2 = this.zza;
/* 56 */                    zzthVar.zzg(zzqqVar2.zzo());
/* 63 */                    if (zzqqVar2.zzC()) {
/* 147 */                       return;
                            } else {
/* 66 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 72 */                } while (iZzm2 == this.zzb);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 113 */                       pk3.m7465a();
/* 116 */                       return;
                            }
/* 81 */                    zzqq zzqqVar3 = this.zza;
/* 83 */                    int iZzn2 = zzqqVar3.zzn();
/* 87 */                    zzU(iZzn2);
/* 94 */                    int iZzd2 = zzqqVar3.zzd() + iZzn2;
/* 110 */                   do {
/* 103 */                       list.add(Long.valueOf(zzqqVar3.zzo()));
/* 110 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 147 */                   return;
                        }
/* 142 */               do {
/* 117 */                   zzqq zzqqVar4 = this.zza;
/* 127 */                   list.add(Long.valueOf(zzqqVar4.zzo()));
/* 134 */                   if (zzqqVar4.zzC()) {
/* 147 */                       return;
                            } else {
/* 136 */                       iZzm = zzqqVar4.zzm();
                            }
/* 142 */               } while (iZzm == this.zzb);
/* 144 */               iZzm2 = iZzm;
                    }
/* 145 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzB(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzsf;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzsf zzsfVar = (zzsf) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 == 2) {
/* 48 */                    zzqq zzqqVar = this.zza;
/* 50 */                    int iZzn = zzqqVar.zzn();
/* 54 */                    zzT(iZzn);
/* 61 */                    int iZzd = zzqqVar.zzd() + iZzn;
/* 74 */                    do {
/* 67 */                        zzsfVar.zzf(zzqqVar.zzc());
/* 74 */                    } while (zzqqVar.zzd() < iZzd);
/* 149 */                   return;
                        }
/* 16 */                if (i2 != 5) {
/* 44 */                    pk3.m7465a();
/* 47 */                    return;
                        }
/* 41 */                do {
/* 18 */                    zzqq zzqqVar2 = this.zza;
/* 24 */                    zzsfVar.zzf(zzqqVar2.zzc());
/* 31 */                    if (zzqqVar2.zzC()) {
/* 149 */                       return;
                            } else {
/* 35 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 41 */                } while (iZzm2 == this.zzb);
                    } else {
/* 77 */                int i3 = i & 7;
/* 79 */                if (i3 == 2) {
/* 118 */                   zzqq zzqqVar3 = this.zza;
/* 120 */                   int iZzn2 = zzqqVar3.zzn();
/* 124 */                   zzT(iZzn2);
/* 131 */                   int iZzd2 = zzqqVar3.zzd() + iZzn2;
/* 147 */                   do {
/* 140 */                       list.add(Float.valueOf(zzqqVar3.zzc()));
/* 147 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 149 */                   return;
                        }
/* 81 */                if (i3 != 5) {
/* 114 */                   pk3.m7465a();
/* 117 */                   return;
                        }
/* 108 */               do {
/* 83 */                    zzqq zzqqVar4 = this.zza;
/* 93 */                    list.add(Float.valueOf(zzqqVar4.zzc()));
/* 100 */                   if (zzqqVar4.zzC()) {
/* 149 */                       return;
                            } else {
/* 102 */                       iZzm = zzqqVar4.zzm();
                            }
/* 108 */               } while (iZzm == this.zzb);
/* 110 */               iZzm2 = iZzm;
                    }
/* 111 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                @Deprecated
                public final void zzC(List list, zzug zzugVar, zzry zzryVar) throws IOException {
                    int iZzm;
/* 1 */             int i = this.zzb;
/* 6 */             if ((i & 7) != 3) {
/* 43 */                pk3.m7465a();
/* 46 */                return;
                    }
/* 38 */            do {
/* 8 */                 Object objZze = zzugVar.zze();
/* 12 */                zzP(objZze, zzugVar, zzryVar);
/* 15 */                zzugVar.zzf(objZze);
/* 18 */                list.add(objZze);
/* 21 */                zzqq zzqqVar = this.zza;
/* 27 */                if (zzqqVar.zzC() || this.zzd != 0) {
/* 42 */                    return;
                        } else {
/* 34 */                    iZzm = zzqqVar.zzm();
                        }
/* 38 */            } while (iZzm == i);
/* 40 */            this.zzd = iZzm;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzD(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzso;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzso zzsoVar = (zzso) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        pk3.m7465a();
/* 48 */                        return;
                            }
/* 17 */                    zzqq zzqqVar = this.zza;
/* 27 */                    int iZzd = zzqqVar.zzd() + zzqqVar.zzn();
/* 39 */                    do {
/* 32 */                        zzsoVar.zzh(zzqqVar.zzh());
/* 39 */                    } while (zzqqVar.zzd() < iZzd);
/* 41 */                    zzR(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzqq zzqqVar2 = this.zza;
/* 55 */                    zzsoVar.zzh(zzqqVar2.zzh());
/* 62 */                    if (zzqqVar2.zzC()) {
/* 146 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       pk3.m7465a();
/* 115 */                       return;
                            }
/* 80 */                    zzqq zzqqVar3 = this.zza;
/* 90 */                    int iZzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Integer.valueOf(zzqqVar3.zzh()));
/* 106 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 108 */                   zzR(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzqq zzqqVar4 = this.zza;
/* 126 */                   list.add(Integer.valueOf(zzqqVar4.zzh()));
/* 133 */                   if (zzqqVar4.zzC()) {
/* 146 */                       return;
                            } else {
/* 135 */                       iZzm = zzqqVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzE(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzth;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzth zzthVar = (zzth) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        pk3.m7465a();
/* 48 */                        return;
                            }
/* 17 */                    zzqq zzqqVar = this.zza;
/* 27 */                    int iZzd = zzqqVar.zzd() + zzqqVar.zzn();
/* 39 */                    do {
/* 32 */                        zzthVar.zzg(zzqqVar.zzp());
/* 39 */                    } while (zzqqVar.zzd() < iZzd);
/* 41 */                    zzR(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzqq zzqqVar2 = this.zza;
/* 55 */                    zzthVar.zzg(zzqqVar2.zzp());
/* 62 */                    if (zzqqVar2.zzC()) {
/* 146 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       pk3.m7465a();
/* 115 */                       return;
                            }
/* 80 */                    zzqq zzqqVar3 = this.zza;
/* 90 */                    int iZzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Long.valueOf(zzqqVar3.zzp()));
/* 106 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 108 */                   zzR(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzqq zzqqVar4 = this.zza;
/* 126 */                   list.add(Long.valueOf(zzqqVar4.zzp()));
/* 133 */                   if (zzqqVar4.zzC()) {
/* 146 */                       return;
                            } else {
/* 135 */                       iZzm = zzqqVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzF(List list, zzug zzugVar, zzry zzryVar) throws IOException {
                    int iZzm;
/* 1 */             int i = this.zzb;
/* 6 */             if ((i & 7) != 2) {
/* 43 */                pk3.m7465a();
/* 46 */                return;
                    }
/* 38 */            do {
/* 8 */                 Object objZze = zzugVar.zze();
/* 12 */                zzQ(objZze, zzugVar, zzryVar);
/* 15 */                zzugVar.zzf(objZze);
/* 18 */                list.add(objZze);
/* 21 */                zzqq zzqqVar = this.zza;
/* 27 */                if (zzqqVar.zzC() || this.zzd != 0) {
/* 42 */                    return;
                        } else {
/* 34 */                    iZzm = zzqqVar.zzm();
                        }
/* 38 */            } while (iZzm == i);
/* 40 */            this.zzd = iZzm;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzG(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzso;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzso zzsoVar = (zzso) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 == 2) {
/* 48 */                    zzqq zzqqVar = this.zza;
/* 50 */                    int iZzn = zzqqVar.zzn();
/* 54 */                    zzT(iZzn);
/* 61 */                    int iZzd = zzqqVar.zzd() + iZzn;
/* 74 */                    do {
/* 67 */                        zzsoVar.zzh(zzqqVar.zzk());
/* 74 */                    } while (zzqqVar.zzd() < iZzd);
/* 149 */                   return;
                        }
/* 16 */                if (i2 != 5) {
/* 44 */                    pk3.m7465a();
/* 47 */                    return;
                        }
/* 41 */                do {
/* 18 */                    zzqq zzqqVar2 = this.zza;
/* 24 */                    zzsoVar.zzh(zzqqVar2.zzk());
/* 31 */                    if (zzqqVar2.zzC()) {
/* 149 */                       return;
                            } else {
/* 35 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 41 */                } while (iZzm2 == this.zzb);
                    } else {
/* 77 */                int i3 = i & 7;
/* 79 */                if (i3 == 2) {
/* 118 */                   zzqq zzqqVar3 = this.zza;
/* 120 */                   int iZzn2 = zzqqVar3.zzn();
/* 124 */                   zzT(iZzn2);
/* 131 */                   int iZzd2 = zzqqVar3.zzd() + iZzn2;
/* 147 */                   do {
/* 140 */                       list.add(Integer.valueOf(zzqqVar3.zzk()));
/* 147 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 149 */                   return;
                        }
/* 81 */                if (i3 != 5) {
/* 114 */                   pk3.m7465a();
/* 117 */                   return;
                        }
/* 108 */               do {
/* 83 */                    zzqq zzqqVar4 = this.zza;
/* 93 */                    list.add(Integer.valueOf(zzqqVar4.zzk()));
/* 100 */                   if (zzqqVar4.zzC()) {
/* 149 */                       return;
                            } else {
/* 102 */                       iZzm = zzqqVar4.zzm();
                            }
/* 108 */               } while (iZzm == this.zzb);
/* 110 */               iZzm2 = iZzm;
                    }
/* 111 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzH(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzth;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzth zzthVar = (zzth) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 != 1) {
/* 16 */                    if (i2 != 2) {
/* 46 */                        pk3.m7465a();
/* 49 */                        return;
                            }
/* 18 */                    zzqq zzqqVar = this.zza;
/* 20 */                    int iZzn = zzqqVar.zzn();
/* 24 */                    zzU(iZzn);
/* 31 */                    int iZzd = zzqqVar.zzd() + iZzn;
/* 43 */                    do {
/* 36 */                        zzthVar.zzg(zzqqVar.zzt());
/* 43 */                    } while (zzqqVar.zzd() < iZzd);
/* 147 */                   return;
                        }
/* 72 */                do {
/* 50 */                    zzqq zzqqVar2 = this.zza;
/* 56 */                    zzthVar.zzg(zzqqVar2.zzt());
/* 63 */                    if (zzqqVar2.zzC()) {
/* 147 */                       return;
                            } else {
/* 66 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 72 */                } while (iZzm2 == this.zzb);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 113 */                       pk3.m7465a();
/* 116 */                       return;
                            }
/* 81 */                    zzqq zzqqVar3 = this.zza;
/* 83 */                    int iZzn2 = zzqqVar3.zzn();
/* 87 */                    zzU(iZzn2);
/* 94 */                    int iZzd2 = zzqqVar3.zzd() + iZzn2;
/* 110 */                   do {
/* 103 */                       list.add(Long.valueOf(zzqqVar3.zzt()));
/* 110 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 147 */                   return;
                        }
/* 142 */               do {
/* 117 */                   zzqq zzqqVar4 = this.zza;
/* 127 */                   list.add(Long.valueOf(zzqqVar4.zzt()));
/* 134 */                   if (zzqqVar4.zzC()) {
/* 147 */                       return;
                            } else {
/* 136 */                       iZzm = zzqqVar4.zzm();
                            }
/* 142 */               } while (iZzm == this.zzb);
/* 144 */               iZzm2 = iZzm;
                    }
/* 145 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzI(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzso;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzso zzsoVar = (zzso) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        pk3.m7465a();
/* 48 */                        return;
                            }
/* 17 */                    zzqq zzqqVar = this.zza;
/* 27 */                    int iZzd = zzqqVar.zzd() + zzqqVar.zzn();
/* 39 */                    do {
/* 32 */                        zzsoVar.zzh(zzqqVar.zzl());
/* 39 */                    } while (zzqqVar.zzd() < iZzd);
/* 41 */                    zzR(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzqq zzqqVar2 = this.zza;
/* 55 */                    zzsoVar.zzh(zzqqVar2.zzl());
/* 62 */                    if (zzqqVar2.zzC()) {
/* 146 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       pk3.m7465a();
/* 115 */                       return;
                            }
/* 80 */                    zzqq zzqqVar3 = this.zza;
/* 90 */                    int iZzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Integer.valueOf(zzqqVar3.zzl()));
/* 106 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 108 */                   zzR(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzqq zzqqVar4 = this.zza;
/* 126 */                   list.add(Integer.valueOf(zzqqVar4.zzl()));
/* 133 */                   if (zzqqVar4.zzC()) {
/* 146 */                       return;
                            } else {
/* 135 */                       iZzm = zzqqVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzJ(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzth;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzth zzthVar = (zzth) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        pk3.m7465a();
/* 48 */                        return;
                            }
/* 17 */                    zzqq zzqqVar = this.zza;
/* 27 */                    int iZzd = zzqqVar.zzd() + zzqqVar.zzn();
/* 39 */                    do {
/* 32 */                        zzthVar.zzg(zzqqVar.zzu());
/* 39 */                    } while (zzqqVar.zzd() < iZzd);
/* 41 */                    zzR(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzqq zzqqVar2 = this.zza;
/* 55 */                    zzthVar.zzg(zzqqVar2.zzu());
/* 62 */                    if (zzqqVar2.zzC()) {
/* 146 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       pk3.m7465a();
/* 115 */                       return;
                            }
/* 80 */                    zzqq zzqqVar3 = this.zza;
/* 90 */                    int iZzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Long.valueOf(zzqqVar3.zzu()));
/* 106 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 108 */                   zzR(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzqq zzqqVar4 = this.zza;
/* 126 */                   list.add(Long.valueOf(zzqqVar4.zzu()));
/* 133 */                   if (zzqqVar4.zzC()) {
/* 146 */                       return;
                            } else {
/* 135 */                       iZzm = zzqqVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                public final void zzK(List list, boolean z) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 6 */             if ((this.zzb & 7) != 2) {
/* 75 */                pk3.m7465a();
/* 78 */                return;
                    }
/* 10 */            if ((list instanceof zzte) && !z) {
/* 15 */                zzte zzteVar = (zzte) list;
/* 37 */                do {
/* 17 */                    zzp();
/* 20 */                    zzteVar.zzb();
/* 23 */                    zzqq zzqqVar = this.zza;
/* 29 */                    if (zzqqVar.zzC()) {
/* 62 */                        return;
                            } else {
/* 31 */                        iZzm2 = zzqqVar.zzm();
                            }
/* 37 */                } while (iZzm2 == this.zzb);
                    } else {
/* 69 */                do {
/* 51 */                    list.add(z ? zzs() : zzr());
/* 54 */                    zzqq zzqqVar2 = this.zza;
/* 60 */                    if (zzqqVar2.zzC()) {
/* 62 */                        return;
                            } else {
/* 63 */                        iZzm = zzqqVar2.zzm();
                            }
/* 69 */                } while (iZzm == this.zzb);
/* 71 */                iZzm2 = iZzm;
                    }
/* 72 */            this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzL(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzso;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzso zzsoVar = (zzso) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        pk3.m7465a();
/* 48 */                        return;
                            }
/* 17 */                    zzqq zzqqVar = this.zza;
/* 27 */                    int iZzd = zzqqVar.zzd() + zzqqVar.zzn();
/* 39 */                    do {
/* 32 */                        zzsoVar.zzh(zzqqVar.zzn());
/* 39 */                    } while (zzqqVar.zzd() < iZzd);
/* 41 */                    zzR(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzqq zzqqVar2 = this.zza;
/* 55 */                    zzsoVar.zzh(zzqqVar2.zzn());
/* 62 */                    if (zzqqVar2.zzC()) {
/* 146 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       pk3.m7465a();
/* 115 */                       return;
                            }
/* 80 */                    zzqq zzqqVar3 = this.zza;
/* 90 */                    int iZzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Integer.valueOf(zzqqVar3.zzn()));
/* 106 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 108 */                   zzR(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzqq zzqqVar4 = this.zza;
/* 126 */                   list.add(Integer.valueOf(zzqqVar4.zzn()));
/* 133 */                   if (zzqqVar4.zzC()) {
/* 146 */                       return;
                            } else {
/* 135 */                       iZzm = zzqqVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzM(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzth;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzth zzthVar = (zzth) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        pk3.m7465a();
/* 48 */                        return;
                            }
/* 17 */                    zzqq zzqqVar = this.zza;
/* 27 */                    int iZzd = zzqqVar.zzd() + zzqqVar.zzn();
/* 39 */                    do {
/* 32 */                        zzthVar.zzg(zzqqVar.zzv());
/* 39 */                    } while (zzqqVar.zzd() < iZzd);
/* 41 */                    zzR(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzqq zzqqVar2 = this.zza;
/* 55 */                    zzthVar.zzg(zzqqVar2.zzv());
/* 62 */                    if (zzqqVar2.zzC()) {
/* 146 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       pk3.m7465a();
/* 115 */                       return;
                            }
/* 80 */                    zzqq zzqqVar3 = this.zza;
/* 90 */                    int iZzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Long.valueOf(zzqqVar3.zzv()));
/* 106 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 108 */                   zzR(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzqq zzqqVar4 = this.zza;
/* 126 */                   list.add(Long.valueOf(zzqqVar4.zzv()));
/* 133 */                   if (zzqqVar4.zzC()) {
/* 146 */                       return;
                            } else {
/* 135 */                       iZzm = zzqqVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final boolean zzN() throws IOException {
/* 2 */             zzS(0);
/* 7 */             return this.zza.zzD();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final boolean zzO() throws IOException {
                    int i;
/* 1 */             zzqq zzqqVar = this.zza;
/* 7 */             if (zzqqVar.zzC() || (i = this.zzb) == this.zzc) {
/* 21 */                return false;
                    }
/* 16 */            return zzqqVar.zzE(i);
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final double zza() throws IOException {
/* 2 */             zzS(1);
/* 7 */             return this.zza.zzb();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final float zzb() throws IOException {
/* 2 */             zzS(5);
/* 7 */             return this.zza.zzc();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final int zzc() throws IOException {
/* 1 */             int iZzm = this.zzd;
/* 3 */             if (iZzm != 0) {
/* 5 */                 this.zzb = iZzm;
/* 8 */                 this.zzd = 0;
                    } else {
/* 13 */                iZzm = this.zza.zzm();
/* 17 */                this.zzb = iZzm;
                    }
                    return (iZzm == 0 || iZzm == this.zzc) ? AbstractC0208c9.API_PRIORITY_OTHER : iZzm >>> 3;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final int zzd() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final int zze() throws IOException {
/* 2 */             zzS(0);
/* 7 */             return this.zza.zzf();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final int zzf() throws IOException {
/* 2 */             zzS(5);
/* 7 */             return this.zza.zzg();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final int zzg() throws IOException {
/* 2 */             zzS(0);
/* 7 */             return this.zza.zzh();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final int zzh() throws IOException {
/* 2 */             zzS(5);
/* 7 */             return this.zza.zzk();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final int zzi() throws IOException {
/* 2 */             zzS(0);
/* 7 */             return this.zza.zzl();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final int zzj() throws IOException {
/* 2 */             zzS(0);
/* 7 */             return this.zza.zzn();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final long zzk() throws IOException {
/* 2 */             zzS(1);
/* 7 */             return this.zza.zzo();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final long zzl() throws IOException {
/* 2 */             zzS(0);
/* 7 */             return this.zza.zzp();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final long zzm() throws IOException {
/* 2 */             zzS(1);
/* 7 */             return this.zza.zzt();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final long zzn() throws IOException {
/* 2 */             zzS(0);
/* 7 */             return this.zza.zzu();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final long zzo() throws IOException {
/* 2 */             zzS(0);
/* 7 */             return this.zza.zzv();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final zzqm zzp() throws IOException {
/* 2 */             zzS(2);
/* 7 */             return this.zza.zzw();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final String zzr() throws IOException {
/* 2 */             zzS(2);
/* 7 */             return this.zza.zzx();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final String zzs() throws IOException {
/* 2 */             zzS(2);
/* 7 */             return this.zza.zzy();
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzt(Object obj, zzug zzugVar, zzry zzryVar) throws IOException {
/* 2 */             zzS(3);
/* 5 */             zzP(obj, zzugVar, zzryVar);
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzu(Object obj, zzug zzugVar, zzry zzryVar) throws IOException {
/* 2 */             zzS(2);
/* 5 */             zzQ(obj, zzugVar, zzryVar);
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzv(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzqd;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzqd zzqdVar = (zzqd) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        pk3.m7465a();
/* 48 */                        return;
                            }
/* 17 */                    zzqq zzqqVar = this.zza;
/* 27 */                    int iZzd = zzqqVar.zzd() + zzqqVar.zzn();
/* 39 */                    do {
/* 32 */                        zzqdVar.zze(zzqqVar.zzD());
/* 39 */                    } while (zzqqVar.zzd() < iZzd);
/* 41 */                    zzR(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzqq zzqqVar2 = this.zza;
/* 55 */                    zzqdVar.zze(zzqqVar2.zzD());
/* 62 */                    if (zzqqVar2.zzC()) {
/* 146 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       pk3.m7465a();
/* 115 */                       return;
                            }
/* 80 */                    zzqq zzqqVar3 = this.zza;
/* 90 */                    int iZzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Boolean.valueOf(zzqqVar3.zzD()));
/* 106 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 108 */                   zzR(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzqq zzqqVar4 = this.zza;
/* 126 */                   list.add(Boolean.valueOf(zzqqVar4.zzD()));
/* 133 */                   if (zzqqVar4.zzC()) {
/* 146 */                       return;
                            } else {
/* 135 */                       iZzm = zzqqVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzw(List list) throws IOException {
                    int iZzm;
/* 6 */             if ((this.zzb & 7) != 2) {
/* 35 */                pk3.m7465a();
/* 38 */                return;
                    }
/* 30 */            do {
/* 12 */                list.add(zzp());
/* 15 */                zzqq zzqqVar = this.zza;
/* 21 */                if (zzqqVar.zzC()) {
/* 23 */                    return;
                        } else {
/* 24 */                    iZzm = zzqqVar.zzm();
                        }
/* 30 */            } while (iZzm == this.zzb);
/* 32 */            this.zzd = iZzm;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzx(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzrs;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzrs zzrsVar = (zzrs) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 != 1) {
/* 16 */                    if (i2 != 2) {
/* 46 */                        pk3.m7465a();
/* 49 */                        return;
                            }
/* 18 */                    zzqq zzqqVar = this.zza;
/* 20 */                    int iZzn = zzqqVar.zzn();
/* 24 */                    zzU(iZzn);
/* 31 */                    int iZzd = zzqqVar.zzd() + iZzn;
/* 43 */                    do {
/* 36 */                        zzrsVar.zzf(zzqqVar.zzb());
/* 43 */                    } while (zzqqVar.zzd() < iZzd);
/* 147 */                   return;
                        }
/* 72 */                do {
/* 50 */                    zzqq zzqqVar2 = this.zza;
/* 56 */                    zzrsVar.zzf(zzqqVar2.zzb());
/* 63 */                    if (zzqqVar2.zzC()) {
/* 147 */                       return;
                            } else {
/* 66 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 72 */                } while (iZzm2 == this.zzb);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 113 */                       pk3.m7465a();
/* 116 */                       return;
                            }
/* 81 */                    zzqq zzqqVar3 = this.zza;
/* 83 */                    int iZzn2 = zzqqVar3.zzn();
/* 87 */                    zzU(iZzn2);
/* 94 */                    int iZzd2 = zzqqVar3.zzd() + iZzn2;
/* 110 */                   do {
/* 103 */                       list.add(Double.valueOf(zzqqVar3.zzb()));
/* 110 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 147 */                   return;
                        }
/* 142 */               do {
/* 117 */                   zzqq zzqqVar4 = this.zza;
/* 127 */                   list.add(Double.valueOf(zzqqVar4.zzb()));
/* 134 */                   if (zzqqVar4.zzC()) {
/* 147 */                       return;
                            } else {
/* 136 */                       iZzm = zzqqVar4.zzm();
                            }
/* 142 */               } while (iZzm == this.zzb);
/* 144 */               iZzm2 = iZzm;
                    }
/* 145 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzy(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzso;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzso zzsoVar = (zzso) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        pk3.m7465a();
/* 48 */                        return;
                            }
/* 17 */                    zzqq zzqqVar = this.zza;
/* 27 */                    int iZzd = zzqqVar.zzd() + zzqqVar.zzn();
/* 39 */                    do {
/* 32 */                        zzsoVar.zzh(zzqqVar.zzf());
/* 39 */                    } while (zzqqVar.zzd() < iZzd);
/* 41 */                    zzR(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzqq zzqqVar2 = this.zza;
/* 55 */                    zzsoVar.zzh(zzqqVar2.zzf());
/* 62 */                    if (zzqqVar2.zzC()) {
/* 146 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       pk3.m7465a();
/* 115 */                       return;
                            }
/* 80 */                    zzqq zzqqVar3 = this.zza;
/* 90 */                    int iZzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Integer.valueOf(zzqqVar3.zzf()));
/* 106 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 108 */                   zzR(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzqq zzqqVar4 = this.zza;
/* 126 */                   list.add(Integer.valueOf(zzqqVar4.zzf()));
/* 133 */                   if (zzqqVar4.zzC()) {
/* 146 */                       return;
                            } else {
/* 135 */                       iZzm = zzqqVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override // com.google.android.recaptcha.internal.zzuf
                public final void zzz(List list) throws IOException {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzso;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzso zzsoVar = (zzso) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 == 2) {
/* 48 */                    zzqq zzqqVar = this.zza;
/* 50 */                    int iZzn = zzqqVar.zzn();
/* 54 */                    zzT(iZzn);
/* 61 */                    int iZzd = zzqqVar.zzd() + iZzn;
/* 74 */                    do {
/* 67 */                        zzsoVar.zzh(zzqqVar.zzg());
/* 74 */                    } while (zzqqVar.zzd() < iZzd);
/* 149 */                   return;
                        }
/* 16 */                if (i2 != 5) {
/* 44 */                    pk3.m7465a();
/* 47 */                    return;
                        }
/* 41 */                do {
/* 18 */                    zzqq zzqqVar2 = this.zza;
/* 24 */                    zzsoVar.zzh(zzqqVar2.zzg());
/* 31 */                    if (zzqqVar2.zzC()) {
/* 149 */                       return;
                            } else {
/* 35 */                        iZzm2 = zzqqVar2.zzm();
                            }
/* 41 */                } while (iZzm2 == this.zzb);
                    } else {
/* 77 */                int i3 = i & 7;
/* 79 */                if (i3 == 2) {
/* 118 */                   zzqq zzqqVar3 = this.zza;
/* 120 */                   int iZzn2 = zzqqVar3.zzn();
/* 124 */                   zzT(iZzn2);
/* 131 */                   int iZzd2 = zzqqVar3.zzd() + iZzn2;
/* 147 */                   do {
/* 140 */                       list.add(Integer.valueOf(zzqqVar3.zzg()));
/* 147 */                   } while (zzqqVar3.zzd() < iZzd2);
/* 149 */                   return;
                        }
/* 81 */                if (i3 != 5) {
/* 114 */                   pk3.m7465a();
/* 117 */                   return;
                        }
/* 108 */               do {
/* 83 */                    zzqq zzqqVar4 = this.zza;
/* 93 */                    list.add(Integer.valueOf(zzqqVar4.zzg()));
/* 100 */                   if (zzqqVar4.zzC()) {
/* 149 */                       return;
                            } else {
/* 102 */                       iZzm = zzqqVar4.zzm();
                            }
/* 108 */               } while (iZzm == this.zzb);
/* 110 */               iZzm2 = iZzm;
                    }
/* 111 */           this.zzd = iZzm2;
                }
            }
