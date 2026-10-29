            package p000;

            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class xn1 {

                /* JADX INFO: renamed from: a */
                public static final HashMap f19287a = new HashMap();

                /* JADX INFO: renamed from: b */
                public static final WeakHashMap f19288b = new WeakHashMap();

                /* JADX INFO: renamed from: a */
                public static final synchronized void m10005a(String str, tq2 tq2Var) {
                    try {
/* 6 */                 wn1 wn1Var = new wn1(tq2Var);
/* 10 */                wn1Var.f18700a = true;
/* 18 */                wn1 wn1Var2 = (wn1) f19288b.put(tq2Var, wn1Var);
/* 20 */                if (wn1Var2 != null) {
                            synchronized (wn1Var2) {
/* 24 */                        wn1Var2.f18700a = false;
/* 26 */                        wn1Var2.clear();
                            }
                        }
/* 34 */                HashMap map = f19287a;
/* 40 */                List linkedList = (List) map.get(str);
/* 42 */                if (linkedList == null) {
/* 46 */                    linkedList = new LinkedList();
/* 49 */                    map.put(str, linkedList);
                        }
/* 55 */                linkedList.add(wn1Var);
                    } catch (Throwable th) {
/* 61 */                throw th;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: b */
                public static final synchronized void m10006b(String str, HashMap map) {
                    boolean z;
                    try {
/* 10 */                List list = (List) f19287a.get(str);
/* 12 */                if (list != null && !list.isEmpty()) {
/* 21 */                    Iterator it = list.iterator();
/* 29 */                    while (it.hasNext()) {
/* 35 */                        wn1 wn1Var = (wn1) it.next();
                                synchronized (wn1Var) {
/* 52 */                            z = wn1Var.f18700a && wn1Var.get() != 0;
                                }
/* 54 */                        if (z) {
/* 71 */                            HashMap map2 = new HashMap(map);
/* 78 */                            tq2 tq2Var = (tq2) wn1Var.get();
/* 80 */                            if (tq2Var != null) {
/* 82 */                                tq2Var.m8862a(map2);
                                    }
                                } else {
                                    synchronized (xn1.class) {
/* 59 */                                it.remove();
                                    }
                                }
                            }
/* 88 */                    list.isEmpty();
                        }
                    } catch (Throwable th) {
/* 96 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static final synchronized void m10007c(tq2 tq2Var) {
/* 4 */             tq2Var.getClass();
/* 13 */            wn1 wn1Var = (wn1) f19288b.remove(tq2Var);
/* 15 */            if (wn1Var != null) {
                        synchronized (wn1Var) {
/* 19 */                    wn1Var.f18700a = false;
/* 21 */                    wn1Var.clear();
                        }
                    }
                }
            }
