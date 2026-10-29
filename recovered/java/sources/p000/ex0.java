            package p000;

            import java.io.Serializable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ex0 implements Serializable {

                /* JADX INFO: renamed from: a */
                public final Object[] f7912a;

                public ex0(Object[] objArr) {
/* 4 */             this.f7912a = objArr;
                }

                public Object readResolve() {
/* 1 */             Object[] objArr = this.f7912a;
/* 3 */             int length = objArr.length;
/* 4 */             if (length != 0) {
                        return length != 1 ? fx0.m3851h(objArr.length, (Object[]) objArr.clone()) : new re2(objArr[0]);
                    }
/* 30 */            return z22.f19912U;
                }
            }
