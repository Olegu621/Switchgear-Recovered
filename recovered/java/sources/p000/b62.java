            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b62 implements Map.Entry {

                /* JADX INFO: renamed from: a */
                public final Object f2239a;

                /* JADX INFO: renamed from: b */
                public final Object f2240b;

                /* JADX INFO: renamed from: c */
                public b62 f2241c;

                /* JADX INFO: renamed from: d */
                public b62 f2242d;

                public b62(Object obj, Object obj2) {
/* 4 */             this.f2239a = obj;
/* 6 */             this.f2240b = obj2;
                }

                @Override // java.util.Map.Entry
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof b62)) {
/* 7 */                 return false;
                    }
/* 11 */            b62 b62Var = (b62) obj;
                    return this.f2239a.equals(b62Var.f2239a) && this.f2240b.equals(b62Var.f2240b);
                }

                @Override // java.util.Map.Entry
                public final Object getKey() {
/* 1 */             return this.f2239a;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 1 */             return this.f2240b;
                }

                @Override // java.util.Map.Entry
                public final int hashCode() {
/* 13 */            return this.f2240b.hashCode() ^ this.f2239a.hashCode();
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 8 */             throw new UnsupportedOperationException("An entry modification is not supported");
                }

                public final String toString() {
/* 21 */            return this.f2239a + "=" + this.f2240b;
                }
            }
