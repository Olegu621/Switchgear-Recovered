            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.text.TextUtils;
            import android.webkit.ValueCallback;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
            import java.util.ArrayList;
            import java.util.List;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebMessagePort {
                public String name;
                public WebMessageChannel webMessageChannel;
                public boolean isClosed = false;
                public boolean isTransferred = false;
                public boolean isStarted = false;

                public WebMessagePort(String str, WebMessageChannel webMessageChannel) {
/* 11 */            this.name = str;
/* 13 */            this.webMessageChannel = webMessageChannel;
                }

                public void close(final ValueCallback<Void> valueCallback) throws Exception {
                    InAppWebViewInterface inAppWebViewInterface;
/* 3 */             if (this.isTransferred) {
/* 68 */                throw new Exception("Port is already transferred");
                    }
/* 6 */             this.isClosed = true;
/* 8 */             WebMessageChannel webMessageChannel = this.webMessageChannel;
/* 11 */            if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
/* 18 */                inAppWebViewInterface = null;
                    }
/* 19 */            if (inAppWebViewInterface == null) {
/* 57 */                valueCallback.onReceiveValue(null);
/* 60 */                return;
                    }
/* 25 */            StringBuilder sb = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
/* 32 */            sb.append(this.webMessageChannel.f5342id);
/* 37 */            sb.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
/* 53 */            inAppWebViewInterface.evaluateJavascript(fm0.m3789o(sb, this.name, ".close();  }})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.3
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str) {
/* 4 */                     valueCallback.onReceiveValue(null);
                        }
                    });
                }

                public void dispose() {
/* 2 */             this.isClosed = true;
/* 5 */             this.webMessageChannel = null;
                }

                public void postMessage(WebMessage webMessage, final ValueCallback<Void> valueCallback) throws Exception {
                    InAppWebViewInterface inAppWebViewInterface;
                    String str;
/* 5 */             if (this.isClosed || this.isTransferred) {
/* 216 */               throw new Exception("Port is already closed or transferred");
                    }
/* 11 */            WebMessageChannel webMessageChannel = this.webMessageChannel;
/* 14 */            if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
/* 21 */                inAppWebViewInterface = null;
                    }
/* 22 */            if (inAppWebViewInterface != null) {
/* 24 */                List<WebMessagePort> list = webMessage.ports;
/* 28 */                if (list != null) {
/* 32 */                    ArrayList arrayList = new ArrayList();
/* 43 */                    for (WebMessagePort webMessagePort : list) {
/* 51 */                        if (webMessagePort == this) {
/* 121 */                           throw new Exception("Source port cannot be transferred");
                                }
/* 55 */                        if (webMessagePort.isStarted) {
/* 113 */                           throw new Exception("Port is already started");
                                }
/* 59 */                        if (webMessagePort.isClosed || webMessagePort.isTransferred) {
/* 105 */                           throw new Exception("Port is already closed or transferred");
                                }
/* 66 */                        webMessagePort.isTransferred = true;
/* 96 */                        arrayList.add("window.flutter_inappwebview._webMessageChannels['" + this.webMessageChannel.f5342id + "']." + webMessagePort.name);
                            }
/* 143 */                   str = "[" + TextUtils.join(", ", arrayList) + "]";
                        } else {
/* 26 */                    str = "null";
                        }
/* 149 */               String str2 = webMessage.data;
/* 157 */               String strReplaceAll = str2 != null ? Util.replaceAll(str2, "'", "\\'") : "null";
/* 165 */               StringBuilder sb = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
/* 172 */               sb.append(this.webMessageChannel.f5342id);
/* 177 */               sb.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
/* 186 */               fm0.m3796v(sb, this.name, ".postMessage('", strReplaceAll, "', ");
/* 200 */               inAppWebViewInterface.evaluateJavascript(fm0.m3789o(sb, str, ");  }})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.2
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str3) {
/* 4 */                         valueCallback.onReceiveValue(null);
                            }
                        });
                    } else {
/* 204 */               valueCallback.onReceiveValue(null);
                    }
/* 207 */           webMessage.dispose();
                }

                public void setWebMessageCallback(final ValueCallback<Void> valueCallback) throws Exception {
                    InAppWebViewInterface inAppWebViewInterface;
/* 3 */             if (this.isClosed || this.isTransferred) {
/* 109 */               throw new Exception("Port is already closed or transferred");
                    }
/* 10 */            this.isStarted = true;
/* 12 */            WebMessageChannel webMessageChannel = this.webMessageChannel;
/* 15 */            if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
/* 22 */                inAppWebViewInterface = null;
                    }
/* 23 */            if (inAppWebViewInterface == null) {
/* 96 */                if (valueCallback != null) {
/* 98 */                    valueCallback.onReceiveValue(null);
/* 101 */                   return;
                        }
/* 101 */               return;
                    }
/* 92 */            inAppWebViewInterface.evaluateJavascript("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['" + this.webMessageChannel.f5342id + "'];  if (webMessageChannel != null) {      webMessageChannel." + this.name + ".onmessage = function (event) {          window.flutter_inappwebview.callHandler('onWebMessagePortMessageReceived', {              'webMessageChannelId': '" + this.webMessageChannel.f5342id + "',              'index': " + (1 ^ (this.name.equals("port1") ? 1 : 0)) + ",              'message': event.data          });      }  }})();", null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.1
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str) {
/* 1 */                     ValueCallback valueCallback2 = valueCallback;
/* 3 */                     if (valueCallback2 != null) {
/* 6 */                         valueCallback2.onReceiveValue(null);
                            }
                        }
                    });
                }
            }
