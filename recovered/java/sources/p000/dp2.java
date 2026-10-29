            package p000;

            import android.webkit.WebView;
            import com.supercell.titan.TitanWebView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class dp2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7360a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TitanWebView f7361b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f7362c;

                public /* synthetic */ dp2(TitanWebView titanWebView, String str, int i) {
/* 1 */             this.f7360a = i;
/* 3 */             this.f7361b = titanWebView;
/* 5 */             this.f7362c = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7360a;
/* 8 */             String str = this.f7362c;
/* 10 */            TitanWebView titanWebView = this.f7361b;
                    switch (i) {
                        case 0:
/* 116 */                   WebView webView = titanWebView.f5959o;
/* 118 */                   if (webView != null) {
/* 125 */                       StringBuilder sbM3513q = AbstractC0886en.m3513q("window.bridge = window.bridge || {};window.bridge.", str, " = ");
/* 148 */                       sbM3513q.append("function(params = '') { return bridge.postMessage(\"" + str + "\", params); }");
/* 151 */                       sbM3513q.append(";");
/* 158 */                       webView.evaluateJavascript(sbM3513q.toString(), null);
                                break;
                            }
                            break;
                        case 1:
/* 92 */                    WebView webView2 = titanWebView.f5959o;
/* 94 */                    if (webView2 != null) {
/* 112 */                       webView2.evaluateJavascript("delete window.bridge." + str + ";", null);
                                break;
                            }
                            break;
                        case 2:
/* 83 */                    WebView webView3 = titanWebView.f5959o;
/* 85 */                    if (webView3 != null) {
/* 88 */                        webView3.evaluateJavascript(str, null);
                                break;
                            }
                            break;
                        case 3:
/* 50 */                    titanWebView.m2747a();
/* 53 */                    WebView webView4 = titanWebView.f5959o;
/* 55 */                    if (webView4 != null) {
/* 58 */                        int i2 = titanWebView.f5958n;
/* 60 */                        if (i2 > 0) {
/* 66 */                            RunnableC2558zo runnableC2558zo = new RunnableC2558zo(14, titanWebView, webView4, str);
/* 69 */                            titanWebView.f5944C = runnableC2558zo;
/* 74 */                            titanWebView.f5943B.postDelayed(runnableC2558zo, i2);
                                }
/* 77 */                        webView4.loadUrl(str);
/* 80 */                        titanWebView.f5955k = str;
                                break;
                            }
                            break;
                        case 4:
/* 26 */                    WebView webView5 = titanWebView.f5959o;
/* 28 */                    if (webView5 != null) {
/* 46 */                        webView5.evaluateJavascript("delete window.bridge." + str + ";", null);
                                break;
                            }
                            break;
                        default:
/* 15 */                    WebView webView6 = titanWebView.f5959o;
/* 17 */                    if (webView6 != null) {
/* 22 */                        webView6.loadData(str, "text/html", null);
                                break;
                            }
                            break;
                    }
                }
            }
