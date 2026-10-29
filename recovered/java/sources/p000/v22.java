            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v22 extends fx0 {

                /* JADX INFO: renamed from: d */
                public final transient dx0 f17844d;

                /* JADX INFO: renamed from: e */
                public final transient Object[] f17845e;

                /* JADX INFO: renamed from: f */
                public final transient int f17846f;

                public v22(dx0 dx0Var, Object[] objArr, int i) {
/* 4 */             this.f17844d = dx0Var;
/* 6 */             this.f17845e = objArr;
/* 8 */             this.f17846f = i;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: a */
                public final int mo8149a(Object[] objArr) {
/* 5 */             return mo3852f().mo8149a(objArr);
                }

                @Override // p000.vw0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 4 */             if (obj instanceof Map.Entry) {
/* 6 */                 Map.Entry entry = (Map.Entry) obj;
/* 8 */                 Object key = entry.getKey();
/* 12 */                Object value = entry.getValue();
/* 16 */                if (value != null && value.equals(this.f17844d.get(key))) {
/* 30 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: e */
                public final wx2 iterator() {
/* 6 */             return mo3852f().listIterator(0);
                }

                @Override // p000.fx0
                /* JADX INFO: renamed from: i */
                public final zw0 mo3853i() {
/* 3 */             return new u22(this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return this.f17846f;
                }
            }
