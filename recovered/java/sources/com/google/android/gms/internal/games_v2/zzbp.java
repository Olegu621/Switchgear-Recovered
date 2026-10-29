            package com.google.android.gms.internal.games_v2;

            import android.app.Activity;
            import android.app.Application;
            import com.google.android.gms.tasks.Continuation;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C1020i9;
            import p000.bh3;
            import p000.py0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbp implements zzbm {
                private final Application zza;
                private final bh3 zzb;
                private final zzaw zzc;

                public zzbp(Application application, bh3 bh3Var, zzaw zzawVar, byte[] bArr) {
/* 4 */             this.zza = application;
/* 6 */             this.zzb = bh3Var;
/* 8 */             this.zzc = zzawVar;
                }

                private final zzs zzc() {
/* 3 */             Activity activityM1361a = this.zzb.m1361a();
/* 7 */             zzaw zzawVar = this.zzc;
                    return activityM1361a != null ? zzr.zza(activityM1361a, zzawVar.zzb) : zzr.zza(zzawVar.zza, zzawVar.zzb);
                }

                @Override // com.google.android.gms.internal.games_v2.zzbm
                public final Task zza(final zzy zzyVar) {
/* 5 */             final boolean z = false;
/* 6 */             if (zzyVar.zza() == 0 && !py0.m7609p0(this.zza)) {
/* 16 */                z = true;
                    }
/* 21 */            Task taskZza = zzc().zza(zzyVar, z);
/* 27 */            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 52 */            taskZza.continueWithTask(zzfe.zza(), new Continuation() { // from class: com.google.android.gms.internal.games_v2.zzbn
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) {
/* 7 */                     return this.zza.zzb(zzyVar, z, task);
                        }
                    }).addOnCompleteListener(zzfe.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbo
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
/* 1 */                     TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
/* 7 */                     if (task.isSuccessful()) {
/* 23 */                        taskCompletionSource2.trySetResult(zzbq.zzc(((zzaa) task.getResult()).zza()));
/* 26 */                        return;
                            }
/* 27 */                    Exception exception = task.getException();
/* 33 */                    if (exception instanceof C1020i9) {
/* 52 */                        taskCompletionSource2.trySetResult(zzbq.zzb(((C1020i9) exception).getStatus()));
                            } else {
/* 35 */                        zzfb.zza(exception);
/* 38 */                        taskCompletionSource2.trySetException(exception);
                            }
                        }
                    });
/* 55 */            return taskCompletionSource.getTask();
                }

                public final /* synthetic */ Task zzb(zzy zzyVar, boolean z, Task task) throws Exception {
/* 5 */             if (!task.isSuccessful()) {
/* 8 */                 Exception exception = task.getException();
/* 14 */                if ((exception instanceof C1020i9) && ((C1020i9) exception).getStatusCode() == 20) {
/* 32 */                    zzez.zza("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
/* 39 */                    return zzc().zza(zzyVar, z);
                        }
                    }
/* 27 */            return task;
                }
            }
