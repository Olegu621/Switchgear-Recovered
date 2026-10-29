            package p000;

            import android.hardware.Sensor;
            import android.hardware.SensorManager;
            import io.flutter.plugin.common.EventChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jh2 implements EventChannel.StreamHandler {

                /* JADX INFO: renamed from: a */
                public final SensorManager f12307a;

                /* JADX INFO: renamed from: b */
                public final int f12308b;

                /* JADX INFO: renamed from: c */
                public ih2 f12309c;

                /* JADX INFO: renamed from: d */
                public Sensor f12310d;

                /* JADX INFO: renamed from: e */
                public int f12311e = 200000;

                public jh2(SensorManager sensorManager, int i) {
/* 4 */             this.f12307a = sensorManager;
/* 6 */             this.f12308b = i;
                }

                @Override // io.flutter.plugin.common.EventChannel.StreamHandler
                public final void onCancel(Object obj) {
/* 3 */             if (this.f12310d != null) {
/* 9 */                 this.f12307a.unregisterListener(this.f12309c);
/* 13 */                this.f12309c = null;
                    }
                }

                @Override // io.flutter.plugin.common.EventChannel.StreamHandler
                public final void onListen(Object obj, EventChannel.EventSink eventSink) {
                    String str;
/* 1 */             eventSink.getClass();
/* 4 */             SensorManager sensorManager = this.f12307a;
/* 6 */             int i = this.f12308b;
/* 8 */             Sensor defaultSensor = sensorManager.getDefaultSensor(i);
/* 12 */            this.f12310d = defaultSensor;
/* 14 */            if (defaultSensor != null) {
/* 18 */                ih2 ih2Var = new ih2(eventSink);
/* 21 */                this.f12309c = ih2Var;
/* 25 */                sensorManager.registerListener(ih2Var, defaultSensor, this.f12311e);
/* 28 */                return;
                    }
/* 33 */            StringBuilder sb = new StringBuilder("It seems that your device has no ");
/* 37 */            if (i == 1) {
/* 61 */                str = "Accelerometer";
                    } else if (i == 2) {
/* 58 */                str = "Magnetometer";
                    } else if (i != 4) {
/* 52 */                str = i != 10 ? "Undefined" : "User Accelerometer";
                    } else {
/* 55 */                str = "Gyroscope";
                    }
/* 73 */            eventSink.error("NO_SENSOR", "Sensor not found", fm0.m3789o(sb, str, " sensor"));
                }
            }
