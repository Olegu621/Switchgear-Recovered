            package com.google.android.gms.internal.fido;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
            import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzn extends zza implements IInterface {
                public zzn(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
                }

                public final void zzc(zzg zzgVar, String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzgVar);
/* 8 */             parcelZza.writeString(str);
/* 12 */            zzb(4, parcelZza);
                }

                public final void zzd(zzm zzmVar, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzmVar);
/* 8 */             zzc.zzd(parcelZza, browserPublicKeyCredentialCreationOptions);
/* 12 */            zzb(1, parcelZza);
                }

                public final void zze(zzm zzmVar, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzmVar);
/* 8 */             zzc.zzd(parcelZza, browserPublicKeyCredentialRequestOptions);
/* 12 */            zzb(2, parcelZza);
                }

                public final void zzf(zze zzeVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzeVar);
/* 9 */             zzb(3, parcelZza);
                }
            }
