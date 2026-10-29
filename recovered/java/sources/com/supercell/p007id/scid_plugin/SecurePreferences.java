            package com.supercell.p007id.scid_plugin;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.util.Base64;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.UnsupportedEncodingException;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import javax.crypto.Cipher;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SecurePreferences {
                private static final String CHARSET = "UTF-8";
                private static final String KEY_TRANSFORMATION = "AES/ECB/PKCS5Padding";
                private static final String SECRET_KEY_HASH_TRANSFORMATION = "SHA-256";
                private static final String TAG = "SecurePreferences";
                private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
                private final boolean encryptKeys;
                private final Cipher keyReader;
                private final Cipher keyWriter;
                private final SharedPreferences preferences;
                private final Cipher reader;
                private final Cipher writer;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SecurePreferencesException extends RuntimeException {
                    public SecurePreferencesException(Throwable th) {
/* 1 */                 super(th);
                    }
                }

                public SecurePreferences(Context context, String str, String str2, boolean z) throws SecurePreferencesException {
                    try {
/* 16 */                this.writer = Cipher.getInstance(TRANSFORMATION);
/* 22 */                this.reader = Cipher.getInstance(TRANSFORMATION);
/* 28 */                this.keyWriter = Cipher.getInstance(KEY_TRANSFORMATION);
/* 34 */                this.keyReader = Cipher.getInstance(KEY_TRANSFORMATION);
/* 36 */                initCiphers(str2);
/* 44 */                this.preferences = context.getSharedPreferences(str, 0);
/* 46 */                this.encryptKeys = z;
                    } catch (UnsupportedEncodingException e) {
/* 53 */                AbstractC1245n0.m4877e(TAG, "Init failed", e);
/* 61 */                throw new SecurePreferencesException(e);
                    } catch (GeneralSecurityException e2) {
/* 62 */                AbstractC1245n0.m4877e(TAG, "Init failed", e2);
/* 70 */                throw new SecurePreferencesException(e2);
                    }
                }

                private static byte[] convert(Cipher cipher, byte[] bArr) throws SecurePreferencesException {
                    try {
/* 1 */                 return cipher.doFinal(bArr);
                    } catch (Exception e) {
/* 12 */                throw new SecurePreferencesException(e);
                    }
                }

                private byte[] createKeyBytes(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
/* 3 */             MessageDigest messageDigest = MessageDigest.getInstance(SECRET_KEY_HASH_TRANSFORMATION);
/* 7 */             messageDigest.reset();
/* 16 */            return messageDigest.digest(str.getBytes(CHARSET));
                }

                private String decrypt(String str, Cipher cipher) {
                    try {
                        try {
                            try {
/* 18 */                        return new String(convert(cipher, Base64.decode(str, 2)), CHARSET);
                            } catch (Exception e) {
/* 25 */                        AbstractC1245n0.m4877e(TAG, "Unable to create String from decrypted value", e);
/* 1 */                         return HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                        } catch (Exception e2) {
/* 32 */                    AbstractC1245n0.m4877e(TAG, "decrypt Unable to decrypt value", e2);
/* 1 */                     return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                    } catch (Exception unused) {
/* 38 */                AbstractC1245n0.m4876d(TAG, "SecurePreferences.decrypt Base64.decode fail");
/* 1 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                private String decryptValue(String str) {
/* 3 */             return decrypt(str, this.reader);
                }

                private String encrypt(String str, Cipher cipher) throws SecurePreferencesException {
                    try {
/* 12 */                return Base64.encodeToString(convert(cipher, str.getBytes(CHARSET)), 2);
                    } catch (Exception e) {
/* 22 */                AbstractC1245n0.m4877e(TAG, "encrypt failed", e);
/* 30 */                throw new SecurePreferencesException(e);
                    }
                }

                private IvParameterSpec getIv() {
/* 7 */             byte[] bArr = new byte[this.writer.getBlockSize()];
/* 22 */            System.arraycopy("fldsjfodasjifudslfjdsaofshaufihadsf".getBytes(), 0, bArr, 0, this.writer.getBlockSize());
/* 27 */            return new IvParameterSpec(bArr);
                }

                private SecretKeySpec getSecretKey(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
/* 9 */             return new SecretKeySpec(createKeyBytes(str), TRANSFORMATION);
                }

                private void initCiphers(String str) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
/* 1 */             IvParameterSpec iv = getIv();
/* 5 */             SecretKeySpec secretKey = getSecretKey(str);
/* 12 */            this.writer.init(1, secretKey, iv);
/* 18 */            this.reader.init(2, secretKey, iv);
/* 23 */            this.keyWriter.init(1, secretKey);
/* 28 */            this.keyReader.init(2, secretKey);
                }

                private void putValue(String str, String str2) throws SecurePreferencesException {
/* 17 */            this.preferences.edit().putString(str, encrypt(str2, this.writer)).apply();
                }

                private String toKey(String str) {
                    return this.encryptKeys ? encrypt(str, this.keyWriter) : str;
                }

                public String getString(String str) {
/* 1 */             String key = toKey(str);
/* 11 */            if (!this.preferences.contains(key)) {
/* 45 */                return null;
                    }
/* 21 */            String strDecryptValue = decryptValue(this.preferences.getString(key, HttpUrl.FRAGMENT_ENCODE_SET));
/* 29 */            if (strDecryptValue.isEmpty()) {
/* 41 */                this.preferences.edit().remove(key).apply();
                    }
/* 44 */            return strDecryptValue;
                }

                public void put(String str, String str2) {
/* 1 */             String key = toKey(str);
/* 5 */             if (str2 != null && !str2.isEmpty()) {
/* 14 */                putValue(key, str2);
                    } else if (this.preferences.contains(key)) {
/* 36 */                this.preferences.edit().remove(key).apply();
                    }
                }

                public void removeValue(String str) {
/* 7 */             if (this.preferences.contains(str)) {
/* 19 */                this.preferences.edit().remove(str).apply();
                    }
/* 22 */            String key = toKey(str);
/* 32 */            if (this.preferences.contains(key)) {
/* 44 */                this.preferences.edit().remove(key).apply();
                    }
                }
            }
