            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import p000.InterfaceC2359x8;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbm extends zzav {
                private final /* synthetic */ zzbi zzev;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbm(zzbi zzbiVar, tr0 tr0Var) {
/* 3 */             super(tr0Var);
/* 1 */             this.zzev = zzbiVar;
                }

                @Override // p000.AbstractC0955gi
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 28 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzo(this.zzev.zzes.f3632b, false), new zzgy(this));
                }
            }
