            package com.pichillilorenzo.flutter_inappwebview_android.webview;

            import android.content.Context;
            import android.net.Uri;
            import android.webkit.ValueCallback;
            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
            import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserSettings;
            import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
            import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
            import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
            import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
            import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
            import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
            import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
            import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
            import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
            import com.pichillilorenzo.flutter_inappwebview_android.types.SslCertificateExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
            import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.Build;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.AbstractC2173s9;
            import p000.C1823k9;
            import p000.b73;
            import p000.d73;
            import p000.i63;
            import p000.l63;
            import p000.xe2;
            import p000.y63;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public class WebViewChannelDelegate extends ChannelDelegateImpl {
                static final String LOG_TAG = "WebViewChannelDelegate";
                private InAppWebView webView;

                /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate$8 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C06488 {

                    /* JADX INFO: renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods */
                    static final /* synthetic */ int[] f5337x95709e3c;

                    static {
/* 6 */                 int[] iArr = new int[WebViewChannelDelegateMethods.values().length];
/* 8 */                 f5337x95709e3c = iArr;
                        try {
/* 17 */                    iArr[WebViewChannelDelegateMethods.getUrl.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f5337x95709e3c[WebViewChannelDelegateMethods.getTitle.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    f5337x95709e3c[WebViewChannelDelegateMethods.getProgress.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 50 */                    f5337x95709e3c[WebViewChannelDelegateMethods.loadUrl.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
/* 61 */                    f5337x95709e3c[WebViewChannelDelegateMethods.postUrl.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
/* 72 */                    f5337x95709e3c[WebViewChannelDelegateMethods.loadData.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
/* 83 */                    f5337x95709e3c[WebViewChannelDelegateMethods.loadFile.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
/* 95 */                    f5337x95709e3c[WebViewChannelDelegateMethods.evaluateJavascript.ordinal()] = 8;
                        } catch (NoSuchFieldError unused8) {
                        }
                        try {
/* 107 */                   f5337x95709e3c[WebViewChannelDelegateMethods.injectJavascriptFileFromUrl.ordinal()] = 9;
                        } catch (NoSuchFieldError unused9) {
                        }
                        try {
/* 119 */                   f5337x95709e3c[WebViewChannelDelegateMethods.injectCSSCode.ordinal()] = 10;
                        } catch (NoSuchFieldError unused10) {
                        }
                        try {
/* 131 */                   f5337x95709e3c[WebViewChannelDelegateMethods.injectCSSFileFromUrl.ordinal()] = 11;
                        } catch (NoSuchFieldError unused11) {
                        }
                        try {
/* 143 */                   f5337x95709e3c[WebViewChannelDelegateMethods.reload.ordinal()] = 12;
                        } catch (NoSuchFieldError unused12) {
                        }
                        try {
/* 155 */                   f5337x95709e3c[WebViewChannelDelegateMethods.goBack.ordinal()] = 13;
                        } catch (NoSuchFieldError unused13) {
                        }
                        try {
/* 167 */                   f5337x95709e3c[WebViewChannelDelegateMethods.canGoBack.ordinal()] = 14;
                        } catch (NoSuchFieldError unused14) {
                        }
                        try {
/* 179 */                   f5337x95709e3c[WebViewChannelDelegateMethods.goForward.ordinal()] = 15;
                        } catch (NoSuchFieldError unused15) {
                        }
                        try {
/* 191 */                   f5337x95709e3c[WebViewChannelDelegateMethods.canGoForward.ordinal()] = 16;
                        } catch (NoSuchFieldError unused16) {
                        }
                        try {
/* 203 */                   f5337x95709e3c[WebViewChannelDelegateMethods.goBackOrForward.ordinal()] = 17;
                        } catch (NoSuchFieldError unused17) {
                        }
                        try {
/* 215 */                   f5337x95709e3c[WebViewChannelDelegateMethods.canGoBackOrForward.ordinal()] = 18;
                        } catch (NoSuchFieldError unused18) {
                        }
                        try {
/* 227 */                   f5337x95709e3c[WebViewChannelDelegateMethods.stopLoading.ordinal()] = 19;
                        } catch (NoSuchFieldError unused19) {
                        }
                        try {
/* 239 */                   f5337x95709e3c[WebViewChannelDelegateMethods.isLoading.ordinal()] = 20;
                        } catch (NoSuchFieldError unused20) {
                        }
                        try {
/* 251 */                   f5337x95709e3c[WebViewChannelDelegateMethods.takeScreenshot.ordinal()] = 21;
                        } catch (NoSuchFieldError unused21) {
                        }
                        try {
/* 263 */                   f5337x95709e3c[WebViewChannelDelegateMethods.setSettings.ordinal()] = 22;
                        } catch (NoSuchFieldError unused22) {
                        }
                        try {
/* 275 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getSettings.ordinal()] = 23;
                        } catch (NoSuchFieldError unused23) {
                        }
                        try {
/* 287 */                   f5337x95709e3c[WebViewChannelDelegateMethods.close.ordinal()] = 24;
                        } catch (NoSuchFieldError unused24) {
                        }
                        try {
/* 299 */                   f5337x95709e3c[WebViewChannelDelegateMethods.show.ordinal()] = 25;
                        } catch (NoSuchFieldError unused25) {
                        }
                        try {
/* 311 */                   f5337x95709e3c[WebViewChannelDelegateMethods.hide.ordinal()] = 26;
                        } catch (NoSuchFieldError unused26) {
                        }
                        try {
/* 323 */                   f5337x95709e3c[WebViewChannelDelegateMethods.isHidden.ordinal()] = 27;
                        } catch (NoSuchFieldError unused27) {
                        }
                        try {
/* 335 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getCopyBackForwardList.ordinal()] = 28;
                        } catch (NoSuchFieldError unused28) {
                        }
                        try {
/* 347 */                   f5337x95709e3c[WebViewChannelDelegateMethods.startSafeBrowsing.ordinal()] = 29;
                        } catch (NoSuchFieldError unused29) {
                        }
                        try {
/* 359 */                   f5337x95709e3c[WebViewChannelDelegateMethods.clearCache.ordinal()] = 30;
                        } catch (NoSuchFieldError unused30) {
                        }
                        try {
/* 371 */                   f5337x95709e3c[WebViewChannelDelegateMethods.clearSslPreferences.ordinal()] = 31;
                        } catch (NoSuchFieldError unused31) {
                        }
                        try {
/* 383 */                   f5337x95709e3c[WebViewChannelDelegateMethods.findAll.ordinal()] = 32;
                        } catch (NoSuchFieldError unused32) {
                        }
                        try {
/* 395 */                   f5337x95709e3c[WebViewChannelDelegateMethods.findNext.ordinal()] = 33;
                        } catch (NoSuchFieldError unused33) {
                        }
                        try {
/* 407 */                   f5337x95709e3c[WebViewChannelDelegateMethods.clearMatches.ordinal()] = 34;
                        } catch (NoSuchFieldError unused34) {
                        }
                        try {
/* 419 */                   f5337x95709e3c[WebViewChannelDelegateMethods.scrollTo.ordinal()] = 35;
                        } catch (NoSuchFieldError unused35) {
                        }
                        try {
/* 431 */                   f5337x95709e3c[WebViewChannelDelegateMethods.scrollBy.ordinal()] = 36;
                        } catch (NoSuchFieldError unused36) {
                        }
                        try {
/* 443 */                   f5337x95709e3c[WebViewChannelDelegateMethods.pause.ordinal()] = 37;
                        } catch (NoSuchFieldError unused37) {
                        }
                        try {
/* 455 */                   f5337x95709e3c[WebViewChannelDelegateMethods.resume.ordinal()] = 38;
                        } catch (NoSuchFieldError unused38) {
                        }
                        try {
/* 467 */                   f5337x95709e3c[WebViewChannelDelegateMethods.pauseTimers.ordinal()] = 39;
                        } catch (NoSuchFieldError unused39) {
                        }
                        try {
/* 479 */                   f5337x95709e3c[WebViewChannelDelegateMethods.resumeTimers.ordinal()] = 40;
                        } catch (NoSuchFieldError unused40) {
                        }
                        try {
/* 491 */                   f5337x95709e3c[WebViewChannelDelegateMethods.printCurrentPage.ordinal()] = 41;
                        } catch (NoSuchFieldError unused41) {
                        }
                        try {
/* 503 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getContentHeight.ordinal()] = 42;
                        } catch (NoSuchFieldError unused42) {
                        }
                        try {
/* 515 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getContentWidth.ordinal()] = 43;
                        } catch (NoSuchFieldError unused43) {
                        }
                        try {
/* 527 */                   f5337x95709e3c[WebViewChannelDelegateMethods.zoomBy.ordinal()] = 44;
                        } catch (NoSuchFieldError unused44) {
                        }
                        try {
/* 539 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getOriginalUrl.ordinal()] = 45;
                        } catch (NoSuchFieldError unused45) {
                        }
                        try {
/* 551 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getZoomScale.ordinal()] = 46;
                        } catch (NoSuchFieldError unused46) {
                        }
                        try {
/* 563 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getSelectedText.ordinal()] = 47;
                        } catch (NoSuchFieldError unused47) {
                        }
                        try {
/* 575 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getHitTestResult.ordinal()] = 48;
                        } catch (NoSuchFieldError unused48) {
                        }
                        try {
/* 587 */                   f5337x95709e3c[WebViewChannelDelegateMethods.pageDown.ordinal()] = 49;
                        } catch (NoSuchFieldError unused49) {
                        }
                        try {
/* 599 */                   f5337x95709e3c[WebViewChannelDelegateMethods.pageUp.ordinal()] = 50;
                        } catch (NoSuchFieldError unused50) {
                        }
                        try {
/* 611 */                   f5337x95709e3c[WebViewChannelDelegateMethods.saveWebArchive.ordinal()] = 51;
                        } catch (NoSuchFieldError unused51) {
                        }
                        try {
/* 623 */                   f5337x95709e3c[WebViewChannelDelegateMethods.zoomIn.ordinal()] = 52;
                        } catch (NoSuchFieldError unused52) {
                        }
                        try {
/* 635 */                   f5337x95709e3c[WebViewChannelDelegateMethods.zoomOut.ordinal()] = 53;
                        } catch (NoSuchFieldError unused53) {
                        }
                        try {
/* 647 */                   f5337x95709e3c[WebViewChannelDelegateMethods.clearFocus.ordinal()] = 54;
                        } catch (NoSuchFieldError unused54) {
                        }
                        try {
/* 659 */                   f5337x95709e3c[WebViewChannelDelegateMethods.setContextMenu.ordinal()] = 55;
                        } catch (NoSuchFieldError unused55) {
                        }
                        try {
/* 671 */                   f5337x95709e3c[WebViewChannelDelegateMethods.requestFocusNodeHref.ordinal()] = 56;
                        } catch (NoSuchFieldError unused56) {
                        }
                        try {
/* 683 */                   f5337x95709e3c[WebViewChannelDelegateMethods.requestImageRef.ordinal()] = 57;
                        } catch (NoSuchFieldError unused57) {
                        }
                        try {
/* 695 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getScrollX.ordinal()] = 58;
                        } catch (NoSuchFieldError unused58) {
                        }
                        try {
/* 707 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getScrollY.ordinal()] = 59;
                        } catch (NoSuchFieldError unused59) {
                        }
                        try {
/* 719 */                   f5337x95709e3c[WebViewChannelDelegateMethods.getCertificate.ordinal()] = 60;
                        } catch (NoSuchFieldError unused60) {
                        }
                        try {
/* 731 */                   f5337x95709e3c[WebViewChannelDelegateMethods.clearHistory.ordinal()] = 61;
                        } catch (NoSuchFieldError unused61) {
                        }
                        try {
/* 743 */                   f5337x95709e3c[WebViewChannelDelegateMethods.addUserScript.ordinal()] = 62;
                        } catch (NoSuchFieldError unused62) {
                        }
                        try {
/* 755 */                   f5337x95709e3c[WebViewChannelDelegateMethods.removeUserScript.ordinal()] = 63;
                        } catch (NoSuchFieldError unused63) {
                        }
                        try {
/* 767 */                   f5337x95709e3c[WebViewChannelDelegateMethods.removeUserScriptsByGroupName.ordinal()] = 64;
                        } catch (NoSuchFieldError unused64) {
                        }
                        try {
/* 779 */                   f5337x95709e3c[WebViewChannelDelegateMethods.removeAllUserScripts.ordinal()] = 65;
                        } catch (NoSuchFieldError unused65) {
                        }
                        try {
/* 791 */                   f5337x95709e3c[WebViewChannelDelegateMethods.callAsyncJavaScript.ordinal()] = 66;
                        } catch (NoSuchFieldError unused66) {
                        }
                        try {
/* 803 */                   f5337x95709e3c[WebViewChannelDelegateMethods.isSecureContext.ordinal()] = 67;
                        } catch (NoSuchFieldError unused67) {
                        }
                        try {
/* 815 */                   f5337x95709e3c[WebViewChannelDelegateMethods.createWebMessageChannel.ordinal()] = 68;
                        } catch (NoSuchFieldError unused68) {
                        }
                        try {
/* 827 */                   f5337x95709e3c[WebViewChannelDelegateMethods.postWebMessage.ordinal()] = 69;
                        } catch (NoSuchFieldError unused69) {
                        }
                        try {
/* 839 */                   f5337x95709e3c[WebViewChannelDelegateMethods.addWebMessageListener.ordinal()] = 70;
                        } catch (NoSuchFieldError unused70) {
                        }
                        try {
/* 851 */                   f5337x95709e3c[WebViewChannelDelegateMethods.canScrollVertically.ordinal()] = 71;
                        } catch (NoSuchFieldError unused71) {
                        }
                        try {
/* 863 */                   f5337x95709e3c[WebViewChannelDelegateMethods.canScrollHorizontally.ordinal()] = 72;
                        } catch (NoSuchFieldError unused72) {
                        }
                        try {
/* 875 */                   f5337x95709e3c[WebViewChannelDelegateMethods.isInFullscreen.ordinal()] = 73;
                        } catch (NoSuchFieldError unused73) {
                        }
                        try {
/* 887 */                   f5337x95709e3c[WebViewChannelDelegateMethods.clearFormData.ordinal()] = 74;
                        } catch (NoSuchFieldError unused74) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CallJsHandlerCallback extends BaseCallbackResultImpl<Object> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public Object decodeResult(Object obj) {
/* 1 */                 return obj;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CreateWindowCallback extends BaseCallbackResultImpl<Boolean> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public Boolean decodeResult(Object obj) {
/* 16 */                return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FormResubmissionCallback extends BaseCallbackResultImpl<Integer> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public Integer decodeResult(Object obj) {
/* 3 */                 if (obj instanceof Integer) {
/* 5 */                     return (Integer) obj;
                        }
/* 8 */                 return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class GeolocationPermissionsShowPromptCallback extends BaseCallbackResultImpl<GeolocationPermissionShowPromptResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public GeolocationPermissionShowPromptResponse decodeResult(Object obj) {
/* 3 */                 return GeolocationPermissionShowPromptResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class JsAlertCallback extends BaseCallbackResultImpl<JsAlertResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public JsAlertResponse decodeResult(Object obj) {
/* 3 */                 return JsAlertResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class JsBeforeUnloadCallback extends BaseCallbackResultImpl<JsBeforeUnloadResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public JsBeforeUnloadResponse decodeResult(Object obj) {
/* 3 */                 return JsBeforeUnloadResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class JsConfirmCallback extends BaseCallbackResultImpl<JsConfirmResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public JsConfirmResponse decodeResult(Object obj) {
/* 3 */                 return JsConfirmResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class JsPromptCallback extends BaseCallbackResultImpl<JsPromptResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public JsPromptResponse decodeResult(Object obj) {
/* 3 */                 return JsPromptResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LoadResourceWithCustomSchemeCallback extends BaseCallbackResultImpl<CustomSchemeResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public CustomSchemeResponse decodeResult(Object obj) {
/* 3 */                 return CustomSchemeResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PermissionRequestCallback extends BaseCallbackResultImpl<PermissionResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public PermissionResponse decodeResult(Object obj) {
/* 3 */                 return PermissionResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PrintRequestCallback extends BaseCallbackResultImpl<Boolean> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public Boolean decodeResult(Object obj) {
/* 16 */                return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ReceivedClientCertRequestCallback extends BaseCallbackResultImpl<ClientCertResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public ClientCertResponse decodeResult(Object obj) {
/* 3 */                 return ClientCertResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ReceivedHttpAuthRequestCallback extends BaseCallbackResultImpl<HttpAuthResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public HttpAuthResponse decodeResult(Object obj) {
/* 3 */                 return HttpAuthResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ReceivedServerTrustAuthRequestCallback extends BaseCallbackResultImpl<ServerTrustAuthResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public ServerTrustAuthResponse decodeResult(Object obj) {
/* 3 */                 return ServerTrustAuthResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class RenderProcessResponsiveCallback extends BaseCallbackResultImpl<Integer> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public Integer decodeResult(Object obj) {
/* 3 */                 if (obj instanceof Integer) {
/* 5 */                     return (Integer) obj;
                        }
/* 8 */                 return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class RenderProcessUnresponsiveCallback extends BaseCallbackResultImpl<Integer> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public Integer decodeResult(Object obj) {
/* 3 */                 if (obj instanceof Integer) {
/* 5 */                     return (Integer) obj;
                        }
/* 8 */                 return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SafeBrowsingHitCallback extends BaseCallbackResultImpl<SafeBrowsingResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public SafeBrowsingResponse decodeResult(Object obj) {
/* 3 */                 return SafeBrowsingResponse.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public WebResourceResponseExt decodeResult(Object obj) {
/* 3 */                 return WebResourceResponseExt.fromMap((Map) obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ShouldOverrideUrlLoadingCallback extends BaseCallbackResultImpl<NavigationActionPolicy> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public NavigationActionPolicy decodeResult(Object obj) {
/* 18 */                return NavigationActionPolicy.fromValue(obj instanceof Integer ? ((Integer) obj).intValue() : NavigationActionPolicy.CANCEL.rawValue());
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SyncLoadResourceWithCustomSchemeCallback extends SyncBaseCallbackResultImpl<CustomSchemeResponse> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public CustomSchemeResponse decodeResult(Object obj) {
/* 6 */                 return new LoadResourceWithCustomSchemeCallback().decodeResult(obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
                    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                    public WebResourceResponseExt decodeResult(Object obj) {
/* 6 */                 return new ShouldInterceptRequestCallback().decodeResult(obj);
                    }
                }

                public WebViewChannelDelegate(InAppWebView inAppWebView, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.webView = inAppWebView;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.webView = null;
                }

                public void onCallJsHandler(String str, String str2, CallJsHandlerCallback callJsHandlerCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 callJsHandlerCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("handlerName", str);
/* 24 */            map.put("args", str2);
/* 29 */            channel.invokeMethod("onCallJsHandler", map, callJsHandlerCallback);
                }

                public void onCloseWindow() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onCloseWindow", new HashMap());
                }

                public void onConsoleMessage(String str, int i) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("message", str);
/* 24 */            map.put("messageLevel", Integer.valueOf(i));
/* 29 */            channel.invokeMethod("onConsoleMessage", map);
                }

                public void onContextMenuActionItemClicked(int i, String str) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("id", Integer.valueOf(i));
/* 28 */            map.put("androidId", Integer.valueOf(i));
/* 34 */            map.put("iosId", null);
/* 39 */            map.put("title", str);
/* 44 */            channel.invokeMethod("onContextMenuActionItemClicked", map);
                }

                public void onCreateContextMenu(HitTestResult hitTestResult) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 14 */            channel.invokeMethod("onCreateContextMenu", hitTestResult.toMap());
                }

                public void onCreateWindow(CreateWindowAction createWindowAction, CreateWindowCallback createWindowCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 createWindowCallback.defaultBehaviour(null);
                    } else {
/* 18 */                channel.invokeMethod("onCreateWindow", createWindowAction.toMap(), createWindowCallback);
                    }
                }

                public void onDownloadStartRequest(DownloadStartRequest downloadStartRequest) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 14 */            channel.invokeMethod("onDownloadStartRequest", downloadStartRequest.toMap());
                }

                public void onEnterFullscreen() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onEnterFullscreen", new HashMap());
                }

                public void onExitFullscreen() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onExitFullscreen", new HashMap());
                }

                @Deprecated
                public void onFindResultReceived(int i, int i2, boolean z) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("activeMatchOrdinal", Integer.valueOf(i));
/* 28 */            map.put("numberOfMatches", Integer.valueOf(i2));
/* 37 */            map.put("isDoneCounting", Boolean.valueOf(z));
/* 42 */            channel.invokeMethod("onFindResultReceived", map);
                }

                public void onFormResubmission(String str, FormResubmissionCallback formResubmissionCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 formResubmissionCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 24 */            channel.invokeMethod("onFormResubmission", map, formResubmissionCallback);
                }

                public void onGeolocationPermissionsHidePrompt() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onGeolocationPermissionsHidePrompt", new HashMap());
                }

                public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 geolocationPermissionsShowPromptCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put(FirebaseAnalytics.Param.ORIGIN, str);
/* 24 */            channel.invokeMethod("onGeolocationPermissionsShowPrompt", map, geolocationPermissionsShowPromptCallback);
                }

                public void onHideContextMenu() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onHideContextMenu", new HashMap());
                }

                public void onJsAlert(String str, String str2, Boolean bool, JsAlertCallback jsAlertCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 jsAlertCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 24 */            map.put("message", str2);
/* 29 */            map.put("isMainFrame", bool);
/* 34 */            channel.invokeMethod("onJsAlert", map, jsAlertCallback);
                }

                public void onJsBeforeUnload(String str, String str2, JsBeforeUnloadCallback jsBeforeUnloadCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 jsBeforeUnloadCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 24 */            map.put("message", str2);
/* 29 */            channel.invokeMethod("onJsBeforeUnload", map, jsBeforeUnloadCallback);
                }

                public void onJsConfirm(String str, String str2, Boolean bool, JsConfirmCallback jsConfirmCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 jsConfirmCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 24 */            map.put("message", str2);
/* 29 */            map.put("isMainFrame", bool);
/* 34 */            channel.invokeMethod("onJsConfirm", map, jsConfirmCallback);
                }

                public void onJsPrompt(String str, String str2, String str3, Boolean bool, JsPromptCallback jsPromptCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 jsPromptCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 24 */            map.put("message", str2);
/* 29 */            map.put("defaultValue", str3);
/* 34 */            map.put("isMainFrame", bool);
/* 39 */            channel.invokeMethod("onJsPrompt", map, jsPromptCallback);
                }

                public CustomSchemeResponse onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return null;
                    }
/* 11 */            HashMap map = new HashMap();
/* 20 */            map.put("request", webResourceRequestExt.toMap());
/* 34 */            return (CustomSchemeResponse) Util.invokeMethodAndWaitResult(channel, "onLoadResourceWithCustomScheme", map, new SyncLoadResourceWithCustomSchemeCallback());
                }

                public void onLoadStart(String str) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("url", str);
/* 20 */            channel.invokeMethod("onLoadStart", map);
                }

                public void onLoadStop(String str) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("url", str);
/* 20 */            channel.invokeMethod("onLoadStop", map);
                }

                public void onLongPressHitTestResult(HitTestResult hitTestResult) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 14 */            channel.invokeMethod("onLongPressHitTestResult", hitTestResult.toMap());
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
                    try {
                        switch (C06488.f5337x95709e3c[WebViewChannelDelegateMethods.valueOf(methodCall.method).ordinal()]) {
                            case 1:
/* 2130 */                      InAppWebView inAppWebView = this.webView;
/* 2138 */                      result.success(inAppWebView != null ? inAppWebView.getUrl() : null);
/* 2141 */                      return;
                            case 2:
/* 2118 */                      InAppWebView inAppWebView2 = this.webView;
/* 2126 */                      result.success(inAppWebView2 != null ? inAppWebView2.getTitle() : null);
/* 2129 */                      return;
                            case 3:
/* 2102 */                      InAppWebView inAppWebView3 = this.webView;
/* 2114 */                      result.success(inAppWebView3 != null ? Integer.valueOf(inAppWebView3.getProgress()) : null);
/* 2117 */                      return;
                            case 4:
/* 2077 */                      if (this.webView != null) {
/* 2093 */                          this.webView.loadUrl(URLRequest.fromMap((Map) methodCall.argument("urlRequest")));
                                }
/* 2098 */                      result.success(Boolean.TRUE);
/* 2101 */                      return;
                            case 5:
/* 2046 */                      if (this.webView != null) {
/* 2066 */                          this.webView.postUrl((String) methodCall.argument("url"), (byte[]) methodCall.argument("postData"));
                                }
/* 2071 */                      result.success(Boolean.TRUE);
/* 2074 */                      return;
                            case 6:
/* 1986 */                      if (this.webView != null) {
/* 2035 */                          this.webView.loadDataWithBaseURL((String) methodCall.argument("baseUrl"), (String) methodCall.argument(SharedDataContentProvider.BASE_PATH), (String) methodCall.argument("mimeType"), (String) methodCall.argument("encoding"), (String) methodCall.argument("historyUrl"));
                                }
/* 2040 */                      result.success(Boolean.TRUE);
/* 2043 */                      return;
                            case 7:
/* 1950 */                      if (this.webView != null) {
                                    try {
/* 1962 */                              this.webView.loadFile((String) methodCall.argument("assetFilePath"));
                                    } catch (IOException e) {
/* 1967 */                              e.printStackTrace();
/* 1974 */                              result.error(LOG_TAG, e.getMessage(), null);
/* 1977 */                              return;
                                    }
                                    break;
                                }
/* 1980 */                      result.success(Boolean.TRUE);
/* 1983 */                      return;
                            case 8:
/* 1915 */                      if (this.webView != null) {
/* 1940 */                          this.webView.evaluateJavascript((String) methodCall.argument(FirebaseAnalytics.Param.SOURCE), ContentWorld.fromMap((Map) methodCall.argument("contentWorld")), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.1
                                        @Override // android.webkit.ValueCallback
/* 6 */                                 public void onReceiveValue(String str) {
/* 7 */                                     result.success(str);
                                        }
                                    });
/* 1943 */                          return;
                                } else {
/* 1944 */                          result.success(null);
/* 1947 */                          return;
                                }
                            case 9:
/* 1886 */                      if (this.webView != null) {
/* 1904 */                          this.webView.injectJavascriptFileFromUrl((String) methodCall.argument("urlFile"), (Map) methodCall.argument("scriptHtmlTagAttributes"));
                                }
/* 1909 */                      result.success(Boolean.TRUE);
/* 1912 */                      return;
                            case 10:
/* 1865 */                      if (this.webView != null) {
/* 1875 */                          this.webView.injectCSSCode((String) methodCall.argument(FirebaseAnalytics.Param.SOURCE));
                                }
/* 1880 */                      result.success(Boolean.TRUE);
/* 1883 */                      return;
                            case 11:
/* 1836 */                      if (this.webView != null) {
/* 1854 */                          this.webView.injectCSSFileFromUrl((String) methodCall.argument("urlFile"), (Map) methodCall.argument("cssLinkHtmlTagAttributes"));
                                }
/* 1859 */                      result.success(Boolean.TRUE);
/* 1862 */                      return;
                            case 12:
/* 1821 */                      InAppWebView inAppWebView4 = this.webView;
/* 1823 */                      if (inAppWebView4 != null) {
/* 1825 */                          inAppWebView4.reload();
                                }
/* 1830 */                      result.success(Boolean.TRUE);
/* 1833 */                      return;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1808 */                      InAppWebView inAppWebView5 = this.webView;
/* 1810 */                      if (inAppWebView5 != null) {
/* 1812 */                          inAppWebView5.goBack();
                                }
/* 1817 */                      result.success(Boolean.TRUE);
/* 1820 */                      return;
                            case 14:
/* 1788 */                      InAppWebView inAppWebView6 = this.webView;
/* 1804 */                      result.success(Boolean.valueOf(inAppWebView6 != null && inAppWebView6.canGoBack()));
/* 1807 */                      return;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1774 */                      InAppWebView inAppWebView7 = this.webView;
/* 1776 */                      if (inAppWebView7 != null) {
/* 1778 */                          inAppWebView7.goForward();
                                }
/* 1783 */                      result.success(Boolean.TRUE);
/* 1786 */                      return;
                            case 16:
/* 1754 */                      InAppWebView inAppWebView8 = this.webView;
/* 1770 */                      result.success(Boolean.valueOf(inAppWebView8 != null && inAppWebView8.canGoForward()));
/* 1773 */                      return;
                            case 17:
/* 1730 */                      InAppWebView inAppWebView9 = this.webView;
/* 1732 */                      if (inAppWebView9 != null) {
/* 1744 */                          inAppWebView9.goBackOrForward(((Integer) methodCall.argument("steps")).intValue());
                                }
/* 1749 */                      result.success(Boolean.TRUE);
/* 1752 */                      return;
                            case 18:
/* 1700 */                      InAppWebView inAppWebView10 = this.webView;
/* 1726 */                      result.success(Boolean.valueOf(inAppWebView10 != null && inAppWebView10.canGoBackOrForward(((Integer) methodCall.argument("steps")).intValue())));
/* 1729 */                      return;
                            case 19:
/* 1686 */                      InAppWebView inAppWebView11 = this.webView;
/* 1688 */                      if (inAppWebView11 != null) {
/* 1690 */                          inAppWebView11.stopLoading();
                                }
/* 1695 */                      result.success(Boolean.TRUE);
/* 1698 */                      return;
                            case 20:
/* 1666 */                      InAppWebView inAppWebView12 = this.webView;
/* 1682 */                      result.success(Boolean.valueOf(inAppWebView12 != null && inAppWebView12.isLoading()));
/* 1685 */                      return;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 1645 */                      if (this.webView != null) {
/* 1657 */                          this.webView.takeScreenshot((Map) methodCall.argument("screenshotConfiguration"), result);
/* 1660 */                          return;
                                } else {
/* 1661 */                          result.success(null);
/* 1664 */                          return;
                                }
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 1576 */                      InAppWebView inAppWebView13 = this.webView;
/* 1578 */                      if (inAppWebView13 != null && (inAppWebView13.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
/* 1594 */                          InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity) this.webView.getInAppBrowserDelegate();
/* 1598 */                          InAppBrowserSettings inAppBrowserSettings = new InAppBrowserSettings();
/* 1605 */                          HashMap<String, Object> map = (HashMap) methodCall.argument("settings");
/* 1607 */                          inAppBrowserSettings.parse2((Map<String, Object>) map);
/* 1610 */                          inAppBrowserActivity.setSettings(inAppBrowserSettings, map);
                                } else if (this.webView != null) {
/* 1620 */                          InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
/* 1627 */                          HashMap<String, Object> map2 = (HashMap) methodCall.argument("settings");
/* 1629 */                          inAppWebViewSettings.parse2((Map<String, Object>) map2);
/* 1634 */                          this.webView.setSettings(inAppWebViewSettings, map2);
                                }
/* 1639 */                      result.success(Boolean.TRUE);
/* 1642 */                      return;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 1536 */                      InAppWebView inAppWebView14 = this.webView;
/* 1538 */                      if (inAppWebView14 != null && (inAppWebView14.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
/* 1560 */                          result.success(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).getCustomSettings());
/* 1563 */                          return;
                                } else {
/* 1564 */                          InAppWebView inAppWebView15 = this.webView;
/* 1572 */                          result.success(inAppWebView15 != null ? inAppWebView15.getCustomSettings() : null);
/* 1575 */                          return;
                                }
                            case 24:
/* 1508 */                      InAppWebView inAppWebView16 = this.webView;
/* 1510 */                      if (inAppWebView16 == null || !(inAppWebView16.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
/* 1532 */                          result.notImplemented();
/* 1535 */                          return;
                                } else {
/* 1528 */                          ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).close(result);
/* 1531 */                          return;
                                }
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 1475 */                      InAppWebView inAppWebView17 = this.webView;
/* 1477 */                      if (inAppWebView17 == null || !(inAppWebView17.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
/* 1504 */                          result.notImplemented();
/* 1507 */                          return;
                                } else {
/* 1495 */                          ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).show();
/* 1500 */                          result.success(Boolean.TRUE);
/* 1503 */                          return;
                                }
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 1442 */                      InAppWebView inAppWebView18 = this.webView;
/* 1444 */                      if (inAppWebView18 == null || !(inAppWebView18.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
/* 1471 */                          result.notImplemented();
/* 1474 */                          return;
                                } else {
/* 1462 */                          ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).hide();
/* 1467 */                          result.success(Boolean.TRUE);
/* 1470 */                          return;
                                }
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 1408 */                      InAppWebView inAppWebView19 = this.webView;
/* 1410 */                      if (inAppWebView19 == null || !(inAppWebView19.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
/* 1438 */                          result.notImplemented();
/* 1441 */                          return;
                                } else {
/* 1434 */                          result.success(Boolean.valueOf(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).isHidden));
/* 1437 */                          return;
                                }
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 1396 */                      InAppWebView inAppWebView20 = this.webView;
/* 1404 */                      result.success(inAppWebView20 != null ? inAppWebView20.getCopyBackForwardList() : null);
/* 1407 */                      return;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 1334 */                      if (this.webView == null || !xe2.m9786x("START_SAFE_BROWSING")) {
/* 1392 */                          result.success(Boolean.FALSE);
/* 1395 */                          return;
                                }
/* 1346 */                      Context context = this.webView.getContext();
/* 1352 */                      ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.2
                                    @Override // android.webkit.ValueCallback
/* 6 */                             public void onReceiveValue(Boolean bool) {
/* 7 */                                 result.success(bool);
                                    }
                                };
/* 1355 */                      Uri uri = y63.f19511a;
/* 1357 */                      C1823k9 c1823k9 = b73.f2303d;
/* 1363 */                      if (c1823k9.mo6026a()) {
/* 1365 */                          AbstractC2173s9.m8440f(context, valueCallback);
/* 1368 */                          return;
                                } else {
/* 1373 */                          if (!c1823k9.mo97b()) {
/* 1389 */                              throw b73.m1295a();
                                    }
/* 1381 */                          d73.f7038a.getStatics().initSafeBrowsing(context, valueCallback);
/* 1384 */                          return;
                                }
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 1319 */                      InAppWebView inAppWebView21 = this.webView;
/* 1321 */                      if (inAppWebView21 != null) {
/* 1323 */                          inAppWebView21.clearAllCache();
                                }
/* 1328 */                      result.success(Boolean.TRUE);
/* 1331 */                      return;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 1306 */                      InAppWebView inAppWebView22 = this.webView;
/* 1308 */                      if (inAppWebView22 != null) {
/* 1310 */                          inAppWebView22.clearSslPreferences();
                                }
/* 1315 */                      result.success(Boolean.TRUE);
/* 1318 */                      return;
                            case 32:
/* 1285 */                      if (this.webView != null) {
/* 1297 */                          this.webView.findAllAsync((String) methodCall.argument("find"));
                                }
/* 1302 */                      result.success(Boolean.TRUE);
/* 1305 */                      return;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 1258 */                      if (this.webView != null) {
/* 1274 */                          this.webView.findNext(((Boolean) methodCall.argument("forward")).booleanValue());
                                }
/* 1279 */                      result.success(Boolean.TRUE);
/* 1282 */                      return;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 1243 */                      InAppWebView inAppWebView23 = this.webView;
/* 1245 */                      if (inAppWebView23 != null) {
/* 1247 */                          inAppWebView23.clearMatches();
                                }
/* 1252 */                      result.success(Boolean.TRUE);
/* 1255 */                      return;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 1212 */                      if (this.webView != null) {
/* 1234 */                          this.webView.scrollTo((Integer) methodCall.argument("x"), (Integer) methodCall.argument("y"), (Boolean) methodCall.argument("animated"));
                                }
/* 1239 */                      result.success(Boolean.TRUE);
/* 1242 */                      return;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 1179 */                      if (this.webView != null) {
/* 1201 */                          this.webView.scrollBy((Integer) methodCall.argument("x"), (Integer) methodCall.argument("y"), (Boolean) methodCall.argument("animated"));
                                }
/* 1206 */                      result.success(Boolean.TRUE);
/* 1209 */                      return;
                            case 37:
/* 1164 */                      InAppWebView inAppWebView24 = this.webView;
/* 1166 */                      if (inAppWebView24 != null) {
/* 1168 */                          inAppWebView24.onPause();
                                }
/* 1173 */                      result.success(Boolean.TRUE);
/* 1176 */                      return;
                            case 38:
/* 1151 */                      InAppWebView inAppWebView25 = this.webView;
/* 1153 */                      if (inAppWebView25 != null) {
/* 1155 */                          inAppWebView25.onResume();
                                }
/* 1160 */                      result.success(Boolean.TRUE);
/* 1163 */                      return;
                            case 39:
/* 1138 */                      InAppWebView inAppWebView26 = this.webView;
/* 1140 */                      if (inAppWebView26 != null) {
/* 1142 */                          inAppWebView26.pauseTimers();
                                }
/* 1147 */                      result.success(Boolean.TRUE);
/* 1150 */                      return;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 1125 */                      InAppWebView inAppWebView27 = this.webView;
/* 1127 */                      if (inAppWebView27 != null) {
/* 1129 */                          inAppWebView27.resumeTimers();
                                }
/* 1134 */                      result.success(Boolean.TRUE);
/* 1137 */                      return;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 1093 */                      if (this.webView == null) {
/* 1121 */                          result.success(null);
/* 1124 */                          return;
                                }
/* 1097 */                      PrintJobSettings printJobSettings = new PrintJobSettings();
/* 1104 */                      Map<String, Object> map3 = (Map) methodCall.argument("settings");
/* 1106 */                      if (map3 != null) {
/* 1108 */                          printJobSettings.parse2(map3);
                                }
/* 1117 */                      result.success(this.webView.printCurrentPage(printJobSettings));
/* 1120 */                      return;
                            case 42:
/* 1071 */                      InAppWebView inAppWebView28 = this.webView;
/* 1073 */                      if (inAppWebView28 != null) {
/* 1083 */                          result.success(Integer.valueOf(inAppWebView28.getContentHeight()));
/* 1086 */                          return;
                                } else {
/* 1087 */                          result.success(null);
/* 1090 */                          return;
                                }
                            case 43:
/* 1054 */                      InAppWebView inAppWebView29 = this.webView;
/* 1056 */                      if (inAppWebView29 != null) {
/* 1063 */                          inAppWebView29.getContentWidth(new ValueCallback<Integer>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.3
                                        @Override // android.webkit.ValueCallback
/* 6 */                                 public void onReceiveValue(Integer num) {
/* 7 */                                     result.success(num);
                                        }
                                    });
/* 1066 */                          return;
                                } else {
/* 1067 */                          result.success(null);
/* 1070 */                          return;
                                }
                            case 44:
/* 1028 */                      if (this.webView != null) {
/* 1045 */                          this.webView.zoomBy((float) ((Double) methodCall.argument("zoomFactor")).doubleValue());
                                }
/* 1050 */                      result.success(Boolean.TRUE);
/* 1053 */                      return;
                            case 45:
/* 1014 */                      InAppWebView inAppWebView30 = this.webView;
/* 1022 */                      result.success(inAppWebView30 != null ? inAppWebView30.getOriginalUrl() : null);
/* 1025 */                      return;
                            case 46:
/* 994 */                       InAppWebView inAppWebView31 = this.webView;
/* 996 */                       if (inAppWebView31 != null) {
/* 1006 */                          result.success(Float.valueOf(inAppWebView31.getZoomScale()));
/* 1009 */                          return;
                                } else {
/* 1010 */                          result.success(null);
/* 1013 */                          return;
                                }
                            case 47:
/* 977 */                       InAppWebView inAppWebView32 = this.webView;
/* 979 */                       if (inAppWebView32 != null) {
/* 986 */                           inAppWebView32.getSelectedText(new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.4
                                        @Override // android.webkit.ValueCallback
/* 6 */                                 public void onReceiveValue(String str) {
/* 7 */                                     result.success(str);
                                        }
                                    });
/* 989 */                           return;
                                } else {
/* 990 */                           result.success(null);
/* 993 */                           return;
                                }
                            case 48:
/* 953 */                       InAppWebView inAppWebView33 = this.webView;
/* 955 */                       if (inAppWebView33 != null) {
/* 969 */                           result.success(HitTestResult.fromWebViewHitTestResult(inAppWebView33.getHitTestResult()).toMap());
/* 972 */                           return;
                                } else {
/* 973 */                           result.success(null);
/* 976 */                           return;
                                }
                            case 49:
/* 919 */                       if (this.webView != null) {
/* 943 */                           result.success(Boolean.valueOf(this.webView.pageDown(((Boolean) methodCall.argument("bottom")).booleanValue())));
/* 946 */                           return;
                                } else {
/* 949 */                           result.success(Boolean.FALSE);
/* 952 */                           return;
                                }
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 883 */                       if (this.webView != null) {
/* 907 */                           result.success(Boolean.valueOf(this.webView.pageUp(((Boolean) methodCall.argument("top")).booleanValue())));
/* 910 */                           return;
                                } else {
/* 913 */                           result.success(Boolean.FALSE);
/* 916 */                           return;
                                }
                            case 51:
/* 844 */                       if (this.webView != null) {
/* 873 */                           this.webView.saveWebArchive((String) methodCall.argument("filePath"), ((Boolean) methodCall.argument("autoname")).booleanValue(), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.5
                                        @Override // android.webkit.ValueCallback
/* 6 */                                 public void onReceiveValue(String str) {
/* 7 */                                     result.success(str);
                                        }
                                    });
/* 876 */                           return;
                                } else {
/* 877 */                           result.success(null);
/* 880 */                           return;
                                }
                            case 52:
/* 820 */                       InAppWebView inAppWebView34 = this.webView;
/* 822 */                       if (inAppWebView34 != null) {
/* 832 */                           result.success(Boolean.valueOf(inAppWebView34.zoomIn()));
/* 835 */                           return;
                                } else {
/* 838 */                           result.success(Boolean.FALSE);
/* 841 */                           return;
                                }
                            case 53:
/* 798 */                       InAppWebView inAppWebView35 = this.webView;
/* 800 */                       if (inAppWebView35 != null) {
/* 810 */                           result.success(Boolean.valueOf(inAppWebView35.zoomOut()));
/* 813 */                           return;
                                } else {
/* 816 */                           result.success(Boolean.FALSE);
/* 819 */                           return;
                                }
                            case 54:
/* 785 */                       InAppWebView inAppWebView36 = this.webView;
/* 787 */                       if (inAppWebView36 != null) {
/* 789 */                           inAppWebView36.clearFocus();
                                }
/* 794 */                       result.success(Boolean.TRUE);
/* 797 */                       return;
                            case 55:
/* 764 */                       if (this.webView != null) {
/* 776 */                           this.webView.setContextMenu((Map) methodCall.argument("contextMenu"));
                                }
/* 781 */                       result.success(Boolean.TRUE);
/* 784 */                       return;
                            case 56:
/* 746 */                       InAppWebView inAppWebView37 = this.webView;
/* 748 */                       if (inAppWebView37 != null) {
/* 754 */                           result.success(inAppWebView37.requestFocusNodeHref());
/* 757 */                           return;
                                } else {
/* 758 */                           result.success(null);
/* 761 */                           return;
                                }
                            case 57:
/* 730 */                       InAppWebView inAppWebView38 = this.webView;
/* 732 */                       if (inAppWebView38 != null) {
/* 738 */                           result.success(inAppWebView38.requestImageRef());
/* 741 */                           return;
                                } else {
/* 742 */                           result.success(null);
/* 745 */                           return;
                                }
                            case 58:
/* 710 */                       InAppWebView inAppWebView39 = this.webView;
/* 712 */                       if (inAppWebView39 != null) {
/* 722 */                           result.success(Integer.valueOf(inAppWebView39.getScrollX()));
/* 725 */                           return;
                                } else {
/* 726 */                           result.success(null);
/* 729 */                           return;
                                }
                            case 59:
/* 690 */                       InAppWebView inAppWebView40 = this.webView;
/* 692 */                       if (inAppWebView40 != null) {
/* 702 */                           result.success(Integer.valueOf(inAppWebView40.getScrollY()));
/* 705 */                           return;
                                } else {
/* 706 */                           result.success(null);
/* 709 */                           return;
                                }
                            case 60:
/* 670 */                       InAppWebView inAppWebView41 = this.webView;
/* 672 */                       if (inAppWebView41 != null) {
/* 682 */                           result.success(SslCertificateExt.toMap(inAppWebView41.getCertificate()));
/* 685 */                           return;
                                } else {
/* 686 */                           result.success(null);
/* 689 */                           return;
                                }
                            case 61:
/* 657 */                       InAppWebView inAppWebView42 = this.webView;
/* 659 */                       if (inAppWebView42 != null) {
/* 661 */                           inAppWebView42.clearHistory();
                                }
/* 666 */                       result.success(Boolean.TRUE);
/* 669 */                       return;
                            case 62:
/* 613 */                       InAppWebView inAppWebView43 = this.webView;
/* 615 */                       if (inAppWebView43 == null || inAppWebView43.getUserContentController() == null) {
/* 653 */                           result.success(Boolean.FALSE);
/* 656 */                           return;
                                } else {
/* 647 */                           result.success(Boolean.valueOf(this.webView.getUserContentController().addUserOnlyScript(UserScript.fromMap((Map) methodCall.argument("userScript")))));
/* 650 */                           return;
                                }
                            case 63:
/* 553 */                       InAppWebView inAppWebView44 = this.webView;
/* 555 */                       if (inAppWebView44 == null || inAppWebView44.getUserContentController() == null) {
/* 609 */                           result.success(Boolean.FALSE);
/* 612 */                           return;
                                } else {
/* 603 */                           result.success(Boolean.valueOf(this.webView.getUserContentController().removeUserOnlyScriptAt(((Integer) methodCall.argument(FirebaseAnalytics.Param.INDEX)).intValue(), UserScript.fromMap((Map) methodCall.argument("userScript")).getInjectionTime())));
/* 606 */                           return;
                                }
                            case 64:
/* 520 */                       InAppWebView inAppWebView45 = this.webView;
/* 522 */                       if (inAppWebView45 != null && inAppWebView45.getUserContentController() != null) {
/* 544 */                           this.webView.getUserContentController().removeUserOnlyScriptsByGroupName((String) methodCall.argument("groupName"));
                                }
/* 549 */                       result.success(Boolean.TRUE);
/* 552 */                       return;
                            case 65:
/* 495 */                       InAppWebView inAppWebView46 = this.webView;
/* 497 */                       if (inAppWebView46 != null && inAppWebView46.getUserContentController() != null) {
/* 511 */                           this.webView.getUserContentController().removeAllUserOnlyScripts();
                                }
/* 516 */                       result.success(Boolean.TRUE);
/* 519 */                       return;
                            case 66:
/* 452 */                       if (this.webView != null) {
/* 487 */                           this.webView.callAsyncJavaScript((String) methodCall.argument("functionBody"), (Map) methodCall.argument("arguments"), ContentWorld.fromMap((Map) methodCall.argument("contentWorld")), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.6
                                        @Override // android.webkit.ValueCallback
/* 6 */                                 public void onReceiveValue(String str) {
/* 7 */                                     result.success(str);
                                        }
                                    });
/* 490 */                           return;
                                } else {
/* 491 */                           result.success(null);
/* 494 */                           return;
                                }
                            case 67:
/* 431 */                       InAppWebView inAppWebView47 = this.webView;
/* 433 */                       if (inAppWebView47 != null) {
/* 440 */                           inAppWebView47.isSecureContext(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.7
                                        @Override // android.webkit.ValueCallback
/* 6 */                                 public void onReceiveValue(Boolean bool) {
/* 7 */                                     result.success(bool);
                                        }
                                    });
/* 443 */                           return;
                                } else {
/* 446 */                           result.success(Boolean.FALSE);
/* 449 */                           return;
                                }
                            case 68:
/* 399 */                       if (this.webView == null) {
/* 427 */                           result.success(null);
/* 430 */                           return;
                                } else if (xe2.m9786x("CREATE_WEB_MESSAGE_CHANNEL")) {
/* 419 */                           result.success(this.webView.createCompatWebMessageChannel().toMap());
/* 422 */                           return;
                                } else {
/* 423 */                           result.success(null);
/* 426 */                           return;
                                }
                            case 69:
/* 198 */                       if (this.webView == null || !xe2.m9786x("POST_WEB_MESSAGE")) {
/* 393 */                           result.success(Boolean.TRUE);
/* 396 */                           return;
                                }
/* 216 */                       WebMessageCompatExt webMessageCompatExtFromMap = WebMessageCompatExt.fromMap((Map) methodCall.argument("message"));
/* 226 */                       String str = (String) methodCall.argument("targetOrigin");
/* 230 */                       ArrayList arrayList = new ArrayList();
/* 233 */                       List<WebMessagePortCompatExt> ports = webMessageCompatExtFromMap.getPorts();
/* 237 */                       if (ports != null) {
/* 247 */                           for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
/* 265 */                               WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
/* 271 */                               if (webMessageChannel != null && this.webView != null) {
/* 289 */                                   arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                                        }
                                    }
                                }
/* 293 */                       Object data = webMessageCompatExtFromMap.getData();
/* 299 */                       if (this.webView != null) {
                                    try {
/* 307 */                               if (xe2.m9786x("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExtFromMap.getType() == 1) {
/* 339 */                                   y63.m10120e(this.webView, new i63((byte[]) data, (l63[]) arrayList.toArray(new l63[0])), Uri.parse(str));
                                        } else {
/* 374 */                                   y63.m10120e(this.webView, new i63(data != null ? data.toString() : null, (l63[]) arrayList.toArray(new l63[0])), Uri.parse(str));
                                        }
/* 379 */                               result.success(Boolean.TRUE);
/* 382 */                               return;
                                    } catch (Exception e2) {
/* 387 */                               result.error(LOG_TAG, e2.getMessage(), null);
/* 390 */                               return;
                                    }
                                }
/* 390 */                       return;
                            case 70:
/* 129 */                       if (this.webView == null) {
/* 192 */                           result.success(Boolean.TRUE);
/* 195 */                           return;
                                }
/* 137 */                       Map map4 = (Map) methodCall.argument("webMessageListener");
/* 139 */                       InAppWebView inAppWebView48 = this.webView;
/* 147 */                       WebMessageListener webMessageListenerFromMap = WebMessageListener.fromMap(inAppWebView48, inAppWebView48.getPlugin().messenger, map4);
/* 153 */                       if (this.webView == null || !xe2.m9786x("WEB_MESSAGE_LISTENER")) {
/* 186 */                           result.success(Boolean.TRUE);
/* 189 */                           return;
                                }
                                try {
/* 165 */                           this.webView.addWebMessageListener(webMessageListenerFromMap);
/* 170 */                           result.success(Boolean.TRUE);
/* 173 */                           return;
                                } catch (Exception e3) {
/* 179 */                           result.error(LOG_TAG, e3.getMessage(), null);
/* 390 */                           return;
                                }
                            case 71:
/* 105 */                       InAppWebView inAppWebView49 = this.webView;
/* 107 */                       if (inAppWebView49 != null) {
/* 117 */                           result.success(Boolean.valueOf(inAppWebView49.canScrollVertically()));
/* 120 */                           return;
                                } else {
/* 123 */                           result.success(Boolean.FALSE);
/* 126 */                           return;
                                }
                            case 72:
/* 83 */                        InAppWebView inAppWebView50 = this.webView;
/* 85 */                        if (inAppWebView50 != null) {
/* 95 */                            result.success(Boolean.valueOf(inAppWebView50.canScrollHorizontally()));
/* 98 */                            return;
                                } else {
/* 101 */                           result.success(Boolean.FALSE);
/* 104 */                           return;
                                }
                            case 73:
/* 61 */                        InAppWebView inAppWebView51 = this.webView;
/* 63 */                        if (inAppWebView51 != null) {
/* 73 */                            result.success(Boolean.valueOf(inAppWebView51.isInFullscreen()));
/* 76 */                            return;
                                } else {
/* 79 */                            result.success(Boolean.FALSE);
/* 82 */                            return;
                                }
                            case 74:
/* 48 */                        InAppWebView inAppWebView52 = this.webView;
/* 50 */                        if (inAppWebView52 != null) {
/* 52 */                            inAppWebView52.clearFormData();
                                }
/* 57 */                        result.success(Boolean.TRUE);
/* 60 */                        return;
                            default:
/* 390 */                       return;
                        }
                    } catch (IllegalArgumentException unused) {
/* 2142 */              result.notImplemented();
                    }
                }

                public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("x", Integer.valueOf(i));
/* 28 */            map.put("y", Integer.valueOf(i2));
/* 37 */            map.put("clampedX", Boolean.valueOf(z));
/* 46 */            map.put("clampedY", Boolean.valueOf(z2));
/* 51 */            channel.invokeMethod("onOverScrolled", map);
                }

                public void onPageCommitVisible(String str) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("url", str);
/* 20 */            channel.invokeMethod("onPageCommitVisible", map);
                }

                public void onPermissionRequest(String str, List<String> list, Object obj, PermissionRequestCallback permissionRequestCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 permissionRequestCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put(FirebaseAnalytics.Param.ORIGIN, str);
/* 24 */            map.put("resources", list);
/* 29 */            map.put("frame", obj);
/* 34 */            channel.invokeMethod("onPermissionRequest", map, permissionRequestCallback);
                }

                public void onPermissionRequestCanceled(String str, List<String> list) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put(FirebaseAnalytics.Param.ORIGIN, str);
/* 20 */            map.put("resources", list);
/* 25 */            channel.invokeMethod("onPermissionRequestCanceled", map);
                }

                public void onPrintRequest(String str, String str2, PrintRequestCallback printRequestCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 printRequestCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 24 */            map.put("printJobId", str2);
/* 29 */            channel.invokeMethod("onPrintRequest", map, printRequestCallback);
                }

                public void onProgressChanged(int i) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(i));
/* 24 */            channel.invokeMethod("onProgressChanged", map);
                }

                public void onReceivedClientCertRequest(ClientCertChallenge clientCertChallenge, ReceivedClientCertRequestCallback receivedClientCertRequestCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 receivedClientCertRequestCallback.defaultBehaviour(null);
                    } else {
/* 18 */                channel.invokeMethod("onReceivedClientCertRequest", clientCertChallenge.toMap(), receivedClientCertRequestCallback);
                    }
                }

                public void onReceivedError(WebResourceRequestExt webResourceRequestExt, WebResourceErrorExt webResourceErrorExt) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("request", webResourceRequestExt.toMap());
/* 28 */            map.put("error", webResourceErrorExt.toMap());
/* 33 */            channel.invokeMethod("onReceivedError", map);
                }

                public void onReceivedHttpAuthRequest(HttpAuthenticationChallenge httpAuthenticationChallenge, ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 receivedHttpAuthRequestCallback.defaultBehaviour(null);
                    } else {
/* 18 */                channel.invokeMethod("onReceivedHttpAuthRequest", httpAuthenticationChallenge.toMap(), receivedHttpAuthRequestCallback);
                    }
                }

                public void onReceivedHttpError(WebResourceRequestExt webResourceRequestExt, WebResourceResponseExt webResourceResponseExt) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("request", webResourceRequestExt.toMap());
/* 28 */            map.put("errorResponse", webResourceResponseExt.toMap());
/* 33 */            channel.invokeMethod("onReceivedHttpError", map);
                }

                public void onReceivedIcon(byte[] bArr) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("icon", bArr);
/* 20 */            channel.invokeMethod("onReceivedIcon", map);
                }

                public void onReceivedLoginRequest(String str, String str2, String str3) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str);
/* 20 */            map.put("account", str2);
/* 25 */            map.put("args", str3);
/* 30 */            channel.invokeMethod("onReceivedLoginRequest", map);
                }

                public void onReceivedServerTrustAuthRequest(ServerTrustChallenge serverTrustChallenge, ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 receivedServerTrustAuthRequestCallback.defaultBehaviour(null);
                    } else {
/* 18 */                channel.invokeMethod("onReceivedServerTrustAuthRequest", serverTrustChallenge.toMap(), receivedServerTrustAuthRequestCallback);
                    }
                }

                public void onReceivedTouchIconUrl(String str, boolean z) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("url", str);
/* 24 */            map.put("precomposed", Boolean.valueOf(z));
/* 29 */            channel.invokeMethod("onReceivedTouchIconUrl", map);
                }

                public void onRenderProcessGone(boolean z, int i) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("didCrash", Boolean.valueOf(z));
/* 28 */            map.put("rendererPriorityAtExit", Integer.valueOf(i));
/* 33 */            channel.invokeMethod("onRenderProcessGone", map);
                }

                public void onRenderProcessResponsive(String str, RenderProcessResponsiveCallback renderProcessResponsiveCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 renderProcessResponsiveCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 24 */            channel.invokeMethod("onRenderProcessResponsive", map, renderProcessResponsiveCallback);
                }

                public void onRenderProcessUnresponsive(String str, RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 renderProcessUnresponsiveCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 24 */            channel.invokeMethod("onRenderProcessUnresponsive", map, renderProcessUnresponsiveCallback);
                }

                public void onRequestFocus() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onRequestFocus", new HashMap());
                }

                public void onSafeBrowsingHit(String str, int i, SafeBrowsingHitCallback safeBrowsingHitCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 safeBrowsingHitCallback.defaultBehaviour(null);
/* 11 */                return;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            map.put("url", str);
/* 28 */            map.put("threatType", Integer.valueOf(i));
/* 33 */            channel.invokeMethod("onSafeBrowsingHit", map, safeBrowsingHitCallback);
                }

                public void onScrollChanged(int i, int i2) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("x", Integer.valueOf(i));
/* 28 */            map.put("y", Integer.valueOf(i2));
/* 33 */            channel.invokeMethod("onScrollChanged", map);
                }

                public void onTitleChanged(String str) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("title", str);
/* 20 */            channel.invokeMethod("onTitleChanged", map);
                }

                public void onUpdateVisitedHistory(String str, boolean z) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 15 */            map.put("url", str);
/* 24 */            map.put("isReload", Boolean.valueOf(z));
/* 29 */            channel.invokeMethod("onUpdateVisitedHistory", map);
                }

                public void onZoomScaleChanged(float f, float f2) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put("oldScale", Float.valueOf(f));
/* 28 */            map.put("newScale", Float.valueOf(f2));
/* 33 */            channel.invokeMethod("onZoomScaleChanged", map);
                }

                public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return null;
                    }
/* 24 */            return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
                }

                public void shouldOverrideUrlLoading(NavigationAction navigationAction, ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 8 */                 shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
                    } else {
/* 18 */                channel.invokeMethod("shouldOverrideUrlLoading", navigationAction.toMap(), shouldOverrideUrlLoadingCallback);
                    }
                }

/* 26 */        public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
/* 27 */            MethodChannel channel = getChannel();
                    if (channel == null) {
/* 28 */                shouldInterceptRequestCallback.defaultBehaviour(null);
                    } else {
/* 29 */                channel.invokeMethod("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
                    }
                }

/* 36 */        public void onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt, LoadResourceWithCustomSchemeCallback loadResourceWithCustomSchemeCallback) {
/* 37 */            MethodChannel channel = getChannel();
                    if (channel == null) {
/* 38 */                loadResourceWithCustomSchemeCallback.defaultBehaviour(null);
                        return;
                    }
/* 39 */            HashMap map = new HashMap();
/* 40 */            map.put("request", webResourceRequestExt.toMap());
/* 41 */            channel.invokeMethod("onLoadResourceWithCustomScheme", map, loadResourceWithCustomSchemeCallback);
                }
            }
