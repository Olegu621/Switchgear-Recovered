            package io.flutter.embedding.engine;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.res.AssetManager;
            import io.flutter.FlutterInjector;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
            import io.flutter.embedding.engine.loader.FlutterLoader;
            import io.flutter.embedding.engine.plugins.PluginRegistry;
            import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
            import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
            import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
            import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
            import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
            import io.flutter.embedding.engine.systemchannels.BackGestureChannel;
            import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
            import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
            import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
            import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
            import io.flutter.embedding.engine.systemchannels.NavigationChannel;
            import io.flutter.embedding.engine.systemchannels.PlatformChannel;
            import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
            import io.flutter.embedding.engine.systemchannels.RestorationChannel;
            import io.flutter.embedding.engine.systemchannels.ScribeChannel;
            import io.flutter.embedding.engine.systemchannels.SensitiveContentChannel;
            import io.flutter.embedding.engine.systemchannels.SettingsChannel;
            import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
            import io.flutter.embedding.engine.systemchannels.SystemChannel;
            import io.flutter.embedding.engine.systemchannels.TextInputChannel;
            import io.flutter.plugin.localization.LocalizationPlugin;
            import io.flutter.plugin.platform.PlatformViewsController;
            import io.flutter.plugin.platform.PlatformViewsController2;
            import io.flutter.plugin.text.ProcessTextPlugin;
            import io.flutter.util.ViewUtils;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 346 */   public class FlutterEngine implements ViewUtils.DisplayUpdater {
                private static final String TAG = "FlutterEngine";
                private static final Map<Long, FlutterEngine> idToEngine = new HashMap();
                private static long nextEngineId = 1;
                private final AccessibilityChannel accessibilityChannel;
                private final BackGestureChannel backGestureChannel;
                private final DartExecutor dartExecutor;
                private final DeferredComponentChannel deferredComponentChannel;
                private final long engineId;
                private final EngineLifecycleListener engineLifecycleListener;
                private final Set<EngineLifecycleListener> engineLifecycleListeners;
                private final FlutterJNI flutterJNI;
                private final LifecycleChannel lifecycleChannel;
                private final LocalizationChannel localizationChannel;
                private final LocalizationPlugin localizationPlugin;
                private final MouseCursorChannel mouseCursorChannel;
                private final NavigationChannel navigationChannel;
                private final PlatformChannel platformChannel;
                private final PlatformViewsController platformViewsController;
                private final PlatformViewsController2 platformViewsController2;
                private final FlutterEngineConnectionRegistry pluginRegistry;
                private final ProcessTextChannel processTextChannel;
                private final FlutterRenderer renderer;
                private final RestorationChannel restorationChannel;
                private final ScribeChannel scribeChannel;
                private final SensitiveContentChannel sensitiveContentChannel;
                private final SettingsChannel settingsChannel;
                private final SpellCheckChannel spellCheckChannel;
                private final SystemChannel systemChannel;
                private final TextInputChannel textInputChannel;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface EngineLifecycleListener {
                    void onEngineWillDestroy();

                    void onPreEngineRestart();
                }

                public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI, PlatformViewsController platformViewsController, String[] strArr, boolean z, boolean z2, FlutterEngineGroup flutterEngineGroup) throws Exception {
                    AssetManager assets;
/* 9 */             this.engineLifecycleListeners = new HashSet();
/* 16 */            this.engineLifecycleListener = new EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngine.1
                        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
                        public void onEngineWillDestroy() {
                        }

                        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
                        public void onPreEngineRestart() {
/* 5 */                     Log.m4589v(FlutterEngine.TAG, "onPreEngineRestart()");
/* 14 */                    Iterator it = FlutterEngine.this.engineLifecycleListeners.iterator();
/* 22 */                    while (it.hasNext()) {
/* 30 */                        ((EngineLifecycleListener) it.next()).onPreEngineRestart();
                            }
/* 40 */                    FlutterEngine.this.platformViewsController.onPreEngineRestart();
/* 49 */                    FlutterEngine.this.platformViewsController2.onPreEngineRestart();
/* 58 */                    FlutterEngine.this.restorationChannel.clearData();
                        }
                    };
/* 18 */            long j = nextEngineId;
/* 23 */            nextEngineId = 1 + j;
/* 25 */            this.engineId = j;
/* 33 */            idToEngine.put(Long.valueOf(j), this);
                    try {
/* 45 */                assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
                    } catch (PackageManager.NameNotFoundException unused) {
/* 50 */                assets = context.getAssets();
                    }
/* 54 */            FlutterInjector flutterInjectorInstance = FlutterInjector.instance();
/* 64 */            flutterJNI = flutterJNI == null ? flutterInjectorInstance.getFlutterJNIFactory().provideFlutterJNI() : flutterJNI;
/* 68 */            this.flutterJNI = flutterJNI;
/* 74 */            DartExecutor dartExecutor = new DartExecutor(flutterJNI, assets, this.engineId);
/* 77 */            this.dartExecutor = dartExecutor;
/* 79 */            dartExecutor.onAttachedToJNI();
/* 86 */            DeferredComponentManager deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
/* 95 */            this.accessibilityChannel = new AccessibilityChannel(dartExecutor, flutterJNI);
/* 99 */            DeferredComponentChannel deferredComponentChannel = new DeferredComponentChannel(dartExecutor);
/* 102 */           this.deferredComponentChannel = deferredComponentChannel;
/* 109 */           this.lifecycleChannel = new LifecycleChannel(dartExecutor);
/* 113 */           LocalizationChannel localizationChannel = new LocalizationChannel(dartExecutor);
/* 116 */           this.localizationChannel = localizationChannel;
/* 123 */           this.mouseCursorChannel = new MouseCursorChannel(dartExecutor);
/* 130 */           this.navigationChannel = new NavigationChannel(dartExecutor);
/* 137 */           this.backGestureChannel = new BackGestureChannel(dartExecutor);
/* 144 */           this.platformChannel = new PlatformChannel(dartExecutor);
/* 155 */           this.processTextChannel = new ProcessTextChannel(dartExecutor, context.getPackageManager());
/* 162 */           this.restorationChannel = new RestorationChannel(dartExecutor, z2);
/* 169 */           this.scribeChannel = new ScribeChannel(dartExecutor);
/* 176 */           this.sensitiveContentChannel = new SensitiveContentChannel(dartExecutor);
/* 183 */           this.settingsChannel = new SettingsChannel(dartExecutor);
/* 190 */           this.spellCheckChannel = new SpellCheckChannel(dartExecutor);
/* 197 */           this.systemChannel = new SystemChannel(dartExecutor);
/* 204 */           this.textInputChannel = new TextInputChannel(dartExecutor);
/* 206 */           if (deferredComponentManager != null) {
/* 208 */               deferredComponentManager.setDeferredComponentChannel(deferredComponentChannel);
                    }
/* 213 */           LocalizationPlugin localizationPlugin = new LocalizationPlugin(context, localizationChannel);
/* 216 */           this.localizationPlugin = localizationPlugin;
/* 220 */           flutterLoader = flutterLoader == null ? flutterInjectorInstance.flutterLoader() : flutterLoader;
/* 228 */           if (!flutterJNI.isAttached()) {
/* 234 */               flutterLoader.startInitialization(context.getApplicationContext());
/* 237 */               flutterLoader.ensureInitializationComplete(context, strArr);
                    }
/* 242 */           PlatformViewsController2 platformViewsController2 = new PlatformViewsController2();
/* 249 */           platformViewsController2.setRegistry(platformViewsController.getRegistry());
/* 252 */           platformViewsController2.setFlutterJNI(flutterJNI);
/* 255 */           platformViewsController.setFlutterJNI(flutterJNI);
/* 260 */           flutterJNI.addEngineLifecycleListener(this.engineLifecycleListener);
/* 263 */           flutterJNI.setPlatformViewsController(platformViewsController);
/* 266 */           flutterJNI.setPlatformViewsController2(platformViewsController2);
/* 269 */           flutterJNI.setLocalizationPlugin(localizationPlugin);
/* 276 */           flutterJNI.setDeferredComponentManager(flutterInjectorInstance.deferredComponentManager());
/* 283 */           if (!flutterJNI.isAttached()) {
/* 285 */               attachToJni();
                    }
/* 293 */           this.renderer = new FlutterRenderer(flutterJNI);
/* 295 */           this.platformViewsController = platformViewsController;
/* 297 */           this.platformViewsController2 = platformViewsController2;
/* 305 */           FlutterEngineConnectionRegistry flutterEngineConnectionRegistry = new FlutterEngineConnectionRegistry(context.getApplicationContext(), this, flutterLoader, flutterEngineGroup);
/* 308 */           this.pluginRegistry = flutterEngineConnectionRegistry;
/* 318 */           localizationPlugin.sendLocalesToFlutter(context.getResources().getConfiguration());
/* 321 */           if (z && flutterLoader.automaticallyRegisterPlugins()) {
/* 329 */               GeneratedPluginRegister.registerGeneratedPlugins(this);
                    }
/* 332 */           ViewUtils.calculateMaximumDisplayMetrics(context, this);
/* 344 */           flutterEngineConnectionRegistry.add(new ProcessTextPlugin(getProcessTextChannel()));
                }

                private void attachToJni() {
/* 5 */             Log.m4589v(TAG, "Attaching to JNI.");
/* 10 */            this.flutterJNI.attachToNative();
/* 17 */            if (isAttachedToJni()) {
/* 19 */                return;
                    }
/* 22 */            f42.m3663s("FlutterEngine failed to attach to its native Object reference.");
                }

                public static FlutterEngine engineForId(long j) {
/* 7 */             return idToEngine.get(Long.valueOf(j));
                }

                private boolean isAttachedToJni() {
/* 3 */             return this.flutterJNI.isAttached();
                }

                public static void resetNextEngineId() {
/* 3 */             nextEngineId = 1L;
                }

                public void addEngineLifecycleListener(EngineLifecycleListener engineLifecycleListener) {
/* 3 */             this.engineLifecycleListeners.add(engineLifecycleListener);
                }

                public void destroy() {
/* 5 */             Log.m4589v(TAG, "Destroying.");
/* 10 */            Iterator<EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
/* 18 */            while (it.hasNext()) {
/* 26 */                it.next().onEngineWillDestroy();
                    }
/* 32 */            this.pluginRegistry.destroy();
/* 37 */            this.platformViewsController.onDetachedFromJNI();
/* 42 */            this.platformViewsController2.onDetachedFromJNI();
/* 47 */            this.dartExecutor.onDetachedFromJNI();
/* 54 */            this.flutterJNI.removeEngineLifecycleListener(this.engineLifecycleListener);
/* 60 */            this.flutterJNI.setDeferredComponentManager(null);
/* 65 */            this.flutterJNI.detachFromNativeAndReleaseResources();
/* 76 */            if (FlutterInjector.instance().deferredComponentManager() != null) {
/* 86 */                FlutterInjector.instance().deferredComponentManager().destroy();
/* 91 */                this.deferredComponentChannel.setDeferredComponentManager(null);
                    }
/* 102 */           idToEngine.remove(Long.valueOf(this.engineId));
                }

                public AccessibilityChannel getAccessibilityChannel() {
/* 1 */             return this.accessibilityChannel;
                }

                public ActivityControlSurface getActivityControlSurface() {
/* 1 */             return this.pluginRegistry;
                }

                public BackGestureChannel getBackGestureChannel() {
/* 1 */             return this.backGestureChannel;
                }

                public BroadcastReceiverControlSurface getBroadcastReceiverControlSurface() {
/* 1 */             return this.pluginRegistry;
                }

                public ContentProviderControlSurface getContentProviderControlSurface() {
/* 1 */             return this.pluginRegistry;
                }

                public DartExecutor getDartExecutor() {
/* 1 */             return this.dartExecutor;
                }

                public DeferredComponentChannel getDeferredComponentChannel() {
/* 1 */             return this.deferredComponentChannel;
                }

                public long getEngineId() {
/* 1 */             return this.engineId;
                }

                public LifecycleChannel getLifecycleChannel() {
/* 1 */             return this.lifecycleChannel;
                }

                public LocalizationChannel getLocalizationChannel() {
/* 1 */             return this.localizationChannel;
                }

                public LocalizationPlugin getLocalizationPlugin() {
/* 1 */             return this.localizationPlugin;
                }

                public MouseCursorChannel getMouseCursorChannel() {
/* 1 */             return this.mouseCursorChannel;
                }

                public NavigationChannel getNavigationChannel() {
/* 1 */             return this.navigationChannel;
                }

                public PlatformChannel getPlatformChannel() {
/* 1 */             return this.platformChannel;
                }

                public PlatformViewsController getPlatformViewsController() {
/* 1 */             return this.platformViewsController;
                }

                public PlatformViewsController2 getPlatformViewsController2() {
/* 1 */             return this.platformViewsController2;
                }

                public PluginRegistry getPlugins() {
/* 1 */             return this.pluginRegistry;
                }

                public ProcessTextChannel getProcessTextChannel() {
/* 1 */             return this.processTextChannel;
                }

                public FlutterRenderer getRenderer() {
/* 1 */             return this.renderer;
                }

                public RestorationChannel getRestorationChannel() {
/* 1 */             return this.restorationChannel;
                }

                public ScribeChannel getScribeChannel() {
/* 1 */             return this.scribeChannel;
                }

                public SensitiveContentChannel getSensitiveContentChannel() {
/* 1 */             return this.sensitiveContentChannel;
                }

                public ServiceControlSurface getServiceControlSurface() {
/* 1 */             return this.pluginRegistry;
                }

                public SettingsChannel getSettingsChannel() {
/* 1 */             return this.settingsChannel;
                }

                public SpellCheckChannel getSpellCheckChannel() {
/* 1 */             return this.spellCheckChannel;
                }

                public SystemChannel getSystemChannel() {
/* 1 */             return this.systemChannel;
                }

                public TextInputChannel getTextInputChannel() {
/* 1 */             return this.textInputChannel;
                }

                public void removeEngineLifecycleListener(EngineLifecycleListener engineLifecycleListener) {
/* 3 */             this.engineLifecycleListeners.remove(engineLifecycleListener);
                }

                public FlutterEngine spawn(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str, List<String> list, PlatformViewsController platformViewsController, boolean z, boolean z2) {
/* 5 */             if (isAttachedToJni()) {
/* 26 */                return new FlutterEngine(context, null, this.flutterJNI.spawn(dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, str, list, nextEngineId), platformViewsController, null, z, z2);
                    }
/* 32 */            f42.m3656l("Spawn can only be called on a fully constructed FlutterEngine");
/* 35 */            return null;
                }

                @Override // io.flutter.util.ViewUtils.DisplayUpdater
                public void updateDisplayMetrics(float f, float f2, float f3) {
/* 4 */             this.flutterJNI.updateDisplayMetrics(0, f, f2, f3);
                }

/* 347 */       public FlutterEngine(Context context, String[] strArr) {
/* 348 */           this(context, null, null, strArr, true);
                }

/* 348 */       public FlutterEngine(Context context, String[] strArr, boolean z) {
/* 349 */           this(context, null, null, strArr, z);
                }

/* 349 */       public FlutterEngine(Context context, String[] strArr, boolean z, boolean z2) {
/* 350 */           this(context, null, null, new PlatformViewsController(), strArr, z, z2);
                }

/* 350 */       public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI) {
/* 351 */           this(context, flutterLoader, flutterJNI, null, true);
                }

/* 351 */       public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI, String[] strArr, boolean z) {
/* 352 */           this(context, flutterLoader, flutterJNI, new PlatformViewsController(), strArr, z);
                }

/* 352 */       public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI, PlatformViewsController platformViewsController, String[] strArr, boolean z) {
/* 353 */           this(context, flutterLoader, flutterJNI, platformViewsController, strArr, z, false);
                }

/* 353 */       public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI, PlatformViewsController platformViewsController, String[] strArr, boolean z, boolean z2) {
/* 354 */           this(context, flutterLoader, flutterJNI, platformViewsController, strArr, z, z2, null);
                }

/* 354 */       public FlutterEngine(Context context) {
/* 355 */           this(context, null);
                }
            }
