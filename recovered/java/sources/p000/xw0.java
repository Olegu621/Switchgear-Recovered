            package p000;

            import java.io.Serializable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xw0 implements Serializable {

                /* JADX INFO: renamed from: a */
                public final Object[] f19386a;

                public xw0(Object[] objArr) {
/* 4 */             this.f19386a = objArr;
                }

                public Object readResolve() {
/* 1 */             ww0 ww0Var = zw0.f20360b;
/* 3 */             Object[] objArr = this.f19386a;
/* 6 */             if (objArr.length == 0) {
/* 8 */                 return t22.f16899e;
                    }
/* 15 */            Object[] objArr2 = (Object[]) objArr.clone();
/* 18 */            xe2.m9768f(objArr2.length, objArr2);
/* 22 */            return zw0.m10447f(objArr2.length, objArr2);
                }
            }
