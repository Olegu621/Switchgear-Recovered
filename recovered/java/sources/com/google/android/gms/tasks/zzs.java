            package com.google.android.gms.tasks;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzs implements OnTokenCanceledListener {
                final /* synthetic */ TaskCompletionSource zza;

                public zzs(TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
/* 7 */             this.zza.zza.zzc();
                }
            }
