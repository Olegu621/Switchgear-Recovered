            package com.google.firebase.messaging;

            import android.app.Application;
            import android.app.NotificationManager;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.Binder;
            import android.os.Build;
            import android.os.Bundle;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.analytics.connector.AnalyticsConnector;
            import com.google.firebase.installations.FirebaseInstallationsApi;
            import com.google.firebase.messaging.FirebaseMessaging;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import okhttp3.HttpUrl;
            import p000.C0971gy;
            import p000.C1024id;
            import p000.C2076pn;
            import p000.C2080pr;
            import p000.C2199sz;
            import p000.C2220tj;
            import p000.b40;
            import p000.bj0;
            import p000.dc0;
            import p000.dh0;
            import p000.h52;
            import p000.hh2;
            import p000.hl1;
            import p000.hu0;
            import p000.iz1;
            import p000.kb1;
            import p000.li2;
            import p000.o80;
            import p000.qi1;
            import p000.ur3;
            import p000.vi0;
            import p000.vq3;
            import p000.wc0;
            import p000.xi1;
            import p000.zj2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FirebaseMessaging {

                /* JADX INFO: renamed from: j */
                public static xi1 f5294j;

                /* JADX INFO: renamed from: k */
                public static iz1 f5295k = new C0971gy(5);

                /* JADX INFO: renamed from: l */
                public static ScheduledThreadPoolExecutor f5296l;

                /* JADX INFO: renamed from: a */
                public final vi0 f5297a;

                /* JADX INFO: renamed from: b */
                public final Context f5298b;

                /* JADX INFO: renamed from: c */
                public final qi1 f5299c;

                /* JADX INFO: renamed from: d */
                public final wc0 f5300d;

                /* JADX INFO: renamed from: e */
                public final C2220tj f5301e;

                /* JADX INFO: renamed from: f */
                public final ScheduledThreadPoolExecutor f5302f;

                /* JADX INFO: renamed from: g */
                public final ThreadPoolExecutor f5303g;

                /* JADX INFO: renamed from: h */
                public final C2199sz f5304h;

                /* JADX INFO: renamed from: i */
                public boolean f5305i;

                public FirebaseMessaging(vi0 vi0Var, iz1 iz1Var, iz1 iz1Var2, FirebaseInstallationsApi firebaseInstallationsApi, iz1 iz1Var3, li2 li2Var) {
/* 7 */             vi0Var.m9274a();
/* 10 */            Context context = vi0Var.f18192a;
/* 12 */            final C2199sz c2199sz = new C2199sz(context);
/* 19 */            vi0Var.m9274a();
/* 24 */            h52 h52Var = new h52(vi0Var.f18192a);
/* 27 */            final qi1 qi1Var = new qi1();
/* 30 */            qi1Var.f15572a = vi0Var;
/* 32 */            qi1Var.f15573b = c2199sz;
/* 34 */            qi1Var.f15574c = h52Var;
/* 38 */            qi1Var.f15575d = iz1Var;
/* 42 */            qi1Var.f15576e = iz1Var2;
/* 46 */            qi1Var.f15577f = firebaseInstallationsApi;
/* 55 */            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new hl1("Firebase-Messaging-Task"));
/* 68 */            final int i = 1;
/* 69 */            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new hl1("Firebase-Messaging-Init"));
/* 94 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hl1("Firebase-Messaging-File-Io"));
/* 100 */           final int i2 = 0;
/* 101 */           this.f5305i = false;
/* 103 */           f5295k = iz1Var3;
/* 105 */           this.f5297a = vi0Var;
/* 114 */           this.f5301e = new C2220tj(this, li2Var);
/* 116 */           vi0Var.m9274a();
/* 119 */           final Context context2 = vi0Var.f18192a;
/* 121 */           this.f5298b = context2;
/* 125 */           dh0 dh0Var = new dh0();
/* 128 */           this.f5304h = c2199sz;
/* 130 */           this.f5299c = qi1Var;
/* 137 */           this.f5300d = new wc0(executorServiceNewSingleThreadExecutor);
/* 139 */           this.f5302f = scheduledThreadPoolExecutor;
/* 141 */           this.f5303g = threadPoolExecutor;
/* 143 */           vi0Var.m9274a();
/* 148 */           if (context instanceof Application) {
/* 152 */               ((Application) context).registerActivityLifecycleCallbacks(dh0Var);
                    } else {
/* 177 */               AbstractC1245n0.m4889q("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
                    }
/* 185 */           scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: aj0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ FirebaseMessaging f310b;

                        {
/* 3 */                     this.f310b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Task taskForException;
                            int i3;
/* 1 */                     int i4 = i2;
/* 3 */                     FirebaseMessaging firebaseMessaging = this.f310b;
                            switch (i4) {
                                case 0:
/* 136 */                           if (firebaseMessaging.f5301e.m8800h() && firebaseMessaging.m2533h(firebaseMessaging.m2529d())) {
                                        synchronized (firebaseMessaging) {
/* 151 */                                   if (!firebaseMessaging.f5305i) {
/* 155 */                                       firebaseMessaging.m2532g(0L);
                                            }
                                            break;
                                        }
/* 165 */                               return;
                                    }
/* 165 */                           return;
                                default:
/* 8 */                             Context context3 = firebaseMessaging.f5298b;
/* 10 */                            hu0.m4341l0(context3);
/* 13 */                            qi1 qi1Var2 = firebaseMessaging.f5299c;
/* 15 */                            boolean zM2531f = firebaseMessaging.m2531f();
/* 25 */                            if (Build.VERSION.SDK_INT >= 29) {
/* 27 */                                SharedPreferences sharedPreferencesM7606i0 = py0.m7606i0(context3);
/* 36 */                                if (!sharedPreferencesM7606i0.contains("proxy_retention") || sharedPreferencesM7606i0.getBoolean("proxy_retention", false) != zM2531f) {
/* 47 */                                    h52 h52Var2 = (h52) qi1Var2.f15574c;
/* 58 */                                    if (h52Var2.f8907c.m1632b() >= 241100000) {
/* 62 */                                        Bundle bundle = new Bundle();
/* 65 */                                        bundle.putBoolean("proxy_retention", zM2531f);
/* 70 */                                        ur3 ur3VarM9133c = ur3.m9133c(h52Var2.f8906b);
                                                synchronized (ur3VarM9133c) {
/* 77 */                                            i3 = ur3VarM9133c.f17703a;
/* 81 */                                            ur3VarM9133c.f17703a = i3 + 1;
                                                }
/* 88 */                                        taskForException = ur3VarM9133c.m9134d(new vq3(i3, 4, bundle, 0));
                                            } else {
/* 103 */                                       taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                            }
/* 117 */                                   taskForException.addOnSuccessListener(new qd1(), new lf0(context3, zM2531f));
                                        }
                                    }
/* 124 */                           if (firebaseMessaging.m2531f()) {
/* 126 */                               firebaseMessaging.m2530e();
/* 129 */                               return;
                                    }
/* 129 */                           return;
                            }
                        }
                    });
/* 197 */           final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new hl1("Firebase-Messaging-Topics-Io"));
/* 228 */           Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: hq2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            gq2 gq2Var;
/* 1 */                     Context context3 = context2;
/* 3 */                     ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
/* 5 */                     FirebaseMessaging firebaseMessaging = this;
/* 7 */                     C2199sz c2199sz2 = c2199sz;
/* 9 */                     qi1 qi1Var2 = qi1Var;
                            synchronized (gq2.class) {
                                try {
/* 14 */                            WeakReference weakReference = gq2.f8782b;
/* 27 */                            gq2 gq2Var2 = weakReference != null ? (gq2) weakReference.get() : null;
/* 28 */                            if (gq2Var2 == null) {
/* 33 */                                SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
/* 39 */                                gq2Var = new gq2();
                                        synchronized (gq2Var) {
/* 47 */                                    gq2Var.f8783a = C0168b5.m1244m(sharedPreferences, scheduledThreadPoolExecutor3);
                                        }
/* 55 */                                gq2.f8782b = new WeakReference(gq2Var);
                                    } else {
/* 61 */                                gq2Var = gq2Var2;
                                    }
                                } catch (Throwable th) {
/* 70 */                            throw th;
                                }
                            }
/* 65 */                    return new iq2(firebaseMessaging, c2199sz2, gq2Var, qi1Var2, context3, scheduledThreadPoolExecutor3);
                        }
                    }).addOnSuccessListener(scheduledThreadPoolExecutor, new bj0(this, i2));
/* 236 */           scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: aj0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ FirebaseMessaging f310b;

                        {
/* 3 */                     this.f310b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Task taskForException;
                            int i3;
/* 1 */                     int i4 = i;
/* 3 */                     FirebaseMessaging firebaseMessaging = this.f310b;
                            switch (i4) {
                                case 0:
/* 136 */                           if (firebaseMessaging.f5301e.m8800h() && firebaseMessaging.m2533h(firebaseMessaging.m2529d())) {
                                        synchronized (firebaseMessaging) {
/* 151 */                                   if (!firebaseMessaging.f5305i) {
/* 155 */                                       firebaseMessaging.m2532g(0L);
                                            }
                                            break;
                                        }
/* 165 */                               return;
                                    }
/* 165 */                           return;
                                default:
/* 8 */                             Context context3 = firebaseMessaging.f5298b;
/* 10 */                            hu0.m4341l0(context3);
/* 13 */                            qi1 qi1Var2 = firebaseMessaging.f5299c;
/* 15 */                            boolean zM2531f = firebaseMessaging.m2531f();
/* 25 */                            if (Build.VERSION.SDK_INT >= 29) {
/* 27 */                                SharedPreferences sharedPreferencesM7606i0 = py0.m7606i0(context3);
/* 36 */                                if (!sharedPreferencesM7606i0.contains("proxy_retention") || sharedPreferencesM7606i0.getBoolean("proxy_retention", false) != zM2531f) {
/* 47 */                                    h52 h52Var2 = (h52) qi1Var2.f15574c;
/* 58 */                                    if (h52Var2.f8907c.m1632b() >= 241100000) {
/* 62 */                                        Bundle bundle = new Bundle();
/* 65 */                                        bundle.putBoolean("proxy_retention", zM2531f);
/* 70 */                                        ur3 ur3VarM9133c = ur3.m9133c(h52Var2.f8906b);
                                                synchronized (ur3VarM9133c) {
/* 77 */                                            i3 = ur3VarM9133c.f17703a;
/* 81 */                                            ur3VarM9133c.f17703a = i3 + 1;
                                                }
/* 88 */                                        taskForException = ur3VarM9133c.m9134d(new vq3(i3, 4, bundle, 0));
                                            } else {
/* 103 */                                       taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                            }
/* 117 */                                   taskForException.addOnSuccessListener(new qd1(), new lf0(context3, zM2531f));
                                        }
                                    }
/* 124 */                           if (firebaseMessaging.m2531f()) {
/* 126 */                               firebaseMessaging.m2530e();
/* 129 */                               return;
                                    }
/* 129 */                           return;
                            }
                        }
                    });
                }

                /* JADX INFO: renamed from: b */
                public static void m2526b(Runnable runnable, long j) {
                    synchronized (FirebaseMessaging.class) {
                        try {
/* 6 */                     if (f5296l == null) {
/* 21 */                        f5296l = new ScheduledThreadPoolExecutor(1, new hl1("TAG"));
                            }
/* 30 */                    f5296l.schedule(runnable, j, TimeUnit.SECONDS);
                        } catch (Throwable th) {
/* 36 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public static synchronized xi1 m2527c(Context context) {
                    try {
/* 6 */                 if (f5294j == null) {
/* 13 */                    f5294j = new xi1(context);
                        }
                    } catch (Throwable th) {
/* 23 */                throw th;
                    }
/* 18 */            return f5294j;
                }

                public static synchronized FirebaseMessaging getInstance(vi0 vi0Var) {
                    FirebaseMessaging firebaseMessaging;
/* 10 */            firebaseMessaging = (FirebaseMessaging) vi0Var.m9275b(FirebaseMessaging.class);
/* 14 */            kb1.m6062o(firebaseMessaging, "Firebase Messaging component is not present");
/* 18 */            return firebaseMessaging;
                }

                /* JADX INFO: renamed from: a */
                public final String m2528a() {
                    Task taskContinueWithTask;
/* 1 */             hh2 hh2VarM2529d = m2529d();
/* 9 */             if (!m2533h(hh2VarM2529d)) {
/* 13 */                return (String) hh2VarM2529d.f9083b;
                    }
/* 18 */            String strM8661b = C2199sz.m8661b(this.f5297a);
/* 22 */            wc0 wc0Var = this.f5300d;
                    synchronized (wc0Var) {
/* 34 */                taskContinueWithTask = (Task) ((C1024id) wc0Var.f18578c).getOrDefault(strM8661b, null);
/* 36 */                if (taskContinueWithTask == null) {
/* 40 */                    qi1 qi1Var = this.f5299c;
/* 88 */                    taskContinueWithTask = qi1Var.m7858d(qi1Var.m7864l(C2199sz.m8661b((vi0) qi1Var.f15572a), "*", new Bundle())).onSuccessTask(this.f5303g, new C2080pr(3, this, strM8661b, hh2VarM2529d)).continueWithTask((Executor) wc0Var.f18577b, new C2076pn(11, wc0Var, strM8661b));
/* 96 */                    ((C1024id) wc0Var.f18578c).put(strM8661b, taskContinueWithTask);
                        }
                    }
                    try {
/* 104 */               return (String) Tasks.await(taskContinueWithTask);
                    } catch (InterruptedException | ExecutionException e) {
/* 113 */               throw new IOException(e);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final hh2 m2529d() {
                    hh2 hh2VarM4227d;
/* 3 */             xi1 xi1VarM2527c = m2527c(this.f5298b);
/* 9 */             vi0 vi0Var = this.f5297a;
/* 11 */            vi0Var.m9274a();
/* 25 */            String strM9276d = "[DEFAULT]".equals(vi0Var.f18193b) ? HttpUrl.FRAGMENT_ENCODE_SET : vi0Var.m9276d();
/* 31 */            String strM8661b = C2199sz.m8661b(this.f5297a);
                    synchronized (xi1VarM2527c) {
/* 68 */                hh2VarM4227d = hh2.m4227d(xi1VarM2527c.f19168a.getString(strM9276d + "|T|" + strM8661b + "|*", null));
                    }
/* 73 */            return hh2VarM4227d;
                }

                /* JADX INFO: renamed from: e */
                public final void m2530e() {
                    Task taskForException;
                    int i;
/* 5 */             h52 h52Var = (h52) this.f5299c.f15574c;
/* 16 */            int i2 = 1;
/* 17 */            if (h52Var.f8907c.m1632b() >= 241100000) {
/* 21 */                ur3 ur3VarM9133c = ur3.m9133c(h52Var.f8906b);
/* 25 */                Bundle bundle = Bundle.EMPTY;
                        synchronized (ur3VarM9133c) {
/* 30 */                    i = ur3VarM9133c.f17703a;
/* 34 */                    ur3VarM9133c.f17703a = i + 1;
                        }
/* 49 */                taskForException = ur3VarM9133c.m9134d(new vq3(i, 5, bundle, 1)).continueWith(o80.f14671d, dc0.f7099Z);
                    } else {
/* 64 */                taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                    }
/* 75 */            taskForException.addOnSuccessListener(this.f5302f, new bj0(this, i2));
                }

                /* JADX INFO: renamed from: f */
                public final boolean m2531f() {
/* 1 */             Context context = this.f5298b;
/* 3 */             hu0.m4341l0(context);
/* 11 */            if (Build.VERSION.SDK_INT >= 29) {
/* 23 */                if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
/* 43 */                    if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
/* 53 */                        if (this.f5297a.m9275b(AnalyticsConnector.class) != null) {
/* 66 */                            return true;
                                }
/* 60 */                        if (b40.m1227k() && f5295k != null) {
/* 66 */                            return true;
                                }
                            }
/* 10 */                    return false;
                        }
/* 89 */                AbstractC1245n0.m4876d("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                    }
/* 10 */            return false;
                }

                /* JADX INFO: renamed from: g */
                public final synchronized void m2532g(long j) {
/* 22 */            m2526b(new zj2(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
/* 26 */            this.f5305i = true;
                }

                /* JADX INFO: renamed from: h */
                public final boolean m2533h(hh2 hh2Var) {
/* 1 */             if (hh2Var != null) {
                        return System.currentTimeMillis() > hh2Var.f9082a + 604800000 || !this.f5304h.m8662a().equals((String) hh2Var.f9084c);
                    }
/* 36 */            return true;
                }
            }
