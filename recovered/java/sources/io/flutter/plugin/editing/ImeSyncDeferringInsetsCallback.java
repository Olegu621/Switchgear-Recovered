            package io.flutter.plugin.editing;

            import android.graphics.Insets;
            import android.view.View;
            import android.view.WindowInsets;
            import android.view.WindowInsetsAnimation;
            import android.view.WindowInsetsAnimation$Callback;
            import androidx.core.app.NotificationCompat;
            import java.util.Iterator;
            import java.util.List;
            import p000.AbstractC2314w0;
            import p000.rw0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class ImeSyncDeferringInsetsCallback {
                private WindowInsets lastWindowInsets;
                private View view;
                private final int deferredInsetTypes = WindowInsets.Type.ime();
                private boolean animating = false;
                private boolean needsSave = false;
                private AnimationCallback animationCallback = new AnimationCallback();
                private InsetsListener insetsListener = new InsetsListener();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class AnimationCallback extends WindowInsetsAnimation$Callback {
                    public AnimationCallback() {
/* 4 */                 super(1);
                    }

                    public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
/* 7 */                 if (!ImeSyncDeferringInsetsCallback.this.animating || (windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) == 0) {
/* 59 */                    return;
                        }
/* 1 */                 ImeSyncDeferringInsetsCallback.this.animating = false;
/* 34 */                if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets == null || ImeSyncDeferringInsetsCallback.this.view == null) {
/* 59 */                    return;
                        }
/* 56 */                ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    }

                    public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
/* 1 */                 ImeSyncDeferringInsetsCallback.this.needsSave = true;
/* 18 */                if ((windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
/* 1 */                     ImeSyncDeferringInsetsCallback.this.animating = true;
                        }
                    }

                    public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
/* 7 */                 if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
/* 19 */                    Iterator<WindowInsetsAnimation> it = list.iterator();
/* 24 */                    boolean z = false;
/* 29 */                    while (it.hasNext()) {
/* 50 */                        if ((AbstractC2314w0.m9375l(it.next()).getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
/* 52 */                            z = true;
                                }
                            }
/* 54 */                    if (z) {
/* 63 */                        int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
/* 88 */                        int i = ((windowSystemUiVisibility & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom : 0;
/* 89 */                        rw0.m8280l();
/* 98 */                        WindowInsets.Builder builderM8277i = rw0.m8277i(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
/* 1 */                         builderM8277i.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - i, 0)));
/* 144 */                       ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(builderM8277i.build());
                            }
                        }
/* 147 */               return windowInsets;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class InsetsListener implements View.OnApplyWindowInsetsListener {
                    private InsetsListener() {
                    }

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
/* 1 */                 ImeSyncDeferringInsetsCallback.this.view = view;
/* 12 */                if (ImeSyncDeferringInsetsCallback.this.needsSave) {
/* 1 */                     ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
/* 1 */                     ImeSyncDeferringInsetsCallback.this.needsSave = false;
                        }
                        return ImeSyncDeferringInsetsCallback.this.animating ? WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
                    }
                }

                public ImeSyncDeferringInsetsCallback(View view) {
/* 15 */            this.view = view;
                }

                public WindowInsetsAnimation$Callback getAnimationCallback() {
/* 1 */             return this.animationCallback;
                }

                public View.OnApplyWindowInsetsListener getInsetsListener() {
/* 1 */             return this.insetsListener;
                }

                public void install() {
/* 1 */             this.view.setWindowInsetsAnimationCallback(this.animationCallback);
/* 12 */            this.view.setOnApplyWindowInsetsListener(this.insetsListener);
                }

                public void remove() {
/* 2 */             this.view.setWindowInsetsAnimationCallback(null);
/* 9 */             this.view.setOnApplyWindowInsetsListener(null);
                }
            }
