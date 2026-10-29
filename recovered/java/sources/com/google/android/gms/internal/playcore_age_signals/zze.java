            package com.google.android.gms.internal.playcore_age_signals;

            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public abstract class zze implements Runnable {
                private final TaskCompletionSource zza;

                public zze() {
/* 5 */             this.zza = null;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
/* 1 */                 zzb();
                    } catch (Exception e) {
/* 6 */                 zza(e);
                    }
                }

                public void zza(Exception exc) {
/* 1 */             TaskCompletionSource taskCompletionSource = this.zza;
/* 3 */             if (taskCompletionSource != null) {
/* 5 */                 taskCompletionSource.trySetException(exc);
                    }
                }

                public abstract void zzb();

                public final TaskCompletionSource zzc() {
/* 1 */             return this.zza;
                }

/* 7 */         public zze(TaskCompletionSource taskCompletionSource) {
                    this.zza = taskCompletionSource;
                }
            }
