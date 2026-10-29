            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzel extends zzen {
                public static zzeu zza(Object obj) {
/* 3 */             return new zzeo(obj);
                }

                public static zzeu zzb(zzeu zzeuVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
                    return zzeuVar.isDone() ? zzeuVar : zzff.zzs(zzeuVar, 28500L, timeUnit, scheduledExecutorService);
                }

                public static void zzc(zzeu zzeuVar, zzej zzejVar, Executor executor) {
/* 6 */             zzeuVar.zzb(new zzek(zzeuVar, zzejVar), executor);
                }
            }
