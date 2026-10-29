            package p000;

            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class yo0 implements s81 {

                /* JADX INFO: renamed from: a */
                public final s81 f19730a;

                /* JADX INFO: renamed from: b */
                public C2260um f19731b;

                public yo0() {
/* 13 */            this.f19730a = py0.m7599Y(new d52(this));
                }

                /* JADX INFO: renamed from: b */
                public static yo0 m10162b(s81 s81Var) {
                    return s81Var instanceof yo0 ? (yo0) s81Var : new yo0(s81Var);
                }

                @Override // p000.s81
                /* JADX INFO: renamed from: a */
                public final void mo3676a(Runnable runnable, Executor executor) {
/* 3 */             this.f19730a.mo3676a(runnable, executor);
                }

                @Override // java.util.concurrent.Future
                public boolean cancel(boolean z) {
/* 3 */             return this.f19730a.cancel(z);
                }

                @Override // java.util.concurrent.Future
                public Object get() {
/* 3 */             return this.f19730a.get();
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 3 */             return this.f19730a.isCancelled();
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 3 */             return this.f19730a.isDone();
                }

                @Override // java.util.concurrent.Future
/* 7 */         public Object get(long j, TimeUnit timeUnit) {
/* 8 */             return this.f19730a.get(j, timeUnit);
                }

/* 15 */        public yo0(s81 s81Var) {
/* 17 */            s81Var.getClass();
/* 18 */            this.f19730a = s81Var;
                }
            }
