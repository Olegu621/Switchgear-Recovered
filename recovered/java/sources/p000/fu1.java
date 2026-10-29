            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fu1 {

                /* JADX INFO: renamed from: a */
                public final String f8357a;

                /* JADX INFO: renamed from: b */
                public final String f8358b;

                public fu1(String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 10 */            this.f8357a = str;
/* 12 */            this.f8358b = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof fu1)) {
/* 7 */                 return false;
                    }
/* 11 */            fu1 fu1Var = (fu1) obj;
                    return Intrinsics.m6216a(this.f8357a, fu1Var.f8357a) && Intrinsics.m6216a(this.f8358b, fu1Var.f8358b);
                }

                public final int hashCode() {
/* 15 */            return this.f8358b.hashCode() + (this.f8357a.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return fm0.m3785k("PredefinedUIControllerIDSettings(label=", this.f8357a, ", value=", this.f8358b, ")");
                }
            }
