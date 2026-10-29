            package p000;

            import java.util.Objects;
            
            /* JADX INFO: renamed from: s4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2168s4 extends AbstractC0904f4 {

                /* JADX INFO: renamed from: r */
                public final int f16414r;

                /* JADX INFO: renamed from: s */
                public final int f16415s;

                /* JADX INFO: renamed from: t */
                public final C2131r4 f16416t;

                public C2168s4(int i, int i2, C2131r4 c2131r4) {
/* 4 */             this.f16414r = i;
/* 6 */             this.f16415s = i2;
/* 8 */             this.f16416t = c2131r4;
                }

                /* JADX INFO: renamed from: B */
                public final int m8398B() {
/* 1 */             C2131r4 c2131r4 = C2131r4.f15851f;
/* 3 */             int i = this.f16415s;
/* 5 */             C2131r4 c2131r5 = this.f16416t;
/* 7 */             if (c2131r5 == c2131r4) {
/* 9 */                 return i;
                    }
/* 12 */            if (c2131r5 == C2131r4.f15848c) {
/* 14 */                return i + 5;
                    }
/* 19 */            if (c2131r5 == C2131r4.f15849d) {
/* 21 */                return i + 5;
                    }
/* 26 */            if (c2131r5 == C2131r4.f15850e) {
/* 28 */                return i + 5;
                    }
/* 33 */            f42.m3656l("Unknown variant");
/* 36 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof C2168s4)) {
/* 3 */                 return false;
                    }
/* 7 */             C2168s4 c2168s4 = (C2168s4) obj;
                    return c2168s4.f16414r == this.f16414r && c2168s4.m8398B() == m8398B() && c2168s4.f16416t == this.f16416t;
                }

                public final int hashCode() {
/* 21 */            return Objects.hash(C2168s4.class, Integer.valueOf(this.f16414r), Integer.valueOf(this.f16415s), this.f16416t);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
/* 10 */            sb.append(this.f16416t);
/* 15 */            sb.append(", ");
/* 20 */            sb.append(this.f16415s);
/* 25 */            sb.append("-byte tags, and ");
/* 32 */            return fm0.m3786l(sb, this.f16414r, "-byte key)");
                }
            }
