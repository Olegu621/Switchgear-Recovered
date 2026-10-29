            package p000;

            import io.sentry.C1697u2;
            import java.security.InvalidKeyException;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hy0 extends AbstractC1006hw {

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f9360c;

                public hy0(byte[] bArr, int i, int i2) throws InvalidKeyException {
/* 1 */             this.f9360c = i2;
/* 9 */             if (bArr.length != 32) {
/* 27 */                throw new InvalidKeyException("The key length in bytes must be 32.");
                    }
/* 15 */            this.f9337b = AbstractC1768is.m5550c(bArr);
/* 17 */            this.f9336a = i;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: c */
                public final int[] mo4389c(int[] iArr, int i) {
                    switch (this.f9360c) {
                        case 0:
/* 126 */                   if (iArr.length != 3) {
/* 164 */                       C1697u2.m5437m("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
/* 3 */                         return null;
                            }
/* 128 */                   int[] iArr2 = new int[16];
/* 132 */                   int[] iArr3 = (int[]) this.f9337b;
/* 134 */                   int[] iArr4 = AbstractC1768is.f11916a;
/* 137 */                   System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
/* 141 */                   System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
/* 144 */                   iArr2[12] = i;
/* 147 */                   System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
/* 167 */                   return iArr2;
                        default:
/* 19 */                    if (iArr.length != 6) {
/* 121 */                       C1697u2.m5437m("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
/* 3 */                         return null;
                            }
/* 21 */                    int[] iArr5 = new int[16];
/* 25 */                    int[] iArr6 = (int[]) this.f9337b;
/* 27 */                    int[] iArr7 = new int[16];
/* 29 */                    int[] iArr8 = AbstractC1768is.f11916a;
/* 32 */                    System.arraycopy(iArr8, 0, iArr7, 0, iArr8.length);
/* 36 */                    System.arraycopy(iArr6, 0, iArr7, iArr8.length, 8);
/* 41 */                    iArr7[12] = iArr[0];
/* 46 */                    iArr7[13] = iArr[1];
/* 53 */                    iArr7[14] = iArr[2];
/* 59 */                    iArr7[15] = iArr[3];
/* 61 */                    AbstractC1768is.m5549b(iArr7);
/* 67 */                    iArr7[4] = iArr7[12];
/* 72 */                    iArr7[5] = iArr7[13];
/* 76 */                    iArr7[6] = iArr7[14];
/* 81 */                    iArr7[7] = iArr7[15];
/* 83 */                    int[] iArrCopyOf = Arrays.copyOf(iArr7, 8);
/* 88 */                    System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
/* 92 */                    System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
/* 95 */                    iArr5[12] = i;
/* 97 */                    iArr5[13] = 0;
/* 101 */                   iArr5[14] = iArr[4];
/* 105 */                   iArr5[15] = iArr[5];
/* 124 */                   return iArr5;
                    }
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: i */
                public final int mo4390i() {
                    switch (this.f9360c) {
                        case 0:
/* 9 */                     return 12;
                        default:
/* 6 */                     return 24;
                    }
                }
            }
