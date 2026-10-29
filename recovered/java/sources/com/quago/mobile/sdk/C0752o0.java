            package com.quago.mobile.sdk;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.graphics.Point;
            import android.hardware.Sensor;
            import android.hardware.SensorEvent;
            import android.hardware.SensorManager;
            import android.hardware.input.InputManager;
            import android.os.Build;
            import android.os.HandlerThread;
            import android.os.Message;
            import android.os.SystemClock;
            import android.util.DisplayMetrics;
            import android.view.Display;
            import android.view.WindowManager;
            import java.lang.ref.WeakReference;
            import java.security.SecureRandom;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.o0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 628 */   public final class C0752o0 {

                /* JADX INFO: renamed from: H */
                public static final C0740j0 f5572H;

                /* JADX INFO: renamed from: A */
                public long f5573A;

                /* JADX INFO: renamed from: B */
                public long f5574B;

                /* JADX INFO: renamed from: C */
                public long f5575C;

                /* JADX INFO: renamed from: D */
                public C0714a1 f5576D;

                /* JADX INFO: renamed from: E */
                public C0714a1 f5577E;

                /* JADX INFO: renamed from: F */
                public QuagoSettings.SensoryType[] f5578F;

                /* JADX INFO: renamed from: G */
                public String f5579G;

                /* JADX INFO: renamed from: d */
                public QuagoSettings f5583d;

                /* JADX INFO: renamed from: f */
                public final C0720c1 f5585f;

                /* JADX INFO: renamed from: g */
                public final String f5586g;

                /* JADX INFO: renamed from: h */
                public int f5587h;

                /* JADX INFO: renamed from: i */
                public int f5588i;

                /* JADX INFO: renamed from: j */
                public int f5589j;

                /* JADX INFO: renamed from: k */
                public boolean f5590k;

                /* JADX INFO: renamed from: l */
                public boolean f5591l;

                /* JADX INFO: renamed from: m */
                public boolean f5592m;

                /* JADX INFO: renamed from: n */
                public C0771y0 f5593n;

                /* JADX INFO: renamed from: o */
                public InputManager f5594o;

                /* JADX INFO: renamed from: p */
                public C0760t f5595p;

                /* JADX INFO: renamed from: q */
                public C0724e f5596q;

                /* JADX INFO: renamed from: r */
                public C0736i f5597r;

                /* JADX INFO: renamed from: s */
                public C0754p0 f5598s;

                /* JADX INFO: renamed from: t */
                public C0759s0 f5599t;

                /* JADX INFO: renamed from: u */
                public WeakReference f5600u;

                /* JADX INFO: renamed from: v */
                public HandlerThread f5601v;

                /* JADX INFO: renamed from: w */
                public HandlerC0750n0 f5602w;

                /* JADX INFO: renamed from: x */
                public C0732g1 f5603x;

                /* JADX INFO: renamed from: y */
                public String f5604y;

                /* JADX INFO: renamed from: z */
                public String f5605z;

                /* JADX INFO: renamed from: a */
                public boolean f5580a = false;

                /* JADX INFO: renamed from: b */
                public long f5581b = 0;

                /* JADX INFO: renamed from: c */
                public long f5582c = 0;

                /* JADX INFO: renamed from: e */
                public final C0717b1 f5584e = new C0717b1();

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            f5572H = new C0740j0("QuagoManager");
                }

                public C0752o0() {
/* 22 */            C0720c1 c0720c1 = new C0720c1();
/* 25 */            this.f5585f = c0720c1;
/* 27 */            this.f5587h = 0;
/* 29 */            this.f5588i = 0;
/* 31 */            this.f5589j = 0;
/* 34 */            this.f5598s = null;
/* 36 */            this.f5600u = null;
/* 38 */            this.f5604y = null;
/* 40 */            this.f5605z = null;
/* 46 */            this.f5586g = c0720c1.m2551a();
                }

                /* JADX INFO: renamed from: a */
                public final synchronized void m2644a(Activity activity, Application application, QuagoSettings quagoSettings) {
                    try {
/* 10 */                if (this.f5580a) {
/* 13 */                    return;
                        }
/* 14 */                if (quagoSettings == null) {
/* 627 */                   throw new NullPointerException("settings is null");
                        }
/* 20 */                this.f5574B = SystemClock.uptimeMillis();
/* 26 */                this.f5575C = System.currentTimeMillis();
/* 28 */                this.f5583d = quagoSettings;
/* 35 */                this.f5600u = new WeakReference(application);
/* 43 */                if (quagoSettings.isForceActivateAllSensors()) {
/* 53 */                    f5572H.m2611a("QuagoManager", "isForceActivateAllSensors = true", new Object[0]);
/* 80 */                    this.f5578F = new QuagoSettings.SensoryType[]{QuagoSettings.SensoryType.ACCELEROMETER, QuagoSettings.SensoryType.MAGNETIC_FIELD, QuagoSettings.SensoryType.GYROSCOPE, QuagoSettings.SensoryType.LIGHT, QuagoSettings.SensoryType.BATTERY, QuagoSettings.SensoryType.PRESSURE, QuagoSettings.SensoryType.PROXIMITY, QuagoSettings.SensoryType.STEP_DETECTOR, QuagoSettings.SensoryType.AMBIENT_TEMPERATURE, QuagoSettings.SensoryType.GEOMAGNETIC_ROTATION_VECTOR};
                        } else {
/* 97 */                    int iNextInt = new SecureRandom().nextInt(100) + 1;
/* 112 */                   f5572H.m2611a("QuagoManager", "Value = %s", Integer.valueOf(iNextInt));
/* 117 */                   if (iNextInt <= 90) {
/* 127 */                       this.f5578F = new QuagoSettings.SensoryType[]{QuagoSettings.SensoryType.ACCELEROMETER, QuagoSettings.SensoryType.BATTERY};
                            } else {
/* 154 */                       this.f5578F = new QuagoSettings.SensoryType[]{QuagoSettings.SensoryType.ACCELEROMETER, QuagoSettings.SensoryType.MAGNETIC_FIELD, QuagoSettings.SensoryType.GYROSCOPE, QuagoSettings.SensoryType.LIGHT, QuagoSettings.SensoryType.BATTERY, QuagoSettings.SensoryType.PRESSURE, QuagoSettings.SensoryType.PROXIMITY, QuagoSettings.SensoryType.STEP_DETECTOR, QuagoSettings.SensoryType.AMBIENT_TEMPERATURE, QuagoSettings.SensoryType.GEOMAGNETIC_ROTATION_VECTOR};
                            }
                        }
                        try {
/* 162 */                   this.f5604y = application.getPackageName();
/* 170 */                   PackageInfo packageInfo = application.getPackageManager().getPackageInfo(this.f5604y, 0);
/* 178 */                   if (Build.VERSION.SDK_INT < 28) {
/* 182 */                       this.f5605z = packageInfo.versionName;
/* 187 */                       this.f5573A = packageInfo.versionCode;
                            } else {
/* 201 */                       this.f5605z = String.valueOf(packageInfo.getLongVersionCode());
/* 207 */                       this.f5573A = packageInfo.getLongVersionCode();
                            }
                        } catch (Exception e) {
/* 212 */                   if (this.f5604y == null) {
/* 214 */                       C0740j0 c0740j0 = f5572H;
/* 218 */                       c0740j0.getClass();
/* 227 */                       if (AbstractC0743k0.m2621a(6)) {
/* 233 */                           c0740j0.m2610a(6, "initialize", "Application name can't be obtained.", e, new Object[0]);
                                }
                            } else {
/* 237 */                       C0740j0 c0740j1 = f5572H;
/* 241 */                       c0740j1.getClass();
/* 250 */                       if (AbstractC0743k0.m2621a(6)) {
/* 256 */                           c0740j1.m2610a(6, "initialize", "Application version can't be obtained.", e, new Object[0]);
                                }
                            }
/* 259 */                   this.f5605z = null;
                        }
                        try {
/* 265 */                   int i = application.getApplicationInfo().flags;
                        } catch (Exception e2) {
/* 270 */                   C0740j0 c0740j2 = f5572H;
/* 274 */                   c0740j2.getClass();
/* 283 */                   if (AbstractC0743k0.m2621a(6)) {
/* 289 */                       c0740j2.m2610a(6, "initialize", "Application name can't be obtained.", e2, new Object[0]);
                            }
                        }
/* 297 */               this.f5598s = new C0754p0(application);
/* 304 */               this.f5596q = new C0724e();
                        try {
                            try {
/* 316 */                       this.f5596q.m2554a(application, (SensorManager) application.getSystemService("sensor"), this);
                            } catch (Exception e3) {
/* 322 */                       C0740j0 c0740j3 = f5572H;
/* 326 */                       c0740j3.getClass();
/* 335 */                       if (AbstractC0743k0.m2621a(6)) {
/* 341 */                           c0740j3.m2610a(6, "initialize", "Failed to Initialize BiometricSensoryManager.", e3, new Object[0]);
                                }
                            }
                        } catch (Exception e4) {
/* 347 */                   C0740j0 c0740j4 = f5572H;
/* 351 */                   c0740j4.getClass();
/* 360 */                   if (AbstractC0743k0.m2621a(6)) {
/* 366 */                       c0740j4.m2610a(6, "initialize", "Failed to get Sensor Service from System.", e4, new Object[0]);
                            }
                        }
/* 369 */               HandlerThread handlerThread = this.f5601v;
/* 371 */               HandlerC0750n0 handlerC0750n0 = this.f5602w;
/* 379 */               HandlerThread handlerThread2 = new HandlerThread("QuagoManager", 10);
/* 382 */               this.f5601v = handlerThread2;
/* 389 */               handlerThread2.setUncaughtExceptionHandler(new C0746l0());
/* 394 */               this.f5601v.start();
/* 408 */               this.f5602w = new HandlerC0750n0(this.f5601v.getLooper(), this);
/* 410 */               if (handlerC0750n0 != null) {
/* 412 */                   handlerC0750n0.removeCallbacksAndMessages(null);
                        }
/* 415 */               if (handlerThread != null) {
/* 417 */                   handlerThread.quit();
                        }
                        try {
/* 420 */                   C0760t c0760t = this.f5595p;
/* 422 */                   if (c0760t != null) {
/* 424 */                       InputManager inputManager = this.f5594o;
/* 426 */                       if (inputManager != null) {
/* 428 */                           inputManager.unregisterInputDeviceListener(c0760t);
                                }
/* 438 */                       this.f5595p.f5630c.clear();
                            }
/* 447 */                   InputManager inputManager2 = (InputManager) application.getSystemService("input");
/* 449 */                   this.f5594o = inputManager2;
/* 453 */                   C0760t c0760t2 = new C0760t(inputManager2);
/* 456 */                   this.f5595p = c0760t2;
/* 462 */                   this.f5594o.registerInputDeviceListener(c0760t2, this.f5602w);
                        } catch (Exception e5) {
/* 466 */                   this.f5594o = null;
/* 468 */                   this.f5595p = null;
/* 474 */                   f5572H.m2612a("init", e5);
                        }
/* 481 */               C0767w0 c0767w0 = new C0767w0();
/* 486 */               c0767w0.f5656a = "https://api.quago.io/v1/record";
/* 488 */               QuagoSettings.QuagoTokenCallback tokenCallback = quagoSettings.getTokenCallback();
/* 492 */               if (tokenCallback != null) {
/* 495 */                   c0767w0.f5663h = tokenCallback;
                        }
/* 505 */               this.f5599t = new C0759s0(new C0769x0(c0767w0));
/* 516 */               this.f5597r = new C0736i(this.f5596q, this.f5595p, quagoSettings);
/* 527 */               this.f5593n = new C0771y0(application.getApplicationContext());
/* 529 */               this.f5576D = null;
/* 531 */               this.f5580a = true;
/* 533 */               m2643a(activity);
/* 538 */               if (this.f5578F != null) {
/* 552 */                   this.f5596q.m2555a((Context) this.f5600u.get(), this.f5578F);
                        }
/* 557 */               this.f5602w.sendEmptyMessage(1);
/* 564 */               if (!quagoSettings.isInitSegmentDisabled()) {
/* 568 */                   if (this.f5580a) {
/* 602 */                       C0714a1 c0714a1 = new C0714a1("INIT", null, this.f5585f.m2551a(), this.f5598s, new C0732g1(this.f5603x));
/* 605 */                       c0714a1.f5359n = true;
/* 607 */                       HandlerC0750n0 handlerC0750n1 = this.f5602w;
/* 615 */                       handlerC0750n1.sendMessage(Message.obtain(handlerC0750n1, 14, c0714a1));
                            } else {
/* 578 */                       f5572H.m2616e("beginInitSegment", "Method called before SDK initialized!", new Object[0]);
                            }
                        }
                    } catch (Throwable th) {
/* 629 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: a */
/* 629 */       public final void m2645a(SensorEvent sensorEvent) {
                    Sensor sensor;
/* 630 */           if (!this.f5580a || sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensorEvent.values == null) {
                        return;
                    }
/* 632 */           C0736i c0736i = this.f5597r;
                    int type = sensor.getType();
                    float[] fArr = sensorEvent.values;
                    c0736i.getClass();
                    try {
                        if (type == 1) {
/* 641 */                   c0736i.m2605a(c0736i.f5467e, fArr[0], fArr[1], fArr[2]);
                            return;
                        }
                        if (type == 2) {
/* 640 */                   c0736i.m2605a(c0736i.f5468f, fArr[0], fArr[1], fArr[2]);
                            return;
                        }
                        if (type == 8) {
/* 639 */                   c0736i.m2604a(c0736i.f5471i, fArr[0]);
                            return;
                        }
                        if (type == 13) {
/* 638 */                   c0736i.m2604a(c0736i.f5474l, fArr[0]);
                            return;
                        }
                        if (type == 18) {
/* 637 */                   c0736i.m2603a(c0736i.f5476n);
                            return;
                        }
                        if (type == 20) {
/* 636 */                   c0736i.m2605a(c0736i.f5470h, fArr[0], fArr[1], fArr[2]);
                            return;
                        }
                        if (type == 4) {
/* 635 */                   c0736i.m2605a(c0736i.f5469g, fArr[0], fArr[1], fArr[2]);
                        } else if (type == 5) {
/* 634 */                   c0736i.m2604a(c0736i.f5472j, fArr[0]);
                        } else {
                            if (type != 6) {
                                return;
                            }
/* 633 */                   c0736i.m2604a(c0736i.f5473k, fArr[0]);
                        }
                    } catch (Exception e) {
/* 642 */               c0736i.f5463a.m2612a("onSensorChanged", e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
                /* JADX WARN: Code duplicated, block: B:37:0x00ce A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:35:0x00b3, B:37:0x00ce, B:40:0x00f5), top: B:45:0x00b3 }] */
                /* JADX WARN: Code duplicated, block: B:45:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
                /* JADX INFO: renamed from: a */
/* 642 */       public final void m2643a(Activity activity) {
                    int i;
                    int i2;
                    int i3;
                    float f;
                    float f2;
                    C0732g1 c0732g1;
                    C0736i c0736i;
                    C0732g1[] c0732g1Arr;
                    int length;
                    QuagoSettings.LogLevel logLevel;
/* 643 */           if (!this.f5580a || activity == null) {
                        return;
                    }
/* 644 */           long jUptimeMillis = SystemClock.uptimeMillis();
                    float f3 = -1.0f;
                    int i4 = -1;
                    try {
/* 645 */               DisplayMetrics displayMetrics = new DisplayMetrics();
/* 647 */               ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
/* 648 */               i = displayMetrics.widthPixels;
                        try {
/* 649 */                   int i5 = displayMetrics.heightPixels;
                            try {
/* 650 */                       Point point = new Point(0, 0);
/* 651 */                       Application application = (Application) this.f5600u.get();
                                if (application == null) {
/* 652 */                           f5572H.m2613b("checkResolutionChange", "application is null!", new Object[0]);
                                    return;
                                }
/* 654 */                       Display defaultDisplay = ((WindowManager) application.getSystemService("window")).getDefaultDisplay();
/* 655 */                       defaultDisplay.getMetrics(displayMetrics);
/* 656 */                       f = displayMetrics.xdpi;
                                try {
/* 657 */                           f3 = displayMetrics.ydpi;
/* 658 */                           defaultDisplay.getRealSize(point);
/* 659 */                           i3 = point.x;
                                    try {
/* 660 */                               i4 = point.y;
                                        i2 = i5;
                                        f2 = f3;
                                    } catch (Exception e) {
                                        e = e;
                                        i2 = i5;
                                        f3 = f3;
                                        f3 = f;
/* 661 */                               f5572H.m2612a("checkResolutionChange", e);
                                        f = f3;
                                        f2 = f3;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    i3 = -1;
                                }
/* 662 */                       c0732g1 = new C0732g1(jUptimeMillis, i3, i4, i, i2, f, f2);
/* 663 */                       f5572H.m2611a("checkResolutionChange", c0732g1.toString(), new Object[0]);
/* 664 */                       if (c0732g1.mo2579b(this.f5603x)) {
                                    return;
                                }
/* 665 */                       this.f5603x = c0732g1;
/* 666 */                       c0736i = this.f5597r;
/* 667 */                       C0742k c0742k = c0736i.f5477o;
/* 668 */                       int i6 = c0742k.f5507c + 1;
                                c0732g1Arr = (C0732g1[]) c0742k.f5508d;
                                length = i6 % c0732g1Arr.length;
                                synchronized (c0732g1Arr[length]) {
                                    try {
/* 670 */                               c0732g1.mo2578a(((C0732g1[]) c0736i.f5477o.f5508d)[length]);
/* 671 */                               c0736i.f5477o.f5507c = length;
/* 672 */                               logLevel = QuagoSettings.LogLevel.VERBOSE;
                                        Locale locale = AbstractC0743k0.f5509a;
/* 673 */                               if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 674 */                                   C0740j0 c0740j0 = c0736i.f5463a;
                                            C0742k c0742k2 = c0736i.f5477o;
/* 677 */                                   c0740j0.m2615d("onResolutionChange", "%s%s(%s)", c0742k2.f5506b, ((C0732g1[]) c0742k2.f5508d)[length].toString(), Integer.valueOf(c0736i.f5477o.f5507c));
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i3 = -1;
                                i2 = i5;
                                f3 = -1.0f;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i2 = -1;
                            i3 = i2;
/* 661 */                   f5572H.m2612a("checkResolutionChange", e);
                            f = f3;
                            f2 = f3;
/* 662 */                   c0732g1 = new C0732g1(jUptimeMillis, i3, i4, i, i2, f, f2);
/* 663 */                   f5572H.m2611a("checkResolutionChange", c0732g1.toString(), new Object[0]);
/* 664 */                   if (c0732g1.mo2579b(this.f5603x)) {
                                return;
                            }
/* 665 */                   this.f5603x = c0732g1;
/* 666 */                   c0736i = this.f5597r;
/* 667 */                   C0742k c0742k3 = c0736i.f5477o;
/* 668 */                   int i7 = c0742k3.f5507c + 1;
                            c0732g1Arr = (C0732g1[]) c0742k3.f5508d;
                            length = i7 % c0732g1Arr.length;
                            synchronized (c0732g1Arr[length]) {
/* 670 */                       c0732g1.mo2578a(((C0732g1[]) c0736i.f5477o.f5508d)[length]);
/* 671 */                       c0736i.f5477o.f5507c = length;
/* 672 */                       logLevel = QuagoSettings.LogLevel.VERBOSE;
                                Locale locale2 = AbstractC0743k0.f5509a;
/* 673 */                       if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 674 */                           C0740j0 c0740j1 = c0736i.f5463a;
                                    C0742k c0742k4 = c0736i.f5477o;
/* 677 */                           c0740j1.m2615d("onResolutionChange", "%s%s(%s)", c0742k4.f5506b, ((C0732g1[]) c0742k4.f5508d)[length].toString(), Integer.valueOf(c0736i.f5477o.f5507c));
                                }
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i = -1;
                        i2 = -1;
                    }
                }
            }
