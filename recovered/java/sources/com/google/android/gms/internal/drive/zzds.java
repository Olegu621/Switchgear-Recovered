            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import java.util.List;
            import p000.InterfaceC2359x8;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzds extends zzav {
                private final /* synthetic */ List zzgb;
                private final /* synthetic */ zzdp zzgq;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzds(zzdp zzdpVar, tr0 tr0Var, List list) {
/* 5 */             super(tr0Var);
/* 1 */             this.zzgq = zzdpVar;
/* 3 */             this.zzgb = list;
                }

                @Override // p000.AbstractC0955gi
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 25 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgw(this.zzgq.zzk, this.zzgb), new zzgy(this));
                }
            }
