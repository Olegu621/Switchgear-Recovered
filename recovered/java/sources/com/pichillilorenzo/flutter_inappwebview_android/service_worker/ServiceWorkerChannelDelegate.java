            package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.Map;
            import p000.AbstractC2062p9;
            import p000.b73;
            import p000.ua2;
            import p000.va2;
            import p000.wa2;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
                private ServiceWorkerManager serviceWorkerManager;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public WebResourceResponseExt decodeResult(Object obj) {
/* 3 */                 return WebResourceResponseExt.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public WebResourceResponseExt decodeResult(Object obj) {
/* 6 */                 return new ShouldInterceptRequestCallback().decodeResult(obj);
                    }
                }

                public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.serviceWorkerManager = serviceWorkerManager;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.serviceWorkerManager = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             ServiceWorkerManager.init();
/* 4 */             ua2 ua2Var = ServiceWorkerManager.serviceWorkerController;
/* 14 */            wa2 wa2Var = ua2Var != null ? ((va2) ua2Var).f17951c : null;
/* 15 */            String str = methodCall.method;
/* 17 */            str.getClass();
                    switch (str) {
                        case "getAllowContentAccess":
/* 428 */                   if (wa2Var != null && xe2.m9786x("SERVICE_WORKER_CONTENT_ACCESS")) {
/* 438 */                       b73.f2309j.getClass();
/* 453 */                       result.success(Boolean.valueOf(AbstractC2062p9.m7354a(wa2Var.m9511a())));
                                break;
                            } else {
/* 459 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "setServiceWorkerClient":
/* 401 */                   if (this.serviceWorkerManager == null) {
/* 424 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 413 */                       this.serviceWorkerManager.setServiceWorkerClient((Boolean) methodCall.argument("isNull"));
/* 418 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "getCacheMode":
/* 366 */                   if (wa2Var != null && xe2.m9786x("SERVICE_WORKER_CACHE_MODE")) {
/* 376 */                       b73.f2308i.getClass();
/* 391 */                       result.success(Integer.valueOf(AbstractC2062p9.m7357d(wa2Var.m9511a())));
                                break;
                            } else {
/* 395 */                       result.success(null);
                                break;
                            }
                            break;
                        case "getAllowFileAccess":
/* 331 */                   if (wa2Var != null && xe2.m9786x("SERVICE_WORKER_FILE_ACCESS")) {
/* 341 */                       b73.f2310k.getClass();
/* 356 */                       result.success(Boolean.valueOf(AbstractC2062p9.m7355b(wa2Var.m9511a())));
                                break;
                            } else {
/* 362 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "setCacheMode":
/* 293 */                   if (wa2Var != null && xe2.m9786x("SERVICE_WORKER_CACHE_MODE")) {
/* 309 */                       int iIntValue = ((Integer) methodCall.argument("mode")).intValue();
/* 315 */                       b73.f2308i.getClass();
/* 322 */                       AbstractC2062p9.m7367n(wa2Var.m9511a(), iIntValue);
                            }
/* 327 */                   result.success(Boolean.TRUE);
                            break;
                        case "setBlockNetworkLoads":
/* 255 */                   if (wa2Var != null && xe2.m9786x("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
/* 271 */                       boolean zBooleanValue = ((Boolean) methodCall.argument("flag")).booleanValue();
/* 277 */                       b73.f2311l.getClass();
/* 284 */                       AbstractC2062p9.m7366m(wa2Var.m9511a(), zBooleanValue);
                            }
/* 289 */                   result.success(Boolean.TRUE);
                            break;
                        case "setAllowContentAccess":
/* 219 */                   if (wa2Var != null && xe2.m9786x("SERVICE_WORKER_CONTENT_ACCESS")) {
/* 233 */                       boolean zBooleanValue2 = ((Boolean) methodCall.argument("allow")).booleanValue();
/* 239 */                       b73.f2309j.getClass();
/* 246 */                       AbstractC2062p9.m7364k(wa2Var.m9511a(), zBooleanValue2);
                            }
/* 251 */                   result.success(Boolean.TRUE);
                            break;
                        case "setAllowFileAccess":
/* 183 */                   if (wa2Var != null && xe2.m9786x("SERVICE_WORKER_FILE_ACCESS")) {
/* 197 */                       boolean zBooleanValue3 = ((Boolean) methodCall.argument("allow")).booleanValue();
/* 203 */                       b73.f2310k.getClass();
/* 210 */                       AbstractC2062p9.m7365l(wa2Var.m9511a(), zBooleanValue3);
                            }
/* 215 */                   result.success(Boolean.TRUE);
                            break;
                        case "getBlockNetworkLoads":
/* 148 */                   if (wa2Var != null && xe2.m9786x("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
/* 158 */                       b73.f2311l.getClass();
/* 173 */                       result.success(Boolean.valueOf(AbstractC2062p9.m7356c(wa2Var.m9511a())));
                                break;
                            } else {
/* 179 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        default:
/* 144 */                   result.notImplemented();
                            break;
                    }
                }

                public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return null;
                    }
/* 24 */            return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
                }

/* 26 */        public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
/* 27 */            MethodChannel channel = getChannel();
                    if (channel == null) {
                        return;
                    }
/* 28 */            channel.invokeMethod("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
                }
            }
