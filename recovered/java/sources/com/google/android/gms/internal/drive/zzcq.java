            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.cy2;
            import p000.la0;
            import p000.t81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcq extends cy2 {
                private final /* synthetic */ la0 zzfq;
                private final /* synthetic */ zzdi zzfr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzcq(zzch zzchVar, t81 t81Var, la0 la0Var, zzdi zzdiVar) {
/* 5 */             super(t81Var);
/* 1 */             this.zzfq = la0Var;
/* 3 */             this.zzfr = zzdiVar;
                }

                @Override // p000.cy2
                public final /* synthetic */ void unregisterListener(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 33 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgs(this.zzfq.getDriveId(), 1), this.zzfr.zzgh, (String) null, new zzhq(taskCompletionSource));
                }
            }
