            package io.flutter.embedding.android;

            import android.os.Build;
            import android.view.SurfaceHolder;
            import io.flutter.Log;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SurfaceHolderCallbackCompat implements SurfaceHolder.Callback2 {
                private static final String TAG = "SurfaceHolderCallbackCompat";
                final FlutterUiDisplayListener alphaCallback = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.SurfaceHolderCallbackCompat.1
                    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                    public void onFlutterUiDisplayed() {
/* 5 */                 Log.m4589v(SurfaceHolderCallbackCompat.TAG, "onFlutterUiDisplayed()");
/* 16 */                SurfaceHolderCallbackCompat.this.flutterSurfaceView.setAlpha(1.0f);
/* 25 */                if (SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
/* 33 */                    SurfaceHolderCallbackCompat.this.flutterRenderer.removeIsDisplayingFlutterUiListener(this);
                        }
                    }

                    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                    public void onFlutterUiNoLongerDisplayed() {
                    }
                };
                private FlutterRenderer flutterRenderer;
                private final FlutterSurfaceView flutterSurfaceView;
                private final SurfaceHolder.Callback innerCallback;
                final FlutterRendererLifecycleCallback lifecycleCallback;
                private final boolean shouldSetAlpha;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface FlutterRendererLifecycleCallback {
                    void onAttachToRenderer(FlutterRenderer flutterRenderer);

                    void onDetachFromRenderer();

                    void onResume();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class FlutterRendererLifecycleCallbackApi26AndUp implements FlutterRendererLifecycleCallback {
                    public FlutterRendererLifecycleCallbackApi26AndUp() {
                    }

                    @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
                    public void onAttachToRenderer(FlutterRenderer flutterRenderer) {
/* 1 */                 SurfaceHolderCallbackCompat.this.flutterRenderer = flutterRenderer;
                    }

                    @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
                    public void onDetachFromRenderer() {
/* 1 */                 SurfaceHolderCallbackCompat.this.flutterRenderer = null;
                    }

                    @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
                    public void onResume() {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class FlutterRendererLifecycleCallbackPreApi26 implements FlutterRendererLifecycleCallback {
                    public FlutterRendererLifecycleCallbackPreApi26() {
                    }

                    @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
                    public void onAttachToRenderer(FlutterRenderer flutterRenderer) {
/* 7 */                 if (SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
/* 19 */                    SurfaceHolderCallbackCompat.this.flutterRenderer.removeIsDisplayingFlutterUiListener(SurfaceHolderCallbackCompat.this.alphaCallback);
                        }
/* 1 */                 SurfaceHolderCallbackCompat.this.flutterRenderer = flutterRenderer;
                    }

                    @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
                    public void onDetachFromRenderer() {
/* 8 */                 SurfaceHolderCallbackCompat.this.flutterSurfaceView.setAlpha(0.0f);
/* 17 */                if (SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
/* 29 */                    SurfaceHolderCallbackCompat.this.flutterRenderer.removeIsDisplayingFlutterUiListener(SurfaceHolderCallbackCompat.this.alphaCallback);
                        }
/* 1 */                 SurfaceHolderCallbackCompat.this.flutterRenderer = null;
                    }

                    @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
                    public void onResume() {
/* 7 */                 if (SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
/* 19 */                    SurfaceHolderCallbackCompat.this.flutterRenderer.addIsDisplayingFlutterUiListener(SurfaceHolderCallbackCompat.this.alphaCallback);
                        }
                    }
                }

                public SurfaceHolderCallbackCompat(SurfaceHolder.Callback callback, FlutterSurfaceView flutterSurfaceView, FlutterRenderer flutterRenderer) {
/* 19 */            boolean z = Build.VERSION.SDK_INT < 26;
/* 20 */            this.shouldSetAlpha = z;
/* 35 */            this.lifecycleCallback = z ? new FlutterRendererLifecycleCallbackPreApi26() : new FlutterRendererLifecycleCallbackApi26AndUp();
/* 37 */            this.innerCallback = callback;
/* 39 */            this.flutterRenderer = flutterRenderer;
/* 41 */            this.flutterSurfaceView = flutterSurfaceView;
/* 47 */            Log.m4589v(TAG, "SurfaceHolderCallbackCompat()");
/* 50 */            if (z) {
/* 53 */                flutterSurfaceView.setAlpha(0.0f);
                    }
                }

                public void onAttachToRenderer(FlutterRenderer flutterRenderer) {
/* 3 */             this.lifecycleCallback.onAttachToRenderer(flutterRenderer);
                }

                public void onDetachFromRenderer() {
/* 3 */             this.lifecycleCallback.onDetachFromRenderer();
                }

                public void onResume() {
/* 3 */             this.lifecycleCallback.onResume();
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
/* 1 */             SurfaceHolder.Callback callback = this.innerCallback;
/* 3 */             if (callback != null) {
/* 5 */                 callback.surfaceChanged(surfaceHolder, i, i2, i3);
                    }
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
/* 1 */             SurfaceHolder.Callback callback = this.innerCallback;
/* 3 */             if (callback != null) {
/* 5 */                 callback.surfaceCreated(surfaceHolder);
                    }
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
/* 1 */             SurfaceHolder.Callback callback = this.innerCallback;
/* 3 */             if (callback != null) {
/* 5 */                 callback.surfaceDestroyed(surfaceHolder);
                    }
                }

                @Override // android.view.SurfaceHolder.Callback2
                public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
/* 5 */             Log.m4589v(TAG, "SurfaceHolder.Callback2.surfaceRedrawNeeded()");
                }

                @Override // android.view.SurfaceHolder.Callback2
                public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, final Runnable runnable) {
/* 5 */             Log.m4589v(TAG, "SurfaceHolder.Callback2.surfaceRedrawNeededAsync()");
/* 8 */             FlutterRenderer flutterRenderer = this.flutterRenderer;
/* 10 */            if (flutterRenderer == null) {
/* 12 */                return;
                    }
/* 18 */            flutterRenderer.addIsDisplayingFlutterUiListener(new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.SurfaceHolderCallbackCompat.2
                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiDisplayed() {
/* 3 */                     runnable.run();
/* 12 */                    if (SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
/* 20 */                        SurfaceHolderCallbackCompat.this.flutterRenderer.removeIsDisplayingFlutterUiListener(this);
                            }
                        }

                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiNoLongerDisplayed() {
                        }
                    });
                }
            }
