            package io.flutter;

            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
            import io.flutter.embedding.engine.loader.FlutterLoader;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ThreadFactory;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FlutterInjector {
                private static boolean accessed;
                private static FlutterInjector instance;
                private DeferredComponentManager deferredComponentManager;
                private ExecutorService executorService;
                private FlutterJNI.Factory flutterJniFactory;
                private FlutterLoader flutterLoader;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class Builder {
                    private DeferredComponentManager deferredComponentManager;
                    private ExecutorService executorService;
                    private FlutterJNI.Factory flutterJniFactory;
                    private FlutterLoader flutterLoader;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class NamedThreadFactory implements ThreadFactory {
                        private int threadId;

                        private NamedThreadFactory() {
/* 7 */                     this.threadId = 0;
                        }

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
/* 3 */                     Thread thread = new Thread(runnable);
/* 10 */                    StringBuilder sb = new StringBuilder("flutter-worker-");
/* 13 */                    int i = this.threadId;
/* 17 */                    this.threadId = i + 1;
/* 19 */                    sb.append(i);
/* 26 */                    thread.setName(sb.toString());
/* 29 */                    return thread;
                        }
                    }

                    private void fillDefaults() {
/* 3 */                 if (this.flutterJniFactory == null) {
/* 10 */                    this.flutterJniFactory = new FlutterJNI.Factory();
                        }
/* 14 */                if (this.executorService == null) {
/* 26 */                    this.executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
                        }
/* 30 */                if (this.flutterLoader == null) {
/* 45 */                    this.flutterLoader = new FlutterLoader(this.flutterJniFactory.provideFlutterJNI(), this.executorService);
                        }
                    }

                    public FlutterInjector build() {
/* 1 */                 fillDefaults();
/* 15 */                return new FlutterInjector(this.flutterLoader, this.deferredComponentManager, this.flutterJniFactory, this.executorService);
                    }

                    public Builder setDeferredComponentManager(DeferredComponentManager deferredComponentManager) {
/* 1 */                 this.deferredComponentManager = deferredComponentManager;
/* 3 */                 return this;
                    }

                    public Builder setExecutorService(ExecutorService executorService) {
/* 1 */                 this.executorService = executorService;
/* 3 */                 return this;
                    }

                    public Builder setFlutterJNIFactory(FlutterJNI.Factory factory) {
/* 1 */                 this.flutterJniFactory = factory;
/* 3 */                 return this;
                    }

                    public Builder setFlutterLoader(FlutterLoader flutterLoader) {
/* 1 */                 this.flutterLoader = flutterLoader;
/* 3 */                 return this;
                    }
                }

                private FlutterInjector(FlutterLoader flutterLoader, DeferredComponentManager deferredComponentManager, FlutterJNI.Factory factory, ExecutorService executorService) {
/* 4 */             this.flutterLoader = flutterLoader;
/* 6 */             this.deferredComponentManager = deferredComponentManager;
/* 8 */             this.flutterJniFactory = factory;
/* 10 */            this.executorService = executorService;
                }

                public static FlutterInjector instance() {
/* 2 */             accessed = true;
/* 6 */             if (instance == null) {
/* 17 */                instance = new Builder().build();
                    }
/* 19 */            return instance;
                }

                public static void reset() {
/* 2 */             accessed = false;
/* 5 */             instance = null;
                }

                public static void setInstance(FlutterInjector flutterInjector) {
/* 3 */             if (accessed) {
/* 10 */                f42.m3656l("Cannot change the FlutterInjector instance once it's been read. If you're trying to dependency inject, be sure to do so at the beginning of the program");
                    } else {
/* 5 */                 instance = flutterInjector;
                    }
                }

                public DeferredComponentManager deferredComponentManager() {
/* 1 */             return this.deferredComponentManager;
                }

                public ExecutorService executorService() {
/* 1 */             return this.executorService;
                }

                public FlutterLoader flutterLoader() {
/* 1 */             return this.flutterLoader;
                }

                public FlutterJNI.Factory getFlutterJNIFactory() {
/* 1 */             return this.flutterJniFactory;
                }
            }
