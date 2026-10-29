            package io.flutter.embedding.android;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.graphics.drawable.ColorDrawable;
            import android.os.Bundle;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.widget.FrameLayout;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0086a;
            import androidx.fragment.app.FragmentActivity;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.embedding.engine.FlutterShellArgs;
            import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
            import io.flutter.plugin.platform.PlatformPlugin;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterFragmentActivity extends FragmentActivity implements FlutterEngineProvider, FlutterEngineConfigurator {
                public static final int FRAGMENT_CONTAINER_ID = View.generateViewId();
                private static final String TAG = "FlutterFragmentActivity";
                private static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";
                private FlutterFragment flutterFragment;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CachedEngineIntentBuilder {
                    private final Class<? extends FlutterFragmentActivity> activityClass;
                    private final String cachedEngineId;
                    private boolean destroyEngineWithActivity = false;
                    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

                    public CachedEngineIntentBuilder(Class<? extends FlutterFragmentActivity> cls, String str) {
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
                    private final Class<? extends FlutterFragmentActivity> activityClass;
                    private final String cachedEngineGroupId;
                    private String dartEntrypoint = "main";
                    private String initialRoute = "/";
                    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

                    public NewEngineInGroupIntentBuilder(Class<? extends FlutterFragmentActivity> cls, String str) {
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
                    private final Class<? extends FlutterFragmentActivity> activityClass;
                    private List<String> dartEntrypointArgs;
                    private String initialRoute = "/";
                    private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

                    public NewEngineIntentBuilder(Class<? extends FlutterFragmentActivity> cls) {
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

                private View createFragmentContainer() {
/* 1 */             FrameLayout frameLayoutProvideRootLayout = provideRootLayout(this);
/* 7 */             frameLayoutProvideRootLayout.setId(FRAGMENT_CONTAINER_ID);
/* 16 */            frameLayoutProvideRootLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
/* 19 */            return frameLayoutProvideRootLayout;
                }

                private void ensureFlutterFragmentCreated() {
/* 3 */             if (this.flutterFragment == null) {
/* 9 */                 this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
                    }
/* 13 */            if (this.flutterFragment == null) {
/* 19 */                this.flutterFragment = createFlutterFragment();
/* 21 */                AbstractC0111w supportFragmentManager = getSupportFragmentManager();
/* 25 */                supportFragmentManager.getClass();
/* 30 */                C0086a c0086a = new C0086a(supportFragmentManager);
/* 40 */                c0086a.m639e(FRAGMENT_CONTAINER_ID, this.flutterFragment, TAG_FLUTTER_FRAGMENT, 1);
/* 44 */                c0086a.m638d(false);
                    }
                }

                private boolean isDebuggable() {
                    return (getApplicationInfo().flags & 2) != 0;
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
/* 30 */                Log.m4585e(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
                    }
                }

                public static CachedEngineIntentBuilder withCachedEngine(String str) {
/* 5 */             return new CachedEngineIntentBuilder(FlutterFragmentActivity.class, str);
                }

                public static NewEngineIntentBuilder withNewEngine() {
/* 5 */             return new NewEngineIntentBuilder(FlutterFragmentActivity.class);
                }

                public static NewEngineInGroupIntentBuilder withNewEngineInGroup(String str) {
/* 5 */             return new NewEngineInGroupIntentBuilder(FlutterFragmentActivity.class, str);
                }

                @Override // io.flutter.embedding.android.FlutterEngineConfigurator
                public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
                }

                @Override // io.flutter.embedding.android.FlutterEngineConfigurator
                public void configureFlutterEngine(FlutterEngine flutterEngine) {
/* 1 */             FlutterFragment flutterFragment = this.flutterFragment;
/* 3 */             if (flutterFragment == null || !flutterFragment.isFlutterEngineInjected()) {
/* 12 */                GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
                    }
                }

                public FlutterFragment createFlutterFragment() {
/* 1 */             FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = getBackgroundMode();
/* 5 */             RenderMode renderMode = getRenderMode();
/* 16 */            TransparencyMode transparencyMode = backgroundMode == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
/* 25 */            boolean z = renderMode == RenderMode.surface;
/* 36 */            if (getCachedEngineId() != null) {
/* 84 */                Log.m4589v(TAG, "Creating FlutterFragment with cached engine:\nCached engine ID: " + getCachedEngineId() + "\nWill destroy engine when Activity is destroyed: " + shouldDestroyEngineWithHost() + "\nBackground transparency mode: " + backgroundMode + "\nWill attach FlutterEngine to Activity: " + shouldAttachEngineToActivity());
/* 139 */               return FlutterFragment.withCachedEngine(getCachedEngineId()).renderMode(renderMode).transparencyMode(transparencyMode).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).destroyEngineWithFragment(shouldDestroyEngineWithHost()).shouldDelayFirstAndroidViewDraw(z).shouldAutomaticallyHandleOnBackPressed(true).build();
                    }
/* 148 */           StringBuilder sb = new StringBuilder("Creating FlutterFragment with new engine:\nCached engine group ID: ");
/* 155 */           sb.append(getCachedEngineGroupId());
/* 158 */           sb.append("\nBackground transparency mode: ");
/* 161 */           sb.append(backgroundMode);
/* 166 */           sb.append("\nDart entrypoint: ");
/* 173 */           sb.append(getDartEntrypointFunctionName());
/* 178 */           sb.append("\nDart entrypoint library uri: ");
/* 194 */           sb.append(getDartEntrypointLibraryUri() != null ? getDartEntrypointLibraryUri() : "\"\"");
/* 199 */           sb.append("\nInitial route: ");
/* 206 */           sb.append(getInitialRoute());
/* 211 */           sb.append("\nApp bundle path: ");
/* 218 */           sb.append(getAppBundlePath());
/* 221 */           sb.append("\nWill attach FlutterEngine to Activity: ");
/* 228 */           sb.append(shouldAttachEngineToActivity());
/* 235 */           Log.m4589v(TAG, sb.toString());
                    return getCachedEngineGroupId() != null ? FlutterFragment.withNewEngineInGroup(getCachedEngineGroupId()).dartEntrypoint(getDartEntrypointFunctionName()).initialRoute(getInitialRoute()).handleDeeplinking(shouldHandleDeeplinking()).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z).shouldAutomaticallyHandleOnBackPressed(true).build() : FlutterFragment.withNewEngine().dartEntrypoint(getDartEntrypointFunctionName()).dartLibraryUri(getDartEntrypointLibraryUri()).dartEntrypointArgs(getDartEntrypointArgs()).initialRoute(getInitialRoute()).appBundlePath(getAppBundlePath()).flutterShellArgs(FlutterShellArgs.fromIntent(getIntent())).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z).shouldAutomaticallyHandleOnBackPressed(true).build();
                }

                public String getAppBundlePath() {
                    String dataString;
/* 5 */             if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
/* 33 */                return dataString;
                    }
/* 34 */            return null;
                }

                public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
                    return getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque;
                }

                public String getCachedEngineGroupId() {
/* 7 */             return getIntent().getStringExtra("cached_engine_group_id");
                }

                public String getCachedEngineId() {
/* 7 */             return getIntent().getStringExtra("cached_engine_id");
                }

                public List<String> getDartEntrypointArgs() {
/* 11 */            return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
                }

                public String getDartEntrypointFunctionName() {
                    try {
/* 3 */                 Bundle metaData = getMetaData();
/* 16 */                String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
                        return string != null ? string : "main";
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }

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

                public FlutterEngine getFlutterEngine() {
/* 3 */             return this.flutterFragment.getFlutterEngine();
                }

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

                public Bundle getMetaData() throws PackageManager.NameNotFoundException {
/* 15 */            return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
                }

                public RenderMode getRenderMode() {
                    return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
                public void onActivityResult(int i, int i2, Intent intent) {
/* 1 */             super.onActivityResult(i, i2, intent);
/* 6 */             this.flutterFragment.onActivityResult(i, i2, intent);
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
                public void onBackPressed() {
/* 3 */             this.flutterFragment.onBackPressed();
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public void onCreate(Bundle bundle) {
/* 1 */             switchLaunchThemeForNormalTheme();
/* 8 */             this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
/* 10 */            super.onCreate(bundle);
/* 13 */            configureWindowForTransparency();
/* 20 */            setContentView(createFragmentContainer());
/* 23 */            configureStatusBarForFullscreenFlutterExperience();
/* 26 */            ensureFlutterFragmentCreated();
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
                public void onNewIntent(Intent intent) {
/* 3 */             this.flutterFragment.onNewIntent(intent);
/* 6 */             super.onNewIntent(intent);
                }

                @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
                public void onPostResume() {
/* 1 */             super.onPostResume();
/* 6 */             this.flutterFragment.onPostResume();
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 1 */             super.onRequestPermissionsResult(i, strArr, iArr);
/* 6 */             this.flutterFragment.onRequestPermissionsResult(i, strArr, iArr);
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
/* 1 */             super.onTrimMemory(i);
/* 6 */             this.flutterFragment.onTrimMemory(i);
                }

                @Override // android.app.Activity
                public void onUserLeaveHint() {
/* 3 */             this.flutterFragment.onUserLeaveHint();
                }

                @Override // io.flutter.embedding.android.FlutterEngineProvider
                public FlutterEngine provideFlutterEngine(Context context) {
/* 1 */             return null;
                }

                public FrameLayout provideRootLayout(Context context) {
/* 3 */             return new FrameLayout(context);
                }

                public FlutterFragment retrieveExistingFlutterFragmentIfPossible() {
/* 11 */            return (FlutterFragment) getSupportFragmentManager().m680D(TAG_FLUTTER_FRAGMENT);
                }

                public boolean shouldAttachEngineToActivity() {
/* 1 */             return true;
                }

                public boolean shouldDestroyEngineWithHost() {
/* 8 */             return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
                }

                public boolean shouldHandleDeeplinking() {
                    try {
/* 5 */                 return FlutterActivityLaunchConfigs.deepLinkEnabled(getMetaData());
                    } catch (PackageManager.NameNotFoundException unused) {
/* 10 */                return false;
                    }
                }
            }
