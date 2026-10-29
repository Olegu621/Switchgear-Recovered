            package com.google.android.gms.measurement.internal;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import com.google.android.gms.internal.measurement.zzbm;
            import com.google.android.gms.internal.measurement.zzbn;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.cp0;
            import p000.js0;
            import p000.kb1;
            import p000.mp3;
            import p000.rp3;
            import p000.uh3;
            import p000.up3;
            import p000.vg3;
            import p000.yd3;
            import p000.zj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzfz extends zzbm implements zzga {
                @Override // com.google.android.gms.internal.measurement.zzbm
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
                    List list;
/* 1 */             ArrayList arrayList = null;
/* 1 */             zzgd zzgbVar = null;
/* 1 */             zzgg zzgeVar = null;
                    switch (i) {
                        case 1:
/* 967 */                   zzbg zzbgVar = (zzbg) zzbn.zzb(parcel, zzbg.CREATOR);
/* 975 */                   zzr zzrVar = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 977 */                   zzbn.zzf(parcel);
/* 982 */                   ((zzjc) this).mo2170F(zzbgVar, zzrVar);
/* 985 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 2:
/* 939 */                   zzpk zzpkVar = (zzpk) zzbn.zzb(parcel, zzpk.CREATOR);
/* 947 */                   zzr zzrVar2 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 949 */                   zzbn.zzf(parcel);
/* 954 */                   ((zzjc) this).mo2169D(zzpkVar, zzrVar2);
/* 957 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 3:
                        case 8:
                        case Build.API_LEVELS.API_22 /* 22 */:
                        case Build.API_LEVELS.API_23 /* 23 */:
                        case Build.API_LEVELS.API_28 /* 28 */:
                        default:
/* 2 */                     return false;
                        case 4:
/* 919 */                   zzr zzrVar3 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 921 */                   zzbn.zzf(parcel);
/* 926 */                   ((zzjc) this).mo2177V(zzrVar3);
/* 929 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 5:
/* 878 */                   zzbg zzbgVar2 = (zzbg) zzbn.zzb(parcel, zzbg.CREATOR);
/* 880 */                   String string = parcel.readString();
/* 884 */                   parcel.readString();
/* 887 */                   zzbn.zzf(parcel);
/* 890 */                   zzjc zzjcVar = (zzjc) this;
/* 892 */                   kb1.m6061n(zzbgVar2);
/* 895 */                   kb1.m6058k(string);
/* 898 */                   zzjcVar.m2194s0(string, true);
/* 906 */                   zzjcVar.m2195t0(new js0(zzjcVar, zzbgVar2, string));
/* 909 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 6:
/* 858 */                   zzr zzrVar4 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 860 */                   zzbn.zzf(parcel);
/* 865 */                   ((zzjc) this).mo2171G(zzrVar4);
/* 868 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 7:
/* 738 */                   zzr zzrVar5 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 740 */                   boolean zZza = zzbn.zza(parcel);
/* 744 */                   zzbn.zzf(parcel);
/* 747 */                   zzjc zzjcVar2 = (zzjc) this;
/* 749 */                   zzjcVar2.m2193b(zzrVar5);
/* 752 */                   String str = zzrVar5.f4240a;
/* 754 */                   kb1.m6061n(str);
/* 757 */                   mp3 mp3Var = zzjcVar2.f4212a;
                            try {
/* 776 */                       List<rp3> list2 = (List) mp3Var.mo4558b().m1368G(new yd3(zzjcVar2, str)).get();
/* 784 */                       ArrayList arrayList2 = new ArrayList(list2.size());
/* 795 */                       for (rp3 rp3Var : list2) {
/* 803 */                           if (zZza || !up3.m9067X(rp3Var.f16226c)) {
/* 824 */                               arrayList2.add(new zzpk(rp3Var));
                                    }
                                    break;
                                }
/* 828 */                       arrayList = arrayList2;
                            } catch (InterruptedException e) {
/* 817 */                       e = e;
/* 842 */                       mp3Var.mo4557a().f17538f.m8512c(uh3.m9013H(str), "Failed to get user properties. appId", e);
                            } catch (ExecutionException e2) {
/* 814 */                       e = e2;
/* 842 */                       mp3Var.mo4557a().f17538f.m8512c(uh3.m9013H(str), "Failed to get user properties. appId", e);
                            }
/* 845 */                   parcel2.writeNoException();
/* 848 */                   parcel2.writeTypedList(arrayList);
/* 3 */                     return true;
                        case 9:
/* 710 */                   zzbg zzbgVar3 = (zzbg) zzbn.zzb(parcel, zzbg.CREATOR);
/* 712 */                   String string2 = parcel.readString();
/* 716 */                   zzbn.zzf(parcel);
/* 721 */                   byte[] bArrMo2174N = ((zzjc) this).mo2174N(zzbgVar3, string2);
/* 725 */                   parcel2.writeNoException();
/* 728 */                   parcel2.writeByteArray(bArrMo2174N);
/* 3 */                     return true;
                        case 10:
/* 675 */                   long j = parcel.readLong();
/* 679 */                   String string3 = parcel.readString();
/* 683 */                   String string4 = parcel.readString();
/* 687 */                   String string5 = parcel.readString();
/* 691 */                   zzbn.zzf(parcel);
/* 697 */                   ((zzjc) this).mo2185n(j, string3, string4, string5);
/* 700 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 11:
/* 657 */                   zzr zzrVar6 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 659 */                   zzbn.zzf(parcel);
/* 664 */                   String strMo2183k0 = ((zzjc) this).mo2183k0(zzrVar6);
/* 668 */                   parcel2.writeNoException();
/* 671 */                   parcel2.writeString(strMo2183k0);
/* 3 */                     return true;
                        case 12:
/* 629 */                   zzah zzahVar = (zzah) zzbn.zzb(parcel, zzah.CREATOR);
/* 637 */                   zzr zzrVar7 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 639 */                   zzbn.zzf(parcel);
/* 644 */                   ((zzjc) this).mo2181f(zzahVar, zzrVar7);
/* 647 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 581 */                   zzah zzahVar2 = (zzah) zzbn.zzb(parcel, zzah.CREATOR);
/* 583 */                   zzbn.zzf(parcel);
/* 586 */                   zzjc zzjcVar3 = (zzjc) this;
/* 588 */                   kb1.m6061n(zzahVar2);
/* 593 */                   kb1.m6061n(zzahVar2.f4199c);
/* 598 */                   kb1.m6058k(zzahVar2.f4197a);
/* 603 */                   zzjcVar3.m2194s0(zzahVar2.f4197a, true);
/* 616 */                   zzjcVar3.m2195t0(new cp0(zzjcVar3, new zzah(zzahVar2)));
/* 619 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 14:
/* 539 */                   String string6 = parcel.readString();
/* 543 */                   String string7 = parcel.readString();
/* 547 */                   boolean zZza2 = zzbn.zza(parcel);
/* 557 */                   zzr zzrVar8 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 559 */                   zzbn.zzf(parcel);
/* 564 */                   List listMo2182g0 = ((zzjc) this).mo2182g0(string6, string7, zZza2, zzrVar8);
/* 568 */                   parcel2.writeNoException();
/* 571 */                   parcel2.writeTypedList(listMo2182g0);
/* 3 */                     return true;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 507 */                   String string8 = parcel.readString();
/* 511 */                   String string9 = parcel.readString();
/* 515 */                   String string10 = parcel.readString();
/* 519 */                   boolean zZza3 = zzbn.zza(parcel);
/* 523 */                   zzbn.zzf(parcel);
/* 528 */                   List listMo2179d = ((zzjc) this).mo2179d(string8, string9, string10, zZza3);
/* 532 */                   parcel2.writeNoException();
/* 535 */                   parcel2.writeTypedList(listMo2179d);
/* 3 */                     return true;
                        case 16:
/* 475 */                   String string11 = parcel.readString();
/* 479 */                   String string12 = parcel.readString();
/* 489 */                   zzr zzrVar9 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 491 */                   zzbn.zzf(parcel);
/* 496 */                   List listMo2184l0 = ((zzjc) this).mo2184l0(string11, string12, zzrVar9);
/* 500 */                   parcel2.writeNoException();
/* 503 */                   parcel2.writeTypedList(listMo2184l0);
/* 3 */                     return true;
                        case 17:
/* 447 */                   String string13 = parcel.readString();
/* 451 */                   String string14 = parcel.readString();
/* 455 */                   String string15 = parcel.readString();
/* 459 */                   zzbn.zzf(parcel);
/* 464 */                   List listMo2188x = ((zzjc) this).mo2188x(string13, string14, string15);
/* 468 */                   parcel2.writeNoException();
/* 471 */                   parcel2.writeTypedList(listMo2188x);
/* 3 */                     return true;
                        case 18:
/* 433 */                   zzr zzrVar10 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 435 */                   zzbn.zzf(parcel);
/* 440 */                   ((zzjc) this).mo2186p(zzrVar10);
/* 443 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 19:
/* 405 */                   Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 413 */                   zzr zzrVar11 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 415 */                   zzbn.zzf(parcel);
/* 420 */                   ((zzjc) this).mo2176Q(bundle, zzrVar11);
/* 423 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case 20:
/* 385 */                   zzr zzrVar12 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 387 */                   zzbn.zzf(parcel);
/* 392 */                   ((zzjc) this).mo2187q0(zzrVar12);
/* 395 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 352 */                   zzr zzrVar13 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 354 */                   zzbn.zzf(parcel);
/* 359 */                   zzao zzaoVarMo2175P = ((zzjc) this).mo2175P(zzrVar13);
/* 363 */                   parcel2.writeNoException();
/* 366 */                   if (zzaoVarMo2175P == null) {
/* 368 */                       parcel2.writeInt(0);
/* 3 */                         return true;
                            }
/* 372 */                   parcel2.writeInt(1);
/* 375 */                   zzaoVarMo2175P.writeToParcel(parcel2, 1);
/* 3 */                     return true;
                        case 24:
/* 212 */                   zzr zzrVar14 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 220 */                   Bundle bundle2 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 222 */                   zzbn.zzf(parcel);
/* 225 */                   zzjc zzjcVar4 = (zzjc) this;
/* 227 */                   zzjcVar4.m2193b(zzrVar14);
/* 230 */                   String str2 = zzrVar14.f4240a;
/* 232 */                   kb1.m6061n(str2);
/* 235 */                   mp3 mp3Var2 = zzjcVar4.f4212a;
/* 249 */                   if (!mp3Var2.m6753d0().m7406J(null, vg3.f18112Y0)) {
                                try {
/* 315 */                           list = (List) mp3Var2.mo4558b().m1368G(new zj3(zzjcVar4, zzrVar14, bundle2, 1)).get();
                                } catch (InterruptedException | ExecutionException e3) {
/* 333 */                           mp3Var2.mo4557a().f17538f.m8512c(uh3.m9013H(str2), "Failed to get trigger URIs. appId", e3);
/* 336 */                           list = Collections.EMPTY_LIST;
                                }
                                break;
                            } else {
                                try {
/* 272 */                           list = (List) mp3Var2.mo4558b().m1369H(new zj3(zzjcVar4, zzrVar14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
/* 292 */                           mp3Var2.mo4557a().f17538f.m8512c(uh3.m9013H(str2), "Failed to get trigger URIs. appId", e4);
/* 295 */                           list = Collections.EMPTY_LIST;
                                }
                                break;
                            }
/* 338 */                   parcel2.writeNoException();
/* 341 */                   parcel2.writeTypedList(list);
/* 3 */                     return true;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 192 */                   zzr zzrVar15 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 194 */                   zzbn.zzf(parcel);
/* 199 */                   ((zzjc) this).mo2168A(zzrVar15);
/* 202 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 172 */                   zzr zzrVar16 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 174 */                   zzbn.zzf(parcel);
/* 179 */                   ((zzjc) this).mo2172I(zzrVar16);
/* 182 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 152 */                   zzr zzrVar17 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 154 */                   zzbn.zzf(parcel);
/* 159 */                   ((zzjc) this).mo2180d0(zzrVar17);
/* 162 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case Build.API_LEVELS.API_29 /* 29 */:
/* 97 */                    zzr zzrVar18 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 105 */                   zzon zzonVar = (zzon) zzbn.zzb(parcel, zzon.CREATOR);
/* 107 */                   IBinder strongBinder = parcel.readStrongBinder();
/* 111 */                   if (strongBinder != null) {
/* 116 */                       IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
/* 130 */                       zzgeVar = iInterfaceQueryLocalInterface instanceof zzgg ? (zzgg) iInterfaceQueryLocalInterface : new zzge(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                            }
/* 134 */                   zzbn.zzf(parcel);
/* 139 */                   ((zzjc) this).mo2178Y(zzrVar18, zzonVar, zzgeVar);
/* 142 */                   parcel2.writeNoException();
/* 3 */                     return true;
                        case Build.API_LEVELS.API_30 /* 30 */:
/* 69 */                    zzr zzrVar19 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 77 */                    zzaf zzafVar = (zzaf) zzbn.zzb(parcel, zzaf.CREATOR);
/* 79 */                    zzbn.zzf(parcel);
/* 84 */                    ((zzjc) this).mo2173M(zzrVar19, zzafVar);
/* 87 */                    parcel2.writeNoException();
/* 3 */                     return true;
                        case Build.API_LEVELS.API_31 /* 31 */:
/* 14 */                    zzr zzrVar20 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
/* 22 */                    Bundle bundle3 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
/* 24 */                    IBinder strongBinder2 = parcel.readStrongBinder();
/* 28 */                    if (strongBinder2 != null) {
/* 33 */                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
/* 47 */                        zzgbVar = iInterfaceQueryLocalInterface2 instanceof zzgd ? (zzgd) iInterfaceQueryLocalInterface2 : new zzgb(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                            }
/* 51 */                    zzbn.zzf(parcel);
/* 56 */                    ((zzjc) this).mo2189z(zzrVar20, bundle3, zzgbVar);
/* 59 */                    parcel2.writeNoException();
/* 3 */                     return true;
                    }
                }
            }
