            package com.google.android.gms.common.server.response;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.Base64;
            import android.util.SparseArray;
            import com.google.android.gms.common.server.converter.StringToIntConverter;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Set;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            import p000.g62;
            import p000.k21;
            import p000.kb1;
            import p000.qj3;
            import p000.ub3;
            import p000.w11;
            import p000.wg0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new ub3(9);

                /* JADX INFO: renamed from: a */
                public final int f3584a;

                /* JADX INFO: renamed from: b */
                public final Parcel f3585b;

                /* JADX INFO: renamed from: c */
                public final int f3586c;

                /* JADX INFO: renamed from: d */
                public final zan f3587d;

                /* JADX INFO: renamed from: e */
                public final String f3588e;

                /* JADX INFO: renamed from: f */
                public int f3589f;

                /* JADX INFO: renamed from: i */
                public int f3590i;

                public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
/* 4 */             this.f3584a = i;
/* 6 */             kb1.m6061n(parcel);
/* 9 */             this.f3585b = parcel;
/* 12 */            this.f3586c = 2;
/* 14 */            this.f3587d = zanVar;
/* 19 */            this.f3588e = zanVar == null ? null : zanVar.f3599c;
/* 25 */            this.f3589f = 2;
                }

                /* JADX INFO: renamed from: j */
                public static void m2027j(StringBuilder sb, Map map, Parcel parcel) {
                    BigInteger bigInteger;
                    Parcel parcelObtain;
                    BigInteger[] bigIntegerArr;
                    long[] jArrCreateLongArray;
                    float[] fArrCreateFloatArray;
                    double[] dArrCreateDoubleArray;
                    BigDecimal[] bigDecimalArr;
                    Parcel[] parcelArr;
                    BigInteger bigInteger2;
/* 7 */             SparseArray sparseArray = new SparseArray();
/* 22 */            for (Map.Entry entry : map.entrySet()) {
/* 38 */                sparseArray.put(((FastJsonResponse$Field) entry.getValue()).f3581i, entry);
                    }
/* 44 */            sb.append('{');
/* 47 */            int iM7883P = qj3.m7883P(parcel);
/* 52 */            boolean z = false;
/* 57 */            while (parcel.dataPosition() < iM7883P) {
/* 59 */                int i = parcel.readInt();
/* 68 */                Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i);
/* 70 */                if (entry2 != null) {
/* 74 */                    if (z) {
/* 76 */                        sb.append(",");
                            }
/* 83 */                    String str = (String) entry2.getKey();
/* 89 */                    FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
/* 93 */                    sb.append("\"");
/* 96 */                    sb.append(str);
/* 101 */                   sb.append("\":");
/* 104 */                   StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f3574V;
/* 106 */                   String str2 = fastJsonResponse$Field.f3583w;
/* 108 */                   int i2 = fastJsonResponse$Field.f3578d;
/* 112 */                   if (stringToIntConverter != null) {
                                switch (i2) {
                                    case 0:
/* 332 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, Integer.valueOf(qj3.m7871D(i, parcel))));
                                        break;
                                    case 1:
/* 286 */                               int iM7875H = qj3.m7875H(i, parcel);
/* 290 */                               int iDataPosition = parcel.dataPosition();
/* 294 */                               if (iM7875H == 0) {
/* 296 */                                   bigInteger2 = null;
                                        } else {
/* 298 */                                   byte[] bArrCreateByteArray = parcel.createByteArray();
/* 303 */                                   parcel.setDataPosition(iDataPosition + iM7875H);
/* 308 */                                   bigInteger2 = new BigInteger(bArrCreateByteArray);
                                        }
/* 315 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, bigInteger2));
                                        break;
                                    case 2:
/* 282 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, Long.valueOf(qj3.m7873F(i, parcel))));
                                        break;
                                    case 3:
/* 266 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, Float.valueOf(qj3.m7869B(i, parcel))));
                                        break;
                                    case 4:
/* 235 */                               qj3.m7887T(parcel, i, 8);
/* 250 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, Double.valueOf(parcel.readDouble())));
                                        break;
                                    case 5:
/* 231 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, qj3.m7893d(i, parcel)));
                                        break;
                                    case 6:
/* 219 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, Boolean.valueOf(qj3.m7914y(i, parcel))));
                                        break;
                                    case 7:
/* 203 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, qj3.m7899j(i, parcel)));
                                        break;
                                    case 8:
                                    case 9:
/* 191 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, qj3.m7896g(i, parcel)));
                                        break;
                                    case 10:
/* 133 */                               Bundle bundleM7895f = qj3.m7895f(i, parcel);
/* 139 */                               HashMap map2 = new HashMap();
/* 154 */                               for (String str3 : bundleM7895f.keySet()) {
/* 162 */                                   String string = bundleM7895f.getString(str3);
/* 166 */                                   kb1.m6061n(string);
/* 169 */                                   map2.put(str3, string);
                                        }
/* 177 */                               m2029m(sb, fastJsonResponse$Field, wg0.zaD(fastJsonResponse$Field, map2));
                                        break;
                                    case 11:
/* 129 */                               C1951n4.m6859j("Method does not accept concrete type.");
/* 132 */                               return;
                                    default:
/* 123 */                               C1951n4.m6859j(fm0.m3781g(i2, "Unknown field out type = "));
/* 126 */                               return;
                                }
                            } else if (fastJsonResponse$Field.f3579e) {
/* 343 */                       sb.append("[");
                                switch (i2) {
                                    case 0:
/* 760 */                               int[] iArrM7897h = qj3.m7897h(i, parcel);
/* 764 */                               int length = iArrM7897h.length;
/* 766 */                               for (int i3 = 0; i3 < length; i3++) {
/* 768 */                                   if (i3 != 0) {
/* 770 */                                       sb.append(",");
                                            }
/* 775 */                                   sb.append(iArrM7897h[i3]);
                                        }
                                        break;
                                    case 1:
/* 703 */                               int iM7875H2 = qj3.m7875H(i, parcel);
/* 707 */                               int iDataPosition2 = parcel.dataPosition();
/* 711 */                               if (iM7875H2 == 0) {
/* 713 */                                   bigIntegerArr = null;
                                        } else {
/* 716 */                                   int i4 = parcel.readInt();
/* 720 */                                   bigIntegerArr = new BigInteger[i4];
/* 723 */                                   for (int i5 = 0; i5 < i4; i5++) {
/* 734 */                                       bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
                                            }
/* 740 */                                   parcel.setDataPosition(iDataPosition2 + iM7875H2);
                                        }
/* 743 */                               int length2 = bigIntegerArr.length;
/* 745 */                               for (int i6 = 0; i6 < length2; i6++) {
/* 747 */                                   if (i6 != 0) {
/* 749 */                                       sb.append(",");
                                            }
/* 754 */                                   sb.append(bigIntegerArr[i6]);
                                        }
                                        break;
                                    case 2:
/* 663 */                               int iM7875H3 = qj3.m7875H(i, parcel);
/* 667 */                               int iDataPosition3 = parcel.dataPosition();
/* 671 */                               if (iM7875H3 == 0) {
/* 673 */                                   jArrCreateLongArray = null;
                                        } else {
/* 676 */                                   jArrCreateLongArray = parcel.createLongArray();
/* 681 */                                   parcel.setDataPosition(iDataPosition3 + iM7875H3);
                                        }
/* 684 */                               int length3 = jArrCreateLongArray.length;
/* 686 */                               for (int i7 = 0; i7 < length3; i7++) {
/* 688 */                                   if (i7 != 0) {
/* 690 */                                       sb.append(",");
                                            }
/* 695 */                                   sb.append(jArrCreateLongArray[i7]);
                                        }
                                        break;
                                    case 3:
/* 623 */                               int iM7875H4 = qj3.m7875H(i, parcel);
/* 627 */                               int iDataPosition4 = parcel.dataPosition();
/* 631 */                               if (iM7875H4 == 0) {
/* 633 */                                   fArrCreateFloatArray = null;
                                        } else {
/* 636 */                                   fArrCreateFloatArray = parcel.createFloatArray();
/* 641 */                                   parcel.setDataPosition(iDataPosition4 + iM7875H4);
                                        }
/* 644 */                               int length4 = fArrCreateFloatArray.length;
/* 646 */                               for (int i8 = 0; i8 < length4; i8++) {
/* 648 */                                   if (i8 != 0) {
/* 650 */                                       sb.append(",");
                                            }
/* 655 */                                   sb.append(fArrCreateFloatArray[i8]);
                                        }
                                        break;
                                    case 4:
/* 583 */                               int iM7875H5 = qj3.m7875H(i, parcel);
/* 587 */                               int iDataPosition5 = parcel.dataPosition();
/* 591 */                               if (iM7875H5 == 0) {
/* 593 */                                   dArrCreateDoubleArray = null;
                                        } else {
/* 596 */                                   dArrCreateDoubleArray = parcel.createDoubleArray();
/* 601 */                                   parcel.setDataPosition(iDataPosition5 + iM7875H5);
                                        }
/* 604 */                               int length5 = dArrCreateDoubleArray.length;
/* 606 */                               for (int i9 = 0; i9 < length5; i9++) {
/* 608 */                                   if (i9 != 0) {
/* 610 */                                       sb.append(",");
                                            }
/* 615 */                                   sb.append(dArrCreateDoubleArray[i9]);
                                        }
                                        break;
                                    case 5:
/* 515 */                               int iM7875H6 = qj3.m7875H(i, parcel);
/* 519 */                               int iDataPosition6 = parcel.dataPosition();
/* 523 */                               if (iM7875H6 == 0) {
/* 525 */                                   bigDecimalArr = null;
                                        } else {
/* 528 */                                   int i10 = parcel.readInt();
/* 532 */                                   bigDecimalArr = new BigDecimal[i10];
/* 535 */                                   for (int i11 = 0; i11 < i10; i11++) {
/* 555 */                                       bigDecimalArr[i11] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                            }
/* 561 */                                   parcel.setDataPosition(iDataPosition6 + iM7875H6);
                                        }
/* 564 */                               int length6 = bigDecimalArr.length;
/* 566 */                               for (int i12 = 0; i12 < length6; i12++) {
/* 568 */                                   if (i12 != 0) {
/* 570 */                                       sb.append(",");
                                            }
/* 575 */                                   sb.append(bigDecimalArr[i12]);
                                        }
                                        break;
                                    case 6:
/* 492 */                               boolean[] zArrM7894e = qj3.m7894e(i, parcel);
/* 496 */                               int length7 = zArrM7894e.length;
/* 498 */                               for (int i13 = 0; i13 < length7; i13++) {
/* 500 */                                   if (i13 != 0) {
/* 502 */                                       sb.append(",");
                                            }
/* 507 */                                   sb.append(zArrM7894e[i13]);
                                        }
                                        break;
                                    case 7:
/* 465 */                               String[] strArrM7900k = qj3.m7900k(i, parcel);
/* 469 */                               int length8 = strArrM7900k.length;
/* 471 */                               for (int i14 = 0; i14 < length8; i14++) {
/* 473 */                                   if (i14 != 0) {
/* 475 */                                       sb.append(",");
                                            }
/* 478 */                                   sb.append("\"");
/* 483 */                                   sb.append(strArrM7900k[i14]);
/* 486 */                                   sb.append("\"");
                                        }
                                        break;
                                    case 8:
                                    case 9:
                                    case 10:
/* 461 */                               C1951n4.m6866q("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
/* 464 */                               return;
                                    case 11:
/* 355 */                               int iM7875H7 = qj3.m7875H(i, parcel);
/* 359 */                               int iDataPosition7 = parcel.dataPosition();
/* 363 */                               if (iM7875H7 == 0) {
/* 365 */                                   parcelArr = null;
                                        } else {
/* 367 */                                   int i15 = parcel.readInt();
/* 371 */                                   Parcel[] parcelArr2 = new Parcel[i15];
/* 374 */                                   for (int i16 = 0; i16 < i15; i16++) {
/* 376 */                                       int i17 = parcel.readInt();
/* 380 */                                       if (i17 != 0) {
/* 384 */                                           int iDataPosition8 = parcel.dataPosition();
/* 388 */                                           Parcel parcelObtain2 = Parcel.obtain();
/* 392 */                                           parcelObtain2.appendFrom(parcel, iDataPosition8, i17);
/* 395 */                                           parcelArr2[i16] = parcelObtain2;
/* 398 */                                           parcel.setDataPosition(iDataPosition8 + i17);
                                                } else {
/* 404 */                                           parcelArr2[i16] = null;
                                                }
                                            }
/* 410 */                                   parcel.setDataPosition(iDataPosition7 + iM7875H7);
/* 413 */                                   parcelArr = parcelArr2;
                                        }
/* 414 */                               int length9 = parcelArr.length;
/* 416 */                               for (int i18 = 0; i18 < length9; i18++) {
/* 418 */                                   if (i18 > 0) {
/* 420 */                                       sb.append(",");
                                            }
/* 425 */                                   parcelArr[i18].setDataPosition(0);
/* 428 */                                   kb1.m6061n(str2);
/* 433 */                                   kb1.m6061n(fastJsonResponse$Field.f3573U);
/* 444 */                                   Map map3 = (Map) fastJsonResponse$Field.f3573U.f3598b.get(str2);
/* 446 */                                   kb1.m6061n(map3);
/* 453 */                                   m2027j(sb, map3, parcelArr[i18]);
                                        }
                                        break;
                                    default:
/* 351 */                               f42.m3656l("Unknown field type out.");
/* 354 */                               return;
                                }
/* 783 */                       sb.append("]");
                            } else {
                                switch (i2) {
                                    case 0:
/* 1075 */                              sb.append(qj3.m7871D(i, parcel));
                                        break;
                                    case 1:
/* 1040 */                              int iM7875H8 = qj3.m7875H(i, parcel);
/* 1044 */                              int iDataPosition9 = parcel.dataPosition();
/* 1048 */                              if (iM7875H8 == 0) {
/* 1050 */                                  bigInteger = null;
                                        } else {
/* 1053 */                                  byte[] bArrCreateByteArray2 = parcel.createByteArray();
/* 1058 */                                  parcel.setDataPosition(iDataPosition9 + iM7875H8);
/* 1063 */                                  bigInteger = new BigInteger(bArrCreateByteArray2);
                                        }
/* 1066 */                              sb.append(bigInteger);
                                        break;
                                    case 2:
/* 1035 */                              sb.append(qj3.m7873F(i, parcel));
                                        break;
                                    case 3:
/* 1026 */                              sb.append(qj3.m7869B(i, parcel));
                                        break;
                                    case 4:
/* 1010 */                              qj3.m7887T(parcel, i, 8);
/* 1017 */                              sb.append(parcel.readDouble());
                                        break;
                                    case 5:
/* 1005 */                              sb.append(qj3.m7893d(i, parcel));
                                        break;
                                    case 6:
/* 996 */                               sb.append(qj3.m7914y(i, parcel));
                                        break;
                                    case 7:
/* 973 */                               String strM7899j = qj3.m7899j(i, parcel);
/* 977 */                               sb.append("\"");
/* 984 */                               sb.append(k21.m5934a(strM7899j));
/* 987 */                               sb.append("\"");
                                        break;
                                    case 8:
/* 949 */                               byte[] bArrM7896g = qj3.m7896g(i, parcel);
/* 953 */                               sb.append("\"");
/* 965 */                               sb.append(bArrM7896g == null ? null : Base64.encodeToString(bArrM7896g, 0));
/* 968 */                               sb.append("\"");
                                        break;
                                    case 9:
/* 923 */                               byte[] bArrM7896g2 = qj3.m7896g(i, parcel);
/* 927 */                               sb.append("\"");
/* 941 */                               sb.append(bArrM7896g2 == null ? null : Base64.encodeToString(bArrM7896g2, 10));
/* 944 */                               sb.append("\"");
                                        break;
                                    case 10:
/* 854 */                               Bundle bundleM7895f2 = qj3.m7895f(i, parcel);
/* 858 */                               Set<String> setKeySet = bundleM7895f2.keySet();
/* 864 */                               sb.append("{");
/* 871 */                               boolean z2 = true;
/* 876 */                               for (String str4 : setKeySet) {
/* 884 */                                   if (!z2) {
/* 886 */                                       sb.append(",");
                                            }
/* 889 */                                   sb.append("\"");
/* 892 */                                   sb.append(str4);
/* 897 */                                   sb.append("\":\"");
/* 908 */                                   sb.append(k21.m5934a(bundleM7895f2.getString(str4)));
/* 911 */                                   sb.append("\"");
/* 914 */                                   z2 = false;
                                        }
/* 918 */                               sb.append("}");
                                        break;
                                    case 11:
/* 799 */                               int iM7875H9 = qj3.m7875H(i, parcel);
/* 803 */                               int iDataPosition10 = parcel.dataPosition();
/* 807 */                               if (iM7875H9 == 0) {
/* 809 */                                   parcelObtain = null;
                                        } else {
/* 812 */                                   parcelObtain = Parcel.obtain();
/* 816 */                                   parcelObtain.appendFrom(parcel, iDataPosition10, iM7875H9);
/* 820 */                                   parcel.setDataPosition(iDataPosition10 + iM7875H9);
                                        }
/* 823 */                               parcelObtain.setDataPosition(0);
/* 826 */                               kb1.m6061n(str2);
/* 831 */                               kb1.m6061n(fastJsonResponse$Field.f3573U);
/* 842 */                               Map map4 = (Map) fastJsonResponse$Field.f3573U.f3598b.get(str2);
/* 844 */                               kb1.m6061n(map4);
/* 849 */                               m2027j(sb, map4, parcelObtain);
                                        break;
                                    default:
/* 795 */                               f42.m3656l("Unknown field type out");
/* 798 */                               return;
                                }
                            }
/* 180 */                   z = true;
                        }
                    }
/* 1084 */          if (parcel.dataPosition() != iM7883P) {
/* 1103 */              throw new g62(fm0.m3781g(iM7883P, "Overread allowed size end="), parcel);
                    }
/* 1088 */          sb.append('}');
                }

                /* JADX INFO: renamed from: k */
                public static final void m2028k(StringBuilder sb, int i, Object obj) {
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
/* 94 */                    sb.append(obj);
                            break;
                        case 7:
/* 73 */                    sb.append("\"");
/* 76 */                    kb1.m6061n(obj);
/* 87 */                    sb.append(k21.m5934a(obj.toString()));
/* 90 */                    sb.append("\"");
                            break;
                        case 8:
/* 53 */                    sb.append("\"");
/* 56 */                    byte[] bArr = (byte[]) obj;
/* 66 */                    sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
/* 69 */                    sb.append("\"");
                            break;
                        case 9:
/* 32 */                    sb.append("\"");
/* 35 */                    byte[] bArr2 = (byte[]) obj;
/* 46 */                    sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
/* 49 */                    sb.append("\"");
                            break;
                        case 10:
/* 23 */                    kb1.m6061n(obj);
/* 28 */                    kb1.m6047W(sb, (HashMap) obj);
                            break;
                        case 11:
/* 19 */                    C1951n4.m6859j("Method does not accept concrete type.");
                            break;
                        default:
/* 13 */                    C1951n4.m6859j(fm0.m3781g(i, "Unknown type = "));
                            break;
                    }
                }

                /* JADX INFO: renamed from: m */
                public static final void m2029m(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
/* 1 */             boolean z = fastJsonResponse$Field.f3577c;
/* 3 */             int i = fastJsonResponse$Field.f3576b;
/* 5 */             if (!z) {
/* 44 */                m2028k(sb, i, obj);
/* 47 */                return;
                    }
/* 7 */             ArrayList arrayList = (ArrayList) obj;
/* 11 */            sb.append("[");
/* 14 */            int size = arrayList.size();
/* 19 */            for (int i2 = 0; i2 < size; i2++) {
/* 21 */                if (i2 != 0) {
/* 25 */                    sb.append(",");
                        }
/* 32 */                m2028k(sb, i, arrayList.get(i2));
                    }
/* 40 */            sb.append("]");
                }

                @Override // p000.wg0
                public final void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 6 */             ArrayList arrayList2 = new ArrayList();
/* 9 */             kb1.m6061n(arrayList);
/* 12 */            arrayList.size();
/* 15 */            int size = arrayList.size();
/* 21 */            for (int i = 0; i < size; i++) {
/* 35 */                arrayList2.add(((SafeParcelResponse) ((wg0) arrayList.get(i))).m2030d());
                    }
/* 41 */            int i2 = fastJsonResponse$Field.f3581i;
/* 43 */            Parcel parcel = this.f3585b;
/* 45 */            int iM9422c0 = w11.m9422c0(i2, parcel);
/* 49 */            int size2 = arrayList2.size();
/* 53 */            parcel.writeInt(size2);
/* 57 */            for (int i3 = 0; i3 < size2; i3++) {
/* 63 */                Parcel parcel2 = (Parcel) arrayList2.get(i3);
/* 65 */                if (parcel2 != null) {
/* 71 */                    parcel.writeInt(parcel2.dataSize());
/* 78 */                    parcel.appendFrom(parcel2, 0, parcel2.dataSize());
                        } else {
/* 82 */                    parcel.writeInt(0);
                        }
                    }
/* 88 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // p000.wg0
                public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, wg0 wg0Var) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 6 */             Parcel parcelM2030d = ((SafeParcelResponse) wg0Var).m2030d();
/* 10 */            int i = fastJsonResponse$Field.f3581i;
/* 12 */            Parcel parcel = this.f3585b;
/* 15 */            if (parcelM2030d == null) {
/* 17 */                w11.m9420b0(parcel, i, 0);
/* 20 */                return;
                    }
/* 21 */            int iM9422c0 = w11.m9422c0(i, parcel);
/* 29 */            parcel.appendFrom(parcelM2030d, 0, parcelM2030d.dataSize());
/* 32 */            w11.m9428f0(iM9422c0, parcel);
                }

                /* JADX INFO: renamed from: d */
                public final Parcel m2030d() {
/* 1 */             int i = this.f3589f;
/* 4 */             Parcel parcel = this.f3585b;
/* 6 */             if (i != 0) {
/* 9 */                 if (i != 1) {
/* 11 */                    return parcel;
                        }
/* 14 */                w11.m9428f0(this.f3590i, parcel);
/* 17 */                this.f3589f = 2;
/* 19 */                return parcel;
                    }
/* 22 */            int iM9422c0 = w11.m9422c0(20293, parcel);
/* 26 */            this.f3590i = iM9422c0;
/* 28 */            w11.m9428f0(iM9422c0, parcel);
/* 31 */            this.f3589f = 2;
/* 33 */            return parcel;
                }

                /* JADX INFO: renamed from: e */
                public final void m2031e(FastJsonResponse$Field fastJsonResponse$Field) {
/* 4 */             if (fastJsonResponse$Field.f3581i == -1) {
/* 43 */                f42.m3656l("Field does not have a valid safe parcelable field id.");
/* 46 */                return;
                    }
/* 6 */             Parcel parcel = this.f3585b;
/* 8 */             if (parcel == null) {
/* 37 */                f42.m3656l("Internal Parcel object is null.");
/* 40 */                return;
                    }
/* 10 */            int i = this.f3589f;
/* 13 */            if (i == 0) {
/* 30 */                this.f3590i = w11.m9422c0(20293, parcel);
/* 32 */                this.f3589f = 1;
                    } else {
/* 15 */                if (i == 1) {
/* 17 */                    return;
                        }
/* 20 */                f42.m3656l("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                    }
                }

                @Override // p000.wg0
                public final Map getFieldMappings() {
/* 1 */             zan zanVar = this.f3587d;
/* 3 */             if (zanVar == null) {
/* 5 */                 return null;
                    }
/* 7 */             String str = this.f3588e;
/* 9 */             kb1.m6061n(str);
/* 18 */            return (Map) zanVar.f3598b.get(str);
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, p000.wg0
                public final Object getValueObject(String str) {
/* 8 */             throw new UnsupportedOperationException("Converting to JSON does not require this method.");
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, p000.wg0
                public final boolean isPrimitiveFieldSet(String str) {
/* 8 */             throw new UnsupportedOperationException("Converting to JSON does not require this method.");
                }

                @Override // p000.wg0
                public final void setBooleanInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             int i = fastJsonResponse$Field.f3581i;
/* 7 */             Parcel parcel = this.f3585b;
/* 9 */             w11.m9420b0(parcel, i, 4);
/* 12 */            parcel.writeInt(z ? 1 : 0);
                }

                @Override // p000.wg0
                public final void setDecodedBytesInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 9 */             w11.m9403M(this.f3585b, fastJsonResponse$Field.f3581i, bArr, true);
                }

                @Override // p000.wg0
                public final void setIntegerInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             int i2 = fastJsonResponse$Field.f3581i;
/* 7 */             Parcel parcel = this.f3585b;
/* 9 */             w11.m9420b0(parcel, i2, 4);
/* 12 */            parcel.writeInt(i);
                }

                @Override // p000.wg0
                public final void setLongInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             int i = fastJsonResponse$Field.f3581i;
/* 8 */             Parcel parcel = this.f3585b;
/* 10 */            w11.m9420b0(parcel, i, 8);
/* 13 */            parcel.writeLong(j);
                }

                @Override // p000.wg0
                public final void setStringInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 9 */             w11.m9410T(this.f3585b, fastJsonResponse$Field.f3581i, str2, true);
                }

                @Override // p000.wg0
                public final void setStringMapInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 6 */             Bundle bundle = new Bundle();
/* 9 */             kb1.m6061n(map);
/* 27 */            for (String str2 : map.keySet()) {
/* 41 */                bundle.putString(str2, (String) map.get(str2));
                    }
/* 50 */            w11.m9402L(this.f3585b, fastJsonResponse$Field.f3581i, bundle, true);
                }

                @Override // p000.wg0
                public final void setStringsInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             int size = arrayList.size();
/* 11 */            String[] strArr = new String[size];
/* 14 */            for (int i = 0; i < size; i++) {
/* 22 */                strArr[i] = (String) arrayList.get(i);
                    }
/* 32 */            w11.m9411U(this.f3585b, fastJsonResponse$Field.f3581i, strArr, true);
                }

                @Override // p000.wg0
                public final String toString() {
/* 3 */             zan zanVar = this.f3587d;
/* 5 */             kb1.m6062o(zanVar, "Cannot convert to JSON on client side.");
/* 8 */             Parcel parcelM2030d = m2030d();
/* 13 */            parcelM2030d.setDataPosition(0);
/* 20 */            StringBuilder sb = new StringBuilder(100);
/* 23 */            String str = this.f3588e;
/* 25 */            kb1.m6061n(str);
/* 34 */            Map map = (Map) zanVar.f3598b.get(str);
/* 36 */            kb1.m6061n(map);
/* 41 */            m2027j(sb, map, parcelM2030d);
/* 44 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3584a);
/* 17 */            Parcel parcelM2030d = m2030d();
/* 22 */            if (parcelM2030d != null) {
/* 26 */                int iM9422c1 = w11.m9422c0(2, parcel);
/* 34 */                parcel.appendFrom(parcelM2030d, 0, parcelM2030d.dataSize());
/* 37 */                w11.m9428f0(iM9422c1, parcel);
                    }
/* 49 */            w11.m9409S(parcel, 3, this.f3586c != 0 ? this.f3587d : null, i, false);
/* 52 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // p000.wg0
                public final void zab(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             int i = fastJsonResponse$Field.f3581i;
/* 6 */             Parcel parcel = this.f3585b;
/* 8 */             if (bigDecimal == null) {
/* 11 */                w11.m9420b0(parcel, i, 0);
/* 14 */                return;
                    }
/* 15 */            int iM9422c0 = w11.m9422c0(i, parcel);
/* 27 */            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
/* 34 */            parcel.writeInt(bigDecimal.scale());
/* 37 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // p000.wg0
                public final void zad(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             int size = arrayList.size();
/* 11 */            BigDecimal[] bigDecimalArr = new BigDecimal[size];
/* 15 */            for (int i = 0; i < size; i++) {
/* 23 */                bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
                    }
/* 28 */            int i2 = fastJsonResponse$Field.f3581i;
/* 30 */            Parcel parcel = this.f3585b;
/* 32 */            int iM9422c0 = w11.m9422c0(i2, parcel);
/* 36 */            parcel.writeInt(size);
/* 39 */            for (int i3 = 0; i3 < size; i3++) {
/* 51 */                parcel.writeByteArray(bigDecimalArr[i3].unscaledValue().toByteArray());
/* 60 */                parcel.writeInt(bigDecimalArr[i3].scale());
                    }
/* 66 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // p000.wg0
                public final void zaf(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             int i = fastJsonResponse$Field.f3581i;
/* 6 */             Parcel parcel = this.f3585b;
/* 8 */             if (bigInteger == null) {
/* 11 */                w11.m9420b0(parcel, i, 0);
/* 14 */                return;
                    }
/* 15 */            int iM9422c0 = w11.m9422c0(i, parcel);
/* 23 */            parcel.writeByteArray(bigInteger.toByteArray());
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // p000.wg0
                public final void zah(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             int size = arrayList.size();
/* 11 */            BigInteger[] bigIntegerArr = new BigInteger[size];
/* 15 */            for (int i = 0; i < size; i++) {
/* 23 */                bigIntegerArr[i] = (BigInteger) arrayList.get(i);
                    }
/* 28 */            int i2 = fastJsonResponse$Field.f3581i;
/* 30 */            Parcel parcel = this.f3585b;
/* 32 */            int iM9422c0 = w11.m9422c0(i2, parcel);
/* 36 */            parcel.writeInt(size);
/* 39 */            for (int i3 = 0; i3 < size; i3++) {
/* 47 */                parcel.writeByteArray(bigIntegerArr[i3].toByteArray());
                    }
/* 53 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // p000.wg0
                public final void zak(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             int size = arrayList.size();
/* 11 */            boolean[] zArr = new boolean[size];
/* 14 */            for (int i = 0; i < size; i++) {
/* 26 */                zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
                    }
/* 36 */            w11.m9400J(this.f3585b, fastJsonResponse$Field.f3581i, zArr, true);
                }

                @Override // p000.wg0
                public final void zan(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             int i = fastJsonResponse$Field.f3581i;
/* 8 */             Parcel parcel = this.f3585b;
/* 10 */            w11.m9420b0(parcel, i, 8);
/* 13 */            parcel.writeDouble(d);
                }

                @Override // p000.wg0
                public final void zap(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             int size = arrayList.size();
/* 11 */            double[] dArr = new double[size];
/* 14 */            for (int i = 0; i < size; i++) {
/* 26 */                dArr[i] = ((Double) arrayList.get(i)).doubleValue();
                    }
/* 31 */            int i2 = fastJsonResponse$Field.f3581i;
/* 33 */            Parcel parcel = this.f3585b;
/* 35 */            int iM9422c0 = w11.m9422c0(i2, parcel);
/* 39 */            parcel.writeDoubleArray(dArr);
/* 42 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // p000.wg0
                public final void zar(FastJsonResponse$Field fastJsonResponse$Field, String str, float f) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             int i = fastJsonResponse$Field.f3581i;
/* 7 */             Parcel parcel = this.f3585b;
/* 9 */             w11.m9420b0(parcel, i, 4);
/* 12 */            parcel.writeFloat(f);
                }

                @Override // p000.wg0
                public final void zat(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             int size = arrayList.size();
/* 11 */            float[] fArr = new float[size];
/* 14 */            for (int i = 0; i < size; i++) {
/* 26 */                fArr[i] = ((Float) arrayList.get(i)).floatValue();
                    }
/* 31 */            int i2 = fastJsonResponse$Field.f3581i;
/* 33 */            Parcel parcel = this.f3585b;
/* 35 */            int iM9422c0 = w11.m9422c0(i2, parcel);
/* 39 */            parcel.writeFloatArray(fArr);
/* 42 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // p000.wg0
                public final void zaw(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             int size = arrayList.size();
/* 11 */            int[] iArr = new int[size];
/* 14 */            for (int i = 0; i < size; i++) {
/* 26 */                iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
/* 36 */            w11.m9406P(this.f3585b, fastJsonResponse$Field.f3581i, iArr, true);
                }

                @Override // p000.wg0
                public final void zaz(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             m2031e(fastJsonResponse$Field);
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             int size = arrayList.size();
/* 11 */            long[] jArr = new long[size];
/* 14 */            for (int i = 0; i < size; i++) {
/* 26 */                jArr[i] = ((Long) arrayList.get(i)).longValue();
                    }
/* 31 */            int i2 = fastJsonResponse$Field.f3581i;
/* 33 */            Parcel parcel = this.f3585b;
/* 35 */            int iM9422c0 = w11.m9422c0(i2, parcel);
/* 39 */            parcel.writeLongArray(jArr);
/* 42 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
