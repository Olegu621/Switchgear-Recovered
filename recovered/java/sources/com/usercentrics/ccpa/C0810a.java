            package com.usercentrics.ccpa;

            import p000.AbstractC0885em;
            import p000.C1983o;
            import p000.C2502yl;
            import p000.C2561zr;
            import p000.od2;
            import p000.qc3;
            
            /* JADX INFO: renamed from: com.usercentrics.ccpa.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0810a {
                public static final C2561zr Companion = new C2561zr();

                /* JADX INFO: renamed from: a */
                public final qc3 f6020a;

                /* JADX INFO: renamed from: b */
                public final C1983o f6021b;

                public C0810a(qc3 qc3Var, C1983o c1983o) {
/* 4 */             this.f6020a = qc3Var;
/* 6 */             this.f6021b = c1983o;
                }

                /* JADX INFO: renamed from: a */
                public final void m2768a(CCPAData cCPAData) {
/* 1 */             String strM2767a = cCPAData.m2767a();
/* 11 */            if (AbstractC0885em.f7791a.m6223b(strM2767a)) {
/* 21 */                ((od2) this.f6020a.f15492b).m7138d("IABUSPrivacy_String", strM2767a);
                    } else {
/* 27 */                C2502yl.Companion.getClass();
/* 42 */                throw new C2502yl("Invalid CCPA String: ".concat(strM2767a), null);
                    }
                }
            }
