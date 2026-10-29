            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function1;
            import sun.misc.Unsafe;
            
            /* JADX INFO: renamed from: er */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C0890er extends r80 implements InterfaceC0853dr, a20, e63 {

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ long f7839U;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f7840f = AtomicIntegerFieldUpdater.newUpdater(C0890er.class, "_decisionAndIndex$volatile");

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f7841i = AtomicReferenceFieldUpdater.newUpdater(C0890er.class, Object.class, "_state$volatile");

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f7842v;

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ long f7843w;
                private volatile /* synthetic */ int _decisionAndIndex$volatile;
                private volatile /* synthetic */ Object _parentHandle$volatile;
                private volatile /* synthetic */ Object _state$volatile;

                /* JADX INFO: renamed from: d */
                public final c10 f7844d;

                /* JADX INFO: renamed from: e */
                public final CoroutineContext f7845e;

                static {
/* 21 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 31 */            f7839U = unsafe.objectFieldOffset(C0890er.class.getDeclaredField("_state$volatile"));
/* 39 */            f7842v = AtomicReferenceFieldUpdater.newUpdater(C0890er.class, Object.class, "_parentHandle$volatile");
/* 49 */            f7843w = unsafe.objectFieldOffset(C0890er.class.getDeclaredField("_parentHandle$volatile"));
                }

                public C0890er(int i, c10 c10Var) {
/* 1 */             super(i);
/* 4 */             this.f7844d = c10Var;
/* 10 */            this.f7845e = c10Var.getContext();
/* 15 */            this._decisionAndIndex$volatile = 536870911;
/* 19 */            this._state$volatile = C1875l2.f13076a;
                }

                /* JADX INFO: renamed from: F */
                public static Object m3547F(tn1 tn1Var, Object obj, int i, Function1 function1) {
/* 3 */             if (obj instanceof C1980nx) {
/* 5 */                 return obj;
                    }
/* 7 */             if (i != 1 && i != 2) {
/* 13 */                return obj;
                    }
/* 14 */            if (function1 != null || (tn1Var instanceof InterfaceC2560zq)) {
/* 38 */                return new C1906lx(obj, tn1Var instanceof InterfaceC2560zq ? (InterfaceC2560zq) tn1Var : null, function1, (Throwable) null, 16);
                    }
/* 20 */            return obj;
                }

                /* JADX INFO: renamed from: z */
                public static void m3548z(tn1 tn1Var, Object obj) {
/* 32 */            throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + tn1Var + ", already has " + obj).toString());
                }

                /* JADX INFO: renamed from: A */
                public String mo3549A() {
/* 1 */             return "CancellableContinuation";
                }

                /* JADX INFO: renamed from: B */
                public final void m3550B() {
                    Throwable thM7353p;
/* 1 */             c10 c10Var = this.f7844d;
/* 10 */            p80 p80Var = c10Var instanceof p80 ? (p80) c10Var : null;
/* 11 */            if (p80Var == null || (thM7353p = p80Var.m7353p(this)) == null) {
/* 26 */                return;
                    }
/* 20 */            m3565o();
/* 23 */            m3564n(thM7353p);
                }

                /* JADX INFO: renamed from: C */
                public final boolean m3551C() {
/* 3 */             f7841i.getClass();
/* 6 */             Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */             long j = f7839U;
/* 10 */            Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 16 */            if ((objectVolatile instanceof C1906lx) && ((C1906lx) objectVolatile).f13514d != null) {
/* 24 */                m3565o();
/* 27 */                return false;
                    }
/* 34 */            f7840f.set(this, 536870911);
/* 39 */            unsafe.putObjectVolatile(this, j, C1875l2.f13076a);
/* 42 */            return true;
                }

                /* JADX INFO: renamed from: D */
                public final void m3552D(Object obj, int i, Function1 function1) {
                    C0890er c0890er;
                    while (true) {
/* 3 */                 f7841i.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f7839U;
/* 10 */                Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 16 */                if (!(objectVolatile instanceof tn1)) {
/* 59 */                    C0890er c0890er2 = this;
/* 62 */                    if (objectVolatile instanceof C0964gr) {
/* 64 */                        C0964gr c0964gr = (C0964gr) objectVolatile;
/* 74 */                        if (C0964gr.f8785c.compareAndSet(c0964gr, 0, 1)) {
/* 76 */                            if (function1 != null) {
/* 80 */                                c0890er2.m3562l(function1, c0964gr.f14555a);
/* 83 */                                return;
                                    }
/* 83 */                            return;
                                }
                            }
/* 86 */                    ds0.m3201r(obj, "Already resumed, but proposed with update ");
/* 89 */                    return;
                        }
/* 21 */                Object objM3547F = m3547F((tn1) objectVolatile, obj, i, function1);
                        while (true) {
/* 25 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 29 */                    c0890er = this;
/* 34 */                    if (unsafe2.compareAndSwapObject(c0890er, f7839U, objectVolatile, objM3547F)) {
/* 40 */                        if (!c0890er.m3575y()) {
/* 42 */                            c0890er.m3565o();
                                }
/* 45 */                        c0890er.m3566p(i);
/* 48 */                        return;
                            } else if (unsafe2.getObjectVolatile(c0890er, j) != objectVolatile) {
                                break;
                            } else {
/* 57 */                        this = c0890er;
                            }
                        }
/* 55 */                this = c0890er;
                    }
                }

                /* JADX INFO: renamed from: E */
                public final void m3553E(s10 s10Var, Unit unit) {
/* 1 */             c10 c10Var = this.f7844d;
/* 11 */            p80 p80Var = c10Var instanceof p80 ? (p80) c10Var : null;
/* 24 */            m3552D(unit, (p80Var != null ? p80Var.f15019d : null) == s10Var ? 4 : this.f15912c, null);
                }

                /* JADX INFO: renamed from: G */
                public final C2131r4 m3554G(Object obj, Function1 function1) {
                    C0890er c0890er;
/* 1 */             C2131r4 c2131r4 = mn0.f13868c;
                    while (true) {
/* 5 */                 f7841i.getClass();
/* 8 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 10 */                long j = f7839U;
/* 12 */                Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 18 */                if (!(objectVolatile instanceof tn1)) {
/* 60 */                    return null;
                        }
/* 25 */                Object objM3547F = m3547F((tn1) objectVolatile, obj, this.f15912c, function1);
                        while (true) {
/* 29 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 33 */                    c0890er = this;
/* 38 */                    if (unsafe2.compareAndSwapObject(c0890er, f7839U, objectVolatile, objM3547F)) {
/* 44 */                        if (!c0890er.m3575y()) {
/* 46 */                            c0890er.m3565o();
                                }
/* 49 */                        return c2131r4;
                            }
/* 54 */                    if (unsafe2.getObjectVolatile(c0890er, j) != objectVolatile) {
                                break;
                            }
/* 58 */                    this = c0890er;
                        }
/* 56 */                this = c0890er;
                    }
                }

                /* JADX INFO: renamed from: H */
                public final C2131r4 m3555H(Throwable th) {
/* 8 */             return m3554G(new C1980nx(false, th), null);
                }

                @Override // p000.e63
                /* JADX INFO: renamed from: a */
                public final void mo3335a(s82 s82Var, int i) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
                    int i2;
/* 23 */            do {
/* 1 */                 atomicIntegerFieldUpdater = f7840f;
/* 3 */                 i2 = atomicIntegerFieldUpdater.get(this);
/* 12 */                if ((i2 & 536870911) != 536870911) {
/* 31 */                    f42.m3656l("invokeOnCancellation should be called at most once");
/* 34 */                    return;
                        }
/* 23 */            } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
/* 25 */            m3574x(s82Var);
                }

                @Override // p000.InterfaceC0853dr
                /* JADX INFO: renamed from: b */
                public final C2131r4 mo3178b(Object obj, Function1 function1) {
/* 1 */             return m3554G(obj, function1);
                }

                @Override // p000.r80
                /* JADX INFO: renamed from: c */
                public final void mo3556c(Object obj, CancellationException cancellationException) {
                    CancellationException cancellationException2;
                    C0890er c0890er;
                    while (true) {
/* 3 */                 f7841i.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f7839U;
/* 10 */                Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 16 */                if (objectVolatile instanceof tn1) {
/* 128 */                   f42.m3656l("Not completed");
/* 131 */                   return;
                        }
/* 20 */                if (objectVolatile instanceof C1980nx) {
/* 114 */                   return;
                        }
/* 26 */                if (objectVolatile instanceof C1906lx) {
/* 29 */                    C1906lx c1906lx = (C1906lx) objectVolatile;
/* 33 */                    if (c1906lx.f13515e != null) {
/* 82 */                        f42.m3656l("Must be called at most once");
/* 85 */                        return;
                            }
/* 38 */                    C1906lx c1906lxM6571a = C1906lx.m6571a(c1906lx, null, cancellationException, 15);
                            while (true) {
/* 42 */                        Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 46 */                        C0890er c0890er2 = this;
/* 52 */                        if (unsafe2.compareAndSwapObject(c0890er2, f7839U, objectVolatile, c1906lxM6571a)) {
/* 54 */                            InterfaceC2560zq interfaceC2560zq = c1906lx.f13512b;
/* 56 */                            if (interfaceC2560zq != null) {
/* 58 */                                c0890er2.m3561k(interfaceC2560zq, cancellationException);
                                    }
/* 61 */                            Function1 function1 = c1906lx.f13513c;
/* 63 */                            if (function1 != null) {
/* 65 */                                c0890er2.m3562l(function1, cancellationException);
/* 68 */                                return;
                                    }
/* 114 */                           return;
                                }
/* 73 */                        if (unsafe2.getObjectVolatile(c0890er2, j) != objectVolatile) {
/* 75 */                            cancellationException2 = cancellationException;
/* 76 */                            c0890er = c0890er2;
                                    break;
                                }
/* 78 */                        this = c0890er2;
                            }
                        } else {
/* 86 */                    C0890er c0890er3 = this;
/* 94 */                    CancellationException cancellationException3 = cancellationException;
/* 95 */                    C1906lx c1906lx2 = new C1906lx(objectVolatile, (InterfaceC2560zq) null, (Function1) null, cancellationException3, 14);
/* 98 */                    cancellationException2 = cancellationException3;
                            while (true) {
/* 100 */                       C1906lx c1906lx3 = c1906lx2;
/* 101 */                       Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 105 */                       c0890er = c0890er3;
/* 106 */                       boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(c0890er, f7839U, objectVolatile, c1906lx3);
/* 111 */                       c1906lx2 = c1906lx3;
/* 112 */                       if (zCompareAndSwapObject) {
/* 114 */                           return;
                                }
/* 119 */                       if (unsafe3.getObjectVolatile(c0890er, j) != objectVolatile) {
                                    break;
                                } else {
/* 124 */                           c0890er3 = c0890er;
                                }
                            }
                        }
/* 121 */               cancellationException = cancellationException2;
/* 122 */               this = c0890er;
                    }
                }

                @Override // p000.InterfaceC0853dr
                /* JADX INFO: renamed from: d */
                public final void mo3179d(Object obj, Function1 function1) {
/* 3 */             m3552D(obj, this.f15912c, function1);
                }

                @Override // p000.r80
                /* JADX INFO: renamed from: e */
                public final c10 mo3557e() {
/* 1 */             return this.f7844d;
                }

                @Override // p000.InterfaceC0853dr
                /* JADX INFO: renamed from: f */
                public final void mo3180f(Object obj) {
/* 3 */             m3566p(this.f15912c);
                }

                @Override // p000.r80
                /* JADX INFO: renamed from: g */
                public final Throwable mo3558g(Object obj) {
/* 1 */             Throwable thMo3558g = super.mo3558g(obj);
/* 5 */             if (thMo3558g != null) {
/* 7 */                 return thMo3558g;
                    }
/* 8 */             return null;
                }

                @Override // p000.a20
                public final a20 getCallerFrame() {
/* 1 */             c10 c10Var = this.f7844d;
/* 5 */             if (c10Var instanceof a20) {
/* 7 */                 return (a20) c10Var;
                    }
/* 10 */            return null;
                }

                @Override // p000.c10
                public final CoroutineContext getContext() {
/* 1 */             return this.f7845e;
                }

                @Override // p000.r80
                /* JADX INFO: renamed from: h */
                public final Object mo3559h(Object obj) {
                    return obj instanceof C1906lx ? ((C1906lx) obj).f13511a : obj;
                }

                @Override // p000.r80
                /* JADX INFO: renamed from: j */
                public final Object mo3560j() {
/* 1 */             return m3570t();
                }

                /* JADX INFO: renamed from: k */
                public final void m3561k(InterfaceC2560zq interfaceC2560zq, Throwable th) {
                    try {
/* 1 */                 interfaceC2560zq.mo1354a(th);
                    } catch (Throwable th2) {
/* 27 */                b40.m1231o(new C2086px("Exception in invokeOnCancellation handler for " + this, th2), this.f7845e);
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m3562l(Function1 function1, Throwable th) {
                    try {
/* 1 */                 function1.invoke(th);
                    } catch (Throwable th2) {
/* 27 */                b40.m1231o(new C2086px("Exception in resume onCancellation handler for " + this, th2), this.f7845e);
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m3563m(s82 s82Var, Throwable th) {
/* 1 */             CoroutineContext coroutineContext = this.f7845e;
/* 12 */            int i = f7840f.get(this) & 536870911;
/* 13 */            if (i == 536870911) {
/* 45 */                f42.m3656l("The index for Segment.onCancellation(..) is broken");
/* 48 */                return;
                    }
                    try {
/* 15 */                s82Var.mo3829m(i, coroutineContext);
                    } catch (Throwable th2) {
/* 39 */                b40.m1231o(new C2086px("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
                    }
                }

                /* JADX INFO: renamed from: n */
                public final boolean m3564n(Throwable th) {
                    C0890er c0890er;
                    while (true) {
/* 3 */                 f7841i.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f7839U;
/* 10 */                Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 17 */                if (!(objectVolatile instanceof tn1)) {
/* 16 */                    return false;
                        }
/* 32 */                C0964gr c0964gr = new C0964gr(this, th, (objectVolatile instanceof InterfaceC2560zq) || (objectVolatile instanceof s82));
                        while (true) {
/* 35 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 39 */                    c0890er = this;
/* 44 */                    if (unsafe2.compareAndSwapObject(c0890er, f7839U, objectVolatile, c0964gr)) {
/* 47 */                        tn1 tn1Var = (tn1) objectVolatile;
/* 51 */                        if (tn1Var instanceof InterfaceC2560zq) {
/* 55 */                            c0890er.m3561k((InterfaceC2560zq) objectVolatile, th);
                                } else if (tn1Var instanceof s82) {
/* 65 */                            c0890er.m3563m((s82) objectVolatile, th);
                                }
/* 72 */                        if (!c0890er.m3575y()) {
/* 74 */                            c0890er.m3565o();
                                }
/* 79 */                        c0890er.m3566p(c0890er.f15912c);
/* 24 */                        return true;
                            }
/* 87 */                    if (unsafe2.getObjectVolatile(c0890er, j) != objectVolatile) {
                                break;
                            }
/* 91 */                    this = c0890er;
                        }
/* 89 */                this = c0890er;
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m3565o() {
/* 1 */             e90 e90VarM3568r = m3568r();
/* 5 */             if (e90VarM3568r == null) {
/* 7 */                 return;
                    }
/* 8 */             e90VarM3568r.dispose();
/* 13 */            f7842v.getClass();
/* 22 */            AbstractC1703b.f11726a.putObjectVolatile(this, f7843w, rn1.f16198a);
                }

                /* JADX INFO: renamed from: p */
                public final void m3566p(int i) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
                    int i2;
/* 135 */           do {
/* 1 */                 atomicIntegerFieldUpdater = f7840f;
/* 3 */                 i2 = atomicIntegerFieldUpdater.get(this);
/* 7 */                 int i3 = i2 >> 29;
/* 9 */                 if (i3 != 0) {
/* 12 */                    if (i3 != 1) {
/* 120 */                       f42.m3656l("Already resumed");
/* 123 */                       return;
                            }
/* 20 */                    boolean z = i == 4;
/* 21 */                    c10 c10Var = this.f7844d;
/* 23 */                    if (!z && (c10Var instanceof p80)) {
/* 37 */                        boolean z2 = i == 1 || i == 2;
/* 38 */                        int i4 = this.f15912c;
/* 45 */                        if (z2 == (i4 == 1 || i4 == 2)) {
/* 48 */                            p80 p80Var = (p80) c10Var;
/* 50 */                            s10 s10Var = p80Var.f15019d;
/* 54 */                            CoroutineContext context = p80Var.f15020e.getContext();
/* 62 */                            if (s10Var.mo6281i()) {
/* 64 */                                s10Var.mo1539g(context, this);
/* 67 */                                return;
                                    }
/* 68 */                            ze0 ze0VarM3167a = do2.m3167a();
/* 81 */                            if (ze0VarM3167a.f20122c >= 4294967296L) {
/* 83 */                                ze0VarM3167a.m10346m(this);
/* 86 */                                return;
                                    }
/* 87 */                            ze0VarM3167a.m10347n(true);
                                    try {
/* 90 */                                j13.m5657s(this, c10Var, true);
/* 97 */                                do {
/* 97 */                                } while (ze0VarM3167a.m10348p());
                                    } catch (Throwable th) {
                                        try {
/* 105 */                                   m8080i(th, null);
                                        } finally {
/* 110 */                                   ze0VarM3167a.m10345l(true);
                                        }
                                    }
/* 137 */                           return;
                                }
                            }
/* 114 */                   j13.m5657s(this, c10Var, z);
/* 117 */                   return;
                        }
/* 135 */           } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
                }

                /* JADX INFO: renamed from: q */
                public Throwable mo3567q(z01 z01Var) {
/* 1 */             return z01Var.getCancellationException();
                }

                /* JADX INFO: renamed from: r */
                public final e90 m3568r() {
/* 3 */             f7842v.getClass();
/* 14 */            return (e90) AbstractC1703b.f11726a.getObjectVolatile(this, f7843w);
                }

                @Override // p000.c10
                public final void resumeWith(Object obj) {
/* 1 */             Throwable thM7099a = o42.m7099a(obj);
/* 5 */             if (thM7099a != null) {
/* 11 */                obj = new C1980nx(false, thM7099a);
                    }
/* 17 */            m3552D(obj, this.f15912c, null);
                }

                /* JADX INFO: renamed from: s */
                public final Object m3569s() {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
                    int i;
                    h01 h01Var;
/* 1 */             boolean zM3575y = m3575y();
/* 93 */            do {
/* 5 */                 atomicIntegerFieldUpdater = f7840f;
/* 7 */                 i = atomicIntegerFieldUpdater.get(this);
/* 11 */                int i2 = i >> 29;
/* 13 */                if (i2 != 0) {
/* 16 */                    if (i2 != 2) {
/* 77 */                        f42.m3656l("Already suspended");
/* 80 */                        return null;
                            }
/* 18 */                    if (zM3575y) {
/* 20 */                        m3550B();
                            }
/* 23 */                    Object objM3570t = m3570t();
/* 29 */                    if (objM3570t instanceof C1980nx) {
/* 74 */                        throw ((C1980nx) objM3570t).f14555a;
                            }
/* 31 */                    int i3 = this.f15912c;
/* 34 */                    if ((i3 != 1 && i3 != 2) || (h01Var = (h01) this.f7845e.get(xt0.f19368w)) == null || h01Var.isActive()) {
/* 65 */                        return mo3559h(objM3570t);
                            }
/* 57 */                    CancellationException cancellationException = h01Var.getCancellationException();
/* 61 */                    mo3556c(objM3570t, cancellationException);
/* 64 */                    throw cancellationException;
                        }
/* 93 */            } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
/* 99 */            if (m3568r() == null) {
/* 101 */               m3572v();
                    }
/* 104 */           if (zM3575y) {
/* 106 */               m3550B();
                    }
/* 109 */           return z10.f19902a;
                }

                /* JADX INFO: renamed from: t */
                public final Object m3570t() {
/* 3 */             f7841i.getClass();
/* 10 */            return AbstractC1703b.f11726a.getObjectVolatile(this, f7839U);
                }

                public final String toString() {
                    String str;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(mo3549A());
/* 15 */            sb.append('(');
/* 24 */            sb.append(k50.m5956J(this.f7844d));
/* 29 */            sb.append("){");
/* 32 */            Object objM3570t = m3570t();
/* 38 */            if (objM3570t instanceof tn1) {
/* 40 */                str = "Active";
                    } else {
/* 50 */                str = objM3570t instanceof C0964gr ? "Cancelled" : "Completed";
                    }
/* 52 */            sb.append(str);
/* 57 */            sb.append("}@");
/* 64 */            sb.append(k50.m5983t(this));
/* 67 */            return sb.toString();
                }

                /* JADX INFO: renamed from: u */
                public final void m3571u() {
/* 1 */             e90 e90VarM3572v = m3572v();
/* 5 */             if (e90VarM3572v == null || (m3570t() instanceof tn1)) {
/* 33 */                return;
                    }
/* 16 */            e90VarM3572v.dispose();
/* 21 */            f7842v.getClass();
/* 30 */            AbstractC1703b.f11726a.putObjectVolatile(this, f7843w, rn1.f16198a);
                }

                /* JADX INFO: renamed from: v */
                public final e90 m3572v() {
/* 9 */             h01 h01Var = (h01) this.f7845e.get(xt0.f19368w);
/* 11 */            if (h01Var == null) {
/* 13 */                return null;
                    }
/* 22 */            e90 e90VarM4343n0 = hu0.m4343n0(h01Var, true, new C2510yt(this), 2);
                    while (true) {
/* 28 */                f7842v.getClass();
/* 31 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 33 */                long j = f7843w;
/* 36 */                C0890er c0890er = this;
/* 41 */                if (unsafe.compareAndSwapObject(c0890er, j, (Object) null, e90VarM4343n0) || unsafe.getObjectVolatile(c0890er, j) != null) {
                            break;
                        }
/* 51 */                this = c0890er;
                    }
/* 50 */            return e90VarM4343n0;
                }

                /* JADX INFO: renamed from: w */
                public final void m3573w(Function1 function1) {
/* 7 */             m3574x(new C2507yq(function1, 1));
                }

                /* JADX INFO: renamed from: x */
                public final void m3574x(tn1 tn1Var) {
                    C0890er c0890er;
                    Unsafe unsafe;
                    C0890er c0890er2;
                    while (true) {
/* 3 */                 f7841i.getClass();
/* 6 */                 Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 8 */                 long j = f7839U;
/* 10 */                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
/* 16 */                if (objectVolatile instanceof C1875l2) {
                            while (true) {
/* 18 */                        Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 22 */                        c0890er = this;
/* 28 */                        if (unsafe3.compareAndSwapObject(c0890er, f7839U, objectVolatile, tn1Var)) {
/* 186 */                           return;
                                }
/* 36 */                        if (unsafe3.getObjectVolatile(c0890er, j) != objectVolatile) {
                                    break;
                                } else {
/* 40 */                            this = c0890er;
                                }
                            }
                        } else {
/* 42 */                    c0890er = this;
/* 53 */                    if (objectVolatile instanceof InterfaceC2560zq ? true : objectVolatile instanceof s82) {
/* 198 */                       m3548z(tn1Var, objectVolatile);
/* 201 */                       throw null;
                            }
/* 57 */                    if (objectVolatile instanceof C1980nx) {
/* 60 */                        C1980nx c1980nx = (C1980nx) objectVolatile;
/* 69 */                        if (!C1980nx.f14554b.compareAndSet(c1980nx, 0, 1)) {
/* 93 */                            m3548z(tn1Var, objectVolatile);
/* 96 */                            throw null;
                                }
/* 73 */                        if (objectVolatile instanceof C0964gr) {
/* 75 */                            Throwable th = c1980nx.f14555a;
/* 79 */                            if (tn1Var instanceof InterfaceC2560zq) {
/* 83 */                                c0890er.m3561k((InterfaceC2560zq) tn1Var, th);
/* 86 */                                return;
                                    } else {
/* 89 */                                c0890er.m3563m((s82) tn1Var, th);
/* 92 */                                return;
                                    }
                                }
/* 186 */                       return;
                            }
/* 99 */                    if (objectVolatile instanceof C1906lx) {
/* 102 */                       C1906lx c1906lx = (C1906lx) objectVolatile;
/* 106 */                       if (c1906lx.f13512b != null) {
/* 150 */                           m3548z(tn1Var, objectVolatile);
/* 153 */                           throw null;
                                }
/* 110 */                       if (tn1Var instanceof s82) {
/* 186 */                           return;
                                }
/* 114 */                       InterfaceC2560zq interfaceC2560zq = (InterfaceC2560zq) tn1Var;
/* 116 */                       Throwable th2 = c1906lx.f13515e;
/* 118 */                       if (th2 != null) {
/* 120 */                           c0890er.m3561k(interfaceC2560zq, th2);
/* 123 */                           return;
                                }
/* 126 */                       C1906lx c1906lxM6571a = C1906lx.m6571a(c1906lx, interfaceC2560zq, null, 29);
/* 147 */                       do {
/* 130 */                           unsafe = AbstractC1703b.f11726a;
/* 138 */                           c0890er2 = c0890er;
/* 139 */                           if (unsafe.compareAndSwapObject(c0890er, f7839U, objectVolatile, c1906lxM6571a)) {
/* 186 */                               return;
                                    } else {
/* 146 */                               c0890er = c0890er2;
                                    }
/* 147 */                       } while (unsafe.getObjectVolatile(c0890er2, j) == objectVolatile);
                            } else {
/* 154 */                       C0890er c0890er3 = c0890er;
/* 157 */                       if (tn1Var instanceof s82) {
/* 186 */                           return;
                                }
/* 170 */                       C1906lx c1906lx2 = new C1906lx(objectVolatile, (InterfaceC2560zq) tn1Var, (Function1) null, (Throwable) null, 28);
                                while (true) {
/* 175 */                           Unsafe unsafe4 = AbstractC1703b.f11726a;
/* 179 */                           c0890er = c0890er3;
/* 184 */                           if (unsafe4.compareAndSwapObject(c0890er, f7839U, objectVolatile, c1906lx2)) {
/* 186 */                               return;
                                    }
/* 191 */                           if (unsafe4.getObjectVolatile(c0890er, j) != objectVolatile) {
                                        break;
                                    } else {
/* 196 */                               c0890er3 = c0890er;
                                    }
                                }
                            }
                        }
/* 193 */               this = c0890er;
                    }
                }

                /* JADX INFO: renamed from: y */
                public final boolean m3575y() {
/* 4 */             if (this.f15912c != 2) {
/* 21 */                return false;
                    }
/* 6 */             c10 c10Var = this.f7844d;
/* 8 */             c10Var.getClass();
                    return ((p80) c10Var).m7351n();
                }
            }
