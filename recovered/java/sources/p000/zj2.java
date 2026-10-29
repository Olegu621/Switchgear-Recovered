            package p000;

            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.PowerManager;
            import com.google.firebase.messaging.FirebaseMessaging;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zj2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final long f20202a;

                /* JADX INFO: renamed from: b */
                public final PowerManager.WakeLock f20203b;

                /* JADX INFO: renamed from: c */
                public final FirebaseMessaging f20204c;

                /* JADX INFO: renamed from: d */
                public final ThreadPoolExecutor f20205d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hl1("firebase-iid-executor"));

                public zj2(FirebaseMessaging firebaseMessaging, long j) {
/* 29 */            this.f20204c = firebaseMessaging;
/* 31 */            this.f20202a = j;
/* 46 */            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f5298b.getSystemService("power")).newWakeLock(1, "fiid-sync");
/* 50 */            this.f20203b = wakeLockNewWakeLock;
/* 53 */            wakeLockNewWakeLock.setReferenceCounted(false);
                }

                /* JADX INFO: renamed from: a */
                public final boolean m10365a() {
/* 11 */            ConnectivityManager connectivityManager = (ConnectivityManager) this.f20204c.f5298b.getSystemService("connectivity");
/* 20 */            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                }

                /* JADX INFO: renamed from: b */
                public final boolean m10366b() throws IOException {
                    try {
/* 10 */                if (this.f20204c.m2528a() != null) {
/* 20 */                    return true;
                        }
/* 14 */                AbstractC1245n0.m4876d("FirebaseMessaging", "Token retrieval failed: null");
/* 3 */                 return false;
                    } catch (IOException e) {
/* 28 */                String message = e.getMessage();
/* 38 */                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
/* 61 */                    if (e.getMessage() != null) {
/* 69 */                        throw e;
                            }
/* 65 */                    AbstractC1245n0.m4889q("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
/* 3 */                     return false;
                        }
/* 93 */                AbstractC1245n0.m4889q("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
/* 3 */                 return false;
                    } catch (SecurityException unused) {
/* 24 */                AbstractC1245n0.m4889q("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
/* 3 */                 return false;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             PowerManager.WakeLock wakeLock = this.f20203b;
/* 5 */             ra2 ra2VarM8100l = ra2.m8100l();
/* 9 */             FirebaseMessaging firebaseMessaging = this.f20204c;
/* 17 */            if (ra2VarM8100l.m8112q(firebaseMessaging.f5298b)) {
/* 19 */                wakeLock.acquire();
                    }
                    try {
                        try {
                            synchronized (firebaseMessaging) {
/* 25 */                        firebaseMessaging.f5305i = true;
                            }
/* 34 */                    if (!firebaseMessaging.f5304h.m8664d()) {
                                synchronized (firebaseMessaging) {
/* 37 */                            firebaseMessaging.f5305i = false;
                                }
/* 50 */                        if (ra2.m8100l().m8112q(firebaseMessaging.f5298b)) {
/* 52 */                            wakeLock.release();
/* 55 */                            return;
                                }
/* 190 */                       return;
                            }
/* 69 */                    if (ra2.m8100l().m8111p(firebaseMessaging.f5298b) && !m10365a()) {
/* 79 */                        yj2 yj2Var = new yj2();
/* 82 */                        yj2Var.f19659a = this;
/* 84 */                        yj2Var.m10153a();
/* 97 */                        if (ra2.m8100l().m8112q(firebaseMessaging.f5298b)) {
/* 99 */                            wakeLock.release();
/* 102 */                           return;
                                }
/* 190 */                       return;
                            }
/* 111 */                   if (m10366b()) {
                                synchronized (firebaseMessaging) {
/* 114 */                           firebaseMessaging.f5305i = false;
                                }
                            } else {
/* 123 */                       firebaseMessaging.m2532g(this.f20202a);
                            }
/* 136 */                   if (ra2.m8100l().m8112q(firebaseMessaging.f5298b)) {
/* 138 */                       wakeLock.release();
                            }
                        } catch (IOException e) {
/* 168 */                   AbstractC1245n0.m4876d("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                            synchronized (firebaseMessaging) {
/* 172 */                       firebaseMessaging.f5305i = false;
/* 185 */                       if (ra2.m8100l().m8112q(firebaseMessaging.f5298b)) {
/* 187 */                           wakeLock.release();
                                }
                            }
                        }
                    } catch (Throwable th) {
/* 204 */               if (ra2.m8100l().m8112q(firebaseMessaging.f5298b)) {
/* 206 */                   wakeLock.release();
                        }
/* 209 */               throw th;
                    }
                }
            }
