            package p000;

            import android.R;
            import com.appsflyer.internal.AbstractC0298j;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hw2 {
                public static final gw2 Companion = new gw2();

                /* JADX INFO: renamed from: g */
                public static final int[] f9344g = {-16842910, -16842912};

                /* JADX INFO: renamed from: h */
                public static final int[] f9345h = {-16842910, R.attr.state_checked};

                /* JADX INFO: renamed from: i */
                public static final int[] f9346i = {R.attr.state_enabled, R.attr.state_checked};

                /* JADX INFO: renamed from: j */
                public static final int[] f9347j = {R.attr.state_enabled, -16842912};

                /* JADX INFO: renamed from: a */
                public final int f9348a;

                /* JADX INFO: renamed from: b */
                public final int f9349b;

                /* JADX INFO: renamed from: c */
                public final int f9350c;

                /* JADX INFO: renamed from: d */
                public final int f9351d;

                /* JADX INFO: renamed from: e */
                public final int f9352e;

                /* JADX INFO: renamed from: f */
                public final int f9353f;

                public hw2(int i, int i2, int i3, int i4, int i5, int i6) {
/* 4 */             this.f9348a = i;
/* 6 */             this.f9349b = i2;
/* 8 */             this.f9350c = i3;
/* 10 */            this.f9351d = i4;
/* 12 */            this.f9352e = i5;
/* 14 */            this.f9353f = i6;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof hw2)) {
/* 7 */                 return false;
                    }
/* 11 */            hw2 hw2Var = (hw2) obj;
                    return this.f9348a == hw2Var.f9348a && this.f9349b == hw2Var.f9349b && this.f9350c == hw2Var.f9350c && this.f9351d == hw2Var.f9351d && this.f9352e == hw2Var.f9352e && this.f9353f == hw2Var.f9353f;
                }

                public final int hashCode() {
/* 40 */            return Integer.hashCode(this.f9353f) + AbstractC0298j.m1860a(this.f9352e, AbstractC0298j.m1860a(this.f9351d, AbstractC0298j.m1860a(this.f9350c, AbstractC0298j.m1860a(this.f9349b, Integer.hashCode(this.f9348a) * 31, 31), 31), 31), 31);
                }

                public final String toString() {
/* 68 */            return "UCToggleTheme(activeBackground=" + this.f9348a + ", inactiveBackground=" + this.f9349b + ", disabledBackground=" + this.f9350c + ", activeIcon=" + this.f9351d + ", inactiveIcon=" + this.f9352e + ", disabledIcon=" + this.f9353f + ")";
                }
            }
