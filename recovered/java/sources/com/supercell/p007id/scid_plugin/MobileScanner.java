            package com.supercell.p007id.scid_plugin;

            import android.app.Activity;
            import android.graphics.SurfaceTexture;
            import android.os.Build;
            import android.util.Size;
            import android.view.Display;
            import android.view.Surface;
            import android.view.WindowManager;
            import com.supercell.p007id.scid_plugin.mobile_scanner.objects.MobileScannerStartParameters;
            import io.flutter.view.TextureRegistry;
            import java.util.concurrent.Executor;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.C1792jg;
            import p000.C1802jq;
            import p000.C1863kr;
            import p000.C1888lf;
            import p000.C1974nr;
            import p000.C2076pn;
            import p000.C2357x6;
            import p000.InterfaceC1838ko;
            import p000.InterfaceC2469xp;
            import p000.RunnableC1901ls;
            import p000.a02;
            import p000.fs0;
            import p000.g71;
            import p000.i13;
            import p000.i71;
            import p000.j13;
            import p000.jw0;
            import p000.k50;
            import p000.lv0;
            import p000.mw0;
            import p000.nq1;
            import p000.pv0;
            import p000.qj2;
            import p000.qv0;
            import p000.rj2;
            import p000.s81;
            import p000.sx1;
            import p000.tv0;
            import p000.u61;
            import p000.uk1;
            import p000.v00;
            import p000.v61;
            import p000.vw1;
            import p000.y10;
            import p000.y61;
            import p000.z80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\u000b\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u0017J\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0017JS\u0010%\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u0006j\u0002`!2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060#j\u0002`$\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0017J\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\u0017J5\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070*2\u0006\u0010)\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010ER\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010ER\"\u0010F\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u0015\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010\u0012\"\u0004\bN\u0010OR \u0010Q\u001a\u00020P8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010\u0017\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/MobileScanner;", "Lg71;", "Landroid/app/Activity;", "activity", "Lio/flutter/view/TextureRegistry;", "textureRegistry", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "rotationStateCallback", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/supercell/id/scid_plugin/MobileScannerCallback;", "mobileScannerCallback", "Lcom/supercell/id/scid_plugin/MobileScannerErrorCallback;", "mobileScannerErrorCallback", "<init>", "(Landroid/app/Activity;Lio/flutter/view/TextureRegistry;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getRotation", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "isStopped", "()Z", "onCreate", "()V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Landroid/util/Size;", "viewFinderSize", "scanWindowSize", "Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;", "Lcom/supercell/id/scid_plugin/MobileScannerStartedCallback;", "mobileScannerStartedCallback", "Ljava/lang/Exception;", "Lkotlin/Exception;", "start", "(Landroid/util/Size;Landroid/util/Size;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "scanSingleCode", "stop", "cameraSize", "Lkotlin/Pair;", "calculateAdjustedScanSize", "(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;)Lkotlin/Pair;", "Landroid/app/Activity;", "Lio/flutter/view/TextureRegistry;", "Lkotlin/jvm/functions/Function1;", "Li71;", "lifecycleRegistry", "Li71;", "Lsx1;", "cameraProvider", "Lsx1;", "Lko;", "camera", "Lko;", "Lvw1;", "preview", "Lvw1;", "Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;", "textureEntry", "Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;", "Ly10;", "readerScope", "Ly10;", "La02;", "reader", "La02;", "Landroid/util/Size;", "scanCode", "Z", "getScanCode", "setScanCode", "(Z)V", "currentRotation", "I", "getCurrentRotation", "setCurrentRotation", "(I)V", "Llv0;", "captureOutput", "Llv0;", "getCaptureOutput", "()Llv0;", "getCaptureOutput$annotations", "Lv61;", "getLifecycle", "()Lv61;", "lifecycle", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class MobileScanner implements g71 {
                private final Activity activity;
                private InterfaceC1838ko camera;
                private sx1 cameraProvider;
                private final lv0 captureOutput;
                private int currentRotation;
                private final i71 lifecycleRegistry;
                private final Function1<String, Unit> mobileScannerCallback;
                private final Function1<String, Unit> mobileScannerErrorCallback;
                private vw1 preview;
                private final a02 reader;
                private final y10 readerScope;
                private final Function1<Integer, Unit> rotationStateCallback;
                private volatile boolean scanCode;
                private Size scanWindowSize;
                private TextureRegistry.SurfaceTextureEntry textureEntry;
                private final TextureRegistry textureRegistry;
                private Size viewFinderSize;

                /* JADX WARN: Multi-variable type inference failed */
                public MobileScanner(Activity activity, TextureRegistry textureRegistry, Function1<? super Integer, Unit> function1, Function1<? super String, Unit> function2, Function1<? super String, Unit> function3) {
/* 1 */             activity.getClass();
/* 4 */             textureRegistry.getClass();
/* 7 */             function1.getClass();
/* 10 */            function2.getClass();
/* 13 */            function3.getClass();
/* 19 */            this.activity = activity;
/* 21 */            this.textureRegistry = textureRegistry;
/* 23 */            this.rotationStateCallback = function1;
/* 25 */            this.mobileScannerCallback = function2;
/* 27 */            this.mobileScannerErrorCallback = function3;
/* 34 */            this.lifecycleRegistry = new i71(this);
/* 42 */            this.readerScope = k50.m5964a(z80.f19975a);
/* 49 */            this.reader = new a02();
/* 58 */            this.captureOutput = new C2357x6(this, 10);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void captureOutput$lambda$0(MobileScanner mobileScanner, mw0 mw0Var) throws Exception {
/* 1 */             mw0Var.getClass();
/* 8 */             if (mw0Var.mo1724P0() == null) {
/* 10 */                mw0Var.close();
/* 13 */                return;
                    }
/* 14 */            int rotation = mobileScanner.getRotation();
/* 20 */            if (mobileScanner.currentRotation != rotation) {
/* 22 */                mobileScanner.currentRotation = rotation;
/* 30 */                mobileScanner.rotationStateCallback.invoke(Integer.valueOf(rotation));
                    }
/* 35 */            if (mobileScanner.scanCode) {
/* 54 */                i13.m4443w(mobileScanner.readerScope, null, new C0782a(mobileScanner, mw0Var, null), 3).start();
                    } else {
/* 37 */                mw0Var.close();
                    }
                }

                public static /* synthetic */ void getCaptureOutput$annotations() {
                }

                private final int getRotation() {
                    Display defaultDisplay;
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 3 */             Activity activity = this.activity;
/* 7 */             if (i >= 30) {
/* 1 */                 defaultDisplay = activity.getDisplay();
/* 13 */                defaultDisplay.getClass();
                    } else {
/* 19 */                Object systemService = activity.getSystemService("window");
/* 23 */                systemService.getClass();
/* 28 */                defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    }
/* 32 */            int rotation = defaultDisplay.getRotation();
/* 36 */            if (rotation == 0) {
/* 57 */                return 0;
                    }
/* 39 */            if (rotation == 1) {
/* 54 */                return 90;
                    }
/* 42 */            if (rotation != 2) {
                        return rotation != 3 ? 0 : 270;
                    }
/* 51 */            return 180;
                }

                private final boolean isStopped() {
                    return this.camera == null && this.preview == null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void start$lambda$5(MobileScanner mobileScanner, s81 s81Var, Function1 function1, Size size, Size size2, Function1 function2, Executor executor) {
                    y61 y61VarM8653c;
                    InterfaceC2469xp interfaceC2469xpMo6170a;
                    fs0 fs0VarM9350C;
/* 11 */            sx1 sx1Var = (sx1) s81Var.get();
/* 13 */            mobileScanner.cameraProvider = sx1Var;
/* 15 */            if (sx1Var == null) {
/* 22 */                function1.invoke(new CameraError());
/* 25 */                return;
                    }
/* 26 */            sx1Var.m8656f();
/* 35 */            mobileScanner.textureEntry = mobileScanner.textureRegistry.createSurfaceTexture();
/* 40 */            C2076pn c2076pn = new C2076pn(7, mobileScanner, executor);
/* 49 */            vw1 vw1VarM7035a = new C1974nr(3).m7035a();
/* 53 */            vw1VarM7035a.m9351D(c2076pn);
/* 56 */            mobileScanner.preview = vw1VarM7035a;
/* 61 */            C1974nr c1974nr = new C1974nr(1);
/* 68 */            Size size3 = new Size(768, 768);
/* 71 */            C1888lf c1888lf = jw0.f12523u;
/* 73 */            uk1 uk1Var = c1974nr.f14413b;
/* 75 */            uk1Var.m9037p(c1888lf, size3);
/* 85 */            uk1Var.m9037p(tv0.f17281b, 0);
/* 94 */            uk1Var.m9037p(tv0.f17284e, 1);
/* 103 */           tv0 tv0Var = new tv0(nq1.m7021d(uk1Var));
/* 106 */           jw0.m5922y(tv0Var);
/* 111 */           pv0 pv0Var = new pv0(tv0Var);
/* 116 */           pv0Var.m7562D(executor, mobileScanner.captureOutput);
                    try {
/* 119 */               sx1 sx1Var2 = mobileScanner.cameraProvider;
/* 121 */               if (sx1Var2 != null) {
/* 123 */                   C1802jq c1802jq = C1802jq.f12420c;
/* 125 */                   c1802jq.getClass();
/* 137 */                   y61VarM8653c = sx1Var2.m8653c(mobileScanner, c1802jq, mobileScanner.preview, pv0Var);
                        } else {
/* 142 */                   y61VarM8653c = null;
                        }
/* 143 */               mobileScanner.camera = y61VarM8653c;
/* 145 */               vw1 vw1Var = mobileScanner.preview;
/* 164 */               Size size4 = (vw1Var == null || (fs0VarM9350C = vw1Var.m9350C()) == null) ? new Size(0, 0) : ((C1792jg) fs0VarM9350C.f8339b).f12252a;
/* 167 */               double width = size4.getWidth();
/* 172 */               double height = size4.getHeight();
/* 181 */               mobileScanner.currentRotation = mobileScanner.getRotation();
/* 183 */               InterfaceC1838ko interfaceC1838ko = mobileScanner.camera;
/* 201 */               boolean z = ((interfaceC1838ko == null || (interfaceC2469xpMo6170a = interfaceC1838ko.mo6170a()) == null) ? 0 : interfaceC2469xpMo6170a.mo309a()) % 180 == 0;
/* 208 */               mobileScanner.viewFinderSize = size;
/* 212 */               mobileScanner.scanWindowSize = size2;
/* 220 */               double d = z ? width : height;
/* 225 */               double d2 = z ? height : width;
/* 226 */               int i = mobileScanner.currentRotation;
/* 228 */               TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = mobileScanner.textureEntry;
/* 230 */               surfaceTextureEntry.getClass();
/* 242 */               function2.invoke(new MobileScannerStartParameters(d, d2, i, surfaceTextureEntry.mo4606id()));
                    } catch (Exception unused) {
/* 251 */               function1.invoke(new NoCamera());
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void start$lambda$5$lambda$2(MobileScanner mobileScanner, Executor executor, rj2 rj2Var) {
/* 1 */             rj2Var.getClass();
/* 8 */             if (mobileScanner.isStopped()) {
/* 10 */                return;
                    }
/* 11 */            TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = mobileScanner.textureEntry;
/* 13 */            surfaceTextureEntry.getClass();
/* 16 */            SurfaceTexture surfaceTexture = surfaceTextureEntry.surfaceTexture();
/* 20 */            surfaceTexture.getClass();
/* 35 */            surfaceTexture.setDefaultBufferSize(rj2Var.f16122b.getWidth(), rj2Var.f16122b.getHeight());
/* 49 */            rj2Var.m8190a(new Surface(surfaceTexture), executor, new C1863kr(6));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void start$lambda$5$lambda$2$lambda$1(qj2 qj2Var) {
                }

                public final Pair<Integer, Integer> calculateAdjustedScanSize(Size cameraSize, Size viewFinderSize, Size scanWindowSize) {
                    float height;
                    int height2;
/* 1 */             cameraSize.getClass();
/* 4 */             if (viewFinderSize == null) {
/* 16 */                viewFinderSize = new Size(cameraSize.getWidth(), cameraSize.getHeight());
                    }
/* 19 */            if (scanWindowSize == null) {
/* 21 */                scanWindowSize = viewFinderSize;
                    }
/* 46 */            if (viewFinderSize.getWidth() / viewFinderSize.getHeight() > cameraSize.getWidth() / cameraSize.getHeight()) {
/* 48 */                height = cameraSize.getWidth();
/* 53 */                height2 = viewFinderSize.getWidth();
                    } else {
/* 60 */                height = cameraSize.getHeight();
/* 65 */                height2 = viewFinderSize.getHeight();
                    }
/* 58 */            float f = height / height2;
/* 78 */            int width = (int) (scanWindowSize.getWidth() * f);
/* 79 */            int width2 = cameraSize.getWidth();
/* 83 */            if (width > width2) {
/* 85 */                width = width2;
                    }
/* 86 */            Integer numValueOf = Integer.valueOf(width);
/* 96 */            int height3 = (int) (scanWindowSize.getHeight() * f);
/* 97 */            int height4 = cameraSize.getHeight();
/* 101 */           if (height3 > height4) {
/* 103 */               height3 = height4;
                    }
/* 108 */           return new Pair<>(numValueOf, Integer.valueOf(height3));
                }

                public final lv0 getCaptureOutput() {
/* 1 */             return this.captureOutput;
                }

                public final int getCurrentRotation() {
/* 1 */             return this.currentRotation;
                }

                @Override // p000.g71
                public v61 getLifecycle() {
/* 1 */             return this.lifecycleRegistry;
                }

                public final boolean getScanCode() {
/* 1 */             return this.scanCode;
                }

                public final void onCreate() {
/* 5 */             this.lifecycleRegistry.m4489g(u61.f17376c);
                }

                public final void onDestroy() {
/* 5 */             this.lifecycleRegistry.m4489g(u61.f17374a);
                }

                public final void onPause() {
/* 5 */             this.lifecycleRegistry.m4489g(u61.f17377d);
                }

                public final void onResume() {
/* 5 */             this.lifecycleRegistry.m4489g(u61.f17378e);
                }

                public final void onStart() {
/* 5 */             this.lifecycleRegistry.m4489g(u61.f17377d);
                }

                public final void onStop() {
/* 5 */             this.lifecycleRegistry.m4489g(u61.f17376c);
                }

                public final void scanSingleCode() {
/* 2 */             this.scanCode = true;
                }

                public final void setCurrentRotation(int i) {
/* 1 */             this.currentRotation = i;
                }

                public final void setScanCode(boolean z) {
/* 1 */             this.scanCode = z;
                }

                public final void start(Size viewFinderSize, Size scanWindowSize, Function1<? super MobileScannerStartParameters, Unit> mobileScannerStartedCallback, Function1<? super Exception, Unit> mobileScannerErrorCallback) {
                    SurfaceTexture surfaceTexture;
                    TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
                    SurfaceTexture surfaceTexture2;
/* 1 */             mobileScannerStartedCallback.getClass();
/* 4 */             mobileScannerErrorCallback.getClass();
/* 15 */            if (v00.checkSelfPermission(this.activity, "android.permission.CAMERA") != 0) {
/* 24 */                mobileScannerErrorCallback.invoke(new SecurityException("Camera permission not granted"));
/* 27 */                return;
                    }
/* 28 */            InterfaceC1838ko interfaceC1838ko = this.camera;
/* 38 */            if ((interfaceC1838ko != null ? interfaceC1838ko.mo6170a() : null) != null && this.preview != null && (surfaceTextureEntry = this.textureEntry) != null && (surfaceTexture2 = surfaceTextureEntry.surfaceTexture()) != null && !surfaceTexture2.isReleased()) {
/* 65 */                mobileScannerErrorCallback.invoke(new AlreadyStarted());
/* 68 */                return;
                    }
/* 69 */            TextureRegistry.SurfaceTextureEntry surfaceTextureEntry2 = this.textureEntry;
/* 71 */            if (surfaceTextureEntry2 != null && (surfaceTexture = surfaceTextureEntry2.surfaceTexture()) != null && surfaceTexture.isReleased()) {
/* 91 */                mobileScannerErrorCallback.invoke(new CameraError());
/* 94 */                return;
                    }
/* 95 */            onResume();
/* 98 */            sx1 sx1Var = sx1.f16851g;
/* 102 */           RunnableC1901ls runnableC1901lsM5646h = j13.m5646h(this.activity);
/* 108 */           Executor mainExecutor = v00.getMainExecutor(this.activity);
/* 112 */           mainExecutor.getClass();
/* 126 */           runnableC1901lsM5646h.mo3676a(new qv0(this, runnableC1901lsM5646h, mobileScannerErrorCallback, viewFinderSize, scanWindowSize, mobileScannerStartedCallback, mainExecutor, 2), mainExecutor);
                }

                public final void stop() throws AlreadyStopped {
/* 5 */             if (isStopped()) {
/* 41 */                throw new AlreadyStopped();
                    }
/* 9 */             this.reader.getClass();
/* 12 */            sx1 sx1Var = this.cameraProvider;
/* 14 */            if (sx1Var != null) {
/* 16 */                sx1Var.m8656f();
                    }
/* 19 */            TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.textureEntry;
/* 21 */            if (surfaceTextureEntry != null) {
/* 23 */                surfaceTextureEntry.release();
                    }
/* 27 */            this.camera = null;
/* 29 */            this.preview = null;
/* 31 */            this.textureEntry = null;
/* 33 */            this.cameraProvider = null;
                }
            }
