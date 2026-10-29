            package p000;

            import android.content.Context;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hd2 implements FlutterPlugin, ActivityAware {

                /* JADX INFO: renamed from: a */
                public C0168b5 f9020a;

                /* JADX INFO: renamed from: b */
                public id2 f9021b;

                /* JADX INFO: renamed from: c */
                public MethodChannel f9022c;

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             id2 id2Var = this.f9021b;
/* 7 */             if (id2Var == null) {
/* 31 */                Intrinsics.m6220e("manager");
/* 34 */                throw null;
                    }
/* 9 */             activityPluginBinding.addActivityResultListener(id2Var);
/* 12 */            C0168b5 c0168b5 = this.f9020a;
/* 14 */            if (c0168b5 != null) {
/* 20 */                c0168b5.f2212c = activityPluginBinding.getActivity();
                    } else {
/* 25 */                Intrinsics.m6220e(FirebaseAnalytics.Event.SHARE);
/* 28 */                throw null;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 15 */            this.f9022c = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
/* 23 */            flutterPluginBinding.getApplicationContext().getClass();
/* 26 */            id2 id2Var = new id2();
/* 35 */            id2Var.f9555b = new AtomicBoolean(true);
/* 37 */            this.f9021b = id2Var;
/* 41 */            Context applicationContext = flutterPluginBinding.getApplicationContext();
/* 45 */            applicationContext.getClass();
/* 48 */            id2 id2Var2 = this.f9021b;
/* 53 */            if (id2Var2 == null) {
/* 87 */                Intrinsics.m6220e("manager");
/* 90 */                throw null;
                    }
/* 55 */            C0168b5 c0168b5 = new C0168b5(applicationContext, id2Var2);
/* 58 */            this.f9020a = c0168b5;
/* 62 */            id2 id2Var3 = this.f9021b;
/* 64 */            if (id2Var3 == null) {
/* 83 */                Intrinsics.m6220e("manager");
/* 86 */                throw null;
                    }
/* 66 */            ri1 ri1Var = new ri1(c0168b5, id2Var3);
/* 69 */            MethodChannel methodChannel = this.f9022c;
/* 71 */            if (methodChannel != null) {
/* 73 */                methodChannel.setMethodCallHandler(ri1Var);
                    } else {
/* 79 */                Intrinsics.m6220e("methodChannel");
/* 82 */                throw null;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivity() {
/* 1 */             C0168b5 c0168b5 = this.f9020a;
/* 4 */             if (c0168b5 != null) {
/* 6 */                 c0168b5.f2212c = null;
                    } else {
/* 11 */                Intrinsics.m6220e(FirebaseAnalytics.Event.SHARE);
/* 14 */                throw null;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivityForConfigChanges() {
/* 1 */             onDetachedFromActivity();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             MethodChannel methodChannel = this.f9022c;
/* 7 */             if (methodChannel != null) {
/* 9 */                 methodChannel.setMethodCallHandler(null);
                    } else {
/* 15 */                Intrinsics.m6220e("methodChannel");
/* 18 */                throw null;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             onAttachedToActivity(activityPluginBinding);
                }
            }
