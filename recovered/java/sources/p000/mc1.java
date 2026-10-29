            package p000;

            import java.util.Map;
            import java.util.NoSuchElementException;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class mc1 {
                /* JADX INFO: renamed from: a */
                public static Object m6638a(Map map, Object obj) {
/* 1 */             map.getClass();
/* 6 */             if (map instanceof lc1) {
/* 8 */                 lc1 lc1Var = (lc1) map;
/* 10 */                Map map2 = lc1Var.f13181a;
/* 12 */                Object obj2 = map2.get(obj);
                        return (obj2 != null || map2.containsKey(obj)) ? obj2 : lc1Var.f13182b.invoke(obj);
                    }
/* 32 */            Object obj3 = map.get(obj);
/* 36 */            if (obj3 != null || map.containsKey(obj)) {
/* 70 */                return obj3;
                    }
/* 69 */            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
                }

                /* JADX INFO: renamed from: b */
                public static Map m6639b(Map map, Function1 function1) {
/* 1 */             map.getClass();
                    return map instanceof lc1 ? m6639b(((lc1) map).f13181a, function1) : new lc1(map, function1);
                }
            }
