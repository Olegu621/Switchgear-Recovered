            package p000;

            import android.graphics.Insets;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ly0 {

                /* JADX INFO: renamed from: e */
                public static final ly0 f13527e = new ly0(0, 0, 0, 0);

                /* JADX INFO: renamed from: a */
                public final int f13528a;

                /* JADX INFO: renamed from: b */
                public final int f13529b;

                /* JADX INFO: renamed from: c */
                public final int f13530c;

                /* JADX INFO: renamed from: d */
                public final int f13531d;

                public ly0(int i, int i2, int i3, int i4) {
/* 4 */             this.f13528a = i;
/* 6 */             this.f13529b = i2;
/* 8 */             this.f13530c = i3;
/* 10 */            this.f13531d = i4;
                }

                /* JADX INFO: renamed from: a */
                public static ly0 m6573a(int i, int i2, int i3, int i4) {
                    return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f13527e : new ly0(i, i2, i3, i4);
                }

                /* JADX INFO: renamed from: b */
                public static ly0 m6574b(Insets insets) {
/* 17 */            return m6573a(insets.left, insets.top, insets.right, insets.bottom);
                }

                /* JADX INFO: renamed from: c */
                public final Insets m6575c() {
/* 9 */             return ky0.m6308a(this.f13528a, this.f13529b, this.f13530c, this.f13531d);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || ly0.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            ly0 ly0Var = (ly0) obj;
                    return this.f13531d == ly0Var.f13531d && this.f13528a == ly0Var.f13528a && this.f13530c == ly0Var.f13530c && this.f13529b == ly0Var.f13529b;
                }

                public final int hashCode() {
/* 17 */            return (((((this.f13528a * 31) + this.f13529b) * 31) + this.f13530c) * 31) + this.f13531d;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Insets{left=");
/* 10 */            sb.append(this.f13528a);
/* 15 */            sb.append(", top=");
/* 20 */            sb.append(this.f13529b);
/* 25 */            sb.append(", right=");
/* 30 */            sb.append(this.f13530c);
/* 35 */            sb.append(", bottom=");
/* 42 */            return AbstractC0886en.m3510n(sb, this.f13531d, '}');
                }
            }
