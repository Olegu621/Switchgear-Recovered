            package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

            import android.os.Handler;
            import android.text.TextUtils;
            import android.webkit.WebResourceResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import java.io.ByteArrayInputStream;
            import java.net.HttpURLConnection;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.CountDownLatch;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public class ContentBlockerHandler {
                protected static final String LOG_TAG = "ContentBlockerHandler";
                protected List<ContentBlocker> ruleList;

                /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler$3 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C06163 {

                    /* JADX INFO: renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType */
                    static final /* synthetic */ int[] f5321xcaeba15d;

                    static {
/* 6 */                 int[] iArr = new int[ContentBlockerActionType.values().length];
/* 8 */                 f5321xcaeba15d = iArr;
                        try {
/* 17 */                    iArr[ContentBlockerActionType.BLOCK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f5321xcaeba15d[ContentBlockerActionType.CSS_DISPLAY_NONE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    f5321xcaeba15d[ContentBlockerActionType.MAKE_HTTPS.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                public ContentBlockerHandler() {
/* 9 */             this.ruleList = new ArrayList();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v10, types: [java.io.InputStream] */
                public WebResourceResponse checkUrl(final InAppWebView inAppWebView, WebResourceRequestExt webResourceRequestExt, ContentBlockerTriggerResourceType contentBlockerTriggerResourceType) throws InterruptedException {
                    URI uri;
                    WebResourceResponse webResourceResponse;
                    char c;
                    Iterator it;
                    HttpURLConnection httpURLConnectionMakeHttpRequest;
                    String str;
                    String[] strArr;
/* 11 */            WebResourceResponse webResourceResponse2 = null;
/* 12 */            if (inAppWebView.customSettings.contentBlockers == null) {
/* 11 */                return null;
                    }
/* 15 */            String url = webResourceRequestExt.getUrl();
/* 19 */            char c2 = 0;
                    try {
/* 22 */                uri = new URI(url);
                    } catch (URISyntaxException unused) {
/* 32 */                String str2 = url.split(":")[0];
/* 42 */                URL url2 = new URL(url.replace(str2, "https"));
/* 71 */                uri = new URI(str2, url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    }
/* 75 */            String host = uri.getHost();
/* 79 */            int port = uri.getPort();
/* 83 */            String scheme = uri.getScheme();
/* 94 */            Iterator it2 = new CopyOnWriteArrayList(this.ruleList).iterator();
/* 102 */           while (it2.hasNext()) {
/* 108 */               ContentBlocker contentBlocker = (ContentBlocker) it2.next();
/* 110 */               ContentBlockerTrigger trigger = contentBlocker.getTrigger();
/* 114 */               List<ContentBlockerTriggerResourceType> resourceType = trigger.getResourceType();
/* 124 */               if (resourceType.contains(ContentBlockerTriggerResourceType.IMAGE)) {
/* 126 */                   ContentBlockerTriggerResourceType contentBlockerTriggerResourceType2 = ContentBlockerTriggerResourceType.SVG_DOCUMENT;
/* 132 */                   if (!resourceType.contains(contentBlockerTriggerResourceType2)) {
/* 134 */                       resourceType.add(contentBlockerTriggerResourceType2);
                            }
                        }
/* 137 */               ContentBlockerAction action = contentBlocker.getAction();
/* 153 */               if (trigger.getUrlFilterPatternCompiled().matcher(url).matches()) {
/* 159 */                   if (!resourceType.isEmpty() && !resourceType.contains(contentBlockerTriggerResourceType)) {
/* 169 */                       return webResourceResponse2;
                            }
/* 184 */                   if (!trigger.getIfDomain().isEmpty()) {
/* 198 */                       for (String str3 : trigger.getIfDomain()) {
/* 204 */                           c = c2;
/* 214 */                           if (str3.startsWith("*")) {
/* 216 */                               webResourceResponse = webResourceResponse2;
/* 226 */                               if (!host.endsWith(str3.replace("*", HttpUrl.FRAGMENT_ENCODE_SET))) {
                                        }
                                    } else {
/* 229 */                               webResourceResponse = webResourceResponse2;
                                    }
/* 235 */                           if (!str3.equals(host)) {
/* 238 */                               webResourceResponse2 = webResourceResponse;
/* 240 */                               c2 = c;
                                    }
                                }
/* 243 */                       return webResourceResponse2;
                            }
/* 246 */                   webResourceResponse = webResourceResponse2;
/* 248 */                   c = c2;
/* 258 */                   if (!trigger.getUnlessDomain().isEmpty()) {
/* 272 */                       for (String str4 : trigger.getUnlessDomain()) {
/* 284 */                           if ((str4.startsWith("*") && host.endsWith(str4.replace("*", HttpUrl.FRAGMENT_ENCODE_SET))) || str4.equals(host)) {
/* 302 */                               return webResourceResponse;
                                    }
                                }
                            }
/* 304 */                   final String[] strArr2 = new String[1];
/* 314 */                   if (!trigger.getLoadType().isEmpty() || !trigger.getIfTopUrl().isEmpty() || !trigger.getUnlessTopUrl().isEmpty()) {
/* 338 */                       final CountDownLatch countDownLatch = new CountDownLatch(1);
/* 355 */                       new Handler(inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler.1
                                    @Override // java.lang.Runnable
                                    public void run() {
/* 10 */                                strArr2[0] = inAppWebView.getUrl();
/* 14 */                                countDownLatch.countDown();
                                    }
                                });
/* 358 */                       countDownLatch.await();
                            }
/* 363 */                   if (strArr2[c] != null) {
/* 373 */                       if (trigger.getLoadType().isEmpty()) {
/* 447 */                           strArr = strArr2;
/* 449 */                           it = it2;
                                } else {
/* 379 */                           URI uri2 = new URI(strArr2[c]);
/* 382 */                           String host2 = uri2.getHost();
/* 386 */                           int port2 = uri2.getPort();
/* 390 */                           String scheme2 = uri2.getScheme();
/* 394 */                           strArr = strArr2;
/* 400 */                           it = it2;
/* 408 */                           if ((trigger.getLoadType().contains("first-party") && host2 != null && (!scheme2.equals(scheme) || !host2.equals(host) || port2 != port)) || (trigger.getLoadType().contains("third-party") && host2 != null && host2.equals(host))) {
/* 446 */                               return webResourceResponse;
                                    }
                                }
/* 459 */                       if (!trigger.getIfTopUrl().isEmpty()) {
/* 465 */                           Iterator<String> it3 = trigger.getIfTopUrl().iterator();
/* 473 */                           while (it3.hasNext()) {
/* 487 */                               if (strArr[c].startsWith(it3.next())) {
                                        }
                                    }
/* 490 */                           return webResourceResponse;
                                }
/* 499 */                       if (!trigger.getUnlessTopUrl().isEmpty()) {
/* 505 */                           Iterator<String> it4 = trigger.getUnlessTopUrl().iterator();
/* 513 */                           while (it4.hasNext()) {
/* 527 */                               if (strArr[c].startsWith(it4.next())) {
/* 529 */                                   return webResourceResponse;
                                        }
                                    }
                                }
                            } else {
/* 530 */                       it = it2;
                            }
/* 542 */                   int i = C06163.f5321xcaeba15d[action.getType().ordinal()];
/* 545 */                   if (i == 1) {
/* 815 */                       return new WebResourceResponse(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, webResourceResponse);
                            }
/* 548 */                   if (i == 2) {
/* 776 */                       String selector = action.getSelector();
/* 786 */                       final String strM3785k = fm0.m3785k("(function(d) {    function hide () {        if (d.body != null && !d.getElementById('flutter_inappwebview-css-display-none-style')) {            var c = d.createElement('style');            c.id = 'flutter_inappwebview-css-display-none-style';            c.innerHTML = '", selector, " { display: none !important; }';            d.body.appendChild(c);        }       d.querySelectorAll('", selector, "').forEach(function (item, index) {            item.setAttribute('style', 'display: none !important;');        });    };    hide();    d.addEventListener('DOMContentLoaded', function(event) { hide(); }); })(document);");
/* 806 */                       new Handler(inAppWebView.getWebViewLooper()).postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler.2
                                    @Override // java.lang.Runnable
                                    public void run() {
/* 6 */                                 inAppWebView.evaluateJavascript(strM3785k, null);
                                    }
                                }, 800L);
                            } else if (i == 3 && scheme.equals("http") && ((port == -1 || port == 80) && (httpURLConnectionMakeHttpRequest = Util.makeHttpRequest(url.replace("http://", "https://"), webResourceRequestExt.getMethod(), webResourceRequestExt.getHeaders())) != null)) {
                                try {
/* 602 */                           byte[] allBytes = Util.readAllBytes(httpURLConnectionMakeHttpRequest.getInputStream());
/* 606 */                           if (allBytes == null) {
/* 608 */                               httpURLConnectionMakeHttpRequest.disconnect();
/* 611 */                               return webResourceResponse;
                                    }
/* 614 */                           ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(allBytes);
/* 617 */                           String contentEncoding = httpURLConnectionMakeHttpRequest.getContentEncoding();
/* 621 */                           String contentType = httpURLConnectionMakeHttpRequest.getContentType();
/* 625 */                           if (contentType == null) {
/* 627 */                               str = "text/plain";
                                    } else {
/* 639 */                               String[] strArrSplit = contentType.split(";");
/* 645 */                               String strTrim = strArrSplit[c].trim();
/* 649 */                               if (contentEncoding == null) {
/* 674 */                                   contentEncoding = (strArrSplit.length <= 1 || !strArrSplit[1].contains("charset=")) ? "utf-8" : strArrSplit[1].replace("charset=", HttpUrl.FRAGMENT_ENCODE_SET).trim();
                                        }
/* 676 */                               str = strTrim;
                                    }
/* 631 */                           String str5 = contentEncoding;
/* 679 */                           String responseMessage = httpURLConnectionMakeHttpRequest.getResponseMessage();
/* 683 */                           if (responseMessage == null) {
/* 760 */                               WebResourceResponse webResourceResponse3 = new WebResourceResponse(str, str5, byteArrayInputStream);
/* 763 */                               httpURLConnectionMakeHttpRequest.disconnect();
/* 766 */                               return webResourceResponse3;
                                    }
/* 687 */                           HashMap map = new HashMap();
/* 706 */                           for (Map.Entry<String, List<String>> entry : httpURLConnectionMakeHttpRequest.getHeaderFields().entrySet()) {
/* 732 */                               map.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
                                    }
/* 746 */                           WebResourceResponse webResourceResponse4 = new WebResourceResponse(str, str5, httpURLConnectionMakeHttpRequest.getResponseCode(), responseMessage, map, byteArrayInputStream);
/* 749 */                           httpURLConnectionMakeHttpRequest.disconnect();
/* 752 */                           return webResourceResponse4;
                                } catch (Exception unused2) {
/* 771 */                           httpURLConnectionMakeHttpRequest.disconnect();
                                } catch (Throwable th) {
/* 767 */                           httpURLConnectionMakeHttpRequest.disconnect();
/* 770 */                           throw th;
                                }
                            }
/* 553 */                   webResourceResponse2 = webResourceResponse;
/* 555 */                   c2 = c;
/* 557 */                   it2 = it;
                        }
                    }
/* 823 */           return webResourceResponse2;
                }

                public ContentBlockerTriggerResourceType getResourceTypeFromContentType(String str) {
/* 1 */             ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
/* 9 */             if (str.equals("text/css")) {
/* 11 */                return ContentBlockerTriggerResourceType.STYLE_SHEET;
                    }
/* 20 */            if (str.equals("image/svg+xml")) {
/* 22 */                return ContentBlockerTriggerResourceType.SVG_DOCUMENT;
                    }
/* 31 */            if (str.startsWith("image/")) {
/* 33 */                return ContentBlockerTriggerResourceType.IMAGE;
                    }
/* 42 */            if (str.startsWith("font/")) {
/* 44 */                return ContentBlockerTriggerResourceType.FONT;
                    }
/* 53 */            if (str.startsWith("audio/") || str.startsWith("video/") || str.equals("application/ogg")) {
/* 94 */                return ContentBlockerTriggerResourceType.MEDIA;
                    }
/* 78 */            if (str.endsWith("javascript")) {
/* 80 */                return ContentBlockerTriggerResourceType.SCRIPT;
                    }
                    return str.startsWith("text/") ? ContentBlockerTriggerResourceType.DOCUMENT : contentBlockerTriggerResourceType;
                }

                public ContentBlockerTriggerResourceType getResourceTypeFromUrl(WebResourceRequestExt webResourceRequestExt) {
                    HttpURLConnection httpURLConnectionMakeHttpRequest;
/* 1 */             ContentBlockerTriggerResourceType resourceTypeFromContentType = ContentBlockerTriggerResourceType.RAW;
/* 3 */             String url = webResourceRequestExt.getUrl();
/* 13 */            if ((url.startsWith("http://") || url.startsWith("https://")) && (httpURLConnectionMakeHttpRequest = Util.makeHttpRequest(url, "HEAD", webResourceRequestExt.getHeaders())) != null) {
                        try {
/* 35 */                    String contentType = httpURLConnectionMakeHttpRequest.getContentType();
/* 39 */                    if (contentType != null) {
/* 54 */                        resourceTypeFromContentType = getResourceTypeFromContentType(contentType.split(";")[0].trim());
                            }
/* 64 */                    return resourceTypeFromContentType;
                        } catch (Exception unused) {
                        } finally {
/* 65 */                    httpURLConnectionMakeHttpRequest.disconnect();
                        }
                    }
/* 72 */            return resourceTypeFromContentType;
                }

                public List<ContentBlocker> getRuleList() {
/* 1 */             return this.ruleList;
                }

                public void setRuleList(List<ContentBlocker> list) {
/* 1 */             this.ruleList = list;
                }

/* 11 */        public ContentBlockerHandler(List<ContentBlocker> list) {
/* 13 */            new ArrayList();
/* 14 */            this.ruleList = list;
                }

/* 823 */       public WebResourceResponse checkUrl(InAppWebView inAppWebView, WebResourceRequestExt webResourceRequestExt) {
/* 825 */           return checkUrl(inAppWebView, webResourceRequestExt, getResourceTypeFromUrl(webResourceRequestExt));
                }

/* 825 */       public WebResourceResponse checkUrl(InAppWebView inAppWebView, WebResourceRequestExt webResourceRequestExt, String str) {
/* 827 */           return checkUrl(inAppWebView, webResourceRequestExt, getResourceTypeFromContentType(str));
                }
            }
