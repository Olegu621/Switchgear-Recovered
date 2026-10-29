            package p000;

            import java.util.concurrent.CancellationException;
            
            /* JADX INFO: renamed from: a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0000a extends CancellationException {

                /* JADX INFO: renamed from: a */
                public final transient Object f0a;

                public C0000a(hk0 hk0Var) {
/* 3 */             super("Flow was aborted, no more elements needed");
/* 6 */             this.f0a = hk0Var;
                }

                @Override // java.lang.Throwable
                public final Throwable fillInStackTrace() {
/* 4 */             setStackTrace(new StackTraceElement[0]);
/* 7 */             return this;
                }
            }
