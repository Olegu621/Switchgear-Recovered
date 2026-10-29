            package io.flutter.plugin.platform;

            import android.view.Surface;
            import io.flutter.view.TextureRegistry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SurfaceProducerPlatformViewRenderTarget implements PlatformViewRenderTarget {
                private static final String TAG = "SurfaceProducerRenderTarget";
                private TextureRegistry.SurfaceProducer producer;

                public SurfaceProducerPlatformViewRenderTarget(TextureRegistry.SurfaceProducer surfaceProducer) {
/* 4 */             this.producer = surfaceProducer;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public int getHeight() {
/* 3 */             return this.producer.getHeight();
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public long getId() {
/* 3 */             return this.producer.mo4606id();
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public Surface getSurface() {
/* 3 */             return this.producer.getSurface();
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public int getWidth() {
/* 3 */             return this.producer.getWidth();
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public boolean isReleased() {
                    return this.producer == null;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public void release() {
/* 3 */             this.producer.release();
/* 7 */             this.producer = null;
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public void resize(int i, int i2) {
/* 3 */             this.producer.setSize(i, i2);
                }

                @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
                public void scheduleFrame() {
/* 3 */             this.producer.scheduleFrame();
                }
            }
