            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class t91 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f16998a = AtomicReferenceFieldUpdater.newUpdater(t91.class, Object.class, "_cur$volatile");

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ long f16999b = AbstractC1703b.f11726a.objectFieldOffset(t91.class.getDeclaredField("_cur$volatile"));
                private volatile /* synthetic */ Object _cur$volatile = new v91(8, false);

                /* JADX INFO: renamed from: a */
                public final boolean m8740a(Runnable runnable) {
                    t91 t91Var;
                    while (true) {
/* 3 */                 f16998a.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f16999b;
/* 15 */                v91 v91Var = (v91) unsafe.getObjectVolatile(this, j);
/* 17 */                int iM9233a = v91Var.m9233a(runnable);
/* 22 */                if (iM9233a == 0) {
/* 21 */                    return true;
                        }
/* 24 */                if (iM9233a == 1) {
/* 33 */                    v91 v91VarM9236d = v91Var.m9236d();
                            while (true) {
/* 37 */                        Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 41 */                        t91Var = this;
/* 46 */                        if (unsafe2.compareAndSwapObject(t91Var, f16999b, v91Var, v91VarM9236d) || unsafe2.getObjectVolatile(t91Var, j) != v91Var) {
                                    break;
                                }
/* 57 */                        this = t91Var;
                            }
                        } else {
/* 27 */                    if (iM9233a == 2) {
/* 31 */                        return false;
                            }
/* 29 */                    t91Var = this;
                        }
/* 55 */                this = t91Var;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m8741b() {
                    t91 t91Var;
                    while (true) {
/* 3 */                 f16998a.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f16999b;
/* 15 */                v91 v91Var = (v91) unsafe.getObjectVolatile(this, j);
/* 21 */                if (v91Var.m9235c()) {
/* 23 */                    return;
                        }
/* 24 */                v91 v91VarM9236d = v91Var.m9236d();
                        while (true) {
/* 28 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 32 */                    t91Var = this;
/* 37 */                    if (unsafe2.compareAndSwapObject(t91Var, f16999b, v91Var, v91VarM9236d) || unsafe2.getObjectVolatile(t91Var, j) != v91Var) {
                                break;
                            } else {
/* 48 */                        this = t91Var;
                            }
                        }
/* 46 */                this = t91Var;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final int m8742c() {
/* 3 */             f16998a.getClass();
/* 14 */            v91 v91Var = (v91) AbstractC1703b.f11726a.getObjectVolatile(this, f16999b);
/* 16 */            v91Var.getClass();
/* 21 */            long j = v91.f17919f.get(v91Var);
/* 44 */            return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
                }

                /* JADX INFO: renamed from: d */
                public final Object m8743d() {
                    t91 t91Var;
                    while (true) {
/* 3 */                 f16998a.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f16999b;
/* 15 */                v91 v91Var = (v91) unsafe.getObjectVolatile(this, j);
/* 17 */                Object objM9237e = v91Var.m9237e();
/* 23 */                if (objM9237e != v91.f17920g) {
/* 25 */                    return objM9237e;
                        }
/* 26 */                v91 v91VarM9236d = v91Var.m9236d();
                        while (true) {
/* 30 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 34 */                    t91Var = this;
/* 39 */                    if (unsafe2.compareAndSwapObject(t91Var, f16999b, v91Var, v91VarM9236d) || unsafe2.getObjectVolatile(t91Var, j) != v91Var) {
                                break;
                            }
/* 50 */                    this = t91Var;
                        }
/* 48 */                this = t91Var;
                    }
                }
            }
