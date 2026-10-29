            package kotlin.ranges;

            import java.util.Iterator;
            import p000.C1951n4;
            import p000.k50;
            import p000.r21;
            import p000.xy0;
            import p000.yy0;
            
            /* JADX INFO: renamed from: kotlin.ranges.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C1847a implements Iterable, r21 {

                /* JADX INFO: renamed from: d */
                public static final xy0 f12925d = new xy0(null);

                /* JADX INFO: renamed from: a */
                public final int f12926a;

                /* JADX INFO: renamed from: b */
                public final int f12927b;

                /* JADX INFO: renamed from: c */
                public final int f12928c;

                public C1847a(int i, int i2, int i3) {
/* 4 */             if (i3 == 0) {
/* 30 */                C1951n4.m6859j("Step must be non-zero.");
/* 34 */                throw null;
                    }
/* 8 */             if (i3 == Integer.MIN_VALUE) {
/* 23 */                C1951n4.m6859j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
/* 27 */                throw null;
                    }
/* 10 */            this.f12926a = i;
/* 16 */            this.f12927b = k50.m5985v(i, i2, i3);
/* 18 */            this.f12928c = i3;
                }

                public boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof C1847a)) {
/* 42 */                return false;
                    }
/* 9 */             if (isEmpty() && ((C1847a) obj).isEmpty()) {
/* 40 */                return true;
                    }
/* 20 */            C1847a c1847a = (C1847a) obj;
                    return this.f12926a == c1847a.f12926a && this.f12927b == c1847a.f12927b && this.f12928c == c1847a.f12928c;
                }

                public int hashCode() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return -1;
                    }
/* 20 */            return (((this.f12926a * 31) + this.f12927b) * 31) + this.f12928c;
                }

                public boolean isEmpty() {
/* 3 */             int i = this.f12927b;
/* 5 */             int i2 = this.f12928c;
/* 7 */             int i3 = this.f12926a;
/* 9 */             if (i2 > 0) {
                        return i3 > i;
                    }
                    return i3 < i;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 9 */             return new yy0(this.f12926a, this.f12927b, this.f12928c);
                }

                public String toString() {
                    StringBuilder sb;
/* 3 */             int i = this.f12927b;
/* 5 */             int i2 = this.f12928c;
/* 7 */             int i3 = this.f12926a;
/* 11 */            if (i2 > 0) {
/* 13 */                sb = new StringBuilder();
/* 16 */                sb.append(i3);
/* 21 */                sb.append("..");
/* 24 */                sb.append(i);
/* 27 */                sb.append(" step ");
/* 30 */                sb.append(i2);
                    } else {
/* 38 */                sb = new StringBuilder();
/* 41 */                sb.append(i3);
/* 46 */                sb.append(" downTo ");
/* 49 */                sb.append(i);
/* 52 */                sb.append(" step ");
/* 56 */                sb.append(-i2);
                    }
/* 33 */            return sb.toString();
                }
            }
