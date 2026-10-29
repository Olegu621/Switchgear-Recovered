            package com.google.android.gms.internal.auth;

            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.IStatusCallback;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzx extends IStatusCallback.Stub {
                final /* synthetic */ TaskCompletionSource zza;

                public zzx(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.common.api.internal.IStatusCallback
                public final void onResult(Status status) {
/* 4 */             zzab.zzf(status, null, this.zza);
                }
            }
