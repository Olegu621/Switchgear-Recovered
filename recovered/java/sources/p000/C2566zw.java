            package p000;

            import com.appsflyer.internal.AbstractC0298j;
            
            /* JADX INFO: renamed from: zw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2566zw {
                public static final C2513yw Companion = new C2513yw();

                /* JADX INFO: renamed from: a */
                public final int f20357a;

                /* JADX INFO: renamed from: b */
                public final int f20358b;

                /* JADX INFO: renamed from: c */
                public final int f20359c;

                public C2566zw(int i, int i2, int i3) {
/* 4 */             this.f20357a = i;
/* 6 */             this.f20358b = i2;
/* 8 */             this.f20359c = i3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C2566zw)) {
/* 7 */                 return false;
                    }
/* 11 */            C2566zw c2566zw = (C2566zw) obj;
                    return this.f20357a == c2566zw.f20357a && this.f20358b == c2566zw.f20358b && this.f20359c == c2566zw.f20359c;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.f20359c) + AbstractC0298j.m1860a(this.f20358b, Integer.hashCode(this.f20357a) * 31, 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Color(red=");
/* 10 */            sb.append(this.f20357a);
/* 15 */            sb.append(", green=");
/* 20 */            sb.append(this.f20358b);
/* 25 */            sb.append(", blue=");
/* 32 */            return fm0.m3786l(sb, this.f20359c, ")");
                }
            }
