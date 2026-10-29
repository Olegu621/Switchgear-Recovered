            package com.google.android.gms.internal.play_billing;

            import java.util.List;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.TimeUnit;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class zzex extends zzec {
                private final ExecutorService zza;

                public zzex(ExecutorService executorService) {
/* 4 */             executorService.getClass();
/* 7 */             this.zza = executorService;
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
/* 3 */             return this.zza.awaitTermination(j, timeUnit);
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 3 */             this.zza.execute(runnable);
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean isShutdown() {
/* 3 */             return this.zza.isShutdown();
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean isTerminated() {
/* 3 */             return this.zza.isTerminated();
                }

                @Override // java.util.concurrent.ExecutorService
                public final void shutdown() {
/* 3 */             this.zza.shutdown();
                }

                @Override // java.util.concurrent.ExecutorService
                public final List shutdownNow() {
/* 3 */             return this.zza.shutdownNow();
                }

                public final String toString() {
/* 15 */            return pm2.m7489l(super.toString(), "[", String.valueOf(this.zza), "]");
                }
            }
