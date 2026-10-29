            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.Delayed;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzey extends zzeh implements ScheduledFuture, zzeu {
                private final ScheduledFuture zza;

                public zzey(zzeu zzeuVar, ScheduledFuture scheduledFuture) {
/* 1 */             super(zzeuVar);
/* 4 */             this.zza = scheduledFuture;
                }

                @Override // com.google.android.gms.internal.play_billing.zzeg, java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 5 */             boolean zCancel = zzc().cancel(z);
/* 9 */             if (zCancel) {
/* 13 */                this.zza.cancel(z);
                    }
/* 16 */            return zCancel;
                }

                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
/* 5 */             return this.zza.compareTo(delayed);
                }

                @Override // java.util.concurrent.Delayed
                public final long getDelay(TimeUnit timeUnit) {
/* 3 */             return this.zza.getDelay(timeUnit);
                }
            }
