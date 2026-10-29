            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u22 extends zw0 {

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ v22 f17335c;

                public u22(v22 v22Var) {
/* 1 */             this.f17335c = v22Var;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 1 */             v22 v22Var = this.f17335c;
/* 5 */             yy1.m10214i(i, v22Var.f17846f);
/* 8 */             Object[] objArr = v22Var.f17845e;
/* 10 */            int i2 = i * 2;
/* 12 */            Object obj = objArr[i2];
/* 14 */            Objects.requireNonNull(obj);
/* 19 */            Object obj2 = objArr[i2 + 1];
/* 21 */            Objects.requireNonNull(obj2);
/* 26 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.f17335c.f17846f;
                }
            }
