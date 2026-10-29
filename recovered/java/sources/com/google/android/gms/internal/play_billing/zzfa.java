            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.Callable;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    final class zzfa extends zzex implements zzew {
                final ScheduledExecutorService zza;

                public zzfa(ScheduledExecutorService scheduledExecutorService) {
/* 1 */             super(scheduledExecutorService);
/* 4 */             scheduledExecutorService.getClass();
/* 7 */             this.zza = scheduledExecutorService;
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 1 */             ScheduledExecutorService scheduledExecutorService = this.zza;
/* 4 */             zzfh zzfhVarZzr = zzfh.zzr(runnable, null);
/* 14 */            return new zzey(zzfhVarZzr, scheduledExecutorService.schedule(zzfhVarZzr, j, timeUnit));
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             zzez zzezVar = new zzez(runnable);
/* 15 */            return new zzey(zzezVar, this.zza.scheduleAtFixedRate(zzezVar, j, j2, timeUnit));
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             zzez zzezVar = new zzez(runnable);
/* 15 */            return new zzey(zzezVar, this.zza.scheduleWithFixedDelay(zzezVar, j, j2, timeUnit));
                }

                @Override // java.util.concurrent.ScheduledExecutorService
/* 17 */        public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 19 */            zzfh zzfhVar = new zzfh(callable);
/* 21 */            return new zzey(zzfhVar, this.zza.schedule(zzfhVar, j, timeUnit));
                }
            }
