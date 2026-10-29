            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: renamed from: uw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C2270uw extends C2233tw {
                /* JADX INFO: renamed from: k */
                public static void m9140k(Collection collection, Iterable iterable) {
/* 1 */             collection.getClass();
/* 4 */             iterable.getClass();
/* 9 */             if (iterable instanceof Collection) {
/* 13 */                collection.addAll((Collection) iterable);
/* 16 */                return;
                    }
/* 17 */            Iterator it = iterable.iterator();
/* 25 */            while (it.hasNext()) {
/* 31 */                collection.add(it.next());
                    }
                }

                /* JADX INFO: renamed from: l */
                public static void m9141l(Collection collection, Object[] objArr) {
/* 1 */             collection.getClass();
/* 4 */             objArr.getClass();
/* 7 */             List listAsList = Arrays.asList(objArr);
/* 11 */            listAsList.getClass();
/* 14 */            collection.addAll(listAsList);
                }

                /* JADX INFO: renamed from: m */
                public static final boolean m9142m(Collection collection, Function1 function1, boolean z) {
/* 1 */             Iterator it = collection.iterator();
/* 5 */             boolean z2 = false;
/* 10 */            while (it.hasNext()) {
/* 26 */                if (((Boolean) function1.invoke(it.next())).booleanValue() == z) {
/* 28 */                    it.remove();
/* 31 */                    z2 = true;
                        }
                    }
/* 33 */            return z2;
                }

                /* JADX INFO: renamed from: n */
                public static void m9143n(ArrayList arrayList, Function1 function1) {
                    int size;
/* 1 */             arrayList.getClass();
/* 9 */             int size2 = arrayList.size() - 1;
/* 10 */            int i = 0;
/* 11 */            if (size2 >= 0) {
/* 13 */                int i2 = 0;
                        while (true) {
/* 14 */                    Object obj = arrayList.get(i);
/* 28 */                    if (!((Boolean) function1.invoke(obj)).booleanValue()) {
/* 31 */                        if (i2 != i) {
/* 33 */                            arrayList.set(i2, obj);
                                }
/* 36 */                        i2++;
                            }
/* 38 */                    if (i == size2) {
                                break;
                            } else {
/* 40 */                        i++;
                            }
                        }
/* 43 */                i = i2;
                    }
/* 48 */            if (i >= arrayList.size() || i > (size = arrayList.size() - 1)) {
/* 65 */                return;
                    }
                    while (true) {
/* 57 */                arrayList.remove(size);
/* 60 */                if (size == i) {
/* 65 */                    return;
                        } else {
/* 62 */                    size--;
                        }
                    }
                }
            }
