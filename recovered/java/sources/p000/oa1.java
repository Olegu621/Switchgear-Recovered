            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class oa1 implements Iterable, r21 {

                /* JADX INFO: renamed from: d */
                public static final na1 f14690d = new na1(null);

                /* JADX INFO: renamed from: a */
                public final long f14691a;

                /* JADX INFO: renamed from: b */
                public final long f14692b;

                /* JADX INFO: renamed from: c */
                public final long f14693c;

                public oa1(long j, long j2, long j3) {
/* 8 */             if (j3 == 0) {
/* 103 */               C1951n4.m6859j("Step must be non-zero.");
/* 107 */               throw null;
                    }
/* 14 */            if (j3 == Long.MIN_VALUE) {
/* 96 */                C1951n4.m6859j("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
/* 100 */               throw null;
                    }
/* 16 */            this.f14691a = j;
/* 18 */            if (j3 > 0) {
/* 22 */                if (j < j2) {
/* 25 */                    long j4 = j2 % j3;
/* 33 */                    long j5 = j % j3;
/* 41 */                    long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
/* 48 */                    j2 -= j6 < 0 ? j6 + j3 : j6;
                        }
                    } else {
/* 50 */                if (j3 >= 0) {
/* 89 */                    C1951n4.m6859j("Step is zero.");
/* 93 */                    throw null;
                        }
/* 54 */                if (j > j2) {
/* 57 */                    long j7 = -j3;
/* 58 */                    long j8 = j % j7;
/* 65 */                    long j9 = j2 % j7;
/* 74 */                    long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
/* 81 */                    j2 += j10 < 0 ? j10 + j7 : j10;
                        }
                    }
/* 82 */            this.f14692b = j2;
/* 84 */            this.f14693c = j3;
                }

                public boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof oa1)) {
/* 48 */                return false;
                    }
/* 9 */             if (isEmpty() && ((oa1) obj).isEmpty()) {
/* 46 */                return true;
                    }
/* 20 */            oa1 oa1Var = (oa1) obj;
                    return this.f14691a == oa1Var.f14691a && this.f14692b == oa1Var.f14692b && this.f14693c == oa1Var.f14693c;
                }

                public int hashCode() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return -1;
                    }
/* 9 */             long j = this.f14691a;
/* 19 */            long j2 = this.f14692b;
/* 25 */            long j3 = (((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31;
/* 26 */            long j4 = this.f14693c;
/* 33 */            return (int) (j3 + (j4 ^ (j4 >>> 32)));
                }

                public boolean isEmpty() {
/* 1 */             long j = this.f14693c;
/* 9 */             long j2 = this.f14692b;
/* 11 */            long j3 = this.f14691a;
/* 15 */            if (j > 0) {
                        return j3 > j2;
                    }
                    return j3 < j2;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 9 */             return new pa1(this.f14691a, this.f14692b, this.f14693c);
                }

                public String toString() {
                    StringBuilder sb;
/* 3 */             long j = this.f14693c;
/* 9 */             long j2 = this.f14692b;
/* 11 */            long j3 = this.f14691a;
/* 15 */            if (j > 0) {
/* 17 */                sb = new StringBuilder();
/* 20 */                sb.append(j3);
/* 25 */                sb.append("..");
/* 28 */                sb.append(j2);
/* 31 */                sb.append(" step ");
/* 34 */                sb.append(j);
                    } else {
/* 42 */                sb = new StringBuilder();
/* 45 */                sb.append(j3);
/* 50 */                sb.append(" downTo ");
/* 53 */                sb.append(j2);
/* 56 */                sb.append(" step ");
/* 60 */                sb.append(-j);
                    }
/* 37 */            return sb.toString();
                }
            }
