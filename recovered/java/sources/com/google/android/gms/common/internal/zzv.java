            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.internal.common.zza;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzv extends zza implements zzx {
                @Override // com.google.android.gms.common.internal.zzx
                public final IObjectWrapper zzd() throws RemoteException {
/* 6 */             Parcel parcelZzB = zzB(1, zza());
/* 14 */            IObjectWrapper iObjectWrapperM2044a = IObjectWrapper.Stub.m2044a(parcelZzB.readStrongBinder());
/* 18 */            parcelZzB.recycle();
/* 21 */            return iObjectWrapperM2044a;
                }

                @Override // com.google.android.gms.common.internal.zzx
                public final int zze() throws RemoteException {
/* 6 */             Parcel parcelZzB = zzB(2, zza());
/* 10 */            int i = parcelZzB.readInt();
/* 14 */            parcelZzB.recycle();
/* 17 */            return i;
                }
            }
