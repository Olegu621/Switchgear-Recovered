            package p000;

            import android.graphics.Rect;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class r83 {

                /* JADX INFO: renamed from: a */
                public final C2334wk f15931a;

                /* JADX INFO: renamed from: b */
                public final m83 f15932b;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public r83(Rect rect, m83 m83Var) {
/* 9 */             this(new C2334wk(rect), m83Var);
/* 1 */             rect.getClass();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (!r83.class.equals(obj != null ? obj.getClass() : null)) {
/* 19 */                return false;
                    }
/* 23 */            obj.getClass();
/* 26 */            r83 r83Var = (r83) obj;
                    return Intrinsics.m6216a(this.f15931a, r83Var.f15931a) && Intrinsics.m6216a(this.f15932b, r83Var.f15932b);
                }

                public final int hashCode() {
/* 15 */            return this.f15932b.hashCode() + (this.f15931a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "WindowMetrics( bounds=" + this.f15931a + ", windowInsetsCompat=" + this.f15932b + ')';
                }

/* 12 */        public r83(C2334wk c2334wk, m83 m83Var) {
                    m83Var.getClass();
/* 14 */            this.f15931a = c2334wk;
/* 15 */            this.f15932b = m83Var;
                }
            }
