            package io.flutter.embedding.engine.renderer;
            
            /* JADX INFO: renamed from: io.flutter.embedding.engine.renderer.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1067a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9753a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f9754b;

                public /* synthetic */ RunnableC1067a(Object obj, int i) {
/* 1 */             this.f9753a = i;
/* 3 */             this.f9754b = obj;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f9753a;
/* 3 */             Object obj = this.f9754b;
                    switch (i) {
                        case 0:
/* 1 */                     ((FlutterRenderer.ImageReaderSurfaceProducer) obj).lambda$dequeueImage$0();
                            break;
                        default:
/* 1 */                     ((FlutterRenderer.SurfaceTextureRegistryEntry) obj).lambda$new$0();
                            break;
                    }
                }
            }
