            package p000;

            import android.webkit.ServiceWorkerClient;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tn0 extends ServiceWorkerClient {

                /* JADX INFO: renamed from: a */
                public final sa2 f17191a;

                public tn0(sa2 sa2Var) {
/* 4 */             this.f17191a = sa2Var;
                }

                @Override // android.webkit.ServiceWorkerClient
                public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
/* 3 */             return this.f17191a.shouldInterceptRequest(webResourceRequest);
                }
            }
