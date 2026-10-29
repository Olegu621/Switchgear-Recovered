            package com.google.android.gms.common.internal;

            import android.accounts.Account;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.internal.common.zza;
            import com.google.android.gms.internal.common.zzc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzt extends zza implements IAccountAccessor {
                @Override // com.google.android.gms.common.internal.IAccountAccessor
                public final Account zzb() throws RemoteException {
/* 6 */             Parcel parcelZzB = zzB(2, zza());
/* 16 */            Account account = (Account) zzc.zzb(parcelZzB, Account.CREATOR);
/* 18 */            parcelZzB.recycle();
/* 21 */            return account;
                }
            }
