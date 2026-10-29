            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import p000.C1960nd;
            import p000.b40;
            import p000.ds0;
            import p000.jb1;
            import p000.tf0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdl {
                public zzdl(Context context) {
                }

                public static final byte[] zza(File file) throws GeneralSecurityException, IOException {
/* 1 */             file.getClass();
/* 9 */             FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(file, new FileInputStream(file));
                    try {
/* 13 */                long length = file.length();
/* 24 */                if (length > 2147483647L) {
/* 155 */                   throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
                        }
/* 26 */                int i = (int) length;
/* 27 */                byte[] bArrCopyOf = new byte[i];
/* 30 */                int i2 = i;
/* 31 */                int i3 = 0;
/* 32 */                while (i2 > 0) {
/* 34 */                    int i4 = fileInputStreamM5164b.read(bArrCopyOf, i3, i2);
/* 38 */                    if (i4 < 0) {
                                break;
                            }
/* 40 */                    i2 -= i4;
/* 41 */                    i3 += i4;
                        }
/* 45 */                if (i2 > 0) {
/* 47 */                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                        } else {
/* 52 */                    int i5 = fileInputStreamM5164b.read();
/* 57 */                    if (i5 != -1) {
/* 64 */                        tf0 tf0Var = new tf0(8193);
/* 67 */                        tf0Var.write(i5);
/* 70 */                        b40.m1225i(fileInputStreamM5164b, tf0Var);
/* 77 */                        int size = tf0Var.size() + i;
/* 78 */                        if (size < 0) {
/* 124 */                           throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                                }
/* 80 */                        byte[] bArrM8785f = tf0Var.m8785f();
/* 84 */                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
/* 92 */                        C1960nd.m6964b(bArrM8785f, i, bArrCopyOf, 0, tf0Var.size());
                            }
                        }
/* 95 */                fileInputStreamM5164b.close();
/* 98 */                return bArrCopyOf;
                    } catch (Throwable th) {
                        try {
/* 156 */                   throw th;
                        } catch (Throwable th2) {
/* 158 */                   jb1.m5754n(fileInputStreamM5164b, th);
/* 161 */                   throw th2;
                        }
                    }
                }

                public static final void zzb(File file, byte[] bArr) throws GeneralSecurityException, IOException {
/* 5 */             if (file.exists() && !file.delete()) {
/* 16 */                ds0.m3195l("Unable to delete existing encrypted file");
/* 19 */                return;
                    }
/* 20 */            bArr.getClass();
/* 28 */            FileOutputStream fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file), file);
                    try {
/* 32 */                fileOutputStreamM5167e.write(bArr);
/* 35 */                fileOutputStreamM5167e.close();
                    } catch (Throwable th) {
                        try {
/* 40 */                    throw th;
                        } catch (Throwable th2) {
/* 42 */                    jb1.m5754n(fileOutputStreamM5167e, th);
/* 45 */                    throw th2;
                        }
                    }
                }
            }
