            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.os.Handler;
            import android.os.IBinder;
            import android.view.View;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class ThreadedInputConnectionProxyAdapterView extends View {
                private InputConnection cachedConnection;
                final View containerView;
                final Handler imeHandler;
                private boolean isLocked;
                final View rootView;
                final View targetView;
                private boolean triggerDelayed;
                final IBinder windowToken;

                public ThreadedInputConnectionProxyAdapterView(View view, View view2, Handler handler) {
/* 5 */             super(view.getContext());
/* 9 */             this.triggerDelayed = true;
/* 12 */            this.isLocked = false;
/* 14 */            this.imeHandler = handler;
/* 16 */            this.containerView = view;
/* 18 */            this.targetView = view2;
/* 24 */            this.windowToken = view.getWindowToken();
/* 30 */            this.rootView = view.getRootView();
/* 32 */            setFocusable(true);
/* 35 */            setFocusableInTouchMode(true);
/* 38 */            setVisibility(0);
                }

                @Override // android.view.View
                public boolean checkInputConnectionProxy(View view) {
/* 1 */             return true;
                }

                @Override // android.view.View
                public Handler getHandler() {
/* 1 */             return this.imeHandler;
                }

                @Override // android.view.View
                public View getRootView() {
/* 1 */             return this.rootView;
                }

                @Override // android.view.View
                public IBinder getWindowToken() {
/* 1 */             return this.windowToken;
                }

                @Override // android.view.View
                public boolean hasWindowFocus() {
/* 1 */             return true;
                }

                @Override // android.view.View
                public boolean isFocused() {
/* 1 */             return true;
                }

                public boolean isTriggerDelayed() {
/* 1 */             return this.triggerDelayed;
                }

                @Override // android.view.View
                public boolean onCheckIsTextEditor() {
/* 1 */             return true;
                }

                @Override // android.view.View
                public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 2 */             this.triggerDelayed = false;
/* 13 */            InputConnection inputConnectionOnCreateInputConnection = this.isLocked ? this.cachedConnection : this.targetView.onCreateInputConnection(editorInfo);
/* 18 */            this.triggerDelayed = true;
/* 20 */            this.cachedConnection = inputConnectionOnCreateInputConnection;
/* 22 */            return inputConnectionOnCreateInputConnection;
                }

                public void setLocked(boolean z) {
/* 1 */             this.isLocked = z;
                }
            }
