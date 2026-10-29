            package p000;

            import android.app.PendingIntent;
            import android.location.Location;
            import android.net.Uri;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.android.gms.auth.AccountChangeEvent;
            import com.google.android.gms.auth.AccountChangeEventsResponse;
            import com.google.android.gms.common.api.ComplianceOptions;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.data.BitmapTeleporter;
            import com.google.android.gms.common.internal.DowngradeableSafeParcel;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.events.zzb;
            import com.google.android.gms.drive.events.zze;
            import com.google.android.gms.drive.metadata.CustomPropertyKey;
            import com.google.android.gms.drive.metadata.internal.zzc;
            import com.google.android.gms.drive.query.SortOrder;
            import com.google.android.gms.drive.query.internal.zzf;
            import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
            import com.google.android.gms.fido.fido2.api.common.UvmEntries;
            import com.google.android.gms.fido.u2f.api.common.ErrorCode;
            import com.google.android.gms.games.GameEntity;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
            import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
            import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
            import com.google.android.gms.location.LocationRequest;
            import com.google.android.gms.location.LocationResult;
            import com.google.android.gms.location.LocationSettingsRequest;
            import com.google.android.gms.location.LocationSettingsResult;
            import com.google.android.gms.location.LocationSettingsStates;
            import com.google.android.gms.location.SleepClassifyEvent;
            import com.google.android.gms.location.SleepSegmentEvent;
            import com.google.android.gms.location.SleepSegmentRequest;
            import com.google.android.gms.location.zzbj;
            import com.google.android.gms.location.zzbo;
            import com.google.android.gms.location.zzbq;
            import com.google.android.gms.location.zzbx;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.recaptchabase.ExecuteResult;
            import com.google.android.libraries.play.games.internal.zzcl;
            import com.google.android.libraries.play.games.internal.zzcn;
            import com.google.android.libraries.play.games.internal.zzcs;
            import com.google.android.libraries.play.games.internal.zzcv;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class re3 implements Parcelable.Creator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16029a;

                public /* synthetic */ re3(int i) {
/* 1 */             this.f16029a = i;
                }

                /* JADX INFO: renamed from: a */
                public static void m8151a(zzbg zzbgVar, Parcel parcel, int i) {
/* 1 */             String str = zzbgVar.f4208a;
/* 5 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, str, false);
/* 17 */            w11.m9409S(parcel, 3, zzbgVar.f4209b, i, false);
/* 23 */            w11.m9410T(parcel, 4, zzbgVar.f4210c, false);
/* 26 */            long j = zzbgVar.f4211d;
/* 31 */            w11.m9420b0(parcel, 5, 8);
/* 34 */            parcel.writeLong(j);
/* 37 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    wr3 wr3VarM9611p;
                    cm3 cm3VarM1730p;
/* 5 */             int i = this.f16029a;
/* 7 */             String strM7899j = HttpUrl.FRAGMENT_ENCODE_SET;
/* 14 */            boolean zM7914y = false;
/* 14 */            int iM7871D = 0;
/* 14 */            int iM7871D2 = 0;
/* 14 */            boolean zM7914y2 = false;
/* 14 */            int iM7871D3 = 0;
/* 14 */            int iM7871D4 = 0;
/* 14 */            int iM7871D5 = 0;
/* 14 */            int iM7871D6 = 0;
/* 15 */            ArrayList arrayListM7903n = null;
/* 15 */            CustomPropertyKey customPropertyKey = null;
/* 15 */            String strM7899j2 = null;
/* 15 */            String strM7899j3 = null;
/* 15 */            ArrayList arrayListM7903n2 = null;
/* 15 */            ArrayList arrayListM7903n3 = null;
/* 15 */            String strM7899j4 = null;
/* 15 */            zze zzeVar = null;
/* 15 */            UvmEntries uvmEntries = null;
/* 15 */            ArrayList arrayListM7903n4 = null;
/* 15 */            ArrayList arrayListM7901l = null;
/* 15 */            Status status = null;
                    switch (i) {
                        case 0:
/* 1704 */                  int iM7883P = qj3.m7883P(parcel);
/* 1708 */                  List listM7903n = LocationResult.f4132b;
/* 1714 */                  while (parcel.dataPosition() < iM7883P) {
/* 1716 */                      int i2 = parcel.readInt();
/* 1721 */                      if (((char) i2) != 1) {
/* 1723 */                          qj3.m7878K(i2, parcel);
                                } else {
/* 1729 */                          listM7903n = qj3.m7903n(parcel, i2, Location.CREATOR);
                                }
                            }
/* 1734 */                  qj3.m7908s(iM7883P, parcel);
/* 1739 */                  return new LocationResult(listM7903n);
                        case 1:
/* 1634 */                  int iM7883P2 = qj3.m7883P(parcel);
/* 1638 */                  long jM7873F = 0;
/* 1640 */                  String strM7899j5 = null;
/* 1641 */                  zzbe zzbeVar = null;
/* 1642 */                  String strM7899j6 = null;
/* 1647 */                  while (parcel.dataPosition() < iM7883P2) {
/* 1649 */                      int i3 = parcel.readInt();
/* 1653 */                      char c = (char) i3;
/* 1654 */                      if (c == 2) {
/* 1689 */                          strM7899j5 = qj3.m7899j(i3, parcel);
                                } else if (c == 3) {
/* 1685 */                          zzbeVar = (zzbe) qj3.m7898i(parcel, i3, zzbe.CREATOR);
                                } else if (c == 4) {
/* 1673 */                          strM7899j6 = qj3.m7899j(i3, parcel);
                                } else if (c != 5) {
/* 1662 */                          qj3.m7878K(i3, parcel);
                                } else {
/* 1666 */                          jM7873F = qj3.m7873F(i3, parcel);
                                }
                            }
/* 1695 */                  qj3.m7908s(iM7883P2, parcel);
/* 1700 */                  return new zzbg(strM7899j5, zzbeVar, strM7899j6, jM7873F);
                        case 2:
/* 1583 */                  int iM7883P3 = qj3.m7883P(parcel);
/* 1587 */                  String strM7899j7 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 1588 */                  String strM7899j8 = strM7899j7;
/* 1593 */                  while (parcel.dataPosition() < iM7883P3) {
/* 1595 */                      int i4 = parcel.readInt();
/* 1599 */                      char c2 = (char) i4;
/* 1600 */                      if (c2 == 1) {
/* 1620 */                          strM7899j7 = qj3.m7899j(i4, parcel);
                                } else if (c2 == 2) {
/* 1615 */                          strM7899j8 = qj3.m7899j(i4, parcel);
                                } else if (c2 != 5) {
/* 1606 */                          qj3.m7878K(i4, parcel);
                                } else {
/* 1610 */                          strM7899j = qj3.m7899j(i4, parcel);
                                }
                            }
/* 1625 */                  qj3.m7908s(iM7883P3, parcel);
/* 1630 */                  return new zzbj(strM7899j, strM7899j7, strM7899j8);
                        case 3:
/* 1517 */                  int iM7883P4 = qj3.m7883P(parcel);
/* 1521 */                  boolean zM7914y3 = false;
/* 1522 */                  zzbj zzbjVar = null;
/* 1527 */                  while (parcel.dataPosition() < iM7883P4) {
/* 1529 */                      int i5 = parcel.readInt();
/* 1533 */                      char c3 = (char) i5;
/* 1534 */                      if (c3 == 1) {
/* 1568 */                          arrayListM7903n = qj3.m7903n(parcel, i5, LocationRequest.CREATOR);
                                } else if (c3 == 2) {
/* 1560 */                          zM7914y = qj3.m7914y(i5, parcel);
                                } else if (c3 == 3) {
/* 1555 */                          zM7914y3 = qj3.m7914y(i5, parcel);
                                } else if (c3 != 5) {
/* 1542 */                          qj3.m7878K(i5, parcel);
                                } else {
/* 1552 */                          zzbjVar = (zzbj) qj3.m7898i(parcel, i5, zzbj.CREATOR);
                                }
                            }
/* 1574 */                  qj3.m7908s(iM7883P4, parcel);
/* 1579 */                  return new LocationSettingsRequest(arrayListM7903n, zM7914y, zM7914y3, zzbjVar);
                        case 4:
/* 1465 */                  int iM7883P5 = qj3.m7883P(parcel);
/* 1469 */                  LocationSettingsStates locationSettingsStates = null;
/* 1474 */                  while (parcel.dataPosition() < iM7883P5) {
/* 1476 */                      int i6 = parcel.readInt();
/* 1480 */                      char c4 = (char) i6;
/* 1481 */                      if (c4 == 1) {
/* 1504 */                          status = (Status) qj3.m7898i(parcel, i6, Status.CREATOR);
                                } else if (c4 != 2) {
/* 1485 */                          qj3.m7878K(i6, parcel);
                                } else {
/* 1495 */                          locationSettingsStates = (LocationSettingsStates) qj3.m7898i(parcel, i6, LocationSettingsStates.CREATOR);
                                }
                            }
/* 1508 */                  qj3.m7908s(iM7883P5, parcel);
/* 1513 */                  return new LocationSettingsResult(status, locationSettingsStates);
                        case 5:
/* 1398 */                  int iM7883P6 = qj3.m7883P(parcel);
/* 1402 */                  boolean zM7914y4 = false;
/* 1403 */                  boolean zM7914y5 = false;
/* 1404 */                  boolean zM7914y6 = false;
/* 1405 */                  boolean zM7914y7 = false;
/* 1406 */                  boolean zM7914y8 = false;
/* 1407 */                  boolean zM7914y9 = false;
/* 1412 */                  while (parcel.dataPosition() < iM7883P6) {
/* 1414 */                      int i7 = parcel.readInt();
                                switch ((char) i7) {
                                    case 1:
/* 1451 */                              zM7914y4 = qj3.m7914y(i7, parcel);
                                        break;
                                    case 2:
/* 1446 */                              zM7914y5 = qj3.m7914y(i7, parcel);
                                        break;
                                    case 3:
/* 1441 */                              zM7914y6 = qj3.m7914y(i7, parcel);
                                        break;
                                    case 4:
/* 1436 */                              zM7914y7 = qj3.m7914y(i7, parcel);
                                        break;
                                    case 5:
/* 1431 */                              zM7914y8 = qj3.m7914y(i7, parcel);
                                        break;
                                    case 6:
/* 1426 */                              zM7914y9 = qj3.m7914y(i7, parcel);
                                        break;
                                    default:
/* 1422 */                              qj3.m7878K(i7, parcel);
                                        break;
                                }
                            }
/* 1456 */                  qj3.m7908s(iM7883P6, parcel);
/* 1461 */                  return new LocationSettingsStates(zM7914y4, zM7914y5, zM7914y6, zM7914y7, zM7914y8, zM7914y9);
                        case 6:
/* 1332 */                  int iM7883P7 = qj3.m7883P(parcel);
/* 1338 */                  long jM7873F2 = -1;
/* 1339 */                  long jM7873F3 = -1;
/* 1341 */                  int iM7871D7 = 1;
/* 1342 */                  int iM7871D8 = 1;
/* 1347 */                  while (parcel.dataPosition() < iM7883P7) {
/* 1349 */                      int i8 = parcel.readInt();
/* 1353 */                      char c5 = (char) i8;
/* 1354 */                      if (c5 == 1) {
/* 1384 */                          iM7871D7 = qj3.m7871D(i8, parcel);
                                } else if (c5 == 2) {
/* 1379 */                          iM7871D8 = qj3.m7871D(i8, parcel);
                                } else if (c5 == 3) {
/* 1373 */                          jM7873F2 = qj3.m7873F(i8, parcel);
                                } else if (c5 != 4) {
/* 1362 */                          qj3.m7878K(i8, parcel);
                                } else {
/* 1366 */                          jM7873F3 = qj3.m7873F(i8, parcel);
                                }
                            }
/* 1389 */                  qj3.m7908s(iM7883P7, parcel);
/* 1394 */                  return new zzbo(iM7871D7, iM7871D8, jM7873F2, jM7873F3);
                        case 7:
/* 1277 */                  int iM7883P8 = qj3.m7883P(parcel);
/* 1281 */                  PendingIntent pendingIntent = null;
/* 1286 */                  while (parcel.dataPosition() < iM7883P8) {
/* 1288 */                      int i9 = parcel.readInt();
/* 1292 */                      char c6 = (char) i9;
/* 1293 */                      if (c6 == 1) {
/* 1317 */                          arrayListM7901l = qj3.m7901l(i9, parcel);
                                } else if (c6 == 2) {
/* 1314 */                          pendingIntent = (PendingIntent) qj3.m7898i(parcel, i9, PendingIntent.CREATOR);
                                } else if (c6 != 3) {
/* 1299 */                          qj3.m7878K(i9, parcel);
                                } else {
/* 1303 */                          strM7899j = qj3.m7899j(i9, parcel);
                                }
                            }
/* 1323 */                  qj3.m7908s(iM7883P8, parcel);
/* 1328 */                  return new zzbq(arrayListM7901l, pendingIntent, strM7899j);
                        case 8:
/* 1177 */                  int iM7883P9 = qj3.m7883P(parcel);
/* 1181 */                  int iM7871D9 = 0;
/* 1182 */                  int iM7871D10 = 0;
/* 1183 */                  int iM7871D11 = 0;
/* 1184 */                  int iM7871D12 = 0;
/* 1185 */                  int iM7871D13 = 0;
/* 1186 */                  int iM7871D14 = 0;
/* 1187 */                  int iM7871D15 = 0;
/* 1189 */                  boolean zM7914y10 = false;
/* 1191 */                  int iM7871D16 = 0;
/* 1197 */                  while (parcel.dataPosition() < iM7883P9) {
/* 1199 */                      int i10 = parcel.readInt();
                                switch ((char) i10) {
                                    case 1:
/* 1262 */                              iM7871D9 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 2:
/* 1256 */                              iM7871D10 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 3:
/* 1250 */                              iM7871D11 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 4:
/* 1244 */                              iM7871D12 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 5:
/* 1238 */                              iM7871D13 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 6:
/* 1232 */                              iM7871D14 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 7:
/* 1225 */                              iM7871D15 = qj3.m7871D(i10, parcel);
                                        break;
                                    case '\b':
/* 1218 */                              zM7914y10 = qj3.m7914y(i10, parcel);
                                        break;
                                    case '\t':
/* 1211 */                              iM7871D16 = qj3.m7871D(i10, parcel);
                                        break;
                                    default:
/* 1207 */                              qj3.m7878K(i10, parcel);
                                        break;
                                }
                            }
/* 1268 */                  qj3.m7908s(iM7883P9, parcel);
/* 1273 */                  return new SleepClassifyEvent(iM7871D9, iM7871D10, iM7871D11, iM7871D12, iM7871D13, iM7871D14, iM7871D15, zM7914y10, iM7871D16);
                        case 9:
/* 1100 */                  int iM7883P10 = qj3.m7883P(parcel);
/* 1104 */                  long jM7873F4 = 0;
/* 1106 */                  long jM7873F5 = 0;
/* 1108 */                  int iM7871D17 = 0;
/* 1109 */                  int iM7871D18 = 0;
/* 1110 */                  int iM7871D19 = 0;
/* 1115 */                  while (parcel.dataPosition() < iM7883P10) {
/* 1117 */                      int i11 = parcel.readInt();
/* 1121 */                      char c7 = (char) i11;
/* 1122 */                      if (c7 == 1) {
/* 1161 */                          jM7873F4 = qj3.m7873F(i11, parcel);
                                } else if (c7 == 2) {
/* 1154 */                          jM7873F5 = qj3.m7873F(i11, parcel);
                                } else if (c7 == 3) {
/* 1148 */                          iM7871D17 = qj3.m7871D(i11, parcel);
                                } else if (c7 == 4) {
/* 1142 */                          iM7871D18 = qj3.m7871D(i11, parcel);
                                } else if (c7 != 5) {
/* 1132 */                          qj3.m7878K(i11, parcel);
                                } else {
/* 1136 */                          iM7871D19 = qj3.m7871D(i11, parcel);
                                }
                            }
/* 1168 */                  qj3.m7908s(iM7883P10, parcel);
/* 1173 */                  return new SleepSegmentEvent(iM7871D17, iM7871D18, iM7871D19, jM7873F4, jM7873F5);
                        case 10:
/* 1054 */                  int iM7883P11 = qj3.m7883P(parcel);
/* 1062 */                  while (parcel.dataPosition() < iM7883P11) {
/* 1064 */                      int i12 = parcel.readInt();
/* 1068 */                      char c8 = (char) i12;
/* 1069 */                      if (c8 == 1) {
/* 1085 */                          arrayListM7903n4 = qj3.m7903n(parcel, i12, zzbx.CREATOR);
                                } else if (c8 != 2) {
/* 1073 */                          qj3.m7878K(i12, parcel);
                                } else {
/* 1077 */                          iM7871D6 = qj3.m7871D(i12, parcel);
                                }
                            }
/* 1091 */                  qj3.m7908s(iM7883P11, parcel);
/* 1096 */                  return new SleepSegmentRequest(iM7871D6, arrayListM7903n4);
                        case 11:
/* 994 */                   int iM7883P12 = qj3.m7883P(parcel);
/* 998 */                   int iM7871D20 = 0;
/* 999 */                   int iM7871D21 = 0;
/* 1000 */                  int iM7871D22 = 0;
/* 1005 */                  while (parcel.dataPosition() < iM7883P12) {
/* 1007 */                      int i13 = parcel.readInt();
/* 1011 */                      char c9 = (char) i13;
/* 1012 */                      if (c9 == 1) {
/* 1039 */                          iM7871D5 = qj3.m7871D(i13, parcel);
                                } else if (c9 == 2) {
/* 1034 */                          iM7871D20 = qj3.m7871D(i13, parcel);
                                } else if (c9 == 3) {
/* 1029 */                          iM7871D21 = qj3.m7871D(i13, parcel);
                                } else if (c9 != 4) {
/* 1020 */                          qj3.m7878K(i13, parcel);
                                } else {
/* 1024 */                          iM7871D22 = qj3.m7871D(i13, parcel);
                                }
                            }
/* 1045 */                  qj3.m7908s(iM7883P12, parcel);
/* 1050 */                  return new zzbx(iM7871D5, iM7871D20, iM7871D21, iM7871D22);
                        case 12:
/* 942 */                   int iM7883P13 = qj3.m7883P(parcel);
/* 946 */                   com.google.android.gms.fido.fido2.api.common.zze zzeVar2 = null;
/* 951 */                   while (parcel.dataPosition() < iM7883P13) {
/* 953 */                       int i14 = parcel.readInt();
/* 957 */                       char c10 = (char) i14;
/* 958 */                       if (c10 == 1) {
/* 982 */                           uvmEntries = (UvmEntries) qj3.m7898i(parcel, i14, UvmEntries.CREATOR);
                                } else if (c10 != 2) {
/* 962 */                           qj3.m7878K(i14, parcel);
                                } else {
/* 972 */                           zzeVar2 = (com.google.android.gms.fido.fido2.api.common.zze) qj3.m7898i(parcel, i14, com.google.android.gms.fido.fido2.api.common.zze.CREATOR);
                                }
                            }
/* 985 */                   qj3.m7908s(iM7883P13, parcel);
/* 990 */                   return new AuthenticationExtensionsClientOutputs(uvmEntries, zzeVar2);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 918 */                   int i15 = parcel.readInt();
/* 927 */                   for (ErrorCode errorCode : ErrorCode.values()) {
/* 933 */                       if (i15 == errorCode.f3872a) {
/* 941 */                           return errorCode;
                                }
                            }
/* 939 */                   return ErrorCode.f3870b;
                        case 14:
/* 885 */                   DowngradeableSafeParcel.m2019E1();
/* 888 */                   DowngradeableSafeParcel.m2018D1();
/* 891 */                   int iM7883P14 = qj3.m7883P(parcel);
/* 899 */                   while (parcel.dataPosition() < iM7883P14) {
/* 905 */                       qj3.m7878K(parcel.readInt(), parcel);
                            }
/* 909 */                   qj3.m7908s(iM7883P14, parcel);
/* 914 */                   return new RoomEntity();
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 799 */                   int iM7883P15 = qj3.m7883P(parcel);
/* 803 */                   String strM7899j9 = null;
/* 804 */                   Long lM7874G = null;
/* 805 */                   BitmapTeleporter bitmapTeleporter = null;
/* 806 */                   Uri uri = null;
/* 808 */                   Long lM7874G2 = null;
/* 814 */                   while (parcel.dataPosition() < iM7883P15) {
/* 816 */                       int i16 = parcel.readInt();
/* 820 */                       char c11 = (char) i16;
/* 821 */                       if (c11 == 1) {
/* 870 */                           strM7899j9 = qj3.m7899j(i16, parcel);
                                } else if (c11 == 2) {
/* 864 */                           lM7874G = qj3.m7874G(i16, parcel);
                                } else if (c11 == 4) {
/* 859 */                           uri = (Uri) qj3.m7898i(parcel, i16, Uri.CREATOR);
                                } else if (c11 == 5) {
/* 849 */                           bitmapTeleporter = (BitmapTeleporter) qj3.m7898i(parcel, i16, BitmapTeleporter.CREATOR);
                                } else if (c11 != 6) {
/* 832 */                           qj3.m7878K(i16, parcel);
                                } else {
/* 836 */                           lM7874G2 = qj3.m7874G(i16, parcel);
                                }
                            }
/* 876 */                   qj3.m7908s(iM7883P15, parcel);
/* 881 */                   return new SnapshotMetadataChangeEntity(strM7899j9, lM7874G, bitmapTeleporter, uri, lM7874G2);
                        case 16:
/* 740 */                   int iM7883P16 = qj3.m7883P(parcel);
/* 744 */                   int iM7871D23 = 0;
/* 745 */                   int iM7871D24 = 0;
/* 746 */                   boolean zM7914y11 = true;
/* 751 */                   while (parcel.dataPosition() < iM7883P16) {
/* 753 */                       int i17 = parcel.readInt();
/* 757 */                       char c12 = (char) i17;
/* 758 */                       if (c12 == 1) {
/* 785 */                           iM7871D4 = qj3.m7871D(i17, parcel);
                                } else if (c12 == 2) {
/* 780 */                           iM7871D23 = qj3.m7871D(i17, parcel);
                                } else if (c12 == 3) {
/* 775 */                           iM7871D24 = qj3.m7871D(i17, parcel);
                                } else if (c12 != 4) {
/* 766 */                           qj3.m7878K(i17, parcel);
                                } else {
/* 770 */                           zM7914y11 = qj3.m7914y(i17, parcel);
                                }
                            }
/* 790 */                   qj3.m7908s(iM7883P16, parcel);
/* 795 */                   return new ComplianceOptions(iM7871D4, iM7871D23, iM7871D24, zM7914y11);
                        case 17:
/* 647 */                   int iM7883P17 = qj3.m7883P(parcel);
/* 651 */                   int iM7871D25 = 0;
/* 652 */                   int iM7871D26 = 0;
/* 653 */                   boolean zM7914y12 = false;
/* 655 */                   ParcelFileDescriptor parcelFileDescriptor = null;
/* 656 */                   DriveId driveId = null;
/* 658 */                   String strM7899j10 = null;
/* 664 */                   while (parcel.dataPosition() < iM7883P17) {
/* 666 */                       int i18 = parcel.readInt();
/* 670 */                       char c13 = (char) i18;
/* 671 */                       if (c13 == 2) {
/* 728 */                           parcelFileDescriptor = (ParcelFileDescriptor) qj3.m7898i(parcel, i18, ParcelFileDescriptor.CREATOR);
                                } else if (c13 == 3) {
/* 716 */                           iM7871D25 = qj3.m7871D(i18, parcel);
                                } else if (c13 == 4) {
/* 711 */                           iM7871D26 = qj3.m7871D(i18, parcel);
                                } else if (c13 == 5) {
/* 708 */                           driveId = (DriveId) qj3.m7898i(parcel, i18, DriveId.CREATOR);
                                } else if (c13 == 7) {
/* 695 */                           zM7914y12 = qj3.m7914y(i18, parcel);
                                } else if (c13 != '\b') {
/* 686 */                           qj3.m7878K(i18, parcel);
                                } else {
/* 690 */                           strM7899j10 = qj3.m7899j(i18, parcel);
                                }
                            }
/* 731 */                   qj3.m7908s(iM7883P17, parcel);
/* 736 */                   return new Contents(parcelFileDescriptor, iM7871D25, iM7871D26, driveId, zM7914y12, strM7899j10);
                        case 18:
/* 607 */                   int iM7883P18 = qj3.m7883P(parcel);
/* 615 */                   while (parcel.dataPosition() < iM7883P18) {
/* 617 */                       int i19 = parcel.readInt();
/* 622 */                       if (((char) i19) != 3) {
/* 624 */                           qj3.m7878K(i19, parcel);
                                } else {
/* 635 */                           zzeVar = (zze) qj3.m7898i(parcel, i19, zze.CREATOR);
                                }
                            }
/* 638 */                   qj3.m7908s(iM7883P18, parcel);
/* 643 */                   return new zzb(zzeVar);
                        case 19:
/* 565 */                   int iM7883P19 = qj3.m7883P(parcel);
/* 573 */                   while (parcel.dataPosition() < iM7883P19) {
/* 575 */                       int i20 = parcel.readInt();
/* 579 */                       char c14 = (char) i20;
/* 580 */                       if (c14 == 2) {
/* 593 */                           strM7899j4 = qj3.m7899j(i20, parcel);
                                } else if (c14 != 3) {
/* 584 */                           qj3.m7878K(i20, parcel);
                                } else {
/* 588 */                           iM7871D3 = qj3.m7871D(i20, parcel);
                                }
                            }
/* 598 */                   qj3.m7908s(iM7883P19, parcel);
/* 603 */                   return new CustomPropertyKey(strM7899j4, iM7871D3);
                        case 20:
/* 521 */                   int iM7883P20 = qj3.m7883P(parcel);
/* 529 */                   while (parcel.dataPosition() < iM7883P20) {
/* 531 */                       int i21 = parcel.readInt();
/* 535 */                       char c15 = (char) i21;
/* 536 */                       if (c15 == 1) {
/* 551 */                           arrayListM7903n3 = qj3.m7903n(parcel, i21, zzf.CREATOR);
                                } else if (c15 != 2) {
/* 540 */                           qj3.m7878K(i21, parcel);
                                } else {
/* 544 */                           zM7914y2 = qj3.m7914y(i21, parcel);
                                }
                            }
/* 556 */                   qj3.m7908s(iM7883P20, parcel);
/* 561 */                   return new SortOrder(arrayListM7903n3, zM7914y2);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 475 */                   int iM7883P21 = qj3.m7883P(parcel);
/* 483 */                   while (parcel.dataPosition() < iM7883P21) {
/* 485 */                       int i22 = parcel.readInt();
/* 489 */                       char c16 = (char) i22;
/* 490 */                       if (c16 == 1) {
/* 506 */                           iM7871D2 = qj3.m7871D(i22, parcel);
                                } else if (c16 != 2) {
/* 494 */                           qj3.m7878K(i22, parcel);
                                } else {
/* 500 */                           arrayListM7903n2 = qj3.m7903n(parcel, i22, AccountChangeEvent.CREATOR);
                                }
                            }
/* 512 */                   qj3.m7908s(iM7883P21, parcel);
/* 517 */                   return new AccountChangeEventsResponse(iM7871D2, arrayListM7903n2);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 400 */                   byte[] bArr = new byte[parcel.readInt()];
/* 402 */                   parcel.readByteArray(bArr);
/* 409 */                   byte[] bArr2 = new byte[parcel.readInt()];
/* 411 */                   parcel.readByteArray(bArr2);
                            try {
/* 418 */                       wr3VarM9611p = wr3.m9610o(bArr, on3.m7216a());
/* 426 */                       cm3VarM1730p = cm3.m1729o(bArr2, on3.m7216a());
                                break;
                            } catch (uo3 e) {
/* 458 */                       ((rg3) ((rg3) zzcl.f4280c.m7771o().mo6983b(e)).mo6982a(56, "com/google/android/libraries/play/logging/ulex/common/play/logsystem/PlayGlobalDimensionData$1", "createFromParcel", "PlayGlobalDimensionData.java")).zzq();
/* 461 */                       wr3VarM9611p = wr3.m9611p();
/* 465 */                       cm3VarM1730p = cm3.m1730p();
                            }
/* 471 */                   return new zzcl(wr3VarM9611p, cm3VarM1730p);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 392 */                   return new zzcn(parcel.readLong());
                        case 24:
/* 338 */                   long j = parcel.readLong();
/* 346 */                   int i23 = -parcel.readInt();
/* 382 */                   return new zzcs(zzcv.m2199a(i23, parcel), zzcv.m2200b(parcel), zzcv.m2201d(i23, parcel), j, parcel.readLong(), (zzcl) parcel.readParcelable(zzcl.class.getClassLoader()), parcel.readLong());
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 308 */                   long j2 = parcel.readLong();
/* 316 */                   int i24 = -parcel.readInt();
/* 334 */                   return new zzcv(zzcv.m2199a(i24, parcel), zzcv.m2200b(parcel), zzcv.m2201d(i24, parcel), j2);
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 148 */                   int iM7883P22 = qj3.m7883P(parcel);
/* 153 */                   float fM7869B = 0.0f;
/* 155 */                   long jM7873F6 = 0;
/* 157 */                   long jM7873F7 = 0;
/* 159 */                   long jM7873F8 = 0;
/* 161 */                   boolean zM7914y13 = false;
/* 163 */                   GameEntity gameEntity = null;
/* 164 */                   PlayerEntity playerEntity = null;
/* 165 */                   String strM7899j11 = null;
/* 166 */                   Uri uri2 = null;
/* 167 */                   String strM7899j12 = null;
/* 168 */                   String strM7899j13 = null;
/* 170 */                   String strM7899j14 = null;
/* 172 */                   String strM7899j15 = null;
/* 174 */                   String strM7899j16 = null;
/* 180 */                   while (parcel.dataPosition() < iM7883P22) {
/* 182 */                       int i25 = parcel.readInt();
                                switch ((char) i25) {
                                    case 1:
/* 295 */                               gameEntity = (GameEntity) qj3.m7898i(parcel, i25, GameEntity.CREATOR);
                                        break;
                                    case 2:
/* 285 */                               playerEntity = (PlayerEntity) qj3.m7898i(parcel, i25, PlayerEntity.CREATOR);
                                        break;
                                    case 3:
/* 273 */                               strM7899j11 = qj3.m7899j(i25, parcel);
                                        break;
                                    case 4:
                                    default:
/* 190 */                               qj3.m7878K(i25, parcel);
                                        break;
                                    case 5:
/* 269 */                               uri2 = (Uri) qj3.m7898i(parcel, i25, Uri.CREATOR);
                                        break;
                                    case 6:
/* 257 */                               strM7899j12 = qj3.m7899j(i25, parcel);
                                        break;
                                    case 7:
/* 250 */                               strM7899j13 = qj3.m7899j(i25, parcel);
                                        break;
                                    case '\b':
/* 243 */                               strM7899j14 = qj3.m7899j(i25, parcel);
                                        break;
                                    case '\t':
/* 236 */                               jM7873F6 = qj3.m7873F(i25, parcel);
                                        break;
                                    case '\n':
/* 229 */                               jM7873F7 = qj3.m7873F(i25, parcel);
                                        break;
                                    case 11:
/* 222 */                               fM7869B = qj3.m7869B(i25, parcel);
                                        break;
                                    case '\f':
/* 215 */                               strM7899j15 = qj3.m7899j(i25, parcel);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 208 */                               zM7914y13 = qj3.m7914y(i25, parcel);
                                        break;
                                    case 14:
/* 201 */                               jM7873F8 = qj3.m7873F(i25, parcel);
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 194 */                               strM7899j16 = qj3.m7899j(i25, parcel);
                                        break;
                                }
                            }
/* 299 */                   qj3.m7908s(iM7883P22, parcel);
/* 304 */                   return new SnapshotMetadataEntity(gameEntity, playerEntity, strM7899j11, uri2, strM7899j12, strM7899j13, strM7899j14, jM7873F6, jM7873F7, fM7869B, strM7899j15, zM7914y13, jM7873F8, strM7899j16);
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 111 */                   int iM7883P23 = qj3.m7883P(parcel);
/* 119 */                   while (parcel.dataPosition() < iM7883P23) {
/* 121 */                       int i26 = parcel.readInt();
/* 126 */                       if (((char) i26) != 1) {
/* 128 */                           qj3.m7878K(i26, parcel);
                                } else {
/* 132 */                           strM7899j3 = qj3.m7899j(i26, parcel);
                                }
                            }
/* 137 */                   qj3.m7908s(iM7883P23, parcel);
/* 142 */                   ExecuteResult executeResult = new ExecuteResult();
/* 145 */                   executeResult.f4268a = strM7899j3;
/* 147 */                   return executeResult;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 69 */                    int iM7883P24 = qj3.m7883P(parcel);
/* 77 */                    while (parcel.dataPosition() < iM7883P24) {
/* 79 */                        int i27 = parcel.readInt();
/* 83 */                        char c17 = (char) i27;
/* 84 */                        if (c17 == 1) {
/* 97 */                            iM7871D = qj3.m7871D(i27, parcel);
                                } else if (c17 != 2) {
/* 88 */                            qj3.m7878K(i27, parcel);
                                } else {
/* 92 */                            strM7899j2 = qj3.m7899j(i27, parcel);
                                }
                            }
/* 102 */                   qj3.m7908s(iM7883P24, parcel);
/* 107 */                   return new Scope(iM7871D, strM7899j2);
                        default:
/* 21 */                    int iM7883P25 = qj3.m7883P(parcel);
/* 25 */                    String strM7899j17 = null;
/* 30 */                    while (parcel.dataPosition() < iM7883P25) {
/* 32 */                        int i28 = parcel.readInt();
/* 36 */                        char c18 = (char) i28;
/* 37 */                        if (c18 == 2) {
/* 57 */                            customPropertyKey = (CustomPropertyKey) qj3.m7898i(parcel, i28, CustomPropertyKey.CREATOR);
                                } else if (c18 != 3) {
/* 41 */                            qj3.m7878K(i28, parcel);
                                } else {
/* 45 */                            strM7899j17 = qj3.m7899j(i28, parcel);
                                }
                            }
/* 60 */                    qj3.m7908s(iM7883P25, parcel);
/* 65 */                    return new zzc(customPropertyKey, strM7899j17);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
                    switch (this.f16029a) {
                        case 0:
/* 93 */                    return new LocationResult[i];
                        case 1:
/* 90 */                    return new zzbg[i];
                        case 2:
/* 87 */                    return new zzbj[i];
                        case 3:
/* 84 */                    return new LocationSettingsRequest[i];
                        case 4:
/* 81 */                    return new LocationSettingsResult[i];
                        case 5:
/* 78 */                    return new LocationSettingsStates[i];
                        case 6:
/* 75 */                    return new zzbo[i];
                        case 7:
/* 72 */                    return new zzbq[i];
                        case 8:
/* 69 */                    return new SleepClassifyEvent[i];
                        case 9:
/* 66 */                    return new SleepSegmentEvent[i];
                        case 10:
/* 63 */                    return new SleepSegmentRequest[i];
                        case 11:
/* 60 */                    return new zzbx[i];
                        case 12:
/* 57 */                    return new AuthenticationExtensionsClientOutputs[i];
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 54 */                    return new ErrorCode[i];
                        case 14:
/* 51 */                    return new RoomEntity[i];
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 48 */                    return new SnapshotMetadataChangeEntity[i];
                        case 16:
/* 45 */                    return new ComplianceOptions[i];
                        case 17:
/* 42 */                    return new Contents[i];
                        case 18:
/* 39 */                    return new zzb[i];
                        case 19:
/* 36 */                    return new CustomPropertyKey[i];
                        case 20:
/* 33 */                    return new SortOrder[i];
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 30 */                    return new AccountChangeEventsResponse[i];
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 27 */                    return new zzcl[i];
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 24 */                    return new zzcn[i];
                        case 24:
/* 21 */                    return new zzcs[i];
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 18 */                    return new zzcv[i];
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 15 */                    return new SnapshotMetadataEntity[i];
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 12 */                    return new ExecuteResult[i];
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 9 */                     return new Scope[i];
                        default:
/* 6 */                     return new zzc[i];
                    }
                }
            }
