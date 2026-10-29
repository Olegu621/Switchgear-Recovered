            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.PowerManager;
            import android.os.SystemClock;
            import android.os.WorkSource;
            import android.text.TextUtils;
            import com.google.android.gms.internal.stats.zzb;
            import com.google.android.gms.internal.stats.zzh;
            import com.google.android.gms.internal.stats.zzi;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g63 {

                /* JADX INFO: renamed from: n */
                public static volatile ScheduledExecutorService f8489n;

                /* JADX INFO: renamed from: o */
                public static final Object f8490o = new Object();

                /* JADX INFO: renamed from: a */
                public final Object f8491a;

                /* JADX INFO: renamed from: b */
                public final PowerManager.WakeLock f8492b;

                /* JADX INFO: renamed from: c */
                public int f8493c;

                /* JADX INFO: renamed from: d */
                public ScheduledFuture f8494d;

                /* JADX INFO: renamed from: e */
                public long f8495e;

                /* JADX INFO: renamed from: f */
                public final HashSet f8496f;

                /* JADX INFO: renamed from: g */
                public boolean f8497g;

                /* JADX INFO: renamed from: h */
                public zzb f8498h;

                /* JADX INFO: renamed from: i */
                public final xt0 f8499i;

                /* JADX INFO: renamed from: j */
                public final String f8500j;

                /* JADX INFO: renamed from: k */
                public final HashMap f8501k;

                /* JADX INFO: renamed from: l */
                public final AtomicInteger f8502l;

                /* JADX INFO: renamed from: m */
                public final ScheduledExecutorService f8503m;

                public g63(Context context) {
                    boolean zBooleanValue;
/* 3 */             String packageName = context.getPackageName();
/* 15 */            this.f8491a = new Object();
/* 18 */            this.f8493c = 0;
/* 25 */            this.f8496f = new HashSet();
/* 28 */            this.f8497g = true;
/* 32 */            this.f8499i = xt0.f19362c;
/* 39 */            this.f8501k = new HashMap();
/* 46 */            this.f8502l = new AtomicInteger(0);
/* 50 */            kb1.m6059l("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
/* 53 */            context.getApplicationContext();
/* 56 */            WorkSource workSource = null;
/* 57 */            this.f8498h = null;
/* 69 */            if ("com.google.android.gms".equals(context.getPackageName())) {
/* 93 */                this.f8500j = "wake:com.google.firebase.iid.WakeLockHolder";
                    } else {
/* 90 */                this.f8500j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
                    }
/* 101 */           PowerManager powerManager = (PowerManager) context.getSystemService("power");
/* 103 */           if (powerManager == null) {
/* 319 */               StringBuilder sb = new StringBuilder(29);
/* 324 */               sb.append((CharSequence) "expected a non-null reference", 0, 29);
/* 334 */               throw new zzi(sb.toString());
                    }
/* 109 */           this.f8492b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
/* 111 */           Method method = f93.f8048a;
                    synchronized (f93.class) {
/* 116 */               Boolean bool = f93.f8050c;
/* 118 */               if (bool != null) {
/* 120 */                   zBooleanValue = bool.booleanValue();
                        } else {
/* 139 */                   zBooleanValue = v00.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
/* 144 */                   f93.f8050c = Boolean.valueOf(zBooleanValue);
                        }
                    }
/* 147 */           if (zBooleanValue) {
/* 149 */               int i = xh2.f19096a;
/* 163 */               packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
/* 173 */               if (context.getPackageManager() != null && packageName != null) {
                            try {
/* 181 */                       ApplicationInfo applicationInfoM9213b = g93.m3898a(context).m9213b(0, packageName);
/* 185 */                       if (applicationInfoM9213b == null) {
/* 193 */                           AbstractC1245n0.m4876d("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                                } else {
/* 197 */                           int i2 = applicationInfoM9213b.uid;
/* 201 */                           workSource = new WorkSource();
/* 206 */                           Method method2 = f93.f8049b;
/* 208 */                           if (method2 != null) {
                                        try {
/* 218 */                                   method2.invoke(workSource, Integer.valueOf(i2), packageName);
                                        } catch (Exception e) {
/* 223 */                                   AbstractC1245n0.m4893u("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                        }
                                    } else {
/* 227 */                               Method method3 = f93.f8048a;
/* 229 */                               if (method3 != null) {
                                            try {
/* 239 */                                       method3.invoke(workSource, Integer.valueOf(i2));
                                            } catch (Exception e2) {
/* 244 */                                       AbstractC1245n0.m4893u("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                            }
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
/* 254 */                       AbstractC1245n0.m4876d("WorkSourceUtil", "Could not find package: ".concat(packageName));
                            }
                        }
/* 257 */               if (workSource != null) {
                            try {
/* 261 */                       this.f8492b.setWorkSource(workSource);
                            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
/* 274 */                       AbstractC1245n0.m4892t("WakeLock", e3.toString());
                            }
                        }
                    }
/* 277 */           ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f8489n;
/* 279 */           if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        synchronized (f8490o) {
                            try {
/* 284 */                       scheduledExecutorServiceUnconfigurableScheduledExecutorService = f8489n;
/* 286 */                       if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
/* 288 */                           zzh.zza();
/* 295 */                           scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
/* 299 */                           f8489n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                                }
                            } catch (Throwable th) {
/* 307 */                       throw th;
                            }
                        }
                    }
/* 308 */           this.f8503m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }

                /* JADX INFO: renamed from: a */
                public final void m3878a() {
/* 3 */             this.f8502l.incrementAndGet();
/* 29 */            long jMin = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
                    synchronized (this.f8491a) {
                        try {
/* 42 */                    if (!m3879b()) {
/* 48 */                        this.f8498h = zzb.zza(false, null);
/* 52 */                        this.f8492b.acquire();
/* 57 */                        this.f8499i.getClass();
/* 60 */                        SystemClock.elapsedRealtime();
                            }
/* 70 */                    this.f8493c++;
/* 74 */                    if (this.f8497g) {
/* 76 */                        TextUtils.isEmpty(null);
                            }
/* 85 */                    bf3 bf3Var = (bf3) this.f8501k.get(null);
/* 87 */                    if (bf3Var == null) {
/* 91 */                        bf3Var = new bf3();
/* 96 */                        this.f8501k.put(null, bf3Var);
                            }
/* 103 */                   bf3Var.f2400a++;
/* 107 */                   this.f8499i.getClass();
/* 110 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 120 */                   long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
/* 126 */                   if (j > this.f8495e) {
/* 128 */                       this.f8495e = j;
/* 130 */                       ScheduledFuture scheduledFuture = this.f8494d;
/* 132 */                       if (scheduledFuture != null) {
/* 134 */                           scheduledFuture.cancel(false);
                                }
/* 151 */                       this.f8494d = this.f8503m.schedule(new bb3(this, 3), jMin, TimeUnit.MILLISECONDS);
                            }
                        } catch (Throwable th) {
/* 156 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final boolean m3879b() {
                    boolean z;
                    synchronized (this.f8491a) {
/* 10 */                z = this.f8493c > 0;
                    }
/* 12 */            return z;
                }

                /* JADX INFO: renamed from: c */
                public final void m3880c() {
/* 7 */             if (this.f8502l.decrementAndGet() < 0) {
/* 23 */                AbstractC1245n0.m4876d("WakeLock", String.valueOf(this.f8500j).concat(" release without a matched acquire!"));
                    }
                    synchronized (this.f8491a) {
                        try {
/* 32 */                    if (this.f8497g) {
/* 34 */                        TextUtils.isEmpty(null);
                            }
/* 43 */                    if (this.f8501k.containsKey(null)) {
/* 51 */                        bf3 bf3Var = (bf3) this.f8501k.get(null);
/* 53 */                        if (bf3Var != null) {
/* 57 */                            int i = bf3Var.f2400a - 1;
/* 59 */                            bf3Var.f2400a = i;
/* 61 */                            if (i == 0) {
/* 65 */                                this.f8501k.remove(null);
                                    }
                                }
                            } else {
/* 85 */                        AbstractC1245n0.m4889q("WakeLock", String.valueOf(this.f8500j).concat(" counter does not exist"));
                            }
/* 88 */                    m3882e();
                        } catch (Throwable th) {
/* 94 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m3881d() {
/* 1 */             HashSet hashSet = this.f8496f;
/* 7 */             if (hashSet.isEmpty()) {
/* 24 */                return;
                    }
/* 12 */            ArrayList arrayList = new ArrayList(hashSet);
/* 15 */            hashSet.clear();
/* 22 */            if (arrayList.size() > 0) {
/* 30 */                throw pm2.m7486i(0, arrayList);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m3882e() {
                    synchronized (this.f8491a) {
                        try {
/* 8 */                     if (m3879b()) {
/* 18 */                        if (this.f8497g) {
/* 22 */                            int i = this.f8493c - 1;
/* 24 */                            this.f8493c = i;
/* 26 */                            if (i > 0) {
/* 30 */                                return;
                                    }
                                } else {
/* 31 */                            this.f8493c = 0;
                                }
/* 33 */                        m3881d();
/* 42 */                        Iterator it = this.f8501k.values().iterator();
/* 50 */                        while (it.hasNext()) {
/* 58 */                            ((bf3) it.next()).f2400a = 0;
                                }
/* 63 */                        this.f8501k.clear();
/* 66 */                        ScheduledFuture scheduledFuture = this.f8494d;
/* 69 */                        if (scheduledFuture != null) {
/* 71 */                            scheduledFuture.cancel(false);
/* 74 */                            this.f8494d = null;
/* 78 */                            this.f8495e = 0L;
                                }
/* 86 */                        if (this.f8492b.isHeld()) {
                                    try {
                                        try {
/* 90 */                                    this.f8492b.release();
/* 95 */                                    if (this.f8498h != null) {
/* 97 */                                        this.f8498h = null;
                                            }
                                        } catch (RuntimeException e) {
/* 113 */                                   if (!e.getClass().equals(RuntimeException.class)) {
/* 139 */                                       throw e;
                                            }
/* 129 */                                   AbstractC1245n0.m4877e("WakeLock", String.valueOf(this.f8500j).concat(" failed to release!"), e);
/* 134 */                                   if (this.f8498h != null) {
/* 136 */                                       this.f8498h = null;
                                            }
                                        }
                                    } catch (Throwable th) {
/* 142 */                               if (this.f8498h != null) {
/* 144 */                                   this.f8498h = null;
                                        }
/* 146 */                               throw th;
                                    }
                                } else {
/* 161 */                           AbstractC1245n0.m4876d("WakeLock", String.valueOf(this.f8500j).concat(" should be held!"));
                                }
                            }
                        } catch (Throwable th2) {
/* 167 */                   throw th2;
                        }
                    }
                }
            }
