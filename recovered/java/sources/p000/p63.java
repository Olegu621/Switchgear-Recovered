            package p000;

            import android.webkit.WebSettings;
            import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class p63 {
                /* JADX INFO: renamed from: a */
                public static er0 m7342a(WebSettings webSettings) {
/* 23 */            return new er0((WebSettingsBoundaryInterface) j13.m5642b(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) c73.f2756a.f7853b).convertSettings(webSettings)), 25);
                }

                /* JADX INFO: renamed from: b */
                public static void m7343b(WebSettings webSettings, int i) {
/* 1 */             C1823k9 c1823k9 = b73.f2291G;
/* 7 */             if (c1823k9.mo6026a()) {
/* 9 */                 AbstractC2247u9.m8977d(webSettings, i);
                    } else {
/* 17 */                if (!c1823k9.mo97b()) {
/* 35 */                    throw b73.m1295a();
                        }
/* 27 */                ((WebSettingsBoundaryInterface) m7342a(webSettings).f7853b).setForceDark(i);
                    }
                }

                /* JADX INFO: renamed from: c */
                public static void m7344c(WebSettings webSettings, boolean z) {
/* 1 */             C1823k9 c1823k9 = b73.f2301b;
/* 7 */             if (c1823k9.mo6026a()) {
/* 9 */                 AbstractC2099q9.m7740e(webSettings, z);
                    } else {
/* 17 */                if (!c1823k9.mo97b()) {
/* 35 */                    throw b73.m1295a();
                        }
/* 27 */                ((WebSettingsBoundaryInterface) m7342a(webSettings).f7853b).setSafeBrowsingEnabled(z);
                    }
                }
            }
