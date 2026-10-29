            package p000;

            import android.app.PendingIntent;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
            import com.google.android.gms.auth.api.accounttransfer.zzu;
            import com.google.android.gms.auth.api.accounttransfer.zzw;
            import com.google.android.gms.drive.DriveSpace;
            import com.google.android.gms.drive.UserMetadata;
            import com.google.android.gms.drive.events.zzv;
            import com.google.android.gms.drive.query.internal.FilterHolder;
            import com.google.android.gms.drive.query.internal.zzx;
            import com.google.android.gms.fido.fido2.api.common.ErrorCode;
            import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
            import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
            import com.google.android.gms.fido.fido2.api.common.zzy;
            import com.google.android.gms.games.PlayerLevel;
            import com.google.android.gms.games.PlayerLevelInfo;
            import com.google.android.gms.games.zzt;
            import com.google.android.gms.internal.drive.zzh;
            import com.google.android.gms.location.zzs;
            import com.google.android.gms.measurement.internal.zzr;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.HashSet;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dr3 implements Parcelable.Creator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7394a;

                public /* synthetic */ dr3(int i) {
/* 1 */             this.f7394a = i;
                }

                /* JADX INFO: renamed from: a */
                public static void m3185a(zzt zztVar, Parcel parcel) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i = zztVar.f4089a;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i);
/* 21 */            w11.m9410T(parcel, 2, zztVar.f4090b, false);
/* 27 */            w11.m9410T(parcel, 3, zztVar.f4091c, false);
/* 32 */            w11.m9410T(parcel, 4, zztVar.f4092d, false);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 10 */            long jM7873F = 0;
/* 16 */            int iM7871D = 0;
/* 16 */            boolean zM7914y = false;
/* 16 */            int iM7871D2 = 0;
/* 16 */            int iM7871D3 = 0;
/* 16 */            boolean zM7914y2 = false;
/* 16 */            boolean zM7914y3 = false;
/* 18 */            String strM7899j = null;
/* 18 */            String strM7899j2 = null;
/* 18 */            ArrayList arrayListM7903n = null;
/* 18 */            FilterHolder filterHolder = null;
/* 18 */            ArrayList arrayListM7903n2 = null;
/* 18 */            String strM7899j3 = null;
/* 18 */            String strM7899j4 = null;
/* 18 */            String strM7899j5 = null;
/* 18 */            zzx zzxVar = null;
/* 18 */            zzh zzhVar = null;
                    switch (this.f7394a) {
                        case 0:
/* 1483 */                  int iM7883P = qj3.m7883P(parcel);
/* 1494 */                  String strM7899j6 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 1496 */                  String strM7899j7 = strM7899j6;
/* 1498 */                  String strM7899j8 = strM7899j7;
/* 1500 */                  String strM7899j9 = strM7899j8;
/* 1502 */                  int iM7871D4 = 100;
/* 1504 */                  long jM7873F2 = 0;
/* 1506 */                  long jM7873F3 = 0;
/* 1508 */                  long jM7873F4 = 0;
/* 1510 */                  long jM7873F5 = 0;
/* 1512 */                  long jM7873F6 = 0;
/* 1514 */                  long jM7873F7 = 0;
/* 1516 */                  long jM7873F8 = 0;
/* 1518 */                  long jM7873F9 = -2147483648L;
/* 1520 */                  boolean zM7914y4 = false;
/* 1522 */                  int iM7871D5 = 0;
/* 1524 */                  boolean zM7914y5 = false;
/* 1526 */                  boolean zM7914y6 = false;
/* 1528 */                  int iM7871D6 = 0;
/* 1530 */                  int iM7871D7 = 0;
/* 1532 */                  boolean zM7914y7 = true;
/* 1534 */                  boolean zM7914y8 = true;
/* 1536 */                  String strM7899j10 = null;
/* 1537 */                  String strM7899j11 = null;
/* 1538 */                  String strM7899j12 = null;
/* 1540 */                  String strM7899j13 = null;
/* 1542 */                  String strM7899j14 = null;
/* 1544 */                  String strM7899j15 = null;
/* 1546 */                  Boolean boolM7915z = null;
/* 1548 */                  ArrayList arrayListM7901l = null;
/* 1550 */                  String strM7899j16 = null;
/* 1552 */                  String strM7899j17 = null;
/* 1558 */                  while (parcel.dataPosition() < iM7883P) {
/* 1560 */                      int i = parcel.readInt();
                                switch ((char) i) {
                                    case 2:
/* 1796 */                              strM7899j10 = qj3.m7899j(i, parcel);
                                        break;
                                    case 3:
/* 1789 */                              strM7899j11 = qj3.m7899j(i, parcel);
                                        break;
                                    case 4:
/* 1781 */                              strM7899j12 = qj3.m7899j(i, parcel);
                                        break;
                                    case 5:
/* 1773 */                              strM7899j13 = qj3.m7899j(i, parcel);
                                        break;
                                    case 6:
/* 1765 */                              jM7873F2 = qj3.m7873F(i, parcel);
                                        break;
                                    case 7:
/* 1757 */                              jM7873F3 = qj3.m7873F(i, parcel);
                                        break;
                                    case '\b':
/* 1749 */                              strM7899j14 = qj3.m7899j(i, parcel);
                                        break;
                                    case '\t':
/* 1741 */                              zM7914y7 = qj3.m7914y(i, parcel);
                                        break;
                                    case '\n':
/* 1733 */                              zM7914y4 = qj3.m7914y(i, parcel);
                                        break;
                                    case 11:
/* 1725 */                              jM7873F9 = qj3.m7873F(i, parcel);
                                        break;
                                    case '\f':
/* 1717 */                              strM7899j15 = qj3.m7899j(i, parcel);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                                    case 17:
                                    case 19:
                                    case 20:
                                    case 24:
                                    case Build.API_LEVELS.API_33 /* 33 */:
                                    default:
/* 1568 */                              qj3.m7878K(i, parcel);
                                        break;
                                    case 14:
/* 1709 */                              jM7873F4 = qj3.m7873F(i, parcel);
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1701 */                              iM7871D5 = qj3.m7871D(i, parcel);
                                        break;
                                    case 16:
/* 1693 */                              zM7914y8 = qj3.m7914y(i, parcel);
                                        break;
                                    case 18:
/* 1685 */                              zM7914y5 = qj3.m7914y(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_21 /* 21 */:
/* 1677 */                              boolM7915z = qj3.m7915z(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_22 /* 22 */:
/* 1670 */                              jM7873F5 = qj3.m7873F(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_23 /* 23 */:
/* 1663 */                              arrayListM7901l = qj3.m7901l(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_25 /* 25 */:
/* 1656 */                              strM7899j6 = qj3.m7899j(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_26 /* 26 */:
/* 1649 */                              strM7899j7 = qj3.m7899j(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_27 /* 27 */:
/* 1642 */                              strM7899j16 = qj3.m7899j(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_28 /* 28 */:
/* 1635 */                              zM7914y6 = qj3.m7914y(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_29 /* 29 */:
/* 1628 */                              jM7873F6 = qj3.m7873F(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_30 /* 30 */:
/* 1621 */                              iM7871D4 = qj3.m7871D(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_31 /* 31 */:
/* 1614 */                              strM7899j8 = qj3.m7899j(i, parcel);
                                        break;
                                    case ' ':
/* 1607 */                              iM7871D6 = qj3.m7871D(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_34 /* 34 */:
/* 1600 */                              jM7873F7 = qj3.m7873F(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_35 /* 35 */:
/* 1593 */                              strM7899j17 = qj3.m7899j(i, parcel);
                                        break;
                                    case Build.API_LEVELS.API_36 /* 36 */:
/* 1586 */                              strM7899j9 = qj3.m7899j(i, parcel);
                                        break;
                                    case '%':
/* 1579 */                              jM7873F8 = qj3.m7873F(i, parcel);
                                        break;
                                    case '&':
/* 1572 */                              iM7871D7 = qj3.m7871D(i, parcel);
                                        break;
                                }
                            }
/* 1803 */                  qj3.m7908s(iM7883P, parcel);
/* 1808 */                  return new zzr(strM7899j10, strM7899j11, strM7899j12, strM7899j13, jM7873F2, jM7873F3, strM7899j14, zM7914y7, zM7914y4, jM7873F9, strM7899j15, jM7873F4, iM7871D5, zM7914y8, zM7914y5, boolM7915z, jM7873F5, arrayListM7901l, strM7899j6, strM7899j7, strM7899j16, zM7914y6, jM7873F6, iM7871D4, strM7899j8, iM7871D6, jM7873F7, strM7899j17, strM7899j9, jM7873F8, iM7871D7);
                        case 1:
/* 1402 */                  int iM7883P2 = qj3.m7883P(parcel);
/* 1408 */                  long jM7873F10 = -1;
/* 1410 */                  boolean zM7914y9 = false;
/* 1411 */                  int iM7871D8 = 0;
/* 1413 */                  int iM7871D9 = 0;
/* 1415 */                  String strM7899j18 = null;
/* 1420 */                  while (parcel.dataPosition() < iM7883P2) {
/* 1422 */                      int i2 = parcel.readInt();
/* 1426 */                      char c = (char) i2;
/* 1427 */                      if (c == 1) {
/* 1468 */                          zM7914y9 = qj3.m7914y(i2, parcel);
                                } else if (c == 2) {
/* 1462 */                          strM7899j18 = qj3.m7899j(i2, parcel);
                                } else if (c == 3) {
/* 1455 */                          iM7871D8 = qj3.m7871D(i2, parcel);
                                } else if (c == 4) {
/* 1448 */                          iM7871D9 = qj3.m7871D(i2, parcel);
                                } else if (c != 5) {
/* 1437 */                          qj3.m7878K(i2, parcel);
                                } else {
/* 1441 */                          jM7873F10 = qj3.m7873F(i2, parcel);
                                }
                            }
/* 1474 */                  qj3.m7908s(iM7883P2, parcel);
/* 1479 */                  return new com.google.android.gms.common.zzr(zM7914y9, strM7899j18, iM7871D8, iM7871D9, jM7873F10);
                        case 2:
/* 1325 */                  int iM7883P3 = qj3.m7883P(parcel);
/* 1329 */                  int iM7871D10 = 0;
/* 1330 */                  boolean zM7914y10 = false;
/* 1331 */                  String strM7899j19 = null;
/* 1332 */                  String strM7899j20 = null;
/* 1337 */                  while (parcel.dataPosition() < iM7883P3) {
/* 1339 */                      int i3 = parcel.readInt();
                                switch ((char) i3) {
                                    case 2:
/* 1376 */                              strM7899j = qj3.m7899j(i3, parcel);
                                        break;
                                    case 3:
/* 1371 */                              iM7871D = qj3.m7871D(i3, parcel);
                                        break;
                                    case 4:
/* 1366 */                              strM7899j19 = qj3.m7899j(i3, parcel);
                                        break;
                                    case 5:
/* 1361 */                              strM7899j20 = qj3.m7899j(i3, parcel);
                                        break;
                                    case 6:
/* 1356 */                              iM7871D10 = qj3.m7871D(i3, parcel);
                                        break;
                                    case 7:
/* 1351 */                              zM7914y10 = qj3.m7914y(i3, parcel);
                                        break;
                                    default:
/* 1347 */                              qj3.m7878K(i3, parcel);
                                        break;
                                }
                            }
/* 1381 */                  qj3.m7908s(iM7883P3, parcel);
/* 1386 */                  com.google.android.gms.drive.zzr zzrVar = new com.google.android.gms.drive.zzr();
/* 1389 */                  zzrVar.f3733a = strM7899j;
/* 1391 */                  zzrVar.f3734b = iM7871D;
/* 1393 */                  zzrVar.f3735c = strM7899j19;
/* 1395 */                  zzrVar.f3736d = strM7899j20;
/* 1397 */                  zzrVar.f3737e = iM7871D10;
/* 1399 */                  zzrVar.f3738f = zM7914y10;
/* 1401 */                  return zzrVar;
                        case 3:
/* 1285 */                  int iM7883P4 = qj3.m7883P(parcel);
/* 1293 */                  while (parcel.dataPosition() < iM7883P4) {
/* 1295 */                      int i4 = parcel.readInt();
/* 1300 */                      if (((char) i4) != 2) {
/* 1302 */                          qj3.m7878K(i4, parcel);
                                } else {
/* 1313 */                          zzhVar = (zzh) qj3.m7898i(parcel, i4, zzh.CREATOR);
                                }
                            }
/* 1316 */                  qj3.m7908s(iM7883P4, parcel);
/* 1321 */                  return new com.google.android.gms.drive.events.zzr(zzhVar);
                        case 4:
/* 1235 */                  int iM7883P5 = qj3.m7883P(parcel);
/* 1239 */                  ArrayList arrayListM7903n3 = null;
/* 1244 */                  while (parcel.dataPosition() < iM7883P5) {
/* 1246 */                      int i5 = parcel.readInt();
/* 1250 */                      char c2 = (char) i5;
/* 1251 */                      if (c2 == 1) {
/* 1273 */                          zzxVar = (zzx) qj3.m7898i(parcel, i5, zzx.CREATOR);
                                } else if (c2 != 2) {
/* 1255 */                          qj3.m7878K(i5, parcel);
                                } else {
/* 1261 */                          arrayListM7903n3 = qj3.m7903n(parcel, i5, FilterHolder.CREATOR);
                                }
                            }
/* 1276 */                  qj3.m7908s(iM7883P5, parcel);
/* 1281 */                  return new com.google.android.gms.drive.query.internal.zzr(zzxVar, arrayListM7903n3);
                        case 5:
/* 1200 */                  int iM7883P6 = qj3.m7883P(parcel);
/* 1208 */                  while (parcel.dataPosition() < iM7883P6) {
/* 1210 */                      int i6 = parcel.readInt();
/* 1215 */                      if (((char) i6) != 1) {
/* 1217 */                          qj3.m7878K(i6, parcel);
                                } else {
/* 1221 */                          zM7914y3 = qj3.m7914y(i6, parcel);
                                }
                            }
/* 1226 */                  qj3.m7908s(iM7883P6, parcel);
/* 1231 */                  return new com.google.android.gms.fido.fido2.api.common.zzr(zM7914y3);
                        case 6:
/* 1122 */                  int iM7883P7 = qj3.m7883P(parcel);
/* 1126 */                  long jM7873F11 = 0;
/* 1127 */                  long jM7873F12 = 0;
/* 1129 */                  PlayerLevel playerLevel = null;
/* 1131 */                  PlayerLevel playerLevel2 = null;
/* 1137 */                  while (parcel.dataPosition() < iM7883P7) {
/* 1139 */                      int i7 = parcel.readInt();
/* 1143 */                      char c3 = (char) i7;
/* 1144 */                      if (c3 == 1) {
/* 1185 */                          jM7873F11 = qj3.m7873F(i7, parcel);
                                } else if (c3 == 2) {
/* 1178 */                          jM7873F12 = qj3.m7873F(i7, parcel);
                                } else if (c3 == 3) {
/* 1173 */                          playerLevel = (PlayerLevel) qj3.m7898i(parcel, i7, PlayerLevel.CREATOR);
                                } else if (c3 != 4) {
/* 1152 */                          qj3.m7878K(i7, parcel);
                                } else {
/* 1162 */                          playerLevel2 = (PlayerLevel) qj3.m7898i(parcel, i7, PlayerLevel.CREATOR);
                                }
                            }
/* 1191 */                  qj3.m7908s(iM7883P7, parcel);
/* 1196 */                  return new PlayerLevelInfo(jM7873F11, jM7873F12, playerLevel, playerLevel2);
                        case 7:
/* 1051 */                  int iM7883P8 = qj3.m7883P(parcel);
/* 1055 */                  boolean zM7914y11 = false;
/* 1056 */                  String strM7899j21 = null;
/* 1057 */                  String strM7899j22 = null;
/* 1059 */                  String strM7899j23 = null;
/* 1061 */                  String strM7899j24 = null;
/* 1067 */                  while (parcel.dataPosition() < iM7883P8) {
/* 1069 */                      int i8 = parcel.readInt();
/* 1073 */                      char c4 = (char) i8;
/* 1074 */                      if (c4 == 2) {
/* 1108 */                          strM7899j21 = qj3.m7899j(i8, parcel);
                                } else if (c4 == 3) {
/* 1103 */                          strM7899j22 = qj3.m7899j(i8, parcel);
                                } else if (c4 == 4) {
/* 1098 */                          strM7899j23 = qj3.m7899j(i8, parcel);
                                } else if (c4 == 5) {
/* 1093 */                          zM7914y11 = qj3.m7914y(i8, parcel);
                                } else if (c4 != 6) {
/* 1084 */                          qj3.m7878K(i8, parcel);
                                } else {
/* 1088 */                          strM7899j24 = qj3.m7899j(i8, parcel);
                                }
                            }
/* 1113 */                  qj3.m7908s(iM7883P8, parcel);
/* 1118 */                  return new UserMetadata(zM7914y11, strM7899j21, strM7899j22, strM7899j23, strM7899j24);
                        case 8:
                            try {
/* 1041 */                      return ErrorCode.m2055a(parcel.readInt());
                            } catch (pe0 e) {
/* 1047 */                      C1951n4.m6863n(e);
/* 18 */                        return null;
                            }
                        case 9:
/* 946 */                   int iM7883P9 = qj3.m7883P(parcel);
/* 961 */                   long jM7873F13 = 50;
/* 963 */                   float fM7869B = 0.0f;
/* 965 */                   int iM7871D11 = Integer.MAX_VALUE;
/* 967 */                   boolean zM7914y12 = true;
/* 968 */                   long jM7873F14 = Long.MAX_VALUE;
/* 974 */                   while (parcel.dataPosition() < iM7883P9) {
/* 976 */                       int i9 = parcel.readInt();
/* 980 */                       char c5 = (char) i9;
/* 981 */                       if (c5 == 1) {
/* 1023 */                          zM7914y12 = qj3.m7914y(i9, parcel);
                                } else if (c5 == 2) {
/* 1016 */                          jM7873F13 = qj3.m7873F(i9, parcel);
                                } else if (c5 == 3) {
/* 1009 */                          fM7869B = qj3.m7869B(i9, parcel);
                                } else if (c5 == 4) {
/* 1002 */                          jM7873F14 = qj3.m7873F(i9, parcel);
                                } else if (c5 != 5) {
/* 991 */                           qj3.m7878K(i9, parcel);
                                } else {
/* 995 */                           iM7871D11 = qj3.m7871D(i9, parcel);
                                }
                            }
/* 1028 */                  qj3.m7908s(iM7883P9, parcel);
/* 1033 */                  return new zzs(zM7914y12, jM7873F13, fM7869B, jM7873F14, iM7871D11);
                        case 10:
/* 879 */                   int iM7883P10 = qj3.m7883P(parcel);
/* 883 */                   int iM7871D12 = 0;
/* 884 */                   ArrayList arrayListM7901l2 = null;
/* 885 */                   ArrayList arrayListM7901l3 = null;
/* 886 */                   ArrayList arrayListM7901l4 = null;
/* 887 */                   ArrayList arrayListM7901l5 = null;
/* 888 */                   ArrayList arrayListM7901l6 = null;
/* 893 */                   while (parcel.dataPosition() < iM7883P10) {
/* 895 */                       int i10 = parcel.readInt();
                                switch ((char) i10) {
                                    case 1:
/* 932 */                               iM7871D12 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 2:
/* 927 */                               arrayListM7901l2 = qj3.m7901l(i10, parcel);
                                        break;
                                    case 3:
/* 922 */                               arrayListM7901l3 = qj3.m7901l(i10, parcel);
                                        break;
                                    case 4:
/* 917 */                               arrayListM7901l4 = qj3.m7901l(i10, parcel);
                                        break;
                                    case 5:
/* 912 */                               arrayListM7901l5 = qj3.m7901l(i10, parcel);
                                        break;
                                    case 6:
/* 907 */                               arrayListM7901l6 = qj3.m7901l(i10, parcel);
                                        break;
                                    default:
/* 903 */                               qj3.m7878K(i10, parcel);
                                        break;
                                }
                            }
/* 937 */                   qj3.m7908s(iM7883P10, parcel);
/* 942 */                   return new com.google.android.gms.auth.api.accounttransfer.zzs(iM7871D12, arrayListM7901l2, arrayListM7901l3, arrayListM7901l4, arrayListM7901l5, arrayListM7901l6);
                        case 11:
/* 821 */                   int iM7883P11 = qj3.m7883P(parcel);
/* 825 */                   boolean zM7914y13 = false;
/* 826 */                   IBinder iBinderM7870C = null;
/* 831 */                   while (parcel.dataPosition() < iM7883P11) {
/* 833 */                       int i11 = parcel.readInt();
/* 837 */                       char c6 = (char) i11;
/* 838 */                       if (c6 == 1) {
/* 865 */                           strM7899j5 = qj3.m7899j(i11, parcel);
                                } else if (c6 == 2) {
/* 860 */                           iBinderM7870C = qj3.m7870C(i11, parcel);
                                } else if (c6 == 3) {
/* 855 */                           zM7914y2 = qj3.m7914y(i11, parcel);
                                } else if (c6 != 4) {
/* 846 */                           qj3.m7878K(i11, parcel);
                                } else {
/* 850 */                           zM7914y13 = qj3.m7914y(i11, parcel);
                                }
                            }
/* 870 */                   qj3.m7908s(iM7883P11, parcel);
/* 875 */                   return new com.google.android.gms.common.zzt(strM7899j5, iBinderM7870C, zM7914y2, zM7914y13);
                        case 12:
/* 786 */                   int iM7883P12 = qj3.m7883P(parcel);
/* 794 */                   while (parcel.dataPosition() < iM7883P12) {
/* 796 */                       int i12 = parcel.readInt();
/* 801 */                       if (((char) i12) != 2) {
/* 803 */                           qj3.m7878K(i12, parcel);
                                } else {
/* 807 */                           iM7871D3 = qj3.m7871D(i12, parcel);
                                }
                            }
/* 812 */                   qj3.m7908s(iM7883P12, parcel);
/* 817 */                   return new com.google.android.gms.drive.events.zzt(iM7871D3);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 759 */                   int iM7883P13 = qj3.m7883P(parcel);
/* 767 */                   while (parcel.dataPosition() < iM7883P13) {
/* 773 */                       qj3.m7878K(parcel.readInt(), parcel);
                            }
/* 777 */                   qj3.m7908s(iM7883P13, parcel);
/* 782 */                   return new com.google.android.gms.drive.query.internal.zzt();
                        case 14:
/* 724 */                   int iM7883P14 = qj3.m7883P(parcel);
/* 732 */                   while (parcel.dataPosition() < iM7883P14) {
/* 734 */                       int i13 = parcel.readInt();
/* 739 */                       if (((char) i13) != 2) {
/* 741 */                           qj3.m7878K(i13, parcel);
                                } else {
/* 745 */                           strM7899j4 = qj3.m7899j(i13, parcel);
                                }
                            }
/* 750 */                   qj3.m7908s(iM7883P14, parcel);
/* 755 */                   return new FidoAppIdExtension(strM7899j4);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 664 */                   int iM7883P15 = qj3.m7883P(parcel);
/* 668 */                   String strM7899j25 = null;
/* 669 */                   String strM7899j26 = null;
/* 674 */                   while (parcel.dataPosition() < iM7883P15) {
/* 676 */                       int i14 = parcel.readInt();
/* 680 */                       char c7 = (char) i14;
/* 681 */                       if (c7 == 1) {
/* 709 */                           iM7871D2 = qj3.m7871D(i14, parcel);
                                } else if (c7 == 2) {
/* 703 */                           strM7899j3 = qj3.m7899j(i14, parcel);
                                } else if (c7 == 3) {
/* 698 */                           strM7899j25 = qj3.m7899j(i14, parcel);
                                } else if (c7 != 4) {
/* 689 */                           qj3.m7878K(i14, parcel);
                                } else {
/* 693 */                           strM7899j26 = qj3.m7899j(i14, parcel);
                                }
                            }
/* 715 */                   qj3.m7908s(iM7883P15, parcel);
/* 720 */                   return new zzt(iM7871D2, strM7899j3, strM7899j25, strM7899j26);
                        case 16:
/* 526 */                   int iM7883P16 = qj3.m7883P(parcel);
/* 532 */                   HashSet hashSet = new HashSet();
/* 535 */                   int i15 = 0;
/* 536 */                   zzw zzwVar = null;
/* 538 */                   String str = null;
/* 540 */                   String str2 = null;
/* 542 */                   String str3 = null;
/* 548 */                   while (parcel.dataPosition() < iM7883P16) {
/* 550 */                       int i16 = parcel.readInt();
/* 554 */                       char c8 = (char) i16;
/* 555 */                       if (c8 == 1) {
/* 629 */                           int iM7871D13 = qj3.m7871D(i16, parcel);
/* 637 */                           hashSet.add(1);
/* 640 */                           i15 = iM7871D13;
                                } else if (c8 == 2) {
/* 617 */                           zzw zzwVar2 = (zzw) qj3.m7898i(parcel, i16, zzw.CREATOR);
/* 623 */                           hashSet.add(2);
/* 626 */                           zzwVar = zzwVar2;
                                } else if (c8 == 3) {
/* 597 */                           String strM7899j27 = qj3.m7899j(i16, parcel);
/* 605 */                           hashSet.add(3);
/* 608 */                           str = strM7899j27;
                                } else if (c8 == 4) {
/* 583 */                           String strM7899j28 = qj3.m7899j(i16, parcel);
/* 591 */                           hashSet.add(4);
/* 594 */                           str2 = strM7899j28;
                                } else if (c8 != 5) {
/* 565 */                           qj3.m7878K(i16, parcel);
                                } else {
/* 569 */                           String strM7899j29 = qj3.m7899j(i16, parcel);
/* 577 */                           hashSet.add(5);
/* 580 */                           str3 = strM7899j29;
                                }
                            }
/* 646 */                   if (parcel.dataPosition() == iM7883P16) {
/* 650 */                       return new zzu(hashSet, i15, zzwVar, str, str2, str3);
                            }
/* 663 */                   throw new g62(fm0.m3781g(iM7883P16, "Overread allowed size end="), parcel);
                        case 17:
/* 459 */                   int iM7883P17 = qj3.m7883P(parcel);
/* 463 */                   boolean zM7914y14 = false;
/* 464 */                   boolean zM7914y15 = false;
/* 465 */                   String strM7899j30 = null;
/* 466 */                   String strM7899j31 = null;
/* 467 */                   byte[] bArrM7896g = null;
/* 468 */                   byte[] bArrM7896g2 = null;
/* 473 */                   while (parcel.dataPosition() < iM7883P17) {
/* 475 */                       int i17 = parcel.readInt();
                                switch ((char) i17) {
                                    case 1:
/* 512 */                               strM7899j30 = qj3.m7899j(i17, parcel);
                                        break;
                                    case 2:
/* 507 */                               strM7899j31 = qj3.m7899j(i17, parcel);
                                        break;
                                    case 3:
/* 502 */                               bArrM7896g = qj3.m7896g(i17, parcel);
                                        break;
                                    case 4:
/* 497 */                               bArrM7896g2 = qj3.m7896g(i17, parcel);
                                        break;
                                    case 5:
/* 492 */                               zM7914y14 = qj3.m7914y(i17, parcel);
                                        break;
                                    case 6:
/* 487 */                               zM7914y15 = qj3.m7914y(i17, parcel);
                                        break;
                                    default:
/* 483 */                               qj3.m7878K(i17, parcel);
                                        break;
                                }
                            }
/* 517 */                   qj3.m7908s(iM7883P17, parcel);
/* 522 */                   return new FidoCredentialDetails(strM7899j30, strM7899j31, bArrM7896g, bArrM7896g2, zM7914y14, zM7914y15);
                        case 18:
/* 422 */                   int iM7883P18 = qj3.m7883P(parcel);
/* 430 */                   while (parcel.dataPosition() < iM7883P18) {
/* 432 */                       int i18 = parcel.readInt();
/* 437 */                       if (((char) i18) != 3) {
/* 439 */                           qj3.m7878K(i18, parcel);
                                } else {
/* 445 */                           arrayListM7903n2 = qj3.m7903n(parcel, i18, zzh.CREATOR);
                                }
                            }
/* 450 */                   qj3.m7908s(iM7883P18, parcel);
/* 455 */                   return new zzv(arrayListM7903n2);
                        case 19:
/* 382 */                   int iM7883P19 = qj3.m7883P(parcel);
/* 390 */                   while (parcel.dataPosition() < iM7883P19) {
/* 392 */                       int i19 = parcel.readInt();
/* 397 */                       if (((char) i19) != 1) {
/* 399 */                           qj3.m7878K(i19, parcel);
                                } else {
/* 410 */                           filterHolder = (FilterHolder) qj3.m7898i(parcel, i19, FilterHolder.CREATOR);
                                }
                            }
/* 413 */                   qj3.m7908s(iM7883P19, parcel);
/* 418 */                   return new com.google.android.gms.drive.query.internal.zzv(filterHolder);
                        case 20:
/* 347 */                   int iM7883P20 = qj3.m7883P(parcel);
/* 355 */                   while (parcel.dataPosition() < iM7883P20) {
/* 357 */                       int i20 = parcel.readInt();
/* 362 */                       if (((char) i20) != 1) {
/* 364 */                           qj3.m7878K(i20, parcel);
                                } else {
/* 368 */                           zM7914y = qj3.m7914y(i20, parcel);
                                }
                            }
/* 373 */                   qj3.m7908s(iM7883P20, parcel);
/* 378 */                   return new com.google.android.gms.fido.fido2.api.common.zzw(zM7914y);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 196 */                   int iM7883P21 = qj3.m7883P(parcel);
/* 202 */                   HashSet hashSet2 = new HashSet();
/* 205 */                   int i21 = 0;
/* 206 */                   int i22 = 0;
/* 208 */                   String str4 = null;
/* 210 */                   byte[] bArr = null;
/* 212 */                   PendingIntent pendingIntent = null;
/* 214 */                   DeviceMetaData deviceMetaData = null;
/* 220 */                   while (parcel.dataPosition() < iM7883P21) {
/* 222 */                       int i23 = parcel.readInt();
                                switch ((char) i23) {
                                    case 1:
/* 312 */                               int iM7871D14 = qj3.m7871D(i23, parcel);
/* 320 */                               hashSet2.add(1);
/* 323 */                               i21 = iM7871D14;
                                        break;
                                    case 2:
/* 298 */                               String strM7899j32 = qj3.m7899j(i23, parcel);
/* 306 */                               hashSet2.add(2);
/* 309 */                               str4 = strM7899j32;
                                        break;
                                    case 3:
/* 284 */                               int iM7871D15 = qj3.m7871D(i23, parcel);
/* 292 */                               hashSet2.add(3);
/* 295 */                               i22 = iM7871D15;
                                        break;
                                    case 4:
/* 270 */                               byte[] bArrM7896g3 = qj3.m7896g(i23, parcel);
/* 278 */                               hashSet2.add(4);
/* 281 */                               bArr = bArrM7896g3;
                                        break;
                                    case 5:
/* 258 */                               PendingIntent pendingIntent2 = (PendingIntent) qj3.m7898i(parcel, i23, PendingIntent.CREATOR);
/* 264 */                               hashSet2.add(5);
/* 267 */                               pendingIntent = pendingIntent2;
                                        break;
                                    case 6:
/* 240 */                               DeviceMetaData deviceMetaData2 = (DeviceMetaData) qj3.m7898i(parcel, i23, DeviceMetaData.CREATOR);
/* 246 */                               hashSet2.add(6);
/* 249 */                               deviceMetaData = deviceMetaData2;
                                        break;
                                    default:
/* 230 */                               qj3.m7878K(i23, parcel);
                                        break;
                                }
                            }
/* 329 */                   if (parcel.dataPosition() == iM7883P21) {
/* 333 */                       return new zzw(hashSet2, i21, str4, i22, bArr, pendingIntent, deviceMetaData);
                            }
/* 346 */                   throw new g62(fm0.m3781g(iM7883P21, "Overread allowed size end="), parcel);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 159 */                   int iM7883P22 = qj3.m7883P(parcel);
/* 167 */                   while (parcel.dataPosition() < iM7883P22) {
/* 169 */                       int i24 = parcel.readInt();
/* 174 */                       if (((char) i24) != 2) {
/* 176 */                           qj3.m7878K(i24, parcel);
                                } else {
/* 182 */                           arrayListM7903n = qj3.m7903n(parcel, i24, DriveSpace.CREATOR);
                                }
                            }
/* 187 */                   qj3.m7908s(iM7883P22, parcel);
/* 192 */                   return new com.google.android.gms.drive.events.zzx(arrayListM7903n);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 124 */                   int iM7883P23 = qj3.m7883P(parcel);
/* 132 */                   while (parcel.dataPosition() < iM7883P23) {
/* 134 */                       int i25 = parcel.readInt();
/* 139 */                       if (((char) i25) != 1) {
/* 141 */                           qj3.m7878K(i25, parcel);
                                } else {
/* 145 */                           strM7899j2 = qj3.m7899j(i25, parcel);
                                }
                            }
/* 150 */                   qj3.m7908s(iM7883P23, parcel);
/* 155 */                   return new zzx(strM7899j2);
                        case 24:
/* 58 */                    int iM7883P24 = qj3.m7883P(parcel);
/* 62 */                    long jM7873F15 = 0;
/* 63 */                    int iM7871D16 = 0;
/* 64 */                    boolean zM7914y16 = false;
/* 65 */                    boolean zM7914y17 = false;
/* 71 */                    while (parcel.dataPosition() < iM7883P24) {
/* 73 */                        int i26 = parcel.readInt();
/* 77 */                        char c9 = (char) i26;
/* 78 */                        if (c9 == 1) {
/* 109 */                           iM7871D16 = qj3.m7871D(i26, parcel);
                                } else if (c9 == 2) {
/* 103 */                           zM7914y16 = qj3.m7914y(i26, parcel);
                                } else if (c9 == 3) {
/* 97 */                            jM7873F15 = qj3.m7873F(i26, parcel);
                                } else if (c9 != 4) {
/* 86 */                            qj3.m7878K(i26, parcel);
                                } else {
/* 90 */                            zM7914y17 = qj3.m7914y(i26, parcel);
                                }
                            }
/* 115 */                   qj3.m7908s(iM7883P24, parcel);
/* 120 */                   return new DeviceMetaData(iM7871D16, zM7914y16, jM7873F15, zM7914y17);
                        default:
/* 22 */                    int iM7883P25 = qj3.m7883P(parcel);
/* 30 */                    while (parcel.dataPosition() < iM7883P25) {
/* 32 */                        int i27 = parcel.readInt();
/* 37 */                        if (((char) i27) != 1) {
/* 39 */                            qj3.m7878K(i27, parcel);
                                } else {
/* 43 */                            jM7873F = qj3.m7873F(i27, parcel);
                                }
                            }
/* 49 */                    qj3.m7908s(iM7883P25, parcel);
/* 54 */                    return new zzy(jM7873F);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
                    switch (this.f7394a) {
                        case 0:
/* 81 */                    return new zzr[i];
                        case 1:
/* 78 */                    return new com.google.android.gms.common.zzr[i];
                        case 2:
/* 75 */                    return new com.google.android.gms.drive.zzr[i];
                        case 3:
/* 72 */                    return new com.google.android.gms.drive.events.zzr[i];
                        case 4:
/* 69 */                    return new com.google.android.gms.drive.query.internal.zzr[i];
                        case 5:
/* 66 */                    return new com.google.android.gms.fido.fido2.api.common.zzr[i];
                        case 6:
/* 63 */                    return new PlayerLevelInfo[i];
                        case 7:
/* 60 */                    return new UserMetadata[i];
                        case 8:
/* 57 */                    return new ErrorCode[i];
                        case 9:
/* 54 */                    return new zzs[i];
                        case 10:
/* 51 */                    return new com.google.android.gms.auth.api.accounttransfer.zzs[i];
                        case 11:
/* 48 */                    return new com.google.android.gms.common.zzt[i];
                        case 12:
/* 45 */                    return new com.google.android.gms.drive.events.zzt[i];
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 42 */                    return new com.google.android.gms.drive.query.internal.zzt[i];
                        case 14:
/* 39 */                    return new FidoAppIdExtension[i];
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 36 */                    return new zzt[i];
                        case 16:
/* 33 */                    return new zzu[i];
                        case 17:
/* 30 */                    return new FidoCredentialDetails[i];
                        case 18:
/* 27 */                    return new zzv[i];
                        case 19:
/* 24 */                    return new com.google.android.gms.drive.query.internal.zzv[i];
                        case 20:
/* 21 */                    return new com.google.android.gms.fido.fido2.api.common.zzw[i];
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 18 */                    return new zzw[i];
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 15 */                    return new com.google.android.gms.drive.events.zzx[i];
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 12 */                    return new zzx[i];
                        case 24:
/* 9 */                     return new DeviceMetaData[i];
                        default:
/* 6 */                     return new zzy[i];
                    }
                }
            }
