            package com.google.android.gms.internal.auth;

            import com.google.android.gms.auth.AccountChangeEventsResponse;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzz extends zzl {
                final /* synthetic */ TaskCompletionSource zza;

                public zzz(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.auth.zzm
                public final void zzb(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
/* 3 */             zzab.zzf(status, accountChangeEventsResponse, this.zza);
                }
            }
