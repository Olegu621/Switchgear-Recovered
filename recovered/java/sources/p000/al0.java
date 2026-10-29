            package p000;

            import android.app.NotificationManager;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.Binder;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.supercell.p007id.FlutterSupport;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final /* synthetic */ class al0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f324a = 1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f325b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f326c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f327d;

                public /* synthetic */ al0(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
/* 7 */             this.f326c = context;
/* 9 */             this.f325b = z;
/* 11 */            this.f327d = taskCompletionSource;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f324a;
/* 3 */             Object obj = this.f327d;
/* 5 */             boolean z = this.f325b;
/* 7 */             Object obj2 = this.f326c;
                    switch (i) {
                        case 0:
/* 1 */                     ((FlutterSupport) obj2).lambda$setWindowVisibility$2((float[]) obj, z);
/* 122 */                   return;
                        default:
/* 12 */                    Context context = (Context) obj2;
/* 14 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                            try {
/* 37 */                        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
/* 70 */                            SharedPreferences.Editor editorEdit = py0.m7606i0(context).edit();
/* 76 */                            editorEdit.putBoolean("proxy_notification_initialized", true);
/* 79 */                            editorEdit.apply();
/* 88 */                            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
/* 90 */                            if (z) {
/* 3 */                                 notificationManager.setNotificationDelegate("com.google.android.gms");
                                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
/* 2 */                                 notificationManager.setNotificationDelegate(null);
                                    }
                                } else {
/* 57 */                            AbstractC1245n0.m4876d("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                                }
/* 110 */                       return;
                            } finally {
/* 111 */                       taskCompletionSource.trySetResult(null);
                            }
                    }
                }

/* 13 */        public /* synthetic */ al0(FlutterSupport flutterSupport, float[] fArr, boolean z) {
                    this.f326c = flutterSupport;
                    this.f327d = fArr;
                    this.f325b = z;
                }
            }
