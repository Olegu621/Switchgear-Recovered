            package p000;

            import android.content.Intent;
            import android.net.Uri;
            import android.os.Message;
            import android.webkit.ConsoleMessage;
            import android.webkit.WebChromeClient;
            import android.webkit.WebView;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ys0 extends WebChromeClient {

                /* JADX INFO: renamed from: a */
                public ra2 f19800a;

                @Override // android.webkit.WebChromeClient
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
/* 47 */            he3.m4188i(consoleMessage.messageLevel(), "HCWVClient", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
/* 50 */            return super.onConsoleMessage(consoleMessage);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
/* 1 */             ra2 ra2Var = this.f19800a;
/* 3 */             boolean z3 = false;
/* 4 */             if (!z2) {
/* 3 */                 return false;
                    }
/* 7 */             WebView.HitTestResult hitTestResult = webView.getHitTestResult();
/* 11 */            int type = hitTestResult.getType();
/* 15 */            String extra = hitTestResult.getExtra();
/* 20 */            if (type == 2) {
/* 30 */                extra = AbstractC0886en.m3507k("tel:", extra);
                    } else if (type != 7) {
/* 25 */                extra = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 38 */            if (b40.m1234r(extra)) {
/* 44 */                Intent intent = new Intent("android.intent.action.VIEW");
/* 51 */                intent.setData(Uri.parse(extra));
/* 65 */                ((ra2) ra2Var.f15957c).m8115t(new cp0(ra2Var, intent, 9, z3));
/* 102 */               return true;
                    }
/* 75 */            WebView webView2 = new WebView(webView.getContext());
/* 89 */            ((ra2) ra2Var.f15957c).m8115t(new dp0(ra2Var, webView2, 11, z3));
/* 96 */            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
/* 99 */            message.sendToTarget();
/* 102 */           return true;
                }
            }
