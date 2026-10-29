            package p000;

            import java.io.Serializable;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cx0 implements Serializable {

                /* JADX INFO: renamed from: a */
                public final Object[] f6931a;

                /* JADX INFO: renamed from: b */
                public final Object[] f6932b;

                public cx0(dx0 dx0Var) {
/* 7 */             int i = ((y22) dx0Var).f19462f;
/* 9 */             Object[] objArr = new Object[i];
/* 11 */            Object[] objArr2 = new Object[i];
/* 17 */            wx2 it = dx0Var.entrySet().iterator();
/* 21 */            int i2 = 0;
/* 26 */            while (it.hasNext()) {
/* 32 */                Map.Entry entry = (Map.Entry) it.next();
/* 38 */                objArr[i2] = entry.getKey();
/* 44 */                objArr2[i2] = entry.getValue();
/* 46 */                i2++;
                    }
/* 49 */            this.f6931a = objArr;
/* 51 */            this.f6932b = objArr2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object readResolve() {
/* 1 */             Object[] objArr = this.f6931a;
/* 3 */             boolean z = objArr instanceof fx0;
/* 5 */             Object[] objArr2 = this.f6932b;
/* 7 */             if (!z) {
/* 12 */                bx0 bx0Var = new bx0(objArr.length);
/* 17 */                for (int i = 0; i < objArr.length; i++) {
/* 23 */                    bx0Var.m1458d(objArr[i], objArr2[i]);
                        }
/* 29 */                return bx0Var.m1456b();
                    }
/* 34 */            fx0 fx0Var = (fx0) objArr;
/* 44 */            bx0 bx0Var2 = new bx0(fx0Var.size());
/* 47 */            wx2 it = fx0Var.iterator();
/* 51 */            wx2 it2 = ((vw0) objArr2).iterator();
/* 59 */            while (it.hasNext()) {
/* 69 */                bx0Var2.m1458d(it.next(), it2.next());
                    }
/* 73 */            return bx0Var2.m1456b();
                }
            }
