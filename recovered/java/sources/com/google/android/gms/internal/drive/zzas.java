            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import p000.InterfaceC0992hi;
            import p000.gi1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    final class zzas extends zzl {
                private final InterfaceC0992hi zzdx;

                public zzas(InterfaceC0992hi interfaceC0992hi) {
/* 4 */             this.zzdx = interfaceC0992hi;
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzft zzftVar) throws RemoteException {
/* 19 */            this.zzdx.setResult(new zzaq(Status.f3440e, new gi1(zzftVar.zzii), zzftVar.zzea));
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 22 */        public final void zza(Status status) throws RemoteException {
/* 23 */            this.zzdx.setResult(new zzaq(status, null, false));
                }
            }
