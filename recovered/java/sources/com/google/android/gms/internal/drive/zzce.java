            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import p000.InterfaceC0992hi;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     final class zzce extends zzl {
                private final InterfaceC0992hi zzdx;
                private final /* synthetic */ zzcb zzfk;

                private zzce(zzcb zzcbVar, InterfaceC0992hi interfaceC0992hi) {
/* 1 */             this.zzfk = zzcbVar;
/* 6 */             this.zzdx = interfaceC0992hi;
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzfj zzfjVar) throws RemoteException {
/* 15 */            this.zzdx.setResult(new zzcf(this.zzfk, Status.f3440e, zzfjVar.zzhw, null));
                }

/* 8 */         public /* synthetic */ zzce(zzcb zzcbVar, InterfaceC0992hi interfaceC0992hi, zzcc zzccVar) {
/* 9 */             this(zzcbVar, interfaceC0992hi);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 18 */        public final void zza(Status status) throws RemoteException {
/* 19 */            this.zzdx.setResult(new zzcf(this.zzfk, status, null, 0 == true ? 1 : 0));
                }
            }
