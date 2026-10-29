            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import p000.InterfaceC0992hi;
            import p000.ia0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 31 */    final class zzgl extends zzl {
                private final InterfaceC0992hi zzdx;
                private final ia0 zziq;

                public zzgl(InterfaceC0992hi interfaceC0992hi, ia0 ia0Var) {
/* 4 */             this.zzdx = interfaceC0992hi;
/* 6 */             this.zziq = ia0Var;
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzfh zzfhVar) throws RemoteException {
/* 29 */            this.zzdx.setResult(new zzal(zzfhVar.zzhv ? new Status(-1, null, null, null) : Status.f3440e, new zzbi(zzfhVar.zzes)));
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 32 */        public final void zza(zzfl zzflVar) throws RemoteException {
/* 33 */            ia0 ia0Var = this.zziq;
                    if (ia0Var != null) {
/* 36 */                ia0Var.onProgress(zzflVar.zzhy, zzflVar.zzhz);
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 36 */        public final void zza(Status status) throws RemoteException {
/* 37 */            this.zzdx.setResult(new zzal(status, null));
                }
            }
