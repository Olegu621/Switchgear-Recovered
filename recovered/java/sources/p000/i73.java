            package p000;

            import android.webkit.WebViewRenderProcess;
            import java.lang.ref.WeakReference;
            import java.util.WeakHashMap;
            import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i73 extends f73 {

                /* JADX INFO: renamed from: c */
                public static final WeakHashMap f9490c = new WeakHashMap();

                /* JADX INFO: renamed from: a */
                public WebViewRendererBoundaryInterface f9491a;

                /* JADX INFO: renamed from: b */
                public WeakReference f9492b;

                @Override // p000.f73
                /* JADX INFO: renamed from: a */
                public final boolean mo3675a() {
/* 1 */             C1823k9 c1823k9 = b73.f2324y;
/* 7 */             if (c1823k9.mo6026a()) {
/* 15 */                WebViewRenderProcess webViewRenderProcessM3225k = dt1.m3225k(this.f9492b.get());
                        return webViewRenderProcessM3225k != null && AbstractC2247u9.m8980g(webViewRenderProcessM3225k);
                    }
/* 35 */            if (c1823k9.mo97b()) {
/* 39 */                return this.f9491a.terminate();
                    }
/* 48 */            throw b73.m1295a();
                }
            }
