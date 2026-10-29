            package com.supercell.p007id;

            import android.app.Activity;
            import android.graphics.RectF;
            import android.os.Build;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowManager;
            import android.widget.FrameLayout;
            import io.flutter.embedding.android.FlutterTextureView;
            import io.flutter.embedding.android.FlutterView;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.plugin.editing.CustomTextInputPlugin;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Field;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterPanel extends FrameLayout {
                private static final String TAG = "FlutterPanel";
                private final Activity activity;
                private final FlutterEngine engine;
                private final FlutterSupport flutterSupport;
                private final List<RectF> hitTestRects;
                private final List<RectF> hitTestRectsNormalized;
                private final FlutterPanelPlatformPlugin platformPlugin;
                private final FlutterView view;

                public FlutterPanel(Activity activity, FlutterEngine flutterEngine, FlutterSupport flutterSupport) {
/* 1 */             super(activity);
/* 9 */             this.hitTestRectsNormalized = new ArrayList();
/* 16 */            this.hitTestRects = new ArrayList();
/* 18 */            this.activity = activity;
/* 20 */            this.engine = flutterEngine;
/* 22 */            this.flutterSupport = flutterSupport;
/* 40 */            this.platformPlugin = new FlutterPanelPlatformPlugin(this, flutterEngine.getPlatformChannel(), new s80(19));
/* 44 */            FlutterTextureView flutterTextureView = new FlutterTextureView(activity);
/* 48 */            flutterTextureView.setOpaque(false);
/* 53 */            FlutterView flutterView = new FlutterView(activity, flutterTextureView);
/* 56 */            this.view = flutterView;
/* 58 */            flutterView.attachToFlutterEngine(flutterEngine);
/* 79 */            CustomTextInputPlugin customTextInputPlugin = new CustomTextInputPlugin(flutterView, flutterEngine.getTextInputChannel(), flutterEngine.getScribeChannel(), flutterEngine.getPlatformViewsController(), flutterEngine.getPlatformViewsController2());
/* 86 */            flutterEngine.getPlatformViewsController().detachTextInputPlugin();
/* 93 */            flutterEngine.getPlatformViewsController().attachTextInputPlugin(customTextInputPlugin);
                    try {
/* 100 */               Field declaredField = FlutterView.class.getDeclaredField("textInputPlugin");
/* 105 */               declaredField.setAccessible(true);
/* 108 */               declaredField.set(flutterView, customTextInputPlugin);
                    } catch (IllegalAccessException | NoSuchFieldException unused) {
                    }
/* 123 */           addView(this.view, generateLayoutParams(new ViewGroup.LayoutParams(-1, -1)));
/* 126 */           WindowManager windowManager = activity.getWindowManager();
/* 140 */           WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 65824, -3);
/* 145 */           layoutParams.softInputMode = 16;
/* 150 */           layoutParams.gravity = 8388659;
/* 156 */           if (Build.VERSION.SDK_INT >= 28) {
/* 2 */                 layoutParams.layoutInDisplayCutoutMode = 1;
                    }
/* 161 */           windowManager.addView(this, layoutParams);
/* 166 */           setSystemUiVisibility(this.view, activity);
                }

                private boolean hitTest(MotionEvent motionEvent) {
/* 1 */             float x = motionEvent.getX();
/* 5 */             float y = motionEvent.getY();
/* 11 */            Iterator<RectF> it = this.hitTestRects.iterator();
/* 19 */            while (it.hasNext()) {
/* 31 */                if (it.next().contains(x, y)) {
/* 33 */                    return true;
                        }
                    }
/* 35 */            return false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ boolean lambda$new$0() {
/* 1 */             return true;
                }

                public static void setSystemUiVisibility(View view, Activity activity) {
/* 15 */            view.setSystemUiVisibility(activity.getWindow().getDecorView().getWindowSystemUiVisibility() | 1792);
                }

                private void updateHitTestRects(int i, int i2) {
/* 3 */             this.hitTestRects.clear();
/* 16 */            for (RectF rectF : this.hitTestRectsNormalized) {
                        float f = i;
                        float f2 = i2;
/* 45 */                this.hitTestRects.add(new RectF(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2));
                    }
                }

                public void destroy() {
                    try {
/* 3 */                 this.view.detachFromFlutterEngine();
                    } catch (Exception e) {
/* 12 */                AbstractC1245n0.m4877e(TAG, "detachFromFlutterEngine failed", e);
                    }
/* 21 */            this.activity.getWindowManager().removeViewImmediate(this);
                }

                @Override // android.view.View
                public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                    return !hitTest(motionEvent) ? this.activity.dispatchGenericMotionEvent(motionEvent) : super.dispatchGenericMotionEvent(motionEvent);
                }

                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 5 */             if (super.dispatchKeyEvent(keyEvent)) {
/* 7 */                 return true;
                    }
/* 13 */            return keyEvent.dispatch(this, getKeyDispatcherState(), this);
                }

                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    return !hitTest(motionEvent) ? this.activity.dispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
                }

                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                    return !hitTest(motionEvent) ? this.activity.dispatchTrackballEvent(motionEvent) : super.dispatchTrackballEvent(motionEvent);
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 8 */             this.flutterSupport.onPanelResumed(this.activity);
                }

                public void onBackPressed() {
/* 7 */             this.engine.getNavigationChannel().popRoute();
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 6 */             this.platformPlugin.destroy();
/* 11 */            this.view.detachFromFlutterEngine();
/* 18 */            this.flutterSupport.onPanelPaused(this.activity);
                }

                @Override // android.view.View, android.view.KeyEvent.Callback
                public boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 2 */             if (i != 4 && i != 111) {
/* 9 */                 return false;
                    }
/* 11 */            keyEvent.startTracking();
/* 14 */            return true;
                }

                @Override // android.view.View, android.view.KeyEvent.Callback
                public boolean onKeyUp(int i, KeyEvent keyEvent) {
/* 2 */             if ((i != 4 && i != 111) || !keyEvent.isTracking() || keyEvent.isCanceled()) {
/* 25 */                return false;
                    }
/* 20 */            onBackPressed();
/* 23 */            return true;
                }

                @Override // android.view.View
                public void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 4 */             updateHitTestRects(i, i2);
                }

                public void setHitTestRects(float[] fArr) {
/* 3 */             this.hitTestRectsNormalized.clear();
/* 6 */             int i = 0;
                    while (true) {
/* 7 */                 int i2 = i + 3;
/* 10 */                if (i2 >= fArr.length) {
/* 45 */                    updateHitTestRects(getWidth(), getHeight());
/* 48 */                    return;
                        } else {
/* 31 */                    this.hitTestRectsNormalized.add(new RectF(fArr[i], fArr[i + 1], fArr[i + 2], fArr[i2]));
/* 34 */                    i += 4;
                        }
                    }
                }
            }
