            package p000;

            import android.util.Base64;
            import java.util.Arrays;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: yg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2497yg {

                /* JADX INFO: renamed from: a */
                public final String f19600a;

                /* JADX INFO: renamed from: b */
                public final byte[] f19601b;

                /* JADX INFO: renamed from: c */
                public final px1 f19602c;

                public C2497yg(String str, byte[] bArr, px1 px1Var) {
/* 4 */             this.f19600a = str;
/* 6 */             this.f19601b = bArr;
/* 8 */             this.f19602c = px1Var;
                }

                /* JADX INFO: renamed from: a */
                public static C0875ec m10147a() {
/* 5 */             C0875ec c0875ec = new C0875ec(10);
/* 10 */            c0875ec.f7615d = px1.f15322a;
/* 12 */            return c0875ec;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2497yg) {
/* 10 */                C2497yg c2497yg = (C2497yg) obj;
/* 20 */                if (this.f19600a.equals(c2497yg.f19600a) && Arrays.equals(this.f19601b, c2497yg.f19601b) && this.f19602c.equals(c2497yg.f19602c)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 26 */            return this.f19602c.hashCode() ^ ((((this.f19600a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19601b)) * 1000003);
                }

                public final String toString() {
/* 1 */             byte[] bArr = this.f19601b;
/* 9 */             String strEncodeToString = bArr == null ? HttpUrl.FRAGMENT_ENCODE_SET : Base64.encodeToString(bArr, 2);
/* 17 */            StringBuilder sb = new StringBuilder("TransportContext(");
/* 22 */            sb.append(this.f19600a);
/* 27 */            sb.append(", ");
/* 32 */            sb.append(this.f19602c);
/* 35 */            sb.append(", ");
/* 40 */            return fm0.m3789o(sb, strEncodeToString, ")");
                }
            }
