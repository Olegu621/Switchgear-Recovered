            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.content.Context;
            import android.webkit.WebResourceResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.ByteArrayInputStream;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.AbstractC0886en;
            import p000.C2214td;
            import p000.hr1;
            import p000.s63;
            import p000.t63;
            import p000.u63;
            import p000.v63;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public class WebViewAssetLoaderExt implements Disposable {
                public List<PathHandlerExt> customPathHandlers;
                public v63 loader;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PathHandlerExt implements t63, Disposable {
                    protected static final String LOG_TAG = "PathHandlerExt";
                    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
                    public PathHandlerExtChannelDelegate channelDelegate;

                    /* JADX INFO: renamed from: id */
                    public String f5336id;

                    public PathHandlerExt(String str, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 4 */                 this.f5336id = str;
/* 24 */                this.channelDelegate = new PathHandlerExtChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, AbstractC0886en.m3507k(METHOD_CHANNEL_NAME_PREFIX, str)));
                    }

                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                    public void dispose() {
/* 1 */                 PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
/* 3 */                 if (pathHandlerExtChannelDelegate != null) {
/* 5 */                     pathHandlerExtChannelDelegate.dispose();
/* 9 */                     this.channelDelegate = null;
                        }
                    }

                    @Override // p000.t63
                    public WebResourceResponse handle(String str) {
/* 1 */                 PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
/* 4 */                 if (pathHandlerExtChannelDelegate != null) {
                            try {
/* 6 */                         WebResourceResponseExt webResourceResponseExtHandle = pathHandlerExtChannelDelegate.handle(str);
/* 10 */                        if (webResourceResponseExtHandle != null) {
/* 12 */                            String contentType = webResourceResponseExtHandle.getContentType();
/* 16 */                            String contentEncoding = webResourceResponseExtHandle.getContentEncoding();
/* 20 */                            byte[] data = webResourceResponseExtHandle.getData();
/* 24 */                            Map<String, String> headers = webResourceResponseExtHandle.getHeaders();
/* 28 */                            Integer statusCode = webResourceResponseExtHandle.getStatusCode();
/* 32 */                            String reasonPhrase = webResourceResponseExtHandle.getReasonPhrase();
/* 40 */                            ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                                    return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                                }
                            } catch (InterruptedException unused) {
                            }
                        }
/* 3 */                 return null;
                    }
                }

                public WebViewAssetLoaderExt(v63 v63Var, List<PathHandlerExt> list) {
/* 4 */             this.loader = v63Var;
/* 6 */             this.customPathHandlers = list;
                }

                public static WebViewAssetLoaderExt fromMap(Map<String, Object> map, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 7 */             ArrayList<hr1> arrayList = new ArrayList();
/* 16 */            String str = (String) map.get("domain");
/* 24 */            Boolean bool = (Boolean) map.get("httpAllowed");
/* 32 */            List<Map> list = (List) map.get("pathHandlers");
/* 36 */            ArrayList arrayList2 = new ArrayList();
/* 41 */            if (str == null || str.isEmpty()) {
/* 39 */                str = "appassets.androidplatform.net";
                    }
/* 59 */            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
/* 60 */            if (list != null) {
/* 70 */                for (Map map2 : list) {
/* 84 */                    String str2 = (String) map2.get("type");
/* 92 */                    String str3 = (String) map2.get("path");
/* 94 */                    if (str2 != null && str3 != null) {
                                switch (str2) {
                                    case "ResourcesPathHandler":
/* 227 */                               s63 s63Var = new s63(1);
/* 235 */                               s63Var.f16456b = new C2214td(context, 0);
/* 242 */                               arrayList.add(new hr1(str3, s63Var));
                                        break;
                                    case "AssetsPathHandler":
/* 205 */                               s63 s63Var2 = new s63(0);
/* 213 */                               s63Var2.f16456b = new C2214td(context, 0);
/* 220 */                               arrayList.add(new hr1(str3, s63Var2));
                                        break;
                                    case "InternalStoragePathHandler":
/* 178 */                               String str4 = (String) map2.get("directory");
/* 180 */                               if (str4 == null) {
                                            break;
                                        } else {
/* 198 */                                   arrayList.add(new hr1(str3, new s63(context, new File(str4))));
                                            break;
                                        }
                                        break;
                                    default:
/* 150 */                               String str5 = (String) map2.get("id");
/* 152 */                               if (str5 == null) {
                                            break;
                                        } else {
/* 157 */                                   PathHandlerExt pathHandlerExt = new PathHandlerExt(str5, inAppWebViewFlutterPlugin);
/* 165 */                                   arrayList.add(new hr1(str3, pathHandlerExt));
/* 168 */                                   arrayList2.add(pathHandlerExt);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
/* 251 */           ArrayList arrayList3 = new ArrayList();
/* 262 */           for (hr1 hr1Var : arrayList) {
/* 283 */               arrayList3.add(new u63(str, (String) hr1Var.f9210a, zBooleanValue, (t63) hr1Var.f9211b));
                    }
/* 292 */           return new WebViewAssetLoaderExt(new v63(arrayList3), arrayList2);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 3 */             Iterator<PathHandlerExt> it = this.customPathHandlers.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                it.next().dispose();
                    }
/* 25 */            this.customPathHandlers.clear();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 31 */        public static class PathHandlerExtChannelDelegate extends ChannelDelegateImpl {
                    private PathHandlerExt pathHandler;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class HandleCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public WebResourceResponseExt decodeResult(Object obj) {
/* 3 */                     return WebResourceResponseExt.fromMap((Map) obj);
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class SyncHandleCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public WebResourceResponseExt decodeResult(Object obj) {
/* 6 */                     return new HandleCallback().decodeResult(obj);
                        }
                    }

                    public PathHandlerExtChannelDelegate(PathHandlerExt pathHandlerExt, MethodChannel methodChannel) {
/* 1 */                 super(methodChannel);
/* 4 */                 this.pathHandler = pathHandlerExt;
                    }

                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                    public void dispose() {
/* 1 */                 super.dispose();
/* 5 */                 this.pathHandler = null;
                    }

                    public WebResourceResponseExt handle(String str) {
/* 1 */                 MethodChannel channel = getChannel();
/* 5 */                 if (channel == null) {
/* 7 */                     return null;
                        }
/* 11 */                SyncHandleCallback syncHandleCallback = new SyncHandleCallback();
/* 16 */                HashMap map = new HashMap();
/* 21 */                map.put("path", str);
/* 30 */                return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "handle", map, syncHandleCallback);
                    }

/* 32 */            public void handle(String str, HandleCallback handleCallback) {
/* 33 */                MethodChannel channel = getChannel();
                        if (channel == null) {
                            return;
                        }
/* 34 */                HashMap map = new HashMap();
/* 35 */                map.put("path", str);
/* 36 */                channel.invokeMethod("handle", map, handleCallback);
                    }
                }
            }
