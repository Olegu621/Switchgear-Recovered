            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.pm.PackageManager;
            import android.graphics.SurfaceTexture;
            import android.os.Bundle;
            import android.util.Size;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.view.TextureRegistry;
            import java.util.Map;
            import java.util.concurrent.Executor;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kj1 implements MethodChannel.MethodCallHandler, Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public final Activity f12820a;

                /* JADX INFO: renamed from: b */
                public final C2255uh f12821b;

                /* JADX INFO: renamed from: c */
                public MethodChannel f12822c;

                /* JADX INFO: renamed from: d */
                public fj1 f12823d;

                /* JADX INFO: renamed from: e */
                public MethodChannel.Result f12824e;

                public kj1(Activity activity, C2255uh c2255uh, BinaryMessenger binaryMessenger, TextureRegistry textureRegistry) {
/* 1 */             activity.getClass();
/* 4 */             textureRegistry.getClass();
/* 10 */            this.f12820a = activity;
/* 12 */            this.f12821b = c2255uh;
/* 17 */            gj1 gj1Var = new gj1(this, 0);
/* 23 */            gj1 gj1Var2 = new gj1(this, 1);
/* 29 */            gj1 gj1Var3 = new gj1(this, 2);
/* 36 */            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.supercell.social.SocialPlugin.mobile_scanner/method");
/* 39 */            this.f12822c = methodChannel;
/* 41 */            methodChannel.setMethodCallHandler(this);
/* 48 */            fj1 fj1Var = new fj1(activity, textureRegistry, gj1Var3, gj1Var, gj1Var2);
/* 51 */            this.f12823d = fj1Var;
/* 57 */            fj1Var.f8240f.m4489g(u61.f17376c);
/* 64 */            activity.getApplication().registerActivityLifecycleCallbacks(this);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    fj1 fj1Var;
/* 1 */             activity.getClass();
/* 10 */            if (!activity.equals(this.f12820a) || (fj1Var = this.f12823d) == null) {
/* 23 */                return;
                    }
/* 20 */            fj1Var.f8240f.m4489g(u61.f17376c);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    fj1 fj1Var;
/* 1 */             activity.getClass();
/* 10 */            if (!activity.equals(this.f12820a) || (fj1Var = this.f12823d) == null) {
/* 23 */                return;
                    }
/* 20 */            fj1Var.f8240f.m4489g(u61.f17374a);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    fj1 fj1Var;
/* 1 */             activity.getClass();
/* 10 */            if (!Intrinsics.m6216a(activity, this.f12820a) || (fj1Var = this.f12823d) == null) {
/* 23 */                return;
                    }
/* 20 */            fj1Var.f8240f.m4489g(u61.f17377d);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 1 */             activity.getClass();
/* 4 */             Activity activity2 = this.f12820a;
/* 10 */            if (activity.equals(activity2)) {
/* 12 */                MethodChannel.Result result = this.f12824e;
/* 15 */                this.f12824e = null;
/* 17 */                if (result != null) {
/* 34 */                    result.success(Boolean.valueOf(v00.checkSelfPermission(activity2, "android.permission.CAMERA") == 0));
                        }
/* 37 */                fj1 fj1Var = this.f12823d;
/* 39 */                if (fj1Var != null) {
/* 45 */                    fj1Var.f8240f.m4489g(u61.f17378e);
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
                    fj1 fj1Var;
/* 1 */             activity.getClass();
/* 10 */            if (!Intrinsics.m6216a(activity, this.f12820a) || (fj1Var = this.f12823d) == null) {
/* 23 */                return;
                    }
/* 20 */            fj1Var.f8240f.m4489g(u61.f17377d);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    fj1 fj1Var;
/* 1 */             activity.getClass();
/* 10 */            if (!Intrinsics.m6216a(activity, this.f12820a) || (fj1Var = this.f12823d) == null) {
/* 23 */                return;
                    }
/* 20 */            fj1Var.f8240f.m4489g(u61.f17376c);
                }

                /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    Size size;
                    Size size2;
                    SurfaceTexture surfaceTexture;
                    TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
                    SurfaceTexture surfaceTexture2;
/* 7 */             methodCall.getClass();
/* 10 */            result.getClass();
/* 13 */            fj1 fj1Var = this.f12823d;
/* 15 */            String str = methodCall.method;
/* 18 */            if (fj1Var == null) {
/* 30 */                result.error("MobileScanner", fm0.m3784j("Called ", str, " before initializing."), null);
/* 33 */                return;
                    }
/* 34 */            if (str != null) {
/* 40 */                int i = 3;
/* 41 */                boolean z = false;
/* 44 */                int i2 = 1;
                        switch (str.hashCode()) {
                            case 3540994:
/* 495 */                       if (str.equals("stop")) {
                                    try {
/* 498 */                               fj1 fj1Var2 = this.f12823d;
/* 500 */                               if (fj1Var2 != null) {
/* 504 */                                   if (fj1Var2.f8242v == null && fj1Var2.f8243w == null) {
/* 510 */                                       z = true;
                                            }
/* 511 */                                   if (z) {
/* 546 */                                       throw new C2245u7();
                                            }
/* 515 */                                   fj1Var2.f8229W.getClass();
/* 518 */                                   sx1 sx1Var = fj1Var2.f8241i;
/* 520 */                                   if (sx1Var != null) {
/* 522 */                                       sx1Var.m8656f();
                                            }
/* 525 */                                   TextureRegistry.SurfaceTextureEntry surfaceTextureEntry2 = fj1Var2.f8227U;
/* 527 */                                   if (surfaceTextureEntry2 != null) {
/* 529 */                                       surfaceTextureEntry2.release();
                                            }
/* 532 */                                   fj1Var2.f8242v = null;
/* 534 */                                   fj1Var2.f8243w = null;
/* 536 */                                   fj1Var2.f8227U = null;
/* 538 */                                   fj1Var2.f8241i = null;
                                        }
/* 547 */                               result.success(null);
/* 554 */                               return;
                                    } catch (C2245u7 unused) {
/* 551 */                               result.success(null);
/* 554 */                               return;
                                    }
                                }
                                break;
                            case 109757538:
/* 181 */                       if (str.equals("start")) {
/* 191 */                           Map map = (Map) methodCall.argument("viewFinderSize");
/* 197 */                           if (map != null) {
/* 199 */                               Object obj = map.get("width");
/* 210 */                               Double d = obj instanceof Double ? (Double) obj : null;
/* 223 */                               Integer numValueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
/* 224 */                               Object obj2 = map.get("height");
/* 235 */                               Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
/* 248 */                               Integer numValueOf2 = d2 != null ? Integer.valueOf((int) d2.doubleValue()) : null;
/* 267 */                               size = (numValueOf == null || numValueOf2 == null) ? null : new Size(numValueOf.intValue(), numValueOf2.intValue());
                                    } else {
/* 271 */                               size = null;
                                    }
/* 279 */                           Map map2 = (Map) methodCall.argument("scanWindowSize");
/* 281 */                           if (map2 != null) {
/* 283 */                               Object obj3 = map2.get("width");
/* 294 */                               Double d3 = obj3 instanceof Double ? (Double) obj3 : null;
/* 307 */                               Integer numValueOf3 = d3 != null ? Integer.valueOf((int) d3.doubleValue()) : null;
/* 308 */                               Object obj4 = map2.get("height");
/* 319 */                               Double d4 = obj4 instanceof Double ? (Double) obj4 : null;
/* 332 */                               Integer numValueOf4 = d4 != null ? Integer.valueOf((int) d4.doubleValue()) : null;
/* 351 */                               size2 = (numValueOf3 == null || numValueOf4 == null) ? null : new Size(numValueOf3.intValue(), numValueOf4.intValue());
                                    } else {
/* 355 */                               size2 = null;
                                    }
/* 357 */                           fj1 fj1Var3 = this.f12823d;
/* 359 */                           if (fj1Var3 != null) {
/* 363 */                               ij1 ij1Var = new ij1(i2, result);
/* 368 */                               ij1 ij1Var2 = new ij1(i, result);
/* 371 */                               Activity activity = fj1Var3.f8233a;
/* 377 */                               if (v00.checkSelfPermission(activity, "android.permission.CAMERA") != 0) {
/* 386 */                                   ij1Var2.invoke(new SecurityException("Camera permission not granted"));
/* 389 */                                   return;
                                        }
/* 390 */                               y61 y61Var = fj1Var3.f8242v;
/* 398 */                               if ((y61Var != null ? y61Var.f19506c.f15695a0 : null) != null && fj1Var3.f8243w != null && (surfaceTextureEntry = fj1Var3.f8227U) != null && (surfaceTexture2 = surfaceTextureEntry.surfaceTexture()) != null && !surfaceTexture2.isReleased()) {
/* 425 */                                   ij1Var2.invoke(new C2208t7());
/* 428 */                                   return;
                                        }
/* 429 */                               TextureRegistry.SurfaceTextureEntry surfaceTextureEntry3 = fj1Var3.f8227U;
/* 431 */                               if (surfaceTextureEntry3 != null && (surfaceTexture = surfaceTextureEntry3.surfaceTexture()) != null && surfaceTexture.isReleased()) {
/* 450 */                                   ij1Var2.invoke(new C2226tp());
/* 453 */                                   return;
                                        }
/* 458 */                               fj1Var3.f8240f.m4489g(u61.f17378e);
/* 461 */                               sx1 sx1Var2 = sx1.f16851g;
/* 463 */                               RunnableC1901ls runnableC1901lsM5646h = j13.m5646h(activity);
/* 467 */                               Executor mainExecutor = v00.getMainExecutor(activity);
/* 471 */                               mainExecutor.getClass();
/* 485 */                               runnableC1901lsM5646h.mo3676a(new qv0(fj1Var3, runnableC1901lsM5646h, ij1Var2, size, size2, ij1Var, mainExecutor, 1), mainExecutor);
/* 488 */                               return;
                                    }
/* 554 */                           return;
                                }
                                break;
                            case 109757585:
/* 110 */                       if (str.equals("state")) {
/* 112 */                           Activity activity2 = this.f12820a;
/* 114 */                           PackageManager packageManager = activity2.getPackageManager();
/* 124 */                           if (packageManager.hasSystemFeature("android.hardware.camera")) {
                                        try {
/* 137 */                                   String[] strArr = packageManager.getPackageInfo(activity2.getPackageName(), 4096).requestedPermissions;
/* 139 */                                   if (strArr != null) {
/* 143 */                                       for (String str2 : strArr) {
/* 151 */                                           if (Intrinsics.m6216a(str2, "android.permission.CAMERA")) {
/* 157 */                                               if (v00.checkSelfPermission(activity2, "android.permission.CAMERA") != 0) {
/* 160 */                                                   i = 0;
                                                        }
                                                    }
                                                }
/* 165 */                                       i = 1;
                                            } else {
/* 165 */                                       i = 1;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                        }
                                    } else {
/* 165 */                               i = 1;
                                    }
/* 170 */                           result.success(Integer.valueOf(i));
/* 554 */                           return;
                                }
                                break;
                            case 1095692943:
/* 76 */                        if (str.equals("request")) {
/* 82 */                            if (this.f12824e != null) {
/* 88 */                                result.error("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.", null);
/* 91 */                                return;
                                    } else {
/* 92 */                                this.f12824e = result;
/* 100 */                               AbstractC2353x2.m9683a(this.f12820a, new String[]{"android.permission.CAMERA"}, 0);
/* 103 */                               return;
                                    }
                                }
                                break;
                            case 1159769266:
/* 56 */                        if (str.equals("scanSingleCode")) {
/* 60 */                            fj1 fj1Var4 = this.f12823d;
/* 62 */                            if (fj1Var4 != null) {
/* 64 */                                fj1Var4.f8232Z = true;
                                    }
/* 66 */                            result.success(null);
/* 69 */                            return;
                                }
                                break;
                        }
                    }
/* 555 */           result.notImplemented();
                }
            }
