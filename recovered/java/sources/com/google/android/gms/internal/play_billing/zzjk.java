            package com.google.android.gms.internal.play_billing;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.util.Arrays;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class zzjk {
                private static final zzjk zza = new zzjk(0, new int[0], new Object[0], false);
                private int zzb;
                private int[] zzc;
                private Object[] zzd;
                private int zze;
                private boolean zzf;

                private zzjk(int i, int[] iArr, Object[] objArr, boolean z) {
/* 5 */             this.zze = -1;
/* 7 */             this.zzb = i;
/* 9 */             this.zzc = iArr;
/* 11 */            this.zzd = objArr;
/* 13 */            this.zzf = z;
                }

                public static zzjk zzc() {
/* 1 */             return zza;
                }

                public static zzjk zze(zzjk zzjkVar, zzjk zzjkVar2) {
/* 5 */             int i = zzjkVar.zzb + zzjkVar2.zzb;
/* 8 */             int[] iArrCopyOf = Arrays.copyOf(zzjkVar.zzc, i);
/* 19 */            System.arraycopy(zzjkVar2.zzc, 0, iArrCopyOf, zzjkVar.zzb, zzjkVar2.zzb);
/* 24 */            Object[] objArrCopyOf = Arrays.copyOf(zzjkVar.zzd, i);
/* 34 */            System.arraycopy(zzjkVar2.zzd, 0, objArrCopyOf, zzjkVar.zzb, zzjkVar2.zzb);
/* 40 */            return new zzjk(i, iArrCopyOf, objArrCopyOf, true);
                }

                public static zzjk zzf() {
/* 11 */            return new zzjk(0, new int[8], new Object[8], true);
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
/* 6 */             if (obj == null || !(obj instanceof zzjk)) {
/* 5 */                 return false;
                    }
/* 14 */            zzjk zzjkVar = (zzjk) obj;
/* 16 */            int i = this.zzb;
/* 20 */            if (i == zzjkVar.zzb) {
/* 22 */                int[] iArr = this.zzc;
/* 24 */                int[] iArr2 = zzjkVar.zzc;
/* 27 */                for (int i2 = 0; i2 < i; i2++) {
/* 33 */                    if (iArr[i2] == iArr2[i2]) {
                            }
                        }
/* 39 */                Object[] objArr = this.zzd;
/* 41 */                Object[] objArr2 = zzjkVar.zzd;
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
/* 93 */                            zzgk zzgkVar = (zzgk) this.zzd[i2];
/* 95 */                            int iZzz4 = zzgr.zzz(i6);
/* 99 */                            int iZzd = zzgkVar.zzd();
/* 109 */                           iZzz3 = zzgr.zzz(iZzd) + iZzd + iZzz4 + iZzz3;
                                } else if (i5 == 3) {
/* 68 */                            int iZzz5 = zzgr.zzz(i4 << 3);
/* 72 */                            iZzz = iZzz5 + iZzz5;
/* 79 */                            iZzA = ((zzjk) this.zzd[i2]).zza();
                                } else {
/* 32 */                            if (i5 != 5) {
/* 61 */                                C1697u2.m5439o(new zzhq("Protocol message tag had invalid wire type."));
/* 64 */                                return 0;
                                    }
/* 42 */                            ((Integer) this.zzd[i2]).getClass();
/* 49 */                            iZzz2 = zzgr.zzz(i4 << 3) + 4;
                                }
                            } else {
/* 120 */                       ((Long) this.zzd[i2]).getClass();
/* 127 */                       iZzz2 = zzgr.zzz(i4 << 3) + 8;
                            }
/* 51 */                    iZzz3 = iZzz2 + iZzz3;
                        } else {
/* 130 */                   int i7 = i4 << 3;
/* 138 */                   long jLongValue = ((Long) this.zzd[i2]).longValue();
/* 142 */                   iZzz = zzgr.zzz(i7);
/* 146 */                   iZzA = zzgr.zzA(jLongValue);
                        }
/* 84 */                iZzz3 = iZzA + iZzz + iZzz3;
                    }
/* 155 */           this.zze = iZzz3;
/* 157 */           return iZzz3;
                }

                public final int zzb() {
/* 1 */             int i = this.zze;
/* 4 */             if (i != -1) {
/* 65 */                return i;
                    }
/* 7 */             int iM7491n = 0;
/* 10 */            for (int i2 = 0; i2 < this.zzb; i2++) {
/* 16 */                int i3 = this.zzc[i2] >>> 3;
/* 22 */                zzgk zzgkVar = (zzgk) this.zzd[i2];
/* 26 */                int iZzz = zzgr.zzz(8);
/* 41 */                int iZzz2 = zzgr.zzz(i3) + zzgr.zzz(16);
/* 44 */                int iZzz3 = zzgr.zzz(24);
/* 48 */                int iZzd = zzgkVar.zzd();
/* 58 */                iM7491n += iZzz + iZzz + iZzz2 + pm2.m7491n(iZzd, iZzd, iZzz3);
                    }
/* 62 */            this.zze = iM7491n;
/* 64 */            return iM7491n;
                }

                public final zzjk zzd(zzjk zzjkVar) {
/* 7 */             if (zzjkVar.equals(zza)) {
/* 9 */                 return this;
                    }
/* 10 */            zzg();
/* 17 */            int i = this.zzb + zzjkVar.zzb;
/* 18 */            zzm(i);
/* 30 */            System.arraycopy(zzjkVar.zzc, 0, this.zzc, this.zzb, zzjkVar.zzb);
/* 41 */            System.arraycopy(zzjkVar.zzd, 0, this.zzd, this.zzb, zzjkVar.zzb);
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
/* 20 */                zzio.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
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

                public final void zzk(zzjw zzjwVar) throws IOException {
/* 4 */             for (int i = 0; i < this.zzb; i++) {
/* 16 */                zzjwVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
                    }
                }

                public final void zzl(zzjw zzjwVar) throws IOException {
/* 3 */             if (this.zzb != 0) {
/* 8 */                 for (int i = 0; i < this.zzb; i++) {
/* 12 */                    int i2 = this.zzc[i];
/* 16 */                    Object obj = this.zzd[i];
/* 18 */                    int i3 = i2 & 7;
/* 21 */                    int i4 = i2 >>> 3;
/* 22 */                    if (i3 == 0) {
/* 90 */                        zzjwVar.zzt(i4, ((Long) obj).longValue());
                            } else if (i3 == 1) {
/* 80 */                        zzjwVar.zzm(i4, ((Long) obj).longValue());
                            } else if (i3 == 2) {
/* 70 */                        zzjwVar.zzd(i4, (zzgk) obj);
                            } else if (i3 == 3) {
/* 56 */                        zzjwVar.zzF(i4);
/* 61 */                        ((zzjk) obj).zzl(zzjwVar);
/* 64 */                        zzjwVar.zzh(i4);
                            } else {
/* 33 */                        if (i3 != 5) {
/* 52 */                            ds0.m3199p(new zzhq("Protocol message tag had invalid wire type."));
/* 55 */                            return;
                                }
/* 41 */                        zzjwVar.zzk(i4, ((Integer) obj).intValue());
                            }
                        }
                    }
                }

/* 15 */        private zzjk() {
/* 16 */            this(0, new int[8], new Object[8], true);
                }
            }
