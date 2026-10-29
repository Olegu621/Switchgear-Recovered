            package p000;

            import com.appsflyer.internal.AbstractC0298j;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class te0 {

                /* JADX INFO: renamed from: a */
                public final String f17055a;

                /* JADX INFO: renamed from: b */
                public final int f17056b;

                /* JADX INFO: renamed from: c */
                public final String f17057c;

                /* JADX INFO: renamed from: d */
                public final String f17058d;

                public te0(String str, int i, String str2, String str3) {
/* 1 */             str.getClass();
/* 7 */             this.f17055a = str;
/* 9 */             this.f17056b = i;
/* 11 */            this.f17057c = str2;
/* 13 */            this.f17058d = str3;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof te0)) {
/* 50 */                return false;
                    }
/* 9 */             te0 te0Var = (te0) obj;
                    return Intrinsics.m6216a(this.f17055a, te0Var.f17055a) && this.f17056b == te0Var.f17056b && this.f17057c.equals(te0Var.f17057c) && this.f17058d.equals(te0Var.f17058d);
                }

                public final int hashCode() {
/* 28 */            return this.f17058d.hashCode() + pm2.m7485h(AbstractC0298j.m1860a(this.f17056b, this.f17055a.hashCode() * 31, 31), 31, this.f17057c);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("EtagHolder(etagKey=");
/* 10 */            sb.append(this.f17055a);
/* 15 */            sb.append(", cacheMaxAge=");
/* 20 */            sb.append(this.f17056b);
/* 25 */            sb.append(", etagValue=");
/* 36 */            return fm0.m3791q(sb, this.f17057c, ", responseBody=", this.f17058d, ")");
                }
            }
