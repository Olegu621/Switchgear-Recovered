            package com.google.android.gms.internal.p015authapiphone;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.internal.IStatusCallback;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzh extends zza implements IInterface {
                public zzh(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                }

                public final void zzc(zze zzeVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzb(parcelZza, zzeVar);
/* 9 */             zzb(4, parcelZza);
                }

                public final void zzd(String str, zzg zzgVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             zzc.zzb(parcelZza, zzgVar);
/* 12 */            zzb(5, parcelZza);
                }

                public final void zze(IStatusCallback iStatusCallback) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzb(parcelZza, iStatusCallback);
/* 9 */             zzb(3, parcelZza);
                }

                public final void zzf(IStatusCallback iStatusCallback) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzb(parcelZza, iStatusCallback);
/* 9 */             zzb(6, parcelZza);
                }

                public final void zzg(zzj zzjVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzb(parcelZza, zzjVar);
/* 9 */             zzb(1, parcelZza);
                }

                public final void zzh(String str, zzj zzjVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             zzc.zzb(parcelZza, zzjVar);
/* 12 */            zzb(2, parcelZza);
                }
            }
