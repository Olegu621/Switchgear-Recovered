            package p000;

            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i80 extends RuntimeException {

                /* JADX INFO: renamed from: a */
                public final transient CoroutineContext f9496a;

                public i80(CoroutineContext coroutineContext) {
/* 4 */             this.f9496a = coroutineContext;
                }

                @Override // java.lang.Throwable
                public final Throwable fillInStackTrace() {
/* 4 */             setStackTrace(new StackTraceElement[0]);
/* 7 */             return this;
                }

                @Override // java.lang.Throwable
                public final String getLocalizedMessage() {
/* 3 */             return this.f9496a.toString();
                }
            }
