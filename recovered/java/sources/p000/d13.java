            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d13 implements i03 {
                public static final c13 Companion = new c13();

                /* JADX INFO: renamed from: a */
                public final l03 f6960a;

                public d13(l03 l03Var) {
/* 1 */             l03Var.getClass();
/* 7 */             this.f6960a = l03Var;
                }

                /* JADX INFO: renamed from: e */
                public static void m2905e(l03 l03Var, String str, Throwable th) {
/* 30 */            System.out.println((Object) fm0.m3785k("[USERCENTRICS_UI][", l03Var.name(), "] ", str, th != null ? AbstractC0886en.m3507k(" | cause: ", jf0.m5799b(th)) : HttpUrl.FRAGMENT_ENCODE_SET));
                }

                @Override // p000.i03
                /* JADX INFO: renamed from: a */
                public final void mo2906a(String str, Exception exc) {
/* 1 */             str.getClass();
/* 4 */             l03 l03Var = l03.f13072d;
/* 8 */             if (this.f6960a == l03Var) {
/* 10 */                m2905e(l03Var, str, exc);
                    }
                }

                @Override // p000.i03
                /* JADX INFO: renamed from: b */
                public final void mo2907b(String str, Throwable th) {
/* 1 */             str.getClass();
/* 6 */             int iOrdinal = this.f6960a.ordinal();
/* 10 */            l03 l03Var = l03.f13070b;
/* 13 */            if (iOrdinal >= 1) {
/* 15 */                m2905e(l03Var, str, th);
                    }
                }

                @Override // p000.i03
                /* JADX INFO: renamed from: c */
                public final void mo2908c(String str, vz2 vz2Var) {
/* 3 */             int iOrdinal = this.f6960a.ordinal();
/* 7 */             l03 l03Var = l03.f13071c;
/* 10 */            if (iOrdinal >= 2) {
/* 12 */                m2905e(l03Var, str, vz2Var);
                    }
                }

                @Override // p000.i03
                /* JADX INFO: renamed from: d */
                public final void mo2909d(tz2 tz2Var) {
/* 1 */             tz2Var.getClass();
/* 4 */             vz2 vz2Var = tz2Var.f17320a;
/* 8 */             mo2907b(vz2Var.f18403a, vz2Var);
                }
            }
