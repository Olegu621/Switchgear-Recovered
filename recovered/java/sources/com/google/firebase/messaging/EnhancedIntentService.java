            package com.google.firebase.messaging;

            import android.app.Service;
            import android.content.Intent;
            import android.os.Binder;
            import android.os.IBinder;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import p000.C2076pn;
            import p000.RunnableC2558zo;
            import p000.a93;
            import p000.gr0;
            import p000.hl1;
            import p000.qd1;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class EnhancedIntentService extends Service {
                static final long MESSAGE_TIMEOUT_S = 20;
                private static final String TAG = "EnhancedIntentService";

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f5293a = 0;
                private Binder binder;
                final ExecutorService executor;
                private int lastStartId;
                private final Object lock;
                private int runningTasks;

                public EnhancedIntentService() {
/* 8 */             hl1 hl1Var = new hl1("Firebase-Messaging-Intent-Handle");
/* 24 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), hl1Var);
/* 27 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 34 */            this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
/* 41 */            this.lock = new Object();
/* 44 */            this.runningTasks = 0;
                }

                /* JADX INFO: renamed from: a */
                public final void m2524a(Intent intent) {
/* 1 */             if (intent != null) {
/* 3 */                 yy1.m10217l(intent);
                    }
                    synchronized (this.lock) {
                        try {
/* 11 */                    int i = this.runningTasks - 1;
/* 13 */                    this.runningTasks = i;
/* 15 */                    if (i == 0) {
/* 19 */                        stopSelfResultHook(this.lastStartId);
                            }
                        } catch (Throwable th) {
/* 28 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final Task m2525b(Intent intent) {
/* 5 */             if (handleIntentOnMainThread(intent)) {
/* 8 */                 return Tasks.forResult(null);
                    }
/* 15 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 27 */            this.executor.execute(new RunnableC2558zo(9, this, intent, taskCompletionSource));
/* 30 */            return taskCompletionSource.getTask();
                }

                public Intent getStartCommandIntent(Intent intent) {
/* 1 */             return intent;
                }

                public abstract void handleIntent(Intent intent);

                public boolean handleIntentOnMainThread(Intent intent) {
/* 1 */             return false;
                }

                @Override // android.app.Service
                public final synchronized IBinder onBind(Intent intent) {
                    try {
/* 4 */                 if (this.binder == null) {
/* 16 */                    this.binder = new a93(new gr0(this));
                        }
                    } catch (Throwable th) {
/* 26 */                throw th;
                    }
/* 21 */            return this.binder;
                }

                @Override // android.app.Service
                public void onDestroy() {
/* 3 */             this.executor.shutdown();
/* 6 */             super.onDestroy();
                }

                @Override // android.app.Service
                public final int onStartCommand(Intent intent, int i, int i2) {
                    synchronized (this.lock) {
/* 4 */                 this.lastStartId = i2;
/* 10 */                this.runningTasks++;
                    }
/* 13 */            Intent startCommandIntent = getStartCommandIntent(intent);
/* 18 */            if (startCommandIntent == null) {
/* 20 */                m2524a(intent);
/* 17 */                return 2;
                    }
/* 24 */            Task taskM2525b = m2525b(startCommandIntent);
/* 32 */            if (taskM2525b.isComplete()) {
/* 34 */                m2524a(intent);
/* 17 */                return 2;
                    }
/* 49 */            taskM2525b.addOnCompleteListener(new qd1(), new C2076pn(4, this, intent));
/* 52 */            return 3;
                }

                public boolean stopSelfResultHook(int i) {
/* 1 */             return stopSelfResult(i);
                }
            }
