            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcy extends zzbl implements zzda {
                public zzcy(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                }

                @Override // com.google.android.gms.internal.measurement.zzda
                public final void zze(String str, String str2, Bundle bundle, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeString(str2);
/* 11 */            zzbn.zzc(parcelZza, bundle);
/* 14 */            parcelZza.writeLong(j);
/* 18 */            zzc(1, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzda
                public final int zzf() throws RemoteException {
/* 6 */             Parcel parcelZzP = zzP(2, zza());
/* 10 */            int i = parcelZzP.readInt();
/* 14 */            parcelZzP.recycle();
/* 17 */            return i;
                }
            }
