            package p000;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class dx0 implements Map, Serializable {

                /* JADX INFO: renamed from: a */
                public transient v22 f7437a;

                /* JADX INFO: renamed from: b */
                public transient w22 f7438b;

                /* JADX INFO: renamed from: c */
                public transient x22 f7439c;

                @Override // java.util.Map
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final fx0 entrySet() {
/* 1 */             v22 v22Var = this.f7437a;
/* 3 */             if (v22Var != null) {
/* 20 */                return v22Var;
                    }
/* 6 */             y22 y22Var = (y22) this;
/* 14 */            v22 v22Var2 = new v22(y22Var, y22Var.f19461e, y22Var.f19462f);
/* 17 */            this.f7437a = v22Var2;
/* 19 */            return v22Var2;
                }

                @Override // java.util.Map
                public final void clear() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Map
                public final boolean containsKey(Object obj) {
                    return get(obj) != null;
                }

                @Override // java.util.Map
                public final boolean containsValue(Object obj) {
/* 1 */             x22 x22Var = this.f7439c;
/* 3 */             if (x22Var == null) {
/* 6 */                 y22 y22Var = (y22) this;
/* 15 */                x22 x22Var2 = new x22(y22Var.f19461e, 1, y22Var.f19462f);
/* 18 */                this.f7439c = x22Var2;
/* 20 */                x22Var = x22Var2;
                    }
/* 21 */            return x22Var.contains(obj);
                }

                @Override // java.util.Map
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof Map) {
/* 19 */                return entrySet().equals(((Map) obj).entrySet());
                    }
/* 24 */            return false;
                }

                @Override // java.util.Map
                public abstract Object get(Object obj);

                @Override // java.util.Map
                public final Object getOrDefault(Object obj, Object obj2) {
/* 1 */             Object obj3 = get(obj);
                    return obj3 != null ? obj3 : obj2;
                }

                @Override // java.util.Map
                public final int hashCode() {
/* 5 */             Iterator it = entrySet().iterator();
/* 10 */            int i = 0;
/* 15 */            while (it.hasNext()) {
/* 17 */                Object next = it.next();
/* 31 */                i = ~(~(i + (next != null ? next.hashCode() : 0)));
                    }
/* 33 */            return i;
                }

                @Override // java.util.Map
                public final boolean isEmpty() {
                    return ((y22) this).size() == 0;
                }

                @Override // java.util.Map
                public final Set keySet() {
/* 1 */             w22 w22Var = this.f7438b;
/* 3 */             if (w22Var != null) {
/* 26 */                return w22Var;
                    }
/* 6 */             y22 y22Var = (y22) this;
/* 20 */            w22 w22Var2 = new w22(y22Var, new x22(y22Var.f19461e, 0, y22Var.f19462f));
/* 23 */            this.f7438b = w22Var2;
/* 25 */            return w22Var2;
                }

                @Override // java.util.Map
                public final Object put(Object obj, Object obj2) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Map
                public final void putAll(Map map) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Map
                public final Object remove(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                public final String toString() {
/* 6 */             int i = ((y22) this).f19462f;
/* 8 */             kb1.m6057j(i, "size");
/* 25 */            StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
/* 30 */            sb.append('{');
/* 39 */            wx2 it = ((v22) entrySet()).iterator();
/* 43 */            boolean z = true;
                    while (true) {
/* 45 */                ww0 ww0Var = (ww0) it;
/* 51 */                if (!ww0Var.hasNext()) {
/* 89 */                    sb.append('}');
/* 92 */                    return sb.toString();
                        }
/* 57 */                Map.Entry entry = (Map.Entry) ww0Var.next();
/* 59 */                if (!z) {
/* 63 */                    sb.append(", ");
                        }
/* 70 */                sb.append(entry.getKey());
/* 75 */                sb.append('=');
/* 82 */                sb.append(entry.getValue());
/* 85 */                z = false;
                    }
                }

                @Override // java.util.Map
                public final Collection values() {
/* 1 */             x22 x22Var = this.f7439c;
/* 3 */             if (x22Var != null) {
/* 21 */                return x22Var;
                    }
/* 6 */             y22 y22Var = (y22) this;
/* 15 */            x22 x22Var2 = new x22(y22Var.f19461e, 1, y22Var.f19462f);
/* 18 */            this.f7439c = x22Var2;
/* 20 */            return x22Var2;
                }

                public Object writeReplace() {
/* 3 */             return new cx0(this);
                }
            }
