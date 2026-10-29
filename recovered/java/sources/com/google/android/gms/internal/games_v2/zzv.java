            package com.google.android.gms.internal.games_v2;

            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C1020i9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzv extends zzm {
                final /* synthetic */ TaskCompletionSource zza;

                public zzv(zzw zzwVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.games_v2.zzm, com.google.android.gms.internal.games_v2.zzad
                public final void zzb(Status status, zzaa zzaaVar) {
/* 1 */             TaskCompletionSource taskCompletionSource = this.zza;
/* 3 */             if (zzaaVar == null) {
/* 10 */                taskCompletionSource.setException(new C1020i9(status));
                    } else {
/* 14 */                taskCompletionSource.setResult(zzaaVar);
                    }
                }
            }
