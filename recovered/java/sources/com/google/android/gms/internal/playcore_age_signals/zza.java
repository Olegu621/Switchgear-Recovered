            package com.google.android.gms.internal.playcore_age_signals;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zza implements IInterface {
                private final IBinder zza;
                private final String zzb;

                public zza(IBinder iBinder, String str) {
/* 4 */             this.zza = iBinder;
/* 6 */             this.zzb = str;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this.zza;
                }

                public final Parcel zza() {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.zzb);
/* 10 */            return parcelObtain;
                }

                public final void zzb(int i, Parcel parcel) throws RemoteException {
                    try {
/* 5 */                 this.zza.transact(i, parcel, null, 1);
                    } finally {
/* 13 */                parcel.recycle();
                    }
                }
            }
