            package io.flutter.embedding.engine;

            import android.content.Context;
            import io.flutter.FlutterInjector;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.embedding.engine.loader.FlutterLoader;
            import io.flutter.plugin.platform.PlatformViewsController;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 38 */    public class FlutterEngineGroup {
                final List<FlutterEngine> activeEngines;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Options {
                    private Context context;
                    private DartExecutor.DartEntrypoint dartEntrypoint;
                    private List<String> dartEntrypointArgs;
                    private String initialRoute;
                    private PlatformViewsController platformViewsController;
                    private boolean automaticallyRegisterPlugins = true;
                    private boolean waitForRestorationData = false;

                    public Options(Context context) {
/* 10 */                this.context = context;
                    }

                    public boolean getAutomaticallyRegisterPlugins() {
/* 1 */                 return this.automaticallyRegisterPlugins;
                    }

                    public Context getContext() {
/* 1 */                 return this.context;
                    }

                    public DartExecutor.DartEntrypoint getDartEntrypoint() {
/* 1 */                 return this.dartEntrypoint;
                    }

                    public List<String> getDartEntrypointArgs() {
/* 1 */                 return this.dartEntrypointArgs;
                    }

                    public String getInitialRoute() {
/* 1 */                 return this.initialRoute;
                    }

                    public PlatformViewsController getPlatformViewsController() {
/* 1 */                 return this.platformViewsController;
                    }

                    public boolean getWaitForRestorationData() {
/* 1 */                 return this.waitForRestorationData;
                    }

                    public Options setAutomaticallyRegisterPlugins(boolean z) {
/* 1 */                 this.automaticallyRegisterPlugins = z;
/* 3 */                 return this;
                    }

                    public Options setDartEntrypoint(DartExecutor.DartEntrypoint dartEntrypoint) {
/* 1 */                 this.dartEntrypoint = dartEntrypoint;
/* 3 */                 return this;
                    }

                    public Options setDartEntrypointArgs(List<String> list) {
/* 1 */                 this.dartEntrypointArgs = list;
/* 3 */                 return this;
                    }

                    public Options setInitialRoute(String str) {
/* 1 */                 this.initialRoute = str;
/* 3 */                 return this;
                    }

                    public Options setPlatformViewsController(PlatformViewsController platformViewsController) {
/* 1 */                 this.platformViewsController = platformViewsController;
/* 3 */                 return this;
                    }

                    public Options setWaitForRestorationData(boolean z) {
/* 1 */                 this.waitForRestorationData = z;
/* 3 */                 return this;
                    }
                }

                public FlutterEngineGroup(Context context, String[] strArr) {
/* 9 */             this.activeEngines = new ArrayList();
/* 15 */            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
/* 23 */            if (flutterLoader.initialized()) {
/* 39 */                return;
                    }
/* 29 */            flutterLoader.startInitialization(context.getApplicationContext());
/* 36 */            flutterLoader.ensureInitializationComplete(context.getApplicationContext(), strArr);
                }

                public FlutterEngine createAndRunDefaultEngine(Context context) {
/* 2 */             return createAndRunEngine(context, null);
                }

                public FlutterEngine createAndRunEngine(Options options) {
                    final FlutterEngine flutterEngineSpawn;
/* 1 */             Context context = options.getContext();
/* 5 */             DartExecutor.DartEntrypoint dartEntrypoint = options.getDartEntrypoint();
/* 9 */             String initialRoute = options.getInitialRoute();
/* 13 */            List<String> dartEntrypointArgs = options.getDartEntrypointArgs();
/* 17 */            PlatformViewsController platformViewsController = options.getPlatformViewsController();
/* 21 */            if (platformViewsController == null) {
/* 27 */                platformViewsController = new PlatformViewsController();
                    }
/* 23 */            PlatformViewsController platformViewsController2 = platformViewsController;
/* 31 */            boolean automaticallyRegisterPlugins = options.getAutomaticallyRegisterPlugins();
/* 35 */            boolean waitForRestorationData = options.getWaitForRestorationData();
/* 39 */            if (dartEntrypoint == null) {
/* 41 */                dartEntrypoint = DartExecutor.DartEntrypoint.createDefault();
                    }
/* 45 */            DartExecutor.DartEntrypoint dartEntrypoint2 = dartEntrypoint;
/* 52 */            if (this.activeEngines.size() == 0) {
/* 54 */                flutterEngineSpawn = createEngine(context, platformViewsController2, automaticallyRegisterPlugins, waitForRestorationData);
/* 58 */                if (initialRoute != null) {
/* 64 */                    flutterEngineSpawn.getNavigationChannel().setInitialRoute(initialRoute);
                        }
/* 71 */                flutterEngineSpawn.getDartExecutor().executeDartEntrypoint(dartEntrypoint2, dartEntrypointArgs);
                    } else {
/* 85 */                flutterEngineSpawn = this.activeEngines.get(0).spawn(context, dartEntrypoint2, initialRoute, dartEntrypointArgs, platformViewsController2, automaticallyRegisterPlugins, waitForRestorationData);
                    }
/* 91 */            this.activeEngines.add(flutterEngineSpawn);
/* 99 */            flutterEngineSpawn.addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngineGroup.1
                        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
                        public void onEngineWillDestroy() {
/* 7 */                     FlutterEngineGroup.this.activeEngines.remove(flutterEngineSpawn);
                        }

                        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
                        public void onPreEngineRestart() {
                        }
                    });
/* 102 */           return flutterEngineSpawn;
                }

                public FlutterEngine createEngine(Context context, PlatformViewsController platformViewsController, boolean z, boolean z2) {
/* 11 */            return new FlutterEngine(context, null, null, platformViewsController, null, z, z2, this);
                }

/* 39 */        public FlutterEngineGroup(Context context) {
/* 40 */            this(context, null);
                }

/* 102 */       public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str) {
/* 105 */           return createAndRunEngine(new Options(context).setDartEntrypoint(dartEntrypoint).setInitialRoute(str));
                }

/* 105 */       public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint) {
/* 106 */           return createAndRunEngine(context, dartEntrypoint, null);
                }
            }
