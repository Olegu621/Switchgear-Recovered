            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wz1 {
                public static final vz1 Companion = new vz1();

                /* JADX INFO: renamed from: a */
                public Integer f18878a;

                /* JADX INFO: renamed from: b */
                public l42 f18879b;

                public wz1(Integer num, l42 l42Var) {
/* 4 */             this.f18878a = num;
/* 6 */             this.f18879b = l42Var;
                }

                /* JADX INFO: renamed from: a */
                public final String m9669a() throws Throwable {
/* 28 */            boolean z = m9670b() == l42.NOT_ALLOWED || m9670b() == l42.REQUIRE_CONSENT || m9670b() == l42.REQUIRE_LI;
/* 29 */            Integer num = this.f18878a;
/* 31 */            if (num == null || num.intValue() <= 0 || !z) {
/* 77 */                throw new Throwable("cannot hash invalid PurposeRestriction");
                    }
/* 65 */            return this.f18878a + "-" + m9670b().f13106a;
                }

                /* JADX INFO: renamed from: b */
                public final l42 m9670b() {
/* 1 */             l42 l42Var = this.f18879b;
/* 3 */             if (l42Var != null) {
/* 5 */                 return l42Var;
                    }
/* 8 */             Intrinsics.m6220e("restrictionType");
/* 12 */            throw null;
                }
            }
