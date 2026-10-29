            package com.google.android.gms.internal.auth;

            import android.os.Bundle;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaa extends zzj {
                final /* synthetic */ TaskCompletionSource zza;

                public zzaa(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.auth.zzk
                public final void zzb(Status status, Bundle bundle) {
/* 3 */             zzab.zzf(status, bundle, this.zza);
                }
            }
