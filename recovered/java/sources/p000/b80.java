            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Collections;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class b80 {
                static {
/* 9 */             C1988o4[] c1988o4Arr = {new C1988o4(6, a80.class)};
/* 15 */            HashMap map = new HashMap();
/* 21 */            for (C1988o4 c1988o4 : c1988o4Arr) {
/* 27 */                boolean zContainsKey = map.containsKey(c1988o4.f14607a);
/* 31 */                Class cls = c1988o4.f14607a;
/* 33 */                if (zContainsKey) {
/* 47 */                    C1951n4.m6865p(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 50 */                    return;
                        }
/* 35 */                map.put(cls, c1988o4);
                    }
/* 52 */            if (c1988o4Arr.length > 0) {
/* 56 */                Class cls2 = c1988o4Arr[0].f14607a;
                    }
/* 58 */            Collections.unmodifiableMap(map);
/* 61 */            int i = s22.CONFIG_NAME_FIELD_NUMBER;
                    try {
/* 63 */                m1297a();
                    } catch (GeneralSecurityException e) {
/* 73 */                throw new ExceptionInInitializerError(e);
                    }
                }

                /* JADX INFO: renamed from: a */
                public static void m1297a() {
/* 3 */             r22.m8059h(d80.f7041b);
/* 10 */            if (to2.m8821a()) {
/* 12 */                return;
                    }
/* 27 */            Class<C2096q6> cls = C2096q6.class;
/* 33 */            r22.m8057f(new C2094q4(cls, new C1988o4[]{new C1988o4(6, a80.class)}, 6), true);
/* 36 */            jr1 jr1Var = AbstractC2320w6.f18449a;
/* 38 */            al1 al1Var = al1.f328b;
/* 42 */            al1Var.m307e(AbstractC2320w6.f18449a);
/* 47 */            al1Var.m306d(AbstractC2320w6.f18450b);
/* 52 */            al1Var.m305c(AbstractC2320w6.f18451c);
/* 57 */            al1Var.m304b(AbstractC2320w6.f18452d);
                }
            }
