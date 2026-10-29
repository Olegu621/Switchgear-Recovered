            package p000;

            import android.os.Looper;
            import android.webkit.TracingController;
            import android.webkit.WebView;
            import java.io.OutputStream;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: t9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2210t9 {
                /* JADX INFO: renamed from: a */
                public static TracingController m8731a() {
/* 1 */             return TracingController.getInstance();
                }

                /* JADX INFO: renamed from: b */
                public static ClassLoader m8732b() {
/* 1 */             return WebView.getWebViewClassLoader();
                }

                /* JADX INFO: renamed from: c */
                public static Looper m8733c(WebView webView) {
/* 1 */             return webView.getWebViewLooper();
                }

                /* JADX INFO: renamed from: d */
                public static boolean m8734d(TracingController tracingController) {
/* 1 */             return tracingController.isTracing();
                }

                /* JADX INFO: renamed from: e */
                public static void m8735e(String str) {
/* 1 */             WebView.setDataDirectorySuffix(str);
                }

                /* JADX INFO: renamed from: f */
                public static void m8736f(TracingController tracingController, pq2 pq2Var) {
/* 1 */             tracingController.start(AbstractC2090q0.m7652g().addCategories(pq2Var.f15251a).addCategories(pq2Var.f15252b).setTracingMode(pq2Var.f15253c).build());
                }

                /* JADX INFO: renamed from: g */
                public static boolean m8737g(TracingController tracingController, OutputStream outputStream, Executor executor) {
/* 1 */             return tracingController.stop(outputStream, executor);
                }
            }
