            package io.flutter.plugin.platform;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.view.MotionEvent;
            import android.view.Surface;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.ViewTreeObserver;
            import android.view.accessibility.AccessibilityEvent;
            import android.widget.FrameLayout;
            import io.flutter.Log;
            import io.flutter.embedding.android.AndroidTouchProcessor;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.util.ViewUtils;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 34 */    public class PlatformViewWrapper extends FrameLayout {
                private static final String TAG = "PlatformViewWrapper";
                private ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
                private int left;
                private int prevLeft;
                private int prevTop;
                private PlatformViewRenderTarget renderTarget;
                private int top;
                private AndroidTouchProcessor touchProcessor;

                public PlatformViewWrapper(Context context, PlatformViewRenderTarget platformViewRenderTarget) {
/* 1 */             this(context);
/* 4 */             this.renderTarget = platformViewRenderTarget;
/* 6 */             Surface surface = platformViewRenderTarget.getSurface();
/* 10 */            if (surface == null || FlutterRenderer.debugDisableSurfaceClear) {
/* 35 */                return;
                    }
/* 16 */            Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                    try {
/* 23 */                canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    } finally {
/* 31 */                surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    }
                }

                @Override // android.view.View
                public void draw(Canvas canvas) {
/* 1 */             PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
/* 5 */             if (platformViewRenderTarget == null) {
/* 7 */                 super.draw(canvas);
/* 12 */                Log.m4585e(TAG, "Platform view cannot be composed without a RenderTarget.");
/* 15 */                return;
                    }
/* 16 */            Surface surface = platformViewRenderTarget.getSurface();
/* 24 */            if (!surface.isValid()) {
/* 28 */                Log.m4585e(TAG, "Platform view cannot be composed without a valid RenderTarget surface.");
/* 31 */                return;
                    }
/* 32 */            Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
/* 36 */            if (canvasLockHardwareCanvas == null) {
/* 38 */                invalidate();
/* 41 */                return;
                    }
                    try {
/* 45 */                canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
/* 48 */                super.draw(canvasLockHardwareCanvas);
                    } finally {
/* 63 */                this.renderTarget.scheduleFrame();
/* 66 */                surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    }
                }

                public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
/* 1 */             return this.activeFocusListener;
                }

                public int getRenderTargetHeight() {
/* 1 */             PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
/* 3 */             if (platformViewRenderTarget != null) {
/* 5 */                 return platformViewRenderTarget.getHeight();
                    }
/* 10 */            return 0;
                }

                public int getRenderTargetWidth() {
/* 1 */             PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
/* 3 */             if (platformViewRenderTarget != null) {
/* 5 */                 return platformViewRenderTarget.getWidth();
                    }
/* 10 */            return 0;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
/* 1 */             invalidate();
/* 4 */             return super.invalidateChildInParent(iArr, rect);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public void onDescendantInvalidated(View view, View view2) {
/* 1 */             super.onDescendantInvalidated(view, view2);
/* 4 */             invalidate();
                }

                @Override // android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
/* 1 */             return true;
                }

                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
/* 3 */             if (this.touchProcessor == null) {
/* 5 */                 return super.onTouchEvent(motionEvent);
                    }
/* 12 */            Matrix matrix = new Matrix();
/* 15 */            int action = motionEvent.getAction();
/* 19 */            if (action == 0) {
/* 52 */                int i = this.left;
/* 54 */                this.prevLeft = i;
/* 56 */                int i2 = this.top;
/* 58 */                this.prevTop = i2;
/* 62 */                matrix.postTranslate(i, i2);
                    } else if (action != 2) {
/* 30 */                matrix.postTranslate(this.left, this.top);
                    } else {
/* 40 */                matrix.postTranslate(this.prevLeft, this.prevTop);
/* 45 */                this.prevLeft = this.left;
/* 49 */                this.prevTop = this.top;
                    }
/* 67 */            return this.touchProcessor.onTouchEvent(motionEvent, matrix);
                }

                public void release() {
/* 1 */             PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
/* 3 */             if (platformViewRenderTarget != null) {
/* 5 */                 platformViewRenderTarget.release();
/* 9 */                 this.renderTarget = null;
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 2 */             View childAt = getChildAt(0);
/* 6 */             if (childAt == null || childAt.getImportantForAccessibility() != 4) {
/* 16 */                return super.requestSendAccessibilityEvent(view, accessibilityEvent);
                    }
/* 1 */             return false;
                }

                public void resizeRenderTarget(int i, int i2) {
/* 1 */             PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
/* 3 */             if (platformViewRenderTarget != null) {
/* 5 */                 platformViewRenderTarget.resize(i, i2);
                    }
                }

                public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
/* 1 */             super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
/* 6 */             this.left = layoutParams.leftMargin;
/* 10 */            this.top = layoutParams.topMargin;
                }

                public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
/* 1 */             unsetOnDescendantFocusChangeListener();
/* 4 */             ViewTreeObserver viewTreeObserver = getViewTreeObserver();
/* 12 */            if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
/* 20 */                ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewWrapper.1
                            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                            public void onGlobalFocusChanged(View view, View view2) {
/* 1 */                         View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
/* 3 */                         PlatformViewWrapper platformViewWrapper = PlatformViewWrapper.this;
/* 9 */                         onFocusChangeListener2.onFocusChange(platformViewWrapper, ViewUtils.childHasFocus(platformViewWrapper));
                            }
                        };
/* 23 */                this.activeFocusListener = onGlobalFocusChangeListener;
/* 25 */                viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
                    }
                }

                public void setTouchProcessor(AndroidTouchProcessor androidTouchProcessor) {
/* 1 */             this.touchProcessor = androidTouchProcessor;
                }

                public void unsetOnDescendantFocusChangeListener() {
                    ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
/* 1 */             ViewTreeObserver viewTreeObserver = getViewTreeObserver();
/* 9 */             if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.activeFocusListener) == null) {
/* 21 */                return;
                    }
/* 16 */            this.activeFocusListener = null;
/* 18 */            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
                }

/* 35 */        public PlatformViewWrapper(Context context) {
/* 36 */            super(context);
/* 37 */            setWillNotDraw(false);
                }
            }
