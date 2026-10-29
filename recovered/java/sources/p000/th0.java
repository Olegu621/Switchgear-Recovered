            package p000;

            import android.os.Build;
            import java.io.File;
            import java.io.IOException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class th0 implements InterfaceC0158aw {

                /* JADX INFO: renamed from: a */
                public final File f17101a;

                /* JADX INFO: renamed from: b */
                public final qe2 f17102b;

                /* JADX INFO: renamed from: c */
                public final C0207c8 f17103c;

                /* JADX INFO: renamed from: d */
                public final AtomicBoolean f17104d;

                /* JADX INFO: renamed from: e */
                public final gl1 f17105e;

                public th0(File file, qe2 qe2Var, C0207c8 c0207c8) {
/* 1 */             qe2Var.getClass();
/* 7 */             this.f17101a = file;
/* 9 */             this.f17102b = qe2Var;
/* 11 */            this.f17103c = c0207c8;
/* 19 */            this.f17104d = new AtomicBoolean(false);
/* 26 */            this.f17105e = new gl1();
                }

                /* JADX WARN: Code duplicated, block: B:30:0x0071 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:31:0x0073  */
                /* JADX WARN: Code duplicated, block: B:52:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0, types: [o40] */
                /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v11 */
                /* JADX WARN: Type inference failed for: r9v13 */
                /* JADX WARN: Type inference failed for: r9v15 */
                /* JADX WARN: Type inference failed for: r9v16 */
                /* JADX WARN: Type inference failed for: r9v2 */
                /* JADX WARN: Type inference failed for: r9v3 */
                /* JADX WARN: Type inference failed for: r9v8 */
                /* JADX WARN: Type inference failed for: r9v9 */
                /* JADX INFO: renamed from: a */
                public final Object m8789a(o40 o40Var, d10 d10Var) throws Throwable {
                    rh0 rh0Var;
                    Throwable th;
                    ph0 ph0Var;
                    th0 th0Var;
                    boolean z;
                    ?? r9;
/* 3 */             if (d10Var instanceof rh0) {
/* 6 */                 rh0Var = (rh0) d10Var;
/* 8 */                 int i = rh0Var.f16059f;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    rh0Var.f16059f = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    rh0Var = new rh0(this, d10Var);
                        }
                    } else {
/* 22 */                rh0Var = new rh0(this, d10Var);
                    }
/* 25 */            ?? r10 = rh0Var.f16057d;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = rh0Var.f16059f;
                    try {
/* 33 */                if (i2 == 0) {
/* 59 */                    pg3.m7417A(r10);
/* 68 */                    if (this.f17104d.get()) {
/* 150 */                       f42.m3656l("StorageConnection has already been disposed.");
/* 32 */                        return null;
                            }
/* 72 */                    boolean zM3968e = this.f17105e.m3968e();
/* 80 */                    ph0 ph0Var2 = new ph0(this.f17101a);
                            try {
/* 83 */                        Boolean boolValueOf = Boolean.valueOf(zM3968e);
/* 87 */                        rh0Var.f16054a = this;
/* 89 */                        rh0Var.f16055b = ph0Var2;
/* 91 */                        rh0Var.f16056c = zM3968e;
/* 93 */                        rh0Var.f16059f = 1;
/* 95 */                        Object objMo4450a = o40Var.mo4450a(ph0Var2, boolValueOf, rh0Var);
/* 99 */                        if (objMo4450a == z10Var) {
/* 101 */                           return z10Var;
                                }
/* 102 */                       th0Var = this;
/* 103 */                       z = zM3968e ? 1 : 0;
/* 104 */                       r9 = objMo4450a;
/* 105 */                       ph0Var = ph0Var2;
/* 106 */                       ph0Var.close();
/* 109 */                       th = null;
/* 112 */                       if (th != null) {
/* 122 */                           throw th;
                                }
/* 114 */                       if (z) {
/* 118 */                           th0Var.f17105e.m3970g(null);
                                }
/* 121 */                       return r9;
                            } catch (Throwable th2) {
/* 128 */                       th = th2;
/* 129 */                       ph0Var = ph0Var2;
                                r10 = zM3968e;
/* 130 */                       ph0Var.close();
/* 138 */                       throw th;
                            }
                        }
/* 35 */                if (i2 != 1) {
/* 55 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                z = rh0Var.f16056c;
/* 39 */                ph0Var = rh0Var.f16055b;
/* 41 */                th0Var = rh0Var.f16054a;
                        try {
/* 43 */                    pg3.m7417A(r10);
                            r9 = r10;
                            try {
/* 106 */                       ph0Var.close();
/* 109 */                       th = null;
                            } catch (Throwable th3) {
/* 111 */                       th = th3;
                            }
/* 112 */                   if (th != null) {
/* 114 */                       if (z) {
/* 118 */                           th0Var.f17105e.m3970g(null);
                                }
/* 121 */                       return r9;
                            }
                            try {
/* 122 */                       throw th;
                            } catch (Throwable th4) {
/* 123 */                       th = th4;
/* 124 */                       r10 = z;
/* 125 */                       this = th0Var;
                            }
                        } catch (Throwable th5) {
/* 49 */                    r10 = z ? 1 : 0;
/* 50 */                    this = th0Var;
/* 51 */                    th = th5;
                            try {
/* 130 */                       ph0Var.close();
/* 138 */                       throw th;
                            } catch (Throwable th6) {
/* 135 */                       jf0.m5798a(th, th6);
/* 138 */                       throw th;
                            }
                        }
                    } catch (Throwable th7) {
/* 139 */               th = th7;
                    }
/* 140 */           if (r10 != 0) {
/* 144 */               this.f17105e.m3970g(null);
                    }
/* 147 */           throw th;
                }

                /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[Catch: all -> 0x0112, IOException -> 0x0115, TRY_ENTER, TryCatch #8 {IOException -> 0x0115, all -> 0x0112, blocks: (B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:50:0x00f1, B:51:0x0111, B:47:0x00ea, B:58:0x0121, B:65:0x012f, B:64:0x012c, B:61:0x0127), top: B:77:0x0023, inners: #7 }] */
                /* JADX WARN: Code duplicated, block: B:44:0x00dd A[Catch: all -> 0x0112, IOException -> 0x0115, TryCatch #8 {IOException -> 0x0115, all -> 0x0112, blocks: (B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:50:0x00f1, B:51:0x0111, B:47:0x00ea, B:58:0x0121, B:65:0x012f, B:64:0x012c, B:61:0x0127), top: B:77:0x0023, inners: #7 }] */
                /* JADX WARN: Code duplicated, block: B:46:0x00e5 A[Catch: all -> 0x0112, IOException -> 0x0115, TryCatch #8 {IOException -> 0x0115, all -> 0x0112, blocks: (B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:50:0x00f1, B:51:0x0111, B:47:0x00ea, B:58:0x0121, B:65:0x012f, B:64:0x012c, B:61:0x0127), top: B:77:0x0023, inners: #7 }] */
                /* JADX WARN: Code duplicated, block: B:47:0x00ea A[Catch: all -> 0x0112, IOException -> 0x0115, TryCatch #8 {IOException -> 0x0115, all -> 0x0112, blocks: (B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:50:0x00f1, B:51:0x0111, B:47:0x00ea, B:58:0x0121, B:65:0x012f, B:64:0x012c, B:61:0x0127), top: B:77:0x0023, inners: #7 }] */
                /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
                /* JADX WARN: Code duplicated, block: B:50:0x00f1 A[Catch: all -> 0x0112, IOException -> 0x0115, TryCatch #8 {IOException -> 0x0115, all -> 0x0112, blocks: (B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:50:0x00f1, B:51:0x0111, B:47:0x00ea, B:58:0x0121, B:65:0x012f, B:64:0x012c, B:61:0x0127), top: B:77:0x0023, inners: #7 }] */
                /* JADX WARN: Code duplicated, block: B:58:0x0121 A[Catch: all -> 0x0112, IOException -> 0x0115, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0115, all -> 0x0112, blocks: (B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:50:0x00f1, B:51:0x0111, B:47:0x00ea, B:58:0x0121, B:65:0x012f, B:64:0x012c, B:61:0x0127), top: B:77:0x0023, inners: #7 }] */
                /* JADX WARN: Code duplicated, block: B:71:0x0139 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:69:0x0133, B:71:0x0139, B:72:0x013c, B:32:0x0099, B:33:0x00b5), top: B:77:0x0023 }] */
                /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                /* JADX WARN: Instruction removed from duplicated block: B:50:0x00f1, please report this as an issue */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r3v1 */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
                /* JADX WARN: Type inference failed for: r3v7, types: [java.io.File, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v0, types: [a50, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v1 */
                /* JADX WARN: Type inference failed for: r9v10, types: [java.io.File, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v14, types: [java.io.File] */
                /* JADX WARN: Type inference failed for: r9v15 */
                /* JADX WARN: Type inference failed for: r9v16 */
                /* JADX WARN: Type inference failed for: r9v17 */
                /* JADX WARN: Type inference failed for: r9v5, types: [kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r9v6 */
                /* JADX WARN: Type inference failed for: r9v8 */
                /* JADX WARN: Type inference failed for: r9v9 */
                /* JADX INFO: renamed from: b */
                public final Object m8790b(a50 a50Var, d10 d10Var) throws Throwable {
                    sh0 sh0Var;
                    ?? file;
                    dl1 dl1Var;
                    ?? r9;
                    ei0 ei0Var;
                    Throwable th;
                    ei0 ei0Var2;
                    th0 th0Var;
                    Object obj;
                    ?? r10;
                    File file2;
                    boolean zRenameTo;
/* 5 */             if (d10Var instanceof sh0) {
/* 8 */                 sh0Var = (sh0) d10Var;
/* 10 */                int i = sh0Var.f16627i;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    sh0Var.f16627i = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    sh0Var = new sh0(this, d10Var);
                        }
                    } else {
/* 24 */                sh0Var = new sh0(this, d10Var);
                    }
/* 27 */            Object obj2 = sh0Var.f16625e;
/* 29 */            Object obj3 = z10.f19902a;
/* 31 */            int i2 = sh0Var.f16627i;
                    try {
                        try {
                            try {
                                try {
/* 36 */                            if (i2 == 0) {
/* 84 */                                pg3.m7417A(obj2);
/* 93 */                                if (this.f17104d.get()) {
/* 326 */                                   f42.m3656l("StorageConnection has already been disposed.");
/* 35 */                                    return null;
                                        }
/* 95 */                                File file3 = this.f17101a;
/* 101 */                               File parentFile = file3.getCanonicalFile().getParentFile();
/* 105 */                               if (parentFile != null) {
/* 107 */                                   parentFile.mkdirs();
/* 114 */                                   if (!parentFile.isDirectory()) {
/* 136 */                                       throw new IOException("Unable to create parent directories of " + file3);
                                            }
                                        }
/* 137 */                               sh0Var.f16621a = this;
/* 139 */                               sh0Var.f16622b = a50Var;
/* 141 */                               gl1 gl1Var = this.f17105e;
/* 143 */                               sh0Var.f16623c = gl1Var;
/* 145 */                               sh0Var.f16627i = 1;
/* 147 */                               Object objM3967d = gl1Var.m3967d(sh0Var);
                                        r9 = a50Var;
                                        dl1Var = gl1Var;
/* 151 */                               if (objM3967d != obj3) {
                                        }
/* 203 */                               return obj3;
                                    }
/* 38 */                            if (i2 != 1) {
/* 40 */                                if (i2 != 2) {
/* 64 */                                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 35 */                                    return null;
                                        }
/* 42 */                                ei0Var2 = sh0Var.f16624d;
/* 46 */                                a50Var = (File) sh0Var.f16623c;
/* 50 */                                obj3 = (dl1) sh0Var.f16622b;
/* 52 */                                th0Var = sh0Var.f16621a;
                                        try {
/* 54 */                                    pg3.m7417A(obj2);
                                            obj = obj3;
                                            r10 = a50Var;
                                            try {
/* 208 */                                       ei0Var2.close();
/* 211 */                                       th = null;
                                            } catch (Throwable th2) {
/* 213 */                                       th = th2;
                                            }
/* 214 */                                   if (th == null) {
/* 290 */                                       throw th;
                                            }
/* 220 */                                   if (r10.exists()) {
/* 222 */                                       file2 = th0Var.f17101a;
/* 228 */                                       if (Build.VERSION.SDK_INT >= 26) {
/* 230 */                                           zRenameTo = AbstractC0909f9.m3679a(r10, file2);
                                                } else {
/* 235 */                                           zRenameTo = r10.renameTo(file2);
                                                }
/* 239 */                                       if (zRenameTo) {
/* 274 */                                           throw new IOException("Unable to rename " + r10 + " to " + th0Var.f17101a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                            }
/* 284 */                                   ((gl1) obj).m3970g(null);
/* 287 */                                   return Unit.f12910a;
                                        } catch (Throwable th3) {
/* 59 */                                    th = th3;
                                            try {
/* 296 */                                       ei0Var2.close();
                                            } catch (Throwable th4) {
/* 301 */                                       jf0.m5798a(th, th4);
                                            }
/* 304 */                                   throw th;
                                        }
                                    }
/* 70 */                            dl1 dl1Var2 = (dl1) sh0Var.f16623c;
/* 74 */                            Function2 function2 = (Function2) sh0Var.f16622b;
/* 76 */                            th0 th0Var2 = sh0Var.f16621a;
/* 78 */                            pg3.m7417A(obj2);
/* 81 */                            dl1Var = dl1Var2;
/* 82 */                            this = th0Var2;
                                    r9 = function2;
/* 187 */                           sh0Var.f16621a = this;
/* 189 */                           sh0Var.f16622b = dl1Var;
/* 191 */                           sh0Var.f16623c = file;
/* 193 */                           sh0Var.f16624d = ei0Var;
/* 195 */                           sh0Var.f16627i = 2;
/* 201 */                           if (r9.invoke(ei0Var, sh0Var) != obj3) {
/* 204 */                               th0Var = this;
/* 205 */                               obj = dl1Var;
/* 206 */                               r10 = file;
/* 207 */                               ei0Var2 = ei0Var;
/* 208 */                               ei0Var2.close();
/* 211 */                               th = null;
/* 214 */                               if (th == null) {
/* 290 */                                   throw th;
                                        }
/* 220 */                               if (r10.exists()) {
/* 222 */                                   file2 = th0Var.f17101a;
/* 228 */                                   if (Build.VERSION.SDK_INT >= 26) {
/* 230 */                                       zRenameTo = AbstractC0909f9.m3679a(r10, file2);
                                            } else {
/* 235 */                                       zRenameTo = r10.renameTo(file2);
                                            }
/* 239 */                                   if (zRenameTo) {
/* 274 */                                       throw new IOException("Unable to rename " + r10 + " to " + th0Var.f17101a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
/* 284 */                               ((gl1) obj).m3970g(null);
/* 287 */                               return Unit.f12910a;
                                    }
/* 203 */                           return obj3;
                                } catch (Throwable th5) {
/* 292 */                           obj3 = dl1Var;
/* 293 */                           a50Var = file;
/* 294 */                           th = th5;
/* 295 */                           ei0Var2 = ei0Var;
/* 296 */                           ei0Var2.close();
/* 304 */                           throw th;
                                }
/* 184 */                       ei0Var = new ei0(file);
                            } catch (IOException e) {
/* 307 */                       e = e;
/* 312 */                       if (file.exists()) {
/* 314 */                           file.delete();
                                }
/* 317 */                       throw e;
                            }
/* 179 */                   file = new File(this.f17101a.getAbsolutePath() + ".tmp");
                        } catch (Throwable th6) {
/* 305 */                   th = th6;
/* 320 */                   ((gl1) obj2).m3970g(null);
/* 323 */                   throw th;
                        }
                    } catch (IOException e2) {
/* 278 */               e = e2;
/* 279 */               file = a50Var;
/* 312 */               if (file.exists()) {
/* 314 */                   file.delete();
                        }
/* 317 */               throw e;
                    } catch (Throwable th7) {
/* 275 */               th = th7;
/* 276 */               obj2 = obj3;
/* 320 */               ((gl1) obj2).m3970g(null);
/* 323 */               throw th;
                    }
                }

                @Override // p000.InterfaceC0158aw
                public final void close() {
/* 4 */             this.f17104d.set(true);
/* 9 */             this.f17103c.invoke();
                }
            }
