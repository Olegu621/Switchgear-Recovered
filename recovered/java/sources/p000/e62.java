            package p000;

            import java.util.Iterator;
            import java.util.Map;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class e62 implements Iterable {

                /* JADX INFO: renamed from: a */
                public b62 f7556a;

                /* JADX INFO: renamed from: b */
                public b62 f7557b;

                /* JADX INFO: renamed from: c */
                public final WeakHashMap f7558c = new WeakHashMap();

                /* JADX INFO: renamed from: d */
                public int f7559d = 0;

                /* JADX INFO: renamed from: a */
                public b62 mo3333a(Object obj) {
/* 1 */             b62 b62Var = this.f7556a;
/* 3 */             while (b62Var != null && !b62Var.f2239a.equals(obj)) {
/* 14 */                b62Var = b62Var.f2241c;
                    }
/* 17 */            return b62Var;
                }

                /* JADX INFO: renamed from: b */
                public Object mo3334b(Object obj) {
/* 1 */             b62 b62VarMo3333a = mo3333a(obj);
/* 6 */             if (b62VarMo3333a == null) {
/* 5 */                 return null;
                    }
/* 13 */            this.f7559d--;
/* 15 */            WeakHashMap weakHashMap = this.f7558c;
/* 21 */            if (!weakHashMap.isEmpty()) {
/* 27 */                Iterator it = weakHashMap.keySet().iterator();
/* 35 */                while (it.hasNext()) {
/* 43 */                    ((d62) it.next()).mo84a(b62VarMo3333a);
                        }
                    }
/* 47 */            b62 b62Var = b62VarMo3333a.f2242d;
/* 49 */            b62 b62Var2 = b62VarMo3333a.f2241c;
/* 51 */            if (b62Var != null) {
/* 53 */                b62Var.f2241c = b62Var2;
                    } else {
/* 56 */                this.f7556a = b62Var2;
                    }
/* 58 */            b62 b62Var3 = b62VarMo3333a.f2241c;
/* 60 */            if (b62Var3 != null) {
/* 62 */                b62Var3.f2242d = b62Var;
                    } else {
/* 65 */                this.f7557b = b62Var;
                    }
/* 67 */            b62VarMo3333a.f2241c = null;
/* 69 */            b62VarMo3333a.f2242d = null;
/* 71 */            return b62VarMo3333a.f2240b;
                }

                public final boolean equals(Object obj) {
                    a62 a62Var;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof e62)) {
/* 7 */                 return false;
                    }
/* 11 */            e62 e62Var = (e62) obj;
/* 17 */            if (this.f7559d != e62Var.f7559d) {
/* 7 */                 return false;
                    }
/* 20 */            Iterator it = iterator();
/* 24 */            Iterator it2 = e62Var.iterator();
                    while (true) {
/* 29 */                a62Var = (a62) it;
/* 35 */                if (!a62Var.hasNext()) {
                            break;
                        }
/* 38 */                a62 a62Var2 = (a62) it2;
/* 44 */                if (!a62Var2.hasNext()) {
                            break;
                        }
/* 50 */                Map.Entry entry = (Map.Entry) a62Var.next();
/* 52 */                Object next = a62Var2.next();
/* 56 */                if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
/* 7 */                     return false;
                        }
                    }
                    return (a62Var.hasNext() || ((a62) it2).hasNext()) ? false : true;
                }

                public final int hashCode() {
/* 1 */             Iterator it = iterator();
/* 5 */             int iHashCode = 0;
                    while (true) {
/* 7 */                 a62 a62Var = (a62) it;
/* 13 */                if (!a62Var.hasNext()) {
/* 27 */                    return iHashCode;
                        }
/* 25 */                iHashCode += ((Map.Entry) a62Var.next()).hashCode();
                    }
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 8 */             a62 a62Var = new a62(this.f7556a, this.f7557b, 0);
/* 15 */            this.f7558c.put(a62Var, Boolean.FALSE);
/* 18 */            return a62Var;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("[");
/* 8 */             Iterator it = iterator();
                    while (true) {
/* 13 */                a62 a62Var = (a62) it;
/* 19 */                if (!a62Var.hasNext()) {
/* 48 */                    sb.append("]");
/* 51 */                    return sb.toString();
                        }
/* 31 */                sb.append(((Map.Entry) a62Var.next()).toString());
/* 38 */                if (a62Var.hasNext()) {
/* 42 */                    sb.append(", ");
                        }
                    }
                }
            }
