            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.location.LocationSettingsResult;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzan extends zzb implements zzao {
                public zzan() {
/* 3 */             super("com.google.android.gms.location.internal.ISettingsCallbacks");
                }

                @Override // com.google.android.gms.internal.location.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 1) {
/* 16 */                return false;
                    }
/* 12 */            zzb((LocationSettingsResult) zzc.zzb(parcel, LocationSettingsResult.CREATOR));
/* 1 */             return true;
                }
            }
