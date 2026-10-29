            package com.google.android.gms.internal.auth;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzas extends zzb implements zzat {
                public zzas() {
/* 3 */             super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
                }

                @Override // com.google.android.gms.internal.auth.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
                    switch (i) {
                        case 1:
/* 103 */                   Status status = (Status) zzc.zza(parcel, Status.CREATOR);
/* 105 */                   zzc.zzb(parcel);
/* 108 */                   zzh(status);
/* 111 */                   return true;
                        case 2:
/* 80 */                    Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
/* 88 */                    com.google.android.gms.auth.api.accounttransfer.zzw zzwVar = (com.google.android.gms.auth.api.accounttransfer.zzw) zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR);
/* 90 */                    zzc.zzb(parcel);
/* 93 */                    zzf(status2, zzwVar);
/* 111 */                   return true;
                        case 3:
/* 57 */                    Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
/* 65 */                    com.google.android.gms.auth.api.accounttransfer.zzo zzoVar = (com.google.android.gms.auth.api.accounttransfer.zzo) zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR);
/* 67 */                    zzc.zzb(parcel);
/* 70 */                    zzg(status3, zzoVar);
/* 111 */                   return true;
                        case 4:
/* 47 */                    zze();
/* 111 */                   return true;
                        case 5:
/* 38 */                    Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
/* 40 */                    zzc.zzb(parcel);
/* 43 */                    zzd(status4);
/* 111 */                   return true;
                        case 6:
/* 21 */                    byte[] bArrCreateByteArray = parcel.createByteArray();
/* 25 */                    zzc.zzb(parcel);
/* 28 */                    zzb(bArrCreateByteArray);
/* 111 */                   return true;
                        case 7:
/* 12 */                    DeviceMetaData deviceMetaData = (DeviceMetaData) zzc.zza(parcel, DeviceMetaData.CREATOR);
/* 14 */                    zzc.zzb(parcel);
/* 17 */                    zzc(deviceMetaData);
/* 111 */                   return true;
                        default:
/* 4 */                     return false;
                    }
                }
            }
