            package p000;

            import android.app.PendingIntent;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.auth.AccountChangeEvent;
            import com.google.android.gms.auth.api.proxy.ProxyRequest;
            import com.google.android.gms.cloudmessaging.CloudMessage;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.DowngradeableSafeParcel;
            import com.google.android.gms.common.internal.RootTelemetryConfiguration;
            import com.google.android.gms.common.stats.WakeLockEvent;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
            import com.google.android.gms.drive.metadata.internal.zzc;
            import com.google.android.gms.drive.query.internal.zzz;
            import com.google.android.gms.fido.common.Transport;
            import com.google.android.gms.fido.fido2.api.common.Attachment;
            import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
            import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
            import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
            import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
            import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
            import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
            import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
            import com.google.android.gms.fido.fido2.api.common.TokenBinding;
            import com.google.android.gms.fido.fido2.api.common.zzaa;
            import com.google.android.gms.fido.fido2.api.common.zzad;
            import com.google.android.gms.fido.sourcedevice.SourceDirectTransferResult;
            import com.google.android.gms.games.GameEntity;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.achievement.AchievementEntity;
            import com.google.android.gms.games.event.EventEntity;
            import com.google.android.gms.games.internal.experience.ExperienceEventEntity;
            import com.google.android.gms.games.multiplayer.ParticipantEntity;
            import com.google.android.gms.games.multiplayer.realtime.zzb;
            import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
            import com.google.android.gms.games.stats.PlayerStatsEntity;
            import com.google.android.gms.games.video.VideoCapabilities;
            import com.google.android.gms.location.places.PlaceReport;
            import com.google.android.gms.measurement.internal.zzaf;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzpk;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tc3 implements Parcelable.Creator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17044a;

                public /* synthetic */ tc3(int i) {
/* 1 */             this.f17044a = i;
                }

                /* JADX INFO: renamed from: a */
                public static void m8780a(PlayerStatsEntity playerStatsEntity, Parcel parcel) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             float f = playerStatsEntity.f4067a;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeFloat(f);
/* 17 */            float f2 = playerStatsEntity.f4068b;
/* 20 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeFloat(f2);
/* 26 */            int i = playerStatsEntity.f4069c;
/* 29 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(i);
/* 35 */            int i2 = playerStatsEntity.f4070d;
/* 37 */            w11.m9420b0(parcel, 4, 4);
/* 40 */            parcel.writeInt(i2);
/* 43 */            int i3 = playerStatsEntity.f4071e;
/* 46 */            w11.m9420b0(parcel, 5, 4);
/* 49 */            parcel.writeInt(i3);
/* 52 */            float f3 = playerStatsEntity.f4072f;
/* 55 */            w11.m9420b0(parcel, 6, 4);
/* 58 */            parcel.writeFloat(f3);
/* 61 */            float f4 = playerStatsEntity.f4073i;
/* 64 */            w11.m9420b0(parcel, 7, 4);
/* 67 */            parcel.writeFloat(f4);
/* 75 */            w11.m9402L(parcel, 8, playerStatsEntity.f4074v, false);
/* 78 */            float f5 = playerStatsEntity.f4075w;
/* 82 */            w11.m9420b0(parcel, 9, 4);
/* 85 */            parcel.writeFloat(f5);
/* 88 */            float f6 = playerStatsEntity.f4065U;
/* 92 */            w11.m9420b0(parcel, 10, 4);
/* 95 */            parcel.writeFloat(f6);
/* 98 */            float f7 = playerStatsEntity.f4066V;
/* 102 */           w11.m9420b0(parcel, 11, 4);
/* 105 */           parcel.writeFloat(f7);
/* 108 */           w11.m9428f0(iM9422c0, parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 15 */            boolean zM7914y = false;
/* 15 */            boolean zM7914y2 = false;
/* 15 */            int iM7871D = 0;
/* 15 */            int iM7871D2 = 0;
/* 16 */            ArrayList arrayListM7903n = null;
/* 16 */            String strM7899j = null;
/* 16 */            String strM7899j2 = null;
/* 16 */            String strM7899j3 = null;
/* 16 */            Intent intent = null;
/* 16 */            String strM7899j4 = null;
/* 16 */            Contents contents = null;
/* 16 */            Status status = null;
                    switch (this.f17044a) {
                        case 0:
/* 2186 */                  int iM7883P = qj3.m7883P(parcel);
/* 2194 */                  while (parcel.dataPosition() < iM7883P) {
/* 2196 */                      int i = parcel.readInt();
/* 2201 */                      if (((char) i) != 2) {
/* 2203 */                          qj3.m7878K(i, parcel);
                                } else {
/* 2209 */                          arrayListM7903n = qj3.m7903n(parcel, i, zzc.CREATOR);
                                }
                            }
/* 2214 */                  qj3.m7908s(iM7883P, parcel);
/* 2219 */                  return new AppVisibleCustomProperties(arrayListM7903n);
                        case 1:
/* 2141 */                  String string = parcel.readString();
                            try {
/* 2150 */                      for (Transport transport : Transport.values()) {
/* 2160 */                          if (string.equals(transport.f3743a)) {
/* 2162 */                              return transport;
                                    }
                                }
/* 2180 */                      throw new tr2(fm0.m3784j("Transport ", string, " not supported"));
                            } catch (tr2 e) {
/* 2182 */                      ds0.m3199p(e);
/* 16 */                        return null;
                            }
                        case 2:
                            try {
/* 2131 */                      return Attachment.m2052a(parcel.readString());
                            } catch (C2494yd e2) {
/* 2137 */                      ds0.m3199p(e2);
/* 16 */                        return null;
                            }
                        case 3:
/* 2080 */                  int iM7883P2 = qj3.m7883P(parcel);
/* 2088 */                  while (parcel.dataPosition() < iM7883P2) {
/* 2090 */                      int i2 = parcel.readInt();
/* 2094 */                      char c = (char) i2;
/* 2095 */                      if (c == 1) {
/* 2115 */                          status = (Status) qj3.m7898i(parcel, i2, Status.CREATOR);
                                } else if (c != 2) {
/* 2099 */                          qj3.m7878K(i2, parcel);
                                } else {
/* 2103 */                          iM7871D2 = qj3.m7871D(i2, parcel);
                                }
                            }
/* 2118 */                  qj3.m7908s(iM7883P2, parcel);
/* 2123 */                  return new SourceDirectTransferResult(status, iM7871D2);
                        case 4:
/* 1875 */                  int iM7883P3 = qj3.m7883P(parcel);
/* 1881 */                  float fM7869B = -1.0f;
/* 1883 */                  long jM7873F = 0;
/* 1885 */                  long jM7873F2 = 0;
/* 1887 */                  int iM7871D3 = 0;
/* 1888 */                  int iM7871D4 = 0;
/* 1890 */                  int iM7871D5 = 0;
/* 1892 */                  int iM7871D6 = 0;
/* 1894 */                  String strM7899j5 = null;
/* 1895 */                  String strM7899j6 = null;
/* 1896 */                  String strM7899j7 = null;
/* 1898 */                  Uri uri = null;
/* 1900 */                  String strM7899j8 = null;
/* 1902 */                  Uri uri2 = null;
/* 1904 */                  String strM7899j9 = null;
/* 1906 */                  String strM7899j10 = null;
/* 1908 */                  PlayerEntity playerEntity = null;
/* 1910 */                  String strM7899j11 = null;
/* 1912 */                  String strM7899j12 = null;
/* 1918 */                  while (parcel.dataPosition() < iM7883P3) {
/* 1920 */                      int i3 = parcel.readInt();
                                switch ((char) i3) {
                                    case 1:
/* 2064 */                              strM7899j5 = qj3.m7899j(i3, parcel);
                                        break;
                                    case 2:
/* 2057 */                              iM7871D3 = qj3.m7871D(i3, parcel);
                                        break;
                                    case 3:
/* 2050 */                              strM7899j6 = qj3.m7899j(i3, parcel);
                                        break;
                                    case 4:
/* 2042 */                              strM7899j7 = qj3.m7899j(i3, parcel);
                                        break;
                                    case 5:
/* 2037 */                              uri = (Uri) qj3.m7898i(parcel, i3, Uri.CREATOR);
                                        break;
                                    case 6:
/* 2024 */                              strM7899j8 = qj3.m7899j(i3, parcel);
                                        break;
                                    case 7:
/* 2019 */                              uri2 = (Uri) qj3.m7898i(parcel, i3, Uri.CREATOR);
                                        break;
                                    case '\b':
/* 2006 */                              strM7899j9 = qj3.m7899j(i3, parcel);
                                        break;
                                    case '\t':
/* 1999 */                              iM7871D4 = qj3.m7871D(i3, parcel);
                                        break;
                                    case '\n':
/* 1992 */                              strM7899j10 = qj3.m7899j(i3, parcel);
                                        break;
                                    case 11:
/* 1987 */                              playerEntity = (PlayerEntity) qj3.m7898i(parcel, i3, PlayerEntity.CREATOR);
                                        break;
                                    case '\f':
/* 1974 */                              iM7871D5 = qj3.m7871D(i3, parcel);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1967 */                              iM7871D6 = qj3.m7871D(i3, parcel);
                                        break;
                                    case 14:
/* 1960 */                              strM7899j11 = qj3.m7899j(i3, parcel);
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1953 */                              jM7873F = qj3.m7873F(i3, parcel);
                                        break;
                                    case 16:
/* 1946 */                              jM7873F2 = qj3.m7873F(i3, parcel);
                                        break;
                                    case 17:
/* 1939 */                              fM7869B = qj3.m7869B(i3, parcel);
                                        break;
                                    case 18:
/* 1932 */                              strM7899j12 = qj3.m7899j(i3, parcel);
                                        break;
                                    default:
/* 1928 */                              qj3.m7878K(i3, parcel);
                                        break;
                                }
                            }
/* 2071 */                  qj3.m7908s(iM7883P3, parcel);
/* 2076 */                  return new AchievementEntity(strM7899j5, iM7871D3, strM7899j6, strM7899j7, uri, strM7899j8, uri2, strM7899j9, iM7871D4, strM7899j10, playerEntity, iM7871D5, iM7871D6, strM7899j11, jM7873F, jM7873F2, fM7869B, strM7899j12);
                        case 5:
/* 1761 */                  int iM7883P4 = qj3.m7883P(parcel);
/* 1765 */                  long jM7873F3 = 0;
/* 1767 */                  boolean zM7914y3 = false;
/* 1769 */                  String strM7899j13 = null;
/* 1770 */                  String strM7899j14 = null;
/* 1771 */                  String strM7899j15 = null;
/* 1772 */                  Uri uri3 = null;
/* 1774 */                  String strM7899j16 = null;
/* 1776 */                  PlayerEntity playerEntity2 = null;
/* 1778 */                  String strM7899j17 = null;
/* 1784 */                  while (parcel.dataPosition() < iM7883P4) {
/* 1786 */                      int i4 = parcel.readInt();
                                switch ((char) i4) {
                                    case 1:
/* 1860 */                              strM7899j13 = qj3.m7899j(i4, parcel);
                                        break;
                                    case 2:
/* 1854 */                              strM7899j14 = qj3.m7899j(i4, parcel);
                                        break;
                                    case 3:
/* 1848 */                              strM7899j15 = qj3.m7899j(i4, parcel);
                                        break;
                                    case 4:
/* 1843 */                              uri3 = (Uri) qj3.m7898i(parcel, i4, Uri.CREATOR);
                                        break;
                                    case 5:
/* 1830 */                              strM7899j16 = qj3.m7899j(i4, parcel);
                                        break;
                                    case 6:
/* 1825 */                              playerEntity2 = (PlayerEntity) qj3.m7898i(parcel, i4, PlayerEntity.CREATOR);
                                        break;
                                    case 7:
/* 1812 */                              jM7873F3 = qj3.m7873F(i4, parcel);
                                        break;
                                    case '\b':
/* 1805 */                              strM7899j17 = qj3.m7899j(i4, parcel);
                                        break;
                                    case '\t':
/* 1798 */                              zM7914y3 = qj3.m7914y(i4, parcel);
                                        break;
                                    default:
/* 1794 */                              qj3.m7878K(i4, parcel);
                                        break;
                                }
                            }
/* 1866 */                  qj3.m7908s(iM7883P4, parcel);
/* 1871 */                  return new EventEntity(strM7899j13, strM7899j14, strM7899j15, uri3, strM7899j16, playerEntity2, jM7873F3, strM7899j17, zM7914y3);
                        case 6:
/* 1629 */                  int iM7883P5 = qj3.m7883P(parcel);
/* 1633 */                  long jM7873F4 = 0;
/* 1635 */                  long jM7873F5 = 0;
/* 1637 */                  long jM7873F6 = 0;
/* 1639 */                  int iM7871D7 = 0;
/* 1641 */                  int iM7871D8 = 0;
/* 1643 */                  String strM7899j18 = null;
/* 1644 */                  GameEntity gameEntity = null;
/* 1645 */                  String strM7899j19 = null;
/* 1646 */                  String strM7899j20 = null;
/* 1648 */                  String strM7899j21 = null;
/* 1650 */                  Uri uri4 = null;
/* 1656 */                  while (parcel.dataPosition() < iM7883P5) {
/* 1658 */                      int i5 = parcel.readInt();
                                switch ((char) i5) {
                                    case 1:
/* 1746 */                              strM7899j18 = qj3.m7899j(i5, parcel);
                                        break;
                                    case 2:
/* 1742 */                              gameEntity = (GameEntity) qj3.m7898i(parcel, i5, GameEntity.CREATOR);
                                        break;
                                    case 3:
/* 1730 */                              strM7899j19 = qj3.m7899j(i5, parcel);
                                        break;
                                    case 4:
/* 1723 */                              strM7899j20 = qj3.m7899j(i5, parcel);
                                        break;
                                    case 5:
/* 1716 */                              strM7899j21 = qj3.m7899j(i5, parcel);
                                        break;
                                    case 6:
/* 1711 */                              uri4 = (Uri) qj3.m7898i(parcel, i5, Uri.CREATOR);
                                        break;
                                    case 7:
/* 1698 */                              jM7873F4 = qj3.m7873F(i5, parcel);
                                        break;
                                    case '\b':
/* 1691 */                              jM7873F5 = qj3.m7873F(i5, parcel);
                                        break;
                                    case '\t':
/* 1684 */                              jM7873F6 = qj3.m7873F(i5, parcel);
                                        break;
                                    case '\n':
/* 1677 */                              iM7871D7 = qj3.m7871D(i5, parcel);
                                        break;
                                    case 11:
/* 1670 */                              iM7871D8 = qj3.m7871D(i5, parcel);
                                        break;
                                    default:
/* 1666 */                              qj3.m7878K(i5, parcel);
                                        break;
                                }
                            }
/* 1752 */                  qj3.m7908s(iM7883P5, parcel);
/* 1757 */                  return new ExperienceEventEntity(strM7899j18, gameEntity, strM7899j19, strM7899j20, strM7899j21, uri4, jM7873F4, jM7873F5, jM7873F6, iM7871D7, iM7871D8);
                        case 7:
/* 1596 */                  DowngradeableSafeParcel.m2019E1();
/* 1599 */                  DowngradeableSafeParcel.m2018D1();
/* 1602 */                  int iM7883P6 = qj3.m7883P(parcel);
/* 1610 */                  while (parcel.dataPosition() < iM7883P6) {
/* 1616 */                      qj3.m7878K(parcel.readInt(), parcel);
                            }
/* 1620 */                  qj3.m7908s(iM7883P6, parcel);
/* 1625 */                  return new ParticipantEntity();
                        case 8:
/* 1592 */                  return new zzb();
                        case 9:
/* 1550 */                  int iM7883P7 = qj3.m7883P(parcel);
/* 1558 */                  while (parcel.dataPosition() < iM7883P7) {
/* 1560 */                      int i6 = parcel.readInt();
/* 1565 */                      if (((char) i6) != 1) {
/* 1567 */                          qj3.m7878K(i6, parcel);
                                } else {
/* 1578 */                          contents = (Contents) qj3.m7898i(parcel, i6, Contents.CREATOR);
                                }
                            }
/* 1581 */                  qj3.m7908s(iM7883P7, parcel);
/* 1586 */                  return new SnapshotContentsEntity(contents);
                        case 10:
/* 1426 */                  int iM7883P8 = qj3.m7883P(parcel);
/* 1430 */                  float fM7869B2 = 0.0f;
/* 1431 */                  float fM7869B3 = 0.0f;
/* 1432 */                  float fM7869B4 = 0.0f;
/* 1434 */                  float fM7869B5 = 0.0f;
/* 1436 */                  float fM7869B6 = 0.0f;
/* 1438 */                  float fM7869B7 = 0.0f;
/* 1440 */                  float fM7869B8 = 0.0f;
/* 1442 */                  int iM7871D9 = 0;
/* 1443 */                  int iM7871D10 = 0;
/* 1445 */                  int iM7871D11 = 0;
/* 1447 */                  Bundle bundleM7895f = null;
/* 1453 */                  while (parcel.dataPosition() < iM7883P8) {
/* 1455 */                      int i7 = parcel.readInt();
                                switch ((char) i7) {
                                    case 1:
/* 1535 */                              fM7869B2 = qj3.m7869B(i7, parcel);
                                        break;
                                    case 2:
/* 1529 */                              fM7869B3 = qj3.m7869B(i7, parcel);
                                        break;
                                    case 3:
/* 1523 */                              iM7871D9 = qj3.m7871D(i7, parcel);
                                        break;
                                    case 4:
/* 1516 */                              iM7871D10 = qj3.m7871D(i7, parcel);
                                        break;
                                    case 5:
/* 1509 */                              iM7871D11 = qj3.m7871D(i7, parcel);
                                        break;
                                    case 6:
/* 1502 */                              fM7869B4 = qj3.m7869B(i7, parcel);
                                        break;
                                    case 7:
/* 1495 */                              fM7869B5 = qj3.m7869B(i7, parcel);
                                        break;
                                    case '\b':
/* 1488 */                              bundleM7895f = qj3.m7895f(i7, parcel);
                                        break;
                                    case '\t':
/* 1481 */                              fM7869B6 = qj3.m7869B(i7, parcel);
                                        break;
                                    case '\n':
/* 1474 */                              fM7869B7 = qj3.m7869B(i7, parcel);
                                        break;
                                    case 11:
/* 1467 */                              fM7869B8 = qj3.m7869B(i7, parcel);
                                        break;
                                    default:
/* 1463 */                              qj3.m7878K(i7, parcel);
                                        break;
                                }
                            }
/* 1541 */                  qj3.m7908s(iM7883P8, parcel);
/* 1546 */                  return new PlayerStatsEntity(fM7869B2, fM7869B3, iM7871D9, iM7871D10, iM7871D11, fM7869B4, fM7869B5, bundleM7895f, fM7869B6, fM7869B7, fM7869B8);
                        case 11:
/* 1349 */                  int iM7883P9 = qj3.m7883P(parcel);
/* 1353 */                  boolean zM7914y4 = false;
/* 1354 */                  boolean zM7914y5 = false;
/* 1355 */                  boolean zM7914y6 = false;
/* 1356 */                  boolean[] zArrM7894e = null;
/* 1358 */                  boolean[] zArrM7894e2 = null;
/* 1364 */                  while (parcel.dataPosition() < iM7883P9) {
/* 1366 */                      int i8 = parcel.readInt();
/* 1370 */                      char c2 = (char) i8;
/* 1371 */                      if (c2 == 1) {
/* 1411 */                          zM7914y4 = qj3.m7914y(i8, parcel);
                                } else if (c2 == 2) {
/* 1405 */                          zM7914y5 = qj3.m7914y(i8, parcel);
                                } else if (c2 == 3) {
/* 1399 */                          zM7914y6 = qj3.m7914y(i8, parcel);
                                } else if (c2 == 4) {
/* 1392 */                          zArrM7894e = qj3.m7894e(i8, parcel);
                                } else if (c2 != 5) {
/* 1381 */                          qj3.m7878K(i8, parcel);
                                } else {
/* 1385 */                          zArrM7894e2 = qj3.m7894e(i8, parcel);
                                }
                            }
/* 1417 */                  qj3.m7908s(iM7883P9, parcel);
/* 1422 */                  return new VideoCapabilities(zM7914y4, zM7914y5, zM7914y6, zArrM7894e, zArrM7894e2);
                        case 12:
/* 1291 */                  int iM7883P10 = qj3.m7883P(parcel);
/* 1295 */                  String strM7899j22 = null;
/* 1296 */                  String strM7899j23 = null;
/* 1301 */                  while (parcel.dataPosition() < iM7883P10) {
/* 1303 */                      int i9 = parcel.readInt();
/* 1307 */                      char c3 = (char) i9;
/* 1308 */                      if (c3 == 1) {
/* 1335 */                          iM7871D = qj3.m7871D(i9, parcel);
                                } else if (c3 == 2) {
/* 1330 */                          strM7899j4 = qj3.m7899j(i9, parcel);
                                } else if (c3 == 3) {
/* 1325 */                          strM7899j22 = qj3.m7899j(i9, parcel);
                                } else if (c3 != 4) {
/* 1316 */                          qj3.m7878K(i9, parcel);
                                } else {
/* 1320 */                          strM7899j23 = qj3.m7899j(i9, parcel);
                                }
                            }
/* 1340 */                  qj3.m7908s(iM7883P10, parcel);
/* 1345 */                  return new PlaceReport(iM7871D, strM7899j4, strM7899j22, strM7899j23);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1201 */                  int iM7883P11 = qj3.m7883P(parcel);
/* 1205 */                  long jM7873F7 = 0;
/* 1207 */                  int iM7871D12 = 0;
/* 1208 */                  int iM7871D13 = 0;
/* 1209 */                  String strM7899j24 = null;
/* 1210 */                  byte[] bArrM7896g = null;
/* 1212 */                  Bundle bundleM7895f2 = null;
/* 1218 */                  while (parcel.dataPosition() < iM7883P11) {
/* 1220 */                      int i10 = parcel.readInt();
/* 1224 */                      char c4 = (char) i10;
/* 1225 */                      if (c4 == 1) {
/* 1276 */                          strM7899j24 = qj3.m7899j(i10, parcel);
                                } else if (c4 == 2) {
/* 1270 */                          iM7871D13 = qj3.m7871D(i10, parcel);
                                } else if (c4 == 3) {
/* 1263 */                          jM7873F7 = qj3.m7873F(i10, parcel);
                                } else if (c4 == 4) {
/* 1256 */                          bArrM7896g = qj3.m7896g(i10, parcel);
                                } else if (c4 == 5) {
/* 1249 */                          bundleM7895f2 = qj3.m7895f(i10, parcel);
                                } else if (c4 != 1000) {
/* 1239 */                          qj3.m7878K(i10, parcel);
                                } else {
/* 1243 */                          iM7871D12 = qj3.m7871D(i10, parcel);
                                }
                            }
/* 1282 */                  qj3.m7908s(iM7883P11, parcel);
/* 1287 */                  return new ProxyRequest(iM7871D12, strM7899j24, iM7871D13, jM7873F7, bArrM7896g, bundleM7895f2);
                        case 14:
/* 1161 */                  int iM7883P12 = qj3.m7883P(parcel);
/* 1169 */                  while (parcel.dataPosition() < iM7883P12) {
/* 1171 */                      int i11 = parcel.readInt();
/* 1176 */                      if (((char) i11) != 1) {
/* 1178 */                          qj3.m7878K(i11, parcel);
                                } else {
/* 1189 */                          intent = (Intent) qj3.m7898i(parcel, i11, Intent.CREATOR);
                                }
                            }
/* 1192 */                  qj3.m7908s(iM7883P12, parcel);
/* 1197 */                  return new CloudMessage(intent);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1086 */                  int iM7883P13 = qj3.m7883P(parcel);
/* 1090 */                  int iM7871D14 = 0;
/* 1091 */                  int iM7871D15 = 0;
/* 1092 */                  PendingIntent pendingIntent = null;
/* 1093 */                  String strM7899j25 = null;
/* 1095 */                  Integer numM7872E = null;
/* 1101 */                  while (parcel.dataPosition() < iM7883P13) {
/* 1103 */                      int i12 = parcel.readInt();
/* 1107 */                      char c5 = (char) i12;
/* 1108 */                      if (c5 == 1) {
/* 1147 */                          iM7871D14 = qj3.m7871D(i12, parcel);
                                } else if (c5 == 2) {
/* 1142 */                          iM7871D15 = qj3.m7871D(i12, parcel);
                                } else if (c5 == 3) {
/* 1139 */                          pendingIntent = (PendingIntent) qj3.m7898i(parcel, i12, PendingIntent.CREATOR);
                                } else if (c5 == 4) {
/* 1127 */                          strM7899j25 = qj3.m7899j(i12, parcel);
                                } else if (c5 != 5) {
/* 1118 */                          qj3.m7878K(i12, parcel);
                                } else {
/* 1122 */                          numM7872E = qj3.m7872E(i12, parcel);
                                }
                            }
/* 1152 */                  qj3.m7908s(iM7883P13, parcel);
/* 1157 */                  return new ConnectionResult(iM7871D14, iM7871D15, pendingIntent, strM7899j25, numM7872E);
                        case 16:
/* 924 */                   int iM7883P14 = qj3.m7883P(parcel);
/* 928 */                   float fM7869B9 = 0.0f;
/* 930 */                   long jM7873F8 = 0;
/* 931 */                   long jM7873F9 = 0;
/* 933 */                   long jM7873F10 = 0;
/* 935 */                   int iM7871D16 = 0;
/* 936 */                   int iM7871D17 = 0;
/* 938 */                   int iM7871D18 = 0;
/* 940 */                   int iM7871D19 = 0;
/* 942 */                   boolean zM7914y7 = false;
/* 944 */                   String strM7899j26 = null;
/* 946 */                   ArrayList arrayListM7901l = null;
/* 948 */                   String strM7899j27 = null;
/* 950 */                   String strM7899j28 = null;
/* 952 */                   String strM7899j29 = null;
/* 954 */                   String strM7899j30 = null;
/* 960 */                   while (parcel.dataPosition() < iM7883P14) {
/* 962 */                       int i13 = parcel.readInt();
                                switch ((char) i13) {
                                    case 1:
/* 1071 */                              iM7871D16 = qj3.m7871D(i13, parcel);
                                        break;
                                    case 2:
/* 1065 */                              jM7873F8 = qj3.m7873F(i13, parcel);
                                        break;
                                    case 3:
                                    case 7:
                                    case '\t':
                                    default:
/* 970 */                               qj3.m7878K(i13, parcel);
                                        break;
                                    case 4:
/* 1058 */                              strM7899j26 = qj3.m7899j(i13, parcel);
                                        break;
                                    case 5:
/* 1051 */                              iM7871D18 = qj3.m7871D(i13, parcel);
                                        break;
                                    case 6:
/* 1044 */                              arrayListM7901l = qj3.m7901l(i13, parcel);
                                        break;
                                    case '\b':
/* 1037 */                              jM7873F9 = qj3.m7873F(i13, parcel);
                                        break;
                                    case '\n':
/* 1030 */                              strM7899j28 = qj3.m7899j(i13, parcel);
                                        break;
                                    case 11:
/* 1023 */                              iM7871D17 = qj3.m7871D(i13, parcel);
                                        break;
                                    case '\f':
/* 1016 */                              strM7899j27 = qj3.m7899j(i13, parcel);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1009 */                              strM7899j29 = qj3.m7899j(i13, parcel);
                                        break;
                                    case 14:
/* 1002 */                              iM7871D19 = qj3.m7871D(i13, parcel);
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 995 */                               fM7869B9 = qj3.m7869B(i13, parcel);
                                        break;
                                    case 16:
/* 988 */                               jM7873F10 = qj3.m7873F(i13, parcel);
                                        break;
                                    case 17:
/* 981 */                               strM7899j30 = qj3.m7899j(i13, parcel);
                                        break;
                                    case 18:
/* 974 */                               zM7914y7 = qj3.m7914y(i13, parcel);
                                        break;
                                }
                            }
/* 1077 */                  qj3.m7908s(iM7883P14, parcel);
/* 1082 */                  return new WakeLockEvent(iM7871D16, jM7873F8, iM7871D17, strM7899j26, iM7871D18, arrayListM7901l, strM7899j27, jM7873F9, iM7871D19, strM7899j28, strM7899j29, fM7869B9, jM7873F10, strM7899j30, zM7914y7);
                        case 17:
/* 843 */                   int iM7883P15 = qj3.m7883P(parcel);
/* 847 */                   long jM7873F11 = 0;
/* 848 */                   int iM7871D20 = 0;
/* 849 */                   int iM7871D21 = 0;
/* 851 */                   int iM7871D22 = 0;
/* 853 */                   String strM7899j31 = null;
/* 855 */                   String strM7899j32 = null;
/* 861 */                   while (parcel.dataPosition() < iM7883P15) {
/* 863 */                       int i14 = parcel.readInt();
                                switch ((char) i14) {
                                    case 1:
/* 909 */                               iM7871D20 = qj3.m7871D(i14, parcel);
                                        break;
                                    case 2:
/* 903 */                               jM7873F11 = qj3.m7873F(i14, parcel);
                                        break;
                                    case 3:
/* 896 */                               strM7899j31 = qj3.m7899j(i14, parcel);
                                        break;
                                    case 4:
/* 889 */                               iM7871D21 = qj3.m7871D(i14, parcel);
                                        break;
                                    case 5:
/* 882 */                               iM7871D22 = qj3.m7871D(i14, parcel);
                                        break;
                                    case 6:
/* 875 */                               strM7899j32 = qj3.m7899j(i14, parcel);
                                        break;
                                    default:
/* 871 */                               qj3.m7878K(i14, parcel);
                                        break;
                                }
                            }
/* 915 */                   qj3.m7908s(iM7883P15, parcel);
/* 920 */                   return new AccountChangeEvent(iM7871D20, jM7873F11, strM7899j31, iM7871D21, iM7871D22, strM7899j32);
                        case 18:
/* 816 */                   int iM7883P16 = qj3.m7883P(parcel);
/* 824 */                   while (parcel.dataPosition() < iM7883P16) {
/* 830 */                       qj3.m7878K(parcel.readInt(), parcel);
                            }
/* 834 */                   qj3.m7908s(iM7883P16, parcel);
/* 839 */                   return new zzz();
                        case 19:
/* 781 */                   int iM7883P17 = qj3.m7883P(parcel);
/* 789 */                   while (parcel.dataPosition() < iM7883P17) {
/* 791 */                       int i15 = parcel.readInt();
/* 796 */                       if (((char) i15) != 1) {
/* 798 */                           qj3.m7878K(i15, parcel);
                                } else {
/* 802 */                           zM7914y2 = qj3.m7914y(i15, parcel);
                                }
                            }
/* 807 */                   qj3.m7908s(iM7883P17, parcel);
/* 812 */                   return new zzaa(zM7914y2);
                        case 20:
/* 746 */                   int iM7883P18 = qj3.m7883P(parcel);
/* 754 */                   while (parcel.dataPosition() < iM7883P18) {
/* 756 */                       int i16 = parcel.readInt();
/* 761 */                       if (((char) i16) != 1) {
/* 763 */                           qj3.m7878K(i16, parcel);
                                } else {
/* 767 */                           zM7914y = qj3.m7914y(i16, parcel);
                                }
                            }
/* 772 */                   qj3.m7908s(iM7883P18, parcel);
/* 777 */                   return new GoogleThirdPartyPaymentExtension(zM7914y);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 711 */                   int iM7883P19 = qj3.m7883P(parcel);
/* 719 */                   while (parcel.dataPosition() < iM7883P19) {
/* 721 */                       int i17 = parcel.readInt();
/* 726 */                       if (((char) i17) != 1) {
/* 728 */                           qj3.m7878K(i17, parcel);
                                } else {
/* 732 */                           strM7899j3 = qj3.m7899j(i17, parcel);
                                }
                            }
/* 737 */                   qj3.m7908s(iM7883P19, parcel);
/* 742 */                   return new zzad(strM7899j3);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 574 */                   int iM7883P20 = qj3.m7883P(parcel);
/* 578 */                   PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
/* 579 */                   PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
/* 580 */                   byte[] bArrM7896g2 = null;
/* 581 */                   ArrayList arrayListM7903n2 = null;
/* 583 */                   Double dM7868A = null;
/* 585 */                   ArrayList arrayListM7903n3 = null;
/* 587 */                   AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
/* 589 */                   Integer numM7872E2 = null;
/* 591 */                   TokenBinding tokenBinding = null;
/* 593 */                   String strM7899j33 = null;
/* 595 */                   AuthenticationExtensions authenticationExtensions = null;
/* 601 */                   while (parcel.dataPosition() < iM7883P20) {
/* 603 */                       int i18 = parcel.readInt();
                                switch ((char) i18) {
                                    case 2:
/* 699 */                               publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) qj3.m7898i(parcel, i18, PublicKeyCredentialRpEntity.CREATOR);
                                        break;
                                    case 3:
/* 689 */                               publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) qj3.m7898i(parcel, i18, PublicKeyCredentialUserEntity.CREATOR);
                                        break;
                                    case 4:
/* 677 */                               bArrM7896g2 = qj3.m7896g(i18, parcel);
                                        break;
                                    case 5:
/* 672 */                               arrayListM7903n2 = qj3.m7903n(parcel, i18, PublicKeyCredentialParameters.CREATOR);
                                        break;
                                    case 6:
/* 665 */                               dM7868A = qj3.m7868A(i18, parcel);
                                        break;
                                    case 7:
/* 660 */                               arrayListM7903n3 = qj3.m7903n(parcel, i18, PublicKeyCredentialDescriptor.CREATOR);
                                        break;
                                    case '\b':
/* 655 */                               authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) qj3.m7898i(parcel, i18, AuthenticatorSelectionCriteria.CREATOR);
                                        break;
                                    case '\t':
/* 642 */                               numM7872E2 = qj3.m7872E(i18, parcel);
                                        break;
                                    case '\n':
/* 639 */                               tokenBinding = (TokenBinding) qj3.m7898i(parcel, i18, TokenBinding.CREATOR);
                                        break;
                                    case 11:
/* 626 */                               strM7899j33 = qj3.m7899j(i18, parcel);
                                        break;
                                    case '\f':
/* 623 */                               authenticationExtensions = (AuthenticationExtensions) qj3.m7898i(parcel, i18, AuthenticationExtensions.CREATOR);
                                        break;
                                    default:
/* 611 */                               qj3.m7878K(i18, parcel);
                                        break;
                                }
                            }
/* 702 */                   qj3.m7908s(iM7883P20, parcel);
/* 707 */                   return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrM7896g2, arrayListM7903n2, dM7868A, arrayListM7903n3, authenticatorSelectionCriteria, numM7872E2, tokenBinding, strM7899j33, authenticationExtensions);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 505 */                   int iM7883P21 = qj3.m7883P(parcel);
/* 509 */                   int iM7871D23 = 0;
/* 510 */                   boolean zM7914y8 = false;
/* 511 */                   boolean zM7914y9 = false;
/* 512 */                   int iM7871D24 = 0;
/* 513 */                   int iM7871D25 = 0;
/* 519 */                   while (parcel.dataPosition() < iM7883P21) {
/* 521 */                       int i19 = parcel.readInt();
/* 525 */                       char c6 = (char) i19;
/* 526 */                       if (c6 == 1) {
/* 560 */                           iM7871D23 = qj3.m7871D(i19, parcel);
                                } else if (c6 == 2) {
/* 555 */                           zM7914y8 = qj3.m7914y(i19, parcel);
                                } else if (c6 == 3) {
/* 550 */                           zM7914y9 = qj3.m7914y(i19, parcel);
                                } else if (c6 == 4) {
/* 545 */                           iM7871D24 = qj3.m7871D(i19, parcel);
                                } else if (c6 != 5) {
/* 536 */                           qj3.m7878K(i19, parcel);
                                } else {
/* 540 */                           iM7871D25 = qj3.m7871D(i19, parcel);
                                }
                            }
/* 565 */                   qj3.m7908s(iM7883P21, parcel);
/* 570 */                   return new RootTelemetryConfiguration(iM7871D23, zM7914y8, zM7914y9, iM7871D24, iM7871D25);
                        case 24:
/* 410 */                   int iM7883P22 = qj3.m7883P(parcel);
/* 414 */                   String strM7899j34 = null;
/* 415 */                   String strM7899j35 = null;
/* 416 */                   byte[] bArrM7896g3 = null;
/* 417 */                   AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
/* 418 */                   AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
/* 419 */                   AuthenticatorErrorResponse authenticatorErrorResponse = null;
/* 420 */                   AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
/* 421 */                   String strM7899j36 = null;
/* 426 */                   while (parcel.dataPosition() < iM7883P22) {
/* 428 */                       int i20 = parcel.readInt();
                                switch ((char) i20) {
                                    case 1:
/* 491 */                               strM7899j34 = qj3.m7899j(i20, parcel);
                                        break;
                                    case 2:
/* 486 */                               strM7899j35 = qj3.m7899j(i20, parcel);
                                        break;
                                    case 3:
/* 481 */                               bArrM7896g3 = qj3.m7896g(i20, parcel);
                                        break;
                                    case 4:
/* 478 */                               authenticatorAttestationResponse = (AuthenticatorAttestationResponse) qj3.m7898i(parcel, i20, AuthenticatorAttestationResponse.CREATOR);
                                        break;
                                    case 5:
/* 469 */                               authenticatorAssertionResponse = (AuthenticatorAssertionResponse) qj3.m7898i(parcel, i20, AuthenticatorAssertionResponse.CREATOR);
                                        break;
                                    case 6:
/* 460 */                               authenticatorErrorResponse = (AuthenticatorErrorResponse) qj3.m7898i(parcel, i20, AuthenticatorErrorResponse.CREATOR);
                                        break;
                                    case 7:
/* 451 */                               authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) qj3.m7898i(parcel, i20, AuthenticationExtensionsClientOutputs.CREATOR);
                                        break;
                                    case '\b':
/* 440 */                               strM7899j36 = qj3.m7899j(i20, parcel);
                                        break;
                                    default:
/* 436 */                               qj3.m7878K(i20, parcel);
                                        break;
                                }
                            }
/* 496 */                   qj3.m7908s(iM7883P22, parcel);
/* 501 */                   return new PublicKeyCredential(strM7899j34, strM7899j35, bArrM7896g3, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strM7899j36);
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 355 */                   int iM7883P23 = qj3.m7883P(parcel);
/* 359 */                   long jM7873F12 = 0;
/* 360 */                   long jM7873F13 = 0;
/* 361 */                   int iM7871D26 = 0;
/* 366 */                   while (parcel.dataPosition() < iM7883P23) {
/* 368 */                       int i21 = parcel.readInt();
/* 372 */                       char c7 = (char) i21;
/* 373 */                       if (c7 == 1) {
/* 395 */                           jM7873F12 = qj3.m7873F(i21, parcel);
                                } else if (c7 == 2) {
/* 389 */                           iM7871D26 = qj3.m7871D(i21, parcel);
                                } else if (c7 != 3) {
/* 379 */                           qj3.m7878K(i21, parcel);
                                } else {
/* 383 */                           jM7873F13 = qj3.m7873F(i21, parcel);
                                }
                            }
/* 401 */                   qj3.m7908s(iM7883P23, parcel);
/* 406 */                   return new zzaf(iM7871D26, jM7873F12, jM7873F13);
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 302 */                   int iM7883P24 = qj3.m7883P(parcel);
/* 306 */                   byte[] bArrM7896g4 = null;
/* 307 */                   ArrayList arrayListM7903n4 = null;
/* 312 */                   while (parcel.dataPosition() < iM7883P24) {
/* 314 */                       int i22 = parcel.readInt();
/* 318 */                       char c8 = (char) i22;
/* 319 */                       if (c8 == 2) {
/* 341 */                           strM7899j2 = qj3.m7899j(i22, parcel);
                                } else if (c8 == 3) {
/* 336 */                           bArrM7896g4 = qj3.m7896g(i22, parcel);
                                } else if (c8 != 4) {
/* 325 */                           qj3.m7878K(i22, parcel);
                                } else {
/* 331 */                           arrayListM7903n4 = qj3.m7903n(parcel, i22, Transport.CREATOR);
                                }
                            }
/* 346 */                   qj3.m7908s(iM7883P24, parcel);
/* 351 */                   return new PublicKeyCredentialDescriptor(strM7899j2, bArrM7896g4, arrayListM7903n4);
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 162 */                   int iM7883P25 = qj3.m7883P(parcel);
/* 166 */                   long jM7873F14 = 0;
/* 168 */                   long jM7873F15 = 0;
/* 170 */                   long jM7873F16 = 0;
/* 172 */                   boolean zM7914y10 = false;
/* 174 */                   String strM7899j37 = null;
/* 175 */                   String strM7899j38 = null;
/* 176 */                   zzpk zzpkVar = null;
/* 177 */                   String strM7899j39 = null;
/* 179 */                   zzbg zzbgVar = null;
/* 181 */                   zzbg zzbgVar2 = null;
/* 183 */                   zzbg zzbgVar3 = null;
/* 189 */                   while (parcel.dataPosition() < iM7883P25) {
/* 191 */                       int i23 = parcel.readInt();
                                switch ((char) i23) {
                                    case 2:
/* 287 */                               strM7899j37 = qj3.m7899j(i23, parcel);
                                        break;
                                    case 3:
/* 281 */                               strM7899j38 = qj3.m7899j(i23, parcel);
                                        break;
                                    case 4:
/* 277 */                               zzpkVar = (zzpk) qj3.m7898i(parcel, i23, zzpk.CREATOR);
                                        break;
                                    case 5:
/* 264 */                               jM7873F14 = qj3.m7873F(i23, parcel);
                                        break;
                                    case 6:
/* 257 */                               zM7914y10 = qj3.m7914y(i23, parcel);
                                        break;
                                    case 7:
/* 250 */                               strM7899j39 = qj3.m7899j(i23, parcel);
                                        break;
                                    case '\b':
/* 245 */                               zzbgVar = (zzbg) qj3.m7898i(parcel, i23, zzbg.CREATOR);
                                        break;
                                    case '\t':
/* 232 */                               jM7873F15 = qj3.m7873F(i23, parcel);
                                        break;
                                    case '\n':
/* 227 */                               zzbgVar2 = (zzbg) qj3.m7898i(parcel, i23, zzbg.CREATOR);
                                        break;
                                    case 11:
/* 214 */                               jM7873F16 = qj3.m7873F(i23, parcel);
                                        break;
                                    case '\f':
/* 209 */                               zzbgVar3 = (zzbg) qj3.m7898i(parcel, i23, zzbg.CREATOR);
                                        break;
                                    default:
/* 199 */                               qj3.m7878K(i23, parcel);
                                        break;
                                }
                            }
/* 293 */                   qj3.m7908s(iM7883P25, parcel);
/* 298 */                   return new zzah(strM7899j37, strM7899j38, zzpkVar, jM7873F14, zM7914y10, strM7899j39, zzbgVar, jM7873F15, zzbgVar2, jM7873F16, zzbgVar3);
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 115 */                   int iM7883P26 = qj3.m7883P(parcel);
/* 119 */                   Integer numM7872E3 = null;
/* 124 */                   while (parcel.dataPosition() < iM7883P26) {
/* 126 */                       int i24 = parcel.readInt();
/* 130 */                       char c9 = (char) i24;
/* 131 */                       if (c9 == 2) {
/* 144 */                           strM7899j = qj3.m7899j(i24, parcel);
                                } else if (c9 != 3) {
/* 135 */                           qj3.m7878K(i24, parcel);
                                } else {
/* 139 */                           numM7872E3 = qj3.m7872E(i24, parcel);
                                }
                            }
/* 149 */                   qj3.m7908s(iM7883P26, parcel);
/* 158 */                   return new PublicKeyCredentialParameters(strM7899j, numM7872E3.intValue());
                        default:
/* 20 */                    int iM7883P27 = qj3.m7883P(parcel);
/* 24 */                    byte[] bArrM7896g5 = null;
/* 25 */                    Double dM7868A2 = null;
/* 26 */                    String strM7899j40 = null;
/* 27 */                    ArrayList arrayListM7903n5 = null;
/* 28 */                    Integer numM7872E4 = null;
/* 29 */                    TokenBinding tokenBinding2 = null;
/* 30 */                    String strM7899j41 = null;
/* 31 */                    AuthenticationExtensions authenticationExtensions2 = null;
/* 32 */                    Long lM7874G = null;
/* 37 */                    while (parcel.dataPosition() < iM7883P27) {
/* 39 */                        int i25 = parcel.readInt();
                                switch ((char) i25) {
                                    case 2:
/* 101 */                               bArrM7896g5 = qj3.m7896g(i25, parcel);
                                        break;
                                    case 3:
/* 96 */                                dM7868A2 = qj3.m7868A(i25, parcel);
                                        break;
                                    case 4:
/* 91 */                                strM7899j40 = qj3.m7899j(i25, parcel);
                                        break;
                                    case 5:
/* 86 */                                arrayListM7903n5 = qj3.m7903n(parcel, i25, PublicKeyCredentialDescriptor.CREATOR);
                                        break;
                                    case 6:
/* 79 */                                numM7872E4 = qj3.m7872E(i25, parcel);
                                        break;
                                    case 7:
/* 76 */                                tokenBinding2 = (TokenBinding) qj3.m7898i(parcel, i25, TokenBinding.CREATOR);
                                        break;
                                    case '\b':
/* 65 */                                strM7899j41 = qj3.m7899j(i25, parcel);
                                        break;
                                    case '\t':
/* 62 */                                authenticationExtensions2 = (AuthenticationExtensions) qj3.m7898i(parcel, i25, AuthenticationExtensions.CREATOR);
                                        break;
                                    case '\n':
/* 51 */                                lM7874G = qj3.m7874G(i25, parcel);
                                        break;
                                    default:
/* 47 */                                qj3.m7878K(i25, parcel);
                                        break;
                                }
                            }
/* 106 */                   qj3.m7908s(iM7883P27, parcel);
/* 111 */                   return new PublicKeyCredentialRequestOptions(bArrM7896g5, dM7868A2, strM7899j40, arrayListM7903n5, numM7872E4, tokenBinding2, strM7899j41, authenticationExtensions2, lM7874G);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
                    switch (this.f17044a) {
                        case 0:
/* 93 */                    return new AppVisibleCustomProperties[i];
                        case 1:
/* 90 */                    return new Transport[i];
                        case 2:
/* 87 */                    return new Attachment[i];
                        case 3:
/* 84 */                    return new SourceDirectTransferResult[i];
                        case 4:
/* 81 */                    return new AchievementEntity[i];
                        case 5:
/* 78 */                    return new EventEntity[i];
                        case 6:
/* 75 */                    return new ExperienceEventEntity[i];
                        case 7:
/* 72 */                    return new ParticipantEntity[i];
                        case 8:
/* 69 */                    return new zzb[i];
                        case 9:
/* 66 */                    return new SnapshotContentsEntity[i];
                        case 10:
/* 63 */                    return new PlayerStatsEntity[i];
                        case 11:
/* 60 */                    return new VideoCapabilities[i];
                        case 12:
/* 57 */                    return new PlaceReport[i];
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 54 */                    return new ProxyRequest[i];
                        case 14:
/* 51 */                    return new CloudMessage[i];
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 48 */                    return new ConnectionResult[i];
                        case 16:
/* 45 */                    return new WakeLockEvent[i];
                        case 17:
/* 42 */                    return new AccountChangeEvent[i];
                        case 18:
/* 39 */                    return new zzz[i];
                        case 19:
/* 36 */                    return new zzaa[i];
                        case 20:
/* 33 */                    return new GoogleThirdPartyPaymentExtension[i];
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 30 */                    return new zzad[i];
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 27 */                    return new PublicKeyCredentialCreationOptions[i];
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 24 */                    return new RootTelemetryConfiguration[i];
                        case 24:
/* 21 */                    return new PublicKeyCredential[i];
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 18 */                    return new zzaf[i];
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 15 */                    return new PublicKeyCredentialDescriptor[i];
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 12 */                    return new zzah[i];
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 9 */                     return new PublicKeyCredentialParameters[i];
                        default:
/* 6 */                     return new PublicKeyCredentialRequestOptions[i];
                    }
                }
            }
