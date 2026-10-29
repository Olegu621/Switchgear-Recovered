            package com.google.android.gms.internal.fido;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzs extends zza implements IInterface {
                public zzs(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
                }

                public final void zzc(zzr zzrVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzrVar);
/* 8 */             zzc.zzd(parcelZza, publicKeyCredentialCreationOptions);
/* 12 */            zzb(1, parcelZza);
                }

                public final void zzd(zzr zzrVar, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzrVar);
/* 8 */             zzc.zzd(parcelZza, publicKeyCredentialRequestOptions);
/* 12 */            zzb(2, parcelZza);
                }

                public final void zze(zze zzeVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzeVar);
/* 9 */             zzb(3, parcelZza);
                }
            }
