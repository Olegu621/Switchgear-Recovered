            package com.google.android.gms.internal.auth;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.AccountChangeEventsResponse;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzl extends zzb implements zzm {
                public zzl() {
/* 3 */             super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
                }

                @Override // com.google.android.gms.internal.auth.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 2) {
/* 28 */                return false;
                    }
/* 10 */            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
/* 18 */            AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.zza(parcel, AccountChangeEventsResponse.CREATOR);
/* 20 */            zzc.zzb(parcel);
/* 23 */            zzb(status, accountChangeEventsResponse);
/* 26 */            return true;
                }
            }
