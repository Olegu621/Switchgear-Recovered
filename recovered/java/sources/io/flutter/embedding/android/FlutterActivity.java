            package io.flutter.embedding.android;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.graphics.drawable.ColorDrawable;
            import android.os.Build;
            import android.os.Bundle;
            import android.view.View;
            import android.view.Window;
            import android.window.BackEvent;
            import android.window.OnBackAnimationCallback;
            import android.window.OnBackInvokedCallback;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.embedding.engine.FlutterShellArgs;
            import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
            import io.flutter.plugin.platform.PlatformPlugin;
            import io.flutter.plugin.view.SensitiveContentPlugin;
            import java.util.ArrayList;
            import java.util.List;
            import p000.C1994oa;
            import p000.g71;
            import p000.i71;
            import p000.t61;
            import p000.v61;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterActivity extends Activity implements FlutterActivityAndFragmentDelegate.Host, g71 {
                public static final int FLUTTER_VIEW_ID = View.generateViewId();
                private static final String TAG = "FlutterActivity";
                protected FlutterActivityAndFragmentDelegate delegate;
                boolean hasRegisteredBackCallback = false;
                private i71 lifecycle;
                private final OnBackInvokedCallback onBackInvokedCallback;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CachedEngineIntentBuilder {
                    private final Class<? extends FlutterActivity> activityClass;
                    private final String cachedEngineId;
                    private boolean destroyEngineWithActivity = false;
                    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

                    public CachedEngineIntentBuilder(Class<? extends FlutterActivity> cls, String str) {
/* 11 */                this.activityClass = cls;
/* 13 */                this.cachedEngineId = str;
                    }

                    public CachedEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
/* 5 */                 this.backgroundMode = backgroundMode.name();
/* 7 */                 return this;
                    }

                    public Intent build(Context context) {
/* 28 */                return new Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode);
                    }

                    public CachedEngineIntentBuilder destroyEngineWithActivity(boolean z) {
/* 1 */                 this.destroyEngineWithActivity = z;
/* 3 */                 return this;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class NewEngineInGroupIntentBuilder {
                    private final Class<? extends FlutterActivity> activityClass;
                    private final String cachedEngineGroupId;
                    private String dartEntrypoint = "main";
                    private String initialRoute = "/";
                    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

                    public NewEngineInGroupIntentBuilder(Class<? extends FlutterActivity> cls, String str) {
/* 16 */                this.activityClass = cls;
/* 18 */                this.cachedEngineGroupId = str;
                    }

                    public NewEngineInGroupIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
/* 5 */                 this.backgroundMode = backgroundMode.name();
/* 7 */                 return this;
                    }

                    public Intent build(Context context) {
/* 43 */                return new Intent(context, this.activityClass).putExtra("dart_entrypoint", this.dartEntrypoint).putExtra("route", this.initialRoute).putExtra("cached_engine_group_id", this.cachedEngineGroupId).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
                    }

                    public NewEngineInGroupIntentBuilder dartEntrypoint(String str) {
/* 1 */                 this.dartEntrypoint = str;
/* 3 */                 return this;
                    }

                    public NewEngineInGroupIntentBuilder initialRoute(String str) {
/* 1 */                 this.initialRoute = str;
/* 3 */                 return this;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class NewEngineIntentBuilder {
                    private final Class<? extends FlutterActivity> activityClass;
                    private List<String> dartEntrypointArgs;
                    private String initialRoute = "/";
                    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

                    public NewEngineIntentBuilder(Class<? extends FlutterActivity> cls) {
/* 12 */                this.activityClass = cls;
                    }

                    public NewEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
/* 5 */                 this.backgroundMode = backgroundMode.name();
/* 7 */                 return this;
                    }

                    public Intent build(Context context) {
/* 27 */                Intent intentPutExtra = new Intent(context, this.activityClass).putExtra("route", this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
/* 33 */                if (this.dartEntrypointArgs != null) {
/* 44 */                    intentPutExtra.putExtra("dart_entrypoint_args", new ArrayList(this.dartEntrypointArgs));
                        }
/* 47 */                return intentPutExtra;
                    }

                    public NewEngineIntentBuilder dartEntrypointArgs(List<String> list) {
/* 1 */                 this.dartEntrypointArgs = list;
/* 3 */                 return this;
                    }

                    public NewEngineIntentBuilder initialRoute(String str) {
/* 1 */                 this.initialRoute = str;
/* 3 */                 return this;
                    }
                }

                public FlutterActivity() {
/* 19 */            this.onBackInvokedCallback = Build.VERSION.SDK_INT < 33 ? null : createOnBackInvokedCallback();
/* 26 */            this.lifecycle = new i71(this);
                }

                @Deprecated
                private void configureStatusBarForFullscreenFlutterExperience() {
/* 1 */             Window window = getWindow();
/* 7 */             window.addFlags(Integer.MIN_VALUE);
/* 12 */            window.setStatusBarColor(1073741824);
/* 21 */            window.getDecorView().setSystemUiVisibility(PlatformPlugin.DEFAULT_SYSTEM_UI);
                }

                private void configureWindowForTransparency() {
/* 7 */             if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
/* 19 */                getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    }
                }

                public static Intent createDefaultIntent(Context context) {
/* 5 */             return withNewEngine().build(context);
                }

                private View createFlutterView() {
/* 21 */            return this.delegate.onCreateView(null, null, null, FLUTTER_VIEW_ID, getRenderMode() == RenderMode.surface);
                }

                private OnBackInvokedCallback createOnBackInvokedCallback() {
                    return Build.VERSION.SDK_INT >= 34 ? new OnBackAnimationCallback() { // from class: io.flutter.embedding.android.FlutterActivity.1
                        public void onBackCancelled() {
/* 3 */                     FlutterActivity.this.cancelBackGesture();
                        }

                        public void onBackInvoked() {
/* 3 */                     FlutterActivity.this.commitBackGesture();
                        }

                        public void onBackProgressed(BackEvent backEvent) {
/* 3 */                     FlutterActivity.this.updateBackGestureProgress(backEvent);
                        }

                        public void onBackStarted(BackEvent backEvent) {
/* 3 */                     FlutterActivity.this.startBackGesture(backEvent);
                        }
                    } : new C1994oa(this, 1);
                }

                private boolean isDebuggable() {
                    return (getApplicationInfo().flags & 2) != 0;
                }

                private boolean stillAttachedForEvent(String str) {
/* 1 */             FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
/* 10 */            if (flutterActivityAndFragmentDelegate == null) {
/* 39 */                Log.m4591w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
/* 3 */                 return false;
                    }
/* 47 */            if (flutterActivityAndFragmentDelegate.isAttached()) {
/* 80 */                return true;
                    }
/* 76 */            Log.m4591w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after detach.");
/* 3 */             return false;
                }

                private void switchLaunchThemeForNormalTheme() {
                    try {
/* 3 */                 Bundle metaData = getMetaData();
/* 7 */                 if (metaData == null) {
/* 24 */                    Log.m4589v(TAG, "Using the launch theme as normal theme.");
/* 27 */                    return;
                        }
/* 12 */                int i = metaData.getInt("io.flutter.embedding.android.NormalTheme", -1);
/* 16 */                if (i != -1) {
/* 18 */                    setTheme(i);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
/* 30 */                Log.m4585e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
                    }
                }

                public static CachedEngineIntentBuilder withCachedEngine(String str) {
/* 5 */             return new CachedEngineIntentBuilder(FlutterActivity.class, str);
                }

                public static NewEngineIntentBuilder withNewEngine() {
/* 5 */             return new NewEngineIntentBuilder(FlutterActivity.class);
                }

                public static NewEngineInGroupIntentBuilder withNewEngineInGroup(String str) {
/* 5 */             return new NewEngineInGroupIntentBuilder(FlutterActivity.class, str);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean attachToEngineAutomatically() {
/* 1 */             return true;
                }

                public void cancelBackGesture() {
/* 7 */             if (stillAttachedForEvent("cancelBackGesture")) {
/* 11 */                this.delegate.cancelBackGesture();
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
                public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
                }

                public void commitBackGesture() {
/* 7 */             if (stillAttachedForEvent("commitBackGesture")) {
/* 11 */                this.delegate.commitBackGesture();
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
                public void configureFlutterEngine(FlutterEngine flutterEngine) {
/* 7 */             if (this.delegate.isFlutterEngineFromHost()) {
/* 9 */                 return;
                    }
/* 10 */            GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void detachFromFlutterEngine() {
/* 34 */            Log.m4591w(TAG, "FlutterActivity " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
/* 37 */            FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
/* 39 */            if (flutterActivityAndFragmentDelegate != null) {
/* 41 */                flutterActivityAndFragmentDelegate.onDestroyView();
/* 46 */                this.delegate.onDetach();
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public Activity getActivity() {
/* 1 */             return this;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getAppBundlePath() {
                    String dataString;
/* 5 */             if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
/* 33 */                return dataString;
                    }
/* 34 */            return null;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean getBackCallbackState() {
/* 1 */             return this.hasRegisteredBackCallback;
                }

                public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
                    return getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getCachedEngineGroupId() {
/* 7 */             return getIntent().getStringExtra("cached_engine_group_id");
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getCachedEngineId() {
/* 7 */             return getIntent().getStringExtra("cached_engine_id");
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public Context getContext() {
/* 1 */             return this;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public List<String> getDartEntrypointArgs() {
/* 11 */            return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getDartEntrypointFunctionName() {
/* 13 */            if (getIntent().hasExtra("dart_entrypoint")) {
/* 19 */                return getIntent().getStringExtra("dart_entrypoint");
                    }
                    try {
/* 24 */                Bundle metaData = getMetaData();
/* 37 */                String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
                        return string != null ? string : "main";
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getDartEntrypointLibraryUri() {
                    try {
/* 2 */                 Bundle metaData = getMetaData();
/* 6 */                 if (metaData != null) {
/* 10 */                    return metaData.getString("io.flutter.EntrypointUri");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
/* 1 */             return null;
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
/* 5 */             return FlutterShellArgs.fromIntent(getIntent());
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public String getInitialRoute() {
/* 11 */            if (getIntent().hasExtra("route")) {
/* 17 */                return getIntent().getStringExtra("route");
                    }
                    try {
/* 23 */                Bundle metaData = getMetaData();
/* 27 */                if (metaData != null) {
/* 31 */                    return metaData.getString("io.flutter.InitialRoute");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
/* 22 */            return null;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, p000.g71
                public v61 getLifecycle() {
/* 1 */             return this.lifecycle;
                }

                public Bundle getMetaData() throws PackageManager.NameNotFoundException {
/* 15 */            return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
                }

                public OnBackInvokedCallback getOnBackInvokedCallback() {
/* 1 */             return this.onBackInvokedCallback;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public RenderMode getRenderMode() {
                    return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public TransparencyMode getTransparencyMode() {
                    return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
                }

                @Override // android.app.Activity
                public void onActivityResult(int i, int i2, Intent intent) {
/* 7 */             if (stillAttachedForEvent("onActivityResult")) {
/* 11 */                this.delegate.onActivityResult(i, i2, intent);
                    }
                }

                @Override // android.app.Activity
                public void onBackPressed() {
/* 7 */             if (stillAttachedForEvent("onBackPressed")) {
/* 11 */                this.delegate.onBackPressed();
                    }
                }

                @Override // android.app.Activity
                public void onCreate(Bundle bundle) {
/* 1 */             switchLaunchThemeForNormalTheme();
/* 4 */             super.onCreate(bundle);
/* 7 */             if (bundle != null) {
/* 15 */                setFrameworkHandlesBack(bundle.getBoolean("enableOnBackInvokedCallbackState"));
                    }
/* 20 */            FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = new FlutterActivityAndFragmentDelegate(this);
/* 23 */            this.delegate = flutterActivityAndFragmentDelegate;
/* 25 */            flutterActivityAndFragmentDelegate.onAttach(this);
/* 30 */            this.delegate.onRestoreInstanceState(bundle);
/* 37 */            this.lifecycle.m4487e(t61.ON_CREATE);
/* 40 */            configureWindowForTransparency();
/* 47 */            setContentView(createFlutterView());
/* 50 */            configureStatusBarForFullscreenFlutterExperience();
                }

                @Override // android.app.Activity
                public void onDestroy() {
/* 1 */             super.onDestroy();
/* 10 */            if (stillAttachedForEvent("onDestroy")) {
/* 14 */                this.delegate.onDestroyView();
/* 19 */                this.delegate.onDetach();
                    }
/* 22 */            release();
/* 29 */            this.lifecycle.m4487e(t61.ON_DESTROY);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void onFlutterUiDisplayed() {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 7 */                 reportFullyDrawn();
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void onFlutterUiNoLongerDisplayed() {
                }

                @Override // android.app.Activity
                public void onNewIntent(Intent intent) {
/* 1 */             super.onNewIntent(intent);
/* 10 */            if (stillAttachedForEvent("onNewIntent")) {
/* 14 */                this.delegate.onNewIntent(intent);
                    }
                }

                @Override // android.app.Activity
                public void onPause() {
/* 1 */             super.onPause();
/* 10 */            if (stillAttachedForEvent("onPause")) {
/* 14 */                this.delegate.onPause();
                    }
/* 21 */            this.lifecycle.m4487e(t61.ON_PAUSE);
                }

                @Override // android.app.Activity
                public void onPostResume() {
/* 1 */             super.onPostResume();
/* 10 */            if (stillAttachedForEvent("onPostResume")) {
/* 14 */                this.delegate.onPostResume();
                    }
                }

                @Override // android.app.Activity
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 7 */             if (stillAttachedForEvent("onRequestPermissionsResult")) {
/* 11 */                this.delegate.onRequestPermissionsResult(i, strArr, iArr);
                    }
                }

                @Override // android.app.Activity
                public void onResume() {
/* 1 */             super.onResume();
/* 8 */             this.lifecycle.m4487e(t61.ON_RESUME);
/* 17 */            if (stillAttachedForEvent("onResume")) {
/* 21 */                this.delegate.onResume();
                    }
                }

                @Override // android.app.Activity
                public void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 10 */            if (stillAttachedForEvent("onSaveInstanceState")) {
/* 14 */                this.delegate.onSaveInstanceState(bundle);
                    }
                }

                @Override // android.app.Activity
                public void onStart() {
/* 1 */             super.onStart();
/* 8 */             this.lifecycle.m4487e(t61.ON_START);
/* 17 */            if (stillAttachedForEvent("onStart")) {
/* 21 */                this.delegate.onStart();
                    }
                }

                @Override // android.app.Activity
                public void onStop() {
/* 1 */             super.onStop();
/* 10 */            if (stillAttachedForEvent("onStop")) {
/* 14 */                this.delegate.onStop();
                    }
/* 21 */            this.lifecycle.m4487e(t61.ON_STOP);
                }

                @Override // android.app.Activity, android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
/* 1 */             super.onTrimMemory(i);
/* 10 */            if (stillAttachedForEvent("onTrimMemory")) {
/* 14 */                this.delegate.onTrimMemory(i);
                    }
                }

                @Override // android.app.Activity
                public void onUserLeaveHint() {
/* 7 */             if (stillAttachedForEvent("onUserLeaveHint")) {
/* 11 */                this.delegate.onUserLeaveHint();
                    }
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public void onWindowFocusChanged(boolean z) {
/* 1 */             super.onWindowFocusChanged(z);
/* 10 */            if (stillAttachedForEvent("onWindowFocusChanged")) {
/* 14 */                this.delegate.onWindowFocusChanged(z);
                    }
                }

                @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
                public boolean popSystemNavigator() {
/* 1 */             return false;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
                public FlutterEngine provideFlutterEngine(Context context) {
/* 1 */             return null;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
/* 11 */            return new PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public SensitiveContentPlugin provideSensitiveContentPlugin(Activity activity, FlutterEngine flutterEngine) {
/* 9 */             return new SensitiveContentPlugin(FLUTTER_VIEW_ID, activity, flutterEngine.getSensitiveContentChannel());
                }

                public void registerOnBackInvokedCallback() {
/* 5 */             if (Build.VERSION.SDK_INT >= 33) {
/* 2 */                 getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.onBackInvokedCallback);
/* 17 */                this.hasRegisteredBackCallback = true;
                    }
                }

                public void release() {
/* 1 */             unregisterOnBackInvokedCallback();
/* 4 */             FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
/* 6 */             if (flutterActivityAndFragmentDelegate != null) {
/* 8 */                 flutterActivityAndFragmentDelegate.release();
/* 12 */                this.delegate = null;
                    }
                }

                public void setDelegate(FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
/* 1 */             this.delegate = flutterActivityAndFragmentDelegate;
                }

                @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
                public void setFrameworkHandlesBack(boolean z) {
/* 1 */             if (z && !this.hasRegisteredBackCallback) {
/* 7 */                 registerOnBackInvokedCallback();
                    } else {
/* 11 */                if (z || !this.hasRegisteredBackCallback) {
/* 20 */                    return;
                        }
/* 17 */                unregisterOnBackInvokedCallback();
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldAttachEngineToActivity() {
/* 1 */             return true;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldDestroyEngineWithHost() {
                    return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? getIntent().getBooleanExtra("destroy_engine_with_activity", false) : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldDispatchAppLifecycleState() {
/* 1 */             return true;
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldHandleDeeplinking() {
                    try {
/* 5 */                 return FlutterActivityLaunchConfigs.deepLinkEnabled(getMetaData());
                    } catch (PackageManager.NameNotFoundException unused) {
/* 10 */                return false;
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public boolean shouldRestoreAndSaveState() {
/* 12 */            if (getIntent().hasExtra("enable_state_restoration")) {
/* 18 */                return getIntent().getBooleanExtra("enable_state_restoration", false);
                    }
                    return getCachedEngineId() == null;
                }

                public void startBackGesture(BackEvent backEvent) {
/* 7 */             if (stillAttachedForEvent("startBackGesture")) {
/* 11 */                this.delegate.startBackGesture(backEvent);
                    }
                }

                public void unregisterOnBackInvokedCallback() {
/* 5 */             if (Build.VERSION.SDK_INT >= 33) {
/* 1 */                 getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
/* 17 */                this.hasRegisteredBackCallback = false;
                    }
                }

                public void updateBackGestureProgress(BackEvent backEvent) {
/* 7 */             if (stillAttachedForEvent("updateBackGestureProgress")) {
/* 11 */                this.delegate.updateBackGestureProgress(backEvent);
                    }
                }

                @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
                public void updateSystemUiOverlays() {
/* 1 */             FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
/* 3 */             if (flutterActivityAndFragmentDelegate != null) {
/* 5 */                 flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
                    }
                }
            }
