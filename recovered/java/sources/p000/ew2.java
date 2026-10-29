            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ew2 {
                public static final dw2 Companion = new dw2();

                /* JADX INFO: renamed from: a */
                public final wt2 f7907a;

                /* JADX INFO: renamed from: b */
                public final wu2 f7908b;

                /* JADX INFO: renamed from: c */
                public final hw2 f7909c;

                /* JADX INFO: renamed from: d */
                public final it2 f7910d;

                /* JADX INFO: renamed from: e */
                public final int f7911e;

                public ew2(wt2 wt2Var, wu2 wu2Var, hw2 hw2Var, it2 it2Var, int i) {
/* 4 */             this.f7907a = wt2Var;
/* 6 */             this.f7908b = wu2Var;
/* 8 */             this.f7909c = hw2Var;
/* 10 */            this.f7910d = it2Var;
/* 12 */            this.f7911e = i;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 63 */                return true;
                    }
/* 6 */             if (!(obj instanceof ew2)) {
/* 61 */                return false;
                    }
/* 9 */             ew2 ew2Var = (ew2) obj;
                    return this.f7907a.equals(ew2Var.f7907a) && this.f7908b.equals(ew2Var.f7908b) && Intrinsics.m6216a(this.f7909c, ew2Var.f7909c) && this.f7910d.equals(ew2Var.f7910d) && this.f7911e == ew2Var.f7911e;
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.f7908b.hashCode() + (this.f7907a.hashCode() * 31)) * 31;
/* 18 */            hw2 hw2Var = this.f7909c;
/* 46 */            return Integer.hashCode(this.f7911e) + ((this.f7910d.hashCode() + ((iHashCode + (hw2Var == null ? 0 : hw2Var.hashCode())) * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UCThemeData(colorPalette=");
/* 10 */            sb.append(this.f7907a);
/* 15 */            sb.append(", fonts=");
/* 20 */            sb.append(this.f7908b);
/* 25 */            sb.append(", toggleTheme=");
/* 30 */            sb.append(this.f7909c);
/* 35 */            sb.append(", buttonTheme=");
/* 40 */            sb.append(this.f7910d);
/* 45 */            sb.append(", bannerCornerRadius=");
/* 52 */            return fm0.m3786l(sb, this.f7911e, ")");
                }
            }
