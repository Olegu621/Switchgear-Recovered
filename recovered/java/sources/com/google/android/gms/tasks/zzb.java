            package com.google.android.gms.tasks;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzb extends CancellationToken {
                private final zzw zza = new zzw();

                @Override // com.google.android.gms.tasks.CancellationToken
                public final boolean isCancellationRequested() {
/* 3 */             return this.zza.isComplete();
                }

                @Override // com.google.android.gms.tasks.CancellationToken
                public final CancellationToken onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener) {
/* 10 */            this.zza.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new zza(this, onTokenCanceledListener));
/* 13 */            return this;
                }

                public final void zza() {
/* 4 */             this.zza.zze(null);
                }
            }
