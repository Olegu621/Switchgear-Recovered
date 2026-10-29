            package p000;

            import java.util.Objects;
            
            /* JADX INFO: renamed from: v6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2282v6 extends he3 {

                /* JADX INFO: renamed from: r */
                public final int f17871r;

                /* JADX INFO: renamed from: s */
                public final C2244u6 f17872s;

                public C2282v6(int i, C2244u6 c2244u6) {
/* 4 */             this.f17871r = i;
/* 6 */             this.f17872s = c2244u6;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof C2282v6)) {
/* 3 */                 return false;
                    }
/* 7 */             C2282v6 c2282v6 = (C2282v6) obj;
                    return c2282v6.f17871r == this.f17871r && c2282v6.f17872s == this.f17872s;
                }

                public final int hashCode() {
/* 15 */            return Objects.hash(C2282v6.class, Integer.valueOf(this.f17871r), this.f17872s);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AesSiv Parameters (variant: ");
/* 10 */            sb.append(this.f17872s);
/* 15 */            sb.append(", ");
/* 22 */            return fm0.m3786l(sb, this.f17871r, "-byte key)");
                }
            }
