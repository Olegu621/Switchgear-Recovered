            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public final class zzhl extends zzhh<DriveId> {
                public zzhl(TaskCompletionSource<DriveId> taskCompletionSource) {
/* 1 */             super(taskCompletionSource);
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzfy zzfyVar) throws RemoteException {
/* 18 */            zzay().setResult(new zzaa(zzfyVar.zzaw()).getDriveId());
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 21 */        public final void zza(zzfn zzfnVar) throws RemoteException {
/* 22 */            zzay().setResult(zzfnVar.getDriveId());
                }
            }
