            package com.android.vending.licensing;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface ILicenseResultListener extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements ILicenseResultListener {
                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements ILicenseResultListener {
                    static final int TRANSACTION_verifyLicense = 1;

                    public static ILicenseResultListener asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
/* 11 */                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ILicenseResultListener)) {
/* 17 */                    return (ILicenseResultListener) iInterfaceQueryLocalInterface;
                        }
/* 22 */                C0227a c0227a = new C0227a();
/* 25 */                c0227a.f3043a = iBinder;
/* 27 */                return c0227a;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                        }
/* 17 */                if (i == 1598968902) {
/* 42 */                    parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
/* 3 */                     return true;
                        }
/* 19 */                if (i != 1) {
/* 21 */                    return super.onTransact(i, parcel, parcel2, i2);
                        }
/* 38 */                verifyLicense(parcel.readInt(), parcel.readString(), parcel.readString());
/* 3 */                 return true;
                    }
                }

                void verifyLicense(int i, String str, String str2);
            }
