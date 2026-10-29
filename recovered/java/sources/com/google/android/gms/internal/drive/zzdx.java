            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import p000.InterfaceC0992hi;
            import p000.gi1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    final class zzdx extends zzl {
                private final InterfaceC0992hi zzdx;

                public zzdx(InterfaceC0992hi interfaceC0992hi) {
/* 4 */             this.zzdx = interfaceC0992hi;
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzfv zzfvVar) throws RemoteException {
/* 18 */            this.zzdx.setResult(new zzaq(Status.f3440e, new gi1(zzfvVar.zzij), false));
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 21 */        public final void zza(Status status) throws RemoteException {
/* 22 */            this.zzdx.setResult(new zzaq(status, null, false));
                }
            }
