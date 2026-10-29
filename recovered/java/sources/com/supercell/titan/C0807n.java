            package com.supercell.titan;

            import android.content.Intent;
            import android.webkit.ValueCallback;
            import android.webkit.WebChromeClient;
            
            /* JADX INFO: renamed from: com.supercell.titan.n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0807n implements GameApp.OnActivityResultListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ TitanWebView f6015a;

                public C0807n(TitanWebView titanWebView) {
/* 4 */             this.f6015a = titanWebView;
                }

                @Override // com.supercell.titan.GameApp.OnActivityResultListener
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 4 */             if (i == 41019) {
/* 6 */                 TitanWebView titanWebView = this.f6015a;
/* 8 */                 ValueCallback valueCallback = titanWebView.f5957m;
/* 10 */                if (valueCallback != null) {
/* 13 */                    if (i2 == 0) {
/* 15 */                        valueCallback.onReceiveValue(null);
                            } else if (i2 == -1) {
/* 26 */                        valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
                            }
/* 29 */                    titanWebView.f5957m = null;
                        }
/* 35 */                GameApp.getInstance().removeActivityResultListener(this);
                    }
                }
            }
