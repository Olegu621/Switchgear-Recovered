            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzcz extends zzbm implements zzda {
                public zzcz() {
/* 3 */             super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                }

                @Override // com.google.android.gms.internal.measurement.zzbm
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 20 */                String string = parcel.readString();
/* 24 */                String string2 = parcel.readString();
/* 35 */                Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 37 */                long j = parcel.readLong();
/* 41 */                zzbn.zzf(parcel);
/* 45 */                zze(string, string2, bundle, j);
/* 48 */                parcel2.writeNoException();
                    } else {
/* 5 */                 if (i != 2) {
/* 7 */                     return false;
                        }
/* 9 */                 int iZzf = zzf();
/* 13 */                parcel2.writeNoException();
/* 16 */                parcel2.writeInt(iZzf);
                    }
/* 1 */             return true;
                }
            }
