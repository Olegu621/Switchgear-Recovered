            package p000;

            import android.content.ActivityNotFoundException;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Message;
            import android.webkit.ConsoleMessage;
            import android.webkit.ValueCallback;
            import android.webkit.WebChromeClient;
            import android.webkit.WebView;
            import java.lang.ref.WeakReference;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ns0 extends WebChromeClient {

                /* JADX INFO: renamed from: a */
                public final eq2 f14418a;

                /* JADX INFO: renamed from: b */
                public ValueCallback f14419b;

                public ns0(eq2 eq2Var) {
/* 4 */             this.f14418a = eq2Var;
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
/* 47 */            he3.m4188i(consoleMessage.messageLevel(), "chatWVClient", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
/* 50 */            return super.onConsoleMessage(consoleMessage);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
/* 2 */             if (!z2) {
/* 1 */                 return false;
                    }
/* 5 */             WebView.HitTestResult hitTestResult = webView.getHitTestResult();
/* 9 */             int type = hitTestResult.getType();
/* 13 */            String extra = hitTestResult.getExtra();
/* 18 */            if (type == 2) {
/* 28 */                extra = AbstractC0886en.m3507k("tel:", extra);
                    } else if (type != 7) {
/* 23 */                extra = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 32 */            boolean zM1234r = b40.m1234r(extra);
/* 37 */            eq2 eq2Var = this.f14418a;
/* 39 */            if (!zM1234r) {
/* 83 */                WebView webView2 = new WebView(webView.getContext());
/* 97 */                ((ra2) eq2Var.f7832a).m8115t(new cp0(eq2Var, webView2, 8, false));
/* 104 */               ((WebView.WebViewTransport) message.obj).setWebView(webView2);
/* 107 */               message.sendToTarget();
/* 36 */                return true;
                    }
/* 49 */            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(extra));
/* 60 */            ls0 ls0Var = (ls0) ((WeakReference) eq2Var.f7838i).get();
/* 62 */            if (ls0Var != null) {
                        try {
/* 64 */                    ls0Var.startActivity(intent);
/* 36 */                    return true;
                        } catch (Exception e) {
/* 73 */                    xe2.m9777o("HSChatFragment", "Error in opening a link in system app", e);
                        }
                    }
/* 36 */            return true;
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
/* 7 */             if (this.f14419b != null) {
/* 11 */                xe2.m9775m("chatWVClient", "filePathCallback is not null, returning false.", null);
/* 16 */                this.f14419b.onReceiveValue(null);
/* 19 */                this.f14419b = null;
/* 3 */                 return false;
                    }
/* 22 */            this.f14419b = valueCallback;
/* 24 */            eq2 eq2Var = this.f14418a;
/* 34 */            ls0 ls0Var = (ls0) ((WeakReference) eq2Var.f7838i).get();
/* 36 */            if (ls0Var != null) {
/* 38 */                ls0Var.f13476a = valueCallback;
                    }
                    try {
/* 41 */                Intent intentCreateIntent = fileChooserParams.createIntent();
/* 47 */                intentCreateIntent.setType("*/*");
/* 50 */                String[] acceptTypes = fileChooserParams.getAcceptTypes();
/* 55 */                if (acceptTypes.length != 0) {
/* 59 */                    intentCreateIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
                        }
/* 69 */                intentCreateIntent.setAction("android.intent.action.OPEN_DOCUMENT");
/* 74 */                intentCreateIntent.addCategory("android.intent.category.OPENABLE");
/* 79 */                xe2.m9775m("chatWVClient", "Starting open file chooser request.", null);
/* 90 */                ls0 ls0Var2 = (ls0) ((WeakReference) eq2Var.f7838i).get();
/* 92 */                if (ls0Var2 != null) {
/* 94 */                    ls0Var2.f13477b = false;
/* 98 */                    ls0Var2.startActivityForResult(intentCreateIntent, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        }
/* 103 */               xe2.m9775m("chatWVClient", "onShowFileChooser success, returning true", null);
/* 40 */                return true;
                    } catch (ActivityNotFoundException e) {
/* 117 */               xe2.m9777o("chatWVClient", "ActivityNotFoundException error in opening the attachment file chooser.", e);
/* 120 */               this.f14419b = null;
/* 40 */                return true;
                    } catch (Exception e2) {
/* 109 */               xe2.m9777o("chatWVClient", "error in opening the attachment in browser window, returning false", e2);
/* 112 */               this.f14419b = null;
/* 3 */                 return false;
                    }
                }
            }
