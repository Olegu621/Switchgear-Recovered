            package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

            import android.net.Uri;
            import android.webkit.ValueCallback;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.AbstractC0886en;
            import p000.AbstractC1993o9;
            import p000.C2297vk;
            import p000.b73;
            import p000.fm0;
            import p000.fs0;
            import p000.i63;
            import p000.k63;
            import p000.l63;
            import p000.m63;
            import p000.xe2;
            import p000.y63;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebMessageChannel implements Disposable {
                protected static final String LOG_TAG = "WebMessageChannel";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
                public WebMessageChannelChannelDelegate channelDelegate;
                public final List<l63> compatPorts;

                /* JADX INFO: renamed from: id */
                public String f5342id;
                public final List<WebMessagePort> ports;
                public InAppWebViewInterface webView;

                public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
                    l63[] l63VarArr;
/* 4 */             this.f5342id = str;
/* 28 */            this.channelDelegate = new WebMessageChannelChannelDelegate(this, new MethodChannel(inAppWebViewInterface.getPlugin().messenger, AbstractC0886en.m3507k(METHOD_CHANNEL_NAME_PREFIX, str)));
/* 32 */            if (inAppWebViewInterface instanceof InAppWebView) {
/* 39 */                Uri uri = y63.f19511a;
/* 43 */                b73.f2322w.getClass();
/* 46 */                android.webkit.WebMessagePort[] webMessagePortArrM7116c = AbstractC1993o9.m7116c((InAppWebView) inAppWebViewInterface);
/* 50 */                if (webMessagePortArrM7116c == null) {
/* 52 */                    l63VarArr = null;
                        } else {
/* 55 */                    l63[] l63VarArr2 = new l63[webMessagePortArrM7116c.length];
/* 59 */                    for (int i = 0; i < webMessagePortArrM7116c.length; i++) {
/* 68 */                        l63VarArr2[i] = new m63(webMessagePortArrM7116c[i]);
                            }
/* 73 */                    l63VarArr = l63VarArr2;
                        }
/* 81 */                this.compatPorts = new ArrayList(Arrays.asList(l63VarArr));
/* 88 */                this.ports = new ArrayList();
                    } else {
/* 113 */               this.ports = Arrays.asList(new WebMessagePort("port1", this), new WebMessagePort("port2", this));
/* 120 */               this.compatPorts = new ArrayList();
                    }
/* 122 */           this.webView = inAppWebViewInterface;
                }

                public void closeForInAppWebView(Integer num, MethodChannel.Result result) {
/* 3 */             if (this.webView == null || this.compatPorts.size() <= 0 || !xe2.m9786x("WEB_MESSAGE_PORT_CLOSE")) {
/* 70 */                result.success(Boolean.TRUE);
/* 73 */                return;
                    }
                    try {
/* 33 */                m63 m63Var = (m63) this.compatPorts.get(num.intValue());
/* 35 */                m63Var.getClass();
/* 40 */                b73.f2319t.getClass();
/* 47 */                AbstractC1993o9.m7114a(m63Var.m6611c());
/* 52 */                result.success(Boolean.TRUE);
                    } catch (Exception e) {
/* 64 */                result.error(LOG_TAG, e.getMessage(), null);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 7 */             if (xe2.m9786x("WEB_MESSAGE_PORT_CLOSE")) {
/* 11 */                Iterator<l63> it = this.compatPorts.iterator();
/* 19 */                while (it.hasNext()) {
                            try {
/* 27 */                        m63 m63Var = (m63) it.next();
/* 29 */                        m63Var.getClass();
/* 34 */                        b73.f2319t.getClass();
/* 41 */                        AbstractC1993o9.m7114a(m63Var.m6611c());
                            } catch (Exception unused) {
                            }
                        }
                    }
/* 45 */            WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
/* 48 */            if (webMessageChannelChannelDelegate != null) {
/* 50 */                webMessageChannelChannelDelegate.dispose();
/* 53 */                this.channelDelegate = null;
                    }
/* 57 */            this.compatPorts.clear();
/* 60 */            this.webView = null;
                }

                public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
/* 1 */             if (inAppWebViewInterface != null) {
/* 24 */                inAppWebViewInterface.evaluateJavascript(fm0.m3789o(new StringBuilder("(function() {window.flutter_inappwebview._webMessageChannels['"), this.f5342id, "'] = new MessageChannel();})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
/* 5 */                         valueCallback.onReceiveValue(this);
                            }
                        });
                    } else {
/* 28 */                valueCallback.onReceiveValue(this);
                    }
                }

                public void onMessage(int i, WebMessageCompatExt webMessageCompatExt) {
/* 1 */             WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
/* 3 */             if (webMessageChannelChannelDelegate != null) {
/* 5 */                 webMessageChannelChannelDelegate.onMessage(i, webMessageCompatExt);
                    }
                }

                public void postMessageForInAppWebView(Integer num, WebMessageCompatExt webMessageCompatExt, MethodChannel.Result result) {
/* 3 */             if (this.webView == null || this.compatPorts.size() <= 0 || !xe2.m9786x("WEB_MESSAGE_PORT_POST_MESSAGE")) {
/* 180 */               result.success(Boolean.TRUE);
/* 183 */               return;
                    }
/* 27 */            l63 l63Var = this.compatPorts.get(num.intValue());
/* 35 */            ArrayList arrayList = new ArrayList();
/* 38 */            List<WebMessagePortCompatExt> ports = webMessageCompatExt.getPorts();
/* 42 */            if (ports != null) {
/* 52 */                for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
/* 70 */                    WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
/* 76 */                    if (webMessageChannel != null) {
/* 90 */                        arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                            }
                        }
                    }
/* 94 */            Object data = webMessageCompatExt.getData();
                    try {
/* 106 */               if (xe2.m9786x("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExt.getType() == 1) {
/* 132 */                   l63Var.mo6351a(new i63((byte[]) data, (l63[]) arrayList.toArray(new l63[0])));
                        } else {
/* 159 */                   l63Var.mo6351a(new i63(data != null ? data.toString() : null, (l63[]) arrayList.toArray(new l63[0])));
                        }
/* 164 */               result.success(Boolean.TRUE);
                    } catch (Exception e) {
/* 174 */               result.error(LOG_TAG, e.getMessage(), null);
                    }
                }

                public void setWebMessageCallbackForInAppWebView(final int i, MethodChannel.Result result) {
/* 3 */             if (this.webView == null || this.compatPorts.size() <= 0 || !xe2.m9786x("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
/* 94 */                result.success(Boolean.TRUE);
/* 97 */                return;
                    }
/* 23 */            l63 l63Var = this.compatPorts.get(i);
                    try {
/* 31 */                k63 k63Var = new k63() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.2
                            @Override // p000.k63
                            public void onMessage(l63 l63Var2, i63 i63Var) {
/* 13 */                        this.onMessage(i, i63Var != null ? WebMessageCompatExt.fromMapWebMessageCompat(i63Var) : null);
                            }
                        };
/* 34 */                m63 m63Var = (m63) l63Var;
/* 36 */                m63Var.getClass();
/* 45 */                if (b73.f2321v.mo97b()) {
/* 63 */                    m63Var.m6610b().setWebMessageCallback(new C2297vk(new fs0(k63Var, 22)));
                        } else {
/* 71 */                    AbstractC1993o9.m7125l(m63Var.m6611c(), k63Var);
                        }
/* 76 */                result.success(Boolean.TRUE);
                    } catch (Exception e) {
/* 88 */                result.error(LOG_TAG, e.getMessage(), null);
                    }
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("id", this.f5342id);
/* 13 */            return map;
                }
            }
