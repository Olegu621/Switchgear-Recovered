            package p000;

            import com.appsflyer.AppsFlyerConsent;
            import com.appsflyer.AppsFlyerLib;
            
            /* JADX INFO: renamed from: uc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2250uc extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f17445c;

                /* JADX INFO: renamed from: d */
                public final i03 f17446d;

                public C2250uc(i03 i03Var) {
/* 3 */             super("AppsFlyer", i03Var);
/* 6 */             this.f17445c = "AppsFlyer";
/* 8 */             this.f17446d = i03Var;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 4 */                 int iOrdinal = g13Var.ordinal();
/* 9 */                 if (iOrdinal == 0) {
/* 77 */                    AppsFlyerLib.getInstance().setConsentData(new AppsFlyerConsent(Boolean.TRUE, Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
                        } else if (iOrdinal == 1) {
/* 50 */                    AppsFlyerLib.getInstance().setConsentData(new AppsFlyerConsent(Boolean.FALSE, Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
                        } else if (iOrdinal == 2) {
/* 21 */                    AppsFlyerLib.getInstance().enableTCFDataCollection(true);
                        }
/* 8 */                 return true;
                    } catch (Exception e) {
/* 81 */                m3063f(e);
/* 84 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f17446d;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f17445c;
                }
            }
