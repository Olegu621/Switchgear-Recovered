            package p000;

            import android.accounts.Account;
            import android.app.PendingIntent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.auth.AccountChangeEventsRequest;
            import com.google.android.gms.auth.api.proxy.ProxyResponse;
            import com.google.android.gms.cloudmessaging.zzd;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.internal.DowngradeableSafeParcel;
            import com.google.android.gms.common.internal.zzai;
            import com.google.android.gms.drive.DriveSpace;
            import com.google.android.gms.drive.query.Query;
            import com.google.android.gms.drive.query.SortOrder;
            import com.google.android.gms.drive.query.internal.zzr;
            import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
            import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
            import com.google.android.gms.fido.fido2.api.common.TokenBinding;
            import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
            import com.google.android.gms.fido.fido2.api.common.UvmEntries;
            import com.google.android.gms.fido.fido2.api.common.UvmEntry;
            import com.google.android.gms.fido.fido2.api.common.zzat;
            import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
            import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
            import com.google.android.gms.games.internal.game.GameBadgeEntity;
            import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
            import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
            import com.google.android.gms.games.snapshot.SnapshotEntity;
            import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
            import com.google.android.gms.games.video.VideoConfiguration;
            import com.google.android.gms.games.zza;
            import com.google.android.gms.internal.location.zzbe;
            import com.google.android.gms.location.GeofencingRequest;
            import com.google.android.gms.location.LocationAvailability;
            import com.google.android.gms.location.LocationRequest;
            import com.google.android.gms.location.zzbo;
            import com.google.android.gms.measurement.internal.zzao;
            import com.google.android.gms.recaptchabase.ExecuteRequest;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class md3 implements Parcelable.Creator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13703a;

                public /* synthetic */ md3(int i) {
/* 1 */             this.f13703a = i;
                }

                /* JADX INFO: renamed from: a */
                public static void m6640a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, mostRecentGameInfoEntity.f4016a, false);
/* 17 */            w11.m9410T(parcel, 2, mostRecentGameInfoEntity.f4017b, false);
/* 20 */            long j = mostRecentGameInfoEntity.f4018c;
/* 25 */            w11.m9420b0(parcel, 3, 8);
/* 28 */            parcel.writeLong(j);
/* 34 */            w11.m9409S(parcel, 4, mostRecentGameInfoEntity.f4019d, i, false);
/* 40 */            w11.m9409S(parcel, 5, mostRecentGameInfoEntity.f4020e, i, false);
/* 46 */            w11.m9409S(parcel, 6, mostRecentGameInfoEntity.f4021f, i, false);
/* 49 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 5 */             int i = this.f13703a;
/* 7 */             String strM7899j = HttpUrl.FRAGMENT_ENCODE_SET;
/* 9 */             int iM7871D = 1000;
/* 12 */            long jM7873F = 0;
/* 16 */            int iM7871D2 = 0;
/* 16 */            boolean zM7914y = false;
/* 16 */            int iM7871D3 = 0;
/* 16 */            int iM7871D4 = 0;
/* 16 */            int iM7871D5 = 0;
/* 16 */            int iM7871D6 = 0;
/* 16 */            int iM7871D7 = 0;
/* 16 */            int iM7871D8 = 0;
/* 16 */            int iM7871D9 = 0;
/* 16 */            boolean zM7914y2 = false;
/* 19 */            String strM7899j2 = null;
/* 19 */            Bundle bundleM7895f = null;
/* 19 */            zzbo[] zzboVarArr = null;
/* 19 */            String strM7899j3 = null;
/* 19 */            String strM7899j4 = null;
/* 19 */            SnapshotMetadataEntity snapshotMetadataEntity = null;
/* 19 */            String strM7899j5 = null;
/* 19 */            String strM7899j6 = null;
/* 19 */            ArrayList arrayListM7903n = null;
/* 19 */            ArrayList arrayListM7903n2 = null;
/* 19 */            ArrayList arrayListM7903n3 = null;
/* 19 */            String strM7899j7 = null;
/* 19 */            Bundle bundleM7895f2 = null;
/* 19 */            byte[] bArrM7896g = null;
                    switch (i) {
                        case 0:
/* 1589 */                  int iM7883P = qj3.m7883P(parcel);
/* 1597 */                  while (parcel.dataPosition() < iM7883P) {
/* 1599 */                      int i2 = parcel.readInt();
/* 1604 */                      if (((char) i2) != 1) {
/* 1606 */                          qj3.m7878K(i2, parcel);
                                } else {
/* 1610 */                          iM7871D2 = qj3.m7871D(i2, parcel);
                                }
                            }
/* 1615 */                  qj3.m7908s(iM7883P, parcel);
/* 1620 */                  return new zzai(iM7871D2);
                        case 1:
/* 1538 */                  int iM7883P2 = qj3.m7883P(parcel);
/* 1542 */                  String strM7899j8 = null;
/* 1543 */                  String strM7899j9 = null;
/* 1548 */                  while (parcel.dataPosition() < iM7883P2) {
/* 1550 */                      int i3 = parcel.readInt();
/* 1554 */                      char c = (char) i3;
/* 1555 */                      if (c == 2) {
/* 1575 */                          strM7899j2 = qj3.m7899j(i3, parcel);
                                } else if (c == 3) {
/* 1570 */                          strM7899j8 = qj3.m7899j(i3, parcel);
                                } else if (c != 4) {
/* 1561 */                          qj3.m7878K(i3, parcel);
                                } else {
/* 1565 */                          strM7899j9 = qj3.m7899j(i3, parcel);
                                }
                            }
/* 1580 */                  qj3.m7908s(iM7883P2, parcel);
/* 1585 */                  return new PublicKeyCredentialRpEntity(strM7899j2, strM7899j8, strM7899j9);
                        case 2:
                            try {
/* 1528 */                      return PublicKeyCredentialType.m2056a(parcel.readString());
                            } catch (nz1 e) {
/* 1534 */                      ds0.m3199p(e);
/* 19 */                        return null;
                            }
                        case 3:
/* 1465 */                  int iM7883P3 = qj3.m7883P(parcel);
/* 1469 */                  String strM7899j10 = null;
/* 1470 */                  String strM7899j11 = null;
/* 1471 */                  String strM7899j12 = null;
/* 1476 */                  while (parcel.dataPosition() < iM7883P3) {
/* 1478 */                      int i4 = parcel.readInt();
/* 1482 */                      char c2 = (char) i4;
/* 1483 */                      if (c2 == 2) {
/* 1510 */                          bArrM7896g = qj3.m7896g(i4, parcel);
                                } else if (c2 == 3) {
/* 1505 */                          strM7899j10 = qj3.m7899j(i4, parcel);
                                } else if (c2 == 4) {
/* 1500 */                          strM7899j11 = qj3.m7899j(i4, parcel);
                                } else if (c2 != 5) {
/* 1491 */                          qj3.m7878K(i4, parcel);
                                } else {
/* 1495 */                          strM7899j12 = qj3.m7899j(i4, parcel);
                                }
                            }
/* 1515 */                  qj3.m7908s(iM7883P3, parcel);
/* 1520 */                  return new PublicKeyCredentialUserEntity(strM7899j10, strM7899j11, strM7899j12, bArrM7896g);
                        case 4:
/* 1447 */                  String string = parcel.readString();
/* 1451 */                  if (string != null) {
/* 1454 */                      strM7899j = string;
                            }
                            try {
/* 1455 */                      return ResidentKeyRequirement.m2057a(strM7899j);
                            } catch (o32 e2) {
/* 1461 */                      ds0.m3199p(e2);
/* 19 */                        return null;
                            }
                        case 5:
/* 1412 */                  int iM7883P4 = qj3.m7883P(parcel);
/* 1420 */                  while (parcel.dataPosition() < iM7883P4) {
/* 1422 */                      int i5 = parcel.readInt();
/* 1427 */                      if (((char) i5) != 1) {
/* 1429 */                          qj3.m7878K(i5, parcel);
                                } else {
/* 1433 */                          bundleM7895f2 = qj3.m7895f(i5, parcel);
                                }
                            }
/* 1438 */                  qj3.m7908s(iM7883P4, parcel);
/* 1443 */                  return new zzao(bundleM7895f2);
                        case 6:
/* 1369 */                  int iM7883P5 = qj3.m7883P(parcel);
/* 1373 */                  String strM7899j13 = null;
/* 1378 */                  while (parcel.dataPosition() < iM7883P5) {
/* 1380 */                      int i6 = parcel.readInt();
/* 1384 */                      char c3 = (char) i6;
/* 1385 */                      if (c3 == 2) {
/* 1398 */                          strM7899j7 = qj3.m7899j(i6, parcel);
                                } else if (c3 != 3) {
/* 1389 */                          qj3.m7878K(i6, parcel);
                                } else {
/* 1393 */                          strM7899j13 = qj3.m7899j(i6, parcel);
                                }
                            }
/* 1403 */                  qj3.m7908s(iM7883P5, parcel);
/* 1408 */                  return new TokenBinding(strM7899j7, strM7899j13);
                        case 7:
/* 1334 */                  int iM7883P6 = qj3.m7883P(parcel);
/* 1342 */                  while (parcel.dataPosition() < iM7883P6) {
/* 1344 */                      int i7 = parcel.readInt();
/* 1349 */                      if (((char) i7) != 1) {
/* 1351 */                          qj3.m7878K(i7, parcel);
                                } else {
/* 1355 */                          zM7914y2 = qj3.m7914y(i7, parcel);
                                }
                            }
/* 1360 */                  qj3.m7908s(iM7883P6, parcel);
/* 1365 */                  return new UserVerificationMethodExtension(zM7914y2);
                        case 8:
                            try {
/* 1324 */                      return zzat.m2059a(parcel.readString());
                            } catch (wd3 e3) {
/* 1330 */                      ds0.m3199p(e3);
/* 19 */                        return null;
                            }
                        case 9:
/* 1259 */                  int iM7883P7 = qj3.m7883P(parcel);
/* 1263 */                  String strM7899j14 = null;
/* 1268 */                  while (parcel.dataPosition() < iM7883P7) {
/* 1270 */                      int i8 = parcel.readInt();
/* 1274 */                      char c4 = (char) i8;
/* 1275 */                      if (c4 == 1) {
/* 1305 */                          arrayListM7903n3 = qj3.m7903n(parcel, i8, zzbe.CREATOR);
                                } else if (c4 == 2) {
/* 1297 */                          iM7871D9 = qj3.m7871D(i8, parcel);
                                } else if (c4 == 3) {
/* 1292 */                          strM7899j = qj3.m7899j(i8, parcel);
                                } else if (c4 != 4) {
/* 1283 */                          qj3.m7878K(i8, parcel);
                                } else {
/* 1287 */                          strM7899j14 = qj3.m7899j(i8, parcel);
                                }
                            }
/* 1311 */                  qj3.m7908s(iM7883P7, parcel);
/* 1316 */                  return new GeofencingRequest(arrayListM7903n3, iM7871D9, strM7899j, strM7899j14);
                        case 10:
/* 1222 */                  int iM7883P8 = qj3.m7883P(parcel);
/* 1230 */                  while (parcel.dataPosition() < iM7883P8) {
/* 1232 */                      int i9 = parcel.readInt();
/* 1237 */                      if (((char) i9) != 1) {
/* 1239 */                          qj3.m7878K(i9, parcel);
                                } else {
/* 1245 */                          arrayListM7903n2 = qj3.m7903n(parcel, i9, UvmEntry.CREATOR);
                                }
                            }
/* 1250 */                  qj3.m7908s(iM7883P8, parcel);
/* 1255 */                  return new UvmEntries(arrayListM7903n2);
                        case 11:
/* 1157 */                  int iM7883P9 = qj3.m7883P(parcel);
/* 1161 */                  short s = 0;
/* 1162 */                  short s2 = 0;
/* 1167 */                  while (parcel.dataPosition() < iM7883P9) {
/* 1169 */                      int i10 = parcel.readInt();
/* 1173 */                      char c5 = (char) i10;
/* 1174 */                      if (c5 == 1) {
/* 1202 */                          iM7871D8 = qj3.m7871D(i10, parcel);
                                } else if (c5 == 2) {
/* 1193 */                          qj3.m7887T(parcel, i10, 4);
/* 1200 */                          s = (short) parcel.readInt();
                                } else if (c5 != 3) {
/* 1180 */                          qj3.m7878K(i10, parcel);
                                } else {
/* 1184 */                          qj3.m7887T(parcel, i10, 4);
/* 1191 */                          s2 = (short) parcel.readInt();
                                }
                            }
/* 1207 */                  qj3.m7908s(iM7883P9, parcel);
/* 1212 */                  UvmEntry uvmEntry = new UvmEntry();
/* 1215 */                  uvmEntry.f3840a = iM7871D8;
/* 1217 */                  uvmEntry.f3841b = s;
/* 1219 */                  uvmEntry.f3842c = s2;
/* 1221 */                  return uvmEntry;
                        case 12:
/* 1074 */                  int iM7883P10 = qj3.m7883P(parcel);
/* 1078 */                  boolean zM7914y3 = false;
/* 1079 */                  boolean zM7914y4 = false;
/* 1080 */                  zzr zzrVar = null;
/* 1081 */                  String strM7899j15 = null;
/* 1082 */                  SortOrder sortOrder = null;
/* 1083 */                  ArrayList arrayListM7901l = null;
/* 1084 */                  ArrayList arrayListM7903n4 = null;
/* 1089 */                  while (parcel.dataPosition() < iM7883P10) {
/* 1091 */                      int i11 = parcel.readInt();
                                switch ((char) i11) {
                                    case 1:
/* 1145 */                              zzrVar = (zzr) qj3.m7898i(parcel, i11, zzr.CREATOR);
                                        break;
                                    case 2:
                                    default:
/* 1099 */                              qj3.m7878K(i11, parcel);
                                        break;
                                    case 3:
/* 1134 */                              strM7899j15 = qj3.m7899j(i11, parcel);
                                        break;
                                    case 4:
/* 1131 */                              sortOrder = (SortOrder) qj3.m7898i(parcel, i11, SortOrder.CREATOR);
                                        break;
                                    case 5:
/* 1120 */                              arrayListM7901l = qj3.m7901l(i11, parcel);
                                        break;
                                    case 6:
/* 1115 */                              zM7914y3 = qj3.m7914y(i11, parcel);
                                        break;
                                    case 7:
/* 1110 */                              arrayListM7903n4 = qj3.m7903n(parcel, i11, DriveSpace.CREATOR);
                                        break;
                                    case '\b':
/* 1103 */                              zM7914y4 = qj3.m7914y(i11, parcel);
                                        break;
                                }
                            }
/* 1148 */                  qj3.m7908s(iM7883P10, parcel);
/* 1153 */                  return new Query(zzrVar, strM7899j15, sortOrder, arrayListM7901l, zM7914y3, arrayListM7903n4, zM7914y4);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            try {
/* 1064 */                      return AttestationConveyancePreference.m2053a(parcel.readString());
                            } catch (C2547zd e4) {
/* 1070 */                      ds0.m3199p(e4);
/* 19 */                        return null;
                            }
                        case 14:
/* 982 */                   int iM7883P11 = qj3.m7883P(parcel);
/* 986 */                   boolean zM7914y5 = false;
/* 987 */                   boolean zM7914y6 = false;
/* 988 */                   String strM7899j16 = null;
/* 993 */                   while (parcel.dataPosition() < iM7883P11) {
/* 995 */                       int i12 = parcel.readInt();
/* 999 */                       char c6 = (char) i12;
/* 1000 */                      if (c6 == 1) {
/* 1036 */                          iM7871D7 = qj3.m7871D(i12, parcel);
                                } else if (c6 == 2) {
/* 1031 */                          zM7914y5 = qj3.m7914y(i12, parcel);
                                } else if (c6 == 3) {
/* 1026 */                          arrayListM7903n = qj3.m7903n(parcel, i12, Account.CREATOR);
                                } else if (c6 == 4) {
/* 1019 */                          zM7914y6 = qj3.m7914y(i12, parcel);
                                } else if (c6 != 5) {
/* 1010 */                          qj3.m7878K(i12, parcel);
                                } else {
/* 1014 */                          strM7899j16 = qj3.m7899j(i12, parcel);
                                }
                            }
/* 1041 */                  qj3.m7908s(iM7883P11, parcel);
/* 1046 */                  SourceStartDirectTransferOptions sourceStartDirectTransferOptions = new SourceStartDirectTransferOptions();
/* 1049 */                  sourceStartDirectTransferOptions.f3859a = iM7871D7;
/* 1051 */                  sourceStartDirectTransferOptions.f3860b = zM7914y5;
/* 1053 */                  sourceStartDirectTransferOptions.f3861c = arrayListM7903n;
/* 1055 */                  sourceStartDirectTransferOptions.f3862d = zM7914y6;
/* 1057 */                  sourceStartDirectTransferOptions.f3863e = strM7899j16;
/* 1059 */                  return sourceStartDirectTransferOptions;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 932 */                   int iM7883P12 = qj3.m7883P(parcel);
/* 936 */                   String strM7899j17 = null;
/* 941 */                   while (parcel.dataPosition() < iM7883P12) {
/* 943 */                       int i13 = parcel.readInt();
/* 947 */                       char c7 = (char) i13;
/* 948 */                       if (c7 == 2) {
/* 968 */                           iM7871D6 = qj3.m7871D(i13, parcel);
                                } else if (c7 == 3) {
/* 963 */                           strM7899j6 = qj3.m7899j(i13, parcel);
                                } else if (c7 != 4) {
/* 954 */                           qj3.m7878K(i13, parcel);
                                } else {
/* 958 */                           strM7899j17 = qj3.m7899j(i13, parcel);
                                }
                            }
/* 973 */                   qj3.m7908s(iM7883P12, parcel);
/* 978 */                   return new ChannelIdValue(iM7871D6, strM7899j6, strM7899j17);
                        case 16:
/* 897 */                   int iM7883P13 = qj3.m7883P(parcel);
/* 905 */                   while (parcel.dataPosition() < iM7883P13) {
/* 907 */                       int i14 = parcel.readInt();
/* 912 */                       if (((char) i14) != 1) {
/* 914 */                           qj3.m7878K(i14, parcel);
                                } else {
/* 918 */                           iM7871D5 = qj3.m7871D(i14, parcel);
                                }
                            }
/* 923 */                   qj3.m7908s(iM7883P13, parcel);
/* 928 */                   return new zza(iM7871D5);
                        case 17:
/* 819 */                   DowngradeableSafeParcel.m2019E1();
/* 822 */                   DowngradeableSafeParcel.m2018D1();
/* 825 */                   int iM7883P14 = qj3.m7883P(parcel);
/* 829 */                   String strM7899j18 = null;
/* 830 */                   Uri uri = null;
/* 835 */                   while (parcel.dataPosition() < iM7883P14) {
/* 837 */                       int i15 = parcel.readInt();
/* 841 */                       char c8 = (char) i15;
/* 842 */                       if (c8 == 1) {
/* 874 */                           iM7871D4 = qj3.m7871D(i15, parcel);
                                } else if (c8 == 2) {
/* 868 */                           strM7899j5 = qj3.m7899j(i15, parcel);
                                } else if (c8 == 3) {
/* 863 */                           strM7899j18 = qj3.m7899j(i15, parcel);
                                } else if (c8 != 4) {
/* 850 */                           qj3.m7878K(i15, parcel);
                                } else {
/* 860 */                           uri = (Uri) qj3.m7898i(parcel, i15, Uri.CREATOR);
                                }
                            }
/* 880 */                   qj3.m7908s(iM7883P14, parcel);
/* 885 */                   GameBadgeEntity gameBadgeEntity = new GameBadgeEntity();
/* 888 */                   gameBadgeEntity.f4009b = iM7871D4;
/* 890 */                   gameBadgeEntity.f4010c = strM7899j5;
/* 892 */                   gameBadgeEntity.f4011d = strM7899j18;
/* 894 */                   gameBadgeEntity.f4012e = uri;
/* 896 */                   return gameBadgeEntity;
                        case 18:
/* 726 */                   int iM7883P15 = qj3.m7883P(parcel);
/* 730 */                   long jM7873F2 = 0;
/* 732 */                   String strM7899j19 = null;
/* 733 */                   String strM7899j20 = null;
/* 734 */                   Uri uri2 = null;
/* 736 */                   Uri uri3 = null;
/* 738 */                   Uri uri4 = null;
/* 744 */                   while (parcel.dataPosition() < iM7883P15) {
/* 746 */                       int i16 = parcel.readInt();
                                switch ((char) i16) {
                                    case 1:
/* 804 */                               strM7899j19 = qj3.m7899j(i16, parcel);
                                        break;
                                    case 2:
/* 798 */                               strM7899j20 = qj3.m7899j(i16, parcel);
                                        break;
                                    case 3:
/* 791 */                               jM7873F2 = qj3.m7873F(i16, parcel);
                                        break;
                                    case 4:
/* 786 */                               uri2 = (Uri) qj3.m7898i(parcel, i16, Uri.CREATOR);
                                        break;
                                    case 5:
/* 775 */                               uri3 = (Uri) qj3.m7898i(parcel, i16, Uri.CREATOR);
                                        break;
                                    case 6:
/* 764 */                               uri4 = (Uri) qj3.m7898i(parcel, i16, Uri.CREATOR);
                                        break;
                                    default:
/* 754 */                               qj3.m7878K(i16, parcel);
                                        break;
                                }
                            }
/* 810 */                   qj3.m7908s(iM7883P15, parcel);
/* 815 */                   return new MostRecentGameInfoEntity(strM7899j19, strM7899j20, jM7873F2, uri2, uri3, uri4);
                        case 19:
/* 674 */                   int iM7883P16 = qj3.m7883P(parcel);
/* 678 */                   SnapshotContentsEntity snapshotContentsEntity = null;
/* 683 */                   while (parcel.dataPosition() < iM7883P16) {
/* 685 */                       int i17 = parcel.readInt();
/* 689 */                       char c9 = (char) i17;
/* 690 */                       if (c9 == 1) {
/* 713 */                           snapshotMetadataEntity = (SnapshotMetadataEntity) qj3.m7898i(parcel, i17, SnapshotMetadataEntity.CREATOR);
                                } else if (c9 != 3) {
/* 694 */                           qj3.m7878K(i17, parcel);
                                } else {
/* 704 */                           snapshotContentsEntity = (SnapshotContentsEntity) qj3.m7898i(parcel, i17, SnapshotContentsEntity.CREATOR);
                                }
                            }
/* 717 */                   qj3.m7908s(iM7883P16, parcel);
/* 722 */                   return new SnapshotEntity(snapshotMetadataEntity, snapshotContentsEntity);
                        case 20:
/* 610 */                   int iM7883P17 = qj3.m7883P(parcel);
/* 614 */                   int iM7871D10 = 0;
/* 615 */                   Account account = null;
/* 620 */                   while (parcel.dataPosition() < iM7883P17) {
/* 622 */                       int i18 = parcel.readInt();
/* 626 */                       char c10 = (char) i18;
/* 627 */                       if (c10 == 1) {
/* 659 */                           iM7871D3 = qj3.m7871D(i18, parcel);
                                } else if (c10 == 2) {
/* 654 */                           iM7871D10 = qj3.m7871D(i18, parcel);
                                } else if (c10 == 3) {
/* 648 */                           strM7899j4 = qj3.m7899j(i18, parcel);
                                } else if (c10 != 4) {
/* 635 */                           qj3.m7878K(i18, parcel);
                                } else {
/* 645 */                           account = (Account) qj3.m7898i(parcel, i18, Account.CREATOR);
                                }
                            }
/* 665 */                   qj3.m7908s(iM7883P17, parcel);
/* 670 */                   return new AccountChangeEventsRequest(iM7871D3, iM7871D10, strM7899j4, account);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 537 */                   int iM7883P18 = qj3.m7883P(parcel);
/* 541 */                   int iM7871D11 = 0;
/* 542 */                   int iM7871D12 = 0;
/* 543 */                   boolean zM7914y7 = false;
/* 544 */                   boolean zM7914y8 = false;
/* 545 */                   boolean zM7914y9 = false;
/* 550 */                   while (parcel.dataPosition() < iM7883P18) {
/* 552 */                       int i19 = parcel.readInt();
/* 556 */                       char c11 = (char) i19;
/* 557 */                       if (c11 == 1) {
/* 596 */                           iM7871D11 = qj3.m7871D(i19, parcel);
                                } else if (c11 == 2) {
/* 591 */                           iM7871D12 = qj3.m7871D(i19, parcel);
                                } else if (c11 == 7) {
/* 586 */                           zM7914y7 = qj3.m7914y(i19, parcel);
                                } else if (c11 == '\b') {
/* 581 */                           zM7914y8 = qj3.m7914y(i19, parcel);
                                } else if (c11 != '\t') {
/* 572 */                           qj3.m7878K(i19, parcel);
                                } else {
/* 576 */                           zM7914y9 = qj3.m7914y(i19, parcel);
                                }
                            }
/* 601 */                   qj3.m7908s(iM7883P18, parcel);
/* 606 */                   return new VideoConfiguration(iM7871D11, iM7871D12, zM7914y7, zM7914y8, zM7914y9);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 490 */                   int iM7883P19 = qj3.m7883P(parcel);
/* 494 */                   String strM7899j21 = null;
/* 499 */                   while (parcel.dataPosition() < iM7883P19) {
/* 501 */                       int i20 = parcel.readInt();
/* 505 */                       char c12 = (char) i20;
/* 506 */                       if (c12 == 1) {
/* 519 */                           strM7899j3 = qj3.m7899j(i20, parcel);
                                } else if (c12 != 2) {
/* 510 */                           qj3.m7878K(i20, parcel);
                                } else {
/* 514 */                           strM7899j21 = qj3.m7899j(i20, parcel);
                                }
                            }
/* 524 */                   qj3.m7908s(iM7883P19, parcel);
/* 529 */                   ExecuteRequest executeRequest = new ExecuteRequest();
/* 532 */                   executeRequest.f4266a = strM7899j3;
/* 534 */                   executeRequest.f4267b = strM7899j21;
/* 536 */                   return executeRequest;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 396 */                   int iM7883P20 = qj3.m7883P(parcel);
/* 400 */                   int iM7871D13 = 0;
/* 401 */                   int iM7871D14 = 0;
/* 402 */                   int iM7871D15 = 0;
/* 404 */                   PendingIntent pendingIntent = null;
/* 406 */                   Bundle bundleM7895f3 = null;
/* 408 */                   byte[] bArrM7896g2 = null;
/* 414 */                   while (parcel.dataPosition() < iM7883P20) {
/* 416 */                       int i21 = parcel.readInt();
/* 420 */                       char c13 = (char) i21;
/* 421 */                       if (c13 == 1) {
/* 475 */                           iM7871D14 = qj3.m7871D(i21, parcel);
                                } else if (c13 == 2) {
/* 470 */                           pendingIntent = (PendingIntent) qj3.m7898i(parcel, i21, PendingIntent.CREATOR);
                                } else if (c13 == 3) {
/* 457 */                           iM7871D15 = qj3.m7871D(i21, parcel);
                                } else if (c13 == 4) {
/* 450 */                           bundleM7895f3 = qj3.m7895f(i21, parcel);
                                } else if (c13 == 5) {
/* 443 */                           bArrM7896g2 = qj3.m7896g(i21, parcel);
                                } else if (c13 != 1000) {
/* 433 */                           qj3.m7878K(i21, parcel);
                                } else {
/* 437 */                           iM7871D13 = qj3.m7871D(i21, parcel);
                                }
                            }
/* 481 */                   qj3.m7908s(iM7883P20, parcel);
/* 486 */                   return new ProxyResponse(iM7871D13, iM7871D14, pendingIntent, iM7871D15, bundleM7895f3, bArrM7896g2);
                        case 24:
/* 392 */                   return new zzd(parcel.readStrongBinder());
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 316 */                   int iM7883P21 = qj3.m7883P(parcel);
/* 322 */                   long jM7873F3 = -1;
/* 323 */                   int iM7871D16 = 0;
/* 324 */                   boolean zM7914y10 = false;
/* 326 */                   String strM7899j22 = null;
/* 332 */                   while (parcel.dataPosition() < iM7883P21) {
/* 334 */                       int i22 = parcel.readInt();
/* 338 */                       char c14 = (char) i22;
/* 339 */                       if (c14 == 1) {
/* 370 */                           strM7899j22 = qj3.m7899j(i22, parcel);
                                } else if (c14 == 2) {
/* 364 */                           iM7871D16 = qj3.m7871D(i22, parcel);
                                } else if (c14 == 3) {
/* 358 */                           jM7873F3 = qj3.m7873F(i22, parcel);
                                } else if (c14 != 4) {
/* 347 */                           qj3.m7878K(i22, parcel);
                                } else {
/* 351 */                           zM7914y10 = qj3.m7914y(i22, parcel);
                                }
                            }
/* 377 */                   qj3.m7908s(iM7883P21, parcel);
/* 382 */                   return new Feature(iM7871D16, jM7873F3, strM7899j22, zM7914y10);
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 263 */                   int iM7883P22 = qj3.m7883P(parcel);
/* 267 */                   long jM7873F4 = 0;
/* 268 */                   long jM7873F5 = 0;
/* 269 */                   long jM7873F6 = 0;
/* 275 */                   while (parcel.dataPosition() < iM7883P22) {
/* 277 */                       int i23 = parcel.readInt();
/* 281 */                       char c15 = (char) i23;
/* 282 */                       if (c15 == 2) {
/* 302 */                           jM7873F4 = qj3.m7873F(i23, parcel);
                                } else if (c15 == 3) {
/* 297 */                           jM7873F5 = qj3.m7873F(i23, parcel);
                                } else if (c15 != 4) {
/* 288 */                           qj3.m7878K(i23, parcel);
                                } else {
/* 292 */                           jM7873F6 = qj3.m7873F(i23, parcel);
                                }
                            }
/* 307 */                   qj3.m7908s(iM7883P22, parcel);
/* 312 */                   return new com.google.android.gms.drive.zza(jM7873F4, jM7873F5, jM7873F6);
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 184 */                   int iM7883P23 = qj3.m7883P(parcel);
/* 188 */                   int iM7871D17 = 1;
/* 189 */                   int iM7871D18 = 1;
/* 194 */                   while (parcel.dataPosition() < iM7883P23) {
/* 196 */                       int i24 = parcel.readInt();
/* 200 */                       char c16 = (char) i24;
/* 201 */                       if (c16 == 1) {
/* 239 */                           iM7871D17 = qj3.m7871D(i24, parcel);
                                } else if (c16 == 2) {
/* 234 */                           iM7871D18 = qj3.m7871D(i24, parcel);
                                } else if (c16 == 3) {
/* 229 */                           jM7873F = qj3.m7873F(i24, parcel);
                                } else if (c16 == 4) {
/* 224 */                           iM7871D = qj3.m7871D(i24, parcel);
                                } else if (c16 != 5) {
/* 211 */                           qj3.m7878K(i24, parcel);
                                } else {
/* 221 */                           zzboVarArr = (zzbo[]) qj3.m7902m(parcel, i24, zzbo.CREATOR);
                                }
                            }
/* 244 */                   qj3.m7908s(iM7883P23, parcel);
/* 249 */                   LocationAvailability locationAvailability = new LocationAvailability();
/* 252 */                   locationAvailability.f4121d = iM7871D;
/* 254 */                   locationAvailability.f4118a = iM7871D17;
/* 256 */                   locationAvailability.f4119b = iM7871D18;
/* 258 */                   locationAvailability.f4120c = jM7873F;
/* 260 */                   locationAvailability.f4122e = zzboVarArr;
/* 262 */                   return locationAvailability;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 149 */                   int iM7883P24 = qj3.m7883P(parcel);
/* 157 */                   while (parcel.dataPosition() < iM7883P24) {
/* 159 */                       int i25 = parcel.readInt();
/* 164 */                       if (((char) i25) != 2) {
/* 166 */                           qj3.m7878K(i25, parcel);
                                } else {
/* 170 */                           bundleM7895f = qj3.m7895f(i25, parcel);
                                }
                            }
/* 175 */                   qj3.m7908s(iM7883P24, parcel);
/* 180 */                   return new com.google.android.gms.measurement.internal.zzbe(bundleM7895f);
                        default:
/* 23 */                    int iM7883P25 = qj3.m7883P(parcel);
/* 27 */                    int iM7871D19 = 102;
/* 29 */                    long jM7873F7 = 3600000;
/* 32 */                    long jM7873F8 = 600000;
/* 44 */                    float fM7869B = 0.0f;
/* 45 */                    int iM7871D20 = Integer.MAX_VALUE;
/* 46 */                    long jM7873F9 = Long.MAX_VALUE;
/* 47 */                    boolean zM7914y11 = false;
/* 52 */                    while (parcel.dataPosition() < iM7883P25) {
/* 54 */                        int i26 = parcel.readInt();
/* 58 */                        boolean z = zM7914y11;
                                switch ((char) i26) {
                                    case 1:
/* 113 */                               iM7871D19 = qj3.m7871D(i26, parcel);
                                        break;
                                    case 2:
/* 108 */                               jM7873F7 = qj3.m7873F(i26, parcel);
                                        break;
                                    case 3:
/* 103 */                               jM7873F8 = qj3.m7873F(i26, parcel);
                                        break;
                                    case 4:
/* 98 */                                zM7914y = qj3.m7914y(i26, parcel);
                                        break;
                                    case 5:
/* 92 */                                jM7873F9 = qj3.m7873F(i26, parcel);
                                        break;
                                    case 6:
/* 86 */                                iM7871D20 = qj3.m7871D(i26, parcel);
                                        break;
                                    case 7:
/* 80 */                                fM7869B = qj3.m7869B(i26, parcel);
                                        break;
                                    case '\b':
/* 75 */                                jM7873F = qj3.m7873F(i26, parcel);
                                        break;
                                    case '\t':
/* 70 */                                zM7914y11 = qj3.m7914y(i26, parcel);
                                        continue;
                                    default:
/* 64 */                                qj3.m7878K(i26, parcel);
                                        break;
                                }
/* 67 */                        zM7914y11 = z;
                            }
/* 120 */                   qj3.m7908s(iM7883P25, parcel);
/* 125 */                   LocationRequest locationRequest = new LocationRequest();
/* 128 */                   locationRequest.f4123a = iM7871D19;
/* 130 */                   locationRequest.f4124b = jM7873F7;
/* 132 */                   locationRequest.f4125c = jM7873F8;
/* 134 */                   locationRequest.f4126d = zM7914y;
/* 136 */                   locationRequest.f4127e = jM7873F9;
/* 138 */                   locationRequest.f4128f = iM7871D20;
/* 140 */                   locationRequest.f4129i = fM7869B;
/* 142 */                   locationRequest.f4130v = jM7873F;
/* 146 */                   locationRequest.f4131w = zM7914y11;
/* 148 */                   return locationRequest;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
                    switch (this.f13703a) {
                        case 0:
/* 93 */                    return new zzai[i];
                        case 1:
/* 90 */                    return new PublicKeyCredentialRpEntity[i];
                        case 2:
/* 87 */                    return new PublicKeyCredentialType[i];
                        case 3:
/* 84 */                    return new PublicKeyCredentialUserEntity[i];
                        case 4:
/* 81 */                    return new ResidentKeyRequirement[i];
                        case 5:
/* 78 */                    return new zzao[i];
                        case 6:
/* 75 */                    return new TokenBinding[i];
                        case 7:
/* 72 */                    return new UserVerificationMethodExtension[i];
                        case 8:
/* 69 */                    return new zzat[i];
                        case 9:
/* 66 */                    return new GeofencingRequest[i];
                        case 10:
/* 63 */                    return new UvmEntries[i];
                        case 11:
/* 60 */                    return new UvmEntry[i];
                        case 12:
/* 57 */                    return new Query[i];
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 54 */                    return new AttestationConveyancePreference[i];
                        case 14:
/* 51 */                    return new SourceStartDirectTransferOptions[i];
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 48 */                    return new ChannelIdValue[i];
                        case 16:
/* 45 */                    return new zza[i];
                        case 17:
/* 42 */                    return new GameBadgeEntity[i];
                        case 18:
/* 39 */                    return new MostRecentGameInfoEntity[i];
                        case 19:
/* 36 */                    return new SnapshotEntity[i];
                        case 20:
/* 33 */                    return new AccountChangeEventsRequest[i];
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 30 */                    return new VideoConfiguration[i];
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 27 */                    return new ExecuteRequest[i];
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 24 */                    return new ProxyResponse[i];
                        case 24:
/* 21 */                    return new zzd[i];
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 18 */                    return new Feature[i];
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 15 */                    return new com.google.android.gms.drive.zza[i];
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 12 */                    return new LocationAvailability[i];
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 9 */                     return new com.google.android.gms.measurement.internal.zzbe[i];
                        default:
/* 6 */                     return new LocationRequest[i];
                    }
                }
            }
