            package p000;

            import android.content.Context;
            import android.webkit.CookieManager;
            import android.webkit.WebView;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.TitanWebView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class cp2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f6870a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TitanWebView f6871b;

                public /* synthetic */ cp2(TitanWebView titanWebView, int i) {
/* 1 */             this.f6870a = i;
/* 3 */             this.f6871b = titanWebView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FrameLayout frameLayout;
                    Context context;
/* 1 */             int i = this.f6870a;
/* 6 */             TitanWebView titanWebView = this.f6871b;
                    switch (i) {
                        case 0:
/* 139 */                   WebView webView = titanWebView.f5959o;
/* 141 */                   if (webView != null && (frameLayout = titanWebView.f5948d) != null && (context = frameLayout.getContext()) != null) {
/* 172 */                       webView.getSettings().setTextZoom((int) (100.0f / context.getResources().getConfiguration().fontScale));
                            }
                            break;
                        case 1:
/* 130 */                   WebView webView2 = titanWebView.f5959o;
/* 132 */                   if (webView2 != null) {
/* 135 */                       webView2.reload();
                                break;
                            }
                            break;
                        case 2:
/* 98 */                    ImageView imageView = titanWebView.f5951g;
/* 100 */                   if (imageView != null) {
/* 103 */                       int i2 = titanWebView.f5952h;
/* 105 */                       if (i2 != 0) {
/* 116 */                           imageView.setImageResource(i2);
/* 126 */                           titanWebView.f5951g.setVisibility(titanWebView.f5954j ? 0 : 8);
                                } else {
/* 107 */                           imageView.setImageDrawable(null);
/* 112 */                           titanWebView.f5951g.setVisibility(8);
                                }
                                break;
                            }
                            break;
                        case 3:
/* 73 */                    CookieManager cookieManager = CookieManager.getInstance();
/* 77 */                    cookieManager.removeAllCookies(null);
/* 80 */                    cookieManager.flush();
/* 94 */                    GameApp.getInstance().runOnView(new cp2(titanWebView, 9));
                            break;
                        case 4:
/* 64 */                    WebView webView3 = titanWebView.f5959o;
/* 66 */                    if (webView3 != null) {
/* 69 */                        webView3.goBack();
                                break;
                            }
                            break;
                        case 5:
/* 60 */                    titanWebView.m2749c();
                            break;
                        case 6:
/* 29 */                    WebView webView4 = titanWebView.f5959o;
/* 31 */                    if (webView4 != null) {
/* 34 */                        titanWebView.hide();
/* 39 */                        webView4.removeJavascriptInterface("messageHandler");
/* 43 */                        webView4.clearCache(true);
/* 48 */                        webView4.loadUrl("about:blank");
/* 51 */                        webView4.freeMemory();
/* 56 */                        titanWebView.f5953i.setVisibility(8);
                                break;
                            }
                            break;
                        case 7:
/* 19 */                    WebView webView5 = titanWebView.f5959o;
/* 21 */                    if (webView5 != null) {
/* 25 */                        webView5.setBackgroundColor(titanWebView.f5967w);
                            }
                            break;
                        case 8:
/* 15 */                    titanWebView.hideNative();
                            break;
                        default:
/* 11 */                    titanWebView.onCookiesDeleted();
                            break;
                    }
                }
            }
