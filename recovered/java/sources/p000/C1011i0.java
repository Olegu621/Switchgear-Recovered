            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            /* JADX INFO: renamed from: i0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1011i0 extends yy1 {

                /* JADX INFO: renamed from: h */
                public final AtomicReferenceFieldUpdater f9378h;

                /* JADX INFO: renamed from: i */
                public final AtomicReferenceFieldUpdater f9379i;

                /* JADX INFO: renamed from: j */
                public final AtomicReferenceFieldUpdater f9380j;

                /* JADX INFO: renamed from: k */
                public final AtomicReferenceFieldUpdater f9381k;

                /* JADX INFO: renamed from: l */
                public final AtomicReferenceFieldUpdater f9382l;

                public C1011i0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
/* 4 */             this.f9378h = atomicReferenceFieldUpdater;
/* 6 */             this.f9379i = atomicReferenceFieldUpdater2;
/* 8 */             this.f9380j = atomicReferenceFieldUpdater3;
/* 10 */            this.f9381k = atomicReferenceFieldUpdater4;
/* 12 */            this.f9382l = atomicReferenceFieldUpdater5;
                }

                @Override // p000.yy1
                /* JADX INFO: renamed from: e */
                public final boolean mo4409e(AbstractC1873l0 abstractC1873l0, C0974h0 c0974h0, C0974h0 c0974h1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = this.f9381k;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(abstractC1873l0, c0974h0, c0974h1)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(abstractC1873l0) == c0974h0);
/* 17 */            return false;
                }

                @Override // p000.yy1
                /* JADX INFO: renamed from: f */
                public final boolean mo4410f(AbstractC1873l0 abstractC1873l0, Object obj, Object obj2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = this.f9382l;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(abstractC1873l0, obj, obj2)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(abstractC1873l0) == obj);
/* 17 */            return false;
                }

                @Override // p000.yy1
                /* JADX INFO: renamed from: g */
                public final boolean mo4411g(AbstractC1873l0 abstractC1873l0, C1813k0 c1813k0, C1813k0 c1813k1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = this.f9380j;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(abstractC1873l0, c1813k0, c1813k1)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(abstractC1873l0) == c1813k0);
/* 17 */            return false;
                }

                @Override // p000.yy1
                /* JADX INFO: renamed from: y */
                public final void mo4412y(C1813k0 c1813k0, C1813k0 c1813k1) {
/* 3 */             this.f9379i.lazySet(c1813k0, c1813k1);
                }

                @Override // p000.yy1
                /* JADX INFO: renamed from: z */
                public final void mo4413z(C1813k0 c1813k0, Thread thread) {
/* 3 */             this.f9378h.lazySet(c1813k0, thread);
                }
            }
