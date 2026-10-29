            package com.google.android.gms.internal.fido;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzl extends zzb implements zzm {
                public zzl() {
/* 3 */             super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
                }

                @Override // com.google.android.gms.internal.fido.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 1) {
/* 27 */                return false;
                    }
/* 10 */            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
/* 18 */            PendingIntent pendingIntent = (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR);
/* 20 */            zzc.zzc(parcel);
/* 23 */            zzb(status, pendingIntent);
/* 1 */             return true;
                }
            }
