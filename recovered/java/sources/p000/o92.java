            package p000;

            import android.content.Context;
            import android.hardware.SensorManager;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.EventChannel;
            import io.flutter.plugin.common.MethodChannel;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o92 implements FlutterPlugin {

                /* JADX INFO: renamed from: a */
                public MethodChannel f14679a;

                /* JADX INFO: renamed from: b */
                public EventChannel f14680b;

                /* JADX INFO: renamed from: c */
                public EventChannel f14681c;

                /* JADX INFO: renamed from: d */
                public EventChannel f14682d;

                /* JADX INFO: renamed from: e */
                public EventChannel f14683e;

                /* JADX INFO: renamed from: f */
                public jh2 f14684f;

                /* JADX INFO: renamed from: i */
                public jh2 f14685i;

                /* JADX INFO: renamed from: v */
                public jh2 f14686v;

                /* JADX INFO: renamed from: w */
                public jh2 f14687w;

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
/* 8 */             binaryMessenger.getClass();
/* 15 */            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/sensors/method");
/* 18 */            this.f14679a = methodChannel;
/* 27 */            methodChannel.setMethodCallHandler(new C2357x6(this, 14));
/* 30 */            Context applicationContext = flutterPluginBinding.getApplicationContext();
/* 34 */            applicationContext.getClass();
/* 37 */            BinaryMessenger binaryMessenger2 = flutterPluginBinding.getBinaryMessenger();
/* 41 */            binaryMessenger2.getClass();
/* 46 */            Object systemService = applicationContext.getSystemService("sensor");
/* 50 */            systemService.getClass();
/* 53 */            SensorManager sensorManager = (SensorManager) systemService;
/* 59 */            EventChannel eventChannel = new EventChannel(binaryMessenger2, "dev.fluttercommunity.plus/sensors/accelerometer");
/* 62 */            this.f14680b = eventChannel;
/* 67 */            jh2 jh2Var = new jh2(sensorManager, 1);
/* 70 */            this.f14684f = jh2Var;
/* 72 */            eventChannel.setStreamHandler(jh2Var);
/* 79 */            EventChannel eventChannel2 = new EventChannel(binaryMessenger2, "dev.fluttercommunity.plus/sensors/user_accel");
/* 82 */            this.f14681c = eventChannel2;
/* 88 */            jh2 jh2Var2 = new jh2(sensorManager, 10);
/* 91 */            this.f14685i = jh2Var2;
/* 93 */            eventChannel2.setStreamHandler(jh2Var2);
/* 100 */           EventChannel eventChannel3 = new EventChannel(binaryMessenger2, "dev.fluttercommunity.plus/sensors/gyroscope");
/* 103 */           this.f14682d = eventChannel3;
/* 108 */           jh2 jh2Var3 = new jh2(sensorManager, 4);
/* 111 */           this.f14686v = jh2Var3;
/* 113 */           eventChannel3.setStreamHandler(jh2Var3);
/* 120 */           EventChannel eventChannel4 = new EventChannel(binaryMessenger2, "dev.fluttercommunity.plus/sensors/magnetometer");
/* 123 */           this.f14683e = eventChannel4;
/* 128 */           jh2 jh2Var4 = new jh2(sensorManager, 2);
/* 131 */           this.f14687w = jh2Var4;
/* 133 */           eventChannel4.setStreamHandler(jh2Var4);
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             MethodChannel methodChannel = this.f14679a;
/* 7 */             if (methodChannel == null) {
/* 119 */               Intrinsics.m6220e("methodChannel");
/* 122 */               throw null;
                    }
/* 9 */             methodChannel.setMethodCallHandler(null);
/* 12 */            EventChannel eventChannel = this.f14680b;
/* 14 */            if (eventChannel == null) {
/* 113 */               Intrinsics.m6220e("accelerometerChannel");
/* 116 */               throw null;
                    }
/* 16 */            eventChannel.setStreamHandler(null);
/* 19 */            EventChannel eventChannel2 = this.f14681c;
/* 21 */            if (eventChannel2 == null) {
/* 107 */               Intrinsics.m6220e("userAccelChannel");
/* 110 */               throw null;
                    }
/* 23 */            eventChannel2.setStreamHandler(null);
/* 26 */            EventChannel eventChannel3 = this.f14682d;
/* 28 */            if (eventChannel3 == null) {
/* 101 */               Intrinsics.m6220e("gyroscopeChannel");
/* 104 */               throw null;
                    }
/* 30 */            eventChannel3.setStreamHandler(null);
/* 33 */            EventChannel eventChannel4 = this.f14683e;
/* 35 */            if (eventChannel4 == null) {
/* 95 */                Intrinsics.m6220e("magnetometerChannel");
/* 98 */                throw null;
                    }
/* 37 */            eventChannel4.setStreamHandler(null);
/* 40 */            jh2 jh2Var = this.f14684f;
/* 42 */            if (jh2Var == null) {
/* 89 */                Intrinsics.m6220e("accelerometerStreamHandler");
/* 92 */                throw null;
                    }
/* 44 */            jh2Var.onCancel(null);
/* 47 */            jh2 jh2Var2 = this.f14685i;
/* 49 */            if (jh2Var2 == null) {
/* 83 */                Intrinsics.m6220e("userAccelStreamHandler");
/* 86 */                throw null;
                    }
/* 51 */            jh2Var2.onCancel(null);
/* 54 */            jh2 jh2Var3 = this.f14686v;
/* 56 */            if (jh2Var3 == null) {
/* 77 */                Intrinsics.m6220e("gyroscopeStreamHandler");
/* 80 */                throw null;
                    }
/* 58 */            jh2Var3.onCancel(null);
/* 61 */            jh2 jh2Var4 = this.f14687w;
/* 63 */            if (jh2Var4 != null) {
/* 65 */                jh2Var4.onCancel(null);
                    } else {
/* 71 */                Intrinsics.m6220e("magnetometerStreamHandler");
/* 74 */                throw null;
                    }
                }
            }
