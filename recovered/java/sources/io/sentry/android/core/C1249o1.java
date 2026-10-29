            package io.sentry.android.core;

            import android.app.Activity;
            import android.content.Context;
            import android.hardware.Sensor;
            import android.hardware.SensorEvent;
            import android.hardware.SensorEventListener;
            import android.hardware.SensorManager;
            import android.os.Handler;
            import android.os.HandlerThread;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import p000.C2199sz;
            import p000.f72;
            
            /* JADX INFO: renamed from: io.sentry.android.core.o1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1249o1 implements SensorEventListener {

                /* JADX INFO: renamed from: a */
                public SensorManager f10227a;

                /* JADX INFO: renamed from: b */
                public Sensor f10228b;

                /* JADX INFO: renamed from: c */
                public HandlerThread f10229c;

                /* JADX INFO: renamed from: d */
                public Handler f10230d;

                /* JADX INFO: renamed from: e */
                public volatile InterfaceC1243m1 f10231e;

                /* JADX INFO: renamed from: f */
                public ILogger f10232f;

                /* JADX INFO: renamed from: g */
                public final C2199sz f10233g = new C2199sz();

                public C1249o1(ILogger iLogger) {
/* 11 */            this.f10232f = iLogger;
                }

                /* JADX INFO: renamed from: a */
                public final void m4897a(Context context) {
/* 3 */             if (this.f10227a == null) {
/* 13 */                this.f10227a = (SensorManager) context.getSystemService("sensor");
                    }
/* 15 */            SensorManager sensorManager = this.f10227a;
/* 17 */            if (sensorManager != null && this.f10228b == null) {
/* 29 */                this.f10228b = sensorManager.getDefaultSensor(1, false);
                    }
/* 33 */            if (this.f10228b == null || this.f10229c != null) {
/* 64 */                return;
                    }
/* 43 */            HandlerThread handlerThread = new HandlerThread("sentry-shake");
/* 46 */            this.f10229c = handlerThread;
/* 48 */            handlerThread.start();
/* 62 */            this.f10230d = new Handler(this.f10229c.getLooper());
                }

                /* JADX INFO: renamed from: b */
                public final void m4898b(Activity activity, InterfaceC1243m1 interfaceC1243m1) {
/* 1 */             this.f10231e = interfaceC1243m1;
/* 3 */             m4897a(activity);
/* 6 */             SensorManager sensorManager = this.f10227a;
/* 9 */             if (sensorManager == null) {
/* 19 */                this.f10232f.mo4672k(EnumC1553m5.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
/* 22 */                return;
                    }
/* 23 */            Sensor sensor = this.f10228b;
/* 25 */            if (sensor == null) {
/* 35 */                this.f10232f.mo4672k(EnumC1553m5.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
                    } else {
/* 42 */                sensorManager.registerListener(this, sensor, 3, this.f10230d);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m4899c() {
/* 2 */             this.f10231e = null;
/* 4 */             SensorManager sensorManager = this.f10227a;
/* 6 */             if (sensorManager != null) {
/* 8 */                 sensorManager.unregisterListener(this);
                    }
/* 11 */            Handler handler = this.f10230d;
/* 13 */            if (handler != null) {
/* 22 */                handler.post(new f72(this, 21));
                    }
                }

                @Override // android.hardware.SensorEventListener
                public final void onAccuracyChanged(Sensor sensor, int i) {
                }

                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    int i;
                    int i2;
                    C1246n1 c1246n1;
                    int i3;
                    C1246n1 c1246n2;
/* 11 */            int i4 = 1;
/* 12 */            if (sensorEvent.sensor.getType() != 1) {
/* 239 */               return;
                    }
/* 16 */            float[] fArr = sensorEvent.values;
/* 19 */            float f = fArr[0];
/* 21 */            float f2 = fArr[1];
/* 24 */            float f3 = fArr[2];
/* 44 */            boolean z = Math.sqrt((double) ((f3 * f3) + ((f2 * f2) + (f * f)))) > 13.0d;
/* 45 */            C2199sz c2199sz = this.f10233g;
/* 47 */            long j = sensorEvent.timestamp;
/* 51 */            C1248o0 c1248o0 = (C1248o0) c2199sz.f16875c;
/* 56 */            long j2 = j - 500000000;
                    while (true) {
/* 58 */                i = c2199sz.f16873a;
/* 62 */                if (i >= 4 && (c1246n2 = (C1246n1) c2199sz.f16876d) != null) {
/* 70 */                    i2 = i4;
/* 79 */                    if (j2 - c1246n2.f10222a <= 0) {
                                break;
                            }
/* 83 */                    if (c1246n2.f10223b) {
/* 88 */                        c2199sz.f16874b -= i2;
                            }
/* 92 */                    c2199sz.f16873a = i - 1;
/* 94 */                    C1246n1 c1246n3 = c1246n2.f10224c;
/* 96 */                    c2199sz.f16876d = c1246n3;
/* 98 */                    if (c1246n3 == null) {
/* 100 */                       c2199sz.f16877e = null;
                            }
/* 106 */                   c1246n2.f10224c = (C1246n1) c1248o0.f10226a;
/* 108 */                   c1248o0.f10226a = c1246n2;
/* 110 */                   i4 = i2;
                        } else {
/* 113 */                   i2 = i4;
                            break;
                        }
                    }
/* 116 */           C1246n1 c1246n4 = (C1246n1) c1248o0.f10226a;
/* 118 */           if (c1246n4 == null) {
/* 122 */               c1246n4 = new C1246n1();
                    } else {
/* 128 */               c1248o0.f10226a = c1246n4.f10224c;
                    }
/* 130 */           c1246n4.f10222a = j;
/* 132 */           c1246n4.f10223b = z;
/* 134 */           c1246n4.f10224c = null;
/* 138 */           C1246n1 c1246n5 = (C1246n1) c2199sz.f16877e;
/* 140 */           if (c1246n5 != null) {
/* 142 */               c1246n5.f10224c = c1246n4;
                    }
/* 144 */           c2199sz.f16877e = c1246n4;
/* 150 */           if (((C1246n1) c2199sz.f16876d) == null) {
/* 152 */               c2199sz.f16876d = c1246n4;
                    }
/* 155 */           c2199sz.f16873a = i + i2;
/* 157 */           if (z) {
/* 162 */               c2199sz.f16874b += i2;
                    }
/* 164 */           C2199sz c2199sz2 = this.f10233g;
/* 168 */           C1246n1 c1246n6 = (C1246n1) c2199sz2.f16877e;
/* 170 */           if (c1246n6 == null || (c1246n1 = (C1246n1) c2199sz2.f16876d) == null || (i3 = c2199sz2.f16873a) < 4 || c1246n6.f10222a - c1246n1.f10222a < 250000000 || c2199sz2.f16874b < (i3 >> 1) + (i3 >> 2)) {
/* 239 */               return;
                    }
                    while (true) {
/* 204 */               C1246n1 c1246n7 = (C1246n1) c2199sz2.f16876d;
/* 206 */               if (c1246n7 == null) {
                            break;
                        }
/* 210 */               c2199sz2.f16876d = c1246n7.f10224c;
/* 214 */               C1248o0 c1248o1 = (C1248o0) c2199sz2.f16875c;
/* 220 */               c1246n7.f10224c = (C1246n1) c1248o1.f10226a;
/* 222 */               c1248o1.f10226a = c1246n7;
                    }
/* 225 */           c2199sz2.f16877e = null;
/* 228 */           c2199sz2.f16873a = 0;
/* 230 */           c2199sz2.f16874b = 0;
/* 232 */           InterfaceC1243m1 interfaceC1243m1 = this.f10231e;
/* 234 */           if (interfaceC1243m1 != null) {
/* 236 */               interfaceC1243m1.mo4872b();
                    }
                }
            }
