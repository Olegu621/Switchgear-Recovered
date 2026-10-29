            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.la0;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdc extends um2 {
                private final /* synthetic */ la0 zzfq;
                private final /* synthetic */ boolean zzga = false;

                public zzdc(zzch zzchVar, la0 la0Var, boolean z) {
/* 1 */             this.zzfq = la0Var;
                }

                @Override // p000.um2
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 27 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzek(this.zzfq.getDriveId(), this.zzga), new zzhp(taskCompletionSource));
                }
            }
