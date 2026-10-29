            package io.flutter.plugin.platform;

            import android.view.Surface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface PlatformViewRenderTarget {
                int getHeight();

                long getId();

                Surface getSurface();

                int getWidth();

                boolean isReleased();

                void release();

                void resize(int i, int i2);

                default void scheduleFrame() {
                }
            }
