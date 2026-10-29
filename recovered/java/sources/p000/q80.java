            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q80 extends p72 {

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f15439i = AtomicIntegerFieldUpdater.newUpdater(q80.class, "_decision$volatile");
                private volatile /* synthetic */ int _decision$volatile;

                @Override // p000.p72, p000.z01
                /* JADX INFO: renamed from: g */
                public final void mo7346g(Object obj) {
/* 1 */             mo6307h(obj);
                }

                @Override // p000.p72, p000.z01
                /* JADX INFO: renamed from: h */
                public final void mo6307h(Object obj) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
/* 38 */            do {
/* 1 */                 atomicIntegerFieldUpdater = f15439i;
/* 3 */                 int i = atomicIntegerFieldUpdater.get(this);
/* 7 */                 if (i != 0) {
/* 10 */                    if (i == 1) {
/* 22 */                        xe2.m9759C(mz0.m6834b(this.f15010f), de3.m3016D(obj));
/* 25 */                        return;
                            } else {
/* 28 */                        f42.m3656l("Already resumed");
/* 31 */                        return;
                            }
                        }
/* 38 */            } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
                }
            }
