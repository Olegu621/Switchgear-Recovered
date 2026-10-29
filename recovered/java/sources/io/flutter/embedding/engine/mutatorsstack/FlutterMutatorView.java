            package io.flutter.embedding.engine.mutatorsstack;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import android.view.accessibility.AccessibilityEvent;
            import android.widget.FrameLayout;
            import io.flutter.embedding.android.AndroidTouchProcessor;
            import io.flutter.util.ViewUtils;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public class FlutterMutatorView extends FrameLayout {
                ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
                private final AndroidTouchProcessor androidTouchProcessor;
                private int left;
                private FlutterMutatorsStack mutatorsStack;
                private Paint paint;
                private int prevLeft;
                private int prevTop;
                private float screenDensity;
                private int top;

                public FlutterMutatorView(Context context, float f, AndroidTouchProcessor androidTouchProcessor) {
/* 2 */             super(context, null);
/* 5 */             this.screenDensity = f;
/* 7 */             this.androidTouchProcessor = androidTouchProcessor;
/* 14 */            this.paint = new Paint();
                }

                private Matrix getPlatformViewMatrix() {
/* 9 */             Matrix matrix = new Matrix(this.mutatorsStack.getFinalMatrix());
/* 12 */            float f = this.screenDensity;
/* 19 */            matrix.preScale(1.0f / f, 1.0f / f);
/* 30 */            matrix.postTranslate(-this.left, -this.top);
/* 33 */            return matrix;
                }

                @Override // android.view.ViewGroup, android.view.View
                public void dispatchDraw(Canvas canvas) {
/* 1 */             canvas.save();
/* 8 */             canvas.concat(getPlatformViewMatrix());
/* 11 */            super.dispatchDraw(canvas);
/* 14 */            canvas.restore();
                }

                @Override // android.view.View
                public void draw(Canvas canvas) {
/* 1 */             canvas.save();
/* 10 */            Iterator<Path> it = this.mutatorsStack.getFinalClippingPaths().iterator();
/* 18 */            while (it.hasNext()) {
/* 28 */                Path path = new Path(it.next());
/* 39 */                path.offset(-this.left, -this.top);
/* 42 */                canvas.clipPath(path);
                    }
/* 62 */            if (this.paint.getAlpha() != ((int) (this.mutatorsStack.getFinalOpacity() * 255.0f))) {
/* 74 */                this.paint.setAlpha((int) (this.mutatorsStack.getFinalOpacity() * 255.0f));
/* 80 */                setLayerType(2, this.paint);
                    }
/* 83 */            super.draw(canvas);
/* 86 */            canvas.restore();
                }

                @Override // android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
/* 1 */             return true;
                }

                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
/* 3 */             if (this.androidTouchProcessor == null) {
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
/* 67 */            return this.androidTouchProcessor.onTouchEvent(motionEvent, matrix);
                }

                public void readyToDisplay(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
/* 1 */             this.mutatorsStack = flutterMutatorsStack;
/* 3 */             this.left = i;
/* 5 */             this.top = i2;
/* 9 */             FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
/* 12 */            layoutParams.leftMargin = i;
/* 14 */            layoutParams.topMargin = i2;
/* 16 */            setLayoutParams(layoutParams);
/* 20 */            setWillNotDraw(false);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 2 */             View childAt = getChildAt(0);
/* 6 */             if (childAt == null || childAt.getImportantForAccessibility() != 4) {
/* 16 */                return super.requestSendAccessibilityEvent(view, accessibilityEvent);
                    }
/* 1 */             return false;
                }

                public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
/* 1 */             unsetOnDescendantFocusChangeListener();
/* 4 */             ViewTreeObserver viewTreeObserver = getViewTreeObserver();
/* 12 */            if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
/* 20 */                ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView.1
                            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                            public void onGlobalFocusChanged(View view, View view2) {
/* 1 */                         View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
/* 3 */                         View view3 = this;
/* 9 */                         onFocusChangeListener2.onFocusChange(view3, ViewUtils.childHasFocus(view3));
                            }
                        };
/* 23 */                this.activeFocusListener = onGlobalFocusChangeListener;
/* 25 */                viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
                    }
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

/* 16 */        public FlutterMutatorView(Context context) {
/* 17 */            this(context, 1.0f, null);
                }
            }
