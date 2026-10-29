            package com.google.android.recaptcha.internal;

            import java.math.RoundingMode;
            import java.util.Arrays;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 81 */    final class zzpk {
                final int zza;
                final int zzb;
                final int zzc;
                final int zzd;
                private final String zze;
                private final char[] zzf;
                private final byte[] zzg;
                private final boolean[] zzh;
                private final boolean zzi;

                private zzpk(String str, char[] cArr, byte[] bArr, boolean z) {
/* 4 */             this.zze = str;
/* 6 */             cArr.getClass();
/* 9 */             this.zzf = cArr;
                    try {
/* 11 */                int length = cArr.length;
/* 14 */                int iZzb = zzpr.zzb(length, RoundingMode.UNNECESSARY);
/* 18 */                this.zzb = iZzb;
/* 20 */                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
/* 27 */                int i = 1 << (3 - iNumberOfTrailingZeros);
/* 29 */                this.zzc = i;
/* 33 */                this.zzd = iZzb >> iNumberOfTrailingZeros;
/* 37 */                this.zza = length - 1;
/* 39 */                this.zzg = bArr;
/* 41 */                boolean[] zArr = new boolean[i];
/* 47 */                for (int i2 = 0; i2 < this.zzd; i2++) {
/* 59 */                    zArr[zzpr.zza(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
                        }
/* 64 */                this.zzh = zArr;
/* 66 */                this.zzi = false;
                    } catch (ArithmeticException e) {
/* 82 */                throw new IllegalArgumentException(fm0.m3781g(cArr.length, "Illegal alphabet length "), e);
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof zzpk) && Arrays.equals(this.zzf, ((zzpk) obj).zzf);
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

                public final int zzb(char c) throws zzpn {
/* 5 */             if (c > 127) {
/* 77 */                throw new zzpn("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
                    }
/* 9 */             byte b = this.zzg[c];
/* 12 */            if (b != -1) {
/* 59 */                return b;
                    }
/* 16 */            if (c <= ' ' || c == 127) {
/* 58 */                throw new zzpn("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
                    }
/* 40 */            throw new zzpn("Unrecognized character: " + c);
                }

                public final boolean zzc(int i) {
/* 6 */             return this.zzh[i % this.zzc];
                }

                public final boolean zzd(char c) {
                    return this.zzg[61] != -1;
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 82 */        public zzpk(String str, char[] cArr) {
/* 83 */            byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
/* 84 */            for (int i = 0; i < cArr.length; i++) {
/* 85 */                char c = cArr[i];
                        boolean z = true;
/* 86 */                zzmd.zzc(c < 128, "Non-ASCII character: %s", c);
/* 87 */                if (bArr[c] != -1) {
                            z = false;
                        }
                        zzmd.zzc(z, "Duplicate character: %s", c);
/* 88 */                bArr[c] = (byte) i;
                    }
/* 89 */            this(str, cArr, bArr, false);
                }
            }
