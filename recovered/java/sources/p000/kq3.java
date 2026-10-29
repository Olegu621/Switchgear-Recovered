            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kq3 implements Map.Entry, Comparable {

                /* JADX INFO: renamed from: a */
                public final Comparable f12986a;

                /* JADX INFO: renamed from: b */
                public Object f12987b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ hq3 f12988c;

                public kq3(hq3 hq3Var, Comparable comparable, Object obj) {
/* 4 */             this.f12988c = hq3Var;
/* 6 */             this.f12986a = comparable;
/* 8 */             this.f12987b = obj;
                }

                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
/* 7 */             return this.f12986a.compareTo(((kq3) obj).f12986a);
                }

                @Override // java.util.Map.Entry
                public final boolean equals(Object obj) {
                    boolean zEquals;
                    boolean zEquals2;
/* 2 */             if (obj != this) {
/* 8 */                 if (obj instanceof Map.Entry) {
/* 11 */                    Map.Entry entry = (Map.Entry) obj;
/* 13 */                    Object key = entry.getKey();
/* 17 */                    Comparable comparable = this.f12986a;
/* 19 */                    if (comparable == null) {
/* 25 */                        zEquals = key == null;
                            } else {
/* 27 */                        zEquals = comparable.equals(key);
                            }
/* 31 */                    if (zEquals) {
/* 33 */                        Object obj2 = this.f12987b;
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
                public final /* synthetic */ Object getKey() {
/* 1 */             return this.f12986a;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 1 */             return this.f12987b;
                }

                @Override // java.util.Map.Entry
                public final int hashCode() {
/* 2 */             Comparable comparable = this.f12986a;
/* 8 */             int iHashCode = comparable == null ? 0 : comparable.hashCode();
/* 12 */            Object obj = this.f12987b;
/* 21 */            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 3 */             this.f12988c.m4270f();
/* 6 */             Object obj2 = this.f12987b;
/* 8 */             this.f12987b = obj;
/* 10 */            return obj2;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f12986a);
/* 9 */             String strValueOf2 = String.valueOf(this.f12987b);
/* 31 */            return fm0.m3790p(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
                }
            }
