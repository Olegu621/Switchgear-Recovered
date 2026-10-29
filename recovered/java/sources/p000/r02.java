            package p000;

            import kotlin.ranges.C1847a;
            import kotlin.ranges.IntRange;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class r02 extends q02 {
                /* JADX INFO: renamed from: b */
                public static long m8045b(long j) {
/* 8 */             if (j < -4611686018427387903L) {
/* 1 */                 return -4611686018427387903L;
                    }
/* 18 */            if (j > 4611686018427387903L) {
/* 11 */                return 4611686018427387903L;
                    }
/* 21 */            return j;
                }

                /* JADX INFO: renamed from: c */
                public static long m8046c(long j, ra1 ra1Var) {
/* 1 */             long j2 = ra1Var.f14692b;
/* 3 */             long j3 = ra1Var.f14691a;
/* 9 */             if (!ra1Var.isEmpty()) {
/* 21 */                if (j < Long.valueOf(j3).longValue()) {
/* 27 */                    return Long.valueOf(j3).longValue();
                        }
                        return j > Long.valueOf(j2).longValue() ? Long.valueOf(j2).longValue() : j;
                    }
/* 77 */            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + ra1Var + '.');
                }

                /* JADX INFO: renamed from: d */
                public static C1847a m8047d(IntRange intRange, int i) {
/* 1 */             intRange.getClass();
/* 13 */            q02.m7675a(i > 0, Integer.valueOf(i));
/* 16 */            xy0 xy0Var = C1847a.f12925d;
/* 18 */            int i2 = intRange.f12926a;
/* 20 */            int i3 = intRange.f12927b;
/* 24 */            if (intRange.f12928c <= 0) {
/* 27 */                i = -i;
                    }
/* 28 */            xy0Var.getClass();
/* 33 */            return new C1847a(i2, i3, i);
                }

                /* JADX INFO: renamed from: e */
                public static IntRange m8048e(int i, int i2) {
/* 3 */             if (i2 > Integer.MIN_VALUE) {
/* 17 */                return new IntRange(i, i2 - 1, 1);
                    }
/* 7 */             IntRange.f12923e.getClass();
/* 10 */            return IntRange.f12924f;
                }
            }
