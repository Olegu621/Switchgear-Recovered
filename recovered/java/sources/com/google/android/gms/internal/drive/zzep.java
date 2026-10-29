            package com.google.android.gms.internal.drive;

            import android.content.IntentSender;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 26 */    public final class zzep extends zza implements zzeo {
                public zzep(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.drive.internal.IDriveService");
                }

                @Override // com.google.android.gms.internal.drive.zzeo
                public final zzec zza(zzgj zzgjVar, zzeq zzeqVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zza(parcelZza, zzgjVar);
/* 8 */             zzc.zza(parcelZza, zzeqVar);
/* 12 */            Parcel parcelZza2 = zza(7, parcelZza);
/* 22 */            zzec zzecVar = (zzec) zzc.zza(parcelZza2, zzec.CREATOR);
/* 24 */            parcelZza2.recycle();
/* 27 */            return zzecVar;
                }

                @Override // com.google.android.gms.internal.drive.zzeo
                public final void zzb(zzeq zzeqVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zza(parcelZza, zzeqVar);
/* 10 */            zzb(35, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 27 */        public final void zza(zzgq zzgqVar, zzeq zzeqVar) throws RemoteException {
/* 28 */            Parcel parcelZza = zza();
/* 29 */            zzc.zza(parcelZza, zzgqVar);
/* 30 */            zzc.zza(parcelZza, zzeqVar);
/* 31 */            zzb(2, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 31 */        public final void zza(zzhf zzhfVar, zzeq zzeqVar) throws RemoteException {
/* 32 */            Parcel parcelZza = zza();
/* 33 */            zzc.zza(parcelZza, zzhfVar);
/* 34 */            zzc.zza(parcelZza, zzeqVar);
/* 35 */            zzb(3, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 35 */        public final void zza(zzr zzrVar, zzeq zzeqVar) throws RemoteException {
/* 36 */            Parcel parcelZza = zza();
/* 37 */            zzc.zza(parcelZza, zzrVar);
/* 38 */            zzc.zza(parcelZza, zzeqVar);
/* 39 */            zzb(4, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 39 */        public final void zza(zzw zzwVar, zzeq zzeqVar) throws RemoteException {
/* 40 */            Parcel parcelZza = zza();
/* 41 */            zzc.zza(parcelZza, zzwVar);
/* 42 */            zzc.zza(parcelZza, zzeqVar);
/* 43 */            zzb(5, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 43 */        public final void zza(zzy zzyVar, zzeq zzeqVar) throws RemoteException {
/* 44 */            Parcel parcelZza = zza();
/* 45 */            zzc.zza(parcelZza, zzyVar);
/* 46 */            zzc.zza(parcelZza, zzeqVar);
/* 47 */            zzb(6, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 47 */        public final void zza(zzek zzekVar, zzeq zzeqVar) throws RemoteException {
/* 48 */            Parcel parcelZza = zza();
/* 49 */            zzc.zza(parcelZza, zzekVar);
/* 50 */            zzc.zza(parcelZza, zzeqVar);
/* 51 */            zzb(1, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 51 */        public final void zza(zzo zzoVar, zzeq zzeqVar) throws RemoteException {
/* 52 */            Parcel parcelZza = zza();
/* 53 */            zzc.zza(parcelZza, zzoVar);
/* 54 */            zzc.zza(parcelZza, zzeqVar);
/* 55 */            zzb(8, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 55 */        public final void zza(zzeq zzeqVar) throws RemoteException {
/* 56 */            Parcel parcelZza = zza();
/* 57 */            zzc.zza(parcelZza, zzeqVar);
/* 58 */            zzb(9, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 58 */        public final IntentSender zza(zzgm zzgmVar) throws RemoteException {
/* 59 */            Parcel parcelZza = zza();
/* 60 */            zzc.zza(parcelZza, zzgmVar);
/* 61 */            Parcel parcelZza2 = zza(10, parcelZza);
/* 62 */            IntentSender intentSender = (IntentSender) zzc.zza(parcelZza2, IntentSender.CREATOR);
/* 63 */            parcelZza2.recycle();
                    return intentSender;
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 63 */        public final IntentSender zza(zzu zzuVar) throws RemoteException {
/* 64 */            Parcel parcelZza = zza();
/* 65 */            zzc.zza(parcelZza, zzuVar);
/* 66 */            Parcel parcelZza2 = zza(11, parcelZza);
/* 67 */            IntentSender intentSender = (IntentSender) zzc.zza(parcelZza2, IntentSender.CREATOR);
/* 68 */            parcelZza2.recycle();
                    return intentSender;
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 68 */        public final void zza(zzex zzexVar, zzeq zzeqVar) throws RemoteException {
/* 69 */            Parcel parcelZza = zza();
/* 70 */            zzc.zza(parcelZza, zzexVar);
/* 71 */            zzc.zza(parcelZza, zzeqVar);
/* 72 */            zzb(13, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 72 */        public final void zza(zzj zzjVar, zzes zzesVar, String str, zzeq zzeqVar) throws RemoteException {
/* 73 */            Parcel parcelZza = zza();
/* 74 */            zzc.zza(parcelZza, zzjVar);
/* 75 */            zzc.zza(parcelZza, zzesVar);
/* 76 */            parcelZza.writeString(null);
/* 77 */            zzc.zza(parcelZza, zzeqVar);
/* 78 */            zzb(14, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 78 */        public final void zza(zzgs zzgsVar, zzes zzesVar, String str, zzeq zzeqVar) throws RemoteException {
/* 79 */            Parcel parcelZza = zza();
/* 80 */            zzc.zza(parcelZza, zzgsVar);
/* 81 */            zzc.zza(parcelZza, zzesVar);
/* 82 */            parcelZza.writeString(null);
/* 83 */            zzc.zza(parcelZza, zzeqVar);
/* 84 */            zzb(15, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 84 */        public final void zza(zzad zzadVar) throws RemoteException {
/* 85 */            Parcel parcelZza = zza();
/* 86 */            zzc.zza(parcelZza, zzadVar);
/* 87 */            zzb(16, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 87 */        public final void zza(zzhb zzhbVar, zzeq zzeqVar) throws RemoteException {
/* 88 */            Parcel parcelZza = zza();
/* 89 */            zzc.zza(parcelZza, zzhbVar);
/* 90 */            zzc.zza(parcelZza, zzeqVar);
/* 91 */            zzb(17, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 91 */        public final void zza(zzm zzmVar, zzeq zzeqVar) throws RemoteException {
/* 92 */            Parcel parcelZza = zza();
/* 93 */            zzc.zza(parcelZza, zzmVar);
/* 94 */            zzc.zza(parcelZza, zzeqVar);
/* 95 */            zzb(18, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 95 */        public final void zza(zzab zzabVar, zzeq zzeqVar) throws RemoteException {
/* 96 */            Parcel parcelZza = zza();
/* 97 */            zzc.zza(parcelZza, zzabVar);
/* 98 */            zzc.zza(parcelZza, zzeqVar);
/* 99 */            zzb(24, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 99 */        public final void zza(zzgw zzgwVar, zzeq zzeqVar) throws RemoteException {
/* 100 */           Parcel parcelZza = zza();
/* 101 */           zzc.zza(parcelZza, zzgwVar);
/* 102 */           zzc.zza(parcelZza, zzeqVar);
/* 103 */           zzb(28, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 103 */       public final void zza(zzgu zzguVar, zzeq zzeqVar) throws RemoteException {
/* 104 */           Parcel parcelZza = zza();
/* 105 */           zzc.zza(parcelZza, zzguVar);
/* 106 */           zzc.zza(parcelZza, zzeqVar);
/* 107 */           zzb(36, parcelZza);
                }

                @Override // com.google.android.gms.internal.drive.zzeo
/* 107 */       public final void zza(zzhd zzhdVar, zzeq zzeqVar) throws RemoteException {
/* 108 */           Parcel parcelZza = zza();
/* 109 */           zzc.zza(parcelZza, zzhdVar);
/* 110 */           zzc.zza(parcelZza, zzeqVar);
/* 111 */           zzb(38, parcelZza);
                }
            }
