            package p000;

            import java.lang.ref.WeakReference;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: xm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class C2466xm implements s81 {

                /* JADX INFO: renamed from: a */
                public final WeakReference f19247a;

                /* JADX INFO: renamed from: b */
                public final C2336wm f19248b = new C2336wm(this);

                public C2466xm(C2260um c2260um) {
/* 16 */            this.f19247a = new WeakReference(c2260um);
                }

                @Override // p000.s81
                /* JADX INFO: renamed from: a */
                public final void mo3676a(Runnable runnable, Executor executor) {
/* 3 */             this.f19248b.mo3676a(runnable, executor);
                }

                /* JADX INFO: renamed from: b */
                public final boolean m9977b(Throwable th) {
/* 3 */             return this.f19248b.mo6328k(th);
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 7 */             C2260um c2260um = (C2260um) this.f19247a.get();
/* 11 */            boolean zCancel = this.f19248b.cancel(z);
/* 15 */            if (zCancel && c2260um != null) {
/* 20 */                c2260um.f17590a = null;
/* 22 */                c2260um.f17591b = null;
/* 26 */                c2260um.f17592c.m6327j(null);
                    }
/* 29 */            return zCancel;
                }

                @Override // java.util.concurrent.Future
                public final Object get() {
/* 3 */             return this.f19248b.get();
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 5 */             return this.f19248b.f13064a instanceof C0863e0;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 3 */             return this.f19248b.isDone();
                }

                public final String toString() {
/* 3 */             return this.f19248b.toString();
                }

                @Override // java.util.concurrent.Future
/* 7 */         public final Object get(long j, TimeUnit timeUnit) {
/* 8 */             return this.f19248b.get(j, timeUnit);
                }
            }
