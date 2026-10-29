            package io.sentry.android.core;

            import android.content.Context;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.util.C1702a;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.RandomAccessFile;
            import java.nio.charset.Charset;
            
            /* JADX INFO: renamed from: io.sentry.android.core.y0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1287y0 {

                /* JADX INFO: renamed from: a */
                public static String f10390a;

                /* JADX INFO: renamed from: b */
                public static final Charset f10391b = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: c */
                public static final C1702a f10392c = new C1702a();

                /* JADX INFO: renamed from: a */
                public static String m4963a(Context context) {
/* 1 */             C1702a c1702a = f10392c;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (f10390a == null) {
/* 18 */                    File file = new File(context.getFilesDir(), "INSTALLATION");
                            try {
/* 21 */                        boolean zExists = file.exists();
/* 25 */                        Charset charset = f10391b;
/* 27 */                        if (!zExists) {
/* 31 */                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
/* 34 */                                String strM5172j = AbstractC1417a.m5172j();
/* 42 */                                fileOutputStream.write(strM5172j.getBytes(charset));
/* 45 */                                fileOutputStream.flush();
/* 48 */                                fileOutputStream.close();
/* 51 */                                f10390a = strM5172j;
/* 53 */                                c1702a.close();
/* 56 */                                return strM5172j;
                                    } catch (Throwable th) {
                                        try {
/* 60 */                                    fileOutputStream.close();
                                        } catch (Throwable th2) {
/* 65 */                                    th.addSuppressed(th2);
                                        }
/* 68 */                                throw th;
                                    }
                                }
/* 73 */                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                                try {
/* 81 */                            byte[] bArr = new byte[(int) randomAccessFile.length()];
/* 83 */                            randomAccessFile.readFully(bArr);
/* 88 */                            String str = new String(bArr, charset);
/* 91 */                            randomAccessFile.close();
/* 94 */                            f10390a = str;
                                } catch (Throwable th3) {
                                    try {
/* 98 */                                randomAccessFile.close();
                                    } catch (Throwable th4) {
/* 103 */                               th3.addSuppressed(th4);
                                    }
/* 106 */                           throw th3;
                                }
                            } catch (Throwable th5) {
/* 112 */                       throw new RuntimeException(th5);
                            }
                        }
/* 115 */               String str2 = f10390a;
/* 117 */               c1702a.close();
/* 120 */               return str2;
                    } catch (Throwable th6) {
                        try {
/* 121 */                   c1702a.close();
                        } catch (Throwable th7) {
/* 126 */                   th6.addSuppressed(th7);
                        }
/* 129 */               throw th6;
                    }
                }
            }
