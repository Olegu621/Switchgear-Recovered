            package p000;

            import android.app.Activity;
            import android.content.Context;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.MethodChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ur1 implements FlutterPlugin, ActivityAware {

                /* JADX INFO: renamed from: a */
                public vr1 f17697a;

                /* JADX INFO: renamed from: b */
                public MethodChannel f17698b;

                /* JADX INFO: renamed from: c */
                public ActivityPluginBinding f17699c;

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             Activity activity = activityPluginBinding.getActivity();
/* 5 */             vr1 vr1Var = this.f17697a;
/* 7 */             if (vr1Var != null) {
/* 9 */                 vr1Var.f18328c = activity;
                    }
/* 11 */            this.f17699c = activityPluginBinding;
/* 13 */            activityPluginBinding.addActivityResultListener(vr1Var);
/* 20 */            this.f17699c.addRequestPermissionsResultListener(this.f17697a);
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 10 */            this.f17697a = new vr1(flutterPluginBinding.getApplicationContext());
/* 12 */            Context applicationContext = flutterPluginBinding.getApplicationContext();
/* 24 */            MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter.baseflow.com/permissions/methods");
/* 27 */            this.f17698b = methodChannel;
/* 49 */            methodChannel.setMethodCallHandler(new ti1(applicationContext, new dc0(18), this.f17697a, new q62(1)));
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivity() {
/* 1 */             vr1 vr1Var = this.f17697a;
/* 4 */             if (vr1Var != null) {
/* 6 */                 vr1Var.f18328c = null;
                    }
/* 8 */             ActivityPluginBinding activityPluginBinding = this.f17699c;
/* 10 */            if (activityPluginBinding != null) {
/* 12 */                activityPluginBinding.removeActivityResultListener(vr1Var);
/* 19 */                this.f17699c.removeRequestPermissionsResultListener(this.f17697a);
                    }
/* 22 */            this.f17699c = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivityForConfigChanges() {
/* 1 */             onDetachedFromActivity();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 4 */             this.f17698b.setMethodCallHandler(null);
/* 7 */             this.f17698b = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             onAttachedToActivity(activityPluginBinding);
                }
            }
