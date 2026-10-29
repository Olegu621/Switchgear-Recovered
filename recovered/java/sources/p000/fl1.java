            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class fl1 implements InterfaceC0853dr, e63 {

                /* JADX INFO: renamed from: a */
                public final C0890er f8267a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ gl1 f8268b;

                public fl1(gl1 gl1Var, C0890er c0890er) {
/* 4 */             this.f8268b = gl1Var;
/* 6 */             this.f8267a = c0890er;
                }

                @Override // p000.e63
                /* JADX INFO: renamed from: a */
                public final void mo3335a(s82 s82Var, int i) {
/* 3 */             this.f8267a.mo3335a(s82Var, i);
                }

                @Override // p000.InterfaceC0853dr
                /* JADX INFO: renamed from: b */
                public final C2131r4 mo3178b(Object obj, Function1 function1) {
/* 6 */             gl1 gl1Var = this.f8268b;
/* 8 */             el1 el1Var = new el1(gl1Var, this, 1);
/* 13 */            C2131r4 c2131r4M3554G = this.f8267a.m3554G((Unit) obj, el1Var);
/* 17 */            if (c2131r4M3554G != null) {
/* 22 */                gl1.f8697i.set(gl1Var, null);
                    }
/* 25 */            return c2131r4M3554G;
                }

                @Override // p000.InterfaceC0853dr
                /* JADX INFO: renamed from: d */
                public final void mo3179d(Object obj, Function1 function1) {
/* 3 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gl1.f8697i;
/* 6 */             gl1 gl1Var = this.f8268b;
/* 8 */             atomicReferenceFieldUpdater.set(gl1Var, null);
/* 14 */            el1 el1Var = new el1(gl1Var, this, 0);
/* 19 */            this.f8267a.mo3179d((Unit) obj, el1Var);
                }

                @Override // p000.InterfaceC0853dr
                /* JADX INFO: renamed from: f */
                public final void mo3180f(Object obj) {
/* 3 */             this.f8267a.mo3180f(obj);
                }

                @Override // p000.c10
                public final CoroutineContext getContext() {
/* 3 */             return this.f8267a.f7845e;
                }

                @Override // p000.c10
                public final void resumeWith(Object obj) {
/* 3 */             this.f8267a.resumeWith(obj);
                }
            }
