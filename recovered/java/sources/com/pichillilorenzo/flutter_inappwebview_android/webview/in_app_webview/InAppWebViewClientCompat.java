            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.net.http.SslError;
            import android.os.Message;
            import android.view.KeyEvent;
            import android.webkit.ClientCertRequest;
            import android.webkit.CookieManager;
            import android.webkit.HttpAuthHandler;
            import android.webkit.RenderProcessGoneDetail;
            import android.webkit.SslErrorHandler;
            import android.webkit.WebResourceError;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            import android.webkit.WebView;
            import androidx.webkit.WebViewClientCompat;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase;
            import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
            import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
            import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
            import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
            import java.io.ByteArrayInputStream;
            import java.lang.reflect.Proxy;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            import p000.AbstractC1993o9;
            import p000.AbstractC2062p9;
            import p000.AbstractC2173s9;
            import p000.C1823k9;
            import p000.b73;
            import p000.c73;
            import p000.er0;
            import p000.n63;
            import p000.o63;
            import p000.t52;
            import p000.u52;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 102 */   public class InAppWebViewClientCompat extends WebViewClientCompat {
                protected static final String LOG_TAG = "IAWebViewClientCompat";
                private static List<URLCredential> credentialsProposed;
                private static int previousAuthRequestFailureCount;
                private InAppBrowserDelegate inAppBrowserDelegate;

                /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat$7 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C07037 {

                    /* JADX INFO: renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy */
                    static final /* synthetic */ int[] f5341x6b372c03;

                    static {
/* 6 */                 int[] iArr = new int[NavigationActionPolicy.values().length];
/* 8 */                 f5341x6b372c03 = iArr;
                        try {
/* 17 */                    iArr[NavigationActionPolicy.ALLOW.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f5341x6b372c03[NavigationActionPolicy.CANCEL.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                public InAppWebViewClientCompat(InAppBrowserDelegate inAppBrowserDelegate) {
/* 4 */             this.inAppBrowserDelegate = inAppBrowserDelegate;
                }

                public static void access$601(InAppWebViewClientCompat inAppWebViewClientCompat, WebView webView, WebResourceRequest webResourceRequest, int i, t52 t52Var) {
/* 1 */             inAppWebViewClientCompat.getClass();
/* 10 */            if (!xe2.m9786x("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
/* 21 */                throw b73.m1295a();
                    }
/* 13 */            t52Var.mo8699a(true);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void allowShouldOverrideUrlLoading(WebView webView, String str, Map<String, String> map, boolean z) {
/* 1 */             if (z) {
/* 3 */                 webView.loadUrl(str, map);
                    }
                }

                public void dispose() {
/* 3 */             if (this.inAppBrowserDelegate != null) {
/* 6 */                 this.inAppBrowserDelegate = null;
                    }
                }

                @Override // android.webkit.WebViewClient
                public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
/* 1 */             super.doUpdateVisitedHistory(webView, str, z);
/* 4 */             String url = webView.getUrl();
/* 8 */             InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
/* 10 */            if (inAppBrowserDelegate != null) {
/* 12 */                inAppBrowserDelegate.didUpdateVisitedHistory(url);
                    }
/* 17 */            WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 19 */            if (webViewChannelDelegate != null) {
/* 21 */                webViewChannelDelegate.onUpdateVisitedHistory(url, z);
                    }
                }

                public void loadCustomJavaScriptOnPageFinished(WebView webView) {
/* 1 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 10 */            inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentEnd(), null);
                }

                public void loadCustomJavaScriptOnPageStarted(WebView webView) {
/* 1 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 9 */             if (xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 21 */                return;
                    }
/* 18 */            inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentStart(), null);
                }

                @Override // android.webkit.WebViewClient
                public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
/* 2 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 6 */             WebViewChannelDelegate.FormResubmissionCallback formResubmissionCallback = new WebViewChannelDelegate.FormResubmissionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.6
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(Integer num) {
/* 1 */                     InAppWebViewClientCompat.super.onFormResubmission(webView, message, message2);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((Integer) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(Integer num) {
/* 5 */                     if (num.intValue() != 0) {
/* 9 */                         message.sendToTarget();
/* 18 */                        return false;
                            }
/* 15 */                    message2.sendToTarget();
/* 18 */                    return false;
                        }
                    };
/* 9 */             WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 11 */            if (webViewChannelDelegate != null) {
/* 17 */                webViewChannelDelegate.onFormResubmission(inAppWebView.getUrl(), formResubmissionCallback);
                    } else {
/* 22 */                formResubmissionCallback.defaultBehaviour(null);
                    }
                }

                @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
                public void onPageCommitVisible(WebView webView, String str) {
/* 3 */             WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 5 */             if (webViewChannelDelegate != null) {
/* 7 */                 webViewChannelDelegate.onPageCommitVisible(str);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
/* 2 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 5 */             inAppWebView.isLoading = false;
/* 7 */             loadCustomJavaScriptOnPageFinished(inAppWebView);
/* 10 */            previousAuthRequestFailureCount = 0;
/* 13 */            credentialsProposed = null;
/* 15 */            super.onPageFinished(webView, str);
/* 18 */            InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
/* 20 */            if (inAppBrowserDelegate != null) {
/* 22 */                inAppBrowserDelegate.didFinishNavigation(str);
                    }
/* 29 */            CookieManager.getInstance().flush();
/* 34 */            inAppWebView.evaluateJavascript(JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE, null);
/* 37 */            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 39 */            if (webViewChannelDelegate != null) {
/* 41 */                webViewChannelDelegate.onLoadStop(str);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
/* 2 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 5 */             inAppWebView.isLoading = true;
/* 7 */             inAppWebView.disposeWebMessageChannels();
/* 12 */            inAppWebView.userContentController.resetContentWorlds();
/* 15 */            loadCustomJavaScriptOnPageStarted(inAppWebView);
/* 18 */            super.onPageStarted(webView, str, bitmap);
/* 21 */            InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
/* 23 */            if (inAppBrowserDelegate != null) {
/* 25 */                inAppBrowserDelegate.didStartNavigation(str);
                    }
/* 28 */            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 30 */            if (webViewChannelDelegate != null) {
/* 32 */                webViewChannelDelegate.onLoadStart(str);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
                    String scheme;
/* 1 */             String url = webView.getUrl();
/* 5 */             String host = clientCertRequest.getHost();
/* 9 */             int port = clientCertRequest.getPort();
/* 13 */            if (url != null) {
                        try {
/* 20 */                    scheme = new URI(url).getScheme();
                        } catch (URISyntaxException unused) {
/* 26 */                    scheme = "https";
                        }
                    } else {
/* 26 */                scheme = "https";
                    }
/* 50 */            ClientCertChallenge clientCertChallenge = new ClientCertChallenge(new URLProtectionSpace(host, scheme, null, port, webView.getCertificate(), null), clientCertRequest.getPrincipals(), clientCertRequest.getKeyTypes());
/* 54 */            final InAppWebView inAppWebView = (InAppWebView) webView;
/* 58 */            WebViewChannelDelegate.ReceivedClientCertRequestCallback receivedClientCertRequestCallback = new WebViewChannelDelegate.ReceivedClientCertRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.4
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(ClientCertResponse clientCertResponse) {
/* 1 */                     InAppWebViewClientCompat.super.onReceivedClientCertRequest(webView, clientCertRequest);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((ClientCertResponse) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(ClientCertResponse clientCertResponse) {
/* 1 */                     Integer action = clientCertResponse.getAction();
/* 6 */                     if (action == null || inAppWebView.plugin == null) {
/* 5 */                         return true;
                            }
/* 14 */                    int iIntValue = action.intValue();
/* 18 */                    if (iIntValue != 1) {
/* 20 */                        ClientCertRequest clientCertRequest2 = clientCertRequest;
/* 23 */                        if (iIntValue != 2) {
/* 25 */                            clientCertRequest2.cancel();
/* 68 */                            return false;
                                }
/* 29 */                        clientCertRequest2.ignore();
/* 68 */                        return false;
                            }
/* 49 */                    Util.PrivateKeyAndCertificates privateKeyAndCertificatesLoadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView.plugin, clientCertResponse.getCertificatePath(), clientCertResponse.getCertificatePassword(), clientCertResponse.getKeyStoreType());
/* 53 */                    ClientCertRequest clientCertRequest3 = clientCertRequest;
/* 55 */                    if (privateKeyAndCertificatesLoadPrivateKeyAndCertificate != null) {
/* 61 */                        clientCertRequest3.proceed(privateKeyAndCertificatesLoadPrivateKeyAndCertificate.privateKey, privateKeyAndCertificatesLoadPrivateKeyAndCertificate.certificates);
/* 68 */                        return false;
                            }
/* 65 */                    clientCertRequest3.cancel();
/* 68 */                    return false;
                        }
                    };
/* 61 */            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 63 */            if (webViewChannelDelegate != null) {
/* 65 */                webViewChannelDelegate.onReceivedClientCertRequest(clientCertChallenge, receivedClientCertRequestCallback);
                    } else {
/* 70 */                receivedClientCertRequestCallback.defaultBehaviour(null);
                    }
                }

                @Override // androidx.webkit.WebViewClientCompat
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, n63 n63Var) {
                    int iM7119f;
                    String string;
/* 1 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 7 */             if (webResourceRequest.isForMainFrame()) {
/* 17 */                if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
/* 19 */                    inAppWebView.stopLoading();
/* 24 */                    inAppWebView.loadUrl("about:blank");
                        }
/* 28 */                inAppWebView.isLoading = false;
/* 30 */                previousAuthRequestFailureCount = 0;
/* 33 */                credentialsProposed = null;
/* 37 */                if (this.inAppBrowserDelegate != null) {
/* 45 */                    if (xe2.m9786x("WEB_RESOURCE_ERROR_GET_CODE")) {
/* 48 */                        o63 o63Var = (o63) n63Var;
/* 50 */                        o63Var.getClass();
/* 55 */                        b73.f2314o.getClass();
/* 60 */                        if (o63Var.f14651a == null) {
/* 62 */                            er0 er0Var = c73.f2756a;
/* 80 */                            o63Var.f14651a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) er0Var.f7853b).convertWebResourceError(Proxy.getInvocationHandler(o63Var.f14652b));
                                }
/* 84 */                        iM7119f = AbstractC1993o9.m7119f(o63Var.f14651a);
                            } else {
/* 89 */                        iM7119f = -1;
                            }
/* 96 */                    if (xe2.m9786x("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
/* 99 */                        o63 o63Var2 = (o63) n63Var;
/* 101 */                       o63Var2.getClass();
/* 106 */                       b73.f2313n.getClass();
/* 111 */                       if (o63Var2.f14651a == null) {
/* 113 */                           er0 er0Var2 = c73.f2756a;
/* 131 */                           o63Var2.f14651a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) er0Var2.f7853b).convertWebResourceError(Proxy.getInvocationHandler(o63Var2.f14652b));
                                }
/* 139 */                       string = AbstractC1993o9.m7118e(o63Var2.f14651a).toString();
                            } else {
/* 144 */                       string = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 156 */                   this.inAppBrowserDelegate.didFailNavigation(webResourceRequest.getUrl().toString(), iM7119f, string);
                        }
                    }
/* 159 */           WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 161 */           if (webViewChannelDelegate != null) {
/* 171 */               webViewChannelDelegate.onReceivedError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceErrorExt.fromWebResourceError(n63Var));
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
                    int port;
                    String str3;
/* 1 */             String url = webView.getUrl();
/* 5 */             String scheme = "https";
/* 8 */             if (url != null) {
                        try {
/* 12 */                    URI uri = new URI(url);
/* 15 */                    scheme = uri.getScheme();
/* 19 */                    port = uri.getPort();
/* 24 */                    str3 = scheme;
                        } catch (URISyntaxException unused) {
/* 26 */                    str3 = scheme;
/* 27 */                    port = 0;
                        }
                    } else {
/* 26 */                str3 = scheme;
/* 27 */                port = 0;
                    }
/* 32 */            previousAuthRequestFailureCount++;
/* 36 */            if (credentialsProposed == null) {
/* 54 */                credentialsProposed = CredentialDatabase.getInstance(webView.getContext()).getHttpAuthCredentials(str, str3, str2, Integer.valueOf(port));
                    }
/* 56 */            List<URLCredential> list = credentialsProposed;
/* 93 */            HttpAuthenticationChallenge httpAuthenticationChallenge = new HttpAuthenticationChallenge(new URLProtectionSpace(str, str3, str2, port, webView.getCertificate(), null), previousAuthRequestFailureCount, (list == null || list.size() <= 0) ? null : credentialsProposed.get(0));
/* 103 */           final int i = port;
/* 105 */           final String str4 = str3;
/* 108 */           WebViewChannelDelegate.ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback = new WebViewChannelDelegate.ReceivedHttpAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.2
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(HttpAuthResponse httpAuthResponse) {
/* 1 */                     InAppWebViewClientCompat.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str5, String str6, Object obj) {
/* 2 */                     defaultBehaviour((HttpAuthResponse) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(HttpAuthResponse httpAuthResponse) {
/* 1 */                     Integer action = httpAuthResponse.getAction();
/* 6 */                     if (action == null) {
/* 5 */                         return true;
                            }
/* 8 */                     int iIntValue = action.intValue();
/* 13 */                    if (iIntValue == 1) {
/* 71 */                        String username = httpAuthResponse.getUsername();
/* 75 */                        String password = httpAuthResponse.getPassword();
/* 83 */                        if (httpAuthResponse.isPermanentPersistence()) {
/* 107 */                           CredentialDatabase.getInstance(webView.getContext()).setHttpAuthCredential(str, str4, str2, Integer.valueOf(i), username, password);
                                }
/* 112 */                       httpAuthHandler.proceed(username, password);
                            } else if (iIntValue != 2) {
/* 1 */                         List unused2 = InAppWebViewClientCompat.credentialsProposed = null;
/* 1 */                         int unused3 = InAppWebViewClientCompat.previousAuthRequestFailureCount = 0;
/* 27 */                        httpAuthHandler.cancel();
                            } else if (InAppWebViewClientCompat.credentialsProposed.size() > 0) {
/* 49 */                        URLCredential uRLCredential = (URLCredential) InAppWebViewClientCompat.credentialsProposed.remove(0);
/* 61 */                        httpAuthHandler.proceed(uRLCredential.getUsername(), uRLCredential.getPassword());
                            } else {
/* 67 */                        httpAuthHandler.cancel();
                            }
/* 12 */                    return false;
                        }
                    };
/* 111 */           WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 113 */           if (webViewChannelDelegate != null) {
/* 115 */               webViewChannelDelegate.onReceivedHttpAuthRequest(httpAuthenticationChallenge, receivedHttpAuthRequestCallback);
                    } else {
/* 119 */               receivedHttpAuthRequestCallback.defaultBehaviour(null);
                    }
                }

                @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
/* 3 */             WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 5 */             if (webViewChannelDelegate != null) {
/* 15 */                webViewChannelDelegate.onReceivedHttpError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceResponseExt.fromWebResourceResponse(webResourceResponse));
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
/* 3 */             WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 5 */             if (webViewChannelDelegate != null) {
/* 7 */                 webViewChannelDelegate.onReceivedLoginRequest(str, str2, str3);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
                    int port;
/* 1 */             String url = sslError.getUrl();
/* 5 */             String host = HttpUrl.FRAGMENT_ENCODE_SET;
/* 7 */             String scheme = "https";
                    try {
/* 11 */                URI uri = new URI(url);
/* 14 */                host = uri.getHost();
/* 18 */                scheme = uri.getScheme();
/* 22 */                port = uri.getPort();
                    } catch (URISyntaxException unused) {
/* 30 */                port = 0;
                    }
/* 45 */            ServerTrustChallenge serverTrustChallenge = new ServerTrustChallenge(new URLProtectionSpace(host, scheme, null, port, sslError.getCertificate(), sslError));
/* 53 */            WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.3
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(ServerTrustAuthResponse serverTrustAuthResponse) {
/* 1 */                     InAppWebViewClientCompat.super.onReceivedSslError(webView, sslErrorHandler, sslError);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((ServerTrustAuthResponse) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(ServerTrustAuthResponse serverTrustAuthResponse) {
/* 1 */                     Integer action = serverTrustAuthResponse.getAction();
/* 6 */                     if (action == null) {
/* 5 */                         return true;
                            }
/* 8 */                     int iIntValue = action.intValue();
/* 12 */                    SslErrorHandler sslErrorHandler2 = sslErrorHandler;
/* 14 */                    if (iIntValue != 1) {
/* 16 */                        sslErrorHandler2.cancel();
/* 23 */                        return false;
                            }
/* 20 */                    sslErrorHandler2.proceed();
/* 23 */                    return false;
                        }
                    };
/* 56 */            WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 58 */            if (webViewChannelDelegate != null) {
/* 60 */                webViewChannelDelegate.onReceivedServerTrustAuthRequest(serverTrustChallenge, receivedServerTrustAuthRequestCallback);
                    } else {
/* 65 */                receivedServerTrustAuthRequestCallback.defaultBehaviour(null);
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
/* 2 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 12 */            if (!inAppWebView.customSettings.useOnRenderProcessGone.booleanValue() || inAppWebView.channelDelegate == null) {
/* 33 */                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
                    }
/* 28 */            inAppWebView.channelDelegate.onRenderProcessGone(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
/* 31 */            return true;
                }

                @Override // androidx.webkit.WebViewClientCompat
                public void onSafeBrowsingHit(final WebView webView, final WebResourceRequest webResourceRequest, final int i, final t52 t52Var) {
/* 11 */            WebViewChannelDelegate.SafeBrowsingHitCallback safeBrowsingHitCallback = new WebViewChannelDelegate.SafeBrowsingHitCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.5
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(SafeBrowsingResponse safeBrowsingResponse) {
/* 11 */                    InAppWebViewClientCompat.access$601(InAppWebViewClientCompat.this, webView, webResourceRequest, i, t52Var);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((SafeBrowsingResponse) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(SafeBrowsingResponse safeBrowsingResponse) {
/* 1 */                     Integer action = safeBrowsingResponse.getAction();
/* 6 */                     if (action != null) {
/* 8 */                         boolean zIsReport = safeBrowsingResponse.isReport();
/* 12 */                        int iIntValue = action.intValue();
/* 16 */                        if (iIntValue != 0) {
/* 18 */                            if (iIntValue != 1) {
/* 26 */                                if (!xe2.m9786x("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
/* 5 */                                     return true;
                                        }
/* 30 */                                t52Var.mo8699a(zIsReport);
/* 130 */                               return false;
                                    }
/* 41 */                            if (!xe2.m9786x("SAFE_BROWSING_RESPONSE_PROCEED")) {
/* 5 */                                 return true;
                                    }
/* 45 */                            u52 u52Var = (u52) t52Var;
/* 47 */                            u52Var.getClass();
/* 50 */                            C1823k9 c1823k9 = b73.f2316q;
/* 56 */                            if (c1823k9.mo6026a()) {
/* 62 */                                AbstractC2173s9.m8437c(u52Var.m8960c(), zIsReport);
/* 130 */                               return false;
                                    }
/* 70 */                            if (!c1823k9.mo97b()) {
/* 84 */                                throw b73.m1295a();
                                    }
/* 76 */                            u52Var.m8959b().proceed(zIsReport);
/* 130 */                           return false;
                                }
/* 92 */                        if (xe2.m9786x("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY")) {
/* 96 */                            u52 u52Var2 = (u52) t52Var;
/* 98 */                            u52Var2.getClass();
/* 101 */                           C1823k9 c1823k10 = b73.f2315p;
/* 107 */                           if (c1823k10.mo6026a()) {
/* 113 */                               AbstractC2173s9.m8435a(u52Var2.m8960c(), zIsReport);
/* 130 */                               return false;
                                    }
/* 121 */                           if (!c1823k10.mo97b()) {
/* 136 */                               throw b73.m1295a();
                                    }
/* 127 */                           u52Var2.m8959b().backToSafety(zIsReport);
/* 130 */                           return false;
                                }
                            }
/* 5 */                     return true;
                        }
                    };
/* 14 */            WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 16 */            if (webViewChannelDelegate != null) {
/* 26 */                webViewChannelDelegate.onSafeBrowsingHit(webResourceRequest.getUrl().toString(), i, safeBrowsingHitCallback);
                    } else {
/* 31 */                safeBrowsingHitCallback.defaultBehaviour(null);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onScaleChanged(WebView webView, float f, float f2) {
/* 1 */             super.onScaleChanged(webView, f, f2);
/* 4 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 16 */            inAppWebView.zoomScale = f2 / Util.getPixelDensity(inAppWebView.getContext());
/* 18 */            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 20 */            if (webViewChannelDelegate != null) {
/* 22 */                webViewChannelDelegate.onZoomScaleChanged(f, f2);
                    }
                }

                public void onShouldOverrideUrlLoading(final InAppWebView inAppWebView, final String str, String str2, final Map<String, String> map, final boolean z, boolean z2, boolean z3) {
/* 9 */             NavigationAction navigationAction = new NavigationAction(new URLRequest(str, str2, null, map), z, z2, z3);
/* 19 */            WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback = new WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.1
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(NavigationActionPolicy navigationActionPolicy) {
/* 1 */                     InAppWebViewClientCompat.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str3, String str4, Object obj) {
/* 2 */                     defaultBehaviour((NavigationActionPolicy) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(NavigationActionPolicy navigationActionPolicy) {
/* 10 */                    if (C07037.f5341x6b372c03[navigationActionPolicy.ordinal()] != 1) {
/* 26 */                        return false;
                            }
/* 1 */                     InAppWebViewClientCompat.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
/* 26 */                    return false;
                        }
                    };
/* 22 */            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 24 */            if (webViewChannelDelegate != null) {
/* 26 */                webViewChannelDelegate.shouldOverrideUrlLoading(navigationAction, shouldOverrideUrlLoadingCallback);
                    } else {
/* 30 */                shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequestExt webResourceRequestExt) {
                    CustomSchemeResponse customSchemeResponseOnLoadResourceWithCustomScheme;
                    WebResourceResponseExt webResourceResponseExtShouldInterceptRequest;
/* 1 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 3 */             WebViewAssetLoaderExt webViewAssetLoaderExt = inAppWebView.webViewAssetLoaderExt;
/* 5 */             if (webViewAssetLoaderExt != null && webViewAssetLoaderExt.loader != null) {
                        try {
/* 23 */                    WebResourceResponse webResourceResponseM9225a = inAppWebView.webViewAssetLoaderExt.loader.m9225a(Uri.parse(webResourceRequestExt.getUrl()));
/* 27 */                    if (webResourceResponseM9225a != null) {
/* 29 */                        return webResourceResponseM9225a;
                            }
                        } catch (Exception unused) {
                        }
                    }
/* 38 */            WebResourceResponse webResourceResponseCheckUrl = null;
/* 39 */            if (inAppWebView.customSettings.useShouldInterceptRequest.booleanValue()) {
/* 41 */                WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 43 */                if (webViewChannelDelegate != null) {
                            try {
/* 45 */                        webResourceResponseExtShouldInterceptRequest = webViewChannelDelegate.shouldInterceptRequest(webResourceRequestExt);
                            } catch (InterruptedException unused2) {
/* 38 */                        return null;
                            }
                        } else {
/* 51 */                    webResourceResponseExtShouldInterceptRequest = null;
                        }
/* 52 */                if (webResourceResponseExtShouldInterceptRequest == null) {
/* 38 */                    return null;
                        }
/* 54 */                String contentType = webResourceResponseExtShouldInterceptRequest.getContentType();
/* 58 */                String contentEncoding = webResourceResponseExtShouldInterceptRequest.getContentEncoding();
/* 62 */                byte[] data = webResourceResponseExtShouldInterceptRequest.getData();
/* 66 */                Map<String, String> headers = webResourceResponseExtShouldInterceptRequest.getHeaders();
/* 70 */                Integer statusCode = webResourceResponseExtShouldInterceptRequest.getStatusCode();
/* 74 */                String reasonPhrase = webResourceResponseExtShouldInterceptRequest.getReasonPhrase();
/* 82 */                ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                        return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                    }
/* 120 */           String lowerCase = webResourceRequestExt.getUrl().split(":")[0].toLowerCase();
                    try {
/* 132 */               lowerCase = Uri.parse(webResourceRequestExt.getUrl()).getScheme();
                    } catch (Exception unused3) {
                    }
/* 138 */           List<String> list = inAppWebView.customSettings.resourceCustomSchemes;
/* 140 */           if (list != null && list.contains(lowerCase)) {
/* 148 */               WebViewChannelDelegate webViewChannelDelegate2 = inAppWebView.channelDelegate;
/* 150 */               if (webViewChannelDelegate2 != null) {
                            try {
/* 152 */                       customSchemeResponseOnLoadResourceWithCustomScheme = webViewChannelDelegate2.onLoadResourceWithCustomScheme(webResourceRequestExt);
                            } catch (InterruptedException unused4) {
/* 38 */                        return null;
                            }
                        } else {
/* 158 */                   customSchemeResponseOnLoadResourceWithCustomScheme = null;
                        }
/* 159 */               if (customSchemeResponseOnLoadResourceWithCustomScheme != null) {
                            try {
/* 167 */                       webResourceResponseCheckUrl = inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, webResourceRequestExt, customSchemeResponseOnLoadResourceWithCustomScheme.getContentType());
                            } catch (Exception unused5) {
                            }
                            return webResourceResponseCheckUrl != null ? webResourceResponseCheckUrl : new WebResourceResponse(customSchemeResponseOnLoadResourceWithCustomScheme.getContentType(), customSchemeResponseOnLoadResourceWithCustomScheme.getContentType(), new ByteArrayInputStream(customSchemeResponseOnLoadResourceWithCustomScheme.getData()));
                        }
                    }
/* 207 */           if (inAppWebView.contentBlockerHandler.getRuleList().size() <= 0) {
/* 38 */                return null;
                    }
                    try {
/* 211 */               return inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, webResourceRequestExt);
                    } catch (Exception unused6) {
/* 38 */                return null;
                    }
                }

                @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    boolean zIsRedirect;
/* 2 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 12 */            if (!inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
/* 102 */               return false;
                    }
/* 20 */            if (xe2.m9786x("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
/* 24 */                b73.f2312m.getClass();
/* 27 */                zIsRedirect = AbstractC2062p9.m7363j(webResourceRequest);
                    } else {
/* 33 */                zIsRedirect = webResourceRequest.isRedirect();
                    }
/* 63 */            onShouldOverrideUrlLoading(inAppWebView, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.isForMainFrame(), webResourceRequest.hasGesture(), zIsRedirect);
/* 68 */            if (inAppWebView.regexToCancelSubFramesLoadingCompiled == null) {
/* 97 */                return webResourceRequest.isForMainFrame();
                    }
/* 74 */            if (webResourceRequest.isForMainFrame()) {
/* 76 */                return true;
                    }
/* 92 */            return inAppWebView.regexToCancelSubFramesLoadingCompiled.matcher(webResourceRequest.getUrl().toString()).matches();
                }

                @Override // android.webkit.WebViewClient
/* 103 */       public boolean shouldOverrideUrlLoading(WebView webView, String str) {
/* 104 */           InAppWebView inAppWebView = (InAppWebView) webView;
/* 105 */           if (!inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
                        return false;
                    }
/* 106 */           onShouldOverrideUrlLoading(inAppWebView, str, "GET", null, true, false, false);
                    return true;
                }

                @Override // android.webkit.WebViewClient
/* 174 */       public void onReceivedError(WebView webView, int i, String str, String str2) {
/* 175 */           InAppWebView inAppWebView = (InAppWebView) webView;
/* 176 */           if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
/* 177 */               inAppWebView.stopLoading();
/* 178 */               inAppWebView.loadUrl("about:blank");
                    }
/* 179 */           inAppWebView.isLoading = false;
/* 180 */           previousAuthRequestFailureCount = 0;
/* 181 */           credentialsProposed = null;
/* 182 */           InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
                    if (inAppBrowserDelegate != null) {
/* 183 */               inAppBrowserDelegate.didFailNavigation(str2, i, str);
                    }
/* 184 */           WebResourceRequestExt webResourceRequestExt = new WebResourceRequestExt(str2, null, false, false, true, "GET");
/* 185 */           WebResourceErrorExt webResourceErrorExt = new WebResourceErrorExt(i, str);
/* 186 */           WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
                    if (webViewChannelDelegate != null) {
/* 187 */               webViewChannelDelegate.onReceivedError(webResourceRequestExt, webResourceErrorExt);
                    }
/* 188 */           super.onReceivedError(webView, i, str, str2);
                }

                @Override // android.webkit.WebViewClient
/* 215 */       public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
/* 217 */           return shouldInterceptRequest(webView, new WebResourceRequestExt(str, null, false, false, true, "GET"));
                }

                @Override // android.webkit.WebViewClient
/* 217 */       public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
/* 219 */           return shouldInterceptRequest(webView, WebResourceRequestExt.fromWebResourceRequest(webResourceRequest));
                }
            }
