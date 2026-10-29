            package p000;

            import android.graphics.Rect;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.webkit.WebView;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.R;
            import com.supercell.titan.TitanWebView;
            import com.supercell.titan.TitanWebView.TitanWebChromeClient;
            import io.sentry.android.replay.screenshot.C1342h;
            import io.sentry.android.replay.viewhierarchy.AbstractC1370h;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final /* synthetic */ class gp2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8764a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f8765b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f8766c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f8767d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f8768e;

                public /* synthetic */ gp2(TitanWebView titanWebView, GameApp gameApp, TitanWebView titanWebView2, boolean z) {
/* 7 */             this.f8766c = titanWebView;
/* 9 */             this.f8768e = gameApp;
/* 11 */            this.f8767d = titanWebView2;
/* 13 */            this.f8765b = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f8764a;
/* 3 */             boolean z = this.f8765b;
/* 5 */             Object obj = this.f8768e;
/* 7 */             Object obj2 = this.f8767d;
/* 9 */             Object obj3 = this.f8766c;
/* 11 */            final int i2 = 1;
                    switch (i) {
                        case 0:
/* 27 */                    final TitanWebView titanWebView = (TitanWebView) obj3;
/* 29 */                    GameApp gameApp = (GameApp) obj;
/* 31 */                    TitanWebView titanWebView2 = (TitanWebView) obj2;
/* 35 */                    if (titanWebView.f5959o == null) {
/* 47 */                        final int i3 = 2;
/* 48 */                        final int i4 = 0;
/* 54 */                        titanWebView.f5964t = gameApp.getResources().getConfiguration().orientation == 2;
/* 61 */                        titanWebView.f5948d = new FrameLayout(gameApp);
/* 66 */                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
/* 71 */                        titanWebView.f5948d.setLayoutDirection(0);
/* 86 */                        View viewInflate = LayoutInflater.from(GameApp.getInstance()).inflate(R.layout.titan_webview_nav_bar, (ViewGroup) titanWebView.f5948d, false);
/* 90 */                        titanWebView.f5949e = viewInflate;
/* 92 */                        viewInflate.setBackgroundColor(-1);
/* 110 */                       ((ImageView) titanWebView.f5949e.findViewById(R.id.titan_webview_nav_close)).setOnClickListener(new View.OnClickListener() { // from class: kp2
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
/* 1 */                                 int i5 = i4;
/* 3 */                                 TitanWebView titanWebView3 = titanWebView;
                                        switch (i5) {
                                            case 0:
/* 28 */                                        titanWebView3.hideNative();
/* 31 */                                        titanWebView3.onWebViewClosed();
                                                break;
                                            case 1:
/* 12 */                                        WebView webView = titanWebView3.f5959o;
/* 14 */                                        if (webView != null && webView.canGoBack()) {
/* 24 */                                            titanWebView3.f5959o.goBack();
                                                    break;
                                                }
                                                break;
                                            default:
/* 8 */                                         titanWebView3.onNavigationBarTrailingAction();
                                                break;
                                        }
                                    }
                                });
/* 121 */                       ImageView imageView = (ImageView) titanWebView.f5949e.findViewById(R.id.titan_webview_nav_back);
/* 123 */                       titanWebView.f5950f = imageView;
/* 130 */                       imageView.setOnClickListener(new View.OnClickListener() { // from class: kp2
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
/* 1 */                                 int i5 = i2;
/* 3 */                                 TitanWebView titanWebView3 = titanWebView;
                                        switch (i5) {
                                            case 0:
/* 28 */                                        titanWebView3.hideNative();
/* 31 */                                        titanWebView3.onWebViewClosed();
                                                break;
                                            case 1:
/* 12 */                                        WebView webView = titanWebView3.f5959o;
/* 14 */                                        if (webView != null && webView.canGoBack()) {
/* 24 */                                            titanWebView3.f5959o.goBack();
                                                    break;
                                                }
                                                break;
                                            default:
/* 8 */                                         titanWebView3.onNavigationBarTrailingAction();
                                                break;
                                        }
                                    }
                                });
/* 141 */                       ImageView imageView2 = (ImageView) titanWebView.f5949e.findViewById(R.id.titan_webview_nav_trailing);
/* 143 */                       titanWebView.f5951g = imageView2;
/* 150 */                       imageView2.setOnClickListener(new View.OnClickListener() { // from class: kp2
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
/* 1 */                                 int i5 = i3;
/* 3 */                                 TitanWebView titanWebView3 = titanWebView;
                                        switch (i5) {
                                            case 0:
/* 28 */                                        titanWebView3.hideNative();
/* 31 */                                        titanWebView3.onWebViewClosed();
                                                break;
                                            case 1:
/* 12 */                                        WebView webView = titanWebView3.f5959o;
/* 14 */                                        if (webView != null && webView.canGoBack()) {
/* 24 */                                            titanWebView3.f5959o.goBack();
                                                    break;
                                                }
                                                break;
                                            default:
/* 8 */                                         titanWebView3.onNavigationBarTrailingAction();
                                                break;
                                        }
                                    }
                                });
/* 153 */                       View view = titanWebView.f5949e;
/* 155 */                       if (view != null) {
/* 158 */                           final int paddingLeft = view.getPaddingLeft();
/* 164 */                           final int paddingTop = titanWebView.f5949e.getPaddingTop();
/* 170 */                           final int paddingRight = titanWebView.f5949e.getPaddingRight();
/* 176 */                           final int paddingBottom = titanWebView.f5949e.getPaddingBottom();
/* 180 */                           View view2 = titanWebView.f5949e;
/* 184 */                           jp1 jp1Var = new jp1() { // from class: lp2
                                        @Override // p000.jp1
                                        /* JADX INFO: renamed from: k */
                                        public final m83 mo1634k(View view3, m83 m83Var) {
/* 5 */                                     ly0 ly0VarMo2970f = m83Var.f13660a.mo2970f(129);
/* 26 */                                    view3.setPadding(paddingLeft + ly0VarMo2970f.f13528a, paddingTop + ly0VarMo2970f.f13529b, paddingRight + ly0VarMo2970f.f13530c, paddingBottom);
/* 29 */                                    return m83Var;
                                        }
                                    };
/* 187 */                           WeakHashMap weakHashMap = e33.f7494a;
/* 189 */                           s23.m8383u(view2, jp1Var);
                                }
/* 192 */                       titanWebView.m2749c();
/* 198 */                       LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
/* 203 */                       LinearLayout linearLayout = new LinearLayout(gameApp);
/* 206 */                       titanWebView.f5953i = linearLayout;
/* 208 */                       linearLayout.setOrientation(1);
/* 215 */                       titanWebView.f5953i.addView(titanWebView.f5949e, layoutParams2);
/* 222 */                       titanWebView.f5953i.addView(titanWebView.f5948d, layoutParams);
/* 225 */                       View view3 = titanWebView.f5949e;
/* 227 */                       WeakHashMap weakHashMap2 = e33.f7494a;
/* 229 */                       q23.m7679c(view3);
/* 243 */                       gameApp.getWindow().addContentView(titanWebView.f5953i, new FrameLayout.LayoutParams(-1, -1));
/* 251 */                       titanWebView.f5960p = titanWebView.new TitanWebChromeClient(titanWebView2);
/* 253 */                       titanWebView.m2748b();
/* 256 */                       WebView webView = titanWebView.f5959o;
/* 258 */                       if (webView != null) {
/* 270 */                           webView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ip2
                                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                        public final void onGlobalLayout() {
/* 1 */                                     TitanWebView titanWebView3 = titanWebView;
/* 3 */                                     Rect rect = titanWebView3.f5947c;
/* 5 */                                     WebView webView2 = titanWebView3.f5959o;
/* 7 */                                     if (webView2 != null && titanWebView3.f5946b) {
/* 14 */                                        int iHeight = rect.height();
/* 18 */                                        int iWidth = rect.width();
/* 24 */                                        titanWebView3.f5948d.getWindowVisibleDisplayFrame(rect);
/* 27 */                                        int iHeight2 = rect.height();
/* 31 */                                        int iWidth2 = rect.width();
/* 35 */                                        if (iHeight == iHeight2 && iWidth == iWidth2) {
/* 50 */                                            return;
                                                }
/* 39 */                                        ViewGroup.LayoutParams layoutParams3 = webView2.getLayoutParams();
/* 43 */                                        layoutParams3.height = iHeight2;
/* 45 */                                        layoutParams3.width = iWidth2;
/* 47 */                                        webView2.requestLayout();
                                            }
                                        }
                                    });
/* 278 */                           titanWebView.f5961q = new FrameLayout(gameApp);
/* 282 */                           FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
/* 289 */                           titanWebView.f5961q.setVisibility(8);
/* 292 */                           layoutParams3.setLayoutDirection(0);
/* 301 */                           gameApp.getWindow().addContentView(titanWebView.f5961q, layoutParams3);
/* 304 */                           if (z) {
/* 306 */                               WebView.setWebContentsDebuggingEnabled(true);
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
/* 23 */                    ((C1342h) obj3).m5024d((View) obj2, (AbstractC1370h) obj, !z);
                            break;
                    }
                }

/* 15 */        public /* synthetic */ gp2(C1342h c1342h, View view, AbstractC1370h abstractC1370h, boolean z) {
                    this.f8766c = c1342h;
                    this.f8767d = view;
                    this.f8768e = abstractC1370h;
                    this.f8765b = z;
                }
            }
