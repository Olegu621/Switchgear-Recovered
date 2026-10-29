            package p000;

            import android.webkit.WebView;
            import com.supercell.titan.TitanWebView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class fp2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8309a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TitanWebView f8310b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f8311c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f8312d;

                public /* synthetic */ fp2(TitanWebView titanWebView, String str, String str2, int i) {
/* 1 */             this.f8309a = i;
/* 3 */             this.f8310b = titanWebView;
/* 5 */             this.f8311c = str;
/* 7 */             this.f8312d = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f8309a;
/* 4 */             String str = this.f8312d;
/* 6 */             String str2 = this.f8311c;
/* 8 */             TitanWebView titanWebView = this.f8310b;
                    switch (i) {
                        case 0:
/* 44 */                    WebView webView = titanWebView.f5959o;
/* 46 */                    if (webView != null) {
/* 59 */                        webView.evaluateJavascript(fm0.m3785k("window.bridge = window.bridge || {};window.bridge.", str2, " = ", str, ";"), null);
                                break;
                            }
                            break;
                        default:
/* 13 */                    WebView webView2 = titanWebView.f5959o;
/* 15 */                    if (webView2 != null) {
/* 24 */                        StringBuilder sbM3514r = AbstractC0886en.m3514r("window.__bridgeCallbacks['", str2, "']('", str, "');delete window.__bridgeCallbacks['");
/* 28 */                        sbM3514r.append(str2);
/* 33 */                        sbM3514r.append("'];");
/* 40 */                        webView2.evaluateJavascript(sbM3514r.toString(), null);
                                break;
                            }
                            break;
                    }
                }
            }
