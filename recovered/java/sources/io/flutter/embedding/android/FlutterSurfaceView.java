            package io.flutter.embedding.android;

            import android.content.Context;
            import android.graphics.Region;
            import android.util.AttributeSet;
            import android.view.SurfaceHolder;
            import android.view.SurfaceView;
            import io.flutter.Log;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.embedding.engine.renderer.RenderSurface;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public class FlutterSurfaceView extends SurfaceView implements RenderSurface {
                private static final String TAG = "FlutterSurfaceView";
                private FlutterRenderer flutterRenderer;
                private boolean isPaused;
                private boolean isSurfaceAvailableForRendering;
                private final boolean renderTransparently;
                private final SurfaceHolder.Callback surfaceCallback;
                private final SurfaceHolderCallbackCompat surfaceHolderCallbackCompat;

                private FlutterSurfaceView(Context context, AttributeSet attributeSet, boolean z) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.isSurfaceAvailableForRendering = false;
/* 7 */             this.isPaused = false;
/* 11 */            SurfaceHolder.Callback callback = new SurfaceHolder.Callback() { // from class: io.flutter.embedding.android.FlutterSurfaceView.1
                        @Override // android.view.SurfaceHolder.Callback
                        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
/* 5 */                     Log.m4589v(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.surfaceChanged()");
/* 14 */                    if (FlutterSurfaceView.this.shouldNotify()) {
/* 1 */                         FlutterSurfaceView.this.changeSurfaceSize(i2, i3);
                            }
                        }

                        @Override // android.view.SurfaceHolder.Callback
                        public void surfaceCreated(SurfaceHolder surfaceHolder) {
/* 5 */                     Log.m4589v(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.startRenderingToSurface()");
/* 1 */                     FlutterSurfaceView.this.isSurfaceAvailableForRendering = true;
/* 20 */                    if (FlutterSurfaceView.this.shouldNotify()) {
/* 1 */                         FlutterSurfaceView.this.connectSurfaceToRenderer();
                            }
                        }

                        @Override // android.view.SurfaceHolder.Callback
                        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
/* 5 */                     Log.m4589v(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.stopRenderingToSurface()");
/* 1 */                     FlutterSurfaceView.this.isSurfaceAvailableForRendering = false;
/* 20 */                    if (FlutterSurfaceView.this.shouldNotify()) {
/* 1 */                         FlutterSurfaceView.this.disconnectSurfaceFromRenderer();
                            }
                        }
                    };
/* 14 */            this.surfaceCallback = callback;
/* 16 */            this.renderTransparently = z;
/* 25 */            this.surfaceHolderCallbackCompat = new SurfaceHolderCallbackCompat(callback, this, this.flutterRenderer);
/* 27 */            init();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void changeSurfaceSize(int i, int i2) {
/* 3 */             if (this.flutterRenderer == null) {
/* 40 */                f42.m3656l("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
/* 43 */                return;
                    }
/* 29 */            Log.m4589v(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
/* 34 */            this.flutterRenderer.surfaceChanged(i, i2);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void connectSurfaceToRenderer() {
/* 3 */             if (this.flutterRenderer == null || getHolder() == null) {
/* 29 */                f42.m3656l("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
                    } else {
/* 23 */                this.flutterRenderer.startRenderingToSurface(getHolder().getSurface(), this.isPaused);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void disconnectSurfaceFromRenderer() {
/* 1 */             FlutterRenderer flutterRenderer = this.flutterRenderer;
/* 3 */             if (flutterRenderer != null) {
/* 5 */                 flutterRenderer.stopRenderingToSurface();
                    } else {
/* 11 */                f42.m3656l("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                    }
                }

                private void init() {
/* 3 */             if (this.renderTransparently) {
/* 10 */                getHolder().setFormat(-2);
/* 14 */                setZOrderOnTop(true);
                    }
/* 23 */            getHolder().addCallback(this.surfaceHolderCallbackCompat);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public boolean shouldNotify() {
                    return (this.flutterRenderer == null || this.isPaused) ? false : true;
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void attachToRenderer(FlutterRenderer flutterRenderer) {
/* 5 */             Log.m4589v(TAG, "Attaching to FlutterRenderer.");
/* 10 */            if (this.flutterRenderer != null) {
/* 14 */                Log.m4589v(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
/* 19 */                this.flutterRenderer.stopRenderingToSurface();
                    }
/* 22 */            this.flutterRenderer = flutterRenderer;
/* 26 */            this.surfaceHolderCallbackCompat.onAttachToRenderer(flutterRenderer);
/* 29 */            resume();
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void detachFromRenderer() {
/* 5 */             Log.m4589v(TAG, "Detaching from FlutterRenderer.");
/* 10 */            if (this.flutterRenderer == null) {
/* 37 */                Log.m4591w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
/* 40 */                return;
                    }
/* 16 */            if (getWindowToken() != null) {
/* 20 */                Log.m4589v(TAG, "Disconnecting FlutterRenderer from Android surface.");
/* 23 */                disconnectSurfaceFromRenderer();
                    }
/* 28 */            this.surfaceHolderCallbackCompat.onDetachFromRenderer();
/* 32 */            this.flutterRenderer = null;
                }

                @Override // android.view.SurfaceView, android.view.View
                public boolean gatherTransparentRegion(Region region) {
/* 10 */            if (getAlpha() < 1.0f) {
/* 9 */                 return false;
                    }
/* 14 */            int[] iArr = new int[2];
/* 16 */            getLocationInWindow(iArr);
/* 19 */            int i = iArr[0];
/* 51 */            region.op(i, iArr[1], (getRight() + i) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
/* 21 */            return true;
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public FlutterRenderer getAttachedRenderer() {
/* 1 */             return this.flutterRenderer;
                }

                public boolean isSurfaceAvailableForRendering() {
/* 1 */             return this.isSurfaceAvailableForRendering;
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void pause() {
/* 3 */             if (this.flutterRenderer == null) {
/* 9 */                 Log.m4591w(TAG, "pause() invoked when no FlutterRenderer was attached.");
                    } else {
/* 14 */                this.isPaused = true;
                    }
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void resume() {
/* 5 */             if (this.flutterRenderer == null) {
/* 9 */                 Log.m4591w(TAG, "resume() invoked when no FlutterRenderer was attached.");
/* 12 */                return;
                    }
/* 15 */            this.surfaceHolderCallbackCompat.onResume();
/* 22 */            if (isSurfaceAvailableForRendering()) {
/* 26 */                Log.m4589v(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
/* 29 */                connectSurfaceToRenderer();
                    }
/* 33 */            this.isPaused = false;
                }

/* 30 */        public FlutterSurfaceView(Context context, boolean z) {
/* 31 */            this(context, null, z);
                }

/* 31 */        public FlutterSurfaceView(Context context, AttributeSet attributeSet) {
/* 32 */            this(context, attributeSet, false);
                }

/* 32 */        public FlutterSurfaceView(Context context) {
/* 33 */            this(context, null, false);
                }
            }
