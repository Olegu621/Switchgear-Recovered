            package p000;

            import java.security.GeneralSecurityException;
            import java.security.spec.AlgorithmParameterSpec;
            import javax.crypto.Cipher;
            import javax.crypto.spec.GCMParameterSpec;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            /* JADX INFO: renamed from: g6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0943g6 implements InterfaceC0203c4 {

                /* JADX INFO: renamed from: b */
                public static final C0942g5 f8480b = new C0942g5(3);

                /* JADX INFO: renamed from: c */
                public static final boolean f8481c;

                /* JADX INFO: renamed from: a */
                public final SecretKeySpec f8482a;

                static {
                    boolean z;
                    try {
/* 11 */                Class.forName("javax.crypto.spec.GCMParameterSpec");
/* 14 */                z = true;
                    } catch (ClassNotFoundException unused) {
/* 16 */                z = false;
                    }
/* 17 */            f8481c = z;
                }

                public C0943g6(byte[] bArr) {
/* 5 */             r13.m8049a(bArr.length);
/* 15 */            this.f8482a = new SecretKeySpec(bArr, "AES");
                }

                /* JADX INFO: renamed from: c */
                public static AlgorithmParameterSpec m3877c(byte[] bArr, int i) throws GeneralSecurityException {
/* 4 */             if (f8481c) {
/* 10 */                return new GCMParameterSpec(128, bArr, 0, i);
                    }
/* 26 */            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
/* 30 */                return new IvParameterSpec(bArr, 0, i);
                    }
/* 36 */            ds0.m3203t("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
/* 39 */            return null;
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: a */
                public final byte[] mo1524a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 5 */             if (bArr.length > 2147483619) {
/* 95 */                ds0.m3203t("plaintext too long");
/* 98 */                return null;
                    }
/* 10 */            byte[] bArr3 = new byte[bArr.length + 28];
/* 14 */            byte[] bArrM7088a = o02.m7088a(12);
/* 19 */            System.arraycopy(bArrM7088a, 0, bArr3, 0, 12);
/* 23 */            AlgorithmParameterSpec algorithmParameterSpecM3877c = m3877c(bArrM7088a, bArrM7088a.length);
/* 27 */            C0942g5 c0942g5 = f8480b;
/* 38 */            ((Cipher) c0942g5.get()).init(1, this.f8482a, algorithmParameterSpecM3877c);
/* 41 */            if (bArr2 != null && bArr2.length != 0) {
/* 52 */                ((Cipher) c0942g5.get()).updateAAD(bArr2);
                    }
/* 67 */            int iDoFinal = ((Cipher) c0942g5.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
/* 74 */            if (iDoFinal == bArr.length + 16) {
/* 76 */                return bArr3;
                    }
/* 92 */            throw new GeneralSecurityException(AbstractC0886en.m3505i(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: b */
                public final byte[] mo1525b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 4 */             if (bArr.length < 28) {
/* 55 */                ds0.m3203t("ciphertext too short");
/* 58 */                return null;
                    }
/* 8 */             AlgorithmParameterSpec algorithmParameterSpecM3877c = m3877c(bArr, 12);
/* 12 */            C0942g5 c0942g5 = f8480b;
/* 23 */            ((Cipher) c0942g5.get()).init(2, this.f8482a, algorithmParameterSpecM3877c);
/* 26 */            if (bArr2 != null && bArr2.length != 0) {
/* 37 */                ((Cipher) c0942g5.get()).updateAAD(bArr2);
                    }
/* 48 */            return ((Cipher) c0942g5.get()).doFinal(bArr, 12, bArr.length - 12);
                }
            }
