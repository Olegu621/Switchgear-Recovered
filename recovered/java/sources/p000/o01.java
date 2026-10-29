            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class o01 extends s91 implements hz0, e90, ix0 {

                /* JADX INFO: renamed from: i */
                public z01 f14579i;

                @Override // p000.ix0
                /* JADX INFO: renamed from: c */
                public final qn1 mo4393c() {
/* 1 */             return null;
                }

                @Override // p000.e90
                public final void dispose() {
/* 5 */             m7087o().m10244M(this);
                }

                public h01 getParent() {
/* 1 */             return m7087o();
                }

                @Override // p000.ix0
                public final boolean isActive() {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: o */
                public final z01 m7087o() {
/* 1 */             z01 z01Var = this.f14579i;
/* 3 */             if (z01Var != null) {
/* 5 */                 return z01Var;
                    }
/* 8 */             Intrinsics.m6220e("job");
/* 12 */            throw null;
                }

                @Override // p000.s91
                public final String toString() {
/* 50 */            return getClass().getSimpleName() + '@' + k50.m5983t(this) + "[job@" + k50.m5983t(m7087o()) + ']';
                }
            }
