            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k42 {
                /* JADX INFO: renamed from: a */
                public static l42 m5948a(int i) throws Throwable {
/* 1 */             if (i == 0) {
/* 27 */                return l42.NOT_ALLOWED;
                    }
/* 4 */             if (i == 1) {
/* 24 */                return l42.REQUIRE_CONSENT;
                    }
/* 7 */             if (i == 2) {
/* 9 */                 return l42.REQUIRE_LI;
                    }
/* 23 */            throw new Throwable(fm0.m3781g(i, "Invalid Value for RestrictionType: "));
                }
            }
