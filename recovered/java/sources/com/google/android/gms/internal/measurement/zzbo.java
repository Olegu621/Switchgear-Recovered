            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbo extends zzbl implements zzbq {
                public zzbo(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                }

                @Override // com.google.android.gms.internal.measurement.zzbq
                public final Bundle zze(Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, bundle);
/* 9 */             Parcel parcelZzP = zzP(1, parcelZza);
/* 19 */            Bundle bundle2 = (Bundle) zzbn.zzb(parcelZzP, Bundle.CREATOR);
/* 21 */            parcelZzP.recycle();
/* 24 */            return bundle2;
                }
            }
