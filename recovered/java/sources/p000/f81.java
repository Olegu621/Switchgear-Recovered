            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 53 */    public final class f81 implements s81 {

                /* JADX INFO: renamed from: a */
                public ArrayList f8039a;

                /* JADX INFO: renamed from: b */
                public ArrayList f8040b;

                /* JADX INFO: renamed from: c */
                public final boolean f8041c;

                /* JADX INFO: renamed from: d */
                public final AtomicInteger f8042d;

                /* JADX INFO: renamed from: e */
                public final s81 f8043e = py0.m7599Y(new ts0(this));

                /* JADX INFO: renamed from: f */
                public C2260um f8044f;

                public f81(ArrayList arrayList, boolean z, o80 o80Var) {
/* 4 */             this.f8039a = arrayList;
/* 15 */            this.f8040b = new ArrayList(arrayList.size());
/* 17 */            this.f8041c = z;
/* 28 */            this.f8042d = new AtomicInteger(arrayList.size());
/* 52 */            mo3676a(new RunnableC2495ye(this, 14), pg3.m7428g());
/* 61 */            if (this.f8039a.isEmpty()) {
/* 72 */                this.f8044f.m9040a(new ArrayList(this.f8040b));
/* 75 */                return;
                    }
/* 84 */            for (int i = 0; i < this.f8039a.size(); i++) {
/* 89 */                this.f8040b.add(null);
                    }
/* 95 */            ArrayList arrayList2 = this.f8039a;
/* 101 */           for (int i2 = 0; i2 < arrayList2.size(); i2++) {
/* 107 */               s81 s81Var = (s81) arrayList2.get(i2);
/* 115 */               s81Var.mo3676a(new RunnableC2064pb(this, i2, s81Var, 5), o80Var);
                    }
                }

                @Override // p000.s81
                /* JADX INFO: renamed from: a */
                public final void mo3676a(Runnable runnable, Executor executor) {
/* 3 */             this.f8043e.mo3676a(runnable, executor);
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 1 */             ArrayList arrayList = this.f8039a;
/* 3 */             if (arrayList != null) {
/* 5 */                 Iterator it = arrayList.iterator();
/* 13 */                while (it.hasNext()) {
/* 21 */                    ((s81) it.next()).cancel(z);
                        }
                    }
/* 27 */            return this.f8043e.cancel(z);
                }

                @Override // java.util.concurrent.Future
                public final Object get() throws InterruptedException {
/* 1 */             ArrayList<s81> arrayList = this.f8039a;
/* 3 */             s81 s81Var = this.f8043e;
/* 5 */             if (arrayList != null && !s81Var.isDone()) {
/* 21 */                loop0: for (s81 s81Var2 : arrayList) {
/* 33 */                    while (!s81Var2.isDone()) {
                                try {
/* 35 */                            s81Var2.get();
                                } catch (Error e) {
/* 47 */                            throw e;
                                } catch (InterruptedException e2) {
/* 45 */                            throw e2;
                                } catch (Throwable unused) {
/* 41 */                            if (this.f8041c) {
/* 52 */                                return (List) s81Var.get();
                                    }
                                }
                            }
                        }
                    }
/* 52 */            return (List) s81Var.get();
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 3 */             return this.f8043e.isCancelled();
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 3 */             return this.f8043e.isDone();
                }

                @Override // java.util.concurrent.Future
/* 54 */        public final Object get(long j, TimeUnit timeUnit) {
/* 55 */            return (List) this.f8043e.get(j, timeUnit);
                }
            }
