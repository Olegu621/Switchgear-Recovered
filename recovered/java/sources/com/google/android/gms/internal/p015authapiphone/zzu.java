            package com.google.android.gms.internal.p015authapiphone;

            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.IStatusCallback;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.i13;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzu extends IStatusCallback.Stub {
                final /* synthetic */ TaskCompletionSource zza;

                public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.common.api.internal.IStatusCallback
                public final void onResult(Status status) {
/* 1 */             int i = status.f3445a;
/* 3 */             TaskCompletionSource taskCompletionSource = this.zza;
/* 6 */             if (i == 6) {
/* 12 */                taskCompletionSource.trySetException(i13.m4438q(status));
                    } else {
/* 17 */                jb1.m5738D(status, null, taskCompletionSource);
                    }
                }
            }
