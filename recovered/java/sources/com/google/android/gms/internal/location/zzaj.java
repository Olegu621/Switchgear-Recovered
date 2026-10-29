            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzaj extends zzb implements zzak {
                public zzaj() {
/* 3 */             super("com.google.android.gms.location.internal.IGeofencerCallbacks");
                }

                @Override // com.google.android.gms.internal.location.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 48 */                zzb(parcel.readInt(), parcel.createStringArray());
                    } else if (i == 2) {
/* 36 */                zzc(parcel.readInt(), parcel.createStringArray());
                    } else {
/* 8 */                 if (i != 3) {
/* 10 */                    return false;
                        }
/* 24 */                zzd(parcel.readInt(), (PendingIntent) zzc.zzb(parcel, PendingIntent.CREATOR));
                    }
/* 1 */             return true;
                }
            }
