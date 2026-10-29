            package com.supercell.p007id.scid_plugin;

            import android.app.Activity;
            import android.app.ActivityManager;
            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.net.Uri;
            import android.os.Build;
            import android.provider.Settings;
            import android.telephony.TelephonyManager;
            import android.view.Display;
            import android.view.WindowManager;
            import androidx.core.app.NotificationCompat;
            import com.appsflyer.AppsFlyerProperties;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.PlatformInterfacePlugin;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataWhitelist;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.TimeZone;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.e70;
            import p000.i13;
            import p000.k50;
            import p000.m42;
            import p000.n42;
            import p000.nd0;
            import p000.o42;
            import p000.qs1;
            import p000.rs1;
            import p000.vs1;
            import p000.z80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0010J\u001f\u0010!\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0010J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u001aJ\u001f\u0010$\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0010J\u001f\u0010%\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0010J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u001aJ\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u001aJ\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010\u001aJ\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010\u001aJ\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010\u001aJ\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR \u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u00020<*\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", HttpUrl.FRAGMENT_ENCODE_SET, "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lio/flutter/plugin/common/MethodCall;", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivity", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "handleGetSystemNameAndVersion", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", "handleGetBundleIdentifier", "handleGetAppVersion", "handleGetDeviceModel", "handleGetDeviceId", "handleGetSharedAccountKeys", "handleGetSharedAccounts", "handleSetSharedAccounts", "handleUpdateAndroidWhitelist", "handleGetAppName", "handlePutString", "handleGetString", "handleGetUiOrientation", "handleOpenAppSettings", "handleGetOSCountry", "handleGetSimCountry", "handleGetAppStoreCountry", "handleGetTimeZone", "handleGetTotalDeviceMemoryMb", HttpUrl.FRAGMENT_ENCODE_SET, "getRotation", "()I", "Lio/flutter/plugin/common/MethodChannel;", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", HttpUrl.FRAGMENT_ENCODE_SET, "androidId", "Ljava/lang/String;", "Lcom/supercell/id/scid_plugin/EncryptedStorage;", "encryptedStorage", "Lcom/supercell/id/scid_plugin/EncryptedStorage;", "Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;", "playStoreCountryObserver", "Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;", "Lo42;", "playStoreCountry", "Lo42;", "getAppVersion", "(Landroid/content/Context;)Ljava/lang/String;", "appVersion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class PlatformInterfacePlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {
                private Activity activity;
                private String androidId;
                private Context applicationContext;
                private MethodChannel channel;
                private ContentResolver contentResolver;
                private EncryptedStorage encryptedStorage;
                private o42 playStoreCountry;
                private PlayStoreCountryObserver playStoreCountryObserver;

                private final String getAppVersion(Context context) {
                    try {
/* 10 */                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
/* 27 */                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
/* 46 */                return packageInfo.versionName + "." + longVersionCode;
                    } catch (Exception unused) {
/* 51 */                return "?.?.?";
                    }
                }

                private final int getRotation() {
                    Display defaultDisplay;
/* 1 */             Activity activity = this.activity;
/* 3 */             if (activity == null) {
/* 50 */                return 0;
                    }
/* 10 */            if (Build.VERSION.SDK_INT >= 30) {
/* 1 */                 defaultDisplay = activity.getDisplay();
/* 16 */                defaultDisplay.getClass();
                    } else {
/* 22 */                Object systemService = activity.getSystemService("window");
/* 26 */                systemService.getClass();
/* 31 */                defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    }
/* 35 */            int rotation = defaultDisplay.getRotation();
/* 40 */            if (rotation == 0) {
/* 39 */                return 1;
                    }
/* 42 */            if (rotation == 1) {
/* 53 */                return 4;
                    }
/* 44 */            int i = 2;
/* 45 */            if (rotation != 2) {
/* 47 */                i = 3;
/* 48 */                if (rotation != 3) {
/* 50 */                    return 0;
                        }
                    }
/* 52 */            return i;
                }

                private final void handleGetAppName(MethodChannel.Result result) {
/* 1 */             Context context = this.applicationContext;
/* 6 */             if (context == null) {
/* 36 */                Intrinsics.m6220e("applicationContext");
/* 39 */                throw null;
                    }
/* 8 */             ApplicationInfo applicationInfo = context.getApplicationInfo();
/* 12 */            Context context2 = this.applicationContext;
/* 14 */            if (context2 != null) {
/* 28 */                result.success(applicationInfo.loadLabel(context2.getPackageManager()).toString());
                    } else {
/* 32 */                Intrinsics.m6220e("applicationContext");
/* 35 */                throw null;
                    }
                }

                private final void handleGetAppStoreCountry(MethodChannel.Result result) {
/* 3 */             Object obj = null;
/* 4 */             if (this.applicationContext == null) {
/* 26 */                Intrinsics.m6220e("applicationContext");
/* 29 */                throw null;
                    }
/* 6 */             o42 o42Var = this.playStoreCountry;
/* 8 */             if (o42Var != null) {
/* 10 */                Object obj2 = o42Var.f14613a;
/* 18 */                obj = (String) (obj2 instanceof n42 ? null : obj2);
                    }
/* 20 */            result.success(obj);
                }

                private final void handleGetAppVersion(MethodChannel.Result result) {
/* 1 */             Context context = this.applicationContext;
/* 3 */             if (context != null) {
/* 9 */                 result.success(getAppVersion(context));
                    } else {
/* 15 */                Intrinsics.m6220e("applicationContext");
/* 19 */                throw null;
                    }
                }

                private final void handleGetBundleIdentifier(MethodChannel.Result result) {
/* 3 */             if (this.applicationContext != null) {
/* 9 */                 result.success("com.supercell.brawlstars");
                    } else {
/* 15 */                Intrinsics.m6220e("applicationContext");
/* 19 */                throw null;
                    }
                }

                private final void handleGetDeviceId(MethodChannel.Result result) {
/* 3 */             if (this.androidId == null) {
/* 5 */                 ContentResolver contentResolver = this.contentResolver;
/* 7 */                 if (contentResolver == null) {
/* 20 */                    Intrinsics.m6220e("contentResolver");
/* 24 */                    throw null;
                        }
/* 15 */                this.androidId = Settings.Secure.getString(contentResolver, "android_id");
                    }
/* 27 */            result.success(this.androidId);
                }

                private final void handleGetDeviceModel(MethodChannel.Result result) {
/* 3 */             result.success(Build.MODEL);
                }

                private final void handleGetOSCountry(MethodChannel.Result result) {
/* 1 */             Context context = this.applicationContext;
/* 3 */             if (context == null) {
/* 39 */                Intrinsics.m6220e("applicationContext");
/* 43 */                throw null;
                    }
/* 18 */            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
/* 22 */            locale.getClass();
/* 33 */            result.success(String.valueOf(locale.getCountry()));
                }

                private final void handleGetSharedAccountKeys(MethodChannel.Result result) {
/* 1 */             SharedDataWhitelist.Companion companion = SharedDataWhitelist.INSTANCE;
/* 3 */             Context context = this.applicationContext;
/* 8 */             if (context == null) {
/* 54 */                Intrinsics.m6220e("applicationContext");
/* 57 */                throw null;
                    }
/* 22 */            e70 e70VarNullAfter = PromiseUtilKt.nullAfter(companion.getInstance(context).getWhitelistPackages(), 5000L);
/* 26 */            Context context2 = this.applicationContext;
/* 28 */            if (context2 != null) {
/* 46 */                PromiseUtilKt.subscribeUiWith$default(e70VarNullAfter, context2, new rs1(result, 2), new rs1(result, 3), null, 8, null);
                    } else {
/* 50 */                Intrinsics.m6220e("applicationContext");
/* 53 */                throw null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit handleGetSharedAccountKeys$lambda$1(MethodChannel.Result result, Context context, List list) {
                    List arrayList;
/* 1 */             context.getClass();
/* 4 */             if (list != null) {
/* 8 */                 arrayList = new ArrayList();
/* 19 */                for (Object obj : list) {
/* 40 */                    if (!Intrinsics.m6216a((String) obj, context.getApplicationContext().getPackageName())) {
/* 42 */                        arrayList.add(obj);
                            }
                        }
                    } else {
/* 46 */                arrayList = nd0.f14189a;
                    }
/* 48 */            result.success(arrayList);
/* 51 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit handleGetSharedAccountKeys$lambda$2(MethodChannel.Result result, Context context, Exception exc) {
/* 1 */             context.getClass();
/* 4 */             exc.getClass();
/* 23 */            AbstractC1245n0.m4877e("ScidPlugin", "Failed to load shared account keys " + exc, exc);
/* 28 */            result.success(nd0.f14189a);
/* 31 */            return Unit.f12910a;
                }

                private final void handleGetSharedAccounts(MethodCall call, MethodChannel.Result result) {
/* 3 */             Object objArgument = call.argument("environment");
/* 7 */             objArgument.getClass();
/* 11 */            String str = (String) objArgument;
/* 15 */            Object objArgument2 = call.argument("scidEnvironment");
/* 19 */            objArgument2.getClass();
/* 27 */            Object objArgument3 = call.argument("key");
/* 31 */            objArgument3.getClass();
/* 53 */            i13.m4443w(k50.m5964a(z80.f19977c), null, new vs1(this, str, (String) objArgument2, (String) objArgument3, result, null), 3);
                }

                private final void handleGetSimCountry(MethodChannel.Result result) {
/* 1 */             Context context = this.applicationContext;
/* 4 */             if (context == null) {
/* 36 */                Intrinsics.m6220e("applicationContext");
/* 39 */                throw null;
                    }
/* 8 */             Object systemService = context.getSystemService("phone");
/* 19 */            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
/* 20 */            if (telephonyManager != null) {
/* 26 */                result.success(telephonyManager.getSimCountryIso());
                    } else {
/* 30 */                result.success(null);
                    }
                }

                private final void handleGetString(MethodCall call, MethodChannel.Result result) {
/* 1 */             Object obj = call.arguments;
/* 3 */             obj.getClass();
/* 6 */             final String str = (String) obj;
/* 13 */            e70 e70VarTask = PromiseUtilKt.task(new Function0() { // from class: ss1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
/* 1 */                     return PlatformInterfacePlugin.handleGetString$lambda$6(str, this);
                        }
                    });
/* 17 */            Context context = this.applicationContext;
/* 19 */            if (context != null) {
/* 37 */                PromiseUtilKt.subscribeUiWith$default(e70VarTask, context, new rs1(result, 4), new rs1(result, 5), null, 8, null);
                    } else {
/* 43 */                Intrinsics.m6220e("applicationContext");
/* 47 */                throw null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String handleGetString$lambda$6(String str, PlatformInterfacePlugin platformInterfacePlugin) {
/* 1 */             EncryptedStorage encryptedStorage = platformInterfacePlugin.encryptedStorage;
/* 3 */             if (encryptedStorage != null) {
/* 5 */                 return encryptedStorage.get(str);
                    }
/* 10 */            return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit handleGetString$lambda$7(MethodChannel.Result result, Context context, String str) {
/* 1 */             context.getClass();
/* 4 */             result.success(str);
/* 7 */             return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit handleGetString$lambda$8(MethodChannel.Result result, Context context, Exception exc) {
/* 1 */             context.getClass();
/* 4 */             exc.getClass();
/* 23 */            AbstractC1245n0.m4877e("ScidPlugin", "Failed to get string " + exc, exc);
/* 33 */            result.error("Failed to get string", exc.getMessage(), null);
/* 36 */            return Unit.f12910a;
                }

                private final void handleGetSystemNameAndVersion(MethodChannel.Result result) {
/* 17 */            result.success("Android " + Build.VERSION.RELEASE);
                }

                private final void handleGetTimeZone(MethodChannel.Result result) {
/* 9 */             result.success(TimeZone.getDefault().getID());
                }

                private final void handleGetTotalDeviceMemoryMb(MethodChannel.Result result) {
                    try {
/* 2 */                 Context context = this.applicationContext;
/* 4 */                 if (context == null) {
/* 41 */                    Intrinsics.m6220e("applicationContext");
/* 44 */                    throw null;
                        }
/* 8 */                 Object systemService = context.getSystemService("activity");
/* 12 */                systemService.getClass();
/* 19 */                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
/* 22 */                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
/* 35 */                result.success(Long.valueOf(memoryInfo.totalMem / 1048576));
                    } catch (Exception unused) {
/* 45 */                result.success(null);
                    }
                }

                private final void handleGetUiOrientation(MethodChannel.Result result) {
/* 9 */             result.success(Integer.valueOf(getRotation()));
                }

                private final void handleOpenAppSettings(MethodChannel.Result result) {
/* 1 */             Activity activity = this.activity;
/* 4 */             if (activity != null) {
/* 23 */                activity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", activity.getPackageName(), null)));
                    }
/* 26 */            result.success(null);
                }

                private final void handlePutString(MethodCall call, MethodChannel.Result result) {
/* 3 */             Object objArgument = call.argument("key");
/* 7 */             objArgument.getClass();
/* 25 */            e70 e70VarTask = PromiseUtilKt.task(new qs1((String) objArgument, (String) call.argument(FirebaseAnalytics.Param.VALUE), this));
/* 29 */            Context context = this.applicationContext;
/* 31 */            if (context != null) {
/* 49 */                PromiseUtilKt.subscribeUiWith$default(e70VarTask, context, new rs1(result, 0), new rs1(result, 1), null, 8, null);
                    } else {
/* 55 */                Intrinsics.m6220e("applicationContext");
/* 59 */                throw null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit handlePutString$lambda$3(String str, String str2, PlatformInterfacePlugin platformInterfacePlugin) {
/* 1 */             EncryptedStorage encryptedStorage = platformInterfacePlugin.encryptedStorage;
/* 3 */             if (encryptedStorage == null) {
/* 11 */                return null;
                    }
/* 5 */             encryptedStorage.put(str, str2);
/* 8 */             return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit handlePutString$lambda$4(MethodChannel.Result result, Context context, Unit unit) {
/* 1 */             context.getClass();
/* 5 */             result.success(null);
/* 8 */             return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit handlePutString$lambda$5(MethodChannel.Result result, Context context, Exception exc) {
/* 1 */             context.getClass();
/* 4 */             exc.getClass();
/* 23 */            AbstractC1245n0.m4877e("ScidPlugin", "Failed to put string " + exc, exc);
/* 33 */            result.error("Failed to put string", exc.getMessage(), null);
/* 36 */            return Unit.f12910a;
                }

                private final void handleSetSharedAccounts(MethodCall call, MethodChannel.Result result) {
/* 3 */             Object objArgument = call.argument("environment");
/* 7 */             objArgument.getClass();
/* 11 */            String str = (String) objArgument;
/* 15 */            Object objArgument2 = call.argument("scidEnvironment");
/* 19 */            objArgument2.getClass();
/* 50 */            i13.m4443w(k50.m5964a(z80.f19977c), null, new C0783b(this, str, (String) objArgument2, (List) call.argument("accounts"), result, null), 3);
                }

                private final void handleUpdateAndroidWhitelist(MethodCall call, MethodChannel.Result result) {
/* 1 */             SharedDataWhitelist.Companion companion = SharedDataWhitelist.INSTANCE;
/* 3 */             Context context = this.applicationContext;
/* 6 */             if (context == null) {
/* 30 */                Intrinsics.m6220e("applicationContext");
/* 33 */                throw null;
                    }
/* 8 */             SharedDataWhitelist singletonHolder = companion.getInstance(context);
/* 14 */            Object obj = call.arguments;
/* 16 */            obj.getClass();
/* 21 */            singletonHolder.update((Map) obj);
/* 24 */            result.success(null);
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onAttachedToActivity(ActivityPluginBinding binding) {
/* 1 */             binding.getClass();
/* 8 */             this.activity = binding.getActivity();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
                    EncryptedStorage encryptedStorage;
/* 3 */             flutterPluginBinding.getClass();
/* 10 */            this.applicationContext = flutterPluginBinding.getApplicationContext();
/* 20 */            this.contentResolver = flutterPluginBinding.getApplicationContext().getContentResolver();
                    try {
/* 25 */                Context context = this.applicationContext;
/* 27 */                if (context == null) {
/* 37 */                    Intrinsics.m6220e("applicationContext");
/* 40 */                    throw null;
                        }
/* 31 */                encryptedStorage = new EncryptedStorage(context, "com.supercell.id.scid_plugin.ScidPlugin");
/* 61 */                this.encryptedStorage = encryptedStorage;
/* 71 */                MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.supercell.id.ScidPlugin.platform_interface");
/* 74 */                this.channel = methodChannel;
/* 76 */                methodChannel.setMethodCallHandler(this);
/* 81 */                Context context2 = this.applicationContext;
/* 83 */                if (context2 != null) {
/* 93 */                    this.playStoreCountryObserver = new PlayStoreCountryObserver(context2, new PlayStoreCountryCallback() { // from class: com.supercell.id.scid_plugin.PlatformInterfacePlugin.onAttachedToEngine.1
                                @Override // com.supercell.p007id.scid_plugin.PlayStoreCountryCallback
                                public void onCountryRetrieved(String country) {
/* 1 */                             PlatformInterfacePlugin.this.playStoreCountry = new o42(country);
                                }

                                @Override // com.supercell.p007id.scid_plugin.PlayStoreCountryCallback
                                public void onError(String errorMessage) {
/* 1 */                             errorMessage.getClass();
/* 4 */                             PlatformInterfacePlugin platformInterfacePlugin = PlatformInterfacePlugin.this;
/* 6 */                             m42 m42Var = o42.f14612b;
/* 1 */                             platformInterfacePlugin.playStoreCountry = new o42(new n42(new Exception("Failed to get appstore country")));
                                }
                            });
                        } else {
/* 96 */                    Intrinsics.m6220e("applicationContext");
/* 99 */                    throw null;
                        }
                    } catch (Exception e) {
/* 57 */                AbstractC1245n0.m4877e("ScidPlugin", "Failed to create encrypted storage " + e, e);
/* 60 */                encryptedStorage = null;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivity() {
/* 2 */             this.activity = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivityForConfigChanges() {
/* 1 */             onDetachedFromActivity();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
/* 1 */             binding.getClass();
/* 4 */             PlayStoreCountryObserver playStoreCountryObserver = this.playStoreCountryObserver;
/* 6 */             if (playStoreCountryObserver != null) {
/* 8 */                 playStoreCountryObserver.disconnect();
                    }
/* 12 */            this.playStoreCountryObserver = null;
/* 14 */            MethodChannel methodChannel = this.channel;
/* 16 */            if (methodChannel != null) {
/* 18 */                methodChannel.setMethodCallHandler(null);
                    } else {
/* 24 */                Intrinsics.m6220e(AppsFlyerProperties.CHANNEL);
/* 27 */                throw null;
                    }
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall call, MethodChannel.Result result) {
/* 1 */             call.getClass();
/* 4 */             result.getClass();
/* 7 */             String str = call.method;
/* 9 */             if (str != null) {
                        switch (str.hashCode()) {
                            case -2050453658:
/* 271 */                       if (str.equals("getSharedAccountKeys")) {
/* 274 */                           handleGetSharedAccountKeys(result);
/* 277 */                           return;
                                }
                                break;
                            case -2002861695:
/* 258 */                       if (str.equals("updateAndroidWhitelist")) {
/* 261 */                           handleUpdateAndroidWhitelist(call, result);
/* 264 */                           return;
                                }
                                break;
                            case -1821700484:
/* 245 */                       if (str.equals("getOSCountry")) {
/* 248 */                           handleGetOSCountry(result);
/* 251 */                           return;
                                }
                                break;
                            case -1684939264:
/* 232 */                       if (str.equals("getAppStoreCountry")) {
/* 235 */                           handleGetAppStoreCountry(result);
/* 238 */                           return;
                                }
                                break;
                            case -1107875961:
/* 219 */                       if (str.equals("getDeviceId")) {
/* 222 */                           handleGetDeviceId(result);
/* 225 */                           return;
                                }
                                break;
                            case -462997504:
/* 206 */                       if (str.equals("putString")) {
/* 209 */                           handlePutString(call, result);
/* 212 */                           return;
                                }
                                break;
                            case -189061402:
/* 193 */                       if (str.equals("getUiOrientation")) {
/* 196 */                           handleGetUiOrientation(result);
/* 199 */                           return;
                                }
                                break;
                            case 719247:
/* 180 */                       if (str.equals("getTimeZone")) {
/* 183 */                           handleGetTimeZone(result);
/* 186 */                           return;
                                }
                                break;
                            case 180923505:
/* 166 */                       if (str.equals("getSystemNameAndVersion")) {
/* 170 */                           handleGetSystemNameAndVersion(result);
/* 173 */                           return;
                                }
                                break;
                            case 242723862:
/* 152 */                       if (str.equals("getAppName")) {
/* 156 */                           handleGetAppName(result);
/* 159 */                           return;
                                }
                                break;
                            case 347240634:
/* 138 */                       if (str.equals("openAppSettings")) {
/* 142 */                           handleOpenAppSettings(result);
/* 145 */                           return;
                                }
                                break;
                            case 448711789:
/* 124 */                       if (str.equals("setSharedAccounts")) {
/* 128 */                           handleSetSharedAccounts(call, result);
/* 131 */                           return;
                                }
                                break;
                            case 804029191:
/* 110 */                       if (str.equals("getString")) {
/* 114 */                           handleGetString(call, result);
/* 117 */                           return;
                                }
                                break;
                            case 1040634906:
/* 96 */                        if (str.equals("getTotalDeviceMemoryMb")) {
/* 100 */                           handleGetTotalDeviceMemoryMb(result);
/* 103 */                           return;
                                }
                                break;
                            case 1186364269:
/* 82 */                        if (str.equals("getAppVersion")) {
/* 86 */                            handleGetAppVersion(result);
/* 89 */                            return;
                                }
                                break;
                            case 1384127157:
/* 68 */                        if (str.equals("getSimCountry")) {
/* 72 */                            handleGetSimCountry(result);
/* 75 */                            return;
                                }
                                break;
                            case 1388864609:
/* 54 */                        if (str.equals("getSharedAccounts")) {
/* 58 */                            handleGetSharedAccounts(call, result);
/* 61 */                            return;
                                }
                                break;
                            case 1593370177:
/* 40 */                        if (str.equals("getBundleIdentifier")) {
/* 44 */                            handleGetBundleIdentifier(result);
/* 47 */                            return;
                                }
                                break;
                            case 2095036733:
/* 26 */                        if (str.equals("getDeviceModel")) {
/* 30 */                            handleGetDeviceModel(result);
/* 33 */                            return;
                                }
                                break;
                        }
                    }
/* 278 */           result.notImplemented();
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
/* 1 */             binding.getClass();
/* 4 */             onAttachedToActivity(binding);
                }
            }
