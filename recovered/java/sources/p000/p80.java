            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.internal.Intrinsics;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class p80 extends r80 implements a20, c10 {

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f15017v = AtomicReferenceFieldUpdater.newUpdater(p80.class, Object.class, "_reusableCancellableContinuation$volatile");

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ long f15018w = AbstractC1703b.f11726a.objectFieldOffset(p80.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
                private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

                /* JADX INFO: renamed from: d */
                public final s10 f15019d;

                /* JADX INFO: renamed from: e */
                public final d10 f15020e;

                /* JADX INFO: renamed from: f */
                public Object f15021f;

                /* JADX INFO: renamed from: i */
                public final Object f15022i;

                public p80(s10 s10Var, d10 d10Var) {
/* 2 */             super(-1);
/* 5 */             this.f15019d = s10Var;
/* 7 */             this.f15020e = d10Var;
/* 11 */            this.f15021f = xe2.f19059b;
/* 21 */            this.f15022i = co2.m1740b(d10Var.getContext());
                }

                @Override // p000.r80
                /* JADX INFO: renamed from: c */
                public final void mo3556c(Object obj, CancellationException cancellationException) {
/* 3 */             if (obj instanceof AbstractC2049ox) {
/* 7 */                 throw null;
                    }
                }

                @Override // p000.r80
                /* JADX INFO: renamed from: e */
                public final c10 mo3557e() {
/* 1 */             return this;
                }

                @Override // p000.a20
                public final a20 getCallerFrame() {
/* 1 */             d10 d10Var = this.f15020e;
/* 3 */             if (d10Var != null) {
/* 5 */                 return d10Var;
                    }
/* 6 */             return null;
                }

                @Override // p000.c10
                public final CoroutineContext getContext() {
/* 3 */             return this.f15020e.getContext();
                }

                @Override // p000.r80
                /* JADX INFO: renamed from: j */
                public final Object mo3560j() {
/* 1 */             Object obj = this.f15021f;
/* 5 */             this.f15021f = xe2.f19059b;
/* 7 */             return obj;
                }

                /* JADX INFO: renamed from: k */
                public final void m7348k() {
/* 16 */            do {
/* 3 */                 f15017v.getClass();
/* 16 */            } while (AbstractC1703b.f11726a.getObjectVolatile(this, f15018w) == xe2.f19060c);
                }

                /* JADX INFO: renamed from: l */
                public final C0890er m7349l() {
                    p80 p80Var;
/* 1 */             C2131r4 c2131r4 = xe2.f19060c;
                    while (true) {
/* 5 */                 f15017v.getClass();
/* 8 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 10 */                long j = f15018w;
/* 12 */                Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 17 */                if (objectVolatile == null) {
/* 19 */                    unsafe.putObjectVolatile(this, j, c2131r4);
/* 16 */                    return null;
                        }
/* 25 */                if (objectVolatile instanceof C0890er) {
                            while (true) {
/* 27 */                        Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 31 */                        p80 p80Var2 = this;
/* 32 */                        boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(p80Var2, f15018w, objectVolatile, c2131r4);
/* 38 */                        p80Var = p80Var2;
/* 39 */                        if (zCompareAndSwapObject) {
/* 41 */                            return (C0890er) objectVolatile;
                                }
/* 48 */                        if (unsafe2.getObjectVolatile(p80Var, j) != objectVolatile) {
                                    break;
                                }
/* 51 */                        this = p80Var;
                            }
                        } else {
/* 53 */                    p80Var = this;
/* 54 */                    if (objectVolatile != c2131r4 && !(objectVolatile instanceof Throwable)) {
/* 63 */                        ds0.m3201r(objectVolatile, "Inconsistent state ");
/* 16 */                        return null;
                            }
                        }
/* 67 */                this = p80Var;
                    }
                }

                /* JADX INFO: renamed from: m */
                public final C0890er m7350m() {
/* 3 */             f15017v.getClass();
/* 10 */            Object objectVolatile = AbstractC1703b.f11726a.getObjectVolatile(this, f15018w);
/* 16 */            if (objectVolatile instanceof C0890er) {
/* 18 */                return (C0890er) objectVolatile;
                    }
/* 21 */            return null;
                }

                /* JADX INFO: renamed from: n */
                public final boolean m7351n() {
/* 3 */             f15017v.getClass();
                    return AbstractC1703b.f11726a.getObjectVolatile(this, f15018w) != null;
                }

                /* JADX INFO: renamed from: o */
                public final boolean m7352o(Throwable th) {
                    p80 p80Var;
                    Throwable th2;
                    Unsafe unsafe;
                    while (true) {
/* 3 */                 f15017v.getClass();
/* 6 */                 Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 8 */                 long j = f15018w;
/* 10 */                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
/* 14 */                C2131r4 c2131r4 = xe2.f19060c;
/* 20 */                if (Intrinsics.m6216a(objectVolatile, c2131r4)) {
                            while (true) {
/* 22 */                        Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 26 */                        p80 p80Var2 = this;
/* 27 */                        th2 = th;
/* 32 */                        p80Var = p80Var2;
/* 33 */                        if (unsafe3.compareAndSwapObject(p80Var2, f15018w, c2131r4, th2)) {
/* 52 */                            return true;
                                }
/* 40 */                        if (unsafe3.getObjectVolatile(p80Var, j) != c2131r4) {
                                    break;
                                }
/* 43 */                        this = p80Var;
/* 44 */                        th = th2;
                            }
                        } else {
/* 46 */                    p80Var = this;
/* 47 */                    th2 = th;
/* 50 */                    if (objectVolatile instanceof Throwable) {
/* 52 */                        return true;
                            }
/* 71 */                    do {
/* 54 */                        unsafe = AbstractC1703b.f11726a;
/* 63 */                        if (unsafe.compareAndSwapObject(p80Var, f15018w, objectVolatile, (Object) null)) {
/* 65 */                            return false;
                                }
/* 71 */                    } while (unsafe.getObjectVolatile(p80Var, j) == objectVolatile);
                        }
/* 73 */                this = p80Var;
/* 74 */                th = th2;
                    }
                }

                /* JADX INFO: renamed from: p */
                public final Throwable m7353p(C0890er c0890er) {
                    Unsafe unsafe;
                    p80 p80Var;
                    C0890er c0890er2;
                    while (true) {
/* 3 */                 f15017v.getClass();
/* 6 */                 Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 8 */                 long j = f15018w;
/* 10 */                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
/* 14 */                C2131r4 c2131r4 = xe2.f19060c;
/* 17 */                if (objectVolatile != c2131r4) {
/* 45 */                    p80 p80Var2 = this;
/* 48 */                    if (!(objectVolatile instanceof Throwable)) {
/* 79 */                        ds0.m3201r(objectVolatile, "Inconsistent state ");
/* 16 */                        return null;
                            }
/* 68 */                    do {
/* 50 */                        unsafe = AbstractC1703b.f11726a;
/* 59 */                        if (unsafe.compareAndSwapObject(p80Var2, f15018w, objectVolatile, (Object) null)) {
/* 61 */                            return (Throwable) objectVolatile;
                                }
/* 68 */                    } while (unsafe.getObjectVolatile(p80Var2, j) == objectVolatile);
/* 73 */                    C1951n4.m6859j("Failed requirement.");
/* 16 */                    return null;
                        }
                        while (true) {
/* 19 */                    Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 23 */                    p80Var = this;
/* 24 */                    c0890er2 = c0890er;
/* 30 */                    if (unsafe3.compareAndSwapObject(p80Var, f15018w, c2131r4, c0890er2)) {
/* 16 */                        return null;
                            }
/* 37 */                    if (unsafe3.getObjectVolatile(p80Var, j) != c2131r4) {
                                break;
                            }
/* 42 */                    this = p80Var;
/* 43 */                    c0890er = c0890er2;
                        }
/* 39 */                this = p80Var;
/* 40 */                c0890er = c0890er2;
                    }
                }

                @Override // p000.c10
                public final void resumeWith(Object obj) {
/* 1 */             d10 d10Var = this.f15020e;
/* 3 */             CoroutineContext context = d10Var.getContext();
/* 7 */             Throwable thM7099a = o42.m7099a(obj);
/* 18 */            Object c1980nx = thM7099a == null ? obj : new C1980nx(false, thM7099a);
/* 21 */            s10 s10Var = this.f15019d;
/* 27 */            if (s10Var.mo6281i()) {
/* 29 */                this.f15021f = c1980nx;
/* 31 */                this.f15912c = 0;
/* 33 */                s10Var.mo1539g(context, this);
/* 36 */                return;
                    }
/* 37 */            ze0 ze0VarM3167a = do2.m3167a();
/* 50 */            if (ze0VarM3167a.f20122c >= 4294967296L) {
/* 52 */                this.f15021f = c1980nx;
/* 54 */                this.f15912c = 0;
/* 56 */                ze0VarM3167a.m10346m(this);
/* 59 */                return;
                    }
/* 61 */            ze0VarM3167a.m10347n(true);
                    try {
/* 64 */                CoroutineContext context2 = d10Var.getContext();
/* 70 */                Object objM1741c = co2.m1741c(context2, this.f15022i);
                        try {
/* 74 */                    d10Var.resumeWith(obj);
/* 77 */                    co2.m1739a(context2, objM1741c);
/* 84 */                    while (ze0VarM3167a.m10348p()) {
                            }
                        } catch (Throwable th) {
/* 93 */                    co2.m1739a(context2, objM1741c);
/* 96 */                    throw th;
                        }
                    } catch (Throwable th2) {
                        try {
/* 98 */                    m8080i(th2, null);
                        } finally {
/* 104 */                   ze0VarM3167a.m10345l(true);
                        }
                    }
                }

                public final String toString() {
/* 32 */            return "DispatchedContinuation[" + this.f15019d + ", " + k50.m5956J(this.f15020e) + ']';
                }
            }
