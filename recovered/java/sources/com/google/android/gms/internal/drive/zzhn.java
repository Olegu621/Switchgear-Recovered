            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.gi1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhn extends zzhh<gi1> {
                public zzhn(TaskCompletionSource<gi1> taskCompletionSource) {
/* 1 */             super(taskCompletionSource);
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzft zzftVar) throws RemoteException {
/* 14 */            zzay().setResult(new gi1(zzftVar.zzau()));
                }
            }
