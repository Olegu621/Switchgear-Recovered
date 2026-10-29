            package com.android.vending.licensing;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface ILicensingService extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements ILicensingService {
                    @Override // com.android.vending.licensing.ILicensingService
                    /* JADX INFO: renamed from: Z */
                    public final void mo1743Z(long j, String str, ILicenseResultListener iLicenseResultListener) {
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements ILicensingService {

                    /* JADX INFO: renamed from: a */
                    public static final /* synthetic */ int f3042a = 0;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
                        }
/* 17 */                if (i == 1598968902) {
/* 46 */                    parcel2.writeString("com.android.vending.licensing.ILicensingService");
/* 3 */                     return true;
                        }
/* 19 */                if (i != 1) {
/* 21 */                    return super.onTransact(i, parcel, parcel2, i2);
                        }
/* 42 */                mo1743Z(parcel.readLong(), parcel.readString(), ILicenseResultListener.Stub.asInterface(parcel.readStrongBinder()));
/* 3 */                 return true;
                    }
                }

                /* JADX INFO: renamed from: Z */
                void mo1743Z(long j, String str, ILicenseResultListener iLicenseResultListener);
            }
