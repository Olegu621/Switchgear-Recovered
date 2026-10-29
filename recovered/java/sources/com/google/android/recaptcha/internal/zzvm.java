            package com.google.android.recaptcha.internal;

            import android.util.Base64;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.security.SecureRandom;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 122 */   public final class zzvm {
                protected static final Charset zza = StandardCharsets.UTF_16;
                protected int[] zzb;
                protected int[] zzc;
                private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
                private byte[] zze;
                private byte[] zzf;
                private int zzg;

                public zzvm(byte[] bArr, byte[] bArr2) {
                    int[] iArr;
/* 25 */            if (bArr.length != 32) {
/* 119 */               f42.m3649e();
/* 123 */               throw null;
                    }
/* 27 */            this.zze = bArr;
/* 30 */            this.zzg = 1;
/* 32 */            this.zzf = bArr2;
/* 38 */            this.zzb = new int[16];
/* 43 */            for (int i = 0; i < 4; i++) {
/* 58 */                this.zzb[i] = zza(this.zzd[i], 2131181306);
                    }
/* 63 */            int i2 = 4;
                    while (true) {
/* 64 */                iArr = this.zzb;
/* 68 */                if (i2 >= 12) {
                            break;
                        }
/* 79 */                iArr[i2] = zzg(this.zze, (i2 - 4) * 4);
/* 81 */                i2++;
                    }
/* 86 */            iArr[12] = this.zzg;
/* 90 */            for (int i3 = 13; i3 < 16; i3++) {
/* 103 */               this.zzb[i3] = zzg(this.zzf, (i3 - 13) * 4);
                    }
/* 108 */           int[] iArr2 = new int[16];
/* 110 */           this.zzc = iArr2;
/* 112 */           int[] iArr3 = this.zzb;
/* 114 */           int length = iArr3.length;
/* 115 */           System.arraycopy(iArr3, 0, iArr2, 0, 16);
                }

                public static int zza(int i, int i2) {
/* 3 */             if (i % 2 != 0) {
/* 14 */                return (i | i2) - (i & i2);
                    }
/* 9 */             return ((~i) & i2) | ((~i2) & i);
                }

                public static String zze(String str, byte[] bArr, zzvn zzvnVar) {
/* 2 */             byte[] bArrDecode = Base64.decode(str, 0);
/* 8 */             byte[] bArr2 = new byte[12];
/* 11 */            int length = bArrDecode.length - 12;
/* 13 */            byte[] bArr3 = new byte[length];
/* 15 */            System.arraycopy(bArrDecode, 0, bArr2, 0, 12);
/* 18 */            System.arraycopy(bArrDecode, 12, bArr3, 0, length);
/* 34 */            return new String(new zzvm(bArr, bArr2).zzd(bArr3), zza);
                }

                public static String zzf(String str, byte[] bArr, zzvn zzvnVar) {
/* 3 */             byte[] bArr2 = new byte[12];
/* 10 */            new SecureRandom().nextBytes(bArr2);
/* 24 */            byte[] bArrZzd = new zzvm(bArr, bArr2).zzd(str.getBytes(zza));
/* 28 */            int length = bArrZzd.length;
/* 31 */            byte[] bArr3 = new byte[length + 12];
/* 34 */            System.arraycopy(bArr2, 0, bArr3, 0, 12);
/* 37 */            System.arraycopy(bArrZzd, 0, bArr3, 12, length);
/* 41 */            return Base64.encodeToString(bArr3, 2);
                }

                private static final int zzg(byte[] bArr, int i) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public final void zzb(int i, int i2, int i3, int i4) {
/* 3 */             zzc(i, i2, i4, 16);
/* 8 */             zzc(i3, i4, i2, 12);
/* 13 */            zzc(i, i2, i4, 8);
/* 17 */            zzc(i3, i4, i2, 7);
                }

                public final void zzc(int i, int i2, int i3, int i4) {
/* 1 */             int[] iArr = this.zzb;
/* 7 */             int i5 = iArr[i] + iArr[i2];
/* 8 */             iArr[i] = i5;
/* 12 */            int iZza = zza(iArr[i3], i5);
/* 16 */            iArr[i3] = iZza;
/* 24 */            iArr[i3] = (iZza << i4) | (iZza >>> (32 - i4));
                }

                public final byte[] zzd(byte[] bArr) {
/* 8 */             if (this.zzg != 1) {
/* 181 */               f42.m3664t();
/* 184 */               return null;
                    }
/* 10 */            int length = bArr.length;
/* 11 */            byte[] bArr2 = new byte[length];
/* 14 */            int i = 0;
/* 15 */            while (length > 0) {
/* 17 */                int[] iArr = this.zzc;
/* 19 */                int[] iArr2 = this.zzb;
/* 21 */                int length2 = iArr.length;
/* 24 */                System.arraycopy(iArr, 0, iArr2, 0, 16);
/* 33 */                this.zzb[12] = this.zzg;
/* 39 */                for (int i2 = 0; i2 < 10; i2++) {
/* 44 */                    zzb(0, 4, 8, 12);
/* 52 */                    zzb(1, 5, 9, 13);
/* 59 */                    zzb(2, 6, 10, 14);
/* 67 */                    zzb(3, 7, 11, 15);
/* 70 */                    zzb(0, 5, 10, 15);
/* 73 */                    zzb(1, 6, 11, 12);
/* 81 */                    zzb(2, 7, 8, 13);
/* 89 */                    zzb(3, 4, 9, 14);
                        }
/* 99 */                byte[] bArr3 = new byte[64];
/* 104 */               for (int i3 = 0; i3 < 16; i3++) {
/* 108 */                   int i4 = this.zzb[i3];
/* 110 */                   int i5 = i3 * 4;
/* 115 */                   bArr3[i5] = (byte) (i4 & 255);
/* 124 */                   bArr3[i5 + 1] = (byte) ((i4 >> 8) & 255);
/* 133 */                   bArr3[i5 + 2] = (byte) ((i4 >> 16) & 255);
/* 141 */                   bArr3[i5 + 3] = (byte) ((i4 >> 24) & 255);
                        }
/* 151 */               for (int i6 = 0; i6 < Math.min(64, length); i6++) {
/* 153 */                   int i7 = i + i6;
/* 164 */                   bArr2[i7] = (byte) zza(bArr3[i6], bArr[i7]);
                        }
/* 172 */               this.zzg++;
/* 174 */               length -= 64;
/* 176 */               i += 64;
                    }
/* 180 */           return bArr2;
                }

/* 123 */       public zzvm() {
                }
            }
