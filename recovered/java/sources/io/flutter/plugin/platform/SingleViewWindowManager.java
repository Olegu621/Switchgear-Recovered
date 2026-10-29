            package io.flutter.plugin.platform;

            import android.view.Display;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowManager;
            import android.view.WindowMetrics;
            import io.flutter.Log;
            import java.util.concurrent.Executor;
            import java.util.function.Consumer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     abstract class SingleViewWindowManager implements WindowManager {
                private static final String TAG = "PlatformViewsController";
                final WindowManager delegate;
                SingleViewFakeWindowViewGroup fakeWindowRootView;

                public SingleViewWindowManager(WindowManager windowManager, SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup) {
/* 4 */             this.delegate = windowManager;
/* 6 */             this.fakeWindowRootView = singleViewFakeWindowViewGroup;
                }

                @Override // android.view.WindowManager
                public void addCrossWindowBlurEnabledListener(Consumer<Boolean> consumer) {
/* 1 */             this.delegate.addCrossWindowBlurEnabledListener(consumer);
                }

                @Override // android.view.ViewManager
                public void addView(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
/* 3 */             if (singleViewFakeWindowViewGroup == null) {
/* 9 */                 Log.m4591w(TAG, "Embedded view called addView while detached from presentation");
                    } else {
/* 13 */                singleViewFakeWindowViewGroup.addView(view, layoutParams);
                    }
                }

                @Override // android.view.WindowManager
                public WindowMetrics getCurrentWindowMetrics() {
/* 1 */             return this.delegate.getCurrentWindowMetrics();
                }

                @Override // android.view.WindowManager
                @Deprecated
                public Display getDefaultDisplay() {
/* 3 */             return this.delegate.getDefaultDisplay();
                }

                @Override // android.view.WindowManager
                public WindowMetrics getMaximumWindowMetrics() {
/* 1 */             return this.delegate.getMaximumWindowMetrics();
                }

                @Override // android.view.WindowManager
                public boolean isCrossWindowBlurEnabled() {
/* 1 */             return this.delegate.isCrossWindowBlurEnabled();
                }

                @Override // android.view.WindowManager
                public void removeCrossWindowBlurEnabledListener(Consumer<Boolean> consumer) {
/* 1 */             this.delegate.removeCrossWindowBlurEnabledListener(consumer);
                }

                @Override // android.view.ViewManager
                public void removeView(View view) {
/* 1 */             SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
/* 3 */             if (singleViewFakeWindowViewGroup == null) {
/* 9 */                 Log.m4591w(TAG, "Embedded view called removeView while detached from presentation");
                    } else {
/* 13 */                singleViewFakeWindowViewGroup.removeView(view);
                    }
                }

                @Override // android.view.WindowManager
                public void removeViewImmediate(View view) {
/* 3 */             if (this.fakeWindowRootView == null) {
/* 9 */                 Log.m4591w(TAG, "Embedded view called removeViewImmediate while detached from presentation");
                    } else {
/* 13 */                view.clearAnimation();
/* 18 */                this.fakeWindowRootView.removeView(view);
                    }
                }

                @Override // android.view.ViewManager
                public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
/* 3 */             if (singleViewFakeWindowViewGroup == null) {
/* 9 */                 Log.m4591w(TAG, "Embedded view called updateViewLayout while detached from presentation");
                    } else {
/* 13 */                singleViewFakeWindowViewGroup.updateViewLayout(view, layoutParams);
                    }
                }

                @Override // android.view.WindowManager
/* 6 */         public void addCrossWindowBlurEnabledListener(Executor executor, Consumer<Boolean> consumer) {
/* 1 */             this.delegate.addCrossWindowBlurEnabledListener(executor, consumer);
                }
            }
