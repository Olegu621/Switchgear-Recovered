            package com.google.android.gms.internal.p014authapi;

            import android.os.RemoteException;
            import com.google.android.gms.auth.api.identity.SavePasswordResult;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zban extends zbag {
                final /* synthetic */ TaskCompletionSource zba;

                public zban(zbao zbaoVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zba = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.p014authapi.zbah
                public final void zbb(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
/* 3 */             jb1.m5738D(status, savePasswordResult, this.zba);
                }
            }
