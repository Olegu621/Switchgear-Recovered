            package p000;

            import java.util.AbstractMap;
            import java.util.AbstractSet;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.TreeMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class df2 extends AbstractMap {

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ int f7160f = 0;

                /* JADX INFO: renamed from: a */
                public List f7161a;

                /* JADX INFO: renamed from: b */
                public Map f7162b;

                /* JADX INFO: renamed from: c */
                public boolean f7163c;

                /* JADX INFO: renamed from: d */
                public volatile gf2 f7164d;

                /* JADX INFO: renamed from: e */
                public Map f7165e;

                /* JADX INFO: renamed from: f */
                public static df2 m3047f() {
/* 3 */             df2 df2Var = new df2();
/* 8 */             df2Var.f7161a = Collections.EMPTY_LIST;
/* 10 */            Map map = Collections.EMPTY_MAP;
/* 12 */            df2Var.f7162b = map;
/* 14 */            df2Var.f7165e = map;
/* 16 */            return df2Var;
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0024  */
                /* JADX WARN: Code duplicated, block: B:17:0x003e  */
                /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
                /* JADX INFO: renamed from: a */
                public final int m3048a(Comparable comparable) {
                    int i;
                    int i2;
                    int i3;
                    int iCompareTo;
/* 3 */             int size = this.f7161a.size();
/* 7 */             int i4 = size - 1;
/* 9 */             if (i4 < 0) {
/* 34 */                i = 0;
/* 35 */                while (i <= i4) {
/* 39 */                    i3 = (i + i4) / 2;
/* 51 */                    iCompareTo = comparable.compareTo(((ef2) this.f7161a.get(i3)).f7671a);
/* 55 */                    if (iCompareTo < 0) {
/* 57 */                        i4 = i3 - 1;
                            } else {
/* 61 */                        if (iCompareTo > 0) {
/* 67 */                            return i3;
                                }
/* 63 */                        i = i3 + 1;
                            }
                        }
/* 68 */                i2 = i + 1;
                    } else {
/* 21 */                int iCompareTo2 = comparable.compareTo(((ef2) this.f7161a.get(i4)).f7671a);
/* 25 */                if (iCompareTo2 > 0) {
/* 27 */                    i2 = size + 1;
                        } else {
/* 31 */                    if (iCompareTo2 == 0) {
/* 33 */                        return i4;
                            }
/* 34 */                    i = 0;
/* 35 */                    while (i <= i4) {
/* 39 */                        i3 = (i + i4) / 2;
/* 51 */                        iCompareTo = comparable.compareTo(((ef2) this.f7161a.get(i3)).f7671a);
/* 55 */                        if (iCompareTo < 0) {
/* 57 */                            i4 = i3 - 1;
                                } else {
/* 61 */                            if (iCompareTo > 0) {
/* 67 */                                return i3;
                                    }
/* 63 */                            i = i3 + 1;
                                }
                            }
/* 68 */                    i2 = i + 1;
                        }
                    }
/* 29 */            return -i2;
                }

                /* JADX INFO: renamed from: b */
                public final void m3049b() {
/* 3 */             if (this.f7163c) {
/* 6 */                 f42.m3660p();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final Map.Entry m3050c(int i) {
/* 7 */             return (Map.Entry) this.f7161a.get(i);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final void clear() {
/* 1 */             m3049b();
/* 10 */            if (!this.f7161a.isEmpty()) {
/* 14 */                this.f7161a.clear();
                    }
/* 23 */            if (this.f7162b.isEmpty()) {
/* 30 */                return;
                    }
/* 27 */            this.f7162b.clear();
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return m3048a(comparable) >= 0 || this.f7162b.containsKey(comparable);
                }

                /* JADX INFO: renamed from: d */
                public final Set m3051d() {
                    return this.f7162b.isEmpty() ? Collections.EMPTY_SET : this.f7162b.entrySet();
                }

                /* JADX INFO: renamed from: e */
                public final SortedMap m3052e() {
/* 1 */             m3049b();
/* 10 */            if (this.f7162b.isEmpty() && !(this.f7162b instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.f7162b = treeMap;
/* 29 */                this.f7165e = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.f7162b;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
/* 3 */             if (this.f7164d == null) {
/* 11 */                this.f7164d = new gf2(this, 0);
                    }
/* 13 */            return this.f7164d;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 88 */                return true;
                    }
/* 6 */             if (!(obj instanceof df2)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            df2 df2Var = (df2) obj;
/* 15 */            int size = size();
/* 24 */            if (size == df2Var.size()) {
/* 29 */                int size2 = this.f7161a.size();
/* 39 */                if (size2 != df2Var.f7161a.size()) {
/* 51 */                    return ((AbstractSet) entrySet()).equals(df2Var.entrySet());
                        }
/* 57 */                for (int i = 0; i < size2; i++) {
/* 71 */                    if (m3050c(i).equals(df2Var.m3050c(i))) {
                            }
                        }
/* 77 */                if (size2 != size) {
/* 83 */                    return this.f7162b.equals(df2Var.f7162b);
                        }
/* 88 */                return true;
                    }
/* 23 */            return false;
                }

                @Override // java.util.AbstractMap, java.util.Map
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             m3049b();
/* 4 */             int iM3048a = m3048a(comparable);
/* 8 */             if (iM3048a >= 0) {
/* 18 */                return ((ef2) this.f7161a.get(iM3048a)).setValue(obj);
                    }
/* 23 */            m3049b();
/* 34 */            if (this.f7161a.isEmpty() && !(this.f7161a instanceof ArrayList)) {
/* 47 */                this.f7161a = new ArrayList(16);
                    }
/* 51 */            int i = -(iM3048a + 1);
/* 52 */            if (i >= 16) {
/* 58 */                return m3052e().put(comparable, obj);
                    }
/* 69 */            if (this.f7161a.size() == 16) {
/* 79 */                ef2 ef2Var = (ef2) this.f7161a.remove(15);
/* 89 */                m3052e().put(ef2Var.f7671a, ef2Var.f7672b);
                    }
/* 99 */            this.f7161a.add(i, new ef2(this, comparable, obj));
/* 102 */           return null;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iM3048a = m3048a(comparable);
                    return iM3048a >= 0 ? ((ef2) this.f7161a.get(iM3048a)).f7672b : this.f7162b.get(comparable);
                }

                /* JADX INFO: renamed from: h */
                public final Object m3054h(int i) {
/* 1 */             m3049b();
/* 12 */            Object obj = ((ef2) this.f7161a.remove(i)).f7672b;
/* 20 */            if (!this.f7162b.isEmpty()) {
/* 30 */                Iterator it = m3052e().entrySet().iterator();
/* 34 */                List list = this.f7161a;
/* 42 */                Map.Entry entry = (Map.Entry) it.next();
/* 57 */                list.add(new ef2(this, (Comparable) entry.getKey(), entry.getValue()));
/* 60 */                it.remove();
                    }
/* 63 */            return obj;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 3 */             int size = this.f7161a.size();
/* 8 */             int iHashCode = 0;
/* 9 */             for (int i = 0; i < size; i++) {
/* 23 */                iHashCode += ((ef2) this.f7161a.get(i)).hashCode();
                    }
                    return this.f7162b.size() > 0 ? this.f7162b.hashCode() + iHashCode : iHashCode;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Object remove(Object obj) {
/* 1 */             m3049b();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iM3048a = m3048a(comparable);
/* 10 */            if (iM3048a >= 0) {
/* 12 */                return m3054h(iM3048a);
                    }
/* 23 */            if (this.f7162b.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.f7162b.remove(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int size() {
/* 13 */            return this.f7162b.size() + this.f7161a.size();
                }
            }
