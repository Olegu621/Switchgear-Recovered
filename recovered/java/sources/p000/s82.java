            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class s82 extends AbstractC2161ry implements tn1 {

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f16472f = AtomicIntegerFieldUpdater.newUpdater(s82.class, "cleanedAndPointers$volatile");
                private volatile /* synthetic */ int cleanedAndPointers$volatile;

                /* JADX INFO: renamed from: e */
                public final long f16473e;

                public s82(long j, s82 s82Var, int i) {
/* 1 */             super(s82Var);
/* 4 */             this.f16473e = j;
/* 8 */             this.cleanedAndPointers$volatile = i << 16;
                }

                @Override // p000.AbstractC2161ry
                /* JADX INFO: renamed from: g */
                public final boolean mo8328g() {
                    return f16472f.get(this) == mo3828l() && m8325d() != null;
                }

                /* JADX INFO: renamed from: k */
                public final boolean m8432k() {
                    return f16472f.addAndGet(this, -65536) == mo3828l() && m8325d() != null;
                }

                /* JADX INFO: renamed from: l */
                public abstract int mo3828l();

                /* JADX INFO: renamed from: m */
                public abstract void mo3829m(int i, CoroutineContext coroutineContext);

                /* JADX INFO: renamed from: n */
                public final void m8433n() {
/* 11 */            if (f16472f.incrementAndGet(this) == mo3828l()) {
/* 13 */                m8330i();
                    }
                }

                /* JADX INFO: renamed from: o */
                public final boolean m8434o() {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
                    int i;
/* 29 */            do {
/* 1 */                 atomicIntegerFieldUpdater = f16472f;
/* 3 */                 i = atomicIntegerFieldUpdater.get(this);
/* 11 */                if (i == mo3828l() && m8325d() != null) {
/* 20 */                    return false;
                        }
/* 29 */            } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
/* 31 */            return true;
                }
            }
