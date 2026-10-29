            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.drive.query.Query;
            import p000.InterfaceC2359x8;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzag extends zzar {
                private final /* synthetic */ Query zzdu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzag(zzaf zzafVar, tr0 tr0Var, Query query) {
/* 3 */             super(tr0Var);
/* 1 */             this.zzdu = query;
                }

                @Override // p000.AbstractC0955gi
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 21 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgq(this.zzdu), new zzas(this));
                }
            }
