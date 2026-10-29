            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.util.Arrays;
            import java.util.List;
            import javax.crypto.AEADBadTagException;
            import javax.crypto.Cipher;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            /* JADX INFO: renamed from: o6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1990o6 implements a80 {

                /* JADX INFO: renamed from: c */
                public static final List f14635c = Arrays.asList(64);

                /* JADX INFO: renamed from: d */
                public static final byte[] f14636d = new byte[16];

                /* JADX INFO: renamed from: e */
                public static final byte[] f14637e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

                /* JADX INFO: renamed from: a */
                public final ac1 f14638a;

                /* JADX INFO: renamed from: b */
                public final byte[] f14639b;

                public C1990o6(byte[] bArr) throws GeneralSecurityException {
/* 9 */             if (!pm2.m7478a(1)) {
/* 72 */                ds0.m3203t("Can not use AES-SIV in FIPS-mode.");
/* 76 */                throw null;
                    }
/* 22 */            if (!f14635c.contains(Integer.valueOf(bArr.length))) {
/* 69 */                throw new InvalidKeyException(fm0.m3786l(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
                    }
/* 28 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
/* 40 */            this.f14639b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
/* 47 */            this.f14638a = new ac1(bArrCopyOfRange);
                }

                @Override // p000.a80
                /* JADX INFO: renamed from: a */
                public final byte[] mo98a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 5 */             if (bArr.length > 2147483631) {
/* 84 */                ds0.m3203t("plaintext too long");
/* 87 */                return null;
                    }
/* 17 */            Cipher cipher = (Cipher) he0.f9026b.f9028a.mo2941x("AES/CTR/NoPadding");
/* 23 */            byte[] bArrM7105c = m7105c(bArr2, bArr);
/* 31 */            byte[] bArr3 = (byte[]) bArrM7105c.clone();
/* 40 */            bArr3[8] = (byte) (bArr3[8] & 127);
/* 49 */            bArr3[12] = (byte) (bArr3[12] & 127);
/* 66 */            cipher.init(1, new SecretKeySpec(this.f14639b, "AES"), new IvParameterSpec(bArr3));
/* 77 */            return k50.m5965b(bArrM7105c, cipher.doFinal(bArr));
                }

                @Override // p000.a80
                /* JADX INFO: renamed from: b */
                public final byte[] mo99b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 4 */             if (bArr.length < 16) {
/* 120 */               ds0.m3203t("Ciphertext too short.");
/* 123 */               return null;
                    }
/* 16 */            Cipher cipher = (Cipher) he0.f9026b.f9028a.mo2941x("AES/CTR/NoPadding");
/* 19 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
/* 27 */            byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
/* 36 */            bArr3[8] = (byte) (bArr3[8] & 127);
/* 45 */            bArr3[12] = (byte) (bArr3[12] & 127);
/* 62 */            cipher.init(2, new SecretKeySpec(this.f14639b, "AES"), new IvParameterSpec(bArr3));
/* 66 */            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
/* 70 */            byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
/* 75 */            if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
/* 93 */                bArrDoFinal = new byte[0];
                    }
/* 107 */           if (MessageDigest.isEqual(bArrCopyOfRange, m7105c(bArr2, bArrDoFinal))) {
/* 109 */               return bArrDoFinal;
                    }
/* 117 */           throw new AEADBadTagException("Integrity check failed.");
                }

                /* JADX INFO: renamed from: c */
                public final byte[] m7105c(byte[]... bArr) throws GeneralSecurityException {
                    byte[] bArrM5962P;
/* 1 */             int length = bArr.length;
/* 4 */             ac1 ac1Var = this.f14638a;
/* 6 */             if (length == 0) {
/* 10 */                return ac1Var.mo172a(f14637e, 16);
                    }
/* 17 */            byte[] bArrMo172a = ac1Var.mo172a(f14636d, 16);
/* 26 */            for (int i = 0; i < bArr.length - 1; i++) {
/* 28 */                byte[] bArr2 = bArr[i];
/* 30 */                if (bArr2 == null) {
/* 32 */                    bArr2 = new byte[0];
                        }
/* 42 */                bArrMo172a = k50.m5962P(qj3.m7904o(bArrMo172a), ac1Var.mo172a(bArr2, 16));
                    }
/* 52 */            byte[] bArr3 = bArr[bArr.length - 1];
/* 56 */            if (bArr3.length >= 16) {
/* 60 */                if (bArr3.length < bArrMo172a.length) {
/* 88 */                    C1951n4.m6859j("xorEnd requires a.length >= b.length");
/* 55 */                    return null;
                        }
/* 64 */                int length2 = bArr3.length - bArrMo172a.length;
/* 66 */                bArrM5962P = Arrays.copyOf(bArr3, bArr3.length);
/* 71 */                for (int i2 = 0; i2 < bArrMo172a.length; i2++) {
/* 73 */                    int i3 = length2 + i2;
/* 81 */                    bArrM5962P[i3] = (byte) (bArrM5962P[i3] ^ bArrMo172a[i2]);
                        }
                    } else {
/* 93 */                if (bArr3.length >= 16) {
/* 119 */                   C1951n4.m6859j("x must be smaller than a block.");
/* 55 */                    return null;
                        }
/* 95 */                byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
/* 102 */               bArrCopyOf[bArr3.length] = -128;
/* 108 */               bArrM5962P = k50.m5962P(bArrCopyOf, qj3.m7904o(bArrMo172a));
                    }
/* 112 */           return ac1Var.mo172a(bArrM5962P, 16);
                }
            }
