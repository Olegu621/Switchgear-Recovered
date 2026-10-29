            package com.google.android.gms.common.internal;

            import android.os.IBinder;
            import android.os.Parcel;
            import p000.cl3;
            
            /* JADX INFO: renamed from: com.google.android.gms.common.internal.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0323b implements IGmsServiceBroker {

                /* JADX INFO: renamed from: a */
                public final IBinder f3521a;

                public C0323b(IBinder iBinder) {
/* 4 */             this.f3521a = iBinder;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this.f3521a;
                }

                @Override // com.google.android.gms.common.internal.IGmsServiceBroker
                /* JADX INFO: renamed from: j */
                public final void mo2020j(zzd zzdVar, GetServiceRequest getServiceRequest) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 5 */             Parcel parcelObtain2 = Parcel.obtain();
                    try {
/* 11 */                parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
/* 18 */                parcelObtain.writeStrongBinder(zzdVar.asBinder());
/* 22 */                parcelObtain.writeInt(1);
/* 26 */                cl3.m1722a(getServiceRequest, parcelObtain, 0);
/* 33 */                this.f3521a.transact(46, parcelObtain, parcelObtain2, 0);
/* 36 */                parcelObtain2.readException();
                    } finally {
/* 47 */                parcelObtain2.recycle();
/* 50 */                parcelObtain.recycle();
                    }
                }
            }
