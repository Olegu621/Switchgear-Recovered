            package com.google.android.gms.auth.account;

            import android.accounts.Account;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc extends com.google.android.gms.internal.auth.zza implements zze {
                @Override // com.google.android.gms.auth.account.zze
                /* JADX INFO: renamed from: b0 */
                public final void mo1989b0(boolean z) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             com.google.android.gms.internal.auth.zzc.zzc(parcelZza, z);
/* 9 */             zzc(1, parcelZza);
                }

                @Override // com.google.android.gms.auth.account.zze
                /* JADX INFO: renamed from: e0 */
                public final void mo1990e0(zzb zzbVar, String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             com.google.android.gms.internal.auth.zzc.zze(parcelZza, zzbVar);
/* 8 */             parcelZza.writeString(str);
/* 12 */            zzc(2, parcelZza);
                }

                @Override // com.google.android.gms.auth.account.zze
                /* JADX INFO: renamed from: h0 */
                public final void mo1991h0(zzb zzbVar, Account account) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             com.google.android.gms.internal.auth.zzc.zze(parcelZza, zzbVar);
/* 8 */             com.google.android.gms.internal.auth.zzc.zzd(parcelZza, account);
/* 12 */            zzc(3, parcelZza);
                }
            }
