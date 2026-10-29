            package p000;

            import java.util.Objects;
            
            /* JADX INFO: renamed from: e5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0868e5 extends AbstractC0904f4 {

                /* JADX INFO: renamed from: r */
                public final int f7504r;

                /* JADX INFO: renamed from: s */
                public final int f7505s;

                /* JADX INFO: renamed from: t */
                public final int f7506t;

                /* JADX INFO: renamed from: u */
                public final C0832d5 f7507u;

                /* JADX INFO: renamed from: v */
                public final C0204c5 f7508v;

                public C0868e5(int i, int i2, int i3, C0832d5 c0832d5, C0204c5 c0204c5) {
/* 4 */             this.f7504r = i;
/* 6 */             this.f7505s = i2;
/* 8 */             this.f7506t = i3;
/* 10 */            this.f7507u = c0832d5;
/* 12 */            this.f7508v = c0204c5;
                }

                /* JADX INFO: renamed from: B */
                public final int m3320B() {
/* 1 */             C0832d5 c0832d5 = C0832d5.f6989e;
/* 3 */             int i = this.f7506t;
/* 5 */             C0832d5 c0832d6 = this.f7507u;
/* 7 */             if (c0832d6 == c0832d5) {
/* 9 */                 return i + 16;
                    }
/* 14 */            if (c0832d6 == C0832d5.f6987c || c0832d6 == C0832d5.f6988d) {
/* 28 */                return i + 21;
                    }
/* 23 */            f42.m3656l("Unknown variant");
/* 26 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof C0868e5)) {
/* 3 */                 return false;
                    }
/* 7 */             C0868e5 c0868e5 = (C0868e5) obj;
                    return c0868e5.f7504r == this.f7504r && c0868e5.f7505s == this.f7505s && c0868e5.m3320B() == m3320B() && c0868e5.f7507u == this.f7507u && c0868e5.f7508v == this.f7508v;
                }

                public final int hashCode() {
/* 29 */            return Objects.hash(C0868e5.class, Integer.valueOf(this.f7504r), Integer.valueOf(this.f7505s), Integer.valueOf(this.f7506t), this.f7507u, this.f7508v);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
/* 10 */            sb.append(this.f7507u);
/* 15 */            sb.append(", hashType: ");
/* 20 */            sb.append(this.f7508v);
/* 25 */            sb.append(", ");
/* 30 */            sb.append(this.f7506t);
/* 35 */            sb.append("-byte tags, and ");
/* 40 */            sb.append(this.f7504r);
/* 45 */            sb.append("-byte AES key, and ");
/* 52 */            return fm0.m3786l(sb, this.f7505s, "-byte HMAC key)");
                }
            }
