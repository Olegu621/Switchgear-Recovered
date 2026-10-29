            package io.flutter.plugins.urllauncher;

            import android.app.Activity;
            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.os.Bundle;
            import android.os.Message;
            import android.view.KeyEvent;
            import android.webkit.WebChromeClient;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebViewActivity extends Activity {
                public static final String ACTION_CLOSE = "close action";
                static final String ENABLE_DOM_EXTRA = "enableDomStorage";
                static final String ENABLE_JS_EXTRA = "enableJavaScript";
                static final String URL_EXTRA = "url";
                WebView webview;
                private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: io.flutter.plugins.urllauncher.WebViewActivity.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
/* 11 */                if (WebViewActivity.ACTION_CLOSE.equals(intent.getAction())) {
/* 15 */                    WebViewActivity.this.finish();
                        }
                    }
                };
                private final WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.urllauncher.WebViewActivity.2
                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
/* 9 */                 webView.loadUrl(webResourceRequest.getUrl().toString());
/* 12 */                return false;
                    }
                };
                private final IntentFilter closeIntentFilter = new IntentFilter(ACTION_CLOSE);

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class FlutterWebChromeClient extends WebChromeClient {
                    public FlutterWebChromeClient() {
                    }

                    @Override // android.webkit.WebChromeClient
                    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
/* 3 */                 WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.urllauncher.WebViewActivity.FlutterWebChromeClient.1
                            @Override // android.webkit.WebViewClient
                            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
/* 15 */                        WebViewActivity.this.webview.loadUrl(webResourceRequest.getUrl().toString());
/* 18 */                        return true;
                            }

                            @Override // android.webkit.WebViewClient
/* 19 */                    public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
/* 20 */                        WebViewActivity.this.webview.loadUrl(str);
                                return true;
                            }
                        };
/* 16 */                WebView webView2 = new WebView(WebViewActivity.this.webview.getContext());
/* 19 */                webView2.setWebViewClient(webViewClient);
/* 26 */                ((WebView.WebViewTransport) message.obj).setWebView(webView2);
/* 29 */                message.sendToTarget();
/* 32 */                return true;
                    }
                }

                public static Intent createIntent(Context context, String str, boolean z, boolean z2, Bundle bundle) {
/* 28 */            return new Intent(context, (Class<?>) WebViewActivity.class).putExtra(URL_EXTRA, str).putExtra(ENABLE_JS_EXTRA, z).putExtra(ENABLE_DOM_EXTRA, z2).putExtra("com.android.browser.headers", bundle);
                }

                public static Map<String, String> extractHeaders(Bundle bundle) {
/* 1 */             if (bundle == null) {
/* 3 */                 return Collections.EMPTY_MAP;
                    }
/* 8 */             HashMap map = new HashMap();
/* 23 */            for (String str : bundle.keySet()) {
/* 35 */                map.put(str, bundle.getString(str));
                    }
/* 39 */            return map;
                }

                @Override // android.app.Activity
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 6 */             WebView webView = new WebView(this);
/* 9 */             this.webview = webView;
/* 11 */            setContentView(webView);
/* 14 */            Intent intent = getIntent();
/* 20 */            String stringExtra = intent.getStringExtra(URL_EXTRA);
/* 27 */            boolean booleanExtra = intent.getBooleanExtra(ENABLE_JS_EXTRA, false);
/* 33 */            boolean booleanExtra2 = intent.getBooleanExtra(ENABLE_DOM_EXTRA, false);
/* 49 */            this.webview.loadUrl(stringExtra, extractHeaders(intent.getBundleExtra("com.android.browser.headers")));
/* 58 */            this.webview.getSettings().setJavaScriptEnabled(booleanExtra);
/* 67 */            this.webview.getSettings().setDomStorageEnabled(booleanExtra2);
/* 74 */            this.webview.setWebViewClient(this.webViewClient);
/* 84 */            this.webview.getSettings().setSupportMultipleWindows(true);
/* 94 */            this.webview.setWebChromeClient(new FlutterWebChromeClient());
/* 102 */           v00.registerReceiver(this, this.broadcastReceiver, this.closeIntentFilter, 2);
                }

                @Override // android.app.Activity
                public void onDestroy() {
/* 1 */             super.onDestroy();
/* 6 */             unregisterReceiver(this.broadcastReceiver);
                }

                @Override // android.app.Activity, android.view.KeyEvent.Callback
                public boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 2 */             if (i != 4 || !this.webview.canGoBack()) {
/* 19 */                return super.onKeyDown(i, keyEvent);
                    }
/* 14 */            this.webview.goBack();
/* 17 */            return true;
                }
            }
