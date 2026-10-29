            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pa3 {

                /* JADX INFO: renamed from: a */
                public final int f15046a;

                /* JADX INFO: renamed from: b */
                public final long f15047b;

                public pa3(int i, long j) {
/* 4 */             this.f15046a = i;
/* 6 */             this.f15047b = j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 24 */                return true;
                    }
/* 6 */             if (!(obj instanceof pa3)) {
/* 26 */                return false;
                    }
/* 8 */             pa3 pa3Var = (pa3) obj;
                    return this.f15046a == pa3Var.f15046a && this.f15047b == pa3Var.f15047b;
                }

                public final int hashCode() {
/* 3 */             long j = this.f15047b;
/* 17 */            return ((this.f15046a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("EventRecord{eventType=");
/* 10 */            sb.append(this.f15046a);
/* 15 */            sb.append(", eventTimestamp=");
/* 22 */            return fm0.m3787m(sb, this.f15047b, "}");
                }
            }
