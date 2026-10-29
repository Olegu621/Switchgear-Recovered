            package p000;

            import java.util.concurrent.atomic.AtomicReferenceArray;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class p32 {
                private volatile AtomicReferenceArray<Object> array;

                public p32(int i) {
/* 9 */             this.array = new AtomicReferenceArray<>(i);
                }

                /* JADX INFO: renamed from: a */
                public final int m7321a() {
/* 3 */             return this.array.length();
                }

                /* JADX INFO: renamed from: b */
                public final Object m7322b(int i) {
/* 1 */             AtomicReferenceArray<Object> atomicReferenceArray = this.array;
/* 7 */             if (i < atomicReferenceArray.length()) {
/* 9 */                 return atomicReferenceArray.get(i);
                    }
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public final void m7323c(int i, v10 v10Var) {
/* 1 */             AtomicReferenceArray<Object> atomicReferenceArray = this.array;
/* 3 */             int length = atomicReferenceArray.length();
/* 7 */             if (i < length) {
/* 9 */                 atomicReferenceArray.set(i, v10Var);
/* 12 */                return;
                    }
/* 15 */            int i2 = i + 1;
/* 17 */            int i3 = length * 2;
/* 19 */            if (i2 < i3) {
/* 21 */                i2 = i3;
                    }
/* 22 */            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
/* 26 */            for (int i4 = 0; i4 < length; i4++) {
/* 32 */                atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
                    }
/* 38 */            atomicReferenceArray2.set(i, v10Var);
/* 41 */            this.array = atomicReferenceArray2;
                }
            }
