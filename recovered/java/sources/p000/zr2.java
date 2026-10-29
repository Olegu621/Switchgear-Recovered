            package p000;

            import java.io.Serializable;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class zr2 implements Serializable {

                /* JADX INFO: renamed from: a */
                public final Object f20306a;

                /* JADX INFO: renamed from: b */
                public final Object f20307b;

                /* JADX INFO: renamed from: c */
                public final Object f20308c;

                public zr2(Object obj, Object obj2, Object obj3) {
/* 4 */             this.f20306a = obj;
/* 6 */             this.f20307b = obj2;
/* 8 */             this.f20308c = obj3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zr2)) {
/* 7 */                 return false;
                    }
/* 11 */            zr2 zr2Var = (zr2) obj;
                    return Intrinsics.m6216a(this.f20306a, zr2Var.f20306a) && Intrinsics.m6216a(this.f20307b, zr2Var.f20307b) && Intrinsics.m6216a(this.f20308c, zr2Var.f20308c);
                }

                public final int hashCode() {
/* 2 */             Object obj = this.f20306a;
/* 12 */            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
/* 14 */            Object obj2 = this.f20307b;
/* 25 */            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
/* 27 */            Object obj3 = this.f20308c;
/* 36 */            return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
                }

                public final String toString() {
/* 36 */            return "(" + this.f20306a + ", " + this.f20307b + ", " + this.f20308c + ')';
                }
            }
