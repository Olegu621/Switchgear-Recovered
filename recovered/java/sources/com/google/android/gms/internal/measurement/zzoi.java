            package com.google.android.gms.internal.measurement;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.util.Arrays;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class zzoi {
                private static final zzoi zza = new zzoi(0, new int[0], new Object[0], false);
                private int zzb;
                private int[] zzc;
                private Object[] zzd;
                private int zze;
                private boolean zzf;

                private zzoi(int i, int[] iArr, Object[] objArr, boolean z) {
/* 5 */             this.zze = -1;
/* 7 */             this.zzb = i;
/* 9 */             this.zzc = iArr;
/* 11 */            this.zzd = objArr;
/* 13 */            this.zzf = z;
                }

                public static zzoi zza() {
/* 1 */             return zza;
                }

                public static zzoi zzb() {
/* 11 */            return new zzoi(0, new int[8], new Object[8], true);
                }

                public static zzoi zzc(zzoi zzoiVar, zzoi zzoiVar2) {
/* 5 */             int i = zzoiVar.zzb + zzoiVar2.zzb;
/* 8 */             int[] iArrCopyOf = Arrays.copyOf(zzoiVar.zzc, i);
/* 19 */            System.arraycopy(zzoiVar2.zzc, 0, iArrCopyOf, zzoiVar.zzb, zzoiVar2.zzb);
/* 24 */            Object[] objArrCopyOf = Arrays.copyOf(zzoiVar.zzd, i);
/* 34 */            System.arraycopy(zzoiVar2.zzd, 0, objArrCopyOf, zzoiVar.zzb, zzoiVar2.zzb);
/* 40 */            return new zzoi(i, iArrCopyOf, objArrCopyOf, true);
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
/* 6 */             if (obj == null || !(obj instanceof zzoi)) {
/* 5 */                 return false;
                    }
/* 14 */            zzoi zzoiVar = (zzoi) obj;
/* 16 */            int i = this.zzb;
/* 20 */            if (i == zzoiVar.zzb) {
/* 22 */                int[] iArr = this.zzc;
/* 24 */                int[] iArr2 = zzoiVar.zzc;
/* 27 */                for (int i2 = 0; i2 < i; i2++) {
/* 33 */                    if (iArr[i2] == iArr2[i2]) {
                            }
                        }
/* 39 */                Object[] objArr = this.zzd;
/* 41 */                Object[] objArr2 = zzoiVar.zzd;
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

                public final void zzd() {
/* 3 */             if (this.zzf) {
/* 6 */                 this.zzf = false;
                    }
                }

                public final void zze() {
/* 3 */             if (this.zzf) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                public final void zzf(zzou zzouVar) throws IOException {
/* 4 */             for (int i = 0; i < this.zzb; i++) {
/* 16 */                zzouVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
                    }
                }

                public final void zzg(zzou zzouVar) throws IOException {
/* 3 */             if (this.zzb != 0) {
/* 8 */                 for (int i = 0; i < this.zzb; i++) {
/* 12 */                    int i2 = this.zzc[i];
/* 16 */                    Object obj = this.zzd[i];
/* 18 */                    int i3 = i2 & 7;
/* 21 */                    int i4 = i2 >>> 3;
/* 22 */                    if (i3 == 0) {
/* 90 */                        zzouVar.zzc(i4, ((Long) obj).longValue());
                            } else if (i3 == 1) {
/* 80 */                        zzouVar.zzj(i4, ((Long) obj).longValue());
                            } else if (i3 == 2) {
/* 70 */                        zzouVar.zzn(i4, (zzlg) obj);
                            } else if (i3 == 3) {
/* 56 */                        zzouVar.zzt(i4);
/* 61 */                        ((zzoi) obj).zzg(zzouVar);
/* 64 */                        zzouVar.zzu(i4);
                            } else {
/* 33 */                        if (i3 != 5) {
/* 52 */                            ds0.m3199p(new zzmp("Protocol message tag had invalid wire type."));
/* 55 */                            return;
                                }
/* 41 */                        zzouVar.zzk(i4, ((Integer) obj).intValue());
                            }
                        }
                    }
                }

                public final int zzh() {
/* 1 */             int i = this.zze;
/* 4 */             if (i != -1) {
/* 65 */                return i;
                    }
/* 7 */             int iM7493p = 0;
/* 10 */            for (int i2 = 0; i2 < this.zzb; i2++) {
/* 16 */                int i3 = this.zzc[i2] >>> 3;
/* 22 */                zzlg zzlgVar = (zzlg) this.zzd[i2];
/* 26 */                int iZzz = zzll.zzz(8);
/* 41 */                int iZzz2 = zzll.zzz(i3) + zzll.zzz(16);
/* 44 */                int iZzz3 = zzll.zzz(24);
/* 48 */                int iZzc = zzlgVar.zzc();
/* 58 */                iM7493p += iZzz + iZzz + iZzz2 + pm2.m7493p(iZzc, iZzc, iZzz3);
                    }
/* 62 */            this.zze = iM7493p;
/* 64 */            return iM7493p;
                }

                public final int zzi() {
                    int iZzz;
                    int iZzA;
                    int iZzz2;
/* 1 */             int i = this.zze;
/* 4 */             if (i != -1) {
/* 158 */               return i;
                    }
/* 7 */             int iZzz3 = 0;
/* 10 */            for (int i2 = 0; i2 < this.zzb; i2++) {
/* 14 */                int i3 = this.zzc[i2];
/* 16 */                int i4 = i3 >>> 3;
/* 18 */                int i5 = i3 & 7;
/* 20 */                if (i5 != 0) {
/* 23 */                    if (i5 != 1) {
/* 26 */                        if (i5 == 2) {
/* 87 */                            int i6 = i4 << 3;
/* 93 */                            zzlg zzlgVar = (zzlg) this.zzd[i2];
/* 95 */                            int iZzz4 = zzll.zzz(i6);
/* 99 */                            int iZzc = zzlgVar.zzc();
/* 109 */                           iZzz3 = zzll.zzz(iZzc) + iZzc + iZzz4 + iZzz3;
                                } else if (i5 == 3) {
/* 68 */                            int iZzz5 = zzll.zzz(i4 << 3);
/* 72 */                            iZzz = iZzz5 + iZzz5;
/* 79 */                            iZzA = ((zzoi) this.zzd[i2]).zzi();
                                } else {
/* 32 */                            if (i5 != 5) {
/* 61 */                                C1697u2.m5439o(new zzmp("Protocol message tag had invalid wire type."));
/* 64 */                                return 0;
                                    }
/* 42 */                            ((Integer) this.zzd[i2]).getClass();
/* 49 */                            iZzz2 = zzll.zzz(i4 << 3) + 4;
                                }
                            } else {
/* 120 */                       ((Long) this.zzd[i2]).getClass();
/* 127 */                       iZzz2 = zzll.zzz(i4 << 3) + 8;
                            }
/* 51 */                    iZzz3 = iZzz2 + iZzz3;
                        } else {
/* 130 */                   int i7 = i4 << 3;
/* 138 */                   long jLongValue = ((Long) this.zzd[i2]).longValue();
/* 142 */                   iZzz = zzll.zzz(i7);
/* 146 */                   iZzA = zzll.zzA(jLongValue);
                        }
/* 84 */                iZzz3 = iZzA + iZzz + iZzz3;
                    }
/* 155 */           this.zze = iZzz3;
/* 157 */           return iZzz3;
                }

                public final void zzj(StringBuilder sb, int i) {
/* 4 */             for (int i2 = 0; i2 < this.zzb; i2++) {
/* 20 */                zznn.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
                    }
                }

                public final void zzk(int i, Object obj) {
/* 1 */             zze();
/* 8 */             zzm(this.zzb + 1);
/* 11 */            int[] iArr = this.zzc;
/* 13 */            int i2 = this.zzb;
/* 15 */            iArr[i2] = i;
/* 19 */            this.zzd[i2] = obj;
/* 23 */            this.zzb = i2 + 1;
                }

                public final zzoi zzl(zzoi zzoiVar) {
/* 7 */             if (zzoiVar.equals(zza)) {
/* 9 */                 return this;
                    }
/* 10 */            zze();
/* 17 */            int i = this.zzb + zzoiVar.zzb;
/* 18 */            zzm(i);
/* 30 */            System.arraycopy(zzoiVar.zzc, 0, this.zzc, this.zzb, zzoiVar.zzb);
/* 41 */            System.arraycopy(zzoiVar.zzd, 0, this.zzd, this.zzb, zzoiVar.zzb);
/* 44 */            this.zzb = i;
/* 46 */            return this;
                }

/* 15 */        private zzoi() {
/* 16 */            this(0, new int[8], new Object[8], true);
                }
            }
