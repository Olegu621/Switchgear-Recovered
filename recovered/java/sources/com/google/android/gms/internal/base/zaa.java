            package com.google.android.gms.internal.base;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zaa implements IInterface {
                private final IBinder zaa;
                private final String zab;

                public zaa(IBinder iBinder, String str) {
/* 4 */             this.zaa = iBinder;
/* 6 */             this.zab = str;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this.zaa;
                }

                public final Parcel zaa() {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.zab);
/* 10 */            return parcelObtain;
                }

                public final Parcel zab(int i, Parcel parcel) throws RemoteException {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
                        try {
/* 9 */                     this.zaa.transact(2, parcel, parcelObtain, 0);
/* 12 */                    parcelObtain.readException();
/* 15 */                    parcel.recycle();
/* 18 */                    return parcelObtain;
                        } catch (RuntimeException e) {
/* 22 */                    parcelObtain.recycle();
/* 25 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 26 */                parcel.recycle();
/* 29 */                throw th;
                    }
                }

                public final void zac(int i, Parcel parcel) throws RemoteException {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 8 */                 this.zaa.transact(i, parcel, parcelObtain, 0);
/* 11 */                parcelObtain.readException();
                    } finally {
/* 22 */                parcel.recycle();
/* 25 */                parcelObtain.recycle();
                    }
                }

                public final void zad(int i, Parcel parcel) throws RemoteException {
                    try {
/* 5 */                 this.zaa.transact(1, parcel, null, 1);
                    } finally {
/* 13 */                parcel.recycle();
                    }
                }
            }
