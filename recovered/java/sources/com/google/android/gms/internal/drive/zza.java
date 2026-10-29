            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 27 */    public class zza implements IInterface {
                private final IBinder zza;
                private final String zzb;

                public zza(IBinder iBinder, String str) {
/* 4 */             this.zza = iBinder;
/* 6 */             this.zzb = str;
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
/* 1 */             return this.zza;
                }

                public final Parcel zza(int i, Parcel parcel) throws RemoteException {
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

                public final void zzb(int i, Parcel parcel) throws RemoteException {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 8 */                 this.zza.transact(i, parcel, parcelObtain, 0);
/* 11 */                parcelObtain.readException();
                    } finally {
/* 22 */                parcel.recycle();
/* 25 */                parcelObtain.recycle();
                    }
                }

                public final void zzc(int i, Parcel parcel) throws RemoteException {
                    try {
/* 5 */                 this.zza.transact(1, parcel, null, 1);
                    } finally {
/* 13 */                parcel.recycle();
                    }
                }

/* 28 */        public final Parcel zza() {
/* 29 */            Parcel parcelObtain = Parcel.obtain();
/* 30 */            parcelObtain.writeInterfaceToken(this.zzb);
                    return parcelObtain;
                }
            }
