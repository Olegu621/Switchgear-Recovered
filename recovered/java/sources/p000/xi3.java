            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xi3 implements Thread.UncaughtExceptionHandler {

                /* JADX INFO: renamed from: a */
                public final String f19200a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ bj3 f19201b;

                public xi3(bj3 bj3Var, String str) {
/* 4 */             this.f19201b = bj3Var;
/* 6 */             this.f19200a = str;
                }

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final synchronized void uncaughtException(Thread thread, Throwable th) {
/* 8 */             uh3 uh3Var = ((ij3) this.f19201b.f16749a).f9655f;
/* 10 */            ij3.m4555l(uh3Var);
/* 17 */            uh3Var.f17538f.m8511b(th, this.f19200a);
                }
            }
