            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import javax.crypto.spec.SecretKeySpec;
            
            /* JADX INFO: renamed from: o4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1988o4 {

                /* JADX INFO: renamed from: a */
                public final Class f14607a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f14608b;

                public C1988o4(int i, Class cls) {
/* 1 */             this.f14608b = i;
/* 6 */             this.f14607a = cls;
                }

                /* JADX INFO: renamed from: a */
                public final Object m7098a(AbstractC2313w abstractC2313w) throws GeneralSecurityException {
                    switch (this.f14608b) {
                        case 0:
/* 506 */                   C1780j4 c1780j4 = (C1780j4) abstractC2313w;
/* 531 */                   return new ax1(new ac1(c1780j4.m5698z().m9304e()), c1780j4.m5696A().m8952y());
                        case 1:
/* 310 */                   C2355x4 c2355x4 = (C2355x4) abstractC2313w;
/* 321 */                   C1988o4[] c1988o4Arr = {new C1988o4(2, C0979h5.class)};
/* 327 */                   HashMap map = new HashMap();
/* 334 */                   for (C1988o4 c1988o4 : c1988o4Arr) {
/* 340 */                       boolean zContainsKey = map.containsKey(c1988o4.f14607a);
/* 344 */                       Class cls = c1988o4.f14607a;
/* 346 */                       if (zContainsKey) {
/* 358 */                           C1951n4.m6865p(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 6 */                             return null;
                                }
/* 348 */                       map.put(cls, c1988o4);
                            }
/* 364 */                   if (c1988o4Arr.length > 0) {
/* 368 */                       Class cls2 = c1988o4Arr[0].f14607a;
                            }
/* 370 */                   Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
/* 374 */                   C1781j5 c1781j5M9709z = c2355x4.m9709z();
/* 382 */                   C1988o4 c1988o5 = (C1988o4) mapUnmodifiableMap.get(C0979h5.class);
/* 388 */                   if (c1988o5 == null) {
/* 502 */                       f42.m3662r(C0979h5.class.getCanonicalName(), "Requested primitive class ", " not supported.");
/* 6 */                         return null;
                            }
/* 394 */                   C0979h5 c0979h5 = (C0979h5) c1988o5.m7098a(c1781j5M9709z);
/* 405 */                   C1988o4[] c1988o4Arr2 = {new C1988o4(8, wa1.class)};
/* 411 */                   HashMap map2 = new HashMap();
/* 416 */                   for (C1988o4 c1988o6 : c1988o4Arr2) {
/* 422 */                       boolean zContainsKey2 = map2.containsKey(c1988o6.f14607a);
/* 426 */                       Class cls3 = c1988o6.f14607a;
/* 428 */                       if (zContainsKey2) {
/* 440 */                           C1951n4.m6865p(cls3.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 6 */                             return null;
                                }
/* 430 */                       map2.put(cls3, c1988o6);
                            }
/* 445 */                   if (c1988o4Arr2.length > 0) {
/* 449 */                       Class cls4 = c1988o4Arr2[0].f14607a;
                            }
/* 451 */                   Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
/* 455 */                   mu0 mu0VarM9707A = c2355x4.m9707A();
/* 463 */                   C1988o4 c1988o7 = (C1988o4) mapUnmodifiableMap2.get(wa1.class);
/* 465 */                   if (c1988o7 != null) {
/* 485 */                       return new xd0(c0979h5, (wa1) c1988o7.m7098a(mu0VarM9707A), c2355x4.m9707A().m6808B().m8638A());
                            }
/* 494 */                   f42.m3662r(wa1.class.getCanonicalName(), "Requested primitive class ", " not supported.");
/* 6 */                     return null;
                        case 2:
/* 286 */                   C1781j5 c1781j5 = (C1781j5) abstractC2313w;
/* 306 */                   return new C0979h5(c1781j5.m5704A().m9304e(), c1781j5.m5705B().m6886y());
                        case 3:
/* 262 */                   C2095q5 c2095q5 = (C2095q5) abstractC2313w;
/* 282 */                   return new C1989o5(c2095q5.m7714z().m9304e(), c2095q5.m7712A().m9470y());
                        case 4:
/* 258 */                   return new C2486y5(((C0008a6) abstractC2313w).m72y().m9304e(), 0);
                        case 5:
/* 242 */                   return new C0943g6(((C1017i6) abstractC2313w).m4480y().m9304e());
                        case 6:
/* 226 */                   return new C1990o6(((C2096q6) abstractC2313w).m7729y().m9304e());
                        case 7:
/* 210 */                   return new C2486y5(((C0818cs) abstractC2313w).m2881y().m9304e(), 2);
                        case 8:
/* 77 */                    mu0 mu0Var = (mu0) abstractC2313w;
/* 83 */                    st0 st0VarM8639z = mu0Var.m6808B().m8639z();
/* 99 */                    SecretKeySpec secretKeySpec = new SecretKeySpec(mu0Var.m6807A().m9304e(), "HMAC");
/* 106 */                   int iM8638A = mu0Var.m6808B().m8638A();
/* 110 */                   int iOrdinal = st0VarM8639z.ordinal();
/* 115 */                   if (iOrdinal == 1) {
/* 194 */                       return new ax1(new ur3("HMACSHA1", secretKeySpec), iM8638A);
                            }
/* 117 */                   if (iOrdinal == 2) {
/* 181 */                       return new ax1(new ur3("HMACSHA384", secretKeySpec), iM8638A);
                            }
/* 119 */                   if (iOrdinal == 3) {
/* 168 */                       return new ax1(new ur3("HMACSHA256", secretKeySpec), iM8638A);
                            }
/* 122 */                   if (iOrdinal == 4) {
/* 155 */                       return new ax1(new ur3("HMACSHA512", secretKeySpec), iM8638A);
                            }
/* 125 */                   if (iOrdinal == 5) {
/* 136 */                       return new ax1(new ur3("HMACSHA224", secretKeySpec), iM8638A);
                            }
/* 142 */                   ds0.m3203t("unknown hash");
/* 6 */                     return null;
                        case 9:
/* 64 */                    String strM7704x = ((p41) abstractC2313w).m7333y().m7704x();
/* 72 */                    return r41.m8063a(strM7704x).m6402c(strM7704x);
                        case 10:
/* 26 */                    u41 u41Var = (u41) abstractC2313w;
/* 32 */                    String strM9222y = u41Var.m8957y().m9222y();
/* 54 */                    return new s41(u41Var.m8957y().m9221x(), r41.m8063a(strM9222y).m6402c(strM9222y));
                        default:
/* 22 */                    return new C2486y5(((l93) abstractC2313w).m6411y().m9304e(), 3);
                    }
                }
            }
