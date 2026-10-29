            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k03 implements i03 {
                public static final j03 Companion = new j03();

                /* JADX INFO: renamed from: a */
                public final l03 f12558a;

                public k03(l03 l03Var, ec0 ec0Var) {
/* 1 */             l03Var.getClass();
/* 7 */             this.f12558a = l03Var;
                }

                @Override // p000.i03
                /* JADX INFO: renamed from: a */
                public final void mo2906a(String str, Exception exc) {
/* 1 */             str.getClass();
/* 4 */             l03 l03Var = l03.f13072d;
/* 8 */             if (this.f12558a == l03Var) {
/* 10 */                m5932e(l03Var, str, exc);
                    }
                }

                @Override // p000.i03
                /* JADX INFO: renamed from: b */
                public final void mo2907b(String str, Throwable th) {
/* 1 */             str.getClass();
/* 6 */             int iOrdinal = this.f12558a.ordinal();
/* 10 */            l03 l03Var = l03.f13070b;
/* 13 */            if (iOrdinal >= 1) {
/* 15 */                m5932e(l03Var, str, th);
                    }
                }

                @Override // p000.i03
                /* JADX INFO: renamed from: c */
                public final void mo2908c(String str, vz2 vz2Var) {
/* 3 */             int iOrdinal = this.f12558a.ordinal();
/* 7 */             l03 l03Var = l03.f13071c;
/* 10 */            if (iOrdinal >= 2) {
/* 12 */                m5932e(l03Var, str, vz2Var);
                    }
                }

                @Override // p000.i03
                /* JADX INFO: renamed from: d */
                public final void mo2909d(tz2 tz2Var) {
/* 1 */             tz2Var.getClass();
/* 4 */             vz2 vz2Var = tz2Var.f17320a;
/* 8 */             mo2907b(vz2Var.f18403a, vz2Var);
                }

                /* JADX INFO: renamed from: e */
                public final void m5932e(l03 l03Var, String str, Throwable th) {
/* 30 */            System.out.println((Object) fm0.m3785k("[USERCENTRICS][", l03Var.name(), "] ", str, th != null ? AbstractC0886en.m3507k(" | cause: ", jf0.m5799b(th)) : HttpUrl.FRAGMENT_ENCODE_SET));
                }
            }
