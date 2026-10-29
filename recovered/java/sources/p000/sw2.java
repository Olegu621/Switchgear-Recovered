            package p000;

            import kotlin.text.CharsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class sw2 implements Comparable {

                /* JADX INFO: renamed from: b */
                public static final rw2 f16829b = new rw2(null);

                /* JADX INFO: renamed from: a */
                public final long f16830a;

                public /* synthetic */ sw2(long j) {
/* 4 */             this.f16830a = j;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 3 */             long j = ((sw2) obj).f16830a;
/* 9 */             long j2 = this.f16830a ^ Long.MIN_VALUE;
/* 10 */            long j3 = j ^ Long.MIN_VALUE;
/* 13 */            if (j2 < j3) {
/* 15 */                return -1;
                    }
                    return j2 == j3 ? 0 : 1;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof sw2) {
                        return this.f16830a == ((sw2) obj).f16830a;
                    }
/* 16 */            return false;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.f16830a);
                }

                public final String toString() {
/* 3 */             long j = this.f16830a;
/* 9 */             if (j >= 0) {
/* 15 */                String string = Long.toString(j, CharsKt.checkRadix(10));
/* 19 */                string.getClass();
/* 22 */                return string;
                    }
/* 29 */            long j2 = ((j >>> 1) / 10) << 1;
/* 32 */            long j3 = j - (j2 * 10);
/* 35 */            if (j3 >= 10) {
/* 37 */                j3 -= 10;
/* 40 */                j2++;
                    }
/* 45 */            String string2 = Long.toString(j2, CharsKt.checkRadix(10));
/* 49 */            string2.getClass();
/* 56 */            String string3 = Long.toString(j3, CharsKt.checkRadix(10));
/* 60 */            string3.getClass();
/* 63 */            return string2.concat(string3);
                }
            }
