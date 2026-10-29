            package io.flutter.embedding.engine.renderer;

            import android.graphics.SurfaceTexture;
            import android.os.Handler;
            import android.view.Surface;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.view.TextureRegistry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class SurfaceTextureSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {
                private final FlutterJNI flutterJNI;
                private final Handler handler;

                /* JADX INFO: renamed from: id */
                private final long f9752id;
                private boolean released;
                private int requestBufferWidth;
                private int requestedBufferHeight;
                private Surface surface;
                private final TextureRegistry.SurfaceTextureEntry texture;

                public SurfaceTextureSurfaceProducer(long j, Handler handler, FlutterJNI flutterJNI, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
/* 4 */             this.f9752id = j;
/* 6 */             this.handler = handler;
/* 8 */             this.flutterJNI = flutterJNI;
/* 10 */            this.texture = surfaceTextureEntry;
                }

                public Surface createSurface(SurfaceTexture surfaceTexture) {
/* 3 */             return new Surface(surfaceTexture);
                }

                public void finalize() throws Throwable {
                    try {
/* 3 */                 if (this.released) {
/* 8 */                     return;
                        }
/* 9 */                 release();
/* 23 */                this.handler.post(new FlutterRenderer.TextureFinalizerRunnable(this.f9752id, this.flutterJNI));
                    } finally {
/* 31 */                super.finalize();
                    }
                }

                @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                public Surface getForcedNewSurface() {
/* 2 */             this.surface = null;
/* 4 */             return getSurface();
                }

                @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                public int getHeight() {
/* 1 */             return this.requestedBufferHeight;
                }

                @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                public Surface getSurface() {
/* 1 */             Surface surface = this.surface;
/* 3 */             if (surface == null || !surface.isValid()) {
/* 21 */                this.surface = createSurface(this.texture.surfaceTexture());
                    }
/* 23 */            return this.surface;
                }

                @Override // io.flutter.view.TextureRegistry.GLTextureConsumer
                public SurfaceTexture getSurfaceTexture() {
/* 3 */             return this.texture.surfaceTexture();
                }

                @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                public int getWidth() {
/* 1 */             return this.requestBufferWidth;
                }

                @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                public boolean handlesCropAndRotation() {
/* 1 */             return true;
                }

                @Override // io.flutter.view.TextureRegistry.TextureEntry
                /* JADX INFO: renamed from: id */
                public long mo4606id() {
/* 1 */             return this.f9752id;
                }

                @Override // io.flutter.view.TextureRegistry.TextureEntry
                public void release() {
/* 3 */             this.texture.release();
/* 8 */             this.surface.release();
/* 12 */            this.surface = null;
/* 15 */            this.released = true;
                }

                @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                public void scheduleFrame() {
/* 5 */             this.flutterJNI.markTextureFrameAvailable(this.f9752id);
                }

                @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                public void setCallback(TextureRegistry.SurfaceProducer.Callback callback) {
                }

                @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                public void setSize(int i, int i2) {
/* 1 */             this.requestBufferWidth = i;
/* 3 */             this.requestedBufferHeight = i2;
/* 9 */             getSurfaceTexture().setDefaultBufferSize(i, i2);
                }
            }
