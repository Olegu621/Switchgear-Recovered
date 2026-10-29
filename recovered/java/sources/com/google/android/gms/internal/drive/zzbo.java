            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.common.internal.ICancelToken;
            import p000.InterfaceC2359x8;
            import p000.ia0;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbo extends zzam {
                private final /* synthetic */ int zzdv;
                private final /* synthetic */ ia0 zzey;
                private final /* synthetic */ zzbn zzez;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbo(zzbn zzbnVar, tr0 tr0Var, int i, ia0 ia0Var) {
/* 7 */             super(tr0Var);
/* 1 */             this.zzez = zzbnVar;
/* 3 */             this.zzdv = i;
/* 5 */             this.zzey = ia0Var;
                }

                @Override // p000.AbstractC0955gi
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
                    ICancelToken zzuVar;
/* 34 */            IBinder iBinder = ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgj(this.zzez.getDriveId(), this.zzdv, 0), new zzgl(this, this.zzey)).zzgs;
/* 36 */            int i = ICancelToken.Stub.f3504a;
/* 38 */            if (iBinder == null) {
/* 40 */                zzuVar = null;
                    } else {
/* 44 */                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
/* 58 */                zzuVar = iInterfaceQueryLocalInterface instanceof ICancelToken ? (ICancelToken) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzu(iBinder, "com.google.android.gms.common.internal.ICancelToken");
                    }
/* 62 */            setCancelToken(zzuVar);
                }
            }
