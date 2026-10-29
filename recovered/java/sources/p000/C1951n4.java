            package p000;

            import android.graphics.SurfaceTexture;
            import android.view.Surface;
            import com.google.android.gms.tasks.OnFailureListener;
            import com.google.gson.JsonIOException;
            import com.google.gson.JsonSyntaxException;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.EOFException;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.Map;
            import java.util.NoSuchElementException;
            import java.util.Set;
            
            /* JADX INFO: renamed from: n4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final /* synthetic */ class C1951n4 implements fx1, q31, OnFailureListener, uw1, nw0, InterfaceC0934fy {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14116a;

                /* JADX INFO: renamed from: b */
                public static /* synthetic */ void m6854b() throws EOFException {
/* 6 */             throw new EOFException();
                }

                /* JADX INFO: renamed from: e */
                public static void m6855e(int i) {
/* 12 */            throw new q11(fm0.m3781g(i, "An unknown field for index "));
                }

                /* JADX INFO: renamed from: g */
                public static /* synthetic */ void m6856g(Object obj) {
/* 6 */             throw new AssertionError(obj);
                }

                /* JADX INFO: renamed from: h */
                public static /* synthetic */ void m6857h(Object obj, long j) throws EOFException {
/* 33 */            throw new EOFException("\\n not found: limit=" + j + ((Object) " content=") + obj + (char) 8230);
                }

                /* JADX INFO: renamed from: i */
                public static /* synthetic */ void m6858i(Object obj, String str) {
/* 18 */            throw new NumberFormatException(str + obj);
                }

                /* JADX INFO: renamed from: j */
                public static /* synthetic */ void m6859j(String str) {
/* 6 */             throw new IllegalArgumentException(str);
                }

                /* JADX INFO: renamed from: k */
                public static /* synthetic */ void m6860k(String str, float f, Object obj, float f2) {
/* 29 */            throw new IllegalStateException(str + f + obj + f2 + ((Object) ")"));
                }

                /* JADX INFO: renamed from: l */
                public static /* synthetic */ void m6861l(String str, Object obj, Object obj2, Throwable th) {
/* 21 */            throw new RuntimeException(str + obj + obj2, th);
                }

                /* JADX INFO: renamed from: m */
                public static /* synthetic */ void m6862m(StringBuilder sb, Object obj, Throwable th) {
/* 1 */             sb.append(obj);
/* 13 */            throw new JsonSyntaxException(sb.toString(), th);
                }

                /* JADX INFO: renamed from: n */
                public static /* synthetic */ void m6863n(Throwable th) {
/* 6 */             throw new IllegalArgumentException(th);
                }

                /* JADX INFO: renamed from: o */
                public static /* synthetic */ void m6864o() {
/* 6 */             throw new NoSuchElementException();
                }

                /* JADX INFO: renamed from: p */
                public static /* synthetic */ void m6865p(Object obj, String str) {
/* 18 */            throw new IllegalArgumentException(str + obj);
                }

                /* JADX INFO: renamed from: q */
                public static /* synthetic */ void m6866q(String str) {
/* 6 */             throw new UnsupportedOperationException(str);
                }

                /* JADX INFO: renamed from: r */
                public static /* synthetic */ void m6867r(Object obj, String str) {
/* 22 */            throw new IllegalArgumentException((str + obj).toString());
                }

                /* JADX INFO: renamed from: s */
                public static /* synthetic */ void m6868s(String str) {
/* 6 */             throw new NullPointerException(str);
                }

                /* JADX INFO: renamed from: t */
                public static /* synthetic */ void m6869t(Object obj, String str) {
/* 22 */            throw new JsonIOException(str + ((Object) obj.toString()));
                }

                @Override // p000.fx1
                /* JADX INFO: renamed from: a */
                public Object mo3208a(de3 de3Var) throws GeneralSecurityException {
/* 5 */             C1903lu c1903lu = new C1903lu();
/* 13 */            if (pm2.m7478a(1)) {
/* 15 */                return c1903lu;
                    }
/* 18 */            ds0.m3203t("Can not use AES-CMAC in FIPS-mode.");
/* 21 */            return null;
                }

                @Override // p000.q31
                /* JADX INFO: renamed from: c */
                public de3 mo3209c(xy1 xy1Var) throws GeneralSecurityException {
                    C0204c5 c0204c5;
/* 20 */            int i = 4;
/* 21 */            int i2 = 3;
/* 22 */            int i3 = 2;
/* 25 */            int i4 = 12;
                    switch (this.f14116a) {
                        case 1:
/* 1231 */                  if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
/* 1376 */                      m6859j("Wrong type URL in call to AesCmacParameters.parseParameters");
/* 27 */                        return null;
                            }
                            try {
/* 1241 */                      C1780j4 c1780j4M5692D = C1780j4.m5692D((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 1249 */                      if (c1780j4M5692D.m5697B() != 0) {
/* 1367 */                          throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 1253 */                      C0875ec c0875ec = new C0875ec(i2);
/* 1256 */                      c0875ec.f7613b = null;
/* 1258 */                      c0875ec.f7614c = null;
/* 1262 */                      c0875ec.f7615d = C2131r4.f15851f;
/* 1272 */                      c0875ec.m3374M(c1780j4M5692D.m5698z().size());
/* 1279 */                      int iM8952y = c1780j4M5692D.m5696A().m8952y();
/* 1283 */                      if (iM8952y < 10 || 16 < iM8952y) {
/* 1361 */                          throw new GeneralSecurityException(fm0.m3781g(iM8952y, "Invalid tag size for AesCmacParameters: "));
                                }
/* 1291 */                      c0875ec.f7614c = Integer.valueOf(iM8952y);
/* 1301 */                      c0875ec.f7615d = AbstractC2280v4.m9218a((wq1) xy1Var.f19398f);
/* 1303 */                      C2168s4 c2168s4M3385h = c0875ec.m3385h();
/* 1309 */                      C0875ec c0875ec2 = new C0875ec(i3);
/* 1312 */                      c0875ec2.f7614c = null;
/* 1314 */                      c0875ec2.f7615d = null;
/* 1316 */                      c0875ec2.f7613b = c2168s4M3385h;
/* 1337 */                      c0875ec2.f7614c = new fs0(C2335wl.m9584a(c1780j4M5692D.m5698z().m9304e()), 12);
/* 1343 */                      c0875ec2.f7615d = (Integer) xy1Var.f19394b;
/* 1345 */                      return c0875ec2.m3384g();
                            } catch (IllegalArgumentException | pz0 unused) {
/* 1370 */                      ds0.m3203t("Parsing AesCmacKey failed");
/* 27 */                        return null;
                            }
                        case 2:
/* 900 */                   if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
/* 1217 */                      m6859j("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
/* 27 */                        return null;
                            }
                            try {
/* 910 */                       C2355x4 c2355x4M9703D = C2355x4.m9703D((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 918 */                       if (c2355x4M9703D.m9708B() != 0) {
/* 1208 */                          throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 923 */                       C0168b5 c0168b5 = new C0168b5(0);
/* 926 */                       c0168b5.f2211b = null;
/* 928 */                       c0168b5.f2212c = null;
/* 930 */                       c0168b5.f2213d = null;
/* 932 */                       c0168b5.f2214e = null;
/* 934 */                       C0832d5 c0832d5 = C0832d5.f6989e;
/* 936 */                       c0168b5.f2215f = c0832d5;
/* 946 */                       int size = c2355x4M9703D.m9709z().m5704A().size();
/* 950 */                       if (size != 16 && size != 24 && size != 32) {
/* 974 */                           throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                                }
/* 979 */                       c0168b5.f2211b = Integer.valueOf(size);
/* 989 */                       int size2 = c2355x4M9703D.m9707A().m6807A().size();
/* 993 */                       if (size2 < 16) {
/* 1202 */                          throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(size2)));
                                }
/* 999 */                       c0168b5.f2212c = Integer.valueOf(size2);
/* 1009 */                      int iM8638A = c2355x4M9703D.m9707A().m6808B().m8638A();
/* 1013 */                      if (iM8638A < 10) {
/* 1182 */                          throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iM8638A)));
                                }
/* 1019 */                      c0168b5.f2213d = Integer.valueOf(iM8638A);
/* 1037 */                      c0168b5.f2214e = AbstractC0905f5.m3669a(c2355x4M9703D.m9707A().m6808B().m8639z());
/* 1041 */                      wq1 wq1Var = (wq1) xy1Var.f19398f;
/* 1043 */                      int iOrdinal = wq1Var.ordinal();
/* 1047 */                      if (iOrdinal == 1) {
/* 1081 */                          c0832d5 = C0832d5.f6987c;
                                } else if (iOrdinal == 2) {
/* 1078 */                          c0832d5 = C0832d5.f6988d;
                                } else if (iOrdinal != 3) {
/* 1053 */                          if (iOrdinal != 4) {
/* 1077 */                              throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var.m9602b());
                                    }
/* 1078 */                          c0832d5 = C0832d5.f6988d;
                                }
/* 1083 */                      c0168b5.f2215f = c0832d5;
/* 1085 */                      C0868e5 c0868e5M1264i = c0168b5.m1264i();
/* 1091 */                      ra2 ra2Var = new ra2();
/* 1094 */                      ra2Var.f15956b = null;
/* 1096 */                      ra2Var.f15957c = null;
/* 1098 */                      ra2Var.f15958d = null;
/* 1100 */                      ra2Var.f15955a = c0868e5M1264i;
/* 1125 */                      ra2Var.f15956b = new fs0(C2335wl.m9584a(c2355x4M9703D.m9709z().m5704A().m9304e()), 12);
/* 1150 */                      ra2Var.f15957c = new fs0(C2335wl.m9584a(c2355x4M9703D.m9707A().m6807A().m9304e()), 12);
/* 1156 */                      ra2Var.f15958d = (Integer) xy1Var.f19394b;
/* 1158 */                      return ra2Var.m8101a();
                            } catch (pz0 unused2) {
/* 1211 */                      ds0.m3203t("Parsing AesCtrHmacAeadKey failed");
/* 27 */                        return null;
                            }
                        case 3:
/* 694 */                   if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
/* 886 */                       m6859j("Wrong type URL in call to AesEaxParameters.parseParameters");
/* 27 */                        return null;
                            }
                            try {
/* 704 */                       C2095q5 c2095q5M7708D = C2095q5.m7708D((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 712 */                       if (c2095q5M7708D.m7713B() != 0) {
/* 877 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 714 */                       C2131r4 c2131r4 = C2131r4.f15854i;
/* 720 */                       int size3 = c2095q5M7708D.m7714z().size();
/* 724 */                       if (size3 != 16 && size3 != 24 && size3 != 32) {
/* 748 */                           throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                                }
/* 753 */                       int iM9470y = c2095q5M7708D.m7712A().m9470y();
/* 757 */                       if (iM9470y != 12 && iM9470y != 16) {
/* 781 */                           throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iM9470y)));
                                }
/* 784 */                       wq1 wq1Var2 = (wq1) xy1Var.f19398f;
/* 786 */                       int iOrdinal2 = wq1Var2.ordinal();
/* 790 */                       if (iOrdinal2 == 1) {
/* 824 */                           c2131r4 = C2131r4.f15852g;
                                } else if (iOrdinal2 == 2) {
/* 821 */                           c2131r4 = C2131r4.f15853h;
                                } else if (iOrdinal2 != 3) {
/* 796 */                           if (iOrdinal2 != 4) {
/* 820 */                               throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var2.m9602b());
                                    }
/* 821 */                           c2131r4 = C2131r4.f15853h;
                                }
/* 828 */                       C2243u5 c2243u5 = new C2243u5(size3, iM9470y, 16, c2131r4);
/* 833 */                       C0875ec c0875ec3 = new C0875ec(i);
/* 836 */                       c0875ec3.f7614c = null;
/* 838 */                       c0875ec3.f7615d = null;
/* 840 */                       c0875ec3.f7613b = c2243u5;
/* 859 */                       c0875ec3.f7614c = new fs0(C2335wl.m9584a(c2095q5M7708D.m7714z().m9304e()), i4);
/* 865 */                       c0875ec3.f7615d = (Integer) xy1Var.f19394b;
/* 867 */                       return c0875ec3.m3386i();
                            } catch (pz0 unused3) {
/* 880 */                       ds0.m3203t("Parsing AesEaxcKey failed");
/* 27 */                        return null;
                            }
                        case 4:
/* 520 */                   if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
/* 680 */                       m6859j("Wrong type URL in call to AesGcmParameters.parseParameters");
/* 27 */                        return null;
                            }
                            try {
/* 530 */                       C0008a6 c0008a6M69B = C0008a6.m69B((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 538 */                       if (c0008a6M69B.m73z() != 0) {
/* 671 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 540 */                       C0204c5 c0204c6 = C0204c5.f2708j;
/* 546 */                       int size4 = c0008a6M69B.m72y().size();
/* 550 */                       if (size4 != 16 && size4 != 24 && size4 != 32) {
/* 574 */                           throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size4)));
                                }
/* 577 */                       wq1 wq1Var3 = (wq1) xy1Var.f19398f;
/* 579 */                       int iOrdinal3 = wq1Var3.ordinal();
/* 583 */                       if (iOrdinal3 == 1) {
/* 617 */                           c0204c6 = C0204c5.f2706h;
                                } else if (iOrdinal3 == 2) {
/* 614 */                           c0204c6 = C0204c5.f2707i;
                                } else if (iOrdinal3 != 3) {
/* 589 */                           if (iOrdinal3 != 4) {
/* 613 */                               throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var3.m9602b());
                                    }
/* 614 */                           c0204c6 = C0204c5.f2707i;
                                }
/* 621 */                       C0869e6 c0869e6 = new C0869e6(size4, 12, 16, c0204c6);
/* 627 */                       C0875ec c0875ec4 = new C0875ec(5);
/* 630 */                       c0875ec4.f7614c = null;
/* 632 */                       c0875ec4.f7615d = null;
/* 634 */                       c0875ec4.f7613b = c0869e6;
/* 653 */                       c0875ec4.f7614c = new fs0(C2335wl.m9584a(c0008a6M69B.m72y().m9304e()), i4);
/* 659 */                       c0875ec4.f7615d = (Integer) xy1Var.f19394b;
/* 661 */                       return c0875ec4.m3387j();
                            } catch (pz0 unused4) {
/* 674 */                       ds0.m3203t("Parsing AesGcmKey failed");
/* 27 */                        return null;
                            }
                        case 5:
/* 346 */                   if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
/* 506 */                       m6859j("Wrong type URL in call to AesGcmSivParameters.parseParameters");
/* 27 */                        return null;
                            }
                            try {
/* 356 */                       C1017i6 c1017i6M4477B = C1017i6.m4477B((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 364 */                       if (c1017i6M4477B.m4481z() != 0) {
/* 497 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 366 */                       C0832d5 c0832d6 = C0832d5.f6992v;
/* 372 */                       int size5 = c1017i6M4477B.m4480y().size();
/* 376 */                       if (size5 != 16 && size5 != 32) {
/* 400 */                           throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size5)));
                                }
/* 403 */                       wq1 wq1Var4 = (wq1) xy1Var.f19398f;
/* 405 */                       int iOrdinal4 = wq1Var4.ordinal();
/* 409 */                       if (iOrdinal4 == 1) {
/* 443 */                           c0832d6 = C0832d5.f6990f;
                                } else if (iOrdinal4 == 2) {
/* 440 */                           c0832d6 = C0832d5.f6991i;
                                } else if (iOrdinal4 != 3) {
/* 415 */                           if (iOrdinal4 != 4) {
/* 439 */                               throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var4.m9602b());
                                    }
/* 440 */                           c0832d6 = C0832d5.f6991i;
                                }
/* 447 */                       C1916m6 c1916m6 = new C1916m6(size5, c0832d6);
/* 453 */                       C0875ec c0875ec5 = new C0875ec(6);
/* 456 */                       c0875ec5.f7614c = null;
/* 458 */                       c0875ec5.f7615d = null;
/* 460 */                       c0875ec5.f7613b = c1916m6;
/* 479 */                       c0875ec5.f7614c = new fs0(C2335wl.m9584a(c1017i6M4477B.m4480y().m9304e()), i4);
/* 485 */                       c0875ec5.f7615d = (Integer) xy1Var.f19394b;
/* 487 */                       return c0875ec5.m3388k();
                            } catch (pz0 unused5) {
/* 500 */                       ds0.m3203t("Parsing AesGcmSivKey failed");
/* 27 */                        return null;
                            }
                        case 6:
/* 162 */                   if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
/* 332 */                       m6859j("Wrong type URL in call to AesSivParameters.parseParameters");
/* 27 */                        return null;
                            }
                            try {
/* 172 */                       C2096q6 c2096q6M7726B = C2096q6.m7726B((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 180 */                       if (c2096q6M7726B.m7730z() != 0) {
/* 323 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 186 */                       int size6 = c2096q6M7726B.m7729y().size();
/* 190 */                       if (size6 != 32 && size6 != 48 && size6 != 64) {
/* 220 */                           throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(size6)));
                                }
/* 223 */                       wq1 wq1Var5 = (wq1) xy1Var.f19398f;
/* 225 */                       Map map = AbstractC2320w6.f18453e;
/* 231 */                       if (!map.containsKey(wq1Var5)) {
/* 317 */                           throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var5.m9602b());
                                }
/* 237 */                       C2244u6 c2244u6 = (C2244u6) map.get(wq1Var5);
/* 239 */                       if (c2244u6 == null) {
/* 295 */                           throw new GeneralSecurityException("Variant is not set");
                                }
/* 243 */                       C2282v6 c2282v6 = new C2282v6(size6, c2244u6);
/* 249 */                       C0875ec c0875ec6 = new C0875ec(7);
/* 252 */                       c0875ec6.f7614c = null;
/* 254 */                       c0875ec6.f7615d = null;
/* 256 */                       c0875ec6.f7613b = c2282v6;
/* 275 */                       c0875ec6.f7614c = new fs0(C2335wl.m9584a(c2096q6M7726B.m7729y().m9304e()), i4);
/* 281 */                       c0875ec6.f7615d = (Integer) xy1Var.f19394b;
/* 283 */                       return c0875ec6.m3389l();
                            } catch (pz0 unused6) {
/* 326 */                       ds0.m3203t("Parsing AesSivKey failed");
/* 27 */                        return null;
                            }
                        default:
/* 41 */                    if (!((String) xy1Var.f19393a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
/* 148 */                       m6859j("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
/* 27 */                        return null;
                            }
                            try {
/* 51 */                        C0818cs c0818csM2878B = C0818cs.m2878B((AbstractC2298vl) xy1Var.f19396d, dg0.m3057a());
/* 59 */                        if (c0818csM2878B.m2882z() != 0) {
/* 139 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 63 */                        wq1 wq1Var6 = (wq1) xy1Var.f19398f;
/* 65 */                        int iOrdinal5 = wq1Var6.ordinal();
/* 69 */                        if (iOrdinal5 == 1) {
/* 106 */                           c0204c5 = C0204c5.f2709k;
                                } else if (iOrdinal5 == 2) {
/* 103 */                           c0204c5 = C0204c5.f2710l;
                                } else if (iOrdinal5 == 3) {
/* 100 */                           c0204c5 = C0204c5.f2711m;
                                } else {
/* 75 */                            if (iOrdinal5 != 4) {
/* 99 */                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var6.m9602b());
                                    }
/* 103 */                           c0204c5 = C0204c5.f2710l;
                                }
/* 129 */                       return C0854ds.m3186J(c0204c5, new fs0(C2335wl.m9584a(c0818csM2878B.m2881y().m9304e()), i4), (Integer) xy1Var.f19394b);
                            } catch (pz0 unused7) {
/* 142 */                       ds0.m3203t("Parsing ChaCha20Poly1305Key failed");
/* 27 */                        return null;
                            }
                    }
                }

                @Override // p000.InterfaceC0934fy
                public Object create(InterfaceC0824cy interfaceC0824cy) {
/* 11 */            Set setMo1257a = ((C0168b5) interfaceC0824cy).mo1257a(f02.m3619a(C2549zf.class));
/* 15 */            gr0 gr0Var = gr0.f8786b;
/* 17 */            if (gr0Var == null) {
                        synchronized (gr0.class) {
                            try {
/* 22 */                        gr0Var = gr0.f8786b;
/* 24 */                        if (gr0Var == null) {
/* 29 */                            gr0Var = new gr0(0);
/* 32 */                            gr0.f8786b = gr0Var;
                                }
                            } catch (Throwable th) {
/* 40 */                        throw th;
                            }
                        }
                    }
/* 41 */            return new a70(setMo1257a, gr0Var);
                }

                @Override // p000.uw1
                /* JADX INFO: renamed from: d */
                public void mo6870d(rj2 rj2Var) {
/* 4 */             SurfaceTexture surfaceTexture = new SurfaceTexture(0);
/* 19 */            surfaceTexture.setDefaultBufferSize(rj2Var.f16122b.getWidth(), rj2Var.f16122b.getHeight());
/* 22 */            surfaceTexture.detachFromGLContext();
/* 27 */            Surface surface = new Surface(surfaceTexture);
/* 39 */            rj2Var.m8190a(surface, pg3.m7428g(), new C1973nq(0, surface, surfaceTexture));
                }

                @Override // p000.nw0
                /* JADX INFO: renamed from: f */
                public void mo6871f(ow0 ow0Var) throws Exception {
                    try {
/* 1 */                 mw0 mw0VarAcquireLatestImage = ow0Var.acquireLatestImage();
/* 5 */                 if (mw0VarAcquireLatestImage != null) {
/* 7 */                     pg3.m7423a();
/* 26 */                    hu0.m4315H0("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + mw0VarAcquireLatestImage);
/* 29 */                    mw0VarAcquireLatestImage.close();
                        }
                    } catch (IllegalStateException unused) {
                    }
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
/* 5 */             AbstractC1245n0.m4877e("AppUpdater", "Failure when retrieving AppUpdateInfo", exc);
                }

/* 8 */         public /* synthetic */ C1951n4(int i) {
/* 9 */             this.f14116a = i;
                }
            }
