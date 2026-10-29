            package com.google.android.gms.internal.auth;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.proxy.ProxyResponse;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzbf extends zzb implements zzbg {
                public zzbf() {
/* 3 */             super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                }

                @Override // com.google.android.gms.internal.auth.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 26 */                ProxyResponse proxyResponse = (ProxyResponse) zzc.zza(parcel, ProxyResponse.CREATOR);
/* 28 */                zzc.zzb(parcel);
/* 31 */                zzb(proxyResponse);
                    } else {
/* 5 */                 if (i != 2) {
/* 7 */                     return false;
                        }
/* 9 */                 String string = parcel.readString();
/* 13 */                zzc.zzb(parcel);
/* 16 */                zzc(string);
                    }
/* 34 */            parcel2.writeNoException();
/* 1 */             return true;
                }
            }
