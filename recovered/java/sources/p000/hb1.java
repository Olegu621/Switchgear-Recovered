            package p000;

            import com.usercentrics.sdk.UsercentricsDomains;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hb1 {

                /* JADX INFO: renamed from: a */
                public final bn1 f8998a;

                /* JADX INFO: renamed from: b */
                public final UsercentricsDomains f8999b;

                public hb1(bn1 bn1Var, UsercentricsDomains usercentricsDomains) {
/* 1 */             bn1Var.getClass();
/* 7 */             this.f8998a = bn1Var;
/* 9 */             this.f8999b = usercentricsDomains;
                }

                /* JADX INFO: renamed from: a */
                public final String m4149a() {
/* 1 */             UsercentricsDomains usercentricsDomains = this.f8999b;
/* 7 */             if (usercentricsDomains.m2770a()) {
/* 9 */                 return usercentricsDomains.f6043b;
                    }
/* 14 */            int iOrdinal = this.f8998a.ordinal();
/* 18 */            if (iOrdinal == 0) {
/* 31 */                return "https://api.usercentrics.eu";
                    }
/* 21 */            if (iOrdinal == 1) {
/* 23 */                return "https://config.eu.usercentrics.eu";
                    }
/* 26 */            ds0.m3187b();
/* 29 */            return null;
                }
            }
