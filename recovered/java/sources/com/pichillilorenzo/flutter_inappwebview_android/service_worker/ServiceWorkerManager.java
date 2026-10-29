            package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

            import android.webkit.ServiceWorkerController;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.ByteArrayInputStream;
            import java.util.Map;
            import p000.AbstractC2062p9;
            import p000.b73;
            import p000.sa2;
            import p000.ta2;
            import p000.ua2;
            import p000.va2;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ServiceWorkerManager implements Disposable {
                protected static final String LOG_TAG = "ServiceWorkerManager";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
                public static ua2 serviceWorkerController;
                public ServiceWorkerChannelDelegate channelDelegate;
                public InAppWebViewFlutterPlugin plugin;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class DummyServiceWorkerClientCompat extends sa2 {
                    static final sa2 INSTANCE = new DummyServiceWorkerClientCompat();

                    private DummyServiceWorkerClientCompat() {
                    }

                    @Override // p000.sa2
                    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
/* 1 */                 return null;
                    }
                }

                public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 4 */             this.plugin = inAppWebViewFlutterPlugin;
/* 20 */            this.channelDelegate = new ServiceWorkerChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
                }

                private sa2 dummyServiceWorkerClientCompat() {
/* 1 */             return DummyServiceWorkerClientCompat.INSTANCE;
                }

                public static void init() {
/* 3 */             if (serviceWorkerController == null && xe2.m9786x("SERVICE_WORKER_BASIC_USAGE")) {
/* 15 */                serviceWorkerController = ta2.f17009a;
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = this.channelDelegate;
/* 4 */             if (serviceWorkerChannelDelegate != null) {
/* 6 */                 serviceWorkerChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            this.plugin = null;
                }

                public void setServiceWorkerClient(Boolean bool) {
/* 1 */             ua2 ua2Var = serviceWorkerController;
/* 3 */             if (ua2Var != null) {
/* 18 */                sa2 sa2VarDummyServiceWorkerClientCompat = bool.booleanValue() ? dummyServiceWorkerClientCompat() : new sa2() { // from class: com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager.1
                            @Override // p000.sa2
                            public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                                WebResourceResponseExt webResourceResponseExtShouldInterceptRequest;
/* 1 */                         WebResourceRequestExt webResourceRequestExtFromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
/* 7 */                         ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = ServiceWorkerManager.this.channelDelegate;
/* 10 */                        if (serviceWorkerChannelDelegate != null) {
                                    try {
/* 12 */                                webResourceResponseExtShouldInterceptRequest = serviceWorkerChannelDelegate.shouldInterceptRequest(webResourceRequestExtFromWebResourceRequest);
                                    } catch (InterruptedException unused) {
/* 9 */                                 return null;
                                    }
                                } else {
/* 18 */                            webResourceResponseExtShouldInterceptRequest = null;
                                }
/* 19 */                        if (webResourceResponseExtShouldInterceptRequest == null) {
/* 9 */                             return null;
                                }
/* 21 */                        String contentType = webResourceResponseExtShouldInterceptRequest.getContentType();
/* 25 */                        String contentEncoding = webResourceResponseExtShouldInterceptRequest.getContentEncoding();
/* 29 */                        byte[] data = webResourceResponseExtShouldInterceptRequest.getData();
/* 33 */                        Map<String, String> headers = webResourceResponseExtShouldInterceptRequest.getHeaders();
/* 37 */                        Integer statusCode = webResourceResponseExtShouldInterceptRequest.getStatusCode();
/* 41 */                        String reasonPhrase = webResourceResponseExtShouldInterceptRequest.getReasonPhrase();
/* 49 */                        ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                                return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                            }
                        };
/* 22 */                va2 va2Var = (va2) ua2Var;
/* 26 */                b73.f2307h.getClass();
/* 29 */                ServiceWorkerController serviceWorkerController2 = va2Var.f17949a;
/* 31 */                if (sa2VarDummyServiceWorkerClientCompat == null) {
/* 33 */                    if (serviceWorkerController2 == null) {
/* 39 */                        va2Var.f17949a = AbstractC2062p9.m7360g();
                            }
/* 44 */                    AbstractC2062p9.m7369p(va2Var.f17949a, null);
                        } else {
/* 48 */                    if (serviceWorkerController2 == null) {
/* 54 */                        va2Var.f17949a = AbstractC2062p9.m7360g();
                            }
/* 58 */                    AbstractC2062p9.m7370q(va2Var.f17949a, sa2VarDummyServiceWorkerClientCompat);
                        }
                    }
                }
            }
