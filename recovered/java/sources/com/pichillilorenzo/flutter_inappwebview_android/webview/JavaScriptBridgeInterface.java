            package com.pichillilorenzo.flutter_inappwebview_android.webview;

            import android.os.Handler;
            import android.webkit.JavascriptInterface;
            import android.webkit.ValueCallback;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
            import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class JavaScriptBridgeInterface {
                private static final String LOG_TAG = "JSBridgeInterface";
                private InAppWebView inAppWebView;

                public JavaScriptBridgeInterface(InAppWebView inAppWebView) {
/* 4 */             this.inAppWebView = inAppWebView;
                }

                @JavascriptInterface
                public void _callHandler(final String str, final String str2, final String str3) {
/* 3 */             if (this.inAppWebView == null) {
/* 5 */                 return;
                    }
/* 22 */            new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2
                        @Override // java.lang.Runnable
                        public void run() {
/* 9 */                     if (JavaScriptBridgeInterface.this.inAppWebView == null) {
/* 253 */                       return;
                            }
/* 21 */                    if (str.equals("onPrintRequest")) {
/* 25 */                        PrintJobSettings printJobSettings = new PrintJobSettings();
/* 30 */                        printJobSettings.handledByClient = Boolean.TRUE;
/* 38 */                        final String strPrintCurrentPage = JavaScriptBridgeInterface.this.inAppWebView.printCurrentPage(printJobSettings);
/* 48 */                        if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.channelDelegate == null) {
/* 253 */                           return;
                                }
/* 83 */                        JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onPrintRequest(JavaScriptBridgeInterface.this.inAppWebView.getUrl(), strPrintCurrentPage, new WebViewChannelDelegate.PrintRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.1
                                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                                    public void defaultBehaviour(Boolean bool) {
                                        PrintJobController printJobController;
/* 9 */                                 if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.plugin == null || JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager == null || (printJobController = JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager.jobs.get(strPrintCurrentPage)) == null) {
/* 64 */                                    return;
                                        }
/* 61 */                                printJobController.disposeNoCancel();
                                    }

                                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                                    public void error(String str4, String str5, Object obj) {
/* 2 */                                 defaultBehaviour((Boolean) null);
                                    }

                                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
/* 7 */                             public boolean nonNullSuccess(Boolean bool) {
/* 8 */                                 return !bool.booleanValue();
                                    }
                                });
/* 86 */                        return;
                            }
                            try {
/* 98 */                        if (str.equals("callAsyncJavaScript")) {
/* 107 */                           JSONObject jSONObject = new JSONArray(str3).getJSONObject(0);
/* 111 */                           String string = jSONObject.getString("resultUuid");
/* 123 */                           ValueCallback<String> valueCallback = JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.get(string);
/* 129 */                           if (valueCallback != null) {
/* 135 */                               valueCallback.onReceiveValue(jSONObject.toString());
/* 146 */                               JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.remove(string);
/* 149 */                               return;
                                    }
/* 253 */                           return;
                                }
/* 158 */                       if (!str.equals("evaluateJavaScriptWithContentWorld")) {
/* 231 */                           if (JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
/* 250 */                               JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onCallJsHandler(str, str3, new WebViewChannelDelegate.CallJsHandlerCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.2
                                            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                                            public void defaultBehaviour(Object obj) {
/* 9 */                                         if (JavaScriptBridgeInterface.this.inAppWebView == null) {
/* 11 */                                            return;
                                                }
/* 16 */                                        StringBuilder sb = new StringBuilder("if (window.flutter_inappwebview[");
/* 23 */                                        sb.append(str2);
/* 28 */                                        sb.append("] != null) { window.flutter_inappwebview[");
/* 35 */                                        sb.append(str2);
/* 40 */                                        sb.append("].resolve(");
/* 43 */                                        sb.append(obj);
/* 48 */                                        sb.append("); delete window.flutter_inappwebview[");
/* 70 */                                        JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript(fm0.m3789o(sb, str2, "]; }"), null);
                                            }

                                            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                                            public void error(String str4, String str5, Object obj) {
/* 1 */                                         StringBuilder sbM3512p = AbstractC0886en.m3512p(str4);
/* 16 */                                        sbM3512p.append(str5 != null ? ", ".concat(str5) : HttpUrl.FRAGMENT_ENCODE_SET);
/* 19 */                                        String string2 = sbM3512p.toString();
/* 31 */                                        if (JavaScriptBridgeInterface.this.inAppWebView == null) {
/* 33 */                                            return;
                                                }
/* 38 */                                        StringBuilder sb = new StringBuilder("if (window.flutter_inappwebview[");
/* 45 */                                        sb.append(str2);
/* 50 */                                        sb.append("] != null) { window.flutter_inappwebview[");
/* 57 */                                        sb.append(str2);
/* 62 */                                        sb.append("].reject(new Error(");
/* 69 */                                        sb.append(JSONObject.quote(string2));
/* 74 */                                        sb.append(")); delete window.flutter_inappwebview[");
/* 96 */                                        JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript(fm0.m3789o(sb, str2, "]; }"), null);
                                            }
                                        });
/* 253 */                               return;
                                    }
/* 253 */                           return;
                                }
/* 167 */                       JSONObject jSONObject2 = new JSONArray(str3).getJSONObject(0);
/* 171 */                       String string2 = jSONObject2.getString("resultUuid");
/* 183 */                       ValueCallback<String> valueCallback2 = JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.get(string2);
/* 189 */                       if (valueCallback2 != null) {
/* 208 */                           valueCallback2.onReceiveValue(jSONObject2.has(FirebaseAnalytics.Param.VALUE) ? jSONObject2.get(FirebaseAnalytics.Param.VALUE).toString() : "null");
/* 219 */                           JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.remove(string2);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    });
                }

                @JavascriptInterface
                public void _hideContextMenu() {
/* 3 */             if (this.inAppWebView == null) {
/* 5 */                 return;
                    }
/* 22 */            new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.1
                        @Override // java.lang.Runnable
                        public void run() {
/* 7 */                     if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.floatingContextMenu == null) {
/* 28 */                        return;
                            }
/* 25 */                    JavaScriptBridgeInterface.this.inAppWebView.hideContextMenu();
                        }
                    });
                }

                public void dispose() {
/* 2 */             this.inAppWebView = null;
                }
            }
