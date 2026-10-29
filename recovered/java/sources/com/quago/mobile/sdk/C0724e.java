            package com.quago.mobile.sdk;

            import android.content.Context;
            import android.hardware.Sensor;
            import android.hardware.SensorEvent;
            import android.hardware.SensorEventListener;
            import android.hardware.SensorManager;
            import android.os.Handler;
            import android.os.HandlerThread;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 156 */   public final class C0724e implements SensorEventListener {

                /* JADX INFO: renamed from: b */
                public Handler f5405b;

                /* JADX INFO: renamed from: c */
                public C0752o0 f5406c;

                /* JADX INFO: renamed from: d */
                public List f5407d;

                /* JADX INFO: renamed from: e */
                public Context f5408e;

                /* JADX INFO: renamed from: f */
                public HandlerThread f5409f;

                /* JADX INFO: renamed from: g */
                public SensorManager f5410g;

                /* JADX INFO: renamed from: a */
                public final C0740j0 f5404a = AbstractC0743k0.m2619a("BiometricSensorsManager");

                /* JADX INFO: renamed from: h */
                public final HashMap f5411h = new HashMap();

                /* JADX INFO: renamed from: a */
                public final synchronized void m2555a(Context context, QuagoSettings.SensoryType... sensoryTypeArr) {
                    int i;
                    try {
                        try {
/* 4 */                     for (QuagoSettings.SensoryType sensoryType : sensoryTypeArr) {
/* 8 */                         if (sensoryType != null && (i = sensoryType.type) != -1 && this.f5411h.get(Integer.valueOf(sensoryType.ordinal())) == null) {
/* 36 */                            if (i != 0) {
/* 62 */                                for (Sensor sensor : this.f5407d) {
/* 74 */                                    if (i == sensor.getType()) {
/* 81 */                                        int sampleRate = this.f5406c.f5583d.getSampleRate(sensoryType);
/* 85 */                                        if (sampleRate == -1) {
/* 97 */                                            this.f5404a.m2613b("enableBiometricSensor", "Missing sampleRate for type = %s", sensoryType);
                                                } else {
/* 105 */                                           this.f5410g.registerListener(this, sensor, sampleRate, this.f5405b);
/* 126 */                                           this.f5404a.m2611a("enableBiometricSensor", "Enabled BiometricSensor = %s, sampleRate = %s", sensor.getName(), Integer.valueOf(sampleRate));
/* 139 */                                           this.f5411h.put(Integer.valueOf(sensoryType.ordinal()), sensoryType);
                                                }
                                            }
                                        }
                                    } else if (sensoryType == QuagoSettings.SensoryType.BATTERY) {
/* 44 */                                AbstractC0721d.m2553a(context, this.f5406c);
                                    }
                                }
                            }
                        } catch (Exception e) {
/* 151 */                   this.f5404a.m2612a("registerSensor", e);
                        }
                    } catch (Throwable th) {
/* 157 */               throw th;
                    }
                }

                @Override // android.hardware.SensorEventListener
                public final void onAccuracyChanged(Sensor sensor, int i) {
                }

                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
/* 3 */             this.f5406c.m2645a(sensorEvent);
                }

                /* JADX INFO: renamed from: a */
/* 157 */       public final synchronized void m2554a(Context context, SensorManager sensorManager, C0752o0 c0752o0) {
                    try {
/* 158 */               this.f5408e = context;
/* 159 */               this.f5410g = sensorManager;
/* 160 */               this.f5406c = c0752o0;
/* 161 */               this.f5407d = sensorManager.getSensorList(-1);
/* 162 */               HandlerThread handlerThread = new HandlerThread("BiometricsManager_Thread");
                        this.f5409f = handlerThread;
/* 163 */               handlerThread.start();
/* 164 */               this.f5405b = new Handler(this.f5409f.getLooper());
                    } catch (Exception e) {
/* 165 */               this.f5404a.m2612a("init", e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0045 A[Catch: all -> 0x001b, Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000a, B:16:0x0020, B:18:0x0024, B:22:0x002e, B:24:0x003f, B:25:0x0045, B:26:0x004b, B:28:0x0051, B:33:0x0084), top: B:40:0x0001, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:28:0x0051 A[Catch: all -> 0x001b, Exception -> 0x001e, TRY_LEAVE, TryCatch #0 {Exception -> 0x001e, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000a, B:16:0x0020, B:18:0x0024, B:22:0x002e, B:24:0x003f, B:25:0x0045, B:26:0x004b, B:28:0x0051, B:33:0x0084), top: B:40:0x0001, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:42:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:1: B:26:0x004b->B:50:?, LOOP_END, SYNTHETIC] */
                /* JADX INFO: renamed from: a */
/* 165 */       public final synchronized void m2556a(QuagoSettings.SensoryType... sensoryTypeArr) {
                    try {
/* 166 */               if (this.f5411h == null) {
                            return;
                        }
/* 167 */               if (sensoryTypeArr.length == 0) {
/* 168 */                   this.f5410g.unregisterListener(this);
/* 169 */                   AbstractC0721d.m2552a(this.f5408e);
/* 170 */                   this.f5411h.clear();
                            return;
                        }
                        for (QuagoSettings.SensoryType sensoryType : sensoryTypeArr) {
/* 172 */                   int i = sensoryType.type;
                            if (i != -1) {
                                if (i == 0) {
/* 173 */                           this.f5411h.remove(Integer.valueOf(sensoryType.ordinal()));
/* 174 */                           if (sensoryType == QuagoSettings.SensoryType.BATTERY) {
/* 175 */                               AbstractC0721d.m2552a(this.f5408e);
                                    } else {
                                        for (Sensor sensor : this.f5407d) {
/* 177 */                                   if (sensoryType.type == sensor.getType()) {
                                                try {
/* 178 */                                           this.f5410g.unregisterListener(this, sensor);
/* 179 */                                           this.f5411h.remove(Integer.valueOf(sensoryType.ordinal()));
/* 182 */                                           this.f5404a.m2611a("disableBiometricSensor", "Disabled BiometricSensor = %s", sensor.getName());
                                                    break;
                                                } catch (Exception e) {
/* 183 */                                           this.f5404a.m2612a("disableBiometricSensor", e);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    while (r3.hasNext()) {
/* 177 */                               if (sensoryType.type == sensor.getType()) {
/* 178 */                                   this.f5410g.unregisterListener(this, sensor);
/* 179 */                                   this.f5411h.remove(Integer.valueOf(sensoryType.ordinal()));
/* 182 */                                   this.f5404a.m2611a("disableBiometricSensor", "Disabled BiometricSensor = %s", sensor.getName());
                                            break;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
/* 184 */               this.f5404a.m2612a("disableBiometricSensor", e2);
                    }
                }
            }
