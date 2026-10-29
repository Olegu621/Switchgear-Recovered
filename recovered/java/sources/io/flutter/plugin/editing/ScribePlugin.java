            package io.flutter.plugin.editing;

            import android.os.Build;
            import android.view.View;
            import android.view.inputmethod.InputMethodManager;
            import io.flutter.embedding.engine.systemchannels.ScribeChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ScribePlugin implements ScribeChannel.ScribeMethodHandler {
                private final InputMethodManager mInputMethodManager;
                private final ScribeChannel mScribeChannel;
                private View mView;

                public ScribePlugin(View view, InputMethodManager inputMethodManager, ScribeChannel scribeChannel) {
/* 8 */             if (Build.VERSION.SDK_INT >= 33) {
/* 2 */                 view.setAutoHandwritingEnabled(false);
                    }
/* 13 */            this.mView = view;
/* 15 */            this.mInputMethodManager = inputMethodManager;
/* 17 */            this.mScribeChannel = scribeChannel;
/* 19 */            scribeChannel.setScribeMethodHandler(this);
                }

                public void destroy() {
/* 4 */             this.mScribeChannel.setScribeMethodHandler(null);
                }

                @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
                public boolean isFeatureAvailable() {
                    return Build.VERSION.SDK_INT >= 34 && isStylusHandwritingAvailable();
                }

                @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
                public boolean isStylusHandwritingAvailable() {
/* 1 */             return this.mInputMethodManager.isStylusHandwritingAvailable();
                }

                public void setView(View view) {
/* 3 */             if (view == this.mView) {
/* 5 */                 return;
                    }
/* 6 */             this.mView = view;
                }

                @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
                public void startStylusHandwriting() {
/* 1 */             this.mInputMethodManager.startStylusHandwriting(this.mView);
                }
            }
