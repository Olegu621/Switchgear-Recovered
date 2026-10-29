            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.la0;
            import p000.p22;
            import p000.v81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcp extends p22 {
                private final /* synthetic */ la0 zzfq;
                private final /* synthetic */ zzdi zzfr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzcp(zzch zzchVar, v81 v81Var, la0 la0Var, zzdi zzdiVar) {
/* 5 */             super(v81Var);
/* 1 */             this.zzfq = la0Var;
/* 3 */             this.zzfr = zzdiVar;
                }

                @Override // p000.p22
                public final /* synthetic */ void registerListener(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 33 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzj(1, this.zzfq.getDriveId()), this.zzfr.zzgh, (String) null, new zzhr(taskCompletionSource));
                }
            }
