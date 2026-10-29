            package p000;

            import android.accounts.Account;
            import android.app.PendingIntent;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import androidx.activity.result.ActivityResult;
            import androidx.activity.result.IntentSenderRequest;
            import androidx.versionedparcelable.ParcelImpl;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.ApiMetadata;
            import com.google.android.gms.common.api.ComplianceOptions;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.data.BitmapTeleporter;
            import com.google.android.gms.common.internal.ClientIdentity;
            import com.google.android.gms.common.internal.MethodInvocation;
            import com.google.android.gms.common.internal.TelemetryData;
            import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
            import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
            import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
            import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
            import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
            import com.google.android.gms.common.server.FavaDiagnosticsEntity;
            import com.google.android.gms.common.server.converter.StringToIntConverter;
            import com.google.android.gms.common.server.converter.zaa;
            import com.google.android.gms.common.server.converter.zac;
            import com.google.android.libraries.play.games.internal.zzam;
            import com.google.android.material.badge.BadgeState$State;
            import com.google.android.material.datepicker.DateValidatorPointBackward;
            import com.google.android.material.datepicker.DateValidatorPointForward;
            import com.google.android.material.datepicker.RangeDateSelector;
            import com.google.android.material.datepicker.SingleDateSelector;
            import com.google.android.material.internal.ParcelableSparseBooleanArray;
            import com.google.android.material.internal.ParcelableSparseIntArray;
            import com.google.firebase.Timestamp;
            import com.google.firebase.messaging.RemoteMessage;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.Locale;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qd3 implements Parcelable.Creator {

                /* JADX INFO: renamed from: b */
                public static final qd3 f15495b = new qd3(1);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15496a;

                public /* synthetic */ qd3(int i) {
/* 1 */             this.f15496a = i;
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 13 */            ComplianceOptions complianceOptions = null;
/* 13 */            ArrayList arrayListM7903n = null;
/* 13 */            String strM7899j = null;
/* 13 */            ArrayList arrayListM7903n2 = null;
/* 13 */            ArrayList arrayListM7903n3 = null;
/* 13 */            Intent intent = null;
/* 13 */            StringToIntConverter stringToIntConverter = null;
/* 13 */            PendingIntent pendingIntent = null;
/* 13 */            ArrayList arrayListM7903n4 = null;
/* 13 */            String strM7899j2 = null;
/* 13 */            String strM7899j3 = null;
/* 13 */            ParcelFileDescriptor parcelFileDescriptor = null;
/* 13 */            Bundle bundleM7895f = null;
/* 13 */            Bundle bundleM7895f2 = null;
/* 14 */            boolean zM7914y = false;
/* 14 */            int iM7871D = 0;
/* 14 */            int iM7871D2 = 0;
/* 14 */            int iM7871D3 = 0;
/* 14 */            int iM7871D4 = 0;
/* 14 */            int iM7871D5 = 0;
/* 14 */            int iM7871D6 = 0;
/* 14 */            int iM7871D7 = 0;
/* 14 */            boolean zM7914y2 = false;
/* 14 */            int iM7871D8 = 0;
/* 14 */            int iM7871D9 = 0;
/* 14 */            int iM7871D10 = 0;
                    switch (this.f15496a) {
                        case 0:
/* 1424 */                  return new zzam(parcel.readBundle(qd3.class.getClassLoader()));
                        case 1:
/* 1344 */                  int iDataPosition = parcel.dataPosition();
/* 1355 */                  if (parcel.readInt() != -204102970) {
/* 1406 */                      parcel.setDataPosition(iDataPosition - 4);
/* 1409 */                      return ApiMetadata.f3428d;
                            }
/* 1357 */                  int iM7883P = qj3.m7883P(parcel);
/* 1365 */                  while (parcel.dataPosition() < iM7883P) {
/* 1367 */                      int i = parcel.readInt();
/* 1371 */                      char c = (char) i;
/* 1372 */                      if (c == 1) {
/* 1392 */                          complianceOptions = (ComplianceOptions) qj3.m7898i(parcel, i, ComplianceOptions.CREATOR);
                                } else if (c != 2) {
/* 1376 */                          qj3.m7878K(i, parcel);
                                } else {
/* 1380 */                          zM7914y = qj3.m7914y(i, parcel);
                                }
                            }
/* 1395 */                  qj3.m7908s(iM7883P, parcel);
/* 1400 */                  return new ApiMetadata(complianceOptions, zM7914y);
                        case 2:
/* 1340 */                  return new ActivityResult(parcel);
                        case 3:
/* 1197 */                  BadgeState$State badgeState$State = new BadgeState$State();
/* 1202 */                  badgeState$State.f4431d = 255;
/* 1205 */                  badgeState$State.f4432e = -2;
/* 1207 */                  badgeState$State.f4433f = -2;
/* 1211 */                  badgeState$State.f4421W = Boolean.TRUE;
/* 1217 */                  badgeState$State.f4425a = parcel.readInt();
/* 1225 */                  badgeState$State.f4427b = (Integer) parcel.readSerializable();
/* 1233 */                  badgeState$State.f4429c = (Integer) parcel.readSerializable();
/* 1239 */                  badgeState$State.f4431d = parcel.readInt();
/* 1245 */                  badgeState$State.f4432e = parcel.readInt();
/* 1251 */                  badgeState$State.f4433f = parcel.readInt();
/* 1257 */                  badgeState$State.f4435v = parcel.readString();
/* 1263 */                  badgeState$State.f4436w = parcel.readInt();
/* 1271 */                  badgeState$State.f4420V = (Integer) parcel.readSerializable();
/* 1279 */                  badgeState$State.f4422X = (Integer) parcel.readSerializable();
/* 1287 */                  badgeState$State.f4423Y = (Integer) parcel.readSerializable();
/* 1295 */                  badgeState$State.f4424Z = (Integer) parcel.readSerializable();
/* 1303 */                  badgeState$State.f4426a0 = (Integer) parcel.readSerializable();
/* 1311 */                  badgeState$State.f4428b0 = (Integer) parcel.readSerializable();
/* 1319 */                  badgeState$State.f4430c0 = (Integer) parcel.readSerializable();
/* 1327 */                  badgeState$State.f4421W = (Boolean) parcel.readSerializable();
/* 1335 */                  badgeState$State.f4434i = (Locale) parcel.readSerializable();
/* 1337 */                  return badgeState$State;
                        case 4:
/* 1191 */                  return new DateValidatorPointBackward(parcel.readLong());
                        case 5:
/* 1181 */                  return new DateValidatorPointForward(parcel.readLong());
                        case 6:
/* 1131 */                  parcel.getClass();
/* 1142 */                  Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
/* 1146 */                  parcelable.getClass();
/* 1171 */                  return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
                        case 7:
/* 1127 */                  return new ParcelImpl(parcel);
                        case 8:
/* 1093 */                  int i2 = parcel.readInt();
/* 1099 */                  ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i2);
/* 1102 */                  int[] iArr = new int[i2];
/* 1104 */                  boolean[] zArr = new boolean[i2];
/* 1106 */                  parcel.readIntArray(iArr);
/* 1109 */                  parcel.readBooleanArray(zArr);
/* 1112 */                  for (int i3 = 0; i3 < i2; i3++) {
/* 1118 */                      parcelableSparseBooleanArray.put(iArr[i3], zArr[i3]);
                            }
/* 1124 */                  return parcelableSparseBooleanArray;
                        case 9:
/* 1061 */                  int i4 = parcel.readInt();
/* 1067 */                  ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i4);
/* 1070 */                  int[] iArr2 = new int[i4];
/* 1072 */                  int[] iArr3 = new int[i4];
/* 1074 */                  parcel.readIntArray(iArr2);
/* 1077 */                  parcel.readIntArray(iArr3);
/* 1080 */                  for (int i5 = 0; i5 < i4; i5++) {
/* 1086 */                      parcelableSparseIntArray.put(iArr2[i5], iArr3[i5]);
                            }
/* 1092 */                  return parcelableSparseIntArray;
                        case 10:
/* 1025 */                  RangeDateSelector rangeDateSelector = new RangeDateSelector();
/* 1028 */                  rangeDateSelector.f4634b = null;
/* 1030 */                  rangeDateSelector.f4635c = null;
/* 1032 */                  rangeDateSelector.f4636d = null;
/* 1034 */                  rangeDateSelector.f4637e = null;
/* 1046 */                  rangeDateSelector.f4634b = (Long) parcel.readValue(Long.class.getClassLoader());
/* 1058 */                  rangeDateSelector.f4635c = (Long) parcel.readValue(Long.class.getClassLoader());
/* 1060 */                  return rangeDateSelector;
                        case 11:
/* 987 */                   int iM7883P2 = qj3.m7883P(parcel);
/* 995 */                   while (parcel.dataPosition() < iM7883P2) {
/* 997 */                       int i6 = parcel.readInt();
/* 1002 */                      if (((char) i6) != 2) {
/* 1004 */                          qj3.m7878K(i6, parcel);
                                } else {
/* 1008 */                          bundleM7895f2 = qj3.m7895f(i6, parcel);
                                }
                            }
/* 1014 */                  qj3.m7908s(iM7883P2, parcel);
/* 1019 */                  return new RemoteMessage(bundleM7895f2);
                        case 12:
/* 971 */                   SingleDateSelector singleDateSelector = new SingleDateSelector();
/* 984 */                   singleDateSelector.f4638a = (Long) parcel.readValue(Long.class.getClassLoader());
/* 986 */                   return singleDateSelector;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 952 */                   parcel.getClass();
/* 965 */                   return new Timestamp(parcel.readInt(), parcel.readLong());
                        case 14:
/* 902 */                   int iM7883P3 = qj3.m7883P(parcel);
/* 906 */                   int iM7871D11 = 0;
/* 911 */                   while (parcel.dataPosition() < iM7883P3) {
/* 913 */                       int i7 = parcel.readInt();
/* 917 */                       char c2 = (char) i7;
/* 918 */                       if (c2 == 1) {
/* 938 */                           iM7871D10 = qj3.m7871D(i7, parcel);
                                } else if (c2 == 2) {
/* 933 */                           iM7871D11 = qj3.m7871D(i7, parcel);
                                } else if (c2 != 3) {
/* 924 */                           qj3.m7878K(i7, parcel);
                                } else {
/* 928 */                           bundleM7895f = qj3.m7895f(i7, parcel);
                                }
                            }
/* 943 */                   qj3.m7908s(iM7883P3, parcel);
/* 948 */                   return new GoogleSignInOptionsExtensionParcelable(iM7871D10, iM7871D11, bundleM7895f);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 847 */                   int iM7883P4 = qj3.m7883P(parcel);
/* 851 */                   int iM7871D12 = 0;
/* 856 */                   while (parcel.dataPosition() < iM7883P4) {
/* 858 */                       int i8 = parcel.readInt();
/* 862 */                       char c3 = (char) i8;
/* 863 */                       if (c3 == 1) {
/* 888 */                           iM7871D9 = qj3.m7871D(i8, parcel);
                                } else if (c3 == 2) {
/* 885 */                           parcelFileDescriptor = (ParcelFileDescriptor) qj3.m7898i(parcel, i8, ParcelFileDescriptor.CREATOR);
                                } else if (c3 != 3) {
/* 869 */                           qj3.m7878K(i8, parcel);
                                } else {
/* 873 */                           iM7871D12 = qj3.m7871D(i8, parcel);
                                }
                            }
/* 893 */                   qj3.m7908s(iM7883P4, parcel);
/* 898 */                   return new BitmapTeleporter(iM7871D9, parcelFileDescriptor, iM7871D12);
                        case 16:
/* 805 */                   int iM7883P5 = qj3.m7883P(parcel);
/* 813 */                   while (parcel.dataPosition() < iM7883P5) {
/* 815 */                       int i9 = parcel.readInt();
/* 819 */                       char c4 = (char) i9;
/* 820 */                       if (c4 == 1) {
/* 833 */                           iM7871D8 = qj3.m7871D(i9, parcel);
                                } else if (c4 != 2) {
/* 824 */                           qj3.m7878K(i9, parcel);
                                } else {
/* 828 */                           strM7899j3 = qj3.m7899j(i9, parcel);
                                }
                            }
/* 838 */                   qj3.m7908s(iM7883P5, parcel);
/* 843 */                   return new ClientIdentity(iM7871D8, strM7899j3);
                        case 17:
/* 762 */                   int iM7883P6 = qj3.m7883P(parcel);
/* 766 */                   int iM7871D13 = 0;
/* 771 */                   while (parcel.dataPosition() < iM7883P6) {
/* 773 */                       int i10 = parcel.readInt();
/* 777 */                       char c5 = (char) i10;
/* 778 */                       if (c5 == 1) {
/* 791 */                           zM7914y2 = qj3.m7914y(i10, parcel);
                                } else if (c5 != 2) {
/* 782 */                           qj3.m7878K(i10, parcel);
                                } else {
/* 786 */                           iM7871D13 = qj3.m7871D(i10, parcel);
                                }
                            }
/* 796 */                   qj3.m7908s(iM7883P6, parcel);
/* 801 */                   return new ModuleAvailabilityResponse(zM7914y2, iM7871D13);
                        case 18:
/* 712 */                   int iM7883P7 = qj3.m7883P(parcel);
/* 716 */                   int iM7871D14 = 0;
/* 721 */                   while (parcel.dataPosition() < iM7883P7) {
/* 723 */                       int i11 = parcel.readInt();
/* 727 */                       char c6 = (char) i11;
/* 728 */                       if (c6 == 1) {
/* 748 */                           iM7871D7 = qj3.m7871D(i11, parcel);
                                } else if (c6 == 2) {
/* 743 */                           strM7899j2 = qj3.m7899j(i11, parcel);
                                } else if (c6 != 3) {
/* 734 */                           qj3.m7878K(i11, parcel);
                                } else {
/* 738 */                           iM7871D14 = qj3.m7871D(i11, parcel);
                                }
                            }
/* 753 */                   qj3.m7908s(iM7883P7, parcel);
/* 758 */                   return new FavaDiagnosticsEntity(iM7871D7, strM7899j2, iM7871D14);
                        case 19:
/* 668 */                   int iM7883P8 = qj3.m7883P(parcel);
/* 676 */                   while (parcel.dataPosition() < iM7883P8) {
/* 678 */                       int i12 = parcel.readInt();
/* 682 */                       char c7 = (char) i12;
/* 683 */                       if (c7 == 1) {
/* 698 */                           iM7871D6 = qj3.m7871D(i12, parcel);
                                } else if (c7 != 2) {
/* 687 */                           qj3.m7878K(i12, parcel);
                                } else {
/* 693 */                           arrayListM7903n4 = qj3.m7903n(parcel, i12, MethodInvocation.CREATOR);
                                }
                            }
/* 703 */                   qj3.m7908s(iM7883P8, parcel);
/* 708 */                   return new TelemetryData(iM7871D6, arrayListM7903n4);
                        case 20:
/* 628 */                   int iM7883P9 = qj3.m7883P(parcel);
/* 636 */                   while (parcel.dataPosition() < iM7883P9) {
/* 638 */                       int i13 = parcel.readInt();
/* 643 */                       if (((char) i13) != 1) {
/* 645 */                           qj3.m7878K(i13, parcel);
                                } else {
/* 656 */                           pendingIntent = (PendingIntent) qj3.m7898i(parcel, i13, PendingIntent.CREATOR);
                                }
                            }
/* 659 */                   qj3.m7908s(iM7883P9, parcel);
/* 664 */                   return new ModuleInstallIntentResponse(pendingIntent);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 581 */                   int iM7883P10 = qj3.m7883P(parcel);
/* 589 */                   while (parcel.dataPosition() < iM7883P10) {
/* 591 */                       int i14 = parcel.readInt();
/* 595 */                       char c8 = (char) i14;
/* 596 */                       if (c8 == 1) {
/* 614 */                           iM7871D5 = qj3.m7871D(i14, parcel);
                                } else if (c8 != 2) {
/* 600 */                           qj3.m7878K(i14, parcel);
                                } else {
/* 611 */                           stringToIntConverter = (StringToIntConverter) qj3.m7898i(parcel, i14, StringToIntConverter.CREATOR);
                                }
                            }
/* 619 */                   qj3.m7908s(iM7883P10, parcel);
/* 624 */                   return new zaa(iM7871D5, stringToIntConverter);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 526 */                   int iM7883P11 = qj3.m7883P(parcel);
/* 530 */                   int iM7871D15 = 0;
/* 535 */                   while (parcel.dataPosition() < iM7883P11) {
/* 537 */                       int i15 = parcel.readInt();
/* 541 */                       char c9 = (char) i15;
/* 542 */                       if (c9 == 1) {
/* 567 */                           iM7871D4 = qj3.m7871D(i15, parcel);
                                } else if (c9 == 2) {
/* 562 */                           iM7871D15 = qj3.m7871D(i15, parcel);
                                } else if (c9 != 3) {
/* 548 */                           qj3.m7878K(i15, parcel);
                                } else {
/* 559 */                           intent = (Intent) qj3.m7898i(parcel, i15, Intent.CREATOR);
                                }
                            }
/* 572 */                   qj3.m7908s(iM7883P11, parcel);
/* 577 */                   return new com.google.android.gms.signin.internal.zaa(iM7871D4, iM7871D15, intent);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 391 */                   int iM7883P12 = qj3.m7883P(parcel);
/* 397 */                   long jM7873F = 0;
/* 399 */                   String strM7899j4 = null;
/* 400 */                   String strM7899j5 = null;
/* 401 */                   String strM7899j6 = null;
/* 402 */                   String strM7899j7 = null;
/* 403 */                   Uri uri = null;
/* 404 */                   String strM7899j8 = null;
/* 406 */                   String strM7899j9 = null;
/* 408 */                   ArrayList arrayListM7903n5 = null;
/* 410 */                   String strM7899j10 = null;
/* 412 */                   String strM7899j11 = null;
/* 414 */                   int iM7871D16 = 0;
/* 419 */                   while (parcel.dataPosition() < iM7883P12) {
/* 421 */                       int i16 = parcel.readInt();
                                switch ((char) i16) {
                                    case 1:
/* 511 */                               iM7871D16 = qj3.m7871D(i16, parcel);
                                        break;
                                    case 2:
/* 505 */                               strM7899j4 = qj3.m7899j(i16, parcel);
                                        break;
                                    case 3:
/* 499 */                               strM7899j5 = qj3.m7899j(i16, parcel);
                                        break;
                                    case 4:
/* 493 */                               strM7899j6 = qj3.m7899j(i16, parcel);
                                        break;
                                    case 5:
/* 487 */                               strM7899j7 = qj3.m7899j(i16, parcel);
                                        break;
                                    case 6:
/* 483 */                               uri = (Uri) qj3.m7898i(parcel, i16, Uri.CREATOR);
                                        break;
                                    case 7:
/* 470 */                               strM7899j8 = qj3.m7899j(i16, parcel);
                                        break;
                                    case '\b':
/* 463 */                               jM7873F = qj3.m7873F(i16, parcel);
                                        break;
                                    case '\t':
/* 456 */                               strM7899j9 = qj3.m7899j(i16, parcel);
                                        break;
                                    case '\n':
/* 449 */                               arrayListM7903n5 = qj3.m7903n(parcel, i16, Scope.CREATOR);
                                        break;
                                    case 11:
/* 440 */                               strM7899j10 = qj3.m7899j(i16, parcel);
                                        break;
                                    case '\f':
/* 433 */                               strM7899j11 = qj3.m7899j(i16, parcel);
                                        break;
                                    default:
/* 429 */                               qj3.m7878K(i16, parcel);
                                        break;
                                }
                            }
/* 517 */                   qj3.m7908s(iM7883P12, parcel);
/* 522 */                   return new GoogleSignInAccount(iM7871D16, strM7899j4, strM7899j5, strM7899j6, strM7899j7, uri, strM7899j8, jM7873F, strM7899j9, arrayListM7903n5, strM7899j10, strM7899j11);
                        case 24:
/* 330 */                   int iM7883P13 = qj3.m7883P(parcel);
/* 334 */                   String strM7899j12 = null;
/* 335 */                   boolean zM7914y3 = false;
/* 336 */                   String strM7899j13 = null;
/* 341 */                   while (parcel.dataPosition() < iM7883P13) {
/* 343 */                       int i17 = parcel.readInt();
/* 347 */                       char c10 = (char) i17;
/* 348 */                       if (c10 == 1) {
/* 377 */                           arrayListM7903n3 = qj3.m7903n(parcel, i17, Feature.CREATOR);
                                } else if (c10 == 2) {
/* 370 */                           zM7914y3 = qj3.m7914y(i17, parcel);
                                } else if (c10 == 3) {
/* 365 */                           strM7899j12 = qj3.m7899j(i17, parcel);
                                } else if (c10 != 4) {
/* 356 */                           qj3.m7878K(i17, parcel);
                                } else {
/* 360 */                           strM7899j13 = qj3.m7899j(i17, parcel);
                                }
                            }
/* 382 */                   qj3.m7908s(iM7883P13, parcel);
/* 387 */                   return new ApiFeatureRequest(arrayListM7903n3, zM7914y3, strM7899j12, strM7899j13);
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 287 */                   int iM7883P14 = qj3.m7883P(parcel);
/* 291 */                   boolean zM7914y4 = false;
/* 296 */                   while (parcel.dataPosition() < iM7883P14) {
/* 298 */                       int i18 = parcel.readInt();
/* 302 */                       char c11 = (char) i18;
/* 303 */                       if (c11 == 1) {
/* 316 */                           iM7871D3 = qj3.m7871D(i18, parcel);
                                } else if (c11 != 2) {
/* 307 */                           qj3.m7878K(i18, parcel);
                                } else {
/* 311 */                           zM7914y4 = qj3.m7914y(i18, parcel);
                                }
                            }
/* 321 */                   qj3.m7908s(iM7883P14, parcel);
/* 326 */                   return new ModuleInstallResponse(iM7871D3, zM7914y4);
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 243 */                   int iM7883P15 = qj3.m7883P(parcel);
/* 251 */                   while (parcel.dataPosition() < iM7883P15) {
/* 253 */                       int i19 = parcel.readInt();
/* 257 */                       char c12 = (char) i19;
/* 258 */                       if (c12 == 1) {
/* 273 */                           iM7871D2 = qj3.m7871D(i19, parcel);
                                } else if (c12 != 2) {
/* 262 */                           qj3.m7878K(i19, parcel);
                                } else {
/* 268 */                           arrayListM7903n2 = qj3.m7903n(parcel, i19, zac.CREATOR);
                                }
                            }
/* 278 */                   qj3.m7908s(iM7883P15, parcel);
/* 283 */                   return new StringToIntConverter(iM7871D2, arrayListM7903n2);
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 174 */                   int iM7883P16 = qj3.m7883P(parcel);
/* 178 */                   Long lM7874G = null;
/* 179 */                   Long lM7874G2 = null;
/* 180 */                   int iM7871D17 = 0;
/* 181 */                   int iM7871D18 = 0;
/* 182 */                   int iM7871D19 = 0;
/* 187 */                   while (parcel.dataPosition() < iM7883P16) {
/* 189 */                       int i20 = parcel.readInt();
/* 193 */                       char c13 = (char) i20;
/* 194 */                       if (c13 == 1) {
/* 229 */                           iM7871D17 = qj3.m7871D(i20, parcel);
                                } else if (c13 == 2) {
/* 224 */                           iM7871D18 = qj3.m7871D(i20, parcel);
                                } else if (c13 == 3) {
/* 219 */                           lM7874G = qj3.m7874G(i20, parcel);
                                } else if (c13 == 4) {
/* 214 */                           lM7874G2 = qj3.m7874G(i20, parcel);
                                } else if (c13 != 5) {
/* 205 */                           qj3.m7878K(i20, parcel);
                                } else {
/* 209 */                           iM7871D19 = qj3.m7871D(i20, parcel);
                                }
                            }
/* 234 */                   qj3.m7908s(iM7883P16, parcel);
/* 239 */                   return new ModuleInstallStatusUpdate(iM7871D17, iM7871D18, lM7874G, lM7874G2, iM7871D19);
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 124 */                   int iM7883P17 = qj3.m7883P(parcel);
/* 128 */                   int iM7871D20 = 0;
/* 133 */                   while (parcel.dataPosition() < iM7883P17) {
/* 135 */                       int i21 = parcel.readInt();
/* 139 */                       char c14 = (char) i21;
/* 140 */                       if (c14 == 1) {
/* 160 */                           iM7871D = qj3.m7871D(i21, parcel);
                                } else if (c14 == 2) {
/* 155 */                           strM7899j = qj3.m7899j(i21, parcel);
                                } else if (c14 != 3) {
/* 146 */                           qj3.m7878K(i21, parcel);
                                } else {
/* 150 */                           iM7871D20 = qj3.m7871D(i21, parcel);
                                }
                            }
/* 165 */                   qj3.m7908s(iM7883P17, parcel);
/* 170 */                   return new zac(iM7871D, strM7899j, iM7871D20);
                        default:
/* 18 */                    int iM7883P18 = qj3.m7883P(parcel);
/* 22 */                    ArrayList arrayListM7903n6 = null;
/* 23 */                    Account account = null;
/* 24 */                    String strM7899j14 = null;
/* 26 */                    String strM7899j15 = null;
/* 28 */                    String strM7899j16 = null;
/* 30 */                    int iM7871D21 = 0;
/* 31 */                    boolean zM7914y5 = false;
/* 32 */                    boolean zM7914y6 = false;
/* 33 */                    boolean zM7914y7 = false;
/* 38 */                    while (parcel.dataPosition() < iM7883P18) {
/* 40 */                        int i22 = parcel.readInt();
                                switch ((char) i22) {
                                    case 1:
/* 106 */                               iM7871D21 = qj3.m7871D(i22, parcel);
                                        break;
                                    case 2:
/* 101 */                               arrayListM7903n6 = qj3.m7903n(parcel, i22, Scope.CREATOR);
                                        break;
                                    case 3:
/* 96 */                                account = (Account) qj3.m7898i(parcel, i22, Account.CREATOR);
                                        break;
                                    case 4:
/* 84 */                                zM7914y5 = qj3.m7914y(i22, parcel);
                                        break;
                                    case 5:
/* 79 */                                zM7914y6 = qj3.m7914y(i22, parcel);
                                        break;
                                    case 6:
/* 74 */                                zM7914y7 = qj3.m7914y(i22, parcel);
                                        break;
                                    case 7:
/* 69 */                                strM7899j14 = qj3.m7899j(i22, parcel);
                                        break;
                                    case '\b':
/* 64 */                                strM7899j15 = qj3.m7899j(i22, parcel);
                                        break;
                                    case '\t':
/* 59 */                                arrayListM7903n = qj3.m7903n(parcel, i22, GoogleSignInOptionsExtensionParcelable.CREATOR);
                                        break;
                                    case '\n':
/* 52 */                                strM7899j16 = qj3.m7899j(i22, parcel);
                                        break;
                                    default:
/* 48 */                                qj3.m7878K(i22, parcel);
                                        break;
                                }
                            }
/* 111 */                   qj3.m7908s(iM7883P18, parcel);
/* 120 */                   return new GoogleSignInOptions(iM7871D21, arrayListM7903n6, account, zM7914y5, zM7914y6, zM7914y7, strM7899j14, strM7899j15, GoogleSignInOptions.m1995E1(arrayListM7903n), strM7899j16);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    switch (this.f15496a) {
                        case 0:
/* 93 */                    return new zzam[i];
                        case 1:
/* 90 */                    return new ApiMetadata[i];
                        case 2:
/* 87 */                    return new ActivityResult[i];
                        case 3:
/* 84 */                    return new BadgeState$State[i];
                        case 4:
/* 81 */                    return new DateValidatorPointBackward[i];
                        case 5:
/* 78 */                    return new DateValidatorPointForward[i];
                        case 6:
/* 75 */                    return new IntentSenderRequest[i];
                        case 7:
/* 72 */                    return new ParcelImpl[i];
                        case 8:
/* 69 */                    return new ParcelableSparseBooleanArray[i];
                        case 9:
/* 66 */                    return new ParcelableSparseIntArray[i];
                        case 10:
/* 63 */                    return new RangeDateSelector[i];
                        case 11:
/* 60 */                    return new RemoteMessage[i];
                        case 12:
/* 57 */                    return new SingleDateSelector[i];
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 54 */                    return new Timestamp[i];
                        case 14:
/* 51 */                    return new GoogleSignInOptionsExtensionParcelable[i];
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 48 */                    return new BitmapTeleporter[i];
                        case 16:
/* 45 */                    return new ClientIdentity[i];
                        case 17:
/* 42 */                    return new ModuleAvailabilityResponse[i];
                        case 18:
/* 39 */                    return new FavaDiagnosticsEntity[i];
                        case 19:
/* 36 */                    return new TelemetryData[i];
                        case 20:
/* 33 */                    return new ModuleInstallIntentResponse[i];
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 30 */                    return new zaa[i];
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 27 */                    return new com.google.android.gms.signin.internal.zaa[i];
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 24 */                    return new GoogleSignInAccount[i];
                        case 24:
/* 21 */                    return new ApiFeatureRequest[i];
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 18 */                    return new ModuleInstallResponse[i];
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 15 */                    return new StringToIntConverter[i];
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 12 */                    return new ModuleInstallStatusUpdate[i];
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 9 */                     return new zac[i];
                        default:
/* 6 */                     return new GoogleSignInOptions[i];
                    }
                }
            }
