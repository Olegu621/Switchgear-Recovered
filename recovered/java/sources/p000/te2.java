            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class te2 {

                /* JADX INFO: renamed from: a */
                public final int f17059a;

                /* JADX INFO: renamed from: b */
                public final int f17060b;

                public te2(int i, int i2) {
/* 4 */             this.f17059a = i;
/* 6 */             this.f17060b = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof te2)) {
/* 7 */                 return false;
                    }
/* 11 */            te2 te2Var = (te2) obj;
                    return this.f17059a == te2Var.f17059a && this.f17060b == te2Var.f17060b;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.f17060b) + (Integer.hashCode(this.f17059a) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Size(width=");
/* 10 */            sb.append(this.f17059a);
/* 15 */            sb.append(", height=");
/* 22 */            return AbstractC0886en.m3510n(sb, this.f17060b, ')');
                }
            }
