            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class aw1 {

                /* JADX INFO: renamed from: a */
                public final String f2126a;

                /* JADX INFO: renamed from: b */
                public final String f2127b;

                /* JADX INFO: renamed from: c */
                public final String f2128c;

                /* JADX INFO: renamed from: d */
                public final String f2129d;

                public aw1(String str, String str2, String str3, String str4) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 7 */             str3.getClass();
/* 10 */            str4.getClass();
/* 16 */            this.f2126a = str;
/* 18 */            this.f2127b = str2;
/* 20 */            this.f2128c = str3;
/* 22 */            this.f2129d = str4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof aw1)) {
/* 7 */                 return false;
                    }
/* 11 */            aw1 aw1Var = (aw1) obj;
                    return Intrinsics.m6216a(this.f2126a, aw1Var.f2126a) && Intrinsics.m6216a(this.f2127b, aw1Var.f2127b) && Intrinsics.m6216a(this.f2128c, aw1Var.f2128c) && Intrinsics.m6216a(this.f2129d, aw1Var.f2129d);
                }

                public final int hashCode() {
/* 28 */            return this.f2129d.hashCode() + pm2.m7485h(pm2.m7485h(this.f2126a.hashCode() * 31, 31, this.f2127b), 31, this.f2128c);
                }

                public final String toString() {
/* 23 */            return fm0.m3791q(AbstractC0886en.m3514r("PredefinedUIURLs(cookiePolicy=", this.f2126a, ", dataProcessingAgreement=", this.f2127b, ", optOut="), this.f2128c, ", privacyPolicy=", this.f2129d, ")");
                }
            }
