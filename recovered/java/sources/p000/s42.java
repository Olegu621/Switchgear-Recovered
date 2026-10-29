            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class s42 {

                /* JADX INFO: renamed from: a */
                public final float f16425a;

                /* JADX INFO: renamed from: b */
                public final float f16426b;

                public s42(float f, float f2) {
/* 4 */             this.f16425a = f;
/* 6 */             this.f16426b = f2;
                }

                /* JADX INFO: renamed from: a */
                public static float m8399a(s42 s42Var, s42 s42Var2) {
/* 1 */             float f = s42Var.f16425a;
/* 3 */             float f2 = s42Var.f16426b;
/* 9 */             float f3 = f - s42Var2.f16425a;
/* 10 */            float f4 = f2 - s42Var2.f16426b;
/* 19 */            return (float) Math.sqrt((f4 * f4) + (f3 * f3));
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof s42) {
/* 6 */                 s42 s42Var = (s42) obj;
/* 14 */                if (this.f16425a == s42Var.f16425a && this.f16426b == s42Var.f16426b) {
/* 24 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 15 */            return Float.floatToIntBits(this.f16426b) + (Float.floatToIntBits(this.f16425a) * 31);
                }

                public final String toString() {
/* 28 */            return "(" + this.f16425a + ',' + this.f16426b + ')';
                }
            }
