            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzah extends zzb implements zzai {
                public zzah() {
/* 3 */             super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                }

                @Override // com.google.android.gms.internal.location.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 21 */                zzb((zzaa) zzc.zzb(parcel, zzaa.CREATOR));
                    } else {
/* 5 */                 if (i != 2) {
/* 7 */                     return false;
                        }
/* 9 */                 zzc();
                    }
/* 1 */             return true;
                }
            }
