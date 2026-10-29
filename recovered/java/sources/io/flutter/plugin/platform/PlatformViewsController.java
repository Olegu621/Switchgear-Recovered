            package io.flutter.plugin.platform;

            import android.content.Context;
            import android.content.MutableContextWrapper;
            import android.os.Build;
            import android.util.SparseArray;
            import android.view.MotionEvent;
            import android.view.SurfaceView;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.FrameLayout;
            import io.flutter.Log;
            import io.flutter.embedding.android.AndroidTouchProcessor;
            import io.flutter.embedding.android.FlutterView;
            import io.flutter.embedding.android.MotionEventTracker;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.FlutterOverlaySurface;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
            import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
            import io.flutter.plugin.editing.TextInputPlugin;
            import io.flutter.util.ViewUtils;
            import io.flutter.view.AccessibilityBridge;
            import io.flutter.view.TextureRegistry;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.RunnableC2166s2;
            import p000.bt1;
            import p000.ct1;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class PlatformViewsController implements PlatformViewsAccessibilityDelegate {
                private static final String TAG = "PlatformViewsController";
                private static Class[] VIEW_TYPES_REQUIRE_NON_TLHC = {SurfaceView.class};
                private static boolean enableImageRenderTarget = true;
                private static boolean enableSurfaceProducerRenderTarget = true;
                private AndroidTouchProcessor androidTouchProcessor;
                private Context context;
                private FlutterView flutterView;
                private PlatformViewsChannel platformViewsChannel;
                private TextInputPlugin textInputPlugin;
                TextureRegistry textureRegistry;
                private FlutterJNI flutterJNI = null;
                private int nextOverlayLayerId = 0;
                private boolean flutterViewConvertedToImageView = false;
                private boolean synchronizeToNativeViewHierarchy = true;
                private boolean usesSoftwareRendering = false;
                private final PlatformViewsChannel.PlatformViewsHandler channelHandler = new C11091();
                private final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();
                final HashMap<Integer, VirtualDisplayController> vdControllers = new HashMap<>();
                private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
                final HashMap<Context, View> contextToEmbeddedView = new HashMap<>();
                private final SparseArray<PlatformOverlayView> overlayLayerViews = new SparseArray<>();
                private final HashSet<Integer> currentFrameUsedOverlayLayerIds = new HashSet<>();
                private final HashSet<Integer> currentFrameUsedPlatformViewIds = new HashSet<>();
                private final SparseArray<PlatformViewWrapper> viewWrappers = new SparseArray<>();
                private final SparseArray<PlatformView> platformViews = new SparseArray<>();
                private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
                private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

                /* JADX INFO: renamed from: io.flutter.plugin.platform.PlatformViewsController$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class C11091 implements PlatformViewsChannel.PlatformViewsHandler {
                    public C11091() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ void lambda$resize$0(VirtualDisplayController virtualDisplayController, float f, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
/* 1 */                 PlatformViewsController.this.unlockInputConnection(virtualDisplayController);
/* 12 */                if (PlatformViewsController.this.context != null) {
/* 1 */                     f = PlatformViewsController.this.getDisplayDensity();
                        }
/* 48 */                platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels(virtualDisplayController.getRenderTargetWidth(), f), PlatformViewsController.this.toLogicalPixels(virtualDisplayController.getRenderTargetHeight(), f)));
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public void clearFocus(int i) {
                        View view;
/* 3 */                 boolean zUsesVirtualDisplay = PlatformViewsController.this.usesVirtualDisplay(i);
/* 7 */                 PlatformViewsController platformViewsController = PlatformViewsController.this;
/* 11 */                if (zUsesVirtualDisplay) {
/* 25 */                    view = platformViewsController.vdControllers.get(Integer.valueOf(i)).getView();
                        } else {
/* 38 */                    PlatformView platformView = (PlatformView) platformViewsController.platformViews.get(i);
/* 40 */                    if (platformView == null) {
/* 56 */                        Log.m4585e(PlatformViewsController.TAG, "Clearing focus on an unknown view with id: " + i);
/* 59 */                        return;
                            }
/* 60 */                    view = platformView.getView();
                        }
/* 64 */                if (view != null) {
/* 84 */                    view.clearFocus();
/* 87 */                    return;
                        }
/* 80 */                Log.m4585e(PlatformViewsController.TAG, "Clearing focus on a null view with id: " + i);
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
/* 1 */                 PlatformViewsController.this.enforceMinimumAndroidApiVersion(19);
/* 1 */                 PlatformViewsController.this.ensureValidRequest(platformViewCreationRequest);
/* 1 */                 PlatformViewsController.this.throwIfHCPPEnabled();
/* 1 */                 PlatformViewsController.this.configureForHybridComposition(PlatformViewsController.this.createPlatformView(platformViewCreationRequest, false), platformViewCreationRequest);
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
/* 1 */                 PlatformViewsController.this.ensureValidRequest(platformViewCreationRequest);
/* 6 */                 int i = platformViewCreationRequest.viewId;
/* 20 */                if (PlatformViewsController.this.viewWrappers.get(i) != null) {
/* 127 */                   f42.m3656l(fm0.m3781g(i, "Trying to create an already created platform view, view id: "));
/* 18 */                    return 0L;
                        }
/* 22 */                PlatformViewsController platformViewsController = PlatformViewsController.this;
/* 26 */                if (platformViewsController.textureRegistry == null) {
/* 117 */                   f42.m3656l(fm0.m3781g(i, "Texture registry is null. This means that platform views controller was detached, view id: "));
/* 18 */                    return 0L;
                        }
/* 32 */                if (platformViewsController.flutterView == null) {
/* 107 */                   f42.m3656l(fm0.m3781g(i, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
/* 18 */                    return 0L;
                        }
/* 37 */                PlatformView platformViewCreatePlatformView = PlatformViewsController.this.createPlatformView(platformViewCreationRequest, true);
/* 41 */                View view = platformViewCreatePlatformView.getView();
/* 49 */                if (view.getParent() != null) {
/* 97 */                    f42.m3656l("The Android view returned from PlatformView#getView() was already added to a parent view.");
/* 18 */                    return 0L;
                        }
/* 59 */                if (ViewUtils.hasChildViewOfType(view, PlatformViewsController.VIEW_TYPES_REQUIRE_NON_TLHC)) {
/* 61 */                    PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode requestedDisplayMode = platformViewCreationRequest.displayMode;
/* 63 */                    PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode requestedDisplayMode2 = PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK;
/* 65 */                    PlatformViewsController platformViewsController2 = PlatformViewsController.this;
/* 67 */                    if (requestedDisplayMode == requestedDisplayMode2) {
/* 1 */                         platformViewsController2.configureForHybridComposition(platformViewCreatePlatformView, platformViewCreationRequest);
/* 72 */                        return -2L;
                            }
/* 79 */                    if (!platformViewsController2.usesSoftwareRendering) {
/* 1 */                         return PlatformViewsController.this.configureForVirtualDisplay(platformViewCreatePlatformView, platformViewCreationRequest);
                            }
                        }
/* 90 */                return PlatformViewsController.this.configureForTextureLayerComposition(platformViewCreatePlatformView, platformViewCreationRequest);
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public void dispose(int i) {
/* 11 */                PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i);
/* 15 */                if (platformView == null) {
/* 31 */                    Log.m4585e(PlatformViewsController.TAG, "Disposing unknown platform view with id: " + i);
/* 34 */                    return;
                        }
/* 39 */                if (platformView.getView() != null) {
/* 41 */                    View view = platformView.getView();
/* 49 */                    ViewGroup viewGroup = (ViewGroup) view.getParent();
/* 51 */                    if (viewGroup != null) {
/* 53 */                        viewGroup.removeView(view);
                            }
                        }
/* 62 */                PlatformViewsController.this.platformViews.remove(i);
                        try {
/* 65 */                    platformView.dispose();
                        } catch (RuntimeException e) {
/* 72 */                    Log.m4586e(PlatformViewsController.TAG, "Disposing platform view threw an exception", e);
                        }
/* 77 */                boolean zUsesVirtualDisplay = PlatformViewsController.this.usesVirtualDisplay(i);
/* 81 */                PlatformViewsController platformViewsController = PlatformViewsController.this;
/* 83 */                if (zUsesVirtualDisplay) {
/* 91 */                    VirtualDisplayController virtualDisplayController = platformViewsController.vdControllers.get(Integer.valueOf(i));
/* 97 */                    View view2 = virtualDisplayController.getView();
/* 101 */                   if (view2 != null) {
/* 111 */                       PlatformViewsController.this.contextToEmbeddedView.remove(view2.getContext());
                            }
/* 114 */                   virtualDisplayController.dispose();
/* 125 */                   PlatformViewsController.this.vdControllers.remove(Integer.valueOf(i));
/* 128 */                   return;
                        }
/* 137 */               PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) platformViewsController.viewWrappers.get(i);
/* 139 */               if (platformViewWrapper != null) {
/* 141 */                   platformViewWrapper.removeAllViews();
/* 144 */                   platformViewWrapper.release();
/* 147 */                   platformViewWrapper.unsetOnDescendantFocusChangeListener();
/* 154 */                   ViewGroup viewGroup2 = (ViewGroup) platformViewWrapper.getParent();
/* 156 */                   if (viewGroup2 != null) {
/* 158 */                       viewGroup2.removeView(platformViewWrapper);
                            }
/* 167 */                   PlatformViewsController.this.viewWrappers.remove(i);
/* 170 */                   return;
                        }
/* 181 */               FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController.this.platformViewParent.get(i);
/* 183 */               if (flutterMutatorView != null) {
/* 185 */                   flutterMutatorView.removeAllViews();
/* 188 */                   flutterMutatorView.unsetOnDescendantFocusChangeListener();
/* 195 */                   ViewGroup viewGroup3 = (ViewGroup) flutterMutatorView.getParent();
/* 197 */                   if (viewGroup3 != null) {
/* 199 */                       viewGroup3.removeView(flutterMutatorView);
                            }
/* 208 */                   PlatformViewsController.this.platformViewParent.remove(i);
                        }
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public void offset(int i, double d, double d2) {
/* 7 */                 if (PlatformViewsController.this.usesVirtualDisplay(i)) {
/* 9 */                     return;
                        }
/* 20 */                PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i);
/* 22 */                if (platformViewWrapper == null) {
/* 40 */                    Log.m4585e(PlatformViewsController.TAG, "Setting offset for unknown platform view with id: " + i);
                        } else {
/* 1 */                     int physicalPixels = PlatformViewsController.this.toPhysicalPixels(d);
/* 1 */                     int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(d2);
/* 60 */                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
/* 62 */                    layoutParams.topMargin = physicalPixels;
/* 64 */                    layoutParams.leftMargin = physicalPixels2;
/* 66 */                    platformViewWrapper.setLayoutParams(layoutParams);
                        }
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public void onTouch(PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
/* 1 */                 int i = platformViewTouch.viewId;
/* 17 */                float f = PlatformViewsController.this.context.getResources().getDisplayMetrics().density;
/* 21 */                boolean zUsesVirtualDisplay = PlatformViewsController.this.usesVirtualDisplay(i);
/* 25 */                PlatformViewsController platformViewsController = PlatformViewsController.this;
/* 27 */                if (zUsesVirtualDisplay) {
/* 48 */                    platformViewsController.vdControllers.get(Integer.valueOf(i)).dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f, platformViewTouch, true));
/* 51 */                    return;
                        }
/* 60 */                PlatformView platformView = (PlatformView) platformViewsController.platformViews.get(i);
/* 64 */                if (platformView == null) {
/* 80 */                    Log.m4585e(PlatformViewsController.TAG, "Sending touch to an unknown view with id: " + i);
/* 83 */                    return;
                        }
/* 84 */                View view = platformView.getView();
/* 88 */                if (view != null) {
/* 115 */                   view.dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f, platformViewTouch, false));
/* 118 */                   return;
                        }
/* 104 */               Log.m4585e(PlatformViewsController.TAG, "Sending touch to a null view with id: " + i);
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public void resize(PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, final PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
/* 1 */                 int physicalPixels = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth);
/* 1 */                 int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight);
/* 17 */                int i = platformViewResizeRequest.viewId;
/* 21 */                boolean zUsesVirtualDisplay = PlatformViewsController.this.usesVirtualDisplay(i);
/* 25 */                PlatformViewsController platformViewsController = PlatformViewsController.this;
/* 27 */                if (zUsesVirtualDisplay) {
/* 1 */                     final float displayDensity = platformViewsController.getDisplayDensity();
/* 41 */                    final VirtualDisplayController virtualDisplayController = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i));
/* 1 */                     PlatformViewsController.this.lockInputConnection(virtualDisplayController);
/* 57 */                    virtualDisplayController.resize(physicalPixels, physicalPixels2, new Runnable() { // from class: io.flutter.plugin.platform.b
                                @Override // java.lang.Runnable
                                public final void run() {
/* 1 */                             this.f9769a.lambda$resize$0(virtualDisplayController, displayDensity, platformViewBufferResized);
                                }
                            });
/* 60 */                    return;
                        }
/* 69 */                PlatformView platformView = (PlatformView) platformViewsController.platformViews.get(i);
/* 81 */                PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i);
/* 83 */                if (platformView == null || platformViewWrapper == null) {
/* 178 */                   Log.m4585e(PlatformViewsController.TAG, "Resizing unknown platform view with id: " + i);
/* 181 */                   return;
                        }
/* 92 */                if (physicalPixels > platformViewWrapper.getRenderTargetWidth() || physicalPixels2 > platformViewWrapper.getRenderTargetHeight()) {
/* 100 */                   platformViewWrapper.resizeRenderTarget(physicalPixels, physicalPixels2);
                        }
/* 103 */               ViewGroup.LayoutParams layoutParams = platformViewWrapper.getLayoutParams();
/* 107 */               layoutParams.width = physicalPixels;
/* 109 */               layoutParams.height = physicalPixels2;
/* 111 */               platformViewWrapper.setLayoutParams(layoutParams);
/* 114 */               View view = platformView.getView();
/* 118 */               if (view != null) {
/* 120 */                   ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
/* 124 */                   layoutParams2.width = physicalPixels;
/* 126 */                   layoutParams2.height = physicalPixels2;
/* 128 */                   view.setLayoutParams(layoutParams2);
                        }
/* 158 */               platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels(platformViewWrapper.getRenderTargetWidth()), PlatformViewsController.this.toLogicalPixels(platformViewWrapper.getRenderTargetHeight())));
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public void setDirection(int i, int i2) {
                        View view;
/* 5 */                 if (!PlatformViewsController.validateDirection(i2)) {
/* 126 */                   throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
                        }
/* 9 */                 boolean zUsesVirtualDisplay = PlatformViewsController.this.usesVirtualDisplay(i);
/* 13 */                PlatformViewsController platformViewsController = PlatformViewsController.this;
/* 17 */                if (zUsesVirtualDisplay) {
/* 31 */                    view = platformViewsController.vdControllers.get(Integer.valueOf(i)).getView();
                        } else {
/* 44 */                    PlatformView platformView = (PlatformView) platformViewsController.platformViews.get(i);
/* 46 */                    if (platformView == null) {
/* 62 */                        Log.m4585e(PlatformViewsController.TAG, "Setting direction to an unknown view with id: " + i);
/* 65 */                        return;
                            }
/* 66 */                    view = platformView.getView();
                        }
/* 70 */                if (view != null) {
/* 90 */                    view.setLayoutDirection(i2);
/* 93 */                    return;
                        }
/* 86 */                Log.m4585e(PlatformViewsController.TAG, "Setting direction to a null view with id: " + i);
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
                    public void synchronizeToNativeViewHierarchy(boolean z) {
/* 1 */                 PlatformViewsController.this.synchronizeToNativeViewHierarchy = z;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void configureForHybridComposition(PlatformView platformView, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
/* 3 */             enforceMinimumAndroidApiVersion(19);
/* 24 */            Log.m4587i(TAG, "Using hybrid composition for platform view: " + platformViewCreationRequest.viewId);
/* 27 */            throwIfHCPPEnabled();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public long configureForVirtualDisplay(PlatformView platformView, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
/* 3 */             enforceMinimumAndroidApiVersion(20);
/* 24 */            Log.m4587i(TAG, "Hosting view in a virtual display for platform view: " + platformViewCreationRequest.viewId);
/* 29 */            PlatformViewRenderTarget platformViewRenderTargetMakePlatformViewRenderTarget = makePlatformViewRenderTarget(this.textureRegistry);
/* 59 */            VirtualDisplayController virtualDisplayControllerCreate = VirtualDisplayController.create(this.context, this.accessibilityEventsDelegate, platformView, platformViewRenderTargetMakePlatformViewRenderTarget, toPhysicalPixels(platformViewCreationRequest.logicalWidth), toPhysicalPixels(platformViewCreationRequest.logicalHeight), platformViewCreationRequest.viewId, null, new ct1(this, platformViewCreationRequest, 1));
/* 63 */            if (virtualDisplayControllerCreate != null) {
/* 73 */                this.vdControllers.put(Integer.valueOf(platformViewCreationRequest.viewId), virtualDisplayControllerCreate);
/* 76 */                View view = platformView.getView();
/* 86 */                this.contextToEmbeddedView.put(view.getContext(), view);
/* 89 */                return platformViewRenderTargetMakePlatformViewRenderTarget.getId();
                    }
/* 125 */           throw new IllegalStateException("Failed creating virtual display for a " + platformViewCreationRequest.viewType + " with id: " + platformViewCreationRequest.viewId);
                }

                private void diposeAllViews() {
/* 7 */             while (this.platformViews.size() > 0) {
/* 18 */                this.channelHandler.dispose(this.platformViews.keyAt(0));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void enforceMinimumAndroidApiVersion(int i) {
/* 1 */             int i2 = Build.VERSION.SDK_INT;
/* 3 */             if (i2 >= i) {
/* 5 */                 return;
                    }
/* 14 */            f42.m3656l(AbstractC0886en.m3506j("Trying to use platform views with API ", i2, i, ", required API level is: "));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void ensureValidRequest(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
/* 7 */             if (validateDirection(platformViewCreationRequest.direction)) {
/* 9 */                 return;
                    }
/* 14 */            StringBuilder sb = new StringBuilder("Trying to create a view with unknown direction value: ");
/* 19 */            sb.append(platformViewCreationRequest.direction);
/* 24 */            sb.append("(view id: ");
/* 35 */            f42.m3656l(fm0.m3786l(sb, platformViewCreationRequest.viewId, ")"));
                }

                private void finishFrame(boolean z) {
/* 11 */            for (int i = 0; i < this.overlayLayerViews.size(); i++) {
/* 15 */                int iKeyAt = this.overlayLayerViews.keyAt(i);
/* 21 */                PlatformOverlayView platformOverlayViewValueAt = this.overlayLayerViews.valueAt(i);
/* 37 */                if (this.currentFrameUsedOverlayLayerIds.contains(Integer.valueOf(iKeyAt))) {
/* 41 */                    this.flutterView.attachOverlaySurfaceToRender(platformOverlayViewValueAt);
/* 48 */                    z &= platformOverlayViewValueAt.acquireLatestImage();
                        } else {
/* 52 */                    if (!this.flutterViewConvertedToImageView) {
/* 54 */                        platformOverlayViewValueAt.detachFromRenderer();
                            }
/* 57 */                    platformOverlayViewValueAt.setVisibility(8);
/* 62 */                    this.flutterView.removeView(platformOverlayViewValueAt);
                        }
                    }
/* 75 */            for (int i2 = 0; i2 < this.platformViewParent.size(); i2++) {
/* 79 */                int iKeyAt2 = this.platformViewParent.keyAt(i2);
/* 85 */                FlutterMutatorView flutterMutatorView = this.platformViewParent.get(iKeyAt2);
/* 101 */               if (!this.currentFrameUsedPlatformViewIds.contains(Integer.valueOf(iKeyAt2)) || (!z && this.synchronizeToNativeViewHierarchy)) {
/* 113 */                   flutterMutatorView.setVisibility(8);
                        } else {
/* 109 */                   flutterMutatorView.setVisibility(0);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public float getDisplayDensity() {
/* 11 */            return this.context.getResources().getDisplayMetrics().density;
                }

                private void initializeRootImageViewIfNeeded() {
/* 3 */             if (!this.synchronizeToNativeViewHierarchy || this.flutterViewConvertedToImageView) {
/* 17 */                return;
                    }
/* 11 */            this.flutterView.convertToImageView();
/* 15 */            this.flutterViewConvertedToImageView = true;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$configureForTextureLayerComposition$1(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z) {
/* 1 */             if (z) {
/* 7 */                 this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
/* 10 */                return;
                    }
/* 11 */            TextInputPlugin textInputPlugin = this.textInputPlugin;
/* 13 */            if (textInputPlugin != null) {
/* 17 */                textInputPlugin.clearPlatformViewClient(platformViewCreationRequest.viewId);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$configureForVirtualDisplay$0(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z) {
/* 1 */             if (z) {
/* 7 */                 this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$initializePlatformViewIfNeeded$2(int i, View view, boolean z) {
/* 1 */             if (z) {
/* 5 */                 this.platformViewsChannel.invokeViewFocused(i);
/* 8 */                 return;
                    }
/* 9 */             TextInputPlugin textInputPlugin = this.textInputPlugin;
/* 11 */            if (textInputPlugin != null) {
/* 13 */                textInputPlugin.clearPlatformViewClient(i);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onEndFrame$3() {
/* 2 */             finishFrame(false);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void lockInputConnection(VirtualDisplayController virtualDisplayController) {
/* 1 */             TextInputPlugin textInputPlugin = this.textInputPlugin;
/* 3 */             if (textInputPlugin == null) {
/* 5 */                 return;
                    }
/* 6 */             textInputPlugin.lockPlatformViewInputConnection();
/* 9 */             virtualDisplayController.onInputConnectionLocked();
                }

                private static PlatformViewRenderTarget makePlatformViewRenderTarget(TextureRegistry textureRegistry) {
                    int i;
/* 7 */             if (enableSurfaceProducerRenderTarget && (i = Build.VERSION.SDK_INT) >= 29) {
/* 22 */                TextureRegistry.SurfaceProducer surfaceProducerCreateSurfaceProducer = textureRegistry.createSurfaceProducer(i <= 34 ? TextureRegistry.SurfaceLifecycle.resetInBackground : TextureRegistry.SurfaceLifecycle.manual);
/* 28 */                Log.m4587i(TAG, "PlatformView is using SurfaceProducer backend");
/* 33 */                return new SurfaceProducerPlatformViewRenderTarget(surfaceProducerCreateSurfaceProducer);
                    }
/* 39 */            if (!enableImageRenderTarget || Build.VERSION.SDK_INT < 29) {
/* 60 */                TextureRegistry.SurfaceTextureEntry surfaceTextureEntryCreateSurfaceTexture = textureRegistry.createSurfaceTexture();
/* 66 */                Log.m4587i(TAG, "PlatformView is using SurfaceTexture backend");
/* 71 */                return new SurfaceTexturePlatformViewRenderTarget(surfaceTextureEntryCreateSurfaceTexture);
                    }
/* 45 */            TextureRegistry.ImageTextureEntry imageTextureEntryCreateImageTexture = textureRegistry.createImageTexture();
/* 51 */            Log.m4587i(TAG, "PlatformView is using ImageReader backend");
/* 56 */            return new ImageReaderPlatformViewRenderTarget(imageTextureEntryCreateImageTexture);
                }

                private void maybeInvokeOnFlutterViewAttached(PlatformView platformView) {
/* 1 */             FlutterView flutterView = this.flutterView;
/* 3 */             if (flutterView == null) {
/* 9 */                 Log.m4587i(TAG, "null flutterView");
                    } else {
/* 13 */                platformView.onFlutterViewAttached(flutterView);
                    }
                }

                private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f) {
/* 1 */             List list = (List) obj;
/* 5 */             MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
/* 20 */            pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
/* 34 */            pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
/* 48 */            pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
                    double d = f;
/* 64 */            pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d);
/* 79 */            pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d);
/* 94 */            pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d);
/* 109 */           pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d);
/* 124 */           pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d);
/* 140 */           pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d);
/* 142 */           return pointerCoords;
                }

                private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f) {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = ((List) obj).iterator();
/* 16 */            while (it.hasNext()) {
/* 26 */                arrayList.add(parsePointerCoords(it.next(), f));
                    }
/* 30 */            return arrayList;
                }

                private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
/* 1 */             List list = (List) obj;
/* 5 */             MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
/* 19 */            pointerProperties.id = ((Integer) list.get(0)).intValue();
/* 32 */            pointerProperties.toolType = ((Integer) list.get(1)).intValue();
/* 34 */            return pointerProperties;
                }

                private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = ((List) obj).iterator();
/* 16 */            while (it.hasNext()) {
/* 26 */                arrayList.add(parsePointerProperties(it.next()));
                    }
/* 30 */            return arrayList;
                }

                private void removeOverlaySurfaces() {
/* 3 */             if (this.flutterView == null) {
/* 9 */                 Log.m4585e(TAG, "removeOverlaySurfaces called while flutter view is null");
/* 12 */                return;
                    }
/* 20 */            for (int i = 0; i < this.overlayLayerViews.size(); i++) {
/* 32 */                this.flutterView.removeView(this.overlayLayerViews.valueAt(i));
                    }
/* 40 */            this.overlayLayerViews.clear();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void throwIfHCPPEnabled() {
/* 7 */             if (this.flutterJNI.IsSurfaceControlEnabled()) {
/* 12 */                f42.m3656l("Trying to create a Hybrid Composition view with HC++ enabled.");
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public int toLogicalPixels(double d) {
/* 5 */             return toLogicalPixels(d, getDisplayDensity());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public int toPhysicalPixels(double d) {
/* 11 */            return (int) Math.round(d * ((double) getDisplayDensity()));
                }

                private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
/* 3 */             if (pointerCoordsArr.length < 1) {
/* 5 */                 return;
                    }
/* 25 */            motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
/* 1 */             TextInputPlugin textInputPlugin = this.textInputPlugin;
/* 3 */             if (textInputPlugin == null) {
/* 5 */                 return;
                    }
/* 6 */             textInputPlugin.unlockPlatformViewInputConnection();
/* 9 */             virtualDisplayController.onInputConnectionUnlocked();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static boolean validateDirection(int i) {
                    return i == 0 || i == 1;
                }

                public void attach(Context context, TextureRegistry textureRegistry, DartExecutor dartExecutor) {
/* 3 */             if (this.context != null) {
/* 24 */                C1951n4.m6856g("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
/* 27 */                return;
                    }
/* 5 */             this.context = context;
/* 7 */             this.textureRegistry = textureRegistry;
/* 11 */            PlatformViewsChannel platformViewsChannel = new PlatformViewsChannel(dartExecutor);
/* 14 */            this.platformViewsChannel = platformViewsChannel;
/* 18 */            platformViewsChannel.setPlatformViewsHandler(this.channelHandler);
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
/* 3 */             this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
                }

                public void attachTextInputPlugin(TextInputPlugin textInputPlugin) {
/* 1 */             this.textInputPlugin = textInputPlugin;
                }

                public void attachToFlutterRenderer(FlutterRenderer flutterRenderer) {
/* 7 */             this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
                }

                public void attachToView(FlutterView flutterView) {
/* 1 */             this.flutterView = flutterView;
/* 11 */            for (int i = 0; i < this.viewWrappers.size(); i++) {
/* 23 */                this.flutterView.addView(this.viewWrappers.valueAt(i));
                    }
/* 36 */            for (int i2 = 0; i2 < this.platformViewParent.size(); i2++) {
/* 48 */                this.flutterView.addView(this.platformViewParent.valueAt(i2));
                    }
/* 60 */            for (int i3 = 0; i3 < this.platformViews.size(); i3++) {
/* 72 */                this.platformViews.valueAt(i3).onFlutterViewAttached(this.flutterView);
                    }
                }

                public boolean checkInputConnectionProxy(View view) {
/* 2 */             if (view == null || !this.contextToEmbeddedView.containsKey(view.getContext())) {
/* 1 */                 return false;
                    }
/* 24 */            View view2 = this.contextToEmbeddedView.get(view.getContext());
/* 30 */            if (view2 == view) {
/* 32 */                return true;
                    }
/* 34 */            return view2.checkInputConnectionProxy(view);
                }

                public long configureForTextureLayerComposition(PlatformView platformView, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
                    PlatformViewWrapper platformViewWrapper;
                    long j;
/* 3 */             enforceMinimumAndroidApiVersion(23);
/* 24 */            Log.m4587i(TAG, "Hosting view in view hierarchy for platform view: " + platformViewCreationRequest.viewId);
/* 29 */            int physicalPixels = toPhysicalPixels(platformViewCreationRequest.logicalWidth);
/* 35 */            int physicalPixels2 = toPhysicalPixels(platformViewCreationRequest.logicalHeight);
/* 41 */            if (this.usesSoftwareRendering) {
/* 47 */                platformViewWrapper = new PlatformViewWrapper(this.context);
/* 50 */                j = -1;
                    } else {
/* 55 */                PlatformViewRenderTarget platformViewRenderTargetMakePlatformViewRenderTarget = makePlatformViewRenderTarget(this.textureRegistry);
/* 63 */                PlatformViewWrapper platformViewWrapper2 = new PlatformViewWrapper(this.context, platformViewRenderTargetMakePlatformViewRenderTarget);
/* 66 */                long id = platformViewRenderTargetMakePlatformViewRenderTarget.getId();
/* 70 */                platformViewWrapper = platformViewWrapper2;
/* 71 */                j = id;
                    }
/* 74 */            platformViewWrapper.setTouchProcessor(this.androidTouchProcessor);
/* 77 */            platformViewWrapper.resizeRenderTarget(physicalPixels, physicalPixels2);
/* 82 */            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(physicalPixels, physicalPixels2);
/* 87 */            int physicalPixels3 = toPhysicalPixels(platformViewCreationRequest.logicalTop);
/* 93 */            int physicalPixels4 = toPhysicalPixels(platformViewCreationRequest.logicalLeft);
/* 97 */            layoutParams.topMargin = physicalPixels3;
/* 99 */            layoutParams.leftMargin = physicalPixels4;
/* 101 */           platformViewWrapper.setLayoutParams(layoutParams);
/* 104 */           View view = platformView.getView();
/* 113 */           view.setLayoutParams(new FrameLayout.LayoutParams(physicalPixels, physicalPixels2));
/* 117 */           view.setImportantForAccessibility(4);
/* 120 */           platformViewWrapper.addView(view);
/* 129 */           platformViewWrapper.setOnDescendantFocusChangeListener(new ct1(this, platformViewCreationRequest, 0));
/* 134 */           this.flutterView.addView(platformViewWrapper);
/* 141 */           this.viewWrappers.append(platformViewCreationRequest.viewId, platformViewWrapper);
/* 144 */           maybeInvokeOnFlutterViewAttached(platformView);
/* 147 */           return j;
                }

                public FlutterOverlaySurface createOverlaySurface() {
/* 26 */            return createOverlaySurface(new PlatformOverlayView(this.flutterView.getContext(), this.flutterView.getWidth(), this.flutterView.getHeight(), this.accessibilityEventsDelegate));
                }

                public PlatformView createPlatformView(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, boolean z) {
/* 5 */             PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
/* 10 */            if (factory == null) {
/* 78 */                ds0.m3206w(platformViewCreationRequest.viewType, "Trying to create a platform view of unregistered type: ");
/* 9 */                 return null;
                    }
/* 42 */            PlatformView platformViewCreate = factory.create(z ? new MutableContextWrapper(this.context) : this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
/* 46 */            View view = platformViewCreate.getView();
/* 50 */            if (view == null) {
/* 70 */                f42.m3656l("PlatformView#getView() returned null, but an Android view reference was expected.");
/* 9 */                 return null;
                    }
/* 54 */            view.setLayoutDirection(platformViewCreationRequest.direction);
/* 61 */            this.platformViews.put(platformViewCreationRequest.viewId, platformViewCreate);
/* 64 */            maybeInvokeOnFlutterViewAttached(platformViewCreate);
/* 67 */            return platformViewCreate;
                }

                public void destroyOverlaySurfaces() {
/* 8 */             for (int i = 0; i < this.overlayLayerViews.size(); i++) {
/* 12 */                PlatformOverlayView platformOverlayViewValueAt = this.overlayLayerViews.valueAt(i);
/* 18 */                platformOverlayViewValueAt.detachFromRenderer();
/* 21 */                platformOverlayViewValueAt.closeImageReader();
                    }
                }

                public void detach() {
/* 1 */             PlatformViewsChannel platformViewsChannel = this.platformViewsChannel;
/* 4 */             if (platformViewsChannel != null) {
/* 6 */                 platformViewsChannel.setPlatformViewsHandler(null);
                    }
/* 9 */             destroyOverlaySurfaces();
/* 12 */            this.platformViewsChannel = null;
/* 14 */            this.context = null;
/* 16 */            this.textureRegistry = null;
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public void detachAccessibilityBridge() {
/* 4 */             this.accessibilityEventsDelegate.setAccessibilityBridge(null);
                }

                public void detachFromView() {
/* 9 */             for (int i = 0; i < this.viewWrappers.size(); i++) {
/* 21 */                this.flutterView.removeView(this.viewWrappers.valueAt(i));
                    }
/* 34 */            for (int i2 = 0; i2 < this.platformViewParent.size(); i2++) {
/* 46 */                this.flutterView.removeView(this.platformViewParent.valueAt(i2));
                    }
/* 52 */            destroyOverlaySurfaces();
/* 55 */            removeOverlaySurfaces();
/* 59 */            this.flutterView = null;
/* 61 */            this.flutterViewConvertedToImageView = false;
/* 69 */            for (int i3 = 0; i3 < this.platformViews.size(); i3++) {
/* 79 */                this.platformViews.valueAt(i3).onFlutterViewDetached();
                    }
                }

                public void detachTextInputPlugin() {
/* 2 */             this.textInputPlugin = null;
                }

                public void disposePlatformView(int i) {
/* 3 */             this.channelHandler.dispose(i);
                }

                public SparseArray<PlatformOverlayView> getOverlayLayerViews() {
/* 1 */             return this.overlayLayerViews;
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public View getPlatformViewById(int i) {
/* 5 */             if (usesVirtualDisplay(i)) {
/* 19 */                return this.vdControllers.get(Integer.valueOf(i)).getView();
                    }
/* 26 */            PlatformView platformView = this.platformViews.get(i);
/* 32 */            if (platformView == null) {
/* 34 */                return null;
                    }
/* 36 */            return platformView.getView();
                }

                public PlatformViewRegistry getRegistry() {
/* 1 */             return this.registry;
                }

                public boolean initializePlatformViewIfNeeded(int i) {
/* 3 */             PlatformView platformView = this.platformViews.get(i);
/* 9 */             int i2 = 0;
/* 10 */            if (platformView == null) {
/* 9 */                 return false;
                    }
/* 20 */            if (this.platformViewParent.get(i) != null) {
/* 19 */                return true;
                    }
/* 23 */            View view = platformView.getView();
/* 27 */            if (view == null) {
/* 88 */                f42.m3656l("PlatformView#getView() returned null, but an Android view reference was expected.");
/* 9 */                 return false;
                    }
/* 33 */            if (view.getParent() != null) {
/* 82 */                f42.m3656l("The Android view returned from PlatformView#getView() was already added to a parent view.");
/* 9 */                 return false;
                    }
/* 37 */            Context context = this.context;
/* 51 */            FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
/* 59 */            flutterMutatorView.setOnDescendantFocusChangeListener(new bt1(this, i, i2));
/* 64 */            this.platformViewParent.put(i, flutterMutatorView);
/* 68 */            view.setImportantForAccessibility(4);
/* 71 */            flutterMutatorView.addView(view);
/* 76 */            this.flutterView.addView(flutterMutatorView);
/* 19 */            return true;
                }

                public void onBeginFrame() {
/* 3 */             this.currentFrameUsedOverlayLayerIds.clear();
/* 8 */             this.currentFrameUsedPlatformViewIds.clear();
                }

                public void onDetachedFromJNI() {
/* 1 */             diposeAllViews();
                }

                public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
/* 7 */             if (this.overlayLayerViews.get(i) == null) {
/* 68 */                f42.m3656l(AbstractC0886en.m3505i(i, "The overlay surface (id:", ") doesn't exist"));
/* 71 */                return;
                    }
/* 9 */             initializeRootImageViewIfNeeded();
/* 14 */            PlatformOverlayView platformOverlayView = this.overlayLayerViews.get(i);
/* 24 */            if (platformOverlayView.getParent() == null) {
/* 28 */                this.flutterView.addView(platformOverlayView);
                    }
/* 33 */            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
/* 36 */            layoutParams.leftMargin = i2;
/* 38 */            layoutParams.topMargin = i3;
/* 40 */            platformOverlayView.setLayoutParams(layoutParams);
/* 44 */            platformOverlayView.setVisibility(0);
/* 47 */            platformOverlayView.bringToFront();
/* 56 */            this.currentFrameUsedOverlayLayerIds.add(Integer.valueOf(i));
                }

                public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
/* 1 */             initializeRootImageViewIfNeeded();
/* 8 */             if (initializePlatformViewIfNeeded(i)) {
/* 13 */                FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i);
/* 25 */                flutterMutatorView.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
/* 29 */                flutterMutatorView.setVisibility(0);
/* 32 */                flutterMutatorView.bringToFront();
/* 37 */                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
/* 48 */                View view = this.platformViews.get(i).getView();
/* 52 */                if (view != null) {
/* 54 */                    view.setLayoutParams(layoutParams);
/* 57 */                    view.bringToFront();
                        }
/* 66 */                this.currentFrameUsedPlatformViewIds.add(Integer.valueOf(i));
                    }
                }

                public void onEndFrame() {
/* 3 */             boolean z = false;
/* 4 */             if (this.flutterViewConvertedToImageView && this.currentFrameUsedPlatformViewIds.isEmpty()) {
/* 14 */                this.flutterViewConvertedToImageView = false;
/* 25 */                this.flutterView.revertImageView(new RunnableC2166s2(this, 26));
                    } else {
/* 31 */                if (this.flutterViewConvertedToImageView && this.flutterView.acquireLatestImageViewFrame()) {
/* 41 */                    z = true;
                        }
/* 42 */                finishFrame(z);
                    }
                }

                public void onPreEngineRestart() {
/* 1 */             diposeAllViews();
                }

                public void onResume() {
/* 7 */             Iterator<VirtualDisplayController> it = this.vdControllers.values().iterator();
/* 15 */            while (it.hasNext()) {
/* 23 */                it.next().resetSurface();
                    }
                }

                public void onTrimMemory(int i) {
/* 3 */             if (i < 40) {
/* 32 */                return;
                    }
/* 12 */            Iterator<VirtualDisplayController> it = this.vdControllers.values().iterator();
/* 20 */            while (it.hasNext()) {
/* 28 */                it.next().clearSurface();
                    }
                }

                public void setFlutterJNI(FlutterJNI flutterJNI) {
/* 1 */             this.flutterJNI = flutterJNI;
                }

                public void setSoftwareRendering(boolean z) {
/* 1 */             this.usesSoftwareRendering = z;
                }

                public MotionEvent toMotionEvent(float f, PlatformViewsChannel.PlatformViewTouch platformViewTouch, boolean z) {
/* 13 */            MotionEvent motionEventPop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
/* 34 */            MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f).toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
/* 36 */            if (z || motionEventPop == null) {
/* 99 */                return MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
                    }
/* 40 */            translateMotionEvent(motionEventPop, pointerCoordsArr);
/* 43 */            return motionEventPop;
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public boolean usesVirtualDisplay(int i) {
/* 7 */             return this.vdControllers.containsKey(Integer.valueOf(i));
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 9 */         public int toLogicalPixels(double d, float f) {
/* 10 */            return (int) Math.round(d / ((double) f));
                }

/* 30 */        public FlutterOverlaySurface createOverlaySurface(PlatformOverlayView platformOverlayView) {
/* 31 */            int i = this.nextOverlayLayerId;
                    this.nextOverlayLayerId = i + 1;
/* 32 */            this.overlayLayerViews.put(i, platformOverlayView);
/* 33 */            return new FlutterOverlaySurface(i, platformOverlayView.getSurface());
                }
            }
