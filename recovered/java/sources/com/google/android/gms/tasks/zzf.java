            package com.google.android.gms.tasks;

            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzf<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {
                private final Executor zza;
                private final Continuation zzb;
                private final zzw zzc;

                public zzf(Executor executor, Continuation continuation, zzw zzwVar) {
/* 4 */             this.zza = executor;
/* 6 */             this.zzb = continuation;
/* 8 */             this.zzc = zzwVar;
                }

                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
/* 3 */             this.zzc.zzc();
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
/* 3 */             this.zzc.zza(exc);
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(TContinuationResult tcontinuationresult) {
/* 3 */             this.zzc.zzb(tcontinuationresult);
                }

                @Override // com.google.android.gms.tasks.zzq
                public final void zzc() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // com.google.android.gms.tasks.zzq
                public final void zzd(Task task) {
/* 8 */             this.zza.execute(new zze(this, task));
                }
            }
