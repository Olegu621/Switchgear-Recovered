            package p000;

            import java.io.Serializable;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ti2 implements qi2, Serializable {

                /* JADX INFO: renamed from: a */
                public final Object f17115a;

                public ti2(Object obj) {
/* 4 */             this.f17115a = obj;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof ti2)) {
/* 3 */                 return false;
                    }
/* 8 */             Object obj2 = ((ti2) obj).f17115a;
/* 10 */            Object obj3 = this.f17115a;
                    return obj3 == obj2 || obj3.equals(obj2);
                }

                @Override // p000.qi2
                public final Object get() {
/* 1 */             return this.f17115a;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f17115a});
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f17115a);
/* 15 */            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
/* 20 */            sb.append("Suppliers.ofInstance(");
/* 23 */            sb.append(strValueOf);
/* 28 */            sb.append(")");
/* 31 */            return sb.toString();
                }
            }
