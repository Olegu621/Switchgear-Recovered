            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.hi1;
            import p000.la0;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdd extends um2 {
                private final /* synthetic */ hi1 zzfd;
                private final /* synthetic */ la0 zzfq;

                public zzdd(zzch zzchVar, hi1 hi1Var, la0 la0Var) {
/* 1 */             this.zzfd = hi1Var;
/* 3 */             this.zzfq = la0Var;
                }

                @Override // p000.um2
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 1 */             zzaw zzawVar = (zzaw) interfaceC2359x8;
/* 11 */            this.zzfd.f9087a.m2033D1(zzawVar.getContext());
/* 40 */            ((zzeo) zzawVar.getService()).zza(new zzhf(this.zzfq.getDriveId(), this.zzfd.f9087a), new zzhp(taskCompletionSource));
                }
            }
