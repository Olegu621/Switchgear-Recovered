            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.content.Context;
            import android.graphics.Rect;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.inputmethod.InputMethodManager;
            import android.webkit.WebView;
            import android.widget.ListPopupWindow;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public class InputAwareWebView extends WebView {
                private static final String LOG_TAG = "InputAwareWebView";
                public View containerView;
                private ThreadedInputConnectionProxyAdapterView proxyAdapterView;
                private View threadedInputConnectionProxyView;
                private boolean useHybridComposition;

                public InputAwareWebView(Context context, View view, Boolean bool) {
/* 1 */             super(context);
/* 5 */             this.useHybridComposition = false;
/* 7 */             this.containerView = view;
/* 16 */            this.useHybridComposition = bool != null ? bool.booleanValue() : false;
                }

                private boolean isCalledFromListPopupWindowShow() {
/* 12 */            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
/* 30 */                if (stackTraceElement.getClassName().equals(ListPopupWindow.class.getCanonicalName()) && stackTraceElement.getMethodName().equals("show")) {
/* 44 */                    return true;
                        }
                    }
/* 10 */            return false;
                }

                private void resetInputConnection() {
                    View view;
/* 3 */             if (this.proxyAdapterView == null || (view = this.containerView) == null) {
/* 10 */                return;
                    }
/* 11 */            setInputConnectionTarget(view);
                }

                private void setInputConnectionTarget(final View view) {
/* 3 */             if (this.containerView == null) {
/* 5 */                 return;
                    }
/* 6 */             view.requestFocus();
/* 16 */            this.containerView.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView.1
                        @Override // java.lang.Runnable
                        public void run() {
/* 1 */                     InputAwareWebView inputAwareWebView = InputAwareWebView.this;
/* 5 */                     if (inputAwareWebView.containerView == null) {
/* 7 */                         return;
                            }
/* 18 */                    InputMethodManager inputMethodManager = (InputMethodManager) inputAwareWebView.getContext().getSystemService("input_method");
/* 23 */                    view.onWindowFocusChanged(true);
/* 30 */                    if (Build.VERSION.SDK_INT < 29) {
/* 36 */                        inputMethodManager.isActive(InputAwareWebView.this.containerView);
                            }
                        }
                    });
                }

                @Override // android.view.View
                public boolean checkInputConnectionProxy(View view) {
/* 3 */             if (this.useHybridComposition) {
/* 5 */                 return super.checkInputConnectionProxy(view);
                    }
/* 10 */            View view2 = this.threadedInputConnectionProxyView;
/* 12 */            this.threadedInputConnectionProxyView = view;
/* 14 */            if (view2 == view) {
/* 16 */                return super.checkInputConnectionProxy(view);
                    }
/* 21 */            View view3 = this.containerView;
/* 23 */            if (view3 == null) {
/* 25 */                return super.checkInputConnectionProxy(view);
                    }
/* 36 */            ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = new ThreadedInputConnectionProxyAdapterView(view3, view, view.getHandler());
/* 39 */            this.proxyAdapterView = threadedInputConnectionProxyAdapterView;
/* 41 */            setInputConnectionTarget(threadedInputConnectionProxyAdapterView);
/* 44 */            return super.checkInputConnectionProxy(view);
                }

                @Override // android.view.ViewGroup, android.view.View
                public void clearFocus() {
/* 1 */             super.clearFocus();
/* 6 */             if (this.useHybridComposition) {
/* 8 */                 return;
                    }
/* 9 */             resetInputConnection();
                }

                public void dispose() {
/* 3 */             if (this.useHybridComposition) {
/* 5 */                 return;
                    }
/* 6 */             resetInputConnection();
                }

                public void lockInputConnection() {
/* 1 */             ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
/* 3 */             if (threadedInputConnectionProxyAdapterView == null) {
/* 5 */                 return;
                    }
/* 7 */             threadedInputConnectionProxyAdapterView.setLocked(true);
                }

                @Override // android.webkit.WebView, android.view.View
                public void onFocusChanged(boolean z, int i, Rect rect) {
/* 3 */             if (this.useHybridComposition) {
/* 5 */                 super.onFocusChanged(z, i, rect);
                    } else if (Build.VERSION.SDK_INT >= 28 || !isCalledFromListPopupWindowShow() || z) {
/* 24 */                super.onFocusChanged(z, i, rect);
                    }
                }

                public void setContainerView(View view) {
/* 1 */             this.containerView = view;
/* 3 */             ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
/* 5 */             if (threadedInputConnectionProxyAdapterView == null || view == null) {
/* 13 */                return;
                    }
/* 10 */            setInputConnectionTarget(threadedInputConnectionProxyAdapterView);
                }

                public void unlockInputConnection() {
/* 1 */             ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
/* 3 */             if (threadedInputConnectionProxyAdapterView == null) {
/* 5 */                 return;
                    }
/* 7 */             threadedInputConnectionProxyAdapterView.setLocked(false);
                }

/* 18 */        public InputAwareWebView(Context context, AttributeSet attributeSet) {
/* 19 */            super(context, attributeSet);
/* 20 */            this.useHybridComposition = false;
/* 21 */            this.containerView = null;
                }

/* 21 */        public InputAwareWebView(Context context) {
/* 22 */            super(context);
/* 23 */            this.useHybridComposition = false;
/* 24 */            this.containerView = null;
                }

/* 24 */        public InputAwareWebView(Context context, AttributeSet attributeSet, int i) {
/* 25 */            super(context, attributeSet, i);
/* 26 */            this.useHybridComposition = false;
/* 27 */            this.containerView = null;
                }
            }
