            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.f42;
            import p000.ka0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhk extends zzhh<ka0> {
                public zzhk(TaskCompletionSource<ka0> taskCompletionSource) {
/* 1 */             super(taskCompletionSource);
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzfn zzfnVar) throws RemoteException {
/* 1 */             TaskCompletionSource<ka0> taskCompletionSourceZzay = zzay();
/* 5 */             DriveId driveId = zzfnVar.getDriveId();
/* 11 */            if (driveId.f3640d != 0) {
/* 18 */                taskCompletionSourceZzay.setResult(new zzbs(driveId));
                    } else {
/* 24 */                f42.m3656l("This DriveId corresponds to a file. Call asDriveFile instead.");
                    }
                }
            }
