            package com.helpshift.views;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.webkit.WebSettings;
            import android.webkit.WebView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class HSWebView extends WebView {
                public HSWebView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 4 */             m2543a();
                }

                /* JADX INFO: renamed from: a */
                public final void m2543a() {
/* 5 */             if (isInEditMode()) {
/* 38 */                return;
                    }
/* 7 */             WebSettings settings = getSettings();
/* 12 */            settings.setJavaScriptEnabled(true);
/* 15 */            settings.setJavaScriptCanOpenWindowsAutomatically(true);
/* 18 */            settings.setSupportMultipleWindows(true);
/* 21 */            settings.setDomStorageEnabled(true);
/* 25 */            settings.setMixedContentMode(2);
/* 28 */            settings.setCacheMode(2);
/* 31 */            settings.setAllowFileAccess(true);
/* 35 */            setLayerType(2, null);
                }

/* 7 */         public HSWebView(Context context, AttributeSet attributeSet, int i) {
/* 8 */             super(context, attributeSet, i);
/* 9 */             m2543a();
                }
            }
