            package p000;

            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pf2 implements FlutterPlugin, ActivityAware {

                /* JADX INFO: renamed from: a */
                public ys1 f15099a;

                /* JADX INFO: renamed from: b */
                public lj1 f15100b;

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             lj1 lj1Var = this.f15100b;
/* 6 */             if (lj1Var != null) {
/* 8 */                 lj1Var.onAttachedToActivity(activityPluginBinding);
                    }
/* 11 */            ys1 ys1Var = this.f15099a;
/* 13 */            if (ys1Var != null) {
/* 15 */                ys1Var.onAttachedToActivity(activityPluginBinding);
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 6 */             ys1 ys1Var = new ys1();
/* 9 */             ys1Var.onAttachedToEngine(flutterPluginBinding);
/* 12 */            this.f15099a = ys1Var;
/* 16 */            lj1 lj1Var = new lj1();
/* 19 */            lj1Var.f13316b = flutterPluginBinding;
/* 21 */            this.f15100b = lj1Var;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivity() {
/* 1 */             lj1 lj1Var = this.f15100b;
/* 3 */             if (lj1Var != null) {
/* 5 */                 lj1Var.onDetachedFromActivity();
                    }
/* 8 */             ys1 ys1Var = this.f15099a;
/* 10 */            if (ys1Var != null) {
/* 12 */                ys1Var.onDetachedFromActivity();
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivityForConfigChanges() {
/* 1 */             lj1 lj1Var = this.f15100b;
/* 3 */             if (lj1Var != null) {
/* 5 */                 lj1Var.onDetachedFromActivity();
                    }
/* 8 */             ys1 ys1Var = this.f15099a;
/* 10 */            if (ys1Var != null) {
/* 12 */                ys1Var.onDetachedFromActivity();
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             lj1 lj1Var = this.f15100b;
/* 6 */             if (lj1Var != null) {
/* 8 */                 lj1Var.onDetachedFromEngine(flutterPluginBinding);
                    }
/* 12 */            this.f15100b = null;
/* 14 */            ys1 ys1Var = this.f15099a;
/* 16 */            if (ys1Var != null) {
/* 18 */                ys1Var.onDetachedFromEngine(flutterPluginBinding);
                    }
/* 21 */            this.f15099a = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             lj1 lj1Var = this.f15100b;
/* 6 */             if (lj1Var != null) {
/* 8 */                 lj1Var.onReattachedToActivityForConfigChanges(activityPluginBinding);
                    }
/* 11 */            ys1 ys1Var = this.f15099a;
/* 13 */            if (ys1Var != null) {
/* 15 */                ys1Var.onReattachedToActivityForConfigChanges(activityPluginBinding);
                    }
                }
            }
