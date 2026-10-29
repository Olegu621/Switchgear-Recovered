            package kotlin.collections;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.NoSuchElementException;
            import java.util.RandomAccess;
            import java.util.Set;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C2085pw;
            import p000.C2122qw;
            import p000.C2270uw;
            import p000.ds0;
            import p000.nc1;
            import p000.nd0;
            import p000.qd0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"kotlin/collections/a", "pw", "qw", "rw", "sw", "tw", "uw", "vw", "ww", "kotlin/collections/CollectionsKt___CollectionsKt"}, m6176d2 = {}, m6177k = 4, m6178mv = {2, 2, 0}, m6180xi = 49)
            public final class CollectionsKt extends CollectionsKt___CollectionsKt {
                /* JADX INFO: renamed from: A */
                public static Comparable m6182A(LinkedHashSet linkedHashSet) {
/* 1 */             linkedHashSet.getClass();
/* 4 */             Iterator it = linkedHashSet.iterator();
/* 12 */            if (!it.hasNext()) {
/* 14 */                return null;
                    }
/* 20 */            Comparable comparable = (Comparable) it.next();
/* 26 */            while (it.hasNext()) {
/* 32 */                Comparable comparable2 = (Comparable) it.next();
/* 38 */                if (comparable.compareTo(comparable2) < 0) {
/* 40 */                    comparable = comparable2;
                        }
                    }
/* 42 */            return comparable;
                }

                /* JADX INFO: renamed from: B */
                public static ArrayList m6183B(Collection collection, Iterable iterable) {
/* 1 */             collection.getClass();
/* 4 */             iterable.getClass();
/* 9 */             if (!(iterable instanceof Collection)) {
/* 36 */                ArrayList arrayList = new ArrayList(collection);
/* 39 */                C2270uw.m9140k(arrayList, iterable);
/* 42 */                return arrayList;
                    }
/* 17 */            Collection collection2 = (Collection) iterable;
/* 24 */            ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
/* 27 */            arrayList2.addAll(collection);
/* 30 */            arrayList2.addAll(collection2);
/* 33 */            return arrayList2;
                }

                /* JADX INFO: renamed from: C */
                public static List m6184C(List list) {
/* 1 */             list.getClass();
/* 9 */             if (list.size() <= 1) {
/* 11 */                return m6192K(list);
                    }
/* 16 */            List listM6208q = CollectionsKt___CollectionsKt.m6208q(list);
/* 20 */            Collections.reverse(listM6208q);
/* 23 */            return listM6208q;
                }

                /* JADX INFO: renamed from: D */
                public static List m6185D(List list) {
/* 1 */             list.getClass();
/* 9 */             if (list.size() <= 1) {
/* 11 */                return m6192K(list);
                    }
/* 19 */            Object[] array = list.toArray(new Comparable[0]);
/* 24 */            Comparable[] comparableArr = (Comparable[]) array;
/* 26 */            comparableArr.getClass();
/* 30 */            if (comparableArr.length > 1) {
/* 32 */                Arrays.sort(comparableArr);
                    }
/* 35 */            array.getClass();
/* 38 */            List listAsList = Arrays.asList(array);
/* 42 */            listAsList.getClass();
/* 45 */            return listAsList;
                }

                /* JADX INFO: renamed from: E */
                public static List m6186E(Comparator comparator, Iterable iterable) {
/* 1 */             iterable.getClass();
/* 7 */             if (!(iterable instanceof Collection)) {
/* 47 */                List listM6208q = CollectionsKt___CollectionsKt.m6208q(iterable);
/* 58 */                if (((ArrayList) listM6208q).size() > 1) {
/* 60 */                    Collections.sort(listM6208q, comparator);
                        }
/* 63 */                return listM6208q;
                    }
/* 10 */            Collection collection = (Collection) iterable;
/* 16 */            if (collection.size() <= 1) {
/* 18 */                return m6192K(iterable);
                    }
/* 26 */            Object[] array = collection.toArray(new Object[0]);
/* 30 */            array.getClass();
/* 34 */            if (array.length > 1) {
/* 36 */                Arrays.sort(array, comparator);
                    }
/* 39 */            List listAsList = Arrays.asList(array);
/* 43 */            listAsList.getClass();
/* 46 */            return listAsList;
                }

                /* JADX INFO: renamed from: F */
                public static List m6187F(int i, List list) {
/* 1 */             list.getClass();
/* 4 */             if (i < 0) {
/* 73 */                ds0.m3200q(AbstractC0886en.m3505i(i, "Requested element count ", " is less than zero."));
/* 76 */                return null;
                    }
/* 6 */             if (i == 0) {
/* 8 */                 return nd0.f14189a;
                    }
/* 15 */            if (i >= list.size()) {
/* 17 */                return m6192K(list);
                    }
/* 23 */            if (i == 1) {
/* 29 */                return C1839a.m6210b(m6199t(list));
                    }
/* 36 */            ArrayList arrayList = new ArrayList(i);
/* 39 */            Iterator it = list.iterator();
/* 43 */            int i2 = 0;
/* 48 */            while (it.hasNext()) {
/* 54 */                arrayList.add(it.next());
/* 57 */                i2++;
/* 58 */                if (i2 == i) {
                            break;
                        }
                    }
/* 60 */            return C2085pw.m7567f(arrayList);
                }

                /* JADX INFO: renamed from: G */
                public static List m6188G(List list) {
/* 1 */             list.getClass();
/* 4 */             int size = list.size();
/* 9 */             if (3 >= size) {
/* 11 */                return m6192K(list);
                    }
/* 18 */            ArrayList arrayList = new ArrayList(3);
/* 23 */            if (list instanceof RandomAccess) {
/* 27 */                for (int i = size - 3; i < size; i++) {
/* 33 */                    arrayList.add(list.get(i));
                        }
                    } else {
/* 40 */                ListIterator listIterator = list.listIterator(size - 3);
/* 48 */                while (listIterator.hasNext()) {
/* 54 */                    arrayList.add(listIterator.next());
                        }
                    }
/* 58 */            return arrayList;
                }

                /* JADX INFO: renamed from: H */
                public static byte[] m6189H(ArrayList arrayList) {
/* 5 */             byte[] bArr = new byte[arrayList.size()];
/* 7 */             Iterator it = arrayList.iterator();
/* 11 */            int i = 0;
/* 16 */            while (it.hasNext()) {
/* 30 */                bArr[i] = ((Number) it.next()).byteValue();
/* 28 */                i++;
                    }
/* 34 */            return bArr;
                }

                /* JADX INFO: renamed from: I */
                public static HashSet m6190I(AbstractCollection abstractCollection) {
/* 1 */             abstractCollection.getClass();
/* 16 */            HashSet hashSet = new HashSet(nc1.m6962c(C2122qw.m8020h(abstractCollection, 12)));
/* 19 */            CollectionsKt___CollectionsKt.m6207p(abstractCollection, hashSet);
/* 22 */            return hashSet;
                }

                /* JADX INFO: renamed from: J */
                public static int[] m6191J(List list) {
/* 1 */             list.getClass();
/* 8 */             int[] iArr = new int[list.size()];
/* 10 */            Iterator it = list.iterator();
/* 14 */            int i = 0;
/* 19 */            while (it.hasNext()) {
/* 33 */                iArr[i] = ((Number) it.next()).intValue();
/* 31 */                i++;
                    }
/* 37 */            return iArr;
                }

                /* JADX INFO: renamed from: K */
                public static List m6192K(Iterable iterable) {
/* 1 */             iterable.getClass();
/* 6 */             if (!(iterable instanceof Collection)) {
/* 58 */                return C2085pw.m7567f(CollectionsKt___CollectionsKt.m6208q(iterable));
                    }
/* 9 */             Collection collection = (Collection) iterable;
/* 11 */            int size = collection.size();
/* 15 */            if (size == 0) {
/* 51 */                return nd0.f14189a;
                    }
/* 18 */            if (size != 1) {
/* 22 */                return new ArrayList(collection);
                    }
/* 46 */            return C1839a.m6210b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }

                /* JADX INFO: renamed from: L */
                public static long[] m6193L(List list) {
/* 1 */             list.getClass();
/* 8 */             long[] jArr = new long[list.size()];
/* 10 */            Iterator it = list.iterator();
/* 14 */            int i = 0;
/* 19 */            while (it.hasNext()) {
/* 33 */                jArr[i] = ((Number) it.next()).longValue();
/* 31 */                i++;
                    }
/* 37 */            return jArr;
                }

                /* JADX INFO: renamed from: M */
                public static ArrayList m6194M(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             return new ArrayList(collection);
                }

                /* JADX INFO: renamed from: N */
                public static Set m6195N(Iterable iterable) {
/* 1 */             iterable.getClass();
/* 7 */             if (!(iterable instanceof Collection)) {
/* 70 */                LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 73 */                CollectionsKt___CollectionsKt.m6207p(iterable, linkedHashSet);
/* 76 */                int size = linkedHashSet.size();
/* 80 */                if (size == 0) {
/* 101 */                   return qd0.f15493a;
                        }
/* 82 */                if (size != 1) {
/* 84 */                    return linkedHashSet;
                        }
/* 93 */                Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
/* 97 */                setSingleton.getClass();
/* 100 */               return setSingleton;
                    }
/* 10 */            Collection collection = (Collection) iterable;
/* 12 */            int size2 = collection.size();
/* 16 */            if (size2 == 0) {
/* 65 */                return qd0.f15493a;
                    }
/* 18 */            if (size2 != 1) {
/* 30 */                LinkedHashSet linkedHashSet2 = new LinkedHashSet(nc1.m6962c(collection.size()));
/* 33 */                CollectionsKt___CollectionsKt.m6207p(iterable, linkedHashSet2);
/* 36 */                return linkedHashSet2;
                    }
/* 57 */            Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
/* 61 */            setSingleton2.getClass();
/* 64 */            return setSingleton2;
                }

                /* JADX INFO: renamed from: O */
                public static ArrayList m6196O(List list, List list2) {
/* 1 */             list.getClass();
/* 4 */             list2.getClass();
/* 7 */             Iterator it = list.iterator();
/* 11 */            Iterator it2 = list2.iterator();
/* 31 */            ArrayList arrayList = new ArrayList(Math.min(C2122qw.m8020h(list, 10), C2122qw.m8020h(list2, 10)));
/* 38 */            while (it.hasNext() && it2.hasNext()) {
/* 59 */                arrayList.add(new Pair(it.next(), it2.next()));
                    }
/* 63 */            return arrayList;
                }

                /* JADX INFO: renamed from: r */
                public static boolean m6197r(Iterable iterable, Serializable serializable) {
                    int iIndexOf;
/* 1 */             iterable.getClass();
/* 6 */             if (iterable instanceof Collection) {
/* 10 */                return ((Collection) iterable).contains(serializable);
                    }
/* 18 */            if (iterable instanceof List) {
/* 22 */                iIndexOf = ((List) iterable).indexOf(serializable);
                    } else {
/* 31 */                int i = 0;
/* 36 */                for (Object obj : iterable) {
/* 42 */                    if (i < 0) {
/* 55 */                        C2085pw.m7568g();
/* 59 */                        throw null;
                            }
/* 48 */                    if (Intrinsics.m6216a(serializable, obj)) {
/* 50 */                        iIndexOf = i;
                            } else {
/* 52 */                        i++;
                            }
                        }
/* 60 */                iIndexOf = -1;
                    }
                    return iIndexOf >= 0;
                }

                /* JADX INFO: renamed from: s */
                public static List m6198s(int i, List list) {
/* 1 */             list.getClass();
/* 4 */             if (i < 0) {
/* 87 */                ds0.m3200q(AbstractC0886en.m3505i(i, "Requested element count ", " is less than zero."));
/* 90 */                return null;
                    }
/* 6 */             if (i == 0) {
/* 8 */                 return m6192K(list);
                    }
/* 17 */            int size = list.size() - i;
/* 18 */            if (size <= 0) {
/* 20 */                return nd0.f14189a;
                    }
/* 24 */            if (size == 1) {
/* 30 */                return C1839a.m6210b(m6204y(list));
                    }
/* 37 */            ArrayList arrayList = new ArrayList(size);
/* 42 */            if (list instanceof RandomAccess) {
/* 44 */                int size2 = list.size();
/* 48 */                while (i < size2) {
/* 54 */                    arrayList.add(list.get(i));
/* 57 */                    i++;
                        }
                    } else {
/* 60 */                ListIterator listIterator = list.listIterator(i);
/* 68 */                while (listIterator.hasNext()) {
/* 74 */                    arrayList.add(listIterator.next());
                        }
                    }
/* 78 */            return arrayList;
                }

                /* JADX INFO: renamed from: t */
                public static Object m6199t(Iterable iterable) {
/* 1 */             iterable.getClass();
/* 6 */             if (iterable instanceof List) {
/* 10 */                return m6200u((List) iterable);
                    }
/* 15 */            Iterator it = iterable.iterator();
/* 23 */            if (it.hasNext()) {
/* 25 */                return it.next();
                    }
/* 37 */            throw new NoSuchElementException("Collection is empty.");
                }

                /* JADX INFO: renamed from: u */
                public static Object m6200u(List list) {
/* 1 */             list.getClass();
/* 8 */             if (list.isEmpty()) {
/* 23 */                throw new NoSuchElementException("List is empty.");
                    }
/* 11 */            return list.get(0);
                }

                /* JADX INFO: renamed from: v */
                public static Object m6201v(int i, List list) {
/* 1 */             list.getClass();
/* 4 */             if (i < 0 || i >= list.size()) {
/* 17 */                return null;
                    }
/* 12 */            return list.get(i);
                }

                /* JADX INFO: renamed from: x */
                public static String m6203x(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = ", ";
                    }
/* 7 */             String str4 = str;
/* 16 */            String str5 = (i & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
/* 23 */            String str6 = (i & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
/* 26 */            if ((i & 32) != 0) {
/* 28 */                function1 = null;
                    }
/* 30 */            iterable.getClass();
/* 35 */            StringBuilder sb = new StringBuilder();
/* 41 */            CollectionsKt___CollectionsKt.m6206o(iterable, sb, str4, str5, str6, "...", function1);
/* 44 */            return sb.toString();
                }

                /* JADX INFO: renamed from: y */
                public static Object m6204y(List list) {
/* 1 */             list.getClass();
/* 8 */             if (list.isEmpty()) {
/* 28 */                throw new NoSuchElementException("List is empty.");
                    }
/* 16 */            return list.get(list.size() - 1);
                }

                /* JADX INFO: renamed from: z */
                public static Object m6205z(List list) {
/* 1 */             list.getClass();
/* 8 */             if (list.isEmpty()) {
/* 10 */                return null;
                    }
/* 18 */            return list.get(list.size() - 1);
                }
            }
