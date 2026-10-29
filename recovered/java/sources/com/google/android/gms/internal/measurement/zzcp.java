            package com.google.android.gms.internal.measurement;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcp extends zzbl implements zzcr {
                public zzcp(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void beginAdUnitExposure(String str, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(23, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeString(str2);
/* 11 */            zzbn.zzc(parcelZza, bundle);
/* 16 */            zzc(9, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void clearMeasurementEnabled(long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void endAdUnitExposure(String str, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(24, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void generateEventId(zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcuVar);
/* 10 */            zzc(22, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getAppInstanceId(zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcuVar);
/* 10 */            zzc(20, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getCachedAppInstanceId(zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcuVar);
/* 10 */            zzc(19, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeString(str2);
/* 11 */            zzbn.zzd(parcelZza, zzcuVar);
/* 16 */            zzc(10, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getCurrentScreenClass(zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcuVar);
/* 10 */            zzc(17, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getCurrentScreenName(zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcuVar);
/* 10 */            zzc(16, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getGmpAppId(zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcuVar);
/* 10 */            zzc(21, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getMaxUserProperties(String str, zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             zzbn.zzd(parcelZza, zzcuVar);
/* 12 */            zzc(6, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getSessionId(zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcuVar);
/* 10 */            zzc(46, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getTestFlag(zzcu zzcuVar, int i) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcuVar);
/* 8 */             parcelZza.writeInt(i);
/* 13 */            zzc(38, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void getUserProperties(String str, String str2, boolean z, zzcu zzcuVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeString(str2);
/* 11 */            int i = zzbn.zza;
/* 13 */            parcelZza.writeInt(z ? 1 : 0);
/* 16 */            zzbn.zzd(parcelZza, zzcuVar);
/* 20 */            zzc(5, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void initForTests(Map map) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, iObjectWrapper);
/* 8 */             zzbn.zzc(parcelZza, zzddVar);
/* 11 */            parcelZza.writeLong(j);
/* 15 */            zzc(1, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void isDataCollectionEnabled(zzcu zzcuVar) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeString(str2);
/* 11 */            zzbn.zzc(parcelZza, bundle);
/* 14 */            parcelZza.writeInt(z ? 1 : 0);
/* 17 */            parcelZza.writeInt(z2 ? 1 : 0);
/* 20 */            parcelZza.writeLong(j);
/* 24 */            zzc(2, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 6 */             parcelZza.writeInt(5);
/* 9 */             parcelZza.writeString(str);
/* 12 */            zzbn.zzd(parcelZza, iObjectWrapper);
/* 15 */            zzbn.zzd(parcelZza, iObjectWrapper2);
/* 18 */            zzbn.zzd(parcelZza, iObjectWrapper3);
/* 23 */            zzc(33, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, zzdfVar);
/* 8 */             zzbn.zzc(parcelZza, bundle);
/* 11 */            parcelZza.writeLong(j);
/* 16 */            zzc(53, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, zzdfVar);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(54, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, zzdfVar);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(55, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, zzdfVar);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(56, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, zzdfVar);
/* 8 */             zzbn.zzd(parcelZza, zzcuVar);
/* 11 */            parcelZza.writeLong(j);
/* 16 */            zzc(57, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, zzdfVar);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(51, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, zzdfVar);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(52, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void performAction(Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, bundle);
/* 8 */             zzbn.zzd(parcelZza, zzcuVar);
/* 11 */            parcelZza.writeLong(j);
/* 16 */            zzc(32, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzdaVar);
/* 10 */            zzc(35, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void resetAnalyticsData(long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeLong(j);
/* 10 */            zzc(12, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void retrieveAndUploadBatches(zzcx zzcxVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzcxVar);
/* 10 */            zzc(58, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, bundle);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(8, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setConsent(Bundle bundle, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, bundle);
/* 8 */             parcelZza.writeLong(j);
/* 13 */            zzc(45, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, zzdfVar);
/* 8 */             parcelZza.writeString(str);
/* 11 */            parcelZza.writeString(str2);
/* 14 */            parcelZza.writeLong(j);
/* 19 */            zzc(50, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setDataCollectionEnabled(boolean z) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             int i = zzbn.zza;
/* 7 */             parcelZza.writeInt(z ? 1 : 0);
/* 12 */            zzc(39, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, bundle);
/* 10 */            zzc(42, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setEventInterceptor(zzda zzdaVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzdaVar);
/* 10 */            zzc(34, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setInstanceIdProvider(zzdc zzdcVar) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             int i = zzbn.zza;
/* 7 */             parcelZza.writeInt(z ? 1 : 0);
/* 10 */            parcelZza.writeLong(j);
/* 15 */            zzc(11, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setMinimumSessionDuration(long j) throws RemoteException {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setSessionTimeoutDuration(long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeLong(j);
/* 10 */            zzc(14, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzc(parcelZza, intent);
/* 10 */            zzc(48, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setUserId(String str, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeLong(j);
/* 12 */            zzc(7, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeString(str);
/* 8 */             parcelZza.writeString(str2);
/* 11 */            zzbn.zzd(parcelZza, iObjectWrapper);
/* 14 */            parcelZza.writeInt(z ? 1 : 0);
/* 17 */            parcelZza.writeLong(j);
/* 21 */            zzc(4, parcelZza);
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             zzbn.zzd(parcelZza, zzdaVar);
/* 10 */            zzc(36, parcelZza);
                }
            }
