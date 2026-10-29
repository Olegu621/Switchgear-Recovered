            package p000;

            import android.view.View;
            import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
            import io.flutter.plugin.platform.PlatformViewsController;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ct1 implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f6901a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PlatformViewsController f6902b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ PlatformViewsChannel.PlatformViewCreationRequest f6903c;

                public /* synthetic */ ct1(PlatformViewsController platformViewsController, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, int i) {
/* 1 */             this.f6901a = i;
/* 3 */             this.f6902b = platformViewsController;
/* 5 */             this.f6903c = platformViewCreationRequest;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
/* 1 */             int i = this.f6901a;
/* 3 */             PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest = this.f6903c;
/* 5 */             PlatformViewsController platformViewsController = this.f6902b;
                    switch (i) {
                        case 0:
/* 1 */                     platformViewsController.lambda$configureForTextureLayerComposition$1(platformViewCreationRequest, view, z);
                            break;
                        default:
/* 1 */                     platformViewsController.lambda$configureForVirtualDisplay$0(platformViewCreationRequest, view, z);
                            break;
                    }
                }
            }
