            package io.flutter.plugin.platform;

            import android.content.Context;
            import android.hardware.display.DisplayManager;
            import android.hardware.display.VirtualDisplay;
            import android.os.Build;
            import android.util.DisplayMetrics;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class VirtualDisplayController {
                private static String TAG = "VirtualDisplayController";
                private static VirtualDisplay.Callback callback = new VirtualDisplay.Callback() { // from class: io.flutter.plugin.platform.VirtualDisplayController.1
                    @Override // android.hardware.display.VirtualDisplay.Callback
                    public void onPaused() {
                    }

                    @Override // android.hardware.display.VirtualDisplay.Callback
                    public void onResumed() {
                    }
                };
                private final AccessibilityEventsDelegate accessibilityEventsDelegate;
                private final Context context;
                private final int densityDpi;
                private final View.OnFocusChangeListener focusChangeListener;
                SingleViewPresentation presentation;
                private final PlatformViewRenderTarget renderTarget;
                private final int viewId;
                private VirtualDisplay virtualDisplay;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class OneTimeOnDrawListener implements ViewTreeObserver.OnDrawListener {
                    Runnable mOnDrawRunnable;
                    final View mView;

                    public OneTimeOnDrawListener(View view, Runnable runnable) {
/* 4 */                 this.mView = view;
/* 6 */                 this.mOnDrawRunnable = runnable;
                    }

                    public static void schedule(View view, Runnable runnable) {
/* 10 */                view.getViewTreeObserver().addOnDrawListener(new OneTimeOnDrawListener(view, runnable));
                    }

                    @Override // android.view.ViewTreeObserver.OnDrawListener
                    public void onDraw() {
/* 1 */                 Runnable runnable = this.mOnDrawRunnable;
/* 3 */                 if (runnable == null) {
/* 5 */                     return;
                        }
/* 6 */                 runnable.run();
/* 10 */                this.mOnDrawRunnable = null;
/* 19 */                this.mView.post(new Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.1
                            @Override // java.lang.Runnable
                            public void run() {
/* 11 */                        OneTimeOnDrawListener.this.mView.getViewTreeObserver().removeOnDrawListener(OneTimeOnDrawListener.this);
                            }
                        });
                    }
                }

                private VirtualDisplayController(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, VirtualDisplay virtualDisplay, PlatformView platformView, PlatformViewRenderTarget platformViewRenderTarget, View.OnFocusChangeListener onFocusChangeListener, int i, Object obj) {
/* 4 */             this.context = context;
/* 6 */             this.accessibilityEventsDelegate = accessibilityEventsDelegate;
/* 8 */             this.renderTarget = platformViewRenderTarget;
/* 10 */            this.focusChangeListener = onFocusChangeListener;
/* 12 */            this.viewId = i;
/* 14 */            this.virtualDisplay = virtualDisplay;
/* 26 */            this.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
/* 41 */            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.virtualDisplay.getDisplay(), platformView, accessibilityEventsDelegate, i, onFocusChangeListener);
/* 44 */            this.presentation = singleViewPresentation;
/* 46 */            singleViewPresentation.show();
                }

                public static VirtualDisplayController create(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, PlatformView platformView, PlatformViewRenderTarget platformViewRenderTarget, int i, int i2, int i3, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
/* 2 */             if (i == 0 || i2 == 0) {
/* 1 */                 return null;
                    }
/* 14 */            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
/* 20 */            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
/* 24 */            platformViewRenderTarget.resize(i, i2);
/* 49 */            VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(fm0.m3781g(i3, "flutter-vd#"), i, i2, displayMetrics.densityDpi, platformViewRenderTarget.getSurface(), 0, callback, null);
/* 53 */            if (virtualDisplayCreateVirtualDisplay == null) {
/* 1 */                 return null;
                    }
/* 67 */            return new VirtualDisplayController(context, accessibilityEventsDelegate, virtualDisplayCreateVirtualDisplay, platformView, platformViewRenderTarget, onFocusChangeListener, i3, obj);
                }

                private void resize31(View view, int i, int i2, Runnable runnable) {
/* 3 */             this.renderTarget.resize(i, i2);
/* 10 */            this.virtualDisplay.resize(i, i2, this.densityDpi);
/* 21 */            this.virtualDisplay.setSurface(this.renderTarget.getSurface());
/* 26 */            view.postDelayed(runnable, 0L);
                }

                public void clearSurface() {
/* 4 */             this.virtualDisplay.setSurface(null);
                }

                public void dispatchTouchEvent(MotionEvent motionEvent) {
/* 1 */             SingleViewPresentation singleViewPresentation = this.presentation;
/* 3 */             if (singleViewPresentation == null) {
/* 5 */                 return;
                    }
/* 6 */             singleViewPresentation.dispatchTouchEvent(motionEvent);
                }

                public void dispose() {
/* 3 */             this.presentation.cancel();
/* 8 */             this.presentation.detachState();
/* 13 */            this.virtualDisplay.release();
/* 18 */            this.renderTarget.release();
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

                public View getView() {
/* 1 */             SingleViewPresentation singleViewPresentation = this.presentation;
/* 3 */             if (singleViewPresentation == null) {
/* 5 */                 return null;
                    }
/* 11 */            return singleViewPresentation.getView().getView();
                }

                public void onFlutterViewAttached(View view) {
/* 1 */             SingleViewPresentation singleViewPresentation = this.presentation;
/* 3 */             if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
/* 21 */                return;
                    }
/* 18 */            this.presentation.getView().onFlutterViewAttached(view);
                }

                public void onFlutterViewDetached() {
/* 1 */             SingleViewPresentation singleViewPresentation = this.presentation;
/* 3 */             if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
/* 21 */                return;
                    }
/* 18 */            this.presentation.getView().onFlutterViewDetached();
                }

                public void onInputConnectionLocked() {
/* 1 */             SingleViewPresentation singleViewPresentation = this.presentation;
/* 3 */             if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
/* 21 */                return;
                    }
/* 18 */            this.presentation.getView().onInputConnectionLocked();
                }

                public void onInputConnectionUnlocked() {
/* 1 */             SingleViewPresentation singleViewPresentation = this.presentation;
/* 3 */             if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
/* 21 */                return;
                    }
/* 18 */            this.presentation.getView().onInputConnectionUnlocked();
                }

                public void resetSurface() {
/* 1 */             int renderTargetWidth = getRenderTargetWidth();
/* 5 */             int renderTargetHeight = getRenderTargetHeight();
/* 13 */            boolean zIsFocused = getView().isFocused();
/* 19 */            SingleViewPresentation.PresentationState presentationStateDetachState = this.presentation.detachState();
/* 26 */            this.virtualDisplay.setSurface(null);
/* 31 */            this.virtualDisplay.release();
/* 76 */            this.virtualDisplay = ((DisplayManager) this.context.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.viewId, renderTargetWidth, renderTargetHeight, this.densityDpi, this.renderTarget.getSurface(), 0, callback, null);
/* 93 */            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, presentationStateDetachState, this.focusChangeListener, zIsFocused);
/* 96 */            singleViewPresentation.show();
/* 101 */           this.presentation.cancel();
/* 104 */           this.presentation = singleViewPresentation;
                }

                public void resize(int i, int i2, final Runnable runnable) {
/* 7 */             if (i == getRenderTargetWidth() && i2 == getRenderTargetHeight()) {
/* 21 */                getView().postDelayed(runnable, 0L);
/* 24 */                return;
                    }
/* 29 */            if (Build.VERSION.SDK_INT >= 31) {
/* 35 */                resize31(getView(), i, i2, runnable);
/* 38 */                return;
                    }
/* 43 */            boolean zIsFocused = getView().isFocused();
/* 49 */            SingleViewPresentation.PresentationState presentationStateDetachState = this.presentation.detachState();
/* 56 */            this.virtualDisplay.setSurface(null);
/* 61 */            this.virtualDisplay.release();
/* 72 */            DisplayManager displayManager = (DisplayManager) this.context.getSystemService("display");
/* 76 */            this.renderTarget.resize(i, i2);
/* 113 */           this.virtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + this.viewId, i, i2, this.densityDpi, this.renderTarget.getSurface(), 0, callback, null);
/* 115 */           final View view = getView();
/* 124 */           view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: io.flutter.plugin.platform.VirtualDisplayController.2
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view2) {
/* 8 */                     OneTimeOnDrawListener.schedule(view, new Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.2.1
                                @Override // java.lang.Runnable
                                public void run() {
/* 1 */                             ViewOnAttachStateChangeListenerC11132 viewOnAttachStateChangeListenerC11132 = ViewOnAttachStateChangeListenerC11132.this;
/* 9 */                             view.postDelayed(runnable, 128L);
                                }
                            });
/* 13 */                    view.removeOnAttachStateChangeListener(this);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view2) {
                        }
                    });
/* 143 */           SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, presentationStateDetachState, this.focusChangeListener, zIsFocused);
/* 146 */           singleViewPresentation.show();
/* 151 */           this.presentation.cancel();
/* 154 */           this.presentation = singleViewPresentation;
                }
            }
