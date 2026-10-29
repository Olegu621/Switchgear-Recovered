            package com.google.android.gms.internal.auth;

            import android.os.RemoteException;
            import com.google.android.gms.auth.api.proxy.ProxyResponse;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbm extends zzbd {
                final /* synthetic */ TaskCompletionSource zza;

                public zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zza = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
                public final void zzb(ProxyResponse proxyResponse) throws RemoteException {
/* 11 */            jb1.m5738D(new Status(proxyResponse.f3360a, null, null, null), proxyResponse, this.zza);
                }
            }
