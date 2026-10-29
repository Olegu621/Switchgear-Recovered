            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.jb1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhr extends zzhh<Void> {
                public zzhr(TaskCompletionSource<Void> taskCompletionSource) {
/* 1 */             super(taskCompletionSource);
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void onSuccess() throws RemoteException {
/* 8 */             jb1.m5738D(Status.f3440e, null, zzay());
                }
            }
