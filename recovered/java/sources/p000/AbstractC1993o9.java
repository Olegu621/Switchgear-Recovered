            package p000;

            import android.net.Uri;
            import android.os.Handler;
            import android.webkit.WebMessage;
            import android.webkit.WebMessagePort;
            import android.webkit.WebResourceError;
            import android.webkit.WebSettings;
            import android.webkit.WebView;
            
            /* JADX INFO: renamed from: o9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1993o9 {
                /* JADX INFO: renamed from: a */
                public static void m7114a(WebMessagePort webMessagePort) {
/* 1 */             webMessagePort.close();
                }

                /* JADX INFO: renamed from: b */
                public static WebMessage m7115b(i63 i63Var) {
                    WebMessagePort[] webMessagePortArr;
/* 4 */             i63Var.m4482a(0);
/* 7 */             String str = i63Var.f9473b;
/* 9 */             l63[] l63VarArr = i63Var.f9472a;
/* 11 */            if (l63VarArr == null) {
/* 13 */                webMessagePortArr = null;
                    } else {
/* 15 */                int length = l63VarArr.length;
/* 16 */                WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
/* 18 */                for (int i = 0; i < length; i++) {
/* 28 */                    webMessagePortArr2[i] = ((m63) l63VarArr[i]).m6611c();
                        }
/* 33 */                webMessagePortArr = webMessagePortArr2;
                    }
/* 34 */            return new WebMessage(str, webMessagePortArr);
                }

                /* JADX INFO: renamed from: c */
                public static WebMessagePort[] m7116c(WebView webView) {
/* 1 */             return webView.createWebMessageChannel();
                }

                /* JADX INFO: renamed from: d */
                public static i63 m7117d(WebMessage webMessage) {
                    l63[] l63VarArr;
/* 3 */             String data = webMessage.getData();
/* 7 */             WebMessagePort[] ports = webMessage.getPorts();
/* 11 */            if (ports == null) {
/* 13 */                l63VarArr = null;
                    } else {
/* 16 */                l63[] l63VarArr2 = new l63[ports.length];
/* 20 */                for (int i = 0; i < ports.length; i++) {
/* 29 */                    l63VarArr2[i] = new m63(ports[i]);
                        }
/* 34 */                l63VarArr = l63VarArr2;
                    }
/* 35 */            return new i63(data, l63VarArr);
                }

                /* JADX INFO: renamed from: e */
                public static CharSequence m7118e(WebResourceError webResourceError) {
/* 1 */             return webResourceError.getDescription();
                }

                /* JADX INFO: renamed from: f */
                public static int m7119f(WebResourceError webResourceError) {
/* 1 */             return webResourceError.getErrorCode();
                }

                /* JADX INFO: renamed from: g */
                public static boolean m7120g(WebSettings webSettings) {
/* 1 */             return webSettings.getOffscreenPreRaster();
                }

                /* JADX INFO: renamed from: h */
                public static void m7121h(WebMessagePort webMessagePort, WebMessage webMessage) {
/* 1 */             webMessagePort.postMessage(webMessage);
                }

                /* JADX INFO: renamed from: i */
                public static void m7122i(WebView webView, long j, w63 w63Var) {
/* 6 */             webView.postVisualStateCallback(j, new C1956n9());
                }

                /* JADX INFO: renamed from: j */
                public static void m7123j(WebView webView, WebMessage webMessage, Uri uri) {
/* 1 */             webView.postWebMessage(webMessage, uri);
                }

                /* JADX INFO: renamed from: k */
                public static void m7124k(WebSettings webSettings, boolean z) {
/* 1 */             webSettings.setOffscreenPreRaster(z);
                }

                /* JADX INFO: renamed from: l */
                public static void m7125l(WebMessagePort webMessagePort, k63 k63Var) {
/* 7 */             webMessagePort.setWebMessageCallback(new C1919m9(k63Var, 0));
                }

                /* JADX INFO: renamed from: m */
                public static void m7126m(WebMessagePort webMessagePort, k63 k63Var, Handler handler) {
/* 7 */             webMessagePort.setWebMessageCallback(new C1919m9(k63Var, 1), handler);
                }
            }
