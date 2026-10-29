            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zh3 implements jh3 {

                /* JADX INFO: renamed from: a */
                public final jh3 f20152a;

                /* JADX INFO: renamed from: b */
                public final Object f20153b;

                public zh3(jh3 jh3Var, Object obj) {
/* 4 */             this.f20152a = jh3Var;
/* 8 */             pg3.m7422F(obj, "log site qualifier");
/* 11 */            this.f20153b = obj;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zh3)) {
/* 3 */                 return false;
                    }
/* 7 */             zh3 zh3Var = (zh3) obj;
                    return this.f20152a.equals(zh3Var.f20152a) && this.f20153b.equals(zh3Var.f20153b);
                }

                public final int hashCode() {
/* 13 */            return this.f20153b.hashCode() ^ this.f20152a.hashCode();
                }

                public final String toString() {
/* 3 */             String string = this.f20152a.toString();
/* 9 */             String string2 = this.f20153b.toString();
/* 28 */            StringBuilder sb = new StringBuilder(string.length() + 47 + string2.length() + 3);
/* 35 */            fm0.m3796v(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
/* 40 */            sb.append("' }");
/* 43 */            return sb.toString();
                }
            }
