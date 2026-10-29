            package p000;

            import android.content.Context;
            import android.webkit.ServiceWorkerClient;
            import android.webkit.ServiceWorkerController;
            import android.webkit.ServiceWorkerWebSettings;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebSettings;
            import java.io.File;
            
            /* JADX INFO: renamed from: p9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2062p9 {
                /* JADX INFO: renamed from: a */
                public static boolean m7354a(ServiceWorkerWebSettings serviceWorkerWebSettings) {
/* 1 */             return serviceWorkerWebSettings.getAllowContentAccess();
                }

                /* JADX INFO: renamed from: b */
                public static boolean m7355b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
/* 1 */             return serviceWorkerWebSettings.getAllowFileAccess();
                }

                /* JADX INFO: renamed from: c */
                public static boolean m7356c(ServiceWorkerWebSettings serviceWorkerWebSettings) {
/* 1 */             return serviceWorkerWebSettings.getBlockNetworkLoads();
                }

                /* JADX INFO: renamed from: d */
                public static int m7357d(ServiceWorkerWebSettings serviceWorkerWebSettings) {
/* 1 */             return serviceWorkerWebSettings.getCacheMode();
                }

                /* JADX INFO: renamed from: e */
                public static File m7358e(Context context) {
/* 1 */             return context.getDataDir();
                }

                /* JADX INFO: renamed from: f */
                public static int m7359f(WebSettings webSettings) {
/* 1 */             return webSettings.getDisabledActionModeMenuItems();
                }

                /* JADX INFO: renamed from: g */
                public static ServiceWorkerController m7360g() {
/* 1 */             return ServiceWorkerController.getInstance();
                }

                /* JADX INFO: renamed from: h */
                public static ServiceWorkerWebSettings m7361h(ServiceWorkerController serviceWorkerController) {
/* 1 */             return serviceWorkerController.getServiceWorkerWebSettings();
                }

                /* JADX INFO: renamed from: i */
                public static wa2 m7362i(ServiceWorkerController serviceWorkerController) {
/* 3 */             ServiceWorkerWebSettings serviceWorkerWebSettingsM7361h = m7361h(serviceWorkerController);
/* 7 */             wa2 wa2Var = new wa2();
/* 10 */            wa2Var.f18543a = serviceWorkerWebSettingsM7361h;
/* 12 */            return wa2Var;
                }

                /* JADX INFO: renamed from: j */
                public static boolean m7363j(WebResourceRequest webResourceRequest) {
/* 1 */             return webResourceRequest.isRedirect();
                }

                /* JADX INFO: renamed from: k */
                public static void m7364k(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
/* 1 */             serviceWorkerWebSettings.setAllowContentAccess(z);
                }

                /* JADX INFO: renamed from: l */
                public static void m7365l(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
/* 1 */             serviceWorkerWebSettings.setAllowFileAccess(z);
                }

                /* JADX INFO: renamed from: m */
                public static void m7366m(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
/* 1 */             serviceWorkerWebSettings.setBlockNetworkLoads(z);
                }

                /* JADX INFO: renamed from: n */
                public static void m7367n(ServiceWorkerWebSettings serviceWorkerWebSettings, int i) {
/* 1 */             serviceWorkerWebSettings.setCacheMode(i);
                }

                /* JADX INFO: renamed from: o */
                public static void m7368o(WebSettings webSettings, int i) {
/* 1 */             webSettings.setDisabledActionModeMenuItems(i);
                }

                /* JADX INFO: renamed from: p */
                public static void m7369p(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
/* 1 */             serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
                }

                /* JADX INFO: renamed from: q */
                public static void m7370q(ServiceWorkerController serviceWorkerController, sa2 sa2Var) {
/* 6 */             serviceWorkerController.setServiceWorkerClient(new tn0(sa2Var));
                }
            }
