            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import p000.InterfaceC2359x8;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzay extends zzav {
                private final /* synthetic */ zzee zzel;
                private final /* synthetic */ zzgs zzem;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzay(zzaw zzawVar, tr0 tr0Var, zzgs zzgsVar, zzee zzeeVar) {
/* 5 */             super(tr0Var);
/* 1 */             this.zzem = zzgsVar;
/* 3 */             this.zzel = zzeeVar;
                }

                @Override // p000.AbstractC0955gi
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 19 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(this.zzem, this.zzel, (String) null, new zzgy(this));
                }
            }
