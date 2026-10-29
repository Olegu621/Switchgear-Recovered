            package p000;

            import android.view.animation.Animation;
            import android.webkit.WebView;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.TitanWebView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class np2 implements Animation.AnimationListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f14402a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TitanWebView f14403b;

                public np2(TitanWebView titanWebView, boolean z) {
/* 4 */             this.f14403b = titanWebView;
/* 6 */             this.f14402a = z;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
/* 3 */             if (this.f14402a) {
/* 5 */                 GameApp gameApp = GameApp.getInstance();
/* 9 */                 TitanWebView titanWebView = this.f14403b;
/* 11 */                WebView webView = titanWebView.f5959o;
/* 13 */                if (webView == null) {
/* 47 */                    return;
                        }
/* 18 */                webView.setVisibility(8);
/* 23 */                titanWebView.f5953i.setVisibility(8);
/* 32 */                gameApp.getWindow().setSoftInputMode(titanWebView.f5942A);
/* 44 */                GameApp.getInstance().runOnView(new cp2(titanWebView, 8));
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }
            }
