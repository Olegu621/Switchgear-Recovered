            package p000;

            import java.util.concurrent.atomic.AtomicReferenceArray;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: renamed from: ft */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0929ft extends s82 {

                /* JADX INFO: renamed from: g */
                public final C2554zk f8344g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ AtomicReferenceArray f8345h;

                public C0929ft(long j, C0929ft c0929ft, C2554zk c2554zk, int i) {
/* 1 */             super(j, c0929ft, i);
/* 4 */             this.f8344g = c2554zk;
/* 15 */            this.f8345h = new AtomicReferenceArray(AbstractC0184bl.f2497b * 2);
                }

                @Override // p000.s82
                /* JADX INFO: renamed from: l */
                public final int mo3828l() {
/* 1 */             return AbstractC0184bl.f2497b;
                }

                @Override // p000.s82
                /* JADX INFO: renamed from: m */
                public final void mo3829m(int i, CoroutineContext coroutineContext) {
                    C2554zk c2554zk;
/* 1 */             int i2 = AbstractC0184bl.f2497b;
/* 7 */             boolean z = i >= i2;
/* 8 */             if (z) {
/* 10 */                i -= i2;
                    }
/* 15 */            this.f8345h.get(i * 2);
                    while (true) {
/* 18 */                Object objM3831q = m3831q(i);
/* 22 */                boolean z2 = objM3831q instanceof e63;
/* 24 */                c2554zk = this.f8344g;
/* 27 */                if (z2 || (objM3831q instanceof f63)) {
/* 92 */                    if (m3830p(i, objM3831q, z ? AbstractC0184bl.f2505j : AbstractC0184bl.f2506k)) {
/* 94 */                        m3833s(i, null);
/* 99 */                        m3832r(i, !z);
/* 102 */                       if (z) {
/* 104 */                           c2554zk.getClass();
/* 107 */                           return;
                                }
/* 107 */                       return;
                            }
                        } else {
/* 36 */                    if (objM3831q == AbstractC0184bl.f2505j || objM3831q == AbstractC0184bl.f2506k) {
                                break;
                            }
/* 45 */                    if (objM3831q != AbstractC0184bl.f2502g && objM3831q != AbstractC0184bl.f2501f) {
/* 54 */                        if (objM3831q == AbstractC0184bl.f2504i || objM3831q == AbstractC0184bl.f2499d || objM3831q == AbstractC0184bl.f2507l) {
/* 107 */                           return;
                                }
/* 68 */                        ds0.m3201r(objM3831q, "unexpected state: ");
/* 71 */                        return;
                            }
                        }
                    }
/* 72 */            m3833s(i, null);
/* 75 */            if (z) {
/* 77 */                c2554zk.getClass();
                    }
                }

                /* JADX INFO: renamed from: p */
                public final boolean m3830p(int i, Object obj, Object obj2) {
                    AtomicReferenceArray atomicReferenceArray;
/* 4 */             int i2 = (i * 2) + 1;
/* 18 */            do {
/* 5 */                 atomicReferenceArray = this.f8345h;
/* 11 */                if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
/* 3 */                     return true;
                        }
/* 18 */            } while (atomicReferenceArray.get(i2) == obj);
/* 20 */            return false;
                }

                /* JADX INFO: renamed from: q */
                public final Object m3831q(int i) {
/* 7 */             return this.f8345h.get((i * 2) + 1);
                }

                /* JADX INFO: renamed from: r */
                public final void m3832r(int i, boolean z) {
/* 1 */             if (z) {
/* 3 */                 C2554zk c2554zk = this.f8344g;
/* 5 */                 c2554zk.getClass();
/* 16 */                c2554zk.m10380K((this.f16473e * ((long) AbstractC0184bl.f2497b)) + ((long) i));
                    }
/* 19 */            m8433n();
                }

                /* JADX INFO: renamed from: s */
                public final void m3833s(int i, Object obj) {
/* 5 */             this.f8345h.set(i * 2, obj);
                }

                /* JADX INFO: renamed from: t */
                public final void m3834t(int i, Object obj) {
/* 7 */             this.f8345h.set((i * 2) + 1, obj);
                }
            }
