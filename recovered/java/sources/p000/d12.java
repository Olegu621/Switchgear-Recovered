            package p000;

            import android.app.Activity;
            import android.app.Application;
            import com.appsflyer.AppsFlyerProperties;
            import com.google.android.recaptcha.RecaptchaAction;
            import com.google.android.recaptcha.RecaptchaClient;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d12 implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

                /* JADX INFO: renamed from: a */
                public MethodChannel f6957a;

                /* JADX INFO: renamed from: b */
                public RecaptchaClient f6958b;

                /* JADX INFO: renamed from: c */
                public Application f6959c;

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             Activity activity = activityPluginBinding.getActivity();
/* 8 */             activity.getClass();
/* 15 */            this.f6959c = activity.getApplication();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 12 */            MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "recaptcha_enterprise");
/* 15 */            this.f6957a = methodChannel;
/* 17 */            methodChannel.setMethodCallHandler(this);
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivity() {
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivityForConfigChanges() {
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             MethodChannel methodChannel = this.f6957a;
/* 7 */             if (methodChannel != null) {
/* 9 */                 methodChannel.setMethodCallHandler(null);
                    } else {
/* 15 */                Intrinsics.m6220e(AppsFlyerProperties.CHANNEL);
/* 18 */                throw null;
                    }
                }

                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    RecaptchaAction recaptchaActionCustom;
/* 1 */             methodCall.getClass();
/* 4 */             result.getClass();
/* 7 */             String str = methodCall.method;
/* 9 */             if (str != null) {
/* 11 */                int iHashCode = str.hashCode();
/* 21 */                jr0 jr0Var = jr0.f12448a;
/* 28 */                if (iHashCode != -1319569547) {
/* 35 */                    if (iHashCode != -206751493) {
/* 40 */                        if (iHashCode == 86995749 && str.equals("fetchClient")) {
/* 54 */                            Application application = this.f6959c;
/* 56 */                            if (application == null) {
/* 58 */                                result.error("FL_INIT_FAILED", "No application registered", null);
/* 61 */                                return;
                                    }
/* 67 */                            String str2 = (String) methodCall.argument("siteKey");
/* 69 */                            if (str2 != null) {
/* 79 */                                i13.m4443w(jr0Var, null, new b12(this, application, str2, result, null), 3);
/* 82 */                                return;
                                    }
/* 127 */                           return;
                                }
                            } else if (str.equals("initClient")) {
/* 93 */                        Application application2 = this.f6959c;
/* 95 */                        if (application2 == null) {
/* 97 */                            result.error("FL_INIT_FAILED", "No application registered", null);
/* 100 */                           return;
                                }
/* 105 */                       String str3 = (String) methodCall.argument("siteKey");
/* 111 */                       Double d = (Double) methodCall.argument("timeout");
/* 113 */                       if (str3 != null) {
/* 124 */                           i13.m4443w(jr0Var, null, new c12(d, application2, str3, this, result, null), 3);
/* 127 */                           return;
                                }
/* 127 */                       return;
                            }
                        } else if (str.equals("execute")) {
/* 141 */                   if (this.f6958b == null) {
/* 218 */                       result.error("FL_EXECUTE_FAILED", "Initialize client first", null);
/* 221 */                       return;
                            }
/* 145 */                   if (this.f6959c == null) {
/* 147 */                       result.error("FL_INIT_FAILED", "No application registered", null);
/* 150 */                       return;
                            }
/* 157 */                   String str4 = (String) methodCall.argument("action");
/* 159 */                   if (str4 == null) {
/* 163 */                       result.error("FL_EXECUTE_FAILED", "Missing action", null);
/* 166 */                       return;
                            }
/* 173 */                   if (str4.equals(FirebaseAnalytics.Event.LOGIN)) {
/* 175 */                       recaptchaActionCustom = RecaptchaAction.LOGIN;
                            } else {
/* 192 */                       recaptchaActionCustom = str4.equals("signup") ? RecaptchaAction.SIGNUP : RecaptchaAction.INSTANCE.custom(str4);
                            }
/* 212 */                   i13.m4443w(jr0Var, null, new a12(this, (Double) methodCall.argument("timeout"), recaptchaActionCustom, result, null), 3);
/* 215 */                   return;
                        }
                    }
/* 222 */           result.notImplemented();
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
                }
            }
