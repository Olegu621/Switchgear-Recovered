            package p000;

            import android.security.keystore.KeyGenParameterSpec;
            import androidx.core.app.NotificationCompat;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.NoSuchProviderException;
            import java.util.Arrays;
            import javax.crypto.KeyGenerator;
            
            /* JADX INFO: renamed from: l8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1881l8 {

                /* JADX INFO: renamed from: b */
                public static final Object f13145b = new Object();

                /* JADX INFO: renamed from: a */
                public KeyStore f13146a;

                public C1881l8() {
                    try {
/* 4 */                 KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 8 */                 keyStore.load(null);
/* 14 */                this.f13146a = keyStore;
                    } catch (IOException | GeneralSecurityException e) {
/* 20 */                C1697u2.m5439o(e);
/* 23 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public static boolean m6400a(String str) {
/* 3 */             C1881l8 c1881l8 = new C1881l8();
                    synchronized (f13145b) {
                        try {
/* 13 */                    if (c1881l8.m6403d(str)) {
/* 23 */                        return false;
                            }
/* 15 */                    m6401b(str);
/* 18 */                    return true;
                        } catch (Throwable th) {
/* 27 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m6401b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
/* 1 */             String strM8050b = r13.m8050b(str);
/* 9 */             KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
/* 49 */            keyGenerator.init(new KeyGenParameterSpec.Builder(strM8050b, 3).setKeySize(NotificationCompat.FLAG_LOCAL_ONLY).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
/* 52 */            keyGenerator.generateKey();
                }

                /* JADX INFO: renamed from: c */
                public final synchronized C2486y5 m6402c(String str) {
                    C2486y5 c2486y5;
/* 10 */            c2486y5 = new C2486y5(r13.m8050b(str), this.f13146a);
/* 15 */            byte[] bArrM7088a = o02.m7088a(10);
/* 20 */            byte[] bArr = new byte[0];
/* 34 */            if (!Arrays.equals(bArrM7088a, c2486y5.mo1525b(c2486y5.mo1524a(bArrM7088a, bArr), bArr))) {
/* 45 */                throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
/* 37 */            return c2486y5;
                }

                /* JADX INFO: renamed from: d */
                public final synchronized boolean m6403d(String str) {
                    String strM8050b;
/* 2 */             strM8050b = r13.m8050b(str);
                    try {
                    } catch (NullPointerException unused) {
/* 20 */                AbstractC1245n0.m4889q("l8", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
                        try {
                            try {
/* 32 */                        Thread.sleep((int) (Math.random() * 40.0d));
                            } catch (InterruptedException unused2) {
                            }
/* 37 */                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 41 */                    this.f13146a = keyStore;
/* 44 */                    keyStore.load(null);
/* 49 */                    return this.f13146a.containsAlias(strM8050b);
                        } catch (IOException e) {
/* 61 */                    throw new GeneralSecurityException(e);
                        }
                    }
/* 8 */             return this.f13146a.containsAlias(strM8050b);
                }
            }
