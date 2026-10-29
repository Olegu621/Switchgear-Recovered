            package com.google.android.gms.internal.auth;

            import java.util.Arrays;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class zzgz {
                private static final zzgz zza = new zzgz(0, new int[0], new Object[0], false);
                private int zzb;
                private int[] zzc;
                private Object[] zzd;
                private boolean zze;

                private zzgz(int i, int[] iArr, Object[] objArr, boolean z) {
/* 4 */             this.zzb = i;
/* 6 */             this.zzc = iArr;
/* 8 */             this.zzd = objArr;
/* 10 */            this.zze = z;
                }

                public static zzgz zza() {
/* 1 */             return zza;
                }

                public static zzgz zzb(zzgz zzgzVar, zzgz zzgzVar2) {
/* 5 */             int i = zzgzVar.zzb + zzgzVar2.zzb;
/* 8 */             int[] iArrCopyOf = Arrays.copyOf(zzgzVar.zzc, i);
/* 19 */            System.arraycopy(zzgzVar2.zzc, 0, iArrCopyOf, zzgzVar.zzb, zzgzVar2.zzb);
/* 24 */            Object[] objArrCopyOf = Arrays.copyOf(zzgzVar.zzd, i);
/* 34 */            System.arraycopy(zzgzVar2.zzd, 0, objArrCopyOf, zzgzVar.zzb, zzgzVar2.zzb);
/* 40 */            return new zzgz(i, iArrCopyOf, objArrCopyOf, true);
                }

                public static zzgz zzc() {
/* 11 */            return new zzgz(0, new int[8], new Object[8], true);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof zzgz)) {
/* 5 */                 return false;
                    }
/* 14 */            zzgz zzgzVar = (zzgz) obj;
/* 16 */            int i = this.zzb;
/* 20 */            if (i == zzgzVar.zzb) {
/* 22 */                int[] iArr = this.zzc;
/* 24 */                int[] iArr2 = zzgzVar.zzc;
/* 27 */                for (int i2 = 0; i2 < i; i2++) {
/* 33 */                    if (iArr[i2] == iArr2[i2]) {
                            }
                        }
/* 39 */                Object[] objArr = this.zzd;
/* 41 */                Object[] objArr2 = zzgzVar.zzd;
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
/* 5 */             int i2 = (i + 527) * 31;
/* 7 */             int[] iArr = this.zzc;
/* 9 */             int iHashCode = 17;
/* 12 */            int i3 = 17;
/* 14 */            for (int i4 = 0; i4 < i; i4++) {
/* 20 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 25 */            int i5 = (i2 + i3) * 31;
/* 27 */            Object[] objArr = this.zzd;
/* 29 */            int i6 = this.zzb;
/* 31 */            for (int i7 = 0; i7 < i6; i7++) {
/* 41 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 45 */            return i5 + iHashCode;
                }

                public final void zzd() {
/* 2 */             this.zze = false;
                }

                public final void zze(StringBuilder sb, int i) {
/* 4 */             for (int i2 = 0; i2 < this.zzb; i2++) {
/* 20 */                zzfy.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
                    }
                }

                public final void zzf(int i, Object obj) {
/* 3 */             if (!this.zze) {
/* 50 */                f42.m3660p();
/* 53 */                return;
                    }
/* 5 */             int i2 = this.zzb;
/* 7 */             int[] iArr = this.zzc;
/* 10 */            if (i2 == iArr.length) {
/* 20 */                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
/* 25 */                this.zzc = Arrays.copyOf(iArr, i3);
/* 33 */                this.zzd = Arrays.copyOf(this.zzd, i3);
                    }
/* 35 */            int[] iArr2 = this.zzc;
/* 37 */            int i4 = this.zzb;
/* 39 */            iArr2[i4] = i;
/* 43 */            this.zzd[i4] = obj;
/* 47 */            this.zzb = i4 + 1;
                }

/* 12 */        private zzgz() {
/* 13 */            this(0, new int[8], new Object[8], true);
                }
            }
