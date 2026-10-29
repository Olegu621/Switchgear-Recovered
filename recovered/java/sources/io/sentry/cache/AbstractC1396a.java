            package io.sentry.cache;

            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import java.io.BufferedReader;
            import java.io.BufferedWriter;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.InputStreamReader;
            import java.io.OutputStreamWriter;
            import java.nio.charset.Charset;
            
            /* JADX INFO: renamed from: io.sentry.cache.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1396a {

                /* JADX INFO: renamed from: a */
                public static final Charset f10797a = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public static void m5113a(SentryAndroidOptions sentryAndroidOptions, String str, String str2) {
/* 1 */             File fileM5114b = m5114b(sentryAndroidOptions, str);
/* 5 */             if (fileM5114b == null) {
/* 18 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
/* 21 */                return;
                    }
/* 24 */            File file = new File(fileM5114b, str2);
/* 39 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Deleting %s from scope cache", str2);
/* 46 */            if (file.delete()) {
/* 67 */                return;
                    }
/* 64 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Failed to delete: %s", file.getAbsolutePath());
                }

                /* JADX INFO: renamed from: b */
                public static File m5114b(C1554m6 c1554m6, String str) {
/* 1 */             String cacheDirPath = c1554m6.getCacheDirPath();
/* 5 */             if (cacheDirPath == null) {
/* 7 */                 return null;
                    }
/* 11 */            File file = new File(cacheDirPath, str);
/* 14 */            file.mkdirs();
/* 17 */            return file;
                }

                /* JADX INFO: renamed from: c */
                public static Object m5115c(C1554m6 c1554m6, String str, String str2, Class cls) {
/* 1 */             File fileM5114b = m5114b(c1554m6, str);
/* 6 */             if (fileM5114b == null) {
/* 19 */                c1554m6.getLogger().mo4672k(EnumC1553m5.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
/* 5 */                 return null;
                    }
/* 25 */            File file = new File(fileM5114b, str2);
/* 32 */            if (!file.exists()) {
/* 103 */               c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "No entry stored for %s", str2);
/* 5 */                 return null;
                    }
                    try {
/* 48 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f10797a));
                        try {
/* 55 */                    Object objMo5064b = c1554m6.getSerializer().mo5064b(bufferedReader, cls);
/* 59 */                    bufferedReader.close();
/* 62 */                    return objMo5064b;
                        } catch (Throwable th) {
                            try {
/* 66 */                        bufferedReader.close();
                            } catch (Throwable th2) {
/* 71 */                        th.addSuppressed(th2);
                            }
/* 74 */                    throw th;
                        }
                    } catch (Throwable th3) {
/* 87 */                c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th3, "Error reading entity from scope cache: %s", str2);
/* 5 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static void m5116d(C1554m6 c1554m6, Object obj, String str, String str2) {
/* 1 */             File fileM5114b = m5114b(c1554m6, str);
/* 5 */             if (fileM5114b == null) {
/* 18 */                c1554m6.getLogger().mo4672k(EnumC1553m5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
/* 21 */                return;
                    }
                    try {
/* 29 */                FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM5114b, str2));
                        try {
/* 41 */                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f10797a));
                            try {
/* 48 */                        c1554m6.getSerializer().mo5063a(bufferedWriter, obj);
/* 51 */                        bufferedWriter.close();
/* 54 */                        fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
/* 63 */                            bufferedWriter.close();
                                } catch (Throwable th2) {
/* 68 */                            th.addSuppressed(th2);
                                }
/* 71 */                        throw th;
                            }
                        } catch (Throwable th3) {
                            try {
/* 72 */                        fileOutputStream.close();
                            } catch (Throwable th4) {
/* 77 */                        th3.addSuppressed(th4);
                            }
/* 80 */                    throw th3;
                        }
                    } catch (Throwable th5) {
/* 93 */                c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th5, "Error persisting entity: %s", str2);
                    }
                }
            }
