            package com.google.android.gms.internal.fido;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzf extends zzb implements zzg {
                public zzf() {
/* 3 */             super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
                }

                @Override // com.google.android.gms.internal.fido.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 24 */                ArrayList arrayListZzb = zzc.zzb(parcel);
/* 28 */                zzc.zzc(parcel);
/* 31 */                zzb(arrayListZzb);
                    } else {
/* 5 */                 if (i != 2) {
/* 7 */                     return false;
                        }
/* 15 */                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
/* 17 */                zzc.zzc(parcel);
/* 20 */                zzc(status);
                    }
/* 34 */            parcel2.writeNoException();
/* 1 */             return true;
                }
            }
