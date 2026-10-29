            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcw extends um2 {
                private final /* synthetic */ int zzdv = 536870912;

                public zzcw(zzch zzchVar, int i) {
                }

                @Override // p000.um2
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 21 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzr(this.zzdv), new zzhi(taskCompletionSource));
                }
            }
