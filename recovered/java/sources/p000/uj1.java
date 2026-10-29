            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uj1 {

                /* JADX INFO: renamed from: a */
                public final C0204c5 f17556a;

                /* JADX INFO: renamed from: b */
                public final int f17557b;

                /* JADX INFO: renamed from: c */
                public final String f17558c;

                /* JADX INFO: renamed from: d */
                public final String f17559d;

                public uj1(C0204c5 c0204c5, int i, String str, String str2) {
/* 4 */             this.f17556a = c0204c5;
/* 6 */             this.f17557b = i;
/* 8 */             this.f17558c = str;
/* 10 */            this.f17559d = str2;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof uj1)) {
/* 42 */                return false;
                    }
/* 6 */             uj1 uj1Var = (uj1) obj;
                    return this.f17556a == uj1Var.f17556a && this.f17557b == uj1Var.f17557b && this.f17558c.equals(uj1Var.f17558c) && this.f17559d.equals(uj1Var.f17559d);
                }

                public final int hashCode() {
/* 17 */            return Objects.hash(this.f17556a, Integer.valueOf(this.f17557b), this.f17558c, this.f17559d);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("(status=");
/* 10 */            sb.append(this.f17556a);
/* 15 */            sb.append(", keyId=");
/* 20 */            sb.append(this.f17557b);
/* 25 */            sb.append(", keyType='");
/* 36 */            return fm0.m3791q(sb, this.f17558c, "', keyPrefix='", this.f17559d, "')");
                }
            }
