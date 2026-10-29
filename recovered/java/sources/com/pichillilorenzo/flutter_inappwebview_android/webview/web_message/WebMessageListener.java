            package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

            import android.net.Uri;
            import android.text.TextUtils;
            import android.webkit.WebView;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
            import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import p000.AbstractC0886en;
            import p000.C2297vk;
            import p000.b73;
            import p000.d01;
            import p000.e01;
            import p000.fm0;
            import p000.i63;
            import p000.j63;
            import p000.x63;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebMessageListener implements Disposable {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                protected static final String LOG_TAG = "WebMessageListener";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
                public Set<String> allowedOriginRules;
                public WebMessageListenerChannelDelegate channelDelegate;

                /* JADX INFO: renamed from: id */
                public String f5343id;
                public String jsObjectName;
                public x63 listener;
                public d01 replyProxy;
                public InAppWebViewInterface webView;

                public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, String str2, Set<String> set) {
/* 4 */             this.f5343id = str;
/* 6 */             this.webView = inAppWebViewInterface;
/* 8 */             this.jsObjectName = str2;
/* 10 */            this.allowedOriginRules = set;
/* 48 */            this.channelDelegate = new WebMessageListenerChannelDelegate(this, new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME_PREFIX + this.f5343id + "_" + this.jsObjectName));
/* 54 */            if (this.webView instanceof InAppWebView) {
/* 61 */                this.listener = new x63() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.1
                            @Override // p000.x63
                            public void onPostMessage(WebView webView, i63 i63Var, Uri uri, boolean z, d01 d01Var) {
/* 1 */                         WebMessageListener webMessageListener = WebMessageListener.this;
/* 3 */                         webMessageListener.replyProxy = d01Var;
/* 5 */                         WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = webMessageListener.channelDelegate;
/* 7 */                         if (webMessageListenerChannelDelegate != null) {
/* 31 */                            webMessageListenerChannelDelegate.onPostMessage(WebMessageCompatExt.fromMapWebMessageCompat(i63Var), uri.toString().equals("null") ? null : uri.toString(), z);
                                }
                            }
                        };
                    }
                }

                public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 40 */            return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, binaryMessenger, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
                }

                public void assertOriginRulesValid() throws Exception {
/* 7 */             int i = 0;
/* 12 */            for (String str : this.allowedOriginRules) {
/* 22 */                if (str == null) {
/* 281 */                   throw new Exception(AbstractC0886en.m3505i(i, "allowedOriginRules[", "] is null"));
                        }
/* 28 */                if (str.isEmpty()) {
/* 269 */                   throw new Exception(AbstractC0886en.m3505i(i, "allowedOriginRules[", "] is empty"));
                        }
/* 36 */                if (!"*".equals(str)) {
/* 39 */                    Uri uri = Uri.parse(str);
/* 43 */                    String scheme = uri.getScheme();
/* 47 */                    String host = uri.getHost();
/* 51 */                    String path = uri.getPath();
/* 55 */                    int port = uri.getPort();
/* 63 */                    if (scheme == null) {
/* 257 */                       throw new Exception(fm0.m3784j("allowedOriginRules ", str, " is invalid"));
                            }
/* 73 */                    if (("http".equals(scheme) || "https".equals(scheme)) && (host == null || host.isEmpty())) {
/* 247 */                       throw new Exception(fm0.m3784j("allowedOriginRules ", str, " is invalid"));
                            }
/* 94 */                    if (!"http".equals(scheme) && !"https".equals(scheme) && (host != null || port != -1)) {
/* 116 */                       throw new Exception(fm0.m3784j("allowedOriginRules ", str, " is invalid"));
                            }
/* 117 */                   if ((host == null || host.isEmpty()) && port != -1) {
/* 237 */                       throw new Exception(fm0.m3784j("allowedOriginRules ", str, " is invalid"));
                            }
/* 131 */                   if (!path.isEmpty()) {
/* 227 */                       throw new Exception(fm0.m3784j("allowedOriginRules ", str, " is invalid"));
                            }
/* 133 */                   if (host != null) {
/* 135 */                       int iIndexOf = host.indexOf("*");
/* 139 */                       if (iIndexOf != 0 || (iIndexOf == 0 && !host.startsWith("*."))) {
/* 213 */                           throw new Exception(fm0.m3784j("allowedOriginRules ", str, " is invalid"));
                                }
/* 157 */                       if (host.startsWith("[")) {
/* 165 */                           if (!host.endsWith("]")) {
/* 203 */                               throw new Exception(fm0.m3784j("allowedOriginRules ", str, " is invalid"));
                                    }
/* 181 */                           if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
/* 193 */                               throw new Exception(fm0.m3784j("allowedOriginRules ", str, " is invalid"));
                                    }
                                }
                            }
/* 214 */                   i++;
                        }
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = this.channelDelegate;
/* 4 */             if (webMessageListenerChannelDelegate != null) {
/* 6 */                 webMessageListenerChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            this.listener = null;
/* 13 */            this.replyProxy = null;
/* 15 */            this.webView = null;
                }

                public void initJsInstance() {
/* 3 */             if (this.webView != null) {
/* 11 */                String strReplaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
/* 17 */                ArrayList arrayList = new ArrayList();
/* 30 */                for (String str : this.allowedOriginRules) {
/* 44 */                    if ("*".equals(str)) {
/* 48 */                        arrayList.add("'*'");
                            } else {
/* 52 */                        Uri uri = Uri.parse(str);
/* 83 */                        String str2 = uri.getHost() != null ? "'" + Util.replaceAll(uri.getHost(), "'", "\\'") + "'" : "null";
/* 93 */                        StringBuilder sb = new StringBuilder("{scheme: '");
/* 100 */                       sb.append(uri.getScheme());
/* 105 */                       sb.append("', host: ");
/* 108 */                       sb.append(str2);
/* 113 */                       sb.append(", port: ");
/* 131 */                       sb.append(uri.getPort() != -1 ? Integer.valueOf(uri.getPort()) : "null");
/* 136 */                       sb.append("}");
/* 143 */                       arrayList.add(sb.toString());
                            }
                        }
/* 201 */               this.webView.getUserContentController().addPluginScript(new PluginScript("WebMessageListener-" + this.jsObjectName, fm0.m3789o(AbstractC0886en.m3514r("(function() {  var allowedOriginRules = [", TextUtils.join(", ", arrayList), "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window.flutter_inappwebview._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['", strReplaceAll, "'] = new FlutterInAppWebViewWebMessageListener('"), strReplaceAll, "');  }})();"), UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null));
                    }
                }

                public boolean isOriginAllowed(String str, String str2, int i) {
                    int port;
                    String strNormalizeIPv6;
/* 3 */             Iterator<String> it = this.allowedOriginRules.iterator();
                    while (true) {
/* 12 */                if (!it.hasNext()) {
/* 11 */                    return false;
                        }
/* 14 */                String next = it.next();
/* 27 */                if ("*".equals(next)) {
/* 26 */                    return true;
                        }
/* 30 */                if (str != null && !str.isEmpty() && (!str.isEmpty() || ((str2 != null && !str2.isEmpty()) || (i != 0 && i != -1)))) {
/* 59 */                    Uri uri = Uri.parse(next);
/* 67 */                    int i2 = 80;
/* 73 */                    if (uri.getPort() == -1 || uri.getPort() == 0) {
/* 99 */                        port = "https".equals(uri.getScheme()) ? 443 : 80;
                            } else {
/* 82 */                        port = uri.getPort();
                            }
/* 100 */                   if (i != 0 && i != -1) {
/* 105 */                       i2 = i;
                            } else if ("https".equals(str)) {
/* 113 */                       i2 = 443;
                            }
/* 118 */                   String strNormalizeIPv7 = null;
/* 119 */                   if (uri.getHost() == null || !uri.getHost().startsWith("[")) {
/* 155 */                       strNormalizeIPv6 = null;
                            } else {
                                try {
/* 150 */                           strNormalizeIPv6 = Util.normalizeIPv6(uri.getHost().substring(1, uri.getHost().length() - 1));
                                } catch (Exception unused) {
/* 155 */                           strNormalizeIPv6 = null;
                                }
                            }
                            try {
/* 156 */                       strNormalizeIPv7 = Util.normalizeIPv6(str2);
                            } catch (Exception unused2) {
                            }
/* 164 */                   boolean zEquals = uri.getScheme().equals(str);
/* 237 */                   boolean z = uri.getHost() == null || uri.getHost().isEmpty() || uri.getHost().equals(str2) || (uri.getHost().startsWith("*") && str2 != null && str2.contains(uri.getHost().split("\\*")[1])) || !(strNormalizeIPv7 == null || strNormalizeIPv6 == null || !strNormalizeIPv7.equals(strNormalizeIPv6));
/* 238 */                   boolean z2 = port == i2;
/* 241 */                   if (zEquals && z && z2) {
/* 26 */                        return true;
                            }
                        }
                    }
                }

                public void postMessageForInAppWebView(WebMessageCompatExt webMessageCompatExt, MethodChannel.Result result) {
                    Object data;
/* 3 */             if (this.replyProxy != null && xe2.m9786x("WEB_MESSAGE_LISTENER") && (data = webMessageCompatExt.getData()) != null) {
/* 25 */                if (xe2.m9786x("WEB_MESSAGE_ARRAY_BUFFER") && webMessageCompatExt.getType() == 1) {
/* 36 */                    byte[] bArr = (byte[]) data;
/* 38 */                    e01 e01Var = (e01) this.replyProxy;
/* 40 */                    e01Var.getClass();
/* 49 */                    if (!b73.f2320u.mo97b()) {
/* 71 */                        throw b73.m1295a();
                            }
/* 63 */                    e01Var.f7465a.postMessageWithPayload(new C2297vk(new j63(bArr)));
                        } else {
/* 72 */                    d01 d01Var = this.replyProxy;
/* 74 */                    String string = data.toString();
/* 78 */                    e01 e01Var2 = (e01) d01Var;
/* 80 */                    e01Var2.getClass();
/* 89 */                    if (!b73.f2293I.mo97b()) {
/* 101 */                       throw b73.m1295a();
                            }
/* 93 */                    e01Var2.f7465a.postMessage(string);
                        }
                    }
/* 104 */           result.success(Boolean.TRUE);
                }
            }
