            package p000;

            import io.sentry.android.core.AbstractC1245n0;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.KeyStore;
            import java.security.NoSuchAlgorithmException;
            import java.security.ProviderException;
            import java.security.spec.AlgorithmParameterSpec;
            import java.util.Arrays;
            import javax.crypto.AEADBadTagException;
            import javax.crypto.Cipher;
            import javax.crypto.NoSuchPaddingException;
            import javax.crypto.SecretKey;
            import javax.crypto.spec.GCMParameterSpec;
            
            /* JADX INFO: renamed from: y5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 53 */    public final class C2486y5 implements InterfaceC0203c4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19479a;

                /* JADX INFO: renamed from: b */
                public final Object f19480b;

                public C2486y5(byte[] bArr, int i) throws GeneralSecurityException {
/* 1 */             this.f19479a = i;
                    switch (i) {
                        case 2:
/* 52 */                    this.f19480b = new iy0(bArr, 0);
/* 54 */                    return;
                        case 3:
/* 40 */                    this.f19480b = new iy0(bArr, 1);
/* 42 */                    return;
                        default:
/* 14 */                    if (pm2.m7479b(2)) {
/* 21 */                        this.f19480b = new gy0(bArr);
/* 23 */                        return;
                            } else {
/* 26 */                        ds0.m3203t("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
/* 30 */                        throw null;
                            }
                    }
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: a */
                public final byte[] mo1524a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             int i = this.f19479a;
/* 5 */             Object obj = this.f19480b;
                    switch (i) {
                        case 0:
/* 92 */                    byte[] bArrM7088a = o02.m7088a(12);
/* 96 */                    gy0 gy0Var = (gy0) obj;
/* 98 */                    boolean z = gy0Var.f8848b;
/* 102 */                   if (bArrM7088a.length != 12) {
/* 209 */                       ds0.m3203t("iv is wrong size");
/* 101 */                       return null;
                            }
/* 108 */                   if (bArr.length > 2147483619) {
/* 203 */                       ds0.m3203t("plaintext too long");
/* 101 */                       return null;
                            }
/* 119 */                   byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
/* 122 */                   if (z) {
/* 124 */                       System.arraycopy(bArrM7088a, 0, bArr3, 0, 12);
                            }
/* 127 */                   AlgorithmParameterSpec algorithmParameterSpecM4039a = gy0.m4039a(bArrM7088a);
/* 131 */                   C0942g5 c0942g5 = gy0.f8846c;
/* 142 */                   ((Cipher) c0942g5.get()).init(1, gy0Var.f8847a, algorithmParameterSpecM4039a);
/* 145 */                   if (bArr2 != null && bArr2.length != 0) {
/* 156 */                       ((Cipher) c0942g5.get()).updateAAD(bArr2);
                            }
/* 174 */                   int iDoFinal = ((Cipher) c0942g5.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
/* 181 */                   if (iDoFinal == bArr.length + 16) {
/* 183 */                       return bArr3;
                            }
/* 200 */                   throw new GeneralSecurityException(AbstractC0886en.m3505i(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
                        case 1:
                            try {
/* 60 */                        return m10103d(bArr, bArr2);
                            } catch (GeneralSecurityException | ProviderException e) {
/* 72 */                        AbstractC1245n0.m4891s("y5", "encountered a potentially transient KeyStore error, will wait and retry", e);
                                try {
/* 84 */                            Thread.sleep((int) (Math.random() * 100.0d));
                                    break;
                                } catch (InterruptedException unused) {
                                }
/* 87 */                        return m10103d(bArr, bArr2);
                            }
                        case 2:
/* 39 */                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
/* 43 */                    byte[] bArrM7088a2 = o02.m7088a(12);
/* 47 */                    byteBufferAllocate.put(bArrM7088a2);
/* 52 */                    ((iy0) obj).m8748g(byteBufferAllocate, bArrM7088a2, bArr, bArr2);
/* 55 */                    return byteBufferAllocate.array();
                        default:
/* 13 */                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
/* 19 */                    byte[] bArrM7088a3 = o02.m7088a(24);
/* 23 */                    byteBufferAllocate2.put(bArrM7088a3);
/* 28 */                    ((iy0) obj).m8748g(byteBufferAllocate2, bArrM7088a3, bArr, bArr2);
/* 31 */                    return byteBufferAllocate2.array();
                    }
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: b */
                public final byte[] mo1525b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             int i = this.f19479a;
/* 7 */             Object obj = this.f19480b;
                    switch (i) {
                        case 0:
/* 108 */                   byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
/* 112 */                   gy0 gy0Var = (gy0) obj;
/* 114 */                   boolean z = gy0Var.f8848b;
/* 117 */                   if (bArrCopyOf.length != 12) {
/* 207 */                       ds0.m3203t("iv is wrong size");
/* 11 */                        return null;
                            }
/* 125 */                   if (bArr.length < (z ? 28 : 16)) {
/* 201 */                       ds0.m3203t("ciphertext too short");
/* 11 */                        return null;
                            }
/* 128 */                   if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
/* 147 */                       ds0.m3203t("iv does not match prepended iv");
/* 11 */                        return null;
                            }
/* 151 */                   AlgorithmParameterSpec algorithmParameterSpecM4039a = gy0.m4039a(bArrCopyOf);
/* 155 */                   C0942g5 c0942g5 = gy0.f8846c;
/* 166 */                   ((Cipher) c0942g5.get()).init(2, gy0Var.f8847a, algorithmParameterSpecM4039a);
/* 169 */                   if (bArr2 != null && bArr2.length != 0) {
/* 180 */                       ((Cipher) c0942g5.get()).updateAAD(bArr2);
                            }
/* 183 */                   int i2 = z ? 12 : 0;
/* 186 */                   int length = bArr.length;
/* 187 */                   if (z) {
/* 189 */                       length -= 12;
                            }
/* 196 */                   return ((Cipher) c0942g5.get()).doFinal(bArr, i2, length);
                        case 1:
/* 68 */                    if (bArr.length < 28) {
/* 104 */                       ds0.m3203t("ciphertext too short");
/* 11 */                        return null;
                            }
                            try {
/* 70 */                        return m10102c(bArr, bArr2);
                            } catch (ProviderException e) {
/* 77 */                        e = e;
/* 82 */                        AbstractC1245n0.m4891s("y5", "encountered a potentially transient KeyStore error, will wait and retry", e);
                                try {
/* 94 */                            Thread.sleep((int) (Math.random() * 100.0d));
                                    break;
                                } catch (InterruptedException unused) {
                                }
/* 97 */                        return m10102c(bArr, bArr2);
                            } catch (AEADBadTagException e2) {
/* 103 */                       throw e2;
                            } catch (GeneralSecurityException e3) {
/* 75 */                        e = e3;
/* 82 */                        AbstractC1245n0.m4891s("y5", "encountered a potentially transient KeyStore error, will wait and retry", e);
/* 94 */                        Thread.sleep((int) (Math.random() * 100.0d));
/* 97 */                        return m10102c(bArr, bArr2);
                            }
                        case 2:
/* 44 */                    if (bArr.length >= 28) {
/* 58 */                        return ((iy0) obj).m8747f(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
                            }
/* 63 */                    ds0.m3203t("ciphertext too short");
/* 11 */                    return null;
                        default:
/* 18 */                    if (bArr.length >= 40) {
/* 34 */                        return ((iy0) obj).m8747f(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
                            }
/* 39 */                    ds0.m3203t("ciphertext too short");
/* 11 */                    return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public byte[] m10102c(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
/* 8 */             GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
/* 13 */            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
/* 22 */            cipher.init(2, (SecretKey) this.f19480b, gCMParameterSpec);
/* 25 */            cipher.updateAAD(bArr2);
/* 30 */            return cipher.doFinal(bArr, 12, bArr.length - 12);
                }

                /* JADX INFO: renamed from: d */
                public byte[] m10103d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 5 */             if (bArr.length > 2147483619) {
/* 50 */                ds0.m3203t("plaintext too long");
/* 53 */                return null;
                    }
/* 10 */            byte[] bArr3 = new byte[bArr.length + 28];
/* 14 */            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
/* 23 */            cipher.init(1, (SecretKey) this.f19480b);
/* 26 */            cipher.updateAAD(bArr2);
/* 34 */            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
/* 44 */            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
/* 47 */            return bArr3;
                }

/* 54 */        public C2486y5(String str, KeyStore keyStore) throws InvalidKeyException {
                    this.f19479a = 1;
/* 56 */            SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
                    this.f19480b = secretKey;
                    if (secretKey == null) {
/* 57 */                throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
                    }
                }
            }
