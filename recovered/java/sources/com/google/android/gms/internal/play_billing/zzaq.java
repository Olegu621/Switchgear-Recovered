            package com.google.android.gms.internal.play_billing;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzaq implements IInterface {
                private final IBinder zza;
                private final String zzb;

                public zzaq(IBinder iBinder, String str) {
/* 4 */             this.zza = iBinder;
/* 6 */             this.zzb = str;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this.zza;
                }

                public final Parcel zzu() {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.zzb);
/* 10 */            return parcelObtain;
                }

                public final Parcel zzv(int i, Parcel parcel) throws RemoteException {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
                        try {
/* 8 */                     this.zza.transact(i, parcel, parcelObtain, 0);
/* 11 */                    parcelObtain.readException();
/* 14 */                    parcel.recycle();
/* 17 */                    return parcelObtain;
                        } catch (RuntimeException e) {
/* 21 */                    parcelObtain.recycle();
/* 24 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 25 */                parcel.recycle();
/* 28 */                throw th;
                    }
                }

                public final void zzw(int i, Parcel parcel) throws RemoteException {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 8 */                 this.zza.transact(i, parcel, parcelObtain, 0);
/* 11 */                parcelObtain.readException();
                    } finally {
/* 22 */                parcel.recycle();
/* 25 */                parcelObtain.recycle();
                    }
                }

                public final void zzx(int i, Parcel parcel) throws RemoteException {
                    try {
/* 5 */                 this.zza.transact(i, parcel, null, 1);
                    } finally {
/* 13 */                parcel.recycle();
                    }
                }
            }
