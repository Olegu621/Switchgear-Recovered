            package com.google.android.play.core.appupdate.internal;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzb extends Binder implements IInterface {
                /* JADX INFO: renamed from: a */
                public boolean mo2440a(int i, Parcel parcel) {
/* 2 */             throw null;
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this;
                }

                @Override // android.os.Binder
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 4 */             if (i <= 16777215) {
/* 18 */                parcel.enforceInterface(getInterfaceDescriptor());
                    } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 12 */                return true;
                    }
/* 21 */            return mo2440a(i, parcel);
                }
            }
