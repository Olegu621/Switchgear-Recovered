            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import p000.InterfaceC2359x8;
            import p000.gn3;
            import p000.hi1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbk extends zzav {
                private final /* synthetic */ zzbi zzev;
                private final /* synthetic */ hi1 zzew;
                private final /* synthetic */ gn3 zzex;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbk(zzbi zzbiVar, tr0 tr0Var, hi1 hi1Var, gn3 gn3Var) {
/* 7 */             super(tr0Var);
/* 1 */             this.zzev = zzbiVar;
/* 3 */             this.zzew = hi1Var;
/* 5 */             this.zzex = gn3Var;
                }

                @Override // p000.AbstractC0955gi
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 1 */             zzaw zzawVar = (zzaw) interfaceC2359x8;
/* 11 */            this.zzew.f9087a.m2033D1(zzawVar.getContext());
/* 60 */            ((zzeo) zzawVar.getService()).zza(new zzm(this.zzev.zzes.f3634d, this.zzew.f9087a, this.zzev.zzes.f3632b, this.zzev.zzes.f3635e, this.zzex), new zzgy(this));
                }
            }
