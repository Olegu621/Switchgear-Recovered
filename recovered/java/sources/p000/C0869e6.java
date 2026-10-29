            package p000;

            import java.util.Objects;
            
            /* JADX INFO: renamed from: e6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0869e6 extends AbstractC0904f4 {

                /* JADX INFO: renamed from: r */
                public final int f7547r;

                /* JADX INFO: renamed from: s */
                public final int f7548s;

                /* JADX INFO: renamed from: t */
                public final int f7549t;

                /* JADX INFO: renamed from: u */
                public final C0204c5 f7550u;

                public C0869e6(int i, int i2, int i3, C0204c5 c0204c5) {
/* 4 */             this.f7547r = i;
/* 6 */             this.f7548s = i2;
/* 8 */             this.f7549t = i3;
/* 10 */            this.f7550u = c0204c5;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof C0869e6)) {
/* 34 */                return false;
                    }
/* 6 */             C0869e6 c0869e6 = (C0869e6) obj;
                    return c0869e6.f7547r == this.f7547r && c0869e6.f7548s == this.f7548s && c0869e6.f7549t == this.f7549t && c0869e6.f7550u == this.f7550u;
                }

                public final int hashCode() {
/* 27 */            return Objects.hash(C0869e6.class, Integer.valueOf(this.f7547r), Integer.valueOf(this.f7548s), Integer.valueOf(this.f7549t), this.f7550u);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
/* 10 */            sb.append(this.f7550u);
/* 15 */            sb.append(", ");
/* 20 */            sb.append(this.f7548s);
/* 25 */            sb.append("-byte IV, ");
/* 30 */            sb.append(this.f7549t);
/* 35 */            sb.append("-byte tag, and ");
/* 42 */            return fm0.m3786l(sb, this.f7547r, "-byte key)");
                }
            }
