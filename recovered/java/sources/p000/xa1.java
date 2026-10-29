            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Collections;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class xa1 {
                static {
/* 10 */            C1988o4[] c1988o4Arr = {new C1988o4(8, wa1.class)};
/* 16 */            HashMap map = new HashMap();
/* 20 */            C1988o4 c1988o4 = c1988o4Arr[0];
/* 24 */            boolean zContainsKey = map.containsKey(c1988o4.f14607a);
/* 28 */            Class cls = c1988o4.f14607a;
/* 30 */            if (zContainsKey) {
/* 61 */                C1951n4.m6865p(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 64 */                return;
                    }
/* 32 */            map.put(cls, c1988o4);
/* 37 */            Class cls2 = c1988o4Arr[0].f14607a;
/* 39 */            Collections.unmodifiableMap(map);
/* 42 */            int i = s22.CONFIG_NAME_FIELD_NUMBER;
                    try {
/* 44 */                m9746a();
                    } catch (GeneralSecurityException e) {
/* 54 */                throw new ExceptionInInitializerError(e);
                    }
                }

                /* JADX INFO: renamed from: a */
                public static void m9746a() {
/* 3 */             r22.m8059h(ab1.f162c);
/* 8 */             r22.m8059h(C1940mu.f14026a);
/* 17 */            r22.m8057f(new C2094q4(), true);
/* 20 */            jr1 jr1Var = tu0.f17270a;
/* 22 */            al1 al1Var = al1.f328b;
/* 26 */            al1Var.m307e(tu0.f17270a);
/* 31 */            al1Var.m306d(tu0.f17271b);
/* 36 */            al1Var.m305c(tu0.f17272c);
/* 41 */            al1Var.m304b(tu0.f17273d);
/* 44 */            wk1 wk1Var = wk1.f18670b;
/* 48 */            wk1Var.m9583a(C2094q4.f15386f);
/* 55 */            if (to2.m8821a()) {
/* 57 */                return;
                    }
/* 77 */            r22.m8057f(new C2094q4(C1780j4.class, new C1988o4[]{new C1988o4(0, wa1.class)}, 0), true);
/* 82 */            al1Var.m307e(AbstractC2280v4.f17855a);
/* 87 */            al1Var.m306d(AbstractC2280v4.f17856b);
/* 92 */            al1Var.m305c(AbstractC2280v4.f17857c);
/* 97 */            al1Var.m304b(AbstractC2280v4.f17858d);
/* 102 */           wk1Var.m9583a(C2094q4.f15385e);
                }
            }
