            package p000;

            import java.util.concurrent.locks.LockSupport;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: wj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2333wj extends AbstractC1010i {

                /* JADX INFO: renamed from: f */
                public final Thread f18657f;

                /* JADX INFO: renamed from: i */
                public final ze0 f18658i;

                public C2333wj(CoroutineContext coroutineContext, Thread thread, ze0 ze0Var) {
/* 2 */             super(coroutineContext, true);
/* 5 */             this.f18657f = thread;
/* 7 */             this.f18658i = ze0Var;
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: g */
                public final void mo7346g(Object obj) {
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 5 */             Thread thread = this.f18657f;
/* 11 */            if (Intrinsics.m6216a(threadCurrentThread, thread)) {
/* 16 */                return;
                    }
/* 13 */            LockSupport.unpark(thread);
                }
            }
