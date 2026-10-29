            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.util.List;
            import kotlin.p011io.FileWalkDirection;
            
            /* JADX INFO: renamed from: d8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0835d8 implements ev0 {

                /* JADX INFO: renamed from: a */
                public final hk2 f7039a;

                public C0835d8(File file) {
/* 1 */             file.getClass();
/* 17 */            this.f7039a = r51.m8065b(new C0207c8(file, 0));
                }

                /* JADX WARN: Code duplicated, block: B:51:0x00bb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:62:0x0058 A[SYNTHETIC] */
                /* JADX INFO: renamed from: a */
                public final void m2957a(String str, String str2) {
/* 7 */             File file = new File(m2958b(), str);
/* 14 */            if (file.exists()) {
/* 22 */                File file2 = new File(m2958b(), str2);
/* 25 */                boolean zExists = file.exists();
/* 29 */                ii0 ii0Var = ii0.f9613a;
/* 31 */                if (!zExists) {
/* 43 */                    ii0Var.invoke(file, new on1(file, null, "The source file doesn't exist.", 2, null));
/* 46 */                    yp1 yp1Var = yp1.f19743a;
/* 48 */                    return;
                        }
                        try {
/* 60 */                    bi0 bi0Var = new bi0(file, FileWalkDirection.f12920a, null, null, null, 0, 32, null);
/* 86 */                    zh0 zh0Var = new zh0(new bi0(bi0Var.f2433a, bi0Var.f2434b, bi0Var.f2435c, bi0Var.f2436d, new rs1(ii0Var, 6), bi0Var.f2438f));
/* 93 */                    while (zh0Var.hasNext()) {
/* 100 */                       File file3 = (File) zh0Var.next();
/* 106 */                       if (file3.exists()) {
/* 133 */                           File file4 = new File(file2, ji0.m5829h(file3, file));
/* 140 */                           if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
/* 158 */                               if (file4.isDirectory()) {
/* 164 */                                   if (!ji0.m5827f(file4)) {
/* 186 */                                       if (ii0Var.invoke(file4, new jh0(file3, file4, "The destination file already exists.")) == yp1.f19743a) {
/* 229 */                                           return;
                                                }
                                            }
                                        } else if (!file4.delete()) {
/* 186 */                                   if (ii0Var.invoke(file4, new jh0(file3, file4, "The destination file already exists.")) == yp1.f19743a) {
/* 229 */                                       return;
                                            }
                                        }
                                    }
/* 193 */                           if (file3.isDirectory()) {
/* 195 */                               file4.mkdirs();
                                    } else {
/* 199 */                               ji0.m5826e(file3, file4);
/* 212 */                               if (file4.length() != file3.length() && ii0Var.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs.")) == yp1.f19743a) {
/* 229 */                                   return;
                                        }
                                    }
                                } else if (ii0Var.invoke(file3, new on1(file3, null, "The source file doesn't exist.", 2, null)) == yp1.f19743a) {
/* 229 */                           return;
                                }
                            }
                        } catch (an2 unused) {
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final File m2958b() {
/* 7 */             return (File) this.f7039a.getValue();
                }

                /* JADX INFO: renamed from: c */
                public final List m2959c(String str) {
                    List listM7779n;
/* 1 */             str.getClass();
/* 13 */            String[] list = new File(m2958b(), str).list();
                    return (list == null || (listM7779n = C2103qd.m7779n(list)) == null) ? nd0.f14189a : listM7779n;
                }

                /* JADX INFO: renamed from: d */
                public final void m2960d(String str) {
/* 1 */             str.getClass();
/* 13 */            ji0.m5827f(new File(m2958b(), str));
                }
            }
