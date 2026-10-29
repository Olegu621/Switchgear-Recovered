            package com.google.android.gms.internal.p015authapiphone;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzd extends zzb implements zze {
                public zzd() {
/* 3 */             super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
                }

                @Override // com.google.android.gms.internal.p015authapiphone.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 1) {
/* 20 */                return false;
                    }
/* 16 */            zzb((Status) zzc.zza(parcel, Status.CREATOR), parcel.readInt());
/* 1 */             return true;
                }
            }
