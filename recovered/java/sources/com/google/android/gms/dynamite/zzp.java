            package com.google.android.gms.dynamite;

            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import com.google.android.gms.internal.common.zza;
            import com.google.android.gms.internal.common.zzc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzp extends zza implements IInterface {
                /* JADX INFO: renamed from: a */
                public final IObjectWrapper m2046a(ObjectWrapper objectWrapper, String str, int i) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, objectWrapper);
/* 8 */             parcelZza.writeString(str);
/* 11 */            parcelZza.writeInt(i);
/* 15 */            Parcel parcelZzB = zzB(2, parcelZza);
/* 23 */            IObjectWrapper iObjectWrapperM2044a = IObjectWrapper.Stub.m2044a(parcelZzB.readStrongBinder());
/* 27 */            parcelZzB.recycle();
/* 30 */            return iObjectWrapperM2044a;
                }

                /* JADX INFO: renamed from: b */
                public final IObjectWrapper m2047b(ObjectWrapper objectWrapper, String str, int i) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, objectWrapper);
/* 8 */             parcelZza.writeString(str);
/* 11 */            parcelZza.writeInt(i);
/* 15 */            Parcel parcelZzB = zzB(4, parcelZza);
/* 23 */            IObjectWrapper iObjectWrapperM2044a = IObjectWrapper.Stub.m2044a(parcelZzB.readStrongBinder());
/* 27 */            parcelZzB.recycle();
/* 30 */            return iObjectWrapperM2044a;
                }

                /* JADX INFO: renamed from: s0 */
                public final IObjectWrapper m2048s0(ObjectWrapper objectWrapper, String str, boolean z, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, objectWrapper);
/* 8 */             parcelZza.writeString(str);
/* 11 */            parcelZza.writeInt(z ? 1 : 0);
/* 14 */            parcelZza.writeLong(j);
/* 18 */            Parcel parcelZzB = zzB(7, parcelZza);
/* 26 */            IObjectWrapper iObjectWrapperM2044a = IObjectWrapper.Stub.m2044a(parcelZzB.readStrongBinder());
/* 30 */            parcelZzB.recycle();
/* 33 */            return iObjectWrapperM2044a;
                }

                /* JADX INFO: renamed from: t0 */
                public final IObjectWrapper m2049t0(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, objectWrapper);
/* 8 */             parcelZza.writeString(str);
/* 11 */            parcelZza.writeInt(i);
/* 14 */            zzc.zze(parcelZza, objectWrapper2);
/* 19 */            Parcel parcelZzB = zzB(8, parcelZza);
/* 27 */            IObjectWrapper iObjectWrapperM2044a = IObjectWrapper.Stub.m2044a(parcelZzB.readStrongBinder());
/* 31 */            parcelZzB.recycle();
/* 34 */            return iObjectWrapperM2044a;
                }
            }
