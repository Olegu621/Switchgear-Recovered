            package p000;

            import java.util.Locale;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            /* JADX INFO: renamed from: l0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 328 */   public abstract class AbstractC1873l0 implements s81 {

                /* JADX INFO: renamed from: d */
                public static final boolean f13060d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

                /* JADX INFO: renamed from: e */
                public static final Logger f13061e = Logger.getLogger(AbstractC1873l0.class.getName());

                /* JADX INFO: renamed from: f */
                public static final yy1 f13062f;

                /* JADX INFO: renamed from: i */
                public static final Object f13063i;

                /* JADX INFO: renamed from: a */
                public volatile Object f13064a;

                /* JADX INFO: renamed from: b */
                public volatile C0974h0 f13065b;

                /* JADX INFO: renamed from: c */
                public volatile C1813k0 f13066c;

                static {
                    yy1 c1776j0;
                    try {
/* 63 */                c1776j0 = new C1011i0(AtomicReferenceFieldUpdater.newUpdater(C1813k0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1813k0.class, C1813k0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1873l0.class, C1813k0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1873l0.class, C0974h0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1873l0.class, Object.class, "a"));
/* 66 */                th = null;
                    } catch (Throwable th) {
/* 68 */                th = th;
/* 71 */                c1776j0 = new C1776j0();
                    }
/* 74 */            f13062f = c1776j0;
/* 76 */            if (th != null) {
/* 84 */                f13061e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
                    }
/* 92 */            f13063i = new Object();
                }

                /* JADX INFO: renamed from: d */
                public static void m6319d(AbstractC1873l0 abstractC1873l0) {
                    C1813k0 c1813k0;
                    C0974h0 c0974h0;
                    C0974h0 c0974h1;
                    C0974h0 c0974h2;
/* 11 */            do {
/* 1 */                 c1813k0 = abstractC1873l0.f13066c;
/* 11 */            } while (!f13062f.mo4411g(abstractC1873l0, c1813k0, C1813k0.f12551c));
                    while (true) {
/* 13 */                c0974h0 = null;
/* 14 */                if (c1813k0 == null) {
                            break;
                        }
/* 16 */                Thread thread = c1813k0.f12552a;
/* 18 */                if (thread != null) {
/* 20 */                    c1813k0.f12552a = null;
/* 22 */                    LockSupport.unpark(thread);
                        }
/* 25 */                c1813k0 = c1813k0.f12553b;
                    }
/* 28 */            abstractC1873l0.mo6324c();
/* 41 */            do {
/* 31 */                c0974h1 = abstractC1873l0.f13065b;
/* 41 */            } while (!f13062f.mo4409e(abstractC1873l0, c0974h1, C0974h0.f8858d));
                    while (true) {
/* 43 */                c0974h2 = c0974h0;
/* 44 */                c0974h0 = c0974h1;
/* 45 */                if (c0974h0 == null) {
                            break;
                        }
/* 47 */                c0974h1 = c0974h0.f8861c;
/* 49 */                c0974h0.f8861c = c0974h2;
                    }
/* 52 */            while (c0974h2 != null) {
/* 54 */                C0974h0 c0974h3 = c0974h2.f8861c;
/* 60 */                m6320e(c0974h2.f8859a, c0974h2.f8860b);
/* 63 */                c0974h2 = c0974h3;
                    }
                }

                /* JADX INFO: renamed from: e */
                public static void m6320e(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (RuntimeException e) {
/* 32 */                f13061e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
                    }
                }

                /* JADX INFO: renamed from: f */
                public static Object m6321f(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof C0863e0) {
/* 27 */                Throwable th = ((C0863e0) obj).f7461b;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 39 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof C0937g0) {
/* 24 */                throw new ExecutionException(((C0937g0) obj).f8412a);
                    }
/* 11 */            if (obj == f13063i) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                /* JADX INFO: renamed from: g */
                public static Object m6322g(AbstractC1873l0 abstractC1873l0) {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = abstractC1873l0.get();
                            break;
                        } catch (InterruptedException unused) {
/* 27 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 23 */                        Thread.currentThread().interrupt();
                            }
/* 26 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return obj;
                }

                @Override // p000.s81
                /* JADX INFO: renamed from: a */
                public final void mo3676a(Runnable runnable, Executor executor) {
/* 1 */             executor.getClass();
/* 4 */             C0974h0 c0974h0 = this.f13065b;
/* 6 */             C0974h0 c0974h1 = C0974h0.f8858d;
/* 8 */             if (c0974h0 != c0974h1) {
/* 12 */                C0974h0 c0974h2 = new C0974h0(runnable, executor);
/* 28 */                do {
/* 15 */                    c0974h2.f8861c = c0974h0;
/* 23 */                    if (f13062f.mo4409e(this, c0974h0, c0974h2)) {
/* 25 */                        return;
                            } else {
/* 26 */                        c0974h0 = this.f13065b;
                            }
/* 28 */                } while (c0974h0 != c0974h1);
                    }
/* 30 */            m6320e(runnable, executor);
                }

                /* JADX INFO: renamed from: b */
                public final void m6323b(StringBuilder sb) {
                    try {
/* 3 */                 Object objM6322g = m6322g(this);
/* 9 */                 sb.append("SUCCESS, result=[");
/* 21 */                sb.append(objM6322g == this ? "this future" : String.valueOf(objM6322g));
/* 24 */                sb.append("]");
                    } catch (CancellationException unused) {
/* 52 */                sb.append("CANCELLED");
                    } catch (RuntimeException e) {
/* 34 */                sb.append("UNKNOWN, cause=[");
/* 41 */                sb.append(e.getClass());
/* 46 */                sb.append(" thrown from get()]");
                    } catch (ExecutionException e2) {
/* 58 */                sb.append("FAILURE, cause=[");
/* 65 */                sb.append(e2.getCause());
/* 68 */                sb.append("]");
                    }
                }

                /* JADX INFO: renamed from: c */
                public void mo6324c() {
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
                    C0863e0 c0863e0;
/* 1 */             Object obj = this.f13064a;
/* 10 */            if (obj == null) {
/* 14 */                if (f13060d) {
/* 25 */                    c0863e0 = new C0863e0(z, new CancellationException("Future.cancel() was called."));
                        } else {
/* 34 */                    c0863e0 = z ? C0863e0.f7458c : C0863e0.f7459d;
                        }
/* 42 */                if (f13062f.mo4410f(this, obj, c0863e0)) {
/* 44 */                    m6319d(this);
/* 3 */                     return true;
                        }
                    }
/* 4 */             return false;
                }

                @Override // java.util.concurrent.Future
                public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
/* 7 */             C1813k0 c1813k0 = C1813k0.f12551c;
/* 9 */             long nanos = timeUnit.toNanos(j);
/* 17 */            if (Thread.interrupted()) {
/* 329 */               throw new InterruptedException();
                    }
/* 19 */            Object obj = this.f13064a;
/* 21 */            if (obj != null) {
/* 23 */                return m6321f(obj);
                    }
/* 40 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 45 */            if (nanos >= 1000) {
/* 47 */                C1813k0 c1813k1 = this.f13066c;
/* 49 */                if (c1813k1 != c1813k0) {
/* 53 */                    C1813k0 c1813k2 = new C1813k0();
                            while (true) {
/* 56 */                        yy1 yy1Var = f13062f;
/* 58 */                        yy1Var.mo4412y(c1813k2, c1813k1);
/* 65 */                        if (yy1Var.mo4411g(this, c1813k1, c1813k2)) {
/* 93 */                            do {
/* 67 */                                LockSupport.parkNanos(this, nanos);
/* 74 */                                if (Thread.interrupted()) {
/* 99 */                                    m6326i(c1813k2);
/* 107 */                                   throw new InterruptedException();
                                        }
/* 76 */                                Object obj2 = this.f13064a;
/* 78 */                                if (obj2 != null) {
/* 80 */                                    return m6321f(obj2);
                                        }
/* 89 */                                nanos = jNanoTime - System.nanoTime();
/* 93 */                            } while (nanos >= 1000);
/* 95 */                            m6326i(c1813k2);
                                    break;
                                }
/* 108 */                       c1813k1 = this.f13066c;
/* 110 */                       if (c1813k1 == c1813k0) {
                                }
                            }
                        }
/* 114 */               return m6321f(this.f13064a);
                    }
/* 121 */           while (nanos > 0) {
/* 123 */               Object obj3 = this.f13064a;
/* 125 */               if (obj3 != null) {
/* 127 */                   return m6321f(obj3);
                        }
/* 136 */               if (Thread.interrupted()) {
/* 150 */                   throw new InterruptedException();
                        }
/* 142 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 151 */           String string = toString();
/* 155 */           String string2 = timeUnit.toString();
/* 159 */           Locale locale = Locale.ROOT;
/* 161 */           String lowerCase = string2.toLowerCase(locale);
/* 191 */           String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
/* 199 */           if (nanos + 1000 < 0) {
/* 203 */               String strConcat2 = strConcat.concat(" (plus ");
/* 207 */               long j2 = -nanos;
/* 210 */               long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
/* 218 */               long nanos2 = j2 - timeUnit.toNanos(jConvert);
/* 230 */               boolean z = jConvert == 0 || nanos2 > 1000;
/* 231 */               if (jConvert > 0) {
/* 250 */                   String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
/* 254 */                   if (z) {
/* 258 */                       strConcat3 = strConcat3.concat(",");
                            }
/* 262 */                   strConcat2 = strConcat3.concat(" ");
                        }
/* 266 */               if (z) {
/* 284 */                   strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                        }
/* 290 */               strConcat = strConcat2.concat("delay)");
                    }
/* 298 */           if (isDone()) {
/* 311 */               throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
                    }
/* 323 */           throw new TimeoutException(AbstractC0886en.m3508l(strConcat, " for ", string));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: h */
                public String mo6325h() {
/* 3 */             if (!(this instanceof ScheduledFuture)) {
/* 33 */                return null;
                    }
/* 28 */            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                }

                /* JADX INFO: renamed from: i */
                public final void m6326i(C1813k0 c1813k0) {
/* 2 */             c1813k0.f12552a = null;
                    while (true) {
/* 4 */                 C1813k0 c1813k1 = this.f13066c;
/* 8 */                 if (c1813k1 == C1813k0.f12551c) {
/* 42 */                    return;
                        }
/* 11 */                C1813k0 c1813k2 = null;
/* 12 */                while (c1813k1 != null) {
/* 14 */                    C1813k0 c1813k3 = c1813k1.f12553b;
/* 18 */                    if (c1813k1.f12552a != null) {
/* 20 */                        c1813k2 = c1813k1;
                            } else if (c1813k2 != null) {
/* 24 */                        c1813k2.f12553b = c1813k3;
/* 28 */                        if (c1813k2.f12552a == null) {
                                }
                            } else if (!f13062f.mo4411g(this, c1813k1, c1813k3)) {
                            }
/* 40 */                    c1813k1 = c1813k3;
                        }
/* 42 */                return;
                    }
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 3 */             return this.f13064a instanceof C0863e0;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
                    return this.f13064a != null;
                }

                /* JADX INFO: renamed from: j */
                public boolean m6327j(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = f13063i;
                    }
/* 12 */            if (!f13062f.mo4410f(this, null, obj)) {
/* 19 */                return false;
                    }
/* 14 */            m6319d(this);
/* 17 */            return true;
                }

                /* JADX INFO: renamed from: k */
                public boolean mo6328k(Throwable th) {
/* 3 */             th.getClass();
/* 16 */            if (!f13062f.mo4410f(this, null, new C0937g0(th))) {
/* 23 */                return false;
                    }
/* 18 */            m6319d(this);
/* 21 */            return true;
                }

                public final String toString() {
                    String strMo6325h;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            sb.append("[status=");
/* 24 */            if (this.f13064a instanceof C0863e0) {
/* 28 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 38 */                m6323b(sb);
                    } else {
                        try {
/* 42 */                    strMo6325h = mo6325h();
                        } catch (RuntimeException e) {
/* 62 */                    strMo6325h = "Exception thrown from implementation: " + e.getClass();
                        }
/* 66 */                if (strMo6325h != null && !strMo6325h.isEmpty()) {
/* 76 */                    sb.append("PENDING, info=[");
/* 79 */                    sb.append(strMo6325h);
/* 82 */                    sb.append("]");
                        } else if (isDone()) {
/* 92 */                    m6323b(sb);
                        } else {
/* 98 */                    sb.append("PENDING");
                        }
                    }
/* 101 */           sb.append("]");
/* 104 */           return sb.toString();
                }

                @Override // java.util.concurrent.Future
/* 329 */       public final Object get() throws InterruptedException {
                    Object obj;
/* 330 */           C1813k0 c1813k0 = C1813k0.f12551c;
                    if (!Thread.interrupted()) {
/* 331 */               Object obj2 = this.f13064a;
                        if (obj2 != null) {
/* 332 */                   return m6321f(obj2);
                        }
/* 333 */               C1813k0 c1813k1 = this.f13066c;
                        if (c1813k1 != c1813k0) {
/* 334 */                   C1813k0 c1813k2 = new C1813k0();
                            do {
/* 335 */                       yy1 yy1Var = f13062f;
                                yy1Var.mo4412y(c1813k2, c1813k1);
/* 336 */                       if (yy1Var.mo4411g(this, c1813k1, c1813k2)) {
                                    do {
/* 337 */                               LockSupport.park(this);
/* 338 */                               if (!Thread.interrupted()) {
/* 339 */                                   obj = this.f13064a;
                                        } else {
/* 341 */                                   m6326i(c1813k2);
/* 342 */                                   throw new InterruptedException();
                                        }
                                    } while (obj == null);
/* 340 */                           return m6321f(obj);
                                }
/* 343 */                       c1813k1 = this.f13066c;
                            } while (c1813k1 != c1813k0);
                        }
/* 344 */               return m6321f(this.f13064a);
                    }
/* 345 */           throw new InterruptedException();
                }
            }
