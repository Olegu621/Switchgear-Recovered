            package p000;

            import android.hardware.Sensor;
            import android.hardware.SensorEvent;
            import android.hardware.SensorEventListener;
            import io.flutter.plugin.common.EventChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ih2 implements SensorEventListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ EventChannel.EventSink f9588a;

                public ih2(EventChannel.EventSink eventSink) {
/* 4 */             this.f9588a = eventSink;
                }

                @Override // android.hardware.SensorEventListener
                public final void onAccuracyChanged(Sensor sensor, int i) {
/* 1 */             sensor.getClass();
                }

                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
/* 1 */             sensorEvent.getClass();
/* 4 */             float[] fArr = sensorEvent.values;
/* 7 */             double[] dArr = new double[fArr.length];
/* 9 */             fArr.getClass();
/* 12 */            int length = fArr.length;
/* 13 */            int i = 0;
/* 14 */            int i2 = 0;
/* 15 */            while (i < length) {
/* 22 */                dArr[i2] = fArr[i];
/* 24 */                i++;
/* 19 */                i2++;
                    }
/* 30 */            this.f9588a.success(dArr);
                }
            }
