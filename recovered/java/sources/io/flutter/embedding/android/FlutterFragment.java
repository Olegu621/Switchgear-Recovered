            package io.flutter.embedding.android;

            import android.app.Activity;
            import android.content.ComponentCallbacks2;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import androidx.fragment.app.Fragment;
            import androidx.fragment.app.FragmentActivity;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.embedding.engine.FlutterShellArgs;
            import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
            import io.flutter.plugin.platform.PlatformPlugin;
            import io.flutter.plugin.view.SensitiveContentPlugin;
            import java.util.ArrayList;
            import java.util.List;
            import p000.C1951n4;
            import p000.g71;
            import p000.kp1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 26 */    public class FlutterFragment extends Fragment implements FlutterActivityAndFragmentDelegate.Host, ComponentCallbacks2, FlutterActivityAndFragmentDelegate.DelegateFactory {
                protected static final String ARG_APP_BUNDLE_PATH = "app_bundle_path";
                protected static final String ARG_CACHED_ENGINE_GROUP_ID = "cached_engine_group_id";
                protected static final String ARG_CACHED_ENGINE_ID = "cached_engine_id";
                protected static final String ARG_DART_ENTRYPOINT = "dart_entrypoint";
                protected static final String ARG_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
                protected static final String ARG_DART_ENTRYPOINT_URI = "dart_entrypoint_uri";
                protected static final String ARG_DESTROY_ENGINE_WITH_FRAGMENT = "destroy_engine_with_fragment";
                protected static final String ARG_ENABLE_STATE_RESTORATION = "enable_state_restoration";
                protected static final String ARG_FLUTTERVIEW_RENDER_MODE = "flutterview_render_mode";
                protected static final String ARG_FLUTTERVIEW_TRANSPARENCY_MODE = "flutterview_transparency_mode";
                protected static final String ARG_FLUTTER_INITIALIZATION_ARGS = "initialization_args";
                protected static final String ARG_HANDLE_DEEPLINKING = "handle_deeplinking";
                protected static final String ARG_INITIAL_ROUTE = "initial_route";
                protected static final String ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY = "should_attach_engine_to_activity";
                protected static final String ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED = "should_automatically_handle_on_back_pressed";
                protected static final String ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW = "should_delay_first_android_view_draw";
                public static final int FLUTTER_VIEW_ID = View.generateViewId();
                private static final String TAG = "FlutterFragment";
                FlutterActivityAndFragmentDelegate delegate;
                private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.flutter.embedding.android.FlutterFragment.1
                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public void onWindowFocusChanged(boolean z) {
/* 9 */                 if (FlutterFragment.this.stillAttachedForEvent("onWindowFocusChanged")) {
/* 15 */                    FlutterFragment.this.delegate.onWindowFocusChanged(z);
                        }
                    }
                };
                private FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory = this;
                final kp1 onBackPressedCallback = new kp1(true) { // from class: io.flutter.embedding.android.FlutterFragment.2
                    @Override // p000.kp1
                    public void handleOnBackPressed() {
/* 3 */                 FlutterFragment.this.onBackPressed();
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public @interface ActivityCallThrough {
                }

                public FlutterFragment() {
/* 26 */            setArguments(new Bundle());
                }

                public static FlutterFragment createDefault() {
/* 6 */             return new NewEngineFragmentBuilder().build();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public boolean stillAttachedForEvent(String str) {
/* 1 */             FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
/* 10 */            if (flutterActivityAndFragmentDelegate == null) {
/* 39 */                Log.m4591w(TAG, "FlutterFragment " + hashCode() + " " + str + " called after release.");
/* 3 */                 return false;
                    }
/* 47 */            if (flutterActivityAndFragmentDelegate.isAttached()) {
/* 80 */                return true;
                    }
/* 76 */            Log.m4591w(TAG, "FlutterFragment " + hashCode() + " " + str + " called after detach.");
/* 3 */             return false;
                }

                public static CachedEngineFragmentBuilder withCachedEngine(String str) {
/* 4 */             return new CachedEngineFragmentBuilder(str);
                }

                public static NewEngineFragmentBuilder withNewEngine() {
/* 3 */             return new NewEngineFragmentBuilder();
                }

                public static NewEngineInGroupFragmentBuilder withNewEngineInGroup(String str) {
/* 3 */             return new NewEngineInGroupFragmentBuilder(str);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean attachToEngineAutomatically() {
/* 1 */             return true;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
                public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
/* 1 */             g71 activity = getActivity();
/* 7 */             if (activity instanceof FlutterEngineConfigurator) {
/* 11 */                ((FlutterEngineConfigurator) activity).cleanUpFlutterEngine(flutterEngine);
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
                public void configureFlutterEngine(FlutterEngine flutterEngine) {
/* 1 */             g71 activity = getActivity();
/* 7 */             if (activity instanceof FlutterEngineConfigurator) {
/* 11 */                ((FlutterEngineConfigurator) activity).configureFlutterEngine(flutterEngine);
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.DelegateFactory
                public FlutterActivityAndFragmentDelegate createDelegate(FlutterActivityAndFragmentDelegate.Host host) {
/* 3 */             return new FlutterActivityAndFragmentDelegate(host);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void detachFromFlutterEngine() {
/* 34 */            Log.m4591w(TAG, "FlutterFragment " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
/* 37 */            FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
/* 39 */            if (flutterActivityAndFragmentDelegate != null) {
/* 41 */                flutterActivityAndFragmentDelegate.onDestroyView();
/* 46 */                this.delegate.onDetach();
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public /* bridge */ /* synthetic */ Activity getActivity() {
/* 1 */             return getActivity();
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getAppBundlePath() {
/* 7 */             return getArguments().getString(ARG_APP_BUNDLE_PATH);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean getBackCallbackState() {
/* 3 */             return this.onBackPressedCallback.isEnabled();
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getCachedEngineGroupId() {
/* 8 */             return getArguments().getString(ARG_CACHED_ENGINE_GROUP_ID, null);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getCachedEngineId() {
/* 8 */             return getArguments().getString(ARG_CACHED_ENGINE_ID, null);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public List<String> getDartEntrypointArgs() {
/* 7 */             return getArguments().getStringArrayList(ARG_DART_ENTRYPOINT_ARGS);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getDartEntrypointFunctionName() {
/* 9 */             return getArguments().getString(ARG_DART_ENTRYPOINT, "main");
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getDartEntrypointLibraryUri() {
/* 7 */             return getArguments().getString(ARG_DART_ENTRYPOINT_URI);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public ExclusiveAppComponent<Activity> getExclusiveAppComponent() {
/* 1 */             return this.delegate;
                }

                public FlutterEngine getFlutterEngine() {
/* 3 */             return this.delegate.getFlutterEngine();
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public FlutterShellArgs getFlutterShellArgs() {
/* 7 */             String[] stringArray = getArguments().getStringArray(ARG_FLUTTER_INITIALIZATION_ARGS);
/* 13 */            if (stringArray == null) {
/* 17 */                stringArray = new String[0];
                    }
/* 19 */            return new FlutterShellArgs(stringArray);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getInitialRoute() {
/* 7 */             return getArguments().getString(ARG_INITIAL_ROUTE);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public RenderMode getRenderMode() {
/* 17 */            return RenderMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_RENDER_MODE, RenderMode.surface.name()));
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public TransparencyMode getTransparencyMode() {
/* 17 */            return TransparencyMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_TRANSPARENCY_MODE, TransparencyMode.transparent.name()));
                }

                public boolean isFlutterEngineInjected() {
/* 3 */             return this.delegate.isFlutterEngineFromHost();
                }

                @Override // androidx.fragment.app.Fragment
                public void onActivityResult(int i, int i2, Intent intent) {
/* 7 */             if (stillAttachedForEvent("onActivityResult")) {
/* 11 */                this.delegate.onActivityResult(i, i2, intent);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onAttach(Context context) {
/* 1 */             super.onAttach(context);
/* 6 */             FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegateCreateDelegate = this.delegateFactory.createDelegate(this);
/* 10 */            this.delegate = flutterActivityAndFragmentDelegateCreateDelegate;
/* 12 */            flutterActivityAndFragmentDelegateCreateDelegate.onAttach(context);
/* 26 */            if (getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false)) {
/* 38 */                requireActivity().getOnBackPressedDispatcher().m8601a(this, this.onBackPressedCallback);
/* 43 */                this.onBackPressedCallback.setEnabled(false);
                    }
/* 46 */            context.registerComponentCallbacks(this);
                }

                public void onBackPressed() {
/* 7 */             if (stillAttachedForEvent("onBackPressed")) {
/* 11 */                this.delegate.onBackPressed();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             if (bundle != null) {
/* 14 */                this.onBackPressedCallback.setEnabled(bundle.getBoolean("enableOnBackInvokedCallbackState"));
                    }
/* 19 */            this.delegate.onRestoreInstanceState(bundle);
                }

                @Override // androidx.fragment.app.Fragment
                public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
/* 12 */            return this.delegate.onCreateView(layoutInflater, viewGroup, bundle, FLUTTER_VIEW_ID, shouldDelayFirstAndroidViewDraw());
                }

                @Override // androidx.fragment.app.Fragment
                public void onDestroyView() {
/* 1 */             super.onDestroyView();
/* 14 */            requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
/* 23 */            if (stillAttachedForEvent("onDestroyView")) {
/* 27 */                this.delegate.onDestroyView();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onDetach() {
/* 5 */             getContext().unregisterComponentCallbacks(this);
/* 8 */             super.onDetach();
/* 11 */            FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
/* 13 */            if (flutterActivityAndFragmentDelegate != null) {
/* 15 */                flutterActivityAndFragmentDelegate.onDetach();
/* 20 */                this.delegate.release();
/* 24 */                this.delegate = null;
                    } else {
/* 48 */                Log.m4589v(TAG, "FlutterFragment " + this + " onDetach called after release.");
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void onFlutterUiDisplayed() {
/* 1 */             g71 activity = getActivity();
/* 7 */             if (activity instanceof FlutterUiDisplayListener) {
/* 11 */                ((FlutterUiDisplayListener) activity).onFlutterUiDisplayed();
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void onFlutterUiNoLongerDisplayed() {
/* 1 */             g71 activity = getActivity();
/* 7 */             if (activity instanceof FlutterUiDisplayListener) {
/* 11 */                ((FlutterUiDisplayListener) activity).onFlutterUiNoLongerDisplayed();
                    }
                }

                public void onNewIntent(Intent intent) {
/* 7 */             if (stillAttachedForEvent("onNewIntent")) {
/* 11 */                this.delegate.onNewIntent(intent);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onPause() {
/* 1 */             super.onPause();
/* 10 */            if (stillAttachedForEvent("onPause")) {
/* 14 */                this.delegate.onPause();
                    }
                }

                public void onPostResume() {
/* 7 */             if (stillAttachedForEvent("onPostResume")) {
/* 11 */                this.delegate.onPostResume();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 7 */             if (stillAttachedForEvent("onRequestPermissionsResult")) {
/* 11 */                this.delegate.onRequestPermissionsResult(i, strArr, iArr);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onResume() {
/* 1 */             super.onResume();
/* 10 */            if (stillAttachedForEvent("onResume")) {
/* 14 */                this.delegate.onResume();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 10 */            if (stillAttachedForEvent("onSaveInstanceState")) {
/* 14 */                this.delegate.onSaveInstanceState(bundle);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onStart() {
/* 1 */             super.onStart();
/* 10 */            if (stillAttachedForEvent("onStart")) {
/* 14 */                this.delegate.onStart();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onStop() {
/* 1 */             super.onStop();
/* 10 */            if (stillAttachedForEvent("onStop")) {
/* 14 */                this.delegate.onStop();
                    }
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
/* 7 */             if (stillAttachedForEvent("onTrimMemory")) {
/* 11 */                this.delegate.onTrimMemory(i);
                    }
                }

                public void onUserLeaveHint() {
/* 7 */             if (stillAttachedForEvent("onUserLeaveHint")) {
/* 11 */                this.delegate.onUserLeaveHint();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onViewCreated(View view, Bundle bundle) {
/* 1 */             super.onViewCreated(view, bundle);
/* 10 */            view.getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
                }

                @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
                public boolean popSystemNavigator() {
                    FragmentActivity activity;
/* 12 */            if (!getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false) || (activity = getActivity()) == null) {
/* 7 */                 return false;
                    }
/* 22 */            boolean zIsEnabled = this.onBackPressedCallback.isEnabled();
/* 26 */            if (zIsEnabled) {
/* 30 */                this.onBackPressedCallback.setEnabled(false);
                    }
/* 37 */            activity.getOnBackPressedDispatcher().m8602b();
/* 41 */            if (zIsEnabled) {
/* 45 */                this.onBackPressedCallback.setEnabled(true);
                    }
/* 40 */            return true;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
                public FlutterEngine provideFlutterEngine(Context context) {
/* 1 */             g71 activity = getActivity();
/* 7 */             if (!(activity instanceof FlutterEngineProvider)) {
/* 27 */                return null;
                    }
/* 13 */            Log.m4589v(TAG, "Deferring to attached Activity to provide a FlutterEngine.");
/* 22 */            return ((FlutterEngineProvider) activity).provideFlutterEngine(getContext());
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
/* 1 */             if (activity != null) {
/* 13 */                return new PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
                    }
/* 17 */            return null;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public SensitiveContentPlugin provideSensitiveContentPlugin(Activity activity, FlutterEngine flutterEngine) {
/* 1 */             if (activity != null) {
/* 11 */                return new SensitiveContentPlugin(FLUTTER_VIEW_ID, activity, flutterEngine.getSensitiveContentChannel());
                    }
/* 15 */            return null;
                }

                public void setDelegateFactory(FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory) {
/* 1 */             this.delegateFactory = delegateFactory;
/* 7 */             this.delegate = delegateFactory.createDelegate(this);
                }

                @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
                public void setFrameworkHandlesBack(boolean z) {
/* 12 */            if (getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false)) {
/* 17 */                this.onBackPressedCallback.setEnabled(z);
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldAttachEngineToActivity() {
/* 7 */             return getArguments().getBoolean(ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY);
                }

                public boolean shouldDelayFirstAndroidViewDraw() {
/* 7 */             return getArguments().getBoolean(ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldDestroyEngineWithHost() {
                    return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, false) : getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldDispatchAppLifecycleState() {
/* 1 */             return true;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldHandleDeeplinking() {
/* 7 */             return getArguments().getBoolean(ARG_HANDLE_DEEPLINKING);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldRestoreAndSaveState() {
/* 11 */            if (getArguments().containsKey(ARG_ENABLE_STATE_RESTORATION)) {
/* 17 */                return getArguments().getBoolean(ARG_ENABLE_STATE_RESTORATION);
                    }
                    return getCachedEngineId() == null;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void updateSystemUiOverlays() {
/* 1 */             FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
/* 3 */             if (flutterActivityAndFragmentDelegate != null) {
/* 5 */                 flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 27 */        public static class CachedEngineFragmentBuilder {
                    private boolean destroyEngineWithFragment;
                    private final String engineId;
                    private final Class<? extends FlutterFragment> fragmentClass;
                    private boolean handleDeeplinking;
                    private RenderMode renderMode;
                    private boolean shouldAttachEngineToActivity;
                    private boolean shouldAutomaticallyHandleOnBackPressed;
                    private boolean shouldDelayFirstAndroidViewDraw;
                    private TransparencyMode transparencyMode;

                    public CachedEngineFragmentBuilder(Class<? extends FlutterFragment> cls, String str) {
/* 5 */                 this.destroyEngineWithFragment = false;
/* 7 */                 this.handleDeeplinking = false;
/* 11 */                this.renderMode = RenderMode.surface;
/* 15 */                this.transparencyMode = TransparencyMode.transparent;
/* 18 */                this.shouldAttachEngineToActivity = true;
/* 20 */                this.shouldAutomaticallyHandleOnBackPressed = false;
/* 22 */                this.shouldDelayFirstAndroidViewDraw = false;
/* 24 */                this.fragmentClass = cls;
/* 26 */                this.engineId = str;
                    }

                    public <T extends FlutterFragment> T build() {
                        try {
/* 14 */                    T t = (T) this.fragmentClass.getDeclaredConstructor(null).newInstance(null);
/* 16 */                    if (t != null) {
/* 22 */                        t.setArguments(createArgs());
/* 25 */                        return t;
                            }
/* 56 */                    throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
                        } catch (Exception e) {
/* 67 */                    C1951n4.m6861l("Could not instantiate FlutterFragment subclass (", this.fragmentClass.getName(), ")", e);
/* 3 */                     return null;
                        }
                    }

                    public Bundle createArgs() {
/* 3 */                 Bundle bundle = new Bundle();
/* 10 */                bundle.putString(FlutterFragment.ARG_CACHED_ENGINE_ID, this.engineId);
/* 17 */                bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, this.destroyEngineWithFragment);
/* 24 */                bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
/* 27 */                RenderMode renderMode = this.renderMode;
/* 29 */                if (renderMode == null) {
/* 36 */                    renderMode = RenderMode.surface;
                        }
/* 41 */                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
/* 44 */                TransparencyMode transparencyMode = this.transparencyMode;
/* 46 */                if (transparencyMode == null) {
/* 53 */                    transparencyMode = TransparencyMode.transparent;
                        }
/* 58 */                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
/* 65 */                bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
/* 72 */                bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
/* 79 */                bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
/* 82 */                return bundle;
                    }

                    public CachedEngineFragmentBuilder destroyEngineWithFragment(boolean z) {
/* 1 */                 this.destroyEngineWithFragment = z;
/* 3 */                 return this;
                    }

                    public CachedEngineFragmentBuilder handleDeeplinking(Boolean bool) {
/* 5 */                 this.handleDeeplinking = bool.booleanValue();
/* 7 */                 return this;
                    }

                    public CachedEngineFragmentBuilder renderMode(RenderMode renderMode) {
/* 1 */                 this.renderMode = renderMode;
/* 3 */                 return this;
                    }

                    public CachedEngineFragmentBuilder shouldAttachEngineToActivity(boolean z) {
/* 1 */                 this.shouldAttachEngineToActivity = z;
/* 3 */                 return this;
                    }

                    public CachedEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z) {
/* 1 */                 this.shouldAutomaticallyHandleOnBackPressed = z;
/* 3 */                 return this;
                    }

                    public CachedEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z) {
/* 1 */                 this.shouldDelayFirstAndroidViewDraw = z;
/* 3 */                 return this;
                    }

                    public CachedEngineFragmentBuilder transparencyMode(TransparencyMode transparencyMode) {
/* 1 */                 this.transparencyMode = transparencyMode;
/* 3 */                 return this;
                    }

/* 28 */            private CachedEngineFragmentBuilder(String str) {
/* 29 */                this((Class<? extends FlutterFragment>) FlutterFragment.class, str);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 33 */        public static class NewEngineInGroupFragmentBuilder {
                    private final String cachedEngineGroupId;
                    private String dartEntrypoint;
                    private final Class<? extends FlutterFragment> fragmentClass;
                    private boolean handleDeeplinking;
                    private String initialRoute;
                    private RenderMode renderMode;
                    private boolean shouldAttachEngineToActivity;
                    private boolean shouldAutomaticallyHandleOnBackPressed;
                    private boolean shouldDelayFirstAndroidViewDraw;
                    private TransparencyMode transparencyMode;

                    public NewEngineInGroupFragmentBuilder(Class<? extends FlutterFragment> cls, String str) {
/* 6 */                 this.dartEntrypoint = "main";
/* 10 */                this.initialRoute = "/";
/* 13 */                this.handleDeeplinking = false;
/* 17 */                this.renderMode = RenderMode.surface;
/* 21 */                this.transparencyMode = TransparencyMode.transparent;
/* 24 */                this.shouldAttachEngineToActivity = true;
/* 26 */                this.shouldAutomaticallyHandleOnBackPressed = false;
/* 28 */                this.shouldDelayFirstAndroidViewDraw = false;
/* 30 */                this.fragmentClass = cls;
/* 32 */                this.cachedEngineGroupId = str;
                    }

                    public <T extends FlutterFragment> T build() {
                        try {
/* 14 */                    T t = (T) this.fragmentClass.getDeclaredConstructor(null).newInstance(null);
/* 16 */                    if (t != null) {
/* 22 */                        t.setArguments(createArgs());
/* 25 */                        return t;
                            }
/* 56 */                    throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
                        } catch (Exception e) {
/* 67 */                    C1951n4.m6861l("Could not instantiate FlutterFragment subclass (", this.fragmentClass.getName(), ")", e);
/* 3 */                     return null;
                        }
                    }

                    public Bundle createArgs() {
/* 3 */                 Bundle bundle = new Bundle();
/* 10 */                bundle.putString(FlutterFragment.ARG_CACHED_ENGINE_GROUP_ID, this.cachedEngineGroupId);
/* 17 */                bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
/* 24 */                bundle.putString(FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
/* 31 */                bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
/* 34 */                RenderMode renderMode = this.renderMode;
/* 36 */                if (renderMode == null) {
/* 43 */                    renderMode = RenderMode.surface;
                        }
/* 48 */                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
/* 51 */                TransparencyMode transparencyMode = this.transparencyMode;
/* 53 */                if (transparencyMode == null) {
/* 60 */                    transparencyMode = TransparencyMode.transparent;
                        }
/* 65 */                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
/* 72 */                bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
/* 78 */                bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
/* 85 */                bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
/* 92 */                bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
/* 95 */                return bundle;
                    }

                    public NewEngineInGroupFragmentBuilder dartEntrypoint(String str) {
/* 1 */                 this.dartEntrypoint = str;
/* 3 */                 return this;
                    }

                    public NewEngineInGroupFragmentBuilder handleDeeplinking(boolean z) {
/* 1 */                 this.handleDeeplinking = z;
/* 3 */                 return this;
                    }

                    public NewEngineInGroupFragmentBuilder initialRoute(String str) {
/* 1 */                 this.initialRoute = str;
/* 3 */                 return this;
                    }

                    public NewEngineInGroupFragmentBuilder renderMode(RenderMode renderMode) {
/* 1 */                 this.renderMode = renderMode;
/* 3 */                 return this;
                    }

                    public NewEngineInGroupFragmentBuilder shouldAttachEngineToActivity(boolean z) {
/* 1 */                 this.shouldAttachEngineToActivity = z;
/* 3 */                 return this;
                    }

                    public NewEngineInGroupFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z) {
/* 1 */                 this.shouldAutomaticallyHandleOnBackPressed = z;
/* 3 */                 return this;
                    }

                    public NewEngineInGroupFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z) {
/* 1 */                 this.shouldDelayFirstAndroidViewDraw = z;
/* 3 */                 return this;
                    }

                    public NewEngineInGroupFragmentBuilder transparencyMode(TransparencyMode transparencyMode) {
/* 1 */                 this.transparencyMode = transparencyMode;
/* 3 */                 return this;
                    }

/* 34 */            public NewEngineInGroupFragmentBuilder(String str) {
/* 35 */                this(FlutterFragment.class, str);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 40 */        public static class NewEngineFragmentBuilder {
                    private String appBundlePath;
                    private String dartEntrypoint;
                    private List<String> dartEntrypointArgs;
                    private String dartLibraryUri;
                    private final Class<? extends FlutterFragment> fragmentClass;
                    private boolean handleDeeplinking;
                    private String initialRoute;
                    private RenderMode renderMode;
                    private FlutterShellArgs shellArgs;
                    private boolean shouldAttachEngineToActivity;
                    private boolean shouldAutomaticallyHandleOnBackPressed;
                    private boolean shouldDelayFirstAndroidViewDraw;
                    private TransparencyMode transparencyMode;

                    public NewEngineFragmentBuilder() {
/* 6 */                 this.dartEntrypoint = "main";
/* 9 */                 this.dartLibraryUri = null;
/* 13 */                this.initialRoute = "/";
/* 16 */                this.handleDeeplinking = false;
/* 18 */                this.appBundlePath = null;
/* 20 */                this.shellArgs = null;
/* 24 */                this.renderMode = RenderMode.surface;
/* 28 */                this.transparencyMode = TransparencyMode.transparent;
/* 31 */                this.shouldAttachEngineToActivity = true;
/* 33 */                this.shouldAutomaticallyHandleOnBackPressed = false;
/* 35 */                this.shouldDelayFirstAndroidViewDraw = false;
/* 39 */                this.fragmentClass = FlutterFragment.class;
                    }

                    public NewEngineFragmentBuilder appBundlePath(String str) {
/* 1 */                 this.appBundlePath = str;
/* 3 */                 return this;
                    }

                    public <T extends FlutterFragment> T build() {
                        try {
/* 14 */                    T t = (T) this.fragmentClass.getDeclaredConstructor(null).newInstance(null);
/* 16 */                    if (t != null) {
/* 22 */                        t.setArguments(createArgs());
/* 25 */                        return t;
                            }
/* 56 */                    throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
                        } catch (Exception e) {
/* 67 */                    C1951n4.m6861l("Could not instantiate FlutterFragment subclass (", this.fragmentClass.getName(), ")", e);
/* 3 */                     return null;
                        }
                    }

                    public Bundle createArgs() {
/* 3 */                 Bundle bundle = new Bundle();
/* 10 */                bundle.putString(FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
/* 17 */                bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
/* 24 */                bundle.putString(FlutterFragment.ARG_APP_BUNDLE_PATH, this.appBundlePath);
/* 31 */                bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
/* 38 */                bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT_URI, this.dartLibraryUri);
/* 56 */                bundle.putStringArrayList(FlutterFragment.ARG_DART_ENTRYPOINT_ARGS, this.dartEntrypointArgs != null ? new ArrayList<>(this.dartEntrypointArgs) : null);
/* 59 */                FlutterShellArgs flutterShellArgs = this.shellArgs;
/* 61 */                if (flutterShellArgs != null) {
/* 69 */                    bundle.putStringArray(FlutterFragment.ARG_FLUTTER_INITIALIZATION_ARGS, flutterShellArgs.toArray());
                        }
/* 72 */                RenderMode renderMode = this.renderMode;
/* 74 */                if (renderMode == null) {
/* 81 */                    renderMode = RenderMode.surface;
                        }
/* 86 */                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
/* 89 */                TransparencyMode transparencyMode = this.transparencyMode;
/* 91 */                if (transparencyMode == null) {
/* 98 */                    transparencyMode = TransparencyMode.transparent;
                        }
/* 103 */               bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
/* 110 */               bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
/* 116 */               bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
/* 123 */               bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
/* 130 */               bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
/* 133 */               return bundle;
                    }

                    public NewEngineFragmentBuilder dartEntrypoint(String str) {
/* 1 */                 this.dartEntrypoint = str;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder dartEntrypointArgs(List<String> list) {
/* 1 */                 this.dartEntrypointArgs = list;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder dartLibraryUri(String str) {
/* 1 */                 this.dartLibraryUri = str;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder flutterShellArgs(FlutterShellArgs flutterShellArgs) {
/* 1 */                 this.shellArgs = flutterShellArgs;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder handleDeeplinking(Boolean bool) {
/* 5 */                 this.handleDeeplinking = bool.booleanValue();
/* 7 */                 return this;
                    }

                    public NewEngineFragmentBuilder initialRoute(String str) {
/* 1 */                 this.initialRoute = str;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder renderMode(RenderMode renderMode) {
/* 1 */                 this.renderMode = renderMode;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder shouldAttachEngineToActivity(boolean z) {
/* 1 */                 this.shouldAttachEngineToActivity = z;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z) {
/* 1 */                 this.shouldAutomaticallyHandleOnBackPressed = z;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z) {
/* 1 */                 this.shouldDelayFirstAndroidViewDraw = z;
/* 3 */                 return this;
                    }

                    public NewEngineFragmentBuilder transparencyMode(TransparencyMode transparencyMode) {
/* 1 */                 this.transparencyMode = transparencyMode;
/* 3 */                 return this;
                    }

/* 41 */            public NewEngineFragmentBuilder(Class<? extends FlutterFragment> cls) {
/* 43 */                this.dartEntrypoint = "main";
/* 44 */                this.dartLibraryUri = null;
/* 45 */                this.initialRoute = "/";
/* 46 */                this.handleDeeplinking = false;
/* 47 */                this.appBundlePath = null;
/* 48 */                this.shellArgs = null;
/* 49 */                this.renderMode = RenderMode.surface;
/* 50 */                this.transparencyMode = TransparencyMode.transparent;
/* 51 */                this.shouldAttachEngineToActivity = true;
/* 52 */                this.shouldAutomaticallyHandleOnBackPressed = false;
/* 53 */                this.shouldDelayFirstAndroidViewDraw = false;
/* 54 */                this.fragmentClass = cls;
                    }
                }
            }
