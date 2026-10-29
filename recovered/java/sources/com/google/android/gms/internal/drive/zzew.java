            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzew extends zza implements zzeu {
                public zzew(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.drive.internal.IEventReleaseCallback");
                }

                @Override // com.google.android.gms.internal.drive.zzeu
                public final void zza(boolean z) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.writeBoolean(parcelZza, z);
/* 9 */             zzc(1, parcelZza);
                }
            }
