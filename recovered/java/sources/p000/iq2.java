            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.messaging.FirebaseMessaging;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.util.ArrayDeque;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iq2 {

                /* JADX INFO: renamed from: a */
                public final Context f11900a;

                /* JADX INFO: renamed from: b */
                public final C2199sz f11901b;

                /* JADX INFO: renamed from: c */
                public final qi1 f11902c;

                /* JADX INFO: renamed from: d */
                public final FirebaseMessaging f11903d;

                /* JADX INFO: renamed from: f */
                public final ScheduledThreadPoolExecutor f11905f;

                /* JADX INFO: renamed from: h */
                public final gq2 f11907h;

                /* JADX INFO: renamed from: e */
                public final C1024id f11904e = new C1024id();

                /* JADX INFO: renamed from: g */
                public boolean f11906g = false;

                public iq2(FirebaseMessaging firebaseMessaging, C2199sz c2199sz, gq2 gq2Var, qi1 qi1Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
/* 14 */            this.f11903d = firebaseMessaging;
/* 16 */            this.f11901b = c2199sz;
/* 18 */            this.f11907h = gq2Var;
/* 20 */            this.f11902c = qi1Var;
/* 22 */            this.f11900a = context;
/* 24 */            this.f11905f = scheduledThreadPoolExecutor;
                }

                /* JADX INFO: renamed from: a */
                public static void m5537a(Task task) throws IOException {
                    try {
/* 5 */                 Tasks.await(task, 30L, TimeUnit.SECONDS);
                    } catch (InterruptedException | TimeoutException e) {
/* 17 */                throw new IOException("SERVICE_NOT_AVAILABLE", e);
                    } catch (ExecutionException e2) {
/* 19 */                Throwable cause = e2.getCause();
/* 25 */                if (cause instanceof IOException) {
/* 42 */                    throw ((IOException) cause);
                        }
/* 29 */                if (!(cause instanceof RuntimeException)) {
/* 39 */                    throw new IOException(e2);
                        }
/* 33 */                throw ((RuntimeException) cause);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m5538b(String str) throws IOException {
/* 3 */             String strM2528a = this.f11903d.m2528a();
/* 9 */             Bundle bundle = new Bundle();
/* 28 */            bundle.putString("gcm.topic", "/topics/" + str);
/* 43 */            qi1 qi1Var = this.f11902c;
/* 53 */            m5537a(qi1Var.m7858d(qi1Var.m7864l(strM2528a, "/topics/" + str, bundle)));
                }

                /* JADX INFO: renamed from: c */
                public final void m5539c(String str) throws IOException {
/* 3 */             String strM2528a = this.f11903d.m2528a();
/* 9 */             Bundle bundle = new Bundle();
/* 28 */            bundle.putString("gcm.topic", "/topics/" + str);
/* 35 */            bundle.putString("delete", "1");
/* 50 */            qi1 qi1Var = this.f11902c;
/* 60 */            m5537a(qi1Var.m7858d(qi1Var.m7864l(strM2528a, "/topics/" + str, bundle)));
                }

                /* JADX INFO: renamed from: d */
                public final synchronized void m5540d(boolean z) {
/* 2 */             this.f11906g = z;
                }

                /* JADX WARN: Bottom block not found for handler: all -> 0x0098 */
                /* JADX INFO: renamed from: e */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean m5541e() throws IOException {
                    fq2 fq2VarM3987a;
                    int i;
                    while (true) {
                        synchronized (this) {
                            try {
/* 4 */                         fq2VarM3987a = this.f11907h.m3987a();
/* 8 */                         i = 1;
/* 9 */                         if (fq2VarM3987a == null) {
/* 8 */                             return true;
                                }
                            } catch (Throwable th) {
/* 235 */                       throw th;
                            }
                        }
                        try {
/* 19 */                    String str = fq2VarM3987a.f8321b;
/* 21 */                    String str2 = fq2VarM3987a.f8320a;
/* 23 */                    int iHashCode = str.hashCode();
/* 29 */                    if (iHashCode != 83) {
/* 33 */                        if (iHashCode == 85 && str.equals("U")) {
/* 44 */                            m5539c(str2);
                                }
                            } else if (str.equals("S")) {
/* 58 */                        m5538b(str2);
                            }
/* 61 */                    gq2 gq2Var = this.f11907h;
                            synchronized (gq2Var) {
/* 64 */                        C0168b5 c0168b5 = gq2Var.f8783a;
/* 66 */                        String str3 = fq2VarM3987a.f8322c;
                                synchronized (((ArrayDeque) c0168b5.f2214e)) {
                                    try {
/* 81 */                                if (((ArrayDeque) c0168b5.f2214e).remove(str3)) {
/* 92 */                                    ((ScheduledThreadPoolExecutor) c0168b5.f2215f).execute(new f72(c0168b5, i));
                                        }
                                    } catch (Throwable th2) {
/* 152 */                               throw th2;
                                    }
                                }
                            }
                            synchronized (this.f11904e) {
                                try {
/* 100 */                           String str4 = fq2VarM3987a.f8322c;
/* 108 */                           if (this.f11904e.containsKey(str4)) {
/* 121 */                               ArrayDeque arrayDeque = (ArrayDeque) this.f11904e.getOrDefault(str4, null);
/* 127 */                               TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
/* 129 */                               if (taskCompletionSource != null) {
/* 131 */                                   taskCompletionSource.setResult(null);
                                        }
/* 138 */                               if (arrayDeque.isEmpty()) {
/* 142 */                                   this.f11904e.remove(str4);
                                        }
                                    }
                                } catch (Throwable th3) {
/* 149 */                           throw th3;
                                }
                            }
                        } catch (IOException e) {
/* 166 */                   if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
/* 197 */                       if (e.getMessage() != null) {
/* 205 */                           throw e;
                                }
/* 201 */                       AbstractC1245n0.m4876d("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
/* 232 */                       return false;
                            }
/* 229 */                   AbstractC1245n0.m4876d("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
/* 232 */                   return false;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m5542f(long j) {
/* 30 */            this.f11905f.schedule(new kq2(this, this.f11900a, this.f11901b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
/* 34 */            m5540d(true);
                }
            }
