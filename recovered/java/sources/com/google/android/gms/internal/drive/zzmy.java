            package com.google.android.gms.internal.drive;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.util.Arrays;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class zzmy {
                private static final zzmy zzvr = new zzmy(0, new int[0], new Object[0], false);
                private int count;
                private boolean zznh;
                private int zzrr;
                private Object[] zzue;
                private int[] zzvs;

                private zzmy(int i, int[] iArr, Object[] objArr, boolean z) {
/* 5 */             this.zzrr = -1;
/* 7 */             this.count = i;
/* 9 */             this.zzvs = iArr;
/* 11 */            this.zzue = objArr;
/* 13 */            this.zznh = z;
                }

                private static void zzb(int i, Object obj, zzns zznsVar) throws IOException {
/* 1 */             int i2 = i >>> 3;
/* 3 */             int i3 = i & 7;
/* 5 */             if (i3 == 0) {
/* 91 */                zznsVar.zzi(i2, ((Long) obj).longValue());
/* 94 */                return;
                    }
/* 8 */             if (i3 == 1) {
/* 81 */                zznsVar.zzc(i2, ((Long) obj).longValue());
/* 84 */                return;
                    }
/* 11 */            if (i3 == 2) {
/* 71 */                zznsVar.zza(i2, (zzjc) obj);
/* 74 */                return;
                    }
/* 14 */            if (i3 != 3) {
/* 17 */                if (i3 == 5) {
/* 25 */                    zznsVar.zzf(i2, ((Integer) obj).intValue());
/* 28 */                    return;
                        } else {
/* 33 */                    ds0.m3199p(zzkq.zzdl());
/* 36 */                    return;
                        }
                    }
/* 43 */            if (zznsVar.zzcd() == zzkk.zze.zzsi) {
/* 45 */                zznsVar.zzak(i2);
/* 50 */                ((zzmy) obj).zzb(zznsVar);
/* 53 */                zznsVar.zzal(i2);
                    } else {
/* 57 */                zznsVar.zzal(i2);
/* 62 */                ((zzmy) obj).zzb(zznsVar);
/* 65 */                zznsVar.zzak(i2);
                    }
                }

                public static zzmy zzfa() {
/* 1 */             return zzvr;
                }

                public static zzmy zzfb() {
/* 3 */             return new zzmy();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof zzmy)) {
/* 5 */                 return false;
                    }
/* 14 */            zzmy zzmyVar = (zzmy) obj;
/* 16 */            int i = this.count;
/* 20 */            if (i == zzmyVar.count) {
/* 22 */                int[] iArr = this.zzvs;
/* 24 */                int[] iArr2 = zzmyVar.zzvs;
/* 27 */                for (int i2 = 0; i2 < i; i2++) {
/* 33 */                    if (iArr[i2] == iArr2[i2]) {
                            }
                        }
/* 39 */                Object[] objArr = this.zzue;
/* 41 */                Object[] objArr2 = zzmyVar.zzue;
/* 43 */                int i3 = this.count;
/* 46 */                for (int i4 = 0; i4 < i3; i4++) {
/* 56 */                    if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
/* 1 */                 return true;
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.count;
/* 5 */             int i2 = (i + 527) * 31;
/* 7 */             int[] iArr = this.zzvs;
/* 9 */             int iHashCode = 17;
/* 12 */            int i3 = 17;
/* 14 */            for (int i4 = 0; i4 < i; i4++) {
/* 20 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 25 */            int i5 = (i2 + i3) * 31;
/* 27 */            Object[] objArr = this.zzue;
/* 29 */            int i6 = this.count;
/* 31 */            for (int i7 = 0; i7 < i6; i7++) {
/* 41 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 45 */            return i5 + iHashCode;
                }

                public final void zza(zzns zznsVar) throws IOException {
/* 7 */             if (zznsVar.zzcd() == zzkk.zze.zzsj) {
/* 13 */                for (int i = this.count - 1; i >= 0; i--) {
/* 25 */                    zznsVar.zza(this.zzvs[i] >>> 3, this.zzue[i]);
                        }
/* 52 */                return;
                    }
/* 34 */            for (int i2 = 0; i2 < this.count; i2++) {
/* 46 */                zznsVar.zza(this.zzvs[i2] >>> 3, this.zzue[i2]);
                    }
                }

                public final void zzbp() {
/* 2 */             this.zznh = false;
                }

                public final int zzcx() {
                    int iZze;
/* 1 */             int i = this.zzrr;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 8 */             int iZzcx = 0;
/* 11 */            for (int i2 = 0; i2 < this.count; i2++) {
/* 15 */                int i3 = this.zzvs[i2];
/* 17 */                int i4 = i3 >>> 3;
/* 19 */                int i5 = i3 & 7;
/* 21 */                if (i5 == 0) {
/* 116 */                   iZze = zzjr.zze(i4, ((Long) this.zzue[i2]).longValue());
                        } else if (i5 == 1) {
/* 101 */                   iZze = zzjr.zzg(i4, ((Long) this.zzue[i2]).longValue());
                        } else if (i5 != 2) {
/* 30 */                    if (i5 == 3) {
/* 77 */                        iZzcx = ((zzmy) this.zzue[i2]).zzcx() + (zzjr.zzab(i4) << 1) + iZzcx;
                            } else {
/* 33 */                        if (i5 != 5) {
/* 56 */                            C1697u2.m5439o(zzkq.zzdl());
/* 59 */                            return 0;
                                }
/* 45 */                        iZze = zzjr.zzj(i4, ((Integer) this.zzue[i2]).intValue());
                            }
                        } else {
/* 86 */                    iZze = zzjr.zzc(i4, (zzjc) this.zzue[i2]);
                        }
/* 49 */                iZzcx = iZze + iZzcx;
                    }
/* 124 */           this.zzrr = iZzcx;
/* 126 */           return iZzcx;
                }

                public final int zzfc() {
/* 1 */             int i = this.zzrr;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 8 */             int iZzd = 0;
/* 11 */            for (int i2 = 0; i2 < this.count; i2++) {
/* 29 */                iZzd += zzjr.zzd(this.zzvs[i2] >>> 3, (zzjc) this.zzue[i2]);
                    }
/* 33 */            this.zzrr = iZzd;
/* 35 */            return iZzd;
                }

/* 15 */        private zzmy() {
/* 16 */            this(0, new int[8], new Object[8], true);
                }

/* 52 */        public static zzmy zza(zzmy zzmyVar, zzmy zzmyVar2) {
/* 53 */            int i = zzmyVar.count + zzmyVar2.count;
/* 54 */            int[] iArrCopyOf = Arrays.copyOf(zzmyVar.zzvs, i);
/* 55 */            System.arraycopy(zzmyVar2.zzvs, 0, iArrCopyOf, zzmyVar.count, zzmyVar2.count);
/* 56 */            Object[] objArrCopyOf = Arrays.copyOf(zzmyVar.zzue, i);
/* 57 */            System.arraycopy(zzmyVar2.zzue, 0, objArrCopyOf, zzmyVar.count, zzmyVar2.count);
/* 58 */            return new zzmy(i, iArrCopyOf, objArrCopyOf, true);
                }

/* 58 */        public final void zza(StringBuilder sb, int i) {
/* 59 */            for (int i2 = 0; i2 < this.count; i2++) {
/* 61 */                zzlt.zza(sb, i, String.valueOf(this.zzvs[i2] >>> 3), this.zzue[i2]);
                    }
                }

/* 94 */        public final void zzb(zzns zznsVar) throws IOException {
/* 95 */            if (this.count == 0) {
                        return;
                    }
/* 96 */            if (zznsVar.zzcd() == zzkk.zze.zzsi) {
/* 97 */                for (int i = 0; i < this.count; i++) {
/* 98 */                    zzb(this.zzvs[i], this.zzue[i], zznsVar);
                        }
                        return;
                    }
                    for (int i2 = this.count - 1; i2 >= 0; i2--) {
/* 100 */               zzb(this.zzvs[i2], this.zzue[i2], zznsVar);
                    }
                }

/* 100 */       public final void zzb(int i, Object obj) {
/* 101 */           if (this.zznh) {
/* 102 */               int i2 = this.count;
                        int[] iArr = this.zzvs;
                        if (i2 == iArr.length) {
                            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
/* 103 */                   this.zzvs = Arrays.copyOf(iArr, i3);
/* 104 */                   this.zzue = Arrays.copyOf(this.zzue, i3);
                        }
/* 105 */               int[] iArr2 = this.zzvs;
                        int i4 = this.count;
                        iArr2[i4] = i;
/* 106 */               this.zzue[i4] = obj;
/* 107 */               this.count = i4 + 1;
                        return;
                    }
/* 108 */           f42.m3660p();
                }
            }
