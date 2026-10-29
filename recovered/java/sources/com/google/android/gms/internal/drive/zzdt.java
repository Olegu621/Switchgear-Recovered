            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import p000.InterfaceC2359x8;
            import p000.hi1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdt extends zzea {
                private final /* synthetic */ hi1 zzfd;
                private final /* synthetic */ zzdp zzgq;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzdt(zzdp zzdpVar, tr0 tr0Var, hi1 hi1Var) {
/* 6 */             super(zzdpVar, tr0Var, null);
/* 1 */             this.zzgq = zzdpVar;
/* 3 */             this.zzfd = hi1Var;
                }

                @Override // p000.AbstractC0955gi
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 1 */             zzaw zzawVar = (zzaw) interfaceC2359x8;
/* 11 */            this.zzfd.f9087a.m2033D1(zzawVar.getContext());
/* 38 */            ((zzeo) zzawVar.getService()).zza(new zzhf(this.zzgq.zzk, this.zzfd.f9087a), new zzdy(this));
                }
            }
