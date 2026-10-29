            package com.google.android.gms.internal.p015authapiphone;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzb extends Binder implements IInterface {
                public zzb(String str) {
/* 4 */             attachInterface(this, str);
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this;
                }

                @Override // android.os.Binder
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 4 */             if (i <= 16777215) {
/* 18 */                parcel.enforceInterface(getInterfaceDescriptor());
                    } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 12 */                return true;
                    }
/* 21 */            return zza(i, parcel, parcel2, i2);
                }

                public boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             throw null;
                }
            }
