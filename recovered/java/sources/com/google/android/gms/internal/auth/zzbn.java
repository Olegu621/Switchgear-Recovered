            package com.google.android.gms.internal.auth;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbn extends zzbd {
                final /* synthetic */ TaskCompletionSource zza;

                public zzbn(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
                public final void zzc(String str) throws RemoteException {
/* 16 */            jb1.m5738D(str != null ? Status.f3440e : new Status(3006, null, null, null), str, this.zza);
                }
            }
