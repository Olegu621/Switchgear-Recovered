            package io.flutter.plugin.platform;

            import android.media.Image;
            import android.media.ImageReader;
            import android.os.Build;
            import android.os.Handler;
            import android.view.Surface;
            import io.flutter.Log;
            import io.flutter.view.TextureRegistry;
            import p000.AbstractC2481y0;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ImageReaderPlatformViewRenderTarget implements PlatformViewRenderTarget {
                private static final int MAX_IMAGES = 4;
                private static final String TAG = "ImageReaderPlatformViewRenderTarget";
                private ImageReader reader;
                private TextureRegistry.ImageTextureEntry textureEntry;
                private int bufferWidth = 0;
                private int bufferHeight = 0;
                private final Handler onImageAvailableHandler = new Handler();
                private final ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget.1
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public void onImageAvailable(ImageReader imageReader) {
                        Image imageAcquireLatestImage;
                        try {
/* 1 */                     imageAcquireLatestImage = imageReader.acquireLatestImage();
                        } catch (IllegalStateException e) {
/* 27 */                    Log.m4585e(ImageReaderPlatformViewRenderTarget.TAG, "onImageAvailable acquireLatestImage failed: " + e.toString());
/* 30 */                    imageAcquireLatestImage = null;
                        }
/* 31 */                if (imageAcquireLatestImage == null) {
/* 33 */                    return;
                        }
/* 40 */                ImageReaderPlatformViewRenderTarget.this.textureEntry.pushImage(imageAcquireLatestImage);
                    }
                };

                public ImageReaderPlatformViewRenderTarget(TextureRegistry.ImageTextureEntry imageTextureEntry) {
/* 27 */            if (Build.VERSION.SDK_INT >= 29) {
/* 29 */                this.textureEntry = imageTextureEntry;
                    } else {
/* 34 */                C1951n4.m6866q("ImageReaderPlatformViewRenderTarget requires API version 29+");
/* 38 */                throw null;
                    }
                }

                private void closeReader() {
/* 3 */             if (this.reader != null) {
/* 8 */                 this.textureEntry.pushImage(null);
/* 13 */                this.reader.close();
/* 16 */                this.reader = null;
                    }
                }

                public ImageReader createImageReader() {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i >= 33) {
/* 7 */                 return createImageReader33();
                    }
/* 14 */            if (i >= 29) {
/* 16 */                return createImageReader29();
                    }
/* 23 */            C1951n4.m6866q("ImageReaderPlatformViewRenderTarget requires API version 29+");
/* 26 */            return null;
                }

                public ImageReader createImageReader29() {
/* 8 */             ImageReader imageReaderNewInstance = ImageReader.newInstance(this.bufferWidth, this.bufferHeight, 34, 4, 256L);
/* 13 */            imageReaderNewInstance.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
/* 16 */            return imageReaderNewInstance;
                }

                public ImageReader createImageReader33() {
/* 1 */             AbstractC2481y0.m10074t();
/* 8 */             ImageReader.Builder builderM10062h = AbstractC2481y0.m10062h(this.bufferWidth, this.bufferHeight);
/* 2 */             builderM10062h.setMaxImages(4);
/* 3 */             builderM10062h.setImageFormat(34);
/* 3 */             builderM10062h.setUsage(256L);
/* 1 */             ImageReader imageReaderBuild = builderM10062h.build();
/* 29 */            imageReaderBuild.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
/* 32 */            return imageReaderBuild;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public int getHeight() {
/* 1 */             return this.bufferHeight;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public long getId() {
/* 3 */             return this.textureEntry.mo4606id();
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public Surface getSurface() {
/* 3 */             return this.reader.getSurface();
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public int getWidth() {
/* 1 */             return this.bufferWidth;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public boolean isReleased() {
                    return this.textureEntry == null;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public void release() {
/* 1 */             closeReader();
/* 5 */             this.textureEntry = null;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public void resize(int i, int i2) {
/* 3 */             if (this.reader != null && this.bufferWidth == i && this.bufferHeight == i2) {
/* 13 */                return;
                    }
/* 14 */            closeReader();
/* 17 */            this.bufferWidth = i;
/* 19 */            this.bufferHeight = i2;
/* 25 */            this.reader = createImageReader();
                }
            }
