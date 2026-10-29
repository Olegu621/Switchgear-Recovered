            package p000;
            
            /* JADX INFO: renamed from: p3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2056p3 {

                /* JADX INFO: renamed from: a */
                public int f14951a;

                /* JADX INFO: renamed from: b */
                public int f14952b;

                /* JADX INFO: renamed from: c */
                public int f14953c;

                public final boolean equals(Object obj) {
/* 2 */             if (this != obj) {
/* 7 */                 if (!(obj instanceof C2056p3)) {
/* 60 */                    return false;
                        }
/* 10 */                C2056p3 c2056p3 = (C2056p3) obj;
/* 12 */                int i = this.f14951a;
/* 16 */                if (i != c2056p3.f14951a) {
/* 60 */                    return false;
                        }
/* 21 */                if (i != 8 || Math.abs(this.f14953c - this.f14952b) != 1 || this.f14953c != c2056p3.f14952b || this.f14952b != c2056p3.f14953c) {
                            return this.f14953c == c2056p3.f14953c && this.f14952b == c2056p3.f14952b;
                        }
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 12 */            return (((this.f14951a * 31) + this.f14952b) * 31) + this.f14953c;
                }

                public final String toString() {
                    String str;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 19 */            sb.append("[");
/* 22 */            int i = this.f14951a;
/* 25 */            if (i == 1) {
/* 49 */                str = "add";
                    } else if (i == 2) {
/* 46 */                str = "rm";
                    } else if (i != 4) {
/* 40 */                str = i != 8 ? "??" : "mv";
                    } else {
/* 43 */                str = "up";
                    }
/* 51 */            sb.append(str);
/* 56 */            sb.append(",s:");
/* 61 */            sb.append(this.f14952b);
/* 66 */            sb.append("c:");
/* 73 */            return fm0.m3786l(sb, this.f14953c, ",p:null]");
                }
            }
