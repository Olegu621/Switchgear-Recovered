            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.IdentityHashMap;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.Unit;
            import kotlin.coroutines.AbstractC1844e;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1845f;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.sequences.Sequence;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 11 */    public class z01 implements h01, InterfaceC0820cu, lr1 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f19893a = AtomicReferenceFieldUpdater.newUpdater(z01.class, Object.class, "_state$volatile");

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f19894b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ long f19895c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ long f19896d;
                private volatile /* synthetic */ Object _parentHandle$volatile;
                private volatile /* synthetic */ Object _state$volatile;

                static {
/* 13 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 23 */            f19896d = unsafe.objectFieldOffset(z01.class.getDeclaredField("_state$volatile"));
/* 31 */            f19894b = AtomicReferenceFieldUpdater.newUpdater(z01.class, Object.class, "_parentHandle$volatile");
/* 41 */            f19895c = unsafe.objectFieldOffset(z01.class.getDeclaredField("_parentHandle$volatile"));
                }

                public z01(boolean z) {
/* 11 */            this._state$volatile = z ? j13.f12002l : j13.f12001k;
                }

                /* JADX INFO: renamed from: G */
                public static C0156au m10233G(s91 s91Var) {
/* 5 */             while (s91Var.mo7955k()) {
/* 7 */                 s91Var = s91Var.m8456j();
                    }
                    while (true) {
/* 12 */                s91Var = s91Var.m8455i();
/* 20 */                if (!s91Var.mo7955k()) {
/* 24 */                    if (s91Var instanceof C0156au) {
/* 26 */                        return (C0156au) s91Var;
                            }
/* 31 */                    if (s91Var instanceof qn1) {
/* 33 */                        return null;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: P */
                public static String m10234P(Object obj) {
/* 3 */             if (!(obj instanceof r01)) {
/* 27 */                if (obj instanceof ix0) {
                            return ((ix0) obj).isActive() ? "Active" : "New";
                        }
                        return obj instanceof C1980nx ? "Cancelled" : "Completed";
                    }
/* 5 */             r01 r01Var = (r01) obj;
/* 11 */            if (r01Var.m8040e()) {
/* 13 */                return "Cancelling";
                    }
                    return r01Var.m8041f() ? "Completing" : "Active";
                }

                /* JADX INFO: renamed from: Q */
                public static CancellationException m10235Q(z01 z01Var, Throwable th) {
/* 1 */             z01Var.getClass();
/* 12 */            CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
                    return cancellationException == null ? new i01(z01Var.mo4407m(), th, z01Var) : cancellationException;
                }

                /* JADX INFO: renamed from: A */
                public final void m10236A(h01 h01Var) {
/* 1 */             rn1 rn1Var = rn1.f16198a;
/* 3 */             if (h01Var == null) {
/* 5 */                 m10245N(rn1Var);
/* 8 */                 return;
                    }
/* 9 */             h01Var.start();
/* 12 */            InterfaceC2563zt interfaceC2563ztAttachChild = h01Var.attachChild(this);
/* 16 */            m10245N(interfaceC2563ztAttachChild);
/* 23 */            if (isCompleted()) {
/* 25 */                interfaceC2563ztAttachChild.dispose();
/* 28 */                m10245N(rn1Var);
                    }
                }

                /* JADX INFO: renamed from: B */
                public final e90 m10237B(boolean z, boolean z2, hz0 hz0Var) {
                    o01 uz0Var;
                    z01 z01Var;
                    Throwable thM8039d;
                    int iM8459n;
                    boolean z3;
/* 2 */             if (z) {
/* 12 */                uz0Var = hz0Var instanceof j01 ? (j01) hz0Var : null;
/* 13 */                if (uz0Var == null) {
/* 17 */                    uz0Var = new tz0(hz0Var);
                        }
                    } else {
/* 30 */                uz0Var = hz0Var instanceof o01 ? (o01) hz0Var : null;
/* 31 */                if (uz0Var == null) {
/* 36 */                    uz0Var = new uz0(hz0Var);
                        }
                    }
/* 20 */            o01 o01Var = uz0Var;
/* 40 */            o01Var.f14579i = this;
                    loop0: while (true) {
/* 42 */                Object objM10260x = this.m10260x();
/* 48 */                if (objM10260x instanceof kd0) {
/* 51 */                    kd0 kd0Var = (kd0) objM10260x;
/* 55 */                    if (kd0Var.f12696a) {
/* 57 */                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19893a;
                                while (true) {
/* 59 */                            atomicReferenceFieldUpdater.getClass();
/* 62 */                            Unsafe unsafe = AbstractC1703b.f11726a;
/* 64 */                            long j = f19896d;
/* 66 */                            z01Var = this;
/* 71 */                            if (unsafe.compareAndSwapObject(z01Var, j, objM10260x, o01Var)) {
                                        break loop0;
                                    }
/* 79 */                            if (unsafe.getObjectVolatile(z01Var, j) != objM10260x) {
                                        break;
                                    }
/* 83 */                            this = z01Var;
                                }
                            } else {
/* 85 */                        z01Var = this;
/* 86 */                        z01Var.m10242K(kd0Var);
                            }
/* 213 */                   this = z01Var;
                        } else {
/* 91 */                    z01Var = this;
/* 94 */                    if (!(objM10260x instanceof ix0)) {
/* 217 */                       if (z2) {
/* 226 */                           C1980nx c1980nx = objM10260x instanceof C1980nx ? (C1980nx) objM10260x : null;
/* 231 */                           hz0Var.mo277a(c1980nx != null ? c1980nx.f14555a : null);
                                }
/* 234 */                       return rn1.f16198a;
                            }
/* 97 */                    ix0 ix0Var = (ix0) objM10260x;
/* 99 */                    qn1 qn1VarMo4393c = ix0Var.mo4393c();
/* 103 */                   if (qn1VarMo4393c != null) {
/* 112 */                       e90 e90Var = rn1.f16198a;
/* 116 */                       if (z && (objM10260x instanceof r01)) {
                                    synchronized (objM10260x) {
                                        try {
/* 126 */                                   thM8039d = ((r01) objM10260x).m8039d();
/* 130 */                                   if (thM8039d == null || ((hz0Var instanceof C0156au) && !((r01) objM10260x).m8041f())) {
/* 154 */                                       u01 u01Var = new u01(o01Var, z01Var, (ix0) objM10260x);
                                                while (true) {
/* 161 */                                           int iM8459n2 = qn1VarMo4393c.m8456j().m8459n(o01Var, qn1VarMo4393c, u01Var);
/* 165 */                                           if (iM8459n2 == 1) {
/* 172 */                                               z3 = true;
                                                        break;
                                                    }
/* 167 */                                           if (iM8459n2 == 2) {
/* 170 */                                               z3 = false;
                                                        break;
                                                    }
                                                }
/* 173 */                                       if (z3) {
/* 177 */                                           if (thM8039d == null) {
/* 180 */                                               return o01Var;
                                                    }
/* 181 */                                           e90Var = o01Var;
                                                }
                                            }
                                        } catch (Throwable th) {
/* 185 */                                   throw th;
                                        }
                                    }
                                } else {
/* 186 */                           thM8039d = null;
                                }
/* 187 */                       if (thM8039d == null) {
/* 197 */                           u01 u01Var2 = new u01(o01Var, z01Var, ix0Var);
/* 210 */                           do {
/* 204 */                               iM8459n = qn1VarMo4393c.m8456j().m8459n(o01Var, qn1VarMo4393c, u01Var2);
/* 208 */                               if (iM8459n == 1) {
                                            break loop0;
                                        }
/* 210 */                           } while (iM8459n != 2);
                                } else {
/* 189 */                           if (z2) {
/* 191 */                               hz0Var.mo277a(thM8039d);
                                    }
/* 194 */                           return e90Var;
                                }
                            } else {
/* 107 */                       z01Var.m10243L((o01) objM10260x);
                            }
/* 213 */                   this = z01Var;
                        }
                    }
/* 216 */           return o01Var;
                }

                /* JADX INFO: renamed from: C */
                public boolean mo7345C() {
/* 1 */             return this instanceof C2333wj;
                }

                /* JADX INFO: renamed from: D */
                public final boolean m10238D(Object obj) {
                    Object objM10249T;
/* 23 */            do {
/* 5 */                 objM10249T = m10249T(m10260x(), obj);
/* 11 */                if (objM10249T == j13.f11996f) {
/* 13 */                    return false;
                        }
/* 18 */                if (objM10249T == j13.f11997g) {
/* 17 */                    return true;
                        }
/* 23 */            } while (objM10249T == j13.f11998h);
/* 25 */            mo7346g(objM10249T);
/* 17 */            return true;
                }

                /* JADX INFO: renamed from: E */
                public final Object m10239E(Object obj) {
                    Object objM10249T;
/* 15 */            do {
/* 5 */                 objM10249T = m10249T(m10260x(), obj);
/* 11 */                if (objM10249T == j13.f11996f) {
/* 38 */                    String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
/* 50 */                    C1980nx c1980nx = obj instanceof C1980nx ? (C1980nx) obj : null;
/* 58 */                    throw new IllegalStateException(str, c1980nx != null ? c1980nx.f14555a : null);
                        }
/* 15 */            } while (objM10249T == j13.f11998h);
/* 17 */            return objM10249T;
                }

                /* JADX INFO: renamed from: F */
                public String mo6717F() {
/* 5 */             return getClass().getSimpleName();
                }

                /* JADX INFO: renamed from: H */
                public final void m10240H(qn1 qn1Var, Throwable th) {
/* 1 */             Object objM8454h = qn1Var.m8454h();
/* 5 */             objM8454h.getClass();
/* 10 */            C2086px c2086px = null;
/* 15 */            for (s91 s91VarM8455i = (s91) objM8454h; !s91VarM8455i.equals(qn1Var); s91VarM8455i = s91VarM8455i.m8455i()) {
/* 19 */                if (s91VarM8455i instanceof j01) {
/* 22 */                    o01 o01Var = (o01) s91VarM8455i;
                            try {
/* 24 */                        o01Var.mo277a(th);
                            } catch (Throwable th2) {
/* 29 */                        if (c2086px != null) {
/* 31 */                            jf0.m5798a(c2086px, th2);
                                } else {
/* 59 */                            c2086px = new C2086px("Exception in completion handler " + o01Var + " for " + this, th2);
                                }
                            }
                        }
                    }
/* 67 */            if (c2086px != null) {
/* 69 */                mo4408z(c2086px);
                    }
/* 72 */            m10252l(th);
                }

                /* JADX INFO: renamed from: I */
                public void mo4402I(Object obj) {
                }

                /* JADX INFO: renamed from: J */
                public void m10241J() {
                }

                /* JADX INFO: renamed from: K */
                public final void m10242K(kd0 kd0Var) {
/* 3 */             qn1 qn1Var = new qn1();
/* 14 */            Object hx0Var = kd0Var.f12696a ? qn1Var : new hx0(qn1Var);
                    while (true) {
/* 20 */                f19893a.getClass();
/* 23 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 25 */                long j = f19896d;
/* 27 */                z01 z01Var = this;
/* 28 */                kd0 kd0Var2 = kd0Var;
/* 33 */                if (unsafe.compareAndSwapObject(z01Var, j, kd0Var2, hx0Var) || unsafe.getObjectVolatile(z01Var, j) != kd0Var2) {
/* 42 */                    return;
                        }
/* 43 */                this = z01Var;
/* 44 */                kd0Var = kd0Var2;
                    }
                }

                /* JADX INFO: renamed from: L */
                public final void m10243L(o01 o01Var) {
/* 6 */             o01Var.m8451d(new qn1());
/* 9 */             s91 s91VarM8455i = o01Var.m8455i();
                    while (true) {
/* 15 */                f19893a.getClass();
/* 18 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 20 */                long j = f19896d;
/* 22 */                z01 z01Var = this;
/* 23 */                o01 o01Var2 = o01Var;
/* 28 */                if (unsafe.compareAndSwapObject(z01Var, j, o01Var2, s91VarM8455i) || unsafe.getObjectVolatile(z01Var, j) != o01Var2) {
/* 37 */                    return;
                        }
/* 38 */                this = z01Var;
/* 39 */                o01Var = o01Var2;
                    }
                }

                /* JADX INFO: renamed from: M */
                public final void m10244M(o01 o01Var) {
                    z01 z01Var;
                    while (true) {
/* 1 */                 Object objM10260x = this.m10260x();
/* 7 */                 if (!(objM10260x instanceof o01)) {
/* 43 */                    if (!(objM10260x instanceof ix0) || ((ix0) objM10260x).mo4393c() == null) {
/* 56 */                        return;
                            }
/* 53 */                    o01Var.m8457l();
/* 56 */                    return;
                        }
/* 9 */                 if (objM10260x != o01Var) {
/* 56 */                    return;
                        }
/* 12 */                kd0 kd0Var = j13.f12002l;
                        while (true) {
/* 16 */                    f19893a.getClass();
/* 19 */                    Unsafe unsafe = AbstractC1703b.f11726a;
/* 21 */                    long j = f19896d;
/* 23 */                    z01Var = this;
/* 28 */                    if (unsafe.compareAndSwapObject(z01Var, j, objM10260x, kd0Var)) {
/* 56 */                        return;
                            }
/* 35 */                    if (unsafe.getObjectVolatile(z01Var, j) != objM10260x) {
                                break;
                            } else {
/* 39 */                        this = z01Var;
                            }
                        }
/* 37 */                this = z01Var;
                    }
                }

                /* JADX INFO: renamed from: N */
                public final void m10245N(InterfaceC2563zt interfaceC2563zt) {
/* 3 */             f19894b.getClass();
/* 10 */            AbstractC1703b.f11726a.putObjectVolatile(this, f19895c, interfaceC2563zt);
                }

                /* JADX INFO: renamed from: O */
                public final int m10246O(Object obj) {
                    Unsafe unsafe;
                    Unsafe unsafe2;
/* 1 */             boolean z = obj instanceof kd0;
/* 3 */             long j = f19896d;
/* 6 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19893a;
/* 8 */             if (z) {
/* 15 */                if (((kd0) obj).f12696a) {
/* 76 */                    return 0;
                        }
/* 18 */                kd0 kd0Var = j13.f12002l;
/* 40 */                do {
/* 20 */                    atomicReferenceFieldUpdater.getClass();
/* 23 */                    unsafe2 = AbstractC1703b.f11726a;
/* 33 */                    if (unsafe2.compareAndSwapObject(this, f19896d, obj, kd0Var)) {
/* 5 */                         return 1;
                            }
/* 40 */                } while (unsafe2.getObjectVolatile(this, j) == obj);
/* 74 */                return -1;
                    }
/* 45 */            if (!(obj instanceof hx0)) {
/* 76 */                return 0;
                    }
/* 50 */            qn1 qn1Var = ((hx0) obj).f9355a;
/* 72 */            do {
/* 52 */                atomicReferenceFieldUpdater.getClass();
/* 55 */                unsafe = AbstractC1703b.f11726a;
/* 65 */                if (unsafe.compareAndSwapObject(this, f19896d, obj, qn1Var)) {
/* 5 */                     return 1;
                        }
/* 72 */            } while (unsafe.getObjectVolatile(this, j) == obj);
/* 74 */            return -1;
                }

                /* JADX INFO: renamed from: R */
                public final boolean m10247R(ix0 ix0Var, Object obj) {
/* 15 */            Object jx0Var = obj instanceof ix0 ? new jx0((ix0) obj) : obj;
                    while (true) {
/* 18 */                f19893a.getClass();
/* 21 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 23 */                long j = f19896d;
/* 25 */                z01 z01Var = this;
/* 26 */                ix0 ix0Var2 = ix0Var;
/* 31 */                if (unsafe.compareAndSwapObject(z01Var, j, ix0Var2, jx0Var)) {
/* 33 */                    z01Var.mo4402I(obj);
/* 36 */                    z01Var.m10253o(ix0Var2, obj);
/* 39 */                    return true;
                        }
/* 45 */                if (unsafe.getObjectVolatile(z01Var, j) != ix0Var2) {
/* 47 */                    return false;
                        }
/* 49 */                this = z01Var;
/* 50 */                ix0Var = ix0Var2;
                    }
                }

                /* JADX INFO: renamed from: S */
                public final boolean m10248S(ix0 ix0Var, Throwable th) {
/* 1 */             qn1 qn1VarM10258v = m10258v(ix0Var);
/* 5 */             if (qn1VarM10258v == null) {
/* 41 */                return false;
                    }
/* 10 */            r01 r01Var = new r01(qn1VarM10258v, th);
                    while (true) {
/* 15 */                f19893a.getClass();
/* 18 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 20 */                long j = f19896d;
/* 22 */                z01 z01Var = this;
/* 23 */                ix0 ix0Var2 = ix0Var;
/* 28 */                if (unsafe.compareAndSwapObject(z01Var, j, ix0Var2, r01Var)) {
/* 30 */                    z01Var.m10240H(qn1VarM10258v, th);
/* 33 */                    return true;
                        }
/* 39 */                if (unsafe.getObjectVolatile(z01Var, j) != ix0Var2) {
/* 41 */                    return false;
                        }
/* 43 */                this = z01Var;
/* 44 */                ix0Var = ix0Var2;
                    }
                }

                /* JADX INFO: renamed from: T */
                public final Object m10249T(Object obj, Object obj2) {
/* 3 */             if (!(obj instanceof ix0)) {
/* 5 */                 return j13.f11996f;
                    }
/* 10 */            if (((obj instanceof kd0) || (obj instanceof o01)) && !(obj instanceof C0156au) && !(obj2 instanceof C1980nx)) {
                        return m10247R((ix0) obj, obj2) ? obj2 : j13.f11998h;
                    }
/* 36 */            ix0 ix0Var = (ix0) obj;
/* 38 */            qn1 qn1VarM10258v = m10258v(ix0Var);
/* 42 */            if (qn1VarM10258v == null) {
/* 44 */                return j13.f11998h;
                    }
/* 49 */            C0156au c0156auM10233G = null;
/* 56 */            r01 r01Var = ix0Var instanceof r01 ? (r01) ix0Var : null;
/* 57 */            if (r01Var == null) {
/* 61 */                r01Var = new r01(qn1VarM10258v, null);
                    }
                    synchronized (r01Var) {
/* 69 */                if (r01Var.m8041f()) {
/* 71 */                    return j13.f11996f;
                        }
/* 81 */                r01.f15818b.set(r01Var, 1);
/* 84 */                if (r01Var != ix0Var) {
/* 86 */                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19893a;
/* 92 */                    while (!atomicReferenceFieldUpdater.compareAndSet(this, ix0Var, r01Var)) {
/* 99 */                        if (atomicReferenceFieldUpdater.get(this) != ix0Var) {
/* 101 */                           return j13.f11998h;
                                }
                            }
                        }
/* 105 */               boolean zM8040e = r01Var.m8040e();
/* 117 */               C1980nx c1980nx = obj2 instanceof C1980nx ? (C1980nx) obj2 : null;
/* 118 */               if (c1980nx != null) {
/* 122 */                   r01Var.m8037a(c1980nx.f14555a);
                        }
/* 125 */               Throwable thM8039d = r01Var.m8039d();
/* 129 */               if (zM8040e) {
/* 132 */                   thM8039d = null;
                        }
/* 134 */               if (thM8039d != null) {
/* 136 */                   m10240H(qn1VarM10258v, thM8039d);
                        }
/* 147 */               C0156au c0156au = ix0Var instanceof C0156au ? (C0156au) ix0Var : null;
/* 148 */               if (c0156au == null) {
/* 150 */                   qn1 qn1VarMo4393c = ix0Var.mo4393c();
/* 154 */                   if (qn1VarMo4393c != null) {
/* 156 */                       c0156auM10233G = m10233G(qn1VarMo4393c);
                            }
                        } else {
/* 161 */                   c0156auM10233G = c0156au;
                        }
/* 162 */               if (c0156auM10233G != null) {
/* 178 */                   while (hu0.m4343n0(c0156auM10233G.f2092v, false, new q01(this, r01Var, c0156auM10233G, obj2), 1) == rn1.f16198a) {
/* 183 */                       c0156auM10233G = m10233G(c0156auM10233G);
/* 187 */                       if (c0156auM10233G == null) {
                                }
                            }
/* 180 */                   return j13.f11997g;
                        }
/* 189 */               return m10255q(r01Var, obj2);
                    }
                }

                @Override // p000.h01
                public final InterfaceC2563zt attachChild(InterfaceC0820cu interfaceC0820cu) {
/* 8 */             e90 e90VarM4343n0 = hu0.m4343n0(this, true, new C0156au(interfaceC0820cu), 2);
/* 12 */            e90VarM4343n0.getClass();
/* 15 */            return (InterfaceC2563zt) e90VarM4343n0;
                }

                @Override // p000.h01
                public void cancel(CancellationException cancellationException) {
/* 1 */             if (cancellationException == null) {
/* 10 */                cancellationException = new i01(mo4407m(), null, this);
                    }
/* 13 */            mo10035k(cancellationException);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final Object fold(Object obj, Function2 function2) {
/* 1 */             return function2.invoke(obj, this);
                }

                /* JADX INFO: renamed from: g */
                public void mo7346g(Object obj) {
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext.Element get(InterfaceC1845f interfaceC1845f) {
/* 1 */             return AbstractC1844e.m6213a(this, interfaceC1845f);
                }

                @Override // p000.h01
                public final CancellationException getCancellationException() {
/* 1 */             Object objM10260x = m10260x();
/* 10 */            if (!(objM10260x instanceof r01)) {
/* 56 */                if (!(objM10260x instanceof ix0)) {
                            return objM10260x instanceof C1980nx ? m10235Q(this, ((C1980nx) objM10260x).f14555a) : new i01(getClass().getSimpleName().concat(" has completed normally"), null, this);
                        }
/* 91 */                ds0.m3201r(this, "Job is still new or active: ");
/* 9 */                 return null;
                    }
/* 14 */            Throwable thM8039d = ((r01) objM10260x).m8039d();
/* 18 */            if (thM8039d == null) {
/* 50 */                ds0.m3201r(this, "Job is still new or active: ");
/* 9 */                 return null;
                    }
/* 30 */            String strConcat = getClass().getSimpleName().concat(" is cancelling");
/* 39 */            CancellationException cancellationException = thM8039d instanceof CancellationException ? (CancellationException) thM8039d : null;
                    return cancellationException == null ? new i01(strConcat, thM8039d, this) : cancellationException;
                }

                @Override // p000.h01
                public final Sequence getChildren() {
/* 10 */            return new C2066pd(new v01(null, this), 3);
                }

                public Object getCompleted() {
/* 1 */             return m10256r();
                }

                public final Throwable getCompletionExceptionOrNull() {
/* 1 */             Object objM10260x = m10260x();
/* 8 */             if (objM10260x instanceof ix0) {
/* 26 */                f42.m3656l("This job has not completed yet");
/* 7 */                 return null;
                    }
/* 17 */            C1980nx c1980nx = objM10260x instanceof C1980nx ? (C1980nx) objM10260x : null;
/* 18 */            if (c1980nx != null) {
/* 20 */                return c1980nx.f14555a;
                    }
/* 7 */             return null;
                }

                @Override // kotlin.coroutines.CoroutineContext.Element
                public final InterfaceC1845f getKey() {
/* 1 */             return xt0.f19368w;
                }

                /* JADX INFO: renamed from: h */
                public void mo6307h(Object obj) {
/* 1 */             mo7346g(obj);
                }

                /* JADX INFO: renamed from: i */
                public final Object m10250i(c10 c10Var) throws Throwable {
                    Object objM10260x;
/* 27 */            do {
/* 1 */                 objM10260x = m10260x();
/* 7 */                 if (!(objM10260x instanceof ix0)) {
/* 11 */                    if (objM10260x instanceof C1980nx) {
/* 22 */                        throw ((C1980nx) objM10260x).f14555a;
                            }
/* 13 */                    return j13.m5637B(objM10260x);
                        }
/* 27 */            } while (m10246O(objM10260x) < 0);
/* 35 */            p01 p01Var = new p01(mz0.m6834b(c10Var), this);
/* 38 */            p01Var.m3571u();
/* 58 */            p01Var.m3574x(new C2507yq(hu0.m4343n0(this, false, new u42(p01Var), 3), 2));
/* 61 */            Object objM3569s = p01Var.m3569s();
/* 65 */            z10 z10Var = z10.f19902a;
/* 67 */            return objM3569s;
                }

                @Override // p000.h01
                public final e90 invokeOnCompletion(Function1 function1) {
/* 8 */             return m10237B(false, true, new gz0(function1));
                }

                @Override // p000.h01
                public boolean isActive() {
/* 1 */             Object objM10260x = m10260x();
                    return (objM10260x instanceof ix0) && ((ix0) objM10260x).isActive();
                }

                @Override // p000.h01
                public final boolean isCancelled() {
/* 1 */             Object objM10260x = m10260x();
/* 7 */             if (objM10260x instanceof C1980nx) {
/* 24 */                return true;
                    }
                    return (objM10260x instanceof r01) && ((r01) objM10260x).m8040e();
                }

                @Override // p000.h01
                public final boolean isCompleted() {
/* 7 */             return !(m10260x() instanceof ix0);
                }

                /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:20:0x003e  */
                /* JADX WARN: Code duplicated, block: B:26:0x0054 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0054, B:31:0x005c, B:33:0x0065, B:34:0x0069), top: B:71:0x0049 }] */
                /* JADX WARN: Code duplicated, block: B:31:0x005c A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0054, B:31:0x005c, B:33:0x0065, B:34:0x0069), top: B:71:0x0049 }] */
                /* JADX WARN: Code duplicated, block: B:33:0x0065 A[Catch: all -> 0x005a, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0054, B:31:0x005c, B:33:0x0065, B:34:0x0069), top: B:71:0x0049 }] */
                /* JADX WARN: Code duplicated, block: B:36:0x0078  */
                /* JADX WARN: Code duplicated, block: B:39:0x007c  */
                /* JADX WARN: Code duplicated, block: B:43:0x0088  */
                /* JADX WARN: Code duplicated, block: B:45:0x008c A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:46:0x008e  */
                /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:68:0x00ce A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
                /* JADX WARN: Code duplicated, block: B:71:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:76:0x00a4 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:77:0x00a1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:78:0x0048 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:79:0x00bd A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:80:0x009b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:81:0x00b7 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:82:0x00b5 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:84:0x0040 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:85:0x0040 A[SYNTHETIC] */
                /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
                /* JADX INFO: renamed from: j */
                public final boolean m10251j(Object obj) {
                    Throwable thM10254p;
                    Object objM10260x;
                    Throwable thM8039d;
                    C2131r4 c2131r4;
                    ix0 ix0Var;
                    Object objM10249T;
/* 1 */             Object objM10249T2 = j13.f11996f;
/* 9 */             if (mo5930u()) {
/* 48 */                do {
/* 11 */                    Object objM10260x2 = m10260x();
/* 17 */                    if (!(objM10260x2 instanceof ix0) || ((objM10260x2 instanceof r01) && ((r01) objM10260x2).m8041f())) {
/* 51 */                        objM10249T2 = j13.f11996f;
                                break;
                            }
/* 42 */                    objM10249T2 = m10249T(objM10260x2, new C1980nx(false, m10254p(obj)));
/* 48 */                } while (objM10249T2 == j13.f11998h);
/* 55 */                if (objM10249T2 != j13.f11997g) {
/* 61 */                    if (objM10249T2 == j13.f11996f) {
/* 64 */                        thM10254p = null;
                                while (true) {
/* 65 */                            objM10260x = m10260x();
/* 71 */                            if (objM10260x instanceof r01) {
                                        synchronized (objM10260x) {
/* 83 */                                    if (((r01) objM10260x).m8038b() == j13.f12000j) {
/* 85 */                                        c2131r4 = j13.f11999i;
                                            } else {
/* 96 */                                        boolean zM8040e = ((r01) objM10260x).m8040e();
/* 100 */                                       if (thM10254p == null) {
/* 102 */                                           thM10254p = m10254p(obj);
                                                }
/* 109 */                                       ((r01) objM10260x).m8037a(thM10254p);
/* 119 */                                       thM8039d = zM8040e ? null : ((r01) objM10260x).m8039d();
/* 123 */                                       if (thM8039d != null) {
/* 129 */                                           m10240H(((r01) objM10260x).f15823a, thM8039d);
                                                }
/* 132 */                                       c2131r4 = j13.f11996f;
                                            }
                                        }
                                    } else if (objM10260x instanceof ix0) {
/* 141 */                               if (thM10254p == null) {
/* 143 */                                   thM10254p = m10254p(obj);
                                        }
/* 148 */                               ix0Var = (ix0) objM10260x;
/* 154 */                               if (ix0Var.isActive()) {
/* 170 */                                   objM10249T = m10249T(objM10260x, new C1980nx(false, thM10254p));
/* 176 */                                   if (objM10249T != j13.f11996f) {
/* 186 */                                       ds0.m3201r(objM10260x, "Cannot happen in ");
/* 7 */                                         return false;
                                            }
/* 180 */                                   if (objM10249T != j13.f11998h) {
/* 182 */                                       objM10249T2 = objM10249T;
                                                break;
                                            }
                                        } else if (m10248S(ix0Var, thM10254p)) {
/* 162 */                                   c2131r4 = j13.f11996f;
                                        }
                                    } else {
/* 190 */                               c2131r4 = j13.f11999i;
                                    }
/* 88 */                            objM10249T2 = c2131r4;
                                    break;
                                }
                            }
/* 195 */                   if (objM10249T2 != j13.f11996f && objM10249T2 != j13.f11997g) {
/* 205 */                       if (objM10249T2 == j13.f11999i) {
/* 7 */                             return false;
                                }
/* 208 */                       mo7346g(objM10249T2);
/* 8 */                         return true;
                            }
                        }
                    } else {
/* 61 */                if (objM10249T2 == j13.f11996f) {
/* 64 */                    thM10254p = null;
                            while (true) {
/* 65 */                        objM10260x = m10260x();
/* 71 */                        if (objM10260x instanceof r01) {
                                    synchronized (objM10260x) {
/* 83 */                                if (((r01) objM10260x).m8038b() == j13.f12000j) {
/* 85 */                                    c2131r4 = j13.f11999i;
                                        } else {
/* 96 */                                    boolean zM8040e2 = ((r01) objM10260x).m8040e();
/* 100 */                                   if (thM10254p == null) {
/* 102 */                                       thM10254p = m10254p(obj);
                                            }
/* 109 */                                   ((r01) objM10260x).m8037a(thM10254p);
/* 119 */                                   if (zM8040e2) {
                                            }
/* 123 */                                   if (thM8039d != null) {
/* 129 */                                       m10240H(((r01) objM10260x).f15823a, thM8039d);
                                            }
/* 132 */                                   c2131r4 = j13.f11996f;
                                        }
                                    }
                                } else if (objM10260x instanceof ix0) {
/* 141 */                           if (thM10254p == null) {
/* 143 */                               thM10254p = m10254p(obj);
                                    }
/* 148 */                           ix0Var = (ix0) objM10260x;
/* 154 */                           if (ix0Var.isActive()) {
/* 170 */                               objM10249T = m10249T(objM10260x, new C1980nx(false, thM10254p));
/* 176 */                               if (objM10249T != j13.f11996f) {
/* 186 */                                   ds0.m3201r(objM10260x, "Cannot happen in ");
/* 7 */                                     return false;
                                        }
/* 180 */                               if (objM10249T != j13.f11998h) {
/* 182 */                                   objM10249T2 = objM10249T;
                                            break;
                                        }
                                    } else if (m10248S(ix0Var, thM10254p)) {
/* 162 */                               c2131r4 = j13.f11996f;
                                    }
                                } else {
/* 190 */                           c2131r4 = j13.f11999i;
                                }
/* 88 */                        objM10249T2 = c2131r4;
                                break;
                            }
                        }
/* 195 */               if (objM10249T2 != j13.f11996f) {
/* 205 */                   if (objM10249T2 == j13.f11999i) {
/* 7 */                         return false;
                            }
/* 208 */                   mo7346g(objM10249T2);
/* 8 */                     return true;
                        }
                    }
/* 8 */             return true;
                }

                @Override // p000.h01
                public final Object join(c10 c10Var) {
                    Object objM10260x;
/* 23 */            do {
/* 1 */                 objM10260x = m10260x();
/* 7 */                 if (!(objM10260x instanceof ix0)) {
/* 13 */                    hu0.m4328W(c10Var.getContext());
/* 16 */                    return Unit.f12910a;
                        }
/* 23 */            } while (m10246O(objM10260x) < 0);
/* 32 */            C0890er c0890er = new C0890er(1, mz0.m6834b(c10Var));
/* 35 */            c0890er.m3571u();
/* 55 */            c0890er.m3574x(new C2507yq(hu0.m4343n0(this, false, new v42(c0890er), 3), 2));
/* 58 */            Object objM3569s = c0890er.m3569s();
/* 62 */            z10 z10Var = z10.f19902a;
/* 64 */            if (objM3569s != z10Var) {
/* 67 */                objM3569s = Unit.f12910a;
                    }
                    return objM3569s == z10Var ? objM3569s : Unit.f12910a;
                }

                /* JADX INFO: renamed from: k */
                public void mo10035k(CancellationException cancellationException) {
/* 1 */             m10251j(cancellationException);
                }

                /* JADX INFO: renamed from: l */
                public final boolean m10252l(Throwable th) {
/* 5 */             if (mo7345C()) {
/* 32 */                return true;
                    }
/* 8 */             boolean z = th instanceof CancellationException;
/* 10 */            InterfaceC2563zt interfaceC2563ztM10259w = m10259w();
/* 14 */            if (interfaceC2563ztM10259w == null || interfaceC2563ztM10259w == rn1.f16198a) {
/* 34 */                return z;
                    }
                    return interfaceC2563ztM10259w.mo1169b(th) || z;
                }

                /* JADX INFO: renamed from: m */
                public String mo4407m() {
/* 1 */             return "Job was cancelled";
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext minusKey(InterfaceC1845f interfaceC1845f) {
/* 1 */             return AbstractC1844e.m6214b(this, interfaceC1845f);
                }

                /* JADX INFO: renamed from: n */
                public boolean mo7454n(Throwable th) {
/* 3 */             if (th instanceof CancellationException) {
/* 18 */                return true;
                    }
                    return m10251j(th) && mo5929t();
                }

                /* JADX INFO: renamed from: o */
                public final void m10253o(ix0 ix0Var, Object obj) {
/* 1 */             InterfaceC2563zt interfaceC2563ztM10259w = m10259w();
/* 5 */             if (interfaceC2563ztM10259w != null) {
/* 7 */                 interfaceC2563ztM10259w.dispose();
/* 12 */                m10245N(rn1.f16198a);
                    }
/* 17 */            C2086px c2086px = null;
/* 23 */            C1980nx c1980nx = obj instanceof C1980nx ? (C1980nx) obj : null;
/* 29 */            Throwable th = c1980nx != null ? c1980nx.f14555a : null;
/* 36 */            if (ix0Var instanceof o01) {
                        try {
/* 41 */                    ((o01) ix0Var).mo277a(th);
/* 44 */                    return;
                        } catch (Throwable th2) {
/* 69 */                    mo4408z(new C2086px("Exception in completion handler " + ix0Var + " for " + this, th2));
/* 145 */                   return;
                        }
                    }
/* 73 */            qn1 qn1VarMo4393c = ix0Var.mo4393c();
/* 77 */            if (qn1VarMo4393c != null) {
/* 79 */                Object objM8454h = qn1VarMo4393c.m8454h();
/* 83 */                objM8454h.getClass();
/* 92 */                for (s91 s91VarM8455i = (s91) objM8454h; !s91VarM8455i.equals(qn1VarMo4393c); s91VarM8455i = s91VarM8455i.m8455i()) {
/* 96 */                    if (s91VarM8455i instanceof o01) {
/* 99 */                        o01 o01Var = (o01) s91VarM8455i;
                                try {
/* 101 */                           o01Var.mo277a(th);
                                } catch (Throwable th3) {
/* 106 */                           if (c2086px != null) {
/* 108 */                               jf0.m5798a(c2086px, th3);
                                    } else {
/* 132 */                               c2086px = new C2086px("Exception in completion handler " + o01Var + " for " + this, th3);
                                    }
                                }
                            }
                        }
/* 140 */               if (c2086px != null) {
/* 142 */                   mo4408z(c2086px);
                        }
                    }
                }

                /* JADX INFO: renamed from: p */
                public final Throwable m10254p(Object obj) {
                    Throwable thM8039d;
/* 3 */             if (obj instanceof Throwable) {
/* 5 */                 return (Throwable) obj;
                    }
/* 10 */            z01 z01Var = (z01) ((lr1) obj);
/* 12 */            Object objM10260x = z01Var.m10260x();
/* 19 */            if (objM10260x instanceof r01) {
/* 24 */                thM8039d = ((r01) objM10260x).m8039d();
                    } else if (objM10260x instanceof C1980nx) {
/* 36 */                thM8039d = ((C1980nx) objM10260x).f14555a;
                    } else {
/* 41 */                if (objM10260x instanceof ix0) {
/* 71 */                    ds0.m3201r(objM10260x, "Cannot be cancelling child in this state: ");
/* 18 */                    return null;
                        }
/* 43 */                thM8039d = null;
                    }
/* 49 */            CancellationException cancellationException = thM8039d instanceof CancellationException ? (CancellationException) thM8039d : null;
                    return cancellationException == null ? new i01("Parent job is ".concat(m10234P(objM10260x)), thM8039d, z01Var) : cancellationException;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext plus(CoroutineContext coroutineContext) {
/* 1 */             return AbstractC1844e.m6215c(this, coroutineContext);
                }

                /* JADX INFO: renamed from: q */
                public final Object m10255q(r01 r01Var, Object obj) throws Throwable {
                    Throwable th;
                    z01 z01Var;
                    r01 r01Var2;
/* 10 */            C1980nx c1980nx = obj instanceof C1980nx ? (C1980nx) obj : null;
/* 13 */            Throwable th2 = c1980nx != null ? c1980nx.f14555a : null;
                    synchronized (r01Var) {
                        try {
/* 16 */                    r01Var.m8040e();
/* 19 */                    ArrayList<Throwable> arrayListM8042g = r01Var.m8042g(th2);
/* 23 */                    Throwable thM10257s = m10257s(r01Var, arrayListM8042g);
/* 28 */                    if (thM10257s != null) {
                                try {
/* 34 */                            if (arrayListM8042g.size() > 1) {
/* 46 */                                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM8042g.size()));
/* 58 */                                for (Throwable th3 : arrayListM8042g) {
/* 66 */                                    if (th3 != thM10257s && th3 != thM10257s && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
/* 80 */                                        jf0.m5798a(thM10257s, th3);
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
/* 85 */                            th = th4;
/* 179 */                           throw th;
                                }
                            }
/* 90 */                    if (thM10257s != null && thM10257s != th2) {
/* 98 */                        obj = new C1980nx(false, thM10257s);
                            }
/* 101 */                   if (thM10257s != null && (m10252l(thM10257s) || mo4527y(thM10257s))) {
/* 115 */                       obj.getClass();
/* 123 */                       C1980nx.f14554b.compareAndSet((C1980nx) obj, 0, 1);
                            }
/* 126 */                   mo4402I(obj);
/* 129 */                   AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19893a;
/* 145 */                   Object jx0Var = obj instanceof ix0 ? new jx0((ix0) obj) : obj;
                            while (true) {
/* 146 */                       atomicReferenceFieldUpdater.getClass();
/* 149 */                       Unsafe unsafe = AbstractC1703b.f11726a;
/* 151 */                       long j = f19896d;
/* 153 */                       z01Var = this;
/* 154 */                       r01Var2 = r01Var;
/* 159 */                       if (unsafe.compareAndSwapObject(z01Var, j, r01Var2, jx0Var) || unsafe.getObjectVolatile(z01Var, j) != r01Var2) {
                                    break;
                                }
/* 172 */                       this = z01Var;
/* 173 */                       r01Var = r01Var2;
                            }
/* 168 */                   z01Var.m10253o(r01Var2, obj);
/* 171 */                   return obj;
                        } catch (Throwable th5) {
/* 177 */                   th = th5;
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public final Object m10256r() throws Throwable {
/* 1 */             Object objM10260x = m10260x();
/* 7 */             if (objM10260x instanceof ix0) {
/* 25 */                f42.m3656l("This job has not completed yet");
/* 28 */                return null;
                    }
/* 11 */            if (objM10260x instanceof C1980nx) {
/* 22 */                throw ((C1980nx) objM10260x).f14555a;
                    }
/* 13 */            return j13.m5637B(objM10260x);
                }

                /* JADX INFO: renamed from: s */
                public final Throwable m10257s(r01 r01Var, ArrayList arrayList) {
                    Object next;
/* 5 */             Object obj = null;
/* 6 */             if (arrayList.isEmpty()) {
/* 12 */                if (r01Var.m8040e()) {
/* 20 */                    return new i01(mo4407m(), null, this);
                        }
/* 5 */                 return null;
                    }
/* 25 */            Iterator it = arrayList.iterator();
/* 44 */            do {
/* 33 */                if (!it.hasNext()) {
/* 47 */                    next = null;
                            break;
                        }
/* 35 */                next = it.next();
/* 44 */            } while (((Throwable) next) instanceof CancellationException);
/* 48 */            Throwable th = (Throwable) next;
/* 50 */            if (th != null) {
/* 52 */                return th;
                    }
/* 58 */            Throwable th2 = (Throwable) arrayList.get(0);
/* 62 */            if (th2 instanceof lo2) {
/* 72 */                for (Object obj2 : arrayList) {
/* 79 */                    Throwable th3 = (Throwable) obj2;
/* 81 */                    if (th3 != th2 && (th3 instanceof lo2)) {
/* 87 */                        obj = obj2;
                                break;
                            }
                        }
/* 88 */                Throwable th4 = (Throwable) obj;
/* 90 */                if (th4 != null) {
/* 92 */                    return th4;
                        }
                    }
/* 93 */            return th2;
                }

                @Override // p000.h01
                public final boolean start() {
                    int iM10246O;
/* 12 */            do {
/* 5 */                 iM10246O = m10246O(m10260x());
/* 9 */                 if (iM10246O == 0) {
/* 16 */                    return false;
                        }
/* 12 */            } while (iM10246O != 1);
/* 11 */            return true;
                }

                /* JADX INFO: renamed from: t */
                public boolean mo5929t() {
/* 1 */             return true;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 43 */            sb.append(mo6717F() + '{' + m10234P(m10260x()) + '}');
/* 48 */            sb.append('@');
/* 55 */            sb.append(k50.m5983t(this));
/* 58 */            return sb.toString();
                }

                /* JADX INFO: renamed from: u */
                public boolean mo5930u() {
/* 1 */             return this instanceof C1869kx;
                }

                /* JADX INFO: renamed from: v */
                public final qn1 m10258v(ix0 ix0Var) {
/* 1 */             qn1 qn1VarMo4393c = ix0Var.mo4393c();
/* 5 */             if (qn1VarMo4393c != null) {
/* 34 */                return qn1VarMo4393c;
                    }
/* 9 */             if (ix0Var instanceof kd0) {
/* 13 */                return new qn1();
                    }
/* 20 */            if (ix0Var instanceof o01) {
/* 24 */                m10243L((o01) ix0Var);
/* 19 */                return null;
                    }
/* 30 */            ds0.m3201r(ix0Var, "State should have list: ");
/* 19 */            return null;
                }

                /* JADX INFO: renamed from: w */
                public final InterfaceC2563zt m10259w() {
/* 3 */             f19894b.getClass();
/* 14 */            return (InterfaceC2563zt) AbstractC1703b.f11726a.getObjectVolatile(this, f19895c);
                }

                /* JADX INFO: renamed from: x */
                public final Object m10260x() {
                    while (true) {
/* 3 */                 f19893a.getClass();
/* 10 */                Object objectVolatile = AbstractC1703b.f11726a.getObjectVolatile(this, f19896d);
/* 16 */                if (!(objectVolatile instanceof AbstractC2364xd)) {
/* 18 */                    return objectVolatile;
                        }
/* 21 */                ((AbstractC2364xd) objectVolatile).m9750c(this);
                    }
                }

                /* JADX INFO: renamed from: y */
                public boolean mo4527y(Throwable th) {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: z */
                public void mo4408z(C2086px c2086px) {
/* 1 */             throw c2086px;
                }

                @Override // p000.h01
/* 12 */        public final e90 invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
/* 14 */            return m10237B(z, z2, new gz0(function1));
                }
            }
