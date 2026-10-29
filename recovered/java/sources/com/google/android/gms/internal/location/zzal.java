            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import android.location.Location;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.internal.IStatusCallback;
            import com.google.android.gms.location.ActivityTransitionRequest;
            import com.google.android.gms.location.GeofencingRequest;
            import com.google.android.gms.location.LocationAvailability;
            import com.google.android.gms.location.LocationSettingsRequest;
            import com.google.android.gms.location.SleepSegmentRequest;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzal extends zza implements zzam {
                public zzal(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzd(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzak zzakVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, geofencingRequest);
/* 8 */             zzc.zzc(parcelZza, pendingIntent);
/* 11 */            zzc.zzd(parcelZza, zzakVar);
/* 16 */            zzx(57, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zze(PendingIntent pendingIntent, zzak zzakVar, String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, pendingIntent);
/* 8 */             zzc.zzd(parcelZza, zzakVar);
/* 11 */            parcelZza.writeString(str);
/* 15 */            zzx(2, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzf(String[] strArr, zzak zzakVar, String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeStringArray(strArr);
/* 8 */             zzc.zzd(parcelZza, zzakVar);
/* 11 */            parcelZza.writeString(str);
/* 15 */            zzx(3, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzg(com.google.android.gms.location.zzbq zzbqVar, zzak zzakVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, zzbqVar);
/* 8 */             zzc.zzd(parcelZza, zzakVar);
/* 13 */            zzx(74, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzh(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeLong(j);
/* 9 */             zzc.zza(parcelZza, true);
/* 12 */            zzc.zzc(parcelZza, pendingIntent);
/* 16 */            zzx(5, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzi(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, activityTransitionRequest);
/* 8 */             zzc.zzc(parcelZza, pendingIntent);
/* 11 */            zzc.zzd(parcelZza, iStatusCallback);
/* 16 */            zzx(72, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzj(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, pendingIntent);
/* 8 */             zzc.zzd(parcelZza, iStatusCallback);
/* 13 */            zzx(73, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzk(PendingIntent pendingIntent) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, pendingIntent);
/* 9 */             zzx(6, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzl(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, pendingIntent);
/* 8 */             zzc.zzd(parcelZza, iStatusCallback);
/* 13 */            zzx(69, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final Location zzm() throws RemoteException {
/* 6 */             Parcel parcelZzw = zzw(7, zza());
/* 16 */            Location location = (Location) zzc.zzb(parcelZzw, Location.CREATOR);
/* 18 */            parcelZzw.recycle();
/* 21 */            return location;
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final Location zzn(String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 10 */            Parcel parcelZzw = zzw(80, parcelZza);
/* 20 */            Location location = (Location) zzc.zzb(parcelZzw, Location.CREATOR);
/* 22 */            parcelZzw.recycle();
/* 25 */            return location;
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzo(zzbc zzbcVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, zzbcVar);
/* 10 */            zzx(59, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzp(boolean z) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zza(parcelZza, z);
/* 10 */            zzx(12, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzq(Location location) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, location);
/* 10 */            zzx(13, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzr(zzai zzaiVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzd(parcelZza, zzaiVar);
/* 10 */            zzx(67, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final LocationAvailability zzs(String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 10 */            Parcel parcelZzw = zzw(34, parcelZza);
/* 20 */            LocationAvailability locationAvailability = (LocationAvailability) zzc.zzb(parcelZzw, LocationAvailability.CREATOR);
/* 22 */            parcelZzw.recycle();
/* 25 */            return locationAvailability;
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzt(LocationSettingsRequest locationSettingsRequest, zzao zzaoVar, String str) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, locationSettingsRequest);
/* 8 */             zzc.zzd(parcelZza, zzaoVar);
/* 12 */            parcelZza.writeString(null);
/* 17 */            zzx(63, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzu(zzl zzlVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, zzlVar);
/* 10 */            zzx(75, parcelZza);
                }

                @Override // com.google.android.gms.internal.location.zzam
                public final void zzv(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzc.zzc(parcelZza, pendingIntent);
/* 8 */             zzc.zzc(parcelZza, sleepSegmentRequest);
/* 11 */            zzc.zzd(parcelZza, iStatusCallback);
/* 16 */            zzx(79, parcelZza);
                }
            }
