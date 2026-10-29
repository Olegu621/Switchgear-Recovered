            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.util.Arrays;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class zzuw {
                private static final zzuw zza = new zzuw(0, new int[0], new Object[0], false);
                private int zzb;
                private int[] zzc;
                private Object[] zzd;
                private int zze;
                private boolean zzf;

                private zzuw(int i, int[] iArr, Object[] objArr, boolean z) {
/* 5 */             this.zze = -1;
/* 7 */             this.zzb = i;
/* 9 */             this.zzc = iArr;
/* 11 */            this.zzd = objArr;
/* 13 */            this.zzf = z;
                }

                public static zzuw zzc() {
/* 1 */             return zza;
                }

                public static zzuw zze(zzuw zzuwVar, zzuw zzuwVar2) {
/* 5 */             int i = zzuwVar.zzb + zzuwVar2.zzb;
/* 8 */             int[] iArrCopyOf = Arrays.copyOf(zzuwVar.zzc, i);
/* 19 */            System.arraycopy(zzuwVar2.zzc, 0, iArrCopyOf, zzuwVar.zzb, zzuwVar2.zzb);
/* 24 */            Object[] objArrCopyOf = Arrays.copyOf(zzuwVar.zzd, i);
/* 34 */            System.arraycopy(zzuwVar2.zzd, 0, objArrCopyOf, zzuwVar.zzb, zzuwVar2.zzb);
/* 40 */            return new zzuw(i, iArrCopyOf, objArrCopyOf, true);
                }

                public static zzuw zzf() {
/* 11 */            return new zzuw(0, new int[8], new Object[8], true);
                }

                private final void zzm(int i) {
/* 1 */             int[] iArr = this.zzc;
/* 4 */             if (i > iArr.length) {
/* 6 */                 int i2 = this.zzb;
/* 10 */                int i3 = (i2 / 2) + i2;
/* 11 */                if (i3 >= i) {
/* 13 */                    i = i3;
                        }
/* 16 */                if (i < 8) {
/* 18 */                    i = 8;
                        }
/* 23 */                this.zzc = Arrays.copyOf(iArr, i);
/* 31 */                this.zzd = Arrays.copyOf(this.zzd, i);
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof zzuw)) {
/* 5 */                 return false;
                    }
/* 14 */            zzuw zzuwVar = (zzuw) obj;
/* 16 */            int i = this.zzb;
/* 20 */            if (i == zzuwVar.zzb) {
/* 22 */                int[] iArr = this.zzc;
/* 24 */                int[] iArr2 = zzuwVar.zzc;
/* 27 */                for (int i2 = 0; i2 < i; i2++) {
/* 33 */                    if (iArr[i2] == iArr2[i2]) {
                            }
                        }
/* 39 */                Object[] objArr = this.zzd;
/* 41 */                Object[] objArr2 = zzuwVar.zzd;
/* 43 */                int i3 = this.zzb;
/* 46 */                for (int i4 = 0; i4 < i3; i4++) {
/* 56 */                    if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
/* 1 */                 return true;
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.zzb;
/* 3 */             int i2 = i + 527;
/* 5 */             int[] iArr = this.zzc;
/* 8 */             int iHashCode = 17;
/* 11 */            int i3 = 17;
/* 12 */            for (int i4 = 0; i4 < i; i4++) {
/* 18 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 25 */            int i5 = ((i2 * 31) + i3) * 31;
/* 27 */            Object[] objArr = this.zzd;
/* 29 */            int i6 = this.zzb;
/* 31 */            for (int i7 = 0; i7 < i6; i7++) {
/* 41 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 45 */            return i5 + iHashCode;
                }

                public final int zza() {
                    int iZzA;
                    int iZzB;
                    int iZzA2;
/* 1 */             int i = this.zze;
/* 4 */             if (i != -1) {
/* 158 */               return i;
                    }
/* 7 */             int iZzA3 = 0;
/* 10 */            for (int i2 = 0; i2 < this.zzb; i2++) {
/* 14 */                int i3 = this.zzc[i2];
/* 16 */                int i4 = i3 >>> 3;
/* 18 */                int i5 = i3 & 7;
/* 20 */                if (i5 != 0) {
/* 23 */                    if (i5 != 1) {
/* 26 */                        if (i5 == 2) {
/* 87 */                            int i6 = i4 << 3;
/* 93 */                            zzqm zzqmVar = (zzqm) this.zzd[i2];
/* 95 */                            int iZzA4 = zzqv.zzA(i6);
/* 99 */                            int iZzd = zzqmVar.zzd();
/* 109 */                           iZzA3 = zzqv.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                                } else if (i5 == 3) {
/* 68 */                            int iZzA5 = zzqv.zzA(i4 << 3);
/* 72 */                            iZzA = iZzA5 + iZzA5;
/* 79 */                            iZzB = ((zzuw) this.zzd[i2]).zza();
                                } else {
/* 32 */                            if (i5 != 5) {
/* 61 */                                C1697u2.m5439o(new zzsw("Protocol message tag had invalid wire type."));
/* 64 */                                return 0;
                                    }
/* 42 */                            ((Integer) this.zzd[i2]).getClass();
/* 49 */                            iZzA2 = zzqv.zzA(i4 << 3) + 4;
                                }
                            } else {
/* 120 */                       ((Long) this.zzd[i2]).getClass();
/* 127 */                       iZzA2 = zzqv.zzA(i4 << 3) + 8;
                            }
/* 51 */                    iZzA3 = iZzA2 + iZzA3;
                        } else {
/* 130 */                   int i7 = i4 << 3;
/* 138 */                   long jLongValue = ((Long) this.zzd[i2]).longValue();
/* 142 */                   iZzA = zzqv.zzA(i7);
/* 146 */                   iZzB = zzqv.zzB(jLongValue);
                        }
/* 84 */                iZzA3 = iZzB + iZzA + iZzA3;
                    }
/* 155 */           this.zze = iZzA3;
/* 157 */           return iZzA3;
                }

                public final int zzb() {
/* 1 */             int i = this.zze;
/* 4 */             if (i != -1) {
/* 65 */                return i;
                    }
/* 7 */             int iM7496s = 0;
/* 10 */            for (int i2 = 0; i2 < this.zzb; i2++) {
/* 16 */                int i3 = this.zzc[i2] >>> 3;
/* 22 */                zzqm zzqmVar = (zzqm) this.zzd[i2];
/* 26 */                int iZzA = zzqv.zzA(8);
/* 41 */                int iZzA2 = zzqv.zzA(i3) + zzqv.zzA(16);
/* 44 */                int iZzA3 = zzqv.zzA(24);
/* 48 */                int iZzd = zzqmVar.zzd();
/* 58 */                iM7496s += iZzA + iZzA + iZzA2 + pm2.m7496s(iZzd, iZzd, iZzA3);
                    }
/* 62 */            this.zze = iM7496s;
/* 64 */            return iM7496s;
                }

                public final zzuw zzd(zzuw zzuwVar) {
/* 7 */             if (zzuwVar.equals(zza)) {
/* 9 */                 return this;
                    }
/* 10 */            zzg();
/* 17 */            int i = this.zzb + zzuwVar.zzb;
/* 18 */            zzm(i);
/* 30 */            System.arraycopy(zzuwVar.zzc, 0, this.zzc, this.zzb, zzuwVar.zzb);
/* 41 */            System.arraycopy(zzuwVar.zzd, 0, this.zzd, this.zzb, zzuwVar.zzb);
/* 44 */            this.zzb = i;
/* 46 */            return this;
                }

                public final void zzg() {
/* 3 */             if (this.zzf) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                public final void zzh() {
/* 3 */             if (this.zzf) {
/* 6 */                 this.zzf = false;
                    }
                }

                public final void zzi(StringBuilder sb, int i) {
/* 4 */             for (int i2 = 0; i2 < this.zzb; i2++) {
/* 20 */                zztu.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
                    }
                }

                public final void zzj(int i, Object obj) {
/* 1 */             zzg();
/* 8 */             zzm(this.zzb + 1);
/* 11 */            int[] iArr = this.zzc;
/* 13 */            int i2 = this.zzb;
/* 15 */            iArr[i2] = i;
/* 19 */            this.zzd[i2] = obj;
/* 23 */            this.zzb = i2 + 1;
                }

                public final void zzk(zzvi zzviVar) throws IOException {
/* 4 */             for (int i = 0; i < this.zzb; i++) {
/* 16 */                zzviVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
                    }
                }

                public final void zzl(zzvi zzviVar) throws IOException {
/* 3 */             if (this.zzb != 0) {
/* 8 */                 for (int i = 0; i < this.zzb; i++) {
/* 12 */                    int i2 = this.zzc[i];
/* 16 */                    Object obj = this.zzd[i];
/* 18 */                    int i3 = i2 & 7;
/* 21 */                    int i4 = i2 >>> 3;
/* 22 */                    if (i3 == 0) {
/* 90 */                        zzviVar.zzt(i4, ((Long) obj).longValue());
                            } else if (i3 == 1) {
/* 80 */                        zzviVar.zzm(i4, ((Long) obj).longValue());
                            } else if (i3 == 2) {
/* 70 */                        zzviVar.zzd(i4, (zzqm) obj);
                            } else if (i3 == 3) {
/* 56 */                        zzviVar.zzF(i4);
/* 61 */                        ((zzuw) obj).zzl(zzviVar);
/* 64 */                        zzviVar.zzh(i4);
                            } else {
/* 33 */                        if (i3 != 5) {
/* 52 */                            ds0.m3199p(new zzsw("Protocol message tag had invalid wire type."));
/* 55 */                            return;
                                }
/* 41 */                        zzviVar.zzk(i4, ((Integer) obj).intValue());
                            }
                        }
                    }
                }

/* 15 */        private zzuw() {
/* 16 */            this(0, new int[8], new Object[8], true);
                }
            }
