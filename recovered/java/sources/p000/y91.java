            package p000;

            import java.util.Date;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y91 {

                /* JADX INFO: renamed from: a */
                public final Date f19538a;

                /* JADX INFO: renamed from: b */
                public final double f19539b;

                /* JADX INFO: renamed from: c */
                public final double f19540c;

                /* JADX INFO: renamed from: d */
                public final boolean f19541d;

                /* JADX INFO: renamed from: e */
                public final boolean f19542e;

                /* JADX INFO: renamed from: f */
                public final boolean f19543f;

                public y91(Date date, double d, double d2, boolean z, boolean z2, boolean z3) {
/* 1 */             date.getClass();
/* 7 */             this.f19538a = date;
/* 9 */             this.f19539b = d;
/* 11 */            this.f19540c = d2;
/* 13 */            this.f19541d = z;
/* 15 */            this.f19542e = z2;
/* 17 */            this.f19543f = z3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof y91)) {
/* 7 */                 return false;
                    }
/* 11 */            y91 y91Var = (y91) obj;
                    return Intrinsics.m6216a(this.f19538a, y91Var.f19538a) && Double.compare(this.f19539b, y91Var.f19539b) == 0 && Double.compare(this.f19540c, y91Var.f19540c) == 0 && this.f19541d == y91Var.f19541d && this.f19542e == y91Var.f19542e && this.f19543f == y91Var.f19543f;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10, types: [int] */
                /* JADX WARN: Type inference failed for: r0v6, types: [int] */
                /* JADX WARN: Type inference failed for: r0v8, types: [int] */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r1v5, types: [int] */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r2v2, types: [int] */
                /* JADX WARN: Type inference failed for: r2v4, types: [int] */
                /* JADX WARN: Type inference failed for: r2v5 */
                /* JADX WARN: Type inference failed for: r2v6 */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v8 */
                public final int hashCode() {
/* 25 */            int iHashCode = (Double.hashCode(this.f19540c) + ((Double.hashCode(this.f19539b) + (this.f19538a.hashCode() * 31)) * 31)) * 31;
/* 28 */            boolean z = this.f19541d;
                    ?? r2 = z;
/* 30 */            if (z) {
/* 32 */                r2 = 1;
                    }
/* 34 */            int i = (iHashCode + r2) * 31;
/* 36 */            boolean z2 = this.f19542e;
                    ?? r3 = z2;
/* 38 */            if (z2) {
/* 40 */                r3 = 1;
                    }
/* 42 */            int i2 = (i + r3) * 31;
/* 44 */            boolean z3 = this.f19543f;
/* 50 */            return i2 + (z3 ? 1 : z3);
                }

                public final String toString() {
/* 68 */            return "Log(time=" + this.f19538a + ", contentTime=" + this.f19539b + ", playbackRate=" + this.f19540c + ", paused=" + this.f19541d + ", muted=" + this.f19542e + ", linearAd=" + this.f19543f + ')';
                }
            }
