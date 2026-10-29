            package p000;

            import android.app.Activity;
            import android.app.ActivityManager;
            import android.app.Application;
            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.provider.Settings;
            import android.view.Display;
            import android.view.WindowManager;
            import com.appsflyer.AppsFlyerProperties;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.Locale;
            import java.util.TimeZone;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ys1 implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public MethodChannel f19801a;

                /* JADX INFO: renamed from: b */
                public Context f19802b;

                /* JADX INFO: renamed from: c */
                public ContentResolver f19803c;

                /* JADX INFO: renamed from: d */
                public Activity f19804d;

                /* JADX INFO: renamed from: e */
                public String f19805e;

                /* JADX INFO: renamed from: f */
                public MethodChannel.Result f19806f;

                /* JADX INFO: renamed from: a */
                public final int m10180a() {
                    Activity activity;
/* 1 */             Context context = this.f19802b;
/* 6 */             if (context == null) {
/* 71 */                Intrinsics.m6220e("applicationContext");
/* 74 */                throw null;
                    }
/* 15 */            boolean zM10416a = zo1.m10416a(new ap1(context).f2052a);
/* 25 */            if (Build.VERSION.SDK_INT < 33) {
                        return zM10416a ? 2 : 1;
                    }
/* 31 */            Context context2 = this.f19802b;
/* 33 */            if (context2 == null) {
/* 67 */                Intrinsics.m6220e("applicationContext");
/* 70 */                throw null;
                    }
/* 46 */            boolean z = v00.checkSelfPermission(context2, "android.permission.POST_NOTIFICATIONS") == 0;
/* 47 */            if (z && zM10416a) {
/* 23 */                return 2;
                    }
                    return (z || ((activity = this.f19804d) != null && AbstractC2353x2.m9684b(activity, "android.permission.POST_NOTIFICATIONS"))) ? 1 : 0;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 1 */             activity.getClass();
/* 10 */            if (Intrinsics.m6216a(activity, this.f19804d)) {
/* 12 */                MethodChannel.Result result = this.f19806f;
/* 15 */                this.f19806f = null;
/* 17 */                if (result != null) {
/* 27 */                    result.success(Integer.valueOf(m10180a()));
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
/* 1 */             activity.getClass();
/* 4 */             bundle.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 1 */             activity.getClass();
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
                    Application application;
/* 1 */             activityPluginBinding.getClass();
/* 4 */             Activity activity = activityPluginBinding.getActivity();
/* 8 */             this.f19804d = activity;
/* 10 */            if (activity == null || (application = activity.getApplication()) == null) {
/* 21 */                return;
                    }
/* 18 */            application.registerActivityLifecycleCallbacks(this);
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 8 */             this.f19802b = flutterPluginBinding.getApplicationContext();
/* 18 */            this.f19803c = flutterPluginBinding.getApplicationContext().getContentResolver();
/* 28 */            MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.supercell.social.SocialPlugin.platform_interface");
/* 31 */            this.f19801a = methodChannel;
/* 33 */            methodChannel.setMethodCallHandler(this);
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivity() {
                    Application application;
/* 1 */             Activity activity = this.f19804d;
/* 3 */             if (activity != null && (application = activity.getApplication()) != null) {
/* 11 */                application.unregisterActivityLifecycleCallbacks(this);
                    }
/* 14 */            MethodChannel.Result result = this.f19806f;
/* 17 */            if (result != null) {
/* 23 */                result.error("PushNotificationsPermission", "Activity detached before the push notifications permission request completed.", null);
                    }
/* 26 */            this.f19806f = null;
/* 28 */            this.f19804d = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivityForConfigChanges() {
/* 1 */             onDetachedFromActivity();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             MethodChannel.Result result = this.f19806f;
/* 7 */             if (result != null) {
/* 13 */                result.error("PushNotificationsPermission", "Plugin detached before the push notifications permission request completed.", null);
                    }
/* 16 */            this.f19806f = null;
/* 18 */            MethodChannel methodChannel = this.f19801a;
/* 20 */            if (methodChannel != null) {
/* 22 */                methodChannel.setMethodCallHandler(null);
                    } else {
/* 28 */                Intrinsics.m6220e(AppsFlyerProperties.CHANNEL);
/* 31 */                throw null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:121:0x01e9 A[PHI: r5
  0x01e9: PHI (r5v11 int) = (r5v10 int), (r5v12 int), (r5v13 int) binds: [B:114:0x01de, B:117:0x01e3, B:119:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    Display defaultDisplay;
                    String str;
/* 1 */             methodCall.getClass();
/* 4 */             result.getClass();
/* 7 */             String str2 = methodCall.method;
/* 9 */             if (str2 != null) {
/* 15 */                int i = 0;
                        switch (str2.hashCode()) {
                            case -1821700484:
/* 545 */                       if (str2.equals("getOSCountry")) {
/* 548 */                           Context context = this.f19802b;
/* 550 */                           if (context == null) {
/* 583 */                               Intrinsics.m6220e("applicationContext");
/* 586 */                               throw null;
                                    }
/* 564 */                           Locale locale = context.getResources().getConfiguration().getLocales().get(0);
/* 568 */                           locale.getClass();
/* 579 */                           result.success(String.valueOf(locale.getCountry()));
/* 582 */                           return;
                                }
                                break;
                            case -1107875961:
/* 507 */                       if (str2.equals("getDeviceId")) {
/* 512 */                           if (this.f19805e == null) {
/* 514 */                               ContentResolver contentResolver = this.f19803c;
/* 516 */                               if (contentResolver == null) {
/* 529 */                                   Intrinsics.m6220e("contentResolver");
/* 532 */                                   throw null;
                                        }
/* 524 */                               this.f19805e = Settings.Secure.getString(contentResolver, "android_id");
                                    }
/* 535 */                           result.success(this.f19805e);
/* 538 */                           return;
                                }
                                break;
                            case -189061402:
/* 436 */                       if (str2.equals("getUiOrientation")) {
/* 440 */                           Activity activity = this.f19804d;
/* 442 */                           if (activity != null) {
/* 449 */                               if (Build.VERSION.SDK_INT >= 30) {
/* 1 */                                     defaultDisplay = activity.getDisplay();
/* 455 */                                   defaultDisplay.getClass();
                                        } else {
/* 461 */                                   Object systemService = activity.getSystemService("window");
/* 465 */                                   systemService.getClass();
/* 470 */                                   defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                                        }
/* 474 */                               int rotation = defaultDisplay.getRotation();
/* 478 */                               int i2 = 1;
/* 479 */                               if (rotation == 0) {
/* 490 */                                   i = i2;
                                        } else if (rotation != 1) {
/* 483 */                                   i2 = 2;
/* 484 */                                   if (rotation != 2) {
/* 486 */                                       i2 = 3;
/* 487 */                                       if (rotation == 3) {
/* 490 */                                           i = i2;
                                                }
                                            } else {
/* 490 */                                       i = i2;
                                            }
                                        } else {
/* 492 */                                   i = 4;
                                        }
                                    }
/* 497 */                           result.success(Integer.valueOf(i));
/* 500 */                           return;
                                }
                                break;
                            case 719247:
/* 414 */                       if (str2.equals("getTimeZone")) {
/* 426 */                           result.success(TimeZone.getDefault().getID());
/* 429 */                           return;
                                }
                                break;
                            case 180923505:
/* 384 */                       if (str2.equals("getSystemNameAndVersion")) {
/* 404 */                           result.success("Android " + Build.VERSION.RELEASE);
/* 407 */                           return;
                                }
                                break;
                            case 242723862:
/* 338 */                       if (str2.equals("getAppName")) {
/* 342 */                           Context context2 = this.f19802b;
/* 344 */                           if (context2 == null) {
/* 374 */                               Intrinsics.m6220e("applicationContext");
/* 377 */                               throw null;
                                    }
/* 346 */                           ApplicationInfo applicationInfo = context2.getApplicationInfo();
/* 350 */                           Context context3 = this.f19802b;
/* 352 */                           if (context3 != null) {
/* 366 */                               result.success(applicationInfo.loadLabel(context3.getPackageManager()).toString());
/* 369 */                               return;
                                    } else {
/* 370 */                               Intrinsics.m6220e("applicationContext");
/* 373 */                               throw null;
                                    }
                                }
                                break;
                            case 347240634:
/* 300 */                       if (str2.equals("openAppSettings")) {
/* 304 */                           Activity activity2 = this.f19804d;
/* 306 */                           if (activity2 != null) {
/* 325 */                               activity2.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", activity2.getPackageName(), null)));
                                    }
/* 328 */                           result.success(null);
/* 331 */                           return;
                                }
                                break;
                            case 811455566:
/* 222 */                       if (str2.equals("requestPushNotificationsPermission")) {
/* 230 */                           if (Build.VERSION.SDK_INT < 33) {
/* 240 */                               result.success(Integer.valueOf(m10180a()));
/* 243 */                               return;
                                    }
/* 244 */                           Activity activity3 = this.f19804d;
/* 246 */                           if (activity3 == null) {
/* 252 */                               result.error("PushNotificationsPermission", "Unable to request push notifications permission without an active Activity.", null);
/* 255 */                               return;
                                    }
/* 256 */                           int iM10180a = m10180a();
/* 260 */                           if (iM10180a != 0) {
/* 266 */                               result.success(Integer.valueOf(iM10180a));
/* 269 */                               return;
                                    } else if (this.f19806f != null) {
/* 278 */                               result.error("PushNotificationsPermissionRequestOngoing", "Another push notifications permission request is already in progress.", null);
/* 281 */                               return;
                                    } else {
/* 282 */                               this.f19806f = result;
/* 290 */                               AbstractC2353x2.m9683a(activity3, new String[]{"android.permission.POST_NOTIFICATIONS"}, 0);
/* 293 */                               return;
                                    }
                                }
                                break;
                            case 1040634906:
/* 167 */                       if (str2.equals("getTotalDeviceMemoryMb")) {
                                    try {
/* 171 */                               Context context4 = this.f19802b;
/* 173 */                               if (context4 == null) {
/* 208 */                                   Intrinsics.m6220e("applicationContext");
/* 211 */                                   throw null;
                                        }
/* 177 */                               Object systemService2 = context4.getSystemService("activity");
/* 181 */                               systemService2.getClass();
/* 188 */                               ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
/* 191 */                               ((ActivityManager) systemService2).getMemoryInfo(memoryInfo);
/* 204 */                               result.success(Long.valueOf(memoryInfo.totalMem / 1048576));
/* 215 */                               return;
                                    } catch (Exception unused) {
/* 212 */                               result.success(null);
/* 215 */                               return;
                                    }
                                }
                                break;
                            case 1186364269:
/* 94 */                        if (str2.equals("getAppVersion")) {
/* 98 */                            Context context5 = this.f19802b;
/* 100 */                           if (context5 == null) {
/* 157 */                               Intrinsics.m6220e("applicationContext");
/* 160 */                               throw null;
                                    }
                                    try {
/* 110 */                               PackageInfo packageInfo = context5.getPackageManager().getPackageInfo(context5.getPackageName(), 0);
/* 127 */                               long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
/* 146 */                               str = packageInfo.versionName + "." + longVersionCode;
                                        break;
                                    } catch (Exception unused2) {
/* 151 */                               str = "?.?.?";
                                    }
/* 153 */                           result.success(str);
/* 215 */                           return;
                                }
                                break;
                            case 1355412985:
/* 72 */                        if (str2.equals("getPushNotificationsPermissionStatus")) {
/* 84 */                            result.success(Integer.valueOf(m10180a()));
/* 87 */                            return;
                                }
                                break;
                            case 1593370177:
/* 46 */                        if (str2.equals("getBundleIdentifier")) {
/* 50 */                            Context context6 = this.f19802b;
/* 52 */                            if (context6 != null) {
/* 58 */                                result.success(context6.getPackageName());
/* 61 */                                return;
                                    } else {
/* 62 */                                Intrinsics.m6220e("applicationContext");
/* 65 */                                throw null;
                                    }
                                }
                                break;
                            case 2095036733:
/* 30 */                        if (str2.equals("getDeviceModel")) {
/* 36 */                            result.success(Build.MODEL);
/* 39 */                            return;
                                }
                                break;
                        }
                    }
/* 587 */           result.notImplemented();
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 4 */             onAttachedToActivity(activityPluginBinding);
                }
            }
