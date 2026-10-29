            package io.flutter.embedding.android;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.window.BackEvent;
            import io.flutter.FlutterInjector;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.embedding.engine.FlutterEngineCache;
            import io.flutter.embedding.engine.FlutterEngineGroup;
            import io.flutter.embedding.engine.FlutterEngineGroupCache;
            import io.flutter.embedding.engine.FlutterShellArgs;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
            import io.flutter.plugin.platform.PlatformPlugin;
            import io.flutter.plugin.view.SensitiveContentPlugin;
            import java.util.Arrays;
            import java.util.List;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            import p000.v61;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    class FlutterActivityAndFragmentDelegate implements ExclusiveAppComponent<Activity> {
                private static final int FLUTTER_SPLASH_VIEW_FALLBACK_ID = 486947586;
                private static final String FRAMEWORK_RESTORATION_BUNDLE_KEY = "framework";
                static final String ON_BACK_CALLBACK_ENABLED_KEY = "enableOnBackInvokedCallbackState";
                private static final String PLUGINS_RESTORATION_BUNDLE_KEY = "plugins";
                private static final String TAG = "FlutterActivityAndFragmentDelegate";
                ViewTreeObserver.OnPreDrawListener activePreDrawListener;
                private FlutterEngineGroup engineGroup;
                private FlutterEngine flutterEngine;
                private final FlutterUiDisplayListener flutterUiDisplayListener;
                FlutterView flutterView;
                private Host host;
                private boolean isAttached;
                private boolean isFirstFrameRendered;
                private boolean isFlutterEngineFromHost;
                private boolean isFlutterUiDisplayed;
                private PlatformPlugin platformPlugin;
                private Integer previousVisibility;
                private SensitiveContentPlugin sensitiveContentPlugin;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface DelegateFactory {
                    FlutterActivityAndFragmentDelegate createDelegate(Host host);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Host extends FlutterEngineProvider, FlutterEngineConfigurator, PlatformPlugin.PlatformPluginDelegate {
                    boolean attachToEngineAutomatically();

                    void cleanUpFlutterEngine(FlutterEngine flutterEngine);

                    void configureFlutterEngine(FlutterEngine flutterEngine);

                    void detachFromFlutterEngine();

                    Activity getActivity();

                    String getAppBundlePath();

                    boolean getBackCallbackState();

                    String getCachedEngineGroupId();

                    String getCachedEngineId();

                    Context getContext();

                    List<String> getDartEntrypointArgs();

                    String getDartEntrypointFunctionName();

                    String getDartEntrypointLibraryUri();

                    ExclusiveAppComponent<Activity> getExclusiveAppComponent();

                    FlutterShellArgs getFlutterShellArgs();

                    String getInitialRoute();

                    v61 getLifecycle();

                    RenderMode getRenderMode();

                    TransparencyMode getTransparencyMode();

                    void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView);

                    void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView);

                    void onFlutterUiDisplayed();

                    void onFlutterUiNoLongerDisplayed();

                    @Override // io.flutter.embedding.android.FlutterEngineProvider
                    FlutterEngine provideFlutterEngine(Context context);

                    PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine);

                    SensitiveContentPlugin provideSensitiveContentPlugin(Activity activity, FlutterEngine flutterEngine);

                    boolean shouldAttachEngineToActivity();

                    boolean shouldDestroyEngineWithHost();

                    boolean shouldDispatchAppLifecycleState();

                    boolean shouldHandleDeeplinking();

                    boolean shouldRestoreAndSaveState();

                    void updateSystemUiOverlays();
                }

                public FlutterActivityAndFragmentDelegate(Host host, FlutterEngineGroup flutterEngineGroup) {
/* 9 */             this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.1
                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiDisplayed() {
/* 7 */                     FlutterActivityAndFragmentDelegate.this.host.onFlutterUiDisplayed();
/* 1 */                     FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = true;
/* 1 */                     FlutterActivityAndFragmentDelegate.this.isFirstFrameRendered = true;
                        }

                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiNoLongerDisplayed() {
/* 7 */                     FlutterActivityAndFragmentDelegate.this.host.onFlutterUiNoLongerDisplayed();
/* 1 */                     FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = false;
                        }
                    };
/* 11 */            this.host = host;
/* 14 */            this.isFirstFrameRendered = false;
/* 16 */            this.engineGroup = flutterEngineGroup;
                }

                private FlutterEngineGroup.Options addEntrypointOptions(FlutterEngineGroup.Options options) {
/* 3 */             String appBundlePath = this.host.getAppBundlePath();
/* 7 */             if (appBundlePath == null || appBundlePath.isEmpty()) {
/* 23 */                appBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
                    }
/* 35 */            DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName());
/* 40 */            String initialRoute = this.host.getInitialRoute();
/* 44 */            if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
/* 62 */                initialRoute = "/";
                    }
/* 78 */            return options.setDartEntrypoint(dartEntrypoint).setInitialRoute(initialRoute).setDartEntrypointArgs(this.host.getDartEntrypointArgs());
                }

                private void delayFirstAndroidViewDraw(final FlutterView flutterView) {
/* 9 */             if (this.host.getRenderMode() != RenderMode.surface) {
/* 43 */                C1951n4.m6859j("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
/* 46 */                return;
                    }
/* 13 */            if (this.activePreDrawListener != null) {
/* 21 */                flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
                    }
/* 29 */            this.activePreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.2
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public boolean onPreDraw() {
/* 7 */                     if (FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed && FlutterActivityAndFragmentDelegate.this.activePreDrawListener != null) {
/* 21 */                        flutterView.getViewTreeObserver().removeOnPreDrawListener(this);
/* 27 */                        FlutterActivityAndFragmentDelegate.this.activePreDrawListener = null;
                            }
/* 1 */                     return FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed;
                        }
                    };
/* 37 */            flutterView.getViewTreeObserver().addOnPreDrawListener(this.activePreDrawListener);
                }

                private void doInitialFlutterViewRun() {
/* 7 */             if (this.host.getCachedEngineId() == null && !this.flutterEngine.getDartExecutor().isExecutingDart()) {
/* 25 */                String initialRoute = this.host.getInitialRoute();
/* 29 */                if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
/* 47 */                    initialRoute = "/";
                        }
/* 51 */                String dartEntrypointLibraryUri = this.host.getDartEntrypointLibraryUri();
/* 59 */                StringBuilder sb = new StringBuilder("Executing Dart entrypoint: ");
/* 68 */                sb.append(this.host.getDartEntrypointFunctionName());
/* 73 */                sb.append(", library uri: ");
/* 76 */                sb.append(dartEntrypointLibraryUri);
/* 101 */               Log.m4589v(TAG, dartEntrypointLibraryUri + ", and sending initial route: " + initialRoute);
/* 110 */               this.flutterEngine.getNavigationChannel().setInitialRoute(initialRoute);
/* 115 */               String appBundlePath = this.host.getAppBundlePath();
/* 119 */               if (appBundlePath == null || appBundlePath.isEmpty()) {
/* 135 */                   appBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
                        }
/* 139 */               Host host = this.host;
/* 175 */               this.flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypointLibraryUri == null ? new DartExecutor.DartEntrypoint(appBundlePath, host.getDartEntrypointFunctionName()) : new DartExecutor.DartEntrypoint(appBundlePath, dartEntrypointLibraryUri, host.getDartEntrypointFunctionName()), this.host.getDartEntrypointArgs());
                    }
                }

                private void ensureAlive() {
/* 3 */             if (this.host != null) {
/* 5 */                 return;
                    }
/* 8 */             f42.m3656l("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
                }

                private String maybeGetInitialRouteFromIntent(Intent intent) {
                    Uri data;
/* 7 */             if (!this.host.shouldHandleDeeplinking() || (data = intent.getData()) == null) {
/* 20 */                return null;
                    }
/* 15 */            return data.toString();
                }

                public void cancelBackGesture() {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 27 */                Log.m4591w(TAG, "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
                    } else {
/* 12 */                Log.m4589v(TAG, "Forwarding cancelBackGesture() to FlutterEngine.");
/* 21 */                this.flutterEngine.getBackGestureChannel().cancelBackGesture();
                    }
                }

                public void commitBackGesture() {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 27 */                Log.m4591w(TAG, "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
                    } else {
/* 12 */                Log.m4589v(TAG, "Forwarding commitBackGesture() to FlutterEngine.");
/* 21 */                this.flutterEngine.getBackGestureChannel().commitBackGesture();
                    }
                }

                @Override // io.flutter.embedding.android.ExclusiveAppComponent
                public void detachFromFlutterEngine() {
/* 3 */             boolean zShouldDestroyEngineWithHost = this.host.shouldDestroyEngineWithHost();
/* 7 */             Host host = this.host;
/* 9 */             if (!zShouldDestroyEngineWithHost) {
/* 11 */                host.detachFromFlutterEngine();
/* 14 */                return;
                    }
/* 39 */            throw new AssertionError("The internal FlutterEngine created by " + host + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // io.flutter.embedding.android.ExclusiveAppComponent
                public Activity getAppComponent() {
/* 3 */             Activity activity = this.host.getActivity();
/* 7 */             if (activity != null) {
/* 9 */                 return activity;
                    }
/* 12 */            C1951n4.m6856g("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
/* 15 */            return null;
                }

                public FlutterEngine getFlutterEngine() {
/* 1 */             return this.flutterEngine;
                }

                public boolean isAttached() {
/* 1 */             return this.isAttached;
                }

                public boolean isFlutterEngineFromHost() {
/* 1 */             return this.isFlutterEngineFromHost;
                }

                public void onActivityResult(int i, int i2, Intent intent) {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 55 */                Log.m4591w(TAG, "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
/* 58 */                return;
                    }
/* 40 */            Log.m4589v(TAG, "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent);
/* 49 */            this.flutterEngine.getActivityControlSurface().onActivityResult(i, i2, intent);
                }

                public void onAttach(Context context) {
/* 1 */             ensureAlive();
/* 6 */             if (this.flutterEngine == null) {
/* 8 */                 setUpFlutterEngine();
                    }
/* 17 */            if (this.host.shouldAttachEngineToActivity()) {
/* 23 */                Log.m4589v(TAG, "Attaching FlutterEngine to the Activity that owns this delegate.");
/* 38 */                this.flutterEngine.getActivityControlSurface().attachToActivity(this, this.host.getLifecycle());
                    }
/* 43 */            Activity activity = this.host.getActivity();
/* 55 */            this.platformPlugin = this.host.providePlatformPlugin(activity, this.flutterEngine);
/* 65 */            this.sensitiveContentPlugin = this.host.provideSensitiveContentPlugin(activity, this.flutterEngine);
/* 71 */            this.host.configureFlutterEngine(this.flutterEngine);
/* 75 */            this.isAttached = true;
                }

                public void onBackPressed() {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 27 */                Log.m4591w(TAG, "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
                    } else {
/* 12 */                Log.m4589v(TAG, "Forwarding onBackPressed() to FlutterEngine.");
/* 21 */                this.flutterEngine.getNavigationChannel().popRoute();
                    }
                }

                public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i, boolean z) {
/* 5 */             Log.m4589v(TAG, "Creating FlutterView.");
/* 8 */             ensureAlive();
/* 21 */            if (this.host.getRenderMode() == RenderMode.surface) {
/* 42 */                FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(this.host.getContext(), this.host.getTransparencyMode() == TransparencyMode.transparent);
/* 47 */                this.host.onFlutterSurfaceViewCreated(flutterSurfaceView);
/* 61 */                this.flutterView = new FlutterView(this.host.getContext(), flutterSurfaceView);
                    } else {
/* 72 */                FlutterTextureView flutterTextureView = new FlutterTextureView(this.host.getContext());
/* 86 */                flutterTextureView.setOpaque(this.host.getTransparencyMode() == TransparencyMode.opaque);
/* 91 */                this.host.onFlutterTextureViewCreated(flutterTextureView);
/* 105 */               this.flutterView = new FlutterView(this.host.getContext(), flutterTextureView);
                    }
/* 111 */           this.flutterView.addOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
/* 120 */           if (this.host.attachToEngineAutomatically()) {
/* 124 */               Log.m4589v(TAG, "Attaching FlutterEngine to FlutterView.");
/* 131 */               this.flutterView.attachToFlutterEngine(this.flutterEngine);
                    }
/* 136 */           this.flutterView.setId(i);
/* 139 */           if (z) {
/* 143 */               delayFirstAndroidViewDraw(this.flutterView);
                    }
/* 146 */           return this.flutterView;
                }

                public void onDestroyView() {
/* 5 */             Log.m4589v(TAG, "onDestroyView()");
/* 8 */             ensureAlive();
/* 13 */            if (this.activePreDrawListener != null) {
/* 23 */                this.flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
/* 27 */                this.activePreDrawListener = null;
                    }
/* 29 */            FlutterView flutterView = this.flutterView;
/* 31 */            if (flutterView != null) {
/* 33 */                flutterView.detachFromFlutterEngine();
/* 40 */                this.flutterView.removeOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
                    }
                }

                public void onDetach() {
                    FlutterEngine flutterEngine;
/* 3 */             if (this.isAttached) {
/* 10 */                Log.m4589v(TAG, "onDetach()");
/* 13 */                ensureAlive();
/* 20 */                this.host.cleanUpFlutterEngine(this.flutterEngine);
/* 29 */                if (this.host.shouldAttachEngineToActivity()) {
/* 33 */                    Log.m4589v(TAG, "Detaching FlutterEngine from the Activity that owns this Fragment.");
/* 42 */                    boolean zIsChangingConfigurations = this.host.getActivity().isChangingConfigurations();
/* 46 */                    FlutterEngine flutterEngine2 = this.flutterEngine;
/* 48 */                    if (zIsChangingConfigurations) {
/* 54 */                        flutterEngine2.getActivityControlSurface().detachFromActivityForConfigChanges();
                            } else {
/* 62 */                        flutterEngine2.getActivityControlSurface().detachFromActivity();
                            }
                        }
/* 65 */                PlatformPlugin platformPlugin = this.platformPlugin;
/* 68 */                if (platformPlugin != null) {
/* 70 */                    platformPlugin.destroy();
/* 73 */                    this.platformPlugin = null;
                        }
/* 75 */                SensitiveContentPlugin sensitiveContentPlugin = this.sensitiveContentPlugin;
/* 77 */                if (sensitiveContentPlugin != null) {
/* 79 */                    sensitiveContentPlugin.destroy();
/* 82 */                    this.sensitiveContentPlugin = null;
                        }
/* 90 */                if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
/* 100 */                   flutterEngine.getLifecycleChannel().appIsDetached();
                        }
/* 109 */               if (this.host.shouldDestroyEngineWithHost()) {
/* 113 */                   this.flutterEngine.destroy();
/* 122 */                   if (this.host.getCachedEngineId() != null) {
/* 134 */                       FlutterEngineCache.getInstance().remove(this.host.getCachedEngineId());
                            }
/* 137 */                   this.flutterEngine = null;
                        }
/* 140 */               this.isAttached = false;
                    }
                }

                public void onNewIntent(Intent intent) {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 48 */                Log.m4591w(TAG, "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
/* 51 */                return;
                    }
/* 12 */            Log.m4589v(TAG, "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
/* 21 */            this.flutterEngine.getActivityControlSurface().onNewIntent(intent);
/* 24 */            String strMaybeGetInitialRouteFromIntent = maybeGetInitialRouteFromIntent(intent);
/* 28 */            if (strMaybeGetInitialRouteFromIntent == null || strMaybeGetInitialRouteFromIntent.isEmpty()) {
/* 45 */                return;
                    }
/* 42 */            this.flutterEngine.getNavigationChannel().pushRouteInformation(strMaybeGetInitialRouteFromIntent);
                }

                public void onPause() {
                    FlutterEngine flutterEngine;
/* 5 */             Log.m4589v(TAG, "onPause()");
/* 8 */             ensureAlive();
/* 17 */            if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
/* 30 */                return;
                    }
/* 27 */            flutterEngine.getLifecycleChannel().appIsInactive();
                }

                public void onPostResume() {
/* 5 */             Log.m4589v(TAG, "onPostResume()");
/* 8 */             ensureAlive();
/* 13 */            if (this.flutterEngine == null) {
/* 30 */                Log.m4591w(TAG, "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                    } else {
/* 15 */                updateSystemUiOverlays();
/* 24 */                this.flutterEngine.getPlatformViewsController().onResume();
                    }
                }

                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 56 */                Log.m4591w(TAG, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
/* 59 */                return;
                    }
/* 14 */            StringBuilder sbM3793s = fm0.m3793s(i, "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: ", "\npermissions: ");
/* 22 */            sbM3793s.append(Arrays.toString(strArr));
/* 27 */            sbM3793s.append("\ngrantResults: ");
/* 34 */            sbM3793s.append(Arrays.toString(iArr));
/* 41 */            Log.m4589v(TAG, sbM3793s.toString());
/* 50 */            this.flutterEngine.getActivityControlSurface().onRequestPermissionsResult(i, strArr, iArr);
                }

                public void onRestoreInstanceState(Bundle bundle) {
                    Bundle bundle2;
                    byte[] byteArray;
/* 5 */             Log.m4589v(TAG, "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
/* 8 */             ensureAlive();
/* 11 */            if (bundle != null) {
/* 15 */                bundle2 = bundle.getBundle(PLUGINS_RESTORATION_BUNDLE_KEY);
/* 21 */                byteArray = bundle.getByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY);
                    } else {
/* 26 */                bundle2 = null;
/* 27 */                byteArray = null;
                    }
/* 34 */            if (this.host.shouldRestoreAndSaveState()) {
/* 42 */                this.flutterEngine.getRestorationChannel().setRestorationData(byteArray);
                    }
/* 51 */            if (this.host.shouldAttachEngineToActivity()) {
/* 59 */                this.flutterEngine.getActivityControlSurface().onRestoreInstanceState(bundle2);
                    }
                }

                public void onResume() {
                    FlutterEngine flutterEngine;
/* 5 */             Log.m4589v(TAG, "onResume()");
/* 8 */             ensureAlive();
/* 17 */            this.flutterEngine.getRenderer().restoreSurfaceProducers();
/* 26 */            if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
/* 39 */                return;
                    }
/* 36 */            flutterEngine.getLifecycleChannel().appIsResumed();
                }

                public void onSaveInstanceState(Bundle bundle) {
/* 5 */             Log.m4589v(TAG, "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
/* 8 */             ensureAlive();
/* 17 */            if (this.host.shouldRestoreAndSaveState()) {
/* 31 */                bundle.putByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY, this.flutterEngine.getRestorationChannel().getRestorationData());
                    }
/* 40 */            if (this.host.shouldAttachEngineToActivity()) {
/* 44 */                Bundle bundle2 = new Bundle();
/* 53 */                this.flutterEngine.getActivityControlSurface().onSaveInstanceState(bundle2);
/* 58 */                bundle.putBundle(PLUGINS_RESTORATION_BUNDLE_KEY, bundle2);
                    }
/* 67 */            if (this.host.getCachedEngineId() == null || this.host.shouldDestroyEngineWithHost()) {
/* 88 */                return;
                    }
/* 85 */            bundle.putBoolean(ON_BACK_CALLBACK_ENABLED_KEY, this.host.getBackCallbackState());
                }

                public void onStart() {
/* 5 */             Log.m4589v(TAG, "onStart()");
/* 8 */             ensureAlive();
/* 11 */            doInitialFlutterViewRun();
/* 14 */            Integer num = this.previousVisibility;
/* 16 */            if (num != null) {
/* 24 */                this.flutterView.setVisibility(num.intValue());
                    }
                }

                public void onStop() {
                    FlutterEngine flutterEngine;
/* 5 */             Log.m4589v(TAG, "onStop()");
/* 8 */             ensureAlive();
/* 17 */            if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
/* 27 */                flutterEngine.getLifecycleChannel().appIsPaused();
                    }
/* 40 */            this.previousVisibility = Integer.valueOf(this.flutterView.getVisibility());
/* 46 */            this.flutterView.setVisibility(8);
/* 49 */            FlutterEngine flutterEngine2 = this.flutterEngine;
/* 51 */            if (flutterEngine2 != null) {
/* 59 */                flutterEngine2.getRenderer().onTrimMemory(40);
                    }
                }

                public void onTrimMemory(int i) {
/* 1 */             ensureAlive();
/* 4 */             FlutterEngine flutterEngine = this.flutterEngine;
/* 6 */             if (flutterEngine != null) {
/* 10 */                if (this.isFirstFrameRendered && i >= 10) {
/* 20 */                    flutterEngine.getDartExecutor().notifyLowMemoryWarning();
/* 29 */                    this.flutterEngine.getSystemChannel().sendMemoryPressureWarning();
                        }
/* 38 */                this.flutterEngine.getRenderer().onTrimMemory(i);
/* 47 */                this.flutterEngine.getPlatformViewsController().onTrimMemory(i);
                    }
                }

                public void onUserLeaveHint() {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 27 */                Log.m4591w(TAG, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                    } else {
/* 12 */                Log.m4589v(TAG, "Forwarding onUserLeaveHint() to FlutterEngine.");
/* 21 */                this.flutterEngine.getActivityControlSurface().onUserLeaveHint();
                    }
                }

                public void onWindowFocusChanged(boolean z) {
                    FlutterEngine flutterEngine;
/* 1 */             ensureAlive();
/* 19 */            Log.m4589v(TAG, "Received onWindowFocusChanged: ".concat(z ? "true" : "false"));
/* 28 */            if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
/* 51 */                return;
                    }
/* 34 */            if (z) {
/* 40 */                flutterEngine.getLifecycleChannel().aWindowIsFocused();
                    } else {
/* 48 */                flutterEngine.getLifecycleChannel().noWindowsAreFocused();
                    }
                }

                public void release() {
/* 2 */             this.host = null;
/* 4 */             this.flutterEngine = null;
/* 6 */             this.flutterView = null;
/* 8 */             this.platformPlugin = null;
/* 10 */            this.sensitiveContentPlugin = null;
                }

                public void setUpFlutterEngine() {
/* 5 */             Log.m4589v(TAG, "Setting up FlutterEngine.");
/* 10 */            String cachedEngineId = this.host.getCachedEngineId();
/* 17 */            if (cachedEngineId != null) {
/* 23 */                FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(cachedEngineId);
/* 27 */                this.flutterEngine = flutterEngine;
/* 29 */                this.isFlutterEngineFromHost = true;
/* 31 */                if (flutterEngine != null) {
/* 33 */                    return;
                        }
/* 40 */                f42.m3656l(fm0.m3784j("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", cachedEngineId, "'"));
/* 43 */                return;
                    }
/* 44 */            Host host = this.host;
/* 50 */            FlutterEngine flutterEngineProvideFlutterEngine = host.provideFlutterEngine(host.getContext());
/* 54 */            this.flutterEngine = flutterEngineProvideFlutterEngine;
/* 56 */            if (flutterEngineProvideFlutterEngine != null) {
/* 58 */                this.isFlutterEngineFromHost = true;
/* 60 */                return;
                    }
/* 63 */            String cachedEngineGroupId = this.host.getCachedEngineGroupId();
/* 68 */            if (cachedEngineGroupId != null) {
/* 74 */                FlutterEngineGroup flutterEngineGroup = FlutterEngineGroupCache.getInstance().get(cachedEngineGroupId);
/* 78 */                if (flutterEngineGroup == null) {
/* 110 */                   f42.m3656l(fm0.m3784j("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", cachedEngineGroupId, "'"));
/* 113 */                   return;
                        } else {
/* 99 */                    this.flutterEngine = flutterEngineGroup.createAndRunEngine(addEntrypointOptions(new FlutterEngineGroup.Options(this.host.getContext())));
/* 101 */                   this.isFlutterEngineFromHost = false;
/* 103 */                   return;
                        }
                    }
/* 116 */           Log.m4589v(TAG, "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
/* 119 */           FlutterEngineGroup flutterEngineGroup2 = this.engineGroup;
/* 121 */           if (flutterEngineGroup2 == null) {
/* 141 */               flutterEngineGroup2 = new FlutterEngineGroup(this.host.getContext(), this.host.getFlutterShellArgs().toArray());
                    }
/* 177 */           this.flutterEngine = flutterEngineGroup2.createAndRunEngine(addEntrypointOptions(new FlutterEngineGroup.Options(this.host.getContext()).setAutomaticallyRegisterPlugins(false).setWaitForRestorationData(this.host.shouldRestoreAndSaveState())));
/* 179 */           this.isFlutterEngineFromHost = false;
                }

                public void startBackGesture(BackEvent backEvent) {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 27 */                Log.m4591w(TAG, "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                    } else {
/* 12 */                Log.m4589v(TAG, "Forwarding startBackGesture() to FlutterEngine.");
/* 21 */                this.flutterEngine.getBackGestureChannel().startBackGesture(backEvent);
                    }
                }

                public void updateBackGestureProgress(BackEvent backEvent) {
/* 1 */             ensureAlive();
/* 8 */             if (this.flutterEngine == null) {
/* 27 */                Log.m4591w(TAG, "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                    } else {
/* 12 */                Log.m4589v(TAG, "Forwarding updateBackGestureProgress() to FlutterEngine.");
/* 21 */                this.flutterEngine.getBackGestureChannel().updateBackGestureProgress(backEvent);
                    }
                }

                public void updateSystemUiOverlays() {
/* 1 */             PlatformPlugin platformPlugin = this.platformPlugin;
/* 3 */             if (platformPlugin != null) {
/* 5 */                 platformPlugin.updateSystemUiOverlays();
                    }
                }

/* 18 */        public FlutterActivityAndFragmentDelegate(Host host) {
/* 19 */            this(host, null);
                }
            }
