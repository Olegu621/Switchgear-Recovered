            package com.google.android.gms.internal.auth;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.proxy.ProxyRequest;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbh extends zza implements IInterface {
                public zzbh(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
                }

                public final void zzd(zzbg zzbgVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzbgVar);
/* 9 */             zzc(3, parcelZza);
                }

                public final void zze(zzbg zzbgVar, ProxyRequest proxyRequest) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zze(parcelZza, zzbgVar);
/* 8 */             zzc.zzd(parcelZza, proxyRequest);
/* 12 */            zzc(1, parcelZza);
                }
            }
