            package p000;

            import android.webkit.ServiceWorkerWebSettings;
            import java.lang.reflect.Proxy;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wa2 {

                /* JADX INFO: renamed from: a */
                public ServiceWorkerWebSettings f18543a;

                /* JADX INFO: renamed from: a */
                public final ServiceWorkerWebSettings m9511a() {
/* 3 */             if (this.f18543a == null) {
/* 5 */                 er0 er0Var = c73.f2756a;
/* 22 */                this.f18543a = (ServiceWorkerWebSettings) ((WebkitToCompatConverterBoundaryInterface) er0Var.f7853b).convertServiceWorkerSettings(Proxy.getInvocationHandler(null));
                    }
/* 24 */            return this.f18543a;
                }
            }
