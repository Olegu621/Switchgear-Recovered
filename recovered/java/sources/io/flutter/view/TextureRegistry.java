            package io.flutter.view;

            import android.graphics.SurfaceTexture;
            import android.media.Image;
            import android.view.Surface;
            import io.flutter.BuildConfig;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface TextureRegistry {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface GLTextureConsumer {
                    SurfaceTexture getSurfaceTexture();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ImageConsumer {
                    Image acquireLatestImage();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ImageTextureEntry extends TextureEntry {
                    void pushImage(Image image);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface OnFrameConsumedListener {
                    void onFrameConsumed();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface OnTrimMemoryListener {
                    void onTrimMemory(int i);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum SurfaceLifecycle {
                    manual,
                    resetInBackground
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface SurfaceProducer extends TextureEntry {

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public interface Callback {
                        default void onSurfaceAvailable() {
/* 1 */                     onSurfaceCreated();
                        }

                        default void onSurfaceCleanup() {
/* 1 */                     onSurfaceDestroyed();
                        }

                        @Deprecated(forRemoval = BuildConfig.RELEASE, since = "Flutter 3.27")
                        default void onSurfaceCreated() {
                        }

                        @Deprecated(forRemoval = BuildConfig.RELEASE, since = "Flutter 3.28")
                        default void onSurfaceDestroyed() {
                        }
                    }

                    Surface getForcedNewSurface();

                    int getHeight();

                    Surface getSurface();

                    int getWidth();

                    boolean handlesCropAndRotation();

                    void scheduleFrame();

                    void setCallback(Callback callback);

                    void setSize(int i, int i2);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface SurfaceTextureEntry extends TextureEntry {
                    default void setOnFrameConsumedListener(OnFrameConsumedListener onFrameConsumedListener) {
                    }

                    default void setOnTrimMemoryListener(OnTrimMemoryListener onTrimMemoryListener) {
                    }

                    SurfaceTexture surfaceTexture();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface TextureEntry {
                    /* JADX INFO: renamed from: id */
                    long mo4606id();

                    void release();
                }

                ImageTextureEntry createImageTexture();

                default SurfaceProducer createSurfaceProducer() {
/* 3 */             return createSurfaceProducer(SurfaceLifecycle.manual);
                }

                SurfaceProducer createSurfaceProducer(SurfaceLifecycle surfaceLifecycle);

                SurfaceTextureEntry createSurfaceTexture();

                default void onTrimMemory(int i) {
                }

                SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture);
            }
