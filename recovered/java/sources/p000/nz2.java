            package p000;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nz2 {

                /* JADX INFO: renamed from: a */
                public final f13 f14574a;

                /* JADX INFO: renamed from: b */
                public final List f14575b;

                /* JADX INFO: renamed from: c */
                public final String f14576c;

                public nz2(f13 f13Var, List list, String str) {
/* 1 */             list.getClass();
/* 4 */             str.getClass();
/* 10 */            this.f14574a = f13Var;
/* 12 */            this.f14575b = list;
/* 14 */            this.f14576c = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof nz2)) {
/* 39 */                return false;
                    }
/* 9 */             nz2 nz2Var = (nz2) obj;
                    return this.f14574a == nz2Var.f14574a && Intrinsics.m6216a(this.f14575b, nz2Var.f14575b) && Intrinsics.m6216a(this.f14576c, nz2Var.f14576c);
                }

                public final int hashCode() {
/* 22 */            return this.f14576c.hashCode() + AbstractC0298j.m1861b(this.f14574a.hashCode() * 31, 31, this.f14575b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UsercentricsConsentUserResponse(userInteraction=");
/* 10 */            sb.append(this.f14574a);
/* 15 */            sb.append(", consents=");
/* 20 */            sb.append(this.f14575b);
/* 25 */            sb.append(", controllerId=");
/* 32 */            return fm0.m3789o(sb, this.f14576c, ")");
                }
            }
