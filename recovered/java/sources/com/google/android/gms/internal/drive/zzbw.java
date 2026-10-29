            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import p000.InterfaceC0992hi;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    final class zzbw extends zzl {
                private final InterfaceC0992hi zzdx;

                public zzbw(InterfaceC0992hi interfaceC0992hi) {
/* 4 */             this.zzdx = interfaceC0992hi;
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzfn zzfnVar) throws RemoteException {
/* 17 */            this.zzdx.setResult(new zzbz(Status.f3440e, new zzbs(zzfnVar.zzdd)));
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 20 */        public final void zza(Status status) throws RemoteException {
/* 21 */            this.zzdx.setResult(new zzbz(status, null));
                }
            }
