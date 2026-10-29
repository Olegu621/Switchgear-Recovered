            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: renamed from: hv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1005hv {

                /* JADX INFO: renamed from: a */
                public final HashMap f9331a = new HashMap();

                /* JADX INFO: renamed from: b */
                public final HashMap f9332b;

                public C1005hv(HashMap map) {
/* 4 */             this.f9332b = map;
/* 25 */            for (Map.Entry entry : map.entrySet()) {
/* 37 */                t61 t61Var = (t61) entry.getValue();
/* 45 */                List arrayList = (List) this.f9331a.get(t61Var);
/* 47 */                if (arrayList == null) {
/* 51 */                    arrayList = new ArrayList();
/* 56 */                    this.f9331a.put(t61Var, arrayList);
                        }
/* 65 */                arrayList.add((C1770iv) entry.getKey());
                    }
                }

                /* JADX INFO: renamed from: a */
                public static void m4381a(List list, g71 g71Var, t61 t61Var, Object obj) {
/* 1 */             if (list != null) {
/* 9 */                 for (int size = list.size() - 1; size >= 0; size--) {
/* 15 */                    C1770iv c1770iv = (C1770iv) list.get(size);
/* 17 */                    Method method = c1770iv.f11941b;
                            try {
/* 19 */                        int i = c1770iv.f11940a;
/* 21 */                        if (i == 0) {
/* 46 */                            method.invoke(obj, null);
                                } else if (i == 1) {
/* 41 */                            method.invoke(obj, g71Var);
                                } else if (i == 2) {
/* 33 */                            method.invoke(obj, g71Var, t61Var);
                                }
                            } catch (IllegalAccessException e) {
/* 53 */                        ds0.m3199p(e);
/* 56 */                        return;
                            } catch (InvocationTargetException e2) {
/* 64 */                        ds0.m3198o("Failed to call observer method", e2.getCause());
/* 67 */                        return;
                            }
                        }
                    }
                }
            }
