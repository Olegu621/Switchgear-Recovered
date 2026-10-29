            package com.google.android.gms.tasks;

            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzo implements Runnable {
                final /* synthetic */ Task zza;
                final /* synthetic */ zzp zzb;

                public zzo(zzp zzpVar, Task task) {
/* 1 */             this.zzb = zzpVar;
/* 3 */             this.zza = task;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
/* 13 */                Task taskThen = this.zzb.zzb.then(this.zza.getResult());
/* 17 */                zzp zzpVar = this.zzb;
/* 19 */                if (taskThen == null) {
/* 28 */                    zzpVar.onFailure(new NullPointerException("Continuation returned null"));
/* 31 */                    return;
                        }
/* 32 */                Executor executor = TaskExecutors.zza;
/* 34 */                taskThen.addOnSuccessListener(executor, zzpVar);
/* 39 */                taskThen.addOnFailureListener(executor, this.zzb);
/* 44 */                taskThen.addOnCanceledListener(executor, this.zzb);
                    } catch (RuntimeExecutionException e) {
/* 68 */                boolean z = e.getCause() instanceof Exception;
/* 70 */                zzp zzpVar2 = this.zzb;
/* 72 */                if (z) {
/* 80 */                    zzpVar2.onFailure((Exception) e.getCause());
                        } else {
/* 84 */                    zzpVar2.onFailure(e);
                        }
                    } catch (CancellationException unused) {
/* 60 */                this.zzb.onCanceled();
                    } catch (Exception e2) {
/* 54 */                this.zzb.onFailure(e2);
                    }
                }
            }
