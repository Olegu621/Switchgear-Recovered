            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.Unit;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class j92 {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f12151b = AtomicReferenceFieldUpdater.newUpdater(j92.class, Object.class, "head$volatile");

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ AtomicLongFieldUpdater f12152c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f12153d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ AtomicLongFieldUpdater f12154e;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f12155f;

                /* JADX INFO: renamed from: g */
                public static final /* synthetic */ long f12156g;

                /* JADX INFO: renamed from: h */
                public static final /* synthetic */ long f12157h;
                private volatile /* synthetic */ int _availablePermits$volatile;

                /* JADX INFO: renamed from: a */
                public final C1983o f12158a;
                private volatile /* synthetic */ long deqIdx$volatile;
                private volatile /* synthetic */ long enqIdx$volatile;
                private volatile /* synthetic */ Object head$volatile;
                private volatile /* synthetic */ Object tail$volatile;

                static {
/* 13 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 23 */            f12156g = unsafe.objectFieldOffset(j92.class.getDeclaredField("head$volatile"));
/* 31 */            f12152c = AtomicLongFieldUpdater.newUpdater(j92.class, "deqIdx$volatile");
/* 39 */            f12153d = AtomicReferenceFieldUpdater.newUpdater(j92.class, Object.class, "tail$volatile");
/* 49 */            f12157h = unsafe.objectFieldOffset(j92.class.getDeclaredField("tail$volatile"));
/* 57 */            f12154e = AtomicLongFieldUpdater.newUpdater(j92.class, "enqIdx$volatile");
/* 65 */            f12155f = AtomicIntegerFieldUpdater.newUpdater(j92.class, "_availablePermits$volatile");
                }

                public j92() {
/* 10 */            l92 l92Var = new l92(0L, null, 2);
/* 13 */            this.head$volatile = l92Var;
/* 15 */            this.tail$volatile = l92Var;
/* 18 */            this._availablePermits$volatile = 1;
/* 27 */            this.f12158a = new C1983o(this, 16);
                }

                /* JADX INFO: renamed from: a */
                public final boolean m5728a(fl1 fl1Var) {
                    Object objM4330Y;
                    Unsafe unsafe;
/* 1 */             j92 j92Var = this;
/* 7 */             f12153d.getClass();
/* 10 */            Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 12 */            long j = f12157h;
/* 19 */            l92 l92Var = (l92) unsafe2.getObjectVolatile(j92Var, j);
/* 23 */            long andIncrement = f12154e.getAndIncrement(j92Var);
/* 27 */            h92 h92Var = h92.f8974a;
/* 32 */            long j2 = andIncrement / ((long) k92.f12664f);
                    loop0: while (true) {
/* 34 */                objM4330Y = hu0.m4330Y(l92Var, j2, h92Var);
/* 42 */                if (k50.m5949A(objM4330Y)) {
                            break;
                        }
/* 44 */                s82 s82VarM5986w = k50.m5986w(objM4330Y);
                        while (true) {
/* 55 */                    s82 s82Var = (s82) AbstractC1703b.f11726a.getObjectVolatile(j92Var, j);
/* 63 */                    if (s82Var.f16473e >= s82VarM5986w.f16473e) {
/* 65 */                        j92Var = this;
                                break loop0;
                            }
/* 72 */                    if (!s82VarM5986w.m8434o()) {
                                break;
                            }
/* 103 */                   do {
/* 77 */                        unsafe = AbstractC1703b.f11726a;
/* 81 */                        j92Var = this;
/* 87 */                        if (unsafe.compareAndSwapObject(j92Var, f12157h, s82Var, s82VarM5986w)) {
/* 93 */                            if (!s82Var.m8432k()) {
                                        break loop0;
                                    }
/* 95 */                            s82Var.m8330i();
                                    break loop0;
                                }
/* 103 */                   } while (unsafe.getObjectVolatile(j92Var, j) == s82Var);
/* 109 */                   if (s82VarM5986w.m8432k()) {
/* 111 */                       s82VarM5986w.m8330i();
                            }
                        }
/* 74 */                j92Var = this;
                    }
/* 119 */           l92 l92Var2 = (l92) k50.m5986w(objM4330Y);
/* 121 */           AtomicReferenceArray atomicReferenceArray = l92Var2.f13158g;
/* 127 */           int i = (int) (andIncrement % ((long) k92.f12664f));
/* 134 */           while (!atomicReferenceArray.compareAndSet(i, null, fl1Var)) {
/* 144 */               if (atomicReferenceArray.get(i) != null) {
/* 146 */                   C2131r4 c2131r4 = k92.f12660b;
/* 148 */                   C2131r4 c2131r5 = k92.f12661c;
/* 154 */                   while (!atomicReferenceArray.compareAndSet(i, c2131r4, c2131r5)) {
/* 168 */                       if (atomicReferenceArray.get(i) != c2131r4) {
/* 170 */                           return false;
                                }
                            }
/* 160 */                   fl1Var.mo3179d(Unit.f12910a, j92Var.f12158a);
/* 133 */                   return true;
                        }
                    }
/* 136 */           fl1Var.mo3335a(l92Var2, i);
/* 133 */           return true;
                }

                /* JADX INFO: renamed from: b */
                public final void m5729b() {
                    int i;
/* 17 */            do {
/* 1 */                 AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12155f;
/* 3 */                 int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
/* 8 */                 if (andIncrement >= 1) {
/* 30 */                    do {
/* 20 */                        i = atomicIntegerFieldUpdater.get(this);
/* 24 */                        if (i <= 1) {
                                    break;
                                }
/* 30 */                    } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
/* 35 */                    ds0.m3190g("The number of released permits cannot be greater than 1");
/* 38 */                    return;
                        }
/* 10 */                if (andIncrement >= 0) {
/* 19 */                    return;
                        }
/* 17 */            } while (!m5730c());
                }

                /* JADX INFO: renamed from: c */
                public final boolean m5730c() {
                    Object objM4330Y;
                    Unsafe unsafe;
/* 3 */             f12151b.getClass();
/* 6 */             Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 8 */             long j = f12156g;
/* 15 */            l92 l92Var = (l92) unsafe2.getObjectVolatile(this, j);
/* 19 */            long andIncrement = f12152c.getAndIncrement(this);
/* 26 */            long j2 = andIncrement / ((long) k92.f12664f);
/* 28 */            i92 i92Var = i92.f9501a;
                    loop0: while (true) {
/* 30 */                objM4330Y = hu0.m4330Y(l92Var, j2, i92Var);
/* 38 */                if (k50.m5949A(objM4330Y)) {
                            break;
                        }
/* 40 */                s82 s82VarM5986w = k50.m5986w(objM4330Y);
                        while (true) {
/* 51 */                    s82 s82Var = (s82) AbstractC1703b.f11726a.getObjectVolatile(this, j);
/* 59 */                    if (s82Var.f16473e >= s82VarM5986w.f16473e) {
                                break loop0;
                            }
/* 66 */                    if (!s82VarM5986w.m8434o()) {
                                break;
                            }
/* 94 */                    do {
/* 69 */                        unsafe = AbstractC1703b.f11726a;
/* 78 */                        if (unsafe.compareAndSwapObject(this, f12156g, s82Var, s82VarM5986w)) {
/* 84 */                            if (!s82Var.m8432k()) {
                                        break loop0;
                                    }
/* 86 */                            s82Var.m8330i();
                                    break loop0;
                                }
/* 94 */                    } while (unsafe.getObjectVolatile(this, j) == s82Var);
/* 100 */                   if (s82VarM5986w.m8432k()) {
/* 102 */                       s82VarM5986w.m8330i();
                            }
                        }
                    }
/* 110 */           l92 l92Var2 = (l92) k50.m5986w(objM4330Y);
/* 112 */           AtomicReferenceArray atomicReferenceArray = l92Var2.f13158g;
/* 114 */           l92Var2.m8323b();
/* 121 */           boolean z = false;
/* 122 */           if (l92Var2.f16473e <= j2) {
/* 129 */               int i = (int) (andIncrement % ((long) k92.f12664f));
/* 132 */               Object andSet = atomicReferenceArray.getAndSet(i, k92.f12660b);
/* 137 */               if (andSet == null) {
/* 139 */                   int i2 = k92.f12659a;
/* 142 */                   for (int i3 = 0; i3 < i2; i3++) {
/* 150 */                       if (atomicReferenceArray.get(i) == k92.f12661c) {
/* 136 */                           return true;
                                }
                            }
/* 156 */                   C2131r4 c2131r4 = k92.f12660b;
/* 158 */                   C2131r4 c2131r5 = k92.f12662d;
/* 164 */                   while (!atomicReferenceArray.compareAndSet(i, c2131r4, c2131r5)) {
/* 172 */                       if (atomicReferenceArray.get(i) != c2131r4) {
/* 174 */                           return !z;
                                }
                            }
/* 166 */                   z = true;
/* 174 */                   return !z;
                        }
/* 179 */               if (andSet != k92.f12663e) {
/* 184 */                   if (!(andSet instanceof InterfaceC0853dr)) {
/* 205 */                       ds0.m3201r(andSet, "unexpected: ");
/* 121 */                       return false;
                            }
/* 186 */                   InterfaceC0853dr interfaceC0853dr = (InterfaceC0853dr) andSet;
/* 192 */                   C2131r4 c2131r4Mo3178b = interfaceC0853dr.mo3178b(Unit.f12910a, this.f12158a);
/* 196 */                   if (c2131r4Mo3178b != null) {
/* 198 */                       interfaceC0853dr.mo3180f(c2131r4Mo3178b);
/* 136 */                       return true;
                            }
                        }
                    }
/* 121 */           return false;
                }
            }
