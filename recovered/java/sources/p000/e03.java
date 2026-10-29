            package p000;

            import android.content.Context;
            import com.usercentrics.sdk.UsercentricsDomains;
            import com.usercentrics.sdk.UsercentricsOptions;
            import java.util.ArrayList;
            import java.util.Timer;
            import kotlin.Unit;
            import kotlin.coroutines.AbstractC1844e;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e03 {

                /* JADX INFO: renamed from: a */
                public static final e03 f7466a = new e03();

                /* JADX INFO: renamed from: b */
                public static final as0 f7467b = new as0();

                /* JADX INFO: renamed from: c */
                public static boolean f7468c;

                /* JADX INFO: renamed from: d */
                public static C1908lz f7469d;

                /* JADX INFO: renamed from: e */
                public static volatile a13 f7470e;

                /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                /* JADX INFO: renamed from: a */
                public static final Object m3285a(vz2 vz2Var, d10 d10Var) {
                    d03 d03Var;
                    a13 a13Var;
                    Object objM33n;
                    i03 i03VarM3699e;
/* 1 */             e03 e03Var = f7466a;
/* 5 */             if (d10Var instanceof d03) {
/* 8 */                 d03Var = (d03) d10Var;
/* 10 */                int i = d03Var.f6952e;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    d03Var.f6952e = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    d03Var = new d03(d10Var);
                        }
                    } else {
/* 24 */                d03Var = new d03(d10Var);
                    }
/* 27 */            Object obj = d03Var.f6951d;
/* 29 */            z10 z10Var = z10.f19902a;
/* 31 */            int i2 = d03Var.f6952e;
/* 34 */            if (i2 == 0) {
/* 64 */                pg3.m7417A(obj);
/* 67 */                a13Var = f7470e;
/* 69 */                if (a13Var == null) {
/* 71 */                    return Unit.f12910a;
                        }
/* 74 */                d03Var.f6948a = e03Var;
/* 76 */                d03Var.f6949b = vz2Var;
/* 78 */                d03Var.f6950c = a13Var;
/* 80 */                d03Var.f6952e = 1;
/* 82 */                objM33n = a13Var.m33n(true, d03Var);
/* 86 */                if (objM33n == z10Var) {
/* 88 */                    return z10Var;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 59 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 62 */                    return null;
                        }
/* 38 */                a13 a13Var2 = d03Var.f6950c;
/* 40 */                vz2 vz2Var2 = d03Var.f6949b;
/* 42 */                e03 e03Var2 = d03Var.f6948a;
/* 44 */                pg3.m7417A(obj);
/* 49 */                Object obj2 = ((o42) obj).f14613a;
/* 52 */                a13Var = a13Var2;
/* 53 */                vz2Var = vz2Var2;
/* 54 */                e03Var = e03Var2;
/* 55 */                objM33n = obj2;
                    }
/* 89 */            m42 m42Var = o42.f14612b;
/* 93 */            if (!(objM33n instanceof n42)) {
/* 95 */                e03Var.getClass();
/* 98 */                m3288d(a13Var);
/* 101 */               return Unit.f12910a;
                    }
/* 112 */           vz2 vz2Var3 = new vz2(HttpUrl.FRAGMENT_ENCODE_SET, o42.m7099a(objM33n));
/* 115 */           e03Var.getClass();
/* 118 */           fb1 fb1VarM3289e = m3289e();
/* 122 */           if (fb1VarM3289e != null && (i03VarM3699e = fb1VarM3289e.m3699e()) != null) {
/* 132 */               i03VarM3699e.mo2908c("Usercentrics SDK was not able to initialize offline, cannot initialize, please make sure the internet connection is fine and retry", vz2Var3);
                    }
/* 137 */           vz2Var.getClass();
/* 140 */           String str = vz2Var.f18403a;
/* 142 */           if (str == null) {
/* 144 */               str = "Unknown error";
                    }
/* 160 */           m3288d(new n42(new C1836km("Usercentrics initialization failed: ".concat(str), vz2Var)));
/* 163 */           return Unit.f12910a;
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0019 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:15:0x001b  */
                /* JADX WARN: Code duplicated, block: B:16:0x0020  */
                /* JADX INFO: renamed from: b */
                public static final vz2 m3286b(Throwable th) {
                    String string;
/* 3 */             if (th instanceof vz2) {
/* 5 */                 return (vz2) th;
                    }
/* 8 */             if (th != null && (string = th.getMessage()) != null) {
/* 20 */                if (StringsKt.m6228D(string)) {
/* 23 */                    string = null;
                        }
/* 24 */                if (string == null) {
/* 26 */                    if (th != null) {
/* 28 */                        string = th.toString();
                            } else {
/* 33 */                        string = "Unknown error";
                            }
                        }
                    } else if (th != null) {
/* 28 */                string = th.toString();
                    } else {
/* 33 */                string = "Unknown error";
                    }
/* 37 */            return new vz2(string, th);
                }

                /* JADX INFO: renamed from: c */
                public static void m3287c(Context context, UsercentricsOptions usercentricsOptions) {
                    UsercentricsDomains usercentricsDomains;
                    boolean z;
                    boolean z2;
/* 6 */             if (f7470e != null) {
/* 10 */                hz2.Companion.getClass();
/* 13 */                hz2 hz2Var = hz2.f9372f;
/* 15 */                if (hz2Var != null) {
                            try {
/* 17 */                        m42 m42Var = o42.f14612b;
/* 19 */                        fb1 fb1Var = hz2Var.f9373a;
/* 21 */                        if (fb1Var != null) {
/* 29 */                            C1955n8 c1955n8 = (C1955n8) fb1Var.f8108v.getValue();
/* 31 */                            Timer timer = c1955n8.f14160b;
/* 33 */                            if (timer != null) {
/* 35 */                                timer.cancel();
                                    }
/* 38 */                            c1955n8.f14160b = null;
                                }
                            } catch (Throwable unused) {
/* 41 */                        m42 m42Var2 = o42.f14612b;
                            }
/* 43 */                    hz2Var.f9373a = null;
                        }
/* 45 */                hz2.f9372f = null;
/* 53 */                ((ArrayList) uz2.f17817a.f16749a).clear();
/* 62 */                ((ArrayList) uz2.f17818b.f16749a).clear();
/* 67 */                f7467b.f2074b = null;
/* 69 */                f7470e = null;
                    }
/* 72 */            f7468c = true;
/* 74 */            String str = usercentricsOptions.f6048a;
/* 76 */            String str2 = usercentricsOptions.f6049b;
/* 78 */            String str3 = usercentricsOptions.f6050c;
/* 80 */            long j = usercentricsOptions.f6051d;
/* 82 */            l03 l03Var = usercentricsOptions.f6052e;
/* 84 */            String str4 = usercentricsOptions.f6053f;
/* 86 */            bn1 bn1Var = usercentricsOptions.f6057j;
/* 88 */            boolean z3 = usercentricsOptions.f6054g;
/* 90 */            UsercentricsDomains usercentricsDomains2 = usercentricsOptions.f6055h;
/* 92 */            long j2 = usercentricsOptions.f6056i;
/* 94 */            str.getClass();
/* 97 */            str2.getClass();
/* 100 */           str3.getClass();
/* 103 */           l03Var.getClass();
/* 106 */           str4.getClass();
/* 109 */           bn1Var.getClass();
/* 114 */           if (usercentricsDomains2 != null) {
/* 116 */               String str5 = usercentricsDomains2.f6042a;
/* 118 */               String str6 = usercentricsDomains2.f6043b;
/* 122 */               String str7 = usercentricsDomains2.f6044c;
/* 126 */               String str8 = usercentricsDomains2.f6045d;
/* 128 */               String str9 = usercentricsDomains2.f6046e;
/* 130 */               str5.getClass();
/* 133 */               str6.getClass();
/* 136 */               str7.getClass();
/* 139 */               str8.getClass();
/* 142 */               str9.getClass();
/* 153 */               usercentricsDomains = new UsercentricsDomains(str5, str6, str7, str8, str9);
                    } else {
/* 161 */               usercentricsDomains = null;
                    }
/* 165 */           r12.f6057j = bn1Var;
                    try {
/* 167 */               m3290f(r12);
/* 172 */               hz2.Companion.getClass();
/* 175 */               hz2 hz2Var2 = hz2.f9372f;
/* 177 */               if (hz2Var2 == null) {
/* 181 */                   hz2Var2 = new hz2();
/* 184 */                   hz2.f9372f = hz2Var2;
                        }
/* 188 */               hz2Var2.f9376d = context;
/* 196 */               int i = 0;
/* 197 */               if (Intrinsics.m6216a(hz2Var2.f9374b, r12)) {
/* 199 */                   z = false;
                        } else {
/* 207 */                   z = hz2Var2.f9374b != null;
/* 208 */                   hz2Var2.f9374b = r12;
                        }
/* 210 */               if (z) {
                            try {
/* 212 */                       m42 m42Var3 = o42.f14612b;
/* 214 */                       fb1 fb1Var2 = hz2Var2.f9373a;
/* 216 */                       if (fb1Var2 != null) {
/* 224 */                           C1955n8 c1955n9 = (C1955n8) fb1Var2.f8108v.getValue();
/* 226 */                           Timer timer2 = c1955n9.f14160b;
/* 228 */                           if (timer2 != null) {
/* 230 */                               timer2.cancel();
                                    }
/* 234 */                           c1955n9.f14160b = null;
                                }
                            } catch (Throwable unused2) {
/* 238 */                       m42 m42Var4 = o42.f14612b;
                            }
/* 241 */                   hz2Var2.f9373a = null;
                        }
/* 243 */               hz2 hz2Var3 = hz2.f9372f;
/* 245 */               if (hz2Var3 == null) {
/* 249 */                   hz2Var3 = new hz2();
/* 252 */                   hz2.f9372f = hz2Var3;
                        }
/* 254 */               fb1 fb1Var3 = hz2Var3.f9373a;
/* 256 */               if (fb1Var3 == null) {
/* 260 */                   if (hz2.f9371e == null) {
/* 269 */                       hz2.f9371e = new zb0(19);
                            }
/* 271 */                   UsercentricsOptions usercentricsOptions2 = hz2Var3.f9374b;
/* 273 */                   usercentricsOptions2.getClass();
/* 280 */                   fb1 fb1Var4 = new fb1(hz2Var3.f9376d, usercentricsOptions2);
/* 283 */                   hz2Var3.f9373a = fb1Var4;
/* 285 */                   fb1Var3 = fb1Var4;
                        }
/* 292 */               se0 se0Var = (se0) fb1Var3.f8082T.getValue();
/* 294 */               String str10 = fb1Var3.f8088b;
/* 296 */               se0Var.getClass();
/* 299 */               str10.getClass();
/* 302 */               se0Var.f16550c = str10;
/* 313 */               se0Var.f16549b.m9743b(new C1929mj(se0Var, null, 3));
/* 318 */               UsercentricsDomains usercentricsDomains3 = fb1Var3.f8087a.f6055h;
/* 320 */               if (usercentricsDomains3 != null) {
/* 326 */                   z2 = true;
/* 327 */                   c10 c10Var = usercentricsDomains3.m2770a() ? null : null;
/* 393 */                   C1945mz c1945mz = (C1945mz) ((InterfaceC1811jz) fb1Var3.f8105s.getValue());
/* 403 */                   c1945mz.f14069a.m9743b(new C1929mj(c1945mz, c10Var, 1));
/* 408 */                   a13 a13Var = new a13(fb1Var3, new UsercentricsOptions(str, str2, str3, j, l03Var, str4, z3, usercentricsDomains, j2));
/* 411 */                   f7470e = a13Var;
/* 413 */                   long j3 = usercentricsOptions.f6056i;
/* 421 */                   se0 se0Var2 = (se0) fb1Var3.f8082T.getValue();
/* 423 */                   x80 x80VarM3696b = fb1Var3.m3696b();
/* 432 */                   C2223tm c2223tm = new C2223tm(se0Var2, a13Var, null, 11);
/* 435 */                   x80VarM3696b.getClass();
/* 442 */                   C0875ec c0875ec = new C0875ec(21);
/* 445 */                   s10 s10Var = x80VarM3696b.f18989b;
/* 447 */                   s10Var.getClass();
/* 470 */                   i13.m4443w(k50.m5964a(AbstractC1844e.m6215c(new pi2(), s10Var)), null, new v80(j3, x80VarM3696b, c2223tm, c0875ec, null), 3);
/* 475 */                   c0875ec.m3369G(nk2.f14337U);
                        }
/* 331 */               z2 = true;
/* 338 */               C1955n8 c1955n10 = (C1955n8) fb1Var3.f8108v.getValue();
/* 342 */               c1955n10.f14159a.invoke();
/* 347 */               Timer timer3 = new Timer(z2);
/* 361 */               timer3.scheduleAtFixedRate(new C1918m8(c1955n10, i), 180000L, 180000L);
/* 364 */               c1955n10.f14160b = timer3;
/* 372 */               C2003oj c2003oj = (C2003oj) fb1Var3.f8063A.getValue();
/* 382 */               c2003oj.f14774a.m9743b(new C1929mj(c2003oj, null, i));
/* 393 */               C1945mz c1945mz2 = (C1945mz) ((InterfaceC1811jz) fb1Var3.f8105s.getValue());
/* 403 */               c1945mz2.f14069a.m9743b(new C1929mj(c1945mz2, c10Var, 1));
/* 408 */               a13 a13Var2 = new a13(fb1Var3, new UsercentricsOptions(str, str2, str3, j, l03Var, str4, z3, usercentricsDomains, j2));
/* 411 */               f7470e = a13Var2;
/* 413 */               long j4 = usercentricsOptions.f6056i;
/* 421 */               se0 se0Var3 = (se0) fb1Var3.f8082T.getValue();
/* 423 */               x80 x80VarM3696b2 = fb1Var3.m3696b();
/* 432 */               C2223tm c2223tm2 = new C2223tm(se0Var3, a13Var2, null, 11);
/* 435 */               x80VarM3696b2.getClass();
/* 442 */               C0875ec c0875ec2 = new C0875ec(21);
/* 445 */               s10 s10Var2 = x80VarM3696b2.f18989b;
/* 447 */               s10Var2.getClass();
/* 470 */               i13.m4443w(k50.m5964a(AbstractC1844e.m6215c(new pi2(), s10Var2)), null, new v80(j4, x80VarM3696b2, c2223tm2, c0875ec2, null), 3);
/* 475 */               c0875ec2.m3369G(nk2.f14337U);
                    } catch (Exception e) {
/* 480 */               m42 m42Var5 = o42.f14612b;
/* 487 */               m3288d(new n42(e));
                    }
                }

                /* JADX INFO: renamed from: d */
                public static void m3288d(Object obj) {
                    x80 x80VarM3696b;
                    fb1 fb1VarM3289e;
                    i03 i03VarM3699e;
/* 1 */             m42 m42Var = o42.f14612b;
/* 6 */             if (!(obj instanceof n42) && (fb1VarM3289e = m3289e()) != null && (i03VarM3699e = fb1VarM3289e.m3699e()) != null) {
/* 22 */                i03VarM3699e.mo2906a("Usercentrics SDK is fully initialized", null);
                    }
/* 25 */            C1908lz c1908lz = f7469d;
/* 27 */            f7469d = null;
/* 30 */            f7468c = false;
/* 32 */            if (c1908lz != null) {
/* 34 */                c1908lz.invoke();
/* 37 */                return;
                    }
/* 45 */            f7467b.f2074b = new o42(obj);
/* 47 */            fb1 fb1VarM3289e2 = m3289e();
/* 51 */            if (fb1VarM3289e2 == null || (x80VarM3696b = fb1VarM3289e2.m3696b()) == null) {
/* 69 */                return;
                    }
/* 66 */            x80VarM3696b.m9744c(new C0908f8(obj, 18));
                }

                /* JADX INFO: renamed from: e */
                public static fb1 m3289e() {
/* 3 */             hz2.Companion.getClass();
/* 6 */             hz2 hz2Var = hz2.f9372f;
/* 8 */             if (hz2Var != null) {
/* 10 */                return hz2Var.f9373a;
                    }
/* 13 */            return null;
                }

                /* JADX INFO: renamed from: f */
                public static void m3290f(UsercentricsOptions usercentricsOptions) throws vz2 {
/* 1 */             UsercentricsDomains usercentricsDomains = usercentricsOptions.f6055h;
/* 14 */            boolean z = (usercentricsDomains == null || usercentricsDomains.m2770a()) ? false : true;
/* 30 */            if (!((true ^ StringsKt.m6228D(usercentricsOptions.f6053f)) ^ (!StringsKt.m6228D(usercentricsOptions.f6048a)))) {
/* 72 */                throw new C1836km("Please use a valid settingsId or ruleSetId.");
                    }
/* 32 */            if (z) {
/* 64 */                throw new vz2("Defined self hosting domains are not valid. Please validate them!");
                    }
/* 40 */            if (usercentricsOptions.f6051d <= 0) {
/* 44 */                usercentricsOptions.f6051d = 10000L;
                    }
/* 52 */            if (usercentricsOptions.f6056i < 5000) {
/* 54 */                usercentricsOptions.f6056i = 5000L;
                    }
                }
            }
