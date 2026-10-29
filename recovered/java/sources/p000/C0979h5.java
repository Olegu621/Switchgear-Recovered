            package p000;

            import java.security.GeneralSecurityException;
            import javax.crypto.Cipher;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            /* JADX INFO: renamed from: h5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0979h5 {

                /* JADX INFO: renamed from: d */
                public static final C0942g5 f8892d = new C0942g5(0);

                /* JADX INFO: renamed from: a */
                public final SecretKeySpec f8893a;

                /* JADX INFO: renamed from: b */
                public final int f8894b;

                /* JADX INFO: renamed from: c */
                public final int f8895c;

                public C0979h5(byte[] bArr, int i) throws GeneralSecurityException {
/* 10 */            if (!pm2.m7479b(2)) {
/* 56 */                ds0.m3203t("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
/* 59 */                throw null;
                    }
/* 13 */            r13.m8049a(bArr.length);
/* 23 */            this.f8893a = new SecretKeySpec(bArr, "AES");
/* 33 */            int blockSize = ((Cipher) f8892d.get()).getBlockSize();
/* 37 */            this.f8895c = blockSize;
/* 41 */            if (i < 12 || i > blockSize) {
/* 50 */                ds0.m3203t("invalid IV size");
/* 53 */                throw null;
                    }
/* 45 */            this.f8894b = i;
                }

                /* JADX INFO: renamed from: a */
                public final void m4112a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
/* 7 */             Cipher cipher = (Cipher) f8892d.get();
/* 11 */            byte[] bArr4 = new byte[this.f8895c];
/* 16 */            System.arraycopy(bArr3, 0, bArr4, 0, this.f8894b);
/* 21 */            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
/* 24 */            SecretKeySpec secretKeySpec = this.f8893a;
/* 26 */            if (z) {
/* 29 */                cipher.init(1, secretKeySpec, ivParameterSpec);
                    } else {
/* 35 */                cipher.init(2, secretKeySpec, ivParameterSpec);
                    }
/* 43 */            if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
/* 45 */                return;
                    }
/* 48 */            ds0.m3203t("stored output's length does not match input's length");
                }
            }
