            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.common.internal.ICancelToken;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.ja0;
            import p000.p22;
            import p000.v81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcu extends p22 {
                private final /* synthetic */ ja0 zzfs;
                private final /* synthetic */ int zzft;
                private final /* synthetic */ zzg zzfu;
                private final /* synthetic */ v81 zzfv;
                private final /* synthetic */ zzch zzfw;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzcu(zzch zzchVar, v81 v81Var, ja0 ja0Var, int i, zzg zzgVar, v81 v81Var2) {
/* 11 */            super(v81Var);
/* 1 */             this.zzfw = zzchVar;
/* 3 */             this.zzfs = ja0Var;
/* 5 */             this.zzft = i;
/* 7 */             this.zzfu = zzgVar;
/* 9 */             this.zzfv = v81Var2;
                }

                @Override // p000.p22
                public final void registerListener(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
                    ICancelToken zzuVar;
/* 34 */            zzec zzecVarZza = ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgj(this.zzfs.getDriveId(), this.zzft, 0), new zzdk(this.zzfw, this.zzfu, this.zzfv));
/* 38 */            zzg zzgVar = this.zzfu;
/* 40 */            IBinder iBinder = zzecVarZza.zzgs;
/* 42 */            int i = ICancelToken.Stub.f3504a;
/* 45 */            if (iBinder == null) {
/* 47 */                zzuVar = null;
                    } else {
/* 51 */                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
/* 64 */                zzuVar = iInterfaceQueryLocalInterface instanceof ICancelToken ? (ICancelToken) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzu(iBinder, "com.google.android.gms.common.internal.ICancelToken");
                    }
/* 67 */            zzgVar.setCancelToken(zzuVar);
/* 70 */            taskCompletionSource.setResult(null);
                }
            }
