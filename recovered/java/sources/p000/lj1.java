            package p000;

            import android.app.Activity;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.EventChannel;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.view.TextureRegistry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lj1 implements FlutterPlugin, ActivityAware {

                /* JADX INFO: renamed from: a */
                public ActivityPluginBinding f13315a;

                /* JADX INFO: renamed from: b */
                public FlutterPlugin.FlutterPluginBinding f13316b;

                /* JADX INFO: renamed from: c */
                public kj1 f13317c;

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.f13316b;
/* 6 */             flutterPluginBinding.getClass();
/* 9 */             BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
/* 13 */            binaryMessenger.getClass();
/* 18 */            Activity activity = activityPluginBinding.getActivity();
/* 22 */            activity.getClass();
/* 27 */            C2255uh c2255uh = new C2255uh();
/* 37 */            new EventChannel(binaryMessenger, "com.supercell.social.SocialPlugin.mobile_scanner/event").setStreamHandler(c2255uh);
/* 40 */            FlutterPlugin.FlutterPluginBinding flutterPluginBinding2 = this.f13316b;
/* 42 */            flutterPluginBinding2.getClass();
/* 45 */            TextureRegistry textureRegistry = flutterPluginBinding2.getTextureRegistry();
/* 49 */            textureRegistry.getClass();
/* 55 */            this.f13317c = new kj1(activity, c2255uh, binaryMessenger, textureRegistry);
/* 57 */            this.f13315a = activityPluginBinding;
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             this.f13316b = flutterPluginBinding;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivity() {
/* 1 */             kj1 kj1Var = this.f13317c;
/* 4 */             if (kj1Var != null) {
/* 12 */                kj1Var.f12820a.getApplication().unregisterActivityLifecycleCallbacks(kj1Var);
/* 15 */                MethodChannel methodChannel = kj1Var.f12822c;
/* 17 */                if (methodChannel != null) {
/* 19 */                    methodChannel.setMethodCallHandler(null);
                        }
/* 22 */                kj1Var.f12822c = null;
/* 24 */                fj1 fj1Var = kj1Var.f12823d;
/* 26 */                if (fj1Var != null) {
/* 32 */                    fj1Var.f8240f.m4489g(u61.f17374a);
                        }
/* 35 */                kj1Var.f12823d = null;
/* 37 */                MethodChannel.Result result = kj1Var.f12824e;
/* 39 */                if (result != null) {
/* 45 */                    result.error("MobileScanner", "Plugin disposed before responding.", null);
                        }
/* 48 */                kj1Var.f12824e = null;
                    }
/* 50 */            this.f13317c = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivityForConfigChanges() {
/* 1 */             onDetachedFromActivity();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 5 */             this.f13316b = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             onAttachedToActivity(activityPluginBinding);
                }
            }
