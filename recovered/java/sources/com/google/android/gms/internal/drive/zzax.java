            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import p000.InterfaceC2359x8;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzax extends zzav {
                private final /* synthetic */ zzj zzek;
                private final /* synthetic */ zzee zzel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzax(zzaw zzawVar, tr0 tr0Var, zzj zzjVar, zzee zzeeVar) {
/* 5 */             super(tr0Var);
/* 1 */             this.zzek = zzjVar;
/* 3 */             this.zzel = zzeeVar;
                }

                @Override // p000.AbstractC0955gi
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 19 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(this.zzek, this.zzel, (String) null, new zzgy(this));
                }
            }
