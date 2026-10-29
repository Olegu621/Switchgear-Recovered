            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.AccountChangeEventsRequest;
            import com.google.android.gms.common.api.internal.IStatusCallback;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzp extends zza implements IInterface {
                public zzp(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
                }

                public final void zzd(IStatusCallback iStatusCallback, zzbw zzbwVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, iStatusCallback);
/* 8 */             zzc.zzd(parcelZza, zzbwVar);
/* 12 */            zzc(2, parcelZza);
                }

                public final void zze(zzm zzmVar, AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzmVar);
/* 8 */             zzc.zzd(parcelZza, accountChangeEventsRequest);
/* 12 */            zzc(4, parcelZza);
                }

                public final void zzf(zzo zzoVar, Account account, String str, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzoVar);
/* 8 */             zzc.zzd(parcelZza, account);
/* 11 */            parcelZza.writeString(str);
/* 14 */            zzc.zzd(parcelZza, bundle);
/* 18 */            zzc(1, parcelZza);
                }

                public final void zzg(zzk zzkVar, Account account) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzkVar);
/* 8 */             zzc.zzd(parcelZza, account);
/* 12 */            zzc(6, parcelZza);
                }

                public final void zzh(zzk zzkVar, String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzkVar);
/* 8 */             parcelZza.writeString(str);
/* 12 */            zzc(3, parcelZza);
                }
            }
