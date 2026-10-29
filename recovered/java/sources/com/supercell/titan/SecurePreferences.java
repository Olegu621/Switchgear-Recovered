            package com.supercell.titan;

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

                /* JADX INFO: renamed from: a */
                public final boolean f5914a;

                /* JADX INFO: renamed from: b */
                public final Cipher f5915b;

                /* JADX INFO: renamed from: c */
                public final Cipher f5916c;

                /* JADX INFO: renamed from: d */
                public final Cipher f5917d;

                /* JADX INFO: renamed from: e */
                public final Cipher f5918e;

                /* JADX INFO: renamed from: f */
                public final SharedPreferences f5919f;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SecurePreferencesException extends RuntimeException {
                    public SecurePreferencesException(Throwable th) {
/* 1 */                 super(th);
                    }
                }

                public SecurePreferences(Context context, String str, String str2, boolean z) throws SecurePreferencesException {
                    try {
/* 12 */                this.f5915b = Cipher.getInstance("AES/CBC/PKCS5Padding");
/* 18 */                this.f5916c = Cipher.getInstance("AES/CBC/PKCS5Padding");
/* 24 */                this.f5917d = Cipher.getInstance("AES/ECB/PKCS5Padding");
/* 30 */                this.f5918e = Cipher.getInstance("AES/ECB/PKCS5Padding");
/* 32 */                m2744a(str2);
/* 40 */                this.f5919f = context.getSharedPreferences(str, 0);
/* 42 */                this.f5914a = z;
                    } catch (UnsupportedEncodingException e) {
/* 46 */                GameApp.debuggerException(e);
/* 54 */                throw new SecurePreferencesException(e);
                    } catch (GeneralSecurityException e2) {
/* 56 */                GameApp.debuggerException(e2);
/* 64 */                throw new SecurePreferencesException(e2);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m2744a(String str) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
/* 1 */             Cipher cipher = this.f5915b;
/* 7 */             byte[] bArr = new byte[cipher.getBlockSize()];
/* 20 */            System.arraycopy("fldsjfodasjifudslfjdsaofshaufihadsf".getBytes(), 0, bArr, 0, cipher.getBlockSize());
/* 25 */            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
/* 30 */            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 34 */            messageDigest.reset();
/* 51 */            SecretKeySpec secretKeySpec = new SecretKeySpec(messageDigest.digest(str.getBytes("UTF-8")), "AES/CBC/PKCS5Padding");
/* 55 */            cipher.init(1, secretKeySpec, ivParameterSpec);
/* 61 */            this.f5916c.init(2, secretKeySpec, ivParameterSpec);
/* 66 */            this.f5917d.init(1, secretKeySpec);
/* 71 */            this.f5918e.init(2, secretKeySpec);
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:6:0x0008, B:7:0x0011, B:8:0x0015, B:11:0x001b, B:12:0x0020, B:14:0x0022, B:15:0x002a, B:16:0x002b, B:18:0x0033, B:19:0x004a, B:20:0x004e, B:21:0x0052, B:32:0x0081, B:34:0x0087, B:24:0x005f, B:27:0x0069, B:28:0x006e, B:30:0x0070, B:31:0x0079), top: B:49:0x0001, inners: #0, #1, #4, #5, #6 }] */
                /* JADX WARN: Code duplicated, block: B:34:0x0087 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:6:0x0008, B:7:0x0011, B:8:0x0015, B:11:0x001b, B:12:0x0020, B:14:0x0022, B:15:0x002a, B:16:0x002b, B:18:0x0033, B:19:0x004a, B:20:0x004e, B:21:0x0052, B:32:0x0081, B:34:0x0087, B:24:0x005f, B:27:0x0069, B:28:0x006e, B:30:0x0070, B:31:0x0079), top: B:49:0x0001, inners: #0, #1, #4, #5, #6 }] */
                /* JADX WARN: Code duplicated, block: B:40:0x0099  */
                public synchronized String getString(String str) {
                    String str2;
/* 5 */             if (!this.f5914a) {
/* 47 */                if (this.f5919f.contains(str)) {
                            return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 53 */                String string = this.f5919f.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
/* 57 */                Cipher cipher = this.f5916c;
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 75 */                str2 = new String(cipher.doFinal(Base64.decode(string, 2)), "UTF-8");
/* 110 */               if (str2.isEmpty()) {
/* 122 */                   this.f5919f.edit().remove(str).apply();
                        }
/* 129 */               return str2;
                    }
                    try {
                        try {
/* 19 */                    str = Base64.encodeToString(this.f5917d.doFinal(str.getBytes("UTF-8")), 2);
/* 47 */                    if (this.f5919f.contains(str)) {
                                return HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 53 */                    String string2 = this.f5919f.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
/* 57 */                    Cipher cipher2 = this.f5916c;
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            try {
                                try {
                                    try {
/* 75 */                                str2 = new String(cipher2.doFinal(Base64.decode(string2, 2)), "UTF-8");
                                    } catch (Exception e) {
/* 83 */                                AbstractC1245n0.m4877e("SecurePreferences", "Unable to create String from decrypted value", e);
                                    }
/* 110 */                           if (str2.isEmpty()) {
/* 122 */                               this.f5919f.edit().remove(str).apply();
                                    }
/* 129 */                           return str2;
                                } catch (Exception e2) {
                                    try {
/* 93 */                                throw new SecurePreferencesException(e2);
                                    } catch (Exception e3) {
/* 97 */                                AbstractC1245n0.m4877e("SecurePreferences", "SecurePreferences.decrypt Unable to decrypt value", e3);
                                    }
                                }
                            } catch (Exception unused) {
/* 103 */                       AbstractC1245n0.m4876d("SecurePreferences", "SecurePreferences.decrypt Base64.decode fail");
                            }
                        } catch (Exception e4) {
/* 30 */                    throw new SecurePreferencesException(e4);
                        }
                    } catch (Exception e5) {
/* 32 */                GameApp.debuggerException(e5);
/* 40 */                throw new SecurePreferencesException(e5);
                    }
/* 135 */           throw th;
                }

                public synchronized void put(String str, String str2) {
                    try {
/* 5 */                 if (this.f5914a) {
                            try {
                                try {
/* 19 */                            str = Base64.encodeToString(this.f5917d.doFinal(str.getBytes("UTF-8")), 2);
                                } catch (Exception e) {
/* 30 */                            throw new SecurePreferencesException(e);
                                }
                            } catch (Exception e2) {
/* 32 */                        GameApp.debuggerException(e2);
/* 40 */                        throw new SecurePreferencesException(e2);
                            }
                        }
/* 41 */                if (str2 != null && !str2.isEmpty()) {
                            try {
                                try {
/* 76 */                            this.f5919f.edit().putString(str, Base64.encodeToString(this.f5915b.doFinal(str2.getBytes("UTF-8")), 2)).apply();
                                } catch (Exception e3) {
/* 86 */                            throw new SecurePreferencesException(e3);
                                }
                            } catch (Exception e4) {
/* 88 */                        GameApp.debuggerException(e4);
/* 96 */                        throw new SecurePreferencesException(e4);
                            }
                        } else if (this.f5919f.contains(str)) {
/* 117 */                   this.f5919f.edit().remove(str).apply();
                        }
                    } catch (Throwable th) {
/* 123 */               throw th;
                    }
                }

                public synchronized void removeValue(String str) {
                    try {
/* 8 */                 if (this.f5919f.contains(str)) {
/* 20 */                    this.f5919f.edit().remove(str).apply();
                        }
/* 28 */                if (this.f5914a) {
                            try {
                                try {
/* 43 */                            str = Base64.encodeToString(this.f5917d.doFinal(str.getBytes("UTF-8")), 2);
                                } catch (Exception e) {
/* 54 */                            throw new SecurePreferencesException(e);
                                }
                            } catch (Exception e2) {
/* 56 */                        GameApp.debuggerException(e2);
/* 64 */                        throw new SecurePreferencesException(e2);
                            }
                        }
/* 71 */                if (this.f5919f.contains(str)) {
/* 83 */                    this.f5919f.edit().remove(str).apply();
                        }
                    } catch (Throwable th) {
/* 89 */                throw th;
                    }
                }
            }
