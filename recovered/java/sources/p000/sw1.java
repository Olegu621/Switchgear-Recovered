            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sw1 extends lq1 {

                /* JADX INFO: renamed from: a */
                public final Object f16828a;

                public sw1(Object obj) {
/* 4 */             this.f16828a = obj;
                }

                @Override // p000.lq1
                /* JADX INFO: renamed from: a */
                public final Object mo2901a() {
/* 1 */             return this.f16828a;
                }

                @Override // p000.lq1
                /* JADX INFO: renamed from: b */
                public final boolean mo2902b() {
/* 1 */             return true;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof sw1) {
/* 11 */                return this.f16828a.equals(((sw1) obj).f16828a);
                    }
/* 16 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.f16828a.hashCode() + 1502476572;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f16828a);
/* 15 */            StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
/* 20 */            sb.append("Optional.of(");
/* 23 */            sb.append(strValueOf);
/* 28 */            sb.append(")");
/* 31 */            return sb.toString();
                }
            }
