            package com.google.android.gms.internal.games_v2;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzae extends zza implements IInterface {
                public zzae(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
                }

                public final void zzd(zzad zzadVar, zzy zzyVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzf(parcelZza, zzadVar);
/* 8 */             zzc.zzd(parcelZza, zzyVar);
/* 12 */            zzc(2, parcelZza);
                }
            }
