            package com.google.android.gms.internal.play_billing;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzal extends zzaq implements zzan {
                public zzal(IBinder iBinder) {
/* 3 */             super(iBinder, "com.android.vending.billing.IInAppBillingService");
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final int zza(int i, String str, String str2) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 6 */             parcelZzu.writeInt(3);
/* 9 */             parcelZzu.writeString(str);
/* 12 */            parcelZzu.writeString(str2);
/* 16 */            Parcel parcelZzv = zzv(5, parcelZzu);
/* 20 */            int i2 = parcelZzv.readInt();
/* 24 */            parcelZzv.recycle();
/* 27 */            return i2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final int zzc(int i, String str, String str2, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 5 */             parcelZzu.writeInt(i);
/* 8 */             parcelZzu.writeString(str);
/* 11 */            parcelZzu.writeString(str2);
/* 14 */            zzas.zzc(parcelZzu, bundle);
/* 19 */            Parcel parcelZzv = zzv(10, parcelZzu);
/* 23 */            int i2 = parcelZzv.readInt();
/* 27 */            parcelZzv.recycle();
/* 30 */            return i2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zzd(int i, String str, String str2, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(9);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            parcelZzu.writeString(str2);
/* 16 */            zzas.zzc(parcelZzu, bundle);
/* 21 */            Parcel parcelZzv = zzv(902, parcelZzu);
/* 31 */            Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 33 */            parcelZzv.recycle();
/* 36 */            return bundle2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zze(int i, String str, String str2, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(9);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            parcelZzu.writeString(str2);
/* 16 */            zzas.zzc(parcelZzu, bundle);
/* 21 */            Parcel parcelZzv = zzv(12, parcelZzu);
/* 31 */            Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 33 */            parcelZzv.recycle();
/* 36 */            return bundle2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zzf(int i, String str, String str2, String str3, String str4) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 6 */             parcelZzu.writeInt(3);
/* 9 */             parcelZzu.writeString(str);
/* 12 */            parcelZzu.writeString(str2);
/* 15 */            parcelZzu.writeString(str3);
/* 19 */            parcelZzu.writeString(null);
/* 22 */            Parcel parcelZzv = zzv(3, parcelZzu);
/* 32 */            Bundle bundle = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 34 */            parcelZzv.recycle();
/* 37 */            return bundle;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 5 */             parcelZzu.writeInt(i);
/* 8 */             parcelZzu.writeString(str);
/* 11 */            parcelZzu.writeString(str2);
/* 14 */            parcelZzu.writeString(str3);
/* 18 */            parcelZzu.writeString(null);
/* 21 */            zzas.zzc(parcelZzu, bundle);
/* 26 */            Parcel parcelZzv = zzv(8, parcelZzu);
/* 36 */            Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 38 */            parcelZzv.recycle();
/* 41 */            return bundle2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zzh(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 6 */             parcelZzu.writeInt(6);
/* 9 */             parcelZzu.writeString(str);
/* 12 */            parcelZzu.writeString(str2);
/* 15 */            parcelZzu.writeString(str3);
/* 18 */            zzas.zzc(parcelZzu, bundle);
/* 23 */            Parcel parcelZzv = zzv(9, parcelZzu);
/* 33 */            Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 35 */            parcelZzv.recycle();
/* 38 */            return bundle2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zzi(int i, String str, String str2, String str3) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 6 */             parcelZzu.writeInt(3);
/* 9 */             parcelZzu.writeString(str);
/* 12 */            parcelZzu.writeString(str2);
/* 15 */            parcelZzu.writeString(str3);
/* 19 */            Parcel parcelZzv = zzv(4, parcelZzu);
/* 29 */            Bundle bundle = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 31 */            parcelZzv.recycle();
/* 34 */            return bundle;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 5 */             parcelZzu.writeInt(i);
/* 8 */             parcelZzu.writeString(str);
/* 11 */            parcelZzu.writeString(str2);
/* 14 */            parcelZzu.writeString(str3);
/* 17 */            zzas.zzc(parcelZzu, bundle);
/* 22 */            Parcel parcelZzv = zzv(11, parcelZzu);
/* 32 */            Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 34 */            parcelZzv.recycle();
/* 37 */            return bundle2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zzk(int i, String str, String str2, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 6 */             parcelZzu.writeInt(3);
/* 9 */             parcelZzu.writeString(str);
/* 12 */            parcelZzu.writeString(str2);
/* 15 */            zzas.zzc(parcelZzu, bundle);
/* 19 */            Parcel parcelZzv = zzv(2, parcelZzu);
/* 29 */            Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 31 */            parcelZzv.recycle();
/* 34 */            return bundle2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 5 */             parcelZzu.writeInt(i);
/* 8 */             parcelZzu.writeString(str);
/* 11 */            parcelZzu.writeString(str2);
/* 14 */            zzas.zzc(parcelZzu, bundle);
/* 17 */            zzas.zzc(parcelZzu, bundle2);
/* 22 */            Parcel parcelZzv = zzv(901, parcelZzu);
/* 32 */            Bundle bundle3 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
/* 34 */            parcelZzv.recycle();
/* 37 */            return bundle3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzan
                public final void zzm(int i, String str, Bundle bundle, zzy zzyVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(21);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            zzas.zzc(parcelZzu, bundle);
/* 16 */            parcelZzu.writeStrongBinder(zzyVar);
/* 21 */            zzx(1501, parcelZzu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzan
                public final void zzn(int i, String str, Bundle bundle, zzaa zzaaVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(22);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            zzas.zzc(parcelZzu, bundle);
/* 16 */            parcelZzu.writeStrongBinder(zzaaVar);
/* 21 */            zzx(1801, parcelZzu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzan
                public final void zzo(int i, String str, Bundle bundle, zzac zzacVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(21);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            zzas.zzc(parcelZzu, bundle);
/* 16 */            parcelZzu.writeStrongBinder(zzacVar);
/* 21 */            zzx(1601, parcelZzu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzan
                public final void zzp(int i, String str, Bundle bundle, zzae zzaeVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(18);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            zzas.zzc(parcelZzu, bundle);
/* 16 */            parcelZzu.writeStrongBinder(zzaeVar);
/* 21 */            zzw(1301, parcelZzu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzan
                public final void zzq(int i, String str, Bundle bundle, zzag zzagVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(22);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            zzas.zzc(parcelZzu, bundle);
/* 16 */            parcelZzu.writeStrongBinder(zzagVar);
/* 21 */            zzx(1901, parcelZzu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzan
                public final void zzr(int i, String str, Bundle bundle, zzai zzaiVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(21);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            zzas.zzc(parcelZzu, bundle);
/* 16 */            parcelZzu.writeStrongBinder(zzaiVar);
/* 21 */            zzx(1401, parcelZzu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzan
                public final void zzs(int i, String str, Bundle bundle, zzak zzakVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(22);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            zzas.zzc(parcelZzu, bundle);
/* 16 */            parcelZzu.writeStrongBinder(zzakVar);
/* 21 */            zzx(1701, parcelZzu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.play_billing.zzan
                public final void zzt(int i, String str, Bundle bundle, zzap zzapVar) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 7 */             parcelZzu.writeInt(12);
/* 10 */            parcelZzu.writeString(str);
/* 13 */            zzas.zzc(parcelZzu, bundle);
/* 16 */            parcelZzu.writeStrongBinder(zzapVar);
/* 21 */            zzw(1201, parcelZzu);
                }

                @Override // com.google.android.gms.internal.play_billing.zzan
                public final int zzy(int i, String str, String str2) throws RemoteException {
/* 1 */             Parcel parcelZzu = zzu();
/* 5 */             parcelZzu.writeInt(i);
/* 8 */             parcelZzu.writeString(str);
/* 11 */            parcelZzu.writeString(str2);
/* 15 */            Parcel parcelZzv = zzv(1, parcelZzu);
/* 19 */            int i2 = parcelZzv.readInt();
/* 23 */            parcelZzv.recycle();
/* 26 */            return i2;
                }
            }
