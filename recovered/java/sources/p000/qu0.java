            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qu0 extends AbstractC0904f4 {

                /* JADX INFO: renamed from: r */
                public final int f15751r;

                /* JADX INFO: renamed from: s */
                public final int f15752s;

                /* JADX INFO: renamed from: t */
                public final C2131r4 f15753t;

                /* JADX INFO: renamed from: u */
                public final C0832d5 f15754u;

                public qu0(int i, int i2, C2131r4 c2131r4, C0832d5 c0832d5) {
/* 4 */             this.f15751r = i;
/* 6 */             this.f15752s = i2;
/* 8 */             this.f15753t = c2131r4;
/* 10 */            this.f15754u = c0832d5;
                }

                /* JADX INFO: renamed from: B */
                public final int m8015B() {
/* 1 */             C2131r4 c2131r4 = C2131r4.f15862q;
/* 3 */             int i = this.f15752s;
/* 5 */             C2131r4 c2131r5 = this.f15753t;
/* 7 */             if (c2131r5 == c2131r4) {
/* 9 */                 return i;
                    }
/* 12 */            if (c2131r5 == C2131r4.f15859n) {
/* 14 */                return i + 5;
                    }
/* 19 */            if (c2131r5 == C2131r4.f15860o) {
/* 21 */                return i + 5;
                    }
/* 26 */            if (c2131r5 == C2131r4.f15861p) {
/* 28 */                return i + 5;
                    }
/* 33 */            f42.m3656l("Unknown variant");
/* 36 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof qu0)) {
/* 3 */                 return false;
                    }
/* 7 */             qu0 qu0Var = (qu0) obj;
                    return qu0Var.f15751r == this.f15751r && qu0Var.m8015B() == m8015B() && qu0Var.f15753t == this.f15753t && qu0Var.f15754u == this.f15754u;
                }

                public final int hashCode() {
/* 23 */            return Objects.hash(qu0.class, Integer.valueOf(this.f15751r), Integer.valueOf(this.f15752s), this.f15753t, this.f15754u);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
/* 10 */            sb.append(this.f15753t);
/* 15 */            sb.append(", hashType: ");
/* 20 */            sb.append(this.f15754u);
/* 25 */            sb.append(", ");
/* 30 */            sb.append(this.f15752s);
/* 35 */            sb.append("-byte tags, and ");
/* 42 */            return fm0.m3786l(sb, this.f15751r, "-byte key)");
                }
            }
