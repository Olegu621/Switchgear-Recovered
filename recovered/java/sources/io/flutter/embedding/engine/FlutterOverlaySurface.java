            package io.flutter.embedding.engine;

            import android.view.Surface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterOverlaySurface {

                /* JADX INFO: renamed from: id */
                private final int f9738id;
                private final Surface surface;

                public FlutterOverlaySurface(int i, Surface surface) {
/* 4 */             this.f9738id = i;
/* 6 */             this.surface = surface;
                }

                public int getId() {
/* 1 */             return this.f9738id;
                }

                public Surface getSurface() {
/* 1 */             return this.surface;
                }
            }
