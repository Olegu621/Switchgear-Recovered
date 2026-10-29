            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.f42;
            import p000.ja0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhj extends zzhh<ja0> {
                public zzhj(TaskCompletionSource<ja0> taskCompletionSource) {
/* 1 */             super(taskCompletionSource);
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzfn zzfnVar) throws RemoteException {
/* 1 */             TaskCompletionSource<ja0> taskCompletionSourceZzay = zzay();
/* 5 */             DriveId driveId = zzfnVar.getDriveId();
/* 12 */            if (driveId.f3640d != 1) {
/* 19 */                taskCompletionSourceZzay.setResult(new zzbn(driveId));
                    } else {
/* 25 */                f42.m3656l("This DriveId corresponds to a folder. Call asDriveFolder instead.");
                    }
                }
            }
