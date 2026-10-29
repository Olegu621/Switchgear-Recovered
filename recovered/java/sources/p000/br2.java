            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class br2 implements ar2 {

                /* JADX INFO: renamed from: a */
                public final int f2582a;

                /* JADX INFO: renamed from: b */
                public final boolean f2583b;

                /* JADX INFO: renamed from: c */
                public final int f2584c;

                public br2(int i, int i2, boolean z) {
/* 4 */             this.f2582a = i;
/* 6 */             this.f2583b = z;
/* 8 */             this.f2584c = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && br2.class == obj.getClass()) {
/* 17 */                br2 br2Var = (br2) obj;
/* 23 */                if (br2Var.f2582a == this.f2582a && br2Var.f2583b == this.f2583b && br2Var.f2584c == this.f2584c) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override // p000.ar2
                public final int getBatteryUsagePreference() {
/* 1 */             return this.f2584c;
                }

                @Override // p000.ar2
                public final int getNetworkPreference() {
/* 1 */             return this.f2582a;
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2582a), Boolean.valueOf(this.f2583b), Integer.valueOf(this.f2584c)});
                }

                @Override // p000.ar2
                public final boolean isRoamingAllowed() {
/* 1 */             return this.f2583b;
                }

                public final String toString() {
/* 33 */            return "NetworkPreference: " + this.f2582a + ", IsRoamingAllowed " + this.f2583b + ", BatteryUsagePreference " + this.f2584c;
                }
            }
