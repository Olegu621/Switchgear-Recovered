            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ra1 extends oa1 {

                /* JADX INFO: renamed from: e */
                public static final qa1 f15951e = new qa1(null);

                /* JADX INFO: renamed from: f */
                public static final ra1 f15952f = new ra1(1, 0);

                public ra1(long j, long j2) {
/* 6 */             super(j, j2, 1L);
                }

                @Override // p000.oa1
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof ra1)) {
/* 40 */                return false;
                    }
/* 9 */             if (isEmpty() && ((ra1) obj).isEmpty()) {
/* 38 */                return true;
                    }
/* 20 */            ra1 ra1Var = (ra1) obj;
                    return this.f14691a == ra1Var.f14691a && this.f14692b == ra1Var.f14692b;
                }

                @Override // p000.oa1
                public final int hashCode() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return -1;
                    }
/* 9 */             long j = this.f14691a;
/* 18 */            long j2 = 31 * (j ^ (j >>> 32));
/* 19 */            long j3 = this.f14692b;
/* 25 */            return (int) (j2 + (j3 ^ (j3 >>> 32)));
                }

                @Override // p000.oa1
                public final boolean isEmpty() {
                    return this.f14691a > this.f14692b;
                }

                @Override // p000.oa1
                public final String toString() {
/* 21 */            return this.f14691a + ".." + this.f14692b;
                }
            }
