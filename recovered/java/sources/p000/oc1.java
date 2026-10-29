            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class oc1 extends nc1 {
                /* JADX INFO: renamed from: e */
                public static Map m7131e(Pair... pairArr) {
/* 2 */             if (pairArr.length <= 0) {
/* 31 */                od0 od0Var = od0.f14715a;
/* 33 */                od0Var.getClass();
/* 36 */                return od0Var;
                    }
/* 11 */            LinkedHashMap linkedHashMap = new LinkedHashMap(nc1.m6962c(pairArr.length));
/* 16 */            for (Pair pair : pairArr) {
/* 24 */                linkedHashMap.put(pair.f12908a, pair.f12909b);
                    }
/* 30 */            return linkedHashMap;
                }

                /* JADX INFO: renamed from: f */
                public static LinkedHashMap m7132f(Pair... pairArr) {
/* 8 */             LinkedHashMap linkedHashMap = new LinkedHashMap(nc1.m6962c(pairArr.length));
/* 13 */            for (Pair pair : pairArr) {
/* 21 */                linkedHashMap.put(pair.f12908a, pair.f12909b);
                    }
/* 27 */            return linkedHashMap;
                }

                /* JADX INFO: renamed from: g */
                public static Map m7133g(ArrayList arrayList) {
/* 1 */             int size = arrayList.size();
/* 5 */             if (size == 0) {
/* 60 */                od0 od0Var = od0.f14715a;
/* 62 */                od0Var.getClass();
/* 65 */                return od0Var;
                    }
/* 8 */             if (size == 1) {
/* 55 */                return nc1.m6963d((Pair) arrayList.get(0));
                    }
/* 20 */            LinkedHashMap linkedHashMap = new LinkedHashMap(nc1.m6962c(arrayList.size()));
/* 23 */            Iterator it = arrayList.iterator();
/* 31 */            while (it.hasNext()) {
/* 37 */                Pair pair = (Pair) it.next();
/* 43 */                linkedHashMap.put(pair.f12908a, pair.f12909b);
                    }
/* 47 */            return linkedHashMap;
                }

                /* JADX INFO: renamed from: h */
                public static Map m7134h(Map map) {
/* 1 */             map.getClass();
/* 4 */             int size = map.size();
/* 8 */             if (size == 0) {
/* 49 */                od0 od0Var = od0.f14715a;
/* 51 */                od0Var.getClass();
/* 54 */                return od0Var;
                    }
/* 11 */            if (size != 1) {
/* 15 */                return new LinkedHashMap(map);
                    }
/* 31 */            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
/* 41 */            Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
/* 45 */            mapSingletonMap.getClass();
/* 48 */            return mapSingletonMap;
                }
            }
