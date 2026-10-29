            package io.flutter.embedding.android;

            import android.app.Activity;
            import android.content.Context;
            import android.content.res.Configuration;
            import android.database.ContentObserver;
            import android.graphics.Insets;
            import android.graphics.Rect;
            import android.hardware.display.DisplayManager;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.provider.Settings;
            import android.text.format.DateFormat;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.DisplayCutout;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.PointerIcon;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewStructure;
            import android.view.WindowInsets;
            import android.view.accessibility.AccessibilityManager;
            import android.view.accessibility.AccessibilityNodeProvider;
            import android.view.autofill.AutofillValue;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.textservice.SpellCheckerInfo;
            import android.view.textservice.TextServicesManager;
            import android.widget.FrameLayout;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
            import io.flutter.embedding.engine.renderer.RenderSurface;
            import io.flutter.embedding.engine.systemchannels.SettingsChannel;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.editing.ScribePlugin;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import io.flutter.plugin.editing.TextInputPlugin;
            import io.flutter.plugin.localization.LocalizationPlugin;
            import io.flutter.plugin.mouse.MouseCursorPlugin;
            import io.flutter.plugin.platform.PlatformViewsControllerDelegator;
            import io.flutter.util.ViewUtils;
            import io.flutter.view.AccessibilityBridge;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import p000.C0204c5;
            import p000.C2131r4;
            import p000.C2334wk;
            import p000.c00;
            import p000.dl0;
            import p000.ot0;
            import p000.q83;
            import p000.s80;
            import p000.v00;
            import p000.v73;
            import p000.w73;
            import p000.x73;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 106 */   public class FlutterView extends FrameLayout implements MouseCursorPlugin.MouseCursorViewDelegate, KeyboardManager.ViewDelegate {
                private static final String GBOARD_PACKAGE_NAME = "com.google.android.inputmethod.latin";
                private static final String TAG = "FlutterView";
                private AccessibilityBridge accessibilityBridge;
                private AndroidTouchProcessor androidTouchProcessor;
                private FlutterViewDelegate delegate;
                private FlutterEngine flutterEngine;
                private final Set<FlutterEngineAttachmentListener> flutterEngineAttachmentListeners;
                private FlutterImageView flutterImageView;
                private FlutterSurfaceView flutterSurfaceView;
                private FlutterTextureView flutterTextureView;
                private final FlutterUiDisplayListener flutterUiDisplayListener;
                private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners;
                private boolean isFlutterUiDisplayed;
                private KeyboardManager keyboardManager;
                private LocalizationPlugin localizationPlugin;
                private MouseCursorPlugin mouseCursorPlugin;
                private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
                private RenderSurface previousRenderSurface;
                RenderSurface renderSurface;
                private ScribePlugin scribePlugin;
                private SpellCheckPlugin spellCheckPlugin;
                private final ContentObserver systemSettingsObserver;
                private TextInputPlugin textInputPlugin;
                private TextServicesManager textServicesManager;
                private final FlutterRenderer.ViewportMetrics viewportMetrics;
                private c00 windowInfoListener;
                private WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepo;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface FlutterEngineAttachmentListener {
                    void onFlutterEngineAttachedToFlutterView(FlutterEngine flutterEngine);

                    void onFlutterEngineDetachedFromFlutterView();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum ZeroSides {
                    NONE,
                    LEFT,
                    RIGHT,
                    BOTH
                }

                @Deprecated
                public FlutterView(Context context, RenderMode renderMode, TransparencyMode transparencyMode) {
/* 2 */             super(context, null);
/* 10 */            this.flutterUiDisplayListeners = new HashSet();
/* 17 */            this.flutterEngineAttachmentListeners = new HashSet();
/* 24 */            this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
/* 31 */            this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
                        @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
                        public void onAccessibilityChanged(boolean z, boolean z2) {
/* 1 */                     FlutterView.this.resetWillNotDraw(z, z2);
                        }
                    };
/* 47 */            this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
                        @Override // android.database.ContentObserver
                        public boolean deliverSelfNotifications() {
/* 1 */                     return true;
                        }

                        @Override // android.database.ContentObserver
                        public void onChange(boolean z) {
/* 1 */                     super.onChange(z);
/* 10 */                    if (FlutterView.this.flutterEngine == null) {
/* 12 */                        return;
                            }
/* 17 */                    Log.m4589v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
/* 22 */                    FlutterView.this.sendUserSettingsToFlutter();
                        }
                    };
/* 54 */            this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = true;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                            }
                        }

                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiNoLongerDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = false;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                            }
                        }
                    };
/* 61 */            this.delegate = new FlutterViewDelegate();
/* 65 */            if (renderMode == RenderMode.surface) {
/* 76 */                FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent);
/* 79 */                this.flutterSurfaceView = flutterSurfaceView;
/* 81 */                this.renderSurface = flutterSurfaceView;
                    } else {
/* 86 */                if (renderMode != RenderMode.texture) {
/* 103 */                   s80.m8430k(renderMode, "RenderMode not supported with this constructor: ");
/* 107 */                   throw null;
                        }
/* 90 */                FlutterTextureView flutterTextureView = new FlutterTextureView(context);
/* 93 */                this.flutterTextureView = flutterTextureView;
/* 95 */                this.renderSurface = flutterTextureView;
                    }
/* 97 */            init();
                }

                private View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
                    try {
/* 6 */                 Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
/* 11 */                declaredMethod.setAccessible(true);
/* 26 */                if (declaredMethod.invoke(view, null).equals(Integer.valueOf(i))) {
/* 28 */                    return view;
                        }
/* 31 */                if (view instanceof ViewGroup) {
/* 33 */                    int i2 = 0;
                            while (true) {
/* 35 */                        ViewGroup viewGroup = (ViewGroup) view;
/* 41 */                        if (i2 >= viewGroup.getChildCount()) {
                                    break;
                                }
/* 47 */                        View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, viewGroup.getChildAt(i2));
/* 51 */                        if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
/* 53 */                            return viewFindViewByAccessibilityIdRootedAtCurrentView;
                                }
/* 54 */                        i2++;
                            }
                        }
/* 1 */                 return null;
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                }

                private int guessBottomKeyboardInset(WindowInsets windowInsets) {
/* 23 */            if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * 0.18d) {
/* 25 */                return 0;
                    }
/* 27 */            return windowInsets.getSystemWindowInsetBottom();
                }

                private void init() {
/* 5 */             Log.m4589v(TAG, "Initializing FlutterView");
/* 10 */            if (this.flutterSurfaceView != null) {
/* 14 */                Log.m4589v(TAG, "Internally using a FlutterSurfaceView.");
/* 19 */                addView(this.flutterSurfaceView);
                    } else if (this.flutterTextureView != null) {
/* 29 */                Log.m4589v(TAG, "Internally using a FlutterTextureView.");
/* 34 */                addView(this.flutterTextureView);
                    } else {
/* 40 */                Log.m4589v(TAG, "Internally using a FlutterImageView.");
/* 45 */                addView(this.flutterImageView);
                    }
/* 49 */            setFocusable(true);
/* 52 */            setFocusableInTouchMode(true);
/* 59 */            if (Build.VERSION.SDK_INT >= 26) {
/* 2 */                 setImportantForAutofill(1);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void releaseImageView() {
/* 1 */             FlutterImageView flutterImageView = this.flutterImageView;
/* 3 */             if (flutterImageView != null) {
/* 5 */                 flutterImageView.closeImageReader();
/* 10 */                removeView(this.flutterImageView);
/* 14 */                this.flutterImageView = null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void resetWillNotDraw(boolean z, boolean z2) {
/* 11 */            boolean z3 = false;
/* 12 */            if (this.flutterEngine.getRenderer().isSoftwareRenderingEnabled()) {
/* 23 */                setWillNotDraw(false);
/* 26 */                return;
                    }
/* 14 */            if (!z && !z2) {
/* 18 */                z3 = true;
                    }
/* 19 */            setWillNotDraw(z3);
                }

                private void sendViewportMetricsToFlutter() {
/* 5 */             if (!isAttachedToFlutterEngine()) {
/* 11 */                Log.m4591w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
/* 14 */                return;
                    }
/* 27 */            this.viewportMetrics.devicePixelRatio = getResources().getDisplayMetrics().density;
/* 43 */            this.viewportMetrics.physicalTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
/* 53 */            this.flutterEngine.getRenderer().setViewportMetrics(this.viewportMetrics);
                }

                public boolean acquireLatestImageViewFrame() {
/* 1 */             FlutterImageView flutterImageView = this.flutterImageView;
/* 3 */             if (flutterImageView != null) {
/* 5 */                 return flutterImageView.acquireLatestImage();
                    }
/* 10 */            return false;
                }

                public void addFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
/* 3 */             this.flutterEngineAttachmentListeners.add(flutterEngineAttachmentListener);
                }

                public void addOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
/* 3 */             this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
                }

                public void attachOverlaySurfaceToRender(FlutterImageView flutterImageView) {
/* 1 */             FlutterEngine flutterEngine = this.flutterEngine;
/* 3 */             if (flutterEngine != null) {
/* 9 */                 flutterImageView.attachToRenderer(flutterEngine.getRenderer());
                    }
                }

                public void attachToFlutterEngine(FlutterEngine flutterEngine) {
/* 17 */            Log.m4589v(TAG, "Attaching to a FlutterEngine: " + flutterEngine);
/* 24 */            if (isAttachedToFlutterEngine()) {
/* 28 */                if (flutterEngine == this.flutterEngine) {
/* 32 */                    Log.m4589v(TAG, "Already attached to this engine. Doing nothing.");
/* 35 */                    return;
                        } else {
/* 38 */                    Log.m4589v(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
/* 41 */                    detachFromFlutterEngine();
                        }
                    }
/* 44 */            this.flutterEngine = flutterEngine;
/* 46 */            FlutterRenderer renderer = flutterEngine.getRenderer();
/* 54 */            this.isFlutterUiDisplayed = renderer.isDisplayingFlutterUi();
/* 58 */            this.renderSurface.attachToRenderer(renderer);
/* 63 */            renderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
/* 77 */            this.mouseCursorPlugin = new MouseCursorPlugin(this, this.flutterEngine.getMouseCursorChannel());
/* 109 */           this.textInputPlugin = new TextInputPlugin(this, this.flutterEngine.getTextInputChannel(), this.flutterEngine.getScribeChannel(), this.flutterEngine.getPlatformViewsController(), this.flutterEngine.getPlatformViewsController2());
                    try {
/* 121 */               TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
/* 123 */               this.textServicesManager = textServicesManager;
/* 136 */               this.spellCheckPlugin = new SpellCheckPlugin(textServicesManager, this.flutterEngine.getSpellCheckChannel());
                    } catch (Exception unused) {
/* 141 */               Log.m4585e(TAG, "TextServicesManager not supported by device, spell check disabled.");
                    }
/* 161 */           this.scribePlugin = new ScribePlugin(this, this.textInputPlugin.getInputMethodManager(), this.flutterEngine.getScribeChannel());
/* 169 */           this.localizationPlugin = this.flutterEngine.getLocalizationPlugin();
/* 176 */           this.keyboardManager = new KeyboardManager(this);
/* 190 */           this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.getRenderer(), false);
/* 236 */           AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, flutterEngine.getAccessibilityChannel(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), new PlatformViewsControllerDelegator(this.flutterEngine.getPlatformViewsController(), this.flutterEngine.getPlatformViewsController2()));
/* 239 */           this.accessibilityBridge = accessibilityBridge;
/* 243 */           accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
/* 258 */           resetWillNotDraw(this.accessibilityBridge.isAccessibilityEnabled(), this.accessibilityBridge.isTouchExplorationEnabled());
/* 269 */           this.flutterEngine.getPlatformViewsController().attachAccessibilityBridge(this.accessibilityBridge);
/* 284 */           this.flutterEngine.getPlatformViewsController().attachToFlutterRenderer(this.flutterEngine.getRenderer());
/* 295 */           this.flutterEngine.getPlatformViewsController2().attachAccessibilityBridge(this.accessibilityBridge);
/* 310 */           this.flutterEngine.getPlatformViewsController2().attachToFlutterRenderer(this.flutterEngine.getRenderer());
/* 319 */           this.textInputPlugin.getInputMethodManager().restartInput(this);
/* 322 */           sendUserSettingsToFlutter();
/* 341 */           getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.systemSettingsObserver);
/* 344 */           sendViewportMetricsToFlutter();
/* 351 */           flutterEngine.getPlatformViewsController().attachToView(this);
/* 358 */           flutterEngine.getPlatformViewsController2().attachToView(this);
/* 363 */           Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
/* 371 */           while (it.hasNext()) {
/* 379 */               it.next().onFlutterEngineAttachedToFlutterView(flutterEngine);
                    }
/* 385 */           if (this.isFlutterUiDisplayed) {
/* 389 */               this.flutterUiDisplayListener.onFlutterUiDisplayed();
                    }
                }

                @Override // android.view.View
                public void autofill(SparseArray<AutofillValue> sparseArray) {
/* 3 */             this.textInputPlugin.autofill(sparseArray);
                }

                public ZeroSides calculateShouldZeroSides() {
/* 1 */             Context context = getContext();
/* 16 */            if (context.getResources().getConfiguration().orientation == 2) {
/* 31 */                int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
/* 36 */                if (rotation == 1) {
/* 38 */                    return ZeroSides.RIGHT;
                        }
/* 42 */                if (rotation == 3) {
/* 44 */                    return ZeroSides.LEFT;
                        }
/* 47 */                if (rotation == 0 || rotation == 2) {
/* 51 */                    return ZeroSides.BOTH;
                        }
                    }
/* 54 */            return ZeroSides.NONE;
                }

                @Override // android.view.View
                public boolean checkInputConnectionProxy(View view) {
/* 1 */             FlutterEngine flutterEngine = this.flutterEngine;
                    return flutterEngine != null ? flutterEngine.getPlatformViewsController().checkInputConnectionProxy(view) : super.checkInputConnectionProxy(view);
                }

                public void convertToImageView() {
/* 3 */             this.renderSurface.pause();
/* 6 */             FlutterImageView flutterImageView = this.flutterImageView;
/* 8 */             if (flutterImageView == null) {
/* 10 */                FlutterImageView flutterImageViewCreateImageView = createImageView();
/* 14 */                this.flutterImageView = flutterImageViewCreateImageView;
/* 16 */                addView(flutterImageViewCreateImageView);
                    } else {
/* 28 */                flutterImageView.resizeIfNeeded(getWidth(), getHeight());
                    }
/* 33 */            this.previousRenderSurface = this.renderSurface;
/* 35 */            FlutterImageView flutterImageView2 = this.flutterImageView;
/* 37 */            this.renderSurface = flutterImageView2;
/* 39 */            FlutterEngine flutterEngine = this.flutterEngine;
/* 41 */            if (flutterEngine != null) {
/* 47 */                flutterImageView2.attachToRenderer(flutterEngine.getRenderer());
                    }
                }

                public FlutterImageView createImageView() {
/* 17 */            return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
                }

                public WindowInfoRepositoryCallbackAdapterWrapper createWindowInfoRepo() {
                    try {
/* 5 */                 v73 v73Var = w73.f18473R;
/* 7 */                 Context context = getContext();
/* 11 */                v73Var.getClass();
/* 21 */                return new WindowInfoRepositoryCallbackAdapterWrapper(new x73(v73.m9228a(context)));
                    } catch (NoClassDefFoundError unused) {
/* 25 */                return null;
                    }
                }

                public void detachFromFlutterEngine() {
/* 19 */            Log.m4589v(TAG, "Detaching from a FlutterEngine: " + this.flutterEngine);
/* 26 */            if (!isAttachedToFlutterEngine()) {
/* 30 */                Log.m4589v(TAG, "FlutterView not attached to an engine. Not detaching.");
/* 33 */                return;
                    }
/* 36 */            Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
/* 44 */            while (it.hasNext()) {
/* 52 */                it.next().onFlutterEngineDetachedFromFlutterView();
                    }
/* 66 */            getContext().getContentResolver().unregisterContentObserver(this.systemSettingsObserver);
/* 75 */            this.flutterEngine.getPlatformViewsController().detachFromView();
/* 84 */            this.flutterEngine.getPlatformViewsController2().detachFromView();
/* 93 */            this.flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
/* 102 */           this.flutterEngine.getPlatformViewsController2().detachAccessibilityBridge();
/* 107 */           this.accessibilityBridge.release();
/* 111 */           this.accessibilityBridge = null;
/* 119 */           this.textInputPlugin.getInputMethodManager().restartInput(this);
/* 124 */           this.textInputPlugin.destroy();
/* 129 */           this.keyboardManager.destroy();
/* 132 */           SpellCheckPlugin spellCheckPlugin = this.spellCheckPlugin;
/* 134 */           if (spellCheckPlugin != null) {
/* 136 */               spellCheckPlugin.destroy();
                    }
/* 139 */           MouseCursorPlugin mouseCursorPlugin = this.mouseCursorPlugin;
/* 141 */           if (mouseCursorPlugin != null) {
/* 143 */               mouseCursorPlugin.destroy();
                    }
/* 148 */           FlutterRenderer renderer = this.flutterEngine.getRenderer();
/* 153 */           this.isFlutterUiDisplayed = false;
/* 157 */           renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
/* 160 */           renderer.stopRenderingToSurface();
/* 163 */           renderer.setSemanticsEnabled(false);
/* 166 */           RenderSurface renderSurface = this.previousRenderSurface;
/* 168 */           if (renderSurface != null && this.renderSurface == this.flutterImageView) {
/* 176 */               this.renderSurface = renderSurface;
                    }
/* 180 */           this.renderSurface.detachFromRenderer();
/* 183 */           releaseImageView();
/* 186 */           this.previousRenderSurface = null;
/* 188 */           this.flutterEngine = null;
                }

                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 6 */             if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
/* 18 */                getKeyDispatcherState().startTracking(keyEvent, this);
                    } else if (keyEvent.getAction() == 1) {
/* 32 */                getKeyDispatcherState().handleUpEvent(keyEvent);
                    }
                    return (isAttachedToFlutterEngine() && this.keyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
                }

                public View findViewByAccessibilityIdTraversal(int i) {
/* 5 */             if (Build.VERSION.SDK_INT < 29) {
/* 7 */                 return findViewByAccessibilityIdRootedAtCurrentView(i, this);
                    }
                    try {
/* 25 */                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
/* 29 */                declaredMethod.setAccessible(true);
/* 44 */                return (View) declaredMethod.invoke(this, Integer.valueOf(i));
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
/* 12 */                return null;
                    }
                }

                @Override // android.view.View
                public AccessibilityNodeProvider getAccessibilityNodeProvider() {
/* 1 */             AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
/* 3 */             if (accessibilityBridge == null || !accessibilityBridge.isAccessibilityEnabled()) {
/* 14 */                return null;
                    }
/* 11 */            return this.accessibilityBridge;
                }

                public FlutterEngine getAttachedFlutterEngine() {
/* 1 */             return this.flutterEngine;
                }

                @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
                public BinaryMessenger getBinaryMessenger() {
/* 3 */             return this.flutterEngine.getDartExecutor();
                }

                public FlutterImageView getCurrentImageSurface() {
/* 1 */             return this.flutterImageView;
                }

                @Override // io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate
                public PointerIcon getSystemPointerIcon(int i) {
/* 5 */             return PointerIcon.getSystemIcon(getContext(), i);
                }

                public FlutterRenderer.ViewportMetrics getViewportMetrics() {
/* 1 */             return this.viewportMetrics;
                }

                public boolean hasRenderedFirstFrame() {
/* 1 */             return this.isFlutterUiDisplayed;
                }

                public boolean isAttachedToFlutterEngine() {
/* 1 */             FlutterEngine flutterEngine = this.flutterEngine;
                    return flutterEngine != null && flutterEngine.getRenderer() == this.renderSurface.getAttachedRenderer();
                }

                @Override // android.view.View
                public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
                    DisplayCutout displayCutout;
/* 1 */             WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
/* 5 */             int i = Build.VERSION.SDK_INT;
/* 9 */             if (i == 29) {
/* 1 */                 Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
/* 21 */                this.viewportMetrics.systemGestureInsetTop = systemGestureInsets.top;
/* 29 */                this.viewportMetrics.systemGestureInsetRight = systemGestureInsets.right;
/* 37 */                this.viewportMetrics.systemGestureInsetBottom = systemGestureInsets.bottom;
/* 45 */                this.viewportMetrics.systemGestureInsetLeft = systemGestureInsets.left;
                    }
/* 59 */            boolean z = (getWindowSystemUiVisibility() & 4) == 0;
/* 66 */            boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
/* 72 */            if (i >= 30) {
/* 1 */                 Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
/* 88 */                this.viewportMetrics.viewPaddingTop = insets.top;
/* 96 */                this.viewportMetrics.viewPaddingRight = insets.right;
/* 104 */               this.viewportMetrics.viewPaddingBottom = insets.bottom;
/* 112 */               this.viewportMetrics.viewPaddingLeft = insets.left;
/* 1 */                 Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
/* 128 */               this.viewportMetrics.viewInsetTop = insets2.top;
/* 136 */               this.viewportMetrics.viewInsetRight = insets2.right;
/* 144 */               this.viewportMetrics.viewInsetBottom = insets2.bottom;
/* 152 */               this.viewportMetrics.viewInsetLeft = insets2.left;
/* 1 */                 Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
/* 168 */               this.viewportMetrics.systemGestureInsetTop = insets3.top;
/* 176 */               this.viewportMetrics.systemGestureInsetRight = insets3.right;
/* 184 */               this.viewportMetrics.systemGestureInsetBottom = insets3.bottom;
/* 192 */               this.viewportMetrics.systemGestureInsetLeft = insets3.left;
/* 1 */                 DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
/* 198 */               if (displayCutout2 != null) {
/* 1 */                     Insets waterfallInsets = displayCutout2.getWaterfallInsets();
/* 204 */                   FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
/* 224 */                   viewportMetrics.viewPaddingTop = Math.max(Math.max(viewportMetrics.viewPaddingTop, waterfallInsets.top), displayCutout2.getSafeInsetTop());
/* 226 */                   FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
/* 246 */                   viewportMetrics2.viewPaddingRight = Math.max(Math.max(viewportMetrics2.viewPaddingRight, waterfallInsets.right), displayCutout2.getSafeInsetRight());
/* 248 */                   FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
/* 268 */                   viewportMetrics3.viewPaddingBottom = Math.max(Math.max(viewportMetrics3.viewPaddingBottom, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
/* 270 */                   FlutterRenderer.ViewportMetrics viewportMetrics4 = this.viewportMetrics;
/* 290 */                   viewportMetrics4.viewPaddingLeft = Math.max(Math.max(viewportMetrics4.viewPaddingLeft, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
                        }
                    } else {
/* 293 */               ZeroSides zeroSidesCalculateShouldZeroSides = ZeroSides.NONE;
/* 295 */               if (!z2) {
/* 297 */                   zeroSidesCalculateShouldZeroSides = calculateShouldZeroSides();
                        }
/* 311 */               this.viewportMetrics.viewPaddingTop = z ? windowInsets.getSystemWindowInsetTop() : 0;
/* 330 */               this.viewportMetrics.viewPaddingRight = (zeroSidesCalculateShouldZeroSides == ZeroSides.RIGHT || zeroSidesCalculateShouldZeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
/* 348 */               this.viewportMetrics.viewPaddingBottom = (z2 && guessBottomKeyboardInset(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
/* 367 */               this.viewportMetrics.viewPaddingLeft = (zeroSidesCalculateShouldZeroSides == ZeroSides.LEFT || zeroSidesCalculateShouldZeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
/* 369 */               FlutterRenderer.ViewportMetrics viewportMetrics5 = this.viewportMetrics;
/* 371 */               viewportMetrics5.viewInsetTop = 0;
/* 373 */               viewportMetrics5.viewInsetRight = 0;
/* 379 */               viewportMetrics5.viewInsetBottom = guessBottomKeyboardInset(windowInsets);
/* 383 */               this.viewportMetrics.viewInsetLeft = 0;
                    }
/* 387 */           ArrayList arrayList = new ArrayList();
/* 394 */           if (i >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
/* 414 */               for (Rect rect : displayCutout.getBoundingRects()) {
/* 440 */                   Log.m4589v(TAG, "DisplayCutout area reported with bounds = " + rect.toString());
/* 452 */                   arrayList.add(new FlutterRenderer.DisplayFeature(rect, FlutterRenderer.DisplayFeatureType.CUTOUT, FlutterRenderer.DisplayFeatureState.UNKNOWN));
                        }
                    }
/* 458 */           this.viewportMetrics.setDisplayCutouts(arrayList);
/* 465 */           if (Build.VERSION.SDK_INT >= 35) {
/* 475 */               this.delegate.growViewportMetricsToCaptionBar(getContext(), this.viewportMetrics);
                    }
/* 598 */           Log.m4589v(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.viewportMetrics.viewPaddingTop + ", Left: " + this.viewportMetrics.viewPaddingLeft + ", Right: " + this.viewportMetrics.viewPaddingRight + "\nKeyboard insets: Bottom: " + this.viewportMetrics.viewInsetBottom + ", Left: " + this.viewportMetrics.viewInsetLeft + ", Right: " + this.viewportMetrics.viewInsetRight + "System Gesture Insets - Left: " + this.viewportMetrics.systemGestureInsetLeft + ", Top: " + this.viewportMetrics.systemGestureInsetTop + ", Right: " + this.viewportMetrics.systemGestureInsetRight + ", Bottom: " + this.viewportMetrics.viewInsetBottom);
/* 601 */           sendViewportMetricsToFlutter();
/* 604 */           return windowInsetsOnApplyWindowInsets;
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 8 */             this.windowInfoRepo = createWindowInfoRepo();
/* 14 */            Activity activity = ViewUtils.getActivity(getContext());
/* 18 */            WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
/* 20 */            if (windowInfoRepositoryCallbackAdapterWrapper == null || activity == null) {
/* 45 */                return;
                    }
/* 30 */            this.windowInfoListener = new dl0(this, 0);
/* 42 */            windowInfoRepositoryCallbackAdapterWrapper.addWindowLayoutInfoListener(activity, v00.getMainExecutor(getContext()), this.windowInfoListener);
                }

                @Override // android.view.View
                public void onConfigurationChanged(Configuration configuration) throws Exception {
/* 1 */             super.onConfigurationChanged(configuration);
/* 6 */             if (this.flutterEngine != null) {
/* 12 */                Log.m4589v(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
/* 17 */                this.localizationPlugin.sendLocalesToFlutter(configuration);
/* 20 */                sendUserSettingsToFlutter();
/* 29 */                ViewUtils.calculateMaximumDisplayMetrics(getContext(), this.flutterEngine);
                    }
                }

                @Override // android.view.View
                public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
                    return !isAttachedToFlutterEngine() ? super.onCreateInputConnection(editorInfo) : this.textInputPlugin.createInputConnection(this, this.keyboardManager, editorInfo);
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onDetachedFromWindow() {
                    c00 c00Var;
/* 1 */             WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
/* 3 */             if (windowInfoRepositoryCallbackAdapterWrapper != null && (c00Var = this.windowInfoListener) != null) {
/* 9 */                 windowInfoRepositoryCallbackAdapterWrapper.removeWindowLayoutInfoListener(c00Var);
                    }
/* 13 */            this.windowInfoListener = null;
/* 15 */            this.windowInfoRepo = null;
/* 17 */            super.onDetachedFromWindow();
                }

                @Override // android.view.View
                public boolean onGenericMotionEvent(MotionEvent motionEvent) {
/* 5 */             if (isAttachedToFlutterEngine() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent, getContext())) {
/* 19 */                return true;
                    }
/* 21 */            return super.onGenericMotionEvent(motionEvent);
                }

                @Override // android.view.View
                public boolean onHoverEvent(MotionEvent motionEvent) {
                    return !isAttachedToFlutterEngine() ? super.onHoverEvent(motionEvent) : this.accessibilityBridge.onAccessibilityHoverEvent(motionEvent);
                }

                @Override // android.view.View
                public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
/* 1 */             super.onProvideAutofillVirtualStructure(viewStructure, i);
/* 6 */             this.textInputPlugin.onProvideAutofillVirtualStructure(viewStructure, i);
                }

                @Override // android.view.View
                public void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 42 */            Log.m4589v(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
/* 45 */            FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
/* 47 */            viewportMetrics.width = i;
/* 49 */            viewportMetrics.height = i2;
/* 51 */            sendViewportMetricsToFlutter();
                }

                @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
                public boolean onTextInputKeyEvent(KeyEvent keyEvent) {
/* 3 */             return this.textInputPlugin.handleKeyEvent(keyEvent);
                }

                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
/* 5 */             if (!isAttachedToFlutterEngine()) {
/* 7 */                 return super.onTouchEvent(motionEvent);
                    }
/* 12 */            requestUnbufferedDispatch(motionEvent);
/* 17 */            return this.androidTouchProcessor.onTouchEvent(motionEvent);
                }

                @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
                public void redispatch(KeyEvent keyEvent) {
/* 5 */             getRootView().dispatchKeyEvent(keyEvent);
                }

                public void removeFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
/* 3 */             this.flutterEngineAttachmentListeners.remove(flutterEngineAttachmentListener);
                }

                public void removeOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
/* 3 */             this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
                }

                public void revertImageView(final Runnable runnable) {
/* 5 */             if (this.flutterImageView == null) {
/* 9 */                 Log.m4589v(TAG, "Tried to revert the image view, but no image view is used.");
/* 12 */                return;
                    }
/* 13 */            RenderSurface renderSurface = this.previousRenderSurface;
/* 15 */            if (renderSurface == null) {
/* 19 */                Log.m4589v(TAG, "Tried to revert the image view, but no previous surface was used.");
/* 22 */                return;
                    }
/* 23 */            this.renderSurface = renderSurface;
/* 26 */            this.previousRenderSurface = null;
/* 30 */            final FlutterRenderer renderer = this.flutterEngine.getRenderer();
/* 36 */            if (this.flutterEngine != null && renderer != null) {
/* 43 */                this.renderSurface.resume();
/* 51 */                renderer.addIsDisplayingFlutterUiListener(new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.4
                            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                            public void onFlutterUiDisplayed() {
/* 3 */                         renderer.removeIsDisplayingFlutterUiListener(this);
/* 8 */                         runnable.run();
/* 11 */                        FlutterView flutterView = FlutterView.this;
/* 17 */                        if ((flutterView.renderSurface instanceof FlutterImageView) || flutterView.flutterImageView == null) {
/* 39 */                            return;
                                }
/* 31 */                        FlutterView.this.flutterImageView.detachFromRenderer();
/* 1 */                         FlutterView.this.releaseImageView();
                            }

                            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                            public void onFlutterUiNoLongerDisplayed() {
                            }
                        });
                    } else {
/* 57 */                this.flutterImageView.detachFromRenderer();
/* 60 */                releaseImageView();
/* 63 */                runnable.run();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0050  */
                public void sendUserSettingsToFlutter() {
                    boolean z;
                    boolean z2;
/* 20 */            SettingsChannel.PlatformBrightness platformBrightness = (getResources().getConfiguration().uiMode & 48) == 32 ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light;
/* 22 */            TextServicesManager textServicesManager = this.textServicesManager;
/* 26 */            if (textServicesManager == null) {
/* 81 */                z = false;
                    } else {
/* 32 */                if (Build.VERSION.SDK_INT >= 31) {
/* 38 */                    Iterator it = textServicesManager.getEnabledSpellCheckerInfos().iterator();
                            while (true) {
/* 46 */                        if (!it.hasNext()) {
/* 68 */                            z2 = false;
                                    break;
                                } else if (((SpellCheckerInfo) it.next()).getPackageName().equals(GBOARD_PACKAGE_NAME)) {
/* 66 */                            z2 = true;
                                    break;
                                }
                            }
/* 75 */                    if (!this.textServicesManager.isSpellCheckerEnabled() || !z2) {
/* 81 */                        z = false;
                            }
                        }
/* 79 */                z = true;
                    }
/* 159 */           this.flutterEngine.getSettingsChannel().startMessage().setTextScaleFactor(getResources().getConfiguration().fontScale).setDisplayMetrics(getResources().getDisplayMetrics()).setNativeSpellCheckServiceDefined(z).setBrieflyShowPassword(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1).setUse24HourFormat(DateFormat.is24HourFormat(getContext())).setPlatformBrightness(platformBrightness).send();
                }

                public void setDelegate(FlutterViewDelegate flutterViewDelegate) {
/* 1 */             this.delegate = flutterViewDelegate;
                }

                @Override // android.view.View
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 4 */             RenderSurface renderSurface = this.renderSurface;
/* 8 */             if (renderSurface instanceof FlutterSurfaceView) {
/* 12 */                ((FlutterSurfaceView) renderSurface).setVisibility(i);
                    }
                }

                public void setWindowInfoListenerDisplayFeatures(q83 q83Var) {
/* 1 */             C0204c5 c0204c5 = C0204c5.f2713o;
/* 3 */             List<ot0> list = q83Var.f15446a;
/* 7 */             ArrayList arrayList = new ArrayList();
/* 18 */            for (ot0 ot0Var : list) {
/* 68 */                Log.m4589v(TAG, "WindowInfoTracker Display Feature reported with bounds = " + ot0Var.f14891a.m9582a().toString() + " and type = " + ot0Var.getClass().getSimpleName());
/* 73 */                if (ot0Var instanceof ot0) {
/* 75 */                    C2334wk c2334wk = ot0Var.f14891a;
/* 101 */                   FlutterRenderer.DisplayFeatureType displayFeatureType = ((c2334wk.f18667c - c2334wk.f18665a == 0 || c2334wk.f18668d - c2334wk.f18666b == 0) ? C0204c5.f2712n : c0204c5) == c0204c5 ? FlutterRenderer.DisplayFeatureType.HINGE : FlutterRenderer.DisplayFeatureType.FOLD;
/* 103 */                   C2131r4 c2131r4 = ot0Var.f14893c;
/* 130 */                   arrayList.add(new FlutterRenderer.DisplayFeature(c2334wk.m9582a(), displayFeatureType, c2131r4 == C2131r4.f15857l ? FlutterRenderer.DisplayFeatureState.POSTURE_FLAT : c2131r4 == C2131r4.f15858m ? FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED : FlutterRenderer.DisplayFeatureState.UNKNOWN));
                        } else {
/* 149 */                   arrayList.add(new FlutterRenderer.DisplayFeature(ot0Var.f14891a.m9582a(), FlutterRenderer.DisplayFeatureType.UNKNOWN, FlutterRenderer.DisplayFeatureState.UNKNOWN));
                        }
                    }
/* 156 */           this.viewportMetrics.setDisplayFeatures(arrayList);
/* 159 */           sendViewportMetricsToFlutter();
                }

                @Deprecated
/* 107 */       public FlutterView(Context context, RenderMode renderMode) {
/* 108 */           super(context, null);
/* 109 */           this.flutterUiDisplayListeners = new HashSet();
/* 110 */           this.flutterEngineAttachmentListeners = new HashSet();
/* 111 */           this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
/* 112 */           this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
                        @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
                        public void onAccessibilityChanged(boolean z, boolean z2) {
/* 1 */                     FlutterView.this.resetWillNotDraw(z, z2);
                        }
                    };
/* 113 */           this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
                        @Override // android.database.ContentObserver
                        public boolean deliverSelfNotifications() {
/* 1 */                     return true;
                        }

                        @Override // android.database.ContentObserver
                        public void onChange(boolean z) {
/* 1 */                     super.onChange(z);
/* 10 */                    if (FlutterView.this.flutterEngine == null) {
/* 12 */                        return;
                            }
/* 17 */                    Log.m4589v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
/* 22 */                    FlutterView.this.sendUserSettingsToFlutter();
                        }
                    };
/* 115 */           this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = true;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                            }
                        }

                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiNoLongerDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = false;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                            }
                        }
                    };
/* 116 */           this.delegate = new FlutterViewDelegate();
/* 117 */           if (renderMode == RenderMode.surface) {
/* 118 */               FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context);
                        this.flutterSurfaceView = flutterSurfaceView;
/* 119 */               this.renderSurface = flutterSurfaceView;
                    } else if (renderMode == RenderMode.texture) {
/* 121 */               FlutterTextureView flutterTextureView = new FlutterTextureView(context);
                        this.flutterTextureView = flutterTextureView;
/* 122 */               this.renderSurface = flutterTextureView;
                    } else {
/* 124 */               s80.m8430k(renderMode, "RenderMode not supported with this constructor: ");
                        throw null;
                    }
/* 123 */           init();
                }

                @Deprecated
/* 124 */       public FlutterView(Context context, TransparencyMode transparencyMode) {
/* 125 */           this(context, (AttributeSet) null, new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent));
                }

/* 125 */       public FlutterView(Context context, FlutterSurfaceView flutterSurfaceView) {
/* 126 */           this(context, (AttributeSet) null, flutterSurfaceView);
                }

/* 126 */       public FlutterView(Context context, FlutterTextureView flutterTextureView) {
/* 127 */           this(context, (AttributeSet) null, flutterTextureView);
                }

/* 127 */       public FlutterView(Context context, FlutterImageView flutterImageView) {
/* 128 */           this(context, (AttributeSet) null, flutterImageView);
                }

/* 128 */       public FlutterView(Context context, AttributeSet attributeSet) {
/* 129 */           this(context, attributeSet, new FlutterSurfaceView(context));
                }

/* 129 */       public FlutterView(Context context) {
/* 130 */           this(context, (AttributeSet) null, new FlutterSurfaceView(context));
                }

/* 130 */       private FlutterView(Context context, AttributeSet attributeSet, FlutterSurfaceView flutterSurfaceView) {
/* 131 */           super(context, attributeSet);
/* 132 */           this.flutterUiDisplayListeners = new HashSet();
/* 133 */           this.flutterEngineAttachmentListeners = new HashSet();
/* 134 */           this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
/* 135 */           this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
                        @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
                        public void onAccessibilityChanged(boolean z, boolean z2) {
/* 1 */                     FlutterView.this.resetWillNotDraw(z, z2);
                        }
                    };
/* 136 */           this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
                        @Override // android.database.ContentObserver
                        public boolean deliverSelfNotifications() {
/* 1 */                     return true;
                        }

                        @Override // android.database.ContentObserver
                        public void onChange(boolean z) {
/* 1 */                     super.onChange(z);
/* 10 */                    if (FlutterView.this.flutterEngine == null) {
/* 12 */                        return;
                            }
/* 17 */                    Log.m4589v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
/* 22 */                    FlutterView.this.sendUserSettingsToFlutter();
                        }
                    };
/* 138 */           this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = true;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                            }
                        }

                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiNoLongerDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = false;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                            }
                        }
                    };
/* 139 */           this.delegate = new FlutterViewDelegate();
/* 140 */           this.flutterSurfaceView = flutterSurfaceView;
/* 141 */           this.renderSurface = flutterSurfaceView;
/* 142 */           init();
                }

/* 142 */       private FlutterView(Context context, AttributeSet attributeSet, FlutterTextureView flutterTextureView) {
/* 143 */           super(context, attributeSet);
/* 144 */           this.flutterUiDisplayListeners = new HashSet();
/* 145 */           this.flutterEngineAttachmentListeners = new HashSet();
/* 146 */           this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
/* 147 */           this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
                        @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
                        public void onAccessibilityChanged(boolean z, boolean z2) {
/* 1 */                     FlutterView.this.resetWillNotDraw(z, z2);
                        }
                    };
/* 148 */           this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
                        @Override // android.database.ContentObserver
                        public boolean deliverSelfNotifications() {
/* 1 */                     return true;
                        }

                        @Override // android.database.ContentObserver
                        public void onChange(boolean z) {
/* 1 */                     super.onChange(z);
/* 10 */                    if (FlutterView.this.flutterEngine == null) {
/* 12 */                        return;
                            }
/* 17 */                    Log.m4589v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
/* 22 */                    FlutterView.this.sendUserSettingsToFlutter();
                        }
                    };
/* 150 */           this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = true;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                            }
                        }

                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiNoLongerDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = false;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                            }
                        }
                    };
/* 151 */           this.delegate = new FlutterViewDelegate();
/* 152 */           this.flutterTextureView = flutterTextureView;
/* 153 */           this.renderSurface = flutterTextureView;
/* 154 */           init();
                }

/* 154 */       private FlutterView(Context context, AttributeSet attributeSet, FlutterImageView flutterImageView) {
/* 155 */           super(context, attributeSet);
/* 156 */           this.flutterUiDisplayListeners = new HashSet();
/* 157 */           this.flutterEngineAttachmentListeners = new HashSet();
/* 158 */           this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
/* 159 */           this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
                        @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
                        public void onAccessibilityChanged(boolean z, boolean z2) {
/* 1 */                     FlutterView.this.resetWillNotDraw(z, z2);
                        }
                    };
/* 160 */           this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
                        @Override // android.database.ContentObserver
                        public boolean deliverSelfNotifications() {
/* 1 */                     return true;
                        }

                        @Override // android.database.ContentObserver
                        public void onChange(boolean z) {
/* 1 */                     super.onChange(z);
/* 10 */                    if (FlutterView.this.flutterEngine == null) {
/* 12 */                        return;
                            }
/* 17 */                    Log.m4589v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
/* 22 */                    FlutterView.this.sendUserSettingsToFlutter();
                        }
                    };
/* 162 */           this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = true;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                            }
                        }

                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiNoLongerDisplayed() {
/* 1 */                     FlutterView.this.isFlutterUiDisplayed = false;
/* 13 */                    Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                            }
                        }
                    };
/* 163 */           this.delegate = new FlutterViewDelegate();
/* 164 */           this.flutterImageView = flutterImageView;
/* 165 */           this.renderSurface = flutterImageView;
/* 166 */           init();
                }
            }
