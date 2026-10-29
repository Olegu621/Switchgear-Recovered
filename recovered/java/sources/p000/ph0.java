            package p000;

            import io.sentry.config.AbstractC1417a;
            import java.io.Closeable;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ph0 implements InterfaceC0158aw {

                /* JADX INFO: renamed from: a */
                public final File f15120a;

                /* JADX INFO: renamed from: b */
                public final AtomicBoolean f15121b = new AtomicBoolean(false);

                public ph0(File file) {
/* 4 */             this.f15120a = file;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
                
                    if (r9 == r1) goto L45;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [int] */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v4 */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v9, types: [ph0] */
                /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ph0] */
                /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
                /* JADX WARN: Type inference failed for: r8v17 */
                /* JADX WARN: Type inference failed for: r8v18 */
                /* JADX WARN: Type inference failed for: r8v2 */
                /* JADX WARN: Type inference failed for: r8v3, types: [ph0] */
                /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
                /* JADX INFO: renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object m7447a(ph0 ph0Var, d10 d10Var) {
                    oh0 oh0Var;
                    FileInputStream fileInputStream;
                    Throwable th;
/* 3 */             if (d10Var instanceof oh0) {
/* 6 */                 oh0Var = (oh0) d10Var;
/* 8 */                 int i = oh0Var.f14753e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oh0Var.f14753e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oh0Var = new oh0(ph0Var, d10Var);
                        }
                    } else {
/* 22 */                oh0Var = new oh0(ph0Var, d10Var);
                    }
/* 25 */            Object objM10027c = oh0Var.f14751c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            ?? r2 = oh0Var.f14753e;
/* 32 */            boolean z = true;
                    try {
                        try {
/* 34 */                    if (r2 != 0) {
/* 36 */                        if (r2 != 1) {
/* 38 */                            if (r2 != 2) {
/* 54 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 33 */                                return null;
                                    }
/* 42 */                            Closeable closeable = (Closeable) oh0Var.f14749a;
/* 44 */                            pg3.m7417A(objM10027c);
                                    ph0Var = closeable;
/* 158 */                           jb1.m5754n(ph0Var, null);
/* 161 */                           return objM10027c;
                                }
/* 58 */                        fileInputStream = oh0Var.f14750b;
/* 62 */                        r2 = (ph0) oh0Var.f14749a;
                                try {
/* 64 */                            pg3.m7417A(objM10027c);
/* 109 */                           jb1.m5754n(fileInputStream, null);
/* 112 */                           return objM10027c;
                                } catch (Throwable th2) {
/* 68 */                            th = th2;
                                    try {
/* 120 */                               throw th;
                                    } catch (Throwable th3) {
/* 122 */                               jb1.m5754n(fileInputStream, th);
/* 125 */                               throw th3;
                                    }
                                }
                            }
/* 70 */                    pg3.m7417A(objM10027c);
/* 79 */                    if (ph0Var.f15121b.get()) {
/* 176 */                       f42.m3656l("This scope has already been closed.");
/* 33 */                        return null;
                            }
                            try {
/* 83 */                        File file = ph0Var.f15120a;
/* 88 */                        FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(file, new FileInputStream(file));
                                try {
/* 92 */                            oh0Var.f14749a = ph0Var;
/* 94 */                            oh0Var.f14750b = fileInputStreamM5164b;
/* 96 */                            oh0Var.f14753e = 1;
/* 98 */                            vk1 vk1VarM10027c = xt0.m10027c(fileInputStreamM5164b);
/* 102 */                           if (vk1VarM10027c != z10Var) {
/* 107 */                               fileInputStream = fileInputStreamM5164b;
/* 108 */                               objM10027c = vk1VarM10027c;
/* 109 */                               jb1.m5754n(fileInputStream, null);
/* 112 */                               return objM10027c;
                                    }
                                } catch (Throwable th4) {
/* 117 */                           r2 = ph0Var;
/* 118 */                           fileInputStream = fileInputStreamM5164b;
/* 119 */                           th = th4;
/* 120 */                           throw th;
                                }
                            } catch (FileNotFoundException unused) {
/* 132 */                       if (!ph0Var.f15120a.exists()) {
/* 170 */                           return new vk1(z);
                                }
/* 136 */                       File file2 = ph0Var.f15120a;
/* 141 */                       FileInputStream fileInputStreamM5164b2 = AbstractC1417a.m5164b(file2, new FileInputStream(file2));
/* 145 */                       oh0Var.f14749a = fileInputStreamM5164b2;
/* 147 */                       oh0Var.f14750b = null;
/* 149 */                       oh0Var.f14753e = 2;
/* 151 */                       objM10027c = xt0.m10027c(fileInputStreamM5164b2);
                                ph0Var = fileInputStreamM5164b2;
                            }
/* 157 */                   return z10Var;
                        } catch (FileNotFoundException unused2) {
/* 113 */                   ph0Var = r2;
                        }
                    } catch (Throwable th5) {
                        try {
/* 162 */                   throw th5;
                        } catch (Throwable th6) {
/* 164 */                   jb1.m5754n(ph0Var, th5);
/* 167 */                   throw th6;
                        }
                    }
                }

                @Override // p000.InterfaceC0158aw
                public final void close() {
/* 4 */             this.f15121b.set(true);
                }
            }
