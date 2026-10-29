            package p000;

            import java.util.Objects;
            
            /* JADX INFO: renamed from: u5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2243u5 extends AbstractC0904f4 {

                /* JADX INFO: renamed from: r */
                public final int f17355r;

                /* JADX INFO: renamed from: s */
                public final int f17356s;

                /* JADX INFO: renamed from: t */
                public final int f17357t;

                /* JADX INFO: renamed from: u */
                public final C2131r4 f17358u;

                public C2243u5(int i, int i2, int i3, C2131r4 c2131r4) {
/* 4 */             this.f17355r = i;
/* 6 */             this.f17356s = i2;
/* 8 */             this.f17357t = i3;
/* 10 */            this.f17358u = c2131r4;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof C2243u5)) {
/* 34 */                return false;
                    }
/* 6 */             C2243u5 c2243u5 = (C2243u5) obj;
                    return c2243u5.f17355r == this.f17355r && c2243u5.f17356s == this.f17356s && c2243u5.f17357t == this.f17357t && c2243u5.f17358u == this.f17358u;
                }

                public final int hashCode() {
/* 27 */            return Objects.hash(C2243u5.class, Integer.valueOf(this.f17355r), Integer.valueOf(this.f17356s), Integer.valueOf(this.f17357t), this.f17358u);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
/* 10 */            sb.append(this.f17358u);
/* 15 */            sb.append(", ");
/* 20 */            sb.append(this.f17356s);
/* 25 */            sb.append("-byte IV, ");
/* 30 */            sb.append(this.f17357t);
/* 35 */            sb.append("-byte tag, and ");
/* 42 */            return fm0.m3786l(sb, this.f17355r, "-byte key)");
                }
            }
