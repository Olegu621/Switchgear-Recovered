            package com.google.android.gms.internal.ads_identifier;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzd extends zza implements zzf {
                public zzd(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                }

                @Override // com.google.android.gms.internal.ads_identifier.zzf
                public final String zzc() throws RemoteException {
/* 6 */             Parcel parcelZzb = zzb(1, zza());
/* 10 */            String string = parcelZzb.readString();
/* 14 */            parcelZzb.recycle();
/* 17 */            return string;
                }

                @Override // com.google.android.gms.internal.ads_identifier.zzf
                public final boolean zzd() throws RemoteException {
/* 6 */             Parcel parcelZzb = zzb(6, zza());
/* 10 */            boolean zZzb = zzc.zzb(parcelZzb);
/* 14 */            parcelZzb.recycle();
/* 17 */            return zZzb;
                }

                @Override // com.google.android.gms.internal.ads_identifier.zzf
                public final boolean zze(boolean z) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 6 */             zzc.zza(parcelZza, true);
/* 10 */            Parcel parcelZzb = zzb(2, parcelZza);
/* 14 */            boolean zZzb = zzc.zzb(parcelZzb);
/* 18 */            parcelZzb.recycle();
/* 21 */            return zZzb;
                }
            }
