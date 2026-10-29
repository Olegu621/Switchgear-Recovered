            package io.flutter.plugin.platform;

            import android.content.Context;
            import android.util.SparseArray;
            import android.view.MotionEvent;
            import android.view.Surface;
            import android.view.SurfaceControl;
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
            import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2;
            import io.flutter.plugin.editing.TextInputPlugin;
            import io.flutter.view.AccessibilityBridge;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            import p000.bt1;
            import p000.ds0;
            import p000.f42;
            import p000.rw0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class PlatformViewsController2 implements PlatformViewsAccessibilityDelegate {
                private static final String TAG = "PlatformViewsController2";
                private AndroidTouchProcessor androidTouchProcessor;
                private Context context;
                private FlutterView flutterView;
                private PlatformViewsChannel2 platformViewsChannel;
                private PlatformViewRegistryImpl registry;
                private TextInputPlugin textInputPlugin;
                private FlutterJNI flutterJNI = null;
                private Surface overlayerSurface = null;
                private SurfaceControl overlaySurfaceControl = null;
                private final PlatformViewsChannel2.PlatformViewsHandler channelHandler = new PlatformViewsChannel2.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.PlatformViewsController2.1
                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
                    public void clearFocus(int i) {
/* 11 */                PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i);
/* 15 */                if (platformView == null) {
/* 31 */                    Log.m4585e(PlatformViewsController2.TAG, "Clearing focus on an unknown view with id: " + i);
/* 34 */                    return;
                        }
/* 35 */                View view = platformView.getView();
/* 39 */                if (view != null) {
/* 59 */                    view.clearFocus();
/* 62 */                    return;
                        }
/* 55 */                Log.m4585e(PlatformViewsController2.TAG, "Clearing focus on a null view with id: " + i);
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
                    public void createPlatformView(PlatformViewsChannel2.PlatformViewCreationRequest platformViewCreationRequest) {
/* 3 */                 PlatformViewsController2.this.createFlutterPlatformView(platformViewCreationRequest);
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
                    public void dispose(int i) {
/* 11 */                PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i);
/* 15 */                if (platformView == null) {
/* 31 */                    Log.m4585e(PlatformViewsController2.TAG, "Disposing unknown platform view with id: " + i);
/* 34 */                    return;
                        }
/* 39 */                if (platformView.getView() != null) {
/* 41 */                    View view = platformView.getView();
/* 49 */                    ViewGroup viewGroup = (ViewGroup) view.getParent();
/* 51 */                    if (viewGroup != null) {
/* 53 */                        viewGroup.removeView(view);
                            }
                        }
/* 62 */                PlatformViewsController2.this.platformViews.remove(i);
                        try {
/* 65 */                    platformView.dispose();
                        } catch (RuntimeException e) {
/* 72 */                    Log.m4586e(PlatformViewsController2.TAG, "Disposing platform view threw an exception", e);
                        }
/* 85 */                FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController2.this.platformViewParent.get(i);
/* 87 */                if (flutterMutatorView != null) {
/* 89 */                    flutterMutatorView.removeAllViews();
/* 92 */                    flutterMutatorView.unsetOnDescendantFocusChangeListener();
/* 99 */                    ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
/* 101 */                   if (viewGroup2 != null) {
/* 103 */                       viewGroup2.removeView(flutterMutatorView);
                            }
/* 112 */                   PlatformViewsController2.this.platformViewParent.remove(i);
                        }
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
                    public boolean isSurfaceControlEnabled() {
/* 7 */                 if (PlatformViewsController2.this.flutterJNI == null) {
/* 9 */                     return false;
                        }
/* 17 */                return PlatformViewsController2.this.flutterJNI.IsSurfaceControlEnabled();
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
                    public void onTouch(PlatformViewsChannel2.PlatformViewTouch platformViewTouch) {
/* 1 */                 int i = platformViewTouch.viewId;
/* 17 */                float f = PlatformViewsController2.this.context.getResources().getDisplayMetrics().density;
/* 29 */                PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i);
/* 33 */                if (platformView == null) {
/* 49 */                    Log.m4585e(PlatformViewsController2.TAG, "Sending touch to an unknown view with id: " + i);
/* 52 */                    return;
                        }
/* 53 */                View view = platformView.getView();
/* 57 */                if (view != null) {
/* 83 */                    view.dispatchTouchEvent(PlatformViewsController2.this.toMotionEvent(f, platformViewTouch));
/* 86 */                    return;
                        }
/* 73 */                Log.m4585e(PlatformViewsController2.TAG, "Sending touch to a null view with id: " + i);
                    }

                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
                    public void setDirection(int i, int i2) {
/* 11 */                PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i);
/* 15 */                if (platformView == null) {
/* 31 */                    Log.m4585e(PlatformViewsController2.TAG, "Setting direction to an unknown view with id: " + i);
/* 34 */                    return;
                        }
/* 35 */                View view = platformView.getView();
/* 39 */                if (view != null) {
/* 59 */                    view.setLayoutDirection(i2);
/* 62 */                    return;
                        }
/* 55 */                Log.m4585e(PlatformViewsController2.TAG, "Setting direction to a null view with id: " + i);
                    }
                };
                private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
                private final SparseArray<PlatformView> platformViews = new SparseArray<>();
                private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
                private final ArrayList<SurfaceControl.Transaction> pendingTransactions = new ArrayList<>();
                private final ArrayList<SurfaceControl.Transaction> activeTransactions = new ArrayList<>();
                private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

                private void diposeAllViews() {
/* 7 */             while (this.platformViews.size() > 0) {
/* 18 */                this.channelHandler.dispose(this.platformViews.keyAt(0));
                    }
                }

                private float getDisplayDensity() {
/* 11 */            return this.context.getResources().getDisplayMetrics().density;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$initializePlatformViewIfNeeded$0(int i, View view, boolean z) {
/* 1 */             if (z) {
/* 5 */                 this.platformViewsChannel.invokeViewFocused(i);
/* 8 */                 return;
                    }
/* 9 */             TextInputPlugin textInputPlugin = this.textInputPlugin;
/* 11 */            if (textInputPlugin != null) {
/* 13 */                textInputPlugin.clearPlatformViewClient(i);
                    }
                }

                private void lockInputConnection(VirtualDisplayController virtualDisplayController) {
/* 1 */             TextInputPlugin textInputPlugin = this.textInputPlugin;
/* 3 */             if (textInputPlugin == null) {
/* 5 */                 return;
                    }
/* 6 */             textInputPlugin.lockPlatformViewInputConnection();
/* 9 */             virtualDisplayController.onInputConnectionLocked();
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

                private int toLogicalPixels(double d) {
/* 5 */             return toLogicalPixels(d, getDisplayDensity());
                }

                private int toPhysicalPixels(double d) {
/* 11 */            return (int) Math.round(d * ((double) getDisplayDensity()));
                }

                private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
/* 3 */             if (pointerCoordsArr.length < 1) {
/* 5 */                 return;
                    }
/* 25 */            motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
                }

                private void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
/* 1 */             TextInputPlugin textInputPlugin = this.textInputPlugin;
/* 3 */             if (textInputPlugin == null) {
/* 5 */                 return;
                    }
/* 6 */             textInputPlugin.unlockPlatformViewInputConnection();
/* 9 */             virtualDisplayController.onInputConnectionUnlocked();
                }

                private static boolean validateDirection(int i) {
                    return i == 0 || i == 1;
                }

                public void applyTransactions() {
/* 1 */             SurfaceControl.Transaction transactionM8274f = rw0.m8274f();
/* 12 */            for (int i = 0; i < this.pendingTransactions.size(); i++) {
/* 1 */                 transactionM8274f = transactionM8274f.merge(rw0.m8276h(this.pendingTransactions.get(i)));
                    }
/* 1 */             transactionM8274f.apply();
/* 36 */            this.pendingTransactions.clear();
                }

                public void attach(Context context, DartExecutor dartExecutor) {
/* 3 */             if (this.context != null) {
/* 22 */                C1951n4.m6856g("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
/* 25 */                return;
                    }
/* 5 */             this.context = context;
/* 9 */             PlatformViewsChannel2 platformViewsChannel2 = new PlatformViewsChannel2(dartExecutor);
/* 12 */            this.platformViewsChannel = platformViewsChannel2;
/* 16 */            platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
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
/* 11 */            for (int i = 0; i < this.platformViewParent.size(); i++) {
/* 23 */                this.flutterView.addView(this.platformViewParent.valueAt(i));
                    }
/* 35 */            for (int i2 = 0; i2 < this.platformViews.size(); i2++) {
/* 47 */                this.platformViews.valueAt(i2).onFlutterViewAttached(this.flutterView);
                    }
                }

                public PlatformView createFlutterPlatformView(PlatformViewsChannel2.PlatformViewCreationRequest platformViewCreationRequest) {
/* 5 */             PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
/* 10 */            if (factory == null) {
/* 68 */                ds0.m3206w(platformViewCreationRequest.viewType, "Trying to create a platform view of unregistered type: ");
/* 9 */                 return null;
                    }
/* 32 */            PlatformView platformViewCreate = factory.create(this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
/* 36 */            View view = platformViewCreate.getView();
/* 40 */            if (view == null) {
/* 60 */                f42.m3656l("PlatformView#getView() returned null, but an Android view reference was expected.");
/* 9 */                 return null;
                    }
/* 44 */            view.setLayoutDirection(platformViewCreationRequest.direction);
/* 51 */            this.platformViews.put(platformViewCreationRequest.viewId, platformViewCreate);
/* 54 */            maybeInvokeOnFlutterViewAttached(platformViewCreate);
/* 57 */            return platformViewCreate;
                }

                public FlutterOverlaySurface createOverlaySurface() {
/* 3 */             if (this.overlayerSurface == null) {
/* 5 */                 SurfaceControl.Builder builderM8273e = rw0.m8273e();
/* 1 */                 builderM8273e.setBufferSize(this.flutterView.getWidth(), this.flutterView.getHeight());
/* 2 */                 builderM8273e.setFormat(1);
/* 3 */                 builderM8273e.setName("Flutter Overlay Surface");
/* 2 */                 builderM8273e.setOpaque(false);
/* 2 */                 builderM8273e.setHidden(false);
/* 1 */                 SurfaceControl surfaceControlBuild = builderM8273e.build();
/* 1 */                 SurfaceControl.Transaction transactionBuildReparentTransaction = this.flutterView.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
/* 3 */                 transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
/* 1 */                 transactionBuildReparentTransaction.apply();
/* 60 */                this.overlayerSurface = rw0.m8272d(surfaceControlBuild);
/* 62 */                this.overlaySurfaceControl = surfaceControlBuild;
                    }
/* 69 */            return new FlutterOverlaySurface(0, this.overlayerSurface);
                }

                public SurfaceControl.Transaction createTransaction() {
/* 1 */             SurfaceControl.Transaction transactionM8274f = rw0.m8274f();
/* 7 */             this.pendingTransactions.add(transactionM8274f);
/* 10 */            return transactionM8274f;
                }

                public void destroyOverlaySurface() {
/* 1 */             Surface surface = this.overlayerSurface;
/* 3 */             if (surface != null) {
/* 5 */                 surface.release();
/* 9 */                 this.overlayerSurface = null;
/* 11 */                this.overlaySurfaceControl = null;
                    }
                }

                public void detach() {
/* 1 */             PlatformViewsChannel2 platformViewsChannel2 = this.platformViewsChannel;
/* 4 */             if (platformViewsChannel2 != null) {
/* 6 */                 platformViewsChannel2.setPlatformViewsHandler(null);
                    }
/* 9 */             destroyOverlaySurface();
/* 12 */            this.platformViewsChannel = null;
/* 14 */            this.context = null;
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public void detachAccessibilityBridge() {
/* 4 */             this.accessibilityEventsDelegate.setAccessibilityBridge(null);
                }

                public void detachFromView() {
/* 9 */             for (int i = 0; i < this.platformViewParent.size(); i++) {
/* 21 */                this.flutterView.removeView(this.platformViewParent.valueAt(i));
                    }
/* 27 */            destroyOverlaySurface();
/* 31 */            this.flutterView = null;
/* 39 */            for (int i2 = 0; i2 < this.platformViews.size(); i2++) {
/* 49 */                this.platformViews.valueAt(i2).onFlutterViewDetached();
                    }
                }

                public void detachTextInputPlugin() {
/* 2 */             this.textInputPlugin = null;
                }

                public void disposePlatformView(int i) {
/* 3 */             this.channelHandler.dispose(i);
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public View getPlatformViewById(int i) {
/* 3 */             PlatformView platformView = this.platformViews.get(i);
/* 9 */             if (platformView == null) {
/* 11 */                return null;
                    }
/* 13 */            return platformView.getView();
                }

                public PlatformViewRegistry getRegistry() {
/* 1 */             return this.registry;
                }

                public void hideOverlaySurface() {
/* 3 */             if (this.overlaySurfaceControl == null) {
/* 5 */                 return;
                    }
/* 6 */             SurfaceControl.Transaction transactionM8274f = rw0.m8274f();
/* 2 */             transactionM8274f.setVisibility(this.overlaySurfaceControl, false);
/* 1 */             transactionM8274f.apply();
                }

                public boolean initializePlatformViewIfNeeded(int i) {
/* 3 */             PlatformView platformView = this.platformViews.get(i);
/* 10 */            if (platformView == null) {
/* 9 */                 return false;
                    }
/* 19 */            int i2 = 1;
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

                public void onDetachedFromJNI() {
/* 1 */             diposeAllViews();
                }

                public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
/* 5 */             if (initializePlatformViewIfNeeded(i)) {
/* 10 */                FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i);
/* 22 */                flutterMutatorView.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
/* 26 */                flutterMutatorView.setVisibility(0);
/* 29 */                flutterMutatorView.bringToFront();
/* 34 */                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
/* 45 */                View view = this.platformViews.get(i).getView();
/* 49 */                if (view != null) {
/* 51 */                    view.setLayoutParams(layoutParams);
/* 54 */                    view.bringToFront();
                        }
                    }
                }

                public void onEndFrame() {
/* 1 */             SurfaceControl.Transaction transactionM8274f = rw0.m8274f();
/* 5 */             int i = 0;
                    while (true) {
/* 8 */                 int size = this.activeTransactions.size();
/* 12 */                ArrayList<SurfaceControl.Transaction> arrayList = this.activeTransactions;
/* 14 */                if (i >= size) {
/* 31 */                    arrayList.clear();
/* 36 */                    this.flutterView.invalidate();
/* 1 */                     this.flutterView.getRootSurfaceControl().applyTransactionOnDraw(transactionM8274f);
/* 48 */                    return;
                        }
/* 1 */                 transactionM8274f = transactionM8274f.merge(rw0.m8276h(arrayList.get(i)));
/* 28 */                i++;
                    }
                }

                public void onPreEngineRestart() {
/* 1 */             diposeAllViews();
                }

                public void setFlutterJNI(FlutterJNI flutterJNI) {
/* 1 */             this.flutterJNI = flutterJNI;
                }

                public void setRegistry(PlatformViewRegistry platformViewRegistry) {
/* 3 */             this.registry = (PlatformViewRegistryImpl) platformViewRegistry;
                }

                public void showOverlaySurface() {
/* 3 */             if (this.overlaySurfaceControl == null) {
/* 5 */                 return;
                    }
/* 6 */             SurfaceControl.Transaction transactionM8274f = rw0.m8274f();
/* 2 */             transactionM8274f.setVisibility(this.overlaySurfaceControl, true);
/* 1 */             transactionM8274f.apply();
                }

                public synchronized void swapTransactions() {
                    try {
/* 4 */                 this.activeTransactions.clear();
/* 14 */                for (int i = 0; i < this.pendingTransactions.size(); i++) {
/* 28 */                    this.activeTransactions.add(rw0.m8276h(this.pendingTransactions.get(i)));
                        }
/* 38 */                this.pendingTransactions.clear();
                    } catch (Throwable th) {
/* 44 */                throw th;
                    }
                }

                public MotionEvent toMotionEvent(float f, PlatformViewsChannel2.PlatformViewTouch platformViewTouch) {
/* 13 */            MotionEvent motionEventPop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
/* 34 */            MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f).toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
/* 36 */            if (motionEventPop != null) {
/* 38 */                translateMotionEvent(motionEventPop, pointerCoordsArr);
/* 41 */                return motionEventPop;
                    }
/* 97 */            return MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public boolean usesVirtualDisplay(int i) {
/* 1 */             return false;
                }

/* 9 */         private int toLogicalPixels(double d, float f) {
/* 10 */            return (int) Math.round(d / ((double) f));
                }
            }
