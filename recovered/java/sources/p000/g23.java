            package p000;

            import java.math.BigInteger;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g23 implements Comparable {

                /* JADX INFO: renamed from: f */
                public static final g23 f8441f;

                /* JADX INFO: renamed from: a */
                public final int f8442a;

                /* JADX INFO: renamed from: b */
                public final int f8443b;

                /* JADX INFO: renamed from: c */
                public final int f8444c;

                /* JADX INFO: renamed from: d */
                public final String f8445d;

                /* JADX INFO: renamed from: e */
                public final hk2 f8446e = r51.m8065b(new C0908f8(this, 21));

                static {
/* 6 */             new g23(HttpUrl.FRAGMENT_ENCODE_SET, 0, 0, 0);
/* 15 */            f8441f = new g23(HttpUrl.FRAGMENT_ENCODE_SET, 0, 1, 0);
/* 19 */            new g23(HttpUrl.FRAGMENT_ENCODE_SET, 1, 0, 0);
                }

                public g23(String str, int i, int i2, int i3) {
/* 4 */             this.f8442a = i;
/* 6 */             this.f8443b = i2;
/* 8 */             this.f8444c = i3;
/* 10 */            this.f8445d = str;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 1 */             g23 g23Var = (g23) obj;
/* 3 */             g23Var.getClass();
/* 8 */             Object value = this.f8446e.getValue();
/* 12 */            value.getClass();
/* 19 */            Object value2 = g23Var.f8446e.getValue();
/* 23 */            value2.getClass();
/* 28 */            return ((BigInteger) value).compareTo((BigInteger) value2);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof g23)) {
/* 3 */                 return false;
                    }
/* 7 */             g23 g23Var = (g23) obj;
                    return this.f8442a == g23Var.f8442a && this.f8443b == g23Var.f8443b && this.f8444c == g23Var.f8444c;
                }

                public final int hashCode() {
/* 15 */            return ((((527 + this.f8442a) * 31) + this.f8443b) * 31) + this.f8444c;
                }

                public final String toString() {
/* 1 */             String str = this.f8445d;
/* 16 */            String strM3507k = !StringsKt.m6228D(str) ? AbstractC0886en.m3507k("-", str) : HttpUrl.FRAGMENT_ENCODE_SET;
/* 20 */            StringBuilder sb = new StringBuilder();
/* 25 */            sb.append(this.f8442a);
/* 30 */            sb.append('.');
/* 35 */            sb.append(this.f8443b);
/* 38 */            sb.append('.');
/* 43 */            return fm0.m3786l(sb, this.f8444c, strM3507k);
                }
            }
