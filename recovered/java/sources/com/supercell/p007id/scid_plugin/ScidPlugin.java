            package com.supercell.p007id.scid_plugin;

            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/ScidPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "platformInterfacePlugin", "Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;", "mobileScannerPlugin", "Lcom/supercell/id/scid_plugin/MobileScannerPlugin;", "onAttachedToEngine", HttpUrl.FRAGMENT_ENCODE_SET, "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "onAttachedToActivity", "activityPluginBinding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "binding", "onDetachedFromActivityForConfigChanges", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class ScidPlugin implements FlutterPlugin, ActivityAware {
                private MobileScannerPlugin mobileScannerPlugin;
                private PlatformInterfacePlugin platformInterfacePlugin;

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             MobileScannerPlugin mobileScannerPlugin = this.mobileScannerPlugin;
/* 6 */             if (mobileScannerPlugin != null) {
/* 8 */                 mobileScannerPlugin.onAttachedToActivity(activityPluginBinding);
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 6 */             PlatformInterfacePlugin platformInterfacePlugin = new PlatformInterfacePlugin();
/* 9 */             platformInterfacePlugin.onAttachedToEngine(flutterPluginBinding);
/* 12 */            this.platformInterfacePlugin = platformInterfacePlugin;
/* 16 */            MobileScannerPlugin mobileScannerPlugin = new MobileScannerPlugin();
/* 19 */            mobileScannerPlugin.onAttachedToEngine(flutterPluginBinding);
/* 22 */            this.mobileScannerPlugin = mobileScannerPlugin;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivity() {
/* 1 */             MobileScannerPlugin mobileScannerPlugin = this.mobileScannerPlugin;
/* 3 */             if (mobileScannerPlugin != null) {
/* 5 */                 mobileScannerPlugin.onDetachedFromActivity();
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivityForConfigChanges() {
/* 1 */             MobileScannerPlugin mobileScannerPlugin = this.mobileScannerPlugin;
/* 3 */             if (mobileScannerPlugin != null) {
/* 5 */                 mobileScannerPlugin.onDetachedFromActivityForConfigChanges();
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             MobileScannerPlugin mobileScannerPlugin = this.mobileScannerPlugin;
/* 6 */             if (mobileScannerPlugin != null) {
/* 8 */                 mobileScannerPlugin.onDetachedFromEngine(flutterPluginBinding);
                    }
/* 12 */            this.mobileScannerPlugin = null;
/* 14 */            PlatformInterfacePlugin platformInterfacePlugin = this.platformInterfacePlugin;
/* 16 */            if (platformInterfacePlugin != null) {
/* 18 */                platformInterfacePlugin.onDetachedFromEngine(flutterPluginBinding);
                    }
/* 21 */            this.platformInterfacePlugin = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
/* 1 */             binding.getClass();
/* 4 */             MobileScannerPlugin mobileScannerPlugin = this.mobileScannerPlugin;
/* 6 */             if (mobileScannerPlugin != null) {
/* 8 */                 mobileScannerPlugin.onReattachedToActivityForConfigChanges(binding);
                    }
                }
            }
