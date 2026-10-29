            package com.google.android.gms.internal.fido;

            import java.math.RoundingMode;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 87 */    final class zzbh {
                final int zza;
                final int zzb;
                final int zzc;
                final int zzd;
                private final String zze;
                private final char[] zzf;
                private final byte[] zzg;
                private final boolean zzh;

                private zzbh(String str, char[] cArr, byte[] bArr, boolean z) {
/* 4 */             this.zze = str;
/* 6 */             cArr.getClass();
/* 9 */             this.zzf = cArr;
                    try {
/* 11 */                int length = cArr.length;
/* 14 */                int iZzb = zzbn.zzb(length, RoundingMode.UNNECESSARY);
/* 18 */                this.zzb = iZzb;
/* 20 */                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
/* 27 */                int i = 1 << (3 - iNumberOfTrailingZeros);
/* 29 */                this.zzc = i;
/* 33 */                this.zzd = iZzb >> iNumberOfTrailingZeros;
/* 37 */                this.zza = length - 1;
/* 39 */                this.zzg = bArr;
/* 41 */                boolean[] zArr = new boolean[i];
/* 47 */                for (int i2 = 0; i2 < this.zzd; i2++) {
/* 59 */                    zArr[zzbn.zza(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
                        }
/* 64 */                this.zzh = false;
                    } catch (ArithmeticException e) {
/* 88 */                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof zzbh) && Arrays.equals(this.zzf, ((zzbh) obj).zzf);
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(this.zzf) + 1237;
                }

                public final String toString() {
/* 1 */             return this.zze;
                }

                public final char zza(int i) {
/* 3 */             return this.zzf[i];
                }

                public final boolean zzb(char c) {
                    return c < 128 && this.zzg[c] != -1;
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 88 */        public zzbh(String str, char[] cArr) {
/* 89 */            byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
/* 90 */            for (int i = 0; i < cArr.length; i++) {
/* 91 */                char c = cArr[i];
                        boolean z = true;
/* 92 */                zzas.zzd(c < 128, "Non-ASCII character: %s", c);
/* 93 */                if (bArr[c] != -1) {
                            z = false;
                        }
                        zzas.zzd(z, "Duplicate character: %s", c);
/* 94 */                bArr[c] = (byte) i;
                    }
/* 95 */            this(str, cArr, bArr, false);
                }
            }
