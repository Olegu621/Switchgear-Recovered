            package p000;

            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.collections.CollectionsKt___CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.p011io.FileWalkDirection;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class ji0 extends hi0 {
                /* JADX INFO: renamed from: e */
                public static void m5826e(File file, File file2) {
/* 5 */             if (!file.exists()) {
/* 114 */               throw new on1(file, null, "The source file doesn't exist.", 2, null);
                    }
/* 11 */            if (file2.exists() && !file2.delete()) {
/* 27 */                throw new jh0(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
/* 32 */            if (file.isDirectory()) {
/* 38 */                if (!file2.mkdirs()) {
/* 48 */                    throw new uh0(file, file2, "Failed to create target directory.");
                        }
/* 40 */                return;
                    }
/* 49 */            File parentFile = file2.getParentFile();
/* 53 */            if (parentFile != null) {
/* 55 */                parentFile.mkdirs();
                    }
/* 63 */            FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(file, new FileInputStream(file));
                    try {
/* 72 */                FileOutputStream fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file2), file2);
                        try {
/* 76 */                    b40.m1225i(fileInputStreamM5164b, fileOutputStreamM5167e);
/* 79 */                    fileOutputStreamM5167e.close();
/* 82 */                    fileInputStreamM5164b.close();
                        } catch (Throwable th) {
                            try {
/* 91 */                        throw th;
                            } catch (Throwable th2) {
/* 93 */                        jb1.m5754n(fileOutputStreamM5167e, th);
/* 96 */                        throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
/* 97 */                    throw th3;
                        } catch (Throwable th4) {
/* 99 */                    jb1.m5754n(fileInputStreamM5164b, th3);
/* 102 */                   throw th4;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public static boolean m5827f(File file) {
/* 1 */             file.getClass();
/* 21 */            zh0 zh0Var = new zh0(new bi0(file, FileWalkDirection.f12921b, null, null, null, 0, 32, null));
                    while (true) {
/* 25 */                boolean z = true;
/* 30 */                while (zh0Var.hasNext()) {
/* 36 */                    File file2 = (File) zh0Var.next();
/* 42 */                    if (file2.delete() || !file2.exists()) {
/* 50 */                        if (z) {
                                }
                            }
/* 53 */                    z = false;
                        }
/* 55 */                return z;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static final kh0 m5828g(kh0 kh0Var) {
/* 3 */             File file = kh0Var.f12763a;
/* 5 */             List<File> list = kh0Var.f12764b;
/* 13 */            ArrayList arrayList = new ArrayList(list.size());
/* 24 */            for (File file2 : list) {
/* 32 */                String name = file2.getName();
/* 42 */                if (!Intrinsics.m6216a(name, ".")) {
/* 51 */                    if (!Intrinsics.m6216a(name, "..")) {
/* 92 */                        arrayList.add(file2);
                            } else if (arrayList.isEmpty() || Intrinsics.m6216a(((File) CollectionsKt.m6204y(arrayList)).getName(), "..")) {
/* 88 */                        arrayList.add(file2);
                            }
                        }
                    }
/* 96 */            return new kh0(file, arrayList);
                }

                /* JADX INFO: renamed from: h */
                public static final String m5829h(File file, File file2) {
                    String string;
/* 5 */             kh0 kh0VarM5828g = m5828g(fi0.m3768a(file));
/* 9 */             List list = kh0VarM5828g.f12764b;
/* 15 */            kh0 kh0VarM5828g2 = m5828g(fi0.m3768a(file2));
/* 19 */            List list2 = kh0VarM5828g2.f12764b;
/* 30 */            if (kh0VarM5828g.f12763a.equals(kh0VarM5828g2.f12763a)) {
/* 34 */                int size = list2.size();
/* 38 */                int size2 = list.size();
/* 42 */                int iMin = Math.min(size2, size);
/* 46 */                int i = 0;
/* 47 */                while (i < iMin && Intrinsics.m6216a(list.get(i), list2.get(i))) {
/* 63 */                    i++;
                        }
/* 68 */                StringBuilder sb = new StringBuilder();
/* 71 */                int i2 = size - 1;
/* 73 */                if (i <= i2) {
                            while (true) {
/* 91 */                        if (Intrinsics.m6216a(((File) list2.get(i2)).getName(), "..")) {
/* 32 */                            string = null;
                                } else {
/* 94 */                            sb.append("..");
/* 97 */                            if (i2 != i) {
/* 101 */                               sb.append(File.separatorChar);
                                    }
/* 104 */                           if (i2 != i) {
/* 106 */                               i2--;
                                    }
                                }
                            }
                        }
/* 109 */               if (i < size2) {
/* 111 */                   if (i < size) {
/* 115 */                       sb.append(File.separatorChar);
                            }
/* 118 */                   List listM6198s = CollectionsKt.m6198s(i, list);
/* 122 */                   String str = File.separator;
/* 124 */                   str.getClass();
/* 10 */                    CollectionsKt___CollectionsKt.m6206o(listM6198s, sb, str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "...", null);
                        }
/* 130 */               string = sb.toString();
                    } else {
/* 32 */                string = null;
                    }
/* 134 */           if (string != null) {
/* 136 */               return string;
                    }
/* 143 */           s80.m8421b(46, "this and base files have different roots: ", file, " and ", file2);
/* 29 */            return null;
                }
            }
