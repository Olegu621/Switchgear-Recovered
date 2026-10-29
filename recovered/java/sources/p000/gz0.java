            package p000;

            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class gz0 implements hz0 {

                /* JADX INFO: renamed from: a */
                public final Function1 f8853a;

                public gz0(Function1 function1) {
/* 4 */             this.f8853a = function1;
                }

                @Override // p000.hz0
                /* JADX INFO: renamed from: a */
                public final void mo277a(Throwable th) {
/* 3 */             this.f8853a.invoke(th);
                }

                public final String toString() {
/* 38 */            return "InternalCompletionHandler.UserSupplied[" + this.f8853a.getClass().getSimpleName() + '@' + k50.m5983t(this) + ']';
                }
            }
