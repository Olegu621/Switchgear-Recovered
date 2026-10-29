            package com.supercell.p007id.scid_plugin;

            import android.app.Activity;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.view.TextureRegistry;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/MobileScannerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "activityPluginBinding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "methodCallHandler", "Lcom/supercell/id/scid_plugin/MobileScannerHandler;", "onAttachedToEngine", HttpUrl.FRAGMENT_ENCODE_SET, "binding", "onDetachedFromEngine", "onAttachedToActivity", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "onDetachedFromActivityForConfigChanges", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class MobileScannerPlugin implements FlutterPlugin, ActivityAware {
                private ActivityPluginBinding activityPluginBinding;
                private FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
                private MobileScannerHandler methodCallHandler;

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.flutterPluginBinding;
/* 6 */             flutterPluginBinding.getClass();
/* 9 */             BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
/* 13 */            binaryMessenger.getClass();
/* 18 */            Activity activity = activityPluginBinding.getActivity();
/* 22 */            activity.getClass();
/* 27 */            BarcodeHandler barcodeHandler = new BarcodeHandler(binaryMessenger);
/* 30 */            FlutterPlugin.FlutterPluginBinding flutterPluginBinding2 = this.flutterPluginBinding;
/* 32 */            flutterPluginBinding2.getClass();
/* 35 */            TextureRegistry textureRegistry = flutterPluginBinding2.getTextureRegistry();
/* 39 */            textureRegistry.getClass();
/* 45 */            this.methodCallHandler = new MobileScannerHandler(activity, barcodeHandler, binaryMessenger, textureRegistry);
/* 47 */            this.activityPluginBinding = activityPluginBinding;
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
/* 1 */             binding.getClass();
/* 4 */             this.flutterPluginBinding = binding;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivity() {
/* 1 */             MobileScannerHandler mobileScannerHandler = this.methodCallHandler;
/* 3 */             if (mobileScannerHandler != null) {
/* 5 */                 mobileScannerHandler.dispose();
                    }
/* 9 */             this.methodCallHandler = null;
/* 11 */            this.activityPluginBinding = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivityForConfigChanges() {
/* 1 */             onDetachedFromActivity();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
/* 1 */             binding.getClass();
/* 5 */             this.flutterPluginBinding = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
/* 1 */             binding.getClass();
/* 4 */             onAttachedToActivity(binding);
                }
            }
