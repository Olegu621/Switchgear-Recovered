            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.drive.DriveId;
            import p000.InterfaceC2359x8;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzba extends zzav {
                private final /* synthetic */ DriveId zzen;
                private final /* synthetic */ int zzeo = 1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzba(zzaw zzawVar, tr0 tr0Var, DriveId driveId, int i) {
/* 6 */             super(tr0Var);
/* 1 */             this.zzen = driveId;
                }

                @Override // p000.AbstractC0955gi
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 24 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgs(this.zzen, this.zzeo), (zzes) null, (String) null, new zzgy(this));
                }
            }
