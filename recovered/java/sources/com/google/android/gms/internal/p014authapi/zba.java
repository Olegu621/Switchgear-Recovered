            package com.google.android.gms.internal.p014authapi;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zba implements IInterface {
                private final IBinder zba;
                private final String zbb;

                public zba(IBinder iBinder, String str) {
/* 4 */             this.zba = iBinder;
/* 6 */             this.zbb = str;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this.zba;
                }

                public final Parcel zba() {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.zbb);
/* 10 */            return parcelObtain;
                }

                public final void zbb(int i, Parcel parcel) throws RemoteException {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 8 */                 this.zba.transact(i, parcel, parcelObtain, 0);
/* 11 */                parcelObtain.readException();
                    } finally {
/* 22 */                parcel.recycle();
/* 25 */                parcelObtain.recycle();
                    }
                }
            }
