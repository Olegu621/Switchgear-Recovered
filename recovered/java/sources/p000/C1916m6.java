            package p000;

            import java.util.Objects;
            
            /* JADX INFO: renamed from: m6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1916m6 extends AbstractC0904f4 {

                /* JADX INFO: renamed from: r */
                public final int f13571r;

                /* JADX INFO: renamed from: s */
                public final C0832d5 f13572s;

                public C1916m6(int i, C0832d5 c0832d5) {
/* 4 */             this.f13571r = i;
/* 6 */             this.f13572s = c0832d5;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof C1916m6)) {
/* 22 */                return false;
                    }
/* 6 */             C1916m6 c1916m6 = (C1916m6) obj;
                    return c1916m6.f13571r == this.f13571r && c1916m6.f13572s == this.f13572s;
                }

                public final int hashCode() {
/* 15 */            return Objects.hash(C1916m6.class, Integer.valueOf(this.f13571r), this.f13572s);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
/* 10 */            sb.append(this.f13572s);
/* 15 */            sb.append(", ");
/* 22 */            return fm0.m3786l(sb, this.f13571r, "-byte key)");
                }
            }
