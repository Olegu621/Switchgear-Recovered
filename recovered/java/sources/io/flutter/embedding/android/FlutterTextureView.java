            package io.flutter.embedding.android;

            import android.content.Context;
            import android.graphics.SurfaceTexture;
            import android.util.AttributeSet;
            import android.view.Surface;
            import android.view.TextureView;
            import io.flutter.Log;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.embedding.engine.renderer.RenderSurface;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public class FlutterTextureView extends TextureView implements RenderSurface {
                private static final String TAG = "FlutterTextureView";
                private FlutterRenderer flutterRenderer;
                private boolean isPaused;
                private boolean isSurfaceAvailableForRendering;
                private Surface renderSurface;
                private final TextureView.SurfaceTextureListener surfaceTextureListener;

                public FlutterTextureView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.isSurfaceAvailableForRendering = false;
/* 7 */             this.isPaused = false;
/* 14 */            this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: io.flutter.embedding.android.FlutterTextureView.1
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
/* 5 */                     Log.m4589v(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureAvailable()");
/* 1 */                     FlutterTextureView.this.isSurfaceAvailableForRendering = true;
/* 20 */                    if (FlutterTextureView.this.shouldNotify()) {
/* 1 */                         FlutterTextureView.this.connectSurfaceToRenderer();
                            }
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
/* 5 */                     Log.m4589v(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureDestroyed()");
/* 1 */                     FlutterTextureView.this.isSurfaceAvailableForRendering = false;
/* 20 */                    if (FlutterTextureView.this.shouldNotify()) {
/* 1 */                         FlutterTextureView.this.disconnectSurfaceFromRenderer();
                            }
/* 33 */                    if (FlutterTextureView.this.renderSurface == null) {
/* 50 */                        return true;
                            }
/* 41 */                    FlutterTextureView.this.renderSurface.release();
/* 1 */                     FlutterTextureView.this.renderSurface = null;
/* 50 */                    return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
/* 5 */                     Log.m4589v(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
/* 14 */                    if (FlutterTextureView.this.shouldNotify()) {
/* 1 */                         FlutterTextureView.this.changeSurfaceSize(i, i2);
                            }
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        }
                    };
/* 16 */            init();
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
/* 3 */             if (this.flutterRenderer == null || getSurfaceTexture() == null) {
/* 42 */                f42.m3656l("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
/* 45 */                return;
                    }
/* 11 */            Surface surface = this.renderSurface;
/* 13 */            if (surface != null) {
/* 15 */                surface.release();
/* 19 */                this.renderSurface = null;
                    }
/* 27 */            Surface surface2 = new Surface(getSurfaceTexture());
/* 30 */            this.renderSurface = surface2;
/* 36 */            this.flutterRenderer.startRenderingToSurface(surface2, this.isPaused);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void disconnectSurfaceFromRenderer() {
/* 1 */             FlutterRenderer flutterRenderer = this.flutterRenderer;
/* 3 */             if (flutterRenderer == null) {
/* 21 */                f42.m3656l("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
/* 24 */                return;
                    }
/* 5 */             flutterRenderer.stopRenderingToSurface();
/* 8 */             Surface surface = this.renderSurface;
/* 10 */            if (surface != null) {
/* 12 */                surface.release();
/* 16 */                this.renderSurface = null;
                    }
                }

                private void init() {
/* 3 */             setSurfaceTextureListener(this.surfaceTextureListener);
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
/* 24 */            resume();
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void detachFromRenderer() {
/* 5 */             if (this.flutterRenderer == null) {
/* 27 */                Log.m4591w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
/* 30 */                return;
                    }
/* 11 */            if (getWindowToken() != null) {
/* 15 */                Log.m4589v(TAG, "Disconnecting FlutterRenderer from Android surface.");
/* 18 */                disconnectSurfaceFromRenderer();
                    }
/* 22 */            this.flutterRenderer = null;
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
/* 17 */            if (isSurfaceAvailableForRendering()) {
/* 21 */                Log.m4589v(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
/* 24 */                connectSurfaceToRenderer();
                    }
/* 28 */            this.isPaused = false;
                }

                public void setRenderSurface(Surface surface) {
/* 1 */             this.renderSurface = surface;
                }

/* 19 */        public FlutterTextureView(Context context) {
/* 20 */            this(context, null);
                }
            }
