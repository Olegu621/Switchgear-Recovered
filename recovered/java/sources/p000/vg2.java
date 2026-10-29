            package p000;

            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vg2 implements Runnable {

                /* JADX INFO: renamed from: v */
                public static final Object f18055v = new Object();

                /* JADX INFO: renamed from: a */
                public final Executor f18056a;

                /* JADX INFO: renamed from: b */
                public final ts0 f18057b;

                /* JADX INFO: renamed from: d */
                public final AtomicReference f18059d;

                /* JADX INFO: renamed from: c */
                public final AtomicBoolean f18058c = new AtomicBoolean(true);

                /* JADX INFO: renamed from: e */
                public Object f18060e = f18055v;

                /* JADX INFO: renamed from: f */
                public int f18061f = -1;

                /* JADX INFO: renamed from: i */
                public boolean f18062i = false;

                public vg2(AtomicReference atomicReference, Executor executor, ts0 ts0Var) {
/* 22 */            this.f18059d = atomicReference;
/* 24 */            this.f18056a = executor;
/* 26 */            this.f18057b = ts0Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m9267a(int i) {
                    synchronized (this) {
                        try {
/* 8 */                     if (this.f18058c.get()) {
/* 16 */                        if (i <= this.f18061f) {
/* 19 */                            return;
                                }
/* 20 */                        this.f18061f = i;
/* 24 */                        if (this.f18062i) {
/* 27 */                            return;
                                }
/* 29 */                        this.f18062i = true;
                                try {
/* 34 */                            this.f18056a.execute(this);
                                } catch (Throwable unused) {
                                    synchronized (this) {
/* 40 */                                this.f18062i = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        try {
/* 9 */                     if (!this.f18058c.get()) {
/* 11 */                        this.f18062i = false;
/* 14 */                        return;
                            }
/* 19 */                    Object obj = this.f18059d.get();
/* 23 */                    int i = this.f18061f;
                            while (true) {
/* 32 */                        if (!Objects.equals(this.f18060e, obj)) {
/* 34 */                            this.f18060e = obj;
/* 36 */                            boolean z = obj instanceof AbstractC2000og;
/* 38 */                            ts0 ts0Var = this.f18057b;
/* 40 */                            if (z) {
/* 42 */                                ts0Var.getClass();
/* 50 */                                hu0.m4326U("ObserverToConsumerAdapter", "Unexpected error in Observable", null);
                                    } else {
/* 58 */                                ((c00) ts0Var.f17248a).accept(obj);
                                    }
                                }
                                synchronized (this) {
                                    try {
/* 64 */                                if (i == this.f18061f || !this.f18058c.get()) {
                                            break;
                                            break;
                                        } else {
/* 77 */                                    obj = this.f18059d.get();
/* 81 */                                    i = this.f18061f;
                                        }
                                    } catch (Throwable th) {
/* 92 */                                throw th;
                                    }
                                }
                            }
/* 87 */                    this.f18062i = false;
                        } catch (Throwable th2) {
/* 94 */                    throw th2;
                        }
                    }
                }
            }
