            package p000;

            import android.accounts.Account;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.auth.TokenData;
            import com.google.android.gms.auth.api.accounttransfer.zzo;
            import com.google.android.gms.auth.api.accounttransfer.zzs;
            import com.google.android.gms.auth.api.accounttransfer.zzu;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.common.internal.ClientIdentity;
            import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
            import com.google.android.gms.common.internal.DowngradeableSafeParcel;
            import com.google.android.gms.common.internal.GetServiceRequest;
            import com.google.android.gms.common.internal.RootTelemetryConfiguration;
            import com.google.android.gms.common.zzp;
            import com.google.android.gms.drive.DriveSpace;
            import com.google.android.gms.drive.metadata.internal.ParentDriveIdSet;
            import com.google.android.gms.drive.metadata.internal.zzq;
            import com.google.android.gms.drive.query.internal.zzl;
            import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
            import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
            import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
            import com.google.android.gms.fido.fido2.api.common.zzn;
            import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
            import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
            import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
            import com.google.android.gms.fido.u2f.api.common.SignResponseData;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.PlayerLevel;
            import com.google.android.gms.games.PlayerLevelInfo;
            import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
            import com.google.android.gms.games.zza;
            import com.google.android.gms.games.zzt;
            import com.google.android.gms.location.ActivityRecognitionResult;
            import com.google.android.gms.location.ActivityTransition;
            import com.google.android.gms.location.ActivityTransitionEvent;
            import com.google.android.gms.location.ActivityTransitionRequest;
            import com.google.android.gms.location.ActivityTransitionResult;
            import com.google.android.gms.location.DetectedActivity;
            import com.google.android.gms.measurement.internal.zzog;
            import com.google.android.gms.measurement.internal.zzol;
            import com.google.android.gms.measurement.internal.zzon;
            import com.google.android.gms.measurement.internal.zzop;
            import com.google.android.gms.measurement.internal.zzpk;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.HashSet;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cl3 implements Parcelable.Creator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2996a;

                public /* synthetic */ cl3(int i) {
/* 1 */             this.f2996a = i;
                }

                /* JADX INFO: renamed from: a */
                public static void m1722a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = getServiceRequest.f3494a;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = getServiceRequest.f3495b;
/* 20 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(i3);
/* 26 */            int i4 = getServiceRequest.f3496c;
/* 29 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(i4);
/* 38 */            w11.m9410T(parcel, 4, getServiceRequest.f3497d, false);
/* 44 */            w11.m9405O(parcel, 5, getServiceRequest.f3498e);
/* 50 */            w11.m9413W(parcel, 6, getServiceRequest.f3499f, i);
/* 56 */            w11.m9402L(parcel, 7, getServiceRequest.f3500i, false);
/* 63 */            w11.m9409S(parcel, 8, getServiceRequest.f3501v, i, false);
/* 70 */            w11.m9413W(parcel, 10, getServiceRequest.f3502w, i);
/* 77 */            w11.m9413W(parcel, 11, getServiceRequest.f3489U, i);
/* 80 */            boolean z = getServiceRequest.f3490V;
/* 84 */            w11.m9420b0(parcel, 12, 4);
/* 87 */            parcel.writeInt(z ? 1 : 0);
/* 90 */            int i5 = getServiceRequest.f3491W;
/* 94 */            w11.m9420b0(parcel, 13, 4);
/* 97 */            parcel.writeInt(i5);
/* 100 */           boolean z2 = getServiceRequest.f3492X;
/* 104 */           w11.m9420b0(parcel, 14, 4);
/* 107 */           parcel.writeInt(z2 ? 1 : 0);
/* 114 */           w11.m9410T(parcel, 15, getServiceRequest.f3493Y, false);
/* 117 */           w11.m9428f0(iM9422c0, parcel);
                }

                /* JADX INFO: renamed from: b */
                public static void m1723b(zzpk zzpkVar, Parcel parcel) {
/* 1 */             int i = zzpkVar.f4227a;
/* 5 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i);
/* 21 */            w11.m9410T(parcel, 2, zzpkVar.f4228b, false);
/* 24 */            long j = zzpkVar.f4229c;
/* 29 */            w11.m9420b0(parcel, 3, 8);
/* 32 */            parcel.writeLong(j);
/* 37 */            w11.m9408R(parcel, 4, zzpkVar.f4230d);
/* 43 */            w11.m9410T(parcel, 6, zzpkVar.f4231e, false);
/* 49 */            w11.m9410T(parcel, 7, zzpkVar.f4232f, false);
/* 54 */            w11.m9404N(parcel, 8, zzpkVar.f4233i);
/* 57 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 12 */            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
/* 12 */            String strM7899j = null;
/* 12 */            ArrayList arrayListM7903n = null;
/* 12 */            ArrayList arrayListM7903n2 = null;
/* 12 */            DataHolder dataHolder = null;
/* 12 */            ArrayList arrayListM7903n3 = null;
/* 12 */            String strM7899j2 = null;
/* 12 */            ArrayList arrayListM7903n4 = null;
/* 12 */            ArrayList arrayListM7903n5 = null;
/* 12 */            String strM7899j3 = null;
/* 12 */            String strM7899j4 = null;
/* 12 */            byte[] bArrM7896g = null;
/* 12 */            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
/* 12 */            ArrayList arrayListM7903n6 = null;
                    switch (this.f2996a) {
                        case 0:
/* 2168 */                  int iM7883P = qj3.m7883P(parcel);
/* 2172 */                  Uri uri = null;
/* 2173 */                  byte[] bArrM7896g2 = null;
/* 2178 */                  while (parcel.dataPosition() < iM7883P) {
/* 2180 */                      int i = parcel.readInt();
/* 2184 */                      char c = (char) i;
/* 2185 */                      if (c == 2) {
/* 2216 */                          publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) qj3.m7898i(parcel, i, PublicKeyCredentialCreationOptions.CREATOR);
                                } else if (c == 3) {
/* 2206 */                          uri = (Uri) qj3.m7898i(parcel, i, Uri.CREATOR);
                                } else if (c != 4) {
/* 2191 */                          qj3.m7878K(i, parcel);
                                } else {
/* 2195 */                          bArrM7896g2 = qj3.m7896g(i, parcel);
                                }
                            }
/* 2219 */                  qj3.m7908s(iM7883P, parcel);
/* 2224 */                  return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArrM7896g2);
                        case 1:
/* 2085 */                  int iM7883P2 = qj3.m7883P(parcel);
/* 2089 */                  Integer numM7872E = null;
/* 2090 */                  Double dM7868A = null;
/* 2091 */                  Uri uri2 = null;
/* 2092 */                  byte[] bArrM7896g3 = null;
/* 2093 */                  ArrayList arrayListM7903n7 = null;
/* 2094 */                  ChannelIdValue channelIdValue = null;
/* 2095 */                  String strM7899j5 = null;
/* 2100 */                  while (parcel.dataPosition() < iM7883P2) {
/* 2102 */                      int i2 = parcel.readInt();
                                switch ((char) i2) {
                                    case 2:
/* 2154 */                              numM7872E = qj3.m7872E(i2, parcel);
                                        break;
                                    case 3:
/* 2149 */                              dM7868A = qj3.m7868A(i2, parcel);
                                        break;
                                    case 4:
/* 2146 */                              uri2 = (Uri) qj3.m7898i(parcel, i2, Uri.CREATOR);
                                        break;
                                    case 5:
/* 2135 */                              bArrM7896g3 = qj3.m7896g(i2, parcel);
                                        break;
                                    case 6:
/* 2130 */                              arrayListM7903n7 = qj3.m7903n(parcel, i2, RegisteredKey.CREATOR);
                                        break;
                                    case 7:
/* 2125 */                              channelIdValue = (ChannelIdValue) qj3.m7898i(parcel, i2, ChannelIdValue.CREATOR);
                                        break;
                                    case '\b':
/* 2114 */                              strM7899j5 = qj3.m7899j(i2, parcel);
                                        break;
                                    default:
/* 2110 */                              qj3.m7878K(i2, parcel);
                                        break;
                                }
                            }
/* 2159 */                  qj3.m7908s(iM7883P2, parcel);
/* 2164 */                  return new SignRequestParams(numM7872E, dM7868A, uri2, bArrM7896g3, arrayListM7903n7, channelIdValue, strM7899j5);
                        case 2:
/* 1969 */                  int iM7883P3 = qj3.m7883P(parcel);
/* 1973 */                  Bundle bundleM7895f = null;
/* 1974 */                  int iM7871D = 0;
/* 1975 */                  long jM7873F = 0;
/* 1977 */                  long jM7873F2 = 0;
/* 1985 */                  while (parcel.dataPosition() < iM7883P3) {
/* 1987 */                      int i3 = parcel.readInt();
/* 1991 */                      char c2 = (char) i3;
/* 1992 */                      if (c2 == 1) {
/* 2029 */                          arrayListM7903n6 = qj3.m7903n(parcel, i3, DetectedActivity.CREATOR);
                                } else if (c2 == 2) {
/* 2022 */                          jM7873F = qj3.m7873F(i3, parcel);
                                } else if (c2 == 3) {
/* 2017 */                          jM7873F2 = qj3.m7873F(i3, parcel);
                                } else if (c2 == 4) {
/* 2012 */                          iM7871D = qj3.m7871D(i3, parcel);
                                } else if (c2 != 5) {
/* 2002 */                          qj3.m7878K(i3, parcel);
                                } else {
/* 2006 */                          bundleM7895f = qj3.m7895f(i3, parcel);
                                }
                            }
/* 2035 */                  qj3.m7908s(iM7883P3, parcel);
/* 2040 */                  ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
/* 2056 */                  kb1.m6053f("Must have at least 1 detected activity", arrayListM7903n6 != null && arrayListM7903n6.size() > 0);
/* 2071 */                  kb1.m6053f("Must set times", jM7873F > 0 && jM7873F2 > 0);
/* 2074 */                  activityRecognitionResult.f4095a = arrayListM7903n6;
/* 2076 */                  activityRecognitionResult.f4096b = jM7873F;
/* 2078 */                  activityRecognitionResult.f4097c = jM7873F2;
/* 2080 */                  activityRecognitionResult.f4098d = iM7871D;
/* 2082 */                  activityRecognitionResult.f4099e = bundleM7895f;
/* 2084 */                  return activityRecognitionResult;
                        case 3:
/* 1898 */                  int iM7883P4 = qj3.m7883P(parcel);
/* 1902 */                  RootTelemetryConfiguration rootTelemetryConfiguration = null;
/* 1903 */                  int[] iArrM7897h = null;
/* 1904 */                  int[] iArrM7897h2 = null;
/* 1905 */                  boolean zM7914y = false;
/* 1906 */                  boolean zM7914y2 = false;
/* 1907 */                  int iM7871D2 = 0;
/* 1912 */                  while (parcel.dataPosition() < iM7883P4) {
/* 1914 */                      int i4 = parcel.readInt();
                                switch ((char) i4) {
                                    case 1:
/* 1957 */                              rootTelemetryConfiguration = (RootTelemetryConfiguration) qj3.m7898i(parcel, i4, RootTelemetryConfiguration.CREATOR);
                                        break;
                                    case 2:
/* 1946 */                              zM7914y = qj3.m7914y(i4, parcel);
                                        break;
                                    case 3:
/* 1941 */                              zM7914y2 = qj3.m7914y(i4, parcel);
                                        break;
                                    case 4:
/* 1936 */                              iArrM7897h = qj3.m7897h(i4, parcel);
                                        break;
                                    case 5:
/* 1931 */                              iM7871D2 = qj3.m7871D(i4, parcel);
                                        break;
                                    case 6:
/* 1926 */                              iArrM7897h2 = qj3.m7897h(i4, parcel);
                                        break;
                                    default:
/* 1922 */                              qj3.m7878K(i4, parcel);
                                        break;
                                }
                            }
/* 1960 */                  qj3.m7908s(iM7883P4, parcel);
/* 1965 */                  return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zM7914y, zM7914y2, iArrM7897h, iM7871D2, iArrM7897h2);
                        case 4:
/* 1838 */                  int iM7883P5 = qj3.m7883P(parcel);
/* 1842 */                  Uri uri3 = null;
/* 1843 */                  byte[] bArrM7896g4 = null;
/* 1848 */                  while (parcel.dataPosition() < iM7883P5) {
/* 1850 */                      int i5 = parcel.readInt();
/* 1854 */                      char c3 = (char) i5;
/* 1855 */                      if (c3 == 2) {
/* 1886 */                          publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) qj3.m7898i(parcel, i5, PublicKeyCredentialRequestOptions.CREATOR);
                                } else if (c3 == 3) {
/* 1876 */                          uri3 = (Uri) qj3.m7898i(parcel, i5, Uri.CREATOR);
                                } else if (c3 != 4) {
/* 1861 */                          qj3.m7878K(i5, parcel);
                                } else {
/* 1865 */                          bArrM7896g4 = qj3.m7896g(i5, parcel);
                                }
                            }
/* 1889 */                  qj3.m7908s(iM7883P5, parcel);
/* 1894 */                  return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri3, bArrM7896g4);
                        case 5:
/* 1779 */                  int iM7883P6 = qj3.m7883P(parcel);
/* 1783 */                  String strM7899j6 = null;
/* 1784 */                  byte[] bArrM7896g5 = null;
/* 1785 */                  byte[] bArrM7896g6 = null;
/* 1790 */                  while (parcel.dataPosition() < iM7883P6) {
/* 1792 */                      int i6 = parcel.readInt();
/* 1796 */                      char c4 = (char) i6;
/* 1797 */                      if (c4 == 2) {
/* 1824 */                          bArrM7896g = qj3.m7896g(i6, parcel);
                                } else if (c4 == 3) {
/* 1819 */                          strM7899j6 = qj3.m7899j(i6, parcel);
                                } else if (c4 == 4) {
/* 1814 */                          bArrM7896g5 = qj3.m7896g(i6, parcel);
                                } else if (c4 != 5) {
/* 1805 */                          qj3.m7878K(i6, parcel);
                                } else {
/* 1809 */                          bArrM7896g6 = qj3.m7896g(i6, parcel);
                                }
                            }
/* 1829 */                  qj3.m7908s(iM7883P6, parcel);
/* 1834 */                  return new SignResponseData(bArrM7896g, strM7899j6, bArrM7896g5, bArrM7896g6);
                        case 6:
/* 1734 */                  int iM7883P7 = qj3.m7883P(parcel);
/* 1738 */                  int iM7871D3 = 0;
/* 1739 */                  int iM7871D4 = 0;
/* 1744 */                  while (parcel.dataPosition() < iM7883P7) {
/* 1746 */                      int i7 = parcel.readInt();
/* 1750 */                      char c5 = (char) i7;
/* 1751 */                      if (c5 == 1) {
/* 1764 */                          iM7871D4 = qj3.m7871D(i7, parcel);
                                } else if (c5 != 2) {
/* 1755 */                          qj3.m7878K(i7, parcel);
                                } else {
/* 1759 */                          iM7871D3 = qj3.m7871D(i7, parcel);
                                }
                            }
/* 1770 */                  qj3.m7908s(iM7883P7, parcel);
/* 1775 */                  return new ActivityTransition(iM7871D4, iM7871D3);
                        case 7:
/* 1680 */                  int iM7883P8 = qj3.m7883P(parcel);
/* 1684 */                  int iM7871D5 = 0;
/* 1685 */                  long jM7873F3 = 0;
/* 1687 */                  int iM7871D6 = 0;
/* 1692 */                  while (parcel.dataPosition() < iM7883P8) {
/* 1694 */                      int i8 = parcel.readInt();
/* 1698 */                      char c6 = (char) i8;
/* 1699 */                      if (c6 == 1) {
/* 1719 */                          iM7871D6 = qj3.m7871D(i8, parcel);
                                } else if (c6 == 2) {
/* 1714 */                          iM7871D5 = qj3.m7871D(i8, parcel);
                                } else if (c6 != 3) {
/* 1705 */                          qj3.m7878K(i8, parcel);
                                } else {
/* 1709 */                          jM7873F3 = qj3.m7873F(i8, parcel);
                                }
                            }
/* 1725 */                  qj3.m7908s(iM7883P8, parcel);
/* 1730 */                  return new ActivityTransitionEvent(jM7873F3, iM7871D6, iM7871D5);
                        case 8:
/* 1594 */                  int iM7883P9 = qj3.m7883P(parcel);
/* 1598 */                  String strM7899j7 = null;
/* 1599 */                  Long lM7874G = null;
/* 1600 */                  ArrayList arrayListM7901l = null;
/* 1602 */                  String strM7899j8 = null;
/* 1604 */                  int iM7871D7 = 0;
/* 1605 */                  boolean zM7914y3 = false;
/* 1606 */                  boolean zM7914y4 = false;
/* 1612 */                  while (parcel.dataPosition() < iM7883P9) {
/* 1614 */                      int i9 = parcel.readInt();
                                switch ((char) i9) {
                                    case 1:
/* 1665 */                              iM7871D7 = qj3.m7871D(i9, parcel);
                                        break;
                                    case 2:
/* 1659 */                              strM7899j7 = qj3.m7899j(i9, parcel);
                                        break;
                                    case 3:
/* 1653 */                              lM7874G = qj3.m7874G(i9, parcel);
                                        break;
                                    case 4:
/* 1647 */                              zM7914y3 = qj3.m7914y(i9, parcel);
                                        break;
                                    case 5:
/* 1640 */                              zM7914y4 = qj3.m7914y(i9, parcel);
                                        break;
                                    case 6:
/* 1633 */                              arrayListM7901l = qj3.m7901l(i9, parcel);
                                        break;
                                    case 7:
/* 1626 */                              strM7899j8 = qj3.m7899j(i9, parcel);
                                        break;
                                    default:
/* 1622 */                              qj3.m7878K(i9, parcel);
                                        break;
                                }
                            }
/* 1671 */                  qj3.m7908s(iM7883P9, parcel);
/* 1676 */                  return new TokenData(iM7871D7, strM7899j7, lM7874G, zM7914y3, zM7914y4, arrayListM7901l, strM7899j8);
                        case 9:
/* 1436 */                  int iM7883P10 = qj3.m7883P(parcel);
/* 1442 */                  Bundle bundle = new Bundle();
/* 1445 */                  Scope[] scopeArr = GetServiceRequest.f3487Z;
/* 1447 */                  Feature[] featureArr = GetServiceRequest.f3488a0;
/* 1455 */                  Feature[] featureArr2 = featureArr;
/* 1457 */                  String strM7899j9 = null;
/* 1458 */                  IBinder iBinderM7870C = null;
/* 1460 */                  Account account = null;
/* 1462 */                  String strM7899j10 = null;
/* 1464 */                  int iM7871D8 = 0;
/* 1465 */                  int iM7871D9 = 0;
/* 1466 */                  int iM7871D10 = 0;
/* 1467 */                  boolean zM7914y5 = false;
/* 1469 */                  int iM7871D11 = 0;
/* 1471 */                  boolean zM7914y6 = false;
/* 1477 */                  while (parcel.dataPosition() < iM7883P10) {
/* 1479 */                      int i10 = parcel.readInt();
                                switch ((char) i10) {
                                    case 1:
/* 1580 */                              iM7871D8 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 2:
/* 1575 */                              iM7871D9 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 3:
/* 1570 */                              iM7871D10 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 4:
/* 1565 */                              strM7899j9 = qj3.m7899j(i10, parcel);
                                        break;
                                    case 5:
/* 1560 */                              iBinderM7870C = qj3.m7870C(i10, parcel);
                                        break;
                                    case 6:
/* 1557 */                              scopeArr = (Scope[]) qj3.m7902m(parcel, i10, Scope.CREATOR);
                                        break;
                                    case 7:
/* 1544 */                              bundle = qj3.m7895f(i10, parcel);
                                        break;
                                    case '\b':
/* 1541 */                              account = (Account) qj3.m7898i(parcel, i10, Account.CREATOR);
                                        break;
                                    case '\t':
                                    default:
/* 1487 */                              qj3.m7878K(i10, parcel);
                                        break;
                                    case '\n':
/* 1530 */                              featureArr = (Feature[]) qj3.m7902m(parcel, i10, Feature.CREATOR);
                                        break;
                                    case 11:
/* 1519 */                              featureArr2 = (Feature[]) qj3.m7902m(parcel, i10, Feature.CREATOR);
                                        break;
                                    case '\f':
/* 1506 */                              zM7914y5 = qj3.m7914y(i10, parcel);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1501 */                              iM7871D11 = qj3.m7871D(i10, parcel);
                                        break;
                                    case 14:
/* 1496 */                              zM7914y6 = qj3.m7914y(i10, parcel);
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1491 */                              strM7899j10 = qj3.m7899j(i10, parcel);
                                        break;
                                }
                            }
/* 1585 */                  qj3.m7908s(iM7883P10, parcel);
/* 1590 */                  return new GetServiceRequest(iM7871D8, iM7871D9, iM7871D10, strM7899j9, iBinderM7870C, scopeArr, bundle, account, featureArr, featureArr2, zM7914y5, iM7871D11, zM7914y6, strM7899j10);
                        case 10:
/* 1401 */                  int iM7883P11 = qj3.m7883P(parcel);
/* 1409 */                  while (parcel.dataPosition() < iM7883P11) {
/* 1411 */                      int i11 = parcel.readInt();
/* 1416 */                      if (((char) i11) != 2) {
/* 1418 */                          qj3.m7878K(i11, parcel);
                                } else {
/* 1422 */                          strM7899j4 = qj3.m7899j(i11, parcel);
                                }
                            }
/* 1427 */                  qj3.m7908s(iM7883P11, parcel);
/* 1432 */                  return new DriveSpace(strM7899j4);
                        case 11:
/* 1366 */                  int iM7883P12 = qj3.m7883P(parcel);
/* 1374 */                  while (parcel.dataPosition() < iM7883P12) {
/* 1376 */                      int i12 = parcel.readInt();
/* 1381 */                      if (((char) i12) != 1) {
/* 1383 */                          qj3.m7878K(i12, parcel);
                                } else {
/* 1387 */                          strM7899j3 = qj3.m7899j(i12, parcel);
                                }
                            }
/* 1392 */                  qj3.m7908s(iM7883P12, parcel);
/* 1397 */                  return new zzl(strM7899j3);
                        case 12:
                            try {
/* 1356 */                      return COSEAlgorithmIdentifier.m2054a(parcel.readInt());
                            } catch (C0996hm e) {
/* 1362 */                      ds0.m3199p(e);
/* 12 */                        return null;
                            }
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1315 */                  int iM7883P13 = qj3.m7883P(parcel);
/* 1323 */                  while (parcel.dataPosition() < iM7883P13) {
/* 1325 */                      int i13 = parcel.readInt();
/* 1330 */                      if (((char) i13) != 2) {
/* 1332 */                          qj3.m7878K(i13, parcel);
                                } else {
/* 1338 */                          arrayListM7903n5 = qj3.m7903n(parcel, i13, zzq.CREATOR);
                                }
                            }
/* 1343 */                  qj3.m7908s(iM7883P13, parcel);
/* 1348 */                  return new ParentDriveIdSet(arrayListM7903n5);
                        case 14:
/* 1248 */                  int iM7883P14 = qj3.m7883P(parcel);
/* 1252 */                  byte[] bArrM7896g7 = null;
/* 1253 */                  byte[] bArrM7896g8 = null;
/* 1254 */                  byte[] bArrM7896g9 = null;
/* 1256 */                  long jM7873F4 = 0;
/* 1262 */                  while (parcel.dataPosition() < iM7883P14) {
/* 1264 */                      int i14 = parcel.readInt();
/* 1268 */                      char c7 = (char) i14;
/* 1269 */                      if (c7 == 1) {
/* 1300 */                          jM7873F4 = qj3.m7873F(i14, parcel);
                                } else if (c7 == 2) {
/* 1294 */                          bArrM7896g7 = qj3.m7896g(i14, parcel);
                                } else if (c7 == 3) {
/* 1288 */                          bArrM7896g8 = qj3.m7896g(i14, parcel);
                                } else if (c7 != 4) {
/* 1277 */                          qj3.m7878K(i14, parcel);
                                } else {
/* 1281 */                          bArrM7896g9 = qj3.m7896g(i14, parcel);
                                }
                            }
/* 1306 */                  qj3.m7908s(iM7883P14, parcel);
/* 1311 */                  return new zzn(jM7873F4, bArrM7896g7, bArrM7896g8, bArrM7896g9);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1184 */                  int iM7883P15 = qj3.m7883P(parcel);
/* 1188 */                  String strM7899j11 = null;
/* 1189 */                  ArrayList arrayListM7903n8 = null;
/* 1190 */                  String strM7899j12 = null;
/* 1195 */                  while (parcel.dataPosition() < iM7883P15) {
/* 1197 */                      int i15 = parcel.readInt();
/* 1201 */                      char c8 = (char) i15;
/* 1202 */                      if (c8 == 1) {
/* 1233 */                          arrayListM7903n4 = qj3.m7903n(parcel, i15, ActivityTransition.CREATOR);
                                } else if (c8 == 2) {
/* 1226 */                          strM7899j11 = qj3.m7899j(i15, parcel);
                                } else if (c8 == 3) {
/* 1221 */                          arrayListM7903n8 = qj3.m7903n(parcel, i15, ClientIdentity.CREATOR);
                                } else if (c8 != 4) {
/* 1210 */                          qj3.m7878K(i15, parcel);
                                } else {
/* 1214 */                          strM7899j12 = qj3.m7899j(i15, parcel);
                                }
                            }
/* 1239 */                  qj3.m7908s(iM7883P15, parcel);
/* 1244 */                  return new ActivityTransitionRequest(arrayListM7903n4, strM7899j11, arrayListM7903n8, strM7899j12);
                        case 16:
/* 1129 */                  int iM7883P16 = qj3.m7883P(parcel);
/* 1133 */                  long jM7873F5 = 0;
/* 1135 */                  int iM7871D12 = 0;
/* 1140 */                  while (parcel.dataPosition() < iM7883P16) {
/* 1142 */                      int i16 = parcel.readInt();
/* 1146 */                      char c9 = (char) i16;
/* 1147 */                      if (c9 == 1) {
/* 1169 */                          strM7899j2 = qj3.m7899j(i16, parcel);
                                } else if (c9 == 2) {
/* 1163 */                          jM7873F5 = qj3.m7873F(i16, parcel);
                                } else if (c9 != 3) {
/* 1153 */                          qj3.m7878K(i16, parcel);
                                } else {
/* 1157 */                          iM7871D12 = qj3.m7871D(i16, parcel);
                                }
                            }
/* 1175 */                  qj3.m7908s(iM7883P16, parcel);
/* 1180 */                  return new zzog(strM7899j2, jM7873F5, iM7871D12);
                        case 17:
/* 1040 */                  int iM7883P17 = qj3.m7883P(parcel);
/* 1044 */                  byte[] bArrM7896g10 = null;
/* 1045 */                  String strM7899j13 = null;
/* 1046 */                  Bundle bundleM7895f2 = null;
/* 1048 */                  String strM7899j14 = null;
/* 1050 */                  long jM7873F6 = 0;
/* 1052 */                  int iM7871D13 = 0;
/* 1054 */                  long jM7873F7 = 0;
/* 1060 */                  while (parcel.dataPosition() < iM7883P17) {
/* 1062 */                      int i17 = parcel.readInt();
                                switch ((char) i17) {
                                    case 1:
/* 1114 */                              jM7873F6 = qj3.m7873F(i17, parcel);
                                        break;
                                    case 2:
/* 1108 */                              bArrM7896g10 = qj3.m7896g(i17, parcel);
                                        break;
                                    case 3:
/* 1102 */                              strM7899j13 = qj3.m7899j(i17, parcel);
                                        break;
                                    case 4:
/* 1095 */                              bundleM7895f2 = qj3.m7895f(i17, parcel);
                                        break;
                                    case 5:
/* 1088 */                              iM7871D13 = qj3.m7871D(i17, parcel);
                                        break;
                                    case 6:
/* 1081 */                              jM7873F7 = qj3.m7873F(i17, parcel);
                                        break;
                                    case 7:
/* 1074 */                              strM7899j14 = qj3.m7899j(i17, parcel);
                                        break;
                                    default:
/* 1070 */                              qj3.m7878K(i17, parcel);
                                        break;
                                }
                            }
/* 1120 */                  qj3.m7908s(iM7883P17, parcel);
/* 1125 */                  return new zzol(jM7873F6, bArrM7896g10, strM7899j13, bundleM7895f2, iM7871D13, jM7873F7, strM7899j14);
                        case 18:
/* 966 */                   int iM7883P18 = qj3.m7883P(parcel);
                            while (true) {
/* 970 */                       ArrayList arrayList = null;
                                while (true) {
/* 975 */                           if (parcel.dataPosition() >= iM7883P18) {
/* 1031 */                              qj3.m7908s(iM7883P18, parcel);
/* 1036 */                              return new zzon(arrayList);
                                    }
/* 977 */                           int i18 = parcel.readInt();
/* 982 */                           if (((char) i18) != 1) {
/* 984 */                               qj3.m7878K(i18, parcel);
                                    } else {
/* 988 */                               int iM7875H = qj3.m7875H(i18, parcel);
/* 992 */                               int iDataPosition = parcel.dataPosition();
/* 996 */                               if (iM7875H == 0) {
                                        }
/* 1001 */                              ArrayList arrayList2 = new ArrayList();
/* 1004 */                              int i19 = parcel.readInt();
/* 1009 */                              for (int i20 = 0; i20 < i19; i20++) {
/* 1019 */                                  arrayList2.add(Integer.valueOf(parcel.readInt()));
                                        }
/* 1026 */                              parcel.setDataPosition(iDataPosition + iM7875H);
/* 1029 */                              arrayList = arrayList2;
                                    }
                                    break;
                                }
                            }
                            break;
                        case 19:
/* 929 */                   int iM7883P19 = qj3.m7883P(parcel);
/* 937 */                   while (parcel.dataPosition() < iM7883P19) {
/* 939 */                       int i21 = parcel.readInt();
/* 944 */                       if (((char) i21) != 1) {
/* 946 */                           qj3.m7878K(i21, parcel);
                                } else {
/* 952 */                           arrayListM7903n3 = qj3.m7903n(parcel, i21, zzol.CREATOR);
                                }
                            }
/* 957 */                   qj3.m7908s(iM7883P19, parcel);
/* 962 */                   return new zzop(arrayListM7903n3);
                        case 20:
/* 809 */                   int iM7883P20 = qj3.m7883P(parcel);
/* 815 */                   HashSet hashSet = new HashSet();
/* 818 */                   ArrayList arrayList3 = null;
/* 819 */                   zzs zzsVar = null;
/* 821 */                   int i22 = 0;
/* 822 */                   int i23 = 0;
/* 827 */                   while (parcel.dataPosition() < iM7883P20) {
/* 829 */                       int i24 = parcel.readInt();
/* 833 */                       char c10 = (char) i24;
/* 834 */                       if (c10 == 1) {
/* 892 */                           int iM7871D14 = qj3.m7871D(i24, parcel);
/* 900 */                           hashSet.add(1);
/* 903 */                           i22 = iM7871D14;
                                } else if (c10 == 2) {
/* 879 */                           ArrayList arrayListM7903n9 = qj3.m7903n(parcel, i24, zzu.CREATOR);
/* 887 */                           hashSet.add(2);
/* 890 */                           arrayList3 = arrayListM7903n9;
                                } else if (c10 == 3) {
/* 864 */                           int iM7871D15 = qj3.m7871D(i24, parcel);
/* 872 */                           hashSet.add(3);
/* 875 */                           i23 = iM7871D15;
                                } else if (c10 != 4) {
/* 842 */                           qj3.m7878K(i24, parcel);
                                } else {
/* 852 */                           zzs zzsVar2 = (zzs) qj3.m7898i(parcel, i24, zzs.CREATOR);
/* 858 */                           hashSet.add(4);
/* 861 */                           zzsVar = zzsVar2;
                                }
                            }
/* 909 */                   if (parcel.dataPosition() == iM7883P20) {
/* 913 */                       return new zzo(hashSet, i22, arrayList3, i23, zzsVar);
                            }
/* 928 */                   throw new g62(fm0.m3781g(iM7883P20, "Overread allowed size end="), parcel);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 753 */                   int iM7883P21 = qj3.m7883P(parcel);
/* 757 */                   int iM7871D16 = 0;
/* 758 */                   boolean zM7914y7 = false;
/* 763 */                   while (parcel.dataPosition() < iM7883P21) {
/* 765 */                       int i25 = parcel.readInt();
/* 769 */                       char c11 = (char) i25;
/* 770 */                       if (c11 == 2) {
/* 797 */                           dataHolder = (DataHolder) qj3.m7898i(parcel, i25, DataHolder.CREATOR);
                                } else if (c11 == 3) {
/* 785 */                           zM7914y7 = qj3.m7914y(i25, parcel);
                                } else if (c11 != 4) {
/* 776 */                           qj3.m7878K(i25, parcel);
                                } else {
/* 780 */                           iM7871D16 = qj3.m7871D(i25, parcel);
                                }
                            }
/* 800 */                   qj3.m7908s(iM7883P21, parcel);
/* 805 */                   return new com.google.android.gms.drive.events.zzo(dataHolder, zM7914y7, iM7871D16);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 438 */                   DowngradeableSafeParcel.m2019E1();
/* 441 */                   DowngradeableSafeParcel.m2018D1();
/* 444 */                   int iM7883P22 = qj3.m7883P(parcel);
/* 450 */                   long jM7873F8 = -1;
/* 452 */                   String strM7899j15 = null;
/* 453 */                   String strM7899j16 = null;
/* 454 */                   Uri uri4 = null;
/* 455 */                   Uri uri5 = null;
/* 456 */                   String strM7899j17 = null;
/* 458 */                   String strM7899j18 = null;
/* 460 */                   String strM7899j19 = null;
/* 462 */                   MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
/* 464 */                   PlayerLevelInfo playerLevelInfo = null;
/* 466 */                   String strM7899j20 = null;
/* 468 */                   String strM7899j21 = null;
/* 470 */                   Uri uri6 = null;
/* 472 */                   String strM7899j22 = null;
/* 474 */                   Uri uri7 = null;
/* 476 */                   String strM7899j23 = null;
/* 478 */                   zzt zztVar = null;
/* 480 */                   zza zzaVar = null;
/* 482 */                   long jM7873F9 = 0;
/* 484 */                   int iM7871D17 = 0;
/* 486 */                   long jM7873F10 = 0;
/* 488 */                   boolean zM7914y8 = false;
/* 490 */                   boolean zM7914y9 = false;
/* 492 */                   boolean zM7914y10 = false;
/* 498 */                   while (parcel.dataPosition() < iM7883P22) {
/* 500 */                       int i26 = parcel.readInt();
/* 504 */                       char c12 = (char) i26;
/* 507 */                       if (c12 == 29) {
/* 736 */                           jM7873F8 = qj3.m7873F(i26, parcel);
                                } else if (c12 == '!') {
/* 730 */                           zztVar = (zzt) qj3.m7898i(parcel, i26, zzt.CREATOR);
                                } else if (c12 == '#') {
/* 718 */                           zzaVar = (zza) qj3.m7898i(parcel, i26, zza.CREATOR);
                                } else if (c12 != '$') {
                                    switch (c12) {
                                        case 1:
/* 697 */                                   strM7899j15 = qj3.m7899j(i26, parcel);
                                            break;
                                        case 2:
/* 690 */                                   strM7899j16 = qj3.m7899j(i26, parcel);
                                            break;
                                        case 3:
/* 685 */                                   uri4 = (Uri) qj3.m7898i(parcel, i26, Uri.CREATOR);
                                            break;
                                        case 4:
/* 674 */                                   uri5 = (Uri) qj3.m7898i(parcel, i26, Uri.CREATOR);
                                            break;
                                        case 5:
/* 660 */                                   jM7873F9 = qj3.m7873F(i26, parcel);
                                            break;
                                        case 6:
/* 652 */                                   iM7871D17 = qj3.m7871D(i26, parcel);
                                            break;
                                        case 7:
/* 644 */                                   jM7873F10 = qj3.m7873F(i26, parcel);
                                            break;
                                        case '\b':
/* 636 */                                   strM7899j17 = qj3.m7899j(i26, parcel);
                                            break;
                                        case '\t':
/* 628 */                                   strM7899j18 = qj3.m7899j(i26, parcel);
                                            break;
                                        default:
                                            switch (c12) {
                                                case 14:
/* 620 */                                           strM7899j19 = qj3.m7899j(i26, parcel);
                                                    break;
                                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 615 */                                           mostRecentGameInfoEntity = (MostRecentGameInfoEntity) qj3.m7898i(parcel, i26, MostRecentGameInfoEntity.CREATOR);
                                                    break;
                                                case 16:
/* 604 */                                           playerLevelInfo = (PlayerLevelInfo) qj3.m7898i(parcel, i26, PlayerLevelInfo.CREATOR);
                                                    break;
                                                default:
                                                    switch (c12) {
                                                        case 18:
/* 591 */                                                   zM7914y8 = qj3.m7914y(i26, parcel);
                                                            break;
                                                        case 19:
/* 584 */                                                   zM7914y9 = qj3.m7914y(i26, parcel);
                                                            break;
                                                        case 20:
/* 577 */                                                   strM7899j20 = qj3.m7899j(i26, parcel);
                                                            break;
                                                        case Build.API_LEVELS.API_21 /* 21 */:
/* 570 */                                                   strM7899j21 = qj3.m7899j(i26, parcel);
                                                            break;
                                                        case Build.API_LEVELS.API_22 /* 22 */:
/* 565 */                                                   uri6 = (Uri) qj3.m7898i(parcel, i26, Uri.CREATOR);
                                                            break;
                                                        case Build.API_LEVELS.API_23 /* 23 */:
/* 552 */                                                   strM7899j22 = qj3.m7899j(i26, parcel);
                                                            break;
                                                        case 24:
/* 547 */                                                   uri7 = (Uri) qj3.m7898i(parcel, i26, Uri.CREATOR);
                                                            break;
                                                        case Build.API_LEVELS.API_25 /* 25 */:
/* 534 */                                                   strM7899j23 = qj3.m7899j(i26, parcel);
                                                            break;
                                                        default:
/* 530 */                                                   qj3.m7878K(i26, parcel);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
/* 704 */                           zM7914y10 = qj3.m7914y(i26, parcel);
                                }
                            }
/* 744 */                   qj3.m7908s(iM7883P22, parcel);
/* 749 */                   return new PlayerEntity(strM7899j15, strM7899j16, uri4, uri5, jM7873F9, iM7871D17, jM7873F10, strM7899j17, strM7899j18, strM7899j19, mostRecentGameInfoEntity, playerLevelInfo, zM7914y8, zM7914y9, strM7899j20, strM7899j21, uri6, strM7899j22, uri7, strM7899j23, jM7873F8, zztVar, zzaVar, zM7914y10);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 392 */                   int iM7883P23 = qj3.m7883P(parcel);
/* 396 */                   Bundle bundleM7895f3 = null;
/* 401 */                   while (parcel.dataPosition() < iM7883P23) {
/* 403 */                       int i27 = parcel.readInt();
/* 407 */                       char c13 = (char) i27;
/* 408 */                       if (c13 == 1) {
/* 423 */                           arrayListM7903n2 = qj3.m7903n(parcel, i27, ActivityTransitionEvent.CREATOR);
                                } else if (c13 != 2) {
/* 412 */                           qj3.m7878K(i27, parcel);
                                } else {
/* 416 */                           bundleM7895f3 = qj3.m7895f(i27, parcel);
                                }
                            }
/* 429 */                   qj3.m7908s(iM7883P23, parcel);
/* 434 */                   return new ActivityTransitionResult(arrayListM7903n2, bundleM7895f3);
                        case 24:
/* 287 */                   int iM7883P24 = qj3.m7883P(parcel);
/* 291 */                   String strM7899j24 = null;
/* 292 */                   Long lM7874G2 = null;
/* 294 */                   Float fValueOf = null;
/* 296 */                   String strM7899j25 = null;
/* 298 */                   String strM7899j26 = null;
/* 300 */                   Double dM7868A2 = null;
/* 302 */                   int iM7871D18 = 0;
/* 303 */                   long jM7873F11 = 0;
/* 309 */                   while (parcel.dataPosition() < iM7883P24) {
/* 311 */                       int i28 = parcel.readInt();
                                switch ((char) i28) {
                                    case 1:
/* 377 */                               iM7871D18 = qj3.m7871D(i28, parcel);
                                        break;
                                    case 2:
/* 372 */                               strM7899j24 = qj3.m7899j(i28, parcel);
                                        break;
                                    case 3:
/* 366 */                               jM7873F11 = qj3.m7873F(i28, parcel);
                                        break;
                                    case 4:
/* 361 */                               lM7874G2 = qj3.m7874G(i28, parcel);
                                        break;
                                    case 5:
/* 338 */                               int iM7875H2 = qj3.m7875H(i28, parcel);
/* 342 */                               if (iM7875H2 == 0) {
/* 344 */                                   fValueOf = null;
                                        } else {
/* 347 */                                   qj3.m7888U(parcel, iM7875H2, 4);
/* 354 */                                   fValueOf = Float.valueOf(parcel.readFloat());
                                        }
                                        break;
                                    case 6:
/* 333 */                               strM7899j25 = qj3.m7899j(i28, parcel);
                                        break;
                                    case 7:
/* 328 */                               strM7899j26 = qj3.m7899j(i28, parcel);
                                        break;
                                    case '\b':
/* 323 */                               dM7868A2 = qj3.m7868A(i28, parcel);
                                        break;
                                    default:
/* 319 */                               qj3.m7878K(i28, parcel);
                                        break;
                                }
                            }
/* 383 */                   qj3.m7908s(iM7883P24, parcel);
/* 388 */                   return new zzpk(iM7871D18, strM7899j24, jM7873F11, lM7874G2, fValueOf, strM7899j25, strM7899j26, dM7868A2);
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 211 */                   int iM7883P25 = qj3.m7883P(parcel);
/* 215 */                   String strM7899j27 = null;
/* 216 */                   IBinder iBinderM7870C2 = null;
/* 217 */                   boolean zM7914y11 = false;
/* 218 */                   boolean zM7914y12 = false;
/* 219 */                   boolean zM7914y13 = false;
/* 221 */                   boolean zM7914y14 = false;
/* 223 */                   boolean zM7914y15 = false;
/* 229 */                   while (parcel.dataPosition() < iM7883P25) {
/* 231 */                       int i29 = parcel.readInt();
                                switch ((char) i29) {
                                    case 1:
/* 273 */                               strM7899j27 = qj3.m7899j(i29, parcel);
                                        break;
                                    case 2:
/* 268 */                               zM7914y11 = qj3.m7914y(i29, parcel);
                                        break;
                                    case 3:
/* 263 */                               zM7914y12 = qj3.m7914y(i29, parcel);
                                        break;
                                    case 4:
/* 258 */                               iBinderM7870C2 = qj3.m7870C(i29, parcel);
                                        break;
                                    case 5:
/* 253 */                               zM7914y13 = qj3.m7914y(i29, parcel);
                                        break;
                                    case 6:
/* 248 */                               zM7914y14 = qj3.m7914y(i29, parcel);
                                        break;
                                    case 7:
                                    default:
/* 239 */                               qj3.m7878K(i29, parcel);
                                        break;
                                    case '\b':
/* 243 */                               zM7914y15 = qj3.m7914y(i29, parcel);
                                        break;
                                }
                            }
/* 278 */                   qj3.m7908s(iM7883P25, parcel);
/* 283 */                   return new zzp(strM7899j27, zM7914y11, zM7914y12, iBinderM7870C2, zM7914y13, zM7914y14, zM7914y15);
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 174 */                   int iM7883P26 = qj3.m7883P(parcel);
/* 182 */                   while (parcel.dataPosition() < iM7883P26) {
/* 184 */                       int i30 = parcel.readInt();
/* 189 */                       if (((char) i30) != 1) {
/* 191 */                           qj3.m7878K(i30, parcel);
                                } else {
/* 197 */                           arrayListM7903n = qj3.m7903n(parcel, i30, zzn.CREATOR);
                                }
                            }
/* 202 */                   qj3.m7908s(iM7883P26, parcel);
/* 207 */                   return new com.google.android.gms.fido.fido2.api.common.zzp(arrayListM7903n);
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 122 */                   int iM7883P27 = qj3.m7883P(parcel);
/* 126 */                   int iM7871D19 = -1;
/* 127 */                   long jM7873F12 = 0;
/* 133 */                   while (parcel.dataPosition() < iM7883P27) {
/* 135 */                       int i31 = parcel.readInt();
/* 139 */                       char c14 = (char) i31;
/* 140 */                       if (c14 == 2) {
/* 160 */                           strM7899j = qj3.m7899j(i31, parcel);
                                } else if (c14 == 3) {
/* 155 */                           jM7873F12 = qj3.m7873F(i31, parcel);
                                } else if (c14 != 4) {
/* 146 */                           qj3.m7878K(i31, parcel);
                                } else {
/* 150 */                           iM7871D19 = qj3.m7871D(i31, parcel);
                                }
                            }
/* 165 */                   qj3.m7908s(iM7883P27, parcel);
/* 170 */                   return new zzq(strM7899j, jM7873F12, iM7871D19);
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 65 */                    int iM7883P28 = qj3.m7883P(parcel);
/* 69 */                    int iM7871D20 = 0;
/* 70 */                    long jM7873F13 = 0;
/* 72 */                    long jM7873F14 = 0;
/* 78 */                    while (parcel.dataPosition() < iM7883P28) {
/* 80 */                        int i32 = parcel.readInt();
/* 84 */                        char c15 = (char) i32;
/* 85 */                        if (c15 == 1) {
/* 107 */                           iM7871D20 = qj3.m7871D(i32, parcel);
                                } else if (c15 == 2) {
/* 101 */                           jM7873F13 = qj3.m7873F(i32, parcel);
                                } else if (c15 != 3) {
/* 91 */                            qj3.m7878K(i32, parcel);
                                } else {
/* 95 */                            jM7873F14 = qj3.m7873F(i32, parcel);
                                }
                            }
/* 113 */                   qj3.m7908s(iM7883P28, parcel);
/* 118 */                   return new PlayerLevel(iM7871D20, jM7873F13, jM7873F14);
                        default:
/* 16 */                    int iM7883P29 = qj3.m7883P(parcel);
/* 20 */                    int iM7871D21 = 0;
/* 21 */                    int iM7871D22 = 0;
/* 26 */                    while (parcel.dataPosition() < iM7883P29) {
/* 28 */                        int i33 = parcel.readInt();
/* 32 */                        char c16 = (char) i33;
/* 33 */                        if (c16 == 1) {
/* 46 */                            iM7871D22 = qj3.m7871D(i33, parcel);
                                } else if (c16 != 2) {
/* 37 */                            qj3.m7878K(i33, parcel);
                                } else {
/* 41 */                            iM7871D21 = qj3.m7871D(i33, parcel);
                                }
                            }
/* 52 */                    qj3.m7908s(iM7883P29, parcel);
/* 57 */                    DetectedActivity detectedActivity = new DetectedActivity();
/* 60 */                    detectedActivity.f4112a = iM7871D22;
/* 62 */                    detectedActivity.f4113b = iM7871D21;
/* 64 */                    return detectedActivity;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
                    switch (this.f2996a) {
                        case 0:
/* 93 */                    return new BrowserPublicKeyCredentialCreationOptions[i];
                        case 1:
/* 90 */                    return new SignRequestParams[i];
                        case 2:
/* 87 */                    return new ActivityRecognitionResult[i];
                        case 3:
/* 84 */                    return new ConnectionTelemetryConfiguration[i];
                        case 4:
/* 81 */                    return new BrowserPublicKeyCredentialRequestOptions[i];
                        case 5:
/* 78 */                    return new SignResponseData[i];
                        case 6:
/* 75 */                    return new ActivityTransition[i];
                        case 7:
/* 72 */                    return new ActivityTransitionEvent[i];
                        case 8:
/* 69 */                    return new TokenData[i];
                        case 9:
/* 66 */                    return new GetServiceRequest[i];
                        case 10:
/* 63 */                    return new DriveSpace[i];
                        case 11:
/* 60 */                    return new zzl[i];
                        case 12:
/* 57 */                    return new COSEAlgorithmIdentifier[i];
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 54 */                    return new ParentDriveIdSet[i];
                        case 14:
/* 51 */                    return new zzn[i];
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 48 */                    return new ActivityTransitionRequest[i];
                        case 16:
/* 45 */                    return new zzog[i];
                        case 17:
/* 42 */                    return new zzol[i];
                        case 18:
/* 39 */                    return new zzon[i];
                        case 19:
/* 36 */                    return new zzop[i];
                        case 20:
/* 33 */                    return new zzo[i];
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 30 */                    return new com.google.android.gms.drive.events.zzo[i];
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 27 */                    return new PlayerEntity[i];
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 24 */                    return new ActivityTransitionResult[i];
                        case 24:
/* 21 */                    return new zzpk[i];
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 18 */                    return new zzp[i];
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 15 */                    return new com.google.android.gms.fido.fido2.api.common.zzp[i];
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 12 */                    return new zzq[i];
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 9 */                     return new PlayerLevel[i];
                        default:
/* 6 */                     return new DetectedActivity[i];
                    }
                }
            }
