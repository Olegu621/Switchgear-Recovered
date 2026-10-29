            package p000;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class gf2 extends AbstractSet {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8585a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f8586b;

                public /* synthetic */ gf2(Object obj, int i) {
/* 1 */             this.f8585a = i;
/* 3 */             this.f8586b = obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean add(Object obj) {
/* 1 */             int i = this.f8585a;
/* 5 */             Object obj2 = this.f8586b;
                    switch (i) {
                        case 0:
/* 40 */                    Map.Entry entry = (Map.Entry) obj;
/* 46 */                    if (contains(entry)) {
/* 3 */                         return false;
                            }
/* 60 */                    ((df2) obj2).put((Comparable) entry.getKey(), entry.getValue());
/* 4 */                     return true;
                        case 1:
                        default:
/* 10 */                    return super.add(obj);
                        case 2:
/* 15 */                    Map.Entry entry2 = (Map.Entry) obj;
/* 21 */                    if (contains(entry2)) {
/* 3 */                         return false;
                            }
/* 35 */                    ((hq3) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
/* 4 */                     return true;
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
/* 1 */             int i = this.f8585a;
/* 3 */             Object obj = this.f8586b;
                    switch (i) {
                        case 0:
/* 20 */                    ((df2) obj).clear();
                            break;
                        case 1:
                        default:
/* 8 */                     super.clear();
                            break;
                        case 2:
/* 14 */                    ((hq3) obj).clear();
                            break;
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
/* 1 */             int i = this.f8585a;
/* 3 */             Object obj2 = this.f8586b;
                    switch (i) {
                        case 0:
/* 44 */                    Map.Entry entry = (Map.Entry) obj;
/* 52 */                    Object obj3 = ((df2) obj2).get(entry.getKey());
/* 56 */                    Object value = entry.getValue();
/* 60 */                    if (obj3 != value) {
                                return obj3 != null && obj3.equals(value);
                            }
/* 5 */                     return true;
                        case 1:
                        default:
/* 10 */                    return super.contains(obj);
                        case 2:
/* 15 */                    Map.Entry entry2 = (Map.Entry) obj;
/* 23 */                    Object obj4 = ((hq3) obj2).get(entry2.getKey());
/* 27 */                    Object value2 = entry2.getValue();
/* 31 */                    if (obj4 != value2) {
                                return obj4 != null && obj4.equals(value2);
                            }
/* 5 */                     return true;
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
/* 1 */             int i = this.f8585a;
/* 3 */             int i2 = 1;
/* 4 */             Object obj = this.f8586b;
                    switch (i) {
                        case 0:
/* 28 */                    return new ff2((df2) obj, 0);
                        case 1:
/* 19 */                    return new y30(this, i2);
                        default:
/* 13 */                    return new ff2((hq3) obj, i2);
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
/* 1 */             int i = this.f8585a;
/* 5 */             Object obj2 = this.f8586b;
                    switch (i) {
                        case 0:
/* 34 */                    Map.Entry entry = (Map.Entry) obj;
/* 40 */                    if (!contains(entry)) {
/* 3 */                         return false;
                            }
/* 48 */                    ((df2) obj2).remove(entry.getKey());
/* 4 */                     return true;
                        case 1:
                        default:
/* 10 */                    return super.remove(obj);
                        case 2:
/* 15 */                    Map.Entry entry2 = (Map.Entry) obj;
/* 21 */                    if (!contains(entry2)) {
/* 3 */                         return false;
                            }
/* 29 */                    ((hq3) obj2).remove(entry2.getKey());
/* 4 */                     return true;
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             int i = this.f8585a;
/* 3 */             Object obj = this.f8586b;
                    switch (i) {
                        case 0:
/* 22 */                    return ((df2) obj).size();
                        case 1:
/* 17 */                    return ((cj3) obj).f2968e;
                        default:
/* 10 */                    return ((hq3) obj).size();
                    }
                }
            }
