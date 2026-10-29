            package p000;

            import android.app.PendingIntent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.BinderWrapper;
            import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
            import com.google.android.gms.common.internal.DowngradeableSafeParcel;
            import com.google.android.gms.common.internal.zzj;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.DriveSpace;
            import com.google.android.gms.drive.events.CompletionEvent;
            import com.google.android.gms.drive.events.zze;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import com.google.android.gms.drive.query.internal.FilterHolder;
            import com.google.android.gms.drive.query.internal.zzb;
            import com.google.android.gms.drive.query.internal.zzd;
            import com.google.android.gms.drive.query.internal.zzf;
            import com.google.android.gms.drive.query.internal.zzl;
            import com.google.android.gms.drive.query.internal.zzn;
            import com.google.android.gms.drive.query.internal.zzt;
            import com.google.android.gms.drive.query.internal.zzv;
            import com.google.android.gms.drive.query.internal.zzz;
            import com.google.android.gms.drive.zzh;
            import com.google.android.gms.fido.common.Transport;
            import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
            import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
            import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
            import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
            import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
            import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
            import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
            import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
            import com.google.android.gms.fido.fido2.api.common.zzaa;
            import com.google.android.gms.fido.fido2.api.common.zzad;
            import com.google.android.gms.fido.fido2.api.common.zzp;
            import com.google.android.gms.fido.fido2.api.common.zzr;
            import com.google.android.gms.fido.fido2.api.common.zzw;
            import com.google.android.gms.fido.fido2.api.common.zzy;
            import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
            import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
            import com.google.android.gms.fido.u2f.api.common.KeyHandle;
            import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
            import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
            import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
            import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
            import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
            import com.google.android.gms.games.GameEntity;
            import com.google.android.gms.games.internal.game.ScreenshotEntity;
            import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
            import com.google.android.gms.games.internal.player.StockProfileImageEntity;
            import com.google.android.gms.recaptchabase.InitRequest;
            import com.google.android.gms.recaptchabase.InitResult;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tf3 implements Parcelable.Creator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17083a;

                public /* synthetic */ tf3(int i) {
/* 1 */             this.f17083a = i;
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 7 */             long jM7873F = 0;
/* 12 */            int iM7871D = 0;
/* 12 */            int iM7871D2 = 0;
/* 12 */            int iM7871D3 = 0;
/* 12 */            int iM7871D4 = 0;
/* 12 */            boolean zM7914y = false;
/* 12 */            int iM7871D5 = 0;
/* 12 */            int iM7871D6 = 0;
/* 12 */            int iM7871D7 = 0;
/* 12 */            int iM7871D8 = 0;
/* 15 */            String strM7899j = null;
/* 15 */            Bundle bundleM7895f = null;
/* 15 */            KeyHandle keyHandle = null;
/* 15 */            String strM7899j2 = null;
/* 15 */            Bundle bundleM7895f2 = null;
/* 15 */            byte[] bArrM7896g = null;
/* 15 */            String strM7899j3 = null;
/* 15 */            byte[] bArrM7896g2 = null;
/* 15 */            String strM7899j4 = null;
/* 15 */            String strM7899j5 = null;
/* 15 */            byte[] bArrM7896g3 = null;
/* 15 */            ArrayList arrayListM7903n = null;
/* 15 */            String strM7899j6 = null;
/* 15 */            byte[] bArrM7896g4 = null;
/* 15 */            MetadataBundle metadataBundle = null;
/* 15 */            String strM7899j7 = null;
/* 15 */            Uri uri = null;
                    switch (this.f17083a) {
                        case 0:
/* 1913 */                  int iM7883P = qj3.m7883P(parcel);
/* 1917 */                  FidoAppIdExtension fidoAppIdExtension = null;
/* 1918 */                  zzp zzpVar = null;
/* 1919 */                  UserVerificationMethodExtension userVerificationMethodExtension = null;
/* 1920 */                  zzw zzwVar = null;
/* 1921 */                  zzy zzyVar = null;
/* 1923 */                  zzaa zzaaVar = null;
/* 1925 */                  zzr zzrVar = null;
/* 1927 */                  zzad zzadVar = null;
/* 1929 */                  GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
/* 1935 */                  while (parcel.dataPosition() < iM7883P) {
/* 1937 */                      int i = parcel.readInt();
                                switch ((char) i) {
                                    case 2:
/* 2041 */                              fidoAppIdExtension = (FidoAppIdExtension) qj3.m7898i(parcel, i, FidoAppIdExtension.CREATOR);
                                        break;
                                    case 3:
/* 2031 */                              zzpVar = (zzp) qj3.m7898i(parcel, i, zzp.CREATOR);
                                        break;
                                    case 4:
/* 2021 */                              userVerificationMethodExtension = (UserVerificationMethodExtension) qj3.m7898i(parcel, i, UserVerificationMethodExtension.CREATOR);
                                        break;
                                    case 5:
/* 2011 */                              zzwVar = (zzw) qj3.m7898i(parcel, i, zzw.CREATOR);
                                        break;
                                    case 6:
/* 2001 */                              zzyVar = (zzy) qj3.m7898i(parcel, i, zzy.CREATOR);
                                        break;
                                    case 7:
/* 1990 */                              zzaaVar = (zzaa) qj3.m7898i(parcel, i, zzaa.CREATOR);
                                        break;
                                    case '\b':
/* 1979 */                              zzrVar = (zzr) qj3.m7898i(parcel, i, zzr.CREATOR);
                                        break;
                                    case '\t':
/* 1968 */                              zzadVar = (zzad) qj3.m7898i(parcel, i, zzad.CREATOR);
                                        break;
                                    case '\n':
/* 1957 */                              googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) qj3.m7898i(parcel, i, GoogleThirdPartyPaymentExtension.CREATOR);
                                        break;
                                    default:
/* 1945 */                              qj3.m7878K(i, parcel);
                                        break;
                                }
                            }
/* 2044 */                  qj3.m7908s(iM7883P, parcel);
/* 2049 */                  return new AuthenticationExtensions(fidoAppIdExtension, zzpVar, userVerificationMethodExtension, zzwVar, zzyVar, zzaaVar, zzrVar, zzadVar, googleThirdPartyPaymentExtension);
                        case 1:
/* 1871 */                  int iM7883P2 = qj3.m7883P(parcel);
/* 1879 */                  while (parcel.dataPosition() < iM7883P2) {
/* 1881 */                      int i2 = parcel.readInt();
/* 1885 */                      char c = (char) i2;
/* 1886 */                      if (c == 2) {
/* 1899 */                          iM7871D = qj3.m7871D(i2, parcel);
                                } else if (c != 3) {
/* 1890 */                          qj3.m7878K(i2, parcel);
                                } else {
/* 1894 */                          strM7899j = qj3.m7899j(i2, parcel);
                                }
                            }
/* 1904 */                  qj3.m7908s(iM7883P2, parcel);
/* 1909 */                  return new ErrorResponseData(iM7871D, strM7899j);
                        case 2:
/* 1815 */                  int iM7883P3 = qj3.m7883P(parcel);
/* 1819 */                  int iM7871D9 = 0;
/* 1824 */                  while (parcel.dataPosition() < iM7883P3) {
/* 1826 */                      int i3 = parcel.readInt();
/* 1830 */                      char c2 = (char) i3;
/* 1831 */                      if (c2 == 1) {
/* 1858 */                          uri = (Uri) qj3.m7898i(parcel, i3, Uri.CREATOR);
                                } else if (c2 == 2) {
/* 1846 */                          iM7871D8 = qj3.m7871D(i3, parcel);
                                } else if (c2 != 3) {
/* 1837 */                          qj3.m7878K(i3, parcel);
                                } else {
/* 1841 */                          iM7871D9 = qj3.m7871D(i3, parcel);
                                }
                            }
/* 1862 */                  qj3.m7908s(iM7883P3, parcel);
/* 1867 */                  return new ScreenshotEntity(uri, iM7871D8, iM7871D9);
                        case 3:
/* 1658 */                  int iM7883P4 = qj3.m7883P(parcel);
/* 1662 */                  boolean zM7914y2 = false;
/* 1663 */                  boolean zM7914y3 = false;
/* 1664 */                  boolean zM7914y4 = false;
/* 1666 */                  boolean zM7914y5 = false;
/* 1668 */                  boolean zM7914y6 = false;
/* 1670 */                  int iM7871D10 = 0;
/* 1672 */                  boolean zM7914y7 = false;
/* 1674 */                  boolean zM7914y8 = false;
/* 1676 */                  int iM7871D11 = 0;
/* 1678 */                  int iM7871D12 = 0;
/* 1680 */                  boolean zM7914y9 = false;
/* 1682 */                  Status status = null;
/* 1683 */                  String strM7899j8 = null;
/* 1684 */                  StockProfileImageEntity stockProfileImageEntity = null;
/* 1690 */                  while (parcel.dataPosition() < iM7883P4) {
/* 1692 */                      int i4 = parcel.readInt();
                                switch ((char) i4) {
                                    case 1:
/* 1802 */                              status = (Status) qj3.m7898i(parcel, i4, Status.CREATOR);
                                        break;
                                    case 2:
/* 1790 */                              strM7899j8 = qj3.m7899j(i4, parcel);
                                        break;
                                    case 3:
/* 1784 */                              zM7914y2 = qj3.m7914y(i4, parcel);
                                        break;
                                    case 4:
/* 1778 */                              zM7914y3 = qj3.m7914y(i4, parcel);
                                        break;
                                    case 5:
/* 1771 */                              zM7914y4 = qj3.m7914y(i4, parcel);
                                        break;
                                    case 6:
/* 1766 */                              stockProfileImageEntity = (StockProfileImageEntity) qj3.m7898i(parcel, i4, StockProfileImageEntity.CREATOR);
                                        break;
                                    case 7:
/* 1753 */                              zM7914y5 = qj3.m7914y(i4, parcel);
                                        break;
                                    case '\b':
/* 1746 */                              zM7914y6 = qj3.m7914y(i4, parcel);
                                        break;
                                    case '\t':
/* 1739 */                              iM7871D10 = qj3.m7871D(i4, parcel);
                                        break;
                                    case '\n':
/* 1732 */                              zM7914y7 = qj3.m7914y(i4, parcel);
                                        break;
                                    case 11:
/* 1725 */                              zM7914y8 = qj3.m7914y(i4, parcel);
                                        break;
                                    case '\f':
/* 1718 */                              iM7871D11 = qj3.m7871D(i4, parcel);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1711 */                              iM7871D12 = qj3.m7871D(i4, parcel);
                                        break;
                                    case 14:
/* 1704 */                              zM7914y9 = qj3.m7914y(i4, parcel);
                                        break;
                                    default:
/* 1700 */                              qj3.m7878K(i4, parcel);
                                        break;
                                }
                            }
/* 1806 */                  qj3.m7908s(iM7883P4, parcel);
/* 1811 */                  return new ProfileSettingsEntity(status, strM7899j8, zM7914y2, zM7914y3, zM7914y4, stockProfileImageEntity, zM7914y5, zM7914y6, iM7871D10, zM7914y7, zM7914y8, iM7871D11, iM7871D12, zM7914y9);
                        case 4:
/* 1592 */                  int iM7883P5 = qj3.m7883P(parcel);
/* 1596 */                  PendingIntent pendingIntent = null;
/* 1597 */                  ConnectionResult connectionResult = null;
/* 1602 */                  while (parcel.dataPosition() < iM7883P5) {
/* 1604 */                      int i5 = parcel.readInt();
/* 1608 */                      char c3 = (char) i5;
/* 1609 */                      if (c3 == 1) {
/* 1644 */                          iM7871D7 = qj3.m7871D(i5, parcel);
                                } else if (c3 == 2) {
/* 1639 */                          strM7899j7 = qj3.m7899j(i5, parcel);
                                } else if (c3 == 3) {
/* 1636 */                          pendingIntent = (PendingIntent) qj3.m7898i(parcel, i5, PendingIntent.CREATOR);
                                } else if (c3 != 4) {
/* 1617 */                          qj3.m7878K(i5, parcel);
                                } else {
/* 1627 */                          connectionResult = (ConnectionResult) qj3.m7898i(parcel, i5, ConnectionResult.CREATOR);
                                }
                            }
/* 1649 */                  qj3.m7908s(iM7883P5, parcel);
/* 1654 */                  return new Status(iM7871D7, strM7899j7, pendingIntent, connectionResult);
                        case 5:
/* 1552 */                  int iM7883P6 = qj3.m7883P(parcel);
/* 1560 */                  while (parcel.dataPosition() < iM7883P6) {
/* 1562 */                      int i6 = parcel.readInt();
/* 1567 */                      if (((char) i6) != 1) {
/* 1569 */                          qj3.m7878K(i6, parcel);
                                } else {
/* 1580 */                          metadataBundle = (MetadataBundle) qj3.m7898i(parcel, i6, MetadataBundle.CREATOR);
                                }
                            }
/* 1583 */                  qj3.m7908s(iM7883P6, parcel);
/* 1588 */                  return new zzd(metadataBundle);
                        case 6:
/* 1492 */                  int iM7883P7 = qj3.m7883P(parcel);
/* 1496 */                  String strM7899j9 = null;
/* 1497 */                  ArrayList arrayListM7903n2 = null;
/* 1502 */                  while (parcel.dataPosition() < iM7883P7) {
/* 1504 */                      int i7 = parcel.readInt();
/* 1508 */                      char c4 = (char) i7;
/* 1509 */                      if (c4 == 1) {
/* 1538 */                          iM7871D6 = qj3.m7871D(i7, parcel);
                                } else if (c4 == 2) {
/* 1533 */                          bArrM7896g4 = qj3.m7896g(i7, parcel);
                                } else if (c4 == 3) {
/* 1528 */                          strM7899j9 = qj3.m7899j(i7, parcel);
                                } else if (c4 != 4) {
/* 1517 */                          qj3.m7878K(i7, parcel);
                                } else {
/* 1523 */                          arrayListM7903n2 = qj3.m7903n(parcel, i7, Transport.CREATOR);
                                }
                            }
/* 1543 */                  qj3.m7908s(iM7883P7, parcel);
/* 1548 */                  return new KeyHandle(iM7871D6, bArrM7896g4, strM7899j9, arrayListM7903n2);
                        case 7:
/* 1216 */                  DowngradeableSafeParcel.m2019E1();
/* 1219 */                  DowngradeableSafeParcel.m2018D1();
/* 1222 */                  int iM7883P8 = qj3.m7883P(parcel);
/* 1226 */                  boolean zM7914y10 = false;
/* 1228 */                  boolean zM7914y11 = false;
/* 1230 */                  int iM7871D13 = 0;
/* 1232 */                  int iM7871D14 = 0;
/* 1234 */                  int iM7871D15 = 0;
/* 1236 */                  boolean zM7914y12 = false;
/* 1238 */                  boolean zM7914y13 = false;
/* 1240 */                  boolean zM7914y14 = false;
/* 1242 */                  boolean zM7914y15 = false;
/* 1244 */                  boolean zM7914y16 = false;
/* 1246 */                  boolean zM7914y17 = false;
/* 1248 */                  String strM7899j10 = null;
/* 1249 */                  String strM7899j11 = null;
/* 1250 */                  String strM7899j12 = null;
/* 1251 */                  String strM7899j13 = null;
/* 1252 */                  String strM7899j14 = null;
/* 1254 */                  String strM7899j15 = null;
/* 1256 */                  Uri uri2 = null;
/* 1258 */                  Uri uri3 = null;
/* 1260 */                  Uri uri4 = null;
/* 1262 */                  String strM7899j16 = null;
/* 1264 */                  String strM7899j17 = null;
/* 1266 */                  String strM7899j18 = null;
/* 1268 */                  String strM7899j19 = null;
/* 1270 */                  String strM7899j20 = null;
/* 1276 */                  while (parcel.dataPosition() < iM7883P8) {
/* 1278 */                      int i8 = parcel.readInt();
                                switch ((char) i8) {
                                    case 1:
/* 1476 */                              strM7899j10 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 2:
/* 1469 */                              strM7899j11 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 3:
/* 1462 */                              strM7899j12 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 4:
/* 1455 */                              strM7899j13 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 5:
/* 1447 */                              strM7899j14 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 6:
/* 1439 */                              strM7899j15 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 7:
/* 1433 */                              uri2 = (Uri) qj3.m7898i(parcel, i8, Uri.CREATOR);
                                        break;
                                    case '\b':
/* 1421 */                              uri3 = (Uri) qj3.m7898i(parcel, i8, Uri.CREATOR);
                                        break;
                                    case '\t':
/* 1409 */                              uri4 = (Uri) qj3.m7898i(parcel, i8, Uri.CREATOR);
                                        break;
                                    case '\n':
/* 1395 */                              zM7914y10 = qj3.m7914y(i8, parcel);
                                        break;
                                    case 11:
/* 1388 */                              zM7914y11 = qj3.m7914y(i8, parcel);
                                        break;
                                    case '\f':
/* 1381 */                              strM7899j16 = qj3.m7899j(i8, parcel);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1374 */                              iM7871D13 = qj3.m7871D(i8, parcel);
                                        break;
                                    case 14:
/* 1367 */                              iM7871D14 = qj3.m7871D(i8, parcel);
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1360 */                              iM7871D15 = qj3.m7871D(i8, parcel);
                                        break;
                                    case 16:
/* 1353 */                              zM7914y12 = qj3.m7914y(i8, parcel);
                                        break;
                                    case 17:
/* 1346 */                              zM7914y13 = qj3.m7914y(i8, parcel);
                                        break;
                                    case 18:
/* 1339 */                              strM7899j17 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 19:
/* 1332 */                              strM7899j18 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 20:
/* 1325 */                              strM7899j19 = qj3.m7899j(i8, parcel);
                                        break;
                                    case Build.API_LEVELS.API_21 /* 21 */:
/* 1318 */                              zM7914y14 = qj3.m7914y(i8, parcel);
                                        break;
                                    case Build.API_LEVELS.API_22 /* 22 */:
/* 1311 */                              zM7914y15 = qj3.m7914y(i8, parcel);
                                        break;
                                    case Build.API_LEVELS.API_23 /* 23 */:
/* 1304 */                              zM7914y16 = qj3.m7914y(i8, parcel);
                                        break;
                                    case 24:
/* 1297 */                              strM7899j20 = qj3.m7899j(i8, parcel);
                                        break;
                                    case Build.API_LEVELS.API_25 /* 25 */:
/* 1290 */                              zM7914y17 = qj3.m7914y(i8, parcel);
                                        break;
                                    default:
/* 1286 */                              qj3.m7878K(i8, parcel);
                                        break;
                                }
                            }
/* 1483 */                  qj3.m7908s(iM7883P8, parcel);
/* 1488 */                  return new GameEntity(strM7899j10, strM7899j11, strM7899j12, strM7899j13, strM7899j14, strM7899j15, uri2, uri3, uri4, zM7914y10, zM7914y11, strM7899j16, iM7871D13, iM7871D14, iM7871D15, zM7914y12, zM7914y13, strM7899j17, strM7899j18, strM7899j19, zM7914y14, zM7914y15, zM7914y16, strM7899j20, zM7914y17);
                        case 8:
/* 1168 */                  int iM7883P9 = qj3.m7883P(parcel);
/* 1172 */                  Uri uri5 = null;
/* 1177 */                  while (parcel.dataPosition() < iM7883P9) {
/* 1179 */                      int i9 = parcel.readInt();
/* 1183 */                      char c5 = (char) i9;
/* 1184 */                      if (c5 == 1) {
/* 1201 */                          strM7899j6 = qj3.m7899j(i9, parcel);
                                } else if (c5 != 2) {
/* 1188 */                          qj3.m7878K(i9, parcel);
                                } else {
/* 1198 */                          uri5 = (Uri) qj3.m7898i(parcel, i9, Uri.CREATOR);
                                }
                            }
/* 1207 */                  qj3.m7908s(iM7883P9, parcel);
/* 1212 */                  return new StockProfileImageEntity(uri5, strM7899j6);
                        case 9:
/* 1141 */                  int iM7883P10 = qj3.m7883P(parcel);
/* 1149 */                  while (parcel.dataPosition() < iM7883P10) {
/* 1155 */                      qj3.m7878K(parcel.readInt(), parcel);
                            }
/* 1159 */                  qj3.m7908s(iM7883P10, parcel);
/* 1164 */                  return new InitRequest();
                        case 10:
/* 1089 */                  int iM7883P11 = qj3.m7883P(parcel);
/* 1093 */                  boolean zM7914y18 = false;
/* 1098 */                  while (parcel.dataPosition() < iM7883P11) {
/* 1100 */                      int i10 = parcel.readInt();
/* 1104 */                      char c6 = (char) i10;
/* 1105 */                      if (c6 == 2) {
/* 1127 */                          iM7871D5 = qj3.m7871D(i10, parcel);
                                } else if (c6 == 3) {
/* 1122 */                          zM7914y18 = qj3.m7914y(i10, parcel);
                                } else if (c6 != 4) {
/* 1111 */                          qj3.m7878K(i10, parcel);
                                } else {
/* 1117 */                          arrayListM7903n = qj3.m7903n(parcel, i10, DriveSpace.CREATOR);
                                }
                            }
/* 1132 */                  qj3.m7908s(iM7883P11, parcel);
/* 1137 */                  return new zze(iM7871D5, zM7914y18, arrayListM7903n);
                        case 11:
/* 1046 */                  int iM7883P12 = qj3.m7883P(parcel);
/* 1050 */                  byte[] bArrM7896g5 = null;
/* 1055 */                  while (parcel.dataPosition() < iM7883P12) {
/* 1057 */                      int i11 = parcel.readInt();
/* 1061 */                      char c7 = (char) i11;
/* 1062 */                      if (c7 == 1) {
/* 1075 */                          bArrM7896g3 = qj3.m7896g(i11, parcel);
                                } else if (c7 != 2) {
/* 1066 */                          qj3.m7878K(i11, parcel);
                                } else {
/* 1070 */                          bArrM7896g5 = qj3.m7896g(i11, parcel);
                                }
                            }
/* 1080 */                  qj3.m7908s(iM7883P12, parcel);
/* 1085 */                  return new com.google.android.gms.fido.fido2.api.common.zze(bArrM7896g3, bArrM7896g5);
                        case 12:
                            try {
/* 1036 */                      return ProtocolVersion.m2061a(parcel.readString());
                            } catch (hz1 e) {
/* 1042 */                      ds0.m3199p(e);
/* 15 */                        return null;
                            }
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1005 */                  int iM7883P13 = qj3.m7883P(parcel);
/* 1013 */                  while (parcel.dataPosition() < iM7883P13) {
/* 1019 */                      qj3.m7878K(parcel.readInt(), parcel);
                            }
/* 1023 */                  qj3.m7908s(iM7883P13, parcel);
/* 1028 */                  return new InitResult();
                        case 14:
/* 901 */                   int iM7883P14 = qj3.m7883P(parcel);
/* 905 */                   int iM7871D16 = 0;
/* 907 */                   DriveId driveId = null;
/* 908 */                   String strM7899j21 = null;
/* 909 */                   ParcelFileDescriptor parcelFileDescriptor = null;
/* 910 */                   ParcelFileDescriptor parcelFileDescriptor2 = null;
/* 911 */                   MetadataBundle metadataBundle2 = null;
/* 913 */                   ArrayList arrayListM7901l = null;
/* 915 */                   IBinder iBinderM7870C = null;
/* 921 */                   while (parcel.dataPosition() < iM7883P14) {
/* 923 */                       int i12 = parcel.readInt();
                                switch ((char) i12) {
                                    case 2:
/* 993 */                               driveId = (DriveId) qj3.m7898i(parcel, i12, DriveId.CREATOR);
                                        break;
                                    case 3:
/* 981 */                               strM7899j21 = qj3.m7899j(i12, parcel);
                                        break;
                                    case 4:
/* 978 */                               parcelFileDescriptor = (ParcelFileDescriptor) qj3.m7898i(parcel, i12, ParcelFileDescriptor.CREATOR);
                                        break;
                                    case 5:
/* 968 */                               parcelFileDescriptor2 = (ParcelFileDescriptor) qj3.m7898i(parcel, i12, ParcelFileDescriptor.CREATOR);
                                        break;
                                    case 6:
/* 958 */                               metadataBundle2 = (MetadataBundle) qj3.m7898i(parcel, i12, MetadataBundle.CREATOR);
                                        break;
                                    case 7:
/* 945 */                               arrayListM7901l = qj3.m7901l(i12, parcel);
                                        break;
                                    case '\b':
/* 940 */                               iM7871D16 = qj3.m7871D(i12, parcel);
                                        break;
                                    case '\t':
/* 935 */                               iBinderM7870C = qj3.m7870C(i12, parcel);
                                        break;
                                    default:
/* 931 */                               qj3.m7878K(i12, parcel);
                                        break;
                                }
                            }
/* 996 */                   qj3.m7908s(iM7883P14, parcel);
/* 1001 */                  return new CompletionEvent(driveId, strM7899j21, parcelFileDescriptor, parcelFileDescriptor2, metadataBundle2, arrayListM7901l, iM7871D16, iBinderM7870C);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 859 */                   int iM7883P15 = qj3.m7883P(parcel);
/* 867 */                   while (parcel.dataPosition() < iM7883P15) {
/* 869 */                       int i13 = parcel.readInt();
/* 873 */                       char c8 = (char) i13;
/* 874 */                       if (c8 == 1) {
/* 887 */                           strM7899j5 = qj3.m7899j(i13, parcel);
                                } else if (c8 != 2) {
/* 878 */                           qj3.m7878K(i13, parcel);
                                } else {
/* 882 */                           zM7914y = qj3.m7914y(i13, parcel);
                                }
                            }
/* 892 */                   qj3.m7908s(iM7883P15, parcel);
/* 897 */                   return new zzf(strM7899j5, zM7914y);
                        case 16:
/* 789 */                   int iM7883P16 = qj3.m7883P(parcel);
/* 793 */                   byte[] bArrM7896g6 = null;
/* 794 */                   byte[] bArrM7896g7 = null;
/* 795 */                   byte[] bArrM7896g8 = null;
/* 796 */                   byte[] bArrM7896g9 = null;
/* 797 */                   byte[] bArrM7896g10 = null;
/* 803 */                   while (parcel.dataPosition() < iM7883P16) {
/* 805 */                       int i14 = parcel.readInt();
/* 809 */                       char c9 = (char) i14;
/* 810 */                       if (c9 == 2) {
/* 845 */                           bArrM7896g6 = qj3.m7896g(i14, parcel);
                                } else if (c9 == 3) {
/* 840 */                           bArrM7896g7 = qj3.m7896g(i14, parcel);
                                } else if (c9 == 4) {
/* 835 */                           bArrM7896g8 = qj3.m7896g(i14, parcel);
                                } else if (c9 == 5) {
/* 830 */                           bArrM7896g9 = qj3.m7896g(i14, parcel);
                                } else if (c9 != 6) {
/* 821 */                           qj3.m7878K(i14, parcel);
                                } else {
/* 825 */                           bArrM7896g10 = qj3.m7896g(i14, parcel);
                                }
                            }
/* 850 */                   qj3.m7908s(iM7883P16, parcel);
/* 855 */                   return new AuthenticatorAssertionResponse(bArrM7896g6, bArrM7896g7, bArrM7896g8, bArrM7896g9, bArrM7896g10);
                        case 17:
/* 731 */                   int iM7883P17 = qj3.m7883P(parcel);
/* 735 */                   byte[] bArrM7896g11 = null;
/* 736 */                   String strM7899j22 = null;
/* 741 */                   while (parcel.dataPosition() < iM7883P17) {
/* 743 */                       int i15 = parcel.readInt();
/* 747 */                       char c10 = (char) i15;
/* 748 */                       if (c10 == 1) {
/* 775 */                           iM7871D4 = qj3.m7871D(i15, parcel);
                                } else if (c10 == 2) {
/* 770 */                           strM7899j4 = qj3.m7899j(i15, parcel);
                                } else if (c10 == 3) {
/* 765 */                           bArrM7896g11 = qj3.m7896g(i15, parcel);
                                } else if (c10 != 4) {
/* 756 */                           qj3.m7878K(i15, parcel);
                                } else {
/* 760 */                           strM7899j22 = qj3.m7899j(i15, parcel);
                                }
                            }
/* 780 */                   qj3.m7908s(iM7883P17, parcel);
/* 785 */                   return new RegisterRequest(iM7871D4, strM7899j4, bArrM7896g11, strM7899j22);
                        case 18:
/* 727 */                   return new BinderWrapper(parcel);
                        case 19:
/* 585 */                   int iM7883P18 = qj3.m7883P(parcel);
/* 589 */                   zzb zzbVar = null;
/* 590 */                   zzd zzdVar = null;
/* 591 */                   com.google.android.gms.drive.query.internal.zzr zzrVar2 = null;
/* 592 */                   zzv zzvVar = null;
/* 593 */                   com.google.android.gms.drive.query.internal.zzp zzpVar2 = null;
/* 595 */                   zzt zztVar = null;
/* 597 */                   zzn zznVar = null;
/* 599 */                   zzl zzlVar = null;
/* 601 */                   zzz zzzVar = null;
/* 607 */                   while (parcel.dataPosition() < iM7883P18) {
/* 609 */                       int i16 = parcel.readInt();
                                switch ((char) i16) {
                                    case 1:
/* 713 */                               zzbVar = (zzb) qj3.m7898i(parcel, i16, zzb.CREATOR);
                                        break;
                                    case 2:
/* 703 */                               zzdVar = (zzd) qj3.m7898i(parcel, i16, zzd.CREATOR);
                                        break;
                                    case 3:
/* 693 */                               zzrVar2 = (com.google.android.gms.drive.query.internal.zzr) qj3.m7898i(parcel, i16, com.google.android.gms.drive.query.internal.zzr.CREATOR);
                                        break;
                                    case 4:
/* 683 */                               zzvVar = (zzv) qj3.m7898i(parcel, i16, zzv.CREATOR);
                                        break;
                                    case 5:
/* 673 */                               zzpVar2 = (com.google.android.gms.drive.query.internal.zzp) qj3.m7898i(parcel, i16, com.google.android.gms.drive.query.internal.zzp.CREATOR);
                                        break;
                                    case 6:
/* 662 */                               zztVar = (zzt) qj3.m7898i(parcel, i16, zzt.CREATOR);
                                        break;
                                    case 7:
/* 651 */                               zznVar = (zzn) qj3.m7898i(parcel, i16, zzn.CREATOR);
                                        break;
                                    case '\b':
/* 640 */                               zzlVar = (zzl) qj3.m7898i(parcel, i16, zzl.CREATOR);
                                        break;
                                    case '\t':
/* 629 */                               zzzVar = (zzz) qj3.m7898i(parcel, i16, zzz.CREATOR);
                                        break;
                                    default:
/* 617 */                               qj3.m7878K(i16, parcel);
                                        break;
                                }
                            }
/* 716 */                   qj3.m7908s(iM7883P18, parcel);
/* 721 */                   return new FilterHolder(zzbVar, zzdVar, zzrVar2, zzvVar, zzpVar2, zztVar, zznVar, zzlVar, zzzVar);
                        case 20:
/* 526 */                   int iM7883P19 = qj3.m7883P(parcel);
/* 530 */                   byte[] bArrM7896g12 = null;
/* 531 */                   byte[] bArrM7896g13 = null;
/* 532 */                   String[] strArrM7900k = null;
/* 537 */                   while (parcel.dataPosition() < iM7883P19) {
/* 539 */                       int i17 = parcel.readInt();
/* 543 */                       char c11 = (char) i17;
/* 544 */                       if (c11 == 2) {
/* 571 */                           bArrM7896g2 = qj3.m7896g(i17, parcel);
                                } else if (c11 == 3) {
/* 566 */                           bArrM7896g12 = qj3.m7896g(i17, parcel);
                                } else if (c11 == 4) {
/* 561 */                           bArrM7896g13 = qj3.m7896g(i17, parcel);
                                } else if (c11 != 5) {
/* 552 */                           qj3.m7878K(i17, parcel);
                                } else {
/* 556 */                           strArrM7900k = qj3.m7900k(i17, parcel);
                                }
                            }
/* 576 */                   qj3.m7908s(iM7883P19, parcel);
/* 581 */                   return new AuthenticatorAttestationResponse(bArrM7896g2, bArrM7896g12, bArrM7896g13, strArrM7900k);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 441 */                   int iM7883P20 = qj3.m7883P(parcel);
/* 445 */                   Integer numM7872E = null;
/* 446 */                   Double dM7868A = null;
/* 447 */                   Uri uri6 = null;
/* 448 */                   ArrayList arrayListM7903n3 = null;
/* 449 */                   ArrayList arrayListM7903n4 = null;
/* 450 */                   ChannelIdValue channelIdValue = null;
/* 451 */                   String strM7899j23 = null;
/* 456 */                   while (parcel.dataPosition() < iM7883P20) {
/* 458 */                       int i18 = parcel.readInt();
                                switch ((char) i18) {
                                    case 2:
/* 512 */                               numM7872E = qj3.m7872E(i18, parcel);
                                        break;
                                    case 3:
/* 507 */                               dM7868A = qj3.m7868A(i18, parcel);
                                        break;
                                    case 4:
/* 504 */                               uri6 = (Uri) qj3.m7898i(parcel, i18, Uri.CREATOR);
                                        break;
                                    case 5:
/* 493 */                               arrayListM7903n3 = qj3.m7903n(parcel, i18, RegisterRequest.CREATOR);
                                        break;
                                    case 6:
/* 486 */                               arrayListM7903n4 = qj3.m7903n(parcel, i18, RegisteredKey.CREATOR);
                                        break;
                                    case 7:
/* 481 */                               channelIdValue = (ChannelIdValue) qj3.m7898i(parcel, i18, ChannelIdValue.CREATOR);
                                        break;
                                    case '\b':
/* 470 */                               strM7899j23 = qj3.m7899j(i18, parcel);
                                        break;
                                    default:
/* 466 */                               qj3.m7878K(i18, parcel);
                                        break;
                                }
                            }
/* 517 */                   qj3.m7908s(iM7883P20, parcel);
/* 522 */                   return new RegisterRequestParams(numM7872E, dM7868A, uri6, arrayListM7903n3, arrayListM7903n4, channelIdValue, strM7899j23);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 398 */                   int iM7883P21 = qj3.m7883P(parcel);
/* 402 */                   long jM7873F2 = 0;
/* 407 */                   while (parcel.dataPosition() < iM7883P21) {
/* 409 */                       int i19 = parcel.readInt();
/* 413 */                       char c12 = (char) i19;
/* 414 */                       if (c12 == 2) {
/* 427 */                           jM7873F = qj3.m7873F(i19, parcel);
                                } else if (c12 != 3) {
/* 418 */                           qj3.m7878K(i19, parcel);
                                } else {
/* 422 */                           jM7873F2 = qj3.m7873F(i19, parcel);
                                }
                            }
/* 432 */                   qj3.m7908s(iM7883P21, parcel);
/* 437 */                   return new zzh(jM7873F, jM7873F2);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 356 */                   int iM7883P22 = qj3.m7883P(parcel);
/* 364 */                   while (parcel.dataPosition() < iM7883P22) {
/* 366 */                       int i20 = parcel.readInt();
/* 370 */                       char c13 = (char) i20;
/* 371 */                       if (c13 == 2) {
/* 384 */                           iM7871D3 = qj3.m7871D(i20, parcel);
                                } else if (c13 != 3) {
/* 375 */                           qj3.m7878K(i20, parcel);
                                } else {
/* 379 */                           strM7899j3 = qj3.m7899j(i20, parcel);
                                }
                            }
/* 389 */                   qj3.m7908s(iM7883P22, parcel);
/* 394 */                   return new AuthenticatorErrorResponse(iM7871D3, strM7899j3);
                        case 24:
/* 305 */                   int iM7883P23 = qj3.m7883P(parcel);
/* 309 */                   String strM7899j24 = null;
/* 310 */                   String strM7899j25 = null;
/* 315 */                   while (parcel.dataPosition() < iM7883P23) {
/* 317 */                       int i21 = parcel.readInt();
/* 321 */                       char c14 = (char) i21;
/* 322 */                       if (c14 == 2) {
/* 342 */                           bArrM7896g = qj3.m7896g(i21, parcel);
                                } else if (c14 == 3) {
/* 337 */                           strM7899j24 = qj3.m7899j(i21, parcel);
                                } else if (c14 != 4) {
/* 328 */                           qj3.m7878K(i21, parcel);
                                } else {
/* 332 */                           strM7899j25 = qj3.m7899j(i21, parcel);
                                }
                            }
/* 347 */                   qj3.m7908s(iM7883P23, parcel);
/* 352 */                   return new RegisterResponseData(bArrM7896g, strM7899j24, strM7899j25);
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 270 */                   int iM7883P24 = qj3.m7883P(parcel);
/* 278 */                   while (parcel.dataPosition() < iM7883P24) {
/* 280 */                       int i22 = parcel.readInt();
/* 285 */                       if (((char) i22) != 2) {
/* 287 */                           qj3.m7878K(i22, parcel);
                                } else {
/* 291 */                           bundleM7895f2 = qj3.m7895f(i22, parcel);
                                }
                            }
/* 296 */                   qj3.m7908s(iM7883P24, parcel);
/* 301 */                   return new MetadataBundle(bundleM7895f2);
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 211 */                   int iM7883P25 = qj3.m7883P(parcel);
/* 215 */                   Boolean boolM7915z = null;
/* 216 */                   String strM7899j26 = null;
/* 217 */                   String strM7899j27 = null;
/* 222 */                   while (parcel.dataPosition() < iM7883P25) {
/* 224 */                       int i23 = parcel.readInt();
/* 228 */                       char c15 = (char) i23;
/* 229 */                       if (c15 == 2) {
/* 256 */                           strM7899j2 = qj3.m7899j(i23, parcel);
                                } else if (c15 == 3) {
/* 251 */                           boolM7915z = qj3.m7915z(i23, parcel);
                                } else if (c15 == 4) {
/* 246 */                           strM7899j26 = qj3.m7899j(i23, parcel);
                                } else if (c15 != 5) {
/* 237 */                           qj3.m7878K(i23, parcel);
                                } else {
/* 241 */                           strM7899j27 = qj3.m7899j(i23, parcel);
                                }
                            }
/* 261 */                   qj3.m7908s(iM7883P25, parcel);
/* 266 */                   return new AuthenticatorSelectionCriteria(strM7899j2, boolM7915z, strM7899j26, strM7899j27);
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 155 */                   int iM7883P26 = qj3.m7883P(parcel);
/* 159 */                   String strM7899j28 = null;
/* 160 */                   String strM7899j29 = null;
/* 165 */                   while (parcel.dataPosition() < iM7883P26) {
/* 167 */                       int i24 = parcel.readInt();
/* 171 */                       char c16 = (char) i24;
/* 172 */                       if (c16 == 2) {
/* 199 */                           keyHandle = (KeyHandle) qj3.m7898i(parcel, i24, KeyHandle.CREATOR);
                                } else if (c16 == 3) {
/* 187 */                           strM7899j28 = qj3.m7899j(i24, parcel);
                                } else if (c16 != 4) {
/* 178 */                           qj3.m7878K(i24, parcel);
                                } else {
/* 182 */                           strM7899j29 = qj3.m7899j(i24, parcel);
                                }
                            }
/* 202 */                   qj3.m7908s(iM7883P26, parcel);
/* 207 */                   return new RegisteredKey(keyHandle, strM7899j28, strM7899j29);
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 81 */                    int iM7883P27 = qj3.m7883P(parcel);
/* 85 */                    Feature[] featureArr = null;
/* 86 */                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
/* 91 */                    while (parcel.dataPosition() < iM7883P27) {
/* 93 */                        int i25 = parcel.readInt();
/* 97 */                        char c17 = (char) i25;
/* 98 */                        if (c17 == 1) {
/* 133 */                           bundleM7895f = qj3.m7895f(i25, parcel);
                                } else if (c17 == 2) {
/* 130 */                           featureArr = (Feature[]) qj3.m7902m(parcel, i25, Feature.CREATOR);
                                } else if (c17 == 3) {
/* 119 */                           iM7871D2 = qj3.m7871D(i25, parcel);
                                } else if (c17 != 4) {
/* 106 */                           qj3.m7878K(i25, parcel);
                                } else {
/* 116 */                           connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) qj3.m7898i(parcel, i25, ConnectionTelemetryConfiguration.CREATOR);
                                }
                            }
/* 138 */                   qj3.m7908s(iM7883P27, parcel);
/* 143 */                   zzj zzjVar = new zzj();
/* 146 */                   zzjVar.f3543a = bundleM7895f;
/* 148 */                   zzjVar.f3544b = featureArr;
/* 150 */                   zzjVar.f3545c = iM7871D2;
/* 152 */                   zzjVar.f3546d = connectionTelemetryConfiguration;
/* 154 */                   return zzjVar;
                        default:
/* 19 */                    int iM7883P28 = qj3.m7883P(parcel);
/* 24 */                    long jM7873F3 = 0;
/* 25 */                    long jM7873F4 = 0;
/* 26 */                    int iM7871D17 = -1;
/* 28 */                    String strM7899j30 = null;
/* 33 */                    while (parcel.dataPosition() < iM7883P28) {
/* 35 */                        int i26 = parcel.readInt();
/* 39 */                        char c18 = (char) i26;
/* 40 */                        if (c18 == 2) {
/* 67 */                            strM7899j30 = qj3.m7899j(i26, parcel);
                                } else if (c18 == 3) {
/* 62 */                            jM7873F3 = qj3.m7873F(i26, parcel);
                                } else if (c18 == 4) {
/* 57 */                            jM7873F4 = qj3.m7873F(i26, parcel);
                                } else if (c18 != 5) {
/* 48 */                            qj3.m7878K(i26, parcel);
                                } else {
/* 52 */                            iM7871D17 = qj3.m7871D(i26, parcel);
                                }
                            }
/* 72 */                    qj3.m7908s(iM7883P28, parcel);
/* 77 */                    return new DriveId(strM7899j30, jM7873F3, jM7873F4, iM7871D17);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
                    switch (this.f17083a) {
                        case 0:
/* 93 */                    return new AuthenticationExtensions[i];
                        case 1:
/* 90 */                    return new ErrorResponseData[i];
                        case 2:
/* 87 */                    return new ScreenshotEntity[i];
                        case 3:
/* 84 */                    return new ProfileSettingsEntity[i];
                        case 4:
/* 81 */                    return new Status[i];
                        case 5:
/* 78 */                    return new zzd[i];
                        case 6:
/* 75 */                    return new KeyHandle[i];
                        case 7:
/* 72 */                    return new GameEntity[i];
                        case 8:
/* 69 */                    return new StockProfileImageEntity[i];
                        case 9:
/* 66 */                    return new InitRequest[i];
                        case 10:
/* 63 */                    return new zze[i];
                        case 11:
/* 60 */                    return new com.google.android.gms.fido.fido2.api.common.zze[i];
                        case 12:
/* 57 */                    return new ProtocolVersion[i];
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 54 */                    return new InitResult[i];
                        case 14:
/* 51 */                    return new CompletionEvent[i];
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 48 */                    return new zzf[i];
                        case 16:
/* 45 */                    return new AuthenticatorAssertionResponse[i];
                        case 17:
/* 42 */                    return new RegisterRequest[i];
                        case 18:
/* 39 */                    return new BinderWrapper[i];
                        case 19:
/* 36 */                    return new FilterHolder[i];
                        case 20:
/* 33 */                    return new AuthenticatorAttestationResponse[i];
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 30 */                    return new RegisterRequestParams[i];
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 27 */                    return new zzh[i];
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 24 */                    return new AuthenticatorErrorResponse[i];
                        case 24:
/* 21 */                    return new RegisterResponseData[i];
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 18 */                    return new MetadataBundle[i];
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 15 */                    return new AuthenticatorSelectionCriteria[i];
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 12 */                    return new RegisteredKey[i];
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 9 */                     return new zzj[i];
                        default:
/* 6 */                     return new DriveId[i];
                    }
                }
            }
