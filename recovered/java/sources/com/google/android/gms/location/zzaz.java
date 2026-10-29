            package com.google.android.gms.location;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.internal.location.zzb;
            import com.google.android.gms.internal.location.zzc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzaz extends zzb implements zzba {
                public static zzba zzb(IBinder iBinder) {
/* 3 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                    return iInterfaceQueryLocalInterface instanceof zzba ? (zzba) iInterfaceQueryLocalInterface : new zzay(iBinder, "com.google.android.gms.location.ILocationCallback");
                }

                @Override // com.google.android.gms.internal.location.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 29 */                zzd((LocationResult) zzc.zzb(parcel, LocationResult.CREATOR));
                    } else {
/* 5 */                 if (i != 2) {
/* 7 */                     return false;
                        }
/* 17 */                zze((LocationAvailability) zzc.zzb(parcel, LocationAvailability.CREATOR));
                    }
/* 1 */             return true;
                }
            }
