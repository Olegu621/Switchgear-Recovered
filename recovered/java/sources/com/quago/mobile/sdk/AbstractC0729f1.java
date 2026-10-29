            package com.quago.mobile.sdk;

            import java.util.HashMap;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.f1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 86 */    public abstract class AbstractC0729f1 {

                /* JADX INFO: renamed from: a */
                public static final C0740j0 f5436a;

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            f5436a = new C0740j0("QueryManager");
                }

                /* JADX INFO: renamed from: a */
                public static int m2567a(HashMap map, HashMap map2, C0768x c0768x, LinkedList linkedList, int i, boolean z) {
                    Integer num;
/* 11 */            C0768x c0768x2 = (C0768x) map.get(Integer.valueOf(c0768x.f5671i));
/* 13 */            if (c0768x2 != null && (((z && c0768x2.mo2579b(c0768x)) || (!z && c0768x2.mo2579b(c0768x) && c0768x2.f5494a == c0768x.f5494a)) && map2.containsKey(Integer.valueOf(c0768x.f5671i)) && (num = (Integer) map2.get(Integer.valueOf(c0768x.f5671i))) != null)) {
/* 65 */                i--;
/* 72 */                linkedList.set(num.intValue(), null);
/* 81 */                map.remove(Integer.valueOf(c0768x.f5671i));
/* 90 */                map2.remove(Integer.valueOf(c0768x.f5671i));
                    }
/* 99 */            map.put(Integer.valueOf(c0768x.f5671i), c0768x);
/* 116 */           map2.put(Integer.valueOf(c0768x.f5671i), Integer.valueOf(linkedList.size()));
/* 119 */           return i;
                }

                /* JADX INFO: renamed from: b */
                public static LinkedList m2572b(C0742k c0742k, long j, long j2, int i) {
/* 3 */             LinkedList linkedList = new LinkedList();
/* 6 */             int length = c0742k.f5507c;
/* 9 */             if (length != -1) {
/* 19 */                C0764v c0764v = new C0764v();
/* 22 */                for (int length2 = ((C0764v[]) c0742k.f5508d).length; length2 > 0; length2--) {
                            synchronized (((C0764v[]) c0742k.f5508d)[length]) {
/* 37 */                        ((C0764v[]) c0742k.f5508d)[length].mo2578a(c0764v);
                            }
/* 41 */                    long j3 = c0764v.f5494a;
/* 45 */                    if (j3 >= j && j3 <= j2 && (i == 0 || linkedList.size() < i)) {
/* 61 */                        C0764v c0764v2 = new C0764v();
/* 64 */                        c0764v.mo2578a(c0764v2);
/* 67 */                        linkedList.add(c0764v2);
                            }
/* 70 */                    length--;
/* 72 */                    if (length < 0) {
/* 79 */                        length = ((C0764v[]) c0742k.f5508d).length - 1;
                            }
                        }
                    }
/* 87 */            return linkedList;
                }

                /* JADX INFO: renamed from: b */
/* 87 */        public static void m2573b(long j, List list) {
                    if (list == null) {
                        return;
                    }
                    for (Object obj : list) {
/* 89 */                if (obj instanceof Object[]) {
/* 90 */                    Object[] objArr = (Object[]) obj;
/* 91 */                    objArr[0] = Double.valueOf(Math.max(0.0d, ((Double) objArr[0]).doubleValue() - Long.valueOf(j).doubleValue()));
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
/* 119 */       public static long m2568a(C0742k c0742k, long j, long j2, int i) {
                    Object[] objArr;
                    boolean z;
/* 120 */           int length = c0742k.f5507c;
                    long j3 = 0;
                    if (length == -1) {
                        return 0L;
                    }
                    for (int length2 = ((C0768x[]) c0742k.f5508d).length; length2 > 0; length2--) {
                        synchronized (((C0768x[]) c0742k.f5508d)[length]) {
                            try {
/* 123 */                       objArr = c0742k.f5508d;
                                z = ((C0768x[]) objArr)[length].f5494a >= j && ((C0768x[]) objArr)[length].f5494a <= j2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z) {
                            j3++;
                        }
                        if (j3 >= i) {
                            return j3;
                        }
                        length--;
                        if (length < 0) {
/* 125 */                   length = ((C0768x[]) objArr).length - 1;
                        }
                    }
                    return j3;
                }

                /* JADX INFO: renamed from: a */
/* 126 */       public static void m2570a(C0742k c0742k, List list, long j, long j2, int i) {
/* 127 */           if (c0742k == null || c0742k.f5507c == -1 || list == null) {
                        return;
                    }
/* 128 */           LinkedList linkedList = new LinkedList();
/* 129 */           int length = c0742k.f5507c;
                    AbstractC0739j[] abstractC0739jArr = (AbstractC0739j[]) c0742k.f5508d;
/* 130 */           AbstractC0739j abstractC0739jMo2577a = abstractC0739jArr[0].mo2577a();
                    AbstractC0739j abstractC0739jMo2577a2 = null;
                    for (int length2 = abstractC0739jArr.length; length2 > 0; length2--) {
                        synchronized (((AbstractC0739j[]) c0742k.f5508d)[length]) {
/* 132 */                   ((AbstractC0739j[]) c0742k.f5508d)[length].mo2578a(abstractC0739jMo2577a);
                        }
/* 134 */               long j3 = abstractC0739jMo2577a.f5494a;
/* 135 */               if (j3 != 0 && j3 >= j && j3 <= j2 && ((i == 0 || linkedList.size() < i) && (abstractC0739jMo2577a2 == null || !abstractC0739jMo2577a2.mo2579b(abstractC0739jMo2577a)))) {
/* 137 */                   abstractC0739jMo2577a2 = abstractC0739jMo2577a.mo2577a();
                            linkedList.add(abstractC0739jMo2577a2);
                        }
                        length--;
                        if (length < 0) {
/* 138 */                   length = ((AbstractC0739j[]) c0742k.f5508d).length - 1;
                        }
                    }
/* 140 */           m2571a(linkedList, list);
                }

                /* JADX INFO: renamed from: a */
/* 140 */       public static void m2571a(LinkedList linkedList, List list) {
/* 141 */           while (!linkedList.isEmpty()) {
/* 142 */               int size = linkedList.size() - 1;
/* 143 */               AbstractC0739j abstractC0739j = (AbstractC0739j) linkedList.get(size);
                        if (abstractC0739j != null) {
/* 144 */                   list.add(abstractC0739j.mo2580b());
                        }
/* 145 */               linkedList.remove(size);
                    }
                }

                /* JADX INFO: renamed from: a */
/* 145 */       public static void m2569a(long j, List list) {
                    if (list == null) {
                        return;
                    }
                    for (Object obj : list) {
/* 147 */               if (obj instanceof Object[]) {
/* 148 */                   Object[] objArr = (Object[]) obj;
/* 149 */                   objArr[0] = Double.valueOf(Math.max(0.0d, ((Double) objArr[0]).doubleValue() - Long.valueOf(j).doubleValue()));
/* 150 */                   objArr[1] = Double.valueOf(Math.max(0.0d, ((Double) objArr[1]).doubleValue() - Long.valueOf(j).doubleValue()));
                        }
                    }
                }
            }
