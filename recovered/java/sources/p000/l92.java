            package p000;

            import java.util.concurrent.atomic.AtomicReferenceArray;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class l92 extends s82 {

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ AtomicReferenceArray f13158g;

                public l92(long j, l92 l92Var, int i) {
/* 1 */             super(j, l92Var, i);
/* 11 */            this.f13158g = new AtomicReferenceArray(k92.f12664f);
                }

                @Override // p000.s82
                /* JADX INFO: renamed from: l */
                public final int mo3828l() {
/* 1 */             return k92.f12664f;
                }

                @Override // p000.s82
                /* JADX INFO: renamed from: m */
                public final void mo3829m(int i, CoroutineContext coroutineContext) {
/* 5 */             this.f13158g.set(i, k92.f12663e);
/* 8 */             m8433n();
                }

                public final String toString() {
/* 30 */            return "SemaphoreSegment[id=" + this.f16473e + ", hashCode=" + hashCode() + ']';
                }
            }
