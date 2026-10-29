            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.la0;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcs extends um2 {
                private final /* synthetic */ la0 zzfq;

                public zzcs(zzch zzchVar, la0 la0Var) {
/* 1 */             this.zzfq = la0Var;
                }

                @Override // p000.um2
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 27 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgs(this.zzfq.getDriveId(), 1), (zzes) null, (String) null, new zzhr(taskCompletionSource));
                }
            }
