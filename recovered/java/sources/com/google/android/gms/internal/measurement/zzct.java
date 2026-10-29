            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzct extends zzbm implements zzcu {
                public zzct() {
/* 3 */             super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                }

                @Override // com.google.android.gms.internal.measurement.zzbm
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 1) {
/* 22 */                return false;
                    }
/* 10 */            Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 12 */            zzbn.zzf(parcel);
/* 15 */            zzb(bundle);
/* 18 */            parcel2.writeNoException();
/* 1 */             return true;
                }
            }
