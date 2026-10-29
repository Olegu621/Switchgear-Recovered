            package io.sentry.android.core.internal.util;

            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.File;
            import java.io.IOException;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1219f {

                /* JADX INFO: renamed from: c */
                public static final C1219f f10159c = new C1219f();

                /* JADX INFO: renamed from: a */
                public final C1702a f10160a = new C1702a();

                /* JADX INFO: renamed from: b */
                public final ArrayList f10161b = new ArrayList();

                /* JADX INFO: renamed from: a */
                public final ArrayList m4843a() {
/* 1 */             ArrayList arrayList = this.f10161b;
/* 3 */             C1702a c1702a = this.f10160a;
/* 5 */             c1702a.m5443c();
                    try {
/* 12 */                if (!arrayList.isEmpty()) {
/* 14 */                    c1702a.close();
/* 17 */                    return arrayList;
                        }
/* 25 */                File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
/* 29 */                if (fileArrListFiles == null) {
/* 33 */                    ArrayList arrayList2 = new ArrayList();
/* 36 */                    c1702a.close();
/* 39 */                    return arrayList2;
                        }
/* 44 */                for (File file : fileArrListFiles) {
/* 58 */                    if (file.getName().matches("cpu[0-9]+")) {
                                try {
/* 68 */                            String strM5461p = AbstractC1704c.m5461p(new File(file, "cpufreq/cpuinfo_max_freq"));
/* 72 */                            if (strM5461p != null) {
/* 91 */                                arrayList.add(Integer.valueOf((int) (Long.parseLong(strM5461p.trim()) / 1000)));
                                    }
                                } catch (IOException | NumberFormatException unused) {
                                }
                            }
                        }
/* 97 */                c1702a.close();
/* 100 */               return arrayList;
                    } catch (Throwable th) {
                        try {
/* 101 */                   c1702a.close();
                        } catch (Throwable th2) {
/* 106 */                   th.addSuppressed(th2);
                        }
/* 109 */               throw th;
                    }
                }
            }
