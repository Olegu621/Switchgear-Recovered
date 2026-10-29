            package io.sentry.android.core.anr;

            import java.io.File;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: renamed from: io.sentry.android.core.anr.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1171e {

                /* JADX INFO: renamed from: a */
                public static final AtomicBoolean f9959a = new AtomicBoolean(true);

                /* JADX INFO: renamed from: b */
                public static final Object f9960b = new Object();

                /* JADX INFO: renamed from: a */
                public static boolean m4771a(File file) {
/* 5 */             File file2 = new File(file, "anr_profile_old");
/* 12 */            if (file2.exists()) {
/* 16 */                return file2.delete();
                    }
/* 14 */            return true;
                }

                /* JADX INFO: renamed from: b */
                public static void m4772b(File file) {
/* 1 */             AtomicBoolean atomicBoolean = f9959a;
/* 7 */             if (atomicBoolean.get()) {
                        synchronized (f9960b) {
                            try {
/* 17 */                        if (atomicBoolean.get()) {
/* 27 */                            File file2 = new File(file, "anr_profile");
/* 34 */                            File file3 = new File(file, "anr_profile_old");
                                    try {
/* 37 */                                file3.delete();
                                    } catch (Throwable unused) {
                                    }
                                    try {
/* 40 */                                file2.renameTo(file3);
                                    } catch (Throwable unused2) {
                                    }
/* 46 */                            f9959a.set(false);
                                }
                            } catch (Throwable th) {
/* 52 */                        throw th;
                            }
                        }
                    }
                }
            }
