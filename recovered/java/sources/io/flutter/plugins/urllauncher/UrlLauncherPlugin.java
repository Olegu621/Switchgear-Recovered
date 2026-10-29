            package io.flutter.plugins.urllauncher;

            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UrlLauncherPlugin implements FlutterPlugin, ActivityAware {
                private static final String TAG = "UrlLauncherPlugin";
                private UrlLauncher urlLauncher;

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             UrlLauncher urlLauncher = this.urlLauncher;
/* 3 */             if (urlLauncher == null) {
/* 9 */                 AbstractC1245n0.m4892t(TAG, "urlLauncher was never set.");
                    } else {
/* 17 */                urlLauncher.setActivity(activityPluginBinding.getActivity());
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 10 */            this.urlLauncher = new UrlLauncher(flutterPluginBinding.getApplicationContext());
/* 18 */            Messages.UrlLauncherApi.setUp(flutterPluginBinding.getBinaryMessenger(), this.urlLauncher);
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivity() {
/* 1 */             UrlLauncher urlLauncher = this.urlLauncher;
/* 3 */             if (urlLauncher == null) {
/* 9 */                 AbstractC1245n0.m4892t(TAG, "urlLauncher was never set.");
                    } else {
/* 14 */                urlLauncher.setActivity(null);
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivityForConfigChanges() {
/* 1 */             onDetachedFromActivity();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 3 */             if (this.urlLauncher == null) {
/* 9 */                 AbstractC1245n0.m4892t(TAG, "Already detached from the engine.");
                    } else {
/* 18 */                Messages.UrlLauncherApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
/* 21 */                this.urlLauncher = null;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             onAttachedToActivity(activityPluginBinding);
                }
            }
