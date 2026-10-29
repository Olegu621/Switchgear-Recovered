            package p000;

            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Pair;
            import com.google.android.gms.ads.identifier.AdvertisingIdClient;
            import com.google.android.gms.measurement.internal.zzao;
            import com.google.android.gms.measurement.internal.zzga;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.util.HashMap;
            import java.util.Objects;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wk3 extends be3 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f18676e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ sl3 f18677f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public wk3(sl3 sl3Var, jk3 jk3Var, int i) {
/* 11 */            super(jk3Var);
/* 1 */             this.f18676e = i;
                    switch (i) {
                        case 1:
/* 30 */                    Objects.requireNonNull(sl3Var);
/* 33 */                    this.f18677f = sl3Var;
/* 35 */                    super(jk3Var);
                            break;
                        case 2:
/* 21 */                    Objects.requireNonNull(sl3Var);
/* 24 */                    this.f18677f = sl3Var;
/* 26 */                    super(jk3Var);
                            break;
                        case 3:
/* 15 */                    this.f18677f = sl3Var;
/* 17 */                    super(jk3Var);
                            break;
                        default:
/* 6 */                     Objects.requireNonNull(sl3Var);
/* 9 */                     this.f18677f = sl3Var;
                            break;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:47:0x0134  */
                /* JADX WARN: Code duplicated, block: B:49:0x0152  */
                /* JADX WARN: Code duplicated, block: B:51:0x0163  */
                /* JADX WARN: Code duplicated, block: B:57:0x017f  */
                /* JADX WARN: Code duplicated, block: B:58:0x0182  */
                /* JADX WARN: Code duplicated, block: B:60:0x0185  */
                /* JADX WARN: Code duplicated, block: B:62:0x018f  */
                /* JADX WARN: Code duplicated, block: B:65:0x0195  */
                /* JADX WARN: Code duplicated, block: B:66:0x0198  */
                /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
                /* JADX WARN: Code duplicated, block: B:70:0x01e9  */
                /* JADX WARN: Code duplicated, block: B:73:0x0202  */
                /* JADX WARN: Code duplicated, block: B:75:0x0205  */
                /* JADX WARN: Code duplicated, block: B:76:0x0207  */
                /* JADX WARN: Code duplicated, block: B:81:0x0295 A[Catch: IllegalArgumentException -> 0x029c, MalformedURLException -> 0x029e, TryCatch #5 {IllegalArgumentException -> 0x029c, MalformedURLException -> 0x029e, blocks: (B:79:0x024d, B:81:0x0295, B:86:0x02a0, B:88:0x02a6, B:90:0x02ae, B:91:0x02b4, B:92:0x02b8), top: B:115:0x024d }] */
                /* JADX WARN: Code duplicated, block: B:88:0x02a6 A[Catch: IllegalArgumentException -> 0x029c, MalformedURLException -> 0x029e, TryCatch #5 {IllegalArgumentException -> 0x029c, MalformedURLException -> 0x029e, blocks: (B:79:0x024d, B:81:0x0295, B:86:0x02a0, B:88:0x02a6, B:90:0x02ae, B:91:0x02b4, B:92:0x02b8), top: B:115:0x024d }] */
                /* JADX WARN: Code duplicated, block: B:90:0x02ae A[Catch: IllegalArgumentException -> 0x029c, MalformedURLException -> 0x029e, TryCatch #5 {IllegalArgumentException -> 0x029c, MalformedURLException -> 0x029e, blocks: (B:79:0x024d, B:81:0x0295, B:86:0x02a0, B:88:0x02a6, B:90:0x02ae, B:91:0x02b4, B:92:0x02b8), top: B:115:0x024d }] */
                /* JADX WARN: Code duplicated, block: B:96:0x02d2  */
                @Override // p000.be3
                /* JADX INFO: renamed from: a */
                public final void mo1347a() {
                    Pair pair;
                    NetworkInfo activeNetworkInfo;
                    pn3 pn3VarM4567o;
                    ij3 ij3Var;
                    zzga zzgaVar;
                    zzao zzaoVarMo2175P;
                    Bundle bundle;
                    String str;
                    Boolean bool;
                    int iOrdinal;
                    int i;
                    String str2;
                    String string;
                    ij3 ij3Var2;
                    URL url;
                    String strConcat;
/* 3 */             int i2 = this.f18676e;
/* 5 */             int i3 = 0;
/* 6 */             sl3 sl3Var = this.f18677f;
                    switch (i2) {
                        case 0:
/* 795 */                   sl3 sl3Var2 = ((ij3) sl3Var.f16749a).f9642X;
/* 797 */                   ij3.m4554k(sl3Var2);
/* 808 */                   new Thread(new uk3(sl3Var2, i3)).start();
                            break;
                        case 1:
/* 785 */                   sl3Var.m8573X();
                            break;
                        case 2:
/* 781 */                   sl3Var.m8555F();
                            break;
                        default:
/* 14 */                    ij3 ij3Var3 = (ij3) sl3Var.f16749a;
/* 16 */                    ki3 ki3Var = ij3Var3.f9653e;
/* 18 */                    uh3 uh3Var = ij3Var3.f9655f;
/* 20 */                    bj3 bj3Var = ij3Var3.f9659i;
/* 22 */                    ij3.m4555l(bj3Var);
/* 25 */                    bj3Var.mo1375y();
/* 28 */                    wl3 wl3Var = ij3Var3.f9644Z;
/* 30 */                    ij3.m4555l(wl3Var);
/* 36 */                    ij3 ij3Var4 = (ij3) wl3Var.f16749a;
/* 38 */                    ij3.m4555l(wl3Var);
/* 45 */                    String strM4534F = ij3Var3.m4569q().m4534F();
/* 53 */                    Boolean boolM7408L = ij3Var3.f9651d.m7408L("google_analytics_adid_collection_enabled");
/* 57 */                    if (boolM7408L == null || boolM7408L.booleanValue()) {
/* 78 */                        ij3.m4553j(ki3Var);
/* 84 */                        ij3 ij3Var5 = (ij3) ki3Var.f16749a;
/* 86 */                        ki3Var.mo1375y();
/* 102 */                       if (ki3Var.m6116G().m7189i(nk3.AD_STORAGE)) {
/* 106 */                           ij3Var5.f9640V.getClass();
/* 109 */                           long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 113 */                           String str3 = ki3Var.f12816v;
/* 115 */                           if (str3 == null || jElapsedRealtime >= ki3Var.f12795U) {
/* 145 */                               ki3Var.f12795U = ij3Var5.f9651d.m7403G(strM4534F, vg3.f18118b) + jElapsedRealtime;
/* 147 */                               AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                                        try {
/* 152 */                                   AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(ij3Var5.f9645a);
/* 156 */                                   ki3Var.f12816v = HttpUrl.FRAGMENT_ENCODE_SET;
/* 158 */                                   String id = advertisingIdInfo.getId();
/* 162 */                                   if (id != null) {
/* 164 */                                       ki3Var.f12816v = id;
                                            }
/* 173 */                                   ki3Var.f12817w = advertisingIdInfo.isLimitAdTrackingEnabled();
                                        } catch (Exception e) {
/* 176 */                                   uh3 uh3Var2 = ij3Var5.f9655f;
/* 178 */                                   ij3.m4555l(uh3Var2);
/* 185 */                                   uh3Var2.f17533X.m8511b(e, "Unable to get advertising id");
/* 188 */                                   ki3Var.f12816v = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
/* 190 */                               AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
/* 203 */                               pair = new Pair(ki3Var.f12816v, Boolean.valueOf(ki3Var.f12817w));
                                    } else {
/* 132 */                               pair = new Pair(str3, Boolean.valueOf(ki3Var.f12817w));
                                    }
                                } else {
/* 211 */                           pair = new Pair(HttpUrl.FRAGMENT_ENCODE_SET, Boolean.FALSE);
                                }
/* 222 */                       if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
/* 236 */                           ij3.m4555l(wl3Var);
/* 239 */                           wl3Var.m4240B();
/* 250 */                           ConnectivityManager connectivityManager = (ConnectivityManager) ij3Var4.f9645a.getSystemService("connectivity");
/* 253 */                           if (connectivityManager != null) {
                                        try {
/* 255 */                                   activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                        } catch (SecurityException unused) {
/* 260 */                                   activeNetworkInfo = null;
                                        }
                                    } else {
/* 260 */                               activeNetworkInfo = null;
                                    }
/* 261 */                           if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
/* 271 */                               StringBuilder sb = new StringBuilder();
/* 274 */                               pn3 pn3VarM4567o2 = ij3Var3.m4567o();
/* 278 */                               pn3VarM4567o2.mo1375y();
/* 281 */                               pn3VarM4567o2.m9576A();
/* 288 */                               if (!pn3VarM4567o2.m7511G()) {
/* 309 */                                   sl3 sl3Var3 = ij3Var3.f9642X;
/* 311 */                                   ij3.m4554k(sl3Var3);
/* 316 */                                   ij3 ij3Var6 = (ij3) sl3Var3.f16749a;
/* 318 */                                   sl3Var3.mo1375y();
/* 321 */                                   pn3VarM4567o = ij3Var6.m4567o();
/* 327 */                                   ij3Var = (ij3) pn3VarM4567o.f16749a;
/* 329 */                                   pn3VarM4567o.mo1375y();
/* 332 */                                   pn3VarM4567o.m9576A();
/* 335 */                                   zzgaVar = pn3VarM4567o.f15188d;
/* 337 */                                   if (zzgaVar == null) {
/* 339 */                                       pn3VarM4567o.m7510F();
/* 342 */                                       uh3 uh3Var3 = ij3Var.f9655f;
/* 344 */                                       ij3.m4555l(uh3Var3);
/* 351 */                                       uh3Var3.f17533X.m8510a("Failed to get consents; not connected to service yet.");
                                            } else {
                                                try {
/* 360 */                                           zzaoVarMo2175P = zzgaVar.mo2175P(pn3VarM4567o.m7520P(false));
/* 364 */                                           pn3VarM4567o.m7517M();
                                                } catch (RemoteException e2) {
/* 369 */                                           uh3 uh3Var4 = ij3Var.f9655f;
/* 371 */                                           ij3.m4555l(uh3Var4);
/* 378 */                                           uh3Var4.f17538f.m8511b(e2, "Failed to get consents; remote exception");
/* 354 */                                           zzaoVarMo2175P = null;
                                                }
/* 382 */                                       if (zzaoVarMo2175P != null) {
/* 384 */                                           bundle = zzaoVarMo2175P.f4206a;
                                                } else {
/* 387 */                                           bundle = null;
                                                }
/* 388 */                                       if (bundle == null) {
/* 390 */                                           i = ij3Var3.f9664m0;
/* 394 */                                           ij3Var3.f9664m0 = i + 1;
/* 398 */                                           i3 = i < 10 ? 1 : 0;
/* 401 */                                           ij3.m4555l(uh3Var);
/* 404 */                                           if (i < 10) {
/* 406 */                                               str2 = "Retrying.";
                                                    } else {
/* 409 */                                               str2 = "Skipping.";
                                                    }
/* 438 */                                           uh3Var.f17533X.m8511b(Integer.valueOf(ij3Var3.f9664m0), fm0.m3790p(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                                } else {
/* 445 */                                           ok3 ok3VarM7181b = ok3.m7181b(100, bundle);
/* 451 */                                           sb.append("&gcs=");
/* 458 */                                           sb.append(ok3VarM7181b.m7187f());
/* 461 */                                           ce3 ce3VarM1647c = ce3.m1647c(100, bundle);
/* 465 */                                           str = ce3VarM1647c.f2869d;
/* 469 */                                           sb.append("&dma=");
/* 472 */                                           Boolean bool2 = ce3VarM1647c.f2868c;
/* 474 */                                           bool = Boolean.FALSE;
/* 481 */                                           sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
/* 488 */                                           if (!TextUtils.isEmpty(str)) {
/* 492 */                                               sb.append("&dma_cps=");
/* 495 */                                               sb.append(str);
                                                    }
/* 508 */                                           iOrdinal = ok3.m7183d(bundle.getString("ad_personalization")).ordinal();
/* 513 */                                           if (iOrdinal != 2) {
/* 516 */                                               if (iOrdinal != 3) {
/* 518 */                                                   bool = null;
                                                        } else {
/* 520 */                                                   bool = Boolean.TRUE;
                                                        }
                                                    }
/* 528 */                                           int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
/* 531 */                                           sb.append("&npa=");
/* 534 */                                           sb.append(i4);
/* 537 */                                           ij3.m4555l(uh3Var);
/* 544 */                                           uh3Var.f17534Y.m8511b(sb, "Consent query parameters to Bow");
/* 547 */                                           up3 up3Var = ij3Var3.f9668w;
/* 549 */                                           ij3.m4553j(up3Var);
/* 562 */                                           ((ij3) ij3Var3.m4569q().f16749a).f9651d.m7401E();
/* 567 */                                           String str4 = (String) pair.first;
/* 577 */                                           long jM4932a = ki3Var.f12810f0.m4932a() - 1;
/* 578 */                                           string = sb.toString();
/* 584 */                                           ij3Var2 = (ij3) up3Var.f16749a;
                                                    try {
/* 590 */                                               kb1.m6058k(str4);
/* 593 */                                               kb1.m6058k(strM4534F);
/* 644 */                                               strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + up3Var.m9103f0()) + "&rdid=" + str4 + "&bundleid=" + strM4534F + "&retry=" + jM4932a;
/* 660 */                                               if (strM4534F.equals(ij3Var2.f9651d.m7400D("debug.deferred.deeplink"))) {
/* 664 */                                                   strConcat = strConcat.concat("&ddl_test=1");
                                                        }
/* 677 */                                               if (!string.isEmpty()) {
/* 685 */                                                   if (string.charAt(0) != '&') {
/* 689 */                                                       strConcat = strConcat.concat("&");
                                                            }
/* 693 */                                                   strConcat = strConcat.concat(string);
                                                        }
/* 699 */                                               url = new URL(strConcat);
                                                    } catch (IllegalArgumentException e3) {
/* 669 */                                               e = e3;
/* 704 */                                               uh3 uh3Var5 = ij3Var2.f9655f;
/* 706 */                                               ij3.m4555l(uh3Var5);
/* 717 */                                               uh3Var5.f17538f.m8511b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
/* 720 */                                               url = null;
                                                    } catch (MalformedURLException e4) {
/* 671 */                                               e = e4;
/* 704 */                                               uh3 uh3Var6 = ij3Var2.f9655f;
/* 706 */                                               ij3.m4555l(uh3Var6);
/* 717 */                                               uh3Var6.f17538f.m8511b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
/* 720 */                                               url = null;
                                                    }
/* 721 */                                           if (url != null) {
/* 723 */                                               ij3.m4555l(wl3Var);
/* 728 */                                               pi3 pi3Var = new pi3(ij3Var3);
/* 731 */                                               wl3Var.m4240B();
/* 734 */                                               bj3 bj3Var2 = ij3Var4.f9659i;
/* 736 */                                               ij3.m4555l(bj3Var2);
/* 746 */                                               bj3Var2.m1373L(new eu0(wl3Var, strM4534F, url, (byte[]) null, (HashMap) null, pi3Var));
                                                    }
                                                }
                                            }
/* 354 */                                   zzaoVarMo2175P = null;
/* 382 */                                   if (zzaoVarMo2175P != null) {
/* 384 */                                       bundle = zzaoVarMo2175P.f4206a;
                                            } else {
/* 387 */                                       bundle = null;
                                            }
/* 388 */                                   if (bundle == null) {
/* 390 */                                       i = ij3Var3.f9664m0;
/* 394 */                                       ij3Var3.f9664m0 = i + 1;
/* 398 */                                       if (i < 10) {
                                                }
/* 401 */                                       ij3.m4555l(uh3Var);
/* 404 */                                       if (i < 10) {
/* 406 */                                           str2 = "Retrying.";
                                                } else {
/* 409 */                                           str2 = "Skipping.";
                                                }
/* 438 */                                       uh3Var.f17533X.m8511b(Integer.valueOf(ij3Var3.f9664m0), fm0.m3790p(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                            } else {
/* 445 */                                       ok3 ok3VarM7181b2 = ok3.m7181b(100, bundle);
/* 451 */                                       sb.append("&gcs=");
/* 458 */                                       sb.append(ok3VarM7181b2.m7187f());
/* 461 */                                       ce3 ce3VarM1647c2 = ce3.m1647c(100, bundle);
/* 465 */                                       str = ce3VarM1647c2.f2869d;
/* 469 */                                       sb.append("&dma=");
/* 472 */                                       Boolean bool3 = ce3VarM1647c2.f2868c;
/* 474 */                                       bool = Boolean.FALSE;
/* 481 */                                       sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
/* 488 */                                       if (!TextUtils.isEmpty(str)) {
/* 492 */                                           sb.append("&dma_cps=");
/* 495 */                                           sb.append(str);
                                                }
/* 508 */                                       iOrdinal = ok3.m7183d(bundle.getString("ad_personalization")).ordinal();
/* 513 */                                       if (iOrdinal != 2) {
/* 516 */                                           if (iOrdinal != 3) {
/* 518 */                                               bool = null;
                                                    } else {
/* 520 */                                               bool = Boolean.TRUE;
                                                    }
                                                }
/* 528 */                                       int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
/* 531 */                                       sb.append("&npa=");
/* 534 */                                       sb.append(i5);
/* 537 */                                       ij3.m4555l(uh3Var);
/* 544 */                                       uh3Var.f17534Y.m8511b(sb, "Consent query parameters to Bow");
/* 547 */                                       up3 up3Var2 = ij3Var3.f9668w;
/* 549 */                                       ij3.m4553j(up3Var2);
/* 562 */                                       ((ij3) ij3Var3.m4569q().f16749a).f9651d.m7401E();
/* 567 */                                       String str5 = (String) pair.first;
/* 577 */                                       long jM4932a2 = ki3Var.f12810f0.m4932a() - 1;
/* 578 */                                       string = sb.toString();
/* 584 */                                       ij3Var2 = (ij3) up3Var2.f16749a;
/* 590 */                                       kb1.m6058k(str5);
/* 593 */                                       kb1.m6058k(strM4534F);
/* 644 */                                       strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + up3Var2.m9103f0()) + "&rdid=" + str5 + "&bundleid=" + strM4534F + "&retry=" + jM4932a2;
/* 660 */                                       if (strM4534F.equals(ij3Var2.f9651d.m7400D("debug.deferred.deeplink"))) {
/* 664 */                                           strConcat = strConcat.concat("&ddl_test=1");
                                                }
/* 677 */                                       if (!string.isEmpty()) {
/* 685 */                                           if (string.charAt(0) != '&') {
/* 689 */                                               strConcat = strConcat.concat("&");
                                                    }
/* 693 */                                           strConcat = strConcat.concat(string);
                                                }
/* 699 */                                       url = new URL(strConcat);
/* 721 */                                       if (url != null) {
/* 723 */                                           ij3.m4555l(wl3Var);
/* 728 */                                           pi3 pi3Var2 = new pi3(ij3Var3);
/* 731 */                                           wl3Var.m4240B();
/* 734 */                                           bj3 bj3Var3 = ij3Var4.f9659i;
/* 736 */                                           ij3.m4555l(bj3Var3);
/* 746 */                                           bj3Var3.m1373L(new eu0(wl3Var, strM4534F, url, (byte[]) null, (HashMap) null, pi3Var2));
                                                }
                                            }
                                            break;
                                        } else {
/* 295 */                                   up3 up3Var3 = ((ij3) pn3VarM4567o2.f16749a).f9668w;
/* 297 */                                   ij3.m4553j(up3Var3);
/* 307 */                                   if (up3Var3.m9103f0() >= 234200) {
/* 309 */                                       sl3 sl3Var4 = ij3Var3.f9642X;
/* 311 */                                       ij3.m4554k(sl3Var4);
/* 316 */                                       ij3 ij3Var7 = (ij3) sl3Var4.f16749a;
/* 318 */                                       sl3Var4.mo1375y();
/* 321 */                                       pn3VarM4567o = ij3Var7.m4567o();
/* 327 */                                       ij3Var = (ij3) pn3VarM4567o.f16749a;
/* 329 */                                       pn3VarM4567o.mo1375y();
/* 332 */                                       pn3VarM4567o.m9576A();
/* 335 */                                       zzgaVar = pn3VarM4567o.f15188d;
/* 337 */                                       if (zzgaVar == null) {
/* 339 */                                           pn3VarM4567o.m7510F();
/* 342 */                                           uh3 uh3Var7 = ij3Var.f9655f;
/* 344 */                                           ij3.m4555l(uh3Var7);
/* 351 */                                           uh3Var7.f17533X.m8510a("Failed to get consents; not connected to service yet.");
                                                } else {
/* 360 */                                           zzaoVarMo2175P = zzgaVar.mo2175P(pn3VarM4567o.m7520P(false));
/* 364 */                                           pn3VarM4567o.m7517M();
/* 382 */                                           if (zzaoVarMo2175P != null) {
/* 384 */                                               bundle = zzaoVarMo2175P.f4206a;
                                                    } else {
/* 387 */                                               bundle = null;
                                                    }
/* 388 */                                           if (bundle == null) {
/* 390 */                                               i = ij3Var3.f9664m0;
/* 394 */                                               ij3Var3.f9664m0 = i + 1;
/* 398 */                                               if (i < 10) {
                                                        }
/* 401 */                                               ij3.m4555l(uh3Var);
/* 404 */                                               if (i < 10) {
/* 406 */                                                   str2 = "Retrying.";
                                                        } else {
/* 409 */                                                   str2 = "Skipping.";
                                                        }
/* 438 */                                               uh3Var.f17533X.m8511b(Integer.valueOf(ij3Var3.f9664m0), fm0.m3790p(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                                    } else {
/* 445 */                                               ok3 ok3VarM7181b3 = ok3.m7181b(100, bundle);
/* 451 */                                               sb.append("&gcs=");
/* 458 */                                               sb.append(ok3VarM7181b3.m7187f());
/* 461 */                                               ce3 ce3VarM1647c3 = ce3.m1647c(100, bundle);
/* 465 */                                               str = ce3VarM1647c3.f2869d;
/* 469 */                                               sb.append("&dma=");
/* 472 */                                               Boolean bool4 = ce3VarM1647c3.f2868c;
/* 474 */                                               bool = Boolean.FALSE;
/* 481 */                                               sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
/* 488 */                                               if (!TextUtils.isEmpty(str)) {
/* 492 */                                                   sb.append("&dma_cps=");
/* 495 */                                                   sb.append(str);
                                                        }
/* 508 */                                               iOrdinal = ok3.m7183d(bundle.getString("ad_personalization")).ordinal();
/* 513 */                                               if (iOrdinal != 2) {
/* 516 */                                                   if (iOrdinal != 3) {
/* 518 */                                                       bool = null;
                                                            } else {
/* 520 */                                                       bool = Boolean.TRUE;
                                                            }
                                                        }
/* 528 */                                               int i6 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
/* 531 */                                               sb.append("&npa=");
/* 534 */                                               sb.append(i6);
/* 537 */                                               ij3.m4555l(uh3Var);
/* 544 */                                               uh3Var.f17534Y.m8511b(sb, "Consent query parameters to Bow");
/* 547 */                                               up3 up3Var4 = ij3Var3.f9668w;
/* 549 */                                               ij3.m4553j(up3Var4);
/* 562 */                                               ((ij3) ij3Var3.m4569q().f16749a).f9651d.m7401E();
/* 567 */                                               String str6 = (String) pair.first;
/* 577 */                                               long jM4932a3 = ki3Var.f12810f0.m4932a() - 1;
/* 578 */                                               string = sb.toString();
/* 584 */                                               ij3Var2 = (ij3) up3Var4.f16749a;
/* 590 */                                               kb1.m6058k(str6);
/* 593 */                                               kb1.m6058k(strM4534F);
/* 644 */                                               strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + up3Var4.m9103f0()) + "&rdid=" + str6 + "&bundleid=" + strM4534F + "&retry=" + jM4932a3;
/* 660 */                                               if (strM4534F.equals(ij3Var2.f9651d.m7400D("debug.deferred.deeplink"))) {
/* 664 */                                                   strConcat = strConcat.concat("&ddl_test=1");
                                                        }
/* 677 */                                               if (!string.isEmpty()) {
/* 685 */                                                   if (string.charAt(0) != '&') {
/* 689 */                                                       strConcat = strConcat.concat("&");
                                                            }
/* 693 */                                                   strConcat = strConcat.concat(string);
                                                        }
/* 699 */                                               url = new URL(strConcat);
/* 721 */                                               if (url != null) {
/* 723 */                                                   ij3.m4555l(wl3Var);
/* 728 */                                                   pi3 pi3Var3 = new pi3(ij3Var3);
/* 731 */                                                   wl3Var.m4240B();
/* 734 */                                                   bj3 bj3Var4 = ij3Var4.f9659i;
/* 736 */                                                   ij3.m4555l(bj3Var4);
/* 746 */                                                   bj3Var4.m1373L(new eu0(wl3Var, strM4534F, url, (byte[]) null, (HashMap) null, pi3Var3));
                                                        }
                                                    }
                                                }
/* 354 */                                       zzaoVarMo2175P = null;
/* 382 */                                       if (zzaoVarMo2175P != null) {
/* 384 */                                           bundle = zzaoVarMo2175P.f4206a;
                                                } else {
/* 387 */                                           bundle = null;
                                                }
/* 388 */                                       if (bundle == null) {
/* 390 */                                           i = ij3Var3.f9664m0;
/* 394 */                                           ij3Var3.f9664m0 = i + 1;
/* 398 */                                           if (i < 10) {
                                                    }
/* 401 */                                           ij3.m4555l(uh3Var);
/* 404 */                                           if (i < 10) {
/* 406 */                                               str2 = "Retrying.";
                                                    } else {
/* 409 */                                               str2 = "Skipping.";
                                                    }
/* 438 */                                           uh3Var.f17533X.m8511b(Integer.valueOf(ij3Var3.f9664m0), fm0.m3790p(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                                } else {
/* 445 */                                           ok3 ok3VarM7181b4 = ok3.m7181b(100, bundle);
/* 451 */                                           sb.append("&gcs=");
/* 458 */                                           sb.append(ok3VarM7181b4.m7187f());
/* 461 */                                           ce3 ce3VarM1647c4 = ce3.m1647c(100, bundle);
/* 465 */                                           str = ce3VarM1647c4.f2869d;
/* 469 */                                           sb.append("&dma=");
/* 472 */                                           Boolean bool5 = ce3VarM1647c4.f2868c;
/* 474 */                                           bool = Boolean.FALSE;
/* 481 */                                           sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
/* 488 */                                           if (!TextUtils.isEmpty(str)) {
/* 492 */                                               sb.append("&dma_cps=");
/* 495 */                                               sb.append(str);
                                                    }
/* 508 */                                           iOrdinal = ok3.m7183d(bundle.getString("ad_personalization")).ordinal();
/* 513 */                                           if (iOrdinal != 2) {
/* 516 */                                               if (iOrdinal != 3) {
/* 518 */                                                   bool = null;
                                                        } else {
/* 520 */                                                   bool = Boolean.TRUE;
                                                        }
                                                    }
/* 528 */                                           int i7 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
/* 531 */                                           sb.append("&npa=");
/* 534 */                                           sb.append(i7);
/* 537 */                                           ij3.m4555l(uh3Var);
/* 544 */                                           uh3Var.f17534Y.m8511b(sb, "Consent query parameters to Bow");
/* 547 */                                           up3 up3Var5 = ij3Var3.f9668w;
/* 549 */                                           ij3.m4553j(up3Var5);
/* 562 */                                           ((ij3) ij3Var3.m4569q().f16749a).f9651d.m7401E();
/* 567 */                                           String str7 = (String) pair.first;
/* 577 */                                           long jM4932a4 = ki3Var.f12810f0.m4932a() - 1;
/* 578 */                                           string = sb.toString();
/* 584 */                                           ij3Var2 = (ij3) up3Var5.f16749a;
/* 590 */                                           kb1.m6058k(str7);
/* 593 */                                           kb1.m6058k(strM4534F);
/* 644 */                                           strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + up3Var5.m9103f0()) + "&rdid=" + str7 + "&bundleid=" + strM4534F + "&retry=" + jM4932a4;
/* 660 */                                           if (strM4534F.equals(ij3Var2.f9651d.m7400D("debug.deferred.deeplink"))) {
/* 664 */                                               strConcat = strConcat.concat("&ddl_test=1");
                                                    }
/* 677 */                                           if (!string.isEmpty()) {
/* 685 */                                               if (string.charAt(0) != '&') {
/* 689 */                                                   strConcat = strConcat.concat("&");
                                                        }
/* 693 */                                               strConcat = strConcat.concat(string);
                                                    }
/* 699 */                                           url = new URL(strConcat);
/* 721 */                                           if (url != null) {
/* 723 */                                               ij3.m4555l(wl3Var);
/* 728 */                                               pi3 pi3Var4 = new pi3(ij3Var3);
/* 731 */                                               wl3Var.m4240B();
/* 734 */                                               bj3 bj3Var5 = ij3Var4.f9659i;
/* 736 */                                               ij3.m4555l(bj3Var5);
/* 746 */                                               bj3Var5.m1373L(new eu0(wl3Var, strM4534F, url, (byte[]) null, (HashMap) null, pi3Var4));
                                                    }
                                                }
                                            } else {
/* 547 */                                       up3 up3Var6 = ij3Var3.f9668w;
/* 549 */                                       ij3.m4553j(up3Var6);
/* 562 */                                       ((ij3) ij3Var3.m4569q().f16749a).f9651d.m7401E();
/* 567 */                                       String str8 = (String) pair.first;
/* 577 */                                       long jM4932a5 = ki3Var.f12810f0.m4932a() - 1;
/* 578 */                                       string = sb.toString();
/* 584 */                                       ij3Var2 = (ij3) up3Var6.f16749a;
/* 590 */                                       kb1.m6058k(str8);
/* 593 */                                       kb1.m6058k(strM4534F);
/* 644 */                                       strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + up3Var6.m9103f0()) + "&rdid=" + str8 + "&bundleid=" + strM4534F + "&retry=" + jM4932a5;
/* 660 */                                       if (strM4534F.equals(ij3Var2.f9651d.m7400D("debug.deferred.deeplink"))) {
/* 664 */                                           strConcat = strConcat.concat("&ddl_test=1");
                                                }
/* 677 */                                       if (!string.isEmpty()) {
/* 685 */                                           if (string.charAt(0) != '&') {
/* 689 */                                               strConcat = strConcat.concat("&");
                                                    }
/* 693 */                                           strConcat = strConcat.concat(string);
                                                }
/* 699 */                                       url = new URL(strConcat);
/* 721 */                                       if (url != null) {
/* 723 */                                           ij3.m4555l(wl3Var);
/* 728 */                                           pi3 pi3Var5 = new pi3(ij3Var3);
/* 731 */                                           wl3Var.m4240B();
/* 734 */                                           bj3 bj3Var6 = ij3Var4.f9659i;
/* 736 */                                           ij3.m4555l(bj3Var6);
/* 746 */                                           bj3Var6.m1373L(new eu0(wl3Var, strM4534F, url, (byte[]) null, (HashMap) null, pi3Var5));
                                                }
                                            }
                                        }
                                    } else {
/* 750 */                               ij3.m4555l(uh3Var);
/* 757 */                               uh3Var.f17541w.m8510a("Network is not available for Deferred Deep Link request. Skipping");
                                    }
                                } else {
/* 761 */                           ij3.m4555l(uh3Var);
/* 768 */                           uh3Var.f17534Y.m8510a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                                }
                            } else {
/* 66 */                        ij3.m4555l(uh3Var);
/* 73 */                        uh3Var.f17534Y.m8510a("ADID collection is disabled from Manifest. Skipping");
                            }
/* 771 */                   if (i3 != 0) {
/* 777 */                       sl3Var.f16689e0.m1348b(2000L);
                            }
                            break;
                    }
                }
            }
