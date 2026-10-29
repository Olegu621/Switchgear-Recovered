            package com.google.android.gms.auth.account;

            import android.accounts.Account;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
                @Override // com.google.android.gms.internal.auth.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 26 */                Account account = (Account) com.google.android.gms.internal.auth.zzc.zza(parcel, Account.CREATOR);
/* 28 */                com.google.android.gms.internal.auth.zzc.zzb(parcel);
/* 31 */                zzb(account);
                    } else {
/* 5 */                 if (i != 2) {
/* 7 */                     return false;
                        }
/* 9 */                 boolean zZzf = com.google.android.gms.internal.auth.zzc.zzf(parcel);
/* 13 */                com.google.android.gms.internal.auth.zzc.zzb(parcel);
/* 16 */                zzc(zZzf);
                    }
/* 1 */             return true;
                }
            }
