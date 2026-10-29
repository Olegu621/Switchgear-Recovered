            package com.supercell.titan;

            import android.content.ActivityNotFoundException;
            import android.graphics.Bitmap;
            import android.graphics.Rect;
            import android.net.Uri;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.TranslateAnimation;
            import android.webkit.JavascriptInterface;
            import android.webkit.RenderProcessGoneDetail;
            import android.webkit.ValueCallback;
            import android.webkit.WebChromeClient;
            import android.webkit.WebResourceError;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.R;
            import com.supercell.titan.TitanWebView;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.UnsupportedEncodingException;
            import java.net.URLDecoder;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import okhttp3.HttpUrl;
            import p000.RunnableC0025an;
            import p000.RunnableC0923fn;
            import p000.RunnableC2558zo;
            import p000.cp2;
            import p000.dp2;
            import p000.f72;
            import p000.fp2;
            import p000.gp2;
            import p000.ji1;
            import p000.pp2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public class TitanWebView {

                /* JADX INFO: renamed from: D */
                public static TitanWebChromeClient f5940D;

                /* JADX INFO: renamed from: E */
                public static View f5941E;

                /* JADX INFO: renamed from: A */
                public int f5942A;

                /* JADX INFO: renamed from: C */
                public RunnableC2558zo f5944C;

                /* JADX INFO: renamed from: a */
                public boolean f5945a;

                /* JADX INFO: renamed from: b */
                public boolean f5946b;

                /* JADX INFO: renamed from: d */
                public FrameLayout f5948d;

                /* JADX INFO: renamed from: e */
                public View f5949e;

                /* JADX INFO: renamed from: f */
                public ImageView f5950f;

                /* JADX INFO: renamed from: g */
                public ImageView f5951g;

                /* JADX INFO: renamed from: h */
                public int f5952h;

                /* JADX INFO: renamed from: i */
                public LinearLayout f5953i;

                /* JADX INFO: renamed from: j */
                public boolean f5954j;

                /* JADX INFO: renamed from: k */
                public String f5955k;

                /* JADX INFO: renamed from: l */
                public ViewGroup.MarginLayoutParams f5956l;

                /* JADX INFO: renamed from: m */
                public ValueCallback f5957m;

                /* JADX INFO: renamed from: o */
                public WebView f5959o;

                /* JADX INFO: renamed from: p */
                public TitanWebChromeClient f5960p;

                /* JADX INFO: renamed from: q */
                public FrameLayout f5961q;

                /* JADX INFO: renamed from: r */
                public WebChromeClient.CustomViewCallback f5962r;

                /* JADX INFO: renamed from: s */
                public boolean f5963s;

                /* JADX INFO: renamed from: t */
                public boolean f5964t;

                /* JADX INFO: renamed from: u */
                public boolean f5965u;

                /* JADX INFO: renamed from: w */
                public int f5967w;

                /* JADX INFO: renamed from: c */
                public final Rect f5947c = new Rect();

                /* JADX INFO: renamed from: n */
                public int f5958n = 0;

                /* JADX INFO: renamed from: v */
                public boolean f5966v = false;

                /* JADX INFO: renamed from: x */
                public final Set f5968x = Collections.synchronizedSet(new HashSet());

                /* JADX INFO: renamed from: y */
                public final Map f5969y = Collections.synchronizedMap(new HashMap());

                /* JADX INFO: renamed from: z */
                public long f5970z = 0;

                /* JADX INFO: renamed from: B */
                public final Handler f5943B = new Handler(Looper.getMainLooper());

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class TitanWebChromeClient extends WebChromeClient {
                    public TitanWebChromeClient(TitanWebView titanWebView) {
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onHideCustomView() {
/* 1 */                 super.onHideCustomView();
/* 6 */                 if (TitanWebView.f5941E == null) {
/* 8 */                     return;
                        }
/* 9 */                 TitanWebView titanWebView = TitanWebView.this;
/* 15 */                titanWebView.f5961q.setVisibility(8);
/* 20 */                TitanWebView.f5941E.setVisibility(8);
/* 27 */                titanWebView.f5961q.removeView(TitanWebView.f5941E);
/* 32 */                titanWebView.f5962r.onCustomViewHidden();
/* 36 */                TitanWebView.f5941E = null;
/* 38 */                TitanWebView.f5940D = null;
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
/* 3 */                 if (TitanWebView.f5941E != null) {
/* 5 */                     customViewCallback.onCustomViewHidden();
/* 8 */                     return;
                        }
/* 9 */                 TitanWebView.f5941E = view;
/* 11 */                TitanWebView.f5940D = this;
/* 13 */                TitanWebView titanWebView = TitanWebView.this;
/* 18 */                titanWebView.f5961q.setVisibility(0);
/* 23 */                titanWebView.f5961q.addView(view);
/* 26 */                titanWebView.f5962r = customViewCallback;
                    }

                    @Override // android.webkit.WebChromeClient
                    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
/* 1 */                 TitanWebView titanWebView = TitanWebView.this;
/* 3 */                 ValueCallback valueCallback2 = titanWebView.f5957m;
/* 6 */                 if (valueCallback2 != null) {
/* 8 */                     valueCallback2.onReceiveValue(null);
                        }
/* 11 */                titanWebView.f5957m = valueCallback;
                        try {
/* 24 */                    GameApp.getInstance().startActivityForResult(fileChooserParams.createIntent(), 41019);
/* 36 */                    GameApp.getInstance().addActivityResultListener(new C0807n(titanWebView));
/* 39 */                    return true;
                        } catch (ActivityNotFoundException unused) {
/* 41 */                    titanWebView.f5957m = null;
/* 43 */                    return false;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class TitanWebViewClient extends WebViewClient {

                    /* JADX INFO: renamed from: c */
                    public static final /* synthetic */ int f5972c = 0;

                    /* JADX INFO: renamed from: a */
                    public final TitanWebView f5973a;

                    public TitanWebViewClient(TitanWebView titanWebView) {
/* 6 */                 this.f5973a = titanWebView;
                    }

                    /* JADX INFO: renamed from: a */
                    public final void m2750a(WebView webView) {
/* 3 */                 StringBuilder sb = new StringBuilder();
                        synchronized (TitanWebView.this.f5968x) {
                            try {
/* 23 */                        for (String str : TitanWebView.this.f5968x) {
/* 31 */                            sb.append(str);
/* 36 */                            sb.append(": ");
/* 58 */                            sb.append("function(params = '') { return bridge.postMessage(\"" + str + "\", params); }");
/* 63 */                            sb.append(",");
                                }
                            } catch (Throwable th) {
/* 153 */                       throw th;
                            }
                        }
                        synchronized (TitanWebView.this.f5969y) {
                            try {
/* 91 */                        for (Map.Entry entry : TitanWebView.this.f5969y.entrySet()) {
/* 105 */                           sb.append((String) entry.getKey());
/* 110 */                           sb.append(": ");
/* 119 */                           sb.append((String) entry.getValue());
/* 124 */                           sb.append(",");
                                }
                            } catch (Throwable th2) {
/* 151 */                       throw th2;
                            }
                        }
/* 146 */               GameApp.getInstance().runOnUiThread(new ji1(14, webView, sb.toString()));
                    }

                    /* JADX INFO: renamed from: b */
                    public final void m2751b(WebView webView, CharSequence charSequence, String str) {
/* 3 */                 TitanWebView.this.m2747a();
/* 6 */                 String url = webView.getUrl();
/* 10 */                Objects.toString(charSequence);
/* 13 */                if (url == null || url.equals("about:blank") || url.equals(str)) {
/* 51 */                    GameApp.getInstance().runOnView(new RunnableC2558zo(15, this, str, charSequence != null ? charSequence.toString() : HttpUrl.FRAGMENT_ENCODE_SET));
                        }
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str) {
/* 1 */                 super.onPageFinished(webView, str);
/* 6 */                 TitanWebView.this.m2747a();
/* 20 */                GameApp.getInstance().runOnUiThread(new ji1(13, this, webView));
/* 23 */                GameApp gameApp = GameApp.getInstance();
/* 33 */                gameApp.runOnUiThread(new f72(this, 7));
/* 42 */                gameApp.runOnView(new pp2(this, str, 0));
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
/* 1 */                 super.onPageStarted(webView, str, bitmap);
/* 4 */                 m2750a(webView);
/* 17 */                GameApp.getInstance().runOnView(new pp2(this, str, 1));
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
/* 1 */                 super.onReceivedError(webView, webResourceRequest, webResourceError);
/* 4 */                 webResourceError.getErrorCode();
/* 19 */                m2751b(webView, webResourceError.getDescription(), webResourceRequest.getUrl().toString());
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
/* 1 */                 super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
/* 4 */                 webResourceResponse.getStatusCode();
/* 19 */                m2751b(webView, webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
/* 3 */                 TitanWebView.this.m2747a();
/* 6 */                 int visibility = webView.getVisibility();
/* 10 */                GameApp gameApp = GameApp.getInstance();
/* 14 */                if (gameApp == null) {
/* 25 */                    return true;
                        }
/* 22 */                gameApp.runOnUiThread(new RunnableC0923fn(this, visibility, 4));
/* 25 */                return true;
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
/* 1 */                 super.shouldOverrideUrlLoading(webView, str);
/* 4 */                 GameApp.getInstance();
/* 9 */                 return this.f5973a.shouldOverrideUrlLoading(str);
                    }
                }

                public static void hideCustomView() {
/* 1 */             TitanWebChromeClient titanWebChromeClient = f5940D;
/* 3 */             if (titanWebChromeClient == null) {
/* 5 */                 return;
                    }
/* 6 */             titanWebChromeClient.onHideCustomView();
                }

                public static boolean isInCustomView() {
                    return f5941E != null;
                }

                public static void restoreOrientation() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 11 */            gameApp.runOnUiThread(new f72(gameApp, 5));
                }

                /* JADX INFO: renamed from: a */
                public final void m2747a() {
/* 1 */             RunnableC2558zo runnableC2558zo = this.f5944C;
/* 3 */             if (runnableC2558zo != null) {
/* 7 */                 this.f5943B.removeCallbacks(runnableC2558zo);
/* 11 */                this.f5944C = null;
                    }
                }

                public void addSwipeRightRecognizer() {
/* 12 */            GameApp.getInstance().runOnUiThread(new ji1(11, this, this));
                }

                /* JADX INFO: renamed from: b */
                public final void m2748b() {
                    try {
/* 13 */                WebView webView = new WebView(GameApp.getInstance());
/* 16 */                webView.setVisibility(4);
/* 19 */                webView.setBackgroundColor(0);
/* 22 */                webView.setAlpha(0.0f);
/* 29 */                webView.getSettings().setJavaScriptEnabled(true);
/* 36 */                webView.getSettings().setDomStorageEnabled(true);
/* 44 */                webView.setWebViewClient(new TitanWebViewClient(this));
/* 49 */                webView.setWebChromeClient(this.f5960p);
/* 52 */                webView.addJavascriptInterface(this, "messageHandler");
/* 55 */                this.f5959o = webView;
                    } catch (Exception e) {
/* 79 */                AbstractC1245n0.m4876d("TitanWebView", "Webview creation failed with exception " + e.getMessage());
/* 84 */                if (!this.f5965u) {
/* 86 */                    SentryTitan.m2745a(e);
                        }
                    }
/* 89 */            WebView webView2 = this.f5959o;
/* 91 */            if (webView2 != null) {
/* 93 */                webView2.setVisibility(4);
/* 98 */                this.f5959o.setBackgroundColor(0);
/* 103 */               if (this.f5966v) {
/* 109 */                   this.f5959o.setBackgroundColor(this.f5967w);
                        }
/* 114 */               this.f5959o.setAlpha(0.0f);
/* 123 */               this.f5959o.getSettings().setJavaScriptEnabled(true);
/* 132 */               this.f5959o.getSettings().setDomStorageEnabled(true);
/* 142 */               this.f5959o.setWebViewClient(new TitanWebViewClient(this));
/* 149 */               this.f5959o.setWebChromeClient(this.f5960p);
/* 154 */               this.f5959o.addJavascriptInterface(this, "messageHandler");
/* 167 */               this.f5948d.addView(this.f5959o, new ViewGroup.LayoutParams(-1, -1));
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m2749c() {
/* 1 */             View view = this.f5949e;
/* 3 */             if (view == null) {
/* 58 */                return;
                    }
/* 16 */            view.setVisibility(this.f5954j ? 0 : 8);
/* 19 */            ImageView imageView = this.f5950f;
/* 21 */            if (imageView != null) {
/* 34 */                imageView.setVisibility((this.f5954j && this.f5945a) ? 0 : 8);
                    }
/* 37 */            ImageView imageView2 = this.f5951g;
/* 39 */            if (imageView2 != null) {
/* 55 */                imageView2.setVisibility(this.f5954j && this.f5952h != 0 ? 0 : 8);
                    }
                }

                public boolean canGoBack() {
/* 1 */             return this.f5945a;
                }

                public void close() {
/* 3 */             this.f5970z = 0L;
/* 15 */            GameApp.getInstance().runOnUiThread(new cp2(this, 6));
                }

                public String decodeURL(String str) {
                    try {
/* 3 */                 return URLDecoder.decode(str, "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                public void deleteCookies() {
/* 11 */            GameApp.getInstance().runOnUiThread(new cp2(this, 3));
                }

                public void disableTextZoom() {
/* 11 */            GameApp.getInstance().runOnUiThread(new cp2(this, 0));
                }

                public void eval(String str) {
/* 11 */            GameApp.getInstance().runOnUiThread(new dp2(this, str, 2));
                }

                public long getObjPtr() {
/* 1 */             return this.f5970z;
                }

                public void goBack() {
/* 11 */            GameApp.getInstance().runOnUiThread(new cp2(this, 4));
                }

                public void hide() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 12 */            gameApp.runOnUiThread(new ji1(12, this, gameApp));
                }

                public native void hideNative();

                public void init(boolean z, boolean z2, boolean z3) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 5 */             this.f5963s = z2;
/* 7 */             this.f5965u = z3;
/* 14 */            gameApp.runOnUiThread(new gp2(this, gameApp, this, z));
                }

                public boolean isVisible() {
/* 1 */             WebView webView = this.f5959o;
                    return webView != null && webView.getVisibility() == 0;
                }

                public void loadHTML(String str) {
/* 11 */            GameApp.getInstance().runOnUiThread(new dp2(this, str, 5));
                }

                public void loadURL(String str, String[] strArr) {
/* 12 */            GameApp.getInstance().runOnUiThread(new RunnableC2558zo(13, this, strArr, str));
/* 15 */            loadURL(str);
                }

                public void moveView(final float f, final float f2, final float f3, final float f4, float f5, float f6, final float f7, final boolean z) {
/* 2 */             final GameApp gameApp = GameApp.getInstance();
/* 17 */            gameApp.runOnUiThread(new Runnable() { // from class: ep2
                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     TitanWebView titanWebView = this.f7820a;
/* 3 */                     WebView webView = titanWebView.f5959o;
/* 5 */                     if (webView == null) {
/* 53 */                        return;
                            }
/* 8 */                     boolean z2 = titanWebView.f5963s;
/* 10 */                    boolean z3 = z;
/* 12 */                    GameApp gameApp2 = gameApp;
/* 14 */                    if (z2 && titanWebView.f5964t) {
/* 20 */                        if (z3) {
/* 24 */                            webView.setVisibility(8);
/* 29 */                            titanWebView.f5953i.setVisibility(8);
/* 38 */                            gameApp2.getWindow().setSoftInputMode(titanWebView.f5942A);
/* 50 */                            GameApp.getInstance().runOnView(new cp2(titanWebView, 8));
/* 53 */                            return;
                                }
/* 53 */                        return;
                            }
/* 58 */                    float scaleX = gameApp2.getView().getScaleX();
/* 66 */                    float scaleY = gameApp2.getView().getScaleY();
/* 92 */                    TranslateAnimation translateAnimation = new TranslateAnimation((int) (f / scaleX), (int) (f3 / scaleX), (int) (f2 / scaleY), (int) (f4 / scaleY));
/* 102 */                   translateAnimation.setDuration((int) (f7 * 1000.0f));
/* 106 */                   translateAnimation.setFillAfter(true);
/* 114 */                   translateAnimation.setAnimationListener(new np2(titanWebView, z3));
/* 117 */                   webView.startAnimation(translateAnimation);
                        }
                    });
                }

                public native void onCookiesDeleted();

                public native void onNavigationBarTrailingAction();

                public native void onPageFinished(String str);

                public native void onPageStarted(String str);

                public native void onReceivedError(String str, String str2);

                public native void onSwipeRight();

                public native void onWebViewClosed();

                public native String postMessage(String str, String str2);

                @JavascriptInterface
                public void postMessage(String str, String str2, String str3) {
/* 15 */            GameApp.getInstance().runOnUiThread(new fp2(this, str3, postMessage(str, str2), 1));
                }

                public void registerBridgeData(String str, String str2) {
/* 3 */             this.f5969y.put(str, str2);
/* 16 */            GameApp.getInstance().runOnUiThread(new fp2(this, str, str2, 0));
                }

                public void registerBridgeFunction(String str) {
/* 3 */             this.f5968x.add(str);
/* 16 */            GameApp.getInstance().runOnUiThread(new dp2(this, str, 0));
                }

                public void reload() {
/* 11 */            GameApp.getInstance().runOnUiThread(new cp2(this, 1));
                }

                public void setAlpha(final float f) {
/* 10 */            GameApp.getInstance().runOnUiThread(new Runnable() { // from class: mp2
                        @Override // java.lang.Runnable
                        public final void run() {
/* 3 */                     WebView webView = this.f13900a.f5959o;
/* 5 */                     if (webView == null) {
/* 7 */                         return;
                            }
/* 10 */                    webView.setAlpha(f);
                        }
                    });
                }

                public void setBackgroundColor(int i) {
/* 2 */             this.f5966v = true;
/* 4 */             this.f5967w = i;
/* 16 */            GameApp.getInstance().runOnUiThread(new cp2(this, 7));
                }

                public void setIgnoreTouches(boolean z) {
/* 11 */            GameApp.getInstance().runOnUiThread(new RunnableC0025an(2, this, z));
                }

                public void setNavigationBarTrailingButton(String str) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 19 */            this.f5952h = gameApp.getResources().getIdentifier(str, "drawable", gameApp.getPackageName());
/* 31 */            GameApp.getInstance().runOnUiThread(new cp2(this, 2));
                }

                public void setObjPtr(long j) {
/* 1 */             this.f5970z = j;
                }

                public void setShowNavigationBar(boolean z) {
/* 1 */             this.f5954j = z;
/* 13 */            GameApp.getInstance().runOnUiThread(new cp2(this, 5));
                }

                public void setTextZoom(int i) {
/* 11 */            GameApp.getInstance().runOnUiThread(new RunnableC0923fn(this, i, 3));
                }

                public void setTimeoutMs(int i) {
/* 1 */             this.f5958n = i;
                }

                public void setTrackVisibleDisplayFrameEnabled(boolean z) {
/* 1 */             this.f5946b = z;
                }

                public native boolean shouldOverrideUrlLoading(String str);

                public void show(final int i, final int i2, final int i3, final int i4, final float f) {
/* 1 */             final GameApp gameApp = GameApp.getInstance();
/* 16 */            gameApp.runOnUiThread(new Runnable() { // from class: hp2
                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     TitanWebView titanWebView = this.f9183a;
/* 3 */                     WebView webView = titanWebView.f5959o;
/* 5 */                     if (webView == null) {
/* 71 */                        return;
                            }
/* 8 */                     GameApp gameApp2 = gameApp;
/* 18 */                    int i5 = gameApp2.getWindow().getAttributes().softInputMode;
/* 20 */                    titanWebView.f5942A = i5;
/* 24 */                    if (titanWebView.f5946b) {
/* 34 */                        gameApp2.getWindow().setSoftInputMode((i5 & (-241)) | 32);
                            }
/* 38 */                    float f2 = f;
/* 49 */                    webView.setVisibility(f2 > 0.0f ? 0 : 4);
/* 58 */                    titanWebView.f5953i.setVisibility(f2 <= 0.0f ? 4 : 0);
/* 69 */                    if (titanWebView.f5953i.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
/* 78 */                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) titanWebView.f5953i.getLayoutParams();
/* 84 */                        float scaleX = gameApp2.getView().getScaleX();
/* 92 */                        float scaleY = gameApp2.getView().getScaleY();
/* 96 */                        boolean z = titanWebView.f5963s;
/* 98 */                        int i6 = i;
/* 100 */                       int i7 = i2;
/* 102 */                       int i8 = i3;
/* 104 */                       int i9 = i4;
/* 106 */                       if (z && titanWebView.f5964t) {
/* 113 */                           gameApp2.setRequestedOrientation(7);
/* 126 */                           View viewFindViewById = GameApp.getInstance().getWindow().findViewById(R.id.stage);
/* 130 */                           if (viewFindViewById != null) {
/* 132 */                               viewFindViewById.setVisibility(4);
                                    }
/* 137 */                           webView.setSystemUiVisibility(5894);
/* 143 */                           marginLayoutParams.width = (int) (i9 / scaleY);
/* 148 */                           marginLayoutParams.height = (int) (i8 / scaleX);
/* 153 */                           marginLayoutParams.leftMargin = (int) (i7 / scaleY);
/* 158 */                           marginLayoutParams.topMargin = (int) (i6 / scaleX);
                                } else {
/* 164 */                           marginLayoutParams.width = (int) (i8 / scaleX);
/* 169 */                           marginLayoutParams.height = (int) (i9 / scaleY);
/* 174 */                           marginLayoutParams.leftMargin = (int) (i6 / scaleX);
/* 179 */                           marginLayoutParams.topMargin = (int) (i7 / scaleY);
                                }
/* 181 */                       titanWebView.f5956l = marginLayoutParams;
/* 185 */                       titanWebView.f5953i.setLayoutParams(marginLayoutParams);
                            }
                        }
                    });
                }

                public void slideUp(View view) {
/* 2 */             view.setVisibility(0);
                }

                public void unregisterBridgeData(String str) {
/* 3 */             this.f5969y.remove(str);
/* 16 */            GameApp.getInstance().runOnUiThread(new dp2(this, str, 1));
                }

                public void unregisterBridgeFunction(String str) {
/* 3 */             this.f5968x.remove(str);
/* 16 */            GameApp.getInstance().runOnUiThread(new dp2(this, str, 4));
                }

/* 18 */        public void loadURL(String str) {
/* 19 */            GameApp.getInstance().runOnUiThread(new dp2(this, str, 3));
                }
            }
