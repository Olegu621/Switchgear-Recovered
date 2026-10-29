            package com.android.vending.licensing;

            import android.os.IBinder;
            import android.os.Parcel;
            
            /* JADX INFO: renamed from: com.android.vending.licensing.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0228b implements ILicensingService {

                /* JADX INFO: renamed from: a */
                public IBinder f3044a;

                @Override // com.android.vending.licensing.ILicensingService
                /* JADX INFO: renamed from: Z */
                public final void mo1743Z(long j, String str, ILicenseResultListener iLicenseResultListener) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
/* 10 */                parcelObtain.writeLong(j);
/* 13 */                parcelObtain.writeString(str);
/* 16 */                parcelObtain.writeStrongInterface(iLicenseResultListener);
/* 23 */                this.f3044a.transact(1, parcelObtain, null, 1);
                    } finally {
/* 31 */                parcelObtain.recycle();
                    }
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this.f3044a;
                }
            }
