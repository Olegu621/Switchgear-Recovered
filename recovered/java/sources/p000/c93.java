            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.util.Log;
            import com.google.android.gms.tasks.Task;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayDeque;
            import java.util.Objects;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c93 implements ServiceConnection {

                /* JADX INFO: renamed from: a */
                public final Context f2781a;

                /* JADX INFO: renamed from: b */
                public final Intent f2782b;

                /* JADX INFO: renamed from: c */
                public final ScheduledThreadPoolExecutor f2783c;

                /* JADX INFO: renamed from: d */
                public final ArrayDeque f2784d;

                /* JADX INFO: renamed from: e */
                public a93 f2785e;

                /* JADX INFO: renamed from: f */
                public boolean f2786f;

                public c93(Context context) {
/* 11 */            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new hl1("Firebase-FirebaseInstanceIdServiceConnection"));
/* 18 */            scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
/* 21 */            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
/* 32 */            this.f2784d = new ArrayDeque();
/* 35 */            this.f2786f = false;
/* 37 */            Context applicationContext = context.getApplicationContext();
/* 41 */            this.f2781a = applicationContext;
/* 58 */            this.f2782b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
/* 60 */            this.f2783c = scheduledThreadPoolExecutor;
                }

                /* JADX INFO: renamed from: a */
                public final synchronized void m1553a() {
/* 8 */             while (!this.f2784d.isEmpty()) {
                        try {
/* 10 */                    a93 a93Var = this.f2785e;
/* 12 */                    if (a93Var == null || !a93Var.isBinderAlive()) {
/* 40 */                        if (!this.f2786f) {
/* 44 */                            this.f2786f = true;
                                    try {
/* 60 */                                if (!C2515yy.m10190b().m10191a(this.f2781a, this.f2782b, this, 65)) {
/* 65 */                                    AbstractC1245n0.m4876d("FirebaseMessaging", "binding to the service failed");
/* 76 */                                    this.f2786f = false;
/* 78 */                                    ArrayDeque arrayDeque = this.f2784d;
/* 84 */                                    while (!arrayDeque.isEmpty()) {
/* 95 */                                        ((b93) arrayDeque.poll()).f2332b.trySetResult(null);
                                            }
                                        }
                                    } catch (SecurityException e) {
/* 72 */                                AbstractC1245n0.m4877e("FirebaseMessaging", "Exception while binding the service", e);
                                    }
                                }
/* 100 */                       return;
                            }
/* 30 */                    this.f2785e.m125a((b93) this.f2784d.poll());
                        } catch (Throwable th) {
/* 104 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final synchronized Task m1554b(Intent intent) {
                    b93 b93Var;
/* 4 */             b93Var = new b93(intent);
/* 7 */             ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f2783c;
/* 37 */            b93Var.f2332b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new C2357x6(scheduledThreadPoolExecutor.schedule(new f72(b93Var, 12), 20L, TimeUnit.SECONDS), 21));
/* 42 */            this.f2784d.add(b93Var);
/* 45 */            m1553a();
/* 50 */            return b93Var.f2332b.getTask();
                }

                @Override // android.content.ServiceConnection
                public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    try {
/* 11 */                if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 13 */                    Objects.toString(componentName);
                        }
/* 20 */                this.f2786f = false;
/* 24 */                if (iBinder instanceof a93) {
/* 68 */                    this.f2785e = (a93) iBinder;
/* 70 */                    m1553a();
/* 74 */                    return;
                        }
/* 40 */                AbstractC1245n0.m4876d("FirebaseMessaging", "Invalid service connection: " + iBinder);
/* 43 */                ArrayDeque arrayDeque = this.f2784d;
/* 49 */                while (!arrayDeque.isEmpty()) {
/* 60 */                    ((b93) arrayDeque.poll()).f2332b.trySetResult(null);
                        }
                    } catch (Throwable th) {
/* 76 */                throw th;
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 8 */             if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 10 */                Objects.toString(componentName);
                    }
/* 13 */            m1553a();
                }
            }
