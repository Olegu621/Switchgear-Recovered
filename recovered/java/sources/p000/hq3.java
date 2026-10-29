            package p000;

            import java.util.AbstractMap;
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
            public final class hq3 extends AbstractMap {

                /* JADX INFO: renamed from: a */
                public final int f9202a;

                /* JADX INFO: renamed from: b */
                public List f9203b = Collections.EMPTY_LIST;

                /* JADX INFO: renamed from: c */
                public Map f9204c;

                /* JADX INFO: renamed from: d */
                public boolean f9205d;

                /* JADX INFO: renamed from: e */
                public volatile gf2 f9206e;

                /* JADX INFO: renamed from: f */
                public Map f9207f;

                public hq3(int i) {
/* 4 */             this.f9202a = i;
/* 10 */            Map map = Collections.EMPTY_MAP;
/* 12 */            this.f9204c = map;
/* 14 */            this.f9207f = map;
                }

                /* JADX INFO: renamed from: a */
                public final Map.Entry m4265a(int i) {
/* 7 */             return (Map.Entry) this.f9203b.get(i);
                }

                /* JADX INFO: renamed from: b */
                public final Iterable m4266b() {
                    return this.f9204c.isEmpty() ? b40.f2205f : this.f9204c.entrySet();
                }

                @Override // java.util.AbstractMap, java.util.Map
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             m4270f();
/* 4 */             int iM4269e = m4269e(comparable);
/* 8 */             if (iM4269e >= 0) {
/* 18 */                return ((kq3) this.f9203b.get(iM4269e)).setValue(obj);
                    }
/* 23 */            m4270f();
/* 28 */            boolean zIsEmpty = this.f9203b.isEmpty();
/* 32 */            int i = this.f9202a;
/* 34 */            if (zIsEmpty && !(this.f9203b instanceof ArrayList)) {
/* 47 */                this.f9203b = new ArrayList(i);
                    }
/* 51 */            int i2 = -(iM4269e + 1);
/* 52 */            if (i2 >= i) {
/* 58 */                return m4271g().put(comparable, obj);
                    }
/* 69 */            if (this.f9203b.size() == i) {
/* 79 */                kq3 kq3Var = (kq3) this.f9203b.remove(i - 1);
/* 89 */                m4271g().put(kq3Var.f12986a, kq3Var.f12987b);
                    }
/* 99 */            this.f9203b.add(i2, new kq3(this, comparable, obj));
/* 102 */           return null;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final void clear() {
/* 1 */             m4270f();
/* 10 */            if (!this.f9203b.isEmpty()) {
/* 14 */                this.f9203b.clear();
                    }
/* 23 */            if (this.f9204c.isEmpty()) {
/* 30 */                return;
                    }
/* 27 */            this.f9204c.clear();
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return m4269e(comparable) >= 0 || this.f9204c.containsKey(comparable);
                }

                /* JADX INFO: renamed from: d */
                public final Object m4268d(int i) {
/* 1 */             m4270f();
/* 12 */            Object obj = ((kq3) this.f9203b.remove(i)).f12987b;
/* 20 */            if (!this.f9204c.isEmpty()) {
/* 30 */                Iterator it = m4271g().entrySet().iterator();
/* 34 */                List list = this.f9203b;
/* 42 */                Map.Entry entry = (Map.Entry) it.next();
/* 57 */                list.add(new kq3(this, (Comparable) entry.getKey(), entry.getValue()));
/* 60 */                it.remove();
                    }
/* 63 */            return obj;
                }

                /* JADX INFO: renamed from: e */
                public final int m4269e(Comparable comparable) {
/* 3 */             int size = this.f9203b.size();
/* 7 */             int i = size - 1;
/* 9 */             int i2 = 0;
/* 10 */            if (i >= 0) {
/* 22 */                int iCompareTo = comparable.compareTo(((kq3) this.f9203b.get(i)).f12986a);
/* 26 */                if (iCompareTo > 0) {
/* 30 */                    return -(size + 1);
                        }
/* 32 */                if (iCompareTo == 0) {
/* 35 */                    return i;
                        }
                    }
/* 36 */            while (i2 <= i) {
/* 40 */                int i3 = (i2 + i) / 2;
/* 52 */                int iCompareTo2 = comparable.compareTo(((kq3) this.f9203b.get(i3)).f12986a);
/* 56 */                if (iCompareTo2 < 0) {
/* 58 */                    i = i3 - 1;
                        } else {
/* 61 */                    if (iCompareTo2 <= 0) {
/* 66 */                        return i3;
                            }
/* 63 */                    i2 = i3 + 1;
                        }
                    }
/* 69 */            return -(i2 + 1);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
/* 3 */             if (this.f9206e == null) {
/* 11 */                this.f9206e = new gf2(this, 2);
                    }
/* 13 */            return this.f9206e;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof hq3)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            hq3 hq3Var = (hq3) obj;
/* 16 */            int size = size();
/* 25 */            if (size != hq3Var.size()) {
/* 24 */                return false;
                    }
/* 30 */            int size2 = this.f9203b.size();
/* 40 */            if (size2 != hq3Var.f9203b.size()) {
/* 83 */                return entrySet().equals(hq3Var.entrySet());
                    }
/* 43 */            for (int i = 0; i < size2; i++) {
/* 57 */                if (!m4265a(i).equals(hq3Var.m4265a(i))) {
/* 24 */                    return false;
                        }
                    }
/* 63 */            if (size2 != size) {
/* 69 */                return this.f9204c.equals(hq3Var.f9204c);
                    }
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: f */
                public final void m4270f() {
/* 3 */             if (this.f9205d) {
/* 6 */                 f42.m3660p();
                    }
                }

                /* JADX INFO: renamed from: g */
                public final SortedMap m4271g() {
/* 1 */             m4270f();
/* 10 */            if (this.f9204c.isEmpty() && !(this.f9204c instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.f9204c = treeMap;
/* 29 */                this.f9207f = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.f9204c;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iM4269e = m4269e(comparable);
                    return iM4269e >= 0 ? ((kq3) this.f9203b.get(iM4269e)).f12987b : this.f9204c.get(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 3 */             int size = this.f9203b.size();
/* 8 */             int iHashCode = 0;
/* 9 */             for (int i = 0; i < size; i++) {
/* 23 */                iHashCode += ((kq3) this.f9203b.get(i)).hashCode();
                    }
                    return this.f9204c.size() > 0 ? this.f9204c.hashCode() + iHashCode : iHashCode;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Object remove(Object obj) {
/* 1 */             m4270f();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iM4269e = m4269e(comparable);
/* 10 */            if (iM4269e >= 0) {
/* 12 */                return m4268d(iM4269e);
                    }
/* 23 */            if (this.f9204c.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.f9204c.remove(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int size() {
/* 13 */            return this.f9204c.size() + this.f9203b.size();
                }
            }
