            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzff extends zzee {
                private zzeu zzc;
                private ScheduledFuture zzd;

                private zzff(zzeu zzeuVar) {
/* 4 */             this.zzc = zzeuVar;
                }

                public static zzeu zzs(zzeu zzeuVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
/* 3 */             zzff zzffVar = new zzff(zzeuVar);
/* 8 */             zzfc zzfcVar = new zzfc(zzffVar);
/* 17 */            zzffVar.zzd = scheduledExecutorService.schedule(zzfcVar, 28500L, timeUnit);
/* 21 */            zzeuVar.zzb(zzfcVar, zzed.INSTANCE);
/* 24 */            return zzffVar;
                }

                @Override // com.google.android.gms.internal.play_billing.zzdy
                public final String zzg() {
/* 1 */             zzeu zzeuVar = this.zzc;
/* 3 */             ScheduledFuture scheduledFuture = this.zzd;
/* 5 */             if (zzeuVar == null) {
/* 60 */                return null;
                    }
/* 15 */            String strM3784j = fm0.m3784j("inputFuture=[", zzeuVar.toString(), "]");
/* 19 */            if (scheduledFuture != null) {
/* 23 */                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
/* 31 */                if (delay > 0) {
/* 54 */                    return strM3784j + ", remaining delay=[" + delay + " ms]";
                        }
                    }
/* 59 */            return strM3784j;
                }

                @Override // com.google.android.gms.internal.play_billing.zzdy
                public final void zzm() {
/* 1 */             zzeu zzeuVar = this.zzc;
/* 14 */            if ((zzeuVar != null) & isCancelled()) {
/* 20 */                zzeuVar.cancel(zzq());
                    }
/* 23 */            ScheduledFuture scheduledFuture = this.zzd;
/* 25 */            if (scheduledFuture != null) {
/* 27 */                scheduledFuture.cancel(false);
                    }
/* 31 */            this.zzc = null;
/* 33 */            this.zzd = null;
                }
            }
