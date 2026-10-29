            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.fa0;
            import p000.gn3;
            import p000.hi1;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcy extends um2 {
                private final /* synthetic */ hi1 zzew;
                private final /* synthetic */ fa0 zzfx;
                private final /* synthetic */ gn3 zzfy;

                public zzcy(zzch zzchVar, gn3 gn3Var, fa0 fa0Var, hi1 hi1Var) {
/* 1 */             this.zzfy = gn3Var;
/* 3 */             this.zzfx = fa0Var;
/* 5 */             this.zzew = hi1Var;
                }

                @Override // p000.um2
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 1 */             zzaw zzawVar = (zzaw) interfaceC2359x8;
                    try {
/* 5 */                 this.zzfy.getClass();
                    } catch (IllegalStateException e) {
/* 10 */                taskCompletionSource.setException(e);
                    }
/* 15 */            this.zzfx.zzj();
/* 26 */            this.zzew.f9087a.m2033D1(zzawVar.getContext());
/* 73 */            ((zzeo) zzawVar.getService()).zza(new zzm(this.zzfx.getDriveId(), this.zzew.f9087a, this.zzfx.zzi().f3632b, this.zzfx.zzi().f3635e, this.zzfy), new zzhr(taskCompletionSource));
                }
            }
