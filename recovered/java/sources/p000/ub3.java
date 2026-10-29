            package p000;

            import android.accounts.Account;
            import android.app.PendingIntent;
            import android.database.CursorWindow;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.auth.api.credentials.Credential;
            import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
            import com.google.android.gms.auth.api.credentials.CredentialRequest;
            import com.google.android.gms.auth.api.credentials.HintRequest;
            import com.google.android.gms.auth.api.credentials.IdToken;
            import com.google.android.gms.auth.api.identity.BeginSignInResult;
            import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
            import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
            import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
            import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
            import com.google.android.gms.auth.api.identity.SavePasswordRequest;
            import com.google.android.gms.auth.api.identity.SavePasswordResult;
            import com.google.android.gms.auth.api.identity.SignInCredential;
            import com.google.android.gms.auth.api.identity.SignInPassword;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.auth.api.signin.SignInAccount;
            import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.common.images.WebImage;
            import com.google.android.gms.common.internal.MethodInvocation;
            import com.google.android.gms.common.internal.zat;
            import com.google.android.gms.common.internal.zav;
            import com.google.android.gms.common.internal.zax;
            import com.google.android.gms.common.server.response.FastJsonResponse$Field;
            import com.google.android.gms.common.server.response.SafeParcelResponse;
            import com.google.android.gms.common.server.response.zal;
            import com.google.android.gms.common.server.response.zam;
            import com.google.android.gms.common.server.response.zan;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.events.ChangeEvent;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
            import com.google.android.gms.signin.internal.zag;
            import com.google.android.gms.signin.internal.zai;
            import com.google.android.gms.signin.internal.zak;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ub3 implements Parcelable.Creator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17444a;

                public /* synthetic */ ub3(int i) {
/* 1 */             this.f17444a = i;
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 14 */            int iM7871D = 0;
/* 15 */            Uri uri = null;
/* 15 */            DriveId driveId = null;
/* 15 */            String strM7899j = null;
/* 15 */            String strM7899j2 = null;
/* 15 */            PendingIntent pendingIntent = null;
/* 15 */            SignInPassword signInPassword = null;
/* 15 */            PendingIntent pendingIntent2 = null;
/* 15 */            String strM7899j3 = null;
/* 15 */            GoogleSignInAccount googleSignInAccount = null;
/* 15 */            PendingIntent pendingIntent3 = null;
/* 15 */            Scope[] scopeArr = null;
/* 15 */            Account account = null;
/* 15 */            String strM7899j4 = null;
/* 15 */            ArrayList arrayListM7903n = null;
/* 15 */            ConnectionResult connectionResult = null;
/* 15 */            String strM7899j5 = null;
/* 15 */            zat zatVar = null;
/* 15 */            ArrayList arrayListM7901l = null;
                    switch (this.f17444a) {
                        case 0:
/* 1822 */                  int iM7883P = qj3.m7883P(parcel);
/* 1826 */                  int iM7871D2 = 0;
/* 1827 */                  int iM7871D3 = 0;
/* 1828 */                  String[] strArrM7900k = null;
/* 1829 */                  CursorWindow[] cursorWindowArr = null;
/* 1830 */                  Bundle bundleM7895f = null;
/* 1835 */                  while (parcel.dataPosition() < iM7883P) {
/* 1837 */                      int i = parcel.readInt();
/* 1841 */                      char c = (char) i;
/* 1842 */                      if (c == 1) {
/* 1881 */                          strArrM7900k = qj3.m7900k(i, parcel);
                                } else if (c == 2) {
/* 1878 */                          cursorWindowArr = (CursorWindow[]) qj3.m7902m(parcel, i, CursorWindow.CREATOR);
                                } else if (c == 3) {
/* 1866 */                          iM7871D3 = qj3.m7871D(i, parcel);
                                } else if (c == 4) {
/* 1861 */                          bundleM7895f = qj3.m7895f(i, parcel);
                                } else if (c != 1000) {
/* 1852 */                          qj3.m7878K(i, parcel);
                                } else {
/* 1856 */                          iM7871D2 = qj3.m7871D(i, parcel);
                                }
                            }
/* 1886 */                  qj3.m7908s(iM7883P, parcel);
/* 1891 */                  DataHolder dataHolder = new DataHolder(iM7871D2, strArrM7900k, cursorWindowArr, iM7871D3, bundleM7895f);
/* 1899 */                  dataHolder.f3465c = new Bundle();
/* 1901 */                  int i2 = 0;
                            while (true) {
/* 1902 */                      String[] strArr = dataHolder.f3464b;
/* 1905 */                      if (i2 >= strArr.length) {
/* 1917 */                          CursorWindow[] cursorWindowArr2 = dataHolder.f3466d;
/* 1922 */                          dataHolder.f3469i = new int[cursorWindowArr2.length];
/* 1924 */                          int numRows = 0;
/* 1926 */                          while (iM7871D < cursorWindowArr2.length) {
/* 1930 */                              dataHolder.f3469i[iM7871D] = numRows;
/* 1947 */                              numRows += cursorWindowArr2[iM7871D].getNumRows() - (numRows - cursorWindowArr2[iM7871D].getStartPosition());
/* 1948 */                              iM7871D++;
                                    }
/* 1951 */                          dataHolder.f3470v = numRows;
/* 1953 */                          return dataHolder;
                                }
/* 1911 */                      dataHolder.f3465c.putInt(strArr[i2], i2);
/* 1914 */                      i2++;
                            }
                            break;
                        case 1:
/* 1760 */                  int iM7883P2 = qj3.m7883P(parcel);
/* 1764 */                  int iM7871D4 = 0;
/* 1765 */                  int iM7871D5 = 0;
/* 1770 */                  while (parcel.dataPosition() < iM7883P2) {
/* 1772 */                      int i3 = parcel.readInt();
/* 1776 */                      char c2 = (char) i3;
/* 1777 */                      if (c2 == 1) {
/* 1808 */                          iM7871D = qj3.m7871D(i3, parcel);
                                } else if (c2 == 2) {
/* 1805 */                          uri = (Uri) qj3.m7898i(parcel, i3, Uri.CREATOR);
                                } else if (c2 == 3) {
/* 1794 */                          iM7871D4 = qj3.m7871D(i3, parcel);
                                } else if (c2 != 4) {
/* 1785 */                          qj3.m7878K(i3, parcel);
                                } else {
/* 1789 */                          iM7871D5 = qj3.m7871D(i3, parcel);
                                }
                            }
/* 1813 */                  qj3.m7908s(iM7883P2, parcel);
/* 1818 */                  return new WebImage(iM7871D, uri, iM7871D4, iM7871D5);
                        case 2:
/* 1717 */                  int iM7883P3 = qj3.m7883P(parcel);
/* 1721 */                  String strM7899j6 = null;
/* 1726 */                  while (parcel.dataPosition() < iM7883P3) {
/* 1728 */                      int i4 = parcel.readInt();
/* 1732 */                      char c3 = (char) i4;
/* 1733 */                      if (c3 == 1) {
/* 1746 */                          arrayListM7901l = qj3.m7901l(i4, parcel);
                                } else if (c3 != 2) {
/* 1737 */                          qj3.m7878K(i4, parcel);
                                } else {
/* 1741 */                          strM7899j6 = qj3.m7899j(i4, parcel);
                                }
                            }
/* 1751 */                  qj3.m7908s(iM7883P3, parcel);
/* 1756 */                  return new zag(strM7899j6, arrayListM7901l);
                        case 3:
/* 1670 */                  int iM7883P4 = qj3.m7883P(parcel);
/* 1678 */                  while (parcel.dataPosition() < iM7883P4) {
/* 1680 */                      int i5 = parcel.readInt();
/* 1684 */                      char c4 = (char) i5;
/* 1685 */                      if (c4 == 1) {
/* 1703 */                          iM7871D = qj3.m7871D(i5, parcel);
                                } else if (c4 != 2) {
/* 1689 */                          qj3.m7878K(i5, parcel);
                                } else {
/* 1700 */                          zatVar = (zat) qj3.m7898i(parcel, i5, zat.CREATOR);
                                }
                            }
/* 1708 */                  qj3.m7908s(iM7883P4, parcel);
/* 1713 */                  return new zai(iM7871D, zatVar);
                        case 4:
/* 1616 */                  int iM7883P5 = qj3.m7883P(parcel);
/* 1620 */                  FastJsonResponse$Field fastJsonResponse$Field = null;
/* 1625 */                  while (parcel.dataPosition() < iM7883P5) {
/* 1627 */                      int i6 = parcel.readInt();
/* 1631 */                      char c5 = (char) i6;
/* 1632 */                      if (c5 == 1) {
/* 1656 */                          iM7871D = qj3.m7871D(i6, parcel);
                                } else if (c5 == 2) {
/* 1651 */                          strM7899j5 = qj3.m7899j(i6, parcel);
                                } else if (c5 != 3) {
/* 1638 */                          qj3.m7878K(i6, parcel);
                                } else {
/* 1648 */                          fastJsonResponse$Field = (FastJsonResponse$Field) qj3.m7898i(parcel, i6, FastJsonResponse$Field.CREATOR);
                                }
                            }
/* 1661 */                  qj3.m7908s(iM7883P5, parcel);
/* 1666 */                  return new zam(fastJsonResponse$Field, strM7899j5, iM7871D);
                        case 5:
/* 1557 */                  int iM7883P6 = qj3.m7883P(parcel);
/* 1561 */                  zav zavVar = null;
/* 1566 */                  while (parcel.dataPosition() < iM7883P6) {
/* 1568 */                      int i7 = parcel.readInt();
/* 1572 */                      char c6 = (char) i7;
/* 1573 */                      if (c6 == 1) {
/* 1602 */                          iM7871D = qj3.m7871D(i7, parcel);
                                } else if (c6 == 2) {
/* 1599 */                          connectionResult = (ConnectionResult) qj3.m7898i(parcel, i7, ConnectionResult.CREATOR);
                                } else if (c6 != 3) {
/* 1579 */                          qj3.m7878K(i7, parcel);
                                } else {
/* 1589 */                          zavVar = (zav) qj3.m7898i(parcel, i7, zav.CREATOR);
                                }
                            }
/* 1607 */                  qj3.m7908s(iM7883P6, parcel);
/* 1612 */                  return new zak(iM7871D, connectionResult, zavVar);
                        case 6:
/* 1450 */                  int iM7883P7 = qj3.m7883P(parcel);
/* 1457 */                  int iM7871D6 = -1;
/* 1459 */                  long jM7873F = 0;
/* 1460 */                  long jM7873F2 = 0;
/* 1462 */                  int iM7871D7 = 0;
/* 1463 */                  int iM7871D8 = 0;
/* 1464 */                  int iM7871D9 = 0;
/* 1465 */                  int iM7871D10 = 0;
/* 1467 */                  String strM7899j7 = null;
/* 1469 */                  String strM7899j8 = null;
/* 1475 */                  while (parcel.dataPosition() < iM7883P7) {
/* 1477 */                      int i8 = parcel.readInt();
                                switch ((char) i8) {
                                    case 1:
/* 1542 */                              iM7871D7 = qj3.m7871D(i8, parcel);
                                        break;
                                    case 2:
/* 1536 */                              iM7871D8 = qj3.m7871D(i8, parcel);
                                        break;
                                    case 3:
/* 1530 */                              iM7871D9 = qj3.m7871D(i8, parcel);
                                        break;
                                    case 4:
/* 1524 */                              jM7873F = qj3.m7873F(i8, parcel);
                                        break;
                                    case 5:
/* 1517 */                              jM7873F2 = qj3.m7873F(i8, parcel);
                                        break;
                                    case 6:
/* 1510 */                              strM7899j7 = qj3.m7899j(i8, parcel);
                                        break;
                                    case 7:
/* 1503 */                              strM7899j8 = qj3.m7899j(i8, parcel);
                                        break;
                                    case '\b':
/* 1496 */                              iM7871D10 = qj3.m7871D(i8, parcel);
                                        break;
                                    case '\t':
/* 1489 */                              iM7871D6 = qj3.m7871D(i8, parcel);
                                        break;
                                    default:
/* 1485 */                              qj3.m7878K(i8, parcel);
                                        break;
                                }
                            }
/* 1548 */                  qj3.m7908s(iM7883P7, parcel);
/* 1553 */                  return new MethodInvocation(iM7871D7, iM7871D8, iM7871D9, jM7873F, jM7873F2, strM7899j7, strM7899j8, iM7871D10, iM7871D6);
                        case 7:
/* 1398 */                  int iM7883P8 = qj3.m7883P(parcel);
/* 1402 */                  String strM7899j9 = null;
/* 1407 */                  while (parcel.dataPosition() < iM7883P8) {
/* 1409 */                      int i9 = parcel.readInt();
/* 1413 */                      char c7 = (char) i9;
/* 1414 */                      if (c7 == 1) {
/* 1436 */                          iM7871D = qj3.m7871D(i9, parcel);
                                } else if (c7 == 2) {
/* 1431 */                          arrayListM7903n = qj3.m7903n(parcel, i9, zal.CREATOR);
                                } else if (c7 != 3) {
/* 1420 */                          qj3.m7878K(i9, parcel);
                                } else {
/* 1424 */                          strM7899j9 = qj3.m7899j(i9, parcel);
                                }
                            }
/* 1441 */                  qj3.m7908s(iM7883P8, parcel);
/* 1446 */                  return new zan(iM7871D, strM7899j9, arrayListM7903n);
                        case 8:
/* 1346 */                  int iM7883P9 = qj3.m7883P(parcel);
/* 1350 */                  ArrayList arrayListM7903n2 = null;
/* 1355 */                  while (parcel.dataPosition() < iM7883P9) {
/* 1357 */                      int i10 = parcel.readInt();
/* 1361 */                      char c8 = (char) i10;
/* 1362 */                      if (c8 == 1) {
/* 1384 */                          iM7871D = qj3.m7871D(i10, parcel);
                                } else if (c8 == 2) {
/* 1379 */                          strM7899j4 = qj3.m7899j(i10, parcel);
                                } else if (c8 != 3) {
/* 1368 */                          qj3.m7878K(i10, parcel);
                                } else {
/* 1374 */                          arrayListM7903n2 = qj3.m7903n(parcel, i10, zam.CREATOR);
                                }
                            }
/* 1389 */                  qj3.m7908s(iM7883P9, parcel);
/* 1394 */                  return new zal(iM7871D, strM7899j4, arrayListM7903n2);
                        case 9:
/* 1271 */                  int iM7883P10 = qj3.m7883P(parcel);
/* 1275 */                  Parcel parcel2 = null;
/* 1276 */                  zan zanVar = null;
/* 1281 */                  while (parcel.dataPosition() < iM7883P10) {
/* 1283 */                      int i11 = parcel.readInt();
/* 1287 */                      char c9 = (char) i11;
/* 1288 */                      if (c9 == 1) {
/* 1332 */                          iM7871D = qj3.m7871D(i11, parcel);
                                } else if (c9 == 2) {
/* 1307 */                          int iM7875H = qj3.m7875H(i11, parcel);
/* 1311 */                          int iDataPosition = parcel.dataPosition();
/* 1315 */                          if (iM7875H == 0) {
/* 1317 */                              parcel2 = null;
                                    } else {
/* 1319 */                              Parcel parcelObtain = Parcel.obtain();
/* 1323 */                              parcelObtain.appendFrom(parcel, iDataPosition, iM7875H);
/* 1327 */                              parcel.setDataPosition(iDataPosition + iM7875H);
/* 1330 */                              parcel2 = parcelObtain;
                                    }
                                } else if (c9 != 3) {
/* 1294 */                          qj3.m7878K(i11, parcel);
                                } else {
/* 1304 */                          zanVar = (zan) qj3.m7898i(parcel, i11, zan.CREATOR);
                                }
                            }
/* 1337 */                  qj3.m7908s(iM7883P10, parcel);
/* 1342 */                  return new SafeParcelResponse(iM7871D, parcel2, zanVar);
                        case 10:
/* 1205 */                  int iM7883P11 = qj3.m7883P(parcel);
/* 1209 */                  int iM7871D11 = 0;
/* 1210 */                  GoogleSignInAccount googleSignInAccount2 = null;
/* 1215 */                  while (parcel.dataPosition() < iM7883P11) {
/* 1217 */                      int i12 = parcel.readInt();
/* 1221 */                      char c10 = (char) i12;
/* 1222 */                      if (c10 == 1) {
/* 1257 */                          iM7871D = qj3.m7871D(i12, parcel);
                                } else if (c10 == 2) {
/* 1254 */                          account = (Account) qj3.m7898i(parcel, i12, Account.CREATOR);
                                } else if (c10 == 3) {
/* 1243 */                          iM7871D11 = qj3.m7871D(i12, parcel);
                                } else if (c10 != 4) {
/* 1230 */                          qj3.m7878K(i12, parcel);
                                } else {
/* 1240 */                          googleSignInAccount2 = (GoogleSignInAccount) qj3.m7898i(parcel, i12, GoogleSignInAccount.CREATOR);
                                }
                            }
/* 1262 */                  qj3.m7908s(iM7883P11, parcel);
/* 1267 */                  return new zat(iM7871D, account, iM7871D11, googleSignInAccount2);
                        case 11:
/* 1132 */                  int iM7883P12 = qj3.m7883P(parcel);
/* 1136 */                  int iM7871D12 = 0;
/* 1137 */                  boolean zM7914y = false;
/* 1138 */                  boolean zM7914y2 = false;
/* 1139 */                  IBinder iBinderM7870C = null;
/* 1140 */                  ConnectionResult connectionResult2 = null;
/* 1145 */                  while (parcel.dataPosition() < iM7883P12) {
/* 1147 */                      int i13 = parcel.readInt();
/* 1151 */                      char c11 = (char) i13;
/* 1152 */                      if (c11 == 1) {
/* 1191 */                          iM7871D12 = qj3.m7871D(i13, parcel);
                                } else if (c11 == 2) {
/* 1186 */                          iBinderM7870C = qj3.m7870C(i13, parcel);
                                } else if (c11 == 3) {
/* 1183 */                          connectionResult2 = (ConnectionResult) qj3.m7898i(parcel, i13, ConnectionResult.CREATOR);
                                } else if (c11 == 4) {
/* 1171 */                          zM7914y = qj3.m7914y(i13, parcel);
                                } else if (c11 != 5) {
/* 1162 */                          qj3.m7878K(i13, parcel);
                                } else {
/* 1166 */                          zM7914y2 = qj3.m7914y(i13, parcel);
                                }
                            }
/* 1196 */                  qj3.m7908s(iM7883P12, parcel);
/* 1201 */                  return new zav(iM7871D12, iBinderM7870C, connectionResult2, zM7914y, zM7914y2);
                        case 12:
/* 1070 */                  int iM7883P13 = qj3.m7883P(parcel);
/* 1074 */                  int iM7871D13 = 0;
/* 1075 */                  int iM7871D14 = 0;
/* 1080 */                  while (parcel.dataPosition() < iM7883P13) {
/* 1082 */                      int i14 = parcel.readInt();
/* 1086 */                      char c12 = (char) i14;
/* 1087 */                      if (c12 == 1) {
/* 1118 */                          iM7871D = qj3.m7871D(i14, parcel);
                                } else if (c12 == 2) {
/* 1113 */                          iM7871D13 = qj3.m7871D(i14, parcel);
                                } else if (c12 == 3) {
/* 1108 */                          iM7871D14 = qj3.m7871D(i14, parcel);
                                } else if (c12 != 4) {
/* 1095 */                          qj3.m7878K(i14, parcel);
                                } else {
/* 1105 */                          scopeArr = (Scope[]) qj3.m7902m(parcel, i14, Scope.CREATOR);
                                }
                            }
/* 1123 */                  qj3.m7908s(iM7883P13, parcel);
/* 1128 */                  return new zax(iM7871D, iM7871D13, iM7871D14, scopeArr);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 981 */                   int iM7883P14 = qj3.m7883P(parcel);
/* 985 */                   String strM7899j10 = null;
/* 986 */                   String strM7899j11 = null;
/* 987 */                   Uri uri2 = null;
/* 988 */                   ArrayList arrayListM7903n3 = null;
/* 989 */                   String strM7899j12 = null;
/* 990 */                   String strM7899j13 = null;
/* 992 */                   String strM7899j14 = null;
/* 994 */                   String strM7899j15 = null;
/* 1000 */                  while (parcel.dataPosition() < iM7883P14) {
/* 1002 */                      int i15 = parcel.readInt();
                                switch ((char) i15) {
                                    case 1:
/* 1056 */                              strM7899j10 = qj3.m7899j(i15, parcel);
                                        break;
                                    case 2:
/* 1051 */                              strM7899j11 = qj3.m7899j(i15, parcel);
                                        break;
                                    case 3:
/* 1048 */                              uri2 = (Uri) qj3.m7898i(parcel, i15, Uri.CREATOR);
                                        break;
                                    case 4:
/* 1036 */                              arrayListM7903n3 = qj3.m7903n(parcel, i15, IdToken.CREATOR);
                                        break;
                                    case 5:
/* 1029 */                              strM7899j12 = qj3.m7899j(i15, parcel);
                                        break;
                                    case 6:
/* 1024 */                              strM7899j13 = qj3.m7899j(i15, parcel);
                                        break;
                                    case 7:
                                    case '\b':
                                    default:
/* 1010 */                              qj3.m7878K(i15, parcel);
                                        break;
                                    case '\t':
/* 1019 */                              strM7899j14 = qj3.m7899j(i15, parcel);
                                        break;
                                    case '\n':
/* 1014 */                              strM7899j15 = qj3.m7899j(i15, parcel);
                                        break;
                                }
                            }
/* 1061 */                  qj3.m7908s(iM7883P14, parcel);
/* 1066 */                  return new Credential(strM7899j10, strM7899j11, uri2, arrayListM7903n3, strM7899j12, strM7899j13, strM7899j14, strM7899j15);
                        case 14:
/* 913 */                   int iM7883P15 = qj3.m7883P(parcel);
/* 917 */                   int iM7871D15 = 0;
/* 918 */                   int iM7871D16 = 0;
/* 919 */                   boolean zM7914y3 = false;
/* 920 */                   boolean zM7914y4 = false;
/* 921 */                   boolean zM7914y5 = false;
/* 926 */                   while (parcel.dataPosition() < iM7883P15) {
/* 928 */                       int i16 = parcel.readInt();
/* 932 */                       char c13 = (char) i16;
/* 933 */                       if (c13 == 1) {
/* 967 */                           zM7914y3 = qj3.m7914y(i16, parcel);
                                } else if (c13 == 2) {
/* 962 */                           zM7914y4 = qj3.m7914y(i16, parcel);
                                } else if (c13 == 3) {
/* 957 */                           zM7914y5 = qj3.m7914y(i16, parcel);
                                } else if (c13 == 4) {
/* 952 */                           iM7871D16 = qj3.m7871D(i16, parcel);
                                } else if (c13 != 1000) {
/* 943 */                           qj3.m7878K(i16, parcel);
                                } else {
/* 947 */                           iM7871D15 = qj3.m7871D(i16, parcel);
                                }
                            }
/* 972 */                   qj3.m7908s(iM7883P15, parcel);
/* 977 */                   return new CredentialPickerConfig(iM7871D15, iM7871D16, zM7914y3, zM7914y4, zM7914y5);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 873 */                   int iM7883P16 = qj3.m7883P(parcel);
/* 881 */                   while (parcel.dataPosition() < iM7883P16) {
/* 883 */                       int i17 = parcel.readInt();
/* 888 */                       if (((char) i17) != 1) {
/* 890 */                           qj3.m7878K(i17, parcel);
                                } else {
/* 901 */                           pendingIntent3 = (PendingIntent) qj3.m7898i(parcel, i17, PendingIntent.CREATOR);
                                }
                            }
/* 904 */                   qj3.m7908s(iM7883P16, parcel);
/* 909 */                   return new BeginSignInResult(pendingIntent3);
                        case 16:
/* 797 */                   int iM7883P17 = qj3.m7883P(parcel);
/* 801 */                   String strM7899j16 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 803 */                   String strM7899j17 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 808 */                   while (parcel.dataPosition() < iM7883P17) {
/* 810 */                       int i18 = parcel.readInt();
/* 814 */                       char c14 = (char) i18;
/* 815 */                       if (c14 == 4) {
/* 843 */                           strM7899j16 = qj3.m7899j(i18, parcel);
                                } else if (c14 == 7) {
/* 840 */                           googleSignInAccount = (GoogleSignInAccount) qj3.m7898i(parcel, i18, GoogleSignInAccount.CREATOR);
                                } else if (c14 != '\b') {
/* 824 */                           qj3.m7878K(i18, parcel);
                                } else {
/* 828 */                           strM7899j17 = qj3.m7899j(i18, parcel);
                                }
                            }
/* 848 */                   qj3.m7908s(iM7883P17, parcel);
/* 853 */                   SignInAccount signInAccount = new SignInAccount();
/* 856 */                   signInAccount.f3396b = googleSignInAccount;
/* 860 */                   kb1.m6059l(strM7899j16, "8.3 and 8.4 SDKs require non-null email");
/* 863 */                   signInAccount.f3395a = strM7899j16;
/* 867 */                   kb1.m6059l(strM7899j17, "8.3 and 8.4 SDKs require non-null userId");
/* 870 */                   signInAccount.f3397c = strM7899j17;
/* 872 */                   return signInAccount;
                        case 17:
/* 696 */                   int iM7883P18 = qj3.m7883P(parcel);
/* 700 */                   int iM7871D17 = 0;
/* 701 */                   boolean zM7914y6 = false;
/* 702 */                   boolean zM7914y7 = false;
/* 704 */                   boolean zM7914y8 = false;
/* 706 */                   String[] strArrM7900k2 = null;
/* 707 */                   CredentialPickerConfig credentialPickerConfig = null;
/* 708 */                   CredentialPickerConfig credentialPickerConfig2 = null;
/* 709 */                   String strM7899j18 = null;
/* 711 */                   String strM7899j19 = null;
/* 717 */                   while (parcel.dataPosition() < iM7883P18) {
/* 719 */                       int i19 = parcel.readInt();
/* 723 */                       char c15 = (char) i19;
/* 724 */                       if (c15 != 1000) {
                                    switch (c15) {
                                        case 1:
/* 778 */                                   zM7914y6 = qj3.m7914y(i19, parcel);
                                            break;
                                        case 2:
/* 773 */                                   strArrM7900k2 = qj3.m7900k(i19, parcel);
                                            break;
                                        case 3:
/* 770 */                                   credentialPickerConfig = (CredentialPickerConfig) qj3.m7898i(parcel, i19, CredentialPickerConfig.CREATOR);
                                            break;
                                        case 4:
/* 760 */                                   credentialPickerConfig2 = (CredentialPickerConfig) qj3.m7898i(parcel, i19, CredentialPickerConfig.CREATOR);
                                            break;
                                        case 5:
/* 748 */                                   zM7914y7 = qj3.m7914y(i19, parcel);
                                            break;
                                        case 6:
/* 743 */                                   strM7899j18 = qj3.m7899j(i19, parcel);
                                            break;
                                        case 7:
/* 738 */                                   strM7899j19 = qj3.m7899j(i19, parcel);
                                            break;
                                        case '\b':
/* 733 */                                   zM7914y8 = qj3.m7914y(i19, parcel);
                                            break;
                                        default:
/* 729 */                                   qj3.m7878K(i19, parcel);
                                            break;
                                    }
                                } else {
/* 783 */                           iM7871D17 = qj3.m7871D(i19, parcel);
                                }
                            }
/* 788 */                   qj3.m7908s(iM7883P18, parcel);
/* 793 */                   return new CredentialRequest(iM7871D17, zM7914y6, strArrM7900k2, credentialPickerConfig, credentialPickerConfig2, zM7914y7, strM7899j18, strM7899j19, zM7914y8);
                        case 18:
/* 661 */                   int iM7883P19 = qj3.m7883P(parcel);
/* 669 */                   while (parcel.dataPosition() < iM7883P19) {
/* 671 */                       int i20 = parcel.readInt();
/* 676 */                       if (((char) i20) != 1) {
/* 678 */                           qj3.m7878K(i20, parcel);
                                } else {
/* 682 */                           iM7871D = qj3.m7871D(i20, parcel);
                                }
                            }
/* 687 */                   qj3.m7908s(iM7883P19, parcel);
/* 692 */                   return new GetPhoneNumberHintIntentRequest(iM7871D);
                        case 19:
/* 572 */                   int iM7883P20 = qj3.m7883P(parcel);
/* 576 */                   int iM7871D18 = 0;
/* 577 */                   boolean zM7914y9 = false;
/* 578 */                   boolean zM7914y10 = false;
/* 579 */                   boolean zM7914y11 = false;
/* 581 */                   CredentialPickerConfig credentialPickerConfig3 = null;
/* 582 */                   String[] strArrM7900k3 = null;
/* 583 */                   String strM7899j20 = null;
/* 585 */                   String strM7899j21 = null;
/* 591 */                   while (parcel.dataPosition() < iM7883P20) {
/* 593 */                       int i21 = parcel.readInt();
/* 597 */                       char c16 = (char) i21;
/* 598 */                       if (c16 != 1000) {
                                    switch (c16) {
                                        case 1:
/* 644 */                                   credentialPickerConfig3 = (CredentialPickerConfig) qj3.m7898i(parcel, i21, CredentialPickerConfig.CREATOR);
                                            break;
                                        case 2:
/* 632 */                                   zM7914y9 = qj3.m7914y(i21, parcel);
                                            break;
                                        case 3:
/* 627 */                                   zM7914y10 = qj3.m7914y(i21, parcel);
                                            break;
                                        case 4:
/* 622 */                                   strArrM7900k3 = qj3.m7900k(i21, parcel);
                                            break;
                                        case 5:
/* 617 */                                   zM7914y11 = qj3.m7914y(i21, parcel);
                                            break;
                                        case 6:
/* 612 */                                   strM7899j20 = qj3.m7899j(i21, parcel);
                                            break;
                                        case 7:
/* 607 */                                   strM7899j21 = qj3.m7899j(i21, parcel);
                                            break;
                                        default:
/* 603 */                                   qj3.m7878K(i21, parcel);
                                            break;
                                    }
                                } else {
/* 647 */                           iM7871D18 = qj3.m7871D(i21, parcel);
                                }
                            }
/* 652 */                   qj3.m7908s(iM7883P20, parcel);
/* 657 */                   return new HintRequest(iM7871D18, credentialPickerConfig3, zM7914y9, zM7914y10, strArrM7900k3, zM7914y11, strM7899j20, strM7899j21);
                        case 20:
/* 505 */                   int iM7883P21 = qj3.m7883P(parcel);
/* 509 */                   int iM7871D19 = 0;
/* 510 */                   boolean zM7914y12 = false;
/* 511 */                   String strM7899j22 = null;
/* 512 */                   String strM7899j23 = null;
/* 513 */                   String strM7899j24 = null;
/* 514 */                   String strM7899j25 = null;
/* 519 */                   while (parcel.dataPosition() < iM7883P21) {
/* 521 */                       int i22 = parcel.readInt();
                                switch ((char) i22) {
                                    case 1:
/* 558 */                               strM7899j22 = qj3.m7899j(i22, parcel);
                                        break;
                                    case 2:
/* 553 */                               strM7899j23 = qj3.m7899j(i22, parcel);
                                        break;
                                    case 3:
/* 548 */                               strM7899j24 = qj3.m7899j(i22, parcel);
                                        break;
                                    case 4:
/* 543 */                               strM7899j25 = qj3.m7899j(i22, parcel);
                                        break;
                                    case 5:
/* 538 */                               zM7914y12 = qj3.m7914y(i22, parcel);
                                        break;
                                    case 6:
/* 533 */                               iM7871D19 = qj3.m7871D(i22, parcel);
                                        break;
                                    default:
/* 529 */                               qj3.m7878K(i22, parcel);
                                        break;
                                }
                            }
/* 563 */                   qj3.m7908s(iM7883P21, parcel);
/* 568 */                   return new GetSignInIntentRequest(iM7871D19, strM7899j22, strM7899j23, strM7899j24, strM7899j25, zM7914y12);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 462 */                   int iM7883P22 = qj3.m7883P(parcel);
/* 466 */                   String strM7899j26 = null;
/* 471 */                   while (parcel.dataPosition() < iM7883P22) {
/* 473 */                       int i23 = parcel.readInt();
/* 477 */                       char c17 = (char) i23;
/* 478 */                       if (c17 == 1) {
/* 491 */                           strM7899j3 = qj3.m7899j(i23, parcel);
                                } else if (c17 != 2) {
/* 482 */                           qj3.m7878K(i23, parcel);
                                } else {
/* 486 */                           strM7899j26 = qj3.m7899j(i23, parcel);
                                }
                            }
/* 496 */                   qj3.m7908s(iM7883P22, parcel);
/* 501 */                   return new IdToken(strM7899j3, strM7899j26);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 391 */                   int iM7883P23 = qj3.m7883P(parcel);
/* 395 */                   int iM7871D20 = 0;
/* 396 */                   PendingIntent pendingIntent4 = null;
/* 397 */                   String strM7899j27 = null;
/* 398 */                   String strM7899j28 = null;
/* 399 */                   ArrayList arrayListM7901l2 = null;
/* 400 */                   String strM7899j29 = null;
/* 405 */                   while (parcel.dataPosition() < iM7883P23) {
/* 407 */                       int i24 = parcel.readInt();
                                switch ((char) i24) {
                                    case 1:
/* 450 */                               pendingIntent4 = (PendingIntent) qj3.m7898i(parcel, i24, PendingIntent.CREATOR);
                                        break;
                                    case 2:
/* 439 */                               strM7899j27 = qj3.m7899j(i24, parcel);
                                        break;
                                    case 3:
/* 434 */                               strM7899j28 = qj3.m7899j(i24, parcel);
                                        break;
                                    case 4:
/* 429 */                               arrayListM7901l2 = qj3.m7901l(i24, parcel);
                                        break;
                                    case 5:
/* 424 */                               strM7899j29 = qj3.m7899j(i24, parcel);
                                        break;
                                    case 6:
/* 419 */                               iM7871D20 = qj3.m7871D(i24, parcel);
                                        break;
                                    default:
/* 415 */                               qj3.m7878K(i24, parcel);
                                        break;
                                }
                            }
/* 453 */                   qj3.m7908s(iM7883P23, parcel);
/* 458 */                   return new SaveAccountLinkingTokenRequest(pendingIntent4, strM7899j27, strM7899j28, arrayListM7901l2, strM7899j29, iM7871D20);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 351 */                   int iM7883P24 = qj3.m7883P(parcel);
/* 359 */                   while (parcel.dataPosition() < iM7883P24) {
/* 361 */                       int i25 = parcel.readInt();
/* 366 */                       if (((char) i25) != 1) {
/* 368 */                           qj3.m7878K(i25, parcel);
                                } else {
/* 379 */                           pendingIntent2 = (PendingIntent) qj3.m7898i(parcel, i25, PendingIntent.CREATOR);
                                }
                            }
/* 382 */                   qj3.m7908s(iM7883P24, parcel);
/* 387 */                   return new SaveAccountLinkingTokenResult(pendingIntent2);
                        case 24:
/* 296 */                   int iM7883P25 = qj3.m7883P(parcel);
/* 300 */                   String strM7899j30 = null;
/* 305 */                   while (parcel.dataPosition() < iM7883P25) {
/* 307 */                       int i26 = parcel.readInt();
/* 311 */                       char c18 = (char) i26;
/* 312 */                       if (c18 == 1) {
/* 339 */                           signInPassword = (SignInPassword) qj3.m7898i(parcel, i26, SignInPassword.CREATOR);
                                } else if (c18 == 2) {
/* 327 */                           strM7899j30 = qj3.m7899j(i26, parcel);
                                } else if (c18 != 3) {
/* 318 */                           qj3.m7878K(i26, parcel);
                                } else {
/* 322 */                           iM7871D = qj3.m7871D(i26, parcel);
                                }
                            }
/* 342 */                   qj3.m7908s(iM7883P25, parcel);
/* 347 */                   return new SavePasswordRequest(signInPassword, strM7899j30, iM7871D);
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 256 */                   int iM7883P26 = qj3.m7883P(parcel);
/* 264 */                   while (parcel.dataPosition() < iM7883P26) {
/* 266 */                       int i27 = parcel.readInt();
/* 271 */                       if (((char) i27) != 1) {
/* 273 */                           qj3.m7878K(i27, parcel);
                                } else {
/* 284 */                           pendingIntent = (PendingIntent) qj3.m7898i(parcel, i27, PendingIntent.CREATOR);
                                }
                            }
/* 287 */                   qj3.m7908s(iM7883P26, parcel);
/* 292 */                   return new SavePasswordResult(pendingIntent);
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 156 */                   int iM7883P27 = qj3.m7883P(parcel);
/* 160 */                   String strM7899j31 = null;
/* 161 */                   String strM7899j32 = null;
/* 162 */                   String strM7899j33 = null;
/* 163 */                   String strM7899j34 = null;
/* 164 */                   Uri uri3 = null;
/* 165 */                   String strM7899j35 = null;
/* 167 */                   String strM7899j36 = null;
/* 169 */                   String strM7899j37 = null;
/* 171 */                   PublicKeyCredential publicKeyCredential = null;
/* 177 */                   while (parcel.dataPosition() < iM7883P27) {
/* 179 */                       int i28 = parcel.readInt();
                                switch ((char) i28) {
                                    case 1:
/* 242 */                               strM7899j31 = qj3.m7899j(i28, parcel);
                                        break;
                                    case 2:
/* 237 */                               strM7899j32 = qj3.m7899j(i28, parcel);
                                        break;
                                    case 3:
/* 232 */                               strM7899j33 = qj3.m7899j(i28, parcel);
                                        break;
                                    case 4:
/* 227 */                               strM7899j34 = qj3.m7899j(i28, parcel);
                                        break;
                                    case 5:
/* 224 */                               uri3 = (Uri) qj3.m7898i(parcel, i28, Uri.CREATOR);
                                        break;
                                    case 6:
/* 212 */                               strM7899j35 = qj3.m7899j(i28, parcel);
                                        break;
                                    case 7:
/* 207 */                               strM7899j36 = qj3.m7899j(i28, parcel);
                                        break;
                                    case '\b':
/* 202 */                               strM7899j37 = qj3.m7899j(i28, parcel);
                                        break;
                                    case '\t':
/* 199 */                               publicKeyCredential = (PublicKeyCredential) qj3.m7898i(parcel, i28, PublicKeyCredential.CREATOR);
                                        break;
                                    default:
/* 187 */                               qj3.m7878K(i28, parcel);
                                        break;
                                }
                            }
/* 247 */                   qj3.m7908s(iM7883P27, parcel);
/* 252 */                   return new SignInCredential(strM7899j31, strM7899j32, strM7899j33, strM7899j34, uri3, strM7899j35, strM7899j36, strM7899j37, publicKeyCredential);
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 113 */                   int iM7883P28 = qj3.m7883P(parcel);
/* 117 */                   String strM7899j38 = null;
/* 122 */                   while (parcel.dataPosition() < iM7883P28) {
/* 124 */                       int i29 = parcel.readInt();
/* 128 */                       char c19 = (char) i29;
/* 129 */                       if (c19 == 1) {
/* 142 */                           strM7899j2 = qj3.m7899j(i29, parcel);
                                } else if (c19 != 2) {
/* 133 */                           qj3.m7878K(i29, parcel);
                                } else {
/* 137 */                           strM7899j38 = qj3.m7899j(i29, parcel);
                                }
                            }
/* 147 */                   qj3.m7908s(iM7883P28, parcel);
/* 152 */                   return new SignInPassword(strM7899j2, strM7899j38);
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 66 */                    int iM7883P29 = qj3.m7883P(parcel);
/* 70 */                    GoogleSignInOptions googleSignInOptions = null;
/* 75 */                    while (parcel.dataPosition() < iM7883P29) {
/* 77 */                        int i30 = parcel.readInt();
/* 81 */                        char c20 = (char) i30;
/* 82 */                        if (c20 == 2) {
/* 99 */                            strM7899j = qj3.m7899j(i30, parcel);
                                } else if (c20 != 5) {
/* 86 */                            qj3.m7878K(i30, parcel);
                                } else {
/* 96 */                            googleSignInOptions = (GoogleSignInOptions) qj3.m7898i(parcel, i30, GoogleSignInOptions.CREATOR);
                                }
                            }
/* 104 */                   qj3.m7908s(iM7883P29, parcel);
/* 109 */                   return new SignInConfiguration(strM7899j, googleSignInOptions);
                        default:
/* 19 */                    int iM7883P30 = qj3.m7883P(parcel);
/* 27 */                    while (parcel.dataPosition() < iM7883P30) {
/* 29 */                        int i31 = parcel.readInt();
/* 33 */                        char c21 = (char) i31;
/* 34 */                        if (c21 == 2) {
/* 54 */                            driveId = (DriveId) qj3.m7898i(parcel, i31, DriveId.CREATOR);
                                } else if (c21 != 3) {
/* 38 */                            qj3.m7878K(i31, parcel);
                                } else {
/* 42 */                            iM7871D = qj3.m7871D(i31, parcel);
                                }
                            }
/* 57 */                    qj3.m7908s(iM7883P30, parcel);
/* 62 */                    return new ChangeEvent(driveId, iM7871D);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
                    switch (this.f17444a) {
                        case 0:
/* 93 */                    return new DataHolder[i];
                        case 1:
/* 90 */                    return new WebImage[i];
                        case 2:
/* 87 */                    return new zag[i];
                        case 3:
/* 84 */                    return new zai[i];
                        case 4:
/* 81 */                    return new zam[i];
                        case 5:
/* 78 */                    return new zak[i];
                        case 6:
/* 75 */                    return new MethodInvocation[i];
                        case 7:
/* 72 */                    return new zan[i];
                        case 8:
/* 69 */                    return new zal[i];
                        case 9:
/* 66 */                    return new SafeParcelResponse[i];
                        case 10:
/* 63 */                    return new zat[i];
                        case 11:
/* 60 */                    return new zav[i];
                        case 12:
/* 57 */                    return new zax[i];
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 54 */                    return new Credential[i];
                        case 14:
/* 51 */                    return new CredentialPickerConfig[i];
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 48 */                    return new BeginSignInResult[i];
                        case 16:
/* 45 */                    return new SignInAccount[i];
                        case 17:
/* 42 */                    return new CredentialRequest[i];
                        case 18:
/* 39 */                    return new GetPhoneNumberHintIntentRequest[i];
                        case 19:
/* 36 */                    return new HintRequest[i];
                        case 20:
/* 33 */                    return new GetSignInIntentRequest[i];
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 30 */                    return new IdToken[i];
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 27 */                    return new SaveAccountLinkingTokenRequest[i];
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 24 */                    return new SaveAccountLinkingTokenResult[i];
                        case 24:
/* 21 */                    return new SavePasswordRequest[i];
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 18 */                    return new SavePasswordResult[i];
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 15 */                    return new SignInCredential[i];
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 12 */                    return new SignInPassword[i];
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 9 */                     return new SignInConfiguration[i];
                        default:
/* 6 */                     return new ChangeEvent[i];
                    }
                }
            }
