            package com.google.android.gms.tasks;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public class TaskCompletionSource<TResult> {
                private final zzw zza = new zzw();

                public TaskCompletionSource(CancellationToken cancellationToken) {
/* 16 */            cancellationToken.onCanceledRequested(new zzs(this));
                }

                public Task<TResult> getTask() {
/* 1 */             return this.zza;
                }

                public void setException(Exception exc) {
/* 3 */             this.zza.zza(exc);
                }

                public void setResult(TResult tresult) {
/* 3 */             this.zza.zzb(tresult);
                }

                public boolean trySetException(Exception exc) {
/* 3 */             return this.zza.zzd(exc);
                }

                public boolean trySetResult(TResult tresult) {
/* 3 */             return this.zza.zze(tresult);
                }

/* 19 */        public TaskCompletionSource() {
                }
            }
