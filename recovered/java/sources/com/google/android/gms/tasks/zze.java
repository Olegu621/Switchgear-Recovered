            package com.google.android.gms.tasks;

            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zze implements Runnable {
                final /* synthetic */ Task zza;
                final /* synthetic */ zzf zzb;

                public zze(zzf zzfVar, Task task) {
/* 1 */             this.zzb = zzfVar;
/* 3 */             this.zza = task;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
/* 13 */                Task task = (Task) this.zzb.zzb.then(this.zza);
/* 15 */                zzf zzfVar = this.zzb;
/* 17 */                if (task == null) {
/* 26 */                    zzfVar.onFailure(new NullPointerException("Continuation returned null"));
/* 29 */                    return;
                        }
/* 30 */                Executor executor = TaskExecutors.zza;
/* 32 */                task.addOnSuccessListener(executor, zzfVar);
/* 37 */                task.addOnFailureListener(executor, this.zzb);
/* 42 */                task.addOnCanceledListener(executor, this.zzb);
                    } catch (RuntimeExecutionException e) {
/* 64 */                boolean z = e.getCause() instanceof Exception;
/* 66 */                zzf zzfVar2 = this.zzb;
/* 68 */                if (z) {
/* 80 */                    zzfVar2.zzc.zza((Exception) e.getCause());
                        } else {
/* 88 */                    zzfVar2.zzc.zza(e);
                        }
                    } catch (Exception e2) {
/* 56 */                this.zzb.zzc.zza(e2);
                    }
                }
            }
