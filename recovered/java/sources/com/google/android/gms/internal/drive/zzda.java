            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.fa0;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzda extends um2 {
                private final /* synthetic */ fa0 zzfx;

                public zzda(zzch zzchVar, fa0 fa0Var) {
/* 1 */             this.zzfx = fa0Var;
                }

                @Override // p000.um2
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 28 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzo(this.zzfx.zzi().f3632b, false), new zzhr(taskCompletionSource));
                }
            }
