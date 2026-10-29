            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhq extends zzhh<Boolean> {
                public zzhq(TaskCompletionSource<Boolean> taskCompletionSource) {
/* 1 */             super(taskCompletionSource);
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void onSuccess() throws RemoteException {
/* 7 */             zzay().setResult(Boolean.TRUE);
                }
            }
