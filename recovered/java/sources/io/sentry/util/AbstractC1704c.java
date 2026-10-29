            package io.sentry.util;

            import io.sentry.C1387c;
            import io.sentry.C1393c5;
            import io.sentry.C1468h3;
            import io.sentry.C1486i0;
            import io.sentry.C1529k5;
            import io.sentry.C1554m6;
            import io.sentry.C1641r2;
            import io.sentry.C1667t;
            import io.sentry.C1671t3;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.C1278v0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.hints.InterfaceC1474b;
            import io.sentry.hints.InterfaceC1476d;
            import io.sentry.protocol.C1594c0;
            import io.sentry.protocol.C1598e0;
            import io.sentry.protocol.C1625v;
            import java.io.BufferedInputStream;
            import java.io.BufferedReader;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileReader;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import okio.Segment;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.util.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1704c {

                /* JADX INFO: renamed from: a */
                public static final String[] f11727a = new String[0];

                /* JADX INFO: renamed from: a */
                public static void m5446a(String str) {
/* 5 */             C1529k5.m5336d().m5337a(str);
                }

                /* JADX INFO: renamed from: b */
                public static C1671t3 m5447b(C1671t3 c1671t3) {
/* 5 */             if (((Double) c1671t3.f11669c) != null) {
/* 7 */                 return c1671t3;
                    }
/* 43 */            return new C1671t3((Boolean) c1671t3.f11667a, (Double) c1671t3.f11668b, m5448c((Boolean) c1671t3.f11667a, null, (Double) c1671t3.f11668b), (Boolean) c1671t3.f11670d, (Double) c1671t3.f11671e);
                }

                /* JADX INFO: renamed from: c */
                public static Double m5448c(Boolean bool, Double d, Double d2) {
/* 1 */             if (d != null) {
/* 3 */                 return d;
                    }
/* 8 */             double dM5480c = AbstractC1714m.m5481a().m5480c();
/* 12 */            if (d2 == null || bool == null) {
/* 50 */                return Double.valueOf(dM5480c);
                    }
/* 20 */            if (bool.booleanValue()) {
/* 27 */                return Double.valueOf(d2.doubleValue() * dM5480c);
                    }
/* 45 */            return Double.valueOf(((1.0d - d2.doubleValue()) * dM5480c) + d2.doubleValue());
                }

                /* JADX INFO: renamed from: d */
                public static ClassLoader m5449d(ClassLoader classLoader) {
/* 1 */             if (classLoader != null) {
/* 18 */                return classLoader;
                    }
/* 7 */             ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                    return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
                }

                /* JADX INFO: renamed from: e */
                public static C1486i0 m5450e(Object obj) {
/* 3 */             C1486i0 c1486i0 = new C1486i0();
/* 8 */             c1486i0.m5275d(obj, "sentry:typeCheckHint");
/* 11 */            return c1486i0;
                }

                /* JADX INFO: renamed from: f */
                public static boolean m5451f(File file) {
/* 2 */             if (file == null || !file.exists()) {
/* 1 */                 return true;
                    }
/* 15 */            if (file.isFile()) {
/* 17 */                return file.delete();
                    }
/* 22 */            File[] fileArrListFiles = file.listFiles();
/* 26 */            if (fileArrListFiles == null) {
/* 1 */                 return true;
                    }
/* 32 */            for (File file2 : fileArrListFiles) {
/* 40 */                if (!m5451f(file2)) {
/* 30 */                    return false;
                        }
                    }
/* 46 */            return file.delete();
                }

                /* JADX INFO: renamed from: g */
                public static C1387c m5452g(C1387c c1387c, Boolean bool, Double d, Double d2) {
/* 1 */             if (c1387c == null) {
/* 7 */                 c1387c = new C1387c(C1641r2.f11545a);
                    }
/* 12 */            if (c1387c.f10774d == null) {
/* 14 */                Double d3 = c1387c.f10773c;
/* 16 */                if (d3 != null) {
/* 19 */                    d = d3;
                        }
/* 20 */                Double dM5448c = m5448c(bool, d2, d);
/* 26 */                if (c1387c.f10776f) {
/* 28 */                    c1387c.f10774d = dM5448c;
                        }
                    }
/* 32 */            if (c1387c.f10776f && c1387c.f10777g) {
/* 39 */                c1387c.f10776f = false;
                    }
/* 41 */            return c1387c;
                }

                /* JADX INFO: renamed from: h */
                public static boolean m5453h(Object obj, Object obj2) {
/* 1 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 14 */            return true;
                }

                /* JADX INFO: renamed from: i */
                public static boolean m5454i(C1486i0 c1486i0, Class cls) {
/* 7 */             return cls.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
                }

                /* JADX INFO: renamed from: j */
                public static boolean m5455j(C1486i0 c1486i0) {
/* 11 */            return Boolean.TRUE.equals(c1486i0.m5274c(Boolean.class, "sentry:isFromHybridSdk"));
                }

                /* JADX INFO: renamed from: k */
                public static boolean m5456k(C1393c5 c1393c5, SentryAndroidOptions sentryAndroidOptions) {
                    return AbstractC1706e.m5469a(sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), c1393c5) <= 1048576;
                }

                /* JADX INFO: renamed from: l */
                public static boolean m5457l(Double d, boolean z) {
/* 1 */             if (d == null) {
/* 3 */                 return z;
                    }
                    return !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
                }

                /* JADX INFO: renamed from: m */
                public static void m5458m(Class cls, Object obj, ILogger iLogger) {
/* 26 */            iLogger.mo4672k(EnumC1553m5.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
                }

                /* JADX INFO: renamed from: n */
                public static ConcurrentHashMap m5459n(Map map) {
/* 1 */             if (map == null) {
/* 53 */                return null;
                    }
/* 5 */             ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 20 */            for (Map.Entry entry : map.entrySet()) {
/* 32 */                if (entry.getKey() != null && entry.getValue() != null) {
/* 48 */                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 52 */            return concurrentHashMap;
                }

                /* JADX INFO: renamed from: o */
                public static byte[] m5460o(String str, long j) throws IOException {
/* 3 */             File file = new File(str);
/* 11 */            if (!file.exists()) {
/* 175 */               ds0.m3195l(fm0.m3784j("File '", file.getName(), "' doesn't exists"));
/* 10 */                return null;
                    }
/* 17 */            if (!file.isFile()) {
/* 159 */               ds0.m3195l(fm0.m3784j("Reading path ", str, " failed, because it's not a file."));
/* 10 */                return null;
                    }
/* 23 */            if (!file.canRead()) {
/* 147 */               ds0.m3195l(fm0.m3784j("Reading the item ", str, " failed, because can't read the file."));
/* 10 */                return null;
                    }
/* 31 */            if (file.length() > j) {
/* 138 */               throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
                    }
/* 35 */            FileInputStream fileInputStream = new FileInputStream(str);
                    try {
/* 40 */                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                        try {
/* 45 */                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
/* 50 */                        byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                                while (true) {
/* 52 */                            int i = bufferedInputStream.read(bArr);
/* 57 */                            if (i == -1) {
/* 66 */                                byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 70 */                                byteArrayOutputStream.close();
/* 73 */                                bufferedInputStream.close();
/* 76 */                                fileInputStream.close();
/* 79 */                                return byteArray;
                                    }
/* 60 */                            byteArrayOutputStream.write(bArr, 0, i);
                                    try {
/* 93 */                                bufferedInputStream.close();
                                    } catch (Throwable th) {
/* 98 */                                th.addSuppressed(th);
                                    }
/* 101 */                           throw th;
                                }
                            } catch (Throwable th2) {
                                try {
/* 84 */                            byteArrayOutputStream.close();
                                } catch (Throwable th3) {
/* 89 */                            th2.addSuppressed(th3);
                                }
/* 92 */                        throw th2;
                            }
                        } catch (Throwable th4) {
/* 93 */                    bufferedInputStream.close();
/* 101 */                   throw th4;
                        }
                    } catch (Throwable th5) {
                        try {
/* 102 */                   fileInputStream.close();
                        } catch (Throwable th6) {
/* 107 */                   th5.addSuppressed(th6);
                        }
/* 110 */               throw th5;
                    }
                }

                /* JADX INFO: renamed from: p */
                public static String m5461p(File file) throws IOException {
/* 1 */             if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
/* 81 */                return null;
                    }
/* 24 */            StringBuilder sb = new StringBuilder();
/* 34 */            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    try {
/* 37 */                String line = bufferedReader.readLine();
/* 41 */                if (line != null) {
/* 43 */                    sb.append(line);
                        }
                        while (true) {
/* 49 */                    String line2 = bufferedReader.readLine();
/* 53 */                    if (line2 == null) {
/* 64 */                        bufferedReader.close();
/* 67 */                        return sb.toString();
                            }
/* 57 */                    sb.append("\n");
/* 60 */                    sb.append(line2);
                        }
                    } catch (Throwable th) {
                        try {
/* 72 */                    bufferedReader.close();
                        } catch (Throwable th2) {
/* 77 */                    th.addSuppressed(th2);
                        }
/* 80 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: q */
                public static void m5462q(Object obj, String str) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             C1951n4.m6859j(str);
                }

                /* JADX INFO: renamed from: r */
                public static boolean m5463r(C1486i0 c1486i0) {
                    return !(InterfaceC1476d.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || InterfaceC1474b.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) || C1278v0.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
                }

                /* JADX INFO: renamed from: s */
                public static boolean m5464s(C1554m6 c1554m6, SentryAndroidOptions sentryAndroidOptions, boolean z) {
/* 1 */             boolean z2 = AbstractC1712k.f11736a;
/* 3 */             int i = 1;
/* 4 */             if (!z2 && (sentryAndroidOptions.getVersionDetector() instanceof C1468h3)) {
/* 19 */                sentryAndroidOptions.setVersionDetector(new C1667t(sentryAndroidOptions, i));
                    }
/* 31 */            if (!sentryAndroidOptions.getVersionDetector().mo5257a()) {
                        return !z || c1554m6 == null || sentryAndroidOptions.isForceInit() || c1554m6.getInitPriority().ordinal() <= sentryAndroidOptions.getInitPriority().ordinal();
                    }
/* 43 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
/* 61 */            f42.m3656l(fm0.m3784j("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z2 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
/* 30 */            return false;
                }

                /* JADX INFO: renamed from: t */
                public static void m5465t(C1393c5 c1393c5, SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             ArrayList arrayListM5107d = c1393c5.m5107d();
/* 5 */             if (arrayListM5107d != null) {
/* 7 */                 Iterator it = arrayListM5107d.iterator();
/* 15 */                while (it.hasNext()) {
/* 23 */                    C1594c0 c1594c0 = ((C1625v) it.next()).f11475e;
/* 25 */                    if (c1594c0 != null) {
/* 29 */                        m5466u(c1594c0, c1393c5, sentryAndroidOptions, "Truncated exception stack frames of event %s");
                            }
                        }
                    }
/* 33 */            ArrayList arrayListM5108e = c1393c5.m5108e();
/* 37 */            if (arrayListM5108e != null) {
/* 39 */                Iterator it2 = arrayListM5108e.iterator();
/* 47 */                while (it2.hasNext()) {
/* 55 */                    C1594c0 c1594c1 = ((C1598e0) it2.next()).f11306w;
/* 57 */                    if (c1594c1 != null) {
/* 61 */                        m5466u(c1594c1, c1393c5, sentryAndroidOptions, "Truncated thread stack frames for event %s");
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: u */
                public static void m5466u(C1594c0 c1594c0, C1393c5 c1393c5, C1554m6 c1554m6, String str) {
/* 1 */             List list = c1594c0.f11285a;
/* 3 */             if (list == null || list.size() <= 500) {
/* 61 */                return;
                    }
/* 15 */            ArrayList arrayList = new ArrayList(500);
/* 25 */            arrayList.addAll(list.subList(0, 250));
/* 41 */            arrayList.addAll(list.subList(list.size() - 250, list.size()));
/* 44 */            c1594c0.f11285a = arrayList;
/* 58 */            c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, str, c1393c5.f11516a);
                }

                /* JADX INFO: renamed from: v */
                public static CopyOnWriteArrayList m5467v(CopyOnWriteArrayList copyOnWriteArrayList) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             if (copyOnWriteArrayList != null) {
/* 8 */                 Iterator it = copyOnWriteArrayList.iterator();
/* 16 */                if (it.hasNext()) {
/* 23 */                    throw fm0.m3780f(it);
                        }
                    }
/* 26 */            return new CopyOnWriteArrayList(arrayList);
                }
            }
