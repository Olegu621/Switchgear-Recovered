            package io.flutter.embedding.engine.loader;

            import android.app.ActivityManager;
            import android.content.Context;
            import android.hardware.display.DisplayManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.SystemClock;
            import android.util.DisplayMetrics;
            import io.flutter.FlutterInjector;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.FlutterShellArgs;
            import io.flutter.util.HandlerCompat;
            import io.flutter.util.PathUtils;
            import io.flutter.util.TraceSection;
            import io.flutter.view.VsyncWaiter;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Future;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            import p000.uk0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class FlutterLoader {
                static final String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
                static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
                static final String AUTOMATICALLY_REGISTER_PLUGINS_KEY = "automatically-register-plugins";
                private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
                private static final String DEFAULT_LIBRARY = "libflutter.so";
                private static final String DISABLE_MERGED_PLATFORM_UI_THREAD_KEY = "io.flutter.embedding.android.DisableMergedPlatformUIThread";
                private static final String ENABLE_FLUTTER_GPU = "io.flutter.embedding.android.EnableFlutterGPU";
                private static final String ENABLE_IMPELLER_META_DATA_KEY = "io.flutter.embedding.android.EnableImpeller";
                private static final String ENABLE_SURFACE_CONTROL = "io.flutter.embedding.android.EnableSurfaceControl";
                private static final String ENABLE_VULKAN_VALIDATION_META_DATA_KEY = "io.flutter.embedding.android.EnableVulkanValidation";
                static final String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
                private static final String IMPELLER_ANTIALIAS_LINES = "io.flutter.embedding.android.ImpellerAntialiasLines";
                private static final String IMPELLER_BACKEND_META_DATA_KEY = "io.flutter.embedding.android.ImpellerBackend";
                private static final String IMPELLER_LAZY_SHADER_MODE = "io.flutter.embedding.android.ImpellerLazyShaderInitialization";
                private static final String IMPELLER_OPENGL_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableOpenGLGPUTracing";
                private static final String IMPELLER_VULKAN_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableVulkanGPUTracing";
                static final String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
                private static final String LEAK_VM_META_DATA_KEY = "io.flutter.embedding.android.LeakVM";
                private static final String OLD_GEN_HEAP_SIZE_META_DATA_KEY = "io.flutter.embedding.android.OldGenHeapSize";
                static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
                private static final String TAG = "FlutterLoader";
                private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
                static final String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
                private static FlutterLoader instance;
                private ExecutorService executorService;
                private FlutterApplicationInfo flutterApplicationInfo;
                private FlutterJNI flutterJNI;
                Future<InitResult> initResultFuture;
                private long initStartTimestampMillis;
                private boolean initialized;
                private Settings settings;

                /* JADX INFO: renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class CallableC10621 implements Callable<InitResult> {
                    final /* synthetic */ Context val$appContext;

                    public CallableC10621(Context context) {
/* 3 */                 this.val$appContext = context;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ void lambda$call$0() {
/* 7 */                 FlutterLoader.this.flutterJNI.prefetchDefaultFontManager();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Code duplicated, block: B:60:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:71:? A[SYNTHETIC] */
                    @Override // java.util.concurrent.Callable
                    public InitResult call() throws Throwable {
                        TraceSection traceSection;
                        Throwable th;
                        String str;
                        String str2;
                        TraceSection traceSection2;
/* 5 */                 TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader initTask");
                        try {
/* 1 */                     ResourceExtractor resourceExtractorInitResources = FlutterLoader.this.initResources(this.val$appContext);
                            try {
                                try {
/* 25 */                            FlutterLoader.this.flutterJNI.loadLibrary(this.val$appContext);
/* 34 */                            FlutterLoader.this.flutterJNI.updateRefreshRate();
/* 48 */                            FlutterLoader.this.executorService.execute(new Runnable() { // from class: io.flutter.embedding.engine.loader.a
                                        @Override // java.lang.Runnable
                                        public final void run() {
/* 1 */                                     this.f9747a.lambda$call$0();
                                        }
                                    });
/* 51 */                            if (resourceExtractorInitResources != null) {
/* 53 */                                resourceExtractorInitResources.waitForCompletion();
                                    }
/* 84 */                            InitResult initResult = new InitResult(PathUtils.getFilesDir(this.val$appContext), PathUtils.getCacheDirectory(this.val$appContext), PathUtils.getDataDirectory(this.val$appContext), null);
/* 87 */                            if (traceSectionScoped != null) {
/* 89 */                                traceSectionScoped.close();
                                    }
/* 92 */                            return initResult;
                                } catch (Throwable th2) {
/* 58 */                            th = th2;
/* 59 */                            traceSection = traceSectionScoped;
/* 402 */                           if (traceSection != null) {
/* 412 */                               throw th;
                                    }
                                    try {
/* 404 */                               traceSection.close();
/* 412 */                               throw th;
                                    } catch (Throwable th3) {
/* 409 */                               th.addSuppressed(th3);
/* 412 */                               throw th;
                                    }
                                }
                            } catch (UnsatisfiedLinkError e) {
/* 106 */                       if (!e.toString().contains("couldn't find \"libflutter.so\"") && !e.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
/* 119 */                           throw e;
                                }
/* 122 */                       String property = System.getProperty("os.arch");
/* 136 */                       File file = new File(FlutterLoader.this.flutterApplicationInfo.nativeLibraryDir);
/* 139 */                       String[] list = file.list();
/* 145 */                       ArrayList arrayList = new ArrayList();
/* 148 */                       String[] strArr = Build.SUPPORTED_ABIS;
/* 150 */                       int length = strArr.length;
/* 151 */                       int i = 0;
/* 152 */                       while (i < length) {
/* 154 */                           String str3 = strArr[i];
/* 158 */                           StringBuilder sb = new StringBuilder();
/* 163 */                           sb.append("!");
/* 166 */                           String str4 = File.separator;
/* 168 */                           sb.append(str4);
/* 173 */                           sb.append("lib");
/* 176 */                           sb.append(str4);
/* 179 */                           sb.append(str3);
/* 182 */                           String string = sb.toString();
/* 192 */                           String[] strArr2 = this.val$appContext.getApplicationInfo().splitSourceDirs;
/* 196 */                           ArrayList arrayList2 = new ArrayList();
/* 199 */                           if (strArr2 != null) {
/* 201 */                               int length2 = strArr2.length;
/* 202 */                               int i2 = 0;
/* 203 */                               while (i2 < length2) {
/* 207 */                                   traceSection = traceSectionScoped;
                                            try {
/* 224 */                                       arrayList2.add(strArr2[i2] + string);
/* 227 */                                       i2++;
/* 229 */                                       traceSectionScoped = traceSection;
                                            } catch (Throwable th4) {
/* 232 */                                       th = th4;
/* 233 */                                       th = th;
/* 402 */                                       if (traceSection != null) {
/* 412 */                                           throw th;
                                                }
/* 404 */                                       traceSection.close();
/* 412 */                                       throw th;
                                            }
                                        }
/* 240 */                               traceSection2 = traceSectionScoped;
/* 242 */                               arrayList.addAll(arrayList2);
                                    } else {
/* 246 */                               traceSection2 = traceSectionScoped;
                                    }
/* 254 */                           String str5 = this.val$appContext.getApplicationInfo().sourceDir;
/* 256 */                           if (str5 != null && !str5.isEmpty()) {
/* 279 */                               arrayList.add(str5 + string);
                                    }
/* 282 */                           i++;
/* 284 */                           traceSectionScoped = traceSection2;
                                }
/* 288 */                       traceSection = traceSectionScoped;
/* 294 */                       StringBuilder sb2 = new StringBuilder();
/* 299 */                       sb2.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
/* 302 */                       sb2.append(property);
/* 307 */                       sb2.append(", and the native libraries directory (with path ");
/* 314 */                       sb2.append(file.getAbsolutePath());
/* 319 */                       sb2.append(") ");
/* 326 */                       if (file.exists()) {
/* 345 */                           str = "contains the following files: " + Arrays.toString(list);
                                } else {
/* 350 */                           str = "does not exist";
                                }
/* 352 */                       sb2.append(str);
/* 359 */                       if (arrayList.isEmpty()) {
/* 361 */                           str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                } else {
/* 382 */                           str2 = ", and the split and source libraries directory (with path(s) " + arrayList + ")";
                                }
/* 386 */                       sb2.append(str2);
/* 391 */                       sb2.append(".");
/* 401 */                       throw new UnsupportedOperationException(sb2.toString(), e);
                            }
                        } catch (Throwable th5) {
/* 236 */                   th = th5;
/* 237 */                   traceSection = traceSectionScoped;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Settings {
                    private String logTag;

                    public String getLogTag() {
/* 1 */                 return this.logTag;
                    }

                    public void setLogTag(String str) {
/* 1 */                 this.logTag = str;
                    }
                }

                public FlutterLoader() {
/* 13 */            this(FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
                }

                private String fullAssetPathFrom(String str) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(this.flutterApplicationInfo.flutterAssetsDir);
/* 15 */            return fm0.m3789o(sb, File.separator, str);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public ResourceExtractor initResources(Context context) {
/* 1 */             return null;
                }

                private static boolean isLeakVM(Bundle bundle) {
/* 2 */             if (bundle == null) {
/* 1 */                 return true;
                    }
/* 7 */             return bundle.getBoolean(LEAK_VM_META_DATA_KEY, true);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$ensureInitializationCompleteAsync$0(Context context, String[] strArr, Handler handler, Runnable runnable) {
/* 5 */             ensureInitializationComplete(context.getApplicationContext(), strArr);
/* 8 */             handler.post(runnable);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$ensureInitializationCompleteAsync$1(Context context, String[] strArr, Handler handler, Runnable runnable) {
                    try {
/* 3 */                 this.initResultFuture.get();
/* 28 */                HandlerCompat.createAsyncHandler(Looper.getMainLooper()).post(new uk0(this, context, strArr, handler, runnable, 1));
                    } catch (Exception e) {
/* 38 */                Log.m4586e(TAG, "Flutter initialization failed.", e);
/* 41 */                ds0.m3199p(e);
                    }
                }

                public boolean automaticallyRegisterPlugins() {
/* 3 */             return this.flutterApplicationInfo.automaticallyRegisterPlugins;
                }

                public void ensureInitializationComplete(Context context, String[] strArr) {
                    TraceSection traceSection;
                    Context context2;
/* 27 */            if (this.initialized) {
/* 553 */               return;
                    }
/* 39 */            if (Looper.myLooper() != Looper.getMainLooper()) {
/* 590 */               f42.m3656l("ensureInitializationComplete must be called on the main thread");
/* 593 */               return;
                    }
/* 43 */            if (this.settings == null) {
/* 584 */               f42.m3656l("ensureInitializationComplete must be called after startInitialization");
/* 587 */               return;
                    }
                    try {
/* 47 */                TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader#ensureInitializationComplete");
                        try {
/* 53 */                    InitResult initResult = this.initResultFuture.get();
/* 61 */                    ArrayList arrayList = new ArrayList();
/* 66 */                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
/* 71 */                    StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
/* 78 */                    sb.append(this.flutterApplicationInfo.nativeLibraryDir);
/* 81 */                    String str = File.separator;
/* 83 */                    sb.append(str);
/* 86 */                    traceSection = traceSectionScoped;
                            try {
/* 90 */                        sb.append(DEFAULT_LIBRARY);
/* 97 */                        arrayList.add(sb.toString());
/* 100 */                       if (strArr != null) {
/* 102 */                           Collections.addAll(arrayList, strArr);
                                }
/* 126 */                       arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.aotSharedLibraryName);
/* 155 */                       arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.nativeLibraryDir + str + this.flutterApplicationInfo.aotSharedLibraryName);
/* 160 */                       StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
/* 165 */                       sb2.append(initResult.engineCachesPath);
/* 172 */                       arrayList.add(sb2.toString());
/* 179 */                       if (this.flutterApplicationInfo.domainNetworkPolicy != null) {
/* 197 */                           arrayList.add("--domain-network-policy=" + this.flutterApplicationInfo.domainNetworkPolicy);
                                }
/* 206 */                       if (this.settings.getLogTag() != null) {
/* 226 */                           arrayList.add("--log-tag=" + this.settings.getLogTag());
                                }
/* 243 */                       Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
/* 255 */                       int i = bundle != null ? bundle.getInt(OLD_GEN_HEAP_SIZE_META_DATA_KEY) : 0;
/* 256 */                       if (i == 0) {
/* 260 */                           context2 = context;
/* 266 */                           ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
/* 270 */                           ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
/* 273 */                           activityManager.getMemoryInfo(memoryInfo);
/* 290 */                           i = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
                                } else {
/* 292 */                           context2 = context;
                                }
/* 306 */                       arrayList.add("--old-gen-heap-size=" + i);
/* 313 */                       DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
/* 336 */                       arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
/* 341 */                       arrayList.add("--prefetched-default-font-manager");
/* 344 */                       if (bundle != null) {
/* 350 */                           if (bundle.containsKey(ENABLE_IMPELLER_META_DATA_KEY)) {
/* 356 */                               if (bundle.getBoolean(ENABLE_IMPELLER_META_DATA_KEY)) {
/* 360 */                                   arrayList.add(FlutterShellArgs.ARG_ENABLE_IMPELLER);
                                        } else {
/* 366 */                                   arrayList.add(FlutterShellArgs.ARG_DISABLE_IMPELLER);
                                        }
                                    }
/* 375 */                           if (bundle.getBoolean(ENABLE_VULKAN_VALIDATION_META_DATA_KEY, false)) {
/* 379 */                               arrayList.add(FlutterShellArgs.ARG_ENABLE_VULKAN_VALIDATION);
                                    }
/* 388 */                           if (bundle.getBoolean(IMPELLER_OPENGL_GPU_TRACING_DATA_KEY, false)) {
/* 392 */                               arrayList.add("--enable-opengl-gpu-tracing");
                                    }
/* 401 */                           if (bundle.getBoolean(IMPELLER_VULKAN_GPU_TRACING_DATA_KEY, false)) {
/* 405 */                               arrayList.add("--enable-vulkan-gpu-tracing");
                                    }
/* 414 */                           if (bundle.getBoolean(DISABLE_MERGED_PLATFORM_UI_THREAD_KEY, false)) {
/* 418 */                               arrayList.add("--merged-platform-ui-thread=disabled");
                                    }
/* 427 */                           if (bundle.getBoolean(ENABLE_FLUTTER_GPU, false)) {
/* 431 */                               arrayList.add("--enable-flutter-gpu");
                                    }
/* 440 */                           if (bundle.getBoolean(ENABLE_SURFACE_CONTROL, false)) {
/* 444 */                               arrayList.add("--enable-surface-control");
                                    }
/* 449 */                           String string = bundle.getString(IMPELLER_BACKEND_META_DATA_KEY);
/* 453 */                           if (string != null) {
/* 459 */                               arrayList.add("--impeller-backend=".concat(string));
                                    }
/* 468 */                           if (bundle.getBoolean(IMPELLER_LAZY_SHADER_MODE)) {
/* 472 */                               arrayList.add("--impeller-lazy-shader-mode");
                                    }
/* 481 */                           if (bundle.getBoolean(IMPELLER_ANTIALIAS_LINES)) {
/* 485 */                               arrayList.add("--impeller-antialias-lines");
                                    }
                                }
/* 503 */                       arrayList.add("--leak-vm=".concat(isLeakVM(bundle) ? "true" : "false"));
/* 542 */                       this.flutterJNI.init(context2, (String[]) arrayList.toArray(new String[0]), null, initResult.appStoragePath, initResult.engineCachesPath, SystemClock.uptimeMillis() - this.initStartTimestampMillis, Build.VERSION.SDK_INT);
/* 546 */                       this.initialized = true;
/* 548 */                       if (traceSection != null) {
/* 550 */                           traceSection.close();
                                }
                            } catch (Throwable th) {
/* 106 */                       th = th;
/* 107 */                       Throwable th2 = th;
/* 559 */                       if (traceSection == null) {
/* 569 */                           throw th2;
                                }
                                try {
/* 561 */                           traceSection.close();
/* 569 */                           throw th2;
                                } catch (Throwable th3) {
/* 566 */                           th2.addSuppressed(th3);
/* 569 */                           throw th2;
                                }
                            }
                        } catch (Throwable th4) {
/* 554 */                   th = th4;
/* 555 */                   traceSection = traceSectionScoped;
                        }
                    } catch (Exception e) {
/* 575 */               Log.m4586e(TAG, "Flutter initialization failed.", e);
/* 578 */               ds0.m3199p(e);
                    }
                }

                public void ensureInitializationCompleteAsync(Context context, String[] strArr, Handler handler, Runnable runnable) {
/* 9 */             if (Looper.myLooper() != Looper.getMainLooper()) {
/* 48 */                f42.m3656l("ensureInitializationComplete must be called on the main thread");
/* 51 */                return;
                    }
/* 13 */            if (this.settings == null) {
/* 42 */                f42.m3656l("ensureInitializationComplete must be called after startInitialization");
                    } else if (this.initialized) {
/* 19 */                handler.post(runnable);
                    } else {
/* 36 */                this.executorService.execute(new uk0(this, context, strArr, handler, runnable, 0));
                    }
                }

                public String findAppBundlePath() {
/* 3 */             return this.flutterApplicationInfo.flutterAssetsDir;
                }

                public String getLookupKeyForAsset(String str, String str2) {
/* 5 */             StringBuilder sb = new StringBuilder("packages");
/* 8 */             String str3 = File.separator;
/* 14 */            return getLookupKeyForAsset(fm0.m3791q(sb, str3, str2, str3, str));
                }

                public boolean initialized() {
/* 1 */             return this.initialized;
                }

                public void startInitialization(Context context, Settings settings) {
/* 3 */             if (this.settings != null) {
/* 75 */                return;
                    }
/* 14 */            if (Looper.myLooper() != Looper.getMainLooper()) {
/* 90 */                f42.m3656l("startInitialization must be called on the main thread");
/* 93 */                return;
                    }
/* 18 */            TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader#startInitialization");
                    try {
/* 22 */                Context applicationContext = context.getApplicationContext();
/* 26 */                this.settings = settings;
/* 32 */                this.initStartTimestampMillis = SystemClock.uptimeMillis();
/* 38 */                this.flutterApplicationInfo = ApplicationInfoLoader.load(applicationContext);
/* 54 */                VsyncWaiter.getInstance((DisplayManager) applicationContext.getSystemService("display"), this.flutterJNI).init();
/* 68 */                this.initResultFuture = this.executorService.submit(new CallableC10621(applicationContext));
/* 70 */                if (traceSectionScoped != null) {
/* 72 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 77 */                if (traceSectionScoped != null) {
                            try {
/* 79 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 84 */                        th.addSuppressed(th2);
                            }
                        }
/* 87 */                throw th;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 9 */         public static class InitResult {
                    final String appStoragePath;
                    final String dataDirPath;
                    final String engineCachesPath;

                    private InitResult(String str, String str2, String str3) {
/* 4 */                 this.appStoragePath = str;
/* 6 */                 this.engineCachesPath = str2;
/* 8 */                 this.dataDirPath = str3;
                    }

/* 10 */            public /* synthetic */ InitResult(String str, String str2, String str3, CallableC10621 callableC10621) {
/* 11 */                this(str, str2, str3);
                    }
                }

/* 16 */        public FlutterLoader(FlutterJNI flutterJNI) {
/* 17 */            this(flutterJNI, FlutterInjector.instance().executorService());
                }

/* 17 */        public FlutterLoader(FlutterJNI flutterJNI, ExecutorService executorService) {
/* 19 */            this.initialized = false;
/* 20 */            this.flutterJNI = flutterJNI;
/* 21 */            this.executorService = executorService;
                }

/* 18 */        public String getLookupKeyForAsset(String str) {
/* 19 */            return fullAssetPathFrom(str);
                }

/* 93 */        public void startInitialization(Context context) {
/* 94 */            startInitialization(context, new Settings());
                }
            }
