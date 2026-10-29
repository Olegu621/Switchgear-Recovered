            package com.google.android.gms.games.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.internal.games_v2.zzc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzal extends com.google.android.gms.internal.games_v2.zzb implements zzam {
                @Override // com.google.android.gms.internal.games_v2.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 3 */             if (i == 6001 || i == 6002) {
/* 1400 */              parcel.readString();
/* 1403 */              zzc.zzb(parcel);
                    } else if (i == 12011) {
/* 1391 */              DataHolder dataHolder = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 1393 */              zzc.zzb(parcel);
/* 1396 */              mo2116R(dataHolder);
                    } else if (i == 12012) {
/* 1369 */              int i3 = parcel.readInt();
/* 1373 */              String string = parcel.readString();
/* 1377 */              zzc.zzb(parcel);
/* 1380 */              mo2119m(i3, string);
                    } else if (i == 13001) {
/* 1364 */              zzc.zzb(parcel);
                    } else if (i == 13002) {
/* 1349 */              parcel.readInt();
/* 1352 */              zzc.zzb(parcel);
                    } else if (i == 19001) {
/* 1334 */              parcel.readInt();
/* 1345 */              zzc.zzb(parcel);
                    } else if (i != 19002) {
                        switch (i) {
                            case 5001:
/* 1314 */                      parcel.readInt();
/* 1317 */                      parcel.readString();
/* 1320 */                      zzc.zzb(parcel);
                                break;
                            case 5002:
/* 1305 */                      DataHolder dataHolder2 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 1307 */                      zzc.zzb(parcel);
/* 1310 */                      mo2121r0(dataHolder2);
                                break;
                            case 5003:
/* 1283 */                      int i4 = parcel.readInt();
/* 1287 */                      parcel.readString();
/* 1290 */                      zzc.zzb(parcel);
/* 1293 */                      mo2124v(i4);
                                break;
                            case 5004:
/* 1272 */                      DataHolder dataHolder3 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 1274 */                      zzc.zzb(parcel);
/* 1277 */                      mo2114C(dataHolder3);
                                break;
                            case 5005:
/* 1243 */                      Parcelable.Creator<DataHolder> creator = DataHolder.CREATOR;
/* 1249 */                      DataHolder dataHolder4 = (DataHolder) zzc.zza(parcel, creator);
/* 1255 */                      DataHolder dataHolder5 = (DataHolder) zzc.zza(parcel, creator);
/* 1257 */                      zzc.zzb(parcel);
/* 1260 */                      mo1337H(dataHolder4, dataHolder5);
                                break;
                            case 5006:
/* 1232 */                      DataHolder dataHolder6 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 1234 */                      zzc.zzb(parcel);
/* 1237 */                      mo2118a0(dataHolder6);
                                break;
                            case 5007:
/* 1215 */                      DataHolder dataHolder7 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 1217 */                      zzc.zzb(parcel);
/* 1220 */                      mo1340l(dataHolder7);
                                break;
                            case 5008:
/* 1198 */                      DataHolder dataHolder8 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 1200 */                      zzc.zzb(parcel);
/* 1203 */                      mo1338X(dataHolder8);
                                break;
                            case 5009:
/* 1186 */                      zzc.zzb(parcel);
                                break;
                            case 5010:
/* 1173 */                      zzc.zzb(parcel);
                                break;
                            case 5011:
/* 1160 */                      zzc.zzb(parcel);
                                break;
                            default:
/* 38 */                        if (i == 9001) {
/* 1147 */                          zzc.zzb(parcel);
                                    break;
                                } else if (i == 11001) {
/* 1123 */                          parcel.readInt();
/* 1134 */                          zzc.zzb(parcel);
                                    break;
                                } else if (i == 12001) {
/* 1113 */                          DataHolder dataHolder9 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 1115 */                          zzc.zzb(parcel);
/* 1118 */                          mo2123u(dataHolder9);
                                    break;
                                } else if (i == 14001) {
/* 1101 */                          zzc.zzb(parcel);
                                    break;
                                } else if (i == 15001) {
/* 1083 */                          DataHolder dataHolder10 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 1085 */                          zzc.zzb(parcel);
/* 1088 */                          mo2122s(dataHolder10);
                                    break;
                                } else if (i == 17002) {
/* 1068 */                          parcel.readInt();
/* 1071 */                          zzc.zzb(parcel);
                                    break;
                                } else if (i == 20012) {
/* 1063 */                          zzc.zzb(parcel);
                                    break;
                                } else if (i == 24002) {
/* 1047 */                          zzc.zzg(parcel);
/* 1050 */                          zzc.zzb(parcel);
                                    break;
                                } else if (i == 20019) {
/* 1039 */                          parcel.readInt();
/* 1042 */                          zzc.zzb(parcel);
                                    break;
                                } else if (i == 20020) {
/* 1023 */                          parcel.readInt();
/* 1034 */                          zzc.zzb(parcel);
                                    break;
                                } else {
                                    switch (i) {
                                        case 5016:
/* 1018 */                                  zzm();
                                            break;
                                        case 5017:
/* 1012 */                                  zzc.zzb(parcel);
                                            break;
                                        case 5018:
/* 999 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5019:
/* 986 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5020:
/* 967 */                                   parcel.readInt();
/* 970 */                                   parcel.readString();
/* 973 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5021:
/* 962 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5022:
/* 949 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5023:
/* 936 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5024:
/* 923 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5025:
/* 910 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5026:
/* 894 */                                   parcel.createStringArray();
/* 897 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5027:
/* 878 */                                   parcel.createStringArray();
/* 881 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5028:
/* 862 */                                   parcel.createStringArray();
/* 865 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5029:
/* 846 */                                   parcel.createStringArray();
/* 849 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5030:
/* 830 */                                   parcel.createStringArray();
/* 833 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5031:
/* 814 */                                   parcel.createStringArray();
/* 817 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5032:
/* 801 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5033:
/* 779 */                                   parcel.readInt();
/* 782 */                                   parcel.readInt();
/* 785 */                                   parcel.readString();
/* 788 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5034:
/* 765 */                                   parcel.readInt();
/* 768 */                                   parcel.readString();
/* 771 */                                   zzc.zzg(parcel);
/* 774 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5035:
/* 760 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5036:
/* 744 */                                   parcel.readInt();
/* 747 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5037:
/* 739 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5038:
/* 726 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5039:
/* 713 */                                   zzc.zzb(parcel);
                                            break;
                                        case 5040:
/* 697 */                                   parcel.readInt();
/* 700 */                                   zzc.zzb(parcel);
                                            break;
                                        default:
                                            switch (i) {
                                                case 19008:
/* 689 */                                           parcel.readInt();
/* 692 */                                           zzc.zzb(parcel);
                                                    break;
                                                case 19009:
/* 681 */                                           parcel.readInt();
/* 684 */                                           zzc.zzb(parcel);
                                                    break;
                                                case 19010:
/* 673 */                                           parcel.readInt();
/* 676 */                                           zzc.zzb(parcel);
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 20001:
/* 668 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        case 20002:
/* 655 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        case 20003:
/* 642 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        case 20004:
/* 629 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        case 20005:
/* 616 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        case 20006:
/* 603 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        case 20007:
/* 590 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        case 20008:
/* 577 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        case 20009:
/* 564 */                                                   zzc.zzb(parcel);
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 23001:
/* 548 */                                                           parcel.readInt();
/* 551 */                                                           zzc.zzb(parcel);
                                                                    break;
                                                                case 23002:
/* 540 */                                                           parcel.readInt();
/* 543 */                                                           zzc.zzb(parcel);
                                                                    break;
                                                                case 23003:
/* 532 */                                                           parcel.readInt();
/* 535 */                                                           zzc.zzb(parcel);
                                                                    break;
                                                                case 23004:
/* 524 */                                                           parcel.readInt();
/* 527 */                                                           zzc.zzb(parcel);
                                                                    break;
                                                                case 23005:
/* 516 */                                                           parcel.readInt();
/* 519 */                                                           zzc.zzb(parcel);
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 25002:
/* 508 */                                                                   parcel.readString();
/* 511 */                                                                   zzc.zzb(parcel);
                                                                            break;
                                                                        case 25003:
/* 494 */                                                                   Status status = (Status) zzc.zza(parcel, Status.CREATOR);
/* 496 */                                                                   String string2 = parcel.readString();
/* 500 */                                                                   zzc.zzb(parcel);
/* 503 */                                                                   mo2115L(status, string2);
                                                                            break;
                                                                        case 25004:
/* 482 */                                                                   zzc.zzb(parcel);
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 8001:
/* 464 */                                                                           DataHolder dataHolder11 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 466 */                                                                           zzc.zzb(parcel);
/* 469 */                                                                           mo1339g(dataHolder11);
                                                                                    break;
                                                                                case 8002:
/* 441 */                                                                           parcel.readInt();
/* 452 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                case 8003:
/* 436 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                case 8004:
/* 423 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                case 8005:
/* 410 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                case 8006:
/* 397 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                case 8007:
/* 378 */                                                                           parcel.readInt();
/* 381 */                                                                           parcel.readString();
/* 384 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                case 8008:
/* 373 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                case 8009:
/* 357 */                                                                           parcel.readString();
/* 360 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                case 8010:
/* 349 */                                                                           parcel.readString();
/* 352 */                                                                           zzc.zzb(parcel);
                                                                                    break;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 10001:
/* 344 */                                                                                   zzc.zzb(parcel);
                                                                                            break;
                                                                                        case 10002:
/* 328 */                                                                                   parcel.readString();
/* 331 */                                                                                   zzc.zzb(parcel);
                                                                                            break;
                                                                                        case 10003:
/* 323 */                                                                                   zzc.zzb(parcel);
                                                                                            break;
                                                                                        case 10004:
/* 310 */                                                                                   zzc.zzb(parcel);
                                                                                            break;
                                                                                        case 10005:
/* 286 */                                                                                   parcel.readInt();
/* 297 */                                                                                   zzc.zzb(parcel);
                                                                                            break;
                                                                                        case 10006:
/* 281 */                                                                                   zzc.zzb(parcel);
                                                                                            break;
                                                                                        default:
                                                                                            switch (i) {
                                                                                                case 12004:
/* 255 */                                                                                           DataHolder dataHolder12 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 263 */                                                                                           Contents contents = (Contents) zzc.zza(parcel, Contents.CREATOR);
/* 265 */                                                                                           zzc.zzb(parcel);
/* 268 */                                                                                           mo2125y(dataHolder12, contents);
                                                                                                    break;
                                                                                                case 12005:
/* 238 */                                                                                           DataHolder dataHolder13 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 240 */                                                                                           zzc.zzb(parcel);
/* 243 */                                                                                           mo2117S(dataHolder13);
                                                                                                    break;
                                                                                                case 12006:
/* 226 */                                                                                           zzc.zzb(parcel);
                                                                                                    break;
                                                                                                case 12007:
/* 213 */                                                                                           zzc.zzb(parcel);
                                                                                                    break;
                                                                                                case 12008:
/* 200 */                                                                                           zzc.zzb(parcel);
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (i) {
                                                                                                        case 12014:
/* 187 */                                                                                                   zzc.zzb(parcel);
                                                                                                            break;
                                                                                                        case 12015:
/* 163 */                                                                                                   parcel.readInt();
/* 174 */                                                                                                   zzc.zzb(parcel);
                                                                                                            break;
                                                                                                        case 12016:
/* 158 */                                                                                                   zzc.zzb(parcel);
                                                                                                            break;
                                                                                                        case 12017:
/* 112 */                                                                                                   DataHolder dataHolder14 = (DataHolder) zzc.zza(parcel, DataHolder.CREATOR);
/* 114 */                                                                                                   String string3 = parcel.readString();
/* 118 */                                                                                                   Parcelable.Creator<Contents> creator2 = Contents.CREATOR;
/* 125 */                                                                                                   Contents contents2 = (Contents) zzc.zza(parcel, creator2);
/* 132 */                                                                                                   Contents contents3 = (Contents) zzc.zza(parcel, creator2);
/* 139 */                                                                                                   Contents contents4 = (Contents) zzc.zza(parcel, creator2);
/* 141 */                                                                                                   zzc.zzb(parcel);
/* 145 */                                                                                                   mo2120p0(dataHolder14, string3, contents2, contents3, contents4);
                                                                                                            break;
                                                                                                        default:
/* 103 */                                                                                                   return false;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    } else {
/* 1324 */              parcel.readInt();
/* 1327 */              zzc.zzg(parcel);
/* 1330 */              zzc.zzb(parcel);
                    }
/* 1413 */          parcel2.writeNoException();
/* 1416 */          return true;
                }
            }
