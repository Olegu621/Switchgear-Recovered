            package com.google.android.gms.internal.measurement;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.appsflyer.attribution.RequestError;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.HashMap;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzcq extends zzbm implements zzcr {
                public zzcq() {
/* 3 */             super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                }

                public static zzcr asInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                    return iInterfaceQueryLocalInterface instanceof zzcr ? (zzcr) iInterfaceQueryLocalInterface : new zzcp(iBinder);
                }

                @Override // com.google.android.gms.internal.measurement.zzbm
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 5 */             zzcu zzcsVar = null;
/* 5 */             zzcx zzcvVar = null;
/* 5 */             zzcu zzcsVar2 = null;
/* 5 */             zzcu zzcsVar3 = null;
/* 5 */             zzcu zzcsVar4 = null;
/* 5 */             zzcu zzcsVar5 = null;
/* 5 */             zzda zzcyVar = null;
/* 5 */             zzda zzcyVar2 = null;
/* 5 */             zzda zzcyVar3 = null;
/* 5 */             zzcu zzcsVar6 = null;
/* 5 */             zzcu zzcsVar7 = null;
/* 5 */             zzcu zzcsVar8 = null;
/* 5 */             zzcu zzcsVar9 = null;
/* 5 */             zzcu zzcsVar10 = null;
/* 5 */             zzcu zzcsVar11 = null;
/* 5 */             zzdc zzdbVar = null;
/* 5 */             zzcu zzcsVar12 = null;
/* 5 */             zzcu zzcsVar13 = null;
/* 5 */             zzcu zzcsVar14 = null;
/* 5 */             zzcu zzcsVar15 = null;
/* 5 */             zzcu zzcsVar16 = null;
                    switch (i) {
                        case 1:
/* 1454 */                  IObjectWrapper iObjectWrapperM2044a = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 1464 */                  zzdd zzddVar = (zzdd) zzbn.zzb(parcel, zzdd.CREATOR);
/* 1466 */                  long j = parcel.readLong();
/* 1470 */                  zzbn.zzf(parcel);
/* 1473 */                  initialize(iObjectWrapperM2044a, zzddVar, j);
                            break;
                        case 2:
/* 1413 */                  String string = parcel.readString();
/* 1417 */                  String string2 = parcel.readString();
/* 1428 */                  Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 1430 */                  boolean zZza = zzbn.zza(parcel);
/* 1434 */                  boolean zZza2 = zzbn.zza(parcel);
/* 1438 */                  long j2 = parcel.readLong();
/* 1442 */                  zzbn.zzf(parcel);
/* 1446 */                  logEvent(string, string2, bundle, zZza, zZza2, j2);
                            break;
                        case 3:
/* 1360 */                  String string3 = parcel.readString();
/* 1364 */                  String string4 = parcel.readString();
/* 1374 */                  Bundle bundle2 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 1376 */                  IBinder strongBinder = parcel.readStrongBinder();
/* 1380 */                  if (strongBinder != null) {
/* 1383 */                      IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1397 */                      zzcsVar = iInterfaceQueryLocalInterface instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface : new zzcs(strongBinder);
                            }
/* 1400 */                  long j3 = parcel.readLong();
/* 1404 */                  zzbn.zzf(parcel);
/* 1409 */                  logEventAndBundle(string3, string4, bundle2, zzcsVar, j3);
                            break;
                        case 4:
/* 1327 */                  String string5 = parcel.readString();
/* 1331 */                  String string6 = parcel.readString();
/* 1339 */                  IObjectWrapper iObjectWrapperM2044a2 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 1343 */                  boolean zZza3 = zzbn.zza(parcel);
/* 1347 */                  long j4 = parcel.readLong();
/* 1351 */                  zzbn.zzf(parcel);
/* 1355 */                  setUserProperty(string5, string6, iObjectWrapperM2044a2, zZza3, j4);
                            break;
                        case 5:
/* 1283 */                  String string7 = parcel.readString();
/* 1287 */                  String string8 = parcel.readString();
/* 1291 */                  boolean zZza4 = zzbn.zza(parcel);
/* 1295 */                  IBinder strongBinder2 = parcel.readStrongBinder();
/* 1299 */                  if (strongBinder2 != null) {
/* 1302 */                      IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1316 */                      zzcsVar16 = iInterfaceQueryLocalInterface2 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface2 : new zzcs(strongBinder2);
                            }
/* 1319 */                  zzbn.zzf(parcel);
/* 1322 */                  getUserProperties(string7, string8, zZza4, zzcsVar16);
                            break;
                        case 6:
/* 1247 */                  String string9 = parcel.readString();
/* 1251 */                  IBinder strongBinder3 = parcel.readStrongBinder();
/* 1255 */                  if (strongBinder3 != null) {
/* 1258 */                      IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1272 */                      zzcsVar15 = iInterfaceQueryLocalInterface3 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface3 : new zzcs(strongBinder3);
                            }
/* 1275 */                  zzbn.zzf(parcel);
/* 1278 */                  getMaxUserProperties(string9, zzcsVar15);
                            break;
                        case 7:
/* 1231 */                  String string10 = parcel.readString();
/* 1235 */                  long j5 = parcel.readLong();
/* 1239 */                  zzbn.zzf(parcel);
/* 1242 */                  setUserId(string10, j5);
                            break;
                        case 8:
/* 1217 */                  Bundle bundle3 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 1219 */                  long j6 = parcel.readLong();
/* 1223 */                  zzbn.zzf(parcel);
/* 1226 */                  setConditionalUserProperty(bundle3, j6);
                            break;
                        case 9:
/* 1187 */                  String string11 = parcel.readString();
/* 1191 */                  String string12 = parcel.readString();
/* 1201 */                  Bundle bundle4 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 1203 */                  zzbn.zzf(parcel);
/* 1206 */                  clearConditionalUserProperty(string11, string12, bundle4);
                            break;
                        case 10:
/* 1147 */                  String string13 = parcel.readString();
/* 1151 */                  String string14 = parcel.readString();
/* 1155 */                  IBinder strongBinder4 = parcel.readStrongBinder();
/* 1159 */                  if (strongBinder4 != null) {
/* 1162 */                      IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1176 */                      zzcsVar14 = iInterfaceQueryLocalInterface4 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface4 : new zzcs(strongBinder4);
                            }
/* 1179 */                  zzbn.zzf(parcel);
/* 1182 */                  getConditionalUserProperties(string13, string14, zzcsVar14);
                            break;
                        case 11:
/* 1131 */                  boolean zZza5 = zzbn.zza(parcel);
/* 1135 */                  long j7 = parcel.readLong();
/* 1139 */                  zzbn.zzf(parcel);
/* 1142 */                  setMeasurementEnabled(zZza5, j7);
                            break;
                        case 12:
/* 1119 */                  long j8 = parcel.readLong();
/* 1123 */                  zzbn.zzf(parcel);
/* 1126 */                  resetAnalyticsData(j8);
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1107 */                  long j9 = parcel.readLong();
/* 1111 */                  zzbn.zzf(parcel);
/* 1114 */                  setMinimumSessionDuration(j9);
                            break;
                        case 14:
/* 1095 */                  long j10 = parcel.readLong();
/* 1099 */                  zzbn.zzf(parcel);
/* 1102 */                  setSessionTimeoutDuration(j10);
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1070 */                  IObjectWrapper iObjectWrapperM2044a3 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 1074 */                  String string15 = parcel.readString();
/* 1078 */                  String string16 = parcel.readString();
/* 1082 */                  long j11 = parcel.readLong();
/* 1086 */                  zzbn.zzf(parcel);
/* 1090 */                  setCurrentScreen(iObjectWrapperM2044a3, string15, string16, j11);
                            break;
                        case 16:
/* 1034 */                  IBinder strongBinder5 = parcel.readStrongBinder();
/* 1038 */                  if (strongBinder5 != null) {
/* 1041 */                      IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1055 */                      zzcsVar13 = iInterfaceQueryLocalInterface5 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface5 : new zzcs(strongBinder5);
                            }
/* 1058 */                  zzbn.zzf(parcel);
/* 1061 */                  getCurrentScreenName(zzcsVar13);
                            break;
                        case 17:
/* 1002 */                  IBinder strongBinder6 = parcel.readStrongBinder();
/* 1006 */                  if (strongBinder6 != null) {
/* 1009 */                      IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1023 */                      zzcsVar12 = iInterfaceQueryLocalInterface6 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface6 : new zzcs(strongBinder6);
                            }
/* 1026 */                  zzbn.zzf(parcel);
/* 1029 */                  getCurrentScreenClass(zzcsVar12);
                            break;
                        case 18:
/* 968 */                   IBinder strongBinder7 = parcel.readStrongBinder();
/* 972 */                   if (strongBinder7 != null) {
/* 977 */                       IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
/* 991 */                       zzdbVar = iInterfaceQueryLocalInterface7 instanceof zzdc ? (zzdc) iInterfaceQueryLocalInterface7 : new zzdb(strongBinder7);
                            }
/* 994 */                   zzbn.zzf(parcel);
/* 997 */                   setInstanceIdProvider(zzdbVar);
                            break;
                        case 19:
/* 936 */                   IBinder strongBinder8 = parcel.readStrongBinder();
/* 940 */                   if (strongBinder8 != null) {
/* 943 */                       IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 957 */                       zzcsVar11 = iInterfaceQueryLocalInterface8 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface8 : new zzcs(strongBinder8);
                            }
/* 960 */                   zzbn.zzf(parcel);
/* 963 */                   getCachedAppInstanceId(zzcsVar11);
                            break;
                        case 20:
/* 904 */                   IBinder strongBinder9 = parcel.readStrongBinder();
/* 908 */                   if (strongBinder9 != null) {
/* 911 */                       IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 925 */                       zzcsVar10 = iInterfaceQueryLocalInterface9 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface9 : new zzcs(strongBinder9);
                            }
/* 928 */                   zzbn.zzf(parcel);
/* 931 */                   getAppInstanceId(zzcsVar10);
                            break;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 872 */                   IBinder strongBinder10 = parcel.readStrongBinder();
/* 876 */                   if (strongBinder10 != null) {
/* 879 */                       IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 893 */                       zzcsVar9 = iInterfaceQueryLocalInterface10 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface10 : new zzcs(strongBinder10);
                            }
/* 896 */                   zzbn.zzf(parcel);
/* 899 */                   getGmpAppId(zzcsVar9);
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 840 */                   IBinder strongBinder11 = parcel.readStrongBinder();
/* 844 */                   if (strongBinder11 != null) {
/* 847 */                       IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 861 */                       zzcsVar8 = iInterfaceQueryLocalInterface11 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface11 : new zzcs(strongBinder11);
                            }
/* 864 */                   zzbn.zzf(parcel);
/* 867 */                   generateEventId(zzcsVar8);
                            break;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 824 */                   String string17 = parcel.readString();
/* 828 */                   long j12 = parcel.readLong();
/* 832 */                   zzbn.zzf(parcel);
/* 835 */                   beginAdUnitExposure(string17, j12);
                            break;
                        case 24:
/* 808 */                   String string18 = parcel.readString();
/* 812 */                   long j13 = parcel.readLong();
/* 816 */                   zzbn.zzf(parcel);
/* 819 */                   endAdUnitExposure(string18, j13);
                            break;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 792 */                   IObjectWrapper iObjectWrapperM2044a4 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 796 */                   long j14 = parcel.readLong();
/* 800 */                   zzbn.zzf(parcel);
/* 803 */                   onActivityStarted(iObjectWrapperM2044a4, j14);
                            break;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 772 */                   IObjectWrapper iObjectWrapperM2044a5 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 776 */                   long j15 = parcel.readLong();
/* 780 */                   zzbn.zzf(parcel);
/* 783 */                   onActivityStopped(iObjectWrapperM2044a5, j15);
                            break;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 744 */                   IObjectWrapper iObjectWrapperM2044a6 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 754 */                   Bundle bundle5 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 756 */                   long j16 = parcel.readLong();
/* 760 */                   zzbn.zzf(parcel);
/* 763 */                   onActivityCreated(iObjectWrapperM2044a6, bundle5, j16);
                            break;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 724 */                   IObjectWrapper iObjectWrapperM2044a7 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 728 */                   long j17 = parcel.readLong();
/* 732 */                   zzbn.zzf(parcel);
/* 735 */                   onActivityDestroyed(iObjectWrapperM2044a7, j17);
                            break;
                        case Build.API_LEVELS.API_29 /* 29 */:
/* 704 */                   IObjectWrapper iObjectWrapperM2044a8 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 708 */                   long j18 = parcel.readLong();
/* 712 */                   zzbn.zzf(parcel);
/* 715 */                   onActivityPaused(iObjectWrapperM2044a8, j18);
                            break;
                        case Build.API_LEVELS.API_30 /* 30 */:
/* 684 */                   IObjectWrapper iObjectWrapperM2044a9 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 688 */                   long j19 = parcel.readLong();
/* 692 */                   zzbn.zzf(parcel);
/* 695 */                   onActivityResumed(iObjectWrapperM2044a9, j19);
                            break;
                        case Build.API_LEVELS.API_31 /* 31 */:
/* 640 */                   IObjectWrapper iObjectWrapperM2044a10 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 644 */                   IBinder strongBinder12 = parcel.readStrongBinder();
/* 648 */                   if (strongBinder12 != null) {
/* 651 */                       IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 665 */                       zzcsVar7 = iInterfaceQueryLocalInterface12 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface12 : new zzcs(strongBinder12);
                            }
/* 668 */                   long j20 = parcel.readLong();
/* 672 */                   zzbn.zzf(parcel);
/* 675 */                   onActivitySaveInstanceState(iObjectWrapperM2044a10, zzcsVar7, j20);
                            break;
                        case 32:
/* 598 */                   Bundle bundle6 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 600 */                   IBinder strongBinder13 = parcel.readStrongBinder();
/* 604 */                   if (strongBinder13 != null) {
/* 607 */                       IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 621 */                       zzcsVar6 = iInterfaceQueryLocalInterface13 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface13 : new zzcs(strongBinder13);
                            }
/* 624 */                   long j21 = parcel.readLong();
/* 628 */                   zzbn.zzf(parcel);
/* 631 */                   performAction(bundle6, zzcsVar6, j21);
                            break;
                        case Build.API_LEVELS.API_33 /* 33 */:
/* 551 */                   int i3 = parcel.readInt();
/* 555 */                   String string19 = parcel.readString();
/* 563 */                   IObjectWrapper iObjectWrapperM2044a11 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 571 */                   IObjectWrapper iObjectWrapperM2044a12 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 579 */                   IObjectWrapper iObjectWrapperM2044a13 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 583 */                   zzbn.zzf(parcel);
/* 587 */                   logHealthData(i3, string19, iObjectWrapperM2044a11, iObjectWrapperM2044a12, iObjectWrapperM2044a13);
                            break;
                        case Build.API_LEVELS.API_34 /* 34 */:
/* 519 */                   IBinder strongBinder14 = parcel.readStrongBinder();
/* 523 */                   if (strongBinder14 != null) {
/* 526 */                       IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
/* 540 */                       zzcyVar3 = iInterfaceQueryLocalInterface14 instanceof zzda ? (zzda) iInterfaceQueryLocalInterface14 : new zzcy(strongBinder14);
                            }
/* 543 */                   zzbn.zzf(parcel);
/* 546 */                   setEventInterceptor(zzcyVar3);
                            break;
                        case Build.API_LEVELS.API_35 /* 35 */:
/* 487 */                   IBinder strongBinder15 = parcel.readStrongBinder();
/* 491 */                   if (strongBinder15 != null) {
/* 494 */                       IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
/* 508 */                       zzcyVar2 = iInterfaceQueryLocalInterface15 instanceof zzda ? (zzda) iInterfaceQueryLocalInterface15 : new zzcy(strongBinder15);
                            }
/* 511 */                   zzbn.zzf(parcel);
/* 514 */                   registerOnMeasurementEventListener(zzcyVar2);
                            break;
                        case Build.API_LEVELS.API_36 /* 36 */:
/* 455 */                   IBinder strongBinder16 = parcel.readStrongBinder();
/* 459 */                   if (strongBinder16 != null) {
/* 462 */                       IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
/* 476 */                       zzcyVar = iInterfaceQueryLocalInterface16 instanceof zzda ? (zzda) iInterfaceQueryLocalInterface16 : new zzcy(strongBinder16);
                            }
/* 479 */                   zzbn.zzf(parcel);
/* 482 */                   unregisterOnMeasurementEventListener(zzcyVar);
                            break;
                        case 37:
/* 443 */                   HashMap mapZze = zzbn.zze(parcel);
/* 447 */                   zzbn.zzf(parcel);
/* 450 */                   initForTests(mapZze);
                            break;
                        case 38:
/* 407 */                   IBinder strongBinder17 = parcel.readStrongBinder();
/* 411 */                   if (strongBinder17 != null) {
/* 414 */                       IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 428 */                       zzcsVar5 = iInterfaceQueryLocalInterface17 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface17 : new zzcs(strongBinder17);
                            }
/* 431 */                   int i4 = parcel.readInt();
/* 435 */                   zzbn.zzf(parcel);
/* 438 */                   getTestFlag(zzcsVar5, i4);
                            break;
                        case 39:
/* 395 */                   boolean zZza6 = zzbn.zza(parcel);
/* 399 */                   zzbn.zzf(parcel);
/* 402 */                   setDataCollectionEnabled(zZza6);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
/* 363 */                   IBinder strongBinder18 = parcel.readStrongBinder();
/* 367 */                   if (strongBinder18 != null) {
/* 370 */                       IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 384 */                       zzcsVar4 = iInterfaceQueryLocalInterface18 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface18 : new zzcs(strongBinder18);
                            }
/* 387 */                   zzbn.zzf(parcel);
/* 390 */                   isDataCollectionEnabled(zzcsVar4);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 47:
                        case 49:
                        default:
/* 9 */                     return false;
                        case 42:
/* 353 */                   Bundle bundle7 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 355 */                   zzbn.zzf(parcel);
/* 358 */                   setDefaultEventParameters(bundle7);
                            break;
                        case 43:
/* 335 */                   long j22 = parcel.readLong();
/* 339 */                   zzbn.zzf(parcel);
/* 342 */                   clearMeasurementEnabled(j22);
                            break;
                        case 44:
/* 321 */                   Bundle bundle8 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 323 */                   long j23 = parcel.readLong();
/* 327 */                   zzbn.zzf(parcel);
/* 330 */                   setConsent(bundle8, j23);
                            break;
                        case 45:
/* 301 */                   Bundle bundle9 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 303 */                   long j24 = parcel.readLong();
/* 307 */                   zzbn.zzf(parcel);
/* 310 */                   setConsentThirdParty(bundle9, j24);
                            break;
                        case 46:
/* 263 */                   IBinder strongBinder19 = parcel.readStrongBinder();
/* 267 */                   if (strongBinder19 != null) {
/* 270 */                       IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 284 */                       zzcsVar3 = iInterfaceQueryLocalInterface19 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface19 : new zzcs(strongBinder19);
                            }
/* 287 */                   zzbn.zzf(parcel);
/* 290 */                   getSessionId(zzcsVar3);
                            break;
                        case 48:
/* 253 */                   Intent intent = (Intent) zzbn.zzb(parcel, Intent.CREATOR);
/* 255 */                   zzbn.zzf(parcel);
/* 258 */                   setSgtmDebugInfo(intent);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 223 */                   zzdf zzdfVar = (zzdf) zzbn.zzb(parcel, zzdf.CREATOR);
/* 226 */                   String string20 = parcel.readString();
/* 230 */                   String string21 = parcel.readString();
/* 234 */                   long j25 = parcel.readLong();
/* 238 */                   zzbn.zzf(parcel);
/* 242 */                   setCurrentScreenByScionActivityInfo(zzdfVar, string20, string21, j25);
                            break;
                        case 51:
/* 203 */                   zzdf zzdfVar2 = (zzdf) zzbn.zzb(parcel, zzdf.CREATOR);
/* 205 */                   long j26 = parcel.readLong();
/* 209 */                   zzbn.zzf(parcel);
/* 212 */                   onActivityStartedByScionActivityInfo(zzdfVar2, j26);
                            break;
                        case 52:
/* 183 */                   zzdf zzdfVar3 = (zzdf) zzbn.zzb(parcel, zzdf.CREATOR);
/* 185 */                   long j27 = parcel.readLong();
/* 189 */                   zzbn.zzf(parcel);
/* 192 */                   onActivityStoppedByScionActivityInfo(zzdfVar3, j27);
                            break;
                        case 53:
/* 155 */                   zzdf zzdfVar4 = (zzdf) zzbn.zzb(parcel, zzdf.CREATOR);
/* 163 */                   Bundle bundle10 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 165 */                   long j28 = parcel.readLong();
/* 169 */                   zzbn.zzf(parcel);
/* 172 */                   onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, j28);
                            break;
                        case 54:
/* 135 */                   zzdf zzdfVar5 = (zzdf) zzbn.zzb(parcel, zzdf.CREATOR);
/* 137 */                   long j29 = parcel.readLong();
/* 141 */                   zzbn.zzf(parcel);
/* 144 */                   onActivityDestroyedByScionActivityInfo(zzdfVar5, j29);
                            break;
                        case 55:
/* 115 */                   zzdf zzdfVar6 = (zzdf) zzbn.zzb(parcel, zzdf.CREATOR);
/* 117 */                   long j30 = parcel.readLong();
/* 121 */                   zzbn.zzf(parcel);
/* 124 */                   onActivityPausedByScionActivityInfo(zzdfVar6, j30);
                            break;
                        case 56:
/* 95 */                    zzdf zzdfVar7 = (zzdf) zzbn.zzb(parcel, zzdf.CREATOR);
/* 97 */                    long j31 = parcel.readLong();
/* 101 */                   zzbn.zzf(parcel);
/* 104 */                   onActivityResumedByScionActivityInfo(zzdfVar7, j31);
                            break;
                        case 57:
/* 51 */                    zzdf zzdfVar8 = (zzdf) zzbn.zzb(parcel, zzdf.CREATOR);
/* 53 */                    IBinder strongBinder20 = parcel.readStrongBinder();
/* 57 */                    if (strongBinder20 != null) {
/* 60 */                        IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 74 */                        zzcsVar2 = iInterfaceQueryLocalInterface20 instanceof zzcu ? (zzcu) iInterfaceQueryLocalInterface20 : new zzcs(strongBinder20);
                            }
/* 77 */                    long j32 = parcel.readLong();
/* 81 */                    zzbn.zzf(parcel);
/* 84 */                    onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, zzcsVar2, j32);
                            break;
                        case 58:
/* 11 */                    IBinder strongBinder21 = parcel.readStrongBinder();
/* 15 */                    if (strongBinder21 != null) {
/* 20 */                        IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
/* 34 */                        zzcvVar = iInterfaceQueryLocalInterface21 instanceof zzcx ? (zzcx) iInterfaceQueryLocalInterface21 : new zzcv(strongBinder21);
                            }
/* 37 */                    zzbn.zzf(parcel);
/* 40 */                    retrieveAndUploadBatches(zzcvVar);
                            break;
                    }
/* 1476 */          parcel2.writeNoException();
/* 1479 */          return true;
                }
            }
