            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class re2 extends fx0 {

                /* JADX INFO: renamed from: d */
                public final transient Object f16028d;

                public re2(Object obj) {
/* 4 */             obj.getClass();
/* 7 */             this.f16028d = obj;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: a */
                public final int mo8149a(Object[] objArr) {
/* 4 */             objArr[0] = this.f16028d;
/* 6 */             return 1;
                }

                @Override // p000.vw0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 3 */             return this.f16028d.equals(obj);
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: e */
                public final wx2 iterator() {
/* 5 */             return new yz0(this.f16028d);
                }

                @Override // p000.fx0, java.util.Collection, java.util.Set
                public final int hashCode() {
/* 3 */             return this.f16028d.hashCode();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return 1;
                }

                @Override // java.util.AbstractCollection
                public final String toString() {
/* 3 */             String string = this.f16028d.toString();
/* 19 */            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
/* 24 */            sb.append('[');
/* 27 */            sb.append(string);
/* 32 */            sb.append(']');
/* 35 */            return sb.toString();
                }
            }
