            package com.google.android.gms.internal.drive;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzb extends Binder implements IInterface {
                private static zzd zzc;

                public zzb(String str) {
/* 4 */             attachInterface(this, str);
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
/* 1 */             return this;
                }

                public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 1 */             return false;
                }

                @Override // android.os.Binder
                public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
                    boolean zOnTransact;
/* 4 */             if (i > 16777215) {
/* 6 */                 zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                    } else {
/* 15 */                parcel.enforceInterface(getInterfaceDescriptor());
/* 18 */                zOnTransact = false;
                    }
/* 19 */            if (zOnTransact) {
/* 21 */                return true;
                    }
/* 23 */            return dispatchTransaction(i, parcel, parcel2, i2);
                }
            }
