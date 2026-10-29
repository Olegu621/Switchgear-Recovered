            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import javax.crypto.AEADBadTagException;
            import javax.crypto.BadPaddingException;
            import javax.crypto.Cipher;
            import javax.crypto.IllegalBlockSizeException;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            /* JADX INFO: renamed from: o5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1989o5 implements InterfaceC0203c4 {

                /* JADX INFO: renamed from: e */
                public static final C0942g5 f14615e = new C0942g5(1);

                /* JADX INFO: renamed from: f */
                public static final C0942g5 f14616f = new C0942g5(2);

                /* JADX INFO: renamed from: a */
                public final byte[] f14617a;

                /* JADX INFO: renamed from: b */
                public final byte[] f14618b;

                /* JADX INFO: renamed from: c */
                public final SecretKeySpec f14619c;

                /* JADX INFO: renamed from: d */
                public final int f14620d;

                public C1989o5(byte[] bArr, int i) throws GeneralSecurityException {
/* 10 */            if (!pm2.m7478a(1)) {
/* 74 */                ds0.m3203t("Can not use AES-EAX in FIPS-mode.");
/* 77 */                throw null;
                    }
/* 16 */            if (i != 12 && i != 16) {
/* 23 */                C1951n4.m6859j("IV size should be either 12 or 16 bytes");
/* 26 */                throw null;
                    }
/* 27 */            this.f14620d = i;
/* 30 */            r13.m8049a(bArr.length);
/* 37 */            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
/* 40 */            this.f14619c = secretKeySpec;
/* 48 */            Cipher cipher = (Cipher) f14615e.get();
/* 50 */            cipher.init(1, secretKeySpec);
/* 59 */            byte[] bArrM7100c = m7100c(cipher.doFinal(new byte[16]));
/* 63 */            this.f14617a = bArrM7100c;
/* 69 */            this.f14618b = m7100c(bArrM7100c);
                }

                /* JADX INFO: renamed from: c */
                public static byte[] m7100c(byte[] bArr) {
/* 3 */             byte[] bArr2 = new byte[16];
/* 6 */             int i = 0;
/* 9 */             while (i < 15) {
/* 15 */                int i2 = i + 1;
/* 27 */                bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
/* 29 */                i = i2;
                    }
/* 43 */            bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
/* 45 */            return bArr2;
                }

                /* JADX INFO: renamed from: e */
                public static byte[] m7101e(byte[] bArr, byte[] bArr2) {
/* 1 */             int length = bArr.length;
/* 2 */             byte[] bArr3 = new byte[length];
/* 5 */             for (int i = 0; i < length; i++) {
/* 13 */                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
                    }
/* 18 */            return bArr3;
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: a */
                public final byte[] mo1524a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 5 */             int length = bArr.length;
/* 9 */             int i = this.f14620d;
/* 12 */            if (length > 2147483631 - i) {
/* 130 */               ds0.m3203t("plaintext too long");
/* 133 */               return null;
                    }
/* 19 */            byte[] bArr3 = new byte[bArr.length + i + 16];
/* 21 */            byte[] bArrM7088a = o02.m7088a(i);
/* 26 */            System.arraycopy(bArrM7088a, 0, bArr3, 0, i);
/* 35 */            Cipher cipher = (Cipher) f14615e.get();
/* 38 */            SecretKeySpec secretKeySpec = this.f14619c;
/* 40 */            cipher.init(1, secretKeySpec);
/* 46 */            byte[] bArrM7102d = m7102d(cipher, 0, bArrM7088a, 0, bArrM7088a.length);
/* 56 */            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
/* 63 */            byte[] bArrM7102d2 = m7102d(cipher, 1, bArr4, 0, bArr4.length);
/* 76 */            Cipher cipher2 = (Cipher) f14616f.get();
/* 83 */            cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM7102d));
/* 92 */            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f14620d);
/* 103 */           byte[] bArrM7102d3 = m7102d(cipher, 2, bArr3, this.f14620d, bArr.length);
/* 108 */           int length2 = bArr.length + i;
/* 109 */           for (int i2 = 0; i2 < 16; i2++) {
/* 122 */               bArr3[length2 + i2] = (byte) ((bArrM7102d2[i2] ^ bArrM7102d[i2]) ^ bArrM7102d3[i2]);
                    }
/* 95 */            return bArr3;
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: b */
                public final byte[] mo1525b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             int length = bArr.length;
/* 2 */             int i = this.f14620d;
/* 7 */             int i2 = (length - i) - 16;
/* 9 */             if (i2 < 0) {
/* 117 */               ds0.m3203t("ciphertext too short");
/* 120 */               return null;
                    }
/* 17 */            Cipher cipher = (Cipher) f14615e.get();
/* 20 */            SecretKeySpec secretKeySpec = this.f14619c;
/* 22 */            cipher.init(1, secretKeySpec);
/* 31 */            byte[] bArrM7102d = m7102d(cipher, 0, bArr, 0, this.f14620d);
/* 42 */            byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
/* 48 */            byte[] bArrM7102d2 = m7102d(cipher, 1, bArr3, 0, bArr3.length);
/* 57 */            byte[] bArrM7102d3 = m7102d(cipher, 2, bArr, this.f14620d, i2);
/* 62 */            int length2 = bArr.length - 16;
/* 63 */            byte b = 0;
/* 64 */            for (int i3 = 0; i3 < 16; i3++) {
/* 80 */                b = (byte) (b | (((bArr[length2 + i3] ^ bArrM7102d2[i3]) ^ bArrM7102d[i3]) ^ bArrM7102d3[i3]));
                    }
/* 84 */            if (b != 0) {
/* 114 */               throw new AEADBadTagException("tag mismatch");
                    }
/* 92 */            Cipher cipher2 = (Cipher) f14616f.get();
/* 99 */            cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM7102d));
/* 102 */           return cipher2.doFinal(bArr, i, i2);
                }

                /* JADX INFO: renamed from: d */
                public final byte[] m7102d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
                    byte[] bArrCopyOf;
/* 3 */             byte[] bArr2 = new byte[16];
/* 8 */             bArr2[15] = (byte) i;
/* 10 */            byte[] bArr3 = this.f14617a;
/* 12 */            if (i3 == 0) {
/* 18 */                return cipher.doFinal(m7101e(bArr2, bArr3));
                    }
/* 23 */            byte[] bArrDoFinal = cipher.doFinal(bArr2);
/* 28 */            int i4 = 0;
/* 31 */            while (i3 - i4 > 16) {
/* 34 */                for (int i5 = 0; i5 < 16; i5++) {
/* 45 */                    bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
                        }
/* 50 */                bArrDoFinal = cipher.doFinal(bArrDoFinal);
/* 54 */                i4 += 16;
                    }
/* 59 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
/* 64 */            if (bArrCopyOfRange.length == 16) {
/* 66 */                bArrCopyOf = m7101e(bArrCopyOfRange, bArr3);
                    } else {
/* 73 */                bArrCopyOf = Arrays.copyOf(this.f14618b, 16);
/* 78 */                for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
/* 86 */                    bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
                        }
/* 98 */                bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
                    }
/* 104 */           return cipher.doFinal(m7101e(bArrDoFinal, bArrCopyOf));
                }
            }
