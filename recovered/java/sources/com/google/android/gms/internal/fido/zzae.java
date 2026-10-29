            package com.google.android.gms.internal.fido;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
            import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzae extends zza implements IInterface {
                public zzae(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
                }

                public final void zzc(zzad zzadVar, RegisterRequestParams registerRequestParams) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzadVar);
/* 8 */             zzc.zzd(parcelZza, registerRequestParams);
/* 12 */            zzb(1, parcelZza);
                }

                public final void zzd(zzad zzadVar, SignRequestParams signRequestParams) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzadVar);
/* 8 */             zzc.zzd(parcelZza, signRequestParams);
/* 12 */            zzb(2, parcelZza);
                }
            }
