            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ef2 implements Map.Entry, Comparable {

                /* JADX INFO: renamed from: a */
                public final Comparable f7671a;

                /* JADX INFO: renamed from: b */
                public Object f7672b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ df2 f7673c;

                public ef2(df2 df2Var, Comparable comparable, Object obj) {
/* 4 */             this.f7673c = df2Var;
/* 6 */             this.f7671a = comparable;
/* 8 */             this.f7672b = obj;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             return this.f7671a.compareTo(((ef2) obj).f7671a);
                }

                @Override // java.util.Map.Entry
                public final boolean equals(Object obj) {
                    boolean zEquals;
                    boolean zEquals2;
/* 2 */             if (obj != this) {
/* 8 */                 if (obj instanceof Map.Entry) {
/* 11 */                    Map.Entry entry = (Map.Entry) obj;
/* 13 */                    Object key = entry.getKey();
/* 17 */                    Comparable comparable = this.f7671a;
/* 19 */                    if (comparable == null) {
/* 25 */                        zEquals = key == null;
                            } else {
/* 27 */                        zEquals = comparable.equals(key);
                            }
/* 31 */                    if (zEquals) {
/* 33 */                        Object obj2 = this.f7672b;
/* 35 */                        Object value = entry.getValue();
/* 39 */                        if (obj2 == null) {
/* 45 */                            zEquals2 = value == null;
                                } else {
/* 47 */                            zEquals2 = obj2.equals(value);
                                }
/* 51 */                        if (zEquals2) {
                                }
                            }
                        }
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                @Override // java.util.Map.Entry
                public final Object getKey() {
/* 1 */             return this.f7671a;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 1 */             return this.f7672b;
                }

                @Override // java.util.Map.Entry
                public final int hashCode() {
/* 2 */             Comparable comparable = this.f7671a;
/* 8 */             int iHashCode = comparable == null ? 0 : comparable.hashCode();
/* 12 */            Object obj = this.f7672b;
/* 21 */            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 3 */             this.f7673c.m3049b();
/* 6 */             Object obj2 = this.f7672b;
/* 8 */             this.f7672b = obj;
/* 10 */            return obj2;
                }

                public final String toString() {
/* 21 */            return this.f7671a + "=" + this.f7672b;
                }
            }
