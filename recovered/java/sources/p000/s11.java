            package p000;

            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.json.AbstractC1860d;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class s11 extends AbstractC1860d {

                /* JADX INFO: renamed from: a */
                public final boolean f16379a;

                /* JADX INFO: renamed from: b */
                public final String f16380b;

                public s11(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 7 */             this.f16379a = z;
/* 13 */            this.f16380b = obj.toString();
                }

                @Override // kotlinx.serialization.json.AbstractC1860d
                /* JADX INFO: renamed from: a */
                public final String mo6271a() {
/* 1 */             return this.f16380b;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 47 */                return true;
                    }
/* 4 */             if (obj == null || !j22.m5667a(s11.class).equals(j22.m5667a(obj.getClass()))) {
/* 49 */                return false;
                    }
/* 27 */            s11 s11Var = (s11) obj;
                    return this.f16379a == s11Var.f16379a && Intrinsics.m6216a(this.f16380b, s11Var.f16380b);
                }

                public final int hashCode() {
/* 15 */            return this.f16380b.hashCode() + (Boolean.hashCode(this.f16379a) * 31);
                }

                @Override // kotlinx.serialization.json.AbstractC1860d
                public final String toString() {
/* 1 */             boolean z = this.f16379a;
/* 3 */             String str = this.f16380b;
/* 5 */             if (!z) {
/* 19 */                return str;
                    }
/* 9 */             StringBuilder sb = new StringBuilder();
/* 12 */            sh2.m8507a(sb, str);
/* 15 */            return sb.toString();
                }
            }
