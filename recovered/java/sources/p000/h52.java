            package p000;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.Message;
            import android.os.Messenger;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.android.gms.cloudmessaging.zzd;
            import com.google.android.gms.internal.cloudmessaging.zza;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h52 {

                /* JADX INFO: renamed from: h */
                public static int f8902h;

                /* JADX INFO: renamed from: i */
                public static PendingIntent f8903i;

                /* JADX INFO: renamed from: j */
                public static final Pattern f8904j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

                /* JADX INFO: renamed from: b */
                public final Context f8906b;

                /* JADX INFO: renamed from: c */
                public final cd1 f8907c;

                /* JADX INFO: renamed from: d */
                public final ScheduledThreadPoolExecutor f8908d;

                /* JADX INFO: renamed from: f */
                public Messenger f8910f;

                /* JADX INFO: renamed from: g */
                public zzd f8911g;

                /* JADX INFO: renamed from: a */
                public final le2 f8905a = new le2();

                /* JADX INFO: renamed from: e */
                public final Messenger f8909e = new Messenger(new hd3(this, Looper.getMainLooper()));

                public h52(Context context) {
/* 11 */            this.f8906b = context;
/* 18 */            this.f8907c = new cd1(context);
/* 39 */            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
/* 46 */            scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
/* 49 */            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
/* 52 */            this.f8908d = scheduledThreadPoolExecutor;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
                /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
                /* JADX INFO: renamed from: a */
                public final Task m4116a(Bundle bundle) {
                    String string;
                    int iM1633c;
                    Context context;
                    synchronized (h52.class) {
/* 4 */                 int i = f8902h;
/* 8 */                 f8902h = i + 1;
/* 10 */                string = Integer.toString(i);
                    }
/* 17 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    synchronized (this.f8905a) {
/* 25 */                this.f8905a.put(string, taskCompletionSource);
                    }
/* 31 */            Intent intent = new Intent();
/* 36 */            intent.setPackage("com.google.android.gms");
/* 46 */            if (this.f8907c.m1633c() == 2) {
/* 50 */                intent.setAction("com.google.iid.TOKEN_REQUEST");
                    } else {
/* 56 */                intent.setAction("com.google.android.c2dm.intent.REGISTER");
                    }
/* 59 */            intent.putExtras(bundle);
/* 62 */            Context context2 = this.f8906b;
                    synchronized (h52.class) {
                        try {
/* 69 */                    if (f8903i == null) {
/* 73 */                        Intent intent2 = new Intent();
/* 78 */                        intent2.setPackage("com.google.example.invalidpackage");
/* 88 */                        f8903i = PendingIntent.getBroadcast(context2, 0, intent2, zza.zza);
                            }
/* 98 */                    intent.putExtra("app", f8903i);
                        } catch (Throwable th) {
/* 243 */                   throw th;
                        }
                    }
/* 123 */           intent.putExtra("kid", "|ID|" + string + "|");
/* 133 */           if (Log.isLoggable("Rpc", 3)) {
/* 145 */               "Sending ".concat(String.valueOf(intent.getExtras()));
                    }
/* 152 */           intent.putExtra("google.messenger", this.f8909e);
/* 157 */           if (this.f8910f == null && this.f8911g == null) {
/* 190 */               iM1633c = this.f8907c.m1633c();
/* 194 */               context = this.f8906b;
/* 196 */               if (iM1633c == 2) {
/* 198 */                   context.sendBroadcast(intent);
                        } else {
/* 202 */                   context.startService(intent);
                        }
                    } else {
/* 163 */               Message messageObtain = Message.obtain();
/* 167 */               messageObtain.obj = intent;
                        try {
/* 169 */                   Messenger messenger = this.f8910f;
/* 171 */                   if (messenger != null) {
/* 173 */                       messenger.send(messageObtain);
                            } else {
/* 179 */                       Messenger messenger2 = this.f8911g.f3413a;
/* 181 */                       messenger2.getClass();
/* 184 */                       messenger2.send(messageObtain);
                            }
                        } catch (RemoteException unused) {
/* 190 */                   iM1633c = this.f8907c.m1633c();
/* 194 */                   context = this.f8906b;
/* 196 */                   if (iM1633c == 2) {
/* 198 */                       context.sendBroadcast(intent);
                            } else {
/* 202 */                       context.startService(intent);
                            }
                        }
                    }
/* 234 */           taskCompletionSource.getTask().addOnCompleteListener(o80.f14671d, new ac1(25, this, string, this.f8908d.schedule(new bb3(taskCompletionSource, 4), 30L, TimeUnit.SECONDS)));
/* 237 */           return taskCompletionSource.getTask();
                }

                /* JADX INFO: renamed from: b */
                public final void m4117b(String str, Bundle bundle) {
                    synchronized (this.f8905a) {
                        try {
/* 12 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8905a.remove(str);
/* 14 */                    if (taskCompletionSource != null) {
/* 37 */                        taskCompletionSource.setResult(bundle);
/* 41 */                        return;
                            }
/* 30 */                    AbstractC1245n0.m4889q("Rpc", "Missing callback for " + str);
                        } catch (Throwable th) {
/* 43 */                    throw th;
                        }
                    }
                }
            }
