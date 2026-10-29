            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfc implements Runnable {
                zzff zza;

                public zzfc(zzff zzffVar) {
/* 4 */             this.zza = zzffVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzeu zzeuVar;
/* 3 */             zzff zzffVar = this.zza;
/* 5 */             if (zzffVar == null || (zzeuVar = zzffVar.zzc) == null) {
/* 127 */               return;
                    }
/* 16 */            this.zza = null;
/* 22 */            if (zzeuVar.isDone()) {
/* 24 */                zzffVar.zzp(zzeuVar);
/* 27 */                return;
                    }
                    try {
/* 1 */                 ScheduledFuture scheduledFuture = zzffVar.zzd;
/* 2 */                 zzffVar.zzd = null;
/* 36 */                String str = "Timed out";
/* 38 */                if (scheduledFuture != null) {
                            try {
/* 46 */                        long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
/* 54 */                        if (jAbs > 10) {
/* 69 */                            str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                                }
                            } catch (Throwable th) {
/* 119 */                       zzffVar.zzo(new zzfd(str, null));
/* 122 */                       throw th;
                            }
                        }
/* 105 */               zzffVar.zzo(new zzfd(str + ": " + zzeuVar.toString(), null));
/* 108 */               zzeuVar.cancel(true);
                    } catch (Throwable th2) {
/* 123 */               zzeuVar.cancel(true);
/* 126 */               throw th2;
                    }
                }
            }
