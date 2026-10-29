            package com.supercell.titan;

            import android.app.Application;
            import android.content.Context;
            import android.os.Build;
            import android.os.PowerManager;
            import com.supercell.titan.SentryTitan;
            import com.supercell.titan.ThermalMonitor;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1443f;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Random;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import okhttp3.internal.connection.RealConnection;
            import p000.un2;
            import p000.vn2;
            import p000.wn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ThermalMonitor {
                public static final int THERMAL_PREDICTION_INITIALIZED = 2;
                public static final int THERMAL_PREDICTION_NOT_AVAILABLE = 0;
                public static final int THERMAL_PREDICTION_NOT_INITIALIZED = 1;
                public static final int THERMAL_PREDICTION_ONGOING = 3;

                /* JADX INFO: renamed from: m */
                public static ThermalMonitor f5924m = null;

                /* JADX INFO: renamed from: a */
                public long f5925a = -1;

                /* JADX INFO: renamed from: b */
                public float f5926b = Float.NaN;

                /* JADX INFO: renamed from: c */
                public int f5927c = -1;

                /* JADX INFO: renamed from: d */
                public int f5928d = -1;

                /* JADX INFO: renamed from: e */
                public int f5929e = -1;

                /* JADX INFO: renamed from: f */
                public int f5930f = -1;

                /* JADX INFO: renamed from: g */
                public int f5931g = -1;

                /* JADX INFO: renamed from: h */
                public int f5932h = -1;

                /* JADX INFO: renamed from: i */
                public final HashMap f5933i = new HashMap();

                /* JADX INFO: renamed from: j */
                public PowerManager f5934j = null;

                /* JADX INFO: renamed from: k */
                public ScheduledExecutorService f5935k;

                /* JADX INFO: renamed from: l */
                public ScheduledFuture f5936l;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PredictionResult {
                    public long nanosecondsSincePrediction;
                    public float prediction;
                    public boolean success;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SessionResult {
                    public int maxStatus;
                    public int minStatus;
                    public int statusAtEnd;
                    public int statusAtStart;
                    public boolean success;
                }

                public static int getCurrentThermalStatus(Context context) {
/* 5 */             if (Build.VERSION.SDK_INT < 29) {
/* 24 */                return -1;
                    }
/* 13 */            PowerManager powerManager = (PowerManager) context.getSystemService("power");
/* 15 */            if (powerManager != null) {
/* 1 */                 return powerManager.getCurrentThermalStatus();
                    }
/* 22 */            return 0;
                }

                public static synchronized ThermalMonitor getInstance() {
                    try {
/* 6 */                 if (f5924m == null) {
/* 13 */                    f5924m = new ThermalMonitor();
                        }
                    } catch (Throwable th) {
/* 23 */                throw th;
                    }
/* 18 */            return f5924m;
                }

                public static boolean isThermalStatusAvailable() {
                    return Build.VERSION.SDK_INT >= 29;
                }

                public static String thermalStatusToString(int i) {
                    switch (i) {
                        case -1:
                            return "not available";
                        case 0:
                            return "none";
                        case 1:
                            return "light";
                        case 2:
                            return "moderate";
                        case 3:
                            return "severe";
                        case 4:
                            return "critical";
                        case 5:
                            return "emergency";
                        case 6:
                            return "shutdown";
                        default:
                            return "unknown";
                    }
                }

                public void deinitThermalPrediction() {
/* 1 */             stopPrediction();
/* 5 */             this.f5935k = null;
/* 8 */             this.f5927c = -1;
/* 12 */            this.f5926b = Float.NaN;
                }

                public SessionResult endSession(Context context, String str) {
                    wn2 wn2Var;
/* 3 */             SessionResult sessionResult = new SessionResult();
                    synchronized (this.f5933i) {
/* 15 */                wn2Var = (wn2) this.f5933i.remove(str);
                    }
/* 18 */            if (wn2Var == null) {
/* 43 */                sessionResult.success = false;
/* 45 */                return sessionResult;
                    }
/* 21 */            sessionResult.success = true;
/* 25 */            sessionResult.minStatus = wn2Var.f18702b;
/* 29 */            sessionResult.maxStatus = wn2Var.f18703c;
/* 33 */            sessionResult.statusAtStart = wn2Var.f18701a;
/* 39 */            sessionResult.statusAtEnd = getCurrentThermalStatus(context);
/* 41 */            return sessionResult;
                }

                public int getThermalPredictionStatus() {
/* 5 */             if (Build.VERSION.SDK_INT < 30) {
/* 28 */                return 0;
                    }
/* 9 */             if (this.f5935k == null) {
/* 11 */                return 1;
                    }
/* 13 */            ScheduledFuture scheduledFuture = this.f5936l;
                    return (scheduledFuture == null || scheduledFuture.isCancelled()) ? 2 : 3;
                }

                /* JADX WARN: Type inference failed for: r0v6, types: [tn2] */
                public void init(Context context) {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 15 */                this.f5934j = (PowerManager) context.getSystemService("power");
/* 17 */                System.nanoTime();
/* 20 */                int currentThermalStatus = getCurrentThermalStatus(context);
/* 24 */                this.f5932h = currentThermalStatus;
/* 26 */                this.f5930f = currentThermalStatus;
/* 28 */                this.f5929e = currentThermalStatus;
/* 51 */                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new BackgroundObserver(new C0805l(this, new PowerManager.OnThermalStatusChangedListener() { // from class: tn2
                            @Override // android.os.PowerManager.OnThermalStatusChangedListener
                            public final void onThermalStatusChanged(int i) {
/* 1 */                         ThermalMonitor thermalMonitor = this.f17192a;
/* 5 */                         if (i > thermalMonitor.f5932h) {
/* 7 */                             thermalMonitor.f5932h = i;
                                }
/* 11 */                        if (i > thermalMonitor.f5931g) {
/* 13 */                            thermalMonitor.f5931g = i;
                                }
                                synchronized (thermalMonitor.f5933i) {
                                    try {
/* 32 */                                for (wn2 wn2Var : thermalMonitor.f5933i.values()) {
/* 42 */                                    if (!wn2Var.f18704d) {
/* 50 */                                        wn2Var.f18702b = Math.min(wn2Var.f18702b, i);
/* 58 */                                        wn2Var.f18703c = Math.max(wn2Var.f18703c, i);
                                            }
                                        }
                                    } catch (Throwable th) {
/* 159 */                               throw th;
                                    }
                                }
/* 65 */                        if (i >= 3) {
/* 73 */                            String strM3507k = AbstractC0886en.m3507k("Thermal status ", ThermalMonitor.thermalStatusToString(i));
/* 79 */                            p92 p92Var = p92.WARNING;
/* 81 */                            Random random = SentryTitan.f5920a;
/* 85 */                            C1443f c1443f = new C1443f();
/* 88 */                            c1443f.f10929d = strM3507k;
/* 90 */                            c1443f.f10932i = "default";
/* 94 */                            c1443f.f10934w = p92Var.f15033a;
/* 100 */                           AbstractC1552m4.m5357b().mo5089i(c1443f);
                                }
/* 104 */                       if (i != 6 || thermalMonitor.f5930f == 6) {
/* 157 */                           return;
                                }
/* 110 */                       Locale locale = Locale.US;
/* 154 */                       SentryTitan.m2746b("Thermal shutdown. Status when app launched " + ThermalMonitor.thermalStatusToString(thermalMonitor.f5929e).toUpperCase() + ". Status when foregrounded " + ThermalMonitor.thermalStatusToString(thermalMonitor.f5930f).toUpperCase());
                            }
                        })));
                    }
                }

                public void initThermalPrediction(Context context, int i, int i2) {
/* 5 */             if (Build.VERSION.SDK_INT >= 30) {
/* 9 */                 if (this.f5934j == null) {
                        }
/* 25 */                this.f5928d = Math.max(i, 10);
/* 31 */                this.f5927c = Math.max(i2, 10);
/* 35 */                if (this.f5935k == null) {
/* 46 */                    this.f5935k = Executors.newSingleThreadScheduledExecutor(new vn2());
                        }
                    }
                }

                public void pauseSession(Context context, String str) {
                    synchronized (this.f5933i) {
                        try {
/* 10 */                    wn2 wn2Var = (wn2) this.f5933i.get(str);
/* 12 */                    if (wn2Var != null) {
/* 15 */                        wn2Var.f18704d = true;
                            }
                        } catch (Throwable th) {
/* 23 */                    throw th;
                        }
                    }
                }

                public void resumeSession(Context context, String str) {
                    synchronized (this.f5933i) {
                        try {
/* 10 */                    wn2 wn2Var = (wn2) this.f5933i.get(str);
/* 12 */                    if (wn2Var != null) {
/* 15 */                        wn2Var.f18704d = false;
                            }
                        } catch (Throwable th) {
/* 23 */                    throw th;
                        }
                    }
                }

                public void startPrediction() {
/* 5 */             if (Build.VERSION.SDK_INT >= 30) {
/* 7 */                 ScheduledFuture scheduledFuture = this.f5936l;
/* 9 */                 if (scheduledFuture == null || scheduledFuture.isCancelled()) {
/* 65 */                    this.f5936l = this.f5935k.scheduleWithFixedDelay(new un2(this, 0), this.f5925a >= 0 ? Math.max(RealConnection.IDLE_CONNECTION_HEALTHY_NS - (System.nanoTime() - this.f5925a), 0L) : 0L, ((long) this.f5928d) * 1000000000, TimeUnit.NANOSECONDS);
                        }
                    }
                }

                public void startSession(Context context, String str) {
                    synchronized (this.f5933i) {
                        try {
/* 10 */                    if (!this.f5933i.containsKey(str)) {
/* 12 */                        HashMap map = this.f5933i;
/* 16 */                        wn2 wn2Var = new wn2();
/* 20 */                        wn2Var.f18704d = false;
/* 22 */                        int currentThermalStatus = getCurrentThermalStatus(context);
/* 26 */                        wn2Var.f18703c = currentThermalStatus;
/* 28 */                        wn2Var.f18702b = currentThermalStatus;
/* 30 */                        wn2Var.f18701a = currentThermalStatus;
/* 32 */                        map.put(str, wn2Var);
                            }
                        } catch (Throwable th) {
/* 41 */                    throw th;
                        }
                    }
                }

                public void stopPrediction() {
/* 1 */             ScheduledFuture scheduledFuture = this.f5936l;
/* 3 */             if (scheduledFuture != null) {
/* 6 */                 scheduledFuture.cancel(true);
/* 10 */                this.f5936l = null;
                    }
                }

                public native void updatePrediction(float f);
            }
