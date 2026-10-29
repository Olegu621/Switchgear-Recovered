            package io.sentry.transport;

            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Future;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: io.sentry.transport.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 5 */     public final class FutureC1687m implements Future {
                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 1 */             return true;
                }

                @Override // java.util.concurrent.Future
                public final Object get() {
/* 6 */             throw new CancellationException();
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 1 */             return true;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 1 */             return true;
                }

                @Override // java.util.concurrent.Future
/* 6 */         public final Object get(long j, TimeUnit timeUnit) {
/* 7 */             throw new CancellationException();
                }
            }
