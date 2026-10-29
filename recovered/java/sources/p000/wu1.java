            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wu1 {

                /* JADX INFO: renamed from: a */
                public final cw1 f18819a;

                /* JADX INFO: renamed from: b */
                public final ac1 f18820b;

                /* JADX INFO: renamed from: c */
                public final er0 f18821c;

                public wu1(cw1 cw1Var, ac1 ac1Var, er0 er0Var) {
/* 1 */             cw1Var.getClass();
/* 7 */             this.f18819a = cw1Var;
/* 9 */             this.f18820b = ac1Var;
/* 11 */            this.f18821c = er0Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof wu1) {
/* 11 */                wu1 wu1Var = (wu1) obj;
                        return Intrinsics.m6216a(this.f18819a, wu1Var.f18819a) && this.f18820b == wu1Var.f18820b && this.f18821c == wu1Var.f18821c;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 24 */            return this.f18821c.hashCode() + ((this.f18820b.hashCode() + (this.f18819a.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "PredefinedUIHolder(data=" + this.f18819a + ", consentManager=" + this.f18820b + ", viewHandlers=" + this.f18821c + ")";
                }
            }
