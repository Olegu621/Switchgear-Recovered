            package p000;

            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileOutputStream;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ei0 extends ph0 {
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: b */
                public final Object m3445b(Object obj, d10 d10Var) {
                    di0 di0Var;
                    FileOutputStream fileOutputStreamM5167e;
                    FileOutputStream fileOutputStream;
                    Throwable th;
/* 3 */             if (d10Var instanceof di0) {
/* 6 */                 di0Var = (di0) d10Var;
/* 8 */                 int i = di0Var.f7222e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    di0Var.f7222e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    di0Var = new di0(this, d10Var);
                        }
                    } else {
/* 22 */                di0Var = new di0(this, d10Var);
                    }
/* 25 */            Object obj2 = di0Var.f7220c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = di0Var.f7222e;
/* 33 */            if (i2 == 0) {
/* 53 */                pg3.m7417A(obj2);
/* 62 */                if (this.f15121b.get()) {
/* 119 */                   f42.m3656l("This scope has already been closed.");
/* 32 */                    return null;
                        }
/* 66 */                File file = this.f15120a;
/* 71 */                fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file), file);
                        try {
/* 77 */                    ix2 ix2Var = new ix2(fileOutputStreamM5167e);
/* 80 */                    di0Var.f7218a = fileOutputStreamM5167e;
/* 82 */                    di0Var.f7219b = fileOutputStreamM5167e;
/* 84 */                    di0Var.f7222e = 1;
/* 90 */                    if (xt0.m10028e(obj, ix2Var) == z10Var) {
/* 92 */                        return z10Var;
                            }
/* 93 */                    fileOutputStream = fileOutputStreamM5167e;
                        } catch (Throwable th2) {
/* 109 */                   fileOutputStream = fileOutputStreamM5167e;
/* 110 */                   th = th2;
/* 111 */                   throw th;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 49 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                fileOutputStreamM5167e = di0Var.f7219b;
/* 39 */                fileOutputStream = di0Var.f7218a;
                        try {
/* 41 */                    pg3.m7417A(obj2);
                        } catch (Throwable th3) {
/* 45 */                    th = th3;
                            try {
/* 111 */                       throw th;
                            } catch (Throwable th4) {
/* 113 */                       jb1.m5754n(fileOutputStream, th);
/* 116 */                       throw th4;
                            }
                        }
                    }
/* 98 */            fileOutputStreamM5167e.getFD().sync();
/* 101 */           jb1.m5754n(fileOutputStream, null);
/* 104 */           return Unit.f12910a;
                }
            }
