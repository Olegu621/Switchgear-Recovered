            package com.supercell.p007id.scid_plugin;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Size;
            import androidx.core.app.NotificationCompat;
            import com.supercell.p007id.scid_plugin.MobileScannerHandler;
            import com.supercell.p007id.scid_plugin.mobile_scanner.objects.MobileScannerStartParameters;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.view.TextureRegistry;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.AbstractC2353x2;
            import p000.fm0;
            import p000.hj1;
            import p000.ij1;
            import p000.ji1;
            import p000.oc1;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\r\u0010 \u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\"\u0010\u001dJ!\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010)J\u0017\u0010,\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010)J\u001f\u0010-\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010'J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R$\u00104\u001a\u0012\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001701j\u0002`38\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R$\u00107\u001a\u0012\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001701j\u0002`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00105¨\u0006B"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/MobileScannerHandler;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Lcom/supercell/id/scid_plugin/BarcodeHandler;", "barcodeHandler", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/view/TextureRegistry;", "textureRegistry", "<init>", "(Landroid/app/Activity;Lcom/supercell/id/scid_plugin/BarcodeHandler;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/view/TextureRegistry;)V", HttpUrl.FRAGMENT_ENCODE_SET, "getCameraPermissionStatus", "()I", "Landroid/content/Context;", "context", HttpUrl.FRAGMENT_ENCODE_SET, "canShowScanCode", "(Landroid/content/Context;)Z", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", HttpUrl.FRAGMENT_ENCODE_SET, "requestCameraAccess", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/plugin/common/MethodCall;", NotificationCompat.CATEGORY_CALL, "start", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "scanSingleCode", "stop", "dispose", "()V", "onMethodCall", "p0", "Landroid/os/Bundle;", "p1", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "Landroid/app/Activity;", "Lcom/supercell/id/scid_plugin/BarcodeHandler;", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/supercell/id/scid_plugin/MobileScannerCallback;", "callback", "Lkotlin/jvm/functions/Function1;", "Lcom/supercell/id/scid_plugin/MobileScannerErrorCallback;", "errorCallback", "Lio/flutter/plugin/common/MethodChannel;", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "Lcom/supercell/id/scid_plugin/MobileScanner;", "mobileScanner", "Lcom/supercell/id/scid_plugin/MobileScanner;", "requestedCameraAccess", "Lio/flutter/plugin/common/MethodChannel$Result;", "rotationStateCallback", "Companion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class MobileScannerHandler implements MethodChannel.MethodCallHandler, Application.ActivityLifecycleCallbacks {
                private static final int NO_CAMERA = 1;
                private static final int PERMISSION_GRANTED = 3;
                private static final int PERMISSION_NOT_GRANTED = 0;
                private final Activity activity;
                private final BarcodeHandler barcodeHandler;
                private final Function1<String, Unit> callback;
                private final Function1<String, Unit> errorCallback;
                private MethodChannel methodChannel;
                private MobileScanner mobileScanner;
                private MethodChannel.Result requestedCameraAccess;
                private final Function1<Integer, Unit> rotationStateCallback;

                public MobileScannerHandler(Activity activity, BarcodeHandler barcodeHandler, BinaryMessenger binaryMessenger, TextureRegistry textureRegistry) {
/* 1 */             activity.getClass();
/* 4 */             barcodeHandler.getClass();
/* 7 */             binaryMessenger.getClass();
/* 10 */            textureRegistry.getClass();
/* 16 */            this.activity = activity;
/* 18 */            this.barcodeHandler = barcodeHandler;
/* 22 */            final int i = 0;
/* 23 */            Function1<String, Unit> function1 = new Function1(this) { // from class: jj1

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ MobileScannerHandler f12327b;

                        {
/* 3 */                     this.f12327b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
/* 1 */                     int i2 = i;
/* 3 */                     MobileScannerHandler mobileScannerHandler = this.f12327b;
                            switch (i2) {
                                case 0:
/* 1 */                             return MobileScannerHandler.callback$lambda$0(mobileScannerHandler, (String) obj);
                                case 1:
/* 1 */                             return MobileScannerHandler.errorCallback$lambda$1(mobileScannerHandler, (String) obj);
                                default:
/* 1 */                             return MobileScannerHandler.rotationStateCallback$lambda$2(mobileScannerHandler, ((Integer) obj).intValue());
                            }
                        }
                    };
/* 26 */            this.callback = function1;
/* 30 */            final int i2 = 1;
/* 31 */            Function1<String, Unit> function2 = new Function1(this) { // from class: jj1

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ MobileScannerHandler f12327b;

                        {
/* 3 */                     this.f12327b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
/* 1 */                     int i3 = i2;
/* 3 */                     MobileScannerHandler mobileScannerHandler = this.f12327b;
                            switch (i3) {
                                case 0:
/* 1 */                             return MobileScannerHandler.callback$lambda$0(mobileScannerHandler, (String) obj);
                                case 1:
/* 1 */                             return MobileScannerHandler.errorCallback$lambda$1(mobileScannerHandler, (String) obj);
                                default:
/* 1 */                             return MobileScannerHandler.rotationStateCallback$lambda$2(mobileScannerHandler, ((Integer) obj).intValue());
                            }
                        }
                    };
/* 34 */            this.errorCallback = function2;
/* 38 */            final int i3 = 2;
/* 39 */            Function1<Integer, Unit> function3 = new Function1(this) { // from class: jj1

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ MobileScannerHandler f12327b;

                        {
/* 3 */                     this.f12327b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
/* 1 */                     int i4 = i3;
/* 3 */                     MobileScannerHandler mobileScannerHandler = this.f12327b;
                            switch (i4) {
                                case 0:
/* 1 */                             return MobileScannerHandler.callback$lambda$0(mobileScannerHandler, (String) obj);
                                case 1:
/* 1 */                             return MobileScannerHandler.errorCallback$lambda$1(mobileScannerHandler, (String) obj);
                                default:
/* 1 */                             return MobileScannerHandler.rotationStateCallback$lambda$2(mobileScannerHandler, ((Integer) obj).intValue());
                            }
                        }
                    };
/* 42 */            this.rotationStateCallback = function3;
/* 48 */            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.supercell.id.ScidPlugin.mobile_scanner/method");
/* 51 */            this.methodChannel = methodChannel;
/* 53 */            methodChannel.setMethodCallHandler(this);
/* 60 */            MobileScanner mobileScanner = new MobileScanner(activity, textureRegistry, function3, function1, function2);
/* 63 */            this.mobileScanner = mobileScanner;
/* 65 */            mobileScanner.onCreate();
/* 72 */            activity.getApplication().registerActivityLifecycleCallbacks(this);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit callback$lambda$0(MobileScannerHandler mobileScannerHandler, String str) {
/* 1 */             str.getClass();
/* 30 */            mobileScannerHandler.barcodeHandler.publishEvent(oc1.m7131e(new Pair("name", "barcode"), new Pair(SharedDataContentProvider.BASE_PATH, str)));
/* 33 */            return Unit.f12910a;
                }

                private final boolean canShowScanCode(Context context) {
/* 1 */             PackageManager packageManager = context.getPackageManager();
/* 12 */            if (!packageManager.hasSystemFeature("android.hardware.camera")) {
/* 11 */                return false;
                    }
                    try {
/* 25 */                String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
/* 27 */                if (strArr != null) {
/* 31 */                    for (String str : strArr) {
/* 41 */                        if (Intrinsics.m6216a(str, "android.permission.CAMERA")) {
/* 43 */                            return true;
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
/* 11 */            return false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit errorCallback$lambda$1(MobileScannerHandler mobileScannerHandler, String str) {
/* 1 */             str.getClass();
/* 30 */            mobileScannerHandler.barcodeHandler.publishEvent(oc1.m7131e(new Pair("name", "error"), new Pair(SharedDataContentProvider.BASE_PATH, str)));
/* 33 */            return Unit.f12910a;
                }

                private final int getCameraPermissionStatus() {
/* 7 */             if (canShowScanCode(this.activity)) {
                        return v00.checkSelfPermission(this.activity, "android.permission.CAMERA") == 0 ? 3 : 0;
                    }
/* 9 */             return 1;
                }

                private final void requestCameraAccess(MethodChannel.Result result) {
/* 3 */             if (this.requestedCameraAccess != null) {
/* 10 */                result.error("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.", null);
                    } else {
/* 14 */                this.requestedCameraAccess = result;
/* 25 */                AbstractC2353x2.m9683a(this.activity, new String[]{"android.permission.CAMERA"}, 0);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit rotationStateCallback$lambda$2(MobileScannerHandler mobileScannerHandler, int i) {
/* 31 */            mobileScannerHandler.barcodeHandler.publishEvent(oc1.m7131e(new Pair("name", "rotation"), new Pair(SharedDataContentProvider.BASE_PATH, Integer.valueOf(i))));
/* 34 */            return Unit.f12910a;
                }

                private final void scanSingleCode(MethodChannel.Result result) {
/* 1 */             MobileScanner mobileScanner = this.mobileScanner;
/* 3 */             if (mobileScanner != null) {
/* 5 */                 mobileScanner.scanSingleCode();
                    }
/* 9 */             result.success(null);
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0053  */
                private final void start(MethodCall call, MethodChannel.Result result) {
                    Size size;
/* 7 */             Map map = (Map) call.argument("viewFinderSize");
/* 13 */            Size size2 = null;
/* 14 */            if (map != null) {
/* 16 */                Object obj = map.get("width");
/* 27 */                Double d = obj instanceof Double ? (Double) obj : null;
/* 40 */                Integer numValueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
/* 41 */                Object obj2 = map.get("height");
/* 52 */                Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
/* 65 */                Integer numValueOf2 = d2 != null ? Integer.valueOf((int) d2.doubleValue()) : null;
/* 66 */                if (numValueOf == null || numValueOf2 == null) {
/* 84 */                    size = null;
                        } else {
/* 80 */                    size = new Size(numValueOf.intValue(), numValueOf2.intValue());
                        }
                    } else {
/* 84 */                size = null;
                    }
/* 91 */            Map map2 = (Map) call.argument("scanWindowSize");
/* 93 */            if (map2 != null) {
/* 95 */                Object obj3 = map2.get("width");
/* 106 */               Double d3 = obj3 instanceof Double ? (Double) obj3 : null;
/* 119 */               Integer numValueOf3 = d3 != null ? Integer.valueOf((int) d3.doubleValue()) : null;
/* 120 */               Object obj4 = map2.get("height");
/* 131 */               Double d4 = obj4 instanceof Double ? (Double) obj4 : null;
/* 144 */               Integer numValueOf4 = d4 != null ? Integer.valueOf((int) d4.doubleValue()) : null;
/* 145 */               if (numValueOf3 != null && numValueOf4 != null) {
/* 159 */                   size2 = new Size(numValueOf3.intValue(), numValueOf4.intValue());
                        }
                    }
/* 162 */           MobileScanner mobileScanner = this.mobileScanner;
/* 164 */           if (mobileScanner != null) {
/* 178 */               mobileScanner.start(size, size2, new ij1(0, result), new ij1(2, result));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit start$lambda$7(MethodChannel.Result result, MobileScannerStartParameters mobileScannerStartParameters) {
/* 1 */             mobileScannerStartParameters.getClass();
/* 19 */            new Handler(Looper.getMainLooper()).post(new ji1(1, result, mobileScannerStartParameters));
/* 22 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void start$lambda$7$lambda$6(MethodChannel.Result result, MobileScannerStartParameters mobileScannerStartParameters) {
/* 84 */            result.success(oc1.m7131e(new Pair("textureId", Long.valueOf(mobileScannerStartParameters.getId())), new Pair("rotation", Integer.valueOf(mobileScannerStartParameters.getRotation())), new Pair("size", oc1.m7131e(new Pair("width", Double.valueOf(mobileScannerStartParameters.getWidth())), new Pair("height", Double.valueOf(mobileScannerStartParameters.getHeight()))))));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit start$lambda$9(MethodChannel.Result result, Exception exc) {
/* 1 */             exc.getClass();
/* 19 */            new Handler(Looper.getMainLooper()).post(new hj1(exc, result, 0));
/* 22 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void start$lambda$9$lambda$8(Exception exc, MethodChannel.Result result) {
/* 6 */             if (exc instanceof AlreadyStarted) {
/* 10 */                result.error("MobileScanner", "Called start() while already started", null);
/* 13 */                return;
                    }
/* 16 */            if (exc instanceof CameraError) {
/* 20 */                result.error("MobileScanner", "Error occurred when setting up camera!", null);
                    } else if (exc instanceof NoCamera) {
/* 30 */                result.error("MobileScanner", "No camera found or failed to open camera!", null);
                    } else {
/* 36 */                result.error("MobileScanner", "Unknown error occurred.", null);
                    }
                }

                private final void stop(MethodChannel.Result result) {
                    try {
/* 2 */                 MobileScanner mobileScanner = this.mobileScanner;
/* 4 */                 if (mobileScanner != null) {
/* 6 */                     mobileScanner.stop();
                        }
/* 9 */                 result.success(null);
                    } catch (AlreadyStopped unused) {
/* 13 */                result.success(null);
                    }
                }

                public final void dispose() {
/* 7 */             this.activity.getApplication().unregisterActivityLifecycleCallbacks(this);
/* 10 */            MethodChannel methodChannel = this.methodChannel;
/* 13 */            if (methodChannel != null) {
/* 15 */                methodChannel.setMethodCallHandler(null);
                    }
/* 18 */            this.methodChannel = null;
/* 20 */            MobileScanner mobileScanner = this.mobileScanner;
/* 22 */            if (mobileScanner != null) {
/* 24 */                mobileScanner.onDestroy();
                    }
/* 27 */            this.mobileScanner = null;
/* 29 */            MethodChannel.Result result = this.requestedCameraAccess;
/* 31 */            if (result != null) {
/* 37 */                result.error("MobileScanner", "Plugin disposed before responding.", null);
                    }
/* 40 */            this.requestedCameraAccess = null;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity p0, Bundle p1) {
                    MobileScanner mobileScanner;
/* 1 */             p0.getClass();
/* 10 */            if (!Intrinsics.m6216a(p0, this.activity) || (mobileScanner = this.mobileScanner) == null) {
/* 19 */                return;
                    }
/* 16 */            mobileScanner.onCreate();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity p0) {
                    MobileScanner mobileScanner;
/* 1 */             p0.getClass();
/* 10 */            if (!Intrinsics.m6216a(p0, this.activity) || (mobileScanner = this.mobileScanner) == null) {
/* 19 */                return;
                    }
/* 16 */            mobileScanner.onDestroy();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity p0) {
                    MobileScanner mobileScanner;
/* 1 */             p0.getClass();
/* 10 */            if (!Intrinsics.m6216a(p0, this.activity) || (mobileScanner = this.mobileScanner) == null) {
/* 19 */                return;
                    }
/* 16 */            mobileScanner.onPause();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity p0) {
/* 1 */             p0.getClass();
/* 10 */            if (Intrinsics.m6216a(p0, this.activity)) {
/* 12 */                MethodChannel.Result result = this.requestedCameraAccess;
/* 15 */                this.requestedCameraAccess = null;
/* 17 */                if (result != null) {
/* 36 */                    result.success(Boolean.valueOf(v00.checkSelfPermission(this.activity, "android.permission.CAMERA") == 0));
                        }
/* 39 */                MobileScanner mobileScanner = this.mobileScanner;
/* 41 */                if (mobileScanner != null) {
/* 43 */                    mobileScanner.onResume();
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity p0, Bundle p1) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity p0) {
                    MobileScanner mobileScanner;
/* 1 */             p0.getClass();
/* 10 */            if (!Intrinsics.m6216a(p0, this.activity) || (mobileScanner = this.mobileScanner) == null) {
/* 19 */                return;
                    }
/* 16 */            mobileScanner.onStart();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity p0) {
                    MobileScanner mobileScanner;
/* 1 */             p0.getClass();
/* 10 */            if (!Intrinsics.m6216a(p0, this.activity) || (mobileScanner = this.mobileScanner) == null) {
/* 19 */                return;
                    }
/* 16 */            mobileScanner.onStop();
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall call, MethodChannel.Result result) {
/* 1 */             call.getClass();
/* 4 */             result.getClass();
/* 9 */             if (this.mobileScanner == null) {
/* 24 */                result.error("MobileScanner", fm0.m3784j("Called ", call.method, " before initializing."), null);
/* 27 */                return;
                    }
/* 28 */            String str = call.method;
/* 30 */            if (str != null) {
                        switch (str.hashCode()) {
                            case 3540994:
/* 105 */                       if (str.equals("stop")) {
/* 108 */                           stop(result);
/* 111 */                           return;
                                }
                                break;
                            case 109757538:
/* 92 */                        if (str.equals("start")) {
/* 95 */                            start(call, result);
/* 98 */                            return;
                                }
                                break;
                            case 109757585:
/* 72 */                        if (str.equals("state")) {
/* 82 */                            result.success(Integer.valueOf(getCameraPermissionStatus()));
/* 85 */                            return;
                                }
                                break;
                            case 1095692943:
/* 59 */                        if (str.equals("request")) {
/* 62 */                            requestCameraAccess(result);
/* 65 */                            return;
                                }
                                break;
                            case 1159769266:
/* 46 */                        if (str.equals("scanSingleCode")) {
/* 49 */                            scanSingleCode(result);
/* 52 */                            return;
                                }
                                break;
                        }
                    }
/* 112 */           result.notImplemented();
                }
            }
