            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzet extends zzb implements zzes {
                public zzet() {
/* 3 */             super("com.google.android.gms.drive.internal.IEventCallback");
                }

                @Override // com.google.android.gms.internal.drive.zzb
                public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 1) {
/* 19 */                return false;
                    }
/* 12 */            zzc((zzfp) zzc.zza(parcel, zzfp.CREATOR));
/* 15 */            parcel2.writeNoException();
/* 1 */             return true;
                }
            }
