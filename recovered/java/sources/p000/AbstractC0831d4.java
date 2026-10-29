            package p000;

            import java.security.GeneralSecurityException;
            import java.security.NoSuchAlgorithmException;
            import java.util.Collections;
            import java.util.HashMap;
            import javax.crypto.Cipher;
            import javax.crypto.NoSuchPaddingException;
            
            /* JADX INFO: renamed from: d4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0831d4 {
                static {
/* 9 */             C1988o4[] c1988o4Arr = {new C1988o4(1, InterfaceC0203c4.class)};
/* 15 */            HashMap map = new HashMap();
/* 19 */            C1988o4 c1988o4 = c1988o4Arr[0];
/* 23 */            boolean zContainsKey = map.containsKey(c1988o4.f14607a);
/* 27 */            Class cls = c1988o4.f14607a;
/* 31 */            if (zContainsKey) {
/* 378 */               C1951n4.m6865p(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 381 */               return;
                    }
/* 33 */            map.put(cls, c1988o4);
/* 38 */            Class cls2 = c1988o4Arr[0].f14607a;
/* 40 */            Collections.unmodifiableMap(map);
/* 49 */            C1988o4[] c1988o4Arr2 = {new C1988o4(4, InterfaceC0203c4.class)};
/* 55 */            HashMap map2 = new HashMap();
/* 58 */            C1988o4 c1988o5 = c1988o4Arr2[0];
/* 62 */            boolean zContainsKey2 = map2.containsKey(c1988o5.f14607a);
/* 66 */            Class cls3 = c1988o5.f14607a;
/* 68 */            if (zContainsKey2) {
/* 370 */               C1951n4.m6865p(cls3.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 373 */               return;
                    }
/* 70 */            map2.put(cls3, c1988o5);
/* 75 */            Class cls4 = c1988o4Arr2[0].f14607a;
/* 77 */            Collections.unmodifiableMap(map2);
/* 86 */            C1988o4[] c1988o4Arr3 = {new C1988o4(5, InterfaceC0203c4.class)};
/* 92 */            HashMap map3 = new HashMap();
/* 95 */            C1988o4 c1988o6 = c1988o4Arr3[0];
/* 99 */            boolean zContainsKey3 = map3.containsKey(c1988o6.f14607a);
/* 103 */           Class cls5 = c1988o6.f14607a;
/* 105 */           if (zContainsKey3) {
/* 362 */               C1951n4.m6865p(cls5.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 365 */               return;
                    }
/* 107 */           map3.put(cls5, c1988o6);
/* 112 */           Class cls6 = c1988o4Arr3[0].f14607a;
/* 114 */           Collections.unmodifiableMap(map3);
/* 123 */           C1988o4[] c1988o4Arr4 = {new C1988o4(3, InterfaceC0203c4.class)};
/* 129 */           HashMap map4 = new HashMap();
/* 132 */           C1988o4 c1988o7 = c1988o4Arr4[0];
/* 136 */           boolean zContainsKey4 = map4.containsKey(c1988o7.f14607a);
/* 140 */           Class cls7 = c1988o7.f14607a;
/* 142 */           if (zContainsKey4) {
/* 354 */               C1951n4.m6865p(cls7.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 357 */               return;
                    }
/* 144 */           map4.put(cls7, c1988o7);
/* 149 */           Class cls8 = c1988o4Arr4[0].f14607a;
/* 151 */           Collections.unmodifiableMap(map4);
/* 161 */           C1988o4[] c1988o4Arr5 = {new C1988o4(9, InterfaceC0203c4.class)};
/* 167 */           HashMap map5 = new HashMap();
/* 170 */           C1988o4 c1988o8 = c1988o4Arr5[0];
/* 174 */           boolean zContainsKey5 = map5.containsKey(c1988o8.f14607a);
/* 178 */           Class cls9 = c1988o8.f14607a;
/* 180 */           if (zContainsKey5) {
/* 346 */               C1951n4.m6865p(cls9.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 349 */               return;
                    }
/* 182 */           map5.put(cls9, c1988o8);
/* 187 */           Class cls10 = c1988o4Arr5[0].f14607a;
/* 189 */           Collections.unmodifiableMap(map5);
/* 199 */           C1988o4[] c1988o4Arr6 = {new C1988o4(10, InterfaceC0203c4.class)};
/* 205 */           HashMap map6 = new HashMap();
/* 208 */           C1988o4 c1988o9 = c1988o4Arr6[0];
/* 212 */           boolean zContainsKey6 = map6.containsKey(c1988o9.f14607a);
/* 216 */           Class cls11 = c1988o9.f14607a;
/* 218 */           if (zContainsKey6) {
/* 338 */               C1951n4.m6865p(cls11.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 341 */               return;
                    }
/* 220 */           map6.put(cls11, c1988o9);
/* 225 */           Class cls12 = c1988o4Arr6[0].f14607a;
/* 227 */           Collections.unmodifiableMap(map6);
/* 236 */           C1988o4[] c1988o4Arr7 = {new C1988o4(7, InterfaceC0203c4.class)};
/* 242 */           HashMap map7 = new HashMap();
/* 245 */           C1988o4 c1988o10 = c1988o4Arr7[0];
/* 249 */           boolean zContainsKey7 = map7.containsKey(c1988o10.f14607a);
/* 253 */           Class cls13 = c1988o10.f14607a;
/* 255 */           if (zContainsKey7) {
/* 330 */               C1951n4.m6865p(cls13.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 333 */               return;
                    }
/* 257 */           map7.put(cls13, c1988o10);
/* 262 */           Class cls14 = c1988o4Arr7[0].f14607a;
/* 264 */           Collections.unmodifiableMap(map7);
/* 274 */           C1988o4[] c1988o4Arr8 = {new C1988o4(11, InterfaceC0203c4.class)};
/* 280 */           HashMap map8 = new HashMap();
/* 283 */           C1988o4 c1988o11 = c1988o4Arr8[0];
/* 287 */           boolean zContainsKey8 = map8.containsKey(c1988o11.f14607a);
/* 291 */           Class cls15 = c1988o11.f14607a;
/* 293 */           if (zContainsKey8) {
/* 322 */               C1951n4.m6865p(cls15.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 325 */               return;
                    }
/* 295 */           map8.put(cls15, c1988o11);
/* 300 */           Class cls16 = c1988o4Arr8[0].f14607a;
/* 302 */           Collections.unmodifiableMap(map8);
/* 305 */           int i = s22.CONFIG_NAME_FIELD_NUMBER;
                    try {
/* 307 */               m2919a();
                    } catch (GeneralSecurityException e) {
/* 317 */               throw new ExceptionInInitializerError(e);
                    }
                }

                /* JADX INFO: renamed from: a */
                public static void m2919a() {
/* 3 */             r22.m8059h(C0978h4.f8891b);
/* 6 */             xa1.m9746a();
/* 29 */            r22.m8057f(new C2094q4(C2355x4.class, new C1988o4[]{new C1988o4(1, InterfaceC0203c4.class)}, 2), true);
/* 32 */            jr1 jr1Var = AbstractC0905f5.f7996a;
/* 34 */            al1 al1Var = al1.f328b;
/* 38 */            al1Var.m307e(AbstractC0905f5.f7996a);
/* 43 */            al1Var.m306d(AbstractC0905f5.f7997b);
/* 48 */            al1Var.m305c(AbstractC0905f5.f7998c);
/* 53 */            al1Var.m304b(AbstractC0905f5.f7999d);
/* 68 */            Class<C0008a6> cls = C0008a6.class;
/* 73 */            r22.m8057f(new C2094q4(cls, new C1988o4[]{new C1988o4(4, InterfaceC0203c4.class)}, 4), true);
/* 78 */            al1Var.m307e(AbstractC0906f6.f8005a);
/* 83 */            al1Var.m306d(AbstractC0906f6.f8006b);
/* 88 */            al1Var.m305c(AbstractC0906f6.f8007c);
/* 93 */            al1Var.m304b(AbstractC0906f6.f8008d);
/* 100 */           if (to2.m8821a()) {
/* 102 */               return;
                    }
/* 115 */           Class<C2095q5> cls2 = C2095q5.class;
/* 120 */           r22.m8057f(new C2094q4(cls2, new C1988o4[]{new C1988o4(3, InterfaceC0203c4.class)}, 3), true);
/* 125 */           al1Var.m307e(AbstractC2356x5.f18951a);
/* 130 */           al1Var.m306d(AbstractC2356x5.f18952b);
/* 135 */           al1Var.m305c(AbstractC2356x5.f18953c);
/* 140 */           al1Var.m304b(AbstractC2356x5.f18954d);
                    try {
/* 145 */               Cipher.getInstance("AES/GCM-SIV/NoPadding");
/* 160 */               Class<C1017i6> cls3 = C1017i6.class;
/* 165 */               r22.m8057f(new C2094q4(cls3, new C1988o4[]{new C1988o4(5, InterfaceC0203c4.class)}, 5), true);
/* 170 */               al1Var.m307e(AbstractC1953n6.f14134a);
/* 175 */               al1Var.m306d(AbstractC1953n6.f14135b);
/* 180 */               al1Var.m305c(AbstractC1953n6.f14136c);
/* 185 */               al1Var.m304b(AbstractC1953n6.f14137d);
                    } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
                    }
/* 200 */           Class<C0818cs> cls4 = C0818cs.class;
/* 205 */           r22.m8057f(new C2094q4(cls4, new C1988o4[]{new C1988o4(7, InterfaceC0203c4.class)}, 7), true);
/* 208 */           jr1 jr1Var2 = AbstractC1002hs.f9217a;
/* 210 */           al1 al1Var2 = al1.f328b;
/* 214 */           al1Var2.m307e(AbstractC1002hs.f9217a);
/* 219 */           al1Var2.m306d(AbstractC1002hs.f9218b);
/* 224 */           al1Var2.m305c(AbstractC1002hs.f9219c);
/* 229 */           al1Var2.m304b(AbstractC1002hs.f9220d);
/* 252 */           r22.m8057f(new C2094q4(p41.class, new C1988o4[]{new C1988o4(9, InterfaceC0203c4.class)}, 8), true);
/* 268 */           Class<u41> cls5 = u41.class;
/* 273 */           r22.m8057f(new C2094q4(cls5, new C1988o4[]{new C1988o4(10, InterfaceC0203c4.class)}, 9), true);
/* 289 */           Class<l93> cls6 = l93.class;
/* 294 */           r22.m8057f(new C2094q4(cls6, new C1988o4[]{new C1988o4(11, InterfaceC0203c4.class)}, 10), true);
/* 299 */           al1Var2.m307e(p93.f15034a);
/* 304 */           al1Var2.m306d(p93.f15035b);
/* 309 */           al1Var2.m305c(p93.f15036c);
/* 314 */           al1Var2.m304b(p93.f15037d);
                }
            }
