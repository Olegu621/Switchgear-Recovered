            package com.google.android.gms.internal.games_v2;

            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.or0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbk {
                private final TaskCompletionSource zza;
                private final zzap zzb;

                public zzbk(zzap zzapVar, TaskCompletionSource taskCompletionSource, byte[] bArr) {
/* 4 */             this.zzb = zzapVar;
/* 6 */             this.zza = taskCompletionSource;
                }

                public final void zza(or0 or0Var) {
/* 16 */            this.zzb.zza(or0Var).addOnCompleteListener(zzfe.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbj
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
/* 3 */                     this.zza.zzb(task);
                        }
                    });
                }

                public final /* synthetic */ void zzb(Task task) {
/* 1 */             boolean zIsSuccessful = task.isSuccessful();
/* 5 */             TaskCompletionSource taskCompletionSource = this.zza;
/* 7 */             if (zIsSuccessful) {
/* 13 */                taskCompletionSource.setResult(task.getResult());
/* 16 */                return;
                    }
/* 17 */            Exception exception = task.getException();
/* 21 */            zzfb.zza(exception);
/* 24 */            taskCompletionSource.setException(exception);
                }

                public final void zzc(Exception exc) {
/* 3 */             this.zza.setException(exc);
                }
            }
