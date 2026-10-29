            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.drive.DriveId;
            import p000.InterfaceC2359x8;
            import p000.kb1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzai extends zzap {
                private final /* synthetic */ String zzdw;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzai(zzaf zzafVar, tr0 tr0Var, String str) {
/* 3 */             super(tr0Var);
/* 1 */             this.zzdw = str;
                }

                @Override // p000.AbstractC0955gi
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 7 */             zzeo zzeoVar = (zzeo) ((zzaw) interfaceC2359x8).getService();
/* 11 */            String str = this.zzdw;
/* 13 */            kb1.m6061n(str);
/* 35 */            zzeoVar.zza(new zzek(new DriveId(str, -1L, -1L, -1), false), new zzan(this));
                }
            }
