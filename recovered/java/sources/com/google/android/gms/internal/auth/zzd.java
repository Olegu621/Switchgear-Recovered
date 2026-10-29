            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.AccountChangeEventsRequest;
            import com.google.android.gms.auth.AccountChangeEventsResponse;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzd extends zza implements zzf {
                public zzd(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.auth.IAuthManagerService");
                }

                @Override // com.google.android.gms.internal.auth.zzf
                public final Bundle zzd(String str, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             zzc.zzd(parcelZza, bundle);
/* 12 */            Parcel parcelZzb = zzb(2, parcelZza);
/* 22 */            Bundle bundle2 = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
/* 24 */            parcelZzb.recycle();
/* 27 */            return bundle2;
                }

                @Override // com.google.android.gms.internal.auth.zzf
                public final Bundle zze(Account account, String str, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzd(parcelZza, account);
/* 8 */             parcelZza.writeString(str);
/* 11 */            zzc.zzd(parcelZza, bundle);
/* 15 */            Parcel parcelZzb = zzb(5, parcelZza);
/* 25 */            Bundle bundle2 = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
/* 27 */            parcelZzb.recycle();
/* 30 */            return bundle2;
                }

                @Override // com.google.android.gms.internal.auth.zzf
                public final Bundle zzf(Account account) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzd(parcelZza, account);
/* 9 */             Parcel parcelZzb = zzb(7, parcelZza);
/* 19 */            Bundle bundle = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
/* 21 */            parcelZzb.recycle();
/* 24 */            return bundle;
                }

                @Override // com.google.android.gms.internal.auth.zzf
                public final Bundle zzg(String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 10 */            Parcel parcelZzb = zzb(8, parcelZza);
/* 20 */            Bundle bundle = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
/* 22 */            parcelZzb.recycle();
/* 25 */            return bundle;
                }

                @Override // com.google.android.gms.internal.auth.zzf
                public final AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzd(parcelZza, accountChangeEventsRequest);
/* 9 */             Parcel parcelZzb = zzb(3, parcelZza);
/* 19 */            AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.zza(parcelZzb, AccountChangeEventsResponse.CREATOR);
/* 21 */            parcelZzb.recycle();
/* 24 */            return accountChangeEventsResponse;
                }
            }
