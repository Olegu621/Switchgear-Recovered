            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import p000.InterfaceC2359x8;
            import p000.hi1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbu extends zzca {
                private final /* synthetic */ hi1 zzfd;
                private final /* synthetic */ zzbs zzfh;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbu(zzbs zzbsVar, tr0 tr0Var, hi1 hi1Var) {
/* 5 */             super(tr0Var);
/* 1 */             this.zzfh = zzbsVar;
/* 3 */             this.zzfd = hi1Var;
                }

                @Override // p000.AbstractC0955gi
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 1 */             zzaw zzawVar = (zzaw) interfaceC2359x8;
/* 11 */            this.zzfd.f9087a.m2033D1(zzawVar.getContext());
/* 40 */            ((zzeo) zzawVar.getService()).zza(new zzy(this.zzfh.getDriveId(), this.zzfd.f9087a), new zzbw(this));
                }
            }
