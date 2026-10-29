            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.zzp;
            import com.google.android.gms.common.zzr;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import com.google.android.gms.internal.common.zza;
            import com.google.android.gms.internal.common.zzc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzab extends zza implements zzad {
                @Override // com.google.android.gms.common.internal.zzad
                /* JADX INFO: renamed from: U */
                public final zzr mo2023U(zzp zzpVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, zzpVar);
/* 9 */             Parcel parcelZzB = zzB(6, parcelZza);
/* 19 */            zzr zzrVar = (zzr) zzc.zzb(parcelZzB, zzr.CREATOR);
/* 21 */            parcelZzB.recycle();
/* 24 */            return zzrVar;
                }

                @Override // com.google.android.gms.common.internal.zzad
                /* JADX INFO: renamed from: i */
                public final boolean mo2024i(com.google.android.gms.common.zzt zztVar, ObjectWrapper objectWrapper) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, zztVar);
/* 8 */             zzc.zze(parcelZza, objectWrapper);
/* 12 */            Parcel parcelZzB = zzB(5, parcelZza);
/* 16 */            boolean zZza = zzc.zza(parcelZzB);
/* 20 */            parcelZzB.recycle();
/* 23 */            return zZza;
                }

                @Override // com.google.android.gms.common.internal.zzad
                public final boolean zzg() throws RemoteException {
/* 6 */             Parcel parcelZzB = zzB(7, zza());
/* 10 */            boolean zZza = zzc.zza(parcelZzB);
/* 14 */            parcelZzB.recycle();
/* 17 */            return zZza;
                }
            }
