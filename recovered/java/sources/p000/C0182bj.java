            package p000;
            
            /* JADX INFO: renamed from: bj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0182bj {

                /* JADX INFO: renamed from: a */
                public final xu0 f2441a;

                /* JADX INFO: renamed from: b */
                public final hb1 f2442b;

                /* JADX INFO: renamed from: c */
                public final String f2443c;

                public C0182bj(xu0 xu0Var, hb1 hb1Var, String str) {
/* 1 */             xu0Var.getClass();
/* 4 */             hb1Var.getClass();
/* 7 */             str.getClass();
/* 13 */            this.f2441a = xu0Var;
/* 15 */            this.f2442b = hb1Var;
/* 17 */            this.f2443c = str;
                }

                /* JADX INFO: renamed from: a */
                public final void m1362a(String str) {
                    String str2;
/* 1 */             str.getClass();
/* 8 */             int iOrdinal = this.f2442b.f8998a.ordinal();
/* 12 */            int i = 1;
/* 13 */            if (iOrdinal == 0) {
/* 24 */                str2 = "https://app.usercentrics.eu/session/1px.png";
                    } else {
/* 15 */                if (iOrdinal != 1) {
/* 20 */                    ds0.m3187b();
/* 23 */                    return;
                        }
/* 17 */                str2 = "https://app.eu.usercentrics.eu/session/1px.png";
                    }
/* 52 */            String str3 = str2 + "?appId=" + this.f2443c + "&settingsId=" + str;
/* 56 */            xu0 xu0Var = this.f2441a;
/* 58 */            xu0Var.getClass();
/* 70 */            C0875ec c0875ecM9743b = xu0Var.f19381c.m9743b(new C2107qh(xu0Var, str3, null, 4));
/* 81 */            c0875ecM9743b.m3370H(new nk2(i, 10));
/* 91 */            c0875ecM9743b.m3369G(new nk2(i, 11));
                }
            }
