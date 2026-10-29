            package io.flutter.plugin.platform;

            import android.graphics.SurfaceTexture;
            import android.os.Build;
            import android.view.Surface;
            import io.flutter.view.TextureRegistry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SurfaceTexturePlatformViewRenderTarget implements PlatformViewRenderTarget {
                private static final String TAG = "SurfaceTexturePlatformViewRenderTarget";
                private Surface surface;
                private SurfaceTexture surfaceTexture;
                private final TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
                private final TextureRegistry.OnTrimMemoryListener trimMemoryListener;
                private int bufferWidth = 0;
                private int bufferHeight = 0;
                private boolean shouldRecreateSurfaceForLowMemory = false;

                public SurfaceTexturePlatformViewRenderTarget(TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
/* 13 */            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = new TextureRegistry.OnTrimMemoryListener() { // from class: io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget.1
                        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
                        public void onTrimMemory(int i) {
/* 3 */                     if (i != 80 || Build.VERSION.SDK_INT < 29) {
/* 17 */                        return;
                            }
/* 1 */                     SurfaceTexturePlatformViewRenderTarget.this.shouldRecreateSurfaceForLowMemory = true;
                        }
                    };
/* 16 */            this.trimMemoryListener = onTrimMemoryListener;
/* 18 */            this.surfaceTextureEntry = surfaceTextureEntry;
/* 24 */            this.surfaceTexture = surfaceTextureEntry.surfaceTexture();
/* 26 */            surfaceTextureEntry.setOnTrimMemoryListener(onTrimMemoryListener);
                }

                private void recreateSurfaceIfNeeded() {
/* 1 */             Surface surface = this.surface;
/* 3 */             if (surface == null || this.shouldRecreateSurfaceForLowMemory) {
/* 10 */                if (surface != null) {
/* 12 */                    surface.release();
/* 16 */                    this.surface = null;
                        }
/* 22 */                this.surface = createSurface();
/* 25 */                this.shouldRecreateSurfaceForLowMemory = false;
                    }
                }

                public Surface createSurface() {
/* 5 */             return new Surface(this.surfaceTexture);
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public int getHeight() {
/* 1 */             return this.bufferHeight;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public long getId() {
/* 3 */             return this.surfaceTextureEntry.mo4606id();
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public Surface getSurface() {
/* 1 */             recreateSurfaceIfNeeded();
/* 4 */             SurfaceTexture surfaceTexture = this.surfaceTexture;
/* 6 */             if (surfaceTexture == null || surfaceTexture.isReleased()) {
/* 18 */                return null;
                    }
/* 15 */            return this.surface;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public int getWidth() {
/* 1 */             return this.bufferWidth;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public boolean isReleased() {
                    return this.surfaceTexture == null;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public void release() {
/* 2 */             this.surfaceTexture = null;
/* 4 */             Surface surface = this.surface;
/* 6 */             if (surface != null) {
/* 8 */                 surface.release();
/* 11 */                this.surface = null;
                    }
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public void resize(int i, int i2) {
/* 1 */             this.bufferWidth = i;
/* 3 */             this.bufferHeight = i2;
/* 5 */             SurfaceTexture surfaceTexture = this.surfaceTexture;
/* 7 */             if (surfaceTexture != null) {
/* 9 */                 surfaceTexture.setDefaultBufferSize(i, i2);
                    }
                }
            }
