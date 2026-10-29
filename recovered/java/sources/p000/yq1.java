            package p000;

            import com.appsflyer.internal.AbstractC0298j;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yq1 {

                /* JADX INFO: renamed from: a */
                public final String f19753a;

                /* JADX INFO: renamed from: b */
                public final int f19754b;

                /* JADX INFO: renamed from: c */
                public final String f19755c;

                public yq1(String str, int i, String str2) {
/* 1 */             str.getClass();
/* 7 */             this.f19753a = str;
/* 9 */             this.f19754b = i;
/* 11 */            this.f19755c = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof yq1)) {
/* 7 */                 return false;
                    }
/* 11 */            yq1 yq1Var = (yq1) obj;
                    return Intrinsics.m6216a(this.f19753a, yq1Var.f19753a) && this.f19754b == yq1Var.f19754b && Intrinsics.m6216a(this.f19755c, yq1Var.f19755c);
                }

                public final int hashCode() {
/* 12 */            int iM1860a = AbstractC0298j.m1860a(this.f19754b, this.f19753a.hashCode() * 31, 31);
/* 16 */            String str = this.f19755c;
/* 26 */            return iM1860a + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CacheKey(callingPackage=");
/* 10 */            sb.append(this.f19753a);
/* 15 */            sb.append(", callingUid=");
/* 20 */            sb.append(this.f19754b);
/* 25 */            sb.append(", scidEnvironment=");
/* 32 */            return fm0.m3789o(sb, this.f19755c, ")");
                }
            }
