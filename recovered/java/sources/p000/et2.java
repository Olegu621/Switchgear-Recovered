            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class et2 {
                public static final dt2 Companion = new dt2();

                /* JADX INFO: renamed from: a */
                public final Integer f7872a;

                /* JADX INFO: renamed from: b */
                public final Integer f7873b;

                /* JADX INFO: renamed from: c */
                public final int f7874c;

                public et2(Integer num, Integer num2, int i) {
/* 4 */             this.f7872a = num;
/* 6 */             this.f7873b = num2;
/* 8 */             this.f7874c = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof et2)) {
/* 7 */                 return false;
                    }
/* 11 */            et2 et2Var = (et2) obj;
                    return Intrinsics.m6216a(this.f7872a, et2Var.f7872a) && Intrinsics.m6216a(this.f7873b, et2Var.f7873b) && this.f7874c == et2Var.f7874c;
                }

                public final int hashCode() {
/* 2 */             Integer num = this.f7872a;
/* 12 */            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
/* 14 */            Integer num2 = this.f7873b;
/* 32 */            return Integer.hashCode(this.f7874c) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UCButtonCustomization(text=");
/* 10 */            sb.append(this.f7872a);
/* 15 */            sb.append(", background=");
/* 20 */            sb.append(this.f7873b);
/* 25 */            sb.append(", cornerRadius=");
/* 32 */            return fm0.m3786l(sb, this.f7874c, ")");
                }
            }
