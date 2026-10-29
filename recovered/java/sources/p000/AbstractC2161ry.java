            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import sun.misc.Unsafe;
            
            /* JADX INFO: renamed from: ry */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC2161ry {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f16345a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2161ry.class, Object.class, "_next$volatile");

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f16346b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ long f16347c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ long f16348d;
                private volatile /* synthetic */ Object _next$volatile;
                private volatile /* synthetic */ Object _prev$volatile;

                static {
/* 13 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 23 */            f16347c = unsafe.objectFieldOffset(AbstractC2161ry.class.getDeclaredField("_next$volatile"));
/* 31 */            f16346b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2161ry.class, Object.class, "_prev$volatile");
/* 41 */            f16348d = unsafe.objectFieldOffset(AbstractC2161ry.class.getDeclaredField("_prev$volatile"));
                }

                public AbstractC2161ry(s82 s82Var) {
/* 4 */             this._prev$volatile = s82Var;
                }

                /* JADX INFO: renamed from: b */
                public final void m8323b() {
/* 3 */             f16346b.getClass();
/* 11 */            AbstractC1703b.f11726a.putObjectVolatile(this, f16348d, (Object) null);
                }

                /* JADX INFO: renamed from: c */
                public final AbstractC2161ry m8324c() {
/* 1 */             AbstractC2161ry abstractC2161ryM8327f = m8327f();
/* 5 */             while (abstractC2161ryM8327f != null && abstractC2161ryM8327f.mo8328g()) {
/* 15 */                f16346b.getClass();
/* 26 */                abstractC2161ryM8327f = (AbstractC2161ry) AbstractC1703b.f11726a.getObjectVolatile(abstractC2161ryM8327f, f16348d);
                    }
/* 29 */            return abstractC2161ryM8327f;
                }

                /* JADX INFO: renamed from: d */
                public final AbstractC2161ry m8325d() {
/* 1 */             Object objM8326e = m8326e();
/* 7 */             if (objM8326e == hu0.f9293a) {
/* 9 */                 return null;
                    }
/* 11 */            return (AbstractC2161ry) objM8326e;
                }

                /* JADX INFO: renamed from: e */
                public final Object m8326e() {
/* 3 */             f16345a.getClass();
/* 10 */            return AbstractC1703b.f11726a.getObjectVolatile(this, f16347c);
                }

                /* JADX INFO: renamed from: f */
                public final AbstractC2161ry m8327f() {
/* 3 */             f16346b.getClass();
/* 14 */            return (AbstractC2161ry) AbstractC1703b.f11726a.getObjectVolatile(this, f16348d);
                }

                /* JADX INFO: renamed from: g */
                public abstract boolean mo8328g();

                /* JADX INFO: renamed from: h */
                public final boolean m8329h() {
/* 1 */             C2131r4 c2131r4 = hu0.f9293a;
                    while (true) {
/* 5 */                 f16345a.getClass();
/* 8 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 10 */                long j = f16347c;
/* 13 */                AbstractC2161ry abstractC2161ry = this;
/* 18 */                if (unsafe.compareAndSwapObject(abstractC2161ry, j, (Object) null, c2131r4)) {
/* 20 */                    return true;
                        }
/* 26 */                if (unsafe.getObjectVolatile(abstractC2161ry, j) != null) {
/* 28 */                    return false;
                        }
/* 30 */                this = abstractC2161ry;
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m8330i() {
                    AbstractC2161ry abstractC2161ry;
                    Unsafe unsafe;
/* 5 */             if (m8325d() == null) {
/* 7 */                 return;
                    }
                    while (true) {
/* 8 */                 AbstractC2161ry abstractC2161ryM8324c = m8324c();
/* 12 */                AbstractC2161ry abstractC2161ryM8325d = m8325d();
/* 16 */                abstractC2161ryM8325d.getClass();
/* 30 */                do {
/* 19 */                    abstractC2161ry = abstractC2161ryM8325d;
/* 24 */                    if (!abstractC2161ry.mo8328g()) {
                                break;
                            } else {
/* 26 */                        abstractC2161ryM8325d = abstractC2161ry.m8325d();
                            }
/* 30 */                } while (abstractC2161ryM8325d != null);
                        while (true) {
/* 34 */                    f16346b.getClass();
/* 37 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 39 */                    long j = f16348d;
/* 41 */                    Object objectVolatile = unsafe2.getObjectVolatile(abstractC2161ry, j);
/* 53 */                    AbstractC2161ry abstractC2161ry2 = ((AbstractC2161ry) objectVolatile) == null ? null : abstractC2161ryM8324c;
                            while (true) {
/* 54 */                        unsafe = AbstractC1703b.f11726a;
/* 62 */                        if (unsafe.compareAndSwapObject(abstractC2161ry, f16348d, objectVolatile, abstractC2161ry2)) {
                                    break;
                                } else if (unsafe.getObjectVolatile(abstractC2161ry, j) != objectVolatile) {
                                }
                            }
                        }
/* 64 */                if (abstractC2161ryM8324c != null) {
/* 68 */                    f16345a.getClass();
/* 73 */                    unsafe.putObjectVolatile(abstractC2161ryM8324c, f16347c, abstractC2161ry);
                        }
/* 80 */                if (!abstractC2161ry.mo8328g() || abstractC2161ry.m8325d() == null) {
/* 88 */                    if (abstractC2161ryM8324c == null || !abstractC2161ryM8324c.mo8328g()) {
/* 96 */                        return;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public final boolean m8331j(s82 s82Var) {
                    while (true) {
/* 3 */                 f16345a.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f16347c;
/* 11 */                AbstractC2161ry abstractC2161ry = this;
/* 12 */                s82 s82Var2 = s82Var;
/* 17 */                if (unsafe.compareAndSwapObject(abstractC2161ry, j, (Object) null, s82Var2)) {
/* 19 */                    return true;
                        }
/* 25 */                if (unsafe.getObjectVolatile(abstractC2161ry, j) != null) {
/* 27 */                    return false;
                        }
/* 29 */                this = abstractC2161ry;
/* 30 */                s82Var = s82Var2;
                    }
                }
            }
