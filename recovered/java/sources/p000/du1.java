            package p000;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class du1 {

                /* JADX INFO: renamed from: a */
                public final String f7410a;

                /* JADX INFO: renamed from: b */
                public final List f7411b;

                /* JADX INFO: renamed from: c */
                public final fu1 f7412c;

                public du1(String str, List list, fu1 fu1Var) {
/* 4 */             this.f7410a = str;
/* 6 */             this.f7411b = list;
/* 8 */             this.f7412c = fu1Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof du1)) {
/* 7 */                 return false;
                    }
/* 11 */            du1 du1Var = (du1) obj;
                    return Intrinsics.m6216a(this.f7410a, du1Var.f7410a) && Intrinsics.m6216a(this.f7411b, du1Var.f7411b) && Intrinsics.m6216a(this.f7412c, du1Var.f7412c);
                }

                public final int hashCode() {
/* 2 */             String str = this.f7410a;
/* 17 */            int iM1861b = AbstractC0298j.m1861b((str == null ? 0 : str.hashCode()) * 31, 31, this.f7411b);
/* 21 */            fu1 fu1Var = this.f7412c;
/* 30 */            return iM1861b + (fu1Var != null ? fu1Var.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "PredefinedUICardUISection(title=" + this.f7410a + ", cards=" + this.f7411b + ", controllerID=" + this.f7412c + ")";
                }

/* 10 */        public du1(String str, List list) {
/* 11 */            this(str, list, null);
                }
            }
