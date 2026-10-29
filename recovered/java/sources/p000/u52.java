            package p000;

            import android.webkit.SafeBrowsingResponse;
            import java.lang.reflect.Proxy;
            import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u52 extends t52 {

                /* JADX INFO: renamed from: a */
                public SafeBrowsingResponse f17363a;

                /* JADX INFO: renamed from: b */
                public SafeBrowsingResponseBoundaryInterface f17364b;

                @Override // p000.t52
                /* JADX INFO: renamed from: a */
                public final void mo8699a(boolean z) {
/* 1 */             C1823k9 c1823k9 = b73.f2317r;
/* 7 */             if (c1823k9.mo6026a()) {
/* 13 */                AbstractC2173s9.m8439e(m8960c(), z);
                    } else {
/* 21 */                if (!c1823k9.mo97b()) {
/* 35 */                    throw b73.m1295a();
                        }
/* 27 */                m8959b().showInterstitial(z);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final SafeBrowsingResponseBoundaryInterface m8959b() {
/* 3 */             if (this.f17364b == null) {
/* 5 */                 er0 er0Var = c73.f2756a;
/* 25 */                this.f17364b = (SafeBrowsingResponseBoundaryInterface) j13.m5642b(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) er0Var.f7853b).convertSafeBrowsingResponse(this.f17363a));
                    }
/* 27 */            return this.f17364b;
                }

                /* JADX INFO: renamed from: c */
                public final SafeBrowsingResponse m8960c() {
/* 3 */             if (this.f17363a == null) {
/* 5 */                 er0 er0Var = c73.f2756a;
/* 25 */                this.f17363a = AbstractC2136r9.m8087b(((WebkitToCompatConverterBoundaryInterface) er0Var.f7853b).convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f17364b)));
                    }
/* 27 */            return this.f17363a;
                }
            }
