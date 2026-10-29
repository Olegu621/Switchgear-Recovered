            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.ja0;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzct extends um2 {
                private final /* synthetic */ ja0 zzfs;
                private final /* synthetic */ int zzft;

                public zzct(zzch zzchVar, ja0 ja0Var, int i) {
/* 1 */             this.zzfs = ja0Var;
/* 3 */             this.zzft = i;
                }

                @Override // p000.um2
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 28 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgj(this.zzfs.getDriveId(), this.zzft, 0), new zzhi(taskCompletionSource));
                }
            }
