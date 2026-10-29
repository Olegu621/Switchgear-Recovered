            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class xx1 extends AbstractC1010i implements InterfaceC2509ys, m92 {

                /* JADX INFO: renamed from: f */
                public final C2554zk f19390f;

                public xx1(CoroutineContext coroutineContext, C2554zk c2554zk) {
/* 2 */             super(coroutineContext, true);
/* 5 */             this.f19390f = c2554zk;
                }

                @Override // p000.AbstractC1010i
                /* JADX INFO: renamed from: U */
                public final void mo4403U(boolean z, Throwable th) {
/* 8 */             if (this.f19390f.m10383g(false, th) || z) {
/* 17 */                return;
                    }
/* 14 */            b40.m1231o(th, this.f9377e);
                }

                @Override // p000.AbstractC1010i
                /* JADX INFO: renamed from: V */
                public final void mo4404V(Object obj) {
/* 7 */             this.f19390f.m10383g(false, null);
                }

                @Override // p000.m92
                /* JADX INFO: renamed from: a */
                public final Object mo6628a(c10 c10Var, Object obj) {
/* 3 */             return this.f19390f.mo6628a(c10Var, obj);
                }

                @Override // p000.z01, p000.h01
                public final void cancel(CancellationException cancellationException) {
/* 5 */             if (isCancelled()) {
/* 7 */                 return;
                    }
/* 8 */             if (cancellationException == null) {
/* 17 */                cancellationException = new i01(mo4407m(), null, this);
                    }
/* 20 */            mo10035k(cancellationException);
                }

                @Override // p000.m92
                /* JADX INFO: renamed from: e */
                public final Object mo6629e(Object obj) {
/* 3 */             return this.f19390f.mo6629e(obj);
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: k */
                public final void mo10035k(CancellationException cancellationException) {
/* 1 */             CancellationException cancellationExceptionM10235Q = z01.m10235Q(this, cancellationException);
/* 8 */             this.f19390f.m10383g(true, cancellationExceptionM10235Q);
/* 11 */            m10251j(cancellationExceptionM10235Q);
                }
            }
