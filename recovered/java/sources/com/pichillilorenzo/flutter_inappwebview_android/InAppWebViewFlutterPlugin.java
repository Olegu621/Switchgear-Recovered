            package com.pichillilorenzo.flutter_inappwebview_android;

            import android.app.Activity;
            import android.content.Context;
            import android.os.Build;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeSafariBrowserManager;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabaseHandler;
            import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
            import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserManager;
            import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager;
            import com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigManager;
            import com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager;
            import com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager;
            import com.pichillilorenzo.flutter_inappwebview_android.tracing.TracingControllerManager;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.FlutterWebViewFactory;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
            import io.flutter.embedding.android.FlutterView;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.platform.PlatformViewRegistry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 131 */   public class InAppWebViewFlutterPlugin implements FlutterPlugin, ActivityAware {
                protected static final String LOG_TAG = "InAppWebViewFlutterPL";
                public Activity activity;
                public ActivityPluginBinding activityPluginBinding;
                public Context applicationContext;
                public ChromeSafariBrowserManager chromeSafariBrowserManager;
                public CredentialDatabaseHandler credentialDatabaseHandler;
                public FlutterPlugin.FlutterAssets flutterAssets;
                public FlutterView flutterView;
                public FlutterWebViewFactory flutterWebViewFactory;
                public HeadlessInAppWebViewManager headlessInAppWebViewManager;
                public InAppBrowserManager inAppBrowserManager;
                public InAppWebViewManager inAppWebViewManager;
                public BinaryMessenger messenger;
                public MyCookieManager myCookieManager;
                public MyWebStorage myWebStorage;
                public NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
                public PlatformUtil platformUtil;
                public PrintJobManager printJobManager;
                public ProcessGlobalConfigManager processGlobalConfigManager;
                public ProxyManager proxyManager;
                public ServiceWorkerManager serviceWorkerManager;
                public TracingControllerManager tracingControllerManager;
                public WebViewFeatureManager webViewFeatureManager;

                private void onAttachedToEngine(Context context, BinaryMessenger binaryMessenger, Activity activity, PlatformViewRegistry platformViewRegistry, FlutterView flutterView) {
/* 1 */             this.applicationContext = context;
/* 3 */             this.activity = activity;
/* 5 */             this.messenger = binaryMessenger;
/* 7 */             this.flutterView = flutterView;
/* 14 */            this.inAppBrowserManager = new InAppBrowserManager(this);
/* 21 */            this.headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
/* 28 */            this.chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
/* 35 */            this.noHistoryCustomTabsActivityCallbacks = new NoHistoryCustomTabsActivityCallbacks(this);
/* 39 */            FlutterWebViewFactory flutterWebViewFactory = new FlutterWebViewFactory(this);
/* 42 */            this.flutterWebViewFactory = flutterWebViewFactory;
/* 46 */            platformViewRegistry.registerViewFactory(FlutterWebViewFactory.VIEW_TYPE_ID, flutterWebViewFactory);
/* 54 */            this.platformUtil = new PlatformUtil(this);
/* 61 */            this.inAppWebViewManager = new InAppWebViewManager(this);
/* 68 */            this.myCookieManager = new MyCookieManager(this);
/* 75 */            this.myWebStorage = new MyWebStorage(this);
/* 77 */            int i = Build.VERSION.SDK_INT;
/* 84 */            this.serviceWorkerManager = new ServiceWorkerManager(this);
/* 88 */            if (i >= 26) {
/* 95 */                this.credentialDatabaseHandler = new CredentialDatabaseHandler(this);
                    }
/* 102 */           this.webViewFeatureManager = new WebViewFeatureManager(this);
/* 109 */           this.proxyManager = new ProxyManager(this);
/* 116 */           this.printJobManager = new PrintJobManager(this);
/* 123 */           this.tracingControllerManager = new TracingControllerManager(this);
/* 130 */           this.processGlobalConfigManager = new ProcessGlobalConfigManager(this);
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             this.activityPluginBinding = activityPluginBinding;
/* 3 */             Activity activity = activityPluginBinding.getActivity();
/* 7 */             this.activity = activity;
/* 11 */            if (this.noHistoryCustomTabsActivityCallbacks != null) {
/* 21 */                activity.getApplication().registerActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivity() {
/* 1 */             Activity activity = this.activity;
/* 3 */             if (activity != null && this.noHistoryCustomTabsActivityCallbacks != null) {
/* 17 */                activity.getApplication().unregisterActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
                    }
/* 21 */            this.activityPluginBinding = null;
/* 23 */            this.activity = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivityForConfigChanges() {
/* 1 */             Activity activity = this.activity;
/* 3 */             if (activity != null && this.noHistoryCustomTabsActivityCallbacks != null) {
/* 17 */                activity.getApplication().unregisterActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
                    }
/* 21 */            this.activityPluginBinding = null;
/* 23 */            this.activity = null;
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             PlatformUtil platformUtil = this.platformUtil;
/* 4 */             if (platformUtil != null) {
/* 6 */                 platformUtil.dispose();
/* 9 */                 this.platformUtil = null;
                    }
/* 11 */            InAppBrowserManager inAppBrowserManager = this.inAppBrowserManager;
/* 13 */            if (inAppBrowserManager != null) {
/* 15 */                inAppBrowserManager.dispose();
/* 18 */                this.inAppBrowserManager = null;
                    }
/* 20 */            HeadlessInAppWebViewManager headlessInAppWebViewManager = this.headlessInAppWebViewManager;
/* 22 */            if (headlessInAppWebViewManager != null) {
/* 24 */                headlessInAppWebViewManager.dispose();
/* 27 */                this.headlessInAppWebViewManager = null;
                    }
/* 29 */            ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeSafariBrowserManager;
/* 31 */            if (chromeSafariBrowserManager != null) {
/* 33 */                chromeSafariBrowserManager.dispose();
/* 36 */                this.chromeSafariBrowserManager = null;
                    }
/* 38 */            NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks = this.noHistoryCustomTabsActivityCallbacks;
/* 40 */            if (noHistoryCustomTabsActivityCallbacks != null) {
/* 42 */                noHistoryCustomTabsActivityCallbacks.dispose();
/* 45 */                this.noHistoryCustomTabsActivityCallbacks = null;
                    }
/* 47 */            MyCookieManager myCookieManager = this.myCookieManager;
/* 49 */            if (myCookieManager != null) {
/* 51 */                myCookieManager.dispose();
/* 54 */                this.myCookieManager = null;
                    }
/* 56 */            MyWebStorage myWebStorage = this.myWebStorage;
/* 58 */            if (myWebStorage != null) {
/* 60 */                myWebStorage.dispose();
/* 63 */                this.myWebStorage = null;
                    }
/* 65 */            CredentialDatabaseHandler credentialDatabaseHandler = this.credentialDatabaseHandler;
/* 67 */            if (credentialDatabaseHandler != null && Build.VERSION.SDK_INT >= 26) {
/* 75 */                credentialDatabaseHandler.dispose();
/* 78 */                this.credentialDatabaseHandler = null;
                    }
/* 80 */            InAppWebViewManager inAppWebViewManager = this.inAppWebViewManager;
/* 82 */            if (inAppWebViewManager != null) {
/* 84 */                inAppWebViewManager.dispose();
/* 87 */                this.inAppWebViewManager = null;
                    }
/* 89 */            ServiceWorkerManager serviceWorkerManager = this.serviceWorkerManager;
/* 91 */            if (serviceWorkerManager != null) {
/* 93 */                serviceWorkerManager.dispose();
/* 96 */                this.serviceWorkerManager = null;
                    }
/* 98 */            WebViewFeatureManager webViewFeatureManager = this.webViewFeatureManager;
/* 100 */           if (webViewFeatureManager != null) {
/* 102 */               webViewFeatureManager.dispose();
/* 105 */               this.webViewFeatureManager = null;
                    }
/* 107 */           ProxyManager proxyManager = this.proxyManager;
/* 109 */           if (proxyManager != null) {
/* 111 */               proxyManager.dispose();
/* 114 */               this.proxyManager = null;
                    }
/* 116 */           PrintJobManager printJobManager = this.printJobManager;
/* 118 */           if (printJobManager != null) {
/* 120 */               printJobManager.dispose();
/* 123 */               this.printJobManager = null;
                    }
/* 125 */           TracingControllerManager tracingControllerManager = this.tracingControllerManager;
/* 127 */           if (tracingControllerManager != null) {
/* 129 */               tracingControllerManager.dispose();
/* 132 */               this.tracingControllerManager = null;
                    }
/* 134 */           ProcessGlobalConfigManager processGlobalConfigManager = this.processGlobalConfigManager;
/* 136 */           if (processGlobalConfigManager != null) {
/* 138 */               processGlobalConfigManager.dispose();
/* 141 */               this.processGlobalConfigManager = null;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             this.activityPluginBinding = activityPluginBinding;
/* 3 */             Activity activity = activityPluginBinding.getActivity();
/* 7 */             this.activity = activity;
/* 11 */            if (this.noHistoryCustomTabsActivityCallbacks != null) {
/* 21 */                activity.getApplication().registerActivityLifecycleCallbacks(this.noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
/* 132 */       public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 133 */           this.flutterAssets = flutterPluginBinding.getFlutterAssets();
/* 135 */           onAttachedToEngine(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger(), this.activity, flutterPluginBinding.getPlatformViewRegistry(), null);
                }
            }
