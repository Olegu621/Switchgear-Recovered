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
            import android.webkit.SafeBrowsingResponse;
            import android.webkit.SslErrorHandler;
            import android.webkit.WebResourceError;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
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
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.AbstractC2062p9;
            import p000.b73;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 76 */    public class InAppWebViewClient extends WebViewClient {
                protected static final String LOG_TAG = "IAWebViewClient";
                private static List<URLCredential> credentialsProposed;
                private static int previousAuthRequestFailureCount;
                private InAppBrowserDelegate inAppBrowserDelegate;

                /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient$7 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C06967 {

                    /* JADX INFO: renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy */
                    static final /* synthetic */ int[] f5340x6b372c03;

                    static {
/* 6 */                 int[] iArr = new int[NavigationActionPolicy.values().length];
/* 8 */                 f5340x6b372c03 = iArr;
                        try {
/* 17 */                    iArr[NavigationActionPolicy.ALLOW.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f5340x6b372c03[NavigationActionPolicy.CANCEL.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                public InAppWebViewClient(InAppBrowserDelegate inAppBrowserDelegate) {
/* 4 */             this.inAppBrowserDelegate = inAppBrowserDelegate;
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
/* 6 */             WebViewChannelDelegate.FormResubmissionCallback formResubmissionCallback = new WebViewChannelDelegate.FormResubmissionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.6
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(Integer num) {
/* 1 */                     InAppWebViewClient.super.onFormResubmission(webView, message, message2);
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

                @Override // android.webkit.WebViewClient
                public void onPageCommitVisible(WebView webView, String str) {
/* 1 */             super.onPageCommitVisible(webView, str);
/* 6 */             WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 8 */             if (webViewChannelDelegate != null) {
/* 10 */                webViewChannelDelegate.onPageCommitVisible(str);
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
/* 58 */            WebViewChannelDelegate.ReceivedClientCertRequestCallback receivedClientCertRequestCallback = new WebViewChannelDelegate.ReceivedClientCertRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.4
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(ClientCertResponse clientCertResponse) {
/* 1 */                     InAppWebViewClient.super.onReceivedClientCertRequest(webView, clientCertRequest);
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

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
/* 1 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 7 */             if (webResourceRequest.isForMainFrame()) {
/* 17 */                if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
/* 19 */                    inAppWebView.stopLoading();
/* 24 */                    inAppWebView.loadUrl("about:blank");
                        }
/* 28 */                inAppWebView.isLoading = false;
/* 30 */                previousAuthRequestFailureCount = 0;
/* 33 */                credentialsProposed = null;
/* 35 */                InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
/* 37 */                if (inAppBrowserDelegate != null) {
/* 59 */                    inAppBrowserDelegate.didFailNavigation(webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString());
                        }
                    }
/* 62 */            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 64 */            if (webViewChannelDelegate != null) {
/* 74 */                webViewChannelDelegate.onReceivedError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceErrorExt.fromWebResourceError(webResourceError));
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
/* 108 */           WebViewChannelDelegate.ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback = new WebViewChannelDelegate.ReceivedHttpAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.2
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(HttpAuthResponse httpAuthResponse) {
/* 1 */                     InAppWebViewClient.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
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
/* 1 */                         List unused2 = InAppWebViewClient.credentialsProposed = null;
/* 1 */                         int unused3 = InAppWebViewClient.previousAuthRequestFailureCount = 0;
/* 27 */                        httpAuthHandler.cancel();
                            } else if (InAppWebViewClient.credentialsProposed.size() > 0) {
/* 49 */                        URLCredential uRLCredential = (URLCredential) InAppWebViewClient.credentialsProposed.remove(0);
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

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
/* 1 */             super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
/* 6 */             WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
/* 8 */             if (webViewChannelDelegate != null) {
/* 18 */                webViewChannelDelegate.onReceivedHttpError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceResponseExt.fromWebResourceResponse(webResourceResponse));
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
/* 53 */            WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.3
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(ServerTrustAuthResponse serverTrustAuthResponse) {
/* 1 */                     InAppWebViewClient.super.onReceivedSslError(webView, sslErrorHandler, sslError);
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

                @Override // android.webkit.WebViewClient
                public void onSafeBrowsingHit(final WebView webView, final WebResourceRequest webResourceRequest, final int i, final SafeBrowsingResponse safeBrowsingResponse) {
/* 11 */            WebViewChannelDelegate.SafeBrowsingHitCallback safeBrowsingHitCallback = new WebViewChannelDelegate.SafeBrowsingHitCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.5
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse safeBrowsingResponse2) {
/* 1 */                     InAppWebViewClient.super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse safeBrowsingResponse2) {
/* 1 */                     Integer action = safeBrowsingResponse2.getAction();
/* 6 */                     if (action == null) {
/* 5 */                         return true;
                            }
/* 8 */                     boolean zIsReport = safeBrowsingResponse2.isReport();
/* 12 */                    int iIntValue = action.intValue();
/* 16 */                    SafeBrowsingResponse safeBrowsingResponse3 = safeBrowsingResponse;
/* 18 */                    if (iIntValue == 0) {
/* 1 */                         safeBrowsingResponse3.backToSafety(zIsReport);
/* 33 */                        return false;
                            }
/* 20 */                    if (iIntValue != 1) {
/* 1 */                         safeBrowsingResponse3.showInterstitial(zIsReport);
/* 33 */                        return false;
                            }
/* 1 */                     safeBrowsingResponse3.proceed(zIsReport);
/* 33 */                    return false;
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
/* 19 */            WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback = new WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.1
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(NavigationActionPolicy navigationActionPolicy) {
/* 1 */                     InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str3, String str4, Object obj) {
/* 2 */                     defaultBehaviour((NavigationActionPolicy) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(NavigationActionPolicy navigationActionPolicy) {
/* 10 */                    if (C06967.f5340x6b372c03[navigationActionPolicy.ordinal()] != 1) {
/* 26 */                        return false;
                            }
/* 1 */                     InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
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

                @Override // android.webkit.WebViewClient
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
/* 77 */        public void onReceivedError(WebView webView, int i, String str, String str2) {
/* 78 */            InAppWebView inAppWebView = (InAppWebView) webView;
/* 79 */            if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
/* 80 */                inAppWebView.stopLoading();
/* 81 */                inAppWebView.loadUrl("about:blank");
                    }
/* 82 */            inAppWebView.isLoading = false;
/* 83 */            previousAuthRequestFailureCount = 0;
/* 84 */            credentialsProposed = null;
/* 85 */            InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
                    if (inAppBrowserDelegate != null) {
/* 86 */                inAppBrowserDelegate.didFailNavigation(str2, i, str);
                    }
/* 87 */            WebResourceRequestExt webResourceRequestExt = new WebResourceRequestExt(str2, null, false, false, true, "GET");
/* 88 */            WebResourceErrorExt webResourceErrorExt = new WebResourceErrorExt(i, str);
/* 89 */            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
                    if (webViewChannelDelegate != null) {
/* 90 */                webViewChannelDelegate.onReceivedError(webResourceRequestExt, webResourceErrorExt);
                    }
/* 91 */            super.onReceivedError(webView, i, str, str2);
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
/* 215 */       public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
/* 217 */           return shouldInterceptRequest(webView, new WebResourceRequestExt(str, null, false, false, true, "GET"));
                }

                @Override // android.webkit.WebViewClient
/* 217 */       public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
/* 219 */           return shouldInterceptRequest(webView, WebResourceRequestExt.fromWebResourceRequest(webResourceRequest));
                }
            }
