            package com.google.android.gms.internal.internal;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.recaptchabase.ExecuteRequest;
            import com.google.android.gms.recaptchabase.InitRequest;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzf extends zza implements IInterface {
                public zzf(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                }

                public final void zzc(zze zzeVar, ExecuteRequest executeRequest) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzd(parcelZza, zzeVar);
/* 8 */             zzc.zzc(parcelZza, executeRequest);
/* 12 */            zzb(2, parcelZza);
                }

                public final void zzd(zze zzeVar, InitRequest initRequest) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzd(parcelZza, zzeVar);
/* 8 */             zzc.zzc(parcelZza, initRequest);
/* 12 */            zzb(1, parcelZza);
                }
            }
