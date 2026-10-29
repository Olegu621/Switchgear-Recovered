            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.os.Build;
            import android.os.ext.SdkExtensions;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.internal.measurement.zzrg;
            import com.google.android.gms.measurement.internal.zzr;
            import java.math.BigInteger;
            import java.security.MessageDigest;
            import java.util.List;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ih3 extends wg3 {

                /* JADX INFO: renamed from: U */
                public final long f9589U;

                /* JADX INFO: renamed from: V */
                public List f9590V;

                /* JADX INFO: renamed from: W */
                public String f9591W;

                /* JADX INFO: renamed from: X */
                public int f9592X;

                /* JADX INFO: renamed from: Y */
                public String f9593Y;

                /* JADX INFO: renamed from: Z */
                public String f9594Z;

                /* JADX INFO: renamed from: a0 */
                public long f9595a0;

                /* JADX INFO: renamed from: b0 */
                public String f9596b0;

                /* JADX INFO: renamed from: c */
                public String f9597c;

                /* JADX INFO: renamed from: d */
                public String f9598d;

                /* JADX INFO: renamed from: e */
                public int f9599e;

                /* JADX INFO: renamed from: f */
                public String f9600f;

                /* JADX INFO: renamed from: i */
                public String f9601i;

                /* JADX INFO: renamed from: v */
                public long f9602v;

                /* JADX INFO: renamed from: w */
                public final long f9603w;

                public ih3(ij3 ij3Var, long j, long j2) {
/* 1 */             super(ij3Var);
/* 6 */             this.f9595a0 = 0L;
/* 9 */             this.f9596b0 = null;
/* 11 */            this.f9603w = j;
/* 13 */            this.f9589U = j2;
                }

                @Override // p000.wg3
                /* JADX INFO: renamed from: C */
                public final boolean mo4531C() {
/* 1 */             return true;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0268 A[Catch: NameNotFoundException -> 0x0270, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x0270, blocks: (B:98:0x0262, B:100:0x0268), top: B:136:0x0262 }] */
                /* JADX WARN: Code duplicated, block: B:102:0x026b A[PHI: r5 r37
  0x026b: PHI (r5v16 int) = (r5v15 int), (r5v17 int) binds: [B:104:0x0270, B:99:0x0266] A[DONT_GENERATE, DONT_INLINE]
  0x026b: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x0270, B:99:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:108:0x02ab  */
                /* JADX WARN: Code duplicated, block: B:113:0x02c2  */
                /* JADX WARN: Code duplicated, block: B:117:0x02cf  */
                /* JADX WARN: Code duplicated, block: B:130:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:132:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:138:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:36:0x0108  */
                /* JADX WARN: Code duplicated, block: B:37:0x010c  */
                /* JADX WARN: Code duplicated, block: B:39:0x0117  */
                /* JADX WARN: Code duplicated, block: B:42:0x012e  */
                /* JADX WARN: Code duplicated, block: B:44:0x0132  */
                /* JADX WARN: Code duplicated, block: B:57:0x0184  */
                /* JADX WARN: Code duplicated, block: B:64:0x019f  */
                /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
                /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
                /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
                /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
                /* JADX WARN: Code duplicated, block: B:75:0x01f5  */
                /* JADX WARN: Code duplicated, block: B:77:0x01ff  */
                /* JADX WARN: Code duplicated, block: B:78:0x0202  */
                /* JADX WARN: Code duplicated, block: B:87:0x0229  */
                /* JADX WARN: Code duplicated, block: B:91:0x0236  */
                /* JADX WARN: Code duplicated, block: B:92:0x0238  */
                /* JADX WARN: Code duplicated, block: B:95:0x0253  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                /* JADX INFO: renamed from: D */
                public final zzr m4532D(String str) {
                    String str2;
                    long j;
                    boolean z;
                    long j2;
                    boolean zM4560d;
                    boolean z2;
                    boolean z3;
                    String str3;
                    Class<?> clsLoadClass;
                    Object objInvoke;
                    long jM4932a;
                    long jMin;
                    Boolean boolM7408L;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    String str4;
                    Boolean boolM7408L2;
                    boolean zBooleanValue;
                    ij3 ij3Var;
                    String strM4534F;
                    boolean z7;
                    int i;
                    int i2;
                    long j3;
                    ApplicationInfo applicationInfoM9213b;
                    ug3 ug3Var;
                    long j4;
                    int extensionVersion;
/* 3 */             mo1375y();
/* 9 */             String strM4534F2 = m4534F();
/* 14 */            String strM4535G = m4535G();
/* 18 */            m9576A();
/* 22 */            String str5 = this.f9598d;
/* 24 */            m9576A();
/* 27 */            long j5 = this.f9599e;
/* 30 */            m9576A();
/* 35 */            kb1.m6061n(this.f9600f);
/* 40 */            String str6 = this.f9600f;
/* 45 */            ij3 ij3Var2 = (ij3) this.f16749a;
/* 47 */            pd3 pd3Var = ij3Var2.f9651d;
/* 49 */            uh3 uh3Var = ij3Var2.f9655f;
/* 51 */            pd3 pd3Var2 = ij3Var2.f9651d;
/* 53 */            Context context = ij3Var2.f9645a;
/* 55 */            up3 up3Var = ij3Var2.f9668w;
/* 57 */            ki3 ki3Var = ij3Var2.f9653e;
/* 59 */            pd3Var.m7401E();
/* 62 */            m9576A();
/* 65 */            mo1375y();
/* 71 */            long j6 = this.f9602v;
/* 73 */            long jM9096U = 0;
/* 79 */            if (j6 == 0) {
/* 81 */                ij3.m4553j(up3Var);
/* 87 */                ij3 ij3Var3 = (ij3) up3Var.f16749a;
/* 89 */                String packageName = context.getPackageName();
/* 93 */                up3Var.mo1375y();
/* 96 */                kb1.m6058k(packageName);
/* 99 */                PackageManager packageManager = context.getPackageManager();
/* 103 */               z = false;
/* 105 */               MessageDigest messageDigestM9063Q = up3.m9063Q();
/* 109 */               long jM9064R = -1;
/* 111 */               if (messageDigestM9063Q == null) {
/* 113 */                   uh3 uh3Var2 = ij3Var3.f9655f;
/* 115 */                   ij3.m4555l(uh3Var2);
/* 122 */                   uh3Var2.f17538f.m8510a("Could not get MD5 instance");
/* 125 */                   str2 = str5;
/* 127 */                   j = j5;
                        } else {
/* 133 */                   if (packageManager != null) {
                                try {
/* 139 */                           if (up3Var.m9101c0(context, packageName)) {
/* 206 */                               str2 = str5;
/* 208 */                               j = j5;
/* 210 */                               jM9064R = 0;
                                    } else {
/* 145 */                               str2 = str5;
                                        try {
/* 153 */                                   j = j5;
                                            try {
/* 161 */                                       Signature[] signatureArr = g93.m3898a(context).m9214c(64, ij3Var3.f9645a.getPackageName()).signatures;
/* 163 */                                       if (signatureArr == null || signatureArr.length <= 0) {
/* 185 */                                           uh3 uh3Var3 = ij3Var3.f9655f;
/* 187 */                                           ij3.m4555l(uh3Var3);
/* 194 */                                           uh3Var3.f17541w.m8510a("Could not get signatures");
                                                } else {
/* 178 */                                           jM9064R = up3.m9064R(messageDigestM9063Q.digest(signatureArr[0].toByteArray()));
                                                }
                                            } catch (PackageManager.NameNotFoundException e) {
/* 183 */                                       e = e;
/* 213 */                                       uh3 uh3Var4 = ij3Var3.f9655f;
/* 215 */                                       ij3.m4555l(uh3Var4);
/* 222 */                                       uh3Var4.f17538f.m8511b(e, "Package name not found");
/* 225 */                                       j2 = 0;
                                            }
                                        } catch (PackageManager.NameNotFoundException e2) {
/* 198 */                                   e = e2;
/* 199 */                                   j = j5;
/* 213 */                                   uh3 uh3Var5 = ij3Var3.f9655f;
/* 215 */                                   ij3.m4555l(uh3Var5);
/* 222 */                                   uh3Var5.f17538f.m8511b(e, "Package name not found");
/* 225 */                                   j2 = 0;
/* 233 */                                   this.f9602v = j2;
/* 244 */                                   zM4560d = ij3Var2.m4560d();
/* 248 */                                   ij3.m4553j(ki3Var);
/* 254 */                                   z2 = !ki3Var.f12804c0;
/* 255 */                                   mo1375y();
/* 263 */                                   if (ij3Var2.m4560d()) {
/* 269 */                                       zzrg.zza();
/* 278 */                                       if (pd3Var2.m7406J(null, vg3.f18078H0)) {
/* 280 */                                           ij3.m4555l(uh3Var);
/* 287 */                                           uh3Var.f17534Y.m8510a("Disabled IID for tests.");
/* 265 */                                           z3 = zM4560d;
/* 267 */                                           str3 = null;
                                                } else {
                                                    try {
/* 297 */                                               clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
/* 301 */                                               if (clsLoadClass == null) {
/* 303 */                                                   z3 = zM4560d;
                                                        } else {
/* 311 */                                                   z3 = zM4560d;
                                                            try {
/* 321 */                                                       Object[] objArr = {context};
/* 325 */                                                       str3 = null;
/* 326 */                                                       objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
/* 330 */                                                       if (objInvoke != null) {
                                                                    try {
/* 343 */                                                               str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                                    } catch (Exception unused) {
/* 347 */                                                               ij3.m4555l(uh3Var);
/* 354 */                                                               uh3Var.f17531V.m8510a("Failed to retrieve Firebase Instance Id");
/* 305 */                                                               str3 = null;
                                                                    }
                                                                }
                                                            } catch (Exception unused2) {
/* 360 */                                                       ij3.m4555l(uh3Var);
/* 367 */                                                       uh3Var.f17530U.m8510a("Failed to obtain Firebase Analytics instance");
                                                            }
                                                        }
                                                    } catch (ClassNotFoundException unused3) {
                                                    }
/* 305 */                                           str3 = null;
                                                }
                                            } else {
/* 265 */                                       z3 = zM4560d;
/* 267 */                                       str3 = null;
                                            }
/* 371 */                                   ij3.m4553j(ki3Var);
/* 376 */                                   jM4932a = ki3Var.f12809f.m4932a();
/* 382 */                                   long j7 = j2;
/* 384 */                                   jMin = ij3Var2.f9666o0;
/* 386 */                                   if (jM4932a != 0) {
/* 389 */                                       jMin = Math.min(jMin, jM4932a);
                                            }
/* 393 */                                   m9576A();
/* 396 */                                   int i3 = this.f9592X;
/* 400 */                                   boolM7408L = pd3Var2.m7408L("google_analytics_adid_collection_enabled");
/* 404 */                                   if (boolM7408L != null) {
/* 416 */                                       z4 = true;
                                            } else {
/* 416 */                                       z4 = true;
                                            }
/* 417 */                                   ij3.m4553j(ki3Var);
/* 420 */                                   ki3Var.mo1375y();
/* 429 */                                   long j8 = jMin;
/* 433 */                                   boolean z8 = ki3Var.m6113D().getBoolean("deferred_analytics_collection", z);
/* 446 */                                   if (pd3Var2.m7411O("google_analytics_default_allow_ad_personalization_signals", true) != lk3.GRANTED) {
/* 448 */                                       z5 = true;
                                            } else {
/* 450 */                                       z5 = false;
                                            }
/* 451 */                                   Boolean boolValueOf = Boolean.valueOf(z5);
/* 455 */                                   List list = this.f9590V;
/* 461 */                                   String strM7188g = ki3Var.m6116G().m7188g();
/* 469 */                                   if (this.f9591W == null) {
/* 471 */                                       ij3.m4553j(up3Var);
/* 478 */                                       this.f9591W = up3Var.m9112r0();
                                            }
/* 480 */                                   String str7 = this.f9591W;
/* 496 */                                   if (ki3Var.m6116G().m7189i(nk3.ANALYTICS_STORAGE)) {
/* 502 */                                       mo1375y();
/* 510 */                                       if (this.f9595a0 == 0) {
/* 512 */                                           z6 = z2;
                                                } else {
/* 517 */                                           ij3Var2.f9640V.getClass();
/* 528 */                                           long jCurrentTimeMillis = System.currentTimeMillis() - this.f9595a0;
/* 530 */                                           z6 = z2;
/* 534 */                                           if (this.f9594Z != null) {
/* 547 */                                               m4533E();
                                                    }
                                                }
/* 552 */                                       if (this.f9594Z == null) {
/* 554 */                                           m4533E();
                                                }
/* 557 */                                       str4 = this.f9594Z;
                                            } else {
/* 498 */                                       z6 = z2;
/* 500 */                                       str4 = null;
                                            }
/* 561 */                                   boolM7408L2 = pd3Var2.m7408L("google_analytics_sgtm_upload_enabled");
/* 565 */                                   if (boolM7408L2 == null) {
/* 567 */                                       zBooleanValue = false;
                                            } else {
/* 569 */                                       zBooleanValue = boolM7408L2.booleanValue();
                                            }
/* 573 */                                   ij3.m4553j(up3Var);
/* 578 */                                   ij3Var = (ij3) up3Var.f16749a;
/* 580 */                                   String str8 = str4;
/* 582 */                                   strM4534F = m4534F();
/* 586 */                                   boolean z9 = zBooleanValue;
/* 594 */                                   if (ij3Var.f9645a.getPackageManager() == null) {
/* 596 */                                       z7 = z4;
/* 598 */                                       j3 = 0;
                                            } else {
                                                try {
/* 608 */                                           z7 = z4;
/* 610 */                                           i = 0;
                                                    try {
/* 611 */                                               applicationInfoM9213b = g93.m3898a(ij3Var.f9645a).m9213b(0, strM4534F);
/* 615 */                                               if (applicationInfoM9213b != null) {
/* 617 */                                                   i2 = applicationInfoM9213b.targetSdkVersion;
                                                        } else {
/* 620 */                                                   i2 = i;
                                                        }
                                                    } catch (PackageManager.NameNotFoundException unused4) {
/* 625 */                                               uh3 uh3Var6 = ij3Var.f9655f;
/* 627 */                                               ij3.m4555l(uh3Var6);
/* 634 */                                               uh3Var6.f17532W.m8511b(strM4534F, "PackageManager failed to find running app: app_id");
                                                    }
                                                } catch (PackageManager.NameNotFoundException unused5) {
/* 622 */                                           z7 = z4;
/* 624 */                                           i = 0;
                                                }
                                                j3 = i2;
                                            }
/* 639 */                                   ij3.m4553j(ki3Var);
/* 646 */                                   int i4 = ki3Var.m6116G().f14793b;
/* 648 */                                   ij3.m4553j(ki3Var);
/* 651 */                                   ki3Var.mo1375y();
/* 671 */                                   String str9 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2867b;
/* 673 */                                   zzql.zza();
/* 676 */                                   ug3Var = vg3.f18096Q0;
/* 682 */                                   if (pd3Var2.m7406J(null, ug3Var)) {
/* 684 */                                       ij3.m4553j(up3Var);
/* 689 */                                       j4 = j3;
/* 693 */                                       if (Build.VERSION.SDK_INT < 30) {
                                                }
/* 710 */                                       zzql.zza();
/* 718 */                                       if (pd3Var2.m7406J(null, ug3Var)) {
/* 720 */                                           ij3.m4553j(up3Var);
/* 723 */                                           jM9096U = up3Var.m9096U();
                                                }
/* 727 */                                       String str10 = pd3Var2.f15074c;
/* 738 */                                       String strValueOf = String.valueOf(ok3.m7185h(pd3Var2.m7411O("google_analytics_default_allow_ad_personalization_signals", true)));
/* 742 */                                       long j9 = ij3Var2.f9666o0;
/* 746 */                                       ij3.m4552i(ij3Var2.f9656f0);
/* 830 */                                       return new zzr(strM4534F2, strM4535G, str2, j, str6, 130000L, j7, str, z3, z6, str3, j8, i3, z7, z8, boolValueOf, this.f9603w, list, strM7188g, str7, str8, z9, j4, i4, str9, extensionVersion, jM9096U, str10, strValueOf, j9, ij3Var2.f9656f0.m9976E().zza());
                                            }
/* 707 */                                   j4 = j3;
/* 709 */                                   extensionVersion = 0;
/* 710 */                                   zzql.zza();
/* 718 */                                   if (pd3Var2.m7406J(null, ug3Var)) {
/* 720 */                                       ij3.m4553j(up3Var);
/* 723 */                                       jM9096U = up3Var.m9096U();
                                            }
/* 727 */                                   String str11 = pd3Var2.f15074c;
/* 738 */                                   String strValueOf2 = String.valueOf(ok3.m7185h(pd3Var2.m7411O("google_analytics_default_allow_ad_personalization_signals", true)));
/* 742 */                                   long j10 = ij3Var2.f9666o0;
/* 746 */                                   ij3.m4552i(ij3Var2.f9656f0);
/* 830 */                                   return new zzr(strM4534F2, strM4535G, str2, j, str6, 130000L, j7, str, z3, z6, str3, j8, i3, z7, z8, boolValueOf, this.f9603w, list, strM7188g, str7, str8, z9, j4, i4, str9, extensionVersion, jM9096U, str11, strValueOf2, j10, ij3Var2.f9656f0.m9976E().zza());
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
/* 202 */                           e = e3;
/* 203 */                           str2 = str5;
                                }
                            } else {
/* 228 */                       str2 = str5;
/* 230 */                       j = j5;
                            }
/* 225 */                   j2 = 0;
/* 233 */                   this.f9602v = j2;
                        }
/* 129 */               j2 = jM9064R;
/* 233 */               this.f9602v = j2;
                    } else {
/* 236 */               str2 = str5;
/* 238 */               j = j5;
/* 240 */               z = false;
/* 242 */               j2 = j6;
                    }
/* 244 */           zM4560d = ij3Var2.m4560d();
/* 248 */           ij3.m4553j(ki3Var);
/* 254 */           z2 = !ki3Var.f12804c0;
/* 255 */           mo1375y();
/* 263 */           if (ij3Var2.m4560d()) {
/* 265 */               z3 = zM4560d;
/* 267 */               str3 = null;
                    } else {
/* 269 */               zzrg.zza();
/* 278 */               if (pd3Var2.m7406J(null, vg3.f18078H0)) {
/* 280 */                   ij3.m4555l(uh3Var);
/* 287 */                   uh3Var.f17534Y.m8510a("Disabled IID for tests.");
/* 265 */                   z3 = zM4560d;
/* 267 */                   str3 = null;
                        } else {
/* 297 */                   clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
/* 301 */                   if (clsLoadClass == null) {
/* 303 */                       z3 = zM4560d;
                            } else {
/* 311 */                       z3 = zM4560d;
/* 321 */                       Object[] objArr2 = {context};
/* 325 */                       str3 = null;
/* 326 */                       objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
/* 330 */                       if (objInvoke != null) {
/* 343 */                           str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                }
                            }
/* 305 */                   str3 = null;
                        }
                    }
/* 371 */           ij3.m4553j(ki3Var);
/* 376 */           jM4932a = ki3Var.f12809f.m4932a();
/* 382 */           long j11 = j2;
/* 384 */           jMin = ij3Var2.f9666o0;
/* 386 */           if (jM4932a != 0) {
/* 389 */               jMin = Math.min(jMin, jM4932a);
                    }
/* 393 */           m9576A();
/* 396 */           int i5 = this.f9592X;
/* 400 */           boolM7408L = pd3Var2.m7408L("google_analytics_adid_collection_enabled");
/* 404 */           if (boolM7408L != null || boolM7408L.booleanValue()) {
/* 416 */               z4 = true;
                    } else {
/* 413 */               z4 = z;
                    }
/* 417 */           ij3.m4553j(ki3Var);
/* 420 */           ki3Var.mo1375y();
/* 429 */           long j12 = jMin;
/* 433 */           boolean z10 = ki3Var.m6113D().getBoolean("deferred_analytics_collection", z);
/* 446 */           if (pd3Var2.m7411O("google_analytics_default_allow_ad_personalization_signals", true) != lk3.GRANTED) {
/* 448 */               z5 = true;
                    } else {
/* 450 */               z5 = false;
                    }
/* 451 */           Boolean boolValueOf2 = Boolean.valueOf(z5);
/* 455 */           List list2 = this.f9590V;
/* 461 */           String strM7188g2 = ki3Var.m6116G().m7188g();
/* 469 */           if (this.f9591W == null) {
/* 471 */               ij3.m4553j(up3Var);
/* 478 */               this.f9591W = up3Var.m9112r0();
                    }
/* 480 */           String str12 = this.f9591W;
/* 496 */           if (ki3Var.m6116G().m7189i(nk3.ANALYTICS_STORAGE)) {
/* 498 */               z6 = z2;
/* 500 */               str4 = null;
                    } else {
/* 502 */               mo1375y();
/* 510 */               if (this.f9595a0 == 0) {
/* 512 */                   z6 = z2;
                        } else {
/* 517 */                   ij3Var2.f9640V.getClass();
/* 528 */                   long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f9595a0;
/* 530 */                   z6 = z2;
/* 534 */                   if (this.f9594Z != null && jCurrentTimeMillis2 > 86400000 && this.f9596b0 == null) {
/* 547 */                       m4533E();
                            }
                        }
/* 552 */               if (this.f9594Z == null) {
/* 554 */                   m4533E();
                        }
/* 557 */               str4 = this.f9594Z;
                    }
/* 561 */           boolM7408L2 = pd3Var2.m7408L("google_analytics_sgtm_upload_enabled");
/* 565 */           if (boolM7408L2 == null) {
/* 567 */               zBooleanValue = false;
                    } else {
/* 569 */               zBooleanValue = boolM7408L2.booleanValue();
                    }
/* 573 */           ij3.m4553j(up3Var);
/* 578 */           ij3Var = (ij3) up3Var.f16749a;
/* 580 */           String str13 = str4;
/* 582 */           strM4534F = m4534F();
/* 586 */           boolean z11 = zBooleanValue;
/* 594 */           if (ij3Var.f9645a.getPackageManager() == null) {
/* 596 */               z7 = z4;
/* 598 */               j3 = 0;
                    } else {
/* 608 */               z7 = z4;
/* 610 */               i = 0;
/* 611 */               applicationInfoM9213b = g93.m3898a(ij3Var.f9645a).m9213b(0, strM4534F);
/* 615 */               if (applicationInfoM9213b != null) {
/* 617 */                   i2 = applicationInfoM9213b.targetSdkVersion;
                        } else {
/* 620 */                   i2 = i;
                        }
                        j3 = i2;
                    }
/* 639 */           ij3.m4553j(ki3Var);
/* 646 */           int i6 = ki3Var.m6116G().f14793b;
/* 648 */           ij3.m4553j(ki3Var);
/* 651 */           ki3Var.mo1375y();
/* 671 */           String str14 = ce3.m1646b(ki3Var.m6113D().getString("dma_consent_settings", null)).f2867b;
/* 673 */           zzql.zza();
/* 676 */           ug3Var = vg3.f18096Q0;
/* 682 */           if (pd3Var2.m7406J(null, ug3Var)) {
/* 684 */               ij3.m4553j(up3Var);
/* 689 */               j4 = j3;
/* 693 */               if (Build.VERSION.SDK_INT < 30 && SdkExtensions.getExtensionVersion(30) > 3) {
/* 4 */                     extensionVersion = SdkExtensions.getExtensionVersion(1000000);
                        }
/* 710 */               zzql.zza();
/* 718 */               if (pd3Var2.m7406J(null, ug3Var)) {
/* 720 */                   ij3.m4553j(up3Var);
/* 723 */                   jM9096U = up3Var.m9096U();
                        }
/* 727 */               String str15 = pd3Var2.f15074c;
/* 738 */               String strValueOf3 = String.valueOf(ok3.m7185h(pd3Var2.m7411O("google_analytics_default_allow_ad_personalization_signals", true)));
/* 742 */               long j13 = ij3Var2.f9666o0;
/* 746 */               ij3.m4552i(ij3Var2.f9656f0);
/* 830 */               return new zzr(strM4534F2, strM4535G, str2, j, str6, 130000L, j11, str, z3, z6, str3, j12, i5, z7, z10, boolValueOf2, this.f9603w, list2, strM7188g2, str12, str13, z11, j4, i6, str14, extensionVersion, jM9096U, str15, strValueOf3, j13, ij3Var2.f9656f0.m9976E().zza());
                    }
/* 707 */           j4 = j3;
/* 709 */           extensionVersion = 0;
/* 710 */           zzql.zza();
/* 718 */           if (pd3Var2.m7406J(null, ug3Var)) {
/* 720 */               ij3.m4553j(up3Var);
/* 723 */               jM9096U = up3Var.m9096U();
                    }
/* 727 */           String str16 = pd3Var2.f15074c;
/* 738 */           String strValueOf4 = String.valueOf(ok3.m7185h(pd3Var2.m7411O("google_analytics_default_allow_ad_personalization_signals", true)));
/* 742 */           long j14 = ij3Var2.f9666o0;
/* 746 */           ij3.m4552i(ij3Var2.f9656f0);
/* 830 */           return new zzr(strM4534F2, strM4535G, str2, j, str6, 130000L, j11, str, z3, z6, str3, j12, i5, z7, z10, boolValueOf2, this.f9603w, list2, strM7188g2, str12, str13, z11, j4, i6, str14, extensionVersion, jM9096U, str16, strValueOf4, j14, ij3Var2.f9656f0.m9976E().zza());
                }

                /* JADX INFO: renamed from: E */
                public final void m4533E() {
                    String str;
/* 1 */             mo1375y();
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             ki3 ki3Var = ij3Var.f9653e;
/* 10 */            uh3 uh3Var = ij3Var.f9655f;
/* 12 */            ij3.m4553j(ki3Var);
/* 25 */            if (ki3Var.m6116G().m7189i(nk3.ANALYTICS_STORAGE)) {
/* 41 */                byte[] bArr = new byte[16];
/* 43 */                up3 up3Var = ij3Var.f9668w;
/* 45 */                ij3.m4553j(up3Var);
/* 52 */                up3Var.m9116w0().nextBytes(bArr);
/* 69 */                str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
                    } else {
/* 27 */                ij3.m4555l(uh3Var);
/* 34 */                uh3Var.f17533X.m8510a("Analytics Storage consent is not granted");
/* 37 */                str = null;
                    }
/* 73 */            ij3.m4555l(uh3Var);
/* 91 */            uh3Var.f17533X.m8510a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
/* 94 */            this.f9594Z = str;
/* 98 */            ij3Var.f9640V.getClass();
/* 105 */           this.f9595a0 = System.currentTimeMillis();
                }

                /* JADX INFO: renamed from: F */
                public final String m4534F() {
/* 1 */             m9576A();
/* 6 */             kb1.m6061n(this.f9597c);
/* 9 */             return this.f9597c;
                }

                /* JADX INFO: renamed from: G */
                public final String m4535G() {
/* 1 */             mo1375y();
/* 4 */             m9576A();
/* 9 */             kb1.m6061n(this.f9593Y);
/* 12 */            return this.f9593Y;
                }
            }
